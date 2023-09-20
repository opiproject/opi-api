package opi_api.storage.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Back End (network-facing) APIs. NVMe/TCP and NVMe/RoCEv2 protocols are covered by this service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: backend_nvme_tcp.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class NvmeRemoteControllerServiceGrpc {

  private NvmeRemoteControllerServiceGrpc() {}

  public static final String SERVICE_NAME = "opi_api.storage.v1.NvmeRemoteControllerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.CreateNvmeRemoteControllerRequest,
      opi_api.storage.v1.NvmeRemoteController> getCreateNvmeRemoteControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateNvmeRemoteController",
      requestType = opi_api.storage.v1.CreateNvmeRemoteControllerRequest.class,
      responseType = opi_api.storage.v1.NvmeRemoteController.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.CreateNvmeRemoteControllerRequest,
      opi_api.storage.v1.NvmeRemoteController> getCreateNvmeRemoteControllerMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.CreateNvmeRemoteControllerRequest, opi_api.storage.v1.NvmeRemoteController> getCreateNvmeRemoteControllerMethod;
    if ((getCreateNvmeRemoteControllerMethod = NvmeRemoteControllerServiceGrpc.getCreateNvmeRemoteControllerMethod) == null) {
      synchronized (NvmeRemoteControllerServiceGrpc.class) {
        if ((getCreateNvmeRemoteControllerMethod = NvmeRemoteControllerServiceGrpc.getCreateNvmeRemoteControllerMethod) == null) {
          NvmeRemoteControllerServiceGrpc.getCreateNvmeRemoteControllerMethod = getCreateNvmeRemoteControllerMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.CreateNvmeRemoteControllerRequest, opi_api.storage.v1.NvmeRemoteController>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateNvmeRemoteController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.CreateNvmeRemoteControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NvmeRemoteController.getDefaultInstance()))
              .setSchemaDescriptor(new NvmeRemoteControllerServiceMethodDescriptorSupplier("CreateNvmeRemoteController"))
              .build();
        }
      }
    }
    return getCreateNvmeRemoteControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteNvmeRemoteControllerRequest,
      com.google.protobuf.Empty> getDeleteNvmeRemoteControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteNvmeRemoteController",
      requestType = opi_api.storage.v1.DeleteNvmeRemoteControllerRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteNvmeRemoteControllerRequest,
      com.google.protobuf.Empty> getDeleteNvmeRemoteControllerMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteNvmeRemoteControllerRequest, com.google.protobuf.Empty> getDeleteNvmeRemoteControllerMethod;
    if ((getDeleteNvmeRemoteControllerMethod = NvmeRemoteControllerServiceGrpc.getDeleteNvmeRemoteControllerMethod) == null) {
      synchronized (NvmeRemoteControllerServiceGrpc.class) {
        if ((getDeleteNvmeRemoteControllerMethod = NvmeRemoteControllerServiceGrpc.getDeleteNvmeRemoteControllerMethod) == null) {
          NvmeRemoteControllerServiceGrpc.getDeleteNvmeRemoteControllerMethod = getDeleteNvmeRemoteControllerMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.DeleteNvmeRemoteControllerRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteNvmeRemoteController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.DeleteNvmeRemoteControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NvmeRemoteControllerServiceMethodDescriptorSupplier("DeleteNvmeRemoteController"))
              .build();
        }
      }
    }
    return getDeleteNvmeRemoteControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateNvmeRemoteControllerRequest,
      opi_api.storage.v1.NvmeRemoteController> getUpdateNvmeRemoteControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateNvmeRemoteController",
      requestType = opi_api.storage.v1.UpdateNvmeRemoteControllerRequest.class,
      responseType = opi_api.storage.v1.NvmeRemoteController.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateNvmeRemoteControllerRequest,
      opi_api.storage.v1.NvmeRemoteController> getUpdateNvmeRemoteControllerMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateNvmeRemoteControllerRequest, opi_api.storage.v1.NvmeRemoteController> getUpdateNvmeRemoteControllerMethod;
    if ((getUpdateNvmeRemoteControllerMethod = NvmeRemoteControllerServiceGrpc.getUpdateNvmeRemoteControllerMethod) == null) {
      synchronized (NvmeRemoteControllerServiceGrpc.class) {
        if ((getUpdateNvmeRemoteControllerMethod = NvmeRemoteControllerServiceGrpc.getUpdateNvmeRemoteControllerMethod) == null) {
          NvmeRemoteControllerServiceGrpc.getUpdateNvmeRemoteControllerMethod = getUpdateNvmeRemoteControllerMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.UpdateNvmeRemoteControllerRequest, opi_api.storage.v1.NvmeRemoteController>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateNvmeRemoteController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.UpdateNvmeRemoteControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NvmeRemoteController.getDefaultInstance()))
              .setSchemaDescriptor(new NvmeRemoteControllerServiceMethodDescriptorSupplier("UpdateNvmeRemoteController"))
              .build();
        }
      }
    }
    return getUpdateNvmeRemoteControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.ListNvmeRemoteControllersRequest,
      opi_api.storage.v1.ListNvmeRemoteControllersResponse> getListNvmeRemoteControllersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNvmeRemoteControllers",
      requestType = opi_api.storage.v1.ListNvmeRemoteControllersRequest.class,
      responseType = opi_api.storage.v1.ListNvmeRemoteControllersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.ListNvmeRemoteControllersRequest,
      opi_api.storage.v1.ListNvmeRemoteControllersResponse> getListNvmeRemoteControllersMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.ListNvmeRemoteControllersRequest, opi_api.storage.v1.ListNvmeRemoteControllersResponse> getListNvmeRemoteControllersMethod;
    if ((getListNvmeRemoteControllersMethod = NvmeRemoteControllerServiceGrpc.getListNvmeRemoteControllersMethod) == null) {
      synchronized (NvmeRemoteControllerServiceGrpc.class) {
        if ((getListNvmeRemoteControllersMethod = NvmeRemoteControllerServiceGrpc.getListNvmeRemoteControllersMethod) == null) {
          NvmeRemoteControllerServiceGrpc.getListNvmeRemoteControllersMethod = getListNvmeRemoteControllersMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.ListNvmeRemoteControllersRequest, opi_api.storage.v1.ListNvmeRemoteControllersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNvmeRemoteControllers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListNvmeRemoteControllersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListNvmeRemoteControllersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NvmeRemoteControllerServiceMethodDescriptorSupplier("ListNvmeRemoteControllers"))
              .build();
        }
      }
    }
    return getListNvmeRemoteControllersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.GetNvmeRemoteControllerRequest,
      opi_api.storage.v1.NvmeRemoteController> getGetNvmeRemoteControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNvmeRemoteController",
      requestType = opi_api.storage.v1.GetNvmeRemoteControllerRequest.class,
      responseType = opi_api.storage.v1.NvmeRemoteController.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.GetNvmeRemoteControllerRequest,
      opi_api.storage.v1.NvmeRemoteController> getGetNvmeRemoteControllerMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.GetNvmeRemoteControllerRequest, opi_api.storage.v1.NvmeRemoteController> getGetNvmeRemoteControllerMethod;
    if ((getGetNvmeRemoteControllerMethod = NvmeRemoteControllerServiceGrpc.getGetNvmeRemoteControllerMethod) == null) {
      synchronized (NvmeRemoteControllerServiceGrpc.class) {
        if ((getGetNvmeRemoteControllerMethod = NvmeRemoteControllerServiceGrpc.getGetNvmeRemoteControllerMethod) == null) {
          NvmeRemoteControllerServiceGrpc.getGetNvmeRemoteControllerMethod = getGetNvmeRemoteControllerMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.GetNvmeRemoteControllerRequest, opi_api.storage.v1.NvmeRemoteController>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNvmeRemoteController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.GetNvmeRemoteControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NvmeRemoteController.getDefaultInstance()))
              .setSchemaDescriptor(new NvmeRemoteControllerServiceMethodDescriptorSupplier("GetNvmeRemoteController"))
              .build();
        }
      }
    }
    return getGetNvmeRemoteControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.ResetNvmeRemoteControllerRequest,
      com.google.protobuf.Empty> getResetNvmeRemoteControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResetNvmeRemoteController",
      requestType = opi_api.storage.v1.ResetNvmeRemoteControllerRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.ResetNvmeRemoteControllerRequest,
      com.google.protobuf.Empty> getResetNvmeRemoteControllerMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.ResetNvmeRemoteControllerRequest, com.google.protobuf.Empty> getResetNvmeRemoteControllerMethod;
    if ((getResetNvmeRemoteControllerMethod = NvmeRemoteControllerServiceGrpc.getResetNvmeRemoteControllerMethod) == null) {
      synchronized (NvmeRemoteControllerServiceGrpc.class) {
        if ((getResetNvmeRemoteControllerMethod = NvmeRemoteControllerServiceGrpc.getResetNvmeRemoteControllerMethod) == null) {
          NvmeRemoteControllerServiceGrpc.getResetNvmeRemoteControllerMethod = getResetNvmeRemoteControllerMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.ResetNvmeRemoteControllerRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResetNvmeRemoteController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ResetNvmeRemoteControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NvmeRemoteControllerServiceMethodDescriptorSupplier("ResetNvmeRemoteController"))
              .build();
        }
      }
    }
    return getResetNvmeRemoteControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.StatsNvmeRemoteControllerRequest,
      opi_api.storage.v1.StatsNvmeRemoteControllerResponse> getStatsNvmeRemoteControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StatsNvmeRemoteController",
      requestType = opi_api.storage.v1.StatsNvmeRemoteControllerRequest.class,
      responseType = opi_api.storage.v1.StatsNvmeRemoteControllerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.StatsNvmeRemoteControllerRequest,
      opi_api.storage.v1.StatsNvmeRemoteControllerResponse> getStatsNvmeRemoteControllerMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.StatsNvmeRemoteControllerRequest, opi_api.storage.v1.StatsNvmeRemoteControllerResponse> getStatsNvmeRemoteControllerMethod;
    if ((getStatsNvmeRemoteControllerMethod = NvmeRemoteControllerServiceGrpc.getStatsNvmeRemoteControllerMethod) == null) {
      synchronized (NvmeRemoteControllerServiceGrpc.class) {
        if ((getStatsNvmeRemoteControllerMethod = NvmeRemoteControllerServiceGrpc.getStatsNvmeRemoteControllerMethod) == null) {
          NvmeRemoteControllerServiceGrpc.getStatsNvmeRemoteControllerMethod = getStatsNvmeRemoteControllerMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.StatsNvmeRemoteControllerRequest, opi_api.storage.v1.StatsNvmeRemoteControllerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StatsNvmeRemoteController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.StatsNvmeRemoteControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.StatsNvmeRemoteControllerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NvmeRemoteControllerServiceMethodDescriptorSupplier("StatsNvmeRemoteController"))
              .build();
        }
      }
    }
    return getStatsNvmeRemoteControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.ListNvmeRemoteNamespacesRequest,
      opi_api.storage.v1.ListNvmeRemoteNamespacesResponse> getListNvmeRemoteNamespacesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNvmeRemoteNamespaces",
      requestType = opi_api.storage.v1.ListNvmeRemoteNamespacesRequest.class,
      responseType = opi_api.storage.v1.ListNvmeRemoteNamespacesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.ListNvmeRemoteNamespacesRequest,
      opi_api.storage.v1.ListNvmeRemoteNamespacesResponse> getListNvmeRemoteNamespacesMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.ListNvmeRemoteNamespacesRequest, opi_api.storage.v1.ListNvmeRemoteNamespacesResponse> getListNvmeRemoteNamespacesMethod;
    if ((getListNvmeRemoteNamespacesMethod = NvmeRemoteControllerServiceGrpc.getListNvmeRemoteNamespacesMethod) == null) {
      synchronized (NvmeRemoteControllerServiceGrpc.class) {
        if ((getListNvmeRemoteNamespacesMethod = NvmeRemoteControllerServiceGrpc.getListNvmeRemoteNamespacesMethod) == null) {
          NvmeRemoteControllerServiceGrpc.getListNvmeRemoteNamespacesMethod = getListNvmeRemoteNamespacesMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.ListNvmeRemoteNamespacesRequest, opi_api.storage.v1.ListNvmeRemoteNamespacesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNvmeRemoteNamespaces"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListNvmeRemoteNamespacesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListNvmeRemoteNamespacesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NvmeRemoteControllerServiceMethodDescriptorSupplier("ListNvmeRemoteNamespaces"))
              .build();
        }
      }
    }
    return getListNvmeRemoteNamespacesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.GetNvmeRemoteNamespaceRequest,
      opi_api.storage.v1.NvmeRemoteNamespace> getGetNvmeRemoteNamespaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNvmeRemoteNamespace",
      requestType = opi_api.storage.v1.GetNvmeRemoteNamespaceRequest.class,
      responseType = opi_api.storage.v1.NvmeRemoteNamespace.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.GetNvmeRemoteNamespaceRequest,
      opi_api.storage.v1.NvmeRemoteNamespace> getGetNvmeRemoteNamespaceMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.GetNvmeRemoteNamespaceRequest, opi_api.storage.v1.NvmeRemoteNamespace> getGetNvmeRemoteNamespaceMethod;
    if ((getGetNvmeRemoteNamespaceMethod = NvmeRemoteControllerServiceGrpc.getGetNvmeRemoteNamespaceMethod) == null) {
      synchronized (NvmeRemoteControllerServiceGrpc.class) {
        if ((getGetNvmeRemoteNamespaceMethod = NvmeRemoteControllerServiceGrpc.getGetNvmeRemoteNamespaceMethod) == null) {
          NvmeRemoteControllerServiceGrpc.getGetNvmeRemoteNamespaceMethod = getGetNvmeRemoteNamespaceMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.GetNvmeRemoteNamespaceRequest, opi_api.storage.v1.NvmeRemoteNamespace>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNvmeRemoteNamespace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.GetNvmeRemoteNamespaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NvmeRemoteNamespace.getDefaultInstance()))
              .setSchemaDescriptor(new NvmeRemoteControllerServiceMethodDescriptorSupplier("GetNvmeRemoteNamespace"))
              .build();
        }
      }
    }
    return getGetNvmeRemoteNamespaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.CreateNvmePathRequest,
      opi_api.storage.v1.NvmePath> getCreateNvmePathMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateNvmePath",
      requestType = opi_api.storage.v1.CreateNvmePathRequest.class,
      responseType = opi_api.storage.v1.NvmePath.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.CreateNvmePathRequest,
      opi_api.storage.v1.NvmePath> getCreateNvmePathMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.CreateNvmePathRequest, opi_api.storage.v1.NvmePath> getCreateNvmePathMethod;
    if ((getCreateNvmePathMethod = NvmeRemoteControllerServiceGrpc.getCreateNvmePathMethod) == null) {
      synchronized (NvmeRemoteControllerServiceGrpc.class) {
        if ((getCreateNvmePathMethod = NvmeRemoteControllerServiceGrpc.getCreateNvmePathMethod) == null) {
          NvmeRemoteControllerServiceGrpc.getCreateNvmePathMethod = getCreateNvmePathMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.CreateNvmePathRequest, opi_api.storage.v1.NvmePath>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateNvmePath"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.CreateNvmePathRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NvmePath.getDefaultInstance()))
              .setSchemaDescriptor(new NvmeRemoteControllerServiceMethodDescriptorSupplier("CreateNvmePath"))
              .build();
        }
      }
    }
    return getCreateNvmePathMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteNvmePathRequest,
      com.google.protobuf.Empty> getDeleteNvmePathMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteNvmePath",
      requestType = opi_api.storage.v1.DeleteNvmePathRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteNvmePathRequest,
      com.google.protobuf.Empty> getDeleteNvmePathMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteNvmePathRequest, com.google.protobuf.Empty> getDeleteNvmePathMethod;
    if ((getDeleteNvmePathMethod = NvmeRemoteControllerServiceGrpc.getDeleteNvmePathMethod) == null) {
      synchronized (NvmeRemoteControllerServiceGrpc.class) {
        if ((getDeleteNvmePathMethod = NvmeRemoteControllerServiceGrpc.getDeleteNvmePathMethod) == null) {
          NvmeRemoteControllerServiceGrpc.getDeleteNvmePathMethod = getDeleteNvmePathMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.DeleteNvmePathRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteNvmePath"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.DeleteNvmePathRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NvmeRemoteControllerServiceMethodDescriptorSupplier("DeleteNvmePath"))
              .build();
        }
      }
    }
    return getDeleteNvmePathMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateNvmePathRequest,
      opi_api.storage.v1.NvmePath> getUpdateNvmePathMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateNvmePath",
      requestType = opi_api.storage.v1.UpdateNvmePathRequest.class,
      responseType = opi_api.storage.v1.NvmePath.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateNvmePathRequest,
      opi_api.storage.v1.NvmePath> getUpdateNvmePathMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateNvmePathRequest, opi_api.storage.v1.NvmePath> getUpdateNvmePathMethod;
    if ((getUpdateNvmePathMethod = NvmeRemoteControllerServiceGrpc.getUpdateNvmePathMethod) == null) {
      synchronized (NvmeRemoteControllerServiceGrpc.class) {
        if ((getUpdateNvmePathMethod = NvmeRemoteControllerServiceGrpc.getUpdateNvmePathMethod) == null) {
          NvmeRemoteControllerServiceGrpc.getUpdateNvmePathMethod = getUpdateNvmePathMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.UpdateNvmePathRequest, opi_api.storage.v1.NvmePath>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateNvmePath"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.UpdateNvmePathRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NvmePath.getDefaultInstance()))
              .setSchemaDescriptor(new NvmeRemoteControllerServiceMethodDescriptorSupplier("UpdateNvmePath"))
              .build();
        }
      }
    }
    return getUpdateNvmePathMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.ListNvmePathsRequest,
      opi_api.storage.v1.ListNvmePathsResponse> getListNvmePathsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNvmePaths",
      requestType = opi_api.storage.v1.ListNvmePathsRequest.class,
      responseType = opi_api.storage.v1.ListNvmePathsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.ListNvmePathsRequest,
      opi_api.storage.v1.ListNvmePathsResponse> getListNvmePathsMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.ListNvmePathsRequest, opi_api.storage.v1.ListNvmePathsResponse> getListNvmePathsMethod;
    if ((getListNvmePathsMethod = NvmeRemoteControllerServiceGrpc.getListNvmePathsMethod) == null) {
      synchronized (NvmeRemoteControllerServiceGrpc.class) {
        if ((getListNvmePathsMethod = NvmeRemoteControllerServiceGrpc.getListNvmePathsMethod) == null) {
          NvmeRemoteControllerServiceGrpc.getListNvmePathsMethod = getListNvmePathsMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.ListNvmePathsRequest, opi_api.storage.v1.ListNvmePathsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNvmePaths"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListNvmePathsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListNvmePathsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NvmeRemoteControllerServiceMethodDescriptorSupplier("ListNvmePaths"))
              .build();
        }
      }
    }
    return getListNvmePathsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.GetNvmePathRequest,
      opi_api.storage.v1.NvmePath> getGetNvmePathMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNvmePath",
      requestType = opi_api.storage.v1.GetNvmePathRequest.class,
      responseType = opi_api.storage.v1.NvmePath.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.GetNvmePathRequest,
      opi_api.storage.v1.NvmePath> getGetNvmePathMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.GetNvmePathRequest, opi_api.storage.v1.NvmePath> getGetNvmePathMethod;
    if ((getGetNvmePathMethod = NvmeRemoteControllerServiceGrpc.getGetNvmePathMethod) == null) {
      synchronized (NvmeRemoteControllerServiceGrpc.class) {
        if ((getGetNvmePathMethod = NvmeRemoteControllerServiceGrpc.getGetNvmePathMethod) == null) {
          NvmeRemoteControllerServiceGrpc.getGetNvmePathMethod = getGetNvmePathMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.GetNvmePathRequest, opi_api.storage.v1.NvmePath>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNvmePath"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.GetNvmePathRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NvmePath.getDefaultInstance()))
              .setSchemaDescriptor(new NvmeRemoteControllerServiceMethodDescriptorSupplier("GetNvmePath"))
              .build();
        }
      }
    }
    return getGetNvmePathMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.StatsNvmePathRequest,
      opi_api.storage.v1.StatsNvmePathResponse> getStatsNvmePathMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StatsNvmePath",
      requestType = opi_api.storage.v1.StatsNvmePathRequest.class,
      responseType = opi_api.storage.v1.StatsNvmePathResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.StatsNvmePathRequest,
      opi_api.storage.v1.StatsNvmePathResponse> getStatsNvmePathMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.StatsNvmePathRequest, opi_api.storage.v1.StatsNvmePathResponse> getStatsNvmePathMethod;
    if ((getStatsNvmePathMethod = NvmeRemoteControllerServiceGrpc.getStatsNvmePathMethod) == null) {
      synchronized (NvmeRemoteControllerServiceGrpc.class) {
        if ((getStatsNvmePathMethod = NvmeRemoteControllerServiceGrpc.getStatsNvmePathMethod) == null) {
          NvmeRemoteControllerServiceGrpc.getStatsNvmePathMethod = getStatsNvmePathMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.StatsNvmePathRequest, opi_api.storage.v1.StatsNvmePathResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StatsNvmePath"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.StatsNvmePathRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.StatsNvmePathResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NvmeRemoteControllerServiceMethodDescriptorSupplier("StatsNvmePath"))
              .build();
        }
      }
    }
    return getStatsNvmePathMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NvmeRemoteControllerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NvmeRemoteControllerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NvmeRemoteControllerServiceStub>() {
        @java.lang.Override
        public NvmeRemoteControllerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NvmeRemoteControllerServiceStub(channel, callOptions);
        }
      };
    return NvmeRemoteControllerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NvmeRemoteControllerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NvmeRemoteControllerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NvmeRemoteControllerServiceBlockingStub>() {
        @java.lang.Override
        public NvmeRemoteControllerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NvmeRemoteControllerServiceBlockingStub(channel, callOptions);
        }
      };
    return NvmeRemoteControllerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NvmeRemoteControllerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NvmeRemoteControllerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NvmeRemoteControllerServiceFutureStub>() {
        @java.lang.Override
        public NvmeRemoteControllerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NvmeRemoteControllerServiceFutureStub(channel, callOptions);
        }
      };
    return NvmeRemoteControllerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Back End (network-facing) APIs. NVMe/TCP and NVMe/RoCEv2 protocols are covered by this service.
   * </pre>
   */
  public static abstract class NvmeRemoteControllerServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create an Nvme Remote Controller
     * </pre>
     */
    public void createNvmeRemoteController(opi_api.storage.v1.CreateNvmeRemoteControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmeRemoteController> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateNvmeRemoteControllerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an Nvme Remote Controller
     * </pre>
     */
    public void deleteNvmeRemoteController(opi_api.storage.v1.DeleteNvmeRemoteControllerRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteNvmeRemoteControllerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an Nvme Remote Controller
     * </pre>
     */
    public void updateNvmeRemoteController(opi_api.storage.v1.UpdateNvmeRemoteControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmeRemoteController> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateNvmeRemoteControllerMethod(), responseObserver);
    }

    /**
     * <pre>
     * List Nvme Remote Controllers
     * </pre>
     */
    public void listNvmeRemoteControllers(opi_api.storage.v1.ListNvmeRemoteControllersRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListNvmeRemoteControllersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListNvmeRemoteControllersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an Nvme Remote Controller
     * </pre>
     */
    public void getNvmeRemoteController(opi_api.storage.v1.GetNvmeRemoteControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmeRemoteController> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNvmeRemoteControllerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reset an Nvme Remote Controller
     * </pre>
     */
    public void resetNvmeRemoteController(opi_api.storage.v1.ResetNvmeRemoteControllerRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResetNvmeRemoteControllerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an Nvme Remote Controller statistics
     * </pre>
     */
    public void statsNvmeRemoteController(opi_api.storage.v1.StatsNvmeRemoteControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.StatsNvmeRemoteControllerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStatsNvmeRemoteControllerMethod(), responseObserver);
    }

    /**
     * <pre>
     * List Nvme Remote Namespaces
     * </pre>
     */
    public void listNvmeRemoteNamespaces(opi_api.storage.v1.ListNvmeRemoteNamespacesRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListNvmeRemoteNamespacesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListNvmeRemoteNamespacesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an Nvme Remote Namespace
     * </pre>
     */
    public void getNvmeRemoteNamespace(opi_api.storage.v1.GetNvmeRemoteNamespaceRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmeRemoteNamespace> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNvmeRemoteNamespaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create an Nvme Path
     * </pre>
     */
    public void createNvmePath(opi_api.storage.v1.CreateNvmePathRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmePath> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateNvmePathMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an Nvme Path
     * </pre>
     */
    public void deleteNvmePath(opi_api.storage.v1.DeleteNvmePathRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteNvmePathMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an Nvme Path
     * </pre>
     */
    public void updateNvmePath(opi_api.storage.v1.UpdateNvmePathRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmePath> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateNvmePathMethod(), responseObserver);
    }

    /**
     * <pre>
     * List Nvme Paths
     * </pre>
     */
    public void listNvmePaths(opi_api.storage.v1.ListNvmePathsRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListNvmePathsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListNvmePathsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an Nvme Path
     * </pre>
     */
    public void getNvmePath(opi_api.storage.v1.GetNvmePathRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmePath> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNvmePathMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an Nvme Path statistics
     * </pre>
     */
    public void statsNvmePath(opi_api.storage.v1.StatsNvmePathRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.StatsNvmePathResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStatsNvmePathMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateNvmeRemoteControllerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.CreateNvmeRemoteControllerRequest,
                opi_api.storage.v1.NvmeRemoteController>(
                  this, METHODID_CREATE_NVME_REMOTE_CONTROLLER)))
          .addMethod(
            getDeleteNvmeRemoteControllerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.DeleteNvmeRemoteControllerRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_NVME_REMOTE_CONTROLLER)))
          .addMethod(
            getUpdateNvmeRemoteControllerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.UpdateNvmeRemoteControllerRequest,
                opi_api.storage.v1.NvmeRemoteController>(
                  this, METHODID_UPDATE_NVME_REMOTE_CONTROLLER)))
          .addMethod(
            getListNvmeRemoteControllersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.ListNvmeRemoteControllersRequest,
                opi_api.storage.v1.ListNvmeRemoteControllersResponse>(
                  this, METHODID_LIST_NVME_REMOTE_CONTROLLERS)))
          .addMethod(
            getGetNvmeRemoteControllerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.GetNvmeRemoteControllerRequest,
                opi_api.storage.v1.NvmeRemoteController>(
                  this, METHODID_GET_NVME_REMOTE_CONTROLLER)))
          .addMethod(
            getResetNvmeRemoteControllerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.ResetNvmeRemoteControllerRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_RESET_NVME_REMOTE_CONTROLLER)))
          .addMethod(
            getStatsNvmeRemoteControllerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.StatsNvmeRemoteControllerRequest,
                opi_api.storage.v1.StatsNvmeRemoteControllerResponse>(
                  this, METHODID_STATS_NVME_REMOTE_CONTROLLER)))
          .addMethod(
            getListNvmeRemoteNamespacesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.ListNvmeRemoteNamespacesRequest,
                opi_api.storage.v1.ListNvmeRemoteNamespacesResponse>(
                  this, METHODID_LIST_NVME_REMOTE_NAMESPACES)))
          .addMethod(
            getGetNvmeRemoteNamespaceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.GetNvmeRemoteNamespaceRequest,
                opi_api.storage.v1.NvmeRemoteNamespace>(
                  this, METHODID_GET_NVME_REMOTE_NAMESPACE)))
          .addMethod(
            getCreateNvmePathMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.CreateNvmePathRequest,
                opi_api.storage.v1.NvmePath>(
                  this, METHODID_CREATE_NVME_PATH)))
          .addMethod(
            getDeleteNvmePathMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.DeleteNvmePathRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_NVME_PATH)))
          .addMethod(
            getUpdateNvmePathMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.UpdateNvmePathRequest,
                opi_api.storage.v1.NvmePath>(
                  this, METHODID_UPDATE_NVME_PATH)))
          .addMethod(
            getListNvmePathsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.ListNvmePathsRequest,
                opi_api.storage.v1.ListNvmePathsResponse>(
                  this, METHODID_LIST_NVME_PATHS)))
          .addMethod(
            getGetNvmePathMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.GetNvmePathRequest,
                opi_api.storage.v1.NvmePath>(
                  this, METHODID_GET_NVME_PATH)))
          .addMethod(
            getStatsNvmePathMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.StatsNvmePathRequest,
                opi_api.storage.v1.StatsNvmePathResponse>(
                  this, METHODID_STATS_NVME_PATH)))
          .build();
    }
  }

  /**
   * <pre>
   * Back End (network-facing) APIs. NVMe/TCP and NVMe/RoCEv2 protocols are covered by this service.
   * </pre>
   */
  public static final class NvmeRemoteControllerServiceStub extends io.grpc.stub.AbstractAsyncStub<NvmeRemoteControllerServiceStub> {
    private NvmeRemoteControllerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NvmeRemoteControllerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NvmeRemoteControllerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an Nvme Remote Controller
     * </pre>
     */
    public void createNvmeRemoteController(opi_api.storage.v1.CreateNvmeRemoteControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmeRemoteController> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateNvmeRemoteControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an Nvme Remote Controller
     * </pre>
     */
    public void deleteNvmeRemoteController(opi_api.storage.v1.DeleteNvmeRemoteControllerRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteNvmeRemoteControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an Nvme Remote Controller
     * </pre>
     */
    public void updateNvmeRemoteController(opi_api.storage.v1.UpdateNvmeRemoteControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmeRemoteController> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateNvmeRemoteControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List Nvme Remote Controllers
     * </pre>
     */
    public void listNvmeRemoteControllers(opi_api.storage.v1.ListNvmeRemoteControllersRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListNvmeRemoteControllersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListNvmeRemoteControllersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an Nvme Remote Controller
     * </pre>
     */
    public void getNvmeRemoteController(opi_api.storage.v1.GetNvmeRemoteControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmeRemoteController> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNvmeRemoteControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reset an Nvme Remote Controller
     * </pre>
     */
    public void resetNvmeRemoteController(opi_api.storage.v1.ResetNvmeRemoteControllerRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResetNvmeRemoteControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an Nvme Remote Controller statistics
     * </pre>
     */
    public void statsNvmeRemoteController(opi_api.storage.v1.StatsNvmeRemoteControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.StatsNvmeRemoteControllerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStatsNvmeRemoteControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List Nvme Remote Namespaces
     * </pre>
     */
    public void listNvmeRemoteNamespaces(opi_api.storage.v1.ListNvmeRemoteNamespacesRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListNvmeRemoteNamespacesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListNvmeRemoteNamespacesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an Nvme Remote Namespace
     * </pre>
     */
    public void getNvmeRemoteNamespace(opi_api.storage.v1.GetNvmeRemoteNamespaceRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmeRemoteNamespace> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNvmeRemoteNamespaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create an Nvme Path
     * </pre>
     */
    public void createNvmePath(opi_api.storage.v1.CreateNvmePathRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmePath> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateNvmePathMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an Nvme Path
     * </pre>
     */
    public void deleteNvmePath(opi_api.storage.v1.DeleteNvmePathRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteNvmePathMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an Nvme Path
     * </pre>
     */
    public void updateNvmePath(opi_api.storage.v1.UpdateNvmePathRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmePath> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateNvmePathMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List Nvme Paths
     * </pre>
     */
    public void listNvmePaths(opi_api.storage.v1.ListNvmePathsRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListNvmePathsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListNvmePathsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an Nvme Path
     * </pre>
     */
    public void getNvmePath(opi_api.storage.v1.GetNvmePathRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmePath> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNvmePathMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an Nvme Path statistics
     * </pre>
     */
    public void statsNvmePath(opi_api.storage.v1.StatsNvmePathRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.StatsNvmePathResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStatsNvmePathMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Back End (network-facing) APIs. NVMe/TCP and NVMe/RoCEv2 protocols are covered by this service.
   * </pre>
   */
  public static final class NvmeRemoteControllerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<NvmeRemoteControllerServiceBlockingStub> {
    private NvmeRemoteControllerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NvmeRemoteControllerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NvmeRemoteControllerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an Nvme Remote Controller
     * </pre>
     */
    public opi_api.storage.v1.NvmeRemoteController createNvmeRemoteController(opi_api.storage.v1.CreateNvmeRemoteControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateNvmeRemoteControllerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an Nvme Remote Controller
     * </pre>
     */
    public com.google.protobuf.Empty deleteNvmeRemoteController(opi_api.storage.v1.DeleteNvmeRemoteControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteNvmeRemoteControllerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an Nvme Remote Controller
     * </pre>
     */
    public opi_api.storage.v1.NvmeRemoteController updateNvmeRemoteController(opi_api.storage.v1.UpdateNvmeRemoteControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateNvmeRemoteControllerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List Nvme Remote Controllers
     * </pre>
     */
    public opi_api.storage.v1.ListNvmeRemoteControllersResponse listNvmeRemoteControllers(opi_api.storage.v1.ListNvmeRemoteControllersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListNvmeRemoteControllersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an Nvme Remote Controller
     * </pre>
     */
    public opi_api.storage.v1.NvmeRemoteController getNvmeRemoteController(opi_api.storage.v1.GetNvmeRemoteControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNvmeRemoteControllerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reset an Nvme Remote Controller
     * </pre>
     */
    public com.google.protobuf.Empty resetNvmeRemoteController(opi_api.storage.v1.ResetNvmeRemoteControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResetNvmeRemoteControllerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an Nvme Remote Controller statistics
     * </pre>
     */
    public opi_api.storage.v1.StatsNvmeRemoteControllerResponse statsNvmeRemoteController(opi_api.storage.v1.StatsNvmeRemoteControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStatsNvmeRemoteControllerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List Nvme Remote Namespaces
     * </pre>
     */
    public opi_api.storage.v1.ListNvmeRemoteNamespacesResponse listNvmeRemoteNamespaces(opi_api.storage.v1.ListNvmeRemoteNamespacesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListNvmeRemoteNamespacesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an Nvme Remote Namespace
     * </pre>
     */
    public opi_api.storage.v1.NvmeRemoteNamespace getNvmeRemoteNamespace(opi_api.storage.v1.GetNvmeRemoteNamespaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNvmeRemoteNamespaceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create an Nvme Path
     * </pre>
     */
    public opi_api.storage.v1.NvmePath createNvmePath(opi_api.storage.v1.CreateNvmePathRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateNvmePathMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an Nvme Path
     * </pre>
     */
    public com.google.protobuf.Empty deleteNvmePath(opi_api.storage.v1.DeleteNvmePathRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteNvmePathMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an Nvme Path
     * </pre>
     */
    public opi_api.storage.v1.NvmePath updateNvmePath(opi_api.storage.v1.UpdateNvmePathRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateNvmePathMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List Nvme Paths
     * </pre>
     */
    public opi_api.storage.v1.ListNvmePathsResponse listNvmePaths(opi_api.storage.v1.ListNvmePathsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListNvmePathsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an Nvme Path
     * </pre>
     */
    public opi_api.storage.v1.NvmePath getNvmePath(opi_api.storage.v1.GetNvmePathRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNvmePathMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an Nvme Path statistics
     * </pre>
     */
    public opi_api.storage.v1.StatsNvmePathResponse statsNvmePath(opi_api.storage.v1.StatsNvmePathRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStatsNvmePathMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Back End (network-facing) APIs. NVMe/TCP and NVMe/RoCEv2 protocols are covered by this service.
   * </pre>
   */
  public static final class NvmeRemoteControllerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<NvmeRemoteControllerServiceFutureStub> {
    private NvmeRemoteControllerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NvmeRemoteControllerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NvmeRemoteControllerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an Nvme Remote Controller
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NvmeRemoteController> createNvmeRemoteController(
        opi_api.storage.v1.CreateNvmeRemoteControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateNvmeRemoteControllerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an Nvme Remote Controller
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteNvmeRemoteController(
        opi_api.storage.v1.DeleteNvmeRemoteControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteNvmeRemoteControllerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an Nvme Remote Controller
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NvmeRemoteController> updateNvmeRemoteController(
        opi_api.storage.v1.UpdateNvmeRemoteControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateNvmeRemoteControllerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List Nvme Remote Controllers
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.ListNvmeRemoteControllersResponse> listNvmeRemoteControllers(
        opi_api.storage.v1.ListNvmeRemoteControllersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListNvmeRemoteControllersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an Nvme Remote Controller
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NvmeRemoteController> getNvmeRemoteController(
        opi_api.storage.v1.GetNvmeRemoteControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNvmeRemoteControllerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reset an Nvme Remote Controller
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> resetNvmeRemoteController(
        opi_api.storage.v1.ResetNvmeRemoteControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResetNvmeRemoteControllerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an Nvme Remote Controller statistics
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.StatsNvmeRemoteControllerResponse> statsNvmeRemoteController(
        opi_api.storage.v1.StatsNvmeRemoteControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStatsNvmeRemoteControllerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List Nvme Remote Namespaces
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.ListNvmeRemoteNamespacesResponse> listNvmeRemoteNamespaces(
        opi_api.storage.v1.ListNvmeRemoteNamespacesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListNvmeRemoteNamespacesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an Nvme Remote Namespace
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NvmeRemoteNamespace> getNvmeRemoteNamespace(
        opi_api.storage.v1.GetNvmeRemoteNamespaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNvmeRemoteNamespaceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create an Nvme Path
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NvmePath> createNvmePath(
        opi_api.storage.v1.CreateNvmePathRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateNvmePathMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an Nvme Path
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteNvmePath(
        opi_api.storage.v1.DeleteNvmePathRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteNvmePathMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an Nvme Path
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NvmePath> updateNvmePath(
        opi_api.storage.v1.UpdateNvmePathRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateNvmePathMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List Nvme Paths
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.ListNvmePathsResponse> listNvmePaths(
        opi_api.storage.v1.ListNvmePathsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListNvmePathsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an Nvme Path
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NvmePath> getNvmePath(
        opi_api.storage.v1.GetNvmePathRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNvmePathMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an Nvme Path statistics
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.StatsNvmePathResponse> statsNvmePath(
        opi_api.storage.v1.StatsNvmePathRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStatsNvmePathMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_NVME_REMOTE_CONTROLLER = 0;
  private static final int METHODID_DELETE_NVME_REMOTE_CONTROLLER = 1;
  private static final int METHODID_UPDATE_NVME_REMOTE_CONTROLLER = 2;
  private static final int METHODID_LIST_NVME_REMOTE_CONTROLLERS = 3;
  private static final int METHODID_GET_NVME_REMOTE_CONTROLLER = 4;
  private static final int METHODID_RESET_NVME_REMOTE_CONTROLLER = 5;
  private static final int METHODID_STATS_NVME_REMOTE_CONTROLLER = 6;
  private static final int METHODID_LIST_NVME_REMOTE_NAMESPACES = 7;
  private static final int METHODID_GET_NVME_REMOTE_NAMESPACE = 8;
  private static final int METHODID_CREATE_NVME_PATH = 9;
  private static final int METHODID_DELETE_NVME_PATH = 10;
  private static final int METHODID_UPDATE_NVME_PATH = 11;
  private static final int METHODID_LIST_NVME_PATHS = 12;
  private static final int METHODID_GET_NVME_PATH = 13;
  private static final int METHODID_STATS_NVME_PATH = 14;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NvmeRemoteControllerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NvmeRemoteControllerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_NVME_REMOTE_CONTROLLER:
          serviceImpl.createNvmeRemoteController((opi_api.storage.v1.CreateNvmeRemoteControllerRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmeRemoteController>) responseObserver);
          break;
        case METHODID_DELETE_NVME_REMOTE_CONTROLLER:
          serviceImpl.deleteNvmeRemoteController((opi_api.storage.v1.DeleteNvmeRemoteControllerRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_NVME_REMOTE_CONTROLLER:
          serviceImpl.updateNvmeRemoteController((opi_api.storage.v1.UpdateNvmeRemoteControllerRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmeRemoteController>) responseObserver);
          break;
        case METHODID_LIST_NVME_REMOTE_CONTROLLERS:
          serviceImpl.listNvmeRemoteControllers((opi_api.storage.v1.ListNvmeRemoteControllersRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.ListNvmeRemoteControllersResponse>) responseObserver);
          break;
        case METHODID_GET_NVME_REMOTE_CONTROLLER:
          serviceImpl.getNvmeRemoteController((opi_api.storage.v1.GetNvmeRemoteControllerRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmeRemoteController>) responseObserver);
          break;
        case METHODID_RESET_NVME_REMOTE_CONTROLLER:
          serviceImpl.resetNvmeRemoteController((opi_api.storage.v1.ResetNvmeRemoteControllerRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_STATS_NVME_REMOTE_CONTROLLER:
          serviceImpl.statsNvmeRemoteController((opi_api.storage.v1.StatsNvmeRemoteControllerRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.StatsNvmeRemoteControllerResponse>) responseObserver);
          break;
        case METHODID_LIST_NVME_REMOTE_NAMESPACES:
          serviceImpl.listNvmeRemoteNamespaces((opi_api.storage.v1.ListNvmeRemoteNamespacesRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.ListNvmeRemoteNamespacesResponse>) responseObserver);
          break;
        case METHODID_GET_NVME_REMOTE_NAMESPACE:
          serviceImpl.getNvmeRemoteNamespace((opi_api.storage.v1.GetNvmeRemoteNamespaceRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmeRemoteNamespace>) responseObserver);
          break;
        case METHODID_CREATE_NVME_PATH:
          serviceImpl.createNvmePath((opi_api.storage.v1.CreateNvmePathRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmePath>) responseObserver);
          break;
        case METHODID_DELETE_NVME_PATH:
          serviceImpl.deleteNvmePath((opi_api.storage.v1.DeleteNvmePathRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_NVME_PATH:
          serviceImpl.updateNvmePath((opi_api.storage.v1.UpdateNvmePathRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmePath>) responseObserver);
          break;
        case METHODID_LIST_NVME_PATHS:
          serviceImpl.listNvmePaths((opi_api.storage.v1.ListNvmePathsRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.ListNvmePathsResponse>) responseObserver);
          break;
        case METHODID_GET_NVME_PATH:
          serviceImpl.getNvmePath((opi_api.storage.v1.GetNvmePathRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NvmePath>) responseObserver);
          break;
        case METHODID_STATS_NVME_PATH:
          serviceImpl.statsNvmePath((opi_api.storage.v1.StatsNvmePathRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.StatsNvmePathResponse>) responseObserver);
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

  private static abstract class NvmeRemoteControllerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NvmeRemoteControllerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return opi_api.storage.v1.BackendNvmeTcpProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NvmeRemoteControllerService");
    }
  }

  private static final class NvmeRemoteControllerServiceFileDescriptorSupplier
      extends NvmeRemoteControllerServiceBaseDescriptorSupplier {
    NvmeRemoteControllerServiceFileDescriptorSupplier() {}
  }

  private static final class NvmeRemoteControllerServiceMethodDescriptorSupplier
      extends NvmeRemoteControllerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NvmeRemoteControllerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (NvmeRemoteControllerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NvmeRemoteControllerServiceFileDescriptorSupplier())
              .addMethod(getCreateNvmeRemoteControllerMethod())
              .addMethod(getDeleteNvmeRemoteControllerMethod())
              .addMethod(getUpdateNvmeRemoteControllerMethod())
              .addMethod(getListNvmeRemoteControllersMethod())
              .addMethod(getGetNvmeRemoteControllerMethod())
              .addMethod(getResetNvmeRemoteControllerMethod())
              .addMethod(getStatsNvmeRemoteControllerMethod())
              .addMethod(getListNvmeRemoteNamespacesMethod())
              .addMethod(getGetNvmeRemoteNamespaceMethod())
              .addMethod(getCreateNvmePathMethod())
              .addMethod(getDeleteNvmePathMethod())
              .addMethod(getUpdateNvmePathMethod())
              .addMethod(getListNvmePathsMethod())
              .addMethod(getGetNvmePathMethod())
              .addMethod(getStatsNvmePathMethod())
              .build();
        }
      }
    }
    return result;
  }
}
