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

func TestInputOnlySecrets(t *testing.T) {
	files := schema(t)
	for _, test := range []struct {
		message protoreflect.FullName
		field   protoreflect.Name
		number  protoreflect.FieldNumber
	}{
		{"opi_api.storage.v1.EncryptedVolume", "key", 3},
		{"opi_api.storage.v1.NvmeSubsystemSpec", "psk", 6},
		{"opi_api.storage.v1.TcpController", "psk", 3},
		{"opi_api.security.v1alpha1.DSAuth", "private_key", 4},
		{"opi_api.security.v1alpha1.IkePeerAuthentication", "psk", 3},
	} {
		descriptor := message(t, files, test.message)
		field := descriptor.Fields().ByName(test.field)
		if field == nil || field.Number() != test.number {
			t.Fatalf("%s.%s changed its wire field number", test.message, test.field)
		}
		behaviors := proto.GetExtension(field.Options(), annotations.E_FieldBehavior).([]annotations.FieldBehavior)
		var inputOnly bool
		for _, behavior := range behaviors {
			inputOnly = inputOnly || behavior == annotations.FieldBehavior_INPUT_ONLY
		}
		if !inputOnly {
			t.Errorf("%s must be explicitly input only", field.FullName())
		}
		value := dynamicpb.NewMessage(descriptor)
		switch field.Kind() {
		case protoreflect.BytesKind:
			value.Set(field, protoreflect.ValueOfBytes([]byte{1, 2, 3, 4}))
		case protoreflect.StringKind:
			value.Set(field, protoreflect.ValueOfString("test-only-secret"))
		default:
			t.Fatalf("%s has unexpected secret kind %s", field.FullName(), field.Kind())
		}
		input, err := protojson.Marshal(value)
		if err != nil {
			t.Fatal(err)
		}
		decoded := dynamicpb.NewMessage(descriptor)
		if err := protojson.Unmarshal(input, decoded); err != nil || !proto.Equal(value, decoded) {
			t.Fatalf("%s input must remain serializable: %v", field.FullName(), err)
		}
	}
}
