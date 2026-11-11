// SPDX-License-Identifier: Apache-2.0
package contracts

import (
	"testing"

	"google.golang.org/genproto/googleapis/api/annotations"
	"google.golang.org/protobuf/encoding/protojson"
	"google.golang.org/protobuf/proto"
	"google.golang.org/protobuf/reflect/protoreflect"
	"google.golang.org/protobuf/types/dynamicpb"
)

func TestVirtualInterfaceBindings(t *testing.T) {
	files := schema(t)
	for _, test := range []struct{ method, post, delete string }{
		{"CreateNetInterface", "/v1/{parent=interfaces/*}/interface", ""},
		{"DeleteNetInterface", "", "/v1/{name=interfaces/*/interface/*}"},
	} {
		name := protoreflect.FullName("opi_api.network.opinetcommon.v1alpha1.NetInterfaceService." + test.method)
		descriptor, err := files.FindDescriptorByName(name)
		if err != nil {
			t.Fatal(err)
		}
		method, ok := descriptor.(protoreflect.MethodDescriptor)
		if !ok {
			t.Fatalf("%s is not a method", name)
		}
		rule := proto.GetExtension(method.Options(), annotations.E_Http).(*annotations.HttpRule)
		if rule.GetPost() != test.post || rule.GetDelete() != test.delete {
			t.Errorf("%s: unexpected binding %v", name, rule)
		}
		if test.post != "" && rule.GetBody() != "net_interface" {
			t.Fatal("create must bind interface configuration")
		}
		if method.Input().Fields().ByName("force") != nil {
			t.Fatal("virtual-interface deletion must not offer forced physical-port removal")
		}
	}
	resource := message(t, files, "opi_api.network.opinetcommon.v1alpha1.NetInterface")
	patterns := proto.GetExtension(resource.Options(), annotations.E_Resource).(*annotations.ResourceDescriptor).GetPattern()
	if len(patterns) != 2 || patterns[0] != "netInterface/{interface}" ||
		patterns[1] != "interfaces/{device}/interface/{interface}" {
		t.Fatal("preserve legacy names and describe the existing RPC hierarchy")
	}
}

func TestVirtualFunctionZeroAndQueuePresence(t *testing.T) {
	files := schema(t)
	descriptor := message(t, files, "opi_api.network.opinetcommon.v1alpha1.VirtualInterfaceConfig")
	for _, payload := range []string{
		`{"backingInterface":"interfaces/d/interface/pf0","virtualFunction":0,"queueCount":4}`,
		`{"backingInterface":"interfaces/d/interface/pf0","subfunctionId":"sf0"}`,
		`{}`,
	} {
		value := dynamicpb.NewMessage(descriptor)
		if err := protojson.Unmarshal([]byte(payload), value); err != nil {
			t.Fatal(err)
		}
		wire, err := proto.Marshal(value)
		if err != nil {
			t.Fatal(err)
		}
		decoded := dynamicpb.NewMessage(descriptor)
		if err := proto.Unmarshal(wire, decoded); err != nil || !proto.Equal(value, decoded) {
			t.Fatalf("virtual config round trip: %v", err)
		}
	}
	value := dynamicpb.NewMessage(descriptor)
	if err := protojson.Unmarshal([]byte(`{"virtualFunction":0}`), value); err != nil {
		t.Fatal(err)
	}
	if !value.Has(descriptor.Fields().ByName("virtual_function")) {
		t.Fatal("VF index zero must be distinguishable from no function")
	}
	if value.Has(descriptor.Fields().ByName("queue_count")) {
		t.Fatal("an unrequested queue count must remain absent")
	}
	if err := protojson.Unmarshal([]byte(`{"virtualFunction":0,"subfunctionId":"sf0"}`), dynamicpb.NewMessage(descriptor)); err == nil {
		t.Fatal("VF and subfunction selectors must be mutually exclusive")
	}
}
