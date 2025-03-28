// SPDX-License-Identifier: Apache-2.0
// Copyright (c) 2022 Dell Inc, or its subsidiaries.
// Copyright (C) 2023 Intel Corporation
// Copyright (c) 2024 Xsight Labs Inc

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.36.5
// 	protoc        (unknown)
// source: storage/backend_malloc.proto

package _go

import (
	_ "google.golang.org/genproto/googleapis/api/annotations"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	emptypb "google.golang.org/protobuf/types/known/emptypb"
	fieldmaskpb "google.golang.org/protobuf/types/known/fieldmaskpb"
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

// Malloc volume, volatile volume
type MallocVolume struct {
	state protoimpl.MessageState `protogen:"open.v1"`
	// name is an opaque object handle that is not user settable.
	// name will be returned with created object
	// user can only set {resource}_id on the Create request object
	Name string `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	// The block size of the MallocVolume.
	BlockSize int64 `protobuf:"varint,2,opt,name=block_size,json=blockSize,proto3" json:"block_size,omitempty"`
	// The number of blocks in the MallocVolume.
	BlocksCount int64 `protobuf:"varint,3,opt,name=blocks_count,json=blocksCount,proto3" json:"blocks_count,omitempty"`
	// The metadata size of the MallocVolume.
	MetadataSize int64 `protobuf:"varint,4,opt,name=metadata_size,json=metadataSize,proto3" json:"metadata_size,omitempty"`
	// The UUID of the MallocVolume.
	Uuid          string `protobuf:"bytes,5,opt,name=uuid,proto3" json:"uuid,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *MallocVolume) Reset() {
	*x = MallocVolume{}
	mi := &file_storage_backend_malloc_proto_msgTypes[0]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *MallocVolume) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*MallocVolume) ProtoMessage() {}

func (x *MallocVolume) ProtoReflect() protoreflect.Message {
	mi := &file_storage_backend_malloc_proto_msgTypes[0]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use MallocVolume.ProtoReflect.Descriptor instead.
func (*MallocVolume) Descriptor() ([]byte, []int) {
	return file_storage_backend_malloc_proto_rawDescGZIP(), []int{0}
}

func (x *MallocVolume) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *MallocVolume) GetBlockSize() int64 {
	if x != nil {
		return x.BlockSize
	}
	return 0
}

func (x *MallocVolume) GetBlocksCount() int64 {
	if x != nil {
		return x.BlocksCount
	}
	return 0
}

func (x *MallocVolume) GetMetadataSize() int64 {
	if x != nil {
		return x.MetadataSize
	}
	return 0
}

func (x *MallocVolume) GetUuid() string {
	if x != nil {
		return x.Uuid
	}
	return ""
}

// Represents a request to create a Malloc Volume.
type CreateMallocVolumeRequest struct {
	state protoimpl.MessageState `protogen:"open.v1"`
	// The Malloc Volume to be created.
	MallocVolume *MallocVolume `protobuf:"bytes,1,opt,name=malloc_volume,json=mallocVolume,proto3" json:"malloc_volume,omitempty"`
	// An optional ID to assign to the Malloc Volume.
	// If this is not provided the system will auto-generate it.
	MallocVolumeId string `protobuf:"bytes,2,opt,name=malloc_volume_id,json=mallocVolumeId,proto3" json:"malloc_volume_id,omitempty"`
	unknownFields  protoimpl.UnknownFields
	sizeCache      protoimpl.SizeCache
}

func (x *CreateMallocVolumeRequest) Reset() {
	*x = CreateMallocVolumeRequest{}
	mi := &file_storage_backend_malloc_proto_msgTypes[1]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *CreateMallocVolumeRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateMallocVolumeRequest) ProtoMessage() {}

