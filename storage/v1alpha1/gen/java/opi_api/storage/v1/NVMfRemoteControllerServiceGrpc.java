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
  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.NVMfRemoteControllerConnectRequest,
      opi_api.storage.v1.NVMfRemoteController> getNVMfRemoteControllerConnectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NVMfRemoteControllerConnect",
      requestType = opi_api.storage.v1.NVMfRemoteControllerConnectRequest.class,
      responseType = opi_api.storage.v1.NVMfRemoteController.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.NVMfRemoteControllerConnectRequest,
      opi_api.storage.v1.NVMfRemoteController> getNVMfRemoteControllerConnectMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.NVMfRemoteControllerConnectRequest, opi_api.storage.v1.NVMfRemoteController> getNVMfRemoteControllerConnectMethod;
    if ((getNVMfRemoteControllerConnectMethod = NVMfRemoteControllerServiceGrpc.getNVMfRemoteControllerConnectMethod) == null) {
      synchronized (NVMfRemoteControllerServiceGrpc.class) {
        if ((getNVMfRemoteControllerConnectMethod = NVMfRemoteControllerServiceGrpc.getNVMfRemoteControllerConnectMethod) == null) {
          NVMfRemoteControllerServiceGrpc.getNVMfRemoteControllerConnectMethod = getNVMfRemoteControllerConnectMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.NVMfRemoteControllerConnectRequest, opi_api.storage.v1.NVMfRemoteController>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NVMfRemoteControllerConnect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMfRemoteControllerConnectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMfRemoteController.getDefaultInstance()))
              .setSchemaDescriptor(new NVMfRemoteControllerServiceMethodDescriptorSupplier("NVMfRemoteControllerConnect"))
              .build();
        }
      }
    }
    return getNVMfRemoteControllerConnectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.NVMfRemoteControllerDisconnectRequest,
      com.google.protobuf.Empty> getNVMfRemoteControllerDisconnectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NVMfRemoteControllerDisconnect",
      requestType = opi_api.storage.v1.NVMfRemoteControllerDisconnectRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.NVMfRemoteControllerDisconnectRequest,
      com.google.protobuf.Empty> getNVMfRemoteControllerDisconnectMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.NVMfRemoteControllerDisconnectRequest, com.google.protobuf.Empty> getNVMfRemoteControllerDisconnectMethod;
    if ((getNVMfRemoteControllerDisconnectMethod = NVMfRemoteControllerServiceGrpc.getNVMfRemoteControllerDisconnectMethod) == null) {
      synchronized (NVMfRemoteControllerServiceGrpc.class) {
        if ((getNVMfRemoteControllerDisconnectMethod = NVMfRemoteControllerServiceGrpc.getNVMfRemoteControllerDisconnectMethod) == null) {
          NVMfRemoteControllerServiceGrpc.getNVMfRemoteControllerDisconnectMethod = getNVMfRemoteControllerDisconnectMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.NVMfRemoteControllerDisconnectRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NVMfRemoteControllerDisconnect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMfRemoteControllerDisconnectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NVMfRemoteControllerServiceMethodDescriptorSupplier("NVMfRemoteControllerDisconnect"))
              .build();
        }
      }
    }
    return getNVMfRemoteControllerDisconnectMethod;
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

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.NVMfRemoteControllerListRequest,
      opi_api.storage.v1.NVMfRemoteControllerListResponse> getNVMfRemoteControllerListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NVMfRemoteControllerList",
      requestType = opi_api.storage.v1.NVMfRemoteControllerListRequest.class,
      responseType = opi_api.storage.v1.NVMfRemoteControllerListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.NVMfRemoteControllerListRequest,
      opi_api.storage.v1.NVMfRemoteControllerListResponse> getNVMfRemoteControllerListMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.NVMfRemoteControllerListRequest, opi_api.storage.v1.NVMfRemoteControllerListResponse> getNVMfRemoteControllerListMethod;
    if ((getNVMfRemoteControllerListMethod = NVMfRemoteControllerServiceGrpc.getNVMfRemoteControllerListMethod) == null) {
      synchronized (NVMfRemoteControllerServiceGrpc.class) {
        if ((getNVMfRemoteControllerListMethod = NVMfRemoteControllerServiceGrpc.getNVMfRemoteControllerListMethod) == null) {
          NVMfRemoteControllerServiceGrpc.getNVMfRemoteControllerListMethod = getNVMfRemoteControllerListMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.NVMfRemoteControllerListRequest, opi_api.storage.v1.NVMfRemoteControllerListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NVMfRemoteControllerList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMfRemoteControllerListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMfRemoteControllerListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NVMfRemoteControllerServiceMethodDescriptorSupplier("NVMfRemoteControllerList"))
              .build();
        }
      }
    }
    return getNVMfRemoteControllerListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.NVMfRemoteControllerGetRequest,
      opi_api.storage.v1.NVMfRemoteController> getNVMfRemoteControllerGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NVMfRemoteControllerGet",
      requestType = opi_api.storage.v1.NVMfRemoteControllerGetRequest.class,
      responseType = opi_api.storage.v1.NVMfRemoteController.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.NVMfRemoteControllerGetRequest,
      opi_api.storage.v1.NVMfRemoteController> getNVMfRemoteControllerGetMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.NVMfRemoteControllerGetRequest, opi_api.storage.v1.NVMfRemoteController> getNVMfRemoteControllerGetMethod;
    if ((getNVMfRemoteControllerGetMethod = NVMfRemoteControllerServiceGrpc.getNVMfRemoteControllerGetMethod) == null) {
      synchronized (NVMfRemoteControllerServiceGrpc.class) {
        if ((getNVMfRemoteControllerGetMethod = NVMfRemoteControllerServiceGrpc.getNVMfRemoteControllerGetMethod) == null) {
          NVMfRemoteControllerServiceGrpc.getNVMfRemoteControllerGetMethod = getNVMfRemoteControllerGetMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.NVMfRemoteControllerGetRequest, opi_api.storage.v1.NVMfRemoteController>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NVMfRemoteControllerGet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMfRemoteControllerGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NVMfRemoteController.getDefaultInstance()))
              .setSchemaDescriptor(new NVMfRemoteControllerServiceMethodDescriptorSupplier("NVMfRemoteControllerGet"))
              .build();
        }
      }
    }
    return getNVMfRemoteControllerGetMethod;
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
    public void nVMfRemoteControllerConnect(opi_api.storage.v1.NVMfRemoteControllerConnectRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMfRemoteController> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNVMfRemoteControllerConnectMethod(), responseObserver);
    }

    /**
     */
    public void nVMfRemoteControllerDisconnect(opi_api.storage.v1.NVMfRemoteControllerDisconnectRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNVMfRemoteControllerDisconnectMethod(), responseObserver);
    }

    /**
     */
    public void nVMfRemoteControllerReset(opi_api.storage.v1.NVMfRemoteControllerResetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNVMfRemoteControllerResetMethod(), responseObserver);
    }

    /**
     */
    public void nVMfRemoteControllerList(opi_api.storage.v1.NVMfRemoteControllerListRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMfRemoteControllerListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNVMfRemoteControllerListMethod(), responseObserver);
    }

    /**
     */
    public void nVMfRemoteControllerGet(opi_api.storage.v1.NVMfRemoteControllerGetRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMfRemoteController> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNVMfRemoteControllerGetMethod(), responseObserver);
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
            getNVMfRemoteControllerConnectMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.NVMfRemoteControllerConnectRequest,
                opi_api.storage.v1.NVMfRemoteController>(
                  this, METHODID_NVMF_REMOTE_CONTROLLER_CONNECT)))
          .addMethod(
            getNVMfRemoteControllerDisconnectMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.NVMfRemoteControllerDisconnectRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_NVMF_REMOTE_CONTROLLER_DISCONNECT)))
          .addMethod(
            getNVMfRemoteControllerResetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.NVMfRemoteControllerResetRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_NVMF_REMOTE_CONTROLLER_RESET)))
          .addMethod(
            getNVMfRemoteControllerListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.NVMfRemoteControllerListRequest,
                opi_api.storage.v1.NVMfRemoteControllerListResponse>(
                  this, METHODID_NVMF_REMOTE_CONTROLLER_LIST)))
          .addMethod(
            getNVMfRemoteControllerGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.NVMfRemoteControllerGetRequest,
                opi_api.storage.v1.NVMfRemoteController>(
                  this, METHODID_NVMF_REMOTE_CONTROLLER_GET)))
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
    public void nVMfRemoteControllerConnect(opi_api.storage.v1.NVMfRemoteControllerConnectRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMfRemoteController> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNVMfRemoteControllerConnectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void nVMfRemoteControllerDisconnect(opi_api.storage.v1.NVMfRemoteControllerDisconnectRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNVMfRemoteControllerDisconnectMethod(), getCallOptions()), request, responseObserver);
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
    public void nVMfRemoteControllerList(opi_api.storage.v1.NVMfRemoteControllerListRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMfRemoteControllerListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNVMfRemoteControllerListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void nVMfRemoteControllerGet(opi_api.storage.v1.NVMfRemoteControllerGetRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMfRemoteController> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNVMfRemoteControllerGetMethod(), getCallOptions()), request, responseObserver);
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
    public opi_api.storage.v1.NVMfRemoteController nVMfRemoteControllerConnect(opi_api.storage.v1.NVMfRemoteControllerConnectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNVMfRemoteControllerConnectMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty nVMfRemoteControllerDisconnect(opi_api.storage.v1.NVMfRemoteControllerDisconnectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNVMfRemoteControllerDisconnectMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty nVMfRemoteControllerReset(opi_api.storage.v1.NVMfRemoteControllerResetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNVMfRemoteControllerResetMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.NVMfRemoteControllerListResponse nVMfRemoteControllerList(opi_api.storage.v1.NVMfRemoteControllerListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNVMfRemoteControllerListMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.NVMfRemoteController nVMfRemoteControllerGet(opi_api.storage.v1.NVMfRemoteControllerGetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNVMfRemoteControllerGetMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NVMfRemoteController> nVMfRemoteControllerConnect(
        opi_api.storage.v1.NVMfRemoteControllerConnectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNVMfRemoteControllerConnectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> nVMfRemoteControllerDisconnect(
        opi_api.storage.v1.NVMfRemoteControllerDisconnectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNVMfRemoteControllerDisconnectMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NVMfRemoteControllerListResponse> nVMfRemoteControllerList(
        opi_api.storage.v1.NVMfRemoteControllerListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNVMfRemoteControllerListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NVMfRemoteController> nVMfRemoteControllerGet(
        opi_api.storage.v1.NVMfRemoteControllerGetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNVMfRemoteControllerGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NVMfRemoteControllerStatsResponse> nVMfRemoteControllerStats(
        opi_api.storage.v1.NVMfRemoteControllerStatsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNVMfRemoteControllerStatsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_NVMF_REMOTE_CONTROLLER_CONNECT = 0;
  private static final int METHODID_NVMF_REMOTE_CONTROLLER_DISCONNECT = 1;
  private static final int METHODID_NVMF_REMOTE_CONTROLLER_RESET = 2;
  private static final int METHODID_NVMF_REMOTE_CONTROLLER_LIST = 3;
  private static final int METHODID_NVMF_REMOTE_CONTROLLER_GET = 4;
  private static final int METHODID_NVMF_REMOTE_CONTROLLER_STATS = 5;

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
        case METHODID_NVMF_REMOTE_CONTROLLER_CONNECT:
          serviceImpl.nVMfRemoteControllerConnect((opi_api.storage.v1.NVMfRemoteControllerConnectRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMfRemoteController>) responseObserver);
          break;
        case METHODID_NVMF_REMOTE_CONTROLLER_DISCONNECT:
          serviceImpl.nVMfRemoteControllerDisconnect((opi_api.storage.v1.NVMfRemoteControllerDisconnectRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_NVMF_REMOTE_CONTROLLER_RESET:
          serviceImpl.nVMfRemoteControllerReset((opi_api.storage.v1.NVMfRemoteControllerResetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_NVMF_REMOTE_CONTROLLER_LIST:
          serviceImpl.nVMfRemoteControllerList((opi_api.storage.v1.NVMfRemoteControllerListRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMfRemoteControllerListResponse>) responseObserver);
          break;
        case METHODID_NVMF_REMOTE_CONTROLLER_GET:
          serviceImpl.nVMfRemoteControllerGet((opi_api.storage.v1.NVMfRemoteControllerGetRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NVMfRemoteController>) responseObserver);
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
              .addMethod(getNVMfRemoteControllerConnectMethod())
              .addMethod(getNVMfRemoteControllerDisconnectMethod())
              .addMethod(getNVMfRemoteControllerResetMethod())
              .addMethod(getNVMfRemoteControllerListMethod())
              .addMethod(getNVMfRemoteControllerGetMethod())
              .addMethod(getNVMfRemoteControllerStatsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
