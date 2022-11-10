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
  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.CreateNVMeSubsystemRequest,
      opi_api.storage.v1.NVMeSubsystem> getCreateNVMeSubsystemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateNVMeSubsystem",
      requestType = opi_api.storage.v1.CreateNVMeSubsystemRequest.class,
      responseType = opi_api.storage.v1.NVMeSubsystem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.CreateNVMeSubsystemRequest,
      opi_api.storage.v1.NVMeSubsystem> getCreateNVMeSubsystemMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.CreateNVMeSubsystemRequest, opi_api.storage.v1.NVMeSubsystem> getCreateNVMeSubsystemMethod;
    if ((getCreateNVMeSubsystemMethod = FrontendNvmeServiceGrpc.getCreateNVMeSubsystemMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getCreateNVMeSubsystemMethod = FrontendNvmeServiceGrpc.getCreateNVMeSubsystemMethod) == null) {
          FrontendNvmeServiceGrpc.getCreateNVMeSubsystemMethod = getCreateNVMeSubsystemMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.CreateNVMeSubsystemRequest, opi_api.storage.v1.NVMeSubsystem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateNVMeSubsystem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.CreateNVMeSubsystemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMeSubsystem.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("CreateNVMeSubsystem"))
              .build();
        }
      }
    }
    return getCreateNVMeSubsystemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteNVMeSubsystemRequest,
      com.google.protobuf.Empty> getDeleteNVMeSubsystemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteNVMeSubsystem",
      requestType = opi_api.storage.v1.DeleteNVMeSubsystemRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteNVMeSubsystemRequest,
      com.google.protobuf.Empty> getDeleteNVMeSubsystemMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteNVMeSubsystemRequest, com.google.protobuf.Empty> getDeleteNVMeSubsystemMethod;
    if ((getDeleteNVMeSubsystemMethod = FrontendNvmeServiceGrpc.getDeleteNVMeSubsystemMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getDeleteNVMeSubsystemMethod = FrontendNvmeServiceGrpc.getDeleteNVMeSubsystemMethod) == null) {
          FrontendNvmeServiceGrpc.getDeleteNVMeSubsystemMethod = getDeleteNVMeSubsystemMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.DeleteNVMeSubsystemRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteNVMeSubsystem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.DeleteNVMeSubsystemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("DeleteNVMeSubsystem"))
              .build();
        }
      }
    }
    return getDeleteNVMeSubsystemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateNVMeSubsystemRequest,
      opi_api.storage.v1.NVMeSubsystem> getUpdateNVMeSubsystemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateNVMeSubsystem",
      requestType = opi_api.storage.v1.UpdateNVMeSubsystemRequest.class,
      responseType = opi_api.storage.v1.NVMeSubsystem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateNVMeSubsystemRequest,
      opi_api.storage.v1.NVMeSubsystem> getUpdateNVMeSubsystemMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateNVMeSubsystemRequest, opi_api.storage.v1.NVMeSubsystem> getUpdateNVMeSubsystemMethod;
    if ((getUpdateNVMeSubsystemMethod = FrontendNvmeServiceGrpc.getUpdateNVMeSubsystemMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getUpdateNVMeSubsystemMethod = FrontendNvmeServiceGrpc.getUpdateNVMeSubsystemMethod) == null) {
          FrontendNvmeServiceGrpc.getUpdateNVMeSubsystemMethod = getUpdateNVMeSubsystemMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.UpdateNVMeSubsystemRequest, opi_api.storage.v1.NVMeSubsystem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateNVMeSubsystem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.UpdateNVMeSubsystemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMeSubsystem.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("UpdateNVMeSubsystem"))
              .build();
        }
      }
    }
    return getUpdateNVMeSubsystemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.ListNVMeSubsystemRequest,
      opi_api.storage.v1.ListNVMeSubsystemResponse> getListNVMeSubsystemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNVMeSubsystem",
      requestType = opi_api.storage.v1.ListNVMeSubsystemRequest.class,
      responseType = opi_api.storage.v1.ListNVMeSubsystemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.ListNVMeSubsystemRequest,
      opi_api.storage.v1.ListNVMeSubsystemResponse> getListNVMeSubsystemMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.ListNVMeSubsystemRequest, opi_api.storage.v1.ListNVMeSubsystemResponse> getListNVMeSubsystemMethod;
    if ((getListNVMeSubsystemMethod = FrontendNvmeServiceGrpc.getListNVMeSubsystemMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getListNVMeSubsystemMethod = FrontendNvmeServiceGrpc.getListNVMeSubsystemMethod) == null) {
          FrontendNvmeServiceGrpc.getListNVMeSubsystemMethod = getListNVMeSubsystemMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.ListNVMeSubsystemRequest, opi_api.storage.v1.ListNVMeSubsystemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNVMeSubsystem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListNVMeSubsystemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListNVMeSubsystemResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("ListNVMeSubsystem"))
              .build();
        }
      }
    }
    return getListNVMeSubsystemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.GetNVMeSubsystemRequest,
      opi_api.storage.v1.NVMeSubsystem> getGetNVMeSubsystemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNVMeSubsystem",
      requestType = opi_api.storage.v1.GetNVMeSubsystemRequest.class,
      responseType = opi_api.storage.v1.NVMeSubsystem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.GetNVMeSubsystemRequest,
      opi_api.storage.v1.NVMeSubsystem> getGetNVMeSubsystemMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.GetNVMeSubsystemRequest, opi_api.storage.v1.NVMeSubsystem> getGetNVMeSubsystemMethod;
    if ((getGetNVMeSubsystemMethod = FrontendNvmeServiceGrpc.getGetNVMeSubsystemMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getGetNVMeSubsystemMethod = FrontendNvmeServiceGrpc.getGetNVMeSubsystemMethod) == null) {
          FrontendNvmeServiceGrpc.getGetNVMeSubsystemMethod = getGetNVMeSubsystemMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.GetNVMeSubsystemRequest, opi_api.storage.v1.NVMeSubsystem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNVMeSubsystem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.GetNVMeSubsystemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMeSubsystem.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("GetNVMeSubsystem"))
              .build();
        }
      }
    }
    return getGetNVMeSubsystemMethod;
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

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.CreateNVMeControllerRequest,
      opi_api.storage.v1.NVMeController> getCreateNVMeControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateNVMeController",
      requestType = opi_api.storage.v1.CreateNVMeControllerRequest.class,
      responseType = opi_api.storage.v1.NVMeController.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.CreateNVMeControllerRequest,
      opi_api.storage.v1.NVMeController> getCreateNVMeControllerMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.CreateNVMeControllerRequest, opi_api.storage.v1.NVMeController> getCreateNVMeControllerMethod;
    if ((getCreateNVMeControllerMethod = FrontendNvmeServiceGrpc.getCreateNVMeControllerMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getCreateNVMeControllerMethod = FrontendNvmeServiceGrpc.getCreateNVMeControllerMethod) == null) {
          FrontendNvmeServiceGrpc.getCreateNVMeControllerMethod = getCreateNVMeControllerMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.CreateNVMeControllerRequest, opi_api.storage.v1.NVMeController>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateNVMeController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.CreateNVMeControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMeController.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("CreateNVMeController"))
              .build();
        }
      }
    }
    return getCreateNVMeControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteNVMeControllerRequest,
      com.google.protobuf.Empty> getDeleteNVMeControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteNVMeController",
      requestType = opi_api.storage.v1.DeleteNVMeControllerRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteNVMeControllerRequest,
      com.google.protobuf.Empty> getDeleteNVMeControllerMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteNVMeControllerRequest, com.google.protobuf.Empty> getDeleteNVMeControllerMethod;
    if ((getDeleteNVMeControllerMethod = FrontendNvmeServiceGrpc.getDeleteNVMeControllerMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getDeleteNVMeControllerMethod = FrontendNvmeServiceGrpc.getDeleteNVMeControllerMethod) == null) {
          FrontendNvmeServiceGrpc.getDeleteNVMeControllerMethod = getDeleteNVMeControllerMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.DeleteNVMeControllerRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteNVMeController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.DeleteNVMeControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("DeleteNVMeController"))
              .build();
        }
      }
    }
    return getDeleteNVMeControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateNVMeControllerRequest,
      opi_api.storage.v1.NVMeController> getUpdateNVMeControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateNVMeController",
      requestType = opi_api.storage.v1.UpdateNVMeControllerRequest.class,
      responseType = opi_api.storage.v1.NVMeController.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateNVMeControllerRequest,
      opi_api.storage.v1.NVMeController> getUpdateNVMeControllerMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateNVMeControllerRequest, opi_api.storage.v1.NVMeController> getUpdateNVMeControllerMethod;
    if ((getUpdateNVMeControllerMethod = FrontendNvmeServiceGrpc.getUpdateNVMeControllerMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getUpdateNVMeControllerMethod = FrontendNvmeServiceGrpc.getUpdateNVMeControllerMethod) == null) {
          FrontendNvmeServiceGrpc.getUpdateNVMeControllerMethod = getUpdateNVMeControllerMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.UpdateNVMeControllerRequest, opi_api.storage.v1.NVMeController>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateNVMeController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.UpdateNVMeControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMeController.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("UpdateNVMeController"))
              .build();
        }
      }
    }
    return getUpdateNVMeControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.ListNVMeControllerRequest,
      opi_api.storage.v1.ListNVMeControllerResponse> getListNVMeControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNVMeController",
      requestType = opi_api.storage.v1.ListNVMeControllerRequest.class,
      responseType = opi_api.storage.v1.ListNVMeControllerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.ListNVMeControllerRequest,
      opi_api.storage.v1.ListNVMeControllerResponse> getListNVMeControllerMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.ListNVMeControllerRequest, opi_api.storage.v1.ListNVMeControllerResponse> getListNVMeControllerMethod;
    if ((getListNVMeControllerMethod = FrontendNvmeServiceGrpc.getListNVMeControllerMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getListNVMeControllerMethod = FrontendNvmeServiceGrpc.getListNVMeControllerMethod) == null) {
          FrontendNvmeServiceGrpc.getListNVMeControllerMethod = getListNVMeControllerMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.ListNVMeControllerRequest, opi_api.storage.v1.ListNVMeControllerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNVMeController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListNVMeControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListNVMeControllerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("ListNVMeController"))
              .build();
        }
      }
    }
    return getListNVMeControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.GetNVMeControllerRequest,
      opi_api.storage.v1.NVMeController> getGetNVMeControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNVMeController",
      requestType = opi_api.storage.v1.GetNVMeControllerRequest.class,
      responseType = opi_api.storage.v1.NVMeController.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.GetNVMeControllerRequest,
      opi_api.storage.v1.NVMeController> getGetNVMeControllerMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.GetNVMeControllerRequest, opi_api.storage.v1.NVMeController> getGetNVMeControllerMethod;
    if ((getGetNVMeControllerMethod = FrontendNvmeServiceGrpc.getGetNVMeControllerMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getGetNVMeControllerMethod = FrontendNvmeServiceGrpc.getGetNVMeControllerMethod) == null) {
          FrontendNvmeServiceGrpc.getGetNVMeControllerMethod = getGetNVMeControllerMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.GetNVMeControllerRequest, opi_api.storage.v1.NVMeController>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNVMeController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.GetNVMeControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMeController.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("GetNVMeController"))
              .build();
        }
      }
    }
    return getGetNVMeControllerMethod;
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

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.CreateNVMeNamespaceRequest,
      opi_api.storage.v1.NVMeNamespace> getCreateNVMeNamespaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateNVMeNamespace",
      requestType = opi_api.storage.v1.CreateNVMeNamespaceRequest.class,
      responseType = opi_api.storage.v1.NVMeNamespace.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.CreateNVMeNamespaceRequest,
      opi_api.storage.v1.NVMeNamespace> getCreateNVMeNamespaceMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.CreateNVMeNamespaceRequest, opi_api.storage.v1.NVMeNamespace> getCreateNVMeNamespaceMethod;
    if ((getCreateNVMeNamespaceMethod = FrontendNvmeServiceGrpc.getCreateNVMeNamespaceMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getCreateNVMeNamespaceMethod = FrontendNvmeServiceGrpc.getCreateNVMeNamespaceMethod) == null) {
          FrontendNvmeServiceGrpc.getCreateNVMeNamespaceMethod = getCreateNVMeNamespaceMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.CreateNVMeNamespaceRequest, opi_api.storage.v1.NVMeNamespace>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateNVMeNamespace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.CreateNVMeNamespaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMeNamespace.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("CreateNVMeNamespace"))
              .build();
        }
      }
    }
    return getCreateNVMeNamespaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteNVMeNamespaceRequest,
      com.google.protobuf.Empty> getDeleteNVMeNamespaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteNVMeNamespace",
      requestType = opi_api.storage.v1.DeleteNVMeNamespaceRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteNVMeNamespaceRequest,
      com.google.protobuf.Empty> getDeleteNVMeNamespaceMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteNVMeNamespaceRequest, com.google.protobuf.Empty> getDeleteNVMeNamespaceMethod;
    if ((getDeleteNVMeNamespaceMethod = FrontendNvmeServiceGrpc.getDeleteNVMeNamespaceMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getDeleteNVMeNamespaceMethod = FrontendNvmeServiceGrpc.getDeleteNVMeNamespaceMethod) == null) {
          FrontendNvmeServiceGrpc.getDeleteNVMeNamespaceMethod = getDeleteNVMeNamespaceMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.DeleteNVMeNamespaceRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteNVMeNamespace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.DeleteNVMeNamespaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("DeleteNVMeNamespace"))
              .build();
        }
      }
    }
    return getDeleteNVMeNamespaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateNVMeNamespaceRequest,
      opi_api.storage.v1.NVMeNamespace> getUpdateNVMeNamespaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateNVMeNamespace",
      requestType = opi_api.storage.v1.UpdateNVMeNamespaceRequest.class,
      responseType = opi_api.storage.v1.NVMeNamespace.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateNVMeNamespaceRequest,
      opi_api.storage.v1.NVMeNamespace> getUpdateNVMeNamespaceMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateNVMeNamespaceRequest, opi_api.storage.v1.NVMeNamespace> getUpdateNVMeNamespaceMethod;
    if ((getUpdateNVMeNamespaceMethod = FrontendNvmeServiceGrpc.getUpdateNVMeNamespaceMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getUpdateNVMeNamespaceMethod = FrontendNvmeServiceGrpc.getUpdateNVMeNamespaceMethod) == null) {
          FrontendNvmeServiceGrpc.getUpdateNVMeNamespaceMethod = getUpdateNVMeNamespaceMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.UpdateNVMeNamespaceRequest, opi_api.storage.v1.NVMeNamespace>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateNVMeNamespace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.UpdateNVMeNamespaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMeNamespace.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("UpdateNVMeNamespace"))
              .build();
        }
      }
    }
    return getUpdateNVMeNamespaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.ListNVMeNamespaceRequest,
      opi_api.storage.v1.ListNVMeNamespaceResponse> getListNVMeNamespaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNVMeNamespace",
      requestType = opi_api.storage.v1.ListNVMeNamespaceRequest.class,
      responseType = opi_api.storage.v1.ListNVMeNamespaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.ListNVMeNamespaceRequest,
      opi_api.storage.v1.ListNVMeNamespaceResponse> getListNVMeNamespaceMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.ListNVMeNamespaceRequest, opi_api.storage.v1.ListNVMeNamespaceResponse> getListNVMeNamespaceMethod;
    if ((getListNVMeNamespaceMethod = FrontendNvmeServiceGrpc.getListNVMeNamespaceMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getListNVMeNamespaceMethod = FrontendNvmeServiceGrpc.getListNVMeNamespaceMethod) == null) {
          FrontendNvmeServiceGrpc.getListNVMeNamespaceMethod = getListNVMeNamespaceMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.ListNVMeNamespaceRequest, opi_api.storage.v1.ListNVMeNamespaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNVMeNamespace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListNVMeNamespaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListNVMeNamespaceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("ListNVMeNamespace"))
              .build();
        }
      }
    }
    return getListNVMeNamespaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.GetNVMeNamespaceRequest,
      opi_api.storage.v1.NVMeNamespace> getGetNVMeNamespaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNVMeNamespace",
      requestType = opi_api.storage.v1.GetNVMeNamespaceRequest.class,
      responseType = opi_api.storage.v1.NVMeNamespace.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.GetNVMeNamespaceRequest,
      opi_api.storage.v1.NVMeNamespace> getGetNVMeNamespaceMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.GetNVMeNamespaceRequest, opi_api.storage.v1.NVMeNamespace> getGetNVMeNamespaceMethod;
    if ((getGetNVMeNamespaceMethod = FrontendNvmeServiceGrpc.getGetNVMeNamespaceMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getGetNVMeNamespaceMethod = FrontendNvmeServiceGrpc.getGetNVMeNamespaceMethod) == null) {
          FrontendNvmeServiceGrpc.getGetNVMeNamespaceMethod = getGetNVMeNamespaceMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.GetNVMeNamespaceRequest, opi_api.storage.v1.NVMeNamespace>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNVMeNamespace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.GetNVMeNamespaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMeNamespace.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("GetNVMeNamespace"))
              .build();
        }
      }
    }
    return getGetNVMeNamespaceMethod;
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
    public void createNVMeSubsystem(opi_api.storage.v1.CreateNVMeSubsystemRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeSubsystem> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateNVMeSubsystemMethod(), responseObserver);
    }

    /**
     */
    public void deleteNVMeSubsystem(opi_api.storage.v1.DeleteNVMeSubsystemRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteNVMeSubsystemMethod(), responseObserver);
    }

    /**
     */
    public void updateNVMeSubsystem(opi_api.storage.v1.UpdateNVMeSubsystemRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeSubsystem> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateNVMeSubsystemMethod(), responseObserver);
    }

    /**
     */
    public void listNVMeSubsystem(opi_api.storage.v1.ListNVMeSubsystemRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListNVMeSubsystemResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListNVMeSubsystemMethod(), responseObserver);
    }

    /**
     */
    public void getNVMeSubsystem(opi_api.storage.v1.GetNVMeSubsystemRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeSubsystem> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNVMeSubsystemMethod(), responseObserver);
    }

    /**
     */
    public void nVMeSubsystemStats(opi_api.storage.v1.NVMeSubsystemStatsRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeSubsystemStatsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNVMeSubsystemStatsMethod(), responseObserver);
    }

    /**
     */
    public void createNVMeController(opi_api.storage.v1.CreateNVMeControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeController> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateNVMeControllerMethod(), responseObserver);
    }

    /**
     */
    public void deleteNVMeController(opi_api.storage.v1.DeleteNVMeControllerRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteNVMeControllerMethod(), responseObserver);
    }

    /**
     */
    public void updateNVMeController(opi_api.storage.v1.UpdateNVMeControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeController> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateNVMeControllerMethod(), responseObserver);
    }

    /**
     */
    public void listNVMeController(opi_api.storage.v1.ListNVMeControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListNVMeControllerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListNVMeControllerMethod(), responseObserver);
    }

    /**
     */
    public void getNVMeController(opi_api.storage.v1.GetNVMeControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeController> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNVMeControllerMethod(), responseObserver);
    }

    /**
     */
    public void nVMeControllerStats(opi_api.storage.v1.NVMeControllerStatsRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeControllerStatsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNVMeControllerStatsMethod(), responseObserver);
    }

    /**
     */
    public void createNVMeNamespace(opi_api.storage.v1.CreateNVMeNamespaceRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeNamespace> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateNVMeNamespaceMethod(), responseObserver);
    }

    /**
     */
    public void deleteNVMeNamespace(opi_api.storage.v1.DeleteNVMeNamespaceRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteNVMeNamespaceMethod(), responseObserver);
    }

    /**
     */
    public void updateNVMeNamespace(opi_api.storage.v1.UpdateNVMeNamespaceRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeNamespace> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateNVMeNamespaceMethod(), responseObserver);
    }

    /**
     */
    public void listNVMeNamespace(opi_api.storage.v1.ListNVMeNamespaceRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListNVMeNamespaceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListNVMeNamespaceMethod(), responseObserver);
    }

    /**
     */
    public void getNVMeNamespace(opi_api.storage.v1.GetNVMeNamespaceRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeNamespace> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNVMeNamespaceMethod(), responseObserver);
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
            getCreateNVMeSubsystemMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.CreateNVMeSubsystemRequest,
                opi_api.storage.v1.NVMeSubsystem>(
                  this, METHODID_CREATE_NVME_SUBSYSTEM)))
          .addMethod(
            getDeleteNVMeSubsystemMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.DeleteNVMeSubsystemRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_NVME_SUBSYSTEM)))
          .addMethod(
            getUpdateNVMeSubsystemMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.UpdateNVMeSubsystemRequest,
                opi_api.storage.v1.NVMeSubsystem>(
                  this, METHODID_UPDATE_NVME_SUBSYSTEM)))
          .addMethod(
            getListNVMeSubsystemMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.ListNVMeSubsystemRequest,
                opi_api.storage.v1.ListNVMeSubsystemResponse>(
                  this, METHODID_LIST_NVME_SUBSYSTEM)))
          .addMethod(
            getGetNVMeSubsystemMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.GetNVMeSubsystemRequest,
                opi_api.storage.v1.NVMeSubsystem>(
                  this, METHODID_GET_NVME_SUBSYSTEM)))
          .addMethod(
            getNVMeSubsystemStatsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.NVMeSubsystemStatsRequest,
                opi_api.storage.v1.NVMeSubsystemStatsResponse>(
                  this, METHODID_NVME_SUBSYSTEM_STATS)))
          .addMethod(
            getCreateNVMeControllerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.CreateNVMeControllerRequest,
                opi_api.storage.v1.NVMeController>(
                  this, METHODID_CREATE_NVME_CONTROLLER)))
          .addMethod(
            getDeleteNVMeControllerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.DeleteNVMeControllerRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_NVME_CONTROLLER)))
          .addMethod(
            getUpdateNVMeControllerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.UpdateNVMeControllerRequest,
                opi_api.storage.v1.NVMeController>(
                  this, METHODID_UPDATE_NVME_CONTROLLER)))
          .addMethod(
            getListNVMeControllerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.ListNVMeControllerRequest,
                opi_api.storage.v1.ListNVMeControllerResponse>(
                  this, METHODID_LIST_NVME_CONTROLLER)))
          .addMethod(
            getGetNVMeControllerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.GetNVMeControllerRequest,
                opi_api.storage.v1.NVMeController>(
                  this, METHODID_GET_NVME_CONTROLLER)))
          .addMethod(
            getNVMeControllerStatsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.NVMeControllerStatsRequest,
                opi_api.storage.v1.NVMeControllerStatsResponse>(
                  this, METHODID_NVME_CONTROLLER_STATS)))
          .addMethod(
            getCreateNVMeNamespaceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.CreateNVMeNamespaceRequest,
                opi_api.storage.v1.NVMeNamespace>(
                  this, METHODID_CREATE_NVME_NAMESPACE)))
          .addMethod(
            getDeleteNVMeNamespaceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.DeleteNVMeNamespaceRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_NVME_NAMESPACE)))
          .addMethod(
            getUpdateNVMeNamespaceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.UpdateNVMeNamespaceRequest,
                opi_api.storage.v1.NVMeNamespace>(
                  this, METHODID_UPDATE_NVME_NAMESPACE)))
          .addMethod(
            getListNVMeNamespaceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.ListNVMeNamespaceRequest,
                opi_api.storage.v1.ListNVMeNamespaceResponse>(
                  this, METHODID_LIST_NVME_NAMESPACE)))
          .addMethod(
            getGetNVMeNamespaceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.GetNVMeNamespaceRequest,
                opi_api.storage.v1.NVMeNamespace>(
                  this, METHODID_GET_NVME_NAMESPACE)))
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
    public void createNVMeSubsystem(opi_api.storage.v1.CreateNVMeSubsystemRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeSubsystem> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateNVMeSubsystemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteNVMeSubsystem(opi_api.storage.v1.DeleteNVMeSubsystemRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteNVMeSubsystemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateNVMeSubsystem(opi_api.storage.v1.UpdateNVMeSubsystemRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeSubsystem> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateNVMeSubsystemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listNVMeSubsystem(opi_api.storage.v1.ListNVMeSubsystemRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListNVMeSubsystemResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListNVMeSubsystemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNVMeSubsystem(opi_api.storage.v1.GetNVMeSubsystemRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeSubsystem> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNVMeSubsystemMethod(), getCallOptions()), request, responseObserver);
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
    public void createNVMeController(opi_api.storage.v1.CreateNVMeControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeController> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateNVMeControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteNVMeController(opi_api.storage.v1.DeleteNVMeControllerRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteNVMeControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateNVMeController(opi_api.storage.v1.UpdateNVMeControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeController> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateNVMeControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listNVMeController(opi_api.storage.v1.ListNVMeControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListNVMeControllerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListNVMeControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNVMeController(opi_api.storage.v1.GetNVMeControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeController> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNVMeControllerMethod(), getCallOptions()), request, responseObserver);
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
    public void createNVMeNamespace(opi_api.storage.v1.CreateNVMeNamespaceRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeNamespace> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateNVMeNamespaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteNVMeNamespace(opi_api.storage.v1.DeleteNVMeNamespaceRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteNVMeNamespaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateNVMeNamespace(opi_api.storage.v1.UpdateNVMeNamespaceRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeNamespace> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateNVMeNamespaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listNVMeNamespace(opi_api.storage.v1.ListNVMeNamespaceRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListNVMeNamespaceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListNVMeNamespaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNVMeNamespace(opi_api.storage.v1.GetNVMeNamespaceRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeNamespace> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNVMeNamespaceMethod(), getCallOptions()), request, responseObserver);
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
    public opi_api.storage.v1.NVMeSubsystem createNVMeSubsystem(opi_api.storage.v1.CreateNVMeSubsystemRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateNVMeSubsystemMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteNVMeSubsystem(opi_api.storage.v1.DeleteNVMeSubsystemRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteNVMeSubsystemMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.NVMeSubsystem updateNVMeSubsystem(opi_api.storage.v1.UpdateNVMeSubsystemRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateNVMeSubsystemMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.ListNVMeSubsystemResponse listNVMeSubsystem(opi_api.storage.v1.ListNVMeSubsystemRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListNVMeSubsystemMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.NVMeSubsystem getNVMeSubsystem(opi_api.storage.v1.GetNVMeSubsystemRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNVMeSubsystemMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.NVMeSubsystemStatsResponse nVMeSubsystemStats(opi_api.storage.v1.NVMeSubsystemStatsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNVMeSubsystemStatsMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.NVMeController createNVMeController(opi_api.storage.v1.CreateNVMeControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateNVMeControllerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteNVMeController(opi_api.storage.v1.DeleteNVMeControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteNVMeControllerMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.NVMeController updateNVMeController(opi_api.storage.v1.UpdateNVMeControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateNVMeControllerMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.ListNVMeControllerResponse listNVMeController(opi_api.storage.v1.ListNVMeControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListNVMeControllerMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.NVMeController getNVMeController(opi_api.storage.v1.GetNVMeControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNVMeControllerMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.NVMeControllerStatsResponse nVMeControllerStats(opi_api.storage.v1.NVMeControllerStatsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNVMeControllerStatsMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.NVMeNamespace createNVMeNamespace(opi_api.storage.v1.CreateNVMeNamespaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateNVMeNamespaceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteNVMeNamespace(opi_api.storage.v1.DeleteNVMeNamespaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteNVMeNamespaceMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.NVMeNamespace updateNVMeNamespace(opi_api.storage.v1.UpdateNVMeNamespaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateNVMeNamespaceMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.ListNVMeNamespaceResponse listNVMeNamespace(opi_api.storage.v1.ListNVMeNamespaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListNVMeNamespaceMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.NVMeNamespace getNVMeNamespace(opi_api.storage.v1.GetNVMeNamespaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNVMeNamespaceMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NVMeSubsystem> createNVMeSubsystem(
        opi_api.storage.v1.CreateNVMeSubsystemRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateNVMeSubsystemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteNVMeSubsystem(
        opi_api.storage.v1.DeleteNVMeSubsystemRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteNVMeSubsystemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NVMeSubsystem> updateNVMeSubsystem(
        opi_api.storage.v1.UpdateNVMeSubsystemRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateNVMeSubsystemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.ListNVMeSubsystemResponse> listNVMeSubsystem(
        opi_api.storage.v1.ListNVMeSubsystemRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListNVMeSubsystemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NVMeSubsystem> getNVMeSubsystem(
        opi_api.storage.v1.GetNVMeSubsystemRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNVMeSubsystemMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NVMeController> createNVMeController(
        opi_api.storage.v1.CreateNVMeControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateNVMeControllerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteNVMeController(
        opi_api.storage.v1.DeleteNVMeControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteNVMeControllerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NVMeController> updateNVMeController(
        opi_api.storage.v1.UpdateNVMeControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateNVMeControllerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.ListNVMeControllerResponse> listNVMeController(
        opi_api.storage.v1.ListNVMeControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListNVMeControllerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NVMeController> getNVMeController(
        opi_api.storage.v1.GetNVMeControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNVMeControllerMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NVMeNamespace> createNVMeNamespace(
        opi_api.storage.v1.CreateNVMeNamespaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateNVMeNamespaceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteNVMeNamespace(
        opi_api.storage.v1.DeleteNVMeNamespaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteNVMeNamespaceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NVMeNamespace> updateNVMeNamespace(
        opi_api.storage.v1.UpdateNVMeNamespaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateNVMeNamespaceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.ListNVMeNamespaceResponse> listNVMeNamespace(
        opi_api.storage.v1.ListNVMeNamespaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListNVMeNamespaceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NVMeNamespace> getNVMeNamespace(
        opi_api.storage.v1.GetNVMeNamespaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNVMeNamespaceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NVMeNamespaceStatsResponse> nVMeNamespaceStats(
        opi_api.storage.v1.NVMeNamespaceStatsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNVMeNamespaceStatsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_NVME_SUBSYSTEM = 0;
  private static final int METHODID_DELETE_NVME_SUBSYSTEM = 1;
  private static final int METHODID_UPDATE_NVME_SUBSYSTEM = 2;
  private static final int METHODID_LIST_NVME_SUBSYSTEM = 3;
  private static final int METHODID_GET_NVME_SUBSYSTEM = 4;
  private static final int METHODID_NVME_SUBSYSTEM_STATS = 5;
  private static final int METHODID_CREATE_NVME_CONTROLLER = 6;
  private static final int METHODID_DELETE_NVME_CONTROLLER = 7;
  private static final int METHODID_UPDATE_NVME_CONTROLLER = 8;
  private static final int METHODID_LIST_NVME_CONTROLLER = 9;
  private static final int METHODID_GET_NVME_CONTROLLER = 10;
  private static final int METHODID_NVME_CONTROLLER_STATS = 11;
  private static final int METHODID_CREATE_NVME_NAMESPACE = 12;
  private static final int METHODID_DELETE_NVME_NAMESPACE = 13;
  private static final int METHODID_UPDATE_NVME_NAMESPACE = 14;
  private static final int METHODID_LIST_NVME_NAMESPACE = 15;
  private static final int METHODID_GET_NVME_NAMESPACE = 16;
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
        case METHODID_CREATE_NVME_SUBSYSTEM:
          serviceImpl.createNVMeSubsystem((opi_api.storage.v1.CreateNVMeSubsystemRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeSubsystem>) responseObserver);
          break;
        case METHODID_DELETE_NVME_SUBSYSTEM:
          serviceImpl.deleteNVMeSubsystem((opi_api.storage.v1.DeleteNVMeSubsystemRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_NVME_SUBSYSTEM:
          serviceImpl.updateNVMeSubsystem((opi_api.storage.v1.UpdateNVMeSubsystemRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeSubsystem>) responseObserver);
          break;
        case METHODID_LIST_NVME_SUBSYSTEM:
          serviceImpl.listNVMeSubsystem((opi_api.storage.v1.ListNVMeSubsystemRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.ListNVMeSubsystemResponse>) responseObserver);
          break;
        case METHODID_GET_NVME_SUBSYSTEM:
          serviceImpl.getNVMeSubsystem((opi_api.storage.v1.GetNVMeSubsystemRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeSubsystem>) responseObserver);
          break;
        case METHODID_NVME_SUBSYSTEM_STATS:
          serviceImpl.nVMeSubsystemStats((opi_api.storage.v1.NVMeSubsystemStatsRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeSubsystemStatsResponse>) responseObserver);
          break;
        case METHODID_CREATE_NVME_CONTROLLER:
          serviceImpl.createNVMeController((opi_api.storage.v1.CreateNVMeControllerRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeController>) responseObserver);
          break;
        case METHODID_DELETE_NVME_CONTROLLER:
          serviceImpl.deleteNVMeController((opi_api.storage.v1.DeleteNVMeControllerRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_NVME_CONTROLLER:
          serviceImpl.updateNVMeController((opi_api.storage.v1.UpdateNVMeControllerRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeController>) responseObserver);
          break;
        case METHODID_LIST_NVME_CONTROLLER:
          serviceImpl.listNVMeController((opi_api.storage.v1.ListNVMeControllerRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.ListNVMeControllerResponse>) responseObserver);
          break;
        case METHODID_GET_NVME_CONTROLLER:
          serviceImpl.getNVMeController((opi_api.storage.v1.GetNVMeControllerRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeController>) responseObserver);
          break;
        case METHODID_NVME_CONTROLLER_STATS:
          serviceImpl.nVMeControllerStats((opi_api.storage.v1.NVMeControllerStatsRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeControllerStatsResponse>) responseObserver);
          break;
        case METHODID_CREATE_NVME_NAMESPACE:
          serviceImpl.createNVMeNamespace((opi_api.storage.v1.CreateNVMeNamespaceRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeNamespace>) responseObserver);
          break;
        case METHODID_DELETE_NVME_NAMESPACE:
          serviceImpl.deleteNVMeNamespace((opi_api.storage.v1.DeleteNVMeNamespaceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_NVME_NAMESPACE:
          serviceImpl.updateNVMeNamespace((opi_api.storage.v1.UpdateNVMeNamespaceRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMeNamespace>) responseObserver);
          break;
        case METHODID_LIST_NVME_NAMESPACE:
          serviceImpl.listNVMeNamespace((opi_api.storage.v1.ListNVMeNamespaceRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.ListNVMeNamespaceResponse>) responseObserver);
          break;
        case METHODID_GET_NVME_NAMESPACE:
          serviceImpl.getNVMeNamespace((opi_api.storage.v1.GetNVMeNamespaceRequest) request,
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
              .addMethod(getCreateNVMeSubsystemMethod())
              .addMethod(getDeleteNVMeSubsystemMethod())
              .addMethod(getUpdateNVMeSubsystemMethod())
              .addMethod(getListNVMeSubsystemMethod())
              .addMethod(getGetNVMeSubsystemMethod())
              .addMethod(getNVMeSubsystemStatsMethod())
              .addMethod(getCreateNVMeControllerMethod())
              .addMethod(getDeleteNVMeControllerMethod())
              .addMethod(getUpdateNVMeControllerMethod())
              .addMethod(getListNVMeControllerMethod())
              .addMethod(getGetNVMeControllerMethod())
              .addMethod(getNVMeControllerStatsMethod())
              .addMethod(getCreateNVMeNamespaceMethod())
              .addMethod(getDeleteNVMeNamespaceMethod())
              .addMethod(getUpdateNVMeNamespaceMethod())
              .addMethod(getListNVMeNamespaceMethod())
              .addMethod(getGetNVMeNamespaceMethod())
              .addMethod(getNVMeNamespaceStatsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
