// SPDX-License-Identifier: Apache-2.0
package contracts

import (
	"bytes"
	"os"
	"strings"
	"testing"

	"google.golang.org/protobuf/encoding/protojson"
	"google.golang.org/protobuf/proto"
	"google.golang.org/protobuf/reflect/protoreflect"
	"google.golang.org/protobuf/types/dynamicpb"
)

func TestLegacyGenerationScriptUsesUnixLineEndings(t *testing.T) {
	script, err := os.ReadFile("../scripts/generate-storage-legacy.sh")
	if err != nil {
		t.Fatal(err)
	}
	if bytes.ContainsRune(script, '\r') {
		t.Fatal("the legacy-generation shell script must use Unix line endings")
	}
}

func TestStorageStatsMetadataCoverage(t *testing.T) {
	files := schema(t)
	var count int
	files.RangeFiles(func(file protoreflect.FileDescriptor) bool {
		if file.Package() != "opi_api.storage.v1" {
			return true
		}
		for i := 0; i < file.Messages().Len(); i++ {
			response := file.Messages().Get(i)
			if !strings.HasPrefix(string(response.Name()), "Stats") || !strings.HasSuffix(string(response.Name()), "Response") {
				continue
			}
			stats := response.Fields().ByNumber(1)
			if stats == nil || stats.Name() != "stats" || stats.Message().FullName() != "opi_api.storage.v1.VolumeStats" {
				continue
			}
			count++
			metadata := response.Fields().ByName("sample_metadata")
			if metadata == nil || metadata.Number() != 2 || !metadata.HasPresence() ||
				metadata.Message().FullName() != "opi_api.storage.v1.StatsSampleMetadata" {
				t.Errorf("%s must expose optional sampling context without moving stats", response.FullName())
				continue
			}
			legacy := dynamicpb.NewMessage(response)
			if err := protojson.Unmarshal([]byte(`{"stats":{"readOpsCount":1}}`), legacy); err != nil {
				t.Fatal(err)
			}
			if legacy.Has(metadata) {
				t.Fatal("legacy responses must not fabricate metadata")
			}
		}
		return true
	})
	if count < 14 {
		t.Errorf("covered %d storage Stats responses, want at least 14", count)
	}
}

func TestStatsSampleMetadataPresenceAndPrecision(t *testing.T) {
	files := schema(t)
	descriptor := message(t, files, "opi_api.storage.v1.StatsSampleMetadata")
	for _, field := range []protoreflect.Name{"tick_rate_hz", "sample_ticks"} {
		definition := descriptor.Fields().ByName(field)
		if !definition.HasPresence() || definition.Kind() != protoreflect.Int64Kind {
			t.Fatalf("%s must distinguish absent clock data from zero", field)
		}
	}
	for _, payload := range []string{
		`{}`,
		`{"sampleTicks":"0","tickRateHz":"1000000000"}`,
		`{"sampleTicks":"9007199254740993","tickRateHz":"2400000000"}`,
		`{"sampleTicks":"9223372036854775807","tickRateHz":"1","counterEpoch":"device-generation"}`,
		`{"collectionTime":"2026-01-01T00:00:01Z","counterStartTime":"2026-01-01T00:00:00Z"}`,
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
			t.Fatalf("metadata precision/presence round trip: %v", err)
		}
	}
	value := dynamicpb.NewMessage(descriptor)
	if err := protojson.Unmarshal([]byte(`{"sampleTicks":"0"}`), value); err != nil {
		t.Fatal(err)
	}
	if !value.Has(descriptor.Fields().ByName("sample_ticks")) || value.Has(descriptor.Fields().ByName("tick_rate_hz")) {
		t.Fatal("source tick zero must not imply a known frequency")
	}
}
