package opi_api.storage.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Middle End (Storage Services) APIs. For example, encryption, compression, raid, QoS, multipath, ...
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: middleend_encryption.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MiddleendEncryptionServiceGrpc {

  private MiddleendEncryptionServiceGrpc() {}

  public static final String SERVICE_NAME = "opi_api.storage.v1.MiddleendEncryptionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.CreateEncryptedVolumeRequest,
      opi_api.storage.v1.EncryptedVolume> getCreateEncryptedVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEncryptedVolume",
      requestType = opi_api.storage.v1.CreateEncryptedVolumeRequest.class,
      responseType = opi_api.storage.v1.EncryptedVolume.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.CreateEncryptedVolumeRequest,
      opi_api.storage.v1.EncryptedVolume> getCreateEncryptedVolumeMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.CreateEncryptedVolumeRequest, opi_api.storage.v1.EncryptedVolume> getCreateEncryptedVolumeMethod;
    if ((getCreateEncryptedVolumeMethod = MiddleendEncryptionServiceGrpc.getCreateEncryptedVolumeMethod) == null) {
      synchronized (MiddleendEncryptionServiceGrpc.class) {
        if ((getCreateEncryptedVolumeMethod = MiddleendEncryptionServiceGrpc.getCreateEncryptedVolumeMethod) == null) {
          MiddleendEncryptionServiceGrpc.getCreateEncryptedVolumeMethod = getCreateEncryptedVolumeMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.CreateEncryptedVolumeRequest, opi_api.storage.v1.EncryptedVolume>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEncryptedVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.CreateEncryptedVolumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.EncryptedVolume.getDefaultInstance()))
              .setSchemaDescriptor(new MiddleendEncryptionServiceMethodDescriptorSupplier("CreateEncryptedVolume"))
              .build();
        }
      }
    }
    return getCreateEncryptedVolumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteEncryptedVolumeRequest,
      com.google.protobuf.Empty> getDeleteEncryptedVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteEncryptedVolume",
      requestType = opi_api.storage.v1.DeleteEncryptedVolumeRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteEncryptedVolumeRequest,
      com.google.protobuf.Empty> getDeleteEncryptedVolumeMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteEncryptedVolumeRequest, com.google.protobuf.Empty> getDeleteEncryptedVolumeMethod;
    if ((getDeleteEncryptedVolumeMethod = MiddleendEncryptionServiceGrpc.getDeleteEncryptedVolumeMethod) == null) {
      synchronized (MiddleendEncryptionServiceGrpc.class) {
        if ((getDeleteEncryptedVolumeMethod = MiddleendEncryptionServiceGrpc.getDeleteEncryptedVolumeMethod) == null) {
          MiddleendEncryptionServiceGrpc.getDeleteEncryptedVolumeMethod = getDeleteEncryptedVolumeMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.DeleteEncryptedVolumeRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteEncryptedVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.DeleteEncryptedVolumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new MiddleendEncryptionServiceMethodDescriptorSupplier("DeleteEncryptedVolume"))
              .build();
        }
      }
    }
    return getDeleteEncryptedVolumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateEncryptedVolumeRequest,
      opi_api.storage.v1.EncryptedVolume> getUpdateEncryptedVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEncryptedVolume",
      requestType = opi_api.storage.v1.UpdateEncryptedVolumeRequest.class,
      responseType = opi_api.storage.v1.EncryptedVolume.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateEncryptedVolumeRequest,
      opi_api.storage.v1.EncryptedVolume> getUpdateEncryptedVolumeMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateEncryptedVolumeRequest, opi_api.storage.v1.EncryptedVolume> getUpdateEncryptedVolumeMethod;
    if ((getUpdateEncryptedVolumeMethod = MiddleendEncryptionServiceGrpc.getUpdateEncryptedVolumeMethod) == null) {
      synchronized (MiddleendEncryptionServiceGrpc.class) {
        if ((getUpdateEncryptedVolumeMethod = MiddleendEncryptionServiceGrpc.getUpdateEncryptedVolumeMethod) == null) {
          MiddleendEncryptionServiceGrpc.getUpdateEncryptedVolumeMethod = getUpdateEncryptedVolumeMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.UpdateEncryptedVolumeRequest, opi_api.storage.v1.EncryptedVolume>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEncryptedVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.UpdateEncryptedVolumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.EncryptedVolume.getDefaultInstance()))
              .setSchemaDescriptor(new MiddleendEncryptionServiceMethodDescriptorSupplier("UpdateEncryptedVolume"))
              .build();
        }
      }
    }
    return getUpdateEncryptedVolumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.ListEncryptedVolumesRequest,
      opi_api.storage.v1.ListEncryptedVolumesResponse> getListEncryptedVolumesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListEncryptedVolumes",
      requestType = opi_api.storage.v1.ListEncryptedVolumesRequest.class,
      responseType = opi_api.storage.v1.ListEncryptedVolumesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.ListEncryptedVolumesRequest,
      opi_api.storage.v1.ListEncryptedVolumesResponse> getListEncryptedVolumesMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.ListEncryptedVolumesRequest, opi_api.storage.v1.ListEncryptedVolumesResponse> getListEncryptedVolumesMethod;
    if ((getListEncryptedVolumesMethod = MiddleendEncryptionServiceGrpc.getListEncryptedVolumesMethod) == null) {
      synchronized (MiddleendEncryptionServiceGrpc.class) {
        if ((getListEncryptedVolumesMethod = MiddleendEncryptionServiceGrpc.getListEncryptedVolumesMethod) == null) {
          MiddleendEncryptionServiceGrpc.getListEncryptedVolumesMethod = getListEncryptedVolumesMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.ListEncryptedVolumesRequest, opi_api.storage.v1.ListEncryptedVolumesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListEncryptedVolumes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListEncryptedVolumesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListEncryptedVolumesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MiddleendEncryptionServiceMethodDescriptorSupplier("ListEncryptedVolumes"))
              .build();
        }
      }
    }
    return getListEncryptedVolumesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.GetEncryptedVolumeRequest,
      opi_api.storage.v1.EncryptedVolume> getGetEncryptedVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEncryptedVolume",
      requestType = opi_api.storage.v1.GetEncryptedVolumeRequest.class,
      responseType = opi_api.storage.v1.EncryptedVolume.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.GetEncryptedVolumeRequest,
      opi_api.storage.v1.EncryptedVolume> getGetEncryptedVolumeMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.GetEncryptedVolumeRequest, opi_api.storage.v1.EncryptedVolume> getGetEncryptedVolumeMethod;
    if ((getGetEncryptedVolumeMethod = MiddleendEncryptionServiceGrpc.getGetEncryptedVolumeMethod) == null) {
      synchronized (MiddleendEncryptionServiceGrpc.class) {
        if ((getGetEncryptedVolumeMethod = MiddleendEncryptionServiceGrpc.getGetEncryptedVolumeMethod) == null) {
          MiddleendEncryptionServiceGrpc.getGetEncryptedVolumeMethod = getGetEncryptedVolumeMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.GetEncryptedVolumeRequest, opi_api.storage.v1.EncryptedVolume>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEncryptedVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.GetEncryptedVolumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.EncryptedVolume.getDefaultInstance()))
              .setSchemaDescriptor(new MiddleendEncryptionServiceMethodDescriptorSupplier("GetEncryptedVolume"))
              .build();
        }
      }
    }
    return getGetEncryptedVolumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.StatsEncryptedVolumeRequest,
      opi_api.storage.v1.StatsEncryptedVolumeResponse> getStatsEncryptedVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StatsEncryptedVolume",
      requestType = opi_api.storage.v1.StatsEncryptedVolumeRequest.class,
      responseType = opi_api.storage.v1.StatsEncryptedVolumeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.StatsEncryptedVolumeRequest,
      opi_api.storage.v1.StatsEncryptedVolumeResponse> getStatsEncryptedVolumeMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.StatsEncryptedVolumeRequest, opi_api.storage.v1.StatsEncryptedVolumeResponse> getStatsEncryptedVolumeMethod;
    if ((getStatsEncryptedVolumeMethod = MiddleendEncryptionServiceGrpc.getStatsEncryptedVolumeMethod) == null) {
      synchronized (MiddleendEncryptionServiceGrpc.class) {
        if ((getStatsEncryptedVolumeMethod = MiddleendEncryptionServiceGrpc.getStatsEncryptedVolumeMethod) == null) {
          MiddleendEncryptionServiceGrpc.getStatsEncryptedVolumeMethod = getStatsEncryptedVolumeMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.StatsEncryptedVolumeRequest, opi_api.storage.v1.StatsEncryptedVolumeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StatsEncryptedVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.StatsEncryptedVolumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.StatsEncryptedVolumeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MiddleendEncryptionServiceMethodDescriptorSupplier("StatsEncryptedVolume"))
              .build();
        }
      }
    }
    return getStatsEncryptedVolumeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MiddleendEncryptionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MiddleendEncryptionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MiddleendEncryptionServiceStub>() {
        @java.lang.Override
        public MiddleendEncryptionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MiddleendEncryptionServiceStub(channel, callOptions);
        }
      };
    return MiddleendEncryptionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MiddleendEncryptionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MiddleendEncryptionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MiddleendEncryptionServiceBlockingStub>() {
        @java.lang.Override
        public MiddleendEncryptionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MiddleendEncryptionServiceBlockingStub(channel, callOptions);
        }
      };
    return MiddleendEncryptionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MiddleendEncryptionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MiddleendEncryptionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MiddleendEncryptionServiceFutureStub>() {
        @java.lang.Override
        public MiddleendEncryptionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MiddleendEncryptionServiceFutureStub(channel, callOptions);
        }
      };
    return MiddleendEncryptionServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Middle End (Storage Services) APIs. For example, encryption, compression, raid, QoS, multipath, ...
   * </pre>
   */
  public static abstract class MiddleendEncryptionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create an Encrypted Volume
     * </pre>
     */
    public void createEncryptedVolume(opi_api.storage.v1.CreateEncryptedVolumeRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.EncryptedVolume> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEncryptedVolumeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an Encrypted Volume
     * </pre>
     */
    public void deleteEncryptedVolume(opi_api.storage.v1.DeleteEncryptedVolumeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEncryptedVolumeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an Encrypted Volume
     * </pre>
     */
    public void updateEncryptedVolume(opi_api.storage.v1.UpdateEncryptedVolumeRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.EncryptedVolume> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEncryptedVolumeMethod(), responseObserver);
    }

    /**
     * <pre>
     * List Encrypted Volumes
     * </pre>
     */
    public void listEncryptedVolumes(opi_api.storage.v1.ListEncryptedVolumesRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListEncryptedVolumesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListEncryptedVolumesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an Encrypted Volume
     * </pre>
     */
    public void getEncryptedVolume(opi_api.storage.v1.GetEncryptedVolumeRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.EncryptedVolume> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEncryptedVolumeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an Encrypted Volume statistics
     * </pre>
     */
    public void statsEncryptedVolume(opi_api.storage.v1.StatsEncryptedVolumeRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.StatsEncryptedVolumeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStatsEncryptedVolumeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateEncryptedVolumeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.CreateEncryptedVolumeRequest,
                opi_api.storage.v1.EncryptedVolume>(
                  this, METHODID_CREATE_ENCRYPTED_VOLUME)))
          .addMethod(
            getDeleteEncryptedVolumeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.DeleteEncryptedVolumeRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_ENCRYPTED_VOLUME)))
          .addMethod(
            getUpdateEncryptedVolumeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.UpdateEncryptedVolumeRequest,
                opi_api.storage.v1.EncryptedVolume>(
                  this, METHODID_UPDATE_ENCRYPTED_VOLUME)))
          .addMethod(
            getListEncryptedVolumesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.ListEncryptedVolumesRequest,
                opi_api.storage.v1.ListEncryptedVolumesResponse>(
                  this, METHODID_LIST_ENCRYPTED_VOLUMES)))
          .addMethod(
            getGetEncryptedVolumeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.GetEncryptedVolumeRequest,
                opi_api.storage.v1.EncryptedVolume>(
                  this, METHODID_GET_ENCRYPTED_VOLUME)))
          .addMethod(
            getStatsEncryptedVolumeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.StatsEncryptedVolumeRequest,
                opi_api.storage.v1.StatsEncryptedVolumeResponse>(
                  this, METHODID_STATS_ENCRYPTED_VOLUME)))
          .build();
    }
  }

  /**
   * <pre>
   * Middle End (Storage Services) APIs. For example, encryption, compression, raid, QoS, multipath, ...
   * </pre>
   */
  public static final class MiddleendEncryptionServiceStub extends io.grpc.stub.AbstractAsyncStub<MiddleendEncryptionServiceStub> {
    private MiddleendEncryptionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MiddleendEncryptionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MiddleendEncryptionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an Encrypted Volume
     * </pre>
     */
    public void createEncryptedVolume(opi_api.storage.v1.CreateEncryptedVolumeRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.EncryptedVolume> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEncryptedVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an Encrypted Volume
     * </pre>
     */
    public void deleteEncryptedVolume(opi_api.storage.v1.DeleteEncryptedVolumeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEncryptedVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an Encrypted Volume
     * </pre>
     */
    public void updateEncryptedVolume(opi_api.storage.v1.UpdateEncryptedVolumeRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.EncryptedVolume> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEncryptedVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List Encrypted Volumes
     * </pre>
     */
    public void listEncryptedVolumes(opi_api.storage.v1.ListEncryptedVolumesRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListEncryptedVolumesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListEncryptedVolumesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an Encrypted Volume
     * </pre>
     */
    public void getEncryptedVolume(opi_api.storage.v1.GetEncryptedVolumeRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.EncryptedVolume> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEncryptedVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an Encrypted Volume statistics
     * </pre>
     */
    public void statsEncryptedVolume(opi_api.storage.v1.StatsEncryptedVolumeRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.StatsEncryptedVolumeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStatsEncryptedVolumeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Middle End (Storage Services) APIs. For example, encryption, compression, raid, QoS, multipath, ...
   * </pre>
   */
  public static final class MiddleendEncryptionServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MiddleendEncryptionServiceBlockingStub> {
    private MiddleendEncryptionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MiddleendEncryptionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MiddleendEncryptionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an Encrypted Volume
     * </pre>
     */
    public opi_api.storage.v1.EncryptedVolume createEncryptedVolume(opi_api.storage.v1.CreateEncryptedVolumeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEncryptedVolumeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an Encrypted Volume
     * </pre>
     */
    public com.google.protobuf.Empty deleteEncryptedVolume(opi_api.storage.v1.DeleteEncryptedVolumeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEncryptedVolumeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an Encrypted Volume
     * </pre>
     */
    public opi_api.storage.v1.EncryptedVolume updateEncryptedVolume(opi_api.storage.v1.UpdateEncryptedVolumeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEncryptedVolumeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List Encrypted Volumes
     * </pre>
     */
    public opi_api.storage.v1.ListEncryptedVolumesResponse listEncryptedVolumes(opi_api.storage.v1.ListEncryptedVolumesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListEncryptedVolumesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an Encrypted Volume
     * </pre>
     */
    public opi_api.storage.v1.EncryptedVolume getEncryptedVolume(opi_api.storage.v1.GetEncryptedVolumeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEncryptedVolumeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an Encrypted Volume statistics
     * </pre>
     */
    public opi_api.storage.v1.StatsEncryptedVolumeResponse statsEncryptedVolume(opi_api.storage.v1.StatsEncryptedVolumeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStatsEncryptedVolumeMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Middle End (Storage Services) APIs. For example, encryption, compression, raid, QoS, multipath, ...
   * </pre>
   */
  public static final class MiddleendEncryptionServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MiddleendEncryptionServiceFutureStub> {
    private MiddleendEncryptionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MiddleendEncryptionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MiddleendEncryptionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an Encrypted Volume
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.EncryptedVolume> createEncryptedVolume(
        opi_api.storage.v1.CreateEncryptedVolumeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEncryptedVolumeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an Encrypted Volume
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteEncryptedVolume(
        opi_api.storage.v1.DeleteEncryptedVolumeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEncryptedVolumeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an Encrypted Volume
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.EncryptedVolume> updateEncryptedVolume(
        opi_api.storage.v1.UpdateEncryptedVolumeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEncryptedVolumeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List Encrypted Volumes
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.ListEncryptedVolumesResponse> listEncryptedVolumes(
        opi_api.storage.v1.ListEncryptedVolumesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListEncryptedVolumesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an Encrypted Volume
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.EncryptedVolume> getEncryptedVolume(
        opi_api.storage.v1.GetEncryptedVolumeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEncryptedVolumeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an Encrypted Volume statistics
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.StatsEncryptedVolumeResponse> statsEncryptedVolume(
        opi_api.storage.v1.StatsEncryptedVolumeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStatsEncryptedVolumeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ENCRYPTED_VOLUME = 0;
  private static final int METHODID_DELETE_ENCRYPTED_VOLUME = 1;
  private static final int METHODID_UPDATE_ENCRYPTED_VOLUME = 2;
  private static final int METHODID_LIST_ENCRYPTED_VOLUMES = 3;
  private static final int METHODID_GET_ENCRYPTED_VOLUME = 4;
  private static final int METHODID_STATS_ENCRYPTED_VOLUME = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MiddleendEncryptionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MiddleendEncryptionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_ENCRYPTED_VOLUME:
          serviceImpl.createEncryptedVolume((opi_api.storage.v1.CreateEncryptedVolumeRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.EncryptedVolume>) responseObserver);
          break;
        case METHODID_DELETE_ENCRYPTED_VOLUME:
          serviceImpl.deleteEncryptedVolume((opi_api.storage.v1.DeleteEncryptedVolumeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_ENCRYPTED_VOLUME:
          serviceImpl.updateEncryptedVolume((opi_api.storage.v1.UpdateEncryptedVolumeRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.EncryptedVolume>) responseObserver);
          break;
        case METHODID_LIST_ENCRYPTED_VOLUMES:
          serviceImpl.listEncryptedVolumes((opi_api.storage.v1.ListEncryptedVolumesRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.ListEncryptedVolumesResponse>) responseObserver);
          break;
        case METHODID_GET_ENCRYPTED_VOLUME:
          serviceImpl.getEncryptedVolume((opi_api.storage.v1.GetEncryptedVolumeRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.EncryptedVolume>) responseObserver);
          break;
        case METHODID_STATS_ENCRYPTED_VOLUME:
          serviceImpl.statsEncryptedVolume((opi_api.storage.v1.StatsEncryptedVolumeRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.StatsEncryptedVolumeResponse>) responseObserver);
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

  private static abstract class MiddleendEncryptionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MiddleendEncryptionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return opi_api.storage.v1.MiddleendEncryptionProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MiddleendEncryptionService");
    }
  }

  private static final class MiddleendEncryptionServiceFileDescriptorSupplier
      extends MiddleendEncryptionServiceBaseDescriptorSupplier {
    MiddleendEncryptionServiceFileDescriptorSupplier() {}
  }

  private static final class MiddleendEncryptionServiceMethodDescriptorSupplier
      extends MiddleendEncryptionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MiddleendEncryptionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MiddleendEncryptionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MiddleendEncryptionServiceFileDescriptorSupplier())
              .addMethod(getCreateEncryptedVolumeMethod())
              .addMethod(getDeleteEncryptedVolumeMethod())
              .addMethod(getUpdateEncryptedVolumeMethod())
              .addMethod(getListEncryptedVolumesMethod())
              .addMethod(getGetEncryptedVolumeMethod())
              .addMethod(getStatsEncryptedVolumeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
