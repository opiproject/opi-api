// SPDX-License-Identifier: Apache-2.0
package contracts

import (
	"strings"
	"testing"

	"google.golang.org/genproto/googleapis/api/annotations"
	"google.golang.org/protobuf/encoding/protojson"
	"google.golang.org/protobuf/proto"
	"google.golang.org/protobuf/reflect/protoreflect"
	"google.golang.org/protobuf/types/dynamicpb"
)

func TestStorageCreateRequestIDs(t *testing.T) {
	files := schema(t)
	var count int
	files.RangeFiles(func(file protoreflect.FileDescriptor) bool {
		if file.Package() != "opi_api.storage.v1" {
			return true
		}
		for i := 0; i < file.Services().Len(); i++ {
			methods := file.Services().Get(i).Methods()
			for j := 0; j < methods.Len(); j++ {
				method := methods.Get(j)
				if !strings.HasPrefix(string(method.Name()), "Create") {
					continue
				}
				count++
				request := method.Input()
				field := request.Fields().ByName("request_id")
				if field == nil || field.Kind() != protoreflect.StringKind {
					t.Errorf("%s must identify retryable creates", request.FullName())
					continue
				}
				info := proto.GetExtension(field.Options(), annotations.E_FieldInfo).(*annotations.FieldInfo)
				if info.GetFormat() != annotations.FieldInfo_UUID4 {
					t.Errorf("%s.request_id must declare UUID4", request.FullName())
				}
				behaviors := proto.GetExtension(field.Options(), annotations.E_FieldBehavior).([]annotations.FieldBehavior)
				for _, behavior := range behaviors {
					if behavior == annotations.FieldBehavior_REQUIRED {
						t.Errorf("%s.request_id must remain optional", request.FullName())
					}
				}
				for _, payload := range []string{
					`{}`,
					`{"requestId":"8e22ca0e-52d3-4f4b-976a-e0cc4cb4d92e"}`,
				} {
					value := dynamicpb.NewMessage(request)
					if err := protojson.Unmarshal([]byte(payload), value); err != nil {
						t.Fatal(err)
					}
					wire, err := proto.Marshal(value)
					if err != nil {
						t.Fatal(err)
					}
					result := dynamicpb.NewMessage(request)
					if err := proto.Unmarshal(wire, result); err != nil || !proto.Equal(value, result) {
						t.Fatalf("%s request ID round trip: %v", request.FullName(), err)
					}
				}
			}
		}
		return true
	})
	if count < 14 {
		t.Errorf("covered %d Create methods, want at least 14", count)
	}
}
