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

func TestNvmeDiscoveryContract(t *testing.T) {
	files := schema(t)
	descriptor, err := files.FindDescriptorByName("opi_api.storage.v1.NvmeDiscoveryService.DiscoverNvmeTargets")
	if err != nil {
		t.Fatal(err)
	}
	method, ok := descriptor.(protoreflect.MethodDescriptor)
	if !ok {
		t.Fatal("DiscoverNvmeTargets is not a method")
	}
	rule := proto.GetExtension(method.Options(), annotations.E_Http).(*annotations.HttpRule)
	if rule.GetPost() != "/v1/nvmeTargets:discover" || rule.GetBody() != "*" {
		t.Fatalf("unexpected discovery binding: %v", rule)
	}
	request := method.Input()
	if request.Fields().ByName("endpoint").Message().FullName() != "opi_api.storage.v1.FabricsEndpoint" {
		t.Fatal("discovery must reuse the existing fabrics endpoint")
	}
	if request.Fields().ByName("tcp").Message().FullName() != "opi_api.storage.v1.TcpController" {
		t.Fatal("discovery must reuse the existing TCP options")
	}
	response := method.Output()
	if response.Fields().ByName("generation_counter").Kind() != protoreflect.Uint64Kind {
		t.Fatal("discovery must preserve the full NVMe generation-counter range")
	}
	if response.Fields().ByName("observe_time").Message().FullName() != "google.protobuf.Timestamp" {
		t.Fatal("observation time must be a timestamp")
	}
	entry := response.Fields().ByName("entries").Message()
	for i := 0; i < entry.Fields().Len(); i++ {
		field := entry.Fields().Get(i)
		if field.Name() == "tcp" || field.Name() == "psk" {
			t.Fatal("discovery entries must not expose input credentials")
		}
	}
}

func TestNvmeDiscoveryJSONRoundTrip(t *testing.T) {
	files := schema(t)
	for _, test := range []struct {
		name protoreflect.FullName
		json string
	}{
		{
			"opi_api.storage.v1.DiscoverNvmeTargetsRequest",
			`{"trtype":"NVME_TRANSPORT_TYPE_TCP","endpoint":{"traddr":"192.0.2.10","trsvcid":"8009","adrfam":"NVME_ADDRESS_FAMILY_IPV4"},"hostnqn":"nqn.2026-01.example:host","pageSize":100}`,
		},
		{
			"opi_api.storage.v1.DiscoverNvmeTargetsRequest",
			`{"trtype":"NVME_TRANSPORT_TYPE_RDMA","endpoint":{"traddr":"2001:db8::1","trsvcid":"4420","adrfam":"NVME_ADDRESS_FAMILY_IPV6"},"pageToken":"opaque-snapshot-token"}`,
		},
		{
			"opi_api.storage.v1.DiscoverNvmeTargetsResponse",
			`{"entries":[{"subnqn":"nqn.2026-01.example:storage","trtype":"NVME_TRANSPORT_TYPE_TCP","endpoint":{"traddr":"192.0.2.11","trsvcid":"4420","adrfam":"NVME_ADDRESS_FAMILY_IPV4"},"type":"NVME_DISCOVERY_ENTRY_TYPE_SUBSYSTEM","secureChannelRequired":true},{"subnqn":"nqn.2014-08.org.nvmexpress.discovery","type":"NVME_DISCOVERY_ENTRY_TYPE_DISCOVERY_CONTROLLER"}],"nextPageToken":"next","generationCounter":"18446744073709551615","observeTime":"2026-01-01T00:00:00Z"}`,
		},
		{"opi_api.storage.v1.DiscoverNvmeTargetsResponse", `{}`},
	} {
		t.Run(string(test.name)+test.json, func(t *testing.T) {
			descriptor := message(t, files, test.name)
			value := dynamicpb.NewMessage(descriptor)
			if err := protojson.Unmarshal([]byte(test.json), value); err != nil {
				t.Fatal(err)
			}
			wire, err := proto.Marshal(value)
			if err != nil {
				t.Fatal(err)
			}
			decoded := dynamicpb.NewMessage(descriptor)
			if err := proto.Unmarshal(wire, decoded); err != nil || !proto.Equal(value, decoded) {
				t.Fatalf("discovery round trip: %v", err)
			}
		})
	}
}
