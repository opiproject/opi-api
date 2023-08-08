// SPDX-License-Identifier: Apache-2.0
// Copyright (C) 2023 Intel Corporation

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.1
// 	protoc        v3.21.6
// source: middleend_qos_volume.proto

package _go

import (
	_ "google.golang.org/genproto/googleapis/api/annotations"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	emptypb "google.golang.org/protobuf/types/known/emptypb"
	fieldmaskpb "google.golang.org/protobuf/types/known/fieldmaskpb"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type QosVolume struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// name is an opaque object handle that is not user settable.
	// name will be returned with created object
	// user can only set {resource}_id on the Create request object
	Name string `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	// Middleend/backend volume to apply QoS on
	VolumeNameRef string    `protobuf:"bytes,2,opt,name=volume_name_ref,json=volumeNameRef,proto3" json:"volume_name_ref,omitempty"`
	MinLimit      *QosLimit `protobuf:"bytes,3,opt,name=min_limit,json=minLimit,proto3" json:"min_limit,omitempty"`
	MaxLimit      *QosLimit `protobuf:"bytes,4,opt,name=max_limit,json=maxLimit,proto3" json:"max_limit,omitempty"`
}

func (x *QosVolume) Reset() {
	*x = QosVolume{}
	if protoimpl.UnsafeEnabled {
		mi := &file_middleend_qos_volume_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *QosVolume) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*QosVolume) ProtoMessage() {}

func (x *QosVolume) ProtoReflect() protoreflect.Message {
	mi := &file_middleend_qos_volume_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use QosVolume.ProtoReflect.Descriptor instead.
func (*QosVolume) Descriptor() ([]byte, []int) {
	return file_middleend_qos_volume_proto_rawDescGZIP(), []int{0}
}

func (x *QosVolume) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *QosVolume) GetVolumeNameRef() string {
	if x != nil {
		return x.VolumeNameRef
	}
	return ""
}

func (x *QosVolume) GetMinLimit() *QosLimit {
	if x != nil {
		return x.MinLimit
	}
	return nil
}

func (x *QosVolume) GetMaxLimit() *QosLimit {
	if x != nil {
		return x.MaxLimit
	}
	return nil
}

type CreateQosVolumeRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	QosVolume   *QosVolume `protobuf:"bytes,1,opt,name=qos_volume,json=qosVolume,proto3" json:"qos_volume,omitempty"`
	QosVolumeId string     `protobuf:"bytes,2,opt,name=qos_volume_id,json=qosVolumeId,proto3" json:"qos_volume_id,omitempty"`
}

func (x *CreateQosVolumeRequest) Reset() {
	*x = CreateQosVolumeRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_middleend_qos_volume_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CreateQosVolumeRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateQosVolumeRequest) ProtoMessage() {}

func (x *CreateQosVolumeRequest) ProtoReflect() protoreflect.Message {
	mi := &file_middleend_qos_volume_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CreateQosVolumeRequest.ProtoReflect.Descriptor instead.
func (*CreateQosVolumeRequest) Descriptor() ([]byte, []int) {
	return file_middleend_qos_volume_proto_rawDescGZIP(), []int{1}
}

func (x *CreateQosVolumeRequest) GetQosVolume() *QosVolume {
	if x != nil {
		return x.QosVolume
	}
	return nil
}

func (x *CreateQosVolumeRequest) GetQosVolumeId() string {
	if x != nil {
		return x.QosVolumeId
	}
	return ""
}

type DeleteQosVolumeRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Name string `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	// If set to true, and the resource is not found, the request will succeed
	// but no action will be taken on the server
	AllowMissing bool `protobuf:"varint,2,opt,name=allow_missing,json=allowMissing,proto3" json:"allow_missing,omitempty"`
}

func (x *DeleteQosVolumeRequest) Reset() {
	*x = DeleteQosVolumeRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_middleend_qos_volume_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DeleteQosVolumeRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DeleteQosVolumeRequest) ProtoMessage() {}

func (x *DeleteQosVolumeRequest) ProtoReflect() protoreflect.Message {
	mi := &file_middleend_qos_volume_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DeleteQosVolumeRequest.ProtoReflect.Descriptor instead.
func (*DeleteQosVolumeRequest) Descriptor() ([]byte, []int) {
	return file_middleend_qos_volume_proto_rawDescGZIP(), []int{2}
}

func (x *DeleteQosVolumeRequest) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *DeleteQosVolumeRequest) GetAllowMissing() bool {
	if x != nil {
		return x.AllowMissing
	}
	return false
}

type UpdateQosVolumeRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The object's `name` field is used to identify the object to be updated.
	QosVolume *QosVolume `protobuf:"bytes,1,opt,name=qos_volume,json=qosVolume,proto3" json:"qos_volume,omitempty"`
	// The list of fields to update.
	UpdateMask *fieldmaskpb.FieldMask `protobuf:"bytes,2,opt,name=update_mask,json=updateMask,proto3" json:"update_mask,omitempty"`
	// If set to true, and the object is not found, a new object will be created.
	// In this situation, `update_mask` is ignored.
	AllowMissing bool `protobuf:"varint,3,opt,name=allow_missing,json=allowMissing,proto3" json:"allow_missing,omitempty"`
}

func (x *UpdateQosVolumeRequest) Reset() {
	*x = UpdateQosVolumeRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_middleend_qos_volume_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UpdateQosVolumeRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UpdateQosVolumeRequest) ProtoMessage() {}

func (x *UpdateQosVolumeRequest) ProtoReflect() protoreflect.Message {
	mi := &file_middleend_qos_volume_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UpdateQosVolumeRequest.ProtoReflect.Descriptor instead.
func (*UpdateQosVolumeRequest) Descriptor() ([]byte, []int) {
	return file_middleend_qos_volume_proto_rawDescGZIP(), []int{3}
}

func (x *UpdateQosVolumeRequest) GetQosVolume() *QosVolume {
	if x != nil {
		return x.QosVolume
	}
	return nil
}

func (x *UpdateQosVolumeRequest) GetUpdateMask() *fieldmaskpb.FieldMask {
	if x != nil {
		return x.UpdateMask
	}
	return nil
}

func (x *UpdateQosVolumeRequest) GetAllowMissing() bool {
	if x != nil {
		return x.AllowMissing
	}
	return false
}

type ListQosVolumesRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Parent    string `protobuf:"bytes,1,opt,name=parent,proto3" json:"parent,omitempty"`
	PageSize  int32  `protobuf:"varint,2,opt,name=page_size,json=pageSize,proto3" json:"page_size,omitempty"`
	PageToken string `protobuf:"bytes,3,opt,name=page_token,json=pageToken,proto3" json:"page_token,omitempty"`
}

func (x *ListQosVolumesRequest) Reset() {
	*x = ListQosVolumesRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_middleend_qos_volume_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ListQosVolumesRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ListQosVolumesRequest) ProtoMessage() {}

func (x *ListQosVolumesRequest) ProtoReflect() protoreflect.Message {
	mi := &file_middleend_qos_volume_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ListQosVolumesRequest.ProtoReflect.Descriptor instead.
func (*ListQosVolumesRequest) Descriptor() ([]byte, []int) {
	return file_middleend_qos_volume_proto_rawDescGZIP(), []int{4}
}

func (x *ListQosVolumesRequest) GetParent() string {
	if x != nil {
		return x.Parent
	}
	return ""
}

func (x *ListQosVolumesRequest) GetPageSize() int32 {
	if x != nil {
		return x.PageSize
	}
	return 0
}

func (x *ListQosVolumesRequest) GetPageToken() string {
	if x != nil {
		return x.PageToken
	}
	return ""
}

type ListQosVolumesResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	QosVolumes    []*QosVolume `protobuf:"bytes,1,rep,name=qos_volumes,json=qosVolumes,proto3" json:"qos_volumes,omitempty"`
	NextPageToken string       `protobuf:"bytes,2,opt,name=next_page_token,json=nextPageToken,proto3" json:"next_page_token,omitempty"`
}

func (x *ListQosVolumesResponse) Reset() {
	*x = ListQosVolumesResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_middleend_qos_volume_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ListQosVolumesResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ListQosVolumesResponse) ProtoMessage() {}

func (x *ListQosVolumesResponse) ProtoReflect() protoreflect.Message {
	mi := &file_middleend_qos_volume_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ListQosVolumesResponse.ProtoReflect.Descriptor instead.
func (*ListQosVolumesResponse) Descriptor() ([]byte, []int) {
	return file_middleend_qos_volume_proto_rawDescGZIP(), []int{5}
}

func (x *ListQosVolumesResponse) GetQosVolumes() []*QosVolume {
	if x != nil {
		return x.QosVolumes
	}
	return nil
}

func (x *ListQosVolumesResponse) GetNextPageToken() string {
	if x != nil {
		return x.NextPageToken
	}
	return ""
}

type GetQosVolumeRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Name string `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
}

func (x *GetQosVolumeRequest) Reset() {
	*x = GetQosVolumeRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_middleend_qos_volume_proto_msgTypes[6]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GetQosVolumeRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetQosVolumeRequest) ProtoMessage() {}

func (x *GetQosVolumeRequest) ProtoReflect() protoreflect.Message {
	mi := &file_middleend_qos_volume_proto_msgTypes[6]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GetQosVolumeRequest.ProtoReflect.Descriptor instead.
func (*GetQosVolumeRequest) Descriptor() ([]byte, []int) {
	return file_middleend_qos_volume_proto_rawDescGZIP(), []int{6}
}

func (x *GetQosVolumeRequest) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

type StatsQosVolumeRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Name string `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
}

