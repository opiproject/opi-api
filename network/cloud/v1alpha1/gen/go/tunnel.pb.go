// Copyright (c) 2023 Pensando, AMD Inc, or its subsidiaries.
// protobuf specification for Tunnel EndPoint (TEP) object

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.0
// 	protoc        v3.19.4
// source: tunnel.proto

package _go

import (
	_go "github.com/opiproject/opi-api/common/v1/gen/go"
	_go1 "github.com/opiproject/opi-api/network/opinetcommon/v1alpha1/gen/go"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

// TunnelType defines the role of the tunnel
type TunnelType int32

const (
	// unspecified
	TunnelType_TUNNEL_TYPE_UNSPECIFIED TunnelType = 0
	// tunnel type for Internet Gateway
	TunnelType_TUNNEL_TYPE_IGW TunnelType = 1
	// tunnel type for east-traffic workloads with in a data center
	TunnelType_TUNNEL_TYPE_WORKLOAD TunnelType = 2
	// tunnel type for inter data center traffic
	TunnelType_TUNNEL_TYPE_INTER_DC TunnelType = 3
	// tunnel type for provider services
	TunnelType_TUNNEL_TYPE_SERVICE TunnelType = 4
	// tunnel pointing to an intermediate Virtual Network Function (VNF) devices
	TunnelType_TUNNEL_TYPE_VNF TunnelType = 5
	// tunnel type ipsec
	TunnelType_TUNNEL_TYPE_IPSEC TunnelType = 6
)

// Enum value maps for TunnelType.
var (
	TunnelType_name = map[int32]string{
		0: "TUNNEL_TYPE_UNSPECIFIED",
		1: "TUNNEL_TYPE_IGW",
		2: "TUNNEL_TYPE_WORKLOAD",
		3: "TUNNEL_TYPE_INTER_DC",
		4: "TUNNEL_TYPE_SERVICE",
		5: "TUNNEL_TYPE_VNF",
		6: "TUNNEL_TYPE_IPSEC",
	}
	TunnelType_value = map[string]int32{
		"TUNNEL_TYPE_UNSPECIFIED": 0,
		"TUNNEL_TYPE_IGW":         1,
		"TUNNEL_TYPE_WORKLOAD":    2,
		"TUNNEL_TYPE_INTER_DC":    3,
		"TUNNEL_TYPE_SERVICE":     4,
		"TUNNEL_TYPE_VNF":         5,
		"TUNNEL_TYPE_IPSEC":       6,
	}
)

func (x TunnelType) Enum() *TunnelType {
	p := new(TunnelType)
	*p = x
	return p
}

func (x TunnelType) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (TunnelType) Descriptor() protoreflect.EnumDescriptor {
	return file_tunnel_proto_enumTypes[0].Descriptor()
}

func (TunnelType) Type() protoreflect.EnumType {
	return &file_tunnel_proto_enumTypes[0]
}

func (x TunnelType) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use TunnelType.Descriptor instead.
func (TunnelType) EnumDescriptor() ([]byte, []int) {
	return file_tunnel_proto_rawDescGZIP(), []int{0}
}

// tunnel object
type Tunnel struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// configuration
	Spec *TunnelSpec `protobuf:"bytes,3,opt,name=spec,proto3" json:"spec,omitempty"`
	// operational status
	Status *TunnelStatus `protobuf:"bytes,4,opt,name=status,proto3" json:"status,omitempty"`
}

func (x *Tunnel) Reset() {
	*x = Tunnel{}
	if protoimpl.UnsafeEnabled {
		mi := &file_tunnel_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Tunnel) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Tunnel) ProtoMessage() {}

