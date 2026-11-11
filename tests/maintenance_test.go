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

func TestMaintenanceBindings(t *testing.T) {
	files := schema(t)
	for _, test := range []struct {
		method string
		get    string
		post   string
	}{
		{"GetMaintenance", "/v1/{name=lifecycle/maintenance}", ""},
		{"Drain", "", "/v1/{name=lifecycle/maintenance}:drain"},
		{"Resume", "", "/v1/{name=lifecycle/maintenance}:resume"},
	} {
		name := protoreflect.FullName("opi_api.lifecycle.v1.MaintenanceService." + test.method)
		descriptor, err := files.FindDescriptorByName(name)
		if err != nil {
			t.Fatal(err)
		}
		method, ok := descriptor.(protoreflect.MethodDescriptor)
		if !ok {
			t.Fatalf("%s is not a method", name)
		}
		rule := proto.GetExtension(method.Options(), annotations.E_Http).(*annotations.HttpRule)
		if rule.GetGet() != test.get || rule.GetPost() != test.post {
			t.Errorf("%s: unexpected binding %v", name, rule)
		}
		if test.post != "" && rule.GetBody() != "*" {
			t.Errorf("%s must bind the request body", name)
		}
		if method.Output().FullName() != "opi_api.lifecycle.v1.Maintenance" {
			t.Errorf("%s must return maintenance progress", name)
		}
		for i := 0; i < method.Input().Fields().Len(); i++ {
			if method.Input().Fields().Get(i).Name() == "force" {
				t.Errorf("%s must not imply forced shutdown or teardown", name)
			}
		}
	}
	for _, service := range []protoreflect.FullName{
		"opi_api.lifecycle.v1.LifeCycleService",
		"opi_api.lifecycle.v1.DeviceService",
		"opi_api.lifecycle.v1.HeartbeatService",
	} {
		if _, err := files.FindDescriptorByName(service); err != nil {
			t.Errorf("existing service removed: %v", err)
		}
	}
}

func TestMaintenanceStateRoundTrip(t *testing.T) {
	files := schema(t)
	descriptor := message(t, files, "opi_api.lifecycle.v1.Maintenance")
	count := descriptor.Fields().ByName("active_consumers")
	if !count.HasPresence() || count.Kind() != protoreflect.Int64Kind {
		t.Fatal("consumer count must distinguish unknown from zero")
	}
	states := descriptor.Fields().ByName("state").Enum().Values()
	for i := 0; i < states.Len(); i++ {
		value := dynamicpb.NewMessage(descriptor)
		input := []byte(fmt.Sprintf(`{"name":"lifecycle/maintenance","state":"%s","etag":"revision","activeConsumers":"0"}`, states.Get(i).Name()))
		if err := protojson.Unmarshal(input, value); err != nil {
			t.Fatal(err)
		}
		wire, err := proto.Marshal(value)
		if err != nil {
			t.Fatal(err)
		}
		decoded := dynamicpb.NewMessage(descriptor)
		if err := proto.Unmarshal(wire, decoded); err != nil || !proto.Equal(value, decoded) || !decoded.Has(count) {
			t.Fatalf("state %s round trip: %v", states.Get(i).Name(), err)
		}
	}
	unknown := dynamicpb.NewMessage(descriptor)
	if err := protojson.Unmarshal([]byte(`{"name":"lifecycle/maintenance"}`), unknown); err != nil {
		t.Fatal(err)
	}
	if unknown.Has(count) {
		t.Fatal("omitted consumer count must remain unknown")
	}
}

func TestMaintenanceRequests(t *testing.T) {
	files := schema(t)
	for _, name := range []protoreflect.FullName{
		"opi_api.lifecycle.v1.GetMaintenanceRequest",
		"opi_api.lifecycle.v1.DrainRequest",
		"opi_api.lifecycle.v1.ResumeRequest",
	} {
		descriptor := message(t, files, name)
		value := dynamicpb.NewMessage(descriptor)
		input := `{"name":"lifecycle/maintenance"}`
		if name != "opi_api.lifecycle.v1.GetMaintenanceRequest" {
			input = `{"name":"lifecycle/maintenance","etag":"revision"}`
		}
		if err := protojson.Unmarshal([]byte(input), value); err != nil {
			t.Fatal(err)
		}
		field := descriptor.Fields().ByName("name")
		behaviors := proto.GetExtension(field.Options(), annotations.E_FieldBehavior).([]annotations.FieldBehavior)
		var required bool
		for _, behavior := range behaviors {
			required = required || behavior == annotations.FieldBehavior_REQUIRED
		}
		if !required {
			t.Errorf("%s.name must be required", name)
		}
	}
}