func (x *StatsQosVolumeRequest) Reset() {
	*x = StatsQosVolumeRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_middleend_qos_volume_proto_msgTypes[7]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *StatsQosVolumeRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*StatsQosVolumeRequest) ProtoMessage() {}

func (x *StatsQosVolumeRequest) ProtoReflect() protoreflect.Message {
	mi := &file_middleend_qos_volume_proto_msgTypes[7]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use StatsQosVolumeRequest.ProtoReflect.Descriptor instead.
func (*StatsQosVolumeRequest) Descriptor() ([]byte, []int) {
	return file_middleend_qos_volume_proto_rawDescGZIP(), []int{7}
}

func (x *StatsQosVolumeRequest) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

type StatsQosVolumeResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Stats *VolumeStats `protobuf:"bytes,1,opt,name=stats,proto3" json:"stats,omitempty"`
}

func (x *StatsQosVolumeResponse) Reset() {
	*x = StatsQosVolumeResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_middleend_qos_volume_proto_msgTypes[8]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *StatsQosVolumeResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*StatsQosVolumeResponse) ProtoMessage() {}

func (x *StatsQosVolumeResponse) ProtoReflect() protoreflect.Message {
	mi := &file_middleend_qos_volume_proto_msgTypes[8]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use StatsQosVolumeResponse.ProtoReflect.Descriptor instead.
func (*StatsQosVolumeResponse) Descriptor() ([]byte, []int) {
	return file_middleend_qos_volume_proto_rawDescGZIP(), []int{8}
}

func (x *StatsQosVolumeResponse) GetStats() *VolumeStats {
	if x != nil {
		return x.Stats
	}
	return nil
}

var File_middleend_qos_volume_proto protoreflect.FileDescriptor

var file_middleend_qos_volume_proto_rawDesc = []byte{
	0x0a, 0x1a, 0x6d, 0x69, 0x64, 0x64, 0x6c, 0x65, 0x65, 0x6e, 0x64, 0x5f, 0x71, 0x6f, 0x73, 0x5f,
	0x76, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x12, 0x6f, 0x70,
	0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31,
	0x1a, 0x0f, 0x6f, 0x70, 0x69, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x1a, 0x17, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x63, 0x6c,
	0x69, 0x65, 0x6e, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x19, 0x67, 0x6f, 0x6f, 0x67,
	0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1b, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x65, 0x6d, 0x70, 0x74, 0x79, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x1a, 0x1c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x61,
	0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x1a, 0x1f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x66, 0x69, 0x65,
	0x6c, 0x64, 0x5f, 0x62, 0x65, 0x68, 0x61, 0x76, 0x69, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x1a, 0x20, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62,
	0x75, 0x66, 0x2f, 0x66, 0x69, 0x65, 0x6c, 0x64, 0x5f, 0x6d, 0x61, 0x73, 0x6b, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x22, 0xa4, 0x02, 0x0a, 0x09, 0x51, 0x6f, 0x73, 0x56, 0x6f, 0x6c, 0x75, 0x6d,
	0x65, 0x12, 0x3b, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42,
	0x27, 0xe0, 0x41, 0x03, 0xe0, 0x41, 0x05, 0xfa, 0x41, 0x1e, 0x0a, 0x1c, 0x6f, 0x70, 0x69, 0x5f,
	0x61, 0x70, 0x69, 0x2e, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x2f, 0x51,
	0x6f, 0x73, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x2b,
	0x0a, 0x0f, 0x76, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x5f, 0x72, 0x65,
	0x66, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x42, 0x03, 0xe0, 0x41, 0x02, 0x52, 0x0d, 0x76, 0x6f,
	0x6c, 0x75, 0x6d, 0x65, 0x4e, 0x61, 0x6d, 0x65, 0x52, 0x65, 0x66, 0x12, 0x39, 0x0a, 0x09, 0x6d,
	0x69, 0x6e, 0x5f, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1c,
	0x2e, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65,
	0x2e, 0x76, 0x31, 0x2e, 0x51, 0x6f, 0x73, 0x4c, 0x69, 0x6d, 0x69, 0x74, 0x52, 0x08, 0x6d, 0x69,
	0x6e, 0x4c, 0x69, 0x6d, 0x69, 0x74, 0x12, 0x39, 0x0a, 0x09, 0x6d, 0x61, 0x78, 0x5f, 0x6c, 0x69,
	0x6d, 0x69, 0x74, 0x18, 0x04, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1c, 0x2e, 0x6f, 0x70, 0x69, 0x5f,
	0x61, 0x70, 0x69, 0x2e, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x51,
	0x6f, 0x73, 0x4c, 0x69, 0x6d, 0x69, 0x74, 0x52, 0x08, 0x6d, 0x61, 0x78, 0x4c, 0x69, 0x6d, 0x69,
	0x74, 0x3a, 0x37, 0xea, 0x41, 0x34, 0x0a, 0x20, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e,
	0x6f, 0x70, 0x69, 0x70, 0x72, 0x6f, 0x6a, 0x65, 0x63, 0x74, 0x2e, 0x6f, 0x72, 0x67, 0x2f, 0x51,
	0x6f, 0x73, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x12, 0x10, 0x76, 0x6f, 0x6c, 0x75, 0x6d, 0x65,
	0x73, 0x2f, 0x7b, 0x76, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x7d, 0x22, 0x7f, 0x0a, 0x16, 0x43, 0x72,
	0x65, 0x61, 0x74, 0x65, 0x51, 0x6f, 0x73, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x52, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x12, 0x41, 0x0a, 0x0a, 0x71, 0x6f, 0x73, 0x5f, 0x76, 0x6f, 0x6c, 0x75,
	0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1d, 0x2e, 0x6f, 0x70, 0x69, 0x5f, 0x61,
	0x70, 0x69, 0x2e, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x51, 0x6f,
	0x73, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x42, 0x03, 0xe0, 0x41, 0x02, 0x52, 0x09, 0x71, 0x6f,
	0x73, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x12, 0x22, 0x0a, 0x0d, 0x71, 0x6f, 0x73, 0x5f, 0x76,
	0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x5f, 0x69, 0x64, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0b,
	0x71, 0x6f, 0x73, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x49, 0x64, 0x22, 0x77, 0x0a, 0x16, 0x44,
	0x65, 0x6c, 0x65, 0x74, 0x65, 0x51, 0x6f, 0x73, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x52, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x38, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x09, 0x42, 0x24, 0xe0, 0x41, 0x02, 0xfa, 0x41, 0x1e, 0x0a, 0x1c, 0x6f, 0x70, 0x69,
	0x5f, 0x61, 0x70, 0x69, 0x2e, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x2f,
	0x51, 0x6f, 0x73, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12,
	0x23, 0x0a, 0x0d, 0x61, 0x6c, 0x6c, 0x6f, 0x77, 0x5f, 0x6d, 0x69, 0x73, 0x73, 0x69, 0x6e, 0x67,
	0x18, 0x02, 0x20, 0x01, 0x28, 0x08, 0x52, 0x0c, 0x61, 0x6c, 0x6c, 0x6f, 0x77, 0x4d, 0x69, 0x73,
	0x73, 0x69, 0x6e, 0x67, 0x22, 0xb8, 0x01, 0x0a, 0x16, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x51,
	0x6f, 0x73, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12,
	0x3c, 0x0a, 0x0a, 0x71, 0x6f, 0x73, 0x5f, 0x76, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x0b, 0x32, 0x1d, 0x2e, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x73, 0x74,
	0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x51, 0x6f, 0x73, 0x56, 0x6f, 0x6c, 0x75,
	0x6d, 0x65, 0x52, 0x09, 0x71, 0x6f, 0x73, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x12, 0x3b, 0x0a,
	0x0b, 0x75, 0x70, 0x64, 0x61, 0x74, 0x65, 0x5f, 0x6d, 0x61, 0x73, 0x6b, 0x18, 0x02, 0x20, 0x01,
	0x28, 0x0b, 0x32, 0x1a, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x62, 0x75, 0x66, 0x2e, 0x46, 0x69, 0x65, 0x6c, 0x64, 0x4d, 0x61, 0x73, 0x6b, 0x52, 0x0a,
	0x75, 0x70, 0x64, 0x61, 0x74, 0x65, 0x4d, 0x61, 0x73, 0x6b, 0x12, 0x23, 0x0a, 0x0d, 0x61, 0x6c,
	0x6c, 0x6f, 0x77, 0x5f, 0x6d, 0x69, 0x73, 0x73, 0x69, 0x6e, 0x67, 0x18, 0x03, 0x20, 0x01, 0x28,
	0x08, 0x52, 0x0c, 0x61, 0x6c, 0x6c, 0x6f, 0x77, 0x4d, 0x69, 0x73, 0x73, 0x69, 0x6e, 0x67, 0x22,
	0x91, 0x01, 0x0a, 0x15, 0x4c, 0x69, 0x73, 0x74, 0x51, 0x6f, 0x73, 0x56, 0x6f, 0x6c, 0x75, 0x6d,
	0x65, 0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x3c, 0x0a, 0x06, 0x70, 0x61, 0x72,
	0x65, 0x6e, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x24, 0xe0, 0x41, 0x02, 0xfa, 0x41,
	0x1e, 0x0a, 0x1c, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x73, 0x74, 0x6f, 0x72, 0x61,
	0x67, 0x65, 0x2e, 0x76, 0x31, 0x2f, 0x51, 0x6f, 0x73, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x52,
	0x06, 0x70, 0x61, 0x72, 0x65, 0x6e, 0x74, 0x12, 0x1b, 0x0a, 0x09, 0x70, 0x61, 0x67, 0x65, 0x5f,
	0x73, 0x69, 0x7a, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x05, 0x52, 0x08, 0x70, 0x61, 0x67, 0x65,
	0x53, 0x69, 0x7a, 0x65, 0x12, 0x1d, 0x0a, 0x0a, 0x70, 0x61, 0x67, 0x65, 0x5f, 0x74, 0x6f, 0x6b,
	0x65, 0x6e, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x09, 0x70, 0x61, 0x67, 0x65, 0x54, 0x6f,
	0x6b, 0x65, 0x6e, 0x22, 0x80, 0x01, 0x0a, 0x16, 0x4c, 0x69, 0x73, 0x74, 0x51, 0x6f, 0x73, 0x56,
	0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x3e,
	0x0a, 0x0b, 0x71, 0x6f, 0x73, 0x5f, 0x76, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x73, 0x18, 0x01, 0x20,
	0x03, 0x28, 0x0b, 0x32, 0x1d, 0x2e, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x73, 0x74,
	0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x51, 0x6f, 0x73, 0x56, 0x6f, 0x6c, 0x75,
	0x6d, 0x65, 0x52, 0x0a, 0x71, 0x6f, 0x73, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x73, 0x12, 0x26,
	0x0a, 0x0f, 0x6e, 0x65, 0x78, 0x74, 0x5f, 0x70, 0x61, 0x67, 0x65, 0x5f, 0x74, 0x6f, 0x6b, 0x65,
	0x6e, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0d, 0x6e, 0x65, 0x78, 0x74, 0x50, 0x61, 0x67,
	0x65, 0x54, 0x6f, 0x6b, 0x65, 0x6e, 0x22, 0x4f, 0x0a, 0x13, 0x47, 0x65, 0x74, 0x51, 0x6f, 0x73,
	0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x38, 0x0a,
	0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x24, 0xe0, 0x41, 0x02,
	0xfa, 0x41, 0x1e, 0x0a, 0x1c, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x73, 0x74, 0x6f,
	0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x2f, 0x51, 0x6f, 0x73, 0x56, 0x6f, 0x6c, 0x75, 0x6d,
	0x65, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x22, 0x51, 0x0a, 0x15, 0x53, 0x74, 0x61, 0x74, 0x73,
	0x51, 0x6f, 0x73, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74,
	0x12, 0x38, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x24,
	0xe0, 0x41, 0x02, 0xfa, 0x41, 0x1e, 0x0a, 0x1c, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e,
	0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x2f, 0x51, 0x6f, 0x73, 0x56, 0x6f,
	0x6c, 0x75, 0x6d, 0x65, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x22, 0x4f, 0x0a, 0x16, 0x53, 0x74,
	0x61, 0x74, 0x73, 0x51, 0x6f, 0x73, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x52, 0x65, 0x73, 0x70,
	0x6f, 0x6e, 0x73, 0x65, 0x12, 0x35, 0x0a, 0x05, 0x73, 0x74, 0x61, 0x74, 0x73, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x0b, 0x32, 0x1f, 0x2e, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x73, 0x74,
	0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x53,
	0x74, 0x61, 0x74, 0x73, 0x52, 0x05, 0x73, 0x74, 0x61, 0x74, 0x73, 0x32, 0x8c, 0x07, 0x0a, 0x19,
	0x4d, 0x69, 0x64, 0x64, 0x6c, 0x65, 0x65, 0x6e, 0x64, 0x51, 0x6f, 0x73, 0x56, 0x6f, 0x6c, 0x75,
	0x6d, 0x65, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x12, 0x98, 0x01, 0x0a, 0x0f, 0x43, 0x72,
	0x65, 0x61, 0x74, 0x65, 0x51, 0x6f, 0x73, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x12, 0x2a, 0x2e,
	0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e,
	0x76, 0x31, 0x2e, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x51, 0x6f, 0x73, 0x56, 0x6f, 0x6c, 0x75,
	0x6d, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x1d, 0x2e, 0x6f, 0x70, 0x69, 0x5f,
	0x61, 0x70, 0x69, 0x2e, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x51,
	0x6f, 0x73, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x22, 0x3a, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x19,
	0x22, 0x0b, 0x2f, 0x76, 0x31, 0x2f, 0x76, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x73, 0x3a, 0x0a, 0x71,
	0x6f, 0x73, 0x5f, 0x76, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0xda, 0x41, 0x18, 0x71, 0x6f, 0x73, 0x5f,
	0x76, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x2c, 0x71, 0x6f, 0x73, 0x5f, 0x76, 0x6f, 0x6c, 0x75, 0x6d,
	0x65, 0x5f, 0x69, 0x64, 0x12, 0x7d, 0x0a, 0x0f, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x51, 0x6f,
	0x73, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x12, 0x2a, 0x2e, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70,
	0x69, 0x2e, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x44, 0x65, 0x6c,
	0x65, 0x74, 0x65, 0x51, 0x6f, 0x73, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x52, 0x65, 0x71, 0x75,
	0x65, 0x73, 0x74, 0x1a, 0x16, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x22, 0x26, 0x82, 0xd3, 0xe4,
	0x93, 0x02, 0x19, 0x2a, 0x17, 0x2f, 0x76, 0x31, 0x2f, 0x7b, 0x6e, 0x61, 0x6d, 0x65, 0x3d, 0x51,
	0x6f, 0x73, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x73, 0x2f, 0x2a, 0x7d, 0xda, 0x41, 0x04, 0x6e,
	0x61, 0x6d, 0x65, 0x12, 0xab, 0x01, 0x0a, 0x0f, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x51, 0x6f,
	0x73, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x12, 0x2a, 0x2e, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70,
	0x69, 0x2e, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x55, 0x70, 0x64,
	0x61, 0x74, 0x65, 0x51, 0x6f, 0x73, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x52, 0x65, 0x71, 0x75,
	0x65, 0x73, 0x74, 0x1a, 0x1d, 0x2e, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x73, 0x74,
	0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x51, 0x6f, 0x73, 0x56, 0x6f, 0x6c, 0x75,
	0x6d, 0x65, 0x22, 0x4d, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x2e, 0x32, 0x20, 0x2f, 0x76, 0x31, 0x2f,
	0x7b, 0x71, 0x6f, 0x73, 0x5f, 0x76, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x2e, 0x6e, 0x61, 0x6d, 0x65,
	0x3d, 0x73, 0x75, 0x62, 0x73, 0x79, 0x73, 0x74, 0x65, 0x6d, 0x73, 0x7d, 0x3a, 0x0a, 0x71, 0x6f,
	0x73, 0x5f, 0x76, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0xda, 0x41, 0x16, 0x71, 0x6f, 0x73, 0x5f, 0x76,
	0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x2c, 0x75, 0x70, 0x64, 0x61, 0x74, 0x65, 0x5f, 0x6d, 0x61, 0x73,
	0x6b, 0x12, 0x8e, 0x01, 0x0a, 0x0e, 0x4c, 0x69, 0x73, 0x74, 0x51, 0x6f, 0x73, 0x56, 0x6f, 0x6c,
	0x75, 0x6d, 0x65, 0x73, 0x12, 0x29, 0x2e, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x73,
	0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x51, 0x6f,
	0x73, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a,
	0x2a, 0x2e, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67,
	0x65, 0x2e, 0x76, 0x31, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x51, 0x6f, 0x73, 0x56, 0x6f, 0x6c, 0x75,
	0x6d, 0x65, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x25, 0x82, 0xd3, 0xe4,
	0x93, 0x02, 0x16, 0x12, 0x14, 0x2f, 0x76, 0x31, 0x2f, 0x7b, 0x70, 0x61, 0x72, 0x65, 0x6e, 0x74,
	0x3d, 0x76, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x73, 0x7d, 0xda, 0x41, 0x06, 0x70, 0x61, 0x72, 0x65,
	0x6e, 0x74, 0x12, 0x7e, 0x0a, 0x0c, 0x47, 0x65, 0x74, 0x51, 0x6f, 0x73, 0x56, 0x6f, 0x6c, 0x75,
	0x6d, 0x65, 0x12, 0x27, 0x2e, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x73, 0x74, 0x6f,
	0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x47, 0x65, 0x74, 0x51, 0x6f, 0x73, 0x56, 0x6f,
	0x6c, 0x75, 0x6d, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x1d, 0x2e, 0x6f, 0x70,
	0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31,
	0x2e, 0x51, 0x6f, 0x73, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x22, 0x26, 0x82, 0xd3, 0xe4, 0x93,
	0x02, 0x19, 0x12, 0x17, 0x2f, 0x76, 0x31, 0x2f, 0x7b, 0x6e, 0x61, 0x6d, 0x65, 0x3d, 0x51, 0x6f,
	0x73, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x73, 0x2f, 0x2a, 0x7d, 0xda, 0x41, 0x04, 0x6e, 0x61,
	0x6d, 0x65, 0x12, 0x95, 0x01, 0x0a, 0x0e, 0x53, 0x74, 0x61, 0x74, 0x73, 0x51, 0x6f, 0x73, 0x56,
	0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x12, 0x29, 0x2e, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e,
	0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x53, 0x74, 0x61, 0x74, 0x73,
	0x51, 0x6f, 0x73, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74,
	0x1a, 0x2a, 0x2e, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x73, 0x74, 0x6f, 0x72, 0x61,
	0x67, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x53, 0x74, 0x61, 0x74, 0x73, 0x51, 0x6f, 0x73, 0x56, 0x6f,
	0x6c, 0x75, 0x6d, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x2c, 0x82, 0xd3,
	0xe4, 0x93, 0x02, 0x1f, 0x12, 0x1d, 0x2f, 0x76, 0x31, 0x2f, 0x7b, 0x6e, 0x61, 0x6d, 0x65, 0x3d,
	0x51, 0x6f, 0x73, 0x56, 0x6f, 0x6c, 0x75, 0x6d, 0x65, 0x73, 0x2f, 0x2a, 0x7d, 0x3a, 0x73, 0x74,
	0x61, 0x74, 0x73, 0xda, 0x41, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x42, 0x66, 0x0a, 0x12, 0x6f, 0x70,
	0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x73, 0x74, 0x6f, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x76, 0x31,
	0x42, 0x17, 0x4d, 0x69, 0x64, 0x64, 0x6c, 0x65, 0x65, 0x6e, 0x64, 0x51, 0x6f, 0x73, 0x56, 0x6f,
	0x6c, 0x75, 0x6d, 0x65, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x35, 0x67, 0x69, 0x74,
	0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x6f, 0x70, 0x69, 0x70, 0x72, 0x6f, 0x6a, 0x65,
	0x63, 0x74, 0x2f, 0x6f, 0x70, 0x69, 0x2d, 0x61, 0x70, 0x69, 0x2f, 0x73, 0x74, 0x6f, 0x72, 0x61,
	0x67, 0x65, 0x2f, 0x76, 0x31, 0x61, 0x6c, 0x70, 0x68, 0x61, 0x31, 0x2f, 0x67, 0x65, 0x6e, 0x2f,
	0x67, 0x6f, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_middleend_qos_volume_proto_rawDescOnce sync.Once
	file_middleend_qos_volume_proto_rawDescData = file_middleend_qos_volume_proto_rawDesc
)

func file_middleend_qos_volume_proto_rawDescGZIP() []byte {
	file_middleend_qos_volume_proto_rawDescOnce.Do(func() {
		file_middleend_qos_volume_proto_rawDescData = protoimpl.X.CompressGZIP(file_middleend_qos_volume_proto_rawDescData)
	})
	return file_middleend_qos_volume_proto_rawDescData
}

var file_middleend_qos_volume_proto_msgTypes = make([]protoimpl.MessageInfo, 9)
var file_middleend_qos_volume_proto_goTypes = []interface{}{
	(*QosVolume)(nil),              // 0: opi_api.storage.v1.QosVolume
	(*CreateQosVolumeRequest)(nil), // 1: opi_api.storage.v1.CreateQosVolumeRequest
	(*DeleteQosVolumeRequest)(nil), // 2: opi_api.storage.v1.DeleteQosVolumeRequest
	(*UpdateQosVolumeRequest)(nil), // 3: opi_api.storage.v1.UpdateQosVolumeRequest
	(*ListQosVolumesRequest)(nil),  // 4: opi_api.storage.v1.ListQosVolumesRequest
	(*ListQosVolumesResponse)(nil), // 5: opi_api.storage.v1.ListQosVolumesResponse
	(*GetQosVolumeRequest)(nil),    // 6: opi_api.storage.v1.GetQosVolumeRequest
	(*StatsQosVolumeRequest)(nil),  // 7: opi_api.storage.v1.StatsQosVolumeRequest
	(*StatsQosVolumeResponse)(nil), // 8: opi_api.storage.v1.StatsQosVolumeResponse
	(*QosLimit)(nil),               // 9: opi_api.storage.v1.QosLimit
	(*fieldmaskpb.FieldMask)(nil),  // 10: google.protobuf.FieldMask
	(*VolumeStats)(nil),            // 11: opi_api.storage.v1.VolumeStats
	(*emptypb.Empty)(nil),          // 12: google.protobuf.Empty
}
var file_middleend_qos_volume_proto_depIdxs = []int32{
	9,  // 0: opi_api.storage.v1.QosVolume.min_limit:type_name -> opi_api.storage.v1.QosLimit
	9,  // 1: opi_api.storage.v1.QosVolume.max_limit:type_name -> opi_api.storage.v1.QosLimit
	0,  // 2: opi_api.storage.v1.CreateQosVolumeRequest.qos_volume:type_name -> opi_api.storage.v1.QosVolume
	0,  // 3: opi_api.storage.v1.UpdateQosVolumeRequest.qos_volume:type_name -> opi_api.storage.v1.QosVolume
	10, // 4: opi_api.storage.v1.UpdateQosVolumeRequest.update_mask:type_name -> google.protobuf.FieldMask
	0,  // 5: opi_api.storage.v1.ListQosVolumesResponse.qos_volumes:type_name -> opi_api.storage.v1.QosVolume
	11, // 6: opi_api.storage.v1.StatsQosVolumeResponse.stats:type_name -> opi_api.storage.v1.VolumeStats
	1,  // 7: opi_api.storage.v1.MiddleendQosVolumeService.CreateQosVolume:input_type -> opi_api.storage.v1.CreateQosVolumeRequest
	2,  // 8: opi_api.storage.v1.MiddleendQosVolumeService.DeleteQosVolume:input_type -> opi_api.storage.v1.DeleteQosVolumeRequest
	3,  // 9: opi_api.storage.v1.MiddleendQosVolumeService.UpdateQosVolume:input_type -> opi_api.storage.v1.UpdateQosVolumeRequest
	4,  // 10: opi_api.storage.v1.MiddleendQosVolumeService.ListQosVolumes:input_type -> opi_api.storage.v1.ListQosVolumesRequest
	6,  // 11: opi_api.storage.v1.MiddleendQosVolumeService.GetQosVolume:input_type -> opi_api.storage.v1.GetQosVolumeRequest
	7,  // 12: opi_api.storage.v1.MiddleendQosVolumeService.StatsQosVolume:input_type -> opi_api.storage.v1.StatsQosVolumeRequest
	0,  // 13: opi_api.storage.v1.MiddleendQosVolumeService.CreateQosVolume:output_type -> opi_api.storage.v1.QosVolume
	12, // 14: opi_api.storage.v1.MiddleendQosVolumeService.DeleteQosVolume:output_type -> google.protobuf.Empty
	0,  // 15: opi_api.storage.v1.MiddleendQosVolumeService.UpdateQosVolume:output_type -> opi_api.storage.v1.QosVolume
	5,  // 16: opi_api.storage.v1.MiddleendQosVolumeService.ListQosVolumes:output_type -> opi_api.storage.v1.ListQosVolumesResponse
	0,  // 17: opi_api.storage.v1.MiddleendQosVolumeService.GetQosVolume:output_type -> opi_api.storage.v1.QosVolume
	8,  // 18: opi_api.storage.v1.MiddleendQosVolumeService.StatsQosVolume:output_type -> opi_api.storage.v1.StatsQosVolumeResponse
	13, // [13:19] is the sub-list for method output_type
	7,  // [7:13] is the sub-list for method input_type
	7,  // [7:7] is the sub-list for extension type_name
	7,  // [7:7] is the sub-list for extension extendee
	0,  // [0:7] is the sub-list for field type_name
}

func init() { file_middleend_qos_volume_proto_init() }
func file_middleend_qos_volume_proto_init() {
	if File_middleend_qos_volume_proto != nil {
		return
	}
	file_opicommon_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_middleend_qos_volume_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*QosVolume); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_middleend_qos_volume_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CreateQosVolumeRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_middleend_qos_volume_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DeleteQosVolumeRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_middleend_qos_volume_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UpdateQosVolumeRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_middleend_qos_volume_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ListQosVolumesRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_middleend_qos_volume_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ListQosVolumesResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_middleend_qos_volume_proto_msgTypes[6].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GetQosVolumeRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_middleend_qos_volume_proto_msgTypes[7].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*StatsQosVolumeRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_middleend_qos_volume_proto_msgTypes[8].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*StatsQosVolumeResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_middleend_qos_volume_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   9,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_middleend_qos_volume_proto_goTypes,
		DependencyIndexes: file_middleend_qos_volume_proto_depIdxs,
		MessageInfos:      file_middleend_qos_volume_proto_msgTypes,
	}.Build()
	File_middleend_qos_volume_proto = out.File
	file_middleend_qos_volume_proto_rawDesc = nil
	file_middleend_qos_volume_proto_goTypes = nil
	file_middleend_qos_volume_proto_depIdxs = nil
}