func (x *CreateMallocVolumeRequest) ProtoReflect() protoreflect.Message {
	mi := &file_storage_backend_malloc_proto_msgTypes[1]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CreateMallocVolumeRequest.ProtoReflect.Descriptor instead.
func (*CreateMallocVolumeRequest) Descriptor() ([]byte, []int) {
	return file_storage_backend_malloc_proto_rawDescGZIP(), []int{1}
}

func (x *CreateMallocVolumeRequest) GetMallocVolume() *MallocVolume {
	if x != nil {
		return x.MallocVolume
	}
	return nil
}

func (x *CreateMallocVolumeRequest) GetMallocVolumeId() string {
	if x != nil {
		return x.MallocVolumeId
	}
	return ""
}

// Represents a request to delete a Malloc Volume.
type DeleteMallocVolumeRequest struct {
	state protoimpl.MessageState `protogen:"open.v1"`
	// Object's unique identifier to delete
	Name string `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	// If set to true, and the resource is not found, the request will succeed
	// but no action will be taken on the server
	AllowMissing  bool `protobuf:"varint,2,opt,name=allow_missing,json=allowMissing,proto3" json:"allow_missing,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *DeleteMallocVolumeRequest) Reset() {
	*x = DeleteMallocVolumeRequest{}
	mi := &file_storage_backend_malloc_proto_msgTypes[2]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *DeleteMallocVolumeRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DeleteMallocVolumeRequest) ProtoMessage() {}

func (x *DeleteMallocVolumeRequest) ProtoReflect() protoreflect.Message {
	mi := &file_storage_backend_malloc_proto_msgTypes[2]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DeleteMallocVolumeRequest.ProtoReflect.Descriptor instead.
func (*DeleteMallocVolumeRequest) Descriptor() ([]byte, []int) {
	return file_storage_backend_malloc_proto_rawDescGZIP(), []int{2}
}

func (x *DeleteMallocVolumeRequest) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *DeleteMallocVolumeRequest) GetAllowMissing() bool {
	if x != nil {
		return x.AllowMissing
	}
	return false
}

// Represents a request to update a Malloc Volume.
type UpdateMallocVolumeRequest struct {
	state protoimpl.MessageState `protogen:"open.v1"`
	// The object's `name` field is used to identify the object to be updated.
	MallocVolume *MallocVolume `protobuf:"bytes,1,opt,name=malloc_volume,json=mallocVolume,proto3" json:"malloc_volume,omitempty"`
	// The list of fields to update.
	UpdateMask *fieldmaskpb.FieldMask `protobuf:"bytes,2,opt,name=update_mask,json=updateMask,proto3" json:"update_mask,omitempty"`
	// If set to true, and the object is not found, a new object will be created.
	// In this situation, `update_mask` is ignored.
	AllowMissing  bool `protobuf:"varint,3,opt,name=allow_missing,json=allowMissing,proto3" json:"allow_missing,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *UpdateMallocVolumeRequest) Reset() {
	*x = UpdateMallocVolumeRequest{}
	mi := &file_storage_backend_malloc_proto_msgTypes[3]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *UpdateMallocVolumeRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UpdateMallocVolumeRequest) ProtoMessage() {}

func (x *UpdateMallocVolumeRequest) ProtoReflect() protoreflect.Message {
	mi := &file_storage_backend_malloc_proto_msgTypes[3]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UpdateMallocVolumeRequest.ProtoReflect.Descriptor instead.
func (*UpdateMallocVolumeRequest) Descriptor() ([]byte, []int) {
	return file_storage_backend_malloc_proto_rawDescGZIP(), []int{3}
}

func (x *UpdateMallocVolumeRequest) GetMallocVolume() *MallocVolume {
	if x != nil {
		return x.MallocVolume
	}
	return nil
}

func (x *UpdateMallocVolumeRequest) GetUpdateMask() *fieldmaskpb.FieldMask {
	if x != nil {
		return x.UpdateMask
	}
	return nil
}

func (x *UpdateMallocVolumeRequest) GetAllowMissing() bool {
	if x != nil {
		return x.AllowMissing
	}
	return false
}

// Represents a request to list all Malloc Volumes.
type ListMallocVolumesRequest struct {
	state protoimpl.MessageState `protogen:"open.v1"`
	// page size of list request
	PageSize int32 `protobuf:"varint,1,opt,name=page_size,json=pageSize,proto3" json:"page_size,omitempty"`
	// page token of list request
	PageToken     string `protobuf:"bytes,2,opt,name=page_token,json=pageToken,proto3" json:"page_token,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *ListMallocVolumesRequest) Reset() {
	*x = ListMallocVolumesRequest{}
	mi := &file_storage_backend_malloc_proto_msgTypes[4]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *ListMallocVolumesRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ListMallocVolumesRequest) ProtoMessage() {}

func (x *ListMallocVolumesRequest) ProtoReflect() protoreflect.Message {
	mi := &file_storage_backend_malloc_proto_msgTypes[4]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ListMallocVolumesRequest.ProtoReflect.Descriptor instead.
func (*ListMallocVolumesRequest) Descriptor() ([]byte, []int) {
	return file_storage_backend_malloc_proto_rawDescGZIP(), []int{4}
}

func (x *ListMallocVolumesRequest) GetPageSize() int32 {
	if x != nil {
		return x.PageSize
	}
	return 0
}

func (x *ListMallocVolumesRequest) GetPageToken() string {
	if x != nil {
		return x.PageToken
	}
	return ""
}

// Represents a response to list all Malloc Volumes.
type ListMallocVolumesResponse struct {
	state protoimpl.MessageState `protogen:"open.v1"`
	// List of Malloc volumes
	MallocVolumes []*MallocVolume `protobuf:"bytes,1,rep,name=malloc_volumes,json=mallocVolumes,proto3" json:"malloc_volumes,omitempty"`
	// Next page token of list response
	NextPageToken string `protobuf:"bytes,2,opt,name=next_page_token,json=nextPageToken,proto3" json:"next_page_token,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *ListMallocVolumesResponse) Reset() {
	*x = ListMallocVolumesResponse{}
	mi := &file_storage_backend_malloc_proto_msgTypes[5]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *ListMallocVolumesResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ListMallocVolumesResponse) ProtoMessage() {}

func (x *ListMallocVolumesResponse) ProtoReflect() protoreflect.Message {
	mi := &file_storage_backend_malloc_proto_msgTypes[5]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ListMallocVolumesResponse.ProtoReflect.Descriptor instead.
func (*ListMallocVolumesResponse) Descriptor() ([]byte, []int) {
	return file_storage_backend_malloc_proto_rawDescGZIP(), []int{5}
}

func (x *ListMallocVolumesResponse) GetMallocVolumes() []*MallocVolume {
	if x != nil {
		return x.MallocVolumes
	}
	return nil
}

func (x *ListMallocVolumesResponse) GetNextPageToken() string {
	if x != nil {
		return x.NextPageToken
	}
	return ""
}

// Represents a request to get a Malloc Volume.
type GetMallocVolumeRequest struct {
	state protoimpl.MessageState `protogen:"open.v1"`
	// Object's unique identifier to retrieve
	Name          string `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *GetMallocVolumeRequest) Reset() {
	*x = GetMallocVolumeRequest{}
	mi := &file_storage_backend_malloc_proto_msgTypes[6]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *GetMallocVolumeRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetMallocVolumeRequest) ProtoMessage() {}

func (x *GetMallocVolumeRequest) ProtoReflect() protoreflect.Message {
	mi := &file_storage_backend_malloc_proto_msgTypes[6]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GetMallocVolumeRequest.ProtoReflect.Descriptor instead.
func (*GetMallocVolumeRequest) Descriptor() ([]byte, []int) {
	return file_storage_backend_malloc_proto_rawDescGZIP(), []int{6}
}

func (x *GetMallocVolumeRequest) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

// Represents a request to get a Malloc Volume statistics.
type StatsMallocVolumeRequest struct {
	state protoimpl.MessageState `protogen:"open.v1"`
	// Object's unique identifier to retrieve statistics
	Name          string `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *StatsMallocVolumeRequest) Reset() {
	*x = StatsMallocVolumeRequest{}
	mi := &file_storage_backend_malloc_proto_msgTypes[7]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *StatsMallocVolumeRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*StatsMallocVolumeRequest) ProtoMessage() {}

func (x *StatsMallocVolumeRequest) ProtoReflect() protoreflect.Message {
	mi := &file_storage_backend_malloc_proto_msgTypes[7]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use StatsMallocVolumeRequest.ProtoReflect.Descriptor instead.
func (*StatsMallocVolumeRequest) Descriptor() ([]byte, []int) {
	return file_storage_backend_malloc_proto_rawDescGZIP(), []int{7}
}

func (x *StatsMallocVolumeRequest) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

// Represents a response to get a Malloc Volume statistics.
type StatsMallocVolumeResponse struct {
	state protoimpl.MessageState `protogen:"open.v1"`
	// Volume statistics
	Stats         *VolumeStats `protobuf:"bytes,1,opt,name=stats,proto3" json:"stats,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *StatsMallocVolumeResponse) Reset() {
	*x = StatsMallocVolumeResponse{}
	mi := &file_storage_backend_malloc_proto_msgTypes[8]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *StatsMallocVolumeResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*StatsMallocVolumeResponse) ProtoMessage() {}

func (x *StatsMallocVolumeResponse) ProtoReflect() protoreflect.Message {
	mi := &file_storage_backend_malloc_proto_msgTypes[8]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use StatsMallocVolumeResponse.ProtoReflect.Descriptor instead.
func (*StatsMallocVolumeResponse) Descriptor() ([]byte, []int) {
	return file_storage_backend_malloc_proto_rawDescGZIP(), []int{8}
}

func (x *StatsMallocVolumeResponse) GetStats() *VolumeStats {
	if x != nil {
		return x.Stats
	}
	return nil
}

var File_storage_backend_malloc_proto protoreflect.FileDescriptor

var file_storage_backend_malloc_proto_rawDesc = string([]byte{
	0x0a, 0x1c, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2f, 0x62, 0x61, 0x63, 0x6b, 0x65, 0x6e,
	0x64, 0x5f, 0x6d, 0x61, 0x6c, 0x6c, 0x6f, 0x63, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x12,
	0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e,
	0x76, 0x31, 0x1a, 0x1c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x61,
	0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x1a, 0x17, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x63, 0x6c, 0x69,
	0x65, 0x6e, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1f, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x66, 0x69, 0x65, 0x6c, 0x64, 0x5f, 0x62, 0x65, 0x68, 0x61,
	0x76, 0x69, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x19, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1b, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x65, 0x6d, 0x70, 0x74, 0x79, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x1a, 0x20, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x62, 0x75, 0x66, 0x2f, 0x66, 0x69, 0x65, 0x6c, 0x64, 0x5f, 0x6d, 0x61, 0x73, 0x6b, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x17, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2f, 0x6f, 0x70,
	0x69, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x91, 0x02,
	0x0a, 0x0c, 0x4d, 0x61, 0x6c, 0x6c, 0x6f, 0x63, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x12, 0x17,
	0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x03, 0xe0, 0x41,
	0x08, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x22, 0x0a, 0x0a, 0x62, 0x6c, 0x6f, 0x63, 0x6b,
	0x5f, 0x73, 0x69, 0x7a, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x03, 0x42, 0x03, 0xe0, 0x41, 0x02,
	0x52, 0x09, 0x62, 0x6c, 0x6f, 0x63, 0x6b, 0x53, 0x69, 0x7a, 0x65, 0x12, 0x26, 0x0a, 0x0c, 0x62,
	0x6c, 0x6f, 0x63, 0x6b, 0x73, 0x5f, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x18, 0x03, 0x20, 0x01, 0x28,
	0x03, 0x42, 0x03, 0xe0, 0x41, 0x02, 0x52, 0x0b, 0x62, 0x6c, 0x6f, 0x63, 0x6b, 0x73, 0x43, 0x6f,
	0x75, 0x6e, 0x74, 0x12, 0x28, 0x0a, 0x0d, 0x6d, 0x65, 0x74, 0x61, 0x64, 0x61, 0x74, 0x61, 0x5f,
	0x73, 0x69, 0x7a, 0x65, 0x18, 0x04, 0x20, 0x01, 0x28, 0x03, 0x42, 0x03, 0xe0, 0x41, 0x01, 0x52,
	0x0c, 0x6d, 0x65, 0x74, 0x61, 0x64, 0x61, 0x74, 0x61, 0x53, 0x69, 0x7a, 0x65, 0x12, 0x17, 0x0a,
	0x04, 0x75, 0x75, 0x69, 0x64, 0x18, 0x05, 0x20, 0x01, 0x28, 0x09, 0x42, 0x03, 0xe0, 0x41, 0x01,
	0x52, 0x04, 0x75, 0x75, 0x69, 0x64, 0x3a, 0x59, 0xea, 0x41, 0x56, 0x0a, 0x1f, 0x6f, 0x70, 0x69,
	0x5f, 0x61, 0x70, 0x69, 0x2e, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x2f,
	0x4d, 0x61, 0x6c, 0x6c, 0x6f, 0x63, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x12, 0x16, 0x6d, 0x61,
	0x6c, 0x6c, 0x6f, 0x63, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x73, 0x2f, 0x7b, 0x76, 0x6f, 0x6c,
	0x75, 0x6d, 0x65, 0x7d, 0x2a, 0x0d, 0x6d, 0x61, 0x6c, 0x6c, 0x6f, 0x63, 0x56, 0x6f, 0x6c, 0x75,
	0x6d, 0x65, 0x73, 0x32, 0x0c, 0x6d, 0x61, 0x6c, 0x6c, 0x6f, 0x63, 0x56, 0x6f, 0x6c, 0x75, 0x6d,
	0x65, 0x22, 0x96, 0x01, 0x0a, 0x19, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x4d, 0x61, 0x6c, 0x6c,
	0x6f, 0x63, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12,
	0x4a, 0x0a, 0x0d, 0x6d, 0x61, 0x6c, 0x6c, 0x6f, 0x63, 0x5f, 0x76, 0x6f, 0x6c, 0x75, 0x6d, 0x65,
	0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x20, 0x2e, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69,
	0x2e, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x4d, 0x61, 0x6c, 0x6c,
	0x6f, 0x63, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x42, 0x03, 0xe0, 0x41, 0x02, 0x52, 0x0c, 0x6d,
	0x61, 0x6c, 0x6c, 0x6f, 0x63, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x12, 0x2d, 0x0a, 0x10, 0x6d,
	0x61, 0x6c, 0x6c, 0x6f, 0x63, 0x5f, 0x76, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x5f, 0x69, 0x64, 0x18,
	0x02, 0x20, 0x01, 0x28, 0x09, 0x42, 0x03, 0xe0, 0x41, 0x01, 0x52, 0x0e, 0x6d, 0x61, 0x6c, 0x6c,
	0x6f, 0x63, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x49, 0x64, 0x22, 0x82, 0x01, 0x0a, 0x19, 0x44,
	0x65, 0x6c, 0x65, 0x74, 0x65, 0x4d, 0x61, 0x6c, 0x6c, 0x6f, 0x63, 0x56, 0x6f, 0x6c, 0x75, 0x6d,
	0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x3b, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65,
	0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x27, 0xe0, 0x41, 0x02, 0xfa, 0x41, 0x21, 0x0a, 0x1f,
	0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e,
	0x76, 0x31, 0x2f, 0x4d, 0x61, 0x6c, 0x6c, 0x6f, 0x63, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x52,
	0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x28, 0x0a, 0x0d, 0x61, 0x6c, 0x6c, 0x6f, 0x77, 0x5f, 0x6d,
	0x69, 0x73, 0x73, 0x69, 0x6e, 0x67, 0x18, 0x02, 0x20, 0x01, 0x28, 0x08, 0x42, 0x03, 0xe0, 0x41,
	0x01, 0x52, 0x0c, 0x61, 0x6c, 0x6c, 0x6f, 0x77, 0x4d, 0x69, 0x73, 0x73, 0x69, 0x6e, 0x67, 0x22,
	0xd3, 0x01, 0x0a, 0x19, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x4d, 0x61, 0x6c, 0x6c, 0x6f, 0x63,
	0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x4a, 0x0a,
	0x0d, 0x6d, 0x61, 0x6c, 0x6c, 0x6f, 0x63, 0x5f, 0x76, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x0b, 0x32, 0x20, 0x2e, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x73,
	0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x4d, 0x61, 0x6c, 0x6c, 0x6f, 0x63,
	0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x42, 0x03, 0xe0, 0x41, 0x02, 0x52, 0x0c, 0x6d, 0x61, 0x6c,
	0x6c, 0x6f, 0x63, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x12, 0x40, 0x0a, 0x0b, 0x75, 0x70, 0x64,
	0x61, 0x74, 0x65, 0x5f, 0x6d, 0x61, 0x73, 0x6b, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1a,
	0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66,
	0x2e, 0x46, 0x69, 0x65, 0x6c, 0x64, 0x4d, 0x61, 0x73, 0x6b, 0x42, 0x03, 0xe0, 0x41, 0x01, 0x52,
	0x0a, 0x75, 0x70, 0x64, 0x61, 0x74, 0x65, 0x4d, 0x61, 0x73, 0x6b, 0x12, 0x28, 0x0a, 0x0d, 0x61,
	0x6c, 0x6c, 0x6f, 0x77, 0x5f, 0x6d, 0x69, 0x73, 0x73, 0x69, 0x6e, 0x67, 0x18, 0x03, 0x20, 0x01,
	0x28, 0x08, 0x42, 0x03, 0xe0, 0x41, 0x01, 0x52, 0x0c, 0x61, 0x6c, 0x6c, 0x6f, 0x77, 0x4d, 0x69,
	0x73, 0x73, 0x69, 0x6e, 0x67, 0x22, 0x60, 0x0a, 0x18, 0x4c, 0x69, 0x73, 0x74, 0x4d, 0x61, 0x6c,
	0x6c, 0x6f, 0x63, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73,
	0x74, 0x12, 0x20, 0x0a, 0x09, 0x70, 0x61, 0x67, 0x65, 0x5f, 0x73, 0x69, 0x7a, 0x65, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x05, 0x42, 0x03, 0xe0, 0x41, 0x01, 0x52, 0x08, 0x70, 0x61, 0x67, 0x65, 0x53,
	0x69, 0x7a, 0x65, 0x12, 0x22, 0x0a, 0x0a, 0x70, 0x61, 0x67, 0x65, 0x5f, 0x74, 0x6f, 0x6b, 0x65,
	0x6e, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x42, 0x03, 0xe0, 0x41, 0x01, 0x52, 0x09, 0x70, 0x61,
	0x67, 0x65, 0x54, 0x6f, 0x6b, 0x65, 0x6e, 0x22, 0x8c, 0x01, 0x0a, 0x19, 0x4c, 0x69, 0x73, 0x74,
	0x4d, 0x61, 0x6c, 0x6c, 0x6f, 0x63, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x73, 0x52, 0x65, 0x73,
	0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x47, 0x0a, 0x0e, 0x6d, 0x61, 0x6c, 0x6c, 0x6f, 0x63, 0x5f,
	0x76, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x20, 0x2e,
	0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e,
	0x76, 0x31, 0x2e, 0x4d, 0x61, 0x6c, 0x6c, 0x6f, 0x63, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x52,
	0x0d, 0x6d, 0x61, 0x6c, 0x6c, 0x6f, 0x63, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x73, 0x12, 0x26,
	0x0a, 0x0f, 0x6e, 0x65, 0x78, 0x74, 0x5f, 0x70, 0x61, 0x67, 0x65, 0x5f, 0x74, 0x6f, 0x6b, 0x65,
	0x6e, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0d, 0x6e, 0x65, 0x78, 0x74, 0x50, 0x61, 0x67,
	0x65, 0x54, 0x6f, 0x6b, 0x65, 0x6e, 0x22, 0x55, 0x0a, 0x16, 0x47, 0x65, 0x74, 0x4d, 0x61, 0x6c,
	0x6c, 0x6f, 0x63, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74,
	0x12, 0x3b, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x27,
	0xe0, 0x41, 0x02, 0xfa, 0x41, 0x21, 0x0a, 0x1f, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e,
	0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x2f, 0x4d, 0x61, 0x6c, 0x6c, 0x6f,
	0x63, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x22, 0x57, 0x0a,
	0x18, 0x53, 0x74, 0x61, 0x74, 0x73, 0x4d, 0x61, 0x6c, 0x6c, 0x6f, 0x63, 0x56, 0x6f, 0x6c, 0x75,
	0x6d, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x3b, 0x0a, 0x04, 0x6e, 0x61, 0x6d,
	0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x27, 0xe0, 0x41, 0x02, 0xfa, 0x41, 0x21, 0x0a,
	0x1f, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65,
	0x2e, 0x76, 0x31, 0x2f, 0x4d, 0x61, 0x6c, 0x6c, 0x6f, 0x63, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65,
	0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x22, 0x52, 0x0a, 0x19, 0x53, 0x74, 0x61, 0x74, 0x73, 0x4d,
	0x61, 0x6c, 0x6c, 0x6f, 0x63, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f,
	0x6e, 0x73, 0x65, 0x12, 0x35, 0x0a, 0x05, 0x73, 0x74, 0x61, 0x74, 0x73, 0x18, 0x01, 0x20, 0x01,
	0x28, 0x0b, 0x32, 0x1f, 0x2e, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x73, 0x74, 0x6f,
	0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x53, 0x74,
	0x61, 0x74, 0x73, 0x52, 0x05, 0x73, 0x74, 0x61, 0x74, 0x73, 0x32, 0xd5, 0x07, 0x0a, 0x13, 0x4d,
	0x61, 0x6c, 0x6c, 0x6f, 0x63, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x53, 0x65, 0x72, 0x76, 0x69,
	0x63, 0x65, 0x12, 0xb0, 0x01, 0x0a, 0x12, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x4d, 0x61, 0x6c,
	0x6c, 0x6f, 0x63, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x12, 0x2d, 0x2e, 0x6f, 0x70, 0x69, 0x5f,
	0x61, 0x70, 0x69, 0x2e, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x43,
	0x72, 0x65, 0x61, 0x74, 0x65, 0x4d, 0x61, 0x6c, 0x6c, 0x6f, 0x63, 0x56, 0x6f, 0x6c, 0x75, 0x6d,
	0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x20, 0x2e, 0x6f, 0x70, 0x69, 0x5f, 0x61,
	0x70, 0x69, 0x2e, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x4d, 0x61,
	0x6c, 0x6c, 0x6f, 0x63, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x22, 0x49, 0xda, 0x41, 0x1e, 0x6d,
	0x61, 0x6c, 0x6c, 0x6f, 0x63, 0x5f, 0x76, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x2c, 0x6d, 0x61, 0x6c,
	0x6c, 0x6f, 0x63, 0x5f, 0x76, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x5f, 0x69, 0x64, 0x82, 0xd3, 0xe4,
	0x93, 0x02, 0x22, 0x3a, 0x0d, 0x6d, 0x61, 0x6c, 0x6c, 0x6f, 0x63, 0x5f, 0x76, 0x6f, 0x6c, 0x75,
	0x6d, 0x65, 0x22, 0x11, 0x2f, 0x76, 0x31, 0x2f, 0x6d, 0x61, 0x6c, 0x6c, 0x6f, 0x63, 0x56, 0x6f,
	0x6c, 0x75, 0x6d, 0x65, 0x73, 0x12, 0x86, 0x01, 0x0a, 0x12, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65,
	0x4d, 0x61, 0x6c, 0x6c, 0x6f, 0x63, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x12, 0x2d, 0x2e, 0x6f,
	0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76,
	0x31, 0x2e, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x4d, 0x61, 0x6c, 0x6c, 0x6f, 0x63, 0x56, 0x6f,
	0x6c, 0x75, 0x6d, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x16, 0x2e, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x45, 0x6d,
	0x70, 0x74, 0x79, 0x22, 0x29, 0xda, 0x41, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x82, 0xd3, 0xe4, 0x93,
	0x02, 0x1c, 0x2a, 0x1a, 0x2f, 0x76, 0x31, 0x2f, 0x7b, 0x6e, 0x61, 0x6d, 0x65, 0x3d, 0x6d, 0x61,
	0x6c, 0x6c, 0x6f, 0x63, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x73, 0x2f, 0x2a, 0x7d, 0x12, 0xc2,
	0x01, 0x0a, 0x12, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x4d, 0x61, 0x6c, 0x6c, 0x6f, 0x63, 0x56,
	0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x12, 0x2d, 0x2e, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e,
	0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x55, 0x70, 0x64, 0x61, 0x74,
	0x65, 0x4d, 0x61, 0x6c, 0x6c, 0x6f, 0x63, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x52, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x1a, 0x20, 0x2e, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x73,
	0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x4d, 0x61, 0x6c, 0x6c, 0x6f, 0x63,
	0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x22, 0x5b, 0xda, 0x41, 0x19, 0x6d, 0x61, 0x6c, 0x6c, 0x6f,
	0x63, 0x5f, 0x76, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x2c, 0x75, 0x70, 0x64, 0x61, 0x74, 0x65, 0x5f,
	0x6d, 0x61, 0x73, 0x6b, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x39, 0x3a, 0x0d, 0x6d, 0x61, 0x6c, 0x6c,
	0x6f, 0x63, 0x5f, 0x76, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x32, 0x28, 0x2f, 0x76, 0x31, 0x2f, 0x7b,
	0x6d, 0x61, 0x6c, 0x6c, 0x6f, 0x63, 0x5f, 0x76, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x2e, 0x6e, 0x61,
	0x6d, 0x65, 0x3d, 0x6d, 0x61, 0x6c, 0x6c, 0x6f, 0x63, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x73,
	0x2f, 0x2a, 0x7d, 0x12, 0x8b, 0x01, 0x0a, 0x11, 0x4c, 0x69, 0x73, 0x74, 0x4d, 0x61, 0x6c, 0x6c,
	0x6f, 0x63, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x73, 0x12, 0x2c, 0x2e, 0x6f, 0x70, 0x69, 0x5f,
	0x61, 0x70, 0x69, 0x2e, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x4c,
	0x69, 0x73, 0x74, 0x4d, 0x61, 0x6c, 0x6c, 0x6f, 0x63, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x73,
	0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x2d, 0x2e, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70,
	0x69, 0x2e, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x4c, 0x69, 0x73,
	0x74, 0x4d, 0x61, 0x6c, 0x6c, 0x6f, 0x63, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x73, 0x52, 0x65,
	0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x19, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x13, 0x12, 0x11,
	0x2f, 0x76, 0x31, 0x2f, 0x6d, 0x61, 0x6c, 0x6c, 0x6f, 0x63, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65,
	0x73, 0x12, 0x8a, 0x01, 0x0a, 0x0f, 0x47, 0x65, 0x74, 0x4d, 0x61, 0x6c, 0x6c, 0x6f, 0x63, 0x56,
	0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x12, 0x2a, 0x2e, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e,
	0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x47, 0x65, 0x74, 0x4d, 0x61,
	0x6c, 0x6c, 0x6f, 0x63, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73,
	0x74, 0x1a, 0x20, 0x2e, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x73, 0x74, 0x6f, 0x72,
	0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x4d, 0x61, 0x6c, 0x6c, 0x6f, 0x63, 0x56, 0x6f, 0x6c,
	0x75, 0x6d, 0x65, 0x22, 0x29, 0xda, 0x41, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x82, 0xd3, 0xe4, 0x93,
	0x02, 0x1c, 0x12, 0x1a, 0x2f, 0x76, 0x31, 0x2f, 0x7b, 0x6e, 0x61, 0x6d, 0x65, 0x3d, 0x6d, 0x61,
	0x6c, 0x6c, 0x6f, 0x63, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x73, 0x2f, 0x2a, 0x7d, 0x12, 0xa1,
	0x01, 0x0a, 0x11, 0x53, 0x74, 0x61, 0x74, 0x73, 0x4d, 0x61, 0x6c, 0x6c, 0x6f, 0x63, 0x56, 0x6f,
	0x6c, 0x75, 0x6d, 0x65, 0x12, 0x2c, 0x2e, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x73,
	0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x53, 0x74, 0x61, 0x74, 0x73, 0x4d,
	0x61, 0x6c, 0x6c, 0x6f, 0x63, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65,
	0x73, 0x74, 0x1a, 0x2d, 0x2e, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x73, 0x74, 0x6f,
	0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x53, 0x74, 0x61, 0x74, 0x73, 0x4d, 0x61, 0x6c,
	0x6c, 0x6f, 0x63, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73,
	0x65, 0x22, 0x2f, 0xda, 0x41, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x22,
	0x12, 0x20, 0x2f, 0x76, 0x31, 0x2f, 0x7b, 0x6e, 0x61, 0x6d, 0x65, 0x3d, 0x6d, 0x61, 0x6c, 0x6c,
	0x6f, 0x63, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x73, 0x2f, 0x2a, 0x7d, 0x3a, 0x73, 0x74, 0x61,
	0x74, 0x73, 0x42, 0x61, 0x0a, 0x12, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x73, 0x74,
	0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x42, 0x12, 0x42, 0x61, 0x63, 0x6b, 0x65, 0x6e,
	0x64, 0x4d, 0x61, 0x6c, 0x6c, 0x6f, 0x63, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x35,
	0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x6f, 0x70, 0x69, 0x70, 0x72,
	0x6f, 0x6a, 0x65, 0x63, 0x74, 0x2f, 0x6f, 0x70, 0x69, 0x2d, 0x61, 0x70, 0x69, 0x2f, 0x73, 0x74,
	0x6f, 0x72, 0x61, 0x67, 0x65, 0x2f, 0x76, 0x31, 0x61, 0x6c, 0x70, 0x68, 0x61, 0x31, 0x2f, 0x67,
	0x65, 0x6e, 0x2f, 0x67, 0x6f, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
})

var (
	file_storage_backend_malloc_proto_rawDescOnce sync.Once
	file_storage_backend_malloc_proto_rawDescData []byte
)

func file_storage_backend_malloc_proto_rawDescGZIP() []byte {
	file_storage_backend_malloc_proto_rawDescOnce.Do(func() {
		file_storage_backend_malloc_proto_rawDescData = protoimpl.X.CompressGZIP(unsafe.Slice(unsafe.StringData(file_storage_backend_malloc_proto_rawDesc), len(file_storage_backend_malloc_proto_rawDesc)))
	})
	return file_storage_backend_malloc_proto_rawDescData
}

var file_storage_backend_malloc_proto_msgTypes = make([]protoimpl.MessageInfo, 9)
var file_storage_backend_malloc_proto_goTypes = []any{
	(*MallocVolume)(nil),              // 0: opi_api.storage.v1.MallocVolume
	(*CreateMallocVolumeRequest)(nil), // 1: opi_api.storage.v1.CreateMallocVolumeRequest
	(*DeleteMallocVolumeRequest)(nil), // 2: opi_api.storage.v1.DeleteMallocVolumeRequest
	(*UpdateMallocVolumeRequest)(nil), // 3: opi_api.storage.v1.UpdateMallocVolumeRequest
	(*ListMallocVolumesRequest)(nil),  // 4: opi_api.storage.v1.ListMallocVolumesRequest
	(*ListMallocVolumesResponse)(nil), // 5: opi_api.storage.v1.ListMallocVolumesResponse
	(*GetMallocVolumeRequest)(nil),    // 6: opi_api.storage.v1.GetMallocVolumeRequest
	(*StatsMallocVolumeRequest)(nil),  // 7: opi_api.storage.v1.StatsMallocVolumeRequest
	(*StatsMallocVolumeResponse)(nil), // 8: opi_api.storage.v1.StatsMallocVolumeResponse
	(*fieldmaskpb.FieldMask)(nil),     // 9: google.protobuf.FieldMask
	(*VolumeStats)(nil),               // 10: opi_api.storage.v1.VolumeStats
	(*emptypb.Empty)(nil),             // 11: google.protobuf.Empty
}
var file_storage_backend_malloc_proto_depIdxs = []int32{
	0,  // 0: opi_api.storage.v1.CreateMallocVolumeRequest.malloc_volume:type_name -> opi_api.storage.v1.MallocVolume
	0,  // 1: opi_api.storage.v1.UpdateMallocVolumeRequest.malloc_volume:type_name -> opi_api.storage.v1.MallocVolume
	9,  // 2: opi_api.storage.v1.UpdateMallocVolumeRequest.update_mask:type_name -> google.protobuf.FieldMask
	0,  // 3: opi_api.storage.v1.ListMallocVolumesResponse.malloc_volumes:type_name -> opi_api.storage.v1.MallocVolume
	10, // 4: opi_api.storage.v1.StatsMallocVolumeResponse.stats:type_name -> opi_api.storage.v1.VolumeStats
	1,  // 5: opi_api.storage.v1.MallocVolumeService.CreateMallocVolume:input_type -> opi_api.storage.v1.CreateMallocVolumeRequest
	2,  // 6: opi_api.storage.v1.MallocVolumeService.DeleteMallocVolume:input_type -> opi_api.storage.v1.DeleteMallocVolumeRequest
	3,  // 7: opi_api.storage.v1.MallocVolumeService.UpdateMallocVolume:input_type -> opi_api.storage.v1.UpdateMallocVolumeRequest
	4,  // 8: opi_api.storage.v1.MallocVolumeService.ListMallocVolumes:input_type -> opi_api.storage.v1.ListMallocVolumesRequest
	6,  // 9: opi_api.storage.v1.MallocVolumeService.GetMallocVolume:input_type -> opi_api.storage.v1.GetMallocVolumeRequest
	7,  // 10: opi_api.storage.v1.MallocVolumeService.StatsMallocVolume:input_type -> opi_api.storage.v1.StatsMallocVolumeRequest
	0,  // 11: opi_api.storage.v1.MallocVolumeService.CreateMallocVolume:output_type -> opi_api.storage.v1.MallocVolume
	11, // 12: opi_api.storage.v1.MallocVolumeService.DeleteMallocVolume:output_type -> google.protobuf.Empty
	0,  // 13: opi_api.storage.v1.MallocVolumeService.UpdateMallocVolume:output_type -> opi_api.storage.v1.MallocVolume
	5,  // 14: opi_api.storage.v1.MallocVolumeService.ListMallocVolumes:output_type -> opi_api.storage.v1.ListMallocVolumesResponse
	0,  // 15: opi_api.storage.v1.MallocVolumeService.GetMallocVolume:output_type -> opi_api.storage.v1.MallocVolume
	8,  // 16: opi_api.storage.v1.MallocVolumeService.StatsMallocVolume:output_type -> opi_api.storage.v1.StatsMallocVolumeResponse
	11, // [11:17] is the sub-list for method output_type
	5,  // [5:11] is the sub-list for method input_type
	5,  // [5:5] is the sub-list for extension type_name
	5,  // [5:5] is the sub-list for extension extendee
	0,  // [0:5] is the sub-list for field type_name
}

func init() { file_storage_backend_malloc_proto_init() }
func file_storage_backend_malloc_proto_init() {
	if File_storage_backend_malloc_proto != nil {
		return
	}
	file_storage_opicommon_proto_init()
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: unsafe.Slice(unsafe.StringData(file_storage_backend_malloc_proto_rawDesc), len(file_storage_backend_malloc_proto_rawDesc)),
			NumEnums:      0,
			NumMessages:   9,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_storage_backend_malloc_proto_goTypes,
		DependencyIndexes: file_storage_backend_malloc_proto_depIdxs,
		MessageInfos:      file_storage_backend_malloc_proto_msgTypes,
	}.Build()
	File_storage_backend_malloc_proto = out.File
	file_storage_backend_malloc_proto_goTypes = nil
	file_storage_backend_malloc_proto_depIdxs = nil
}
