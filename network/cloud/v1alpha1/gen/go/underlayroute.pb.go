// Copyright (c) 2023 Pensando, AMD Inc, or its subsidiaries.
// protobuf specification for underlay (i.e. control plane) route table
// Underlayroute object differ from overlay/tenant Route  object because
// next hop is very different, doesn't require priority, classification, metering, etc.

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.0
// 	protoc        v3.19.4
// source: underlayroute.proto

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

// Underlay Route can be static or dynamic underlay route
type UnderlayRoute struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Underlayroute configuration (can specify fields to query route for get operations)
	Spec *UnderlayRouteSpec `protobuf:"bytes,1,opt,name=spec,proto3" json:"spec,omitempty"`
	// UnderlayRoute status
	Status *UnderlayRouteStatus `protobuf:"bytes,2,opt,name=status,proto3" json:"status,omitempty"`
}

func (x *UnderlayRoute) Reset() {
	*x = UnderlayRoute{}
	if protoimpl.UnsafeEnabled {
		mi := &file_underlayroute_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UnderlayRoute) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UnderlayRoute) ProtoMessage() {}

func (x *UnderlayRoute) ProtoReflect() protoreflect.Message {
	mi := &file_underlayroute_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UnderlayRoute.ProtoReflect.Descriptor instead.
func (*UnderlayRoute) Descriptor() ([]byte, []int) {
	return file_underlayroute_proto_rawDescGZIP(), []int{0}
}

func (x *UnderlayRoute) GetSpec() *UnderlayRouteSpec {
	if x != nil {
		return x.Spec
	}
	return nil
}

func (x *UnderlayRoute) GetStatus() *UnderlayRouteStatus {
	if x != nil {
		return x.Status
	}
	return nil
}

// control plane static route configuration
type UnderlayRouteSpec struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// route's unique id
	Id *_go.ObjectKey `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	// route table id this route belongs to
	RouteTableId *_go.ObjectKey `protobuf:"bytes,2,opt,name=route_table_id,json=routeTableId,proto3" json:"route_table_id,omitempty"`
	// destination address
	DestPrefix *_go1.IPPrefix `protobuf:"bytes,3,opt,name=dest_prefix,json=destPrefix,proto3" json:"dest_prefix,omitempty"`
	// next-hop address
	NextHopAddress *_go1.IPAddress `protobuf:"bytes,4,opt,name=next_hop_address,json=nextHopAddress,proto3" json:"next_hop_address,omitempty"`
	// route is enabled or not
	State _go1.AdminState `protobuf:"varint,5,opt,name=state,proto3,enum=opi_api.network.opinetcommon.v1alpha1.AdminState" json:"state,omitempty"`
	// enable/disable admin distance
	EnableAdminDistance bool `protobuf:"varint,6,opt,name=enable_admin_distance,json=enableAdminDistance,proto3" json:"enable_admin_distance,omitempty"`
	// admin distance set for a static route vs. what a routing
	// protocol computes it for the dynamic route.
	AdminDist int32 `protobuf:"varint,7,opt,name=admin_dist,json=adminDist,proto3" json:"admin_dist,omitempty"`
	// interface ID, if this route is configured on RR
	InterfaceId *_go.ObjectKey `protobuf:"bytes,8,opt,name=interface_id,json=interfaceId,proto3" json:"interface_id,omitempty"`
}

func (x *UnderlayRouteSpec) Reset() {
	*x = UnderlayRouteSpec{}
	if protoimpl.UnsafeEnabled {
		mi := &file_underlayroute_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UnderlayRouteSpec) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UnderlayRouteSpec) ProtoMessage() {}

func (x *UnderlayRouteSpec) ProtoReflect() protoreflect.Message {
	mi := &file_underlayroute_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UnderlayRouteSpec.ProtoReflect.Descriptor instead.
func (*UnderlayRouteSpec) Descriptor() ([]byte, []int) {
	return file_underlayroute_proto_rawDescGZIP(), []int{1}
}

func (x *UnderlayRouteSpec) GetId() *_go.ObjectKey {
	if x != nil {
		return x.Id
	}
	return nil
}

func (x *UnderlayRouteSpec) GetRouteTableId() *_go.ObjectKey {
	if x != nil {
		return x.RouteTableId
	}
	return nil
}

func (x *UnderlayRouteSpec) GetDestPrefix() *_go1.IPPrefix {
	if x != nil {
		return x.DestPrefix
	}
	return nil
}

func (x *UnderlayRouteSpec) GetNextHopAddress() *_go1.IPAddress {
	if x != nil {
		return x.NextHopAddress
	}
	return nil
}

func (x *UnderlayRouteSpec) GetState() _go1.AdminState {
	if x != nil {
		return x.State
	}
	return _go1.AdminState(0)
}

func (x *UnderlayRouteSpec) GetEnableAdminDistance() bool {
	if x != nil {
		return x.EnableAdminDistance
	}
	return false
}

func (x *UnderlayRouteSpec) GetAdminDist() int32 {
	if x != nil {
		return x.AdminDist
	}
	return 0
}

func (x *UnderlayRouteSpec) GetInterfaceId() *_go.ObjectKey {
	if x != nil {
		return x.InterfaceId
	}
	return nil
}

// Underlay Route status for a control plane static or dynamic route
type UnderlayRouteStatus struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// route table id this route belongs to
	RouteTableId int32 `protobuf:"varint,1,opt,name=route_table_id,json=routeTableId,proto3" json:"route_table_id,omitempty"`
	// destination address
	DestPrefix *_go1.IPPrefix `protobuf:"bytes,2,opt,name=dest_prefix,json=destPrefix,proto3" json:"dest_prefix,omitempty"`
	// next-hop address
	NextHopAddress *_go1.IPAddress `protobuf:"bytes,3,opt,name=next_hop_address,json=nextHopAddress,proto3" json:"next_hop_address,omitempty"`
	// interface index, if the next-hop is an interface
	IfIndex int32 `protobuf:"varint,5,opt,name=if_index,json=ifIndex,proto3" json:"if_index,omitempty"`
	// type of route
	Type _go1.RouteType `protobuf:"varint,6,opt,name=type,proto3,enum=opi_api.network.opinetcommon.v1alpha1.RouteType" json:"type,omitempty"`
	// protocol via which the route is learned
	Proto _go1.RouteProtocol `protobuf:"varint,7,opt,name=proto,proto3,enum=opi_api.network.opinetcommon.v1alpha1.RouteProtocol" json:"proto,omitempty"`
	// The number of seconds since this route was last updated or otherwise determined to be correct.
	Age int32 `protobuf:"varint,8,opt,name=age,proto3" json:"age,omitempty"`
	// The primary routing metric for this route
	Metric int32 `protobuf:"varint,9,opt,name=metric,proto3" json:"metric,omitempty"`
	// Is this route programmed either to a forwarding table, or to a partner that queries route information
	FibRoute bool `protobuf:"varint,10,opt,name=fib_route,json=fibRoute,proto3" json:"fib_route,omitempty"`
	// Indicates whether the route destination is directly connected
	Connected bool `protobuf:"varint,11,opt,name=connected,proto3" json:"connected,omitempty"`
	// Administrative distance for this route
	AdminDistance int32 `protobuf:"varint,12,opt,name=admin_distance,json=adminDistance,proto3" json:"admin_distance,omitempty"`
}

func (x *UnderlayRouteStatus) Reset() {
	*x = UnderlayRouteStatus{}
	if protoimpl.UnsafeEnabled {
		mi := &file_underlayroute_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UnderlayRouteStatus) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UnderlayRouteStatus) ProtoMessage() {}

func (x *UnderlayRouteStatus) ProtoReflect() protoreflect.Message {
	mi := &file_underlayroute_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UnderlayRouteStatus.ProtoReflect.Descriptor instead.
func (*UnderlayRouteStatus) Descriptor() ([]byte, []int) {
	return file_underlayroute_proto_rawDescGZIP(), []int{2}
}

func (x *UnderlayRouteStatus) GetRouteTableId() int32 {
	if x != nil {
		return x.RouteTableId
	}
	return 0
}

func (x *UnderlayRouteStatus) GetDestPrefix() *_go1.IPPrefix {
	if x != nil {
		return x.DestPrefix
	}
	return nil
}

func (x *UnderlayRouteStatus) GetNextHopAddress() *_go1.IPAddress {
	if x != nil {
		return x.NextHopAddress
	}
	return nil
}

func (x *UnderlayRouteStatus) GetIfIndex() int32 {
	if x != nil {
		return x.IfIndex
	}
	return 0
}

func (x *UnderlayRouteStatus) GetType() _go1.RouteType {
	if x != nil {
		return x.Type
	}
	return _go1.RouteType(0)
}

func (x *UnderlayRouteStatus) GetProto() _go1.RouteProtocol {
	if x != nil {
		return x.Proto
	}
	return _go1.RouteProtocol(0)
}

func (x *UnderlayRouteStatus) GetAge() int32 {
	if x != nil {
		return x.Age
	}
	return 0
}

func (x *UnderlayRouteStatus) GetMetric() int32 {
	if x != nil {
		return x.Metric
	}
	return 0
}

func (x *UnderlayRouteStatus) GetFibRoute() bool {
	if x != nil {
		return x.FibRoute
	}
	return false
}

func (x *UnderlayRouteStatus) GetConnected() bool {
	if x != nil {
		return x.Connected
	}
	return false
}

func (x *UnderlayRouteStatus) GetAdminDistance() int32 {
	if x != nil {
		return x.AdminDistance
	}
	return 0
}

// UnderlayRouteLookupKey can be used to query one or more routes based on various fields
type UnderlayRouteLookupKey struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// route table id this route belongs to
	RouteTableId *_go.ObjectKey `protobuf:"bytes,1,opt,name=route_table_id,json=routeTableId,proto3" json:"route_table_id,omitempty"`
	// destination address
	DestPrefix *_go1.IPPrefix `protobuf:"bytes,2,opt,name=dest_prefix,json=destPrefix,proto3" json:"dest_prefix,omitempty"`
	// next-hop address
	NextHopAddress *_go1.IPAddress `protobuf:"bytes,3,opt,name=next_hop_address,json=nextHopAddress,proto3" json:"next_hop_address,omitempty"`
	// interface index, if the next-hop is an interface
	Ifid int32 `protobuf:"varint,4,opt,name=ifid,proto3" json:"ifid,omitempty"`
	// protocol via which the route is learned
	Proto _go1.RouteProtocol `protobuf:"varint,6,opt,name=proto,proto3,enum=opi_api.network.opinetcommon.v1alpha1.RouteProtocol" json:"proto,omitempty"`
}

func (x *UnderlayRouteLookupKey) Reset() {
	*x = UnderlayRouteLookupKey{}
	if protoimpl.UnsafeEnabled {
		mi := &file_underlayroute_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UnderlayRouteLookupKey) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UnderlayRouteLookupKey) ProtoMessage() {}

func (x *UnderlayRouteLookupKey) ProtoReflect() protoreflect.Message {
	mi := &file_underlayroute_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UnderlayRouteLookupKey.ProtoReflect.Descriptor instead.
func (*UnderlayRouteLookupKey) Descriptor() ([]byte, []int) {
	return file_underlayroute_proto_rawDescGZIP(), []int{3}
}

func (x *UnderlayRouteLookupKey) GetRouteTableId() *_go.ObjectKey {
	if x != nil {
		return x.RouteTableId
	}
	return nil
}

func (x *UnderlayRouteLookupKey) GetDestPrefix() *_go1.IPPrefix {
	if x != nil {
		return x.DestPrefix
	}
	return nil
}

func (x *UnderlayRouteLookupKey) GetNextHopAddress() *_go1.IPAddress {
	if x != nil {
		return x.NextHopAddress
	}
	return nil
}

func (x *UnderlayRouteLookupKey) GetIfid() int32 {
	if x != nil {
		return x.Ifid
	}
	return 0
}

func (x *UnderlayRouteLookupKey) GetProto() _go1.RouteProtocol {
	if x != nil {
		return x.Proto
	}
	return _go1.RouteProtocol(0)
}

var File_underlayroute_proto protoreflect.FileDescriptor

var file_underlayroute_proto_rawDesc = []byte{
	0x0a, 0x13, 0x75, 0x6e, 0x64, 0x65, 0x72, 0x6c, 0x61, 0x79, 0x72, 0x6f, 0x75, 0x74, 0x65, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x1e, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x6e,
	0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x76, 0x31, 0x61,
	0x6c, 0x70, 0x68, 0x61, 0x31, 0x1a, 0x10, 0x6f, 0x62, 0x6a, 0x65, 0x63, 0x74, 0x5f, 0x6b, 0x65,
	0x79, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x12, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b,
	0x74, 0x79, 0x70, 0x65, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0xa3, 0x01, 0x0a, 0x0d,
	0x55, 0x6e, 0x64, 0x65, 0x72, 0x6c, 0x61, 0x79, 0x52, 0x6f, 0x75, 0x74, 0x65, 0x12, 0x45, 0x0a,
	0x04, 0x73, 0x70, 0x65, 0x63, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x31, 0x2e, 0x6f, 0x70,
	0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x2e, 0x63, 0x6c,
	0x6f, 0x75, 0x64, 0x2e, 0x76, 0x31, 0x61, 0x6c, 0x70, 0x68, 0x61, 0x31, 0x2e, 0x55, 0x6e, 0x64,
	0x65, 0x72, 0x6c, 0x61, 0x79, 0x52, 0x6f, 0x75, 0x74, 0x65, 0x53, 0x70, 0x65, 0x63, 0x52, 0x04,
	0x73, 0x70, 0x65, 0x63, 0x12, 0x4b, 0x0a, 0x06, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x18, 0x02,
	0x20, 0x01, 0x28, 0x0b, 0x32, 0x33, 0x2e, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x6e,
	0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e, 0x76, 0x31, 0x61,
	0x6c, 0x70, 0x68, 0x61, 0x31, 0x2e, 0x55, 0x6e, 0x64, 0x65, 0x72, 0x6c, 0x61, 0x79, 0x52, 0x6f,
	0x75, 0x74, 0x65, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x52, 0x06, 0x73, 0x74, 0x61, 0x74, 0x75,
	0x73, 0x22, 0x90, 0x04, 0x0a, 0x11, 0x55, 0x6e, 0x64, 0x65, 0x72, 0x6c, 0x61, 0x79, 0x52, 0x6f,
	0x75, 0x74, 0x65, 0x53, 0x70, 0x65, 0x63, 0x12, 0x2c, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x0b, 0x32, 0x1c, 0x2e, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x63, 0x6f,
	0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x76, 0x31, 0x2e, 0x4f, 0x62, 0x6a, 0x65, 0x63, 0x74, 0x4b, 0x65,
	0x79, 0x52, 0x02, 0x69, 0x64, 0x12, 0x42, 0x0a, 0x0e, 0x72, 0x6f, 0x75, 0x74, 0x65, 0x5f, 0x74,
	0x61, 0x62, 0x6c, 0x65, 0x5f, 0x69, 0x64, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1c, 0x2e,
	0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x76,
	0x31, 0x2e, 0x4f, 0x62, 0x6a, 0x65, 0x63, 0x74, 0x4b, 0x65, 0x79, 0x52, 0x0c, 0x72, 0x6f, 0x75,
	0x74, 0x65, 0x54, 0x61, 0x62, 0x6c, 0x65, 0x49, 0x64, 0x12, 0x50, 0x0a, 0x0b, 0x64, 0x65, 0x73,
	0x74, 0x5f, 0x70, 0x72, 0x65, 0x66, 0x69, 0x78, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x2f,
	0x2e, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b,
	0x2e, 0x6f, 0x70, 0x69, 0x6e, 0x65, 0x74, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x76, 0x31,
	0x61, 0x6c, 0x70, 0x68, 0x61, 0x31, 0x2e, 0x49, 0x50, 0x50, 0x72, 0x65, 0x66, 0x69, 0x78, 0x52,
	0x0a, 0x64, 0x65, 0x73, 0x74, 0x50, 0x72, 0x65, 0x66, 0x69, 0x78, 0x12, 0x5a, 0x0a, 0x10, 0x6e,
	0x65, 0x78, 0x74, 0x5f, 0x68, 0x6f, 0x70, 0x5f, 0x61, 0x64, 0x64, 0x72, 0x65, 0x73, 0x73, 0x18,
	0x04, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x30, 0x2e, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e,
	0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x2e, 0x6f, 0x70, 0x69, 0x6e, 0x65, 0x74, 0x63, 0x6f,
	0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x76, 0x31, 0x61, 0x6c, 0x70, 0x68, 0x61, 0x31, 0x2e, 0x49, 0x50,
	0x41, 0x64, 0x64, 0x72, 0x65, 0x73, 0x73, 0x52, 0x0e, 0x6e, 0x65, 0x78, 0x74, 0x48, 0x6f, 0x70,
	0x41, 0x64, 0x64, 0x72, 0x65, 0x73, 0x73, 0x12, 0x47, 0x0a, 0x05, 0x73, 0x74, 0x61, 0x74, 0x65,
	0x18, 0x05, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x31, 0x2e, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69,
	0x2e, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x2e, 0x6f, 0x70, 0x69, 0x6e, 0x65, 0x74, 0x63,
	0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x76, 0x31, 0x61, 0x6c, 0x70, 0x68, 0x61, 0x31, 0x2e, 0x41,
	0x64, 0x6d, 0x69, 0x6e, 0x53, 0x74, 0x61, 0x74, 0x65, 0x52, 0x05, 0x73, 0x74, 0x61, 0x74, 0x65,
	0x12, 0x32, 0x0a, 0x15, 0x65, 0x6e, 0x61, 0x62, 0x6c, 0x65, 0x5f, 0x61, 0x64, 0x6d, 0x69, 0x6e,
	0x5f, 0x64, 0x69, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x18, 0x06, 0x20, 0x01, 0x28, 0x08, 0x52,
	0x13, 0x65, 0x6e, 0x61, 0x62, 0x6c, 0x65, 0x41, 0x64, 0x6d, 0x69, 0x6e, 0x44, 0x69, 0x73, 0x74,
	0x61, 0x6e, 0x63, 0x65, 0x12, 0x1d, 0x0a, 0x0a, 0x61, 0x64, 0x6d, 0x69, 0x6e, 0x5f, 0x64, 0x69,
	0x73, 0x74, 0x18, 0x07, 0x20, 0x01, 0x28, 0x05, 0x52, 0x09, 0x61, 0x64, 0x6d, 0x69, 0x6e, 0x44,
	0x69, 0x73, 0x74, 0x12, 0x3f, 0x0a, 0x0c, 0x69, 0x6e, 0x74, 0x65, 0x72, 0x66, 0x61, 0x63, 0x65,
	0x5f, 0x69, 0x64, 0x18, 0x08, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1c, 0x2e, 0x6f, 0x70, 0x69, 0x5f,
	0x61, 0x70, 0x69, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x76, 0x31, 0x2e, 0x4f, 0x62,
	0x6a, 0x65, 0x63, 0x74, 0x4b, 0x65, 0x79, 0x52, 0x0b, 0x69, 0x6e, 0x74, 0x65, 0x72, 0x66, 0x61,
	0x63, 0x65, 0x49, 0x64, 0x22, 0xa2, 0x04, 0x0a, 0x13, 0x55, 0x6e, 0x64, 0x65, 0x72, 0x6c, 0x61,
	0x79, 0x52, 0x6f, 0x75, 0x74, 0x65, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x12, 0x24, 0x0a, 0x0e,
	0x72, 0x6f, 0x75, 0x74, 0x65, 0x5f, 0x74, 0x61, 0x62, 0x6c, 0x65, 0x5f, 0x69, 0x64, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x05, 0x52, 0x0c, 0x72, 0x6f, 0x75, 0x74, 0x65, 0x54, 0x61, 0x62, 0x6c, 0x65,
	0x49, 0x64, 0x12, 0x50, 0x0a, 0x0b, 0x64, 0x65, 0x73, 0x74, 0x5f, 0x70, 0x72, 0x65, 0x66, 0x69,
	0x78, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x2f, 0x2e, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70,
	0x69, 0x2e, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x2e, 0x6f, 0x70, 0x69, 0x6e, 0x65, 0x74,
	0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x76, 0x31, 0x61, 0x6c, 0x70, 0x68, 0x61, 0x31, 0x2e,
	0x49, 0x50, 0x50, 0x72, 0x65, 0x66, 0x69, 0x78, 0x52, 0x0a, 0x64, 0x65, 0x73, 0x74, 0x50, 0x72,
	0x65, 0x66, 0x69, 0x78, 0x12, 0x5a, 0x0a, 0x10, 0x6e, 0x65, 0x78, 0x74, 0x5f, 0x68, 0x6f, 0x70,
	0x5f, 0x61, 0x64, 0x64, 0x72, 0x65, 0x73, 0x73, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x30,
	0x2e, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b,
	0x2e, 0x6f, 0x70, 0x69, 0x6e, 0x65, 0x74, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x76, 0x31,
	0x61, 0x6c, 0x70, 0x68, 0x61, 0x31, 0x2e, 0x49, 0x50, 0x41, 0x64, 0x64, 0x72, 0x65, 0x73, 0x73,
	0x52, 0x0e, 0x6e, 0x65, 0x78, 0x74, 0x48, 0x6f, 0x70, 0x41, 0x64, 0x64, 0x72, 0x65, 0x73, 0x73,
	0x12, 0x19, 0x0a, 0x08, 0x69, 0x66, 0x5f, 0x69, 0x6e, 0x64, 0x65, 0x78, 0x18, 0x05, 0x20, 0x01,
	0x28, 0x05, 0x52, 0x07, 0x69, 0x66, 0x49, 0x6e, 0x64, 0x65, 0x78, 0x12, 0x44, 0x0a, 0x04, 0x74,
	0x79, 0x70, 0x65, 0x18, 0x06, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x30, 0x2e, 0x6f, 0x70, 0x69, 0x5f,
	0x61, 0x70, 0x69, 0x2e, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x2e, 0x6f, 0x70, 0x69, 0x6e,
	0x65, 0x74, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x76, 0x31, 0x61, 0x6c, 0x70, 0x68, 0x61,
	0x31, 0x2e, 0x52, 0x6f, 0x75, 0x74, 0x65, 0x54, 0x79, 0x70, 0x65, 0x52, 0x04, 0x74, 0x79, 0x70,
	0x65, 0x12, 0x4a, 0x0a, 0x05, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x18, 0x07, 0x20, 0x01, 0x28, 0x0e,
	0x32, 0x34, 0x2e, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x6e, 0x65, 0x74, 0x77, 0x6f,
	0x72, 0x6b, 0x2e, 0x6f, 0x70, 0x69, 0x6e, 0x65, 0x74, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e,
	0x76, 0x31, 0x61, 0x6c, 0x70, 0x68, 0x61, 0x31, 0x2e, 0x52, 0x6f, 0x75, 0x74, 0x65, 0x50, 0x72,
	0x6f, 0x74, 0x6f, 0x63, 0x6f, 0x6c, 0x52, 0x05, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x10, 0x0a,
	0x03, 0x61, 0x67, 0x65, 0x18, 0x08, 0x20, 0x01, 0x28, 0x05, 0x52, 0x03, 0x61, 0x67, 0x65, 0x12,
	0x16, 0x0a, 0x06, 0x6d, 0x65, 0x74, 0x72, 0x69, 0x63, 0x18, 0x09, 0x20, 0x01, 0x28, 0x05, 0x52,
	0x06, 0x6d, 0x65, 0x74, 0x72, 0x69, 0x63, 0x12, 0x1b, 0x0a, 0x09, 0x66, 0x69, 0x62, 0x5f, 0x72,
	0x6f, 0x75, 0x74, 0x65, 0x18, 0x0a, 0x20, 0x01, 0x28, 0x08, 0x52, 0x08, 0x66, 0x69, 0x62, 0x52,
	0x6f, 0x75, 0x74, 0x65, 0x12, 0x1c, 0x0a, 0x09, 0x63, 0x6f, 0x6e, 0x6e, 0x65, 0x63, 0x74, 0x65,
	0x64, 0x18, 0x0b, 0x20, 0x01, 0x28, 0x08, 0x52, 0x09, 0x63, 0x6f, 0x6e, 0x6e, 0x65, 0x63, 0x74,
	0x65, 0x64, 0x12, 0x25, 0x0a, 0x0e, 0x61, 0x64, 0x6d, 0x69, 0x6e, 0x5f, 0x64, 0x69, 0x73, 0x74,
	0x61, 0x6e, 0x63, 0x65, 0x18, 0x0c, 0x20, 0x01, 0x28, 0x05, 0x52, 0x0d, 0x61, 0x64, 0x6d, 0x69,
	0x6e, 0x44, 0x69, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x22, 0xea, 0x02, 0x0a, 0x16, 0x55, 0x6e,
	0x64, 0x65, 0x72, 0x6c, 0x61, 0x79, 0x52, 0x6f, 0x75, 0x74, 0x65, 0x4c, 0x6f, 0x6f, 0x6b, 0x75,
	0x70, 0x4b, 0x65, 0x79, 0x12, 0x42, 0x0a, 0x0e, 0x72, 0x6f, 0x75, 0x74, 0x65, 0x5f, 0x74, 0x61,
	0x62, 0x6c, 0x65, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1c, 0x2e, 0x6f,
	0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x76, 0x31,
	0x2e, 0x4f, 0x62, 0x6a, 0x65, 0x63, 0x74, 0x4b, 0x65, 0x79, 0x52, 0x0c, 0x72, 0x6f, 0x75, 0x74,
	0x65, 0x54, 0x61, 0x62, 0x6c, 0x65, 0x49, 0x64, 0x12, 0x50, 0x0a, 0x0b, 0x64, 0x65, 0x73, 0x74,
	0x5f, 0x70, 0x72, 0x65, 0x66, 0x69, 0x78, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x2f, 0x2e,
	0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x2e,
	0x6f, 0x70, 0x69, 0x6e, 0x65, 0x74, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x76, 0x31, 0x61,
	0x6c, 0x70, 0x68, 0x61, 0x31, 0x2e, 0x49, 0x50, 0x50, 0x72, 0x65, 0x66, 0x69, 0x78, 0x52, 0x0a,
	0x64, 0x65, 0x73, 0x74, 0x50, 0x72, 0x65, 0x66, 0x69, 0x78, 0x12, 0x5a, 0x0a, 0x10, 0x6e, 0x65,
	0x78, 0x74, 0x5f, 0x68, 0x6f, 0x70, 0x5f, 0x61, 0x64, 0x64, 0x72, 0x65, 0x73, 0x73, 0x18, 0x03,
	0x20, 0x01, 0x28, 0x0b, 0x32, 0x30, 0x2e, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x6e,
	0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x2e, 0x6f, 0x70, 0x69, 0x6e, 0x65, 0x74, 0x63, 0x6f, 0x6d,
	0x6d, 0x6f, 0x6e, 0x2e, 0x76, 0x31, 0x61, 0x6c, 0x70, 0x68, 0x61, 0x31, 0x2e, 0x49, 0x50, 0x41,
	0x64, 0x64, 0x72, 0x65, 0x73, 0x73, 0x52, 0x0e, 0x6e, 0x65, 0x78, 0x74, 0x48, 0x6f, 0x70, 0x41,
	0x64, 0x64, 0x72, 0x65, 0x73, 0x73, 0x12, 0x12, 0x0a, 0x04, 0x69, 0x66, 0x69, 0x64, 0x18, 0x04,
	0x20, 0x01, 0x28, 0x05, 0x52, 0x04, 0x69, 0x66, 0x69, 0x64, 0x12, 0x4a, 0x0a, 0x05, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x18, 0x06, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x34, 0x2e, 0x6f, 0x70, 0x69, 0x5f,
	0x61, 0x70, 0x69, 0x2e, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x2e, 0x6f, 0x70, 0x69, 0x6e,
	0x65, 0x74, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x76, 0x31, 0x61, 0x6c, 0x70, 0x68, 0x61,
	0x31, 0x2e, 0x52, 0x6f, 0x75, 0x74, 0x65, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x63, 0x6f, 0x6c, 0x52,
	0x05, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x42, 0x73, 0x0a, 0x1e, 0x6f, 0x70, 0x69, 0x5f, 0x61, 0x70,
	0x69, 0x2e, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x2e, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2e,
	0x76, 0x31, 0x61, 0x6c, 0x70, 0x68, 0x61, 0x31, 0x42, 0x12, 0x55, 0x6e, 0x64, 0x65, 0x72, 0x6c,
	0x61, 0x79, 0x52, 0x6f, 0x75, 0x74, 0x65, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x3b,
	0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x6f, 0x70, 0x69, 0x70, 0x72,
	0x6f, 0x6a, 0x65, 0x63, 0x74, 0x2f, 0x6f, 0x70, 0x69, 0x2d, 0x61, 0x70, 0x69, 0x2f, 0x6e, 0x65,
	0x74, 0x77, 0x6f, 0x72, 0x6b, 0x2f, 0x63, 0x6c, 0x6f, 0x75, 0x64, 0x2f, 0x76, 0x31, 0x61, 0x6c,
	0x70, 0x68, 0x61, 0x31, 0x2f, 0x67, 0x65, 0x6e, 0x2f, 0x67, 0x6f, 0x62, 0x06, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x33,
}

var (
	file_underlayroute_proto_rawDescOnce sync.Once
	file_underlayroute_proto_rawDescData = file_underlayroute_proto_rawDesc
)

func file_underlayroute_proto_rawDescGZIP() []byte {
	file_underlayroute_proto_rawDescOnce.Do(func() {
		file_underlayroute_proto_rawDescData = protoimpl.X.CompressGZIP(file_underlayroute_proto_rawDescData)
	})
	return file_underlayroute_proto_rawDescData
}

var file_underlayroute_proto_msgTypes = make([]protoimpl.MessageInfo, 4)
var file_underlayroute_proto_goTypes = []interface{}{
	(*UnderlayRoute)(nil),          // 0: opi_api.network.cloud.v1alpha1.UnderlayRoute
	(*UnderlayRouteSpec)(nil),      // 1: opi_api.network.cloud.v1alpha1.UnderlayRouteSpec
	(*UnderlayRouteStatus)(nil),    // 2: opi_api.network.cloud.v1alpha1.UnderlayRouteStatus
	(*UnderlayRouteLookupKey)(nil), // 3: opi_api.network.cloud.v1alpha1.UnderlayRouteLookupKey
	(*_go.ObjectKey)(nil),          // 4: opi_api.common.v1.ObjectKey
	(*_go1.IPPrefix)(nil),          // 5: opi_api.network.opinetcommon.v1alpha1.IPPrefix
	(*_go1.IPAddress)(nil),         // 6: opi_api.network.opinetcommon.v1alpha1.IPAddress
	(_go1.AdminState)(0),           // 7: opi_api.network.opinetcommon.v1alpha1.AdminState
	(_go1.RouteType)(0),            // 8: opi_api.network.opinetcommon.v1alpha1.RouteType
	(_go1.RouteProtocol)(0),        // 9: opi_api.network.opinetcommon.v1alpha1.RouteProtocol
}
var file_underlayroute_proto_depIdxs = []int32{
	1,  // 0: opi_api.network.cloud.v1alpha1.UnderlayRoute.spec:type_name -> opi_api.network.cloud.v1alpha1.UnderlayRouteSpec
	2,  // 1: opi_api.network.cloud.v1alpha1.UnderlayRoute.status:type_name -> opi_api.network.cloud.v1alpha1.UnderlayRouteStatus
	4,  // 2: opi_api.network.cloud.v1alpha1.UnderlayRouteSpec.id:type_name -> opi_api.common.v1.ObjectKey
	4,  // 3: opi_api.network.cloud.v1alpha1.UnderlayRouteSpec.route_table_id:type_name -> opi_api.common.v1.ObjectKey
	5,  // 4: opi_api.network.cloud.v1alpha1.UnderlayRouteSpec.dest_prefix:type_name -> opi_api.network.opinetcommon.v1alpha1.IPPrefix
	6,  // 5: opi_api.network.cloud.v1alpha1.UnderlayRouteSpec.next_hop_address:type_name -> opi_api.network.opinetcommon.v1alpha1.IPAddress
	7,  // 6: opi_api.network.cloud.v1alpha1.UnderlayRouteSpec.state:type_name -> opi_api.network.opinetcommon.v1alpha1.AdminState
	4,  // 7: opi_api.network.cloud.v1alpha1.UnderlayRouteSpec.interface_id:type_name -> opi_api.common.v1.ObjectKey
	5,  // 8: opi_api.network.cloud.v1alpha1.UnderlayRouteStatus.dest_prefix:type_name -> opi_api.network.opinetcommon.v1alpha1.IPPrefix
	6,  // 9: opi_api.network.cloud.v1alpha1.UnderlayRouteStatus.next_hop_address:type_name -> opi_api.network.opinetcommon.v1alpha1.IPAddress
	8,  // 10: opi_api.network.cloud.v1alpha1.UnderlayRouteStatus.type:type_name -> opi_api.network.opinetcommon.v1alpha1.RouteType
	9,  // 11: opi_api.network.cloud.v1alpha1.UnderlayRouteStatus.proto:type_name -> opi_api.network.opinetcommon.v1alpha1.RouteProtocol
	4,  // 12: opi_api.network.cloud.v1alpha1.UnderlayRouteLookupKey.route_table_id:type_name -> opi_api.common.v1.ObjectKey
	5,  // 13: opi_api.network.cloud.v1alpha1.UnderlayRouteLookupKey.dest_prefix:type_name -> opi_api.network.opinetcommon.v1alpha1.IPPrefix
	6,  // 14: opi_api.network.cloud.v1alpha1.UnderlayRouteLookupKey.next_hop_address:type_name -> opi_api.network.opinetcommon.v1alpha1.IPAddress
	9,  // 15: opi_api.network.cloud.v1alpha1.UnderlayRouteLookupKey.proto:type_name -> opi_api.network.opinetcommon.v1alpha1.RouteProtocol
	16, // [16:16] is the sub-list for method output_type
	16, // [16:16] is the sub-list for method input_type
	16, // [16:16] is the sub-list for extension type_name
	16, // [16:16] is the sub-list for extension extendee
	0,  // [0:16] is the sub-list for field type_name
}

func init() { file_underlayroute_proto_init() }
func file_underlayroute_proto_init() {
	if File_underlayroute_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_underlayroute_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UnderlayRoute); i {
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
		file_underlayroute_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UnderlayRouteSpec); i {
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
		file_underlayroute_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UnderlayRouteStatus); i {
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
		file_underlayroute_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UnderlayRouteLookupKey); i {
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
			RawDescriptor: file_underlayroute_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   4,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_underlayroute_proto_goTypes,
		DependencyIndexes: file_underlayroute_proto_depIdxs,
		MessageInfos:      file_underlayroute_proto_msgTypes,
	}.Build()
	File_underlayroute_proto = out.File
	file_underlayroute_proto_rawDesc = nil
	file_underlayroute_proto_goTypes = nil
	file_underlayroute_proto_depIdxs = nil
}