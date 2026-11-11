// SPDX-License-Identifier: Apache-2.0
package contracts

import (
	"fmt"
	"testing"

	"google.golang.org/genproto/googleapis/api/annotations"
	"google.golang.org/protobuf/encoding/protojson"
	"google.golang.org/protobuf/proto"
	"google.golang.org/protobuf/reflect/protoreflect"
	"google.golang.org/protobuf/types/dynamicpb"
)

func TestControllerQuiesceBindings(t *testing.T) {
	files := schema(t)
	for _, test := range []struct{ method, action string }{
		{"SuspendNvmeController", "suspend"},
		{"ResumeNvmeController", "resume"},
	} {
		name := protoreflect.FullName("opi_api.storage.v1.FrontendNvmeService." + test.method)
		descriptor, err := files.FindDescriptorByName(name)
		if err != nil {
			t.Fatal(err)
		}
		method, ok := descriptor.(protoreflect.MethodDescriptor)
		if !ok {
			t.Fatalf("%s is not a method", name)
		}
		rule := proto.GetExtension(method.Options(), annotations.E_Http).(*annotations.HttpRule)
		want := "/v1/{name=nvmeSubsystems/*/nvmeControllers/*}:" + test.action
		if rule.GetPost() != want || rule.GetBody() != "*" {
			t.Errorf("%s: unexpected HTTP binding %v", name, rule)
		}
		if method.Output().FullName() != "opi_api.storage.v1.NvmeController" {
			t.Errorf("%s must return controller progress", name)
		}
		request := dynamicpb.NewMessage(method.Input())
		if err := protojson.Unmarshal([]byte(`{"name":"nvmeSubsystems/s/nvmeControllers/c","force":true}`), request); err == nil {
			t.Fatal("suspend/resume must not imply forced I/O termination")
		}
	}
}

func TestControllerSuspensionStatus(t *testing.T) {
	files := schema(t)
	descriptor := message(t, files, "opi_api.storage.v1.NvmeControllerStatus")
	if active := descriptor.Fields().ByNumber(1); active.Name() != "active" || active.Kind() != protoreflect.BoolKind {
		t.Fatal("existing host-driver attachment field must remain unchanged")
	}
	count := descriptor.Fields().ByName("outstanding_ios")
	if !count.HasPresence() || count.Kind() != protoreflect.Int64Kind {
		t.Fatal("outstanding I/O must distinguish unknown from zero")
	}
	states := descriptor.Fields().ByName("suspension_state").Enum().Values()
	for i := 0; i < states.Len(); i++ {
		value := dynamicpb.NewMessage(descriptor)
		input := fmt.Sprintf(`{"active":true,"suspensionState":"%s","outstandingIos":"0"}`, states.Get(i).Name())
		if err := protojson.Unmarshal([]byte(input), value); err != nil {
			t.Fatal(err)
		}
		wire, err := proto.Marshal(value)
		if err != nil {
			t.Fatal(err)
		}
		decoded := dynamicpb.NewMessage(descriptor)
		if err := proto.Unmarshal(wire, decoded); err != nil || !proto.Equal(value, decoded) || !decoded.Has(count) {
			t.Fatalf("suspension state %s round trip: %v", states.Get(i).Name(), err)
		}
	}
	unknown := dynamicpb.NewMessage(descriptor)
	if unknown.Has(count) {
		t.Fatal("an unreported count must remain unknown")
	}
}
