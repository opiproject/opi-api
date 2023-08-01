package opi_api.storage.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: middleend_qos_volume.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MiddleendQosVolumeServiceGrpc {

  private MiddleendQosVolumeServiceGrpc() {}

  public static final String SERVICE_NAME = "opi_api.storage.v1.MiddleendQosVolumeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.CreateQosVolumeRequest,
      opi_api.storage.v1.QosVolume> getCreateQosVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateQosVolume",
      requestType = opi_api.storage.v1.CreateQosVolumeRequest.class,
      responseType = opi_api.storage.v1.QosVolume.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.CreateQosVolumeRequest,
      opi_api.storage.v1.QosVolume> getCreateQosVolumeMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.CreateQosVolumeRequest, opi_api.storage.v1.QosVolume> getCreateQosVolumeMethod;
    if ((getCreateQosVolumeMethod = MiddleendQosVolumeServiceGrpc.getCreateQosVolumeMethod) == null) {
      synchronized (MiddleendQosVolumeServiceGrpc.class) {
        if ((getCreateQosVolumeMethod = MiddleendQosVolumeServiceGrpc.getCreateQosVolumeMethod) == null) {
          MiddleendQosVolumeServiceGrpc.getCreateQosVolumeMethod = getCreateQosVolumeMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.CreateQosVolumeRequest, opi_api.storage.v1.QosVolume>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateQosVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.CreateQosVolumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.QosVolume.getDefaultInstance()))
              .setSchemaDescriptor(new MiddleendQosVolumeServiceMethodDescriptorSupplier("CreateQosVolume"))
              .build();
        }
      }
    }
    return getCreateQosVolumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteQosVolumeRequest,
      com.google.protobuf.Empty> getDeleteQosVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteQosVolume",
      requestType = opi_api.storage.v1.DeleteQosVolumeRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteQosVolumeRequest,
      com.google.protobuf.Empty> getDeleteQosVolumeMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteQosVolumeRequest, com.google.protobuf.Empty> getDeleteQosVolumeMethod;
    if ((getDeleteQosVolumeMethod = MiddleendQosVolumeServiceGrpc.getDeleteQosVolumeMethod) == null) {
      synchronized (MiddleendQosVolumeServiceGrpc.class) {
        if ((getDeleteQosVolumeMethod = MiddleendQosVolumeServiceGrpc.getDeleteQosVolumeMethod) == null) {
          MiddleendQosVolumeServiceGrpc.getDeleteQosVolumeMethod = getDeleteQosVolumeMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.DeleteQosVolumeRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteQosVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.DeleteQosVolumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new MiddleendQosVolumeServiceMethodDescriptorSupplier("DeleteQosVolume"))
              .build();
        }
      }
    }
    return getDeleteQosVolumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateQosVolumeRequest,
      opi_api.storage.v1.QosVolume> getUpdateQosVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateQosVolume",
      requestType = opi_api.storage.v1.UpdateQosVolumeRequest.class,
      responseType = opi_api.storage.v1.QosVolume.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateQosVolumeRequest,
      opi_api.storage.v1.QosVolume> getUpdateQosVolumeMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateQosVolumeRequest, opi_api.storage.v1.QosVolume> getUpdateQosVolumeMethod;
    if ((getUpdateQosVolumeMethod = MiddleendQosVolumeServiceGrpc.getUpdateQosVolumeMethod) == null) {
      synchronized (MiddleendQosVolumeServiceGrpc.class) {
        if ((getUpdateQosVolumeMethod = MiddleendQosVolumeServiceGrpc.getUpdateQosVolumeMethod) == null) {
          MiddleendQosVolumeServiceGrpc.getUpdateQosVolumeMethod = getUpdateQosVolumeMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.UpdateQosVolumeRequest, opi_api.storage.v1.QosVolume>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateQosVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.UpdateQosVolumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.QosVolume.getDefaultInstance()))
              .setSchemaDescriptor(new MiddleendQosVolumeServiceMethodDescriptorSupplier("UpdateQosVolume"))
              .build();
        }
      }
    }
    return getUpdateQosVolumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.ListQosVolumesRequest,
      opi_api.storage.v1.ListQosVolumesResponse> getListQosVolumesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListQosVolumes",
      requestType = opi_api.storage.v1.ListQosVolumesRequest.class,
      responseType = opi_api.storage.v1.ListQosVolumesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.ListQosVolumesRequest,
      opi_api.storage.v1.ListQosVolumesResponse> getListQosVolumesMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.ListQosVolumesRequest, opi_api.storage.v1.ListQosVolumesResponse> getListQosVolumesMethod;
    if ((getListQosVolumesMethod = MiddleendQosVolumeServiceGrpc.getListQosVolumesMethod) == null) {
      synchronized (MiddleendQosVolumeServiceGrpc.class) {
        if ((getListQosVolumesMethod = MiddleendQosVolumeServiceGrpc.getListQosVolumesMethod) == null) {
          MiddleendQosVolumeServiceGrpc.getListQosVolumesMethod = getListQosVolumesMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.ListQosVolumesRequest, opi_api.storage.v1.ListQosVolumesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListQosVolumes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListQosVolumesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListQosVolumesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MiddleendQosVolumeServiceMethodDescriptorSupplier("ListQosVolumes"))
              .build();
        }
      }
    }
    return getListQosVolumesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.GetQosVolumeRequest,
      opi_api.storage.v1.QosVolume> getGetQosVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetQosVolume",
      requestType = opi_api.storage.v1.GetQosVolumeRequest.class,
      responseType = opi_api.storage.v1.QosVolume.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.GetQosVolumeRequest,
      opi_api.storage.v1.QosVolume> getGetQosVolumeMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.GetQosVolumeRequest, opi_api.storage.v1.QosVolume> getGetQosVolumeMethod;
    if ((getGetQosVolumeMethod = MiddleendQosVolumeServiceGrpc.getGetQosVolumeMethod) == null) {
      synchronized (MiddleendQosVolumeServiceGrpc.class) {
        if ((getGetQosVolumeMethod = MiddleendQosVolumeServiceGrpc.getGetQosVolumeMethod) == null) {
          MiddleendQosVolumeServiceGrpc.getGetQosVolumeMethod = getGetQosVolumeMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.GetQosVolumeRequest, opi_api.storage.v1.QosVolume>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetQosVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.GetQosVolumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.QosVolume.getDefaultInstance()))
              .setSchemaDescriptor(new MiddleendQosVolumeServiceMethodDescriptorSupplier("GetQosVolume"))
              .build();
        }
      }
    }
    return getGetQosVolumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.StatsQosVolumeRequest,
      opi_api.storage.v1.StatsQosVolumeResponse> getStatsQosVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StatsQosVolume",
      requestType = opi_api.storage.v1.StatsQosVolumeRequest.class,
      responseType = opi_api.storage.v1.StatsQosVolumeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.StatsQosVolumeRequest,
      opi_api.storage.v1.StatsQosVolumeResponse> getStatsQosVolumeMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.StatsQosVolumeRequest, opi_api.storage.v1.StatsQosVolumeResponse> getStatsQosVolumeMethod;
    if ((getStatsQosVolumeMethod = MiddleendQosVolumeServiceGrpc.getStatsQosVolumeMethod) == null) {
      synchronized (MiddleendQosVolumeServiceGrpc.class) {
        if ((getStatsQosVolumeMethod = MiddleendQosVolumeServiceGrpc.getStatsQosVolumeMethod) == null) {
          MiddleendQosVolumeServiceGrpc.getStatsQosVolumeMethod = getStatsQosVolumeMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.StatsQosVolumeRequest, opi_api.storage.v1.StatsQosVolumeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StatsQosVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.StatsQosVolumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.StatsQosVolumeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MiddleendQosVolumeServiceMethodDescriptorSupplier("StatsQosVolume"))
              .build();
        }
      }
    }
    return getStatsQosVolumeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MiddleendQosVolumeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MiddleendQosVolumeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MiddleendQosVolumeServiceStub>() {
        @java.lang.Override
        public MiddleendQosVolumeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MiddleendQosVolumeServiceStub(channel, callOptions);
        }
      };
    return MiddleendQosVolumeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MiddleendQosVolumeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MiddleendQosVolumeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MiddleendQosVolumeServiceBlockingStub>() {
        @java.lang.Override
        public MiddleendQosVolumeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MiddleendQosVolumeServiceBlockingStub(channel, callOptions);
        }
      };
    return MiddleendQosVolumeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MiddleendQosVolumeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MiddleendQosVolumeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MiddleendQosVolumeServiceFutureStub>() {
        @java.lang.Override
        public MiddleendQosVolumeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MiddleendQosVolumeServiceFutureStub(channel, callOptions);
        }
      };
    return MiddleendQosVolumeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class MiddleendQosVolumeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createQosVolume(opi_api.storage.v1.CreateQosVolumeRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.QosVolume> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateQosVolumeMethod(), responseObserver);
    }

    /**
     */
    public void deleteQosVolume(opi_api.storage.v1.DeleteQosVolumeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteQosVolumeMethod(), responseObserver);
    }

    /**
     */
    public void updateQosVolume(opi_api.storage.v1.UpdateQosVolumeRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.QosVolume> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateQosVolumeMethod(), responseObserver);
    }

    /**
     */
    public void listQosVolumes(opi_api.storage.v1.ListQosVolumesRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListQosVolumesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListQosVolumesMethod(), responseObserver);
    }

    /**
     */
    public void getQosVolume(opi_api.storage.v1.GetQosVolumeRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.QosVolume> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetQosVolumeMethod(), responseObserver);
    }

    /**
     */
    public void statsQosVolume(opi_api.storage.v1.StatsQosVolumeRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.StatsQosVolumeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStatsQosVolumeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateQosVolumeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.CreateQosVolumeRequest,
                opi_api.storage.v1.QosVolume>(
                  this, METHODID_CREATE_QOS_VOLUME)))
          .addMethod(
            getDeleteQosVolumeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.DeleteQosVolumeRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_QOS_VOLUME)))
          .addMethod(
            getUpdateQosVolumeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.UpdateQosVolumeRequest,
                opi_api.storage.v1.QosVolume>(
                  this, METHODID_UPDATE_QOS_VOLUME)))
          .addMethod(
            getListQosVolumesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.ListQosVolumesRequest,
                opi_api.storage.v1.ListQosVolumesResponse>(
                  this, METHODID_LIST_QOS_VOLUMES)))
          .addMethod(
            getGetQosVolumeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.GetQosVolumeRequest,
                opi_api.storage.v1.QosVolume>(
                  this, METHODID_GET_QOS_VOLUME)))
          .addMethod(
            getStatsQosVolumeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.StatsQosVolumeRequest,
                opi_api.storage.v1.StatsQosVolumeResponse>(
                  this, METHODID_STATS_QOS_VOLUME)))
          .build();
    }
  }

  /**
   */
  public static final class MiddleendQosVolumeServiceStub extends io.grpc.stub.AbstractAsyncStub<MiddleendQosVolumeServiceStub> {
    private MiddleendQosVolumeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MiddleendQosVolumeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MiddleendQosVolumeServiceStub(channel, callOptions);
    }

    /**
     */
    public void createQosVolume(opi_api.storage.v1.CreateQosVolumeRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.QosVolume> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateQosVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteQosVolume(opi_api.storage.v1.DeleteQosVolumeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteQosVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateQosVolume(opi_api.storage.v1.UpdateQosVolumeRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.QosVolume> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateQosVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listQosVolumes(opi_api.storage.v1.ListQosVolumesRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListQosVolumesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListQosVolumesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getQosVolume(opi_api.storage.v1.GetQosVolumeRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.QosVolume> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetQosVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void statsQosVolume(opi_api.storage.v1.StatsQosVolumeRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.StatsQosVolumeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStatsQosVolumeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MiddleendQosVolumeServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MiddleendQosVolumeServiceBlockingStub> {
    private MiddleendQosVolumeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MiddleendQosVolumeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MiddleendQosVolumeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public opi_api.storage.v1.QosVolume createQosVolume(opi_api.storage.v1.CreateQosVolumeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateQosVolumeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteQosVolume(opi_api.storage.v1.DeleteQosVolumeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteQosVolumeMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.QosVolume updateQosVolume(opi_api.storage.v1.UpdateQosVolumeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateQosVolumeMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.ListQosVolumesResponse listQosVolumes(opi_api.storage.v1.ListQosVolumesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListQosVolumesMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.QosVolume getQosVolume(opi_api.storage.v1.GetQosVolumeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetQosVolumeMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.StatsQosVolumeResponse statsQosVolume(opi_api.storage.v1.StatsQosVolumeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStatsQosVolumeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MiddleendQosVolumeServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MiddleendQosVolumeServiceFutureStub> {
    private MiddleendQosVolumeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MiddleendQosVolumeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MiddleendQosVolumeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.QosVolume> createQosVolume(
        opi_api.storage.v1.CreateQosVolumeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateQosVolumeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteQosVolume(
        opi_api.storage.v1.DeleteQosVolumeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteQosVolumeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.QosVolume> updateQosVolume(
        opi_api.storage.v1.UpdateQosVolumeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateQosVolumeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.ListQosVolumesResponse> listQosVolumes(
        opi_api.storage.v1.ListQosVolumesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListQosVolumesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.QosVolume> getQosVolume(
        opi_api.storage.v1.GetQosVolumeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetQosVolumeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.StatsQosVolumeResponse> statsQosVolume(
        opi_api.storage.v1.StatsQosVolumeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStatsQosVolumeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_QOS_VOLUME = 0;
  private static final int METHODID_DELETE_QOS_VOLUME = 1;
  private static final int METHODID_UPDATE_QOS_VOLUME = 2;
  private static final int METHODID_LIST_QOS_VOLUMES = 3;
  private static final int METHODID_GET_QOS_VOLUME = 4;
  private static final int METHODID_STATS_QOS_VOLUME = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MiddleendQosVolumeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MiddleendQosVolumeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_QOS_VOLUME:
          serviceImpl.createQosVolume((opi_api.storage.v1.CreateQosVolumeRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.QosVolume>) responseObserver);
          break;
        case METHODID_DELETE_QOS_VOLUME:
          serviceImpl.deleteQosVolume((opi_api.storage.v1.DeleteQosVolumeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_QOS_VOLUME:
          serviceImpl.updateQosVolume((opi_api.storage.v1.UpdateQosVolumeRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.QosVolume>) responseObserver);
          break;
        case METHODID_LIST_QOS_VOLUMES:
          serviceImpl.listQosVolumes((opi_api.storage.v1.ListQosVolumesRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.ListQosVolumesResponse>) responseObserver);
          break;
        case METHODID_GET_QOS_VOLUME:
          serviceImpl.getQosVolume((opi_api.storage.v1.GetQosVolumeRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.QosVolume>) responseObserver);
          break;
        case METHODID_STATS_QOS_VOLUME:
          serviceImpl.statsQosVolume((opi_api.storage.v1.StatsQosVolumeRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.StatsQosVolumeResponse>) responseObserver);
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

  private static abstract class MiddleendQosVolumeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MiddleendQosVolumeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return opi_api.storage.v1.MiddleendQosVolumeProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MiddleendQosVolumeService");
    }
  }

  private static final class MiddleendQosVolumeServiceFileDescriptorSupplier
      extends MiddleendQosVolumeServiceBaseDescriptorSupplier {
    MiddleendQosVolumeServiceFileDescriptorSupplier() {}
  }

  private static final class MiddleendQosVolumeServiceMethodDescriptorSupplier
      extends MiddleendQosVolumeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MiddleendQosVolumeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MiddleendQosVolumeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MiddleendQosVolumeServiceFileDescriptorSupplier())
              .addMethod(getCreateQosVolumeMethod())
              .addMethod(getDeleteQosVolumeMethod())
              .addMethod(getUpdateQosVolumeMethod())
              .addMethod(getListQosVolumesMethod())
              .addMethod(getGetQosVolumeMethod())
              .addMethod(getStatsQosVolumeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
