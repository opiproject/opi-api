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
  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.CreateAioControllerRequest,
      opi_api.storage.v1.AioController> getCreateAioControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAioController",
      requestType = opi_api.storage.v1.CreateAioControllerRequest.class,
      responseType = opi_api.storage.v1.AioController.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.CreateAioControllerRequest,
      opi_api.storage.v1.AioController> getCreateAioControllerMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.CreateAioControllerRequest, opi_api.storage.v1.AioController> getCreateAioControllerMethod;
    if ((getCreateAioControllerMethod = AioControllerServiceGrpc.getCreateAioControllerMethod) == null) {
      synchronized (AioControllerServiceGrpc.class) {
        if ((getCreateAioControllerMethod = AioControllerServiceGrpc.getCreateAioControllerMethod) == null) {
          AioControllerServiceGrpc.getCreateAioControllerMethod = getCreateAioControllerMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.CreateAioControllerRequest, opi_api.storage.v1.AioController>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAioController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.CreateAioControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.AioController.getDefaultInstance()))
              .setSchemaDescriptor(new AioControllerServiceMethodDescriptorSupplier("CreateAioController"))
              .build();
        }
      }
    }
    return getCreateAioControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteAioControllerRequest,
      com.google.protobuf.Empty> getDeleteAioControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAioController",
      requestType = opi_api.storage.v1.DeleteAioControllerRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteAioControllerRequest,
      com.google.protobuf.Empty> getDeleteAioControllerMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteAioControllerRequest, com.google.protobuf.Empty> getDeleteAioControllerMethod;
    if ((getDeleteAioControllerMethod = AioControllerServiceGrpc.getDeleteAioControllerMethod) == null) {
      synchronized (AioControllerServiceGrpc.class) {
        if ((getDeleteAioControllerMethod = AioControllerServiceGrpc.getDeleteAioControllerMethod) == null) {
          AioControllerServiceGrpc.getDeleteAioControllerMethod = getDeleteAioControllerMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.DeleteAioControllerRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAioController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.DeleteAioControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AioControllerServiceMethodDescriptorSupplier("DeleteAioController"))
              .build();
        }
      }
    }
    return getDeleteAioControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateAioControllerRequest,
      opi_api.storage.v1.AioController> getUpdateAioControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAioController",
      requestType = opi_api.storage.v1.UpdateAioControllerRequest.class,
      responseType = opi_api.storage.v1.AioController.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateAioControllerRequest,
      opi_api.storage.v1.AioController> getUpdateAioControllerMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateAioControllerRequest, opi_api.storage.v1.AioController> getUpdateAioControllerMethod;
    if ((getUpdateAioControllerMethod = AioControllerServiceGrpc.getUpdateAioControllerMethod) == null) {
      synchronized (AioControllerServiceGrpc.class) {
        if ((getUpdateAioControllerMethod = AioControllerServiceGrpc.getUpdateAioControllerMethod) == null) {
          AioControllerServiceGrpc.getUpdateAioControllerMethod = getUpdateAioControllerMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.UpdateAioControllerRequest, opi_api.storage.v1.AioController>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAioController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.UpdateAioControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.AioController.getDefaultInstance()))
              .setSchemaDescriptor(new AioControllerServiceMethodDescriptorSupplier("UpdateAioController"))
              .build();
        }
      }
    }
    return getUpdateAioControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.ListAioControllersRequest,
      opi_api.storage.v1.ListAioControllersResponse> getListAioControllersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAioControllers",
      requestType = opi_api.storage.v1.ListAioControllersRequest.class,
      responseType = opi_api.storage.v1.ListAioControllersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.ListAioControllersRequest,
      opi_api.storage.v1.ListAioControllersResponse> getListAioControllersMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.ListAioControllersRequest, opi_api.storage.v1.ListAioControllersResponse> getListAioControllersMethod;
    if ((getListAioControllersMethod = AioControllerServiceGrpc.getListAioControllersMethod) == null) {
      synchronized (AioControllerServiceGrpc.class) {
        if ((getListAioControllersMethod = AioControllerServiceGrpc.getListAioControllersMethod) == null) {
          AioControllerServiceGrpc.getListAioControllersMethod = getListAioControllersMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.ListAioControllersRequest, opi_api.storage.v1.ListAioControllersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAioControllers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListAioControllersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListAioControllersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AioControllerServiceMethodDescriptorSupplier("ListAioControllers"))
              .build();
        }
      }
    }
    return getListAioControllersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.GetAioControllerRequest,
      opi_api.storage.v1.AioController> getGetAioControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAioController",
      requestType = opi_api.storage.v1.GetAioControllerRequest.class,
      responseType = opi_api.storage.v1.AioController.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.GetAioControllerRequest,
      opi_api.storage.v1.AioController> getGetAioControllerMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.GetAioControllerRequest, opi_api.storage.v1.AioController> getGetAioControllerMethod;
    if ((getGetAioControllerMethod = AioControllerServiceGrpc.getGetAioControllerMethod) == null) {
      synchronized (AioControllerServiceGrpc.class) {
        if ((getGetAioControllerMethod = AioControllerServiceGrpc.getGetAioControllerMethod) == null) {
          AioControllerServiceGrpc.getGetAioControllerMethod = getGetAioControllerMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.GetAioControllerRequest, opi_api.storage.v1.AioController>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAioController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.GetAioControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.AioController.getDefaultInstance()))
              .setSchemaDescriptor(new AioControllerServiceMethodDescriptorSupplier("GetAioController"))
              .build();
        }
      }
    }
    return getGetAioControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.AioControllerStatsRequest,
      opi_api.storage.v1.AioControllerStatsResponse> getAioControllerStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AioControllerStats",
      requestType = opi_api.storage.v1.AioControllerStatsRequest.class,
      responseType = opi_api.storage.v1.AioControllerStatsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.AioControllerStatsRequest,
      opi_api.storage.v1.AioControllerStatsResponse> getAioControllerStatsMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.AioControllerStatsRequest, opi_api.storage.v1.AioControllerStatsResponse> getAioControllerStatsMethod;
    if ((getAioControllerStatsMethod = AioControllerServiceGrpc.getAioControllerStatsMethod) == null) {
      synchronized (AioControllerServiceGrpc.class) {
        if ((getAioControllerStatsMethod = AioControllerServiceGrpc.getAioControllerStatsMethod) == null) {
          AioControllerServiceGrpc.getAioControllerStatsMethod = getAioControllerStatsMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.AioControllerStatsRequest, opi_api.storage.v1.AioControllerStatsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AioControllerStats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.AioControllerStatsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.AioControllerStatsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AioControllerServiceMethodDescriptorSupplier("AioControllerStats"))
              .build();
        }
      }
    }
    return getAioControllerStatsMethod;
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
    public void createAioController(opi_api.storage.v1.CreateAioControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.AioController> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAioControllerMethod(), responseObserver);
    }

    /**
     */
    public void deleteAioController(opi_api.storage.v1.DeleteAioControllerRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAioControllerMethod(), responseObserver);
    }

    /**
     */
    public void updateAioController(opi_api.storage.v1.UpdateAioControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.AioController> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAioControllerMethod(), responseObserver);
    }

    /**
     */
    public void listAioControllers(opi_api.storage.v1.ListAioControllersRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListAioControllersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAioControllersMethod(), responseObserver);
    }

    /**
     */
    public void getAioController(opi_api.storage.v1.GetAioControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.AioController> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAioControllerMethod(), responseObserver);
    }

    /**
     */
    public void aioControllerStats(opi_api.storage.v1.AioControllerStatsRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.AioControllerStatsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAioControllerStatsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateAioControllerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.CreateAioControllerRequest,
                opi_api.storage.v1.AioController>(
                  this, METHODID_CREATE_AIO_CONTROLLER)))
          .addMethod(
            getDeleteAioControllerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.DeleteAioControllerRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_AIO_CONTROLLER)))
          .addMethod(
            getUpdateAioControllerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.UpdateAioControllerRequest,
                opi_api.storage.v1.AioController>(
                  this, METHODID_UPDATE_AIO_CONTROLLER)))
          .addMethod(
            getListAioControllersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.ListAioControllersRequest,
                opi_api.storage.v1.ListAioControllersResponse>(
                  this, METHODID_LIST_AIO_CONTROLLERS)))
          .addMethod(
            getGetAioControllerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.GetAioControllerRequest,
                opi_api.storage.v1.AioController>(
                  this, METHODID_GET_AIO_CONTROLLER)))
          .addMethod(
            getAioControllerStatsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.AioControllerStatsRequest,
                opi_api.storage.v1.AioControllerStatsResponse>(
                  this, METHODID_AIO_CONTROLLER_STATS)))
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
    public void createAioController(opi_api.storage.v1.CreateAioControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.AioController> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAioControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAioController(opi_api.storage.v1.DeleteAioControllerRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAioControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAioController(opi_api.storage.v1.UpdateAioControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.AioController> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAioControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAioControllers(opi_api.storage.v1.ListAioControllersRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListAioControllersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAioControllersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAioController(opi_api.storage.v1.GetAioControllerRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.AioController> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAioControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void aioControllerStats(opi_api.storage.v1.AioControllerStatsRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.AioControllerStatsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAioControllerStatsMethod(), getCallOptions()), request, responseObserver);
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
    public opi_api.storage.v1.AioController createAioController(opi_api.storage.v1.CreateAioControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAioControllerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteAioController(opi_api.storage.v1.DeleteAioControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAioControllerMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.AioController updateAioController(opi_api.storage.v1.UpdateAioControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAioControllerMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.ListAioControllersResponse listAioControllers(opi_api.storage.v1.ListAioControllersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAioControllersMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.AioController getAioController(opi_api.storage.v1.GetAioControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAioControllerMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.AioControllerStatsResponse aioControllerStats(opi_api.storage.v1.AioControllerStatsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAioControllerStatsMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.AioController> createAioController(
        opi_api.storage.v1.CreateAioControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAioControllerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteAioController(
        opi_api.storage.v1.DeleteAioControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAioControllerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.AioController> updateAioController(
        opi_api.storage.v1.UpdateAioControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAioControllerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.ListAioControllersResponse> listAioControllers(
        opi_api.storage.v1.ListAioControllersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAioControllersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.AioController> getAioController(
        opi_api.storage.v1.GetAioControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAioControllerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.AioControllerStatsResponse> aioControllerStats(
        opi_api.storage.v1.AioControllerStatsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAioControllerStatsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_AIO_CONTROLLER = 0;
  private static final int METHODID_DELETE_AIO_CONTROLLER = 1;
  private static final int METHODID_UPDATE_AIO_CONTROLLER = 2;
  private static final int METHODID_LIST_AIO_CONTROLLERS = 3;
  private static final int METHODID_GET_AIO_CONTROLLER = 4;
  private static final int METHODID_AIO_CONTROLLER_STATS = 5;

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
        case METHODID_CREATE_AIO_CONTROLLER:
          serviceImpl.createAioController((opi_api.storage.v1.CreateAioControllerRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.AioController>) responseObserver);
          break;
        case METHODID_DELETE_AIO_CONTROLLER:
          serviceImpl.deleteAioController((opi_api.storage.v1.DeleteAioControllerRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_AIO_CONTROLLER:
          serviceImpl.updateAioController((opi_api.storage.v1.UpdateAioControllerRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.AioController>) responseObserver);
          break;
        case METHODID_LIST_AIO_CONTROLLERS:
          serviceImpl.listAioControllers((opi_api.storage.v1.ListAioControllersRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.ListAioControllersResponse>) responseObserver);
          break;
        case METHODID_GET_AIO_CONTROLLER:
          serviceImpl.getAioController((opi_api.storage.v1.GetAioControllerRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.AioController>) responseObserver);
          break;
        case METHODID_AIO_CONTROLLER_STATS:
          serviceImpl.aioControllerStats((opi_api.storage.v1.AioControllerStatsRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.AioControllerStatsResponse>) responseObserver);
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
              .addMethod(getCreateAioControllerMethod())
              .addMethod(getDeleteAioControllerMethod())
              .addMethod(getUpdateAioControllerMethod())
              .addMethod(getListAioControllersMethod())
              .addMethod(getGetAioControllerMethod())
              .addMethod(getAioControllerStatsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
