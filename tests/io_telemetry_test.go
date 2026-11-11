// SPDX-License-Identifier: Apache-2.0
package contracts

import (
	"fmt"
	"strings"
	"testing"

	"google.golang.org/protobuf/encoding/protojson"
	"google.golang.org/protobuf/proto"
	"google.golang.org/protobuf/reflect/protodesc"
	"google.golang.org/protobuf/reflect/protoreflect"
	"google.golang.org/protobuf/types/dynamicpb"
)

func TestOptionalIOCounters(t *testing.T) {
	files := schema(t)
	descriptor := message(t, files, "opi_api.storage.v1.VolumeStats")
	for i, name := range []protoreflect.Name{
		"flush_ops_count", "admin_ops_count", "read_error_count", "write_error_count",
		"unmap_error_count", "flush_error_count", "admin_error_count", "async_event_count",
	} {
		field := descriptor.Fields().ByName(name)
		if field == nil || field.Number() != protoreflect.FieldNumber(10+i) ||
			field.Kind() != protoreflect.Int64Kind || !field.HasPresence() {
			t.Fatalf("%s must be an optional int64 with its assigned field number", name)
		}
		for _, test := range []struct {
			value   string
			present bool
			count   int64
		}{
			{"", false, 0},
			{"0", true, 0},
			{"9007199254740993", true, 9007199254740993},
			{"9223372036854775807", true, 9223372036854775807},
		} {
			input := "{}"
			if test.present {
				input = fmt.Sprintf(`{"%s":"%s"}`, field.JSONName(), test.value)
			}
			value := dynamicpb.NewMessage(descriptor)
			if err := protojson.Unmarshal([]byte(input), value); err != nil {
				t.Fatal(err)
			}
			if value.Has(field) != test.present || value.Get(field).Int() != test.count {
				t.Fatalf("%s: lost counter presence or precision", input)
			}
			output, err := (protojson.MarshalOptions{EmitUnpopulated: true}).Marshal(value)
			if err != nil {
				t.Fatal(err)
			}
			if strings.Contains(string(output), `"`+field.JSONName()+`"`) != test.present {
				t.Fatalf("%s: unsupported metric must not become a reported zero: %s", name, output)
			}
			wire, err := proto.Marshal(value)
			if err != nil {
				t.Fatal(err)
			}
			decoded := dynamicpb.NewMessage(descriptor)
			if err := proto.Unmarshal(wire, decoded); err != nil || !proto.Equal(value, decoded) {
				t.Fatalf("%s: counter round trip failed: %v", name, err)
			}
		}
	}
}

func TestOldCounterReaderPreservesNewFields(t *testing.T) {
	files := schema(t)
	current := message(t, files, "opi_api.storage.v1.VolumeStats")
	oldFile := protodesc.ToFileDescriptorProto(current.ParentFile())
	for _, definition := range oldFile.MessageType {
		if definition.GetName() == "VolumeStats" {
			definition.Field = definition.Field[:9]
			definition.OneofDecl = nil
		}
	}
	legacyFile, err := protodesc.NewFile(oldFile, files)
	if err != nil {
		t.Fatal(err)
	}
	original := dynamicpb.NewMessage(current)
	original.Set(current.Fields().ByName("read_error_count"), protoreflect.ValueOfInt64(9007199254740993))
	wire, err := proto.Marshal(original)
	if err != nil {
		t.Fatal(err)
	}
	legacy := dynamicpb.NewMessage(legacyFile.Messages().ByName("VolumeStats"))
	if err := proto.Unmarshal(wire, legacy); err != nil {
		t.Fatal(err)
	}
	if len(legacy.GetUnknown()) == 0 {
		t.Fatal("old readers must retain unknown optional counters")
	}
	wire, err = proto.Marshal(legacy)
	if err != nil {
		t.Fatal(err)
	}
	roundTrip := dynamicpb.NewMessage(current)
	if err := proto.Unmarshal(wire, roundTrip); err != nil || !proto.Equal(original, roundTrip) {
		t.Fatalf("old-reader round trip: %v", err)
	}
}
