package opi_api.storage.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Front End (host-facing) APIs. Mostly used for Virtio-scsi emulation and host presentation as alternative to Virtio-blk.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: frontend_virtio_scsi.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FrontendVirtioScsiServiceGrpc {

  private FrontendVirtioScsiServiceGrpc() {}

  public static final String SERVICE_NAME = "opi_api.storage.v1.FrontendVirtioScsiService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.CreateVirtioScsiTargetRequest,
      opi_api.storage.v1.VirtioScsiTarget> getCreateVirtioScsiTargetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateVirtioScsiTarget",
      requestType = opi_api.storage.v1.CreateVirtioScsiTargetRequest.class,
      responseType = opi_api.storage.v1.VirtioScsiTarget.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.CreateVirtioScsiTargetRequest,
      opi_api.storage.v1.VirtioScsiTarget> getCreateVirtioScsiTargetMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.CreateVirtioScsiTargetRequest, opi_api.storage.v1.VirtioScsiTarget> getCreateVirtioScsiTargetMethod;
    if ((getCreateVirtioScsiTargetMethod = FrontendVirtioScsiServiceGrpc.getCreateVirtioScsiTargetMethod) == null) {
      synchronized (FrontendVirtioScsiServiceGrpc.class) {
        if ((getCreateVirtioScsiTargetMethod = FrontendVirtioScsiServiceGrpc.getCreateVirtioScsiTargetMethod) == null) {
          FrontendVirtioScsiServiceGrpc.getCreateVirtioScsiTargetMethod = getCreateVirtioScsiTargetMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.CreateVirtioScsiTargetRequest, opi_api.storage.v1.VirtioScsiTarget>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateVirtioScsiTarget"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.CreateVirtioScsiTargetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioScsiTarget.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioScsiServiceMethodDescriptorSupplier("CreateVirtioScsiTarget"))
              .build();
        }
      }
    }
    return getCreateVirtioScsiTargetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteVirtioScsiTargetRequest,
      com.google.protobuf.Empty> getDeleteVirtioScsiTargetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteVirtioScsiTarget",
      requestType = opi_api.storage.v1.DeleteVirtioScsiTargetRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteVirtioScsiTargetRequest,
      com.google.protobuf.Empty> getDeleteVirtioScsiTargetMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteVirtioScsiTargetRequest, com.google.protobuf.Empty> getDeleteVirtioScsiTargetMethod;
    if ((getDeleteVirtioScsiTargetMethod = FrontendVirtioScsiServiceGrpc.getDeleteVirtioScsiTargetMethod) == null) {
      synchronized (FrontendVirtioScsiServiceGrpc.class) {
        if ((getDeleteVirtioScsiTargetMethod = FrontendVirtioScsiServiceGrpc.getDeleteVirtioScsiTargetMethod) == null) {
          FrontendVirtioScsiServiceGrpc.getDeleteVirtioScsiTargetMethod = getDeleteVirtioScsiTargetMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.DeleteVirtioScsiTargetRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteVirtioScsiTarget"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.DeleteVirtioScsiTargetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioScsiServiceMethodDescriptorSupplier("DeleteVirtioScsiTarget"))
              .build();
        }
      }
    }
    return getDeleteVirtioScsiTargetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateVirtioScsiTargetRequest,
      opi_api.storage.v1.VirtioScsiTarget> getUpdateVirtioScsiTargetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateVirtioScsiTarget",
      requestType = opi_api.storage.v1.UpdateVirtioScsiTargetRequest.class,
      responseType = opi_api.storage.v1.VirtioScsiTarget.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateVirtioScsiTargetRequest,
      opi_api.storage.v1.VirtioScsiTarget> getUpdateVirtioScsiTargetMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateVirtioScsiTargetRequest, opi_api.storage.v1.VirtioScsiTarget> getUpdateVirtioScsiTargetMethod;
    if ((getUpdateVirtioScsiTargetMethod = FrontendVirtioScsiServiceGrpc.getUpdateVirtioScsiTargetMethod) == null) {
      synchronized (FrontendVirtioScsiServiceGrpc.class) {
        if ((getUpdateVirtioScsiTargetMethod = FrontendVirtioScsiServiceGrpc.getUpdateVirtioScsiTargetMethod) == null) {
          FrontendVirtioScsiServiceGrpc.getUpdateVirtioScsiTargetMethod = getUpdateVirtioScsiTargetMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.UpdateVirtioScsiTargetRequest, opi_api.storage.v1.VirtioScsiTarget>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateVirtioScsiTarget"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.UpdateVirtioScsiTargetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioScsiTarget.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioScsiServiceMethodDescriptorSupplier("UpdateVirtioScsiTarget"))
              .build();
        }
      }
    }
    return getUpdateVirtioScsiTargetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.ListVirtioScsiTargetsRequest,
      opi_api.storage.v1.ListVirtioScsiTargetsResponse> getListVirtioScsiTargetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListVirtioScsiTargets",
      requestType = opi_api.storage.v1.ListVirtioScsiTargetsRequest.class,
      responseType = opi_api.storage.v1.ListVirtioScsiTargetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.ListVirtioScsiTargetsRequest,
      opi_api.storage.v1.ListVirtioScsiTargetsResponse> getListVirtioScsiTargetsMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.ListVirtioScsiTargetsRequest, opi_api.storage.v1.ListVirtioScsiTargetsResponse> getListVirtioScsiTargetsMethod;
    if ((getListVirtioScsiTargetsMethod = FrontendVirtioScsiServiceGrpc.getListVirtioScsiTargetsMethod) == null) {
      synchronized (FrontendVirtioScsiServiceGrpc.class) {
        if ((getListVirtioScsiTargetsMethod = FrontendVirtioScsiServiceGrpc.getListVirtioScsiTargetsMethod) == null) {
          FrontendVirtioScsiServiceGrpc.getListVirtioScsiTargetsMethod = getListVirtioScsiTargetsMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.ListVirtioScsiTargetsRequest, opi_api.storage.v1.ListVirtioScsiTargetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListVirtioScsiTargets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListVirtioScsiTargetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListVirtioScsiTargetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioScsiServiceMethodDescriptorSupplier("ListVirtioScsiTargets"))
              .build();
        }
      }
    }
    return getListVirtioScsiTargetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.GetVirtioScsiTargetRequest,
      opi_api.storage.v1.VirtioScsiTarget> getGetVirtioScsiTargetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVirtioScsiTarget",
      requestType = opi_api.storage.v1.GetVirtioScsiTargetRequest.class,
      responseType = opi_api.storage.v1.VirtioScsiTarget.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.GetVirtioScsiTargetRequest,
      opi_api.storage.v1.VirtioScsiTarget> getGetVirtioScsiTargetMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.GetVirtioScsiTargetRequest, opi_api.storage.v1.VirtioScsiTarget> getGetVirtioScsiTargetMethod;
    if ((getGetVirtioScsiTargetMethod = FrontendVirtioScsiServiceGrpc.getGetVirtioScsiTargetMethod) == null) {
      synchronized (FrontendVirtioScsiServiceGrpc.class) {
        if ((getGetVirtioScsiTargetMethod = FrontendVirtioScsiServiceGrpc.getGetVirtioScsiTargetMethod) == null) {
          FrontendVirtioScsiServiceGrpc.getGetVirtioScsiTargetMethod = getGetVirtioScsiTargetMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.GetVirtioScsiTargetRequest, opi_api.storage.v1.VirtioScsiTarget>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetVirtioScsiTarget"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.GetVirtioScsiTargetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioScsiTarget.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioScsiServiceMethodDescriptorSupplier("GetVirtioScsiTarget"))
              .build();
        }
      }
    }
    return getGetVirtioScsiTargetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.StatsVirtioScsiTargetRequest,
      opi_api.storage.v1.StatsVirtioScsiTargetResponse> getStatsVirtioScsiTargetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StatsVirtioScsiTarget",
      requestType = opi_api.storage.v1.StatsVirtioScsiTargetRequest.class,
      responseType = opi_api.storage.v1.StatsVirtioScsiTargetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.StatsVirtioScsiTargetRequest,
      opi_api.storage.v1.StatsVirtioScsiTargetResponse> getStatsVirtioScsiTargetMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.StatsVirtioScsiTargetRequest, opi_api.storage.v1.StatsVirtioScsiTargetResponse> getStatsVirtioScsiTargetMethod;
    if ((getStatsVirtioScsiTargetMethod = FrontendVirtioScsiServiceGrpc.getStatsVirtioScsiTargetMethod) == null) {
      synchronized (FrontendVirtioScsiServiceGrpc.class) {
        if ((getStatsVirtioScsiTargetMethod = FrontendVirtioScsiServiceGrpc.getStatsVirtioScsiTargetMethod) == null) {
          FrontendVirtioScsiServiceGrpc.getStatsVirtioScsiTargetMethod = getStatsVirtioScsiTargetMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.StatsVirtioScsiTargetRequest, opi_api.storage.v1.StatsVirtioScsiTargetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StatsVirtioScsiTarget"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.StatsVirtioScsiTargetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.StatsVirtioScsiTargetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioScsiServiceMethodDescriptorSupplier("StatsVirtioScsiTarget"))
              .build();
        }
      }
    }
    return getStatsVirtioScsiTargetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.CreateVirtioScsiControllerRequest,
      opi_api.storage.v1.VirtioScsiController> getCreateVirtioScsiControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateVirtioScsiController",
      requestType = opi_api.storage.v1.CreateVirtioScsiControllerRequest.class,
      responseType = opi_api.storage.v1.VirtioScsiController.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.CreateVirtioScsiControllerRequest,
      opi_api.storage.v1.VirtioScsiController> getCreateVirtioScsiControllerMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.CreateVirtioScsiControllerRequest, opi_api.storage.v1.VirtioScsiController> getCreateVirtioScsiControllerMethod;
    if ((getCreateVirtioScsiControllerMethod = FrontendVirtioScsiServiceGrpc.getCreateVirtioScsiControllerMethod) == null) {
      synchronized (FrontendVirtioScsiServiceGrpc.class) {
        if ((getCreateVirtioScsiControllerMethod = FrontendVirtioScsiServiceGrpc.getCreateVirtioScsiControllerMethod) == null) {
          FrontendVirtioScsiServiceGrpc.getCreateVirtioScsiControllerMethod = getCreateVirtioScsiControllerMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.CreateVirtioScsiControllerRequest, opi_api.storage.v1.VirtioScsiController>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateVirtioScsiController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.CreateVirtioScsiControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioScsiController.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioScsiServiceMethodDescriptorSupplier("CreateVirtioScsiController"))
              .build();
        }
      }
    }
    return getCreateVirtioScsiControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteVirtioScsiControllerRequest,
      com.google.protobuf.Empty> getDeleteVirtioScsiControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteVirtioScsiController",
      requestType = opi_api.storage.v1.DeleteVirtioScsiControllerRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteVirtioScsiControllerRequest,
      com.google.protobuf.Empty> getDeleteVirtioScsiControllerMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteVirtioScsiControllerRequest, com.google.protobuf.Empty> getDeleteVirtioScsiControllerMethod;
    if ((getDeleteVirtioScsiControllerMethod = FrontendVirtioScsiServiceGrpc.getDeleteVirtioScsiControllerMethod) == null) {
      synchronized (FrontendVirtioScsiServiceGrpc.class) {
        if ((getDeleteVirtioScsiControllerMethod = FrontendVirtioScsiServiceGrpc.getDeleteVirtioScsiControllerMethod) == null) {
          FrontendVirtioScsiServiceGrpc.getDeleteVirtioScsiControllerMethod = getDeleteVirtioScsiControllerMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.DeleteVirtioScsiControllerRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteVirtioScsiController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.DeleteVirtioScsiControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioScsiServiceMethodDescriptorSupplier("DeleteVirtioScsiController"))
              .build();
        }
      }
    }
    return getDeleteVirtioScsiControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateVirtioScsiControllerRequest,
      opi_api.storage.v1.VirtioScsiController> getUpdateVirtioScsiControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateVirtioScsiController",
      requestType = opi_api.storage.v1.UpdateVirtioScsiControllerRequest.class,
      responseType = opi_api.storage.v1.VirtioScsiController.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateVirtioScsiControllerRequest,
      opi_api.storage.v1.VirtioScsiController> getUpdateVirtioScsiControllerMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateVirtioScsiControllerRequest, opi_api.storage.v1.VirtioScsiController> getUpdateVirtioScsiControllerMethod;
    if ((getUpdateVirtioScsiControllerMethod = FrontendVirtioScsiServiceGrpc.getUpdateVirtioScsiControllerMethod) == null) {
      synchronized (FrontendVirtioScsiServiceGrpc.class) {
        if ((getUpdateVirtioScsiControllerMethod = FrontendVirtioScsiServiceGrpc.getUpdateVirtioScsiControllerMethod) == null) {
          FrontendVirtioScsiServiceGrpc.getUpdateVirtioScsiControllerMethod = getUpdateVirtioScsiControllerMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.UpdateVirtioScsiControllerRequest, opi_api.storage.v1.VirtioScsiController>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateVirtioScsiController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.UpdateVirtioScsiControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioScsiController.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioScsiServiceMethodDescriptorSupplier("UpdateVirtioScsiController"))
              .build();
        }
      }
    }
    return getUpdateVirtioScsiControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.ListVirtioScsiControllersRequest,
      opi_api.storage.v1.ListVirtioScsiControllersResponse> getListVirtioScsiControllersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListVirtioScsiControllers",
      requestType = opi_api.storage.v1.ListVirtioScsiControllersRequest.class,
      responseType = opi_api.storage.v1.ListVirtioScsiControllersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.ListVirtioScsiControllersRequest,
      opi_api.storage.v1.ListVirtioScsiControllersResponse> getListVirtioScsiControllersMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.ListVirtioScsiControllersRequest, opi_api.storage.v1.ListVirtioScsiControllersResponse> getListVirtioScsiControllersMethod;
    if ((getListVirtioScsiControllersMethod = FrontendVirtioScsiServiceGrpc.getListVirtioScsiControllersMethod) == null) {
      synchronized (FrontendVirtioScsiServiceGrpc.class) {
        if ((getListVirtioScsiControllersMethod = FrontendVirtioScsiServiceGrpc.getListVirtioScsiControllersMethod) == null) {
          FrontendVirtioScsiServiceGrpc.getListVirtioScsiControllersMethod = getListVirtioScsiControllersMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.ListVirtioScsiControllersRequest, opi_api.storage.v1.ListVirtioScsiControllersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListVirtioScsiControllers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListVirtioScsiControllersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListVirtioScsiControllersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioScsiServiceMethodDescriptorSupplier("ListVirtioScsiControllers"))
              .build();
        }
      }
    }
    return getListVirtioScsiControllersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.GetVirtioScsiControllerRequest,
      opi_api.storage.v1.VirtioScsiController> getGetVirtioScsiControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVirtioScsiController",
      requestType = opi_api.storage.v1.GetVirtioScsiControllerRequest.class,
      responseType = opi_api.storage.v1.VirtioScsiController.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.GetVirtioScsiControllerRequest,
      opi_api.storage.v1.VirtioScsiController> getGetVirtioScsiControllerMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.GetVirtioScsiControllerRequest, opi_api.storage.v1.VirtioScsiController> getGetVirtioScsiControllerMethod;
    if ((getGetVirtioScsiControllerMethod = FrontendVirtioScsiServiceGrpc.getGetVirtioScsiControllerMethod) == null) {
      synchronized (FrontendVirtioScsiServiceGrpc.class) {
        if ((getGetVirtioScsiControllerMethod = FrontendVirtioScsiServiceGrpc.getGetVirtioScsiControllerMethod) == null) {
          FrontendVirtioScsiServiceGrpc.getGetVirtioScsiControllerMethod = getGetVirtioScsiControllerMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.GetVirtioScsiControllerRequest, opi_api.storage.v1.VirtioScsiController>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetVirtioScsiController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.GetVirtioScsiControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioScsiController.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioScsiServiceMethodDescriptorSupplier("GetVirtioScsiController"))
              .build();
        }
      }
    }
    return getGetVirtioScsiControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.StatsVirtioScsiControllerRequest,
      opi_api.storage.v1.StatsVirtioScsiControllerResponse> getStatsVirtioScsiControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StatsVirtioScsiController",
      requestType = opi_api.storage.v1.StatsVirtioScsiControllerRequest.class,
      responseType = opi_api.storage.v1.StatsVirtioScsiControllerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.StatsVirtioScsiControllerRequest,
      opi_api.storage.v1.StatsVirtioScsiControllerResponse> getStatsVirtioScsiControllerMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.StatsVirtioScsiControllerRequest, opi_api.storage.v1.StatsVirtioScsiControllerResponse> getStatsVirtioScsiControllerMethod;
    if ((getStatsVirtioScsiControllerMethod = FrontendVirtioScsiServiceGrpc.getStatsVirtioScsiControllerMethod) == null) {
      synchronized (FrontendVirtioScsiServiceGrpc.class) {
        if ((getStatsVirtioScsiControllerMethod = FrontendVirtioScsiServiceGrpc.getStatsVirtioScsiControllerMethod) == null) {
          FrontendVirtioScsiServiceGrpc.getStatsVirtioScsiControllerMethod = getStatsVirtioScsiControllerMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.StatsVirtioScsiControllerRequest, opi_api.storage.v1.StatsVirtioScsiControllerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StatsVirtioScsiController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.StatsVirtioScsiControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.StatsVirtioScsiControllerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioScsiServiceMethodDescriptorSupplier("StatsVirtioScsiController"))
              .build();
        }
      }
    }
    return getStatsVirtioScsiControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.CreateVirtioScsiLunRequest,
      opi_api.storage.v1.VirtioScsiLun> getCreateVirtioScsiLunMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateVirtioScsiLun",
      requestType = opi_api.storage.v1.CreateVirtioScsiLunRequest.class,
      responseType = opi_api.storage.v1.VirtioScsiLun.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.CreateVirtioScsiLunRequest,
      opi_api.storage.v1.VirtioScsiLun> getCreateVirtioScsiLunMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.CreateVirtioScsiLunRequest, opi_api.storage.v1.VirtioScsiLun> getCreateVirtioScsiLunMethod;
    if ((getCreateVirtioScsiLunMethod = FrontendVirtioScsiServiceGrpc.getCreateVirtioScsiLunMethod) == null) {
      synchronized (FrontendVirtioScsiServiceGrpc.class) {
        if ((getCreateVirtioScsiLunMethod = FrontendVirtioScsiServiceGrpc.getCreateVirtioScsiLunMethod) == null) {
          FrontendVirtioScsiServiceGrpc.getCreateVirtioScsiLunMethod = getCreateVirtioScsiLunMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.CreateVirtioScsiLunRequest, opi_api.storage.v1.VirtioScsiLun>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateVirtioScsiLun"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.CreateVirtioScsiLunRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioScsiLun.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioScsiServiceMethodDescriptorSupplier("CreateVirtioScsiLun"))
              .build();
        }
      }
    }
    return getCreateVirtioScsiLunMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteVirtioScsiLunRequest,
      com.google.protobuf.Empty> getDeleteVirtioScsiLunMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteVirtioScsiLun",
      requestType = opi_api.storage.v1.DeleteVirtioScsiLunRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteVirtioScsiLunRequest,
      com.google.protobuf.Empty> getDeleteVirtioScsiLunMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteVirtioScsiLunRequest, com.google.protobuf.Empty> getDeleteVirtioScsiLunMethod;
    if ((getDeleteVirtioScsiLunMethod = FrontendVirtioScsiServiceGrpc.getDeleteVirtioScsiLunMethod) == null) {
      synchronized (FrontendVirtioScsiServiceGrpc.class) {
        if ((getDeleteVirtioScsiLunMethod = FrontendVirtioScsiServiceGrpc.getDeleteVirtioScsiLunMethod) == null) {
          FrontendVirtioScsiServiceGrpc.getDeleteVirtioScsiLunMethod = getDeleteVirtioScsiLunMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.DeleteVirtioScsiLunRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteVirtioScsiLun"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.DeleteVirtioScsiLunRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioScsiServiceMethodDescriptorSupplier("DeleteVirtioScsiLun"))
              .build();
        }
      }
    }
    return getDeleteVirtioScsiLunMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateVirtioScsiLunRequest,
      opi_api.storage.v1.VirtioScsiLun> getUpdateVirtioScsiLunMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateVirtioScsiLun",
      requestType = opi_api.storage.v1.UpdateVirtioScsiLunRequest.class,
      responseType = opi_api.storage.v1.VirtioScsiLun.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateVirtioScsiLunRequest,
      opi_api.storage.v1.VirtioScsiLun> getUpdateVirtioScsiLunMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateVirtioScsiLunRequest, opi_api.storage.v1.VirtioScsiLun> getUpdateVirtioScsiLunMethod;
    if ((getUpdateVirtioScsiLunMethod = FrontendVirtioScsiServiceGrpc.getUpdateVirtioScsiLunMethod) == null) {
      synchronized (FrontendVirtioScsiServiceGrpc.class) {
        if ((getUpdateVirtioScsiLunMethod = FrontendVirtioScsiServiceGrpc.getUpdateVirtioScsiLunMethod) == null) {
          FrontendVirtioScsiServiceGrpc.getUpdateVirtioScsiLunMethod = getUpdateVirtioScsiLunMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.UpdateVirtioScsiLunRequest, opi_api.storage.v1.VirtioScsiLun>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateVirtioScsiLun"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.UpdateVirtioScsiLunRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioScsiLun.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioScsiServiceMethodDescriptorSupplier("UpdateVirtioScsiLun"))
              .build();
        }
      }
    }
    return getUpdateVirtioScsiLunMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.ListVirtioScsiLunsRequest,
      opi_api.storage.v1.ListVirtioScsiLunsResponse> getListVirtioScsiLunsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListVirtioScsiLuns",
      requestType = opi_api.storage.v1.ListVirtioScsiLunsRequest.class,
      responseType = opi_api.storage.v1.ListVirtioScsiLunsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.ListVirtioScsiLunsRequest,
      opi_api.storage.v1.ListVirtioScsiLunsResponse> getListVirtioScsiLunsMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.ListVirtioScsiLunsRequest, opi_api.storage.v1.ListVirtioScsiLunsResponse> getListVirtioScsiLunsMethod;
    if ((getListVirtioScsiLunsMethod = FrontendVirtioScsiServiceGrpc.getListVirtioScsiLunsMethod) == null) {
      synchronized (FrontendVirtioScsiServiceGrpc.class) {
        if ((getListVirtioScsiLunsMethod = FrontendVirtioScsiServiceGrpc.getListVirtioScsiLunsMethod) == null) {
          FrontendVirtioScsiServiceGrpc.getListVirtioScsiLunsMethod = getListVirtioScsiLunsMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.ListVirtioScsiLunsRequest, opi_api.storage.v1.ListVirtioScsiLunsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListVirtioScsiLuns"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListVirtioScsiLunsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListVirtioScsiLunsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioScsiServiceMethodDescriptorSupplier("ListVirtioScsiLuns"))
              .build();
        }
      }
    }
    return getListVirtioScsiLunsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.GetVirtioScsiLunRequest,
      opi_api.storage.v1.VirtioScsiLun> getGetVirtioScsiLunMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVirtioScsiLun",
      requestType = opi_api.storage.v1.GetVirtioScsiLunRequest.class,
      responseType = opi_api.storage.v1.VirtioScsiLun.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.GetVirtioScsiLunRequest,
      opi_api.storage.v1.VirtioScsiLun> getGetVirtioScsiLunMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.GetVirtioScsiLunRequest, opi_api.storage.v1.VirtioScsiLun> getGetVirtioScsiLunMethod;
    if ((getGetVirtioScsiLunMethod = FrontendVirtioScsiServiceGrpc.getGetVirtioScsiLunMethod) == null) {
      synchronized (FrontendVirtioScsiServiceGrpc.class) {
        if ((getGetVirtioScsiLunMethod = FrontendVirtioScsiServiceGrpc.getGetVirtioScsiLunMethod) == null) {
          FrontendVirtioScsiServiceGrpc.getGetVirtioScsiLunMethod = getGetVirtioScsiLunMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.GetVirtioScsiLunRequest, opi_api.storage.v1.VirtioScsiLun>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetVirtioScsiLun"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.GetVirtioScsiLunRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioScsiLun.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioScsiServiceMethodDescriptorSupplier("GetVirtioScsiLun"))
              .build();
        }
      }
    }
    return getGetVirtioScsiLunMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.StatsVirtioScsiLunRequest,
      opi_api.storage.v1.StatsVirtioScsiLunResponse> getStatsVirtioScsiLunMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StatsVirtioScsiLun",
      requestType = opi_api.storage.v1.StatsVirtioScsiLunRequest.class,
      responseType = opi_api.storage.v1.StatsVirtioScsiLunResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.StatsVirtioScsiLunRequest,
      opi_api.storage.v1.StatsVirtioScsiLunResponse> getStatsVirtioScsiLunMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.StatsVirtioScsiLunRequest, opi_api.storage.v1.StatsVirtioScsiLunResponse> getStatsVirtioScsiLunMethod;
    if ((getStatsVirtioScsiLunMethod = FrontendVirtioScsiServiceGrpc.getStatsVirtioScsiLunMethod) == null) {
      synchronized (FrontendVirtioScsiServiceGrpc.class) {
        if ((getStatsVirtioScsiLunMethod = FrontendVirtioScsiServiceGrpc.getStatsVirtioScsiLunMethod) == null) {
          FrontendVirtioScsiServiceGrpc.getStatsVirtioScsiLunMethod = getStatsVirtioScsiLunMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.StatsVirtioScsiLunRequest, opi_api.storage.v1.StatsVirtioScsiLunResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StatsVirtioScsiLun"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.StatsVirtioScsiLunRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.StatsVirtioScsiLunResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioScsiServiceMethodDescriptorSupplier("StatsVirtioScsiLun"))
              .build();
        }
      }
    }
    return getStatsVirtioScsiLunMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FrontendVirtioScsiServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FrontendVirtioScsiServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FrontendVirtioScsiServiceStub>() {
        @java.lang.Override
        public FrontendVirtioScsiServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FrontendVirtioScsiServiceStub(channel, callOptions);
        }
      };
    return FrontendVirtioScsiServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FrontendVirtioScsiServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FrontendVirtioScsiServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FrontendVirtioScsiServiceBlockingStub>() {
        @java.lang.Override
        public FrontendVirtioScsiServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FrontendVirtioScsiServiceBlockingStub(channel, callOptions);
        }
      };
    return FrontendVirtioScsiServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FrontendVirtioScsiServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FrontendVirtioScsiServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FrontendVirtioScsiServiceFutureStub>() {
        @java.lang.Override
        public FrontendVirtioScsiServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FrontendVirtioScsiServiceFutureStub(channel, callOptions);
        }
      };
    return FrontendVirtioScsiServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Front End (host-facing) APIs. Mostly used for Virtio-scsi emulation and host presentation as alternative to Virtio-blk.
   * </pre>
   */
  public static abstract class FrontendVirtioScsiServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create an Virtio Scsi Target
     * </pre>
     */
    public void createVirtioScsiTarget(opi_api.storage.v1.CreateVirtioScsiTargetRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiTarget> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateVirtioScsiTargetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an Virtio Scsi Target
     * </pre>
     */
    public void deleteVirtioScsiTarget(opi_api.storage.v1.DeleteVirtioScsiTargetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteVirtioScsiTargetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an Virtio Scsi Target
     * </pre>
     */
    public void updateVirtioScsiTarget(opi_api.storage.v1.UpdateVirtioScsiTargetRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiTarget> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateVirtioScsiTargetMethod(), responseObserver);
    }

    /**
     * <pre>
     * List Virtio Scsi Targets
     * </pre>
     */
    public void listVirtioScsiTargets(opi_api.storage.v1.ListVirtioScsiTargetsRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListVirtioScsiTargetsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListVirtioScsiTargetsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an Virtio Scsi Target
     * </pre>
     */
    public void getVirtioScsiTarget(opi_api.storage.v1.GetVirtioScsiTargetRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiTarget> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVirtioScsiTargetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an Virtio Scsi Target statistics
     * </pre>
     */
    public void statsVirtioScsiTarget(opi_api.storage.v1.StatsVirtioScsiTargetRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.StatsVirtioScsiTargetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStatsVirtioScsiTargetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create an Virtio Scsi Controller
     * </pre>
     */
    public void createVirtioScsiController(opi_api.storage.v1.CreateVirtioScsiControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiController> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateVirtioScsiControllerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an Virtio Scsi Controller
     * </pre>
     */
    public void deleteVirtioScsiController(opi_api.storage.v1.DeleteVirtioScsiControllerRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteVirtioScsiControllerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an Virtio Scsi Controller
     * </pre>
     */
    public void updateVirtioScsiController(opi_api.storage.v1.UpdateVirtioScsiControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiController> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateVirtioScsiControllerMethod(), responseObserver);
    }

    /**
     * <pre>
     * List Virtio Scsi Controllers
     * </pre>
     */
    public void listVirtioScsiControllers(opi_api.storage.v1.ListVirtioScsiControllersRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListVirtioScsiControllersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListVirtioScsiControllersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an Virtio Scsi Controller
     * </pre>
     */
    public void getVirtioScsiController(opi_api.storage.v1.GetVirtioScsiControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiController> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVirtioScsiControllerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an Virtio Scsi Controller statistics
     * </pre>
     */
    public void statsVirtioScsiController(opi_api.storage.v1.StatsVirtioScsiControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.StatsVirtioScsiControllerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStatsVirtioScsiControllerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create an Virtio Scsi Lun
     * </pre>
     */
    public void createVirtioScsiLun(opi_api.storage.v1.CreateVirtioScsiLunRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiLun> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateVirtioScsiLunMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an Virtio Scsi Lun
     * </pre>
     */
    public void deleteVirtioScsiLun(opi_api.storage.v1.DeleteVirtioScsiLunRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteVirtioScsiLunMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an Virtio Scsi Lun
     * </pre>
     */
    public void updateVirtioScsiLun(opi_api.storage.v1.UpdateVirtioScsiLunRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiLun> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateVirtioScsiLunMethod(), responseObserver);
    }

    /**
     * <pre>
     * List Virtio Scsi Luns
     * </pre>
     */
    public void listVirtioScsiLuns(opi_api.storage.v1.ListVirtioScsiLunsRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListVirtioScsiLunsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListVirtioScsiLunsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an Virtio Scsi Lun
     * </pre>
     */
    public void getVirtioScsiLun(opi_api.storage.v1.GetVirtioScsiLunRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiLun> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVirtioScsiLunMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an Virtio Scsi Lun statistics
     * </pre>
     */
    public void statsVirtioScsiLun(opi_api.storage.v1.StatsVirtioScsiLunRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.StatsVirtioScsiLunResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStatsVirtioScsiLunMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateVirtioScsiTargetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.CreateVirtioScsiTargetRequest,
                opi_api.storage.v1.VirtioScsiTarget>(
                  this, METHODID_CREATE_VIRTIO_SCSI_TARGET)))
          .addMethod(
            getDeleteVirtioScsiTargetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.DeleteVirtioScsiTargetRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_VIRTIO_SCSI_TARGET)))
          .addMethod(
            getUpdateVirtioScsiTargetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.UpdateVirtioScsiTargetRequest,
                opi_api.storage.v1.VirtioScsiTarget>(
                  this, METHODID_UPDATE_VIRTIO_SCSI_TARGET)))
          .addMethod(
            getListVirtioScsiTargetsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.ListVirtioScsiTargetsRequest,
                opi_api.storage.v1.ListVirtioScsiTargetsResponse>(
                  this, METHODID_LIST_VIRTIO_SCSI_TARGETS)))
          .addMethod(
            getGetVirtioScsiTargetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.GetVirtioScsiTargetRequest,
                opi_api.storage.v1.VirtioScsiTarget>(
                  this, METHODID_GET_VIRTIO_SCSI_TARGET)))
          .addMethod(
            getStatsVirtioScsiTargetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.StatsVirtioScsiTargetRequest,
                opi_api.storage.v1.StatsVirtioScsiTargetResponse>(
                  this, METHODID_STATS_VIRTIO_SCSI_TARGET)))
          .addMethod(
            getCreateVirtioScsiControllerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.CreateVirtioScsiControllerRequest,
                opi_api.storage.v1.VirtioScsiController>(
                  this, METHODID_CREATE_VIRTIO_SCSI_CONTROLLER)))
          .addMethod(
            getDeleteVirtioScsiControllerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.DeleteVirtioScsiControllerRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_VIRTIO_SCSI_CONTROLLER)))
          .addMethod(
            getUpdateVirtioScsiControllerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.UpdateVirtioScsiControllerRequest,
                opi_api.storage.v1.VirtioScsiController>(
                  this, METHODID_UPDATE_VIRTIO_SCSI_CONTROLLER)))
          .addMethod(
            getListVirtioScsiControllersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.ListVirtioScsiControllersRequest,
                opi_api.storage.v1.ListVirtioScsiControllersResponse>(
                  this, METHODID_LIST_VIRTIO_SCSI_CONTROLLERS)))
          .addMethod(
            getGetVirtioScsiControllerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.GetVirtioScsiControllerRequest,
                opi_api.storage.v1.VirtioScsiController>(
                  this, METHODID_GET_VIRTIO_SCSI_CONTROLLER)))
          .addMethod(
            getStatsVirtioScsiControllerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.StatsVirtioScsiControllerRequest,
                opi_api.storage.v1.StatsVirtioScsiControllerResponse>(
                  this, METHODID_STATS_VIRTIO_SCSI_CONTROLLER)))
          .addMethod(
            getCreateVirtioScsiLunMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.CreateVirtioScsiLunRequest,
                opi_api.storage.v1.VirtioScsiLun>(
                  this, METHODID_CREATE_VIRTIO_SCSI_LUN)))
          .addMethod(
            getDeleteVirtioScsiLunMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.DeleteVirtioScsiLunRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_VIRTIO_SCSI_LUN)))
          .addMethod(
            getUpdateVirtioScsiLunMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.UpdateVirtioScsiLunRequest,
                opi_api.storage.v1.VirtioScsiLun>(
                  this, METHODID_UPDATE_VIRTIO_SCSI_LUN)))
          .addMethod(
            getListVirtioScsiLunsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.ListVirtioScsiLunsRequest,
                opi_api.storage.v1.ListVirtioScsiLunsResponse>(
                  this, METHODID_LIST_VIRTIO_SCSI_LUNS)))
          .addMethod(
            getGetVirtioScsiLunMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.GetVirtioScsiLunRequest,
                opi_api.storage.v1.VirtioScsiLun>(
                  this, METHODID_GET_VIRTIO_SCSI_LUN)))
          .addMethod(
            getStatsVirtioScsiLunMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.StatsVirtioScsiLunRequest,
                opi_api.storage.v1.StatsVirtioScsiLunResponse>(
                  this, METHODID_STATS_VIRTIO_SCSI_LUN)))
          .build();
    }
  }

  /**
   * <pre>
   * Front End (host-facing) APIs. Mostly used for Virtio-scsi emulation and host presentation as alternative to Virtio-blk.
   * </pre>
   */
  public static final class FrontendVirtioScsiServiceStub extends io.grpc.stub.AbstractAsyncStub<FrontendVirtioScsiServiceStub> {
    private FrontendVirtioScsiServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FrontendVirtioScsiServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FrontendVirtioScsiServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an Virtio Scsi Target
     * </pre>
     */
    public void createVirtioScsiTarget(opi_api.storage.v1.CreateVirtioScsiTargetRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiTarget> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateVirtioScsiTargetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an Virtio Scsi Target
     * </pre>
     */
    public void deleteVirtioScsiTarget(opi_api.storage.v1.DeleteVirtioScsiTargetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteVirtioScsiTargetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an Virtio Scsi Target
     * </pre>
     */
    public void updateVirtioScsiTarget(opi_api.storage.v1.UpdateVirtioScsiTargetRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiTarget> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateVirtioScsiTargetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List Virtio Scsi Targets
     * </pre>
     */
    public void listVirtioScsiTargets(opi_api.storage.v1.ListVirtioScsiTargetsRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListVirtioScsiTargetsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListVirtioScsiTargetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an Virtio Scsi Target
     * </pre>
     */
    public void getVirtioScsiTarget(opi_api.storage.v1.GetVirtioScsiTargetRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiTarget> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVirtioScsiTargetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an Virtio Scsi Target statistics
     * </pre>
     */
    public void statsVirtioScsiTarget(opi_api.storage.v1.StatsVirtioScsiTargetRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.StatsVirtioScsiTargetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStatsVirtioScsiTargetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create an Virtio Scsi Controller
     * </pre>
     */
    public void createVirtioScsiController(opi_api.storage.v1.CreateVirtioScsiControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiController> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateVirtioScsiControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an Virtio Scsi Controller
     * </pre>
     */
    public void deleteVirtioScsiController(opi_api.storage.v1.DeleteVirtioScsiControllerRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteVirtioScsiControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an Virtio Scsi Controller
     * </pre>
     */
    public void updateVirtioScsiController(opi_api.storage.v1.UpdateVirtioScsiControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiController> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateVirtioScsiControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List Virtio Scsi Controllers
     * </pre>
     */
    public void listVirtioScsiControllers(opi_api.storage.v1.ListVirtioScsiControllersRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListVirtioScsiControllersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListVirtioScsiControllersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an Virtio Scsi Controller
     * </pre>
     */
    public void getVirtioScsiController(opi_api.storage.v1.GetVirtioScsiControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiController> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVirtioScsiControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an Virtio Scsi Controller statistics
     * </pre>
     */
    public void statsVirtioScsiController(opi_api.storage.v1.StatsVirtioScsiControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.StatsVirtioScsiControllerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStatsVirtioScsiControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create an Virtio Scsi Lun
     * </pre>
     */
    public void createVirtioScsiLun(opi_api.storage.v1.CreateVirtioScsiLunRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiLun> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateVirtioScsiLunMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an Virtio Scsi Lun
     * </pre>
     */
    public void deleteVirtioScsiLun(opi_api.storage.v1.DeleteVirtioScsiLunRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteVirtioScsiLunMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an Virtio Scsi Lun
     * </pre>
     */
    public void updateVirtioScsiLun(opi_api.storage.v1.UpdateVirtioScsiLunRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiLun> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateVirtioScsiLunMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List Virtio Scsi Luns
     * </pre>
     */
    public void listVirtioScsiLuns(opi_api.storage.v1.ListVirtioScsiLunsRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListVirtioScsiLunsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListVirtioScsiLunsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an Virtio Scsi Lun
     * </pre>
     */
    public void getVirtioScsiLun(opi_api.storage.v1.GetVirtioScsiLunRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiLun> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVirtioScsiLunMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an Virtio Scsi Lun statistics
     * </pre>
     */
    public void statsVirtioScsiLun(opi_api.storage.v1.StatsVirtioScsiLunRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.StatsVirtioScsiLunResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStatsVirtioScsiLunMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Front End (host-facing) APIs. Mostly used for Virtio-scsi emulation and host presentation as alternative to Virtio-blk.
   * </pre>
   */
  public static final class FrontendVirtioScsiServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<FrontendVirtioScsiServiceBlockingStub> {
    private FrontendVirtioScsiServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FrontendVirtioScsiServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FrontendVirtioScsiServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an Virtio Scsi Target
     * </pre>
     */
    public opi_api.storage.v1.VirtioScsiTarget createVirtioScsiTarget(opi_api.storage.v1.CreateVirtioScsiTargetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateVirtioScsiTargetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an Virtio Scsi Target
     * </pre>
     */
    public com.google.protobuf.Empty deleteVirtioScsiTarget(opi_api.storage.v1.DeleteVirtioScsiTargetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteVirtioScsiTargetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an Virtio Scsi Target
     * </pre>
     */
    public opi_api.storage.v1.VirtioScsiTarget updateVirtioScsiTarget(opi_api.storage.v1.UpdateVirtioScsiTargetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateVirtioScsiTargetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List Virtio Scsi Targets
     * </pre>
     */
    public opi_api.storage.v1.ListVirtioScsiTargetsResponse listVirtioScsiTargets(opi_api.storage.v1.ListVirtioScsiTargetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListVirtioScsiTargetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an Virtio Scsi Target
     * </pre>
     */
    public opi_api.storage.v1.VirtioScsiTarget getVirtioScsiTarget(opi_api.storage.v1.GetVirtioScsiTargetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVirtioScsiTargetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an Virtio Scsi Target statistics
     * </pre>
     */
    public opi_api.storage.v1.StatsVirtioScsiTargetResponse statsVirtioScsiTarget(opi_api.storage.v1.StatsVirtioScsiTargetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStatsVirtioScsiTargetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create an Virtio Scsi Controller
     * </pre>
     */
    public opi_api.storage.v1.VirtioScsiController createVirtioScsiController(opi_api.storage.v1.CreateVirtioScsiControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateVirtioScsiControllerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an Virtio Scsi Controller
     * </pre>
     */
    public com.google.protobuf.Empty deleteVirtioScsiController(opi_api.storage.v1.DeleteVirtioScsiControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteVirtioScsiControllerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an Virtio Scsi Controller
     * </pre>
     */
    public opi_api.storage.v1.VirtioScsiController updateVirtioScsiController(opi_api.storage.v1.UpdateVirtioScsiControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateVirtioScsiControllerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List Virtio Scsi Controllers
     * </pre>
     */
    public opi_api.storage.v1.ListVirtioScsiControllersResponse listVirtioScsiControllers(opi_api.storage.v1.ListVirtioScsiControllersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListVirtioScsiControllersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an Virtio Scsi Controller
     * </pre>
     */
    public opi_api.storage.v1.VirtioScsiController getVirtioScsiController(opi_api.storage.v1.GetVirtioScsiControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVirtioScsiControllerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an Virtio Scsi Controller statistics
     * </pre>
     */
    public opi_api.storage.v1.StatsVirtioScsiControllerResponse statsVirtioScsiController(opi_api.storage.v1.StatsVirtioScsiControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStatsVirtioScsiControllerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create an Virtio Scsi Lun
     * </pre>
     */
    public opi_api.storage.v1.VirtioScsiLun createVirtioScsiLun(opi_api.storage.v1.CreateVirtioScsiLunRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateVirtioScsiLunMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an Virtio Scsi Lun
     * </pre>
     */
    public com.google.protobuf.Empty deleteVirtioScsiLun(opi_api.storage.v1.DeleteVirtioScsiLunRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteVirtioScsiLunMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an Virtio Scsi Lun
     * </pre>
     */
    public opi_api.storage.v1.VirtioScsiLun updateVirtioScsiLun(opi_api.storage.v1.UpdateVirtioScsiLunRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateVirtioScsiLunMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List Virtio Scsi Luns
     * </pre>
     */
    public opi_api.storage.v1.ListVirtioScsiLunsResponse listVirtioScsiLuns(opi_api.storage.v1.ListVirtioScsiLunsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListVirtioScsiLunsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an Virtio Scsi Lun
     * </pre>
     */
    public opi_api.storage.v1.VirtioScsiLun getVirtioScsiLun(opi_api.storage.v1.GetVirtioScsiLunRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVirtioScsiLunMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an Virtio Scsi Lun statistics
     * </pre>
     */
    public opi_api.storage.v1.StatsVirtioScsiLunResponse statsVirtioScsiLun(opi_api.storage.v1.StatsVirtioScsiLunRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStatsVirtioScsiLunMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Front End (host-facing) APIs. Mostly used for Virtio-scsi emulation and host presentation as alternative to Virtio-blk.
   * </pre>
   */
  public static final class FrontendVirtioScsiServiceFutureStub extends io.grpc.stub.AbstractFutureStub<FrontendVirtioScsiServiceFutureStub> {
    private FrontendVirtioScsiServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FrontendVirtioScsiServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FrontendVirtioScsiServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an Virtio Scsi Target
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.VirtioScsiTarget> createVirtioScsiTarget(
        opi_api.storage.v1.CreateVirtioScsiTargetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateVirtioScsiTargetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an Virtio Scsi Target
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteVirtioScsiTarget(
        opi_api.storage.v1.DeleteVirtioScsiTargetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteVirtioScsiTargetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an Virtio Scsi Target
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.VirtioScsiTarget> updateVirtioScsiTarget(
        opi_api.storage.v1.UpdateVirtioScsiTargetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateVirtioScsiTargetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List Virtio Scsi Targets
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.ListVirtioScsiTargetsResponse> listVirtioScsiTargets(
        opi_api.storage.v1.ListVirtioScsiTargetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListVirtioScsiTargetsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an Virtio Scsi Target
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.VirtioScsiTarget> getVirtioScsiTarget(
        opi_api.storage.v1.GetVirtioScsiTargetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVirtioScsiTargetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an Virtio Scsi Target statistics
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.StatsVirtioScsiTargetResponse> statsVirtioScsiTarget(
        opi_api.storage.v1.StatsVirtioScsiTargetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStatsVirtioScsiTargetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create an Virtio Scsi Controller
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.VirtioScsiController> createVirtioScsiController(
        opi_api.storage.v1.CreateVirtioScsiControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateVirtioScsiControllerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an Virtio Scsi Controller
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteVirtioScsiController(
        opi_api.storage.v1.DeleteVirtioScsiControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteVirtioScsiControllerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an Virtio Scsi Controller
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.VirtioScsiController> updateVirtioScsiController(
        opi_api.storage.v1.UpdateVirtioScsiControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateVirtioScsiControllerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List Virtio Scsi Controllers
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.ListVirtioScsiControllersResponse> listVirtioScsiControllers(
        opi_api.storage.v1.ListVirtioScsiControllersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListVirtioScsiControllersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an Virtio Scsi Controller
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.VirtioScsiController> getVirtioScsiController(
        opi_api.storage.v1.GetVirtioScsiControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVirtioScsiControllerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an Virtio Scsi Controller statistics
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.StatsVirtioScsiControllerResponse> statsVirtioScsiController(
        opi_api.storage.v1.StatsVirtioScsiControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStatsVirtioScsiControllerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create an Virtio Scsi Lun
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.VirtioScsiLun> createVirtioScsiLun(
        opi_api.storage.v1.CreateVirtioScsiLunRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateVirtioScsiLunMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an Virtio Scsi Lun
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteVirtioScsiLun(
        opi_api.storage.v1.DeleteVirtioScsiLunRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteVirtioScsiLunMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an Virtio Scsi Lun
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.VirtioScsiLun> updateVirtioScsiLun(
        opi_api.storage.v1.UpdateVirtioScsiLunRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateVirtioScsiLunMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List Virtio Scsi Luns
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.ListVirtioScsiLunsResponse> listVirtioScsiLuns(
        opi_api.storage.v1.ListVirtioScsiLunsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListVirtioScsiLunsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an Virtio Scsi Lun
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.VirtioScsiLun> getVirtioScsiLun(
        opi_api.storage.v1.GetVirtioScsiLunRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVirtioScsiLunMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an Virtio Scsi Lun statistics
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.StatsVirtioScsiLunResponse> statsVirtioScsiLun(
        opi_api.storage.v1.StatsVirtioScsiLunRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStatsVirtioScsiLunMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_VIRTIO_SCSI_TARGET = 0;
  private static final int METHODID_DELETE_VIRTIO_SCSI_TARGET = 1;
  private static final int METHODID_UPDATE_VIRTIO_SCSI_TARGET = 2;
  private static final int METHODID_LIST_VIRTIO_SCSI_TARGETS = 3;
  private static final int METHODID_GET_VIRTIO_SCSI_TARGET = 4;
  private static final int METHODID_STATS_VIRTIO_SCSI_TARGET = 5;
  private static final int METHODID_CREATE_VIRTIO_SCSI_CONTROLLER = 6;
  private static final int METHODID_DELETE_VIRTIO_SCSI_CONTROLLER = 7;
  private static final int METHODID_UPDATE_VIRTIO_SCSI_CONTROLLER = 8;
  private static final int METHODID_LIST_VIRTIO_SCSI_CONTROLLERS = 9;
  private static final int METHODID_GET_VIRTIO_SCSI_CONTROLLER = 10;
  private static final int METHODID_STATS_VIRTIO_SCSI_CONTROLLER = 11;
  private static final int METHODID_CREATE_VIRTIO_SCSI_LUN = 12;
  private static final int METHODID_DELETE_VIRTIO_SCSI_LUN = 13;
  private static final int METHODID_UPDATE_VIRTIO_SCSI_LUN = 14;
  private static final int METHODID_LIST_VIRTIO_SCSI_LUNS = 15;
  private static final int METHODID_GET_VIRTIO_SCSI_LUN = 16;
  private static final int METHODID_STATS_VIRTIO_SCSI_LUN = 17;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FrontendVirtioScsiServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FrontendVirtioScsiServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_VIRTIO_SCSI_TARGET:
          serviceImpl.createVirtioScsiTarget((opi_api.storage.v1.CreateVirtioScsiTargetRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiTarget>) responseObserver);
          break;
        case METHODID_DELETE_VIRTIO_SCSI_TARGET:
          serviceImpl.deleteVirtioScsiTarget((opi_api.storage.v1.DeleteVirtioScsiTargetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_VIRTIO_SCSI_TARGET:
          serviceImpl.updateVirtioScsiTarget((opi_api.storage.v1.UpdateVirtioScsiTargetRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiTarget>) responseObserver);
          break;
        case METHODID_LIST_VIRTIO_SCSI_TARGETS:
          serviceImpl.listVirtioScsiTargets((opi_api.storage.v1.ListVirtioScsiTargetsRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.ListVirtioScsiTargetsResponse>) responseObserver);
          break;
        case METHODID_GET_VIRTIO_SCSI_TARGET:
          serviceImpl.getVirtioScsiTarget((opi_api.storage.v1.GetVirtioScsiTargetRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiTarget>) responseObserver);
          break;
        case METHODID_STATS_VIRTIO_SCSI_TARGET:
          serviceImpl.statsVirtioScsiTarget((opi_api.storage.v1.StatsVirtioScsiTargetRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.StatsVirtioScsiTargetResponse>) responseObserver);
          break;
        case METHODID_CREATE_VIRTIO_SCSI_CONTROLLER:
          serviceImpl.createVirtioScsiController((opi_api.storage.v1.CreateVirtioScsiControllerRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiController>) responseObserver);
          break;
        case METHODID_DELETE_VIRTIO_SCSI_CONTROLLER:
          serviceImpl.deleteVirtioScsiController((opi_api.storage.v1.DeleteVirtioScsiControllerRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_VIRTIO_SCSI_CONTROLLER:
          serviceImpl.updateVirtioScsiController((opi_api.storage.v1.UpdateVirtioScsiControllerRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiController>) responseObserver);
          break;
        case METHODID_LIST_VIRTIO_SCSI_CONTROLLERS:
          serviceImpl.listVirtioScsiControllers((opi_api.storage.v1.ListVirtioScsiControllersRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.ListVirtioScsiControllersResponse>) responseObserver);
          break;
        case METHODID_GET_VIRTIO_SCSI_CONTROLLER:
          serviceImpl.getVirtioScsiController((opi_api.storage.v1.GetVirtioScsiControllerRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiController>) responseObserver);
          break;
        case METHODID_STATS_VIRTIO_SCSI_CONTROLLER:
          serviceImpl.statsVirtioScsiController((opi_api.storage.v1.StatsVirtioScsiControllerRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.StatsVirtioScsiControllerResponse>) responseObserver);
          break;
        case METHODID_CREATE_VIRTIO_SCSI_LUN:
          serviceImpl.createVirtioScsiLun((opi_api.storage.v1.CreateVirtioScsiLunRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiLun>) responseObserver);
          break;
        case METHODID_DELETE_VIRTIO_SCSI_LUN:
          serviceImpl.deleteVirtioScsiLun((opi_api.storage.v1.DeleteVirtioScsiLunRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_VIRTIO_SCSI_LUN:
          serviceImpl.updateVirtioScsiLun((opi_api.storage.v1.UpdateVirtioScsiLunRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiLun>) responseObserver);
          break;
        case METHODID_LIST_VIRTIO_SCSI_LUNS:
          serviceImpl.listVirtioScsiLuns((opi_api.storage.v1.ListVirtioScsiLunsRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.ListVirtioScsiLunsResponse>) responseObserver);
          break;
        case METHODID_GET_VIRTIO_SCSI_LUN:
          serviceImpl.getVirtioScsiLun((opi_api.storage.v1.GetVirtioScsiLunRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiLun>) responseObserver);
          break;
        case METHODID_STATS_VIRTIO_SCSI_LUN:
          serviceImpl.statsVirtioScsiLun((opi_api.storage.v1.StatsVirtioScsiLunRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.StatsVirtioScsiLunResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class FrontendVirtioScsiServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FrontendVirtioScsiServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return opi_api.storage.v1.FrontendVirtioScsiProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FrontendVirtioScsiService");
    }
  }

  private static final class FrontendVirtioScsiServiceFileDescriptorSupplier
      extends FrontendVirtioScsiServiceBaseDescriptorSupplier {
    FrontendVirtioScsiServiceFileDescriptorSupplier() {}
  }

  private static final class FrontendVirtioScsiServiceMethodDescriptorSupplier
      extends FrontendVirtioScsiServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FrontendVirtioScsiServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (FrontendVirtioScsiServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FrontendVirtioScsiServiceFileDescriptorSupplier())
              .addMethod(getCreateVirtioScsiTargetMethod())
              .addMethod(getDeleteVirtioScsiTargetMethod())
              .addMethod(getUpdateVirtioScsiTargetMethod())
              .addMethod(getListVirtioScsiTargetsMethod())
              .addMethod(getGetVirtioScsiTargetMethod())
              .addMethod(getStatsVirtioScsiTargetMethod())
              .addMethod(getCreateVirtioScsiControllerMethod())
              .addMethod(getDeleteVirtioScsiControllerMethod())
              .addMethod(getUpdateVirtioScsiControllerMethod())
              .addMethod(getListVirtioScsiControllersMethod())
              .addMethod(getGetVirtioScsiControllerMethod())
              .addMethod(getStatsVirtioScsiControllerMethod())
              .addMethod(getCreateVirtioScsiLunMethod())
              .addMethod(getDeleteVirtioScsiLunMethod())
              .addMethod(getUpdateVirtioScsiLunMethod())
              .addMethod(getListVirtioScsiLunsMethod())
              .addMethod(getGetVirtioScsiLunMethod())
              .addMethod(getStatsVirtioScsiLunMethod())
              .build();
        }
      }
    }
    return result;
  }
}
