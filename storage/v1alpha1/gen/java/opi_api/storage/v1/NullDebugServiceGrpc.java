package opi_api.storage.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Back End (network-facing) APIs. This is debug interface for null block devices.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: backend_null.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class NullDebugServiceGrpc {

  private NullDebugServiceGrpc() {}

  public static final String SERVICE_NAME = "opi_api.storage.v1.NullDebugService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.CreateNullDebugRequest,
      opi_api.storage.v1.NullDebug> getCreateNullDebugMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateNullDebug",
      requestType = opi_api.storage.v1.CreateNullDebugRequest.class,
      responseType = opi_api.storage.v1.NullDebug.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.CreateNullDebugRequest,
      opi_api.storage.v1.NullDebug> getCreateNullDebugMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.CreateNullDebugRequest, opi_api.storage.v1.NullDebug> getCreateNullDebugMethod;
    if ((getCreateNullDebugMethod = NullDebugServiceGrpc.getCreateNullDebugMethod) == null) {
      synchronized (NullDebugServiceGrpc.class) {
        if ((getCreateNullDebugMethod = NullDebugServiceGrpc.getCreateNullDebugMethod) == null) {
          NullDebugServiceGrpc.getCreateNullDebugMethod = getCreateNullDebugMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.CreateNullDebugRequest, opi_api.storage.v1.NullDebug>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateNullDebug"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.CreateNullDebugRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NullDebug.getDefaultInstance()))
              .setSchemaDescriptor(new NullDebugServiceMethodDescriptorSupplier("CreateNullDebug"))
              .build();
        }
      }
    }
    return getCreateNullDebugMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteNullDebugRequest,
      com.google.protobuf.Empty> getDeleteNullDebugMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteNullDebug",
      requestType = opi_api.storage.v1.DeleteNullDebugRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteNullDebugRequest,
      com.google.protobuf.Empty> getDeleteNullDebugMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteNullDebugRequest, com.google.protobuf.Empty> getDeleteNullDebugMethod;
    if ((getDeleteNullDebugMethod = NullDebugServiceGrpc.getDeleteNullDebugMethod) == null) {
      synchronized (NullDebugServiceGrpc.class) {
        if ((getDeleteNullDebugMethod = NullDebugServiceGrpc.getDeleteNullDebugMethod) == null) {
          NullDebugServiceGrpc.getDeleteNullDebugMethod = getDeleteNullDebugMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.DeleteNullDebugRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteNullDebug"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.DeleteNullDebugRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NullDebugServiceMethodDescriptorSupplier("DeleteNullDebug"))
              .build();
        }
      }
    }
    return getDeleteNullDebugMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateNullDebugRequest,
      opi_api.storage.v1.NullDebug> getUpdateNullDebugMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateNullDebug",
      requestType = opi_api.storage.v1.UpdateNullDebugRequest.class,
      responseType = opi_api.storage.v1.NullDebug.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateNullDebugRequest,
      opi_api.storage.v1.NullDebug> getUpdateNullDebugMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateNullDebugRequest, opi_api.storage.v1.NullDebug> getUpdateNullDebugMethod;
    if ((getUpdateNullDebugMethod = NullDebugServiceGrpc.getUpdateNullDebugMethod) == null) {
      synchronized (NullDebugServiceGrpc.class) {
        if ((getUpdateNullDebugMethod = NullDebugServiceGrpc.getUpdateNullDebugMethod) == null) {
          NullDebugServiceGrpc.getUpdateNullDebugMethod = getUpdateNullDebugMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.UpdateNullDebugRequest, opi_api.storage.v1.NullDebug>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateNullDebug"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.UpdateNullDebugRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NullDebug.getDefaultInstance()))
              .setSchemaDescriptor(new NullDebugServiceMethodDescriptorSupplier("UpdateNullDebug"))
              .build();
        }
      }
    }
    return getUpdateNullDebugMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.ListNullDebugsRequest,
      opi_api.storage.v1.ListNullDebugsResponse> getListNullDebugsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNullDebugs",
      requestType = opi_api.storage.v1.ListNullDebugsRequest.class,
      responseType = opi_api.storage.v1.ListNullDebugsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.ListNullDebugsRequest,
      opi_api.storage.v1.ListNullDebugsResponse> getListNullDebugsMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.ListNullDebugsRequest, opi_api.storage.v1.ListNullDebugsResponse> getListNullDebugsMethod;
    if ((getListNullDebugsMethod = NullDebugServiceGrpc.getListNullDebugsMethod) == null) {
      synchronized (NullDebugServiceGrpc.class) {
        if ((getListNullDebugsMethod = NullDebugServiceGrpc.getListNullDebugsMethod) == null) {
          NullDebugServiceGrpc.getListNullDebugsMethod = getListNullDebugsMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.ListNullDebugsRequest, opi_api.storage.v1.ListNullDebugsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNullDebugs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListNullDebugsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListNullDebugsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NullDebugServiceMethodDescriptorSupplier("ListNullDebugs"))
              .build();
        }
      }
    }
    return getListNullDebugsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.GetNullDebugRequest,
      opi_api.storage.v1.NullDebug> getGetNullDebugMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNullDebug",
      requestType = opi_api.storage.v1.GetNullDebugRequest.class,
      responseType = opi_api.storage.v1.NullDebug.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.GetNullDebugRequest,
      opi_api.storage.v1.NullDebug> getGetNullDebugMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.GetNullDebugRequest, opi_api.storage.v1.NullDebug> getGetNullDebugMethod;
    if ((getGetNullDebugMethod = NullDebugServiceGrpc.getGetNullDebugMethod) == null) {
      synchronized (NullDebugServiceGrpc.class) {
        if ((getGetNullDebugMethod = NullDebugServiceGrpc.getGetNullDebugMethod) == null) {
          NullDebugServiceGrpc.getGetNullDebugMethod = getGetNullDebugMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.GetNullDebugRequest, opi_api.storage.v1.NullDebug>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNullDebug"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.GetNullDebugRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NullDebug.getDefaultInstance()))
              .setSchemaDescriptor(new NullDebugServiceMethodDescriptorSupplier("GetNullDebug"))
              .build();
        }
      }
    }
    return getGetNullDebugMethod;
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
   * <pre>
   * Back End (network-facing) APIs. This is debug interface for null block devices.
   * </pre>
   */
  public static abstract class NullDebugServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createNullDebug(opi_api.storage.v1.CreateNullDebugRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NullDebug> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateNullDebugMethod(), responseObserver);
    }

    /**
     */
    public void deleteNullDebug(opi_api.storage.v1.DeleteNullDebugRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteNullDebugMethod(), responseObserver);
    }

    /**
     */
    public void updateNullDebug(opi_api.storage.v1.UpdateNullDebugRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NullDebug> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateNullDebugMethod(), responseObserver);
    }

    /**
     */
    public void listNullDebugs(opi_api.storage.v1.ListNullDebugsRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListNullDebugsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListNullDebugsMethod(), responseObserver);
    }

    /**
     */
    public void getNullDebug(opi_api.storage.v1.GetNullDebugRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NullDebug> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNullDebugMethod(), responseObserver);
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
            getCreateNullDebugMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.CreateNullDebugRequest,
                opi_api.storage.v1.NullDebug>(
                  this, METHODID_CREATE_NULL_DEBUG)))
          .addMethod(
            getDeleteNullDebugMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.DeleteNullDebugRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_NULL_DEBUG)))
          .addMethod(
            getUpdateNullDebugMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.UpdateNullDebugRequest,
                opi_api.storage.v1.NullDebug>(
                  this, METHODID_UPDATE_NULL_DEBUG)))
          .addMethod(
            getListNullDebugsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.ListNullDebugsRequest,
                opi_api.storage.v1.ListNullDebugsResponse>(
                  this, METHODID_LIST_NULL_DEBUGS)))
          .addMethod(
            getGetNullDebugMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.GetNullDebugRequest,
                opi_api.storage.v1.NullDebug>(
                  this, METHODID_GET_NULL_DEBUG)))
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
   * <pre>
   * Back End (network-facing) APIs. This is debug interface for null block devices.
   * </pre>
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
    public void createNullDebug(opi_api.storage.v1.CreateNullDebugRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NullDebug> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateNullDebugMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteNullDebug(opi_api.storage.v1.DeleteNullDebugRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteNullDebugMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateNullDebug(opi_api.storage.v1.UpdateNullDebugRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NullDebug> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateNullDebugMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listNullDebugs(opi_api.storage.v1.ListNullDebugsRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListNullDebugsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListNullDebugsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNullDebug(opi_api.storage.v1.GetNullDebugRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NullDebug> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNullDebugMethod(), getCallOptions()), request, responseObserver);
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
   * <pre>
   * Back End (network-facing) APIs. This is debug interface for null block devices.
   * </pre>
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
    public opi_api.storage.v1.NullDebug createNullDebug(opi_api.storage.v1.CreateNullDebugRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateNullDebugMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteNullDebug(opi_api.storage.v1.DeleteNullDebugRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteNullDebugMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.NullDebug updateNullDebug(opi_api.storage.v1.UpdateNullDebugRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateNullDebugMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.ListNullDebugsResponse listNullDebugs(opi_api.storage.v1.ListNullDebugsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListNullDebugsMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.NullDebug getNullDebug(opi_api.storage.v1.GetNullDebugRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNullDebugMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.NullDebugStatsResponse nullDebugStats(opi_api.storage.v1.NullDebugStatsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNullDebugStatsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Back End (network-facing) APIs. This is debug interface for null block devices.
   * </pre>
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
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NullDebug> createNullDebug(
        opi_api.storage.v1.CreateNullDebugRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateNullDebugMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteNullDebug(
        opi_api.storage.v1.DeleteNullDebugRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteNullDebugMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NullDebug> updateNullDebug(
        opi_api.storage.v1.UpdateNullDebugRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateNullDebugMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.ListNullDebugsResponse> listNullDebugs(
        opi_api.storage.v1.ListNullDebugsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListNullDebugsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NullDebug> getNullDebug(
        opi_api.storage.v1.GetNullDebugRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNullDebugMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NullDebugStatsResponse> nullDebugStats(
        opi_api.storage.v1.NullDebugStatsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNullDebugStatsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_NULL_DEBUG = 0;
  private static final int METHODID_DELETE_NULL_DEBUG = 1;
  private static final int METHODID_UPDATE_NULL_DEBUG = 2;
  private static final int METHODID_LIST_NULL_DEBUGS = 3;
  private static final int METHODID_GET_NULL_DEBUG = 4;
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
        case METHODID_CREATE_NULL_DEBUG:
          serviceImpl.createNullDebug((opi_api.storage.v1.CreateNullDebugRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NullDebug>) responseObserver);
          break;
        case METHODID_DELETE_NULL_DEBUG:
          serviceImpl.deleteNullDebug((opi_api.storage.v1.DeleteNullDebugRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_NULL_DEBUG:
          serviceImpl.updateNullDebug((opi_api.storage.v1.UpdateNullDebugRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NullDebug>) responseObserver);
          break;
        case METHODID_LIST_NULL_DEBUGS:
          serviceImpl.listNullDebugs((opi_api.storage.v1.ListNullDebugsRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.ListNullDebugsResponse>) responseObserver);
          break;
        case METHODID_GET_NULL_DEBUG:
          serviceImpl.getNullDebug((opi_api.storage.v1.GetNullDebugRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NullDebug>) responseObserver);
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
              .addMethod(getCreateNullDebugMethod())
              .addMethod(getDeleteNullDebugMethod())
              .addMethod(getUpdateNullDebugMethod())
              .addMethod(getListNullDebugsMethod())
              .addMethod(getGetNullDebugMethod())
              .addMethod(getNullDebugStatsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
