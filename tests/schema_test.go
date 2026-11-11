// SPDX-License-Identifier: Apache-2.0
package contracts

import (
	"os/exec"
	"testing"

	_ "google.golang.org/genproto/googleapis/api/annotations"
	"google.golang.org/protobuf/proto"
	"google.golang.org/protobuf/reflect/protodesc"
	"google.golang.org/protobuf/reflect/protoreflect"
	"google.golang.org/protobuf/reflect/protoregistry"
	"google.golang.org/protobuf/types/descriptorpb"
)

func schema(t *testing.T) *protoregistry.Files {
	t.Helper()
	output, err := exec.Command("buf", "build", "..", "--as-file-descriptor-set", "-o", "-").CombinedOutput()
	if err != nil {
		t.Fatalf("buf build: %v\n%s", err, output)
	}
	var set descriptorpb.FileDescriptorSet
	if err := proto.Unmarshal(output, &set); err != nil {
		t.Fatal(err)
	}
	files, err := protodesc.NewFiles(&set)
	if err != nil {
		t.Fatal(err)
	}
	return files
}

func message(t *testing.T, files *protoregistry.Files, name protoreflect.FullName) protoreflect.MessageDescriptor {
	t.Helper()
	descriptor, err := files.FindDescriptorByName(name)
	if err != nil {
		t.Fatal(err)
	}
	result, ok := descriptor.(protoreflect.MessageDescriptor)
	if !ok {
		t.Fatalf("%s is not a message", name)
	}
	return result
}
