// SPDX-License-Identifier: Apache-2.0
package contracts

import (
	"crypto/sha256"
	"encoding/hex"
	"encoding/pem"
	"io"
	"log"
	"net/http"
	"net/http/httptest"
	"os"
	"os/exec"
	"path/filepath"
	"runtime"
	"strings"
	"sync/atomic"
	"testing"
)

func provisioningRoot(t *testing.T) string {
	t.Helper()
	_, file, _, ok := runtime.Caller(0)
	if !ok {
		t.Fatal("cannot locate provisioning test source")
	}
	return filepath.Join(filepath.Dir(file), "..", "doc", "redhat-bluefield", "provision")
}

func runDownload(t *testing.T, url, destination, digest, ca string) ([]byte, error) {
	t.Helper()
	helper := filepath.Join(provisioningRoot(t), "verified-download.sh")
	command := exec.Command("bash", "-c",
		`source "$1"; verified_download "$2" "$3" "$4"`,
		"verified-download-test", helper, url, destination, digest)
	command.Env = append(os.Environ(),
		"CURL_CA_BUNDLE="+ca, "HTTPS_PROXY=", "HTTP_PROXY=", "ALL_PROXY=", "NO_PROXY=*")
	return command.CombinedOutput()
}

func TestVerifiedDownloads(t *testing.T) {
	payload := []byte("publisher-verified artifact test fixture")
	sum := sha256.Sum256(payload)
	digest := hex.EncodeToString(sum[:])
	var plainRequests, tlsRequests atomic.Int64
	plain := httptest.NewServer(http.HandlerFunc(func(w http.ResponseWriter, _ *http.Request) {
		plainRequests.Add(1)
		_, _ = w.Write(payload)
	}))
	defer plain.Close()
	secure := httptest.NewUnstartedServer(http.HandlerFunc(func(w http.ResponseWriter, r *http.Request) {
		tlsRequests.Add(1)
		switch r.URL.Path {
		case "/redirect":
			http.Redirect(w, r, plain.URL+"/artifact", http.StatusFound)
		case "/failure":
			w.WriteHeader(http.StatusInternalServerError)
			_, _ = w.Write(payload)
		default:
			_, _ = w.Write(payload)
		}
	}))
	secure.Config.ErrorLog = log.New(io.Discard, "", 0)
	secure.StartTLS()
	defer secure.Close()
	ca := filepath.Join(t.TempDir(), "publisher-ca.pem")
	certificate := pem.EncodeToMemory(&pem.Block{
		Type: "CERTIFICATE", Bytes: secure.TLS.Certificates[0].Certificate[0],
	})
	if err := os.WriteFile(ca, certificate, 0600); err != nil {
		t.Fatal(err)
	}
	for _, test := range []struct {
		name, url, digest, ca string
		success               bool
	}{
		{"verified HTTPS", secure.URL + "/artifact", digest, ca, true},
		{"missing digest", secure.URL + "/artifact", "", ca, false},
		{"wrong digest", secure.URL + "/artifact", strings.Repeat("0", 64), ca, false},
		{"untrusted certificate", secure.URL + "/artifact", digest, "", false},
		{"plain HTTP", plain.URL + "/artifact", digest, ca, false},
		{"HTTPS downgrade redirect", secure.URL + "/redirect", digest, ca, false},
		{"HTTP failure with matching body", secure.URL + "/failure", digest, ca, false},
	} {
		t.Run(test.name, func(t *testing.T) {
			destination := filepath.Join(t.TempDir(), "artifact")
			original := []byte("previous verified version")
			if err := os.WriteFile(destination, original, 0600); err != nil {
				t.Fatal(err)
			}
			output, err := runDownload(t, test.url, destination, test.digest, test.ca)
			if (err == nil) != test.success {
				t.Fatalf("success=%t, error=%v\n%s", test.success, err, output)
			}
			got, err := os.ReadFile(destination)
			if err != nil {
				t.Fatal(err)
			}
			want := string(original)
			if test.success {
				want = string(payload)
			}
			if string(got) != want {
				t.Fatalf("unexpected artifact contents: %q", got)
			}
			matches, err := filepath.Glob(destination + ".download.*")
			if err != nil || len(matches) != 0 {
				t.Fatalf("temporary artifact files were not cleaned: %v, %v", matches, err)
			}
		})
	}
	if plainRequests.Load() != 0 {
		t.Fatal("HTTP or downgraded requests must never reach the server")
	}
	t.Run("verified cache", func(t *testing.T) {
		destination := filepath.Join(t.TempDir(), "artifact")
		if err := os.WriteFile(destination, payload, 0600); err != nil {
			t.Fatal(err)
		}
		before := tlsRequests.Load()
		if output, err := runDownload(t, secure.URL+"/artifact", destination, digest, ca); err != nil {
			t.Fatalf("verified cache: %v\n%s", err, output)
		}
		if tlsRequests.Load() != before {
			t.Fatal("a verified cached artifact should not require a download")
		}
	})
}

func TestProvisioningScriptSyntax(t *testing.T) {
	for _, file := range []string{
		"verified-download.sh",
		filepath.Join("bf2", "udev.sh"),
		filepath.Join("bf2", "bluefield_provision.sh"),
		filepath.Join("bf2", "bluefield_ipsec_bf_side.sh"),
		filepath.Join("bf2", "bluefield_prep_for_ocp.sh"),
		filepath.Join("ocp", "bluefield_setup.sh"),
	} {
		t.Run(file, func(t *testing.T) {
			path := filepath.Join(provisioningRoot(t), file)
			if output, err := exec.Command("bash", "-n", path).CombinedOutput(); err != nil {
				t.Fatalf("shell syntax: %v\n%s", err, output)
			}
		})
	}
}
