// SPDX-License-Identifier: Apache-2.0
// Copyright (c) 2022 Dell Inc, or its subsidiaries.
// Copyright (C) 2023 Intel Corporation
// Copyright (c) 2024 Xsight Labs Inc

// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.5.1
// - protoc             (unknown)
// source: storage/backend_malloc.proto

package _go

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
	emptypb "google.golang.org/protobuf/types/known/emptypb"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.64.0 or later.
const _ = grpc.SupportPackageIsVersion9

const (
	MallocVolumeService_CreateMallocVolume_FullMethodName = "/opi_api.storage.v1.MallocVolumeService/CreateMallocVolume"
	MallocVolumeService_DeleteMallocVolume_FullMethodName = "/opi_api.storage.v1.MallocVolumeService/DeleteMallocVolume"
	MallocVolumeService_UpdateMallocVolume_FullMethodName = "/opi_api.storage.v1.MallocVolumeService/UpdateMallocVolume"
	MallocVolumeService_ListMallocVolumes_FullMethodName  = "/opi_api.storage.v1.MallocVolumeService/ListMallocVolumes"
	MallocVolumeService_GetMallocVolume_FullMethodName    = "/opi_api.storage.v1.MallocVolumeService/GetMallocVolume"
	MallocVolumeService_StatsMallocVolume_FullMethodName  = "/opi_api.storage.v1.MallocVolumeService/StatsMallocVolume"
)

// MallocVolumeServiceClient is the client API for MallocVolumeService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
//
// Back End Malloc Volume APIs. This is debug interface for malloc block devices.
type MallocVolumeServiceClient interface {
	// Create a Malloc Volume
	CreateMallocVolume(ctx context.Context, in *CreateMallocVolumeRequest, opts ...grpc.CallOption) (*MallocVolume, error)
	// Delete a Malloc Volume
	DeleteMallocVolume(ctx context.Context, in *DeleteMallocVolumeRequest, opts ...grpc.CallOption) (*emptypb.Empty, error)
	// Update a Malloc Volume
	UpdateMallocVolume(ctx context.Context, in *UpdateMallocVolumeRequest, opts ...grpc.CallOption) (*MallocVolume, error)
	// List Malloc Volumes
	ListMallocVolumes(ctx context.Context, in *ListMallocVolumesRequest, opts ...grpc.CallOption) (*ListMallocVolumesResponse, error)
	// Get a Malloc Volume
	GetMallocVolume(ctx context.Context, in *GetMallocVolumeRequest, opts ...grpc.CallOption) (*MallocVolume, error)
	// Get a Malloc Volume statistics
	StatsMallocVolume(ctx context.Context, in *StatsMallocVolumeRequest, opts ...grpc.CallOption) (*StatsMallocVolumeResponse, error)
}

type mallocVolumeServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewMallocVolumeServiceClient(cc grpc.ClientConnInterface) MallocVolumeServiceClient {
	return &mallocVolumeServiceClient{cc}
}

