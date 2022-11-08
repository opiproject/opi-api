package opi_api.storage.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Front End (host-facing) APIs. Mostly used for Virtio-scsi emulation emulation and host presentation as alternative to Virtio-blk.
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
  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioScsiControllerCreateRequest,
      opi_api.storage.v1.VirtioScsiController> getVirtioScsiControllerCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VirtioScsiControllerCreate",
      requestType = opi_api.storage.v1.VirtioScsiControllerCreateRequest.class,
      responseType = opi_api.storage.v1.VirtioScsiController.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioScsiControllerCreateRequest,
      opi_api.storage.v1.VirtioScsiController> getVirtioScsiControllerCreateMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioScsiControllerCreateRequest, opi_api.storage.v1.VirtioScsiController> getVirtioScsiControllerCreateMethod;
    if ((getVirtioScsiControllerCreateMethod = FrontendVirtioScsiServiceGrpc.getVirtioScsiControllerCreateMethod) == null) {
      synchronized (FrontendVirtioScsiServiceGrpc.class) {
        if ((getVirtioScsiControllerCreateMethod = FrontendVirtioScsiServiceGrpc.getVirtioScsiControllerCreateMethod) == null) {
          FrontendVirtioScsiServiceGrpc.getVirtioScsiControllerCreateMethod = getVirtioScsiControllerCreateMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.VirtioScsiControllerCreateRequest, opi_api.storage.v1.VirtioScsiController>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VirtioScsiControllerCreate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioScsiControllerCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioScsiController.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioScsiServiceMethodDescriptorSupplier("VirtioScsiControllerCreate"))
              .build();
        }
      }
    }
    return getVirtioScsiControllerCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioScsiControllerDeleteRequest,
      com.google.protobuf.Empty> getVirtioScsiControllerDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VirtioScsiControllerDelete",
      requestType = opi_api.storage.v1.VirtioScsiControllerDeleteRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioScsiControllerDeleteRequest,
      com.google.protobuf.Empty> getVirtioScsiControllerDeleteMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioScsiControllerDeleteRequest, com.google.protobuf.Empty> getVirtioScsiControllerDeleteMethod;
    if ((getVirtioScsiControllerDeleteMethod = FrontendVirtioScsiServiceGrpc.getVirtioScsiControllerDeleteMethod) == null) {
      synchronized (FrontendVirtioScsiServiceGrpc.class) {
        if ((getVirtioScsiControllerDeleteMethod = FrontendVirtioScsiServiceGrpc.getVirtioScsiControllerDeleteMethod) == null) {
          FrontendVirtioScsiServiceGrpc.getVirtioScsiControllerDeleteMethod = getVirtioScsiControllerDeleteMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.VirtioScsiControllerDeleteRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VirtioScsiControllerDelete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioScsiControllerDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioScsiServiceMethodDescriptorSupplier("VirtioScsiControllerDelete"))
              .build();
        }
      }
    }
    return getVirtioScsiControllerDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioScsiControllerUpdateRequest,
      opi_api.storage.v1.VirtioScsiController> getVirtioScsiControllerUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VirtioScsiControllerUpdate",
      requestType = opi_api.storage.v1.VirtioScsiControllerUpdateRequest.class,
      responseType = opi_api.storage.v1.VirtioScsiController.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioScsiControllerUpdateRequest,
      opi_api.storage.v1.VirtioScsiController> getVirtioScsiControllerUpdateMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioScsiControllerUpdateRequest, opi_api.storage.v1.VirtioScsiController> getVirtioScsiControllerUpdateMethod;
    if ((getVirtioScsiControllerUpdateMethod = FrontendVirtioScsiServiceGrpc.getVirtioScsiControllerUpdateMethod) == null) {
      synchronized (FrontendVirtioScsiServiceGrpc.class) {
        if ((getVirtioScsiControllerUpdateMethod = FrontendVirtioScsiServiceGrpc.getVirtioScsiControllerUpdateMethod) == null) {
          FrontendVirtioScsiServiceGrpc.getVirtioScsiControllerUpdateMethod = getVirtioScsiControllerUpdateMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.VirtioScsiControllerUpdateRequest, opi_api.storage.v1.VirtioScsiController>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VirtioScsiControllerUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioScsiControllerUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioScsiController.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioScsiServiceMethodDescriptorSupplier("VirtioScsiControllerUpdate"))
              .build();
        }
      }
    }
    return getVirtioScsiControllerUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioScsiControllerListRequest,
      opi_api.storage.v1.VirtioScsiControllerListResponse> getVirtioScsiControllerListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VirtioScsiControllerList",
      requestType = opi_api.storage.v1.VirtioScsiControllerListRequest.class,
      responseType = opi_api.storage.v1.VirtioScsiControllerListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioScsiControllerListRequest,
      opi_api.storage.v1.VirtioScsiControllerListResponse> getVirtioScsiControllerListMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioScsiControllerListRequest, opi_api.storage.v1.VirtioScsiControllerListResponse> getVirtioScsiControllerListMethod;
    if ((getVirtioScsiControllerListMethod = FrontendVirtioScsiServiceGrpc.getVirtioScsiControllerListMethod) == null) {
      synchronized (FrontendVirtioScsiServiceGrpc.class) {
        if ((getVirtioScsiControllerListMethod = FrontendVirtioScsiServiceGrpc.getVirtioScsiControllerListMethod) == null) {
          FrontendVirtioScsiServiceGrpc.getVirtioScsiControllerListMethod = getVirtioScsiControllerListMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.VirtioScsiControllerListRequest, opi_api.storage.v1.VirtioScsiControllerListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VirtioScsiControllerList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioScsiControllerListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioScsiControllerListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioScsiServiceMethodDescriptorSupplier("VirtioScsiControllerList"))
              .build();
        }
      }
    }
    return getVirtioScsiControllerListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioScsiControllerGetRequest,
      opi_api.storage.v1.VirtioScsiController> getVirtioScsiControllerGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VirtioScsiControllerGet",
      requestType = opi_api.storage.v1.VirtioScsiControllerGetRequest.class,
      responseType = opi_api.storage.v1.VirtioScsiController.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioScsiControllerGetRequest,
      opi_api.storage.v1.VirtioScsiController> getVirtioScsiControllerGetMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioScsiControllerGetRequest, opi_api.storage.v1.VirtioScsiController> getVirtioScsiControllerGetMethod;
    if ((getVirtioScsiControllerGetMethod = FrontendVirtioScsiServiceGrpc.getVirtioScsiControllerGetMethod) == null) {
      synchronized (FrontendVirtioScsiServiceGrpc.class) {
        if ((getVirtioScsiControllerGetMethod = FrontendVirtioScsiServiceGrpc.getVirtioScsiControllerGetMethod) == null) {
          FrontendVirtioScsiServiceGrpc.getVirtioScsiControllerGetMethod = getVirtioScsiControllerGetMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.VirtioScsiControllerGetRequest, opi_api.storage.v1.VirtioScsiController>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VirtioScsiControllerGet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioScsiControllerGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioScsiController.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioScsiServiceMethodDescriptorSupplier("VirtioScsiControllerGet"))
              .build();
        }
      }
    }
    return getVirtioScsiControllerGetMethod;
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

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioScsiLunCreateRequest,
      opi_api.storage.v1.VirtioScsiLun> getVirtioScsiLunCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VirtioScsiLunCreate",
      requestType = opi_api.storage.v1.VirtioScsiLunCreateRequest.class,
      responseType = opi_api.storage.v1.VirtioScsiLun.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioScsiLunCreateRequest,
      opi_api.storage.v1.VirtioScsiLun> getVirtioScsiLunCreateMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioScsiLunCreateRequest, opi_api.storage.v1.VirtioScsiLun> getVirtioScsiLunCreateMethod;
    if ((getVirtioScsiLunCreateMethod = FrontendVirtioScsiServiceGrpc.getVirtioScsiLunCreateMethod) == null) {
      synchronized (FrontendVirtioScsiServiceGrpc.class) {
        if ((getVirtioScsiLunCreateMethod = FrontendVirtioScsiServiceGrpc.getVirtioScsiLunCreateMethod) == null) {
          FrontendVirtioScsiServiceGrpc.getVirtioScsiLunCreateMethod = getVirtioScsiLunCreateMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.VirtioScsiLunCreateRequest, opi_api.storage.v1.VirtioScsiLun>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VirtioScsiLunCreate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioScsiLunCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioScsiLun.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioScsiServiceMethodDescriptorSupplier("VirtioScsiLunCreate"))
              .build();
        }
      }
    }
    return getVirtioScsiLunCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioScsiLunDeleteRequest,
      com.google.protobuf.Empty> getVirtioScsiLunDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VirtioScsiLunDelete",
      requestType = opi_api.storage.v1.VirtioScsiLunDeleteRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioScsiLunDeleteRequest,
      com.google.protobuf.Empty> getVirtioScsiLunDeleteMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioScsiLunDeleteRequest, com.google.protobuf.Empty> getVirtioScsiLunDeleteMethod;
    if ((getVirtioScsiLunDeleteMethod = FrontendVirtioScsiServiceGrpc.getVirtioScsiLunDeleteMethod) == null) {
      synchronized (FrontendVirtioScsiServiceGrpc.class) {
        if ((getVirtioScsiLunDeleteMethod = FrontendVirtioScsiServiceGrpc.getVirtioScsiLunDeleteMethod) == null) {
          FrontendVirtioScsiServiceGrpc.getVirtioScsiLunDeleteMethod = getVirtioScsiLunDeleteMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.VirtioScsiLunDeleteRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VirtioScsiLunDelete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioScsiLunDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioScsiServiceMethodDescriptorSupplier("VirtioScsiLunDelete"))
              .build();
        }
      }
    }
    return getVirtioScsiLunDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioScsiLunUpdateRequest,
      opi_api.storage.v1.VirtioScsiLun> getVirtioScsiLunUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VirtioScsiLunUpdate",
      requestType = opi_api.storage.v1.VirtioScsiLunUpdateRequest.class,
      responseType = opi_api.storage.v1.VirtioScsiLun.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioScsiLunUpdateRequest,
      opi_api.storage.v1.VirtioScsiLun> getVirtioScsiLunUpdateMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioScsiLunUpdateRequest, opi_api.storage.v1.VirtioScsiLun> getVirtioScsiLunUpdateMethod;
    if ((getVirtioScsiLunUpdateMethod = FrontendVirtioScsiServiceGrpc.getVirtioScsiLunUpdateMethod) == null) {
      synchronized (FrontendVirtioScsiServiceGrpc.class) {
        if ((getVirtioScsiLunUpdateMethod = FrontendVirtioScsiServiceGrpc.getVirtioScsiLunUpdateMethod) == null) {
          FrontendVirtioScsiServiceGrpc.getVirtioScsiLunUpdateMethod = getVirtioScsiLunUpdateMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.VirtioScsiLunUpdateRequest, opi_api.storage.v1.VirtioScsiLun>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VirtioScsiLunUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioScsiLunUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioScsiLun.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioScsiServiceMethodDescriptorSupplier("VirtioScsiLunUpdate"))
              .build();
        }
      }
    }
    return getVirtioScsiLunUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioScsiLunListRequest,
      opi_api.storage.v1.VirtioScsiLunListResponse> getVirtioScsiLunListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VirtioScsiLunList",
      requestType = opi_api.storage.v1.VirtioScsiLunListRequest.class,
      responseType = opi_api.storage.v1.VirtioScsiLunListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioScsiLunListRequest,
      opi_api.storage.v1.VirtioScsiLunListResponse> getVirtioScsiLunListMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioScsiLunListRequest, opi_api.storage.v1.VirtioScsiLunListResponse> getVirtioScsiLunListMethod;
    if ((getVirtioScsiLunListMethod = FrontendVirtioScsiServiceGrpc.getVirtioScsiLunListMethod) == null) {
      synchronized (FrontendVirtioScsiServiceGrpc.class) {
        if ((getVirtioScsiLunListMethod = FrontendVirtioScsiServiceGrpc.getVirtioScsiLunListMethod) == null) {
          FrontendVirtioScsiServiceGrpc.getVirtioScsiLunListMethod = getVirtioScsiLunListMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.VirtioScsiLunListRequest, opi_api.storage.v1.VirtioScsiLunListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VirtioScsiLunList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioScsiLunListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioScsiLunListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioScsiServiceMethodDescriptorSupplier("VirtioScsiLunList"))
              .build();
        }
      }
    }
    return getVirtioScsiLunListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioScsiLunGetRequest,
      opi_api.storage.v1.VirtioScsiLun> getVirtioScsiLunGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VirtioScsiLunGet",
      requestType = opi_api.storage.v1.VirtioScsiLunGetRequest.class,
      responseType = opi_api.storage.v1.VirtioScsiLun.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioScsiLunGetRequest,
      opi_api.storage.v1.VirtioScsiLun> getVirtioScsiLunGetMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioScsiLunGetRequest, opi_api.storage.v1.VirtioScsiLun> getVirtioScsiLunGetMethod;
    if ((getVirtioScsiLunGetMethod = FrontendVirtioScsiServiceGrpc.getVirtioScsiLunGetMethod) == null) {
      synchronized (FrontendVirtioScsiServiceGrpc.class) {
        if ((getVirtioScsiLunGetMethod = FrontendVirtioScsiServiceGrpc.getVirtioScsiLunGetMethod) == null) {
          FrontendVirtioScsiServiceGrpc.getVirtioScsiLunGetMethod = getVirtioScsiLunGetMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.VirtioScsiLunGetRequest, opi_api.storage.v1.VirtioScsiLun>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VirtioScsiLunGet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioScsiLunGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioScsiLun.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioScsiServiceMethodDescriptorSupplier("VirtioScsiLunGet"))
              .build();
        }
      }
    }
    return getVirtioScsiLunGetMethod;
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
   * Front End (host-facing) APIs. Mostly used for Virtio-scsi emulation emulation and host presentation as alternative to Virtio-blk.
   * </pre>
   */
  public static abstract class FrontendVirtioScsiServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void virtioScsiControllerCreate(opi_api.storage.v1.VirtioScsiControllerCreateRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiController> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVirtioScsiControllerCreateMethod(), responseObserver);
    }

    /**
     */
    public void virtioScsiControllerDelete(opi_api.storage.v1.VirtioScsiControllerDeleteRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVirtioScsiControllerDeleteMethod(), responseObserver);
    }

    /**
     */
    public void virtioScsiControllerUpdate(opi_api.storage.v1.VirtioScsiControllerUpdateRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiController> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVirtioScsiControllerUpdateMethod(), responseObserver);
    }

    /**
     */
    public void virtioScsiControllerList(opi_api.storage.v1.VirtioScsiControllerListRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiControllerListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVirtioScsiControllerListMethod(), responseObserver);
    }

    /**
     */
    public void virtioScsiControllerGet(opi_api.storage.v1.VirtioScsiControllerGetRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiController> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVirtioScsiControllerGetMethod(), responseObserver);
    }

    /**
     */
    public void virtioScsiControllerStats(opi_api.storage.v1.VirtioScsiControllerStatsRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiControllerStatsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVirtioScsiControllerStatsMethod(), responseObserver);
    }

    /**
     */
    public void virtioScsiLunCreate(opi_api.storage.v1.VirtioScsiLunCreateRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiLun> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVirtioScsiLunCreateMethod(), responseObserver);
    }

    /**
     */
    public void virtioScsiLunDelete(opi_api.storage.v1.VirtioScsiLunDeleteRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVirtioScsiLunDeleteMethod(), responseObserver);
    }

    /**
     */
    public void virtioScsiLunUpdate(opi_api.storage.v1.VirtioScsiLunUpdateRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiLun> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVirtioScsiLunUpdateMethod(), responseObserver);
    }

    /**
     */
    public void virtioScsiLunList(opi_api.storage.v1.VirtioScsiLunListRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiLunListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVirtioScsiLunListMethod(), responseObserver);
    }

    /**
     */
    public void virtioScsiLunGet(opi_api.storage.v1.VirtioScsiLunGetRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiLun> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVirtioScsiLunGetMethod(), responseObserver);
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
            getVirtioScsiControllerCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.VirtioScsiControllerCreateRequest,
                opi_api.storage.v1.VirtioScsiController>(
                  this, METHODID_VIRTIO_SCSI_CONTROLLER_CREATE)))
          .addMethod(
            getVirtioScsiControllerDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.VirtioScsiControllerDeleteRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_VIRTIO_SCSI_CONTROLLER_DELETE)))
          .addMethod(
            getVirtioScsiControllerUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.VirtioScsiControllerUpdateRequest,
                opi_api.storage.v1.VirtioScsiController>(
                  this, METHODID_VIRTIO_SCSI_CONTROLLER_UPDATE)))
          .addMethod(
            getVirtioScsiControllerListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.VirtioScsiControllerListRequest,
                opi_api.storage.v1.VirtioScsiControllerListResponse>(
                  this, METHODID_VIRTIO_SCSI_CONTROLLER_LIST)))
          .addMethod(
            getVirtioScsiControllerGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.VirtioScsiControllerGetRequest,
                opi_api.storage.v1.VirtioScsiController>(
                  this, METHODID_VIRTIO_SCSI_CONTROLLER_GET)))
          .addMethod(
            getVirtioScsiControllerStatsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.VirtioScsiControllerStatsRequest,
                opi_api.storage.v1.VirtioScsiControllerStatsResponse>(
                  this, METHODID_VIRTIO_SCSI_CONTROLLER_STATS)))
          .addMethod(
            getVirtioScsiLunCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.VirtioScsiLunCreateRequest,
                opi_api.storage.v1.VirtioScsiLun>(
                  this, METHODID_VIRTIO_SCSI_LUN_CREATE)))
          .addMethod(
            getVirtioScsiLunDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.VirtioScsiLunDeleteRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_VIRTIO_SCSI_LUN_DELETE)))
          .addMethod(
            getVirtioScsiLunUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.VirtioScsiLunUpdateRequest,
                opi_api.storage.v1.VirtioScsiLun>(
                  this, METHODID_VIRTIO_SCSI_LUN_UPDATE)))
          .addMethod(
            getVirtioScsiLunListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.VirtioScsiLunListRequest,
                opi_api.storage.v1.VirtioScsiLunListResponse>(
                  this, METHODID_VIRTIO_SCSI_LUN_LIST)))
          .addMethod(
            getVirtioScsiLunGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.VirtioScsiLunGetRequest,
                opi_api.storage.v1.VirtioScsiLun>(
                  this, METHODID_VIRTIO_SCSI_LUN_GET)))
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
   * Front End (host-facing) APIs. Mostly used for Virtio-scsi emulation emulation and host presentation as alternative to Virtio-blk.
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
    public void virtioScsiControllerCreate(opi_api.storage.v1.VirtioScsiControllerCreateRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiController> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVirtioScsiControllerCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void virtioScsiControllerDelete(opi_api.storage.v1.VirtioScsiControllerDeleteRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVirtioScsiControllerDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void virtioScsiControllerUpdate(opi_api.storage.v1.VirtioScsiControllerUpdateRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiController> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVirtioScsiControllerUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void virtioScsiControllerList(opi_api.storage.v1.VirtioScsiControllerListRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiControllerListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVirtioScsiControllerListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void virtioScsiControllerGet(opi_api.storage.v1.VirtioScsiControllerGetRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiController> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVirtioScsiControllerGetMethod(), getCallOptions()), request, responseObserver);
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
    public void virtioScsiLunCreate(opi_api.storage.v1.VirtioScsiLunCreateRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiLun> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVirtioScsiLunCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void virtioScsiLunDelete(opi_api.storage.v1.VirtioScsiLunDeleteRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVirtioScsiLunDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void virtioScsiLunUpdate(opi_api.storage.v1.VirtioScsiLunUpdateRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiLun> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVirtioScsiLunUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void virtioScsiLunList(opi_api.storage.v1.VirtioScsiLunListRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiLunListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVirtioScsiLunListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void virtioScsiLunGet(opi_api.storage.v1.VirtioScsiLunGetRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiLun> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVirtioScsiLunGetMethod(), getCallOptions()), request, responseObserver);
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
   * Front End (host-facing) APIs. Mostly used for Virtio-scsi emulation emulation and host presentation as alternative to Virtio-blk.
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
    public opi_api.storage.v1.VirtioScsiController virtioScsiControllerCreate(opi_api.storage.v1.VirtioScsiControllerCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVirtioScsiControllerCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty virtioScsiControllerDelete(opi_api.storage.v1.VirtioScsiControllerDeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVirtioScsiControllerDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.VirtioScsiController virtioScsiControllerUpdate(opi_api.storage.v1.VirtioScsiControllerUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVirtioScsiControllerUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.VirtioScsiControllerListResponse virtioScsiControllerList(opi_api.storage.v1.VirtioScsiControllerListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVirtioScsiControllerListMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.VirtioScsiController virtioScsiControllerGet(opi_api.storage.v1.VirtioScsiControllerGetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVirtioScsiControllerGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.VirtioScsiControllerStatsResponse virtioScsiControllerStats(opi_api.storage.v1.VirtioScsiControllerStatsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVirtioScsiControllerStatsMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.VirtioScsiLun virtioScsiLunCreate(opi_api.storage.v1.VirtioScsiLunCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVirtioScsiLunCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty virtioScsiLunDelete(opi_api.storage.v1.VirtioScsiLunDeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVirtioScsiLunDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.VirtioScsiLun virtioScsiLunUpdate(opi_api.storage.v1.VirtioScsiLunUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVirtioScsiLunUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.VirtioScsiLunListResponse virtioScsiLunList(opi_api.storage.v1.VirtioScsiLunListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVirtioScsiLunListMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.VirtioScsiLun virtioScsiLunGet(opi_api.storage.v1.VirtioScsiLunGetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVirtioScsiLunGetMethod(), getCallOptions(), request);
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
   * Front End (host-facing) APIs. Mostly used for Virtio-scsi emulation emulation and host presentation as alternative to Virtio-blk.
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
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.VirtioScsiController> virtioScsiControllerCreate(
        opi_api.storage.v1.VirtioScsiControllerCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVirtioScsiControllerCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> virtioScsiControllerDelete(
        opi_api.storage.v1.VirtioScsiControllerDeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVirtioScsiControllerDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.VirtioScsiController> virtioScsiControllerUpdate(
        opi_api.storage.v1.VirtioScsiControllerUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVirtioScsiControllerUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.VirtioScsiControllerListResponse> virtioScsiControllerList(
        opi_api.storage.v1.VirtioScsiControllerListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVirtioScsiControllerListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.VirtioScsiController> virtioScsiControllerGet(
        opi_api.storage.v1.VirtioScsiControllerGetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVirtioScsiControllerGetMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.VirtioScsiLun> virtioScsiLunCreate(
        opi_api.storage.v1.VirtioScsiLunCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVirtioScsiLunCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> virtioScsiLunDelete(
        opi_api.storage.v1.VirtioScsiLunDeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVirtioScsiLunDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.VirtioScsiLun> virtioScsiLunUpdate(
        opi_api.storage.v1.VirtioScsiLunUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVirtioScsiLunUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.VirtioScsiLunListResponse> virtioScsiLunList(
        opi_api.storage.v1.VirtioScsiLunListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVirtioScsiLunListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.VirtioScsiLun> virtioScsiLunGet(
        opi_api.storage.v1.VirtioScsiLunGetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVirtioScsiLunGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.VirtioScsiLunStatsResponse> virtioScsiLunStats(
        opi_api.storage.v1.VirtioScsiLunStatsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVirtioScsiLunStatsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_VIRTIO_SCSI_CONTROLLER_CREATE = 0;
  private static final int METHODID_VIRTIO_SCSI_CONTROLLER_DELETE = 1;
  private static final int METHODID_VIRTIO_SCSI_CONTROLLER_UPDATE = 2;
  private static final int METHODID_VIRTIO_SCSI_CONTROLLER_LIST = 3;
  private static final int METHODID_VIRTIO_SCSI_CONTROLLER_GET = 4;
  private static final int METHODID_VIRTIO_SCSI_CONTROLLER_STATS = 5;
  private static final int METHODID_VIRTIO_SCSI_LUN_CREATE = 6;
  private static final int METHODID_VIRTIO_SCSI_LUN_DELETE = 7;
  private static final int METHODID_VIRTIO_SCSI_LUN_UPDATE = 8;
  private static final int METHODID_VIRTIO_SCSI_LUN_LIST = 9;
  private static final int METHODID_VIRTIO_SCSI_LUN_GET = 10;
  private static final int METHODID_VIRTIO_SCSI_LUN_STATS = 11;

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
        case METHODID_VIRTIO_SCSI_CONTROLLER_CREATE:
          serviceImpl.virtioScsiControllerCreate((opi_api.storage.v1.VirtioScsiControllerCreateRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiController>) responseObserver);
          break;
        case METHODID_VIRTIO_SCSI_CONTROLLER_DELETE:
          serviceImpl.virtioScsiControllerDelete((opi_api.storage.v1.VirtioScsiControllerDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_VIRTIO_SCSI_CONTROLLER_UPDATE:
          serviceImpl.virtioScsiControllerUpdate((opi_api.storage.v1.VirtioScsiControllerUpdateRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiController>) responseObserver);
          break;
        case METHODID_VIRTIO_SCSI_CONTROLLER_LIST:
          serviceImpl.virtioScsiControllerList((opi_api.storage.v1.VirtioScsiControllerListRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiControllerListResponse>) responseObserver);
          break;
        case METHODID_VIRTIO_SCSI_CONTROLLER_GET:
          serviceImpl.virtioScsiControllerGet((opi_api.storage.v1.VirtioScsiControllerGetRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiController>) responseObserver);
          break;
        case METHODID_VIRTIO_SCSI_CONTROLLER_STATS:
          serviceImpl.virtioScsiControllerStats((opi_api.storage.v1.VirtioScsiControllerStatsRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiControllerStatsResponse>) responseObserver);
          break;
        case METHODID_VIRTIO_SCSI_LUN_CREATE:
          serviceImpl.virtioScsiLunCreate((opi_api.storage.v1.VirtioScsiLunCreateRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiLun>) responseObserver);
          break;
        case METHODID_VIRTIO_SCSI_LUN_DELETE:
          serviceImpl.virtioScsiLunDelete((opi_api.storage.v1.VirtioScsiLunDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_VIRTIO_SCSI_LUN_UPDATE:
          serviceImpl.virtioScsiLunUpdate((opi_api.storage.v1.VirtioScsiLunUpdateRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiLun>) responseObserver);
          break;
        case METHODID_VIRTIO_SCSI_LUN_LIST:
          serviceImpl.virtioScsiLunList((opi_api.storage.v1.VirtioScsiLunListRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioScsiLunListResponse>) responseObserver);
          break;
        case METHODID_VIRTIO_SCSI_LUN_GET:
          serviceImpl.virtioScsiLunGet((opi_api.storage.v1.VirtioScsiLunGetRequest) request,
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
              .addMethod(getVirtioScsiControllerCreateMethod())
              .addMethod(getVirtioScsiControllerDeleteMethod())
              .addMethod(getVirtioScsiControllerUpdateMethod())
              .addMethod(getVirtioScsiControllerListMethod())
              .addMethod(getVirtioScsiControllerGetMethod())
              .addMethod(getVirtioScsiControllerStatsMethod())
              .addMethod(getVirtioScsiLunCreateMethod())
              .addMethod(getVirtioScsiLunDeleteMethod())
              .addMethod(getVirtioScsiLunUpdateMethod())
              .addMethod(getVirtioScsiLunListMethod())
              .addMethod(getVirtioScsiLunGetMethod())
              .addMethod(getVirtioScsiLunStatsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
