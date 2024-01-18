// SPDX-License-Identifier: Apache-2.0
// Copyright (c) 2022 Dell Inc, or its subsidiaries.
// Copyright (C) 2023 Intel Corporation

// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.3.0
// - protoc             (unknown)
// source: frontend_virtio_scsi.proto

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
// Requires gRPC-Go v1.32.0 or later.
const _ = grpc.SupportPackageIsVersion7

const (
	FrontendVirtioScsiService_CreateVirtioScsiTarget_FullMethodName     = "/opi_api.storage.v1.FrontendVirtioScsiService/CreateVirtioScsiTarget"
	FrontendVirtioScsiService_DeleteVirtioScsiTarget_FullMethodName     = "/opi_api.storage.v1.FrontendVirtioScsiService/DeleteVirtioScsiTarget"
	FrontendVirtioScsiService_UpdateVirtioScsiTarget_FullMethodName     = "/opi_api.storage.v1.FrontendVirtioScsiService/UpdateVirtioScsiTarget"
	FrontendVirtioScsiService_ListVirtioScsiTargets_FullMethodName      = "/opi_api.storage.v1.FrontendVirtioScsiService/ListVirtioScsiTargets"
	FrontendVirtioScsiService_GetVirtioScsiTarget_FullMethodName        = "/opi_api.storage.v1.FrontendVirtioScsiService/GetVirtioScsiTarget"
	FrontendVirtioScsiService_StatsVirtioScsiTarget_FullMethodName      = "/opi_api.storage.v1.FrontendVirtioScsiService/StatsVirtioScsiTarget"
	FrontendVirtioScsiService_CreateVirtioScsiController_FullMethodName = "/opi_api.storage.v1.FrontendVirtioScsiService/CreateVirtioScsiController"
	FrontendVirtioScsiService_DeleteVirtioScsiController_FullMethodName = "/opi_api.storage.v1.FrontendVirtioScsiService/DeleteVirtioScsiController"
	FrontendVirtioScsiService_UpdateVirtioScsiController_FullMethodName = "/opi_api.storage.v1.FrontendVirtioScsiService/UpdateVirtioScsiController"
	FrontendVirtioScsiService_ListVirtioScsiControllers_FullMethodName  = "/opi_api.storage.v1.FrontendVirtioScsiService/ListVirtioScsiControllers"
	FrontendVirtioScsiService_GetVirtioScsiController_FullMethodName    = "/opi_api.storage.v1.FrontendVirtioScsiService/GetVirtioScsiController"
	FrontendVirtioScsiService_StatsVirtioScsiController_FullMethodName  = "/opi_api.storage.v1.FrontendVirtioScsiService/StatsVirtioScsiController"
	FrontendVirtioScsiService_CreateVirtioScsiLun_FullMethodName        = "/opi_api.storage.v1.FrontendVirtioScsiService/CreateVirtioScsiLun"
	FrontendVirtioScsiService_DeleteVirtioScsiLun_FullMethodName        = "/opi_api.storage.v1.FrontendVirtioScsiService/DeleteVirtioScsiLun"
	FrontendVirtioScsiService_UpdateVirtioScsiLun_FullMethodName        = "/opi_api.storage.v1.FrontendVirtioScsiService/UpdateVirtioScsiLun"
	FrontendVirtioScsiService_ListVirtioScsiLuns_FullMethodName         = "/opi_api.storage.v1.FrontendVirtioScsiService/ListVirtioScsiLuns"
	FrontendVirtioScsiService_GetVirtioScsiLun_FullMethodName           = "/opi_api.storage.v1.FrontendVirtioScsiService/GetVirtioScsiLun"
	FrontendVirtioScsiService_StatsVirtioScsiLun_FullMethodName         = "/opi_api.storage.v1.FrontendVirtioScsiService/StatsVirtioScsiLun"
)

