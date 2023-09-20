package opi_api.storage.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Front End (host-facing) APIs. Mostly used for Nvme/PCIe emulation and host presentation.
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
  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.CreateNvmeSubsystemRequest,
      opi_api.storage.v1.NvmeSubsystem> getCreateNvmeSubsystemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateNvmeSubsystem",
      requestType = opi_api.storage.v1.CreateNvmeSubsystemRequest.class,
      responseType = opi_api.storage.v1.NvmeSubsystem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.CreateNvmeSubsystemRequest,
      opi_api.storage.v1.NvmeSubsystem> getCreateNvmeSubsystemMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.CreateNvmeSubsystemRequest, opi_api.storage.v1.NvmeSubsystem> getCreateNvmeSubsystemMethod;
    if ((getCreateNvmeSubsystemMethod = FrontendNvmeServiceGrpc.getCreateNvmeSubsystemMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getCreateNvmeSubsystemMethod = FrontendNvmeServiceGrpc.getCreateNvmeSubsystemMethod) == null) {
          FrontendNvmeServiceGrpc.getCreateNvmeSubsystemMethod = getCreateNvmeSubsystemMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.CreateNvmeSubsystemRequest, opi_api.storage.v1.NvmeSubsystem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateNvmeSubsystem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.CreateNvmeSubsystemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NvmeSubsystem.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("CreateNvmeSubsystem"))
              .build();
        }
      }
    }
    return getCreateNvmeSubsystemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteNvmeSubsystemRequest,
      com.google.protobuf.Empty> getDeleteNvmeSubsystemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteNvmeSubsystem",
      requestType = opi_api.storage.v1.DeleteNvmeSubsystemRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteNvmeSubsystemRequest,
      com.google.protobuf.Empty> getDeleteNvmeSubsystemMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteNvmeSubsystemRequest, com.google.protobuf.Empty> getDeleteNvmeSubsystemMethod;
    if ((getDeleteNvmeSubsystemMethod = FrontendNvmeServiceGrpc.getDeleteNvmeSubsystemMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getDeleteNvmeSubsystemMethod = FrontendNvmeServiceGrpc.getDeleteNvmeSubsystemMethod) == null) {
          FrontendNvmeServiceGrpc.getDeleteNvmeSubsystemMethod = getDeleteNvmeSubsystemMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.DeleteNvmeSubsystemRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteNvmeSubsystem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.DeleteNvmeSubsystemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("DeleteNvmeSubsystem"))
              .build();
        }
      }
    }
    return getDeleteNvmeSubsystemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateNvmeSubsystemRequest,
      opi_api.storage.v1.NvmeSubsystem> getUpdateNvmeSubsystemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateNvmeSubsystem",
      requestType = opi_api.storage.v1.UpdateNvmeSubsystemRequest.class,
      responseType = opi_api.storage.v1.NvmeSubsystem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateNvmeSubsystemRequest,
      opi_api.storage.v1.NvmeSubsystem> getUpdateNvmeSubsystemMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateNvmeSubsystemRequest, opi_api.storage.v1.NvmeSubsystem> getUpdateNvmeSubsystemMethod;
    if ((getUpdateNvmeSubsystemMethod = FrontendNvmeServiceGrpc.getUpdateNvmeSubsystemMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getUpdateNvmeSubsystemMethod = FrontendNvmeServiceGrpc.getUpdateNvmeSubsystemMethod) == null) {
          FrontendNvmeServiceGrpc.getUpdateNvmeSubsystemMethod = getUpdateNvmeSubsystemMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.UpdateNvmeSubsystemRequest, opi_api.storage.v1.NvmeSubsystem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateNvmeSubsystem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.UpdateNvmeSubsystemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NvmeSubsystem.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("UpdateNvmeSubsystem"))
              .build();
        }
      }
    }
    return getUpdateNvmeSubsystemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.ListNvmeSubsystemsRequest,
      opi_api.storage.v1.ListNvmeSubsystemsResponse> getListNvmeSubsystemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNvmeSubsystems",
      requestType = opi_api.storage.v1.ListNvmeSubsystemsRequest.class,
      responseType = opi_api.storage.v1.ListNvmeSubsystemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.ListNvmeSubsystemsRequest,
      opi_api.storage.v1.ListNvmeSubsystemsResponse> getListNvmeSubsystemsMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.ListNvmeSubsystemsRequest, opi_api.storage.v1.ListNvmeSubsystemsResponse> getListNvmeSubsystemsMethod;
    if ((getListNvmeSubsystemsMethod = FrontendNvmeServiceGrpc.getListNvmeSubsystemsMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getListNvmeSubsystemsMethod = FrontendNvmeServiceGrpc.getListNvmeSubsystemsMethod) == null) {
          FrontendNvmeServiceGrpc.getListNvmeSubsystemsMethod = getListNvmeSubsystemsMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.ListNvmeSubsystemsRequest, opi_api.storage.v1.ListNvmeSubsystemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNvmeSubsystems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListNvmeSubsystemsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListNvmeSubsystemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("ListNvmeSubsystems"))
              .build();
        }
      }
    }
    return getListNvmeSubsystemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.GetNvmeSubsystemRequest,
      opi_api.storage.v1.NvmeSubsystem> getGetNvmeSubsystemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNvmeSubsystem",
      requestType = opi_api.storage.v1.GetNvmeSubsystemRequest.class,
      responseType = opi_api.storage.v1.NvmeSubsystem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.GetNvmeSubsystemRequest,
      opi_api.storage.v1.NvmeSubsystem> getGetNvmeSubsystemMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.GetNvmeSubsystemRequest, opi_api.storage.v1.NvmeSubsystem> getGetNvmeSubsystemMethod;
    if ((getGetNvmeSubsystemMethod = FrontendNvmeServiceGrpc.getGetNvmeSubsystemMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getGetNvmeSubsystemMethod = FrontendNvmeServiceGrpc.getGetNvmeSubsystemMethod) == null) {
          FrontendNvmeServiceGrpc.getGetNvmeSubsystemMethod = getGetNvmeSubsystemMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.GetNvmeSubsystemRequest, opi_api.storage.v1.NvmeSubsystem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNvmeSubsystem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.GetNvmeSubsystemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NvmeSubsystem.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("GetNvmeSubsystem"))
              .build();
        }
      }
    }
    return getGetNvmeSubsystemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.StatsNvmeSubsystemRequest,
      opi_api.storage.v1.StatsNvmeSubsystemResponse> getStatsNvmeSubsystemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StatsNvmeSubsystem",
      requestType = opi_api.storage.v1.StatsNvmeSubsystemRequest.class,
      responseType = opi_api.storage.v1.StatsNvmeSubsystemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.StatsNvmeSubsystemRequest,
      opi_api.storage.v1.StatsNvmeSubsystemResponse> getStatsNvmeSubsystemMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.StatsNvmeSubsystemRequest, opi_api.storage.v1.StatsNvmeSubsystemResponse> getStatsNvmeSubsystemMethod;
    if ((getStatsNvmeSubsystemMethod = FrontendNvmeServiceGrpc.getStatsNvmeSubsystemMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getStatsNvmeSubsystemMethod = FrontendNvmeServiceGrpc.getStatsNvmeSubsystemMethod) == null) {
          FrontendNvmeServiceGrpc.getStatsNvmeSubsystemMethod = getStatsNvmeSubsystemMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.StatsNvmeSubsystemRequest, opi_api.storage.v1.StatsNvmeSubsystemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StatsNvmeSubsystem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.StatsNvmeSubsystemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.StatsNvmeSubsystemResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("StatsNvmeSubsystem"))
              .build();
        }
      }
    }
    return getStatsNvmeSubsystemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.CreateNvmeControllerRequest,
      opi_api.storage.v1.NvmeController> getCreateNvmeControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateNvmeController",
      requestType = opi_api.storage.v1.CreateNvmeControllerRequest.class,
      responseType = opi_api.storage.v1.NvmeController.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.CreateNvmeControllerRequest,
      opi_api.storage.v1.NvmeController> getCreateNvmeControllerMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.CreateNvmeControllerRequest, opi_api.storage.v1.NvmeController> getCreateNvmeControllerMethod;
    if ((getCreateNvmeControllerMethod = FrontendNvmeServiceGrpc.getCreateNvmeControllerMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getCreateNvmeControllerMethod = FrontendNvmeServiceGrpc.getCreateNvmeControllerMethod) == null) {
          FrontendNvmeServiceGrpc.getCreateNvmeControllerMethod = getCreateNvmeControllerMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.CreateNvmeControllerRequest, opi_api.storage.v1.NvmeController>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateNvmeController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.CreateNvmeControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NvmeController.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("CreateNvmeController"))
              .build();
        }
      }
    }
    return getCreateNvmeControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteNvmeControllerRequest,
      com.google.protobuf.Empty> getDeleteNvmeControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteNvmeController",
      requestType = opi_api.storage.v1.DeleteNvmeControllerRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteNvmeControllerRequest,
      com.google.protobuf.Empty> getDeleteNvmeControllerMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteNvmeControllerRequest, com.google.protobuf.Empty> getDeleteNvmeControllerMethod;
    if ((getDeleteNvmeControllerMethod = FrontendNvmeServiceGrpc.getDeleteNvmeControllerMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getDeleteNvmeControllerMethod = FrontendNvmeServiceGrpc.getDeleteNvmeControllerMethod) == null) {
          FrontendNvmeServiceGrpc.getDeleteNvmeControllerMethod = getDeleteNvmeControllerMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.DeleteNvmeControllerRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteNvmeController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.DeleteNvmeControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("DeleteNvmeController"))
              .build();
        }
      }
    }
    return getDeleteNvmeControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateNvmeControllerRequest,
      opi_api.storage.v1.NvmeController> getUpdateNvmeControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateNvmeController",
      requestType = opi_api.storage.v1.UpdateNvmeControllerRequest.class,
      responseType = opi_api.storage.v1.NvmeController.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateNvmeControllerRequest,
      opi_api.storage.v1.NvmeController> getUpdateNvmeControllerMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateNvmeControllerRequest, opi_api.storage.v1.NvmeController> getUpdateNvmeControllerMethod;
    if ((getUpdateNvmeControllerMethod = FrontendNvmeServiceGrpc.getUpdateNvmeControllerMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getUpdateNvmeControllerMethod = FrontendNvmeServiceGrpc.getUpdateNvmeControllerMethod) == null) {
          FrontendNvmeServiceGrpc.getUpdateNvmeControllerMethod = getUpdateNvmeControllerMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.UpdateNvmeControllerRequest, opi_api.storage.v1.NvmeController>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateNvmeController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.UpdateNvmeControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NvmeController.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("UpdateNvmeController"))
              .build();
        }
      }
    }
    return getUpdateNvmeControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.ListNvmeControllersRequest,
      opi_api.storage.v1.ListNvmeControllersResponse> getListNvmeControllersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNvmeControllers",
      requestType = opi_api.storage.v1.ListNvmeControllersRequest.class,
      responseType = opi_api.storage.v1.ListNvmeControllersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.ListNvmeControllersRequest,
      opi_api.storage.v1.ListNvmeControllersResponse> getListNvmeControllersMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.ListNvmeControllersRequest, opi_api.storage.v1.ListNvmeControllersResponse> getListNvmeControllersMethod;
    if ((getListNvmeControllersMethod = FrontendNvmeServiceGrpc.getListNvmeControllersMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getListNvmeControllersMethod = FrontendNvmeServiceGrpc.getListNvmeControllersMethod) == null) {
          FrontendNvmeServiceGrpc.getListNvmeControllersMethod = getListNvmeControllersMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.ListNvmeControllersRequest, opi_api.storage.v1.ListNvmeControllersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNvmeControllers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListNvmeControllersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListNvmeControllersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("ListNvmeControllers"))
              .build();
        }
      }
    }
    return getListNvmeControllersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.GetNvmeControllerRequest,
      opi_api.storage.v1.NvmeController> getGetNvmeControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNvmeController",
      requestType = opi_api.storage.v1.GetNvmeControllerRequest.class,
      responseType = opi_api.storage.v1.NvmeController.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.GetNvmeControllerRequest,
      opi_api.storage.v1.NvmeController> getGetNvmeControllerMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.GetNvmeControllerRequest, opi_api.storage.v1.NvmeController> getGetNvmeControllerMethod;
    if ((getGetNvmeControllerMethod = FrontendNvmeServiceGrpc.getGetNvmeControllerMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getGetNvmeControllerMethod = FrontendNvmeServiceGrpc.getGetNvmeControllerMethod) == null) {
          FrontendNvmeServiceGrpc.getGetNvmeControllerMethod = getGetNvmeControllerMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.GetNvmeControllerRequest, opi_api.storage.v1.NvmeController>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNvmeController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.GetNvmeControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NvmeController.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("GetNvmeController"))
              .build();
        }
      }
    }
    return getGetNvmeControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.StatsNvmeControllerRequest,
      opi_api.storage.v1.StatsNvmeControllerResponse> getStatsNvmeControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StatsNvmeController",
      requestType = opi_api.storage.v1.StatsNvmeControllerRequest.class,
      responseType = opi_api.storage.v1.StatsNvmeControllerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.StatsNvmeControllerRequest,
      opi_api.storage.v1.StatsNvmeControllerResponse> getStatsNvmeControllerMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.StatsNvmeControllerRequest, opi_api.storage.v1.StatsNvmeControllerResponse> getStatsNvmeControllerMethod;
    if ((getStatsNvmeControllerMethod = FrontendNvmeServiceGrpc.getStatsNvmeControllerMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getStatsNvmeControllerMethod = FrontendNvmeServiceGrpc.getStatsNvmeControllerMethod) == null) {
          FrontendNvmeServiceGrpc.getStatsNvmeControllerMethod = getStatsNvmeControllerMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.StatsNvmeControllerRequest, opi_api.storage.v1.StatsNvmeControllerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StatsNvmeController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.StatsNvmeControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.StatsNvmeControllerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("StatsNvmeController"))
              .build();
        }
      }
    }
    return getStatsNvmeControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.CreateNvmeNamespaceRequest,
      opi_api.storage.v1.NvmeNamespace> getCreateNvmeNamespaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateNvmeNamespace",
      requestType = opi_api.storage.v1.CreateNvmeNamespaceRequest.class,
      responseType = opi_api.storage.v1.NvmeNamespace.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.CreateNvmeNamespaceRequest,
      opi_api.storage.v1.NvmeNamespace> getCreateNvmeNamespaceMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.CreateNvmeNamespaceRequest, opi_api.storage.v1.NvmeNamespace> getCreateNvmeNamespaceMethod;
    if ((getCreateNvmeNamespaceMethod = FrontendNvmeServiceGrpc.getCreateNvmeNamespaceMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getCreateNvmeNamespaceMethod = FrontendNvmeServiceGrpc.getCreateNvmeNamespaceMethod) == null) {
          FrontendNvmeServiceGrpc.getCreateNvmeNamespaceMethod = getCreateNvmeNamespaceMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.CreateNvmeNamespaceRequest, opi_api.storage.v1.NvmeNamespace>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateNvmeNamespace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.CreateNvmeNamespaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NvmeNamespace.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("CreateNvmeNamespace"))
              .build();
        }
      }
    }
    return getCreateNvmeNamespaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteNvmeNamespaceRequest,
      com.google.protobuf.Empty> getDeleteNvmeNamespaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteNvmeNamespace",
      requestType = opi_api.storage.v1.DeleteNvmeNamespaceRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteNvmeNamespaceRequest,
      com.google.protobuf.Empty> getDeleteNvmeNamespaceMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteNvmeNamespaceRequest, com.google.protobuf.Empty> getDeleteNvmeNamespaceMethod;
    if ((getDeleteNvmeNamespaceMethod = FrontendNvmeServiceGrpc.getDeleteNvmeNamespaceMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getDeleteNvmeNamespaceMethod = FrontendNvmeServiceGrpc.getDeleteNvmeNamespaceMethod) == null) {
          FrontendNvmeServiceGrpc.getDeleteNvmeNamespaceMethod = getDeleteNvmeNamespaceMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.DeleteNvmeNamespaceRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteNvmeNamespace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.DeleteNvmeNamespaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("DeleteNvmeNamespace"))
              .build();
        }
      }
    }
    return getDeleteNvmeNamespaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateNvmeNamespaceRequest,
      opi_api.storage.v1.NvmeNamespace> getUpdateNvmeNamespaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateNvmeNamespace",
      requestType = opi_api.storage.v1.UpdateNvmeNamespaceRequest.class,
      responseType = opi_api.storage.v1.NvmeNamespace.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateNvmeNamespaceRequest,
      opi_api.storage.v1.NvmeNamespace> getUpdateNvmeNamespaceMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateNvmeNamespaceRequest, opi_api.storage.v1.NvmeNamespace> getUpdateNvmeNamespaceMethod;
    if ((getUpdateNvmeNamespaceMethod = FrontendNvmeServiceGrpc.getUpdateNvmeNamespaceMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getUpdateNvmeNamespaceMethod = FrontendNvmeServiceGrpc.getUpdateNvmeNamespaceMethod) == null) {
          FrontendNvmeServiceGrpc.getUpdateNvmeNamespaceMethod = getUpdateNvmeNamespaceMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.UpdateNvmeNamespaceRequest, opi_api.storage.v1.NvmeNamespace>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateNvmeNamespace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.UpdateNvmeNamespaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NvmeNamespace.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("UpdateNvmeNamespace"))
              .build();
        }
      }
    }
    return getUpdateNvmeNamespaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.ListNvmeNamespacesRequest,
      opi_api.storage.v1.ListNvmeNamespacesResponse> getListNvmeNamespacesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNvmeNamespaces",
      requestType = opi_api.storage.v1.ListNvmeNamespacesRequest.class,
      responseType = opi_api.storage.v1.ListNvmeNamespacesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.ListNvmeNamespacesRequest,
      opi_api.storage.v1.ListNvmeNamespacesResponse> getListNvmeNamespacesMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.ListNvmeNamespacesRequest, opi_api.storage.v1.ListNvmeNamespacesResponse> getListNvmeNamespacesMethod;
    if ((getListNvmeNamespacesMethod = FrontendNvmeServiceGrpc.getListNvmeNamespacesMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getListNvmeNamespacesMethod = FrontendNvmeServiceGrpc.getListNvmeNamespacesMethod) == null) {
          FrontendNvmeServiceGrpc.getListNvmeNamespacesMethod = getListNvmeNamespacesMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.ListNvmeNamespacesRequest, opi_api.storage.v1.ListNvmeNamespacesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNvmeNamespaces"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListNvmeNamespacesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListNvmeNamespacesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("ListNvmeNamespaces"))
              .build();
        }
      }
    }
    return getListNvmeNamespacesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.GetNvmeNamespaceRequest,
      opi_api.storage.v1.NvmeNamespace> getGetNvmeNamespaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNvmeNamespace",
      requestType = opi_api.storage.v1.GetNvmeNamespaceRequest.class,
      responseType = opi_api.storage.v1.NvmeNamespace.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.GetNvmeNamespaceRequest,
      opi_api.storage.v1.NvmeNamespace> getGetNvmeNamespaceMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.GetNvmeNamespaceRequest, opi_api.storage.v1.NvmeNamespace> getGetNvmeNamespaceMethod;
    if ((getGetNvmeNamespaceMethod = FrontendNvmeServiceGrpc.getGetNvmeNamespaceMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getGetNvmeNamespaceMethod = FrontendNvmeServiceGrpc.getGetNvmeNamespaceMethod) == null) {
          FrontendNvmeServiceGrpc.getGetNvmeNamespaceMethod = getGetNvmeNamespaceMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.GetNvmeNamespaceRequest, opi_api.storage.v1.NvmeNamespace>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNvmeNamespace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.GetNvmeNamespaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NvmeNamespace.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("GetNvmeNamespace"))
              .build();
        }
      }
    }
    return getGetNvmeNamespaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.StatsNvmeNamespaceRequest,
      opi_api.storage.v1.StatsNvmeNamespaceResponse> getStatsNvmeNamespaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StatsNvmeNamespace",
      requestType = opi_api.storage.v1.StatsNvmeNamespaceRequest.class,
      responseType = opi_api.storage.v1.StatsNvmeNamespaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.StatsNvmeNamespaceRequest,
      opi_api.storage.v1.StatsNvmeNamespaceResponse> getStatsNvmeNamespaceMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.StatsNvmeNamespaceRequest, opi_api.storage.v1.StatsNvmeNamespaceResponse> getStatsNvmeNamespaceMethod;
    if ((getStatsNvmeNamespaceMethod = FrontendNvmeServiceGrpc.getStatsNvmeNamespaceMethod) == null) {
      synchronized (FrontendNvmeServiceGrpc.class) {
        if ((getStatsNvmeNamespaceMethod = FrontendNvmeServiceGrpc.getStatsNvmeNamespaceMethod) == null) {
          FrontendNvmeServiceGrpc.getStatsNvmeNamespaceMethod = getStatsNvmeNamespaceMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.StatsNvmeNamespaceRequest, opi_api.storage.v1.StatsNvmeNamespaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StatsNvmeNamespace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.StatsNvmeNamespaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.StatsNvmeNamespaceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendNvmeServiceMethodDescriptorSupplier("StatsNvmeNamespace"))
              .build();
        }
      }
    }
    return getStatsNvmeNamespaceMethod;
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
   * Front End (host-facing) APIs. Mostly used for Nvme/PCIe emulation and host presentation.
   * </pre>
   */
  public static abstract class FrontendNvmeServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create an Nvme Subsystem
     * </pre>
     */
    public void createNvmeSubsystem(opi_api.storage.v1.CreateNvmeSubsystemRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmeSubsystem> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateNvmeSubsystemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an Nvme Subsystem
     * Fails if there are any associated objects
     * </pre>
     */
    public void deleteNvmeSubsystem(opi_api.storage.v1.DeleteNvmeSubsystemRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteNvmeSubsystemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an Nvme Subsystem
     * </pre>
     */
    public void updateNvmeSubsystem(opi_api.storage.v1.UpdateNvmeSubsystemRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmeSubsystem> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateNvmeSubsystemMethod(), responseObserver);
    }

    /**
     */
    public void listNvmeSubsystems(opi_api.storage.v1.ListNvmeSubsystemsRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListNvmeSubsystemsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListNvmeSubsystemsMethod(), responseObserver);
    }

    /**
     */
    public void getNvmeSubsystem(opi_api.storage.v1.GetNvmeSubsystemRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmeSubsystem> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNvmeSubsystemMethod(), responseObserver);
    }

    /**
     */
    public void statsNvmeSubsystem(opi_api.storage.v1.StatsNvmeSubsystemRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.StatsNvmeSubsystemResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStatsNvmeSubsystemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create an Nvme Controller
     * </pre>
     */
    public void createNvmeController(opi_api.storage.v1.CreateNvmeControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmeController> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateNvmeControllerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an Nvme Controller
     * Fails if there are any associated objects
     * </pre>
     */
    public void deleteNvmeController(opi_api.storage.v1.DeleteNvmeControllerRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteNvmeControllerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an Nvme Controller
     * </pre>
     */
    public void updateNvmeController(opi_api.storage.v1.UpdateNvmeControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmeController> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateNvmeControllerMethod(), responseObserver);
    }

    /**
     */
    public void listNvmeControllers(opi_api.storage.v1.ListNvmeControllersRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListNvmeControllersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListNvmeControllersMethod(), responseObserver);
    }

    /**
     */
    public void getNvmeController(opi_api.storage.v1.GetNvmeControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmeController> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNvmeControllerMethod(), responseObserver);
    }

    /**
     */
    public void statsNvmeController(opi_api.storage.v1.StatsNvmeControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.StatsNvmeControllerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStatsNvmeControllerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create an Nvme Namespace
     * </pre>
     */
    public void createNvmeNamespace(opi_api.storage.v1.CreateNvmeNamespaceRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmeNamespace> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateNvmeNamespaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an Nvme Namespace
     * </pre>
     */
    public void deleteNvmeNamespace(opi_api.storage.v1.DeleteNvmeNamespaceRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteNvmeNamespaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an Nvme Namespace
     * </pre>
     */
    public void updateNvmeNamespace(opi_api.storage.v1.UpdateNvmeNamespaceRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmeNamespace> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateNvmeNamespaceMethod(), responseObserver);
    }

    /**
     */
    public void listNvmeNamespaces(opi_api.storage.v1.ListNvmeNamespacesRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListNvmeNamespacesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListNvmeNamespacesMethod(), responseObserver);
    }

    /**
     */
    public void getNvmeNamespace(opi_api.storage.v1.GetNvmeNamespaceRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmeNamespace> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNvmeNamespaceMethod(), responseObserver);
    }

    /**
     */
    public void statsNvmeNamespace(opi_api.storage.v1.StatsNvmeNamespaceRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.StatsNvmeNamespaceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStatsNvmeNamespaceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateNvmeSubsystemMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.CreateNvmeSubsystemRequest,
                opi_api.storage.v1.NvmeSubsystem>(
                  this, METHODID_CREATE_NVME_SUBSYSTEM)))
          .addMethod(
            getDeleteNvmeSubsystemMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.DeleteNvmeSubsystemRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_NVME_SUBSYSTEM)))
          .addMethod(
            getUpdateNvmeSubsystemMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.UpdateNvmeSubsystemRequest,
                opi_api.storage.v1.NvmeSubsystem>(
                  this, METHODID_UPDATE_NVME_SUBSYSTEM)))
          .addMethod(
            getListNvmeSubsystemsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.ListNvmeSubsystemsRequest,
                opi_api.storage.v1.ListNvmeSubsystemsResponse>(
                  this, METHODID_LIST_NVME_SUBSYSTEMS)))
          .addMethod(
            getGetNvmeSubsystemMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.GetNvmeSubsystemRequest,
                opi_api.storage.v1.NvmeSubsystem>(
                  this, METHODID_GET_NVME_SUBSYSTEM)))
          .addMethod(
            getStatsNvmeSubsystemMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.StatsNvmeSubsystemRequest,
                opi_api.storage.v1.StatsNvmeSubsystemResponse>(
                  this, METHODID_STATS_NVME_SUBSYSTEM)))
          .addMethod(
            getCreateNvmeControllerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.CreateNvmeControllerRequest,
                opi_api.storage.v1.NvmeController>(
                  this, METHODID_CREATE_NVME_CONTROLLER)))
          .addMethod(
            getDeleteNvmeControllerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.DeleteNvmeControllerRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_NVME_CONTROLLER)))
          .addMethod(
            getUpdateNvmeControllerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.UpdateNvmeControllerRequest,
                opi_api.storage.v1.NvmeController>(
                  this, METHODID_UPDATE_NVME_CONTROLLER)))
          .addMethod(
            getListNvmeControllersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.ListNvmeControllersRequest,
                opi_api.storage.v1.ListNvmeControllersResponse>(
                  this, METHODID_LIST_NVME_CONTROLLERS)))
          .addMethod(
            getGetNvmeControllerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.GetNvmeControllerRequest,
                opi_api.storage.v1.NvmeController>(
                  this, METHODID_GET_NVME_CONTROLLER)))
          .addMethod(
            getStatsNvmeControllerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.StatsNvmeControllerRequest,
                opi_api.storage.v1.StatsNvmeControllerResponse>(
                  this, METHODID_STATS_NVME_CONTROLLER)))
          .addMethod(
            getCreateNvmeNamespaceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.CreateNvmeNamespaceRequest,
                opi_api.storage.v1.NvmeNamespace>(
                  this, METHODID_CREATE_NVME_NAMESPACE)))
          .addMethod(
            getDeleteNvmeNamespaceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.DeleteNvmeNamespaceRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_NVME_NAMESPACE)))
          .addMethod(
            getUpdateNvmeNamespaceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.UpdateNvmeNamespaceRequest,
                opi_api.storage.v1.NvmeNamespace>(
                  this, METHODID_UPDATE_NVME_NAMESPACE)))
          .addMethod(
            getListNvmeNamespacesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.ListNvmeNamespacesRequest,
                opi_api.storage.v1.ListNvmeNamespacesResponse>(
                  this, METHODID_LIST_NVME_NAMESPACES)))
          .addMethod(
            getGetNvmeNamespaceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.GetNvmeNamespaceRequest,
                opi_api.storage.v1.NvmeNamespace>(
                  this, METHODID_GET_NVME_NAMESPACE)))
          .addMethod(
            getStatsNvmeNamespaceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.StatsNvmeNamespaceRequest,
                opi_api.storage.v1.StatsNvmeNamespaceResponse>(
                  this, METHODID_STATS_NVME_NAMESPACE)))
          .build();
    }
  }

  /**
   * <pre>
   * Front End (host-facing) APIs. Mostly used for Nvme/PCIe emulation and host presentation.
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
     * <pre>
     * Create an Nvme Subsystem
     * </pre>
     */
    public void createNvmeSubsystem(opi_api.storage.v1.CreateNvmeSubsystemRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmeSubsystem> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateNvmeSubsystemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an Nvme Subsystem
     * Fails if there are any associated objects
     * </pre>
     */
    public void deleteNvmeSubsystem(opi_api.storage.v1.DeleteNvmeSubsystemRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteNvmeSubsystemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an Nvme Subsystem
     * </pre>
     */
    public void updateNvmeSubsystem(opi_api.storage.v1.UpdateNvmeSubsystemRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmeSubsystem> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateNvmeSubsystemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listNvmeSubsystems(opi_api.storage.v1.ListNvmeSubsystemsRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListNvmeSubsystemsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListNvmeSubsystemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNvmeSubsystem(opi_api.storage.v1.GetNvmeSubsystemRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmeSubsystem> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNvmeSubsystemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void statsNvmeSubsystem(opi_api.storage.v1.StatsNvmeSubsystemRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.StatsNvmeSubsystemResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStatsNvmeSubsystemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create an Nvme Controller
     * </pre>
     */
    public void createNvmeController(opi_api.storage.v1.CreateNvmeControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmeController> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateNvmeControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an Nvme Controller
     * Fails if there are any associated objects
     * </pre>
     */
    public void deleteNvmeController(opi_api.storage.v1.DeleteNvmeControllerRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteNvmeControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an Nvme Controller
     * </pre>
     */
    public void updateNvmeController(opi_api.storage.v1.UpdateNvmeControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmeController> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateNvmeControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listNvmeControllers(opi_api.storage.v1.ListNvmeControllersRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListNvmeControllersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListNvmeControllersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNvmeController(opi_api.storage.v1.GetNvmeControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmeController> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNvmeControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void statsNvmeController(opi_api.storage.v1.StatsNvmeControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.StatsNvmeControllerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStatsNvmeControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create an Nvme Namespace
     * </pre>
     */
    public void createNvmeNamespace(opi_api.storage.v1.CreateNvmeNamespaceRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmeNamespace> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateNvmeNamespaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an Nvme Namespace
     * </pre>
     */
    public void deleteNvmeNamespace(opi_api.storage.v1.DeleteNvmeNamespaceRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteNvmeNamespaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an Nvme Namespace
     * </pre>
     */
    public void updateNvmeNamespace(opi_api.storage.v1.UpdateNvmeNamespaceRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmeNamespace> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateNvmeNamespaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listNvmeNamespaces(opi_api.storage.v1.ListNvmeNamespacesRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListNvmeNamespacesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListNvmeNamespacesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNvmeNamespace(opi_api.storage.v1.GetNvmeNamespaceRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmeNamespace> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNvmeNamespaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void statsNvmeNamespace(opi_api.storage.v1.StatsNvmeNamespaceRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.StatsNvmeNamespaceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStatsNvmeNamespaceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Front End (host-facing) APIs. Mostly used for Nvme/PCIe emulation and host presentation.
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
     * <pre>
     * Create an Nvme Subsystem
     * </pre>
     */
    public opi_api.storage.v1.NvmeSubsystem createNvmeSubsystem(opi_api.storage.v1.CreateNvmeSubsystemRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateNvmeSubsystemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an Nvme Subsystem
     * Fails if there are any associated objects
     * </pre>
     */
    public com.google.protobuf.Empty deleteNvmeSubsystem(opi_api.storage.v1.DeleteNvmeSubsystemRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteNvmeSubsystemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an Nvme Subsystem
     * </pre>
     */
    public opi_api.storage.v1.NvmeSubsystem updateNvmeSubsystem(opi_api.storage.v1.UpdateNvmeSubsystemRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateNvmeSubsystemMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.ListNvmeSubsystemsResponse listNvmeSubsystems(opi_api.storage.v1.ListNvmeSubsystemsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListNvmeSubsystemsMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.NvmeSubsystem getNvmeSubsystem(opi_api.storage.v1.GetNvmeSubsystemRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNvmeSubsystemMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.StatsNvmeSubsystemResponse statsNvmeSubsystem(opi_api.storage.v1.StatsNvmeSubsystemRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStatsNvmeSubsystemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create an Nvme Controller
     * </pre>
     */
    public opi_api.storage.v1.NvmeController createNvmeController(opi_api.storage.v1.CreateNvmeControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateNvmeControllerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an Nvme Controller
     * Fails if there are any associated objects
     * </pre>
     */
    public com.google.protobuf.Empty deleteNvmeController(opi_api.storage.v1.DeleteNvmeControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteNvmeControllerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an Nvme Controller
     * </pre>
     */
    public opi_api.storage.v1.NvmeController updateNvmeController(opi_api.storage.v1.UpdateNvmeControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateNvmeControllerMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.ListNvmeControllersResponse listNvmeControllers(opi_api.storage.v1.ListNvmeControllersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListNvmeControllersMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.NvmeController getNvmeController(opi_api.storage.v1.GetNvmeControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNvmeControllerMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.StatsNvmeControllerResponse statsNvmeController(opi_api.storage.v1.StatsNvmeControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStatsNvmeControllerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create an Nvme Namespace
     * </pre>
     */
    public opi_api.storage.v1.NvmeNamespace createNvmeNamespace(opi_api.storage.v1.CreateNvmeNamespaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateNvmeNamespaceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an Nvme Namespace
     * </pre>
     */
    public com.google.protobuf.Empty deleteNvmeNamespace(opi_api.storage.v1.DeleteNvmeNamespaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteNvmeNamespaceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an Nvme Namespace
     * </pre>
     */
    public opi_api.storage.v1.NvmeNamespace updateNvmeNamespace(opi_api.storage.v1.UpdateNvmeNamespaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateNvmeNamespaceMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.ListNvmeNamespacesResponse listNvmeNamespaces(opi_api.storage.v1.ListNvmeNamespacesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListNvmeNamespacesMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.NvmeNamespace getNvmeNamespace(opi_api.storage.v1.GetNvmeNamespaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNvmeNamespaceMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.StatsNvmeNamespaceResponse statsNvmeNamespace(opi_api.storage.v1.StatsNvmeNamespaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStatsNvmeNamespaceMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Front End (host-facing) APIs. Mostly used for Nvme/PCIe emulation and host presentation.
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
     * <pre>
     * Create an Nvme Subsystem
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NvmeSubsystem> createNvmeSubsystem(
        opi_api.storage.v1.CreateNvmeSubsystemRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateNvmeSubsystemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an Nvme Subsystem
     * Fails if there are any associated objects
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteNvmeSubsystem(
        opi_api.storage.v1.DeleteNvmeSubsystemRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteNvmeSubsystemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an Nvme Subsystem
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NvmeSubsystem> updateNvmeSubsystem(
        opi_api.storage.v1.UpdateNvmeSubsystemRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateNvmeSubsystemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.ListNvmeSubsystemsResponse> listNvmeSubsystems(
        opi_api.storage.v1.ListNvmeSubsystemsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListNvmeSubsystemsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NvmeSubsystem> getNvmeSubsystem(
        opi_api.storage.v1.GetNvmeSubsystemRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNvmeSubsystemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.StatsNvmeSubsystemResponse> statsNvmeSubsystem(
        opi_api.storage.v1.StatsNvmeSubsystemRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStatsNvmeSubsystemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create an Nvme Controller
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NvmeController> createNvmeController(
        opi_api.storage.v1.CreateNvmeControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateNvmeControllerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an Nvme Controller
     * Fails if there are any associated objects
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteNvmeController(
        opi_api.storage.v1.DeleteNvmeControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteNvmeControllerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an Nvme Controller
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NvmeController> updateNvmeController(
        opi_api.storage.v1.UpdateNvmeControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateNvmeControllerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.ListNvmeControllersResponse> listNvmeControllers(
        opi_api.storage.v1.ListNvmeControllersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListNvmeControllersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NvmeController> getNvmeController(
        opi_api.storage.v1.GetNvmeControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNvmeControllerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.StatsNvmeControllerResponse> statsNvmeController(
        opi_api.storage.v1.StatsNvmeControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStatsNvmeControllerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create an Nvme Namespace
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NvmeNamespace> createNvmeNamespace(
        opi_api.storage.v1.CreateNvmeNamespaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateNvmeNamespaceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an Nvme Namespace
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteNvmeNamespace(
        opi_api.storage.v1.DeleteNvmeNamespaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteNvmeNamespaceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an Nvme Namespace
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NvmeNamespace> updateNvmeNamespace(
        opi_api.storage.v1.UpdateNvmeNamespaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateNvmeNamespaceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.ListNvmeNamespacesResponse> listNvmeNamespaces(
        opi_api.storage.v1.ListNvmeNamespacesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListNvmeNamespacesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NvmeNamespace> getNvmeNamespace(
        opi_api.storage.v1.GetNvmeNamespaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNvmeNamespaceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.StatsNvmeNamespaceResponse> statsNvmeNamespace(
        opi_api.storage.v1.StatsNvmeNamespaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStatsNvmeNamespaceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_NVME_SUBSYSTEM = 0;
  private static final int METHODID_DELETE_NVME_SUBSYSTEM = 1;
  private static final int METHODID_UPDATE_NVME_SUBSYSTEM = 2;
  private static final int METHODID_LIST_NVME_SUBSYSTEMS = 3;
  private static final int METHODID_GET_NVME_SUBSYSTEM = 4;
  private static final int METHODID_STATS_NVME_SUBSYSTEM = 5;
  private static final int METHODID_CREATE_NVME_CONTROLLER = 6;
  private static final int METHODID_DELETE_NVME_CONTROLLER = 7;
  private static final int METHODID_UPDATE_NVME_CONTROLLER = 8;
  private static final int METHODID_LIST_NVME_CONTROLLERS = 9;
  private static final int METHODID_GET_NVME_CONTROLLER = 10;
  private static final int METHODID_STATS_NVME_CONTROLLER = 11;
  private static final int METHODID_CREATE_NVME_NAMESPACE = 12;
  private static final int METHODID_DELETE_NVME_NAMESPACE = 13;
  private static final int METHODID_UPDATE_NVME_NAMESPACE = 14;
  private static final int METHODID_LIST_NVME_NAMESPACES = 15;
  private static final int METHODID_GET_NVME_NAMESPACE = 16;
  private static final int METHODID_STATS_NVME_NAMESPACE = 17;

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
          serviceImpl.createNvmeSubsystem((opi_api.storage.v1.CreateNvmeSubsystemRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmeSubsystem>) responseObserver);
          break;
        case METHODID_DELETE_NVME_SUBSYSTEM:
          serviceImpl.deleteNvmeSubsystem((opi_api.storage.v1.DeleteNvmeSubsystemRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_NVME_SUBSYSTEM:
          serviceImpl.updateNvmeSubsystem((opi_api.storage.v1.UpdateNvmeSubsystemRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmeSubsystem>) responseObserver);
          break;
        case METHODID_LIST_NVME_SUBSYSTEMS:
          serviceImpl.listNvmeSubsystems((opi_api.storage.v1.ListNvmeSubsystemsRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.ListNvmeSubsystemsResponse>) responseObserver);
          break;
        case METHODID_GET_NVME_SUBSYSTEM:
          serviceImpl.getNvmeSubsystem((opi_api.storage.v1.GetNvmeSubsystemRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmeSubsystem>) responseObserver);
          break;
        case METHODID_STATS_NVME_SUBSYSTEM:
          serviceImpl.statsNvmeSubsystem((opi_api.storage.v1.StatsNvmeSubsystemRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.StatsNvmeSubsystemResponse>) responseObserver);
          break;
        case METHODID_CREATE_NVME_CONTROLLER:
          serviceImpl.createNvmeController((opi_api.storage.v1.CreateNvmeControllerRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmeController>) responseObserver);
          break;
        case METHODID_DELETE_NVME_CONTROLLER:
          serviceImpl.deleteNvmeController((opi_api.storage.v1.DeleteNvmeControllerRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_NVME_CONTROLLER:
          serviceImpl.updateNvmeController((opi_api.storage.v1.UpdateNvmeControllerRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmeController>) responseObserver);
          break;
        case METHODID_LIST_NVME_CONTROLLERS:
          serviceImpl.listNvmeControllers((opi_api.storage.v1.ListNvmeControllersRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.ListNvmeControllersResponse>) responseObserver);
          break;
        case METHODID_GET_NVME_CONTROLLER:
          serviceImpl.getNvmeController((opi_api.storage.v1.GetNvmeControllerRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmeController>) responseObserver);
          break;
        case METHODID_STATS_NVME_CONTROLLER:
          serviceImpl.statsNvmeController((opi_api.storage.v1.StatsNvmeControllerRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.StatsNvmeControllerResponse>) responseObserver);
          break;
        case METHODID_CREATE_NVME_NAMESPACE:
          serviceImpl.createNvmeNamespace((opi_api.storage.v1.CreateNvmeNamespaceRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmeNamespace>) responseObserver);
          break;
        case METHODID_DELETE_NVME_NAMESPACE:
          serviceImpl.deleteNvmeNamespace((opi_api.storage.v1.DeleteNvmeNamespaceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_NVME_NAMESPACE:
          serviceImpl.updateNvmeNamespace((opi_api.storage.v1.UpdateNvmeNamespaceRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmeNamespace>) responseObserver);
          break;
        case METHODID_LIST_NVME_NAMESPACES:
          serviceImpl.listNvmeNamespaces((opi_api.storage.v1.ListNvmeNamespacesRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.ListNvmeNamespacesResponse>) responseObserver);
          break;
        case METHODID_GET_NVME_NAMESPACE:
          serviceImpl.getNvmeNamespace((opi_api.storage.v1.GetNvmeNamespaceRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmeNamespace>) responseObserver);
          break;
        case METHODID_STATS_NVME_NAMESPACE:
          serviceImpl.statsNvmeNamespace((opi_api.storage.v1.StatsNvmeNamespaceRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.StatsNvmeNamespaceResponse>) responseObserver);
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
              .addMethod(getCreateNvmeSubsystemMethod())
              .addMethod(getDeleteNvmeSubsystemMethod())
              .addMethod(getUpdateNvmeSubsystemMethod())
              .addMethod(getListNvmeSubsystemsMethod())
              .addMethod(getGetNvmeSubsystemMethod())
              .addMethod(getStatsNvmeSubsystemMethod())
              .addMethod(getCreateNvmeControllerMethod())
              .addMethod(getDeleteNvmeControllerMethod())
              .addMethod(getUpdateNvmeControllerMethod())
              .addMethod(getListNvmeControllersMethod())
              .addMethod(getGetNvmeControllerMethod())
              .addMethod(getStatsNvmeControllerMethod())
              .addMethod(getCreateNvmeNamespaceMethod())
              .addMethod(getDeleteNvmeNamespaceMethod())
              .addMethod(getUpdateNvmeNamespaceMethod())
              .addMethod(getListNvmeNamespacesMethod())
              .addMethod(getGetNvmeNamespaceMethod())
              .addMethod(getStatsNvmeNamespaceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
