package opi_api.storage.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Front End (host-facing) APIs. Mostly used for NVMe/PCIe emulation and host presentation.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: frontend_nvme_pcie.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FrontendNvmeServiceGrpc {

  private FrontendNvmeServiceGrpc() {}

  public static final String SERVICE_NAME = "opi_api.storage.v1.FrontendNvmeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeSubsystemCreateRequest,
      opi_api.storage.v1.NVMeSubsystem> getNVMeSubsystemCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NVMeSubsystemCreate",
      requestType = opi_api.storage.v1.NVMeSubsystemCreateRequest.class,
      responseType = opi_api.storage.v1.NVMeSubsystem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeSubsystemCreateRequest,
      opi_api.storage.v1.NVMeSubsystem> getNVMeSubsystemCreateMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeSubsystemCreateRequest, opi_api.storage.v1.NVMeSubsystem> getNVMeSubsystemCreateMethod;
    if ((getNVMeSubsystemCreateMethod = FrontendNvmeServiceGrpc.getNVMeSubsystemCreateMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getNVMeSubsystemCreateMethod = FrontendNvmeServiceGrpc.getNVMeSubsystemCreateMethod) == null) {
          FrontendNvmeServiceGrpc.getNVMeSubsystemCreateMethod = getNVMeSubsystemCreateMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.NVMeSubsystemCreateRequest, opi_api.storage.v1.NVMeSubsystem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NVMeSubsystemCreate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMeSubsystemCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMeSubsystem.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("NVMeSubsystemCreate"))
              .build();
        }
      }
    }
    return getNVMeSubsystemCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeSubsystemDeleteRequest,
      com.google.protobuf.Empty> getNVMeSubsystemDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NVMeSubsystemDelete",
      requestType = opi_api.storage.v1.NVMeSubsystemDeleteRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeSubsystemDeleteRequest,
      com.google.protobuf.Empty> getNVMeSubsystemDeleteMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeSubsystemDeleteRequest, com.google.protobuf.Empty> getNVMeSubsystemDeleteMethod;
    if ((getNVMeSubsystemDeleteMethod = FrontendNvmeServiceGrpc.getNVMeSubsystemDeleteMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getNVMeSubsystemDeleteMethod = FrontendNvmeServiceGrpc.getNVMeSubsystemDeleteMethod) == null) {
          FrontendNvmeServiceGrpc.getNVMeSubsystemDeleteMethod = getNVMeSubsystemDeleteMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.NVMeSubsystemDeleteRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NVMeSubsystemDelete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMeSubsystemDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("NVMeSubsystemDelete"))
              .build();
        }
      }
    }
    return getNVMeSubsystemDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeSubsystemUpdateRequest,
      opi_api.storage.v1.NVMeSubsystem> getNVMeSubsystemUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NVMeSubsystemUpdate",
      requestType = opi_api.storage.v1.NVMeSubsystemUpdateRequest.class,
      responseType = opi_api.storage.v1.NVMeSubsystem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeSubsystemUpdateRequest,
      opi_api.storage.v1.NVMeSubsystem> getNVMeSubsystemUpdateMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeSubsystemUpdateRequest, opi_api.storage.v1.NVMeSubsystem> getNVMeSubsystemUpdateMethod;
    if ((getNVMeSubsystemUpdateMethod = FrontendNvmeServiceGrpc.getNVMeSubsystemUpdateMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getNVMeSubsystemUpdateMethod = FrontendNvmeServiceGrpc.getNVMeSubsystemUpdateMethod) == null) {
          FrontendNvmeServiceGrpc.getNVMeSubsystemUpdateMethod = getNVMeSubsystemUpdateMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.NVMeSubsystemUpdateRequest, opi_api.storage.v1.NVMeSubsystem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NVMeSubsystemUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMeSubsystemUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMeSubsystem.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("NVMeSubsystemUpdate"))
              .build();
        }
      }
    }
    return getNVMeSubsystemUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeSubsystemListRequest,
      opi_api.storage.v1.NVMeSubsystemListResponse> getNVMeSubsystemListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NVMeSubsystemList",
      requestType = opi_api.storage.v1.NVMeSubsystemListRequest.class,
      responseType = opi_api.storage.v1.NVMeSubsystemListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeSubsystemListRequest,
      opi_api.storage.v1.NVMeSubsystemListResponse> getNVMeSubsystemListMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeSubsystemListRequest, opi_api.storage.v1.NVMeSubsystemListResponse> getNVMeSubsystemListMethod;
    if ((getNVMeSubsystemListMethod = FrontendNvmeServiceGrpc.getNVMeSubsystemListMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getNVMeSubsystemListMethod = FrontendNvmeServiceGrpc.getNVMeSubsystemListMethod) == null) {
          FrontendNvmeServiceGrpc.getNVMeSubsystemListMethod = getNVMeSubsystemListMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.NVMeSubsystemListRequest, opi_api.storage.v1.NVMeSubsystemListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NVMeSubsystemList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMeSubsystemListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMeSubsystemListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("NVMeSubsystemList"))
              .build();
        }
      }
    }
    return getNVMeSubsystemListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeSubsystemGetRequest,
      opi_api.storage.v1.NVMeSubsystem> getNVMeSubsystemGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NVMeSubsystemGet",
      requestType = opi_api.storage.v1.NVMeSubsystemGetRequest.class,
      responseType = opi_api.storage.v1.NVMeSubsystem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeSubsystemGetRequest,
      opi_api.storage.v1.NVMeSubsystem> getNVMeSubsystemGetMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeSubsystemGetRequest, opi_api.storage.v1.NVMeSubsystem> getNVMeSubsystemGetMethod;
    if ((getNVMeSubsystemGetMethod = FrontendNvmeServiceGrpc.getNVMeSubsystemGetMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getNVMeSubsystemGetMethod = FrontendNvmeServiceGrpc.getNVMeSubsystemGetMethod) == null) {
          FrontendNvmeServiceGrpc.getNVMeSubsystemGetMethod = getNVMeSubsystemGetMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.NVMeSubsystemGetRequest, opi_api.storage.v1.NVMeSubsystem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NVMeSubsystemGet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMeSubsystemGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMeSubsystem.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("NVMeSubsystemGet"))
              .build();
        }
      }
    }
    return getNVMeSubsystemGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeSubsystemStatsRequest,
      opi_api.storage.v1.NVMeSubsystemStatsResponse> getNVMeSubsystemStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NVMeSubsystemStats",
      requestType = opi_api.storage.v1.NVMeSubsystemStatsRequest.class,
      responseType = opi_api.storage.v1.NVMeSubsystemStatsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeSubsystemStatsRequest,
      opi_api.storage.v1.NVMeSubsystemStatsResponse> getNVMeSubsystemStatsMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeSubsystemStatsRequest, opi_api.storage.v1.NVMeSubsystemStatsResponse> getNVMeSubsystemStatsMethod;
    if ((getNVMeSubsystemStatsMethod = FrontendNvmeServiceGrpc.getNVMeSubsystemStatsMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getNVMeSubsystemStatsMethod = FrontendNvmeServiceGrpc.getNVMeSubsystemStatsMethod) == null) {
          FrontendNvmeServiceGrpc.getNVMeSubsystemStatsMethod = getNVMeSubsystemStatsMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.NVMeSubsystemStatsRequest, opi_api.storage.v1.NVMeSubsystemStatsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NVMeSubsystemStats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMeSubsystemStatsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMeSubsystemStatsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("NVMeSubsystemStats"))
              .build();
        }
      }
    }
    return getNVMeSubsystemStatsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeControllerCreateRequest,
      opi_api.storage.v1.NVMeController> getNVMeControllerCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NVMeControllerCreate",
      requestType = opi_api.storage.v1.NVMeControllerCreateRequest.class,
      responseType = opi_api.storage.v1.NVMeController.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeControllerCreateRequest,
      opi_api.storage.v1.NVMeController> getNVMeControllerCreateMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeControllerCreateRequest, opi_api.storage.v1.NVMeController> getNVMeControllerCreateMethod;
    if ((getNVMeControllerCreateMethod = FrontendNvmeServiceGrpc.getNVMeControllerCreateMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getNVMeControllerCreateMethod = FrontendNvmeServiceGrpc.getNVMeControllerCreateMethod) == null) {
          FrontendNvmeServiceGrpc.getNVMeControllerCreateMethod = getNVMeControllerCreateMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.NVMeControllerCreateRequest, opi_api.storage.v1.NVMeController>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NVMeControllerCreate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMeControllerCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMeController.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("NVMeControllerCreate"))
              .build();
        }
      }
    }
    return getNVMeControllerCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeControllerDeleteRequest,
      com.google.protobuf.Empty> getNVMeControllerDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NVMeControllerDelete",
      requestType = opi_api.storage.v1.NVMeControllerDeleteRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeControllerDeleteRequest,
      com.google.protobuf.Empty> getNVMeControllerDeleteMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeControllerDeleteRequest, com.google.protobuf.Empty> getNVMeControllerDeleteMethod;
    if ((getNVMeControllerDeleteMethod = FrontendNvmeServiceGrpc.getNVMeControllerDeleteMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getNVMeControllerDeleteMethod = FrontendNvmeServiceGrpc.getNVMeControllerDeleteMethod) == null) {
          FrontendNvmeServiceGrpc.getNVMeControllerDeleteMethod = getNVMeControllerDeleteMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.NVMeControllerDeleteRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NVMeControllerDelete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMeControllerDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("NVMeControllerDelete"))
              .build();
        }
      }
    }
    return getNVMeControllerDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeControllerUpdateRequest,
      opi_api.storage.v1.NVMeController> getNVMeControllerUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NVMeControllerUpdate",
      requestType = opi_api.storage.v1.NVMeControllerUpdateRequest.class,
      responseType = opi_api.storage.v1.NVMeController.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeControllerUpdateRequest,
      opi_api.storage.v1.NVMeController> getNVMeControllerUpdateMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeControllerUpdateRequest, opi_api.storage.v1.NVMeController> getNVMeControllerUpdateMethod;
    if ((getNVMeControllerUpdateMethod = FrontendNvmeServiceGrpc.getNVMeControllerUpdateMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getNVMeControllerUpdateMethod = FrontendNvmeServiceGrpc.getNVMeControllerUpdateMethod) == null) {
          FrontendNvmeServiceGrpc.getNVMeControllerUpdateMethod = getNVMeControllerUpdateMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.NVMeControllerUpdateRequest, opi_api.storage.v1.NVMeController>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NVMeControllerUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMeControllerUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMeController.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("NVMeControllerUpdate"))
              .build();
        }
      }
    }
    return getNVMeControllerUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeControllerListRequest,
      opi_api.storage.v1.NVMeControllerListResponse> getNVMeControllerListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NVMeControllerList",
      requestType = opi_api.storage.v1.NVMeControllerListRequest.class,
      responseType = opi_api.storage.v1.NVMeControllerListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeControllerListRequest,
      opi_api.storage.v1.NVMeControllerListResponse> getNVMeControllerListMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeControllerListRequest, opi_api.storage.v1.NVMeControllerListResponse> getNVMeControllerListMethod;
    if ((getNVMeControllerListMethod = FrontendNvmeServiceGrpc.getNVMeControllerListMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getNVMeControllerListMethod = FrontendNvmeServiceGrpc.getNVMeControllerListMethod) == null) {
          FrontendNvmeServiceGrpc.getNVMeControllerListMethod = getNVMeControllerListMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.NVMeControllerListRequest, opi_api.storage.v1.NVMeControllerListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NVMeControllerList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMeControllerListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMeControllerListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("NVMeControllerList"))
              .build();
        }
      }
    }
    return getNVMeControllerListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeControllerGetRequest,
      opi_api.storage.v1.NVMeController> getNVMeControllerGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NVMeControllerGet",
      requestType = opi_api.storage.v1.NVMeControllerGetRequest.class,
      responseType = opi_api.storage.v1.NVMeController.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeControllerGetRequest,
      opi_api.storage.v1.NVMeController> getNVMeControllerGetMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeControllerGetRequest, opi_api.storage.v1.NVMeController> getNVMeControllerGetMethod;
    if ((getNVMeControllerGetMethod = FrontendNvmeServiceGrpc.getNVMeControllerGetMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getNVMeControllerGetMethod = FrontendNvmeServiceGrpc.getNVMeControllerGetMethod) == null) {
          FrontendNvmeServiceGrpc.getNVMeControllerGetMethod = getNVMeControllerGetMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.NVMeControllerGetRequest, opi_api.storage.v1.NVMeController>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NVMeControllerGet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMeControllerGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMeController.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("NVMeControllerGet"))
              .build();
        }
      }
    }
    return getNVMeControllerGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeControllerStatsRequest,
      opi_api.storage.v1.NVMeControllerStatsResponse> getNVMeControllerStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NVMeControllerStats",
      requestType = opi_api.storage.v1.NVMeControllerStatsRequest.class,
      responseType = opi_api.storage.v1.NVMeControllerStatsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeControllerStatsRequest,
      opi_api.storage.v1.NVMeControllerStatsResponse> getNVMeControllerStatsMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeControllerStatsRequest, opi_api.storage.v1.NVMeControllerStatsResponse> getNVMeControllerStatsMethod;
    if ((getNVMeControllerStatsMethod = FrontendNvmeServiceGrpc.getNVMeControllerStatsMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getNVMeControllerStatsMethod = FrontendNvmeServiceGrpc.getNVMeControllerStatsMethod) == null) {
          FrontendNvmeServiceGrpc.getNVMeControllerStatsMethod = getNVMeControllerStatsMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.NVMeControllerStatsRequest, opi_api.storage.v1.NVMeControllerStatsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NVMeControllerStats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMeControllerStatsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMeControllerStatsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("NVMeControllerStats"))
              .build();
        }
      }
    }
    return getNVMeControllerStatsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeNamespaceCreateRequest,
      opi_api.storage.v1.NVMeNamespace> getNVMeNamespaceCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NVMeNamespaceCreate",
      requestType = opi_api.storage.v1.NVMeNamespaceCreateRequest.class,
      responseType = opi_api.storage.v1.NVMeNamespace.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeNamespaceCreateRequest,
      opi_api.storage.v1.NVMeNamespace> getNVMeNamespaceCreateMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeNamespaceCreateRequest, opi_api.storage.v1.NVMeNamespace> getNVMeNamespaceCreateMethod;
    if ((getNVMeNamespaceCreateMethod = FrontendNvmeServiceGrpc.getNVMeNamespaceCreateMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getNVMeNamespaceCreateMethod = FrontendNvmeServiceGrpc.getNVMeNamespaceCreateMethod) == null) {
          FrontendNvmeServiceGrpc.getNVMeNamespaceCreateMethod = getNVMeNamespaceCreateMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.NVMeNamespaceCreateRequest, opi_api.storage.v1.NVMeNamespace>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NVMeNamespaceCreate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMeNamespaceCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMeNamespace.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("NVMeNamespaceCreate"))
              .build();
        }
      }
    }
    return getNVMeNamespaceCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeNamespaceDeleteRequest,
      com.google.protobuf.Empty> getNVMeNamespaceDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NVMeNamespaceDelete",
      requestType = opi_api.storage.v1.NVMeNamespaceDeleteRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeNamespaceDeleteRequest,
      com.google.protobuf.Empty> getNVMeNamespaceDeleteMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeNamespaceDeleteRequest, com.google.protobuf.Empty> getNVMeNamespaceDeleteMethod;
    if ((getNVMeNamespaceDeleteMethod = FrontendNvmeServiceGrpc.getNVMeNamespaceDeleteMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getNVMeNamespaceDeleteMethod = FrontendNvmeServiceGrpc.getNVMeNamespaceDeleteMethod) == null) {
          FrontendNvmeServiceGrpc.getNVMeNamespaceDeleteMethod = getNVMeNamespaceDeleteMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.NVMeNamespaceDeleteRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NVMeNamespaceDelete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMeNamespaceDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("NVMeNamespaceDelete"))
              .build();
        }
      }
    }
    return getNVMeNamespaceDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeNamespaceUpdateRequest,
      opi_api.storage.v1.NVMeNamespace> getNVMeNamespaceUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NVMeNamespaceUpdate",
      requestType = opi_api.storage.v1.NVMeNamespaceUpdateRequest.class,
      responseType = opi_api.storage.v1.NVMeNamespace.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeNamespaceUpdateRequest,
      opi_api.storage.v1.NVMeNamespace> getNVMeNamespaceUpdateMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeNamespaceUpdateRequest, opi_api.storage.v1.NVMeNamespace> getNVMeNamespaceUpdateMethod;
    if ((getNVMeNamespaceUpdateMethod = FrontendNvmeServiceGrpc.getNVMeNamespaceUpdateMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getNVMeNamespaceUpdateMethod = FrontendNvmeServiceGrpc.getNVMeNamespaceUpdateMethod) == null) {
          FrontendNvmeServiceGrpc.getNVMeNamespaceUpdateMethod = getNVMeNamespaceUpdateMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.NVMeNamespaceUpdateRequest, opi_api.storage.v1.NVMeNamespace>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NVMeNamespaceUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMeNamespaceUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMeNamespace.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("NVMeNamespaceUpdate"))
              .build();
        }
      }
    }
    return getNVMeNamespaceUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeNamespaceListRequest,
      opi_api.storage.v1.NVMeNamespaceListResponse> getNVMeNamespaceListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NVMeNamespaceList",
      requestType = opi_api.storage.v1.NVMeNamespaceListRequest.class,
      responseType = opi_api.storage.v1.NVMeNamespaceListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeNamespaceListRequest,
      opi_api.storage.v1.NVMeNamespaceListResponse> getNVMeNamespaceListMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeNamespaceListRequest, opi_api.storage.v1.NVMeNamespaceListResponse> getNVMeNamespaceListMethod;
    if ((getNVMeNamespaceListMethod = FrontendNvmeServiceGrpc.getNVMeNamespaceListMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getNVMeNamespaceListMethod = FrontendNvmeServiceGrpc.getNVMeNamespaceListMethod) == null) {
          FrontendNvmeServiceGrpc.getNVMeNamespaceListMethod = getNVMeNamespaceListMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.NVMeNamespaceListRequest, opi_api.storage.v1.NVMeNamespaceListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NVMeNamespaceList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMeNamespaceListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMeNamespaceListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("NVMeNamespaceList"))
              .build();
        }
      }
    }
    return getNVMeNamespaceListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeNamespaceGetRequest,
      opi_api.storage.v1.NVMeNamespace> getNVMeNamespaceGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NVMeNamespaceGet",
      requestType = opi_api.storage.v1.NVMeNamespaceGetRequest.class,
      responseType = opi_api.storage.v1.NVMeNamespace.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeNamespaceGetRequest,
      opi_api.storage.v1.NVMeNamespace> getNVMeNamespaceGetMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeNamespaceGetRequest, opi_api.storage.v1.NVMeNamespace> getNVMeNamespaceGetMethod;
    if ((getNVMeNamespaceGetMethod = FrontendNvmeServiceGrpc.getNVMeNamespaceGetMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getNVMeNamespaceGetMethod = FrontendNvmeServiceGrpc.getNVMeNamespaceGetMethod) == null) {
          FrontendNvmeServiceGrpc.getNVMeNamespaceGetMethod = getNVMeNamespaceGetMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.NVMeNamespaceGetRequest, opi_api.storage.v1.NVMeNamespace>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NVMeNamespaceGet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMeNamespaceGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMeNamespace.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("NVMeNamespaceGet"))
              .build();
        }
      }
    }
    return getNVMeNamespaceGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeNamespaceStatsRequest,
      opi_api.storage.v1.NVMeNamespaceStatsResponse> getNVMeNamespaceStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NVMeNamespaceStats",
      requestType = opi_api.storage.v1.NVMeNamespaceStatsRequest.class,
      responseType = opi_api.storage.v1.NVMeNamespaceStatsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeNamespaceStatsRequest,
      opi_api.storage.v1.NVMeNamespaceStatsResponse> getNVMeNamespaceStatsMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.NVMeNamespaceStatsRequest, opi_api.storage.v1.NVMeNamespaceStatsResponse> getNVMeNamespaceStatsMethod;
    if ((getNVMeNamespaceStatsMethod = FrontendNvmeServiceGrpc.getNVMeNamespaceStatsMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getNVMeNamespaceStatsMethod = FrontendNvmeServiceGrpc.getNVMeNamespaceStatsMethod) == null) {
          FrontendNvmeServiceGrpc.getNVMeNamespaceStatsMethod = getNVMeNamespaceStatsMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.NVMeNamespaceStatsRequest, opi_api.storage.v1.NVMeNamespaceStatsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NVMeNamespaceStats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMeNamespaceStatsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMeNamespaceStatsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("NVMeNamespaceStats"))
              .build();
        }
      }
    }
    return getNVMeNamespaceStatsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FrontendNvmeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FrontendNvmeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FrontendNvmeServiceStub>() {
        @java.lang.Override
        public FrontendNvmeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FrontendNvmeServiceStub(channel, callOptions);
        }
      };
    return FrontendNvmeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FrontendNvmeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FrontendNvmeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FrontendNvmeServiceBlockingStub>() {
        @java.lang.Override
        public FrontendNvmeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FrontendNvmeServiceBlockingStub(channel, callOptions);
        }
      };
    return FrontendNvmeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FrontendNvmeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FrontendNvmeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FrontendNvmeServiceFutureStub>() {
        @java.lang.Override
        public FrontendNvmeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FrontendNvmeServiceFutureStub(channel, callOptions);
        }
      };
    return FrontendNvmeServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Front End (host-facing) APIs. Mostly used for NVMe/PCIe emulation and host presentation.
   * </pre>
   */
  public static abstract class FrontendNvmeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void nVMeSubsystemCreate(opi_api.storage.v1.NVMeSubsystemCreateRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeSubsystem> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNVMeSubsystemCreateMethod(), responseObserver);
    }

    /**
     */
    public void nVMeSubsystemDelete(opi_api.storage.v1.NVMeSubsystemDeleteRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNVMeSubsystemDeleteMethod(), responseObserver);
    }

    /**
     */
    public void nVMeSubsystemUpdate(opi_api.storage.v1.NVMeSubsystemUpdateRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeSubsystem> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNVMeSubsystemUpdateMethod(), responseObserver);
    }

    /**
     */
    public void nVMeSubsystemList(opi_api.storage.v1.NVMeSubsystemListRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeSubsystemListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNVMeSubsystemListMethod(), responseObserver);
    }

    /**
     */
    public void nVMeSubsystemGet(opi_api.storage.v1.NVMeSubsystemGetRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeSubsystem> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNVMeSubsystemGetMethod(), responseObserver);
    }

    /**
     */
    public void nVMeSubsystemStats(opi_api.storage.v1.NVMeSubsystemStatsRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeSubsystemStatsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNVMeSubsystemStatsMethod(), responseObserver);
    }

    /**
     */
    public void nVMeControllerCreate(opi_api.storage.v1.NVMeControllerCreateRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeController> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNVMeControllerCreateMethod(), responseObserver);
    }

    /**
     */
    public void nVMeControllerDelete(opi_api.storage.v1.NVMeControllerDeleteRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNVMeControllerDeleteMethod(), responseObserver);
    }

    /**
     */
    public void nVMeControllerUpdate(opi_api.storage.v1.NVMeControllerUpdateRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeController> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNVMeControllerUpdateMethod(), responseObserver);
    }

    /**
     */
    public void nVMeControllerList(opi_api.storage.v1.NVMeControllerListRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeControllerListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNVMeControllerListMethod(), responseObserver);
    }

    /**
     */
    public void nVMeControllerGet(opi_api.storage.v1.NVMeControllerGetRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeController> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNVMeControllerGetMethod(), responseObserver);
    }

    /**
     */
    public void nVMeControllerStats(opi_api.storage.v1.NVMeControllerStatsRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeControllerStatsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNVMeControllerStatsMethod(), responseObserver);
    }

    /**
     */
    public void nVMeNamespaceCreate(opi_api.storage.v1.NVMeNamespaceCreateRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeNamespace> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNVMeNamespaceCreateMethod(), responseObserver);
    }

    /**
     */
    public void nVMeNamespaceDelete(opi_api.storage.v1.NVMeNamespaceDeleteRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNVMeNamespaceDeleteMethod(), responseObserver);
    }

    /**
     */
    public void nVMeNamespaceUpdate(opi_api.storage.v1.NVMeNamespaceUpdateRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeNamespace> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNVMeNamespaceUpdateMethod(), responseObserver);
    }

    /**
     */
    public void nVMeNamespaceList(opi_api.storage.v1.NVMeNamespaceListRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeNamespaceListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNVMeNamespaceListMethod(), responseObserver);
    }

    /**
     */
    public void nVMeNamespaceGet(opi_api.storage.v1.NVMeNamespaceGetRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeNamespace> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNVMeNamespaceGetMethod(), responseObserver);
    }

    /**
     */
    public void nVMeNamespaceStats(opi_api.storage.v1.NVMeNamespaceStatsRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeNamespaceStatsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNVMeNamespaceStatsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getNVMeSubsystemCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.NVMeSubsystemCreateRequest,
                opi_api.storage.v1.NVMeSubsystem>(
                  this, METHODID_NVME_SUBSYSTEM_CREATE)))
          .addMethod(
            getNVMeSubsystemDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.NVMeSubsystemDeleteRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_NVME_SUBSYSTEM_DELETE)))
          .addMethod(
            getNVMeSubsystemUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.NVMeSubsystemUpdateRequest,
                opi_api.storage.v1.NVMeSubsystem>(
                  this, METHODID_NVME_SUBSYSTEM_UPDATE)))
          .addMethod(
            getNVMeSubsystemListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.NVMeSubsystemListRequest,
                opi_api.storage.v1.NVMeSubsystemListResponse>(
                  this, METHODID_NVME_SUBSYSTEM_LIST)))
          .addMethod(
            getNVMeSubsystemGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.NVMeSubsystemGetRequest,
                opi_api.storage.v1.NVMeSubsystem>(
                  this, METHODID_NVME_SUBSYSTEM_GET)))
          .addMethod(
            getNVMeSubsystemStatsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.NVMeSubsystemStatsRequest,
                opi_api.storage.v1.NVMeSubsystemStatsResponse>(
                  this, METHODID_NVME_SUBSYSTEM_STATS)))
          .addMethod(
            getNVMeControllerCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.NVMeControllerCreateRequest,
                opi_api.storage.v1.NVMeController>(
                  this, METHODID_NVME_CONTROLLER_CREATE)))
          .addMethod(
            getNVMeControllerDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.NVMeControllerDeleteRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_NVME_CONTROLLER_DELETE)))
          .addMethod(
            getNVMeControllerUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.NVMeControllerUpdateRequest,
                opi_api.storage.v1.NVMeController>(
                  this, METHODID_NVME_CONTROLLER_UPDATE)))
          .addMethod(
            getNVMeControllerListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.NVMeControllerListRequest,
                opi_api.storage.v1.NVMeControllerListResponse>(
                  this, METHODID_NVME_CONTROLLER_LIST)))
          .addMethod(
            getNVMeControllerGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.NVMeControllerGetRequest,
                opi_api.storage.v1.NVMeController>(
                  this, METHODID_NVME_CONTROLLER_GET)))
          .addMethod(
            getNVMeControllerStatsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.NVMeControllerStatsRequest,
                opi_api.storage.v1.NVMeControllerStatsResponse>(
                  this, METHODID_NVME_CONTROLLER_STATS)))
          .addMethod(
            getNVMeNamespaceCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.NVMeNamespaceCreateRequest,
                opi_api.storage.v1.NVMeNamespace>(
                  this, METHODID_NVME_NAMESPACE_CREATE)))
          .addMethod(
            getNVMeNamespaceDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.NVMeNamespaceDeleteRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_NVME_NAMESPACE_DELETE)))
          .addMethod(
            getNVMeNamespaceUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.NVMeNamespaceUpdateRequest,
                opi_api.storage.v1.NVMeNamespace>(
                  this, METHODID_NVME_NAMESPACE_UPDATE)))
          .addMethod(
            getNVMeNamespaceListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.NVMeNamespaceListRequest,
                opi_api.storage.v1.NVMeNamespaceListResponse>(
                  this, METHODID_NVME_NAMESPACE_LIST)))
          .addMethod(
            getNVMeNamespaceGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.NVMeNamespaceGetRequest,
                opi_api.storage.v1.NVMeNamespace>(
                  this, METHODID_NVME_NAMESPACE_GET)))
          .addMethod(
            getNVMeNamespaceStatsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.NVMeNamespaceStatsRequest,
                opi_api.storage.v1.NVMeNamespaceStatsResponse>(
                  this, METHODID_NVME_NAMESPACE_STATS)))
          .build();
    }
  }

  /**
   * <pre>
   * Front End (host-facing) APIs. Mostly used for NVMe/PCIe emulation and host presentation.
   * </pre>
   */
  public static final class FrontendNvmeServiceStub extends io.grpc.stub.AbstractAsyncStub<FrontendNvmeServiceStub> {
    private FrontendNvmeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FrontendNvmeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FrontendNvmeServiceStub(channel, callOptions);
    }

    /**
     */
    public void nVMeSubsystemCreate(opi_api.storage.v1.NVMeSubsystemCreateRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeSubsystem> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNVMeSubsystemCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void nVMeSubsystemDelete(opi_api.storage.v1.NVMeSubsystemDeleteRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNVMeSubsystemDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void nVMeSubsystemUpdate(opi_api.storage.v1.NVMeSubsystemUpdateRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeSubsystem> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNVMeSubsystemUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void nVMeSubsystemList(opi_api.storage.v1.NVMeSubsystemListRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeSubsystemListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNVMeSubsystemListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void nVMeSubsystemGet(opi_api.storage.v1.NVMeSubsystemGetRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeSubsystem> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNVMeSubsystemGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void nVMeSubsystemStats(opi_api.storage.v1.NVMeSubsystemStatsRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeSubsystemStatsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNVMeSubsystemStatsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void nVMeControllerCreate(opi_api.storage.v1.NVMeControllerCreateRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeController> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNVMeControllerCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void nVMeControllerDelete(opi_api.storage.v1.NVMeControllerDeleteRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNVMeControllerDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void nVMeControllerUpdate(opi_api.storage.v1.NVMeControllerUpdateRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeController> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNVMeControllerUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void nVMeControllerList(opi_api.storage.v1.NVMeControllerListRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeControllerListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNVMeControllerListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void nVMeControllerGet(opi_api.storage.v1.NVMeControllerGetRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeController> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNVMeControllerGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void nVMeControllerStats(opi_api.storage.v1.NVMeControllerStatsRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeControllerStatsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNVMeControllerStatsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void nVMeNamespaceCreate(opi_api.storage.v1.NVMeNamespaceCreateRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeNamespace> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNVMeNamespaceCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void nVMeNamespaceDelete(opi_api.storage.v1.NVMeNamespaceDeleteRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNVMeNamespaceDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void nVMeNamespaceUpdate(opi_api.storage.v1.NVMeNamespaceUpdateRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeNamespace> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNVMeNamespaceUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void nVMeNamespaceList(opi_api.storage.v1.NVMeNamespaceListRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeNamespaceListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNVMeNamespaceListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void nVMeNamespaceGet(opi_api.storage.v1.NVMeNamespaceGetRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeNamespace> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNVMeNamespaceGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void nVMeNamespaceStats(opi_api.storage.v1.NVMeNamespaceStatsRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeNamespaceStatsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNVMeNamespaceStatsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Front End (host-facing) APIs. Mostly used for NVMe/PCIe emulation and host presentation.
   * </pre>
   */
  public static final class FrontendNvmeServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<FrontendNvmeServiceBlockingStub> {
    private FrontendNvmeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FrontendNvmeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FrontendNvmeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public opi_api.storage.v1.NVMeSubsystem nVMeSubsystemCreate(opi_api.storage.v1.NVMeSubsystemCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNVMeSubsystemCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty nVMeSubsystemDelete(opi_api.storage.v1.NVMeSubsystemDeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNVMeSubsystemDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.NVMeSubsystem nVMeSubsystemUpdate(opi_api.storage.v1.NVMeSubsystemUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNVMeSubsystemUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.NVMeSubsystemListResponse nVMeSubsystemList(opi_api.storage.v1.NVMeSubsystemListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNVMeSubsystemListMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.NVMeSubsystem nVMeSubsystemGet(opi_api.storage.v1.NVMeSubsystemGetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNVMeSubsystemGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.NVMeSubsystemStatsResponse nVMeSubsystemStats(opi_api.storage.v1.NVMeSubsystemStatsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNVMeSubsystemStatsMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.NVMeController nVMeControllerCreate(opi_api.storage.v1.NVMeControllerCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNVMeControllerCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty nVMeControllerDelete(opi_api.storage.v1.NVMeControllerDeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNVMeControllerDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.NVMeController nVMeControllerUpdate(opi_api.storage.v1.NVMeControllerUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNVMeControllerUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.NVMeControllerListResponse nVMeControllerList(opi_api.storage.v1.NVMeControllerListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNVMeControllerListMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.NVMeController nVMeControllerGet(opi_api.storage.v1.NVMeControllerGetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNVMeControllerGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.NVMeControllerStatsResponse nVMeControllerStats(opi_api.storage.v1.NVMeControllerStatsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNVMeControllerStatsMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.NVMeNamespace nVMeNamespaceCreate(opi_api.storage.v1.NVMeNamespaceCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNVMeNamespaceCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty nVMeNamespaceDelete(opi_api.storage.v1.NVMeNamespaceDeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNVMeNamespaceDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.NVMeNamespace nVMeNamespaceUpdate(opi_api.storage.v1.NVMeNamespaceUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNVMeNamespaceUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.NVMeNamespaceListResponse nVMeNamespaceList(opi_api.storage.v1.NVMeNamespaceListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNVMeNamespaceListMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.NVMeNamespace nVMeNamespaceGet(opi_api.storage.v1.NVMeNamespaceGetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNVMeNamespaceGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.NVMeNamespaceStatsResponse nVMeNamespaceStats(opi_api.storage.v1.NVMeNamespaceStatsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNVMeNamespaceStatsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Front End (host-facing) APIs. Mostly used for NVMe/PCIe emulation and host presentation.
   * </pre>
   */
  public static final class FrontendNvmeServiceFutureStub extends io.grpc.stub.AbstractFutureStub<FrontendNvmeServiceFutureStub> {
    private FrontendNvmeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FrontendNvmeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FrontendNvmeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NVMeSubsystem> nVMeSubsystemCreate(
        opi_api.storage.v1.NVMeSubsystemCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNVMeSubsystemCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> nVMeSubsystemDelete(
        opi_api.storage.v1.NVMeSubsystemDeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNVMeSubsystemDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NVMeSubsystem> nVMeSubsystemUpdate(
        opi_api.storage.v1.NVMeSubsystemUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNVMeSubsystemUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NVMeSubsystemListResponse> nVMeSubsystemList(
        opi_api.storage.v1.NVMeSubsystemListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNVMeSubsystemListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NVMeSubsystem> nVMeSubsystemGet(
        opi_api.storage.v1.NVMeSubsystemGetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNVMeSubsystemGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NVMeSubsystemStatsResponse> nVMeSubsystemStats(
        opi_api.storage.v1.NVMeSubsystemStatsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNVMeSubsystemStatsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NVMeController> nVMeControllerCreate(
        opi_api.storage.v1.NVMeControllerCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNVMeControllerCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> nVMeControllerDelete(
        opi_api.storage.v1.NVMeControllerDeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNVMeControllerDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NVMeController> nVMeControllerUpdate(
        opi_api.storage.v1.NVMeControllerUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNVMeControllerUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NVMeControllerListResponse> nVMeControllerList(
        opi_api.storage.v1.NVMeControllerListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNVMeControllerListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NVMeController> nVMeControllerGet(
        opi_api.storage.v1.NVMeControllerGetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNVMeControllerGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NVMeControllerStatsResponse> nVMeControllerStats(
        opi_api.storage.v1.NVMeControllerStatsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNVMeControllerStatsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NVMeNamespace> nVMeNamespaceCreate(
        opi_api.storage.v1.NVMeNamespaceCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNVMeNamespaceCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> nVMeNamespaceDelete(
        opi_api.storage.v1.NVMeNamespaceDeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNVMeNamespaceDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NVMeNamespace> nVMeNamespaceUpdate(
        opi_api.storage.v1.NVMeNamespaceUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNVMeNamespaceUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NVMeNamespaceListResponse> nVMeNamespaceList(
        opi_api.storage.v1.NVMeNamespaceListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNVMeNamespaceListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NVMeNamespace> nVMeNamespaceGet(
        opi_api.storage.v1.NVMeNamespaceGetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNVMeNamespaceGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NVMeNamespaceStatsResponse> nVMeNamespaceStats(
        opi_api.storage.v1.NVMeNamespaceStatsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNVMeNamespaceStatsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_NVME_SUBSYSTEM_CREATE = 0;
  private static final int METHODID_NVME_SUBSYSTEM_DELETE = 1;
  private static final int METHODID_NVME_SUBSYSTEM_UPDATE = 2;
  private static final int METHODID_NVME_SUBSYSTEM_LIST = 3;
  private static final int METHODID_NVME_SUBSYSTEM_GET = 4;
  private static final int METHODID_NVME_SUBSYSTEM_STATS = 5;
  private static final int METHODID_NVME_CONTROLLER_CREATE = 6;
  private static final int METHODID_NVME_CONTROLLER_DELETE = 7;
  private static final int METHODID_NVME_CONTROLLER_UPDATE = 8;
  private static final int METHODID_NVME_CONTROLLER_LIST = 9;
  private static final int METHODID_NVME_CONTROLLER_GET = 10;
  private static final int METHODID_NVME_CONTROLLER_STATS = 11;
  private static final int METHODID_NVME_NAMESPACE_CREATE = 12;
  private static final int METHODID_NVME_NAMESPACE_DELETE = 13;
  private static final int METHODID_NVME_NAMESPACE_UPDATE = 14;
  private static final int METHODID_NVME_NAMESPACE_LIST = 15;
  private static final int METHODID_NVME_NAMESPACE_GET = 16;
  private static final int METHODID_NVME_NAMESPACE_STATS = 17;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FrontendNvmeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FrontendNvmeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_NVME_SUBSYSTEM_CREATE:
          serviceImpl.nVMeSubsystemCreate((opi_api.storage.v1.NVMeSubsystemCreateRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeSubsystem>) responseObserver);
          break;
        case METHODID_NVME_SUBSYSTEM_DELETE:
          serviceImpl.nVMeSubsystemDelete((opi_api.storage.v1.NVMeSubsystemDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_NVME_SUBSYSTEM_UPDATE:
          serviceImpl.nVMeSubsystemUpdate((opi_api.storage.v1.NVMeSubsystemUpdateRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeSubsystem>) responseObserver);
          break;
        case METHODID_NVME_SUBSYSTEM_LIST:
          serviceImpl.nVMeSubsystemList((opi_api.storage.v1.NVMeSubsystemListRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeSubsystemListResponse>) responseObserver);
          break;
        case METHODID_NVME_SUBSYSTEM_GET:
          serviceImpl.nVMeSubsystemGet((opi_api.storage.v1.NVMeSubsystemGetRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeSubsystem>) responseObserver);
          break;
        case METHODID_NVME_SUBSYSTEM_STATS:
          serviceImpl.nVMeSubsystemStats((opi_api.storage.v1.NVMeSubsystemStatsRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeSubsystemStatsResponse>) responseObserver);
          break;
        case METHODID_NVME_CONTROLLER_CREATE:
          serviceImpl.nVMeControllerCreate((opi_api.storage.v1.NVMeControllerCreateRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeController>) responseObserver);
          break;
        case METHODID_NVME_CONTROLLER_DELETE:
          serviceImpl.nVMeControllerDelete((opi_api.storage.v1.NVMeControllerDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_NVME_CONTROLLER_UPDATE:
          serviceImpl.nVMeControllerUpdate((opi_api.storage.v1.NVMeControllerUpdateRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeController>) responseObserver);
          break;
        case METHODID_NVME_CONTROLLER_LIST:
          serviceImpl.nVMeControllerList((opi_api.storage.v1.NVMeControllerListRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeControllerListResponse>) responseObserver);
          break;
        case METHODID_NVME_CONTROLLER_GET:
          serviceImpl.nVMeControllerGet((opi_api.storage.v1.NVMeControllerGetRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeController>) responseObserver);
          break;
        case METHODID_NVME_CONTROLLER_STATS:
          serviceImpl.nVMeControllerStats((opi_api.storage.v1.NVMeControllerStatsRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeControllerStatsResponse>) responseObserver);
          break;
        case METHODID_NVME_NAMESPACE_CREATE:
          serviceImpl.nVMeNamespaceCreate((opi_api.storage.v1.NVMeNamespaceCreateRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeNamespace>) responseObserver);
          break;
        case METHODID_NVME_NAMESPACE_DELETE:
          serviceImpl.nVMeNamespaceDelete((opi_api.storage.v1.NVMeNamespaceDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_NVME_NAMESPACE_UPDATE:
          serviceImpl.nVMeNamespaceUpdate((opi_api.storage.v1.NVMeNamespaceUpdateRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeNamespace>) responseObserver);
          break;
        case METHODID_NVME_NAMESPACE_LIST:
          serviceImpl.nVMeNamespaceList((opi_api.storage.v1.NVMeNamespaceListRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeNamespaceListResponse>) responseObserver);
          break;
        case METHODID_NVME_NAMESPACE_GET:
          serviceImpl.nVMeNamespaceGet((opi_api.storage.v1.NVMeNamespaceGetRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeNamespace>) responseObserver);
          break;
        case METHODID_NVME_NAMESPACE_STATS:
          serviceImpl.nVMeNamespaceStats((opi_api.storage.v1.NVMeNamespaceStatsRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeNamespaceStatsResponse>) responseObserver);
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

  private static abstract class FrontendNvmeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FrontendNvmeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return opi_api.storage.v1.FrontendNvmePcieProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FrontendNvmeService");
    }
  }

  private static final class FrontendNvmeServiceFileDescriptorSupplier
      extends FrontendNvmeServiceBaseDescriptorSupplier {
    FrontendNvmeServiceFileDescriptorSupplier() {}
  }

  private static final class FrontendNvmeServiceMethodDescriptorSupplier
      extends FrontendNvmeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FrontendNvmeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FrontendNvmeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FrontendNvmeServiceFileDescriptorSupplier())
              .addMethod(getNVMeSubsystemCreateMethod())
              .addMethod(getNVMeSubsystemDeleteMethod())
              .addMethod(getNVMeSubsystemUpdateMethod())
              .addMethod(getNVMeSubsystemListMethod())
              .addMethod(getNVMeSubsystemGetMethod())
              .addMethod(getNVMeSubsystemStatsMethod())
              .addMethod(getNVMeControllerCreateMethod())
              .addMethod(getNVMeControllerDeleteMethod())
              .addMethod(getNVMeControllerUpdateMethod())
              .addMethod(getNVMeControllerListMethod())
              .addMethod(getNVMeControllerGetMethod())
              .addMethod(getNVMeControllerStatsMethod())
              .addMethod(getNVMeNamespaceCreateMethod())
              .addMethod(getNVMeNamespaceDeleteMethod())
              .addMethod(getNVMeNamespaceUpdateMethod())
              .addMethod(getNVMeNamespaceListMethod())
              .addMethod(getNVMeNamespaceGetMethod())
              .addMethod(getNVMeNamespaceStatsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
