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
public final class NullVolumeServiceGrpc {

  private NullVolumeServiceGrpc() {}

  public static final String SERVICE_NAME = "opi_api.storage.v1.NullVolumeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.CreateNullVolumeRequest,
      opi_api.storage.v1.NullVolume> getCreateNullVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateNullVolume",
      requestType = opi_api.storage.v1.CreateNullVolumeRequest.class,
      responseType = opi_api.storage.v1.NullVolume.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.CreateNullVolumeRequest,
      opi_api.storage.v1.NullVolume> getCreateNullVolumeMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.CreateNullVolumeRequest, opi_api.storage.v1.NullVolume> getCreateNullVolumeMethod;
    if ((getCreateNullVolumeMethod = NullVolumeServiceGrpc.getCreateNullVolumeMethod) == null) {
      synchronized (NullVolumeServiceGrpc.class) {
        if ((getCreateNullVolumeMethod = NullVolumeServiceGrpc.getCreateNullVolumeMethod) == null) {
          NullVolumeServiceGrpc.getCreateNullVolumeMethod = getCreateNullVolumeMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.CreateNullVolumeRequest, opi_api.storage.v1.NullVolume>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateNullVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.CreateNullVolumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NullVolume.getDefaultInstance()))
              .setSchemaDescriptor(new NullVolumeServiceMethodDescriptorSupplier("CreateNullVolume"))
              .build();
        }
      }
    }
    return getCreateNullVolumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteNullVolumeRequest,
      com.google.protobuf.Empty> getDeleteNullVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteNullVolume",
      requestType = opi_api.storage.v1.DeleteNullVolumeRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteNullVolumeRequest,
      com.google.protobuf.Empty> getDeleteNullVolumeMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteNullVolumeRequest, com.google.protobuf.Empty> getDeleteNullVolumeMethod;
    if ((getDeleteNullVolumeMethod = NullVolumeServiceGrpc.getDeleteNullVolumeMethod) == null) {
      synchronized (NullVolumeServiceGrpc.class) {
        if ((getDeleteNullVolumeMethod = NullVolumeServiceGrpc.getDeleteNullVolumeMethod) == null) {
          NullVolumeServiceGrpc.getDeleteNullVolumeMethod = getDeleteNullVolumeMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.DeleteNullVolumeRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteNullVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.DeleteNullVolumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NullVolumeServiceMethodDescriptorSupplier("DeleteNullVolume"))
              .build();
        }
      }
    }
    return getDeleteNullVolumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateNullVolumeRequest,
      opi_api.storage.v1.NullVolume> getUpdateNullVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateNullVolume",
      requestType = opi_api.storage.v1.UpdateNullVolumeRequest.class,
      responseType = opi_api.storage.v1.NullVolume.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateNullVolumeRequest,
      opi_api.storage.v1.NullVolume> getUpdateNullVolumeMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateNullVolumeRequest, opi_api.storage.v1.NullVolume> getUpdateNullVolumeMethod;
    if ((getUpdateNullVolumeMethod = NullVolumeServiceGrpc.getUpdateNullVolumeMethod) == null) {
      synchronized (NullVolumeServiceGrpc.class) {
        if ((getUpdateNullVolumeMethod = NullVolumeServiceGrpc.getUpdateNullVolumeMethod) == null) {
          NullVolumeServiceGrpc.getUpdateNullVolumeMethod = getUpdateNullVolumeMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.UpdateNullVolumeRequest, opi_api.storage.v1.NullVolume>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateNullVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.UpdateNullVolumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NullVolume.getDefaultInstance()))
              .setSchemaDescriptor(new NullVolumeServiceMethodDescriptorSupplier("UpdateNullVolume"))
              .build();
        }
      }
    }
    return getUpdateNullVolumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.ListNullVolumesRequest,
      opi_api.storage.v1.ListNullVolumesResponse> getListNullVolumesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNullVolumes",
      requestType = opi_api.storage.v1.ListNullVolumesRequest.class,
      responseType = opi_api.storage.v1.ListNullVolumesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.ListNullVolumesRequest,
      opi_api.storage.v1.ListNullVolumesResponse> getListNullVolumesMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.ListNullVolumesRequest, opi_api.storage.v1.ListNullVolumesResponse> getListNullVolumesMethod;
    if ((getListNullVolumesMethod = NullVolumeServiceGrpc.getListNullVolumesMethod) == null) {
      synchronized (NullVolumeServiceGrpc.class) {
        if ((getListNullVolumesMethod = NullVolumeServiceGrpc.getListNullVolumesMethod) == null) {
          NullVolumeServiceGrpc.getListNullVolumesMethod = getListNullVolumesMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.ListNullVolumesRequest, opi_api.storage.v1.ListNullVolumesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNullVolumes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListNullVolumesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListNullVolumesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NullVolumeServiceMethodDescriptorSupplier("ListNullVolumes"))
              .build();
        }
      }
    }
    return getListNullVolumesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.GetNullVolumeRequest,
      opi_api.storage.v1.NullVolume> getGetNullVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNullVolume",
      requestType = opi_api.storage.v1.GetNullVolumeRequest.class,
      responseType = opi_api.storage.v1.NullVolume.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.GetNullVolumeRequest,
      opi_api.storage.v1.NullVolume> getGetNullVolumeMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.GetNullVolumeRequest, opi_api.storage.v1.NullVolume> getGetNullVolumeMethod;
    if ((getGetNullVolumeMethod = NullVolumeServiceGrpc.getGetNullVolumeMethod) == null) {
      synchronized (NullVolumeServiceGrpc.class) {
        if ((getGetNullVolumeMethod = NullVolumeServiceGrpc.getGetNullVolumeMethod) == null) {
          NullVolumeServiceGrpc.getGetNullVolumeMethod = getGetNullVolumeMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.GetNullVolumeRequest, opi_api.storage.v1.NullVolume>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNullVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.GetNullVolumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.NullVolume.getDefaultInstance()))
              .setSchemaDescriptor(new NullVolumeServiceMethodDescriptorSupplier("GetNullVolume"))
              .build();
        }
      }
    }
    return getGetNullVolumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.StatsNullVolumeRequest,
      opi_api.storage.v1.StatsNullVolumeResponse> getStatsNullVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StatsNullVolume",
      requestType = opi_api.storage.v1.StatsNullVolumeRequest.class,
      responseType = opi_api.storage.v1.StatsNullVolumeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.StatsNullVolumeRequest,
      opi_api.storage.v1.StatsNullVolumeResponse> getStatsNullVolumeMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.StatsNullVolumeRequest, opi_api.storage.v1.StatsNullVolumeResponse> getStatsNullVolumeMethod;
    if ((getStatsNullVolumeMethod = NullVolumeServiceGrpc.getStatsNullVolumeMethod) == null) {
      synchronized (NullVolumeServiceGrpc.class) {
        if ((getStatsNullVolumeMethod = NullVolumeServiceGrpc.getStatsNullVolumeMethod) == null) {
          NullVolumeServiceGrpc.getStatsNullVolumeMethod = getStatsNullVolumeMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.StatsNullVolumeRequest, opi_api.storage.v1.StatsNullVolumeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StatsNullVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.StatsNullVolumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.StatsNullVolumeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NullVolumeServiceMethodDescriptorSupplier("StatsNullVolume"))
              .build();
        }
      }
    }
    return getStatsNullVolumeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NullVolumeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NullVolumeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NullVolumeServiceStub>() {
        @java.lang.Override
        public NullVolumeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NullVolumeServiceStub(channel, callOptions);
        }
      };
    return NullVolumeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NullVolumeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NullVolumeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NullVolumeServiceBlockingStub>() {
        @java.lang.Override
        public NullVolumeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NullVolumeServiceBlockingStub(channel, callOptions);
        }
      };
    return NullVolumeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NullVolumeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NullVolumeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NullVolumeServiceFutureStub>() {
        @java.lang.Override
        public NullVolumeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NullVolumeServiceFutureStub(channel, callOptions);
        }
      };
    return NullVolumeServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Back End (network-facing) APIs. This is debug interface for null block devices.
   * </pre>
   */
  public static abstract class NullVolumeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createNullVolume(opi_api.storage.v1.CreateNullVolumeRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NullVolume> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateNullVolumeMethod(), responseObserver);
    }

    /**
     */
    public void deleteNullVolume(opi_api.storage.v1.DeleteNullVolumeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteNullVolumeMethod(), responseObserver);
    }

    /**
     */
    public void updateNullVolume(opi_api.storage.v1.UpdateNullVolumeRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NullVolume> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateNullVolumeMethod(), responseObserver);
    }

    /**
     */
    public void listNullVolumes(opi_api.storage.v1.ListNullVolumesRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListNullVolumesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListNullVolumesMethod(), responseObserver);
    }

    /**
     */
    public void getNullVolume(opi_api.storage.v1.GetNullVolumeRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NullVolume> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNullVolumeMethod(), responseObserver);
    }

    /**
     */
    public void statsNullVolume(opi_api.storage.v1.StatsNullVolumeRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.StatsNullVolumeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStatsNullVolumeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateNullVolumeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.CreateNullVolumeRequest,
                opi_api.storage.v1.NullVolume>(
                  this, METHODID_CREATE_NULL_VOLUME)))
          .addMethod(
            getDeleteNullVolumeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.DeleteNullVolumeRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_NULL_VOLUME)))
          .addMethod(
            getUpdateNullVolumeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.UpdateNullVolumeRequest,
                opi_api.storage.v1.NullVolume>(
                  this, METHODID_UPDATE_NULL_VOLUME)))
          .addMethod(
            getListNullVolumesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.ListNullVolumesRequest,
                opi_api.storage.v1.ListNullVolumesResponse>(
                  this, METHODID_LIST_NULL_VOLUMES)))
          .addMethod(
            getGetNullVolumeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.GetNullVolumeRequest,
                opi_api.storage.v1.NullVolume>(
                  this, METHODID_GET_NULL_VOLUME)))
          .addMethod(
            getStatsNullVolumeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.StatsNullVolumeRequest,
                opi_api.storage.v1.StatsNullVolumeResponse>(
                  this, METHODID_STATS_NULL_VOLUME)))
          .build();
    }
  }

  /**
   * <pre>
   * Back End (network-facing) APIs. This is debug interface for null block devices.
   * </pre>
   */
  public static final class NullVolumeServiceStub extends io.grpc.stub.AbstractAsyncStub<NullVolumeServiceStub> {
    private NullVolumeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NullVolumeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NullVolumeServiceStub(channel, callOptions);
    }

    /**
     */
    public void createNullVolume(opi_api.storage.v1.CreateNullVolumeRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NullVolume> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateNullVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteNullVolume(opi_api.storage.v1.DeleteNullVolumeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteNullVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateNullVolume(opi_api.storage.v1.UpdateNullVolumeRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NullVolume> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateNullVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listNullVolumes(opi_api.storage.v1.ListNullVolumesRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListNullVolumesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListNullVolumesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNullVolume(opi_api.storage.v1.GetNullVolumeRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.NullVolume> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNullVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void statsNullVolume(opi_api.storage.v1.StatsNullVolumeRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.StatsNullVolumeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStatsNullVolumeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Back End (network-facing) APIs. This is debug interface for null block devices.
   * </pre>
   */
  public static final class NullVolumeServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<NullVolumeServiceBlockingStub> {
    private NullVolumeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NullVolumeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NullVolumeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public opi_api.storage.v1.NullVolume createNullVolume(opi_api.storage.v1.CreateNullVolumeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateNullVolumeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteNullVolume(opi_api.storage.v1.DeleteNullVolumeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteNullVolumeMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.NullVolume updateNullVolume(opi_api.storage.v1.UpdateNullVolumeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateNullVolumeMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.ListNullVolumesResponse listNullVolumes(opi_api.storage.v1.ListNullVolumesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListNullVolumesMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.NullVolume getNullVolume(opi_api.storage.v1.GetNullVolumeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNullVolumeMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.StatsNullVolumeResponse statsNullVolume(opi_api.storage.v1.StatsNullVolumeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStatsNullVolumeMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Back End (network-facing) APIs. This is debug interface for null block devices.
   * </pre>
   */
  public static final class NullVolumeServiceFutureStub extends io.grpc.stub.AbstractFutureStub<NullVolumeServiceFutureStub> {
    private NullVolumeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NullVolumeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NullVolumeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NullVolume> createNullVolume(
        opi_api.storage.v1.CreateNullVolumeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateNullVolumeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteNullVolume(
        opi_api.storage.v1.DeleteNullVolumeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteNullVolumeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NullVolume> updateNullVolume(
        opi_api.storage.v1.UpdateNullVolumeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateNullVolumeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.ListNullVolumesResponse> listNullVolumes(
        opi_api.storage.v1.ListNullVolumesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListNullVolumesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.NullVolume> getNullVolume(
        opi_api.storage.v1.GetNullVolumeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNullVolumeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.StatsNullVolumeResponse> statsNullVolume(
        opi_api.storage.v1.StatsNullVolumeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStatsNullVolumeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_NULL_VOLUME = 0;
  private static final int METHODID_DELETE_NULL_VOLUME = 1;
  private static final int METHODID_UPDATE_NULL_VOLUME = 2;
  private static final int METHODID_LIST_NULL_VOLUMES = 3;
  private static final int METHODID_GET_NULL_VOLUME = 4;
  private static final int METHODID_STATS_NULL_VOLUME = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NullVolumeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NullVolumeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_NULL_VOLUME:
          serviceImpl.createNullVolume((opi_api.storage.v1.CreateNullVolumeRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NullVolume>) responseObserver);
          break;
        case METHODID_DELETE_NULL_VOLUME:
          serviceImpl.deleteNullVolume((opi_api.storage.v1.DeleteNullVolumeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_NULL_VOLUME:
          serviceImpl.updateNullVolume((opi_api.storage.v1.UpdateNullVolumeRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NullVolume>) responseObserver);
          break;
        case METHODID_LIST_NULL_VOLUMES:
          serviceImpl.listNullVolumes((opi_api.storage.v1.ListNullVolumesRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.ListNullVolumesResponse>) responseObserver);
          break;
        case METHODID_GET_NULL_VOLUME:
          serviceImpl.getNullVolume((opi_api.storage.v1.GetNullVolumeRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.NullVolume>) responseObserver);
          break;
        case METHODID_STATS_NULL_VOLUME:
          serviceImpl.statsNullVolume((opi_api.storage.v1.StatsNullVolumeRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.StatsNullVolumeResponse>) responseObserver);
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

  private static abstract class NullVolumeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NullVolumeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return opi_api.storage.v1.BackendNullProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NullVolumeService");
    }
  }

  private static final class NullVolumeServiceFileDescriptorSupplier
      extends NullVolumeServiceBaseDescriptorSupplier {
    NullVolumeServiceFileDescriptorSupplier() {}
  }

  private static final class NullVolumeServiceMethodDescriptorSupplier
      extends NullVolumeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NullVolumeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (NullVolumeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NullVolumeServiceFileDescriptorSupplier())
              .addMethod(getCreateNullVolumeMethod())
              .addMethod(getDeleteNullVolumeMethod())
              .addMethod(getUpdateNullVolumeMethod())
              .addMethod(getListNullVolumesMethod())
              .addMethod(getGetNullVolumeMethod())
              .addMethod(getStatsNullVolumeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
