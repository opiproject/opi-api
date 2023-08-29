// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.2.0
// - protoc             v3.21.6
// source: inventory.proto

package _go

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.32.0 or later.
const _ = grpc.SupportPackageIsVersion7

// InventorySvcClient is the client API for InventorySvc service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type InventorySvcClient interface {
	// retrieves the inventory data for the device
	GetInventory(ctx context.Context, in *GetInventoryRequest, opts ...grpc.CallOption) (*Inventory, error)
}

type inventorySvcClient struct {
	cc grpc.ClientConnInterface
}

func NewInventorySvcClient(cc grpc.ClientConnInterface) InventorySvcClient {
	return &inventorySvcClient{cc}
}

func (c *inventorySvcClient) GetInventory(ctx context.Context, in *GetInventoryRequest, opts ...grpc.CallOption) (*Inventory, error) {
	out := new(Inventory)
	err := c.cc.Invoke(ctx, "/opi_api.inventory.v1.InventorySvc/GetInventory", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// InventorySvcServer is the server API for InventorySvc service.
// All implementations should embed UnimplementedInventorySvcServer
// for forward compatibility
type InventorySvcServer interface {
	// retrieves the inventory data for the device
	GetInventory(context.Context, *GetInventoryRequest) (*Inventory, error)
}

// UnimplementedInventorySvcServer should be embedded to have forward compatible implementations.
type UnimplementedInventorySvcServer struct {
}

func (UnimplementedInventorySvcServer) GetInventory(context.Context, *GetInventoryRequest) (*Inventory, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetInventory not implemented")
}

// UnsafeInventorySvcServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to InventorySvcServer will
// result in compilation errors.
type UnsafeInventorySvcServer interface {
	mustEmbedUnimplementedInventorySvcServer()
}

func RegisterInventorySvcServer(s grpc.ServiceRegistrar, srv InventorySvcServer) {
	s.RegisterService(&InventorySvc_ServiceDesc, srv)
}

func _InventorySvc_GetInventory_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetInventoryRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(InventorySvcServer).GetInventory(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.inventory.v1.InventorySvc/GetInventory",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(InventorySvcServer).GetInventory(ctx, req.(*GetInventoryRequest))
	}
	return interceptor(ctx, in, info, handler)
}

// InventorySvc_ServiceDesc is the grpc.ServiceDesc for InventorySvc service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var InventorySvc_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "opi_api.inventory.v1.InventorySvc",
	HandlerType: (*InventorySvcServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "GetInventory",
			Handler:    _InventorySvc_GetInventory_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "inventory.proto",
}
