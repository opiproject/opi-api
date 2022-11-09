package opi_api.storage.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Back End (network-facing) APIs. This service is for AIO generic kernel block device.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: backend_aio.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AioControllerServiceGrpc {

  private AioControllerServiceGrpc() {}

  public static final String SERVICE_NAME = "opi_api.storage.v1.AioControllerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.AioControllerCreateRequest,
      opi_api.storage.v1.AioController> getAioControllerCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AioControllerCreate",
      requestType = opi_api.storage.v1.AioControllerCreateRequest.class,
      responseType = opi_api.storage.v1.AioController.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.AioControllerCreateRequest,
      opi_api.storage.v1.AioController> getAioControllerCreateMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.AioControllerCreateRequest, opi_api.storage.v1.AioController> getAioControllerCreateMethod;
    if ((getAioControllerCreateMethod = AioControllerServiceGrpc.getAioControllerCreateMethod) == null) {
      synchronized (AioControllerServiceGrpc.class) {
        if ((getAioControllerCreateMethod = AioControllerServiceGrpc.getAioControllerCreateMethod) == null) {
          AioControllerServiceGrpc.getAioControllerCreateMethod = getAioControllerCreateMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.AioControllerCreateRequest, opi_api.storage.v1.AioController>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AioControllerCreate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.AioControllerCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.AioController.getDefaultInstance()))
              .setSchemaDescriptor(new AioControllerServiceMethodDescriptorSupplier("AioControllerCreate"))
              .build();
        }
      }
    }
    return getAioControllerCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.AioControllerDeleteRequest,
      com.google.protobuf.Empty> getAioControllerDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AioControllerDelete",
      requestType = opi_api.storage.v1.AioControllerDeleteRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.AioControllerDeleteRequest,
      com.google.protobuf.Empty> getAioControllerDeleteMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.AioControllerDeleteRequest, com.google.protobuf.Empty> getAioControllerDeleteMethod;
    if ((getAioControllerDeleteMethod = AioControllerServiceGrpc.getAioControllerDeleteMethod) == null) {
      synchronized (AioControllerServiceGrpc.class) {
        if ((getAioControllerDeleteMethod = AioControllerServiceGrpc.getAioControllerDeleteMethod) == null) {
          AioControllerServiceGrpc.getAioControllerDeleteMethod = getAioControllerDeleteMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.AioControllerDeleteRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AioControllerDelete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.AioControllerDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AioControllerServiceMethodDescriptorSupplier("AioControllerDelete"))
              .build();
        }
      }
    }
    return getAioControllerDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.AioControllerGetRequest,
      opi_api.storage.v1.AioController> getAioControllerGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AioControllerGet",
      requestType = opi_api.storage.v1.AioControllerGetRequest.class,
      responseType = opi_api.storage.v1.AioController.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.AioControllerGetRequest,
      opi_api.storage.v1.AioController> getAioControllerGetMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.AioControllerGetRequest, opi_api.storage.v1.AioController> getAioControllerGetMethod;
    if ((getAioControllerGetMethod = AioControllerServiceGrpc.getAioControllerGetMethod) == null) {
      synchronized (AioControllerServiceGrpc.class) {
        if ((getAioControllerGetMethod = AioControllerServiceGrpc.getAioControllerGetMethod) == null) {
          AioControllerServiceGrpc.getAioControllerGetMethod = getAioControllerGetMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.AioControllerGetRequest, opi_api.storage.v1.AioController>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AioControllerGet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.AioControllerGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.AioController.getDefaultInstance()))
              .setSchemaDescriptor(new AioControllerServiceMethodDescriptorSupplier("AioControllerGet"))
              .build();
        }
      }
    }
    return getAioControllerGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.AioControllerGetListRequest,
      opi_api.storage.v1.AioControllerList> getAioControllerGetListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AioControllerGetList",
      requestType = opi_api.storage.v1.AioControllerGetListRequest.class,
      responseType = opi_api.storage.v1.AioControllerList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.AioControllerGetListRequest,
      opi_api.storage.v1.AioControllerList> getAioControllerGetListMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.AioControllerGetListRequest, opi_api.storage.v1.AioControllerList> getAioControllerGetListMethod;
    if ((getAioControllerGetListMethod = AioControllerServiceGrpc.getAioControllerGetListMethod) == null) {
      synchronized (AioControllerServiceGrpc.class) {
        if ((getAioControllerGetListMethod = AioControllerServiceGrpc.getAioControllerGetListMethod) == null) {
          AioControllerServiceGrpc.getAioControllerGetListMethod = getAioControllerGetListMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.AioControllerGetListRequest, opi_api.storage.v1.AioControllerList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AioControllerGetList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.AioControllerGetListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.AioControllerList.getDefaultInstance()))
              .setSchemaDescriptor(new AioControllerServiceMethodDescriptorSupplier("AioControllerGetList"))
              .build();
        }
      }
    }
    return getAioControllerGetListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.AioControllerGetStatsRequest,
      opi_api.storage.v1.AioControllerStats> getAioControllerGetStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AioControllerGetStats",
      requestType = opi_api.storage.v1.AioControllerGetStatsRequest.class,
      responseType = opi_api.storage.v1.AioControllerStats.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.AioControllerGetStatsRequest,
      opi_api.storage.v1.AioControllerStats> getAioControllerGetStatsMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.AioControllerGetStatsRequest, opi_api.storage.v1.AioControllerStats> getAioControllerGetStatsMethod;
    if ((getAioControllerGetStatsMethod = AioControllerServiceGrpc.getAioControllerGetStatsMethod) == null) {
      synchronized (AioControllerServiceGrpc.class) {
        if ((getAioControllerGetStatsMethod = AioControllerServiceGrpc.getAioControllerGetStatsMethod) == null) {
          AioControllerServiceGrpc.getAioControllerGetStatsMethod = getAioControllerGetStatsMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.AioControllerGetStatsRequest, opi_api.storage.v1.AioControllerStats>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AioControllerGetStats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.AioControllerGetStatsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.AioControllerStats.getDefaultInstance()))
              .setSchemaDescriptor(new AioControllerServiceMethodDescriptorSupplier("AioControllerGetStats"))
              .build();
        }
      }
    }
    return getAioControllerGetStatsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.AioControllerUpdateRequest,
      opi_api.storage.v1.AioController> getAioControllerUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AioControllerUpdate",
      requestType = opi_api.storage.v1.AioControllerUpdateRequest.class,
      responseType = opi_api.storage.v1.AioController.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.AioControllerUpdateRequest,
      opi_api.storage.v1.AioController> getAioControllerUpdateMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.AioControllerUpdateRequest, opi_api.storage.v1.AioController> getAioControllerUpdateMethod;
    if ((getAioControllerUpdateMethod = AioControllerServiceGrpc.getAioControllerUpdateMethod) == null) {
      synchronized (AioControllerServiceGrpc.class) {
        if ((getAioControllerUpdateMethod = AioControllerServiceGrpc.getAioControllerUpdateMethod) == null) {
          AioControllerServiceGrpc.getAioControllerUpdateMethod = getAioControllerUpdateMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.AioControllerUpdateRequest, opi_api.storage.v1.AioController>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AioControllerUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.AioControllerUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.AioController.getDefaultInstance()))
              .setSchemaDescriptor(new AioControllerServiceMethodDescriptorSupplier("AioControllerUpdate"))
              .build();
        }
      }
    }
    return getAioControllerUpdateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AioControllerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AioControllerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AioControllerServiceStub>() {
        @java.lang.Override
        public AioControllerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AioControllerServiceStub(channel, callOptions);
        }
      };
    return AioControllerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AioControllerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AioControllerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AioControllerServiceBlockingStub>() {
        @java.lang.Override
        public AioControllerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AioControllerServiceBlockingStub(channel, callOptions);
        }
      };
    return AioControllerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AioControllerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AioControllerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AioControllerServiceFutureStub>() {
        @java.lang.Override
        public AioControllerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AioControllerServiceFutureStub(channel, callOptions);
        }
      };
    return AioControllerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Back End (network-facing) APIs. This service is for AIO generic kernel block device.
   * </pre>
   */
  public static abstract class AioControllerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void aioControllerCreate(opi_api.storage.v1.AioControllerCreateRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.AioController> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAioControllerCreateMethod(), responseObserver);
    }

    /**
     */
    public void aioControllerDelete(opi_api.storage.v1.AioControllerDeleteRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAioControllerDeleteMethod(), responseObserver);
    }

    /**
     */
    public void aioControllerGet(opi_api.storage.v1.AioControllerGetRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.AioController> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAioControllerGetMethod(), responseObserver);
    }

    /**
     */
    public void aioControllerGetList(opi_api.storage.v1.AioControllerGetListRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.AioControllerList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAioControllerGetListMethod(), responseObserver);
    }

    /**
     */
    public void aioControllerGetStats(opi_api.storage.v1.AioControllerGetStatsRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.AioControllerStats> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAioControllerGetStatsMethod(), responseObserver);
    }

    /**
     */
    public void aioControllerUpdate(opi_api.storage.v1.AioControllerUpdateRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.AioController> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAioControllerUpdateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAioControllerCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.AioControllerCreateRequest,
                opi_api.storage.v1.AioController>(
                  this, METHODID_AIO_CONTROLLER_CREATE)))
          .addMethod(
            getAioControllerDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.AioControllerDeleteRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_AIO_CONTROLLER_DELETE)))
          .addMethod(
            getAioControllerGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.AioControllerGetRequest,
                opi_api.storage.v1.AioController>(
                  this, METHODID_AIO_CONTROLLER_GET)))
          .addMethod(
            getAioControllerGetListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.AioControllerGetListRequest,
                opi_api.storage.v1.AioControllerList>(
                  this, METHODID_AIO_CONTROLLER_GET_LIST)))
          .addMethod(
            getAioControllerGetStatsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.AioControllerGetStatsRequest,
                opi_api.storage.v1.AioControllerStats>(
                  this, METHODID_AIO_CONTROLLER_GET_STATS)))
          .addMethod(
            getAioControllerUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.AioControllerUpdateRequest,
                opi_api.storage.v1.AioController>(
                  this, METHODID_AIO_CONTROLLER_UPDATE)))
          .build();
    }
  }

  /**
   * <pre>
   * Back End (network-facing) APIs. This service is for AIO generic kernel block device.
   * </pre>
   */
  public static final class AioControllerServiceStub extends io.grpc.stub.AbstractAsyncStub<AioControllerServiceStub> {
    private AioControllerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AioControllerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AioControllerServiceStub(channel, callOptions);
    }

    /**
     */
    public void aioControllerCreate(opi_api.storage.v1.AioControllerCreateRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.AioController> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAioControllerCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void aioControllerDelete(opi_api.storage.v1.AioControllerDeleteRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAioControllerDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void aioControllerGet(opi_api.storage.v1.AioControllerGetRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.AioController> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAioControllerGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void aioControllerGetList(opi_api.storage.v1.AioControllerGetListRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.AioControllerList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAioControllerGetListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void aioControllerGetStats(opi_api.storage.v1.AioControllerGetStatsRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.AioControllerStats> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAioControllerGetStatsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void aioControllerUpdate(opi_api.storage.v1.AioControllerUpdateRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.AioController> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAioControllerUpdateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Back End (network-facing) APIs. This service is for AIO generic kernel block device.
   * </pre>
   */
  public static final class AioControllerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AioControllerServiceBlockingStub> {
    private AioControllerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AioControllerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AioControllerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public opi_api.storage.v1.AioController aioControllerCreate(opi_api.storage.v1.AioControllerCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAioControllerCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty aioControllerDelete(opi_api.storage.v1.AioControllerDeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAioControllerDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.AioController aioControllerGet(opi_api.storage.v1.AioControllerGetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAioControllerGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.AioControllerList aioControllerGetList(opi_api.storage.v1.AioControllerGetListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAioControllerGetListMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.AioControllerStats aioControllerGetStats(opi_api.storage.v1.AioControllerGetStatsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAioControllerGetStatsMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.AioController aioControllerUpdate(opi_api.storage.v1.AioControllerUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAioControllerUpdateMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Back End (network-facing) APIs. This service is for AIO generic kernel block device.
   * </pre>
   */
  public static final class AioControllerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AioControllerServiceFutureStub> {
    private AioControllerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AioControllerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AioControllerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.AioController> aioControllerCreate(
        opi_api.storage.v1.AioControllerCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAioControllerCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> aioControllerDelete(
        opi_api.storage.v1.AioControllerDeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAioControllerDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.AioController> aioControllerGet(
        opi_api.storage.v1.AioControllerGetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAioControllerGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.AioControllerList> aioControllerGetList(
        opi_api.storage.v1.AioControllerGetListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAioControllerGetListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.AioControllerStats> aioControllerGetStats(
        opi_api.storage.v1.AioControllerGetStatsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAioControllerGetStatsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.AioController> aioControllerUpdate(
        opi_api.storage.v1.AioControllerUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAioControllerUpdateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AIO_CONTROLLER_CREATE = 0;
  private static final int METHODID_AIO_CONTROLLER_DELETE = 1;
  private static final int METHODID_AIO_CONTROLLER_GET = 2;
  private static final int METHODID_AIO_CONTROLLER_GET_LIST = 3;
  private static final int METHODID_AIO_CONTROLLER_GET_STATS = 4;
  private static final int METHODID_AIO_CONTROLLER_UPDATE = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AioControllerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AioControllerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AIO_CONTROLLER_CREATE:
          serviceImpl.aioControllerCreate((opi_api.storage.v1.AioControllerCreateRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.AioController>) responseObserver);
          break;
        case METHODID_AIO_CONTROLLER_DELETE:
          serviceImpl.aioControllerDelete((opi_api.storage.v1.AioControllerDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_AIO_CONTROLLER_GET:
          serviceImpl.aioControllerGet((opi_api.storage.v1.AioControllerGetRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.AioController>) responseObserver);
          break;
        case METHODID_AIO_CONTROLLER_GET_LIST:
          serviceImpl.aioControllerGetList((opi_api.storage.v1.AioControllerGetListRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.AioControllerList>) responseObserver);
          break;
        case METHODID_AIO_CONTROLLER_GET_STATS:
          serviceImpl.aioControllerGetStats((opi_api.storage.v1.AioControllerGetStatsRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.AioControllerStats>) responseObserver);
          break;
        case METHODID_AIO_CONTROLLER_UPDATE:
          serviceImpl.aioControllerUpdate((opi_api.storage.v1.AioControllerUpdateRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.AioController>) responseObserver);
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

  private static abstract class AioControllerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AioControllerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return opi_api.storage.v1.BackendAioProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AioControllerService");
    }
  }

  private static final class AioControllerServiceFileDescriptorSupplier
      extends AioControllerServiceBaseDescriptorSupplier {
    AioControllerServiceFileDescriptorSupplier() {}
  }

  private static final class AioControllerServiceMethodDescriptorSupplier
      extends AioControllerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AioControllerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AioControllerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AioControllerServiceFileDescriptorSupplier())
              .addMethod(getAioControllerCreateMethod())
              .addMethod(getAioControllerDeleteMethod())
              .addMethod(getAioControllerGetMethod())
              .addMethod(getAioControllerGetListMethod())
              .addMethod(getAioControllerGetStatsMethod())
              .addMethod(getAioControllerUpdateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
