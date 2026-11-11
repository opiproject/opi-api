// SPDX-License-Identifier: Apache-2.0
package integration_test

import (
	"strings"
	"testing"

	_ "github.com/opiproject/opi-api/v1/gen/go/inventory"
	_ "github.com/opiproject/opi-api/v1/gen/go/lifecycle"
	"github.com/opiproject/opi-api/v1/gen/go/network/cloud"
	_ "github.com/opiproject/opi-api/v1/gen/go/network/evpn-gw"
	_ "github.com/opiproject/opi-api/v1/gen/go/network/k8s"
	"github.com/opiproject/opi-api/v1/gen/go/network/opinetcommon"
	_ "github.com/opiproject/opi-api/v1/gen/go/network/telco"
	_ "github.com/opiproject/opi-api/v1/gen/go/security"
	_ "github.com/opiproject/opi-api/v1/gen/go/storage"
	"google.golang.org/protobuf/reflect/protoreflect"
	"google.golang.org/protobuf/reflect/protoregistry"
	"google.golang.org/protobuf/types/descriptorpb"
)

func TestCanonicalCommonTypes(t *testing.T) {
	mapping := &cloud.MappingSpec{PublicIp: &opinetcommon.IPAddress{}}
	if mapping.GetPublicIp() == nil {
		t.Fatal("cloud APIs must use the common types from the canonical module")
	}
}

func TestCanonicalGoPackages(t *testing.T) {
	var count int
	protoregistry.GlobalFiles.RangeFiles(func(file protoreflect.FileDescriptor) bool {
		if !strings.HasPrefix(string(file.Package()), "opi_api.") {
			return true
		}
		count++
		options, ok := file.Options().(*descriptorpb.FileOptions)
		if !ok || !strings.HasPrefix(options.GetGoPackage(), "github.com/opiproject/opi-api/v1/gen/go/") {
			t.Errorf("%s has a noncanonical Go package", file.Path())
		}
		return true
	})
	if count < 39 {
		t.Errorf("registered %d project schemas, want at least 39", count)
	}
}