// FrontendVirtioScsiServiceClient is the client API for FrontendVirtioScsiService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type FrontendVirtioScsiServiceClient interface {
	// Create an Virtio Scsi Target
	CreateVirtioScsiTarget(ctx context.Context, in *CreateVirtioScsiTargetRequest, opts ...grpc.CallOption) (*VirtioScsiTarget, error)
	// Delete an Virtio Scsi Target
	DeleteVirtioScsiTarget(ctx context.Context, in *DeleteVirtioScsiTargetRequest, opts ...grpc.CallOption) (*emptypb.Empty, error)
	// Update an Virtio Scsi Target
	UpdateVirtioScsiTarget(ctx context.Context, in *UpdateVirtioScsiTargetRequest, opts ...grpc.CallOption) (*VirtioScsiTarget, error)
	// List Virtio Scsi Targets
	ListVirtioScsiTargets(ctx context.Context, in *ListVirtioScsiTargetsRequest, opts ...grpc.CallOption) (*ListVirtioScsiTargetsResponse, error)
	// Get an Virtio Scsi Target
	GetVirtioScsiTarget(ctx context.Context, in *GetVirtioScsiTargetRequest, opts ...grpc.CallOption) (*VirtioScsiTarget, error)
	// Get an Virtio Scsi Target statistics
	StatsVirtioScsiTarget(ctx context.Context, in *StatsVirtioScsiTargetRequest, opts ...grpc.CallOption) (*StatsVirtioScsiTargetResponse, error)
	// Create an Virtio Scsi Controller
	CreateVirtioScsiController(ctx context.Context, in *CreateVirtioScsiControllerRequest, opts ...grpc.CallOption) (*VirtioScsiController, error)
	// Delete an Virtio Scsi Controller
	DeleteVirtioScsiController(ctx context.Context, in *DeleteVirtioScsiControllerRequest, opts ...grpc.CallOption) (*emptypb.Empty, error)
	// Update an Virtio Scsi Controller
	UpdateVirtioScsiController(ctx context.Context, in *UpdateVirtioScsiControllerRequest, opts ...grpc.CallOption) (*VirtioScsiController, error)
	// List Virtio Scsi Controllers
	ListVirtioScsiControllers(ctx context.Context, in *ListVirtioScsiControllersRequest, opts ...grpc.CallOption) (*ListVirtioScsiControllersResponse, error)
	// Get an Virtio Scsi Controller
	GetVirtioScsiController(ctx context.Context, in *GetVirtioScsiControllerRequest, opts ...grpc.CallOption) (*VirtioScsiController, error)
	// Get an Virtio Scsi Controller statistics
	StatsVirtioScsiController(ctx context.Context, in *StatsVirtioScsiControllerRequest, opts ...grpc.CallOption) (*StatsVirtioScsiControllerResponse, error)
	// Create an Virtio Scsi Lun
	CreateVirtioScsiLun(ctx context.Context, in *CreateVirtioScsiLunRequest, opts ...grpc.CallOption) (*VirtioScsiLun, error)
	// Delete an Virtio Scsi Lun
	DeleteVirtioScsiLun(ctx context.Context, in *DeleteVirtioScsiLunRequest, opts ...grpc.CallOption) (*emptypb.Empty, error)
	// Update an Virtio Scsi Lun
	UpdateVirtioScsiLun(ctx context.Context, in *UpdateVirtioScsiLunRequest, opts ...grpc.CallOption) (*VirtioScsiLun, error)
	// List Virtio Scsi Luns
	ListVirtioScsiLuns(ctx context.Context, in *ListVirtioScsiLunsRequest, opts ...grpc.CallOption) (*ListVirtioScsiLunsResponse, error)
	// Get an Virtio Scsi Lun
	GetVirtioScsiLun(ctx context.Context, in *GetVirtioScsiLunRequest, opts ...grpc.CallOption) (*VirtioScsiLun, error)
	// Get an Virtio Scsi Lun statistics
	StatsVirtioScsiLun(ctx context.Context, in *StatsVirtioScsiLunRequest, opts ...grpc.CallOption) (*StatsVirtioScsiLunResponse, error)
}

type frontendVirtioScsiServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewFrontendVirtioScsiServiceClient(cc grpc.ClientConnInterface) FrontendVirtioScsiServiceClient {
	return &frontendVirtioScsiServiceClient{cc}
}

