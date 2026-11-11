// SPDX-License-Identifier: Apache-2.0
package contracts

import (
	"testing"

	"google.golang.org/genproto/googleapis/api/annotations"
	"google.golang.org/protobuf/proto"
	"google.golang.org/protobuf/reflect/protoreflect"
)

func TestStorageListCollectionRoutes(t *testing.T) {
	files := schema(t)
	for _, test := range []struct {
		method protoreflect.FullName
		path   string
	}{
		{"opi_api.storage.v1.MiddleendEncryptionService.ListEncryptedVolumes", "/v1/encryptedVolumes"},
		{"opi_api.storage.v1.MiddleendQosVolumeService.ListQosVolumes", "/v1/qosVolumes"},
	} {
		descriptor, err := files.FindDescriptorByName(test.method)
		if err != nil {
			t.Fatal(err)
		}
		method := descriptor.(protoreflect.MethodDescriptor)
		rule := proto.GetExtension(method.Options(), annotations.E_Http).(*annotations.HttpRule)
		if rule.GetGet() != test.path {
			t.Errorf("%s: got GET %q, want %q", test.method, rule.GetGet(), test.path)
		}
		if method.Input().Fields().ByNumber(1).Name() != "parent" {
			t.Errorf("%s must retain the legacy parent field number", test.method)
		}
	}
}

func TestNoDuplicateHTTPBindings(t *testing.T) {
	files := schema(t)
	seen := map[string]protoreflect.FullName{}
	var visit func(*annotations.HttpRule, protoreflect.FullName)
	visit = func(rule *annotations.HttpRule, method protoreflect.FullName) {
		var key string
		switch pattern := rule.Pattern.(type) {
		case *annotations.HttpRule_Get:
			key = "GET " + pattern.Get
		case *annotations.HttpRule_Post:
			key = "POST " + pattern.Post
		case *annotations.HttpRule_Patch:
			key = "PATCH " + pattern.Patch
		case *annotations.HttpRule_Put:
			key = "PUT " + pattern.Put
		case *annotations.HttpRule_Delete:
			key = "DELETE " + pattern.Delete
		default:
			t.Fatalf("%s has an unsupported HTTP pattern", method)
		}
		if previous, ok := seen[key]; ok {
			t.Errorf("%s is shared by %s and %s", key, previous, method)
		}
		seen[key] = method
		for _, additional := range rule.AdditionalBindings {
			visit(additional, method)
		}
	}
	files.RangeFiles(func(file protoreflect.FileDescriptor) bool {
		for i := 0; i < file.Services().Len(); i++ {
			methods := file.Services().Get(i).Methods()
			for j := 0; j < methods.Len(); j++ {
				method := methods.Get(j)
				if proto.HasExtension(method.Options(), annotations.E_Http) {
					visit(proto.GetExtension(method.Options(), annotations.E_Http).(*annotations.HttpRule), method.FullName())
				}
			}
		}
		return true
	})
}
