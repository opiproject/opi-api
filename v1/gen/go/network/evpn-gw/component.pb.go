// SPDX-License-Identifier: Apache-2.0
// Copyright (C) 2023 Nordix Foundation.
// Copyright (c) 2024 Ericsson AB.

// (-- api-linter: core::0216::synonyms=disabled
//     aip.dev/not-precedent: Word "Status" will be used instead of "State". --)

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.36.5
// 	protoc        (unknown)
// source: network/evpn-gw/component.proto

package _go

import (
	_ "google.golang.org/genproto/googleapis/api/annotations"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
	unsafe "unsafe"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

// CompStatus reflects the status of a component
type CompStatus int32

const (
	// component status is "unspecified"
	CompStatus_COMP_STATUS_UNSPECIFIED CompStatus = 0
	// component status is "pending"
	CompStatus_COMP_STATUS_PENDING CompStatus = 1
	// component status is "success"
	CompStatus_COMP_STATUS_SUCCESS CompStatus = 2
	// component status is "error"
	CompStatus_COMP_STATUS_ERROR CompStatus = 3
)

// Enum value maps for CompStatus.
var (
	CompStatus_name = map[int32]string{
		0: "COMP_STATUS_UNSPECIFIED",
		1: "COMP_STATUS_PENDING",
		2: "COMP_STATUS_SUCCESS",
		3: "COMP_STATUS_ERROR",
	}
	CompStatus_value = map[string]int32{
		"COMP_STATUS_UNSPECIFIED": 0,
		"COMP_STATUS_PENDING":     1,
		"COMP_STATUS_SUCCESS":     2,
		"COMP_STATUS_ERROR":       3,
	}
)

func (x CompStatus) Enum() *CompStatus {
	p := new(CompStatus)
	*p = x
	return p
}

func (x CompStatus) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (CompStatus) Descriptor() protoreflect.EnumDescriptor {
	return file_network_evpn_gw_component_proto_enumTypes[0].Descriptor()
}

func (CompStatus) Type() protoreflect.EnumType {
	return &file_network_evpn_gw_component_proto_enumTypes[0]
}

func (x CompStatus) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use CompStatus.Descriptor instead.
func (CompStatus) EnumDescriptor() ([]byte, []int) {
	return file_network_evpn_gw_component_proto_rawDescGZIP(), []int{0}
}

// Component represents a subscribed component (e.g. FRR component, Linux component etc...)
// (-- api-linter: core::0123::resource-annotation=disabled
//
//	aip.dev/not-precedent: The name here is not the unique identifier of a DB object
//	                       just the name of the component that is subscribed. --)
type Component struct {
	state protoimpl.MessageState `protogen:"open.v1"`
	// Component's name
	Name string `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	// Component's status
	Status CompStatus `protobuf:"varint,2,opt,name=status,proto3,enum=opi_api.network.evpn_gw.v1alpha1.CompStatus" json:"status,omitempty"`
	// Component's details in the form of json string
	Details       string `protobuf:"bytes,3,opt,name=details,proto3" json:"details,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *Component) Reset() {
	*x = Component{}
	mi := &file_network_evpn_gw_component_proto_msgTypes[0]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *Component) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Component) ProtoMessage() {}

func (x *Component) ProtoReflect() protoreflect.Message {
	mi := &file_network_evpn_gw_component_proto_msgTypes[0]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Component.ProtoReflect.Descriptor instead.
func (*Component) Descriptor() ([]byte, []int) {
	return file_network_evpn_gw_component_proto_rawDescGZIP(), []int{0}
}

func (x *Component) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *Component) GetStatus() CompStatus {
	if x != nil {
		return x.Status
	}
	return CompStatus_COMP_STATUS_UNSPECIFIED
}

func (x *Component) GetDetails() string {
	if x != nil {
		return x.Details
	}
	return ""
}

var File_network_evpn_gw_component_proto protoreflect.FileDescriptor

