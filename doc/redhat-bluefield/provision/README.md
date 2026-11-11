# BlueField provisioning artifact verification

These are legacy laboratory examples, not production deployment hardening.
They still contain lab-specific networking, SSH, credentials, firewall, and
SELinux settings. Review those independently before using the examples.
Local PXE transport and boot-chain trust are not changed by download verification.

## Trusted inputs

Install the publisher's CA and RPM signing keys through a separately trusted
channel. Do not fetch a digest or signing key over the same unverified channel
as an artifact and treat it as authentication.

- Firmware updates require `BFB_IMAGE_SHA256`.
- PXE setup requires `RHEL_ISO_SHA256`.
- The network-rules installer requires `BLUEFIELD_NET_RULES_SHA256`.
- The iproute2 build requires a full, trusted `IPROUTE2_COMMIT` commit ID.

Obtain SHA-256 values from authenticated publisher manifests and set these
environment variables before running the relevant operation. No sample digest
is supplied because an invented or stale digest would not verify the artifact.
Optional `BFB_IMAGE_URL`, `RHEL_ISO_URL`, and `BLUEFIELD_NET_RULES_URL` overrides
must use HTTPS. Use `CURL_CA_BUNDLE` for an explicitly trusted private CA rather
than disabling certificate checks.

The shared downloader validates TLS, refuses HTTP and HTTPS-to-HTTP redirects,
checks the expected SHA-256, and only then atomically publishes the artifact.
Existing cached artifacts are reused only after their digest is checked.
Downloads, mismatches, and missing trusted inputs fail before firmware is sent,
an ISO is used, or a downloaded installer is executed. Firmware/ISO files are
cached under `/var/cache/opi-bluefield`; override `PROVISIONING_CACHE_DIR` if
needed. Keep an ISO while it is being used by the PXE loop mount.

RPM installs require repository and local-package signature checking. Unsigned
PoC kernel packages must be signed with a trusted key before using these scripts.
There is no `--nogpgcheck` or insecure-TLS fallback. The internal historical
download hosts may be unavailable or lack HTTPS; use an authenticated mirror
with trusted packages instead of weakening verification.

## Tests

Run the local HTTPS/certificate, redirect, digest, failure, and atomic-replacement
tests from the repository root with Go, Bash, curl, and sha256sum on `PATH`:

```bash
go test ./tests/provisioning_verification_test.go
```

Tests use local HTTP/TLS servers and temporary files. They do not invoke package
installation, SSH, firmware, PXE, or BlueField hardware.
