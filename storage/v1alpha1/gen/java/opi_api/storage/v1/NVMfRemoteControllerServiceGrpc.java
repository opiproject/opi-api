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
public final class NVMfRemoteControllerServiceGrpc {

  private NVMfRemoteControllerServiceGrpc() {}

  public static final String SERVICE_NAME = "opi_api.storage.v1.NVMfRemoteControllerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.CreateNVMfRemoteControllerRequest,
      opi_api.storage.v1.NVMfRemoteController> getCreateNVMfRemoteControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateNVMfRemoteController",
      requestType = opi_api.storage.v1.CreateNVMfRemoteControllerRequest.class,
      responseType = opi_api.storage.v1.NVMfRemoteController.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.CreateNVMfRemoteControllerRequest,
      opi_api.storage.v1.NVMfRemoteController> getCreateNVMfRemoteControllerMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.CreateNVMfRemoteControllerRequest, opi_api.storage.v1.NVMfRemoteController> getCreateNVMfRemoteControllerMethod;
    if ((getCreateNVMfRemoteControllerMethod = NVMfRemoteControllerServiceGrpc.getCreateNVMfRemoteControllerMethod) == null) {
      synchronized (NVMfRemoteControllerServiceGrpc.class) {
        if ((getCreateNVMfRemoteControllerMethod = NVMfRemoteControllerServiceGrpc.getCreateNVMfRemoteControllerMethod) == null) {
          NVMfRemoteControllerServiceGrpc.getCreateNVMfRemoteControllerMethod = getCreateNVMfRemoteControllerMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.CreateNVMfRemoteControllerRequest, opi_api.storage.v1.NVMfRemoteController>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateNVMfRemoteController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.CreateNVMfRemoteControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMfRemoteController.getDefaultInstance()))
              .setSchemaDescriptor(new NVMfRemoteControllerServiceMethodDescriptorSupplier("CreateNVMfRemoteController"))
              .build();
        }
      }
    }
    return getCreateNVMfRemoteControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteNVMfRemoteControllerRequest,
      com.google.protobuf.Empty> getDeleteNVMfRemoteControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteNVMfRemoteController",
      requestType = opi_api.storage.v1.DeleteNVMfRemoteControllerRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteNVMfRemoteControllerRequest,
      com.google.protobuf.Empty> getDeleteNVMfRemoteControllerMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteNVMfRemoteControllerRequest, com.google.protobuf.Empty> getDeleteNVMfRemoteControllerMethod;
    if ((getDeleteNVMfRemoteControllerMethod = NVMfRemoteControllerServiceGrpc.getDeleteNVMfRemoteControllerMethod) == null) {
      synchronized (NVMfRemoteControllerServiceGrpc.class) {
        if ((getDeleteNVMfRemoteControllerMethod = NVMfRemoteControllerServiceGrpc.getDeleteNVMfRemoteControllerMethod) == null) {
          NVMfRemoteControllerServiceGrpc.getDeleteNVMfRemoteControllerMethod = getDeleteNVMfRemoteControllerMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.DeleteNVMfRemoteControllerRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteNVMfRemoteController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.DeleteNVMfRemoteControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NVMfRemoteControllerServiceMethodDescriptorSupplier("DeleteNVMfRemoteController"))
              .build();
        }
      }
    }
    return getDeleteNVMfRemoteControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateNVMfRemoteControllerRequest,
      opi_api.storage.v1.NVMfRemoteController> getUpdateNVMfRemoteControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateNVMfRemoteController",
      requestType = opi_api.storage.v1.UpdateNVMfRemoteControllerRequest.class,
      responseType = opi_api.storage.v1.NVMfRemoteController.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateNVMfRemoteControllerRequest,
      opi_api.storage.v1.NVMfRemoteController> getUpdateNVMfRemoteControllerMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateNVMfRemoteControllerRequest, opi_api.storage.v1.NVMfRemoteController> getUpdateNVMfRemoteControllerMethod;
    if ((getUpdateNVMfRemoteControllerMethod = NVMfRemoteControllerServiceGrpc.getUpdateNVMfRemoteControllerMethod) == null) {
      synchronized (NVMfRemoteControllerServiceGrpc.class) {
        if ((getUpdateNVMfRemoteControllerMethod = NVMfRemoteControllerServiceGrpc.getUpdateNVMfRemoteControllerMethod) == null) {
          NVMfRemoteControllerServiceGrpc.getUpdateNVMfRemoteControllerMethod = getUpdateNVMfRemoteControllerMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.UpdateNVMfRemoteControllerRequest, opi_api.storage.v1.NVMfRemoteController>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateNVMfRemoteController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.UpdateNVMfRemoteControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMfRemoteController.getDefaultInstance()))
              .setSchemaDescriptor(new NVMfRemoteControllerServiceMethodDescriptorSupplier("UpdateNVMfRemoteController"))
              .build();
        }
      }
    }
    return getUpdateNVMfRemoteControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.ListNVMfRemoteControllerRequest,
      opi_api.storage.v1.ListNVMfRemoteControllerResponse> getListNVMfRemoteControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNVMfRemoteController",
      requestType = opi_api.storage.v1.ListNVMfRemoteControllerRequest.class,
      responseType = opi_api.storage.v1.ListNVMfRemoteControllerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.ListNVMfRemoteControllerRequest,
      opi_api.storage.v1.ListNVMfRemoteControllerResponse> getListNVMfRemoteControllerMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.ListNVMfRemoteControllerRequest, opi_api.storage.v1.ListNVMfRemoteControllerResponse> getListNVMfRemoteControllerMethod;
    if ((getListNVMfRemoteControllerMethod = NVMfRemoteControllerServiceGrpc.getListNVMfRemoteControllerMethod) == null) {
      synchronized (NVMfRemoteControllerServiceGrpc.class) {
        if ((getListNVMfRemoteControllerMethod = NVMfRemoteControllerServiceGrpc.getListNVMfRemoteControllerMethod) == null) {
          NVMfRemoteControllerServiceGrpc.getListNVMfRemoteControllerMethod = getListNVMfRemoteControllerMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.ListNVMfRemoteControllerRequest, opi_api.storage.v1.ListNVMfRemoteControllerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNVMfRemoteController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListNVMfRemoteControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListNVMfRemoteControllerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NVMfRemoteControllerServiceMethodDescriptorSupplier("ListNVMfRemoteController"))
              .build();
        }
      }
    }
    return getListNVMfRemoteControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.GetNVMfRemoteControllerRequest,
      opi_api.storage.v1.NVMfRemoteController> getGetNVMfRemoteControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNVMfRemoteController",
      requestType = opi_api.storage.v1.GetNVMfRemoteControllerRequest.class,
      responseType = opi_api.storage.v1.NVMfRemoteController.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.GetNVMfRemoteControllerRequest,
      opi_api.storage.v1.NVMfRemoteController> getGetNVMfRemoteControllerMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.GetNVMfRemoteControllerRequest, opi_api.storage.v1.NVMfRemoteController> getGetNVMfRemoteControllerMethod;
    if ((getGetNVMfRemoteControllerMethod = NVMfRemoteControllerServiceGrpc.getGetNVMfRemoteControllerMethod) == null) {
      synchronized (NVMfRemoteControllerServiceGrpc.class) {
        if ((getGetNVMfRemoteControllerMethod = NVMfRemoteControllerServiceGrpc.getGetNVMfRemoteControllerMethod) == null) {
          NVMfRemoteControllerServiceGrpc.getGetNVMfRemoteControllerMethod = getGetNVMfRemoteControllerMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.GetNVMfRemoteControllerRequest, opi_api.storage.v1.NVMfRemoteController>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNVMfRemoteController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.GetNVMfRemoteControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMfRemoteController.getDefaultInstance()))
              .setSchemaDescriptor(new NVMfRemoteControllerServiceMethodDescriptorSupplier("GetNVMfRemoteController"))
              .build();
        }
      }
    }
    return getGetNVMfRemoteControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.NVMfRemoteControllerResetRequest,
      com.google.protobuf.Empty> getNVMfRemoteControllerResetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NVMfRemoteControllerReset",
      requestType = opi_api.storage.v1.NVMfRemoteControllerResetRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.NVMfRemoteControllerResetRequest,
      com.google.protobuf.Empty> getNVMfRemoteControllerResetMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.NVMfRemoteControllerResetRequest, com.google.protobuf.Empty> getNVMfRemoteControllerResetMethod;
    if ((getNVMfRemoteControllerResetMethod = NVMfRemoteControllerServiceGrpc.getNVMfRemoteControllerResetMethod) == null) {
      synchronized (NVMfRemoteControllerServiceGrpc.class) {
        if ((getNVMfRemoteControllerResetMethod = NVMfRemoteControllerServiceGrpc.getNVMfRemoteControllerResetMethod) == null) {
          NVMfRemoteControllerServiceGrpc.getNVMfRemoteControllerResetMethod = getNVMfRemoteControllerResetMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.NVMfRemoteControllerResetRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NVMfRemoteControllerReset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMfRemoteControllerResetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NVMfRemoteControllerServiceMethodDescriptorSupplier("NVMfRemoteControllerReset"))
              .build();
        }
      }
    }
    return getNVMfRemoteControllerResetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.NVMfRemoteControllerStatsRequest,
      opi_api.storage.v1.NVMfRemoteControllerStatsResponse> getNVMfRemoteControllerStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NVMfRemoteControllerStats",
      requestType = opi_api.storage.v1.NVMfRemoteControllerStatsRequest.class,
      responseType = opi_api.storage.v1.NVMfRemoteControllerStatsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.NVMfRemoteControllerStatsRequest,
      opi_api.storage.v1.NVMfRemoteControllerStatsResponse> getNVMfRemoteControllerStatsMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.NVMfRemoteControllerStatsRequest, opi_api.storage.v1.NVMfRemoteControllerStatsResponse> getNVMfRemoteControllerStatsMethod;
    if ((getNVMfRemoteControllerStatsMethod = NVMfRemoteControllerServiceGrpc.getNVMfRemoteControllerStatsMethod) == null) {
      synchronized (NVMfRemoteControllerServiceGrpc.class) {
        if ((getNVMfRemoteControllerStatsMethod = NVMfRemoteControllerServiceGrpc.getNVMfRemoteControllerStatsMethod) == null) {
          NVMfRemoteControllerServiceGrpc.getNVMfRemoteControllerStatsMethod = getNVMfRemoteControllerStatsMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.NVMfRemoteControllerStatsRequest, opi_api.storage.v1.NVMfRemoteControllerStatsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NVMfRemoteControllerStats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMfRemoteControllerStatsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMfRemoteControllerStatsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NVMfRemoteControllerServiceMethodDescriptorSupplier("NVMfRemoteControllerStats"))
              .build();
        }
      }
    }
    return getNVMfRemoteControllerStatsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NVMfRemoteControllerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NVMfRemoteControllerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NVMfRemoteControllerServiceStub>() {
        @java.lang.Override
        public NVMfRemoteControllerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NVMfRemoteControllerServiceStub(channel, callOptions);
        }
      };
    return NVMfRemoteControllerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NVMfRemoteControllerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NVMfRemoteControllerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NVMfRemoteControllerServiceBlockingStub>() {
        @java.lang.Override
        public NVMfRemoteControllerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NVMfRemoteControllerServiceBlockingStub(channel, callOptions);
        }
      };
    return NVMfRemoteControllerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NVMfRemoteControllerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NVMfRemoteControllerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NVMfRemoteControllerServiceFutureStub>() {
        @java.lang.Override
        public NVMfRemoteControllerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NVMfRemoteControllerServiceFutureStub(channel, callOptions);
        }
      };
    return NVMfRemoteControllerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Back End (network-facing) APIs. NVMe/TCP and NVMe/RoCEv2 protocols are covered by this service.
   * </pre>
   */
  public static abstract class NVMfRemoteControllerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createNVMfRemoteController(opi_api.storage.v1.CreateNVMfRemoteControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMfRemoteController> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateNVMfRemoteControllerMethod(), responseObserver);
    }

    /**
     */
    public void deleteNVMfRemoteController(opi_api.storage.v1.DeleteNVMfRemoteControllerRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteNVMfRemoteControllerMethod(), responseObserver);
    }

    /**
     */
    public void updateNVMfRemoteController(opi_api.storage.v1.UpdateNVMfRemoteControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMfRemoteController> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateNVMfRemoteControllerMethod(), responseObserver);
    }

    /**
     */
    public void listNVMfRemoteController(opi_api.storage.v1.ListNVMfRemoteControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListNVMfRemoteControllerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListNVMfRemoteControllerMethod(), responseObserver);
    }

    /**
     */
    public void getNVMfRemoteController(opi_api.storage.v1.GetNVMfRemoteControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMfRemoteController> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNVMfRemoteControllerMethod(), responseObserver);
    }

    /**
     */
    public void nVMfRemoteControllerReset(opi_api.storage.v1.NVMfRemoteControllerResetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNVMfRemoteControllerResetMethod(), responseObserver);
    }

    /**
     */
    public void nVMfRemoteControllerStats(opi_api.storage.v1.NVMfRemoteControllerStatsRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMfRemoteControllerStatsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNVMfRemoteControllerStatsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateNVMfRemoteControllerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.CreateNVMfRemoteControllerRequest,
                opi_api.storage.v1.NVMfRemoteController>(
                  this, METHODID_CREATE_NVMF_REMOTE_CONTROLLER)))
          .addMethod(
            getDeleteNVMfRemoteControllerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.DeleteNVMfRemoteControllerRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_NVMF_REMOTE_CONTROLLER)))
          .addMethod(
            getUpdateNVMfRemoteControllerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.UpdateNVMfRemoteControllerRequest,
                opi_api.storage.v1.NVMfRemoteController>(
                  this, METHODID_UPDATE_NVMF_REMOTE_CONTROLLER)))
          .addMethod(
            getListNVMfRemoteControllerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.ListNVMfRemoteControllerRequest,
                opi_api.storage.v1.ListNVMfRemoteControllerResponse>(
                  this, METHODID_LIST_NVMF_REMOTE_CONTROLLER)))
          .addMethod(
            getGetNVMfRemoteControllerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.GetNVMfRemoteControllerRequest,
                opi_api.storage.v1.NVMfRemoteController>(
                  this, METHODID_GET_NVMF_REMOTE_CONTROLLER)))
          .addMethod(
            getNVMfRemoteControllerResetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.NVMfRemoteControllerResetRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_NVMF_REMOTE_CONTROLLER_RESET)))
          .addMethod(
            getNVMfRemoteControllerStatsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.NVMfRemoteControllerStatsRequest,
                opi_api.storage.v1.NVMfRemoteControllerStatsResponse>(
                  this, METHODID_NVMF_REMOTE_CONTROLLER_STATS)))
          .build();
    }
  }

  /**
   * <pre>
   * Back End (network-facing) APIs. NVMe/TCP and NVMe/RoCEv2 protocols are covered by this service.
   * </pre>
   */
  public static final class NVMfRemoteControllerServiceStub extends io.grpc.stub.AbstractAsyncStub<NVMfRemoteControllerServiceStub> {
    private NVMfRemoteControllerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NVMfRemoteControllerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NVMfRemoteControllerServiceStub(channel, callOptions);
    }

    /**
     */
    public void createNVMfRemoteController(opi_api.storage.v1.CreateNVMfRemoteControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMfRemoteController> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateNVMfRemoteControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteNVMfRemoteController(opi_api.storage.v1.DeleteNVMfRemoteControllerRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteNVMfRemoteControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateNVMfRemoteController(opi_api.storage.v1.UpdateNVMfRemoteControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMfRemoteController> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateNVMfRemoteControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listNVMfRemoteController(opi_api.storage.v1.ListNVMfRemoteControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListNVMfRemoteControllerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListNVMfRemoteControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNVMfRemoteController(opi_api.storage.v1.GetNVMfRemoteControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMfRemoteController> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNVMfRemoteControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void nVMfRemoteControllerReset(opi_api.storage.v1.NVMfRemoteControllerResetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNVMfRemoteControllerResetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void nVMfRemoteControllerStats(opi_api.storage.v1.NVMfRemoteControllerStatsRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMfRemoteControllerStatsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNVMfRemoteControllerStatsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Back End (network-facing) APIs. NVMe/TCP and NVMe/RoCEv2 protocols are covered by this service.
   * </pre>
   */
  public static final class NVMfRemoteControllerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<NVMfRemoteControllerServiceBlockingStub> {
    private NVMfRemoteControllerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NVMfRemoteControllerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NVMfRemoteControllerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public opi_api.storage.v1.NVMfRemoteController createNVMfRemoteController(opi_api.storage.v1.CreateNVMfRemoteControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateNVMfRemoteControllerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteNVMfRemoteController(opi_api.storage.v1.DeleteNVMfRemoteControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteNVMfRemoteControllerMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.NVMfRemoteController updateNVMfRemoteController(opi_api.storage.v1.UpdateNVMfRemoteControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateNVMfRemoteControllerMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.ListNVMfRemoteControllerResponse listNVMfRemoteController(opi_api.storage.v1.ListNVMfRemoteControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListNVMfRemoteControllerMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.NVMfRemoteController getNVMfRemoteController(opi_api.storage.v1.GetNVMfRemoteControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNVMfRemoteControllerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty nVMfRemoteControllerReset(opi_api.storage.v1.NVMfRemoteControllerResetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNVMfRemoteControllerResetMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.NVMfRemoteControllerStatsResponse nVMfRemoteControllerStats(opi_api.storage.v1.NVMfRemoteControllerStatsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNVMfRemoteControllerStatsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Back End (network-facing) APIs. NVMe/TCP and NVMe/RoCEv2 protocols are covered by this service.
   * </pre>
   */
  public static final class NVMfRemoteControllerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<NVMfRemoteControllerServiceFutureStub> {
    private NVMfRemoteControllerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NVMfRemoteControllerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NVMfRemoteControllerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NVMfRemoteController> createNVMfRemoteController(
        opi_api.storage.v1.CreateNVMfRemoteControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateNVMfRemoteControllerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteNVMfRemoteController(
        opi_api.storage.v1.DeleteNVMfRemoteControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteNVMfRemoteControllerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NVMfRemoteController> updateNVMfRemoteController(
        opi_api.storage.v1.UpdateNVMfRemoteControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateNVMfRemoteControllerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.ListNVMfRemoteControllerResponse> listNVMfRemoteController(
        opi_api.storage.v1.ListNVMfRemoteControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListNVMfRemoteControllerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NVMfRemoteController> getNVMfRemoteController(
        opi_api.storage.v1.GetNVMfRemoteControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNVMfRemoteControllerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> nVMfRemoteControllerReset(
        opi_api.storage.v1.NVMfRemoteControllerResetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNVMfRemoteControllerResetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NVMfRemoteControllerStatsResponse> nVMfRemoteControllerStats(
        opi_api.storage.v1.NVMfRemoteControllerStatsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNVMfRemoteControllerStatsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_NVMF_REMOTE_CONTROLLER = 0;
  private static final int METHODID_DELETE_NVMF_REMOTE_CONTROLLER = 1;
  private static final int METHODID_UPDATE_NVMF_REMOTE_CONTROLLER = 2;
  private static final int METHODID_LIST_NVMF_REMOTE_CONTROLLER = 3;
  private static final int METHODID_GET_NVMF_REMOTE_CONTROLLER = 4;
  private static final int METHODID_NVMF_REMOTE_CONTROLLER_RESET = 5;
  private static final int METHODID_NVMF_REMOTE_CONTROLLER_STATS = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NVMfRemoteControllerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NVMfRemoteControllerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_NVMF_REMOTE_CONTROLLER:
          serviceImpl.createNVMfRemoteController((opi_api.storage.v1.CreateNVMfRemoteControllerRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMfRemoteController>) responseObserver);
          break;
        case METHODID_DELETE_NVMF_REMOTE_CONTROLLER:
          serviceImpl.deleteNVMfRemoteController((opi_api.storage.v1.DeleteNVMfRemoteControllerRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_NVMF_REMOTE_CONTROLLER:
          serviceImpl.updateNVMfRemoteController((opi_api.storage.v1.UpdateNVMfRemoteControllerRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMfRemoteController>) responseObserver);
          break;
        case METHODID_LIST_NVMF_REMOTE_CONTROLLER:
          serviceImpl.listNVMfRemoteController((opi_api.storage.v1.ListNVMfRemoteControllerRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.ListNVMfRemoteControllerResponse>) responseObserver);
          break;
        case METHODID_GET_NVMF_REMOTE_CONTROLLER:
          serviceImpl.getNVMfRemoteController((opi_api.storage.v1.GetNVMfRemoteControllerRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMfRemoteController>) responseObserver);
          break;
        case METHODID_NVMF_REMOTE_CONTROLLER_RESET:
          serviceImpl.nVMfRemoteControllerReset((opi_api.storage.v1.NVMfRemoteControllerResetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_NVMF_REMOTE_CONTROLLER_STATS:
          serviceImpl.nVMfRemoteControllerStats((opi_api.storage.v1.NVMfRemoteControllerStatsRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMfRemoteControllerStatsResponse>) responseObserver);
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

  private static abstract class NVMfRemoteControllerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NVMfRemoteControllerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return opi_api.storage.v1.BackendNvmeTcpProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NVMfRemoteControllerService");
    }
  }

  private static final class NVMfRemoteControllerServiceFileDescriptorSupplier
      extends NVMfRemoteControllerServiceBaseDescriptorSupplier {
    NVMfRemoteControllerServiceFileDescriptorSupplier() {}
  }

  private static final class NVMfRemoteControllerServiceMethodDescriptorSupplier
      extends NVMfRemoteControllerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NVMfRemoteControllerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (NVMfRemoteControllerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NVMfRemoteControllerServiceFileDescriptorSupplier())
              .addMethod(getCreateNVMfRemoteControllerMethod())
              .addMethod(getDeleteNVMfRemoteControllerMethod())
              .addMethod(getUpdateNVMfRemoteControllerMethod())
              .addMethod(getListNVMfRemoteControllerMethod())
              .addMethod(getGetNVMfRemoteControllerMethod())
              .addMethod(getNVMfRemoteControllerResetMethod())
              .addMethod(getNVMfRemoteControllerStatsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