var file_network_evpn_gw_component_proto_rawDesc = string([]byte{
	0x0a, 0x1f, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x2f, 0x65, 0x76, 0x70, 0x6e, 0x2d, 0x67,
	0x77, 0x2f, 0x63, 0x6f, 0x6d, 0x70, 0x6f, 0x6e, 0x65, 0x6e, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x12, 0x20, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x6e, 0x65, 0x74, 0x77, 0x6f,
	0x72, 0x6b, 0x2e, 0x65, 0x76, 0x70, 0x6e, 0x5f, 0x67, 0x77, 0x2e, 0x76, 0x31, 0x61, 0x6c, 0x70,
	0x68, 0x61, 0x31, 0x1a, 0x1f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f,
	0x66, 0x69, 0x65, 0x6c, 0x64, 0x5f, 0x62, 0x65, 0x68, 0x61, 0x76, 0x69, 0x6f, 0x72, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x22, 0x8e, 0x01, 0x0a, 0x09, 0x43, 0x6f, 0x6d, 0x70, 0x6f, 0x6e, 0x65,
	0x6e, 0x74, 0x12, 0x17, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09,
	0x42, 0x03, 0xe0, 0x41, 0x03, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x49, 0x0a, 0x06, 0x73,
	0x74, 0x61, 0x74, 0x75, 0x73, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x2c, 0x2e, 0x6f, 0x70,
	0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x2e, 0x65, 0x76,
	0x70, 0x6e, 0x5f, 0x67, 0x77, 0x2e, 0x76, 0x31, 0x61, 0x6c, 0x70, 0x68, 0x61, 0x31, 0x2e, 0x43,
	0x6f, 0x6d, 0x70, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x42, 0x03, 0xe0, 0x41, 0x03, 0x52, 0x06,
	0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x12, 0x1d, 0x0a, 0x07, 0x64, 0x65, 0x74, 0x61, 0x69, 0x6c,
	0x73, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x42, 0x03, 0xe0, 0x41, 0x03, 0x52, 0x07, 0x64, 0x65,
	0x74, 0x61, 0x69, 0x6c, 0x73, 0x2a, 0x72, 0x0a, 0x0a, 0x43, 0x6f, 0x6d, 0x70, 0x53, 0x74, 0x61,
	0x74, 0x75, 0x73, 0x12, 0x1b, 0x0a, 0x17, 0x43, 0x4f, 0x4d, 0x50, 0x5f, 0x53, 0x54, 0x41, 0x54,
	0x55, 0x53, 0x5f, 0x55, 0x4e, 0x53, 0x50, 0x45, 0x43, 0x49, 0x46, 0x49, 0x45, 0x44, 0x10, 0x00,
	0x12, 0x17, 0x0a, 0x13, 0x43, 0x4f, 0x4d, 0x50, 0x5f, 0x53, 0x54, 0x41, 0x54, 0x55, 0x53, 0x5f,
	0x50, 0x45, 0x4e, 0x44, 0x49, 0x4e, 0x47, 0x10, 0x01, 0x12, 0x17, 0x0a, 0x13, 0x43, 0x4f, 0x4d,
	0x50, 0x5f, 0x53, 0x54, 0x41, 0x54, 0x55, 0x53, 0x5f, 0x53, 0x55, 0x43, 0x43, 0x45, 0x53, 0x53,
	0x10, 0x02, 0x12, 0x15, 0x0a, 0x11, 0x43, 0x4f, 0x4d, 0x50, 0x5f, 0x53, 0x54, 0x41, 0x54, 0x55,
	0x53, 0x5f, 0x45, 0x52, 0x52, 0x4f, 0x52, 0x10, 0x03, 0x42, 0x73, 0x0a, 0x20, 0x6f, 0x70, 0x69,
	0x5f, 0x61, 0x70, 0x69, 0x2e, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x2e, 0x65, 0x76, 0x70,
	0x6e, 0x5f, 0x67, 0x77, 0x2e, 0x76, 0x31, 0x61, 0x6c, 0x70, 0x68, 0x61, 0x31, 0x42, 0x0e, 0x43,
	0x6f, 0x6d, 0x70, 0x6f, 0x6e, 0x65, 0x6e, 0x74, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a,
	0x3d, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x6f, 0x70, 0x69, 0x70,
	0x72, 0x6f, 0x6a, 0x65, 0x63, 0x74, 0x2f, 0x6f, 0x70, 0x69, 0x2d, 0x61, 0x70, 0x69, 0x2f, 0x6e,
	0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x2f, 0x65, 0x76, 0x70, 0x6e, 0x2d, 0x67, 0x77, 0x2f, 0x76,
	0x31, 0x61, 0x6c, 0x70, 0x68, 0x61, 0x31, 0x2f, 0x67, 0x65, 0x6e, 0x2f, 0x67, 0x6f, 0x62, 0x06,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
})

var (
	file_network_evpn_gw_component_proto_rawDescOnce sync.Once
	file_network_evpn_gw_component_proto_rawDescData []byte
)

func file_network_evpn_gw_component_proto_rawDescGZIP() []byte {
	file_network_evpn_gw_component_proto_rawDescOnce.Do(func() {
		file_network_evpn_gw_component_proto_rawDescData = protoimpl.X.CompressGZIP(unsafe.Slice(unsafe.StringData(file_network_evpn_gw_component_proto_rawDesc), len(file_network_evpn_gw_component_proto_rawDesc)))
	})
	return file_network_evpn_gw_component_proto_rawDescData
}

var file_network_evpn_gw_component_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_network_evpn_gw_component_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_network_evpn_gw_component_proto_goTypes = []any{
	(CompStatus)(0),   // 0: opi_api.network.evpn_gw.v1alpha1.CompStatus
	(*Component)(nil), // 1: opi_api.network.evpn_gw.v1alpha1.Component
}
var file_network_evpn_gw_component_proto_depIdxs = []int32{
	0, // 0: opi_api.network.evpn_gw.v1alpha1.Component.status:type_name -> opi_api.network.evpn_gw.v1alpha1.CompStatus
	1, // [1:1] is the sub-list for method output_type
	1, // [1:1] is the sub-list for method input_type
	1, // [1:1] is the sub-list for extension type_name
	1, // [1:1] is the sub-list for extension extendee
	0, // [0:1] is the sub-list for field type_name
}

func init() { file_network_evpn_gw_component_proto_init() }
func file_network_evpn_gw_component_proto_init() {
	if File_network_evpn_gw_component_proto != nil {
		return
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: unsafe.Slice(unsafe.StringData(file_network_evpn_gw_component_proto_rawDesc), len(file_network_evpn_gw_component_proto_rawDesc)),
			NumEnums:      1,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_network_evpn_gw_component_proto_goTypes,
		DependencyIndexes: file_network_evpn_gw_component_proto_depIdxs,
		EnumInfos:         file_network_evpn_gw_component_proto_enumTypes,
		MessageInfos:      file_network_evpn_gw_component_proto_msgTypes,
	}.Build()
	File_network_evpn_gw_component_proto = out.File
	file_network_evpn_gw_component_proto_goTypes = nil
	file_network_evpn_gw_component_proto_depIdxs = nil
}