func (x *Tunnel) ProtoReflect() protoreflect.Message {
	mi := &file_tunnel_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Tunnel.ProtoReflect.Descriptor instead.
func (*Tunnel) Descriptor() ([]byte, []int) {
	return file_tunnel_proto_rawDescGZIP(), []int{0}
}

func (x *Tunnel) GetSpec() *TunnelSpec {
	if x != nil {
		return x.Spec
	}
	return nil
}

func (x *Tunnel) GetStatus() *TunnelStatus {
	if x != nil {
		return x.Status
	}
	return nil
}

// tunnel configuration - identified by 3-tuple (LocalIP, RemoteIP, encap)
// If multiple tunnels with same RemoteIP address are created, they should
// have same Type attribute value i.e., different tunnels with same IP can't
// have different tunnel type
type TunnelSpec struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// unique tunnel identifier
	Id *_go.ObjectKey `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	// virtual private cloud this is tunnel belongs to
	VpcId *_go.ObjectKey `protobuf:"bytes,2,opt,name=vpc_id,json=vpcId,proto3" json:"vpc_id,omitempty"`
	// local IP of the tunnel (used as outer SIP in tunneled packets)
	LocalIp *_go1.IPAddress `protobuf:"bytes,3,opt,name=local_ip,json=localIp,proto3" json:"local_ip,omitempty"`
	// remote IP of the tunnel (used as outer DIP in tunneled packets)
	RemoteIp *_go1.IPAddress `protobuf:"bytes,4,opt,name=remote_ip,json=remoteIp,proto3" json:"remote_ip,omitempty"`
	// type of the tunnel
	Type TunnelType `protobuf:"varint,5,opt,name=type,proto3,enum=opi_api.network.cloud.v1alpha1.TunnelType" json:"type,omitempty"`
	// encap used while sending traffic to this tunnel
	Encap *_go1.Encap `protobuf:"bytes,6,opt,name=encap,proto3" json:"encap,omitempty"`
	// Tunnel points to a underlay nexthop, nexthop-group(ECMP), or another Tunnel
	//
	// Types that are assignable to Nh:
	//	*TunnelSpec_NexthopId
	//	*TunnelSpec_NexthopGroupId
	//	*TunnelSpec_TunnelId
	//	*TunnelSpec_DropNextHop
	Nh isTunnelSpec_Nh `protobuf_oneof:"nh"`
	// MAC address of the remote IP (i.e., remote side of the tunnel)
	// set to zero if dataplane is expected to resolve this
	MacAddress []byte `protobuf:"bytes,12,opt,name=mac_address,json=macAddress,proto3" json:"mac_address,omitempty"`
	// when ToS is configured on a tunnel object, all traffic destined to the
	// tunnel will carry dscp value as configured.
	// ToS field is 1 byte value that is populated in the DSCP field of IPv4 outer
	// header or in the Traffic Class field of IPv6 outer header, this value, if
	// non-zero, will be used as-is (i.e., not interpreted) during encap time by
	// the dataplane.
	// The ToS value configured on the tunnel will override ToS configuration
	// in vpc and subnet objects
	Tos int32 `protobuf:"varint,13,opt,name=tos,proto3" json:"tos,omitempty"`
}

func (x *TunnelSpec) Reset() {
	*x = TunnelSpec{}
	if protoimpl.UnsafeEnabled {
		mi := &file_tunnel_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *TunnelSpec) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*TunnelSpec) ProtoMessage() {}

func (x *TunnelSpec) ProtoReflect() protoreflect.Message {
	mi := &file_tunnel_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use TunnelSpec.ProtoReflect.Descriptor instead.
func (*TunnelSpec) Descriptor() ([]byte, []int) {
	return file_tunnel_proto_rawDescGZIP(), []int{1}
}

func (x *TunnelSpec) GetId() *_go.ObjectKey {
	if x != nil {
		return x.Id
	}
	return nil
}

func (x *TunnelSpec) GetVpcId() *_go.ObjectKey {
	if x != nil {
		return x.VpcId
	}
	return nil
}

func (x *TunnelSpec) GetLocalIp() *_go1.IPAddress {
	if x != nil {
		return x.LocalIp
	}
	return nil
}

func (x *TunnelSpec) GetRemoteIp() *_go1.IPAddress {
	if x != nil {
		return x.RemoteIp
	}
	return nil
}

func (x *TunnelSpec) GetType() TunnelType {
	if x != nil {
		return x.Type
	}
	return TunnelType_TUNNEL_TYPE_UNSPECIFIED
}

func (x *TunnelSpec) GetEncap() *_go1.Encap {
	if x != nil {
		return x.Encap
	}
	return nil
}

func (m *TunnelSpec) GetNh() isTunnelSpec_Nh {
	if m != nil {
		return m.Nh
	}
	return nil
}

func (x *TunnelSpec) GetNexthopId() *_go.ObjectKey {
	if x, ok := x.GetNh().(*TunnelSpec_NexthopId); ok {
		return x.NexthopId
	}
	return nil
}

func (x *TunnelSpec) GetNexthopGroupId() *_go.ObjectKey {
	if x, ok := x.GetNh().(*TunnelSpec_NexthopGroupId); ok {
		return x.NexthopGroupId
	}
	return nil
}

func (x *TunnelSpec) GetTunnelId() *_go.ObjectKey {
	if x, ok := x.GetNh().(*TunnelSpec_TunnelId); ok {
		return x.TunnelId
	}
	return nil
}

func (x *TunnelSpec) GetDropNextHop() *DropNexthop {
	if x, ok := x.GetNh().(*TunnelSpec_DropNextHop); ok {
		return x.DropNextHop
	}
	return nil
}

func (x *TunnelSpec) GetMacAddress() []byte {
	if x != nil {
		return x.MacAddress
	}
	return nil
}

func (x *TunnelSpec) GetTos() int32 {
	if x != nil {
		return x.Tos
	}
	return 0
}

type isTunnelSpec_Nh interface {
	isTunnelSpec_Nh()
}

type TunnelSpec_NexthopId struct {
	// underlay nexthop for this tunnel
	NexthopId *_go.ObjectKey `protobuf:"bytes,8,opt,name=nexthop_id,json=nexthopId,proto3,oneof"`
}

type TunnelSpec_NexthopGroupId struct {
	// underlay nexthop group for this tunnel
	NexthopGroupId *_go.ObjectKey `protobuf:"bytes,9,opt,name=nexthop_group_id,json=nexthopGroupId,proto3,oneof"`
}

type TunnelSpec_TunnelId struct {
	// a tunnel can point to another tunnel for double encap
	// - supported combinations of double encap is platform specific
	// - unsupported combination of cascading tunnels would result in configuration failure
	// -  when tunnel points to another IPSEC tunnel, it is similar to IPSEC tunnel mode
	TunnelId *_go.ObjectKey `protobuf:"bytes,10,opt,name=tunnel_id,json=tunnelId,proto3,oneof"`
}

type TunnelSpec_DropNextHop struct {
	// DropNexthop is used to explicitly drop traffic destined to this tunnel
	// even when there is reachability, this is administrative override
	DropNextHop *DropNexthop `protobuf:"bytes,11,opt,name=drop_next_hop,json=dropNextHop,proto3,oneof"`
}

func (*TunnelSpec_NexthopId) isTunnelSpec_Nh() {}

func (*TunnelSpec_NexthopGroupId) isTunnelSpec_Nh() {}

func (*TunnelSpec_TunnelId) isTunnelSpec_Nh() {}

func (*TunnelSpec_DropNextHop) isTunnelSpec_Nh() {}

// DropNexthop is used to blackhole the traffic
type DropNexthop struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields
}

func (x *DropNexthop) Reset() {
	*x = DropNexthop{}
	if protoimpl.UnsafeEnabled {
		mi := &file_tunnel_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DropNexthop) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DropNexthop) ProtoMessage() {}

func (x *DropNexthop) ProtoReflect() protoreflect.Message {
	mi := &file_tunnel_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DropNexthop.ProtoReflect.Descriptor instead.
func (*DropNexthop) Descriptor() ([]byte, []int) {
	return file_tunnel_proto_rawDescGZIP(), []int{2}
}

// operational status of the tunnel, if any
type TunnelStatus struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// tunnel_hw_handle
	HwHandle *_go1.HwHandle `protobuf:"bytes,1,opt,name=hw_handle,json=hwHandle,proto3" json:"hw_handle,omitempty"`
	// no. of vnics behind the tunnel
	VnicCount int32 `protobuf:"varint,2,opt,name=vnic_count,json=vnicCount,proto3" json:"vnic_count,omitempty"`
}

func (x *TunnelStatus) Reset() {
	*x = TunnelStatus{}
	if protoimpl.UnsafeEnabled {
		mi := &file_tunnel_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *TunnelStatus) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*TunnelStatus) ProtoMessage() {}

func (x *TunnelStatus) ProtoReflect() protoreflect.Message {
	mi := &file_tunnel_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use TunnelStatus.ProtoReflect.Descriptor instead.
func (*TunnelStatus) Descriptor() ([]byte, []int) {
	return file_tunnel_proto_rawDescGZIP(), []int{3}
}

func (x *TunnelStatus) GetHwHandle() *_go1.HwHandle {
	if x != nil {
		return x.HwHandle
	}
	return nil
}

func (x *TunnelStatus) GetVnicCount() int32 {
	if x != nil {
		return x.VnicCount
	}
	return 0
}

var File_tunnel_proto protoreflect.FileDescriptor

var file_tunnel_proto_rawDesc = []byte{
	0x0a, 0x0c, 0x74, 0x75, 0x6e, 0x6e, 0x65, 0x6c, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x1e,
	0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x2e,
	0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x76, 0x31, 0x61, 0x6c, 0x70, 0x68, 0x61, 0x31, 0x1a, 0x10,
	0x6f, 0x62, 0x6a, 0x65, 0x63, 0x74, 0x5f, 0x6b, 0x65, 0x79, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x1a, 0x12, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x22, 0x8e, 0x01, 0x0a, 0x06, 0x54, 0x75, 0x6e, 0x6e, 0x65, 0x6c, 0x12,
	0x3e, 0x0a, 0x04, 0x73, 0x70, 0x65, 0x63, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x2a, 0x2e,
	0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x2e,
	0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x76, 0x31, 0x61, 0x6c, 0x70, 0x68, 0x61, 0x31, 0x2e, 0x54,
	0x75, 0x6e, 0x6e, 0x65, 0x6c, 0x53, 0x70, 0x65, 0x63, 0x52, 0x04, 0x73, 0x70, 0x65, 0x63, 0x12,
	0x44, 0x0a, 0x06, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x18, 0x04, 0x20, 0x01, 0x28, 0x0b, 0x32,
	0x2c, 0x2e, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72,
	0x6b, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x76, 0x31, 0x61, 0x6c, 0x70, 0x68, 0x61, 0x31,
	0x2e, 0x54, 0x75, 0x6e, 0x6e, 0x65, 0x6c, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x52, 0x06, 0x73,
	0x74, 0x61, 0x74, 0x75, 0x73, 0x22, 0xe1, 0x05, 0x0a, 0x0a, 0x54, 0x75, 0x6e, 0x6e, 0x65, 0x6c,
	0x53, 0x70, 0x65, 0x63, 0x12, 0x2c, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x1c, 0x2e, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f,
	0x6e, 0x2e, 0x76, 0x31, 0x2e, 0x4f, 0x62, 0x6a, 0x65, 0x63, 0x74, 0x4b, 0x65, 0x79, 0x52, 0x02,
	0x69, 0x64, 0x12, 0x33, 0x0a, 0x06, 0x76, 0x70, 0x63, 0x5f, 0x69, 0x64, 0x18, 0x02, 0x20, 0x01,
	0x28, 0x0b, 0x32, 0x1c, 0x2e, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x63, 0x6f, 0x6d,
	0x6d, 0x6f, 0x6e, 0x2e, 0x76, 0x31, 0x2e, 0x4f, 0x62, 0x6a, 0x65, 0x63, 0x74, 0x4b, 0x65, 0x79,
	0x52, 0x05, 0x76, 0x70, 0x63, 0x49, 0x64, 0x12, 0x4b, 0x0a, 0x08, 0x6c, 0x6f, 0x63, 0x61, 0x6c,
	0x5f, 0x69, 0x70, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x30, 0x2e, 0x6f, 0x70, 0x69, 0x5f,
	0x61, 0x70, 0x69, 0x2e, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x2e, 0x6f, 0x70, 0x69, 0x6e,
	0x65, 0x74, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x76, 0x31, 0x61, 0x6c, 0x70, 0x68, 0x61,
	0x31, 0x2e, 0x49, 0x50, 0x41, 0x64, 0x64, 0x72, 0x65, 0x73, 0x73, 0x52, 0x07, 0x6c, 0x6f, 0x63,
	0x61, 0x6c, 0x49, 0x70, 0x12, 0x4d, 0x0a, 0x09, 0x72, 0x65, 0x6d, 0x6f, 0x74, 0x65, 0x5f, 0x69,
	0x70, 0x18, 0x04, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x30, 0x2e, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70,
	0x69, 0x2e, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x2e, 0x6f, 0x70, 0x69, 0x6e, 0x65, 0x74,
	0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x76, 0x31, 0x61, 0x6c, 0x70, 0x68, 0x61, 0x31, 0x2e,
	0x49, 0x50, 0x41, 0x64, 0x64, 0x72, 0x65, 0x73, 0x73, 0x52, 0x08, 0x72, 0x65, 0x6d, 0x6f, 0x74,
	0x65, 0x49, 0x70, 0x12, 0x3e, 0x0a, 0x04, 0x74, 0x79, 0x70, 0x65, 0x18, 0x05, 0x20, 0x01, 0x28,
	0x0e, 0x32, 0x2a, 0x2e, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x6e, 0x65, 0x74, 0x77,
	0x6f, 0x72, 0x6b, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x76, 0x31, 0x61, 0x6c, 0x70, 0x68,
	0x61, 0x31, 0x2e, 0x54, 0x75, 0x6e, 0x6e, 0x65, 0x6c, 0x54, 0x79, 0x70, 0x65, 0x52, 0x04, 0x74,
	0x79, 0x70, 0x65, 0x12, 0x42, 0x0a, 0x05, 0x65, 0x6e, 0x63, 0x61, 0x70, 0x18, 0x06, 0x20, 0x01,
	0x28, 0x0b, 0x32, 0x2c, 0x2e, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x6e, 0x65, 0x74,
	0x77, 0x6f, 0x72, 0x6b, 0x2e, 0x6f, 0x70, 0x69, 0x6e, 0x65, 0x74, 0x63, 0x6f, 0x6d, 0x6d, 0x6f,
	0x6e, 0x2e, 0x76, 0x31, 0x61, 0x6c, 0x70, 0x68, 0x61, 0x31, 0x2e, 0x45, 0x6e, 0x63, 0x61, 0x70,
	0x52, 0x05, 0x65, 0x6e, 0x63, 0x61, 0x70, 0x12, 0x3d, 0x0a, 0x0a, 0x6e, 0x65, 0x78, 0x74, 0x68,
	0x6f, 0x70, 0x5f, 0x69, 0x64, 0x18, 0x08, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1c, 0x2e, 0x6f, 0x70,
	0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x76, 0x31, 0x2e,
	0x4f, 0x62, 0x6a, 0x65, 0x63, 0x74, 0x4b, 0x65, 0x79, 0x48, 0x00, 0x52, 0x09, 0x6e, 0x65, 0x78,
	0x74, 0x68, 0x6f, 0x70, 0x49, 0x64, 0x12, 0x48, 0x0a, 0x10, 0x6e, 0x65, 0x78, 0x74, 0x68, 0x6f,
	0x70, 0x5f, 0x67, 0x72, 0x6f, 0x75, 0x70, 0x5f, 0x69, 0x64, 0x18, 0x09, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x1c, 0x2e, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f,
	0x6e, 0x2e, 0x76, 0x31, 0x2e, 0x4f, 0x62, 0x6a, 0x65, 0x63, 0x74, 0x4b, 0x65, 0x79, 0x48, 0x00,
	0x52, 0x0e, 0x6e, 0x65, 0x78, 0x74, 0x68, 0x6f, 0x70, 0x47, 0x72, 0x6f, 0x75, 0x70, 0x49, 0x64,
	0x12, 0x3b, 0x0a, 0x09, 0x74, 0x75, 0x6e, 0x6e, 0x65, 0x6c, 0x5f, 0x69, 0x64, 0x18, 0x0a, 0x20,
	0x01, 0x28, 0x0b, 0x32, 0x1c, 0x2e, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x63, 0x6f,
	0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x76, 0x31, 0x2e, 0x4f, 0x62, 0x6a, 0x65, 0x63, 0x74, 0x4b, 0x65,
	0x79, 0x48, 0x00, 0x52, 0x08, 0x74, 0x75, 0x6e, 0x6e, 0x65, 0x6c, 0x49, 0x64, 0x12, 0x51, 0x0a,
	0x0d, 0x64, 0x72, 0x6f, 0x70, 0x5f, 0x6e, 0x65, 0x78, 0x74, 0x5f, 0x68, 0x6f, 0x70, 0x18, 0x0b,
	0x20, 0x01, 0x28, 0x0b, 0x32, 0x2b, 0x2e, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x6e,
	0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x76, 0x31, 0x61,
	0x6c, 0x70, 0x68, 0x61, 0x31, 0x2e, 0x44, 0x72, 0x6f, 0x70, 0x4e, 0x65, 0x78, 0x74, 0x68, 0x6f,
	0x70, 0x48, 0x00, 0x52, 0x0b, 0x64, 0x72, 0x6f, 0x70, 0x4e, 0x65, 0x78, 0x74, 0x48, 0x6f, 0x70,
	0x12, 0x1f, 0x0a, 0x0b, 0x6d, 0x61, 0x63, 0x5f, 0x61, 0x64, 0x64, 0x72, 0x65, 0x73, 0x73, 0x18,
	0x0c, 0x20, 0x01, 0x28, 0x0c, 0x52, 0x0a, 0x6d, 0x61, 0x63, 0x41, 0x64, 0x64, 0x72, 0x65, 0x73,
	0x73, 0x12, 0x10, 0x0a, 0x03, 0x74, 0x6f, 0x73, 0x18, 0x0d, 0x20, 0x01, 0x28, 0x05, 0x52, 0x03,
	0x74, 0x6f, 0x73, 0x42, 0x04, 0x0a, 0x02, 0x6e, 0x68, 0x22, 0x0d, 0x0a, 0x0b, 0x44, 0x72, 0x6f,
	0x70, 0x4e, 0x65, 0x78, 0x74, 0x68, 0x6f, 0x70, 0x22, 0x7b, 0x0a, 0x0c, 0x54, 0x75, 0x6e, 0x6e,
	0x65, 0x6c, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x12, 0x4c, 0x0a, 0x09, 0x68, 0x77, 0x5f, 0x68,
	0x61, 0x6e, 0x64, 0x6c, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x2f, 0x2e, 0x6f, 0x70,
	0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x2e, 0x6f, 0x70,
	0x69, 0x6e, 0x65, 0x74, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x76, 0x31, 0x61, 0x6c, 0x70,
	0x68, 0x61, 0x31, 0x2e, 0x48, 0x77, 0x48, 0x61, 0x6e, 0x64, 0x6c, 0x65, 0x52, 0x08, 0x68, 0x77,
	0x48, 0x61, 0x6e, 0x64, 0x6c, 0x65, 0x12, 0x1d, 0x0a, 0x0a, 0x76, 0x6e, 0x69, 0x63, 0x5f, 0x63,
	0x6f, 0x75, 0x6e, 0x74, 0x18, 0x02, 0x20, 0x01, 0x28, 0x05, 0x52, 0x09, 0x76, 0x6e, 0x69, 0x63,
	0x43, 0x6f, 0x75, 0x6e, 0x74, 0x2a, 0xb7, 0x01, 0x0a, 0x0a, 0x54, 0x75, 0x6e, 0x6e, 0x65, 0x6c,
	0x54, 0x79, 0x70, 0x65, 0x12, 0x1b, 0x0a, 0x17, 0x54, 0x55, 0x4e, 0x4e, 0x45, 0x4c, 0x5f, 0x54,
	0x59, 0x50, 0x45, 0x5f, 0x55, 0x4e, 0x53, 0x50, 0x45, 0x43, 0x49, 0x46, 0x49, 0x45, 0x44, 0x10,
	0x00, 0x12, 0x13, 0x0a, 0x0f, 0x54, 0x55, 0x4e, 0x4e, 0x45, 0x4c, 0x5f, 0x54, 0x59, 0x50, 0x45,
	0x5f, 0x49, 0x47, 0x57, 0x10, 0x01, 0x12, 0x18, 0x0a, 0x14, 0x54, 0x55, 0x4e, 0x4e, 0x45, 0x4c,
	0x5f, 0x54, 0x59, 0x50, 0x45, 0x5f, 0x57, 0x4f, 0x52, 0x4b, 0x4c, 0x4f, 0x41, 0x44, 0x10, 0x02,
	0x12, 0x18, 0x0a, 0x14, 0x54, 0x55, 0x4e, 0x4e, 0x45, 0x4c, 0x5f, 0x54, 0x59, 0x50, 0x45, 0x5f,
	0x49, 0x4e, 0x54, 0x45, 0x52, 0x5f, 0x44, 0x43, 0x10, 0x03, 0x12, 0x17, 0x0a, 0x13, 0x54, 0x55,
	0x4e, 0x4e, 0x45, 0x4c, 0x5f, 0x54, 0x59, 0x50, 0x45, 0x5f, 0x53, 0x45, 0x52, 0x56, 0x49, 0x43,
	0x45, 0x10, 0x04, 0x12, 0x13, 0x0a, 0x0f, 0x54, 0x55, 0x4e, 0x4e, 0x45, 0x4c, 0x5f, 0x54, 0x59,
	0x50, 0x45, 0x5f, 0x56, 0x4e, 0x46, 0x10, 0x05, 0x12, 0x15, 0x0a, 0x11, 0x54, 0x55, 0x4e, 0x4e,
	0x45, 0x4c, 0x5f, 0x54, 0x59, 0x50, 0x45, 0x5f, 0x49, 0x50, 0x53, 0x45, 0x43, 0x10, 0x06, 0x42,
	0x6c, 0x0a, 0x1e, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x6e, 0x65, 0x74, 0x77, 0x6f,
	0x72, 0x6b, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x76, 0x31, 0x61, 0x6c, 0x70, 0x68, 0x61,
	0x31, 0x42, 0x0b, 0x54, 0x75, 0x6e, 0x6e, 0x65, 0x6c, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01,
	0x5a, 0x3b, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x6f, 0x70, 0x69,
	0x70, 0x72, 0x6f, 0x6a, 0x65, 0x63, 0x74, 0x2f, 0x6f, 0x70, 0x69, 0x2d, 0x61, 0x70, 0x69, 0x2f,
	0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x2f, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2f, 0x76, 0x31,
	0x61, 0x6c, 0x70, 0x68, 0x61, 0x31, 0x2f, 0x67, 0x65, 0x6e, 0x2f, 0x67, 0x6f, 0x62, 0x06, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_tunnel_proto_rawDescOnce sync.Once
	file_tunnel_proto_rawDescData = file_tunnel_proto_rawDesc
)

func file_tunnel_proto_rawDescGZIP() []byte {
	file_tunnel_proto_rawDescOnce.Do(func() {
		file_tunnel_proto_rawDescData = protoimpl.X.CompressGZIP(file_tunnel_proto_rawDescData)
	})
	return file_tunnel_proto_rawDescData
}

var file_tunnel_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_tunnel_proto_msgTypes = make([]protoimpl.MessageInfo, 4)
var file_tunnel_proto_goTypes = []interface{}{
	(TunnelType)(0),        // 0: opi_api.network.cloud.v1alpha1.TunnelType
	(*Tunnel)(nil),         // 1: opi_api.network.cloud.v1alpha1.Tunnel
	(*TunnelSpec)(nil),     // 2: opi_api.network.cloud.v1alpha1.TunnelSpec
	(*DropNexthop)(nil),    // 3: opi_api.network.cloud.v1alpha1.DropNexthop
	(*TunnelStatus)(nil),   // 4: opi_api.network.cloud.v1alpha1.TunnelStatus
	(*_go.ObjectKey)(nil),  // 5: opi_api.common.v1.ObjectKey
	(*_go1.IPAddress)(nil), // 6: opi_api.network.opinetcommon.v1alpha1.IPAddress
	(*_go1.Encap)(nil),     // 7: opi_api.network.opinetcommon.v1alpha1.Encap
	(*_go1.HwHandle)(nil),  // 8: opi_api.network.opinetcommon.v1alpha1.HwHandle
}
var file_tunnel_proto_depIdxs = []int32{
	2,  // 0: opi_api.network.cloud.v1alpha1.Tunnel.spec:type_name -> opi_api.network.cloud.v1alpha1.TunnelSpec
	4,  // 1: opi_api.network.cloud.v1alpha1.Tunnel.status:type_name -> opi_api.network.cloud.v1alpha1.TunnelStatus
	5,  // 2: opi_api.network.cloud.v1alpha1.TunnelSpec.id:type_name -> opi_api.common.v1.ObjectKey
	5,  // 3: opi_api.network.cloud.v1alpha1.TunnelSpec.vpc_id:type_name -> opi_api.common.v1.ObjectKey
	6,  // 4: opi_api.network.cloud.v1alpha1.TunnelSpec.local_ip:type_name -> opi_api.network.opinetcommon.v1alpha1.IPAddress
	6,  // 5: opi_api.network.cloud.v1alpha1.TunnelSpec.remote_ip:type_name -> opi_api.network.opinetcommon.v1alpha1.IPAddress
	0,  // 6: opi_api.network.cloud.v1alpha1.TunnelSpec.type:type_name -> opi_api.network.cloud.v1alpha1.TunnelType
	7,  // 7: opi_api.network.cloud.v1alpha1.TunnelSpec.encap:type_name -> opi_api.network.opinetcommon.v1alpha1.Encap
	5,  // 8: opi_api.network.cloud.v1alpha1.TunnelSpec.nexthop_id:type_name -> opi_api.common.v1.ObjectKey
	5,  // 9: opi_api.network.cloud.v1alpha1.TunnelSpec.nexthop_group_id:type_name -> opi_api.common.v1.ObjectKey
	5,  // 10: opi_api.network.cloud.v1alpha1.TunnelSpec.tunnel_id:type_name -> opi_api.common.v1.ObjectKey
	3,  // 11: opi_api.network.cloud.v1alpha1.TunnelSpec.drop_next_hop:type_name -> opi_api.network.cloud.v1alpha1.DropNexthop
	8,  // 12: opi_api.network.cloud.v1alpha1.TunnelStatus.hw_handle:type_name -> opi_api.network.opinetcommon.v1alpha1.HwHandle
	13, // [13:13] is the sub-list for method output_type
	13, // [13:13] is the sub-list for method input_type
	13, // [13:13] is the sub-list for extension type_name
	13, // [13:13] is the sub-list for extension extendee
	0,  // [0:13] is the sub-list for field type_name
}

func init() { file_tunnel_proto_init() }
func file_tunnel_proto_init() {
	if File_tunnel_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_tunnel_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Tunnel); i {
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
		file_tunnel_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*TunnelSpec); i {
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
		file_tunnel_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DropNexthop); i {
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
		file_tunnel_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*TunnelStatus); i {
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
	file_tunnel_proto_msgTypes[1].OneofWrappers = []interface{}{
		(*TunnelSpec_NexthopId)(nil),
		(*TunnelSpec_NexthopGroupId)(nil),
		(*TunnelSpec_TunnelId)(nil),
		(*TunnelSpec_DropNextHop)(nil),
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_tunnel_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   4,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_tunnel_proto_goTypes,
		DependencyIndexes: file_tunnel_proto_depIdxs,
		EnumInfos:         file_tunnel_proto_enumTypes,
		MessageInfos:      file_tunnel_proto_msgTypes,
	}.Build()
	File_tunnel_proto = out.File
	file_tunnel_proto_rawDesc = nil
	file_tunnel_proto_goTypes = nil
	file_tunnel_proto_depIdxs = nil
}
