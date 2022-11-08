package opi_api.storage.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: backend_null.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class NullDebugServiceGrpc {

  private NullDebugServiceGrpc() {}

  public static final String SERVICE_NAME = "opi_api.storage.v1.NullDebugService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.NullDebugCreateRequest,
      opi_api.storage.v1.NullDebugCreateResponse> getNullDebugCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NullDebugCreate",
      requestType = opi_api.storage.v1.NullDebugCreateRequest.class,
      responseType = opi_api.storage.v1.NullDebugCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.NullDebugCreateRequest,
      opi_api.storage.v1.NullDebugCreateResponse> getNullDebugCreateMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.NullDebugCreateRequest, opi_api.storage.v1.NullDebugCreateResponse> getNullDebugCreateMethod;
    if ((getNullDebugCreateMethod = NullDebugServiceGrpc.getNullDebugCreateMethod) == null) {
      synchronized (NullDebugServiceGrpc.class) {
        if ((getNullDebugCreateMethod = NullDebugServiceGrpc.getNullDebugCreateMethod) == null) {
          NullDebugServiceGrpc.getNullDebugCreateMethod = getNullDebugCreateMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.NullDebugCreateRequest, opi_api.storage.v1.NullDebugCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NullDebugCreate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NullDebugCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NullDebugCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NullDebugServiceMethodDescriptorSupplier("NullDebugCreate"))
              .build();
        }
      }
    }
    return getNullDebugCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.NullDebugDeleteRequest,
      opi_api.storage.v1.NullDebugDeleteResponse> getNullDebugDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NullDebugDelete",
      requestType = opi_api.storage.v1.NullDebugDeleteRequest.class,
      responseType = opi_api.storage.v1.NullDebugDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.NullDebugDeleteRequest,
      opi_api.storage.v1.NullDebugDeleteResponse> getNullDebugDeleteMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.NullDebugDeleteRequest, opi_api.storage.v1.NullDebugDeleteResponse> getNullDebugDeleteMethod;
    if ((getNullDebugDeleteMethod = NullDebugServiceGrpc.getNullDebugDeleteMethod) == null) {
      synchronized (NullDebugServiceGrpc.class) {
        if ((getNullDebugDeleteMethod = NullDebugServiceGrpc.getNullDebugDeleteMethod) == null) {
          NullDebugServiceGrpc.getNullDebugDeleteMethod = getNullDebugDeleteMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.NullDebugDeleteRequest, opi_api.storage.v1.NullDebugDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NullDebugDelete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NullDebugDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NullDebugDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NullDebugServiceMethodDescriptorSupplier("NullDebugDelete"))
              .build();
        }
      }
    }
    return getNullDebugDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.NullDebugUpdateRequest,
      opi_api.storage.v1.NullDebugUpdateResponse> getNullDebugUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NullDebugUpdate",
      requestType = opi_api.storage.v1.NullDebugUpdateRequest.class,
      responseType = opi_api.storage.v1.NullDebugUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.NullDebugUpdateRequest,
      opi_api.storage.v1.NullDebugUpdateResponse> getNullDebugUpdateMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.NullDebugUpdateRequest, opi_api.storage.v1.NullDebugUpdateResponse> getNullDebugUpdateMethod;
    if ((getNullDebugUpdateMethod = NullDebugServiceGrpc.getNullDebugUpdateMethod) == null) {
      synchronized (NullDebugServiceGrpc.class) {
        if ((getNullDebugUpdateMethod = NullDebugServiceGrpc.getNullDebugUpdateMethod) == null) {
          NullDebugServiceGrpc.getNullDebugUpdateMethod = getNullDebugUpdateMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.NullDebugUpdateRequest, opi_api.storage.v1.NullDebugUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NullDebugUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NullDebugUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NullDebugUpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NullDebugServiceMethodDescriptorSupplier("NullDebugUpdate"))
              .build();
        }
      }
    }
    return getNullDebugUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.NullDebugListRequest,
      opi_api.storage.v1.NullDebugListResponse> getNullDebugListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NullDebugList",
      requestType = opi_api.storage.v1.NullDebugListRequest.class,
      responseType = opi_api.storage.v1.NullDebugListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.NullDebugListRequest,
      opi_api.storage.v1.NullDebugListResponse> getNullDebugListMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.NullDebugListRequest, opi_api.storage.v1.NullDebugListResponse> getNullDebugListMethod;
    if ((getNullDebugListMethod = NullDebugServiceGrpc.getNullDebugListMethod) == null) {
      synchronized (NullDebugServiceGrpc.class) {
        if ((getNullDebugListMethod = NullDebugServiceGrpc.getNullDebugListMethod) == null) {
          NullDebugServiceGrpc.getNullDebugListMethod = getNullDebugListMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.NullDebugListRequest, opi_api.storage.v1.NullDebugListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NullDebugList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NullDebugListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NullDebugListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NullDebugServiceMethodDescriptorSupplier("NullDebugList"))
              .build();
        }
      }
    }
    return getNullDebugListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.NullDebugGetRequest,
      opi_api.storage.v1.NullDebugGetResponse> getNullDebugGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NullDebugGet",
      requestType = opi_api.storage.v1.NullDebugGetRequest.class,
      responseType = opi_api.storage.v1.NullDebugGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.NullDebugGetRequest,
      opi_api.storage.v1.NullDebugGetResponse> getNullDebugGetMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.NullDebugGetRequest, opi_api.storage.v1.NullDebugGetResponse> getNullDebugGetMethod;
    if ((getNullDebugGetMethod = NullDebugServiceGrpc.getNullDebugGetMethod) == null) {
      synchronized (NullDebugServiceGrpc.class) {
        if ((getNullDebugGetMethod = NullDebugServiceGrpc.getNullDebugGetMethod) == null) {
          NullDebugServiceGrpc.getNullDebugGetMethod = getNullDebugGetMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.NullDebugGetRequest, opi_api.storage.v1.NullDebugGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NullDebugGet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NullDebugGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NullDebugGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NullDebugServiceMethodDescriptorSupplier("NullDebugGet"))
              .build();
        }
      }
    }
    return getNullDebugGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.NullDebugStatsRequest,
      opi_api.storage.v1.NullDebugStatsResponse> getNullDebugStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NullDebugStats",
      requestType = opi_api.storage.v1.NullDebugStatsRequest.class,
      responseType = opi_api.storage.v1.NullDebugStatsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.NullDebugStatsRequest,
      opi_api.storage.v1.NullDebugStatsResponse> getNullDebugStatsMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.NullDebugStatsRequest, opi_api.storage.v1.NullDebugStatsResponse> getNullDebugStatsMethod;
    if ((getNullDebugStatsMethod = NullDebugServiceGrpc.getNullDebugStatsMethod) == null) {
      synchronized (NullDebugServiceGrpc.class) {
        if ((getNullDebugStatsMethod = NullDebugServiceGrpc.getNullDebugStatsMethod) == null) {
          NullDebugServiceGrpc.getNullDebugStatsMethod = getNullDebugStatsMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.NullDebugStatsRequest, opi_api.storage.v1.NullDebugStatsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NullDebugStats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NullDebugStatsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NullDebugStatsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NullDebugServiceMethodDescriptorSupplier("NullDebugStats"))
              .build();
        }
      }
    }
    return getNullDebugStatsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NullDebugServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NullDebugServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NullDebugServiceStub>() {
        @java.lang.Override
        public NullDebugServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NullDebugServiceStub(channel, callOptions);
        }
      };
    return NullDebugServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NullDebugServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NullDebugServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NullDebugServiceBlockingStub>() {
        @java.lang.Override
        public NullDebugServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NullDebugServiceBlockingStub(channel, callOptions);
        }
      };
    return NullDebugServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NullDebugServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NullDebugServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NullDebugServiceFutureStub>() {
        @java.lang.Override
        public NullDebugServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NullDebugServiceFutureStub(channel, callOptions);
        }
      };
    return NullDebugServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class NullDebugServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void nullDebugCreate(opi_api.storage.v1.NullDebugCreateRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NullDebugCreateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNullDebugCreateMethod(), responseObserver);
    }

    /**
     */
    public void nullDebugDelete(opi_api.storage.v1.NullDebugDeleteRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NullDebugDeleteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNullDebugDeleteMethod(), responseObserver);
    }

    /**
     */
    public void nullDebugUpdate(opi_api.storage.v1.NullDebugUpdateRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NullDebugUpdateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNullDebugUpdateMethod(), responseObserver);
    }

    /**
     */
    public void nullDebugList(opi_api.storage.v1.NullDebugListRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NullDebugListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNullDebugListMethod(), responseObserver);
    }

    /**
     */
    public void nullDebugGet(opi_api.storage.v1.NullDebugGetRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NullDebugGetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNullDebugGetMethod(), responseObserver);
    }

    /**
     */
    public void nullDebugStats(opi_api.storage.v1.NullDebugStatsRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NullDebugStatsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNullDebugStatsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getNullDebugCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.NullDebugCreateRequest,
                opi_api.storage.v1.NullDebugCreateResponse>(
                  this, METHODID_NULL_DEBUG_CREATE)))
          .addMethod(
            getNullDebugDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.NullDebugDeleteRequest,
                opi_api.storage.v1.NullDebugDeleteResponse>(
                  this, METHODID_NULL_DEBUG_DELETE)))
          .addMethod(
            getNullDebugUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.NullDebugUpdateRequest,
                opi_api.storage.v1.NullDebugUpdateResponse>(
                  this, METHODID_NULL_DEBUG_UPDATE)))
          .addMethod(
            getNullDebugListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.NullDebugListRequest,
                opi_api.storage.v1.NullDebugListResponse>(
                  this, METHODID_NULL_DEBUG_LIST)))
          .addMethod(
            getNullDebugGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.NullDebugGetRequest,
                opi_api.storage.v1.NullDebugGetResponse>(
                  this, METHODID_NULL_DEBUG_GET)))
          .addMethod(
            getNullDebugStatsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.NullDebugStatsRequest,
                opi_api.storage.v1.NullDebugStatsResponse>(
                  this, METHODID_NULL_DEBUG_STATS)))
          .build();
    }
  }

  /**
   */
  public static final class NullDebugServiceStub extends io.grpc.stub.AbstractAsyncStub<NullDebugServiceStub> {
    private NullDebugServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NullDebugServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NullDebugServiceStub(channel, callOptions);
    }

    /**
     */
    public void nullDebugCreate(opi_api.storage.v1.NullDebugCreateRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NullDebugCreateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNullDebugCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void nullDebugDelete(opi_api.storage.v1.NullDebugDeleteRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NullDebugDeleteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNullDebugDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void nullDebugUpdate(opi_api.storage.v1.NullDebugUpdateRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NullDebugUpdateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNullDebugUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void nullDebugList(opi_api.storage.v1.NullDebugListRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NullDebugListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNullDebugListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void nullDebugGet(opi_api.storage.v1.NullDebugGetRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NullDebugGetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNullDebugGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void nullDebugStats(opi_api.storage.v1.NullDebugStatsRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NullDebugStatsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNullDebugStatsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class NullDebugServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<NullDebugServiceBlockingStub> {
    private NullDebugServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NullDebugServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NullDebugServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public opi_api.storage.v1.NullDebugCreateResponse nullDebugCreate(opi_api.storage.v1.NullDebugCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNullDebugCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.NullDebugDeleteResponse nullDebugDelete(opi_api.storage.v1.NullDebugDeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNullDebugDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.NullDebugUpdateResponse nullDebugUpdate(opi_api.storage.v1.NullDebugUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNullDebugUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.NullDebugListResponse nullDebugList(opi_api.storage.v1.NullDebugListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNullDebugListMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.NullDebugGetResponse nullDebugGet(opi_api.storage.v1.NullDebugGetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNullDebugGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.NullDebugStatsResponse nullDebugStats(opi_api.storage.v1.NullDebugStatsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNullDebugStatsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NullDebugServiceFutureStub extends io.grpc.stub.AbstractFutureStub<NullDebugServiceFutureStub> {
    private NullDebugServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NullDebugServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NullDebugServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NullDebugCreateResponse> nullDebugCreate(
        opi_api.storage.v1.NullDebugCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNullDebugCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NullDebugDeleteResponse> nullDebugDelete(
        opi_api.storage.v1.NullDebugDeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNullDebugDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NullDebugUpdateResponse> nullDebugUpdate(
        opi_api.storage.v1.NullDebugUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNullDebugUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NullDebugListResponse> nullDebugList(
        opi_api.storage.v1.NullDebugListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNullDebugListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NullDebugGetResponse> nullDebugGet(
        opi_api.storage.v1.NullDebugGetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNullDebugGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NullDebugStatsResponse> nullDebugStats(
        opi_api.storage.v1.NullDebugStatsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNullDebugStatsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_NULL_DEBUG_CREATE = 0;
  private static final int METHODID_NULL_DEBUG_DELETE = 1;
  private static final int METHODID_NULL_DEBUG_UPDATE = 2;
  private static final int METHODID_NULL_DEBUG_LIST = 3;
  private static final int METHODID_NULL_DEBUG_GET = 4;
  private static final int METHODID_NULL_DEBUG_STATS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NullDebugServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NullDebugServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_NULL_DEBUG_CREATE:
          serviceImpl.nullDebugCreate((opi_api.storage.v1.NullDebugCreateRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NullDebugCreateResponse>) responseObserver);
          break;
        case METHODID_NULL_DEBUG_DELETE:
          serviceImpl.nullDebugDelete((opi_api.storage.v1.NullDebugDeleteRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NullDebugDeleteResponse>) responseObserver);
          break;
        case METHODID_NULL_DEBUG_UPDATE:
          serviceImpl.nullDebugUpdate((opi_api.storage.v1.NullDebugUpdateRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NullDebugUpdateResponse>) responseObserver);
          break;
        case METHODID_NULL_DEBUG_LIST:
          serviceImpl.nullDebugList((opi_api.storage.v1.NullDebugListRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NullDebugListResponse>) responseObserver);
          break;
        case METHODID_NULL_DEBUG_GET:
          serviceImpl.nullDebugGet((opi_api.storage.v1.NullDebugGetRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NullDebugGetResponse>) responseObserver);
          break;
        case METHODID_NULL_DEBUG_STATS:
          serviceImpl.nullDebugStats((opi_api.storage.v1.NullDebugStatsRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NullDebugStatsResponse>) responseObserver);
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

  private static abstract class NullDebugServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NullDebugServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return opi_api.storage.v1.BackendNullProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NullDebugService");
    }
  }

  private static final class NullDebugServiceFileDescriptorSupplier
      extends NullDebugServiceBaseDescriptorSupplier {
    NullDebugServiceFileDescriptorSupplier() {}
  }

  private static final class NullDebugServiceMethodDescriptorSupplier
      extends NullDebugServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NullDebugServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (NullDebugServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NullDebugServiceFileDescriptorSupplier())
              .addMethod(getNullDebugCreateMethod())
              .addMethod(getNullDebugDeleteMethod())
              .addMethod(getNullDebugUpdateMethod())
              .addMethod(getNullDebugListMethod())
              .addMethod(getNullDebugGetMethod())
              .addMethod(getNullDebugStatsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
