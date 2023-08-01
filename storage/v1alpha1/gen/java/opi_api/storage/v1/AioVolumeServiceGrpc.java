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
public final class AioVolumeServiceGrpc {

  private AioVolumeServiceGrpc() {}

  public static final String SERVICE_NAME = "opi_api.storage.v1.AioVolumeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.CreateAioVolumeRequest,
      opi_api.storage.v1.AioVolume> getCreateAioVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAioVolume",
      requestType = opi_api.storage.v1.CreateAioVolumeRequest.class,
      responseType = opi_api.storage.v1.AioVolume.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.CreateAioVolumeRequest,
      opi_api.storage.v1.AioVolume> getCreateAioVolumeMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.CreateAioVolumeRequest, opi_api.storage.v1.AioVolume> getCreateAioVolumeMethod;
    if ((getCreateAioVolumeMethod = AioVolumeServiceGrpc.getCreateAioVolumeMethod) == null) {
      synchronized (AioVolumeServiceGrpc.class) {
        if ((getCreateAioVolumeMethod = AioVolumeServiceGrpc.getCreateAioVolumeMethod) == null) {
          AioVolumeServiceGrpc.getCreateAioVolumeMethod = getCreateAioVolumeMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.CreateAioVolumeRequest, opi_api.storage.v1.AioVolume>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAioVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.CreateAioVolumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.AioVolume.getDefaultInstance()))
              .setSchemaDescriptor(new AioVolumeServiceMethodDescriptorSupplier("CreateAioVolume"))
              .build();
        }
      }
    }
    return getCreateAioVolumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteAioVolumeRequest,
      com.google.protobuf.Empty> getDeleteAioVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAioVolume",
      requestType = opi_api.storage.v1.DeleteAioVolumeRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteAioVolumeRequest,
      com.google.protobuf.Empty> getDeleteAioVolumeMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteAioVolumeRequest, com.google.protobuf.Empty> getDeleteAioVolumeMethod;
    if ((getDeleteAioVolumeMethod = AioVolumeServiceGrpc.getDeleteAioVolumeMethod) == null) {
      synchronized (AioVolumeServiceGrpc.class) {
        if ((getDeleteAioVolumeMethod = AioVolumeServiceGrpc.getDeleteAioVolumeMethod) == null) {
          AioVolumeServiceGrpc.getDeleteAioVolumeMethod = getDeleteAioVolumeMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.DeleteAioVolumeRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAioVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.DeleteAioVolumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AioVolumeServiceMethodDescriptorSupplier("DeleteAioVolume"))
              .build();
        }
      }
    }
    return getDeleteAioVolumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateAioVolumeRequest,
      opi_api.storage.v1.AioVolume> getUpdateAioVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAioVolume",
      requestType = opi_api.storage.v1.UpdateAioVolumeRequest.class,
      responseType = opi_api.storage.v1.AioVolume.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateAioVolumeRequest,
      opi_api.storage.v1.AioVolume> getUpdateAioVolumeMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateAioVolumeRequest, opi_api.storage.v1.AioVolume> getUpdateAioVolumeMethod;
    if ((getUpdateAioVolumeMethod = AioVolumeServiceGrpc.getUpdateAioVolumeMethod) == null) {
      synchronized (AioVolumeServiceGrpc.class) {
        if ((getUpdateAioVolumeMethod = AioVolumeServiceGrpc.getUpdateAioVolumeMethod) == null) {
          AioVolumeServiceGrpc.getUpdateAioVolumeMethod = getUpdateAioVolumeMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.UpdateAioVolumeRequest, opi_api.storage.v1.AioVolume>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAioVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.UpdateAioVolumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.AioVolume.getDefaultInstance()))
              .setSchemaDescriptor(new AioVolumeServiceMethodDescriptorSupplier("UpdateAioVolume"))
              .build();
        }
      }
    }
    return getUpdateAioVolumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.ListAioVolumesRequest,
      opi_api.storage.v1.ListAioVolumesResponse> getListAioVolumesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAioVolumes",
      requestType = opi_api.storage.v1.ListAioVolumesRequest.class,
      responseType = opi_api.storage.v1.ListAioVolumesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.ListAioVolumesRequest,
      opi_api.storage.v1.ListAioVolumesResponse> getListAioVolumesMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.ListAioVolumesRequest, opi_api.storage.v1.ListAioVolumesResponse> getListAioVolumesMethod;
    if ((getListAioVolumesMethod = AioVolumeServiceGrpc.getListAioVolumesMethod) == null) {
      synchronized (AioVolumeServiceGrpc.class) {
        if ((getListAioVolumesMethod = AioVolumeServiceGrpc.getListAioVolumesMethod) == null) {
          AioVolumeServiceGrpc.getListAioVolumesMethod = getListAioVolumesMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.ListAioVolumesRequest, opi_api.storage.v1.ListAioVolumesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAioVolumes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListAioVolumesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListAioVolumesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AioVolumeServiceMethodDescriptorSupplier("ListAioVolumes"))
              .build();
        }
      }
    }
    return getListAioVolumesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.GetAioVolumeRequest,
      opi_api.storage.v1.AioVolume> getGetAioVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAioVolume",
      requestType = opi_api.storage.v1.GetAioVolumeRequest.class,
      responseType = opi_api.storage.v1.AioVolume.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.GetAioVolumeRequest,
      opi_api.storage.v1.AioVolume> getGetAioVolumeMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.GetAioVolumeRequest, opi_api.storage.v1.AioVolume> getGetAioVolumeMethod;
    if ((getGetAioVolumeMethod = AioVolumeServiceGrpc.getGetAioVolumeMethod) == null) {
      synchronized (AioVolumeServiceGrpc.class) {
        if ((getGetAioVolumeMethod = AioVolumeServiceGrpc.getGetAioVolumeMethod) == null) {
          AioVolumeServiceGrpc.getGetAioVolumeMethod = getGetAioVolumeMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.GetAioVolumeRequest, opi_api.storage.v1.AioVolume>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAioVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.GetAioVolumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.AioVolume.getDefaultInstance()))
              .setSchemaDescriptor(new AioVolumeServiceMethodDescriptorSupplier("GetAioVolume"))
              .build();
        }
      }
    }
    return getGetAioVolumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.StatsAioVolumeRequest,
      opi_api.storage.v1.StatsAioVolumeResponse> getStatsAioVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StatsAioVolume",
      requestType = opi_api.storage.v1.StatsAioVolumeRequest.class,
      responseType = opi_api.storage.v1.StatsAioVolumeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.StatsAioVolumeRequest,
      opi_api.storage.v1.StatsAioVolumeResponse> getStatsAioVolumeMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.StatsAioVolumeRequest, opi_api.storage.v1.StatsAioVolumeResponse> getStatsAioVolumeMethod;
    if ((getStatsAioVolumeMethod = AioVolumeServiceGrpc.getStatsAioVolumeMethod) == null) {
      synchronized (AioVolumeServiceGrpc.class) {
        if ((getStatsAioVolumeMethod = AioVolumeServiceGrpc.getStatsAioVolumeMethod) == null) {
          AioVolumeServiceGrpc.getStatsAioVolumeMethod = getStatsAioVolumeMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.StatsAioVolumeRequest, opi_api.storage.v1.StatsAioVolumeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StatsAioVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.StatsAioVolumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.StatsAioVolumeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AioVolumeServiceMethodDescriptorSupplier("StatsAioVolume"))
              .build();
        }
      }
    }
    return getStatsAioVolumeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AioVolumeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AioVolumeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AioVolumeServiceStub>() {
        @java.lang.Override
        public AioVolumeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AioVolumeServiceStub(channel, callOptions);
        }
      };
    return AioVolumeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AioVolumeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AioVolumeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AioVolumeServiceBlockingStub>() {
        @java.lang.Override
        public AioVolumeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AioVolumeServiceBlockingStub(channel, callOptions);
        }
      };
    return AioVolumeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AioVolumeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AioVolumeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AioVolumeServiceFutureStub>() {
        @java.lang.Override
        public AioVolumeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AioVolumeServiceFutureStub(channel, callOptions);
        }
      };
    return AioVolumeServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Back End (network-facing) APIs. This service is for AIO generic kernel block device.
   * </pre>
   */
  public static abstract class AioVolumeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createAioVolume(opi_api.storage.v1.CreateAioVolumeRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.AioVolume> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAioVolumeMethod(), responseObserver);
    }

    /**
     */
    public void deleteAioVolume(opi_api.storage.v1.DeleteAioVolumeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAioVolumeMethod(), responseObserver);
    }

    /**
     */
    public void updateAioVolume(opi_api.storage.v1.UpdateAioVolumeRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.AioVolume> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAioVolumeMethod(), responseObserver);
    }

    /**
     */
    public void listAioVolumes(opi_api.storage.v1.ListAioVolumesRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListAioVolumesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAioVolumesMethod(), responseObserver);
    }

    /**
     */
    public void getAioVolume(opi_api.storage.v1.GetAioVolumeRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.AioVolume> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAioVolumeMethod(), responseObserver);
    }

    /**
     */
    public void statsAioVolume(opi_api.storage.v1.StatsAioVolumeRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.StatsAioVolumeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStatsAioVolumeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateAioVolumeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.CreateAioVolumeRequest,
                opi_api.storage.v1.AioVolume>(
                  this, METHODID_CREATE_AIO_VOLUME)))
          .addMethod(
            getDeleteAioVolumeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.DeleteAioVolumeRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_AIO_VOLUME)))
          .addMethod(
            getUpdateAioVolumeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.UpdateAioVolumeRequest,
                opi_api.storage.v1.AioVolume>(
                  this, METHODID_UPDATE_AIO_VOLUME)))
          .addMethod(
            getListAioVolumesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.ListAioVolumesRequest,
                opi_api.storage.v1.ListAioVolumesResponse>(
                  this, METHODID_LIST_AIO_VOLUMES)))
          .addMethod(
            getGetAioVolumeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.GetAioVolumeRequest,
                opi_api.storage.v1.AioVolume>(
                  this, METHODID_GET_AIO_VOLUME)))
          .addMethod(
            getStatsAioVolumeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.StatsAioVolumeRequest,
                opi_api.storage.v1.StatsAioVolumeResponse>(
                  this, METHODID_STATS_AIO_VOLUME)))
          .build();
    }
  }

  /**
   * <pre>
   * Back End (network-facing) APIs. This service is for AIO generic kernel block device.
   * </pre>
   */
  public static final class AioVolumeServiceStub extends io.grpc.stub.AbstractAsyncStub<AioVolumeServiceStub> {
    private AioVolumeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AioVolumeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AioVolumeServiceStub(channel, callOptions);
    }

    /**
     */
    public void createAioVolume(opi_api.storage.v1.CreateAioVolumeRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.AioVolume> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAioVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAioVolume(opi_api.storage.v1.DeleteAioVolumeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAioVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAioVolume(opi_api.storage.v1.UpdateAioVolumeRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.AioVolume> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAioVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAioVolumes(opi_api.storage.v1.ListAioVolumesRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListAioVolumesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAioVolumesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAioVolume(opi_api.storage.v1.GetAioVolumeRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.AioVolume> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAioVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void statsAioVolume(opi_api.storage.v1.StatsAioVolumeRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.StatsAioVolumeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStatsAioVolumeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Back End (network-facing) APIs. This service is for AIO generic kernel block device.
   * </pre>
   */
  public static final class AioVolumeServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AioVolumeServiceBlockingStub> {
    private AioVolumeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AioVolumeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AioVolumeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public opi_api.storage.v1.AioVolume createAioVolume(opi_api.storage.v1.CreateAioVolumeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAioVolumeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteAioVolume(opi_api.storage.v1.DeleteAioVolumeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAioVolumeMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.AioVolume updateAioVolume(opi_api.storage.v1.UpdateAioVolumeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAioVolumeMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.ListAioVolumesResponse listAioVolumes(opi_api.storage.v1.ListAioVolumesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAioVolumesMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.AioVolume getAioVolume(opi_api.storage.v1.GetAioVolumeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAioVolumeMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.StatsAioVolumeResponse statsAioVolume(opi_api.storage.v1.StatsAioVolumeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStatsAioVolumeMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Back End (network-facing) APIs. This service is for AIO generic kernel block device.
   * </pre>
   */
  public static final class AioVolumeServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AioVolumeServiceFutureStub> {
    private AioVolumeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AioVolumeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AioVolumeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.AioVolume> createAioVolume(
        opi_api.storage.v1.CreateAioVolumeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAioVolumeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteAioVolume(
        opi_api.storage.v1.DeleteAioVolumeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAioVolumeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.AioVolume> updateAioVolume(
        opi_api.storage.v1.UpdateAioVolumeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAioVolumeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.ListAioVolumesResponse> listAioVolumes(
        opi_api.storage.v1.ListAioVolumesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAioVolumesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.AioVolume> getAioVolume(
        opi_api.storage.v1.GetAioVolumeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAioVolumeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.StatsAioVolumeResponse> statsAioVolume(
        opi_api.storage.v1.StatsAioVolumeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStatsAioVolumeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_AIO_VOLUME = 0;
  private static final int METHODID_DELETE_AIO_VOLUME = 1;
  private static final int METHODID_UPDATE_AIO_VOLUME = 2;
  private static final int METHODID_LIST_AIO_VOLUMES = 3;
  private static final int METHODID_GET_AIO_VOLUME = 4;
  private static final int METHODID_STATS_AIO_VOLUME = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AioVolumeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AioVolumeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_AIO_VOLUME:
          serviceImpl.createAioVolume((opi_api.storage.v1.CreateAioVolumeRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.AioVolume>) responseObserver);
          break;
        case METHODID_DELETE_AIO_VOLUME:
          serviceImpl.deleteAioVolume((opi_api.storage.v1.DeleteAioVolumeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_AIO_VOLUME:
          serviceImpl.updateAioVolume((opi_api.storage.v1.UpdateAioVolumeRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.AioVolume>) responseObserver);
          break;
        case METHODID_LIST_AIO_VOLUMES:
          serviceImpl.listAioVolumes((opi_api.storage.v1.ListAioVolumesRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.ListAioVolumesResponse>) responseObserver);
          break;
        case METHODID_GET_AIO_VOLUME:
          serviceImpl.getAioVolume((opi_api.storage.v1.GetAioVolumeRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.AioVolume>) responseObserver);
          break;
        case METHODID_STATS_AIO_VOLUME:
          serviceImpl.statsAioVolume((opi_api.storage.v1.StatsAioVolumeRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.StatsAioVolumeResponse>) responseObserver);
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

  private static abstract class AioVolumeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AioVolumeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return opi_api.storage.v1.BackendAioProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AioVolumeService");
    }
  }

  private static final class AioVolumeServiceFileDescriptorSupplier
      extends AioVolumeServiceBaseDescriptorSupplier {
    AioVolumeServiceFileDescriptorSupplier() {}
  }

  private static final class AioVolumeServiceMethodDescriptorSupplier
      extends AioVolumeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AioVolumeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AioVolumeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AioVolumeServiceFileDescriptorSupplier())
              .addMethod(getCreateAioVolumeMethod())
              .addMethod(getDeleteAioVolumeMethod())
              .addMethod(getUpdateAioVolumeMethod())
              .addMethod(getListAioVolumesMethod())
              .addMethod(getGetAioVolumeMethod())
              .addMethod(getStatsAioVolumeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
