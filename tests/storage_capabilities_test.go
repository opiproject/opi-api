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

func TestStorageCapabilityContract(t *testing.T) {
	files := schema(t)
	descriptor, err := files.FindDescriptorByName("opi_api.storage.v1.StorageCapabilityService.GetStorageCapabilities")
	if err != nil {
		t.Fatal(err)
	}
	method, ok := descriptor.(protoreflect.MethodDescriptor)
	if !ok {
		t.Fatal("GetStorageCapabilities is not a method")
	}
	rule := proto.GetExtension(method.Options(), annotations.E_Http).(*annotations.HttpRule)
	if rule.GetGet() != "/v1/{name=storageCapabilities}" {
		t.Fatalf("unexpected capability route: %v", rule)
	}
	if method.Output().FullName() != "opi_api.storage.v1.StorageCapabilities" {
		t.Fatalf("unexpected response: %s", method.Output().FullName())
	}
	for _, field := range []protoreflect.Name{"frontends", "backends", "nvme_transports", "middleends", "encryption_ciphers"} {
		definition := method.Output().Fields().ByName(field)
		if definition == nil || !definition.IsList() || definition.Kind() != protoreflect.EnumKind {
			t.Errorf("%s must be a repeated enum", field)
		}
	}
}

func TestStorageLimitPresence(t *testing.T) {
	files := schema(t)
	descriptor := message(t, files, "opi_api.storage.v1.StorageLimits")
	for i := 0; i < descriptor.Fields().Len(); i++ {
		field := descriptor.Fields().Get(i)
		if !field.HasPresence() || field.Kind() != protoreflect.Int64Kind {
			t.Errorf("%s must be a presence-aware int64 limit", field.FullName())
		}
	}
	for _, test := range []struct {
		json    string
		present bool
		value   int64
	}{
		{`{}`, false, 0},
		{`{"maxNvmeSubsystems":"0"}`, true, 0},
		{`{"maxNvmeSubsystems":"4294967294"}`, true, 4294967294},
	} {
		value := dynamicpb.NewMessage(descriptor)
		if err := protojson.Unmarshal([]byte(test.json), value); err != nil {
			t.Fatal(err)
		}
		field := descriptor.Fields().ByName("max_nvme_subsystems")
		if value.Has(field) != test.present || value.Get(field).Int() != test.value {
			t.Errorf("%s lost limit presence or value", test.json)
		}
	}
}

func TestStorageCapabilityJSONRoundTrip(t *testing.T) {
	files := schema(t)
	descriptor := message(t, files, "opi_api.storage.v1.StorageCapabilities")
	value := dynamicpb.NewMessage(descriptor)
	input := []byte(`{
		"name":"storageCapabilities",
		"frontends":["STORAGE_FRONTEND_TYPE_NVME","STORAGE_FRONTEND_TYPE_VIRTIO_BLK"],
		"backends":["STORAGE_BACKEND_TYPE_NVME"],
		"nvmeTransports":["NVME_TRANSPORT_TYPE_TCP","NVME_TRANSPORT_TYPE_RDMA"],
		"middleends":["STORAGE_MIDDLEEND_TYPE_ENCRYPTION","STORAGE_MIDDLEEND_TYPE_QOS"],
		"encryptionCiphers":["ENCRYPTION_TYPE_AES_XTS_256"],
		"limits":{"maxNvmeNamespaces":"1024"}
	}`)
	if err := protojson.Unmarshal(input, value); err != nil {
		t.Fatal(err)
	}
	wire, err := proto.Marshal(value)
	if err != nil {
		t.Fatal(err)
	}
	decoded := dynamicpb.NewMessage(descriptor)
	if err := proto.Unmarshal(wire, decoded); err != nil || !proto.Equal(value, decoded) {
		t.Fatalf("capability round trip: %v", err)
	}
}
