// SPDX-License-Identifier: Apache-2.0
package contracts

import (
	"fmt"
	"testing"

	"google.golang.org/protobuf/encoding/protojson"
	"google.golang.org/protobuf/proto"
	"google.golang.org/protobuf/reflect/protodesc"
	"google.golang.org/protobuf/reflect/protoreflect"
	"google.golang.org/protobuf/types/descriptorpb"
	"google.golang.org/protobuf/types/dynamicpb"
)

func TestNetworkTagJSONRange(t *testing.T) {
	files := schema(t)
	for _, field := range []struct {
		message protoreflect.FullName
		name    protoreflect.Name
	}{
		{"opi_api.network.opinetcommon.v1alpha1.IPEntry", "tag"},
		{"opi_api.network.opinetcommon.v1alpha1.RuleL3Match", "src_tag"},
		{"opi_api.network.opinetcommon.v1alpha1.RuleL3Match", "dst_tag"},
		{"opi_api.network.cloud.v1alpha1.MappingSpec", "tags"},
		{"opi_api.network.cloud.v1alpha1.PolicyLookupMatch", "source_tags"},
		{"opi_api.network.cloud.v1alpha1.PolicyLookupMatch", "destination_tags"},
	} {
		descriptor := message(t, files, field.message)
		tag := descriptor.Fields().ByName(field.name)
		if tag == nil || tag.Kind() != protoreflect.Uint32Kind {
			t.Fatalf("%s.%s must use uint32", field.message, field.name)
		}
		for _, test := range []struct {
			value string
			valid bool
		}{
			{"1", true},
			{"2147483647", true},
			{"2147483648", true},
			{"4294967294", true},
			{"-1", false},
			{"4294967296", false},
		} {
			t.Run(fmt.Sprintf("%s/%s/%s", field.message, field.name, test.value), func(t *testing.T) {
				value := test.value
				if tag.IsList() {
					value = "[" + value + "]"
				}
				payload := []byte(fmt.Sprintf(`{"%s":%s}`, tag.JSONName(), value))
				err := protojson.Unmarshal(payload, dynamicpb.NewMessage(descriptor))
				if (err == nil) != test.valid {
					t.Fatalf("valid=%t, error=%v", test.valid, err)
				}
			})
		}
	}
}

func TestExistingPositiveTagWireEncoding(t *testing.T) {
	files := schema(t)
	current := message(t, files, "opi_api.network.opinetcommon.v1alpha1.IPEntry")
	oldFile := protodesc.ToFileDescriptorProto(current.ParentFile())
	for _, msg := range oldFile.MessageType {
		if msg.GetName() == "IPEntry" || msg.GetName() == "RuleL3Match" {
			for _, field := range msg.Field {
				if field.GetName() == "tag" || field.GetName() == "src_tag" || field.GetName() == "dst_tag" {
					field.Type = descriptorpb.FieldDescriptorProto_TYPE_INT32.Enum()
				}
			}
		}
	}
	legacy, err := protodesc.NewFile(oldFile, files)
	if err != nil {
		t.Fatal(err)
	}
	for _, name := range []protoreflect.Name{"IPEntry", "RuleL3Match"} {
		for _, fieldName := range []protoreflect.Name{"tag", "src_tag", "dst_tag"} {
			old := legacy.Messages().ByName(name)
			oldField := old.Fields().ByName(fieldName)
			if oldField == nil {
				continue
			}
			for _, value := range []int32{1, 2147483647} {
				before := dynamicpb.NewMessage(old)
				before.Set(oldField, protoreflect.ValueOfInt32(value))
				wire, err := proto.Marshal(before)
				if err != nil {
					t.Fatal(err)
				}
				afterDescriptor := message(t, files, old.FullName())
				after := dynamicpb.NewMessage(afterDescriptor)
				if err := proto.Unmarshal(wire, after); err != nil {
					t.Fatal(err)
				}
				newField := afterDescriptor.Fields().ByName(fieldName)
				if got := after.Get(newField).Uint(); got != uint64(value) {
					t.Fatalf("%s.%s: got %d, want %d", name, fieldName, got, value)
				}
			}
		}
	}
}
