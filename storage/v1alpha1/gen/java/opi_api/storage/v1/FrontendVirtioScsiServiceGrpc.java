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

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.ListVirtioScsiTargetRequest,
      opi_api.storage.v1.ListVirtioScsiTargetResponse> getListVirtioScsiTargetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListVirtioScsiTarget",
      requestType = opi_api.storage.v1.ListVirtioScsiTargetRequest.class,
      responseType = opi_api.storage.v1.ListVirtioScsiTargetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.ListVirtioScsiTargetRequest,
      opi_api.storage.v1.ListVirtioScsiTargetResponse> getListVirtioScsiTargetMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.ListVirtioScsiTargetRequest, opi_api.storage.v1.ListVirtioScsiTargetResponse> getListVirtioScsiTargetMethod;
    if ((getListVirtioScsiTargetMethod = FrontendVirtioScsiServiceGrpc.getListVirtioScsiTargetMethod) == null) {
      synchronized (FrontendVirtioScsiServiceGrpc.class) {
        if ((getListVirtioScsiTargetMethod = FrontendVirtioScsiServiceGrpc.getListVirtioScsiTargetMethod) == null) {
          FrontendVirtioScsiServiceGrpc.getListVirtioScsiTargetMethod = getListVirtioScsiTargetMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.ListVirtioScsiTargetRequest, opi_api.storage.v1.ListVirtioScsiTargetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListVirtioScsiTarget"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListVirtioScsiTargetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListVirtioScsiTargetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioScsiServiceMethodDescriptorSupplier("ListVirtioScsiTarget"))
              .build();
        }
      }
    }
    return getListVirtioScsiTargetMethod;
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

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioScsiTargetStatsRequest,
      opi_api.storage.v1.VirtioScsiTargetStatsResponse> getVirtioScsiTargetStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VirtioScsiTargetStats",
      requestType = opi_api.storage.v1.VirtioScsiTargetStatsRequest.class,
      responseType = opi_api.storage.v1.VirtioScsiTargetStatsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioScsiTargetStatsRequest,
      opi_api.storage.v1.VirtioScsiTargetStatsResponse> getVirtioScsiTargetStatsMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioScsiTargetStatsRequest, opi_api.storage.v1.VirtioScsiTargetStatsResponse> getVirtioScsiTargetStatsMethod;
    if ((getVirtioScsiTargetStatsMethod = FrontendVirtioScsiServiceGrpc.getVirtioScsiTargetStatsMethod) == null) {
      synchronized (FrontendVirtioScsiServiceGrpc.class) {
        if ((getVirtioScsiTargetStatsMethod = FrontendVirtioScsiServiceGrpc.getVirtioScsiTargetStatsMethod) == null) {
          FrontendVirtioScsiServiceGrpc.getVirtioScsiTargetStatsMethod = getVirtioScsiTargetStatsMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.VirtioScsiTargetStatsRequest, opi_api.storage.v1.VirtioScsiTargetStatsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VirtioScsiTargetStats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioScsiTargetStatsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioScsiTargetStatsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioScsiServiceMethodDescriptorSupplier("VirtioScsiTargetStats"))
              .build();
        }
      }
    }
    return getVirtioScsiTargetStatsMethod;
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

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.ListVirtioScsiControllerRequest,
      opi_api.storage.v1.ListVirtioScsiControllerResponse> getListVirtioScsiControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListVirtioScsiController",
      requestType = opi_api.storage.v1.ListVirtioScsiControllerRequest.class,
      responseType = opi_api.storage.v1.ListVirtioScsiControllerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.ListVirtioScsiControllerRequest,
      opi_api.storage.v1.ListVirtioScsiControllerResponse> getListVirtioScsiControllerMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.ListVirtioScsiControllerRequest, opi_api.storage.v1.ListVirtioScsiControllerResponse> getListVirtioScsiControllerMethod;
    if ((getListVirtioScsiControllerMethod = FrontendVirtioScsiServiceGrpc.getListVirtioScsiControllerMethod) == null) {
      synchronized (FrontendVirtioScsiServiceGrpc.class) {
        if ((getListVirtioScsiControllerMethod = FrontendVirtioScsiServiceGrpc.getListVirtioScsiControllerMethod) == null) {
          FrontendVirtioScsiServiceGrpc.getListVirtioScsiControllerMethod = getListVirtioScsiControllerMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.ListVirtioScsiControllerRequest, opi_api.storage.v1.ListVirtioScsiControllerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListVirtioScsiController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListVirtioScsiControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListVirtioScsiControllerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioScsiServiceMethodDescriptorSupplier("ListVirtioScsiController"))
              .build();
        }
      }
    }
    return getListVirtioScsiControllerMethod;
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

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioScsiControllerStatsRequest,
      opi_api.storage.v1.VirtioScsiControllerStatsResponse> getVirtioScsiControllerStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VirtioScsiControllerStats",
      requestType = opi_api.storage.v1.VirtioScsiControllerStatsRequest.class,
      responseType = opi_api.storage.v1.VirtioScsiControllerStatsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioScsiControllerStatsRequest,
      opi_api.storage.v1.VirtioScsiControllerStatsResponse> getVirtioScsiControllerStatsMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioScsiControllerStatsRequest, opi_api.storage.v1.VirtioScsiControllerStatsResponse> getVirtioScsiControllerStatsMethod;
    if ((getVirtioScsiControllerStatsMethod = FrontendVirtioScsiServiceGrpc.getVirtioScsiControllerStatsMethod) == null) {
      synchronized (FrontendVirtioScsiServiceGrpc.class) {
        if ((getVirtioScsiControllerStatsMethod = FrontendVirtioScsiServiceGrpc.getVirtioScsiControllerStatsMethod) == null) {
          FrontendVirtioScsiServiceGrpc.getVirtioScsiControllerStatsMethod = getVirtioScsiControllerStatsMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.VirtioScsiControllerStatsRequest, opi_api.storage.v1.VirtioScsiControllerStatsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VirtioScsiControllerStats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioScsiControllerStatsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioScsiControllerStatsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioScsiServiceMethodDescriptorSupplier("VirtioScsiControllerStats"))
              .build();
        }
      }
    }
    return getVirtioScsiControllerStatsMethod;
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

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.ListVirtioScsiLunRequest,
      opi_api.storage.v1.ListVirtioScsiLunResponse> getListVirtioScsiLunMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListVirtioScsiLun",
      requestType = opi_api.storage.v1.ListVirtioScsiLunRequest.class,
      responseType = opi_api.storage.v1.ListVirtioScsiLunResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.ListVirtioScsiLunRequest,
      opi_api.storage.v1.ListVirtioScsiLunResponse> getListVirtioScsiLunMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.ListVirtioScsiLunRequest, opi_api.storage.v1.ListVirtioScsiLunResponse> getListVirtioScsiLunMethod;
    if ((getListVirtioScsiLunMethod = FrontendVirtioScsiServiceGrpc.getListVirtioScsiLunMethod) == null) {
      synchronized (FrontendVirtioScsiServiceGrpc.class) {
        if ((getListVirtioScsiLunMethod = FrontendVirtioScsiServiceGrpc.getListVirtioScsiLunMethod) == null) {
          FrontendVirtioScsiServiceGrpc.getListVirtioScsiLunMethod = getListVirtioScsiLunMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.ListVirtioScsiLunRequest, opi_api.storage.v1.ListVirtioScsiLunResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListVirtioScsiLun"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListVirtioScsiLunRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListVirtioScsiLunResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioScsiServiceMethodDescriptorSupplier("ListVirtioScsiLun"))
              .build();
        }
      }
    }
    return getListVirtioScsiLunMethod;
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

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioScsiLunStatsRequest,
      opi_api.storage.v1.VirtioScsiLunStatsResponse> getVirtioScsiLunStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VirtioScsiLunStats",
      requestType = opi_api.storage.v1.VirtioScsiLunStatsRequest.class,
      responseType = opi_api.storage.v1.VirtioScsiLunStatsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioScsiLunStatsRequest,
      opi_api.storage.v1.VirtioScsiLunStatsResponse> getVirtioScsiLunStatsMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioScsiLunStatsRequest, opi_api.storage.v1.VirtioScsiLunStatsResponse> getVirtioScsiLunStatsMethod;
    if ((getVirtioScsiLunStatsMethod = FrontendVirtioScsiServiceGrpc.getVirtioScsiLunStatsMethod) == null) {
      synchronized (FrontendVirtioScsiServiceGrpc.class) {
        if ((getVirtioScsiLunStatsMethod = FrontendVirtioScsiServiceGrpc.getVirtioScsiLunStatsMethod) == null) {
          FrontendVirtioScsiServiceGrpc.getVirtioScsiLunStatsMethod = getVirtioScsiLunStatsMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.VirtioScsiLunStatsRequest, opi_api.storage.v1.VirtioScsiLunStatsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VirtioScsiLunStats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioScsiLunStatsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioScsiLunStatsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioScsiServiceMethodDescriptorSupplier("VirtioScsiLunStats"))
              .build();
        }
      }
    }
    return getVirtioScsiLunStatsMethod;
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
     */
    public void createVirtioScsiTarget(opi_api.storage.v1.CreateVirtioScsiTargetRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiTarget> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateVirtioScsiTargetMethod(), responseObserver);
    }

    /**
     */
    public void deleteVirtioScsiTarget(opi_api.storage.v1.DeleteVirtioScsiTargetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteVirtioScsiTargetMethod(), responseObserver);
    }

    /**
     */
    public void updateVirtioScsiTarget(opi_api.storage.v1.UpdateVirtioScsiTargetRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiTarget> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateVirtioScsiTargetMethod(), responseObserver);
    }

    /**
     */
    public void listVirtioScsiTarget(opi_api.storage.v1.ListVirtioScsiTargetRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListVirtioScsiTargetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListVirtioScsiTargetMethod(), responseObserver);
    }

    /**
     */
    public void getVirtioScsiTarget(opi_api.storage.v1.GetVirtioScsiTargetRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiTarget> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVirtioScsiTargetMethod(), responseObserver);
    }

    /**
     */
    public void virtioScsiTargetStats(opi_api.storage.v1.VirtioScsiTargetStatsRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiTargetStatsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVirtioScsiTargetStatsMethod(), responseObserver);
    }

    /**
     */
    public void createVirtioScsiController(opi_api.storage.v1.CreateVirtioScsiControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiController> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateVirtioScsiControllerMethod(), responseObserver);
    }

    /**
     */
    public void deleteVirtioScsiController(opi_api.storage.v1.DeleteVirtioScsiControllerRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteVirtioScsiControllerMethod(), responseObserver);
    }

    /**
     */
    public void updateVirtioScsiController(opi_api.storage.v1.UpdateVirtioScsiControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiController> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateVirtioScsiControllerMethod(), responseObserver);
    }

    /**
     */
    public void listVirtioScsiController(opi_api.storage.v1.ListVirtioScsiControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListVirtioScsiControllerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListVirtioScsiControllerMethod(), responseObserver);
    }

    /**
     */
    public void getVirtioScsiController(opi_api.storage.v1.GetVirtioScsiControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiController> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVirtioScsiControllerMethod(), responseObserver);
    }

    /**
     */
    public void virtioScsiControllerStats(opi_api.storage.v1.VirtioScsiControllerStatsRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiControllerStatsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVirtioScsiControllerStatsMethod(), responseObserver);
    }

    /**
     */
    public void createVirtioScsiLun(opi_api.storage.v1.CreateVirtioScsiLunRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiLun> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateVirtioScsiLunMethod(), responseObserver);
    }

    /**
     */
    public void deleteVirtioScsiLun(opi_api.storage.v1.DeleteVirtioScsiLunRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteVirtioScsiLunMethod(), responseObserver);
    }

    /**
     */
    public void updateVirtioScsiLun(opi_api.storage.v1.UpdateVirtioScsiLunRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiLun> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateVirtioScsiLunMethod(), responseObserver);
    }

    /**
     */
    public void listVirtioScsiLun(opi_api.storage.v1.ListVirtioScsiLunRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListVirtioScsiLunResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListVirtioScsiLunMethod(), responseObserver);
    }

    /**
     */
    public void getVirtioScsiLun(opi_api.storage.v1.GetVirtioScsiLunRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiLun> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVirtioScsiLunMethod(), responseObserver);
    }

    /**
     */
    public void virtioScsiLunStats(opi_api.storage.v1.VirtioScsiLunStatsRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiLunStatsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVirtioScsiLunStatsMethod(), responseObserver);
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
            getListVirtioScsiTargetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.ListVirtioScsiTargetRequest,
                opi_api.storage.v1.ListVirtioScsiTargetResponse>(
                  this, METHODID_LIST_VIRTIO_SCSI_TARGET)))
          .addMethod(
            getGetVirtioScsiTargetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.GetVirtioScsiTargetRequest,
                opi_api.storage.v1.VirtioScsiTarget>(
                  this, METHODID_GET_VIRTIO_SCSI_TARGET)))
          .addMethod(
            getVirtioScsiTargetStatsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.VirtioScsiTargetStatsRequest,
                opi_api.storage.v1.VirtioScsiTargetStatsResponse>(
                  this, METHODID_VIRTIO_SCSI_TARGET_STATS)))
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
            getListVirtioScsiControllerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.ListVirtioScsiControllerRequest,
                opi_api.storage.v1.ListVirtioScsiControllerResponse>(
                  this, METHODID_LIST_VIRTIO_SCSI_CONTROLLER)))
          .addMethod(
            getGetVirtioScsiControllerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.GetVirtioScsiControllerRequest,
                opi_api.storage.v1.VirtioScsiController>(
                  this, METHODID_GET_VIRTIO_SCSI_CONTROLLER)))
          .addMethod(
            getVirtioScsiControllerStatsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.VirtioScsiControllerStatsRequest,
                opi_api.storage.v1.VirtioScsiControllerStatsResponse>(
                  this, METHODID_VIRTIO_SCSI_CONTROLLER_STATS)))
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
            getListVirtioScsiLunMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.ListVirtioScsiLunRequest,
                opi_api.storage.v1.ListVirtioScsiLunResponse>(
                  this, METHODID_LIST_VIRTIO_SCSI_LUN)))
          .addMethod(
            getGetVirtioScsiLunMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.GetVirtioScsiLunRequest,
                opi_api.storage.v1.VirtioScsiLun>(
                  this, METHODID_GET_VIRTIO_SCSI_LUN)))
          .addMethod(
            getVirtioScsiLunStatsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.VirtioScsiLunStatsRequest,
                opi_api.storage.v1.VirtioScsiLunStatsResponse>(
                  this, METHODID_VIRTIO_SCSI_LUN_STATS)))
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
     */
    public void createVirtioScsiTarget(opi_api.storage.v1.CreateVirtioScsiTargetRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiTarget> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateVirtioScsiTargetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteVirtioScsiTarget(opi_api.storage.v1.DeleteVirtioScsiTargetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteVirtioScsiTargetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateVirtioScsiTarget(opi_api.storage.v1.UpdateVirtioScsiTargetRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiTarget> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateVirtioScsiTargetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listVirtioScsiTarget(opi_api.storage.v1.ListVirtioScsiTargetRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListVirtioScsiTargetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListVirtioScsiTargetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getVirtioScsiTarget(opi_api.storage.v1.GetVirtioScsiTargetRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiTarget> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVirtioScsiTargetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void virtioScsiTargetStats(opi_api.storage.v1.VirtioScsiTargetStatsRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiTargetStatsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVirtioScsiTargetStatsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createVirtioScsiController(opi_api.storage.v1.CreateVirtioScsiControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiController> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateVirtioScsiControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteVirtioScsiController(opi_api.storage.v1.DeleteVirtioScsiControllerRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteVirtioScsiControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateVirtioScsiController(opi_api.storage.v1.UpdateVirtioScsiControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiController> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateVirtioScsiControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listVirtioScsiController(opi_api.storage.v1.ListVirtioScsiControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListVirtioScsiControllerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListVirtioScsiControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getVirtioScsiController(opi_api.storage.v1.GetVirtioScsiControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiController> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVirtioScsiControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void virtioScsiControllerStats(opi_api.storage.v1.VirtioScsiControllerStatsRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiControllerStatsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVirtioScsiControllerStatsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createVirtioScsiLun(opi_api.storage.v1.CreateVirtioScsiLunRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiLun> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateVirtioScsiLunMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteVirtioScsiLun(opi_api.storage.v1.DeleteVirtioScsiLunRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteVirtioScsiLunMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateVirtioScsiLun(opi_api.storage.v1.UpdateVirtioScsiLunRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiLun> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateVirtioScsiLunMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listVirtioScsiLun(opi_api.storage.v1.ListVirtioScsiLunRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListVirtioScsiLunResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListVirtioScsiLunMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getVirtioScsiLun(opi_api.storage.v1.GetVirtioScsiLunRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiLun> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVirtioScsiLunMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void virtioScsiLunStats(opi_api.storage.v1.VirtioScsiLunStatsRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiLunStatsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVirtioScsiLunStatsMethod(), getCallOptions()), request, responseObserver);
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
     */
    public opi_api.storage.v1.VirtioScsiTarget createVirtioScsiTarget(opi_api.storage.v1.CreateVirtioScsiTargetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateVirtioScsiTargetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteVirtioScsiTarget(opi_api.storage.v1.DeleteVirtioScsiTargetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteVirtioScsiTargetMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.VirtioScsiTarget updateVirtioScsiTarget(opi_api.storage.v1.UpdateVirtioScsiTargetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateVirtioScsiTargetMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.ListVirtioScsiTargetResponse listVirtioScsiTarget(opi_api.storage.v1.ListVirtioScsiTargetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListVirtioScsiTargetMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.VirtioScsiTarget getVirtioScsiTarget(opi_api.storage.v1.GetVirtioScsiTargetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVirtioScsiTargetMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.VirtioScsiTargetStatsResponse virtioScsiTargetStats(opi_api.storage.v1.VirtioScsiTargetStatsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVirtioScsiTargetStatsMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.VirtioScsiController createVirtioScsiController(opi_api.storage.v1.CreateVirtioScsiControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateVirtioScsiControllerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteVirtioScsiController(opi_api.storage.v1.DeleteVirtioScsiControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteVirtioScsiControllerMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.VirtioScsiController updateVirtioScsiController(opi_api.storage.v1.UpdateVirtioScsiControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateVirtioScsiControllerMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.ListVirtioScsiControllerResponse listVirtioScsiController(opi_api.storage.v1.ListVirtioScsiControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListVirtioScsiControllerMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.VirtioScsiController getVirtioScsiController(opi_api.storage.v1.GetVirtioScsiControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVirtioScsiControllerMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.VirtioScsiControllerStatsResponse virtioScsiControllerStats(opi_api.storage.v1.VirtioScsiControllerStatsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVirtioScsiControllerStatsMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.VirtioScsiLun createVirtioScsiLun(opi_api.storage.v1.CreateVirtioScsiLunRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateVirtioScsiLunMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteVirtioScsiLun(opi_api.storage.v1.DeleteVirtioScsiLunRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteVirtioScsiLunMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.VirtioScsiLun updateVirtioScsiLun(opi_api.storage.v1.UpdateVirtioScsiLunRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateVirtioScsiLunMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.ListVirtioScsiLunResponse listVirtioScsiLun(opi_api.storage.v1.ListVirtioScsiLunRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListVirtioScsiLunMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.VirtioScsiLun getVirtioScsiLun(opi_api.storage.v1.GetVirtioScsiLunRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVirtioScsiLunMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.VirtioScsiLunStatsResponse virtioScsiLunStats(opi_api.storage.v1.VirtioScsiLunStatsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVirtioScsiLunStatsMethod(), getCallOptions(), request);
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
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.VirtioScsiTarget> createVirtioScsiTarget(
        opi_api.storage.v1.CreateVirtioScsiTargetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateVirtioScsiTargetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteVirtioScsiTarget(
        opi_api.storage.v1.DeleteVirtioScsiTargetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteVirtioScsiTargetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.VirtioScsiTarget> updateVirtioScsiTarget(
        opi_api.storage.v1.UpdateVirtioScsiTargetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateVirtioScsiTargetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.ListVirtioScsiTargetResponse> listVirtioScsiTarget(
        opi_api.storage.v1.ListVirtioScsiTargetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListVirtioScsiTargetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.VirtioScsiTarget> getVirtioScsiTarget(
        opi_api.storage.v1.GetVirtioScsiTargetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVirtioScsiTargetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.VirtioScsiTargetStatsResponse> virtioScsiTargetStats(
        opi_api.storage.v1.VirtioScsiTargetStatsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVirtioScsiTargetStatsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.VirtioScsiController> createVirtioScsiController(
        opi_api.storage.v1.CreateVirtioScsiControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateVirtioScsiControllerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteVirtioScsiController(
        opi_api.storage.v1.DeleteVirtioScsiControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteVirtioScsiControllerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.VirtioScsiController> updateVirtioScsiController(
        opi_api.storage.v1.UpdateVirtioScsiControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateVirtioScsiControllerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.ListVirtioScsiControllerResponse> listVirtioScsiController(
        opi_api.storage.v1.ListVirtioScsiControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListVirtioScsiControllerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.VirtioScsiController> getVirtioScsiController(
        opi_api.storage.v1.GetVirtioScsiControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVirtioScsiControllerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.VirtioScsiControllerStatsResponse> virtioScsiControllerStats(
        opi_api.storage.v1.VirtioScsiControllerStatsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVirtioScsiControllerStatsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.VirtioScsiLun> createVirtioScsiLun(
        opi_api.storage.v1.CreateVirtioScsiLunRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateVirtioScsiLunMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteVirtioScsiLun(
        opi_api.storage.v1.DeleteVirtioScsiLunRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteVirtioScsiLunMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.VirtioScsiLun> updateVirtioScsiLun(
        opi_api.storage.v1.UpdateVirtioScsiLunRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateVirtioScsiLunMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.ListVirtioScsiLunResponse> listVirtioScsiLun(
        opi_api.storage.v1.ListVirtioScsiLunRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListVirtioScsiLunMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.VirtioScsiLun> getVirtioScsiLun(
        opi_api.storage.v1.GetVirtioScsiLunRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVirtioScsiLunMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.VirtioScsiLunStatsResponse> virtioScsiLunStats(
        opi_api.storage.v1.VirtioScsiLunStatsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVirtioScsiLunStatsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_VIRTIO_SCSI_TARGET = 0;
  private static final int METHODID_DELETE_VIRTIO_SCSI_TARGET = 1;
  private static final int METHODID_UPDATE_VIRTIO_SCSI_TARGET = 2;
  private static final int METHODID_LIST_VIRTIO_SCSI_TARGET = 3;
  private static final int METHODID_GET_VIRTIO_SCSI_TARGET = 4;
  private static final int METHODID_VIRTIO_SCSI_TARGET_STATS = 5;
  private static final int METHODID_CREATE_VIRTIO_SCSI_CONTROLLER = 6;
  private static final int METHODID_DELETE_VIRTIO_SCSI_CONTROLLER = 7;
  private static final int METHODID_UPDATE_VIRTIO_SCSI_CONTROLLER = 8;
  private static final int METHODID_LIST_VIRTIO_SCSI_CONTROLLER = 9;
  private static final int METHODID_GET_VIRTIO_SCSI_CONTROLLER = 10;
  private static final int METHODID_VIRTIO_SCSI_CONTROLLER_STATS = 11;
  private static final int METHODID_CREATE_VIRTIO_SCSI_LUN = 12;
  private static final int METHODID_DELETE_VIRTIO_SCSI_LUN = 13;
  private static final int METHODID_UPDATE_VIRTIO_SCSI_LUN = 14;
  private static final int METHODID_LIST_VIRTIO_SCSI_LUN = 15;
  private static final int METHODID_GET_VIRTIO_SCSI_LUN = 16;
  private static final int METHODID_VIRTIO_SCSI_LUN_STATS = 17;

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
        case METHODID_LIST_VIRTIO_SCSI_TARGET:
          serviceImpl.listVirtioScsiTarget((opi_api.storage.v1.ListVirtioScsiTargetRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.ListVirtioScsiTargetResponse>) responseObserver);
          break;
        case METHODID_GET_VIRTIO_SCSI_TARGET:
          serviceImpl.getVirtioScsiTarget((opi_api.storage.v1.GetVirtioScsiTargetRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiTarget>) responseObserver);
          break;
        case METHODID_VIRTIO_SCSI_TARGET_STATS:
          serviceImpl.virtioScsiTargetStats((opi_api.storage.v1.VirtioScsiTargetStatsRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiTargetStatsResponse>) responseObserver);
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
        case METHODID_LIST_VIRTIO_SCSI_CONTROLLER:
          serviceImpl.listVirtioScsiController((opi_api.storage.v1.ListVirtioScsiControllerRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.ListVirtioScsiControllerResponse>) responseObserver);
          break;
        case METHODID_GET_VIRTIO_SCSI_CONTROLLER:
          serviceImpl.getVirtioScsiController((opi_api.storage.v1.GetVirtioScsiControllerRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiController>) responseObserver);
          break;
        case METHODID_VIRTIO_SCSI_CONTROLLER_STATS:
          serviceImpl.virtioScsiControllerStats((opi_api.storage.v1.VirtioScsiControllerStatsRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiControllerStatsResponse>) responseObserver);
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
        case METHODID_LIST_VIRTIO_SCSI_LUN:
          serviceImpl.listVirtioScsiLun((opi_api.storage.v1.ListVirtioScsiLunRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.ListVirtioScsiLunResponse>) responseObserver);
          break;
        case METHODID_GET_VIRTIO_SCSI_LUN:
          serviceImpl.getVirtioScsiLun((opi_api.storage.v1.GetVirtioScsiLunRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiLun>) responseObserver);
          break;
        case METHODID_VIRTIO_SCSI_LUN_STATS:
          serviceImpl.virtioScsiLunStats((opi_api.storage.v1.VirtioScsiLunStatsRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiLunStatsResponse>) responseObserver);
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
              .addMethod(getListVirtioScsiTargetMethod())
              .addMethod(getGetVirtioScsiTargetMethod())
              .addMethod(getVirtioScsiTargetStatsMethod())
              .addMethod(getCreateVirtioScsiControllerMethod())
              .addMethod(getDeleteVirtioScsiControllerMethod())
              .addMethod(getUpdateVirtioScsiControllerMethod())
              .addMethod(getListVirtioScsiControllerMethod())
              .addMethod(getGetVirtioScsiControllerMethod())
              .addMethod(getVirtioScsiControllerStatsMethod())
              .addMethod(getCreateVirtioScsiLunMethod())
              .addMethod(getDeleteVirtioScsiLunMethod())
              .addMethod(getUpdateVirtioScsiLunMethod())
              .addMethod(getListVirtioScsiLunMethod())
              .addMethod(getGetVirtioScsiLunMethod())
              .addMethod(getVirtioScsiLunStatsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