func (c *mallocVolumeServiceClient) CreateMallocVolume(ctx context.Context, in *CreateMallocVolumeRequest, opts ...grpc.CallOption) (*MallocVolume, error) {
	cOpts := append([]grpc.CallOption{grpc.StaticMethod()}, opts...)
	out := new(MallocVolume)
	err := c.cc.Invoke(ctx, MallocVolumeService_CreateMallocVolume_FullMethodName, in, out, cOpts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *mallocVolumeServiceClient) DeleteMallocVolume(ctx context.Context, in *DeleteMallocVolumeRequest, opts ...grpc.CallOption) (*emptypb.Empty, error) {
	cOpts := append([]grpc.CallOption{grpc.StaticMethod()}, opts...)
	out := new(emptypb.Empty)
	err := c.cc.Invoke(ctx, MallocVolumeService_DeleteMallocVolume_FullMethodName, in, out, cOpts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *mallocVolumeServiceClient) UpdateMallocVolume(ctx context.Context, in *UpdateMallocVolumeRequest, opts ...grpc.CallOption) (*MallocVolume, error) {
	cOpts := append([]grpc.CallOption{grpc.StaticMethod()}, opts...)
	out := new(MallocVolume)
	err := c.cc.Invoke(ctx, MallocVolumeService_UpdateMallocVolume_FullMethodName, in, out, cOpts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *mallocVolumeServiceClient) ListMallocVolumes(ctx context.Context, in *ListMallocVolumesRequest, opts ...grpc.CallOption) (*ListMallocVolumesResponse, error) {
	cOpts := append([]grpc.CallOption{grpc.StaticMethod()}, opts...)
	out := new(ListMallocVolumesResponse)
	err := c.cc.Invoke(ctx, MallocVolumeService_ListMallocVolumes_FullMethodName, in, out, cOpts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *mallocVolumeServiceClient) GetMallocVolume(ctx context.Context, in *GetMallocVolumeRequest, opts ...grpc.CallOption) (*MallocVolume, error) {
	cOpts := append([]grpc.CallOption{grpc.StaticMethod()}, opts...)
	out := new(MallocVolume)
	err := c.cc.Invoke(ctx, MallocVolumeService_GetMallocVolume_FullMethodName, in, out, cOpts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *mallocVolumeServiceClient) StatsMallocVolume(ctx context.Context, in *StatsMallocVolumeRequest, opts ...grpc.CallOption) (*StatsMallocVolumeResponse, error) {
	cOpts := append([]grpc.CallOption{grpc.StaticMethod()}, opts...)
	out := new(StatsMallocVolumeResponse)
	err := c.cc.Invoke(ctx, MallocVolumeService_StatsMallocVolume_FullMethodName, in, out, cOpts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// MallocVolumeServiceServer is the server API for MallocVolumeService service.
// All implementations must embed UnimplementedMallocVolumeServiceServer
// for forward compatibility.
//
// Back End Malloc Volume APIs. This is debug interface for malloc block devices.
type MallocVolumeServiceServer interface {
	// Create a Malloc Volume
	CreateMallocVolume(context.Context, *CreateMallocVolumeRequest) (*MallocVolume, error)
	// Delete a Malloc Volume
	DeleteMallocVolume(context.Context, *DeleteMallocVolumeRequest) (*emptypb.Empty, error)
	// Update a Malloc Volume
	UpdateMallocVolume(context.Context, *UpdateMallocVolumeRequest) (*MallocVolume, error)
	// List Malloc Volumes
	ListMallocVolumes(context.Context, *ListMallocVolumesRequest) (*ListMallocVolumesResponse, error)
	// Get a Malloc Volume
	GetMallocVolume(context.Context, *GetMallocVolumeRequest) (*MallocVolume, error)
	// Get a Malloc Volume statistics
	StatsMallocVolume(context.Context, *StatsMallocVolumeRequest) (*StatsMallocVolumeResponse, error)
	mustEmbedUnimplementedMallocVolumeServiceServer()
}

// UnimplementedMallocVolumeServiceServer must be embedded to have
// forward compatible implementations.
//
// NOTE: this should be embedded by value instead of pointer to avoid a nil
// pointer dereference when methods are called.
type UnimplementedMallocVolumeServiceServer struct{}

func (UnimplementedMallocVolumeServiceServer) CreateMallocVolume(context.Context, *CreateMallocVolumeRequest) (*MallocVolume, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateMallocVolume not implemented")
}
func (UnimplementedMallocVolumeServiceServer) DeleteMallocVolume(context.Context, *DeleteMallocVolumeRequest) (*emptypb.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DeleteMallocVolume not implemented")
}
func (UnimplementedMallocVolumeServiceServer) UpdateMallocVolume(context.Context, *UpdateMallocVolumeRequest) (*MallocVolume, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateMallocVolume not implemented")
}
func (UnimplementedMallocVolumeServiceServer) ListMallocVolumes(context.Context, *ListMallocVolumesRequest) (*ListMallocVolumesResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ListMallocVolumes not implemented")
}
func (UnimplementedMallocVolumeServiceServer) GetMallocVolume(context.Context, *GetMallocVolumeRequest) (*MallocVolume, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetMallocVolume not implemented")
}
func (UnimplementedMallocVolumeServiceServer) StatsMallocVolume(context.Context, *StatsMallocVolumeRequest) (*StatsMallocVolumeResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method StatsMallocVolume not implemented")
}
func (UnimplementedMallocVolumeServiceServer) mustEmbedUnimplementedMallocVolumeServiceServer() {}
func (UnimplementedMallocVolumeServiceServer) testEmbeddedByValue()                             {}

// UnsafeMallocVolumeServiceServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to MallocVolumeServiceServer will
// result in compilation errors.
type UnsafeMallocVolumeServiceServer interface {
	mustEmbedUnimplementedMallocVolumeServiceServer()
}

func RegisterMallocVolumeServiceServer(s grpc.ServiceRegistrar, srv MallocVolumeServiceServer) {
	// If the following call pancis, it indicates UnimplementedMallocVolumeServiceServer was
	// embedded by pointer and is nil.  This will cause panics if an
	// unimplemented method is ever invoked, so we test this at initialization
	// time to prevent it from happening at runtime later due to I/O.
	if t, ok := srv.(interface{ testEmbeddedByValue() }); ok {
		t.testEmbeddedByValue()
	}
	s.RegisterService(&MallocVolumeService_ServiceDesc, srv)
}

func _MallocVolumeService_CreateMallocVolume_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateMallocVolumeRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(MallocVolumeServiceServer).CreateMallocVolume(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: MallocVolumeService_CreateMallocVolume_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(MallocVolumeServiceServer).CreateMallocVolume(ctx, req.(*CreateMallocVolumeRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _MallocVolumeService_DeleteMallocVolume_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DeleteMallocVolumeRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(MallocVolumeServiceServer).DeleteMallocVolume(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: MallocVolumeService_DeleteMallocVolume_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(MallocVolumeServiceServer).DeleteMallocVolume(ctx, req.(*DeleteMallocVolumeRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _MallocVolumeService_UpdateMallocVolume_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateMallocVolumeRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(MallocVolumeServiceServer).UpdateMallocVolume(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: MallocVolumeService_UpdateMallocVolume_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(MallocVolumeServiceServer).UpdateMallocVolume(ctx, req.(*UpdateMallocVolumeRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _MallocVolumeService_ListMallocVolumes_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ListMallocVolumesRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(MallocVolumeServiceServer).ListMallocVolumes(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: MallocVolumeService_ListMallocVolumes_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(MallocVolumeServiceServer).ListMallocVolumes(ctx, req.(*ListMallocVolumesRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _MallocVolumeService_GetMallocVolume_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetMallocVolumeRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(MallocVolumeServiceServer).GetMallocVolume(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: MallocVolumeService_GetMallocVolume_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(MallocVolumeServiceServer).GetMallocVolume(ctx, req.(*GetMallocVolumeRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _MallocVolumeService_StatsMallocVolume_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(StatsMallocVolumeRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(MallocVolumeServiceServer).StatsMallocVolume(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: MallocVolumeService_StatsMallocVolume_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(MallocVolumeServiceServer).StatsMallocVolume(ctx, req.(*StatsMallocVolumeRequest))
	}
	return interceptor(ctx, in, info, handler)
}

// MallocVolumeService_ServiceDesc is the grpc.ServiceDesc for MallocVolumeService service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var MallocVolumeService_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "opi_api.storage.v1.MallocVolumeService",
	HandlerType: (*MallocVolumeServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "CreateMallocVolume",
			Handler:    _MallocVolumeService_CreateMallocVolume_Handler,
		},
		{
			MethodName: "DeleteMallocVolume",
			Handler:    _MallocVolumeService_DeleteMallocVolume_Handler,
		},
		{
			MethodName: "UpdateMallocVolume",
			Handler:    _MallocVolumeService_UpdateMallocVolume_Handler,
		},
		{
			MethodName: "ListMallocVolumes",
			Handler:    _MallocVolumeService_ListMallocVolumes_Handler,
		},
		{
			MethodName: "GetMallocVolume",
			Handler:    _MallocVolumeService_GetMallocVolume_Handler,
		},
		{
			MethodName: "StatsMallocVolume",
			Handler:    _MallocVolumeService_StatsMallocVolume_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "storage/backend_malloc.proto",
}