func (c *frontendVirtioScsiServiceClient) CreateVirtioScsiTarget(ctx context.Context, in *CreateVirtioScsiTargetRequest, opts ...grpc.CallOption) (*VirtioScsiTarget, error) {
	out := new(VirtioScsiTarget)
	err := c.cc.Invoke(ctx, FrontendVirtioScsiService_CreateVirtioScsiTarget_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *frontendVirtioScsiServiceClient) DeleteVirtioScsiTarget(ctx context.Context, in *DeleteVirtioScsiTargetRequest, opts ...grpc.CallOption) (*emptypb.Empty, error) {
	out := new(emptypb.Empty)
	err := c.cc.Invoke(ctx, FrontendVirtioScsiService_DeleteVirtioScsiTarget_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *frontendVirtioScsiServiceClient) UpdateVirtioScsiTarget(ctx context.Context, in *UpdateVirtioScsiTargetRequest, opts ...grpc.CallOption) (*VirtioScsiTarget, error) {
	out := new(VirtioScsiTarget)
	err := c.cc.Invoke(ctx, FrontendVirtioScsiService_UpdateVirtioScsiTarget_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *frontendVirtioScsiServiceClient) ListVirtioScsiTargets(ctx context.Context, in *ListVirtioScsiTargetsRequest, opts ...grpc.CallOption) (*ListVirtioScsiTargetsResponse, error) {
	out := new(ListVirtioScsiTargetsResponse)
	err := c.cc.Invoke(ctx, FrontendVirtioScsiService_ListVirtioScsiTargets_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *frontendVirtioScsiServiceClient) GetVirtioScsiTarget(ctx context.Context, in *GetVirtioScsiTargetRequest, opts ...grpc.CallOption) (*VirtioScsiTarget, error) {
	out := new(VirtioScsiTarget)
	err := c.cc.Invoke(ctx, FrontendVirtioScsiService_GetVirtioScsiTarget_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *frontendVirtioScsiServiceClient) StatsVirtioScsiTarget(ctx context.Context, in *StatsVirtioScsiTargetRequest, opts ...grpc.CallOption) (*StatsVirtioScsiTargetResponse, error) {
	out := new(StatsVirtioScsiTargetResponse)
	err := c.cc.Invoke(ctx, FrontendVirtioScsiService_StatsVirtioScsiTarget_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *frontendVirtioScsiServiceClient) CreateVirtioScsiController(ctx context.Context, in *CreateVirtioScsiControllerRequest, opts ...grpc.CallOption) (*VirtioScsiController, error) {
	out := new(VirtioScsiController)
	err := c.cc.Invoke(ctx, FrontendVirtioScsiService_CreateVirtioScsiController_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *frontendVirtioScsiServiceClient) DeleteVirtioScsiController(ctx context.Context, in *DeleteVirtioScsiControllerRequest, opts ...grpc.CallOption) (*emptypb.Empty, error) {
	out := new(emptypb.Empty)
	err := c.cc.Invoke(ctx, FrontendVirtioScsiService_DeleteVirtioScsiController_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *frontendVirtioScsiServiceClient) UpdateVirtioScsiController(ctx context.Context, in *UpdateVirtioScsiControllerRequest, opts ...grpc.CallOption) (*VirtioScsiController, error) {
	out := new(VirtioScsiController)
	err := c.cc.Invoke(ctx, FrontendVirtioScsiService_UpdateVirtioScsiController_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *frontendVirtioScsiServiceClient) ListVirtioScsiControllers(ctx context.Context, in *ListVirtioScsiControllersRequest, opts ...grpc.CallOption) (*ListVirtioScsiControllersResponse, error) {
	out := new(ListVirtioScsiControllersResponse)
	err := c.cc.Invoke(ctx, FrontendVirtioScsiService_ListVirtioScsiControllers_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *frontendVirtioScsiServiceClient) GetVirtioScsiController(ctx context.Context, in *GetVirtioScsiControllerRequest, opts ...grpc.CallOption) (*VirtioScsiController, error) {
	out := new(VirtioScsiController)
	err := c.cc.Invoke(ctx, FrontendVirtioScsiService_GetVirtioScsiController_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *frontendVirtioScsiServiceClient) StatsVirtioScsiController(ctx context.Context, in *StatsVirtioScsiControllerRequest, opts ...grpc.CallOption) (*StatsVirtioScsiControllerResponse, error) {
	out := new(StatsVirtioScsiControllerResponse)
	err := c.cc.Invoke(ctx, FrontendVirtioScsiService_StatsVirtioScsiController_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *frontendVirtioScsiServiceClient) CreateVirtioScsiLun(ctx context.Context, in *CreateVirtioScsiLunRequest, opts ...grpc.CallOption) (*VirtioScsiLun, error) {
	out := new(VirtioScsiLun)
	err := c.cc.Invoke(ctx, FrontendVirtioScsiService_CreateVirtioScsiLun_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *frontendVirtioScsiServiceClient) DeleteVirtioScsiLun(ctx context.Context, in *DeleteVirtioScsiLunRequest, opts ...grpc.CallOption) (*emptypb.Empty, error) {
	out := new(emptypb.Empty)
	err := c.cc.Invoke(ctx, FrontendVirtioScsiService_DeleteVirtioScsiLun_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *frontendVirtioScsiServiceClient) UpdateVirtioScsiLun(ctx context.Context, in *UpdateVirtioScsiLunRequest, opts ...grpc.CallOption) (*VirtioScsiLun, error) {
	out := new(VirtioScsiLun)
	err := c.cc.Invoke(ctx, FrontendVirtioScsiService_UpdateVirtioScsiLun_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *frontendVirtioScsiServiceClient) ListVirtioScsiLuns(ctx context.Context, in *ListVirtioScsiLunsRequest, opts ...grpc.CallOption) (*ListVirtioScsiLunsResponse, error) {
	out := new(ListVirtioScsiLunsResponse)
	err := c.cc.Invoke(ctx, FrontendVirtioScsiService_ListVirtioScsiLuns_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *frontendVirtioScsiServiceClient) GetVirtioScsiLun(ctx context.Context, in *GetVirtioScsiLunRequest, opts ...grpc.CallOption) (*VirtioScsiLun, error) {
	out := new(VirtioScsiLun)
	err := c.cc.Invoke(ctx, FrontendVirtioScsiService_GetVirtioScsiLun_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *frontendVirtioScsiServiceClient) StatsVirtioScsiLun(ctx context.Context, in *StatsVirtioScsiLunRequest, opts ...grpc.CallOption) (*StatsVirtioScsiLunResponse, error) {
	out := new(StatsVirtioScsiLunResponse)
	err := c.cc.Invoke(ctx, FrontendVirtioScsiService_StatsVirtioScsiLun_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// FrontendVirtioScsiServiceServer is the server API for FrontendVirtioScsiService service.
// All implementations must embed UnimplementedFrontendVirtioScsiServiceServer
// for forward compatibility
type FrontendVirtioScsiServiceServer interface {
	// Create an Virtio Scsi Target
	CreateVirtioScsiTarget(context.Context, *CreateVirtioScsiTargetRequest) (*VirtioScsiTarget, error)
	// Delete an Virtio Scsi Target
	DeleteVirtioScsiTarget(context.Context, *DeleteVirtioScsiTargetRequest) (*emptypb.Empty, error)
	// Update an Virtio Scsi Target
	UpdateVirtioScsiTarget(context.Context, *UpdateVirtioScsiTargetRequest) (*VirtioScsiTarget, error)
	// List Virtio Scsi Targets
	ListVirtioScsiTargets(context.Context, *ListVirtioScsiTargetsRequest) (*ListVirtioScsiTargetsResponse, error)
	// Get an Virtio Scsi Target
	GetVirtioScsiTarget(context.Context, *GetVirtioScsiTargetRequest) (*VirtioScsiTarget, error)
	// Get an Virtio Scsi Target statistics
	StatsVirtioScsiTarget(context.Context, *StatsVirtioScsiTargetRequest) (*StatsVirtioScsiTargetResponse, error)
	// Create an Virtio Scsi Controller
	CreateVirtioScsiController(context.Context, *CreateVirtioScsiControllerRequest) (*VirtioScsiController, error)
	// Delete an Virtio Scsi Controller
	DeleteVirtioScsiController(context.Context, *DeleteVirtioScsiControllerRequest) (*emptypb.Empty, error)
	// Update an Virtio Scsi Controller
	UpdateVirtioScsiController(context.Context, *UpdateVirtioScsiControllerRequest) (*VirtioScsiController, error)
	// List Virtio Scsi Controllers
	ListVirtioScsiControllers(context.Context, *ListVirtioScsiControllersRequest) (*ListVirtioScsiControllersResponse, error)
	// Get an Virtio Scsi Controller
	GetVirtioScsiController(context.Context, *GetVirtioScsiControllerRequest) (*VirtioScsiController, error)
	// Get an Virtio Scsi Controller statistics
	StatsVirtioScsiController(context.Context, *StatsVirtioScsiControllerRequest) (*StatsVirtioScsiControllerResponse, error)
	// Create an Virtio Scsi Lun
	CreateVirtioScsiLun(context.Context, *CreateVirtioScsiLunRequest) (*VirtioScsiLun, error)
	// Delete an Virtio Scsi Lun
	DeleteVirtioScsiLun(context.Context, *DeleteVirtioScsiLunRequest) (*emptypb.Empty, error)
	// Update an Virtio Scsi Lun
	UpdateVirtioScsiLun(context.Context, *UpdateVirtioScsiLunRequest) (*VirtioScsiLun, error)
	// List Virtio Scsi Luns
	ListVirtioScsiLuns(context.Context, *ListVirtioScsiLunsRequest) (*ListVirtioScsiLunsResponse, error)
	// Get an Virtio Scsi Lun
	GetVirtioScsiLun(context.Context, *GetVirtioScsiLunRequest) (*VirtioScsiLun, error)
	// Get an Virtio Scsi Lun statistics
	StatsVirtioScsiLun(context.Context, *StatsVirtioScsiLunRequest) (*StatsVirtioScsiLunResponse, error)
	mustEmbedUnimplementedFrontendVirtioScsiServiceServer()
}

// UnimplementedFrontendVirtioScsiServiceServer must be embedded to have forward compatible implementations.
type UnimplementedFrontendVirtioScsiServiceServer struct {
}

func (UnimplementedFrontendVirtioScsiServiceServer) CreateVirtioScsiTarget(context.Context, *CreateVirtioScsiTargetRequest) (*VirtioScsiTarget, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateVirtioScsiTarget not implemented")
}
func (UnimplementedFrontendVirtioScsiServiceServer) DeleteVirtioScsiTarget(context.Context, *DeleteVirtioScsiTargetRequest) (*emptypb.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DeleteVirtioScsiTarget not implemented")
}
func (UnimplementedFrontendVirtioScsiServiceServer) UpdateVirtioScsiTarget(context.Context, *UpdateVirtioScsiTargetRequest) (*VirtioScsiTarget, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateVirtioScsiTarget not implemented")
}
func (UnimplementedFrontendVirtioScsiServiceServer) ListVirtioScsiTargets(context.Context, *ListVirtioScsiTargetsRequest) (*ListVirtioScsiTargetsResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ListVirtioScsiTargets not implemented")
}
func (UnimplementedFrontendVirtioScsiServiceServer) GetVirtioScsiTarget(context.Context, *GetVirtioScsiTargetRequest) (*VirtioScsiTarget, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetVirtioScsiTarget not implemented")
}
func (UnimplementedFrontendVirtioScsiServiceServer) StatsVirtioScsiTarget(context.Context, *StatsVirtioScsiTargetRequest) (*StatsVirtioScsiTargetResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method StatsVirtioScsiTarget not implemented")
}
func (UnimplementedFrontendVirtioScsiServiceServer) CreateVirtioScsiController(context.Context, *CreateVirtioScsiControllerRequest) (*VirtioScsiController, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateVirtioScsiController not implemented")
}
func (UnimplementedFrontendVirtioScsiServiceServer) DeleteVirtioScsiController(context.Context, *DeleteVirtioScsiControllerRequest) (*emptypb.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DeleteVirtioScsiController not implemented")
}
func (UnimplementedFrontendVirtioScsiServiceServer) UpdateVirtioScsiController(context.Context, *UpdateVirtioScsiControllerRequest) (*VirtioScsiController, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateVirtioScsiController not implemented")
}
func (UnimplementedFrontendVirtioScsiServiceServer) ListVirtioScsiControllers(context.Context, *ListVirtioScsiControllersRequest) (*ListVirtioScsiControllersResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ListVirtioScsiControllers not implemented")
}
func (UnimplementedFrontendVirtioScsiServiceServer) GetVirtioScsiController(context.Context, *GetVirtioScsiControllerRequest) (*VirtioScsiController, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetVirtioScsiController not implemented")
}
func (UnimplementedFrontendVirtioScsiServiceServer) StatsVirtioScsiController(context.Context, *StatsVirtioScsiControllerRequest) (*StatsVirtioScsiControllerResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method StatsVirtioScsiController not implemented")
}
func (UnimplementedFrontendVirtioScsiServiceServer) CreateVirtioScsiLun(context.Context, *CreateVirtioScsiLunRequest) (*VirtioScsiLun, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateVirtioScsiLun not implemented")
}
func (UnimplementedFrontendVirtioScsiServiceServer) DeleteVirtioScsiLun(context.Context, *DeleteVirtioScsiLunRequest) (*emptypb.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DeleteVirtioScsiLun not implemented")
}
func (UnimplementedFrontendVirtioScsiServiceServer) UpdateVirtioScsiLun(context.Context, *UpdateVirtioScsiLunRequest) (*VirtioScsiLun, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateVirtioScsiLun not implemented")
}
func (UnimplementedFrontendVirtioScsiServiceServer) ListVirtioScsiLuns(context.Context, *ListVirtioScsiLunsRequest) (*ListVirtioScsiLunsResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ListVirtioScsiLuns not implemented")
}
func (UnimplementedFrontendVirtioScsiServiceServer) GetVirtioScsiLun(context.Context, *GetVirtioScsiLunRequest) (*VirtioScsiLun, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetVirtioScsiLun not implemented")
}
func (UnimplementedFrontendVirtioScsiServiceServer) StatsVirtioScsiLun(context.Context, *StatsVirtioScsiLunRequest) (*StatsVirtioScsiLunResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method StatsVirtioScsiLun not implemented")
}
func (UnimplementedFrontendVirtioScsiServiceServer) mustEmbedUnimplementedFrontendVirtioScsiServiceServer() {
}

// UnsafeFrontendVirtioScsiServiceServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to FrontendVirtioScsiServiceServer will
// result in compilation errors.
type UnsafeFrontendVirtioScsiServiceServer interface {
	mustEmbedUnimplementedFrontendVirtioScsiServiceServer()
}

func RegisterFrontendVirtioScsiServiceServer(s grpc.ServiceRegistrar, srv FrontendVirtioScsiServiceServer) {
	s.RegisterService(&FrontendVirtioScsiService_ServiceDesc, srv)
}

func _FrontendVirtioScsiService_CreateVirtioScsiTarget_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateVirtioScsiTargetRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FrontendVirtioScsiServiceServer).CreateVirtioScsiTarget(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: FrontendVirtioScsiService_CreateVirtioScsiTarget_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FrontendVirtioScsiServiceServer).CreateVirtioScsiTarget(ctx, req.(*CreateVirtioScsiTargetRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FrontendVirtioScsiService_DeleteVirtioScsiTarget_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DeleteVirtioScsiTargetRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FrontendVirtioScsiServiceServer).DeleteVirtioScsiTarget(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: FrontendVirtioScsiService_DeleteVirtioScsiTarget_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FrontendVirtioScsiServiceServer).DeleteVirtioScsiTarget(ctx, req.(*DeleteVirtioScsiTargetRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FrontendVirtioScsiService_UpdateVirtioScsiTarget_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateVirtioScsiTargetRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FrontendVirtioScsiServiceServer).UpdateVirtioScsiTarget(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: FrontendVirtioScsiService_UpdateVirtioScsiTarget_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FrontendVirtioScsiServiceServer).UpdateVirtioScsiTarget(ctx, req.(*UpdateVirtioScsiTargetRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FrontendVirtioScsiService_ListVirtioScsiTargets_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ListVirtioScsiTargetsRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FrontendVirtioScsiServiceServer).ListVirtioScsiTargets(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: FrontendVirtioScsiService_ListVirtioScsiTargets_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FrontendVirtioScsiServiceServer).ListVirtioScsiTargets(ctx, req.(*ListVirtioScsiTargetsRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FrontendVirtioScsiService_GetVirtioScsiTarget_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetVirtioScsiTargetRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FrontendVirtioScsiServiceServer).GetVirtioScsiTarget(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: FrontendVirtioScsiService_GetVirtioScsiTarget_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FrontendVirtioScsiServiceServer).GetVirtioScsiTarget(ctx, req.(*GetVirtioScsiTargetRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FrontendVirtioScsiService_StatsVirtioScsiTarget_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(StatsVirtioScsiTargetRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FrontendVirtioScsiServiceServer).StatsVirtioScsiTarget(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: FrontendVirtioScsiService_StatsVirtioScsiTarget_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FrontendVirtioScsiServiceServer).StatsVirtioScsiTarget(ctx, req.(*StatsVirtioScsiTargetRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FrontendVirtioScsiService_CreateVirtioScsiController_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateVirtioScsiControllerRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FrontendVirtioScsiServiceServer).CreateVirtioScsiController(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: FrontendVirtioScsiService_CreateVirtioScsiController_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FrontendVirtioScsiServiceServer).CreateVirtioScsiController(ctx, req.(*CreateVirtioScsiControllerRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FrontendVirtioScsiService_DeleteVirtioScsiController_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DeleteVirtioScsiControllerRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FrontendVirtioScsiServiceServer).DeleteVirtioScsiController(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: FrontendVirtioScsiService_DeleteVirtioScsiController_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FrontendVirtioScsiServiceServer).DeleteVirtioScsiController(ctx, req.(*DeleteVirtioScsiControllerRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FrontendVirtioScsiService_UpdateVirtioScsiController_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateVirtioScsiControllerRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FrontendVirtioScsiServiceServer).UpdateVirtioScsiController(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: FrontendVirtioScsiService_UpdateVirtioScsiController_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FrontendVirtioScsiServiceServer).UpdateVirtioScsiController(ctx, req.(*UpdateVirtioScsiControllerRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FrontendVirtioScsiService_ListVirtioScsiControllers_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ListVirtioScsiControllersRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FrontendVirtioScsiServiceServer).ListVirtioScsiControllers(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: FrontendVirtioScsiService_ListVirtioScsiControllers_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FrontendVirtioScsiServiceServer).ListVirtioScsiControllers(ctx, req.(*ListVirtioScsiControllersRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FrontendVirtioScsiService_GetVirtioScsiController_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetVirtioScsiControllerRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FrontendVirtioScsiServiceServer).GetVirtioScsiController(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: FrontendVirtioScsiService_GetVirtioScsiController_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FrontendVirtioScsiServiceServer).GetVirtioScsiController(ctx, req.(*GetVirtioScsiControllerRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FrontendVirtioScsiService_StatsVirtioScsiController_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(StatsVirtioScsiControllerRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FrontendVirtioScsiServiceServer).StatsVirtioScsiController(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: FrontendVirtioScsiService_StatsVirtioScsiController_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FrontendVirtioScsiServiceServer).StatsVirtioScsiController(ctx, req.(*StatsVirtioScsiControllerRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FrontendVirtioScsiService_CreateVirtioScsiLun_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateVirtioScsiLunRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FrontendVirtioScsiServiceServer).CreateVirtioScsiLun(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: FrontendVirtioScsiService_CreateVirtioScsiLun_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FrontendVirtioScsiServiceServer).CreateVirtioScsiLun(ctx, req.(*CreateVirtioScsiLunRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FrontendVirtioScsiService_DeleteVirtioScsiLun_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DeleteVirtioScsiLunRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FrontendVirtioScsiServiceServer).DeleteVirtioScsiLun(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: FrontendVirtioScsiService_DeleteVirtioScsiLun_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FrontendVirtioScsiServiceServer).DeleteVirtioScsiLun(ctx, req.(*DeleteVirtioScsiLunRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FrontendVirtioScsiService_UpdateVirtioScsiLun_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateVirtioScsiLunRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FrontendVirtioScsiServiceServer).UpdateVirtioScsiLun(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: FrontendVirtioScsiService_UpdateVirtioScsiLun_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FrontendVirtioScsiServiceServer).UpdateVirtioScsiLun(ctx, req.(*UpdateVirtioScsiLunRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FrontendVirtioScsiService_ListVirtioScsiLuns_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ListVirtioScsiLunsRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FrontendVirtioScsiServiceServer).ListVirtioScsiLuns(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: FrontendVirtioScsiService_ListVirtioScsiLuns_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FrontendVirtioScsiServiceServer).ListVirtioScsiLuns(ctx, req.(*ListVirtioScsiLunsRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FrontendVirtioScsiService_GetVirtioScsiLun_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetVirtioScsiLunRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FrontendVirtioScsiServiceServer).GetVirtioScsiLun(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: FrontendVirtioScsiService_GetVirtioScsiLun_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FrontendVirtioScsiServiceServer).GetVirtioScsiLun(ctx, req.(*GetVirtioScsiLunRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FrontendVirtioScsiService_StatsVirtioScsiLun_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(StatsVirtioScsiLunRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FrontendVirtioScsiServiceServer).StatsVirtioScsiLun(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: FrontendVirtioScsiService_StatsVirtioScsiLun_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FrontendVirtioScsiServiceServer).StatsVirtioScsiLun(ctx, req.(*StatsVirtioScsiLunRequest))
	}
	return interceptor(ctx, in, info, handler)
}

// FrontendVirtioScsiService_ServiceDesc is the grpc.ServiceDesc for FrontendVirtioScsiService service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var FrontendVirtioScsiService_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "opi_api.storage.v1.FrontendVirtioScsiService",
	HandlerType: (*FrontendVirtioScsiServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "CreateVirtioScsiTarget",
			Handler:    _FrontendVirtioScsiService_CreateVirtioScsiTarget_Handler,
		},
		{
			MethodName: "DeleteVirtioScsiTarget",
			Handler:    _FrontendVirtioScsiService_DeleteVirtioScsiTarget_Handler,
		},
		{
			MethodName: "UpdateVirtioScsiTarget",
			Handler:    _FrontendVirtioScsiService_UpdateVirtioScsiTarget_Handler,
		},
		{
			MethodName: "ListVirtioScsiTargets",
			Handler:    _FrontendVirtioScsiService_ListVirtioScsiTargets_Handler,
		},
		{
			MethodName: "GetVirtioScsiTarget",
			Handler:    _FrontendVirtioScsiService_GetVirtioScsiTarget_Handler,
		},
		{
			MethodName: "StatsVirtioScsiTarget",
			Handler:    _FrontendVirtioScsiService_StatsVirtioScsiTarget_Handler,
		},
		{
			MethodName: "CreateVirtioScsiController",
			Handler:    _FrontendVirtioScsiService_CreateVirtioScsiController_Handler,
		},
		{
			MethodName: "DeleteVirtioScsiController",
			Handler:    _FrontendVirtioScsiService_DeleteVirtioScsiController_Handler,
		},
		{
			MethodName: "UpdateVirtioScsiController",
			Handler:    _FrontendVirtioScsiService_UpdateVirtioScsiController_Handler,
		},
		{
			MethodName: "ListVirtioScsiControllers",
			Handler:    _FrontendVirtioScsiService_ListVirtioScsiControllers_Handler,
		},
		{
			MethodName: "GetVirtioScsiController",
			Handler:    _FrontendVirtioScsiService_GetVirtioScsiController_Handler,
		},
		{
			MethodName: "StatsVirtioScsiController",
			Handler:    _FrontendVirtioScsiService_StatsVirtioScsiController_Handler,
		},
		{
			MethodName: "CreateVirtioScsiLun",
			Handler:    _FrontendVirtioScsiService_CreateVirtioScsiLun_Handler,
		},
		{
			MethodName: "DeleteVirtioScsiLun",
			Handler:    _FrontendVirtioScsiService_DeleteVirtioScsiLun_Handler,
		},
		{
			MethodName: "UpdateVirtioScsiLun",
			Handler:    _FrontendVirtioScsiService_UpdateVirtioScsiLun_Handler,
		},
		{
			MethodName: "ListVirtioScsiLuns",
			Handler:    _FrontendVirtioScsiService_ListVirtioScsiLuns_Handler,
		},
		{
			MethodName: "GetVirtioScsiLun",
			Handler:    _FrontendVirtioScsiService_GetVirtioScsiLun_Handler,
		},
		{
			MethodName: "StatsVirtioScsiLun",
			Handler:    _FrontendVirtioScsiService_StatsVirtioScsiLun_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "frontend_virtio_scsi.proto",
}
