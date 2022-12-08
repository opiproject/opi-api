package opi_api.storage.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Middle End (Storage Services) APIs. For example, encryption, compression, raid, QoS, multipath, ...
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: middleend.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MiddleendServiceGrpc {

  private MiddleendServiceGrpc() {}

  public static final String SERVICE_NAME = "opi_api.storage.v1.MiddleendService";

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
    if ((getCreateEncryptedVolumeMethod = MiddleendServiceGrpc.getCreateEncryptedVolumeMethod) == null) {
      synchronized (MiddleendServiceGrpc.class) {
        if ((getCreateEncryptedVolumeMethod = MiddleendServiceGrpc.getCreateEncryptedVolumeMethod) == null) {
          MiddleendServiceGrpc.getCreateEncryptedVolumeMethod = getCreateEncryptedVolumeMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.CreateEncryptedVolumeRequest, opi_api.storage.v1.EncryptedVolume>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEncryptedVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.CreateEncryptedVolumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.EncryptedVolume.getDefaultInstance()))
              .setSchemaDescriptor(new MiddleendServiceMethodDescriptorSupplier("CreateEncryptedVolume"))
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
    if ((getDeleteEncryptedVolumeMethod = MiddleendServiceGrpc.getDeleteEncryptedVolumeMethod) == null) {
      synchronized (MiddleendServiceGrpc.class) {
        if ((getDeleteEncryptedVolumeMethod = MiddleendServiceGrpc.getDeleteEncryptedVolumeMethod) == null) {
          MiddleendServiceGrpc.getDeleteEncryptedVolumeMethod = getDeleteEncryptedVolumeMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.DeleteEncryptedVolumeRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteEncryptedVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.DeleteEncryptedVolumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new MiddleendServiceMethodDescriptorSupplier("DeleteEncryptedVolume"))
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
    if ((getUpdateEncryptedVolumeMethod = MiddleendServiceGrpc.getUpdateEncryptedVolumeMethod) == null) {
      synchronized (MiddleendServiceGrpc.class) {
        if ((getUpdateEncryptedVolumeMethod = MiddleendServiceGrpc.getUpdateEncryptedVolumeMethod) == null) {
          MiddleendServiceGrpc.getUpdateEncryptedVolumeMethod = getUpdateEncryptedVolumeMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.UpdateEncryptedVolumeRequest, opi_api.storage.v1.EncryptedVolume>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEncryptedVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.UpdateEncryptedVolumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.EncryptedVolume.getDefaultInstance()))
              .setSchemaDescriptor(new MiddleendServiceMethodDescriptorSupplier("UpdateEncryptedVolume"))
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
    if ((getListEncryptedVolumesMethod = MiddleendServiceGrpc.getListEncryptedVolumesMethod) == null) {
      synchronized (MiddleendServiceGrpc.class) {
        if ((getListEncryptedVolumesMethod = MiddleendServiceGrpc.getListEncryptedVolumesMethod) == null) {
          MiddleendServiceGrpc.getListEncryptedVolumesMethod = getListEncryptedVolumesMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.ListEncryptedVolumesRequest, opi_api.storage.v1.ListEncryptedVolumesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListEncryptedVolumes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListEncryptedVolumesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListEncryptedVolumesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MiddleendServiceMethodDescriptorSupplier("ListEncryptedVolumes"))
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
    if ((getGetEncryptedVolumeMethod = MiddleendServiceGrpc.getGetEncryptedVolumeMethod) == null) {
      synchronized (MiddleendServiceGrpc.class) {
        if ((getGetEncryptedVolumeMethod = MiddleendServiceGrpc.getGetEncryptedVolumeMethod) == null) {
          MiddleendServiceGrpc.getGetEncryptedVolumeMethod = getGetEncryptedVolumeMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.GetEncryptedVolumeRequest, opi_api.storage.v1.EncryptedVolume>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEncryptedVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.GetEncryptedVolumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.EncryptedVolume.getDefaultInstance()))
              .setSchemaDescriptor(new MiddleendServiceMethodDescriptorSupplier("GetEncryptedVolume"))
              .build();
        }
      }
    }
    return getGetEncryptedVolumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.EncryptedVolumeStatsRequest,
      opi_api.storage.v1.EncryptedVolumeStatsResponse> getEncryptedVolumeStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EncryptedVolumeStats",
      requestType = opi_api.storage.v1.EncryptedVolumeStatsRequest.class,
      responseType = opi_api.storage.v1.EncryptedVolumeStatsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.EncryptedVolumeStatsRequest,
      opi_api.storage.v1.EncryptedVolumeStatsResponse> getEncryptedVolumeStatsMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.EncryptedVolumeStatsRequest, opi_api.storage.v1.EncryptedVolumeStatsResponse> getEncryptedVolumeStatsMethod;
    if ((getEncryptedVolumeStatsMethod = MiddleendServiceGrpc.getEncryptedVolumeStatsMethod) == null) {
      synchronized (MiddleendServiceGrpc.class) {
        if ((getEncryptedVolumeStatsMethod = MiddleendServiceGrpc.getEncryptedVolumeStatsMethod) == null) {
          MiddleendServiceGrpc.getEncryptedVolumeStatsMethod = getEncryptedVolumeStatsMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.EncryptedVolumeStatsRequest, opi_api.storage.v1.EncryptedVolumeStatsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EncryptedVolumeStats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.EncryptedVolumeStatsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.EncryptedVolumeStatsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MiddleendServiceMethodDescriptorSupplier("EncryptedVolumeStats"))
              .build();
        }
      }
    }
    return getEncryptedVolumeStatsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MiddleendServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MiddleendServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MiddleendServiceStub>() {
        @java.lang.Override
        public MiddleendServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MiddleendServiceStub(channel, callOptions);
        }
      };
    return MiddleendServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MiddleendServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MiddleendServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MiddleendServiceBlockingStub>() {
        @java.lang.Override
        public MiddleendServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MiddleendServiceBlockingStub(channel, callOptions);
        }
      };
    return MiddleendServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MiddleendServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MiddleendServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MiddleendServiceFutureStub>() {
        @java.lang.Override
        public MiddleendServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MiddleendServiceFutureStub(channel, callOptions);
        }
      };
    return MiddleendServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Middle End (Storage Services) APIs. For example, encryption, compression, raid, QoS, multipath, ...
   * </pre>
   */
  public static abstract class MiddleendServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createEncryptedVolume(opi_api.storage.v1.CreateEncryptedVolumeRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.EncryptedVolume> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEncryptedVolumeMethod(), responseObserver);
    }

    /**
     */
    public void deleteEncryptedVolume(opi_api.storage.v1.DeleteEncryptedVolumeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEncryptedVolumeMethod(), responseObserver);
    }

    /**
     */
    public void updateEncryptedVolume(opi_api.storage.v1.UpdateEncryptedVolumeRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.EncryptedVolume> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEncryptedVolumeMethod(), responseObserver);
    }

    /**
     */
    public void listEncryptedVolumes(opi_api.storage.v1.ListEncryptedVolumesRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListEncryptedVolumesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListEncryptedVolumesMethod(), responseObserver);
    }

    /**
     */
    public void getEncryptedVolume(opi_api.storage.v1.GetEncryptedVolumeRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.EncryptedVolume> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEncryptedVolumeMethod(), responseObserver);
    }

    /**
     */
    public void encryptedVolumeStats(opi_api.storage.v1.EncryptedVolumeStatsRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.EncryptedVolumeStatsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEncryptedVolumeStatsMethod(), responseObserver);
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
            getEncryptedVolumeStatsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.EncryptedVolumeStatsRequest,
                opi_api.storage.v1.EncryptedVolumeStatsResponse>(
                  this, METHODID_ENCRYPTED_VOLUME_STATS)))
          .build();
    }
  }

  /**
   * <pre>
   * Middle End (Storage Services) APIs. For example, encryption, compression, raid, QoS, multipath, ...
   * </pre>
   */
  public static final class MiddleendServiceStub extends io.grpc.stub.AbstractAsyncStub<MiddleendServiceStub> {
    private MiddleendServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MiddleendServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MiddleendServiceStub(channel, callOptions);
    }

    /**
     */
    public void createEncryptedVolume(opi_api.storage.v1.CreateEncryptedVolumeRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.EncryptedVolume> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEncryptedVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteEncryptedVolume(opi_api.storage.v1.DeleteEncryptedVolumeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEncryptedVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEncryptedVolume(opi_api.storage.v1.UpdateEncryptedVolumeRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.EncryptedVolume> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEncryptedVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listEncryptedVolumes(opi_api.storage.v1.ListEncryptedVolumesRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListEncryptedVolumesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListEncryptedVolumesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEncryptedVolume(opi_api.storage.v1.GetEncryptedVolumeRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.EncryptedVolume> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEncryptedVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void encryptedVolumeStats(opi_api.storage.v1.EncryptedVolumeStatsRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.EncryptedVolumeStatsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEncryptedVolumeStatsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Middle End (Storage Services) APIs. For example, encryption, compression, raid, QoS, multipath, ...
   * </pre>
   */
  public static final class MiddleendServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MiddleendServiceBlockingStub> {
    private MiddleendServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MiddleendServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MiddleendServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public opi_api.storage.v1.EncryptedVolume createEncryptedVolume(opi_api.storage.v1.CreateEncryptedVolumeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEncryptedVolumeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteEncryptedVolume(opi_api.storage.v1.DeleteEncryptedVolumeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEncryptedVolumeMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.EncryptedVolume updateEncryptedVolume(opi_api.storage.v1.UpdateEncryptedVolumeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEncryptedVolumeMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.ListEncryptedVolumesResponse listEncryptedVolumes(opi_api.storage.v1.ListEncryptedVolumesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListEncryptedVolumesMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.EncryptedVolume getEncryptedVolume(opi_api.storage.v1.GetEncryptedVolumeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEncryptedVolumeMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.EncryptedVolumeStatsResponse encryptedVolumeStats(opi_api.storage.v1.EncryptedVolumeStatsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEncryptedVolumeStatsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Middle End (Storage Services) APIs. For example, encryption, compression, raid, QoS, multipath, ...
   * </pre>
   */
  public static final class MiddleendServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MiddleendServiceFutureStub> {
    private MiddleendServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MiddleendServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MiddleendServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.EncryptedVolume> createEncryptedVolume(
        opi_api.storage.v1.CreateEncryptedVolumeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEncryptedVolumeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteEncryptedVolume(
        opi_api.storage.v1.DeleteEncryptedVolumeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEncryptedVolumeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.EncryptedVolume> updateEncryptedVolume(
        opi_api.storage.v1.UpdateEncryptedVolumeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEncryptedVolumeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.ListEncryptedVolumesResponse> listEncryptedVolumes(
        opi_api.storage.v1.ListEncryptedVolumesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListEncryptedVolumesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.EncryptedVolume> getEncryptedVolume(
        opi_api.storage.v1.GetEncryptedVolumeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEncryptedVolumeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.EncryptedVolumeStatsResponse> encryptedVolumeStats(
        opi_api.storage.v1.EncryptedVolumeStatsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEncryptedVolumeStatsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ENCRYPTED_VOLUME = 0;
  private static final int METHODID_DELETE_ENCRYPTED_VOLUME = 1;
  private static final int METHODID_UPDATE_ENCRYPTED_VOLUME = 2;
  private static final int METHODID_LIST_ENCRYPTED_VOLUMES = 3;
  private static final int METHODID_GET_ENCRYPTED_VOLUME = 4;
  private static final int METHODID_ENCRYPTED_VOLUME_STATS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MiddleendServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MiddleendServiceImplBase serviceImpl, int methodId) {
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
        case METHODID_ENCRYPTED_VOLUME_STATS:
          serviceImpl.encryptedVolumeStats((opi_api.storage.v1.EncryptedVolumeStatsRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.EncryptedVolumeStatsResponse>) responseObserver);
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

  private static abstract class MiddleendServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MiddleendServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return opi_api.storage.v1.MiddleendProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MiddleendService");
    }
  }

  private static final class MiddleendServiceFileDescriptorSupplier
      extends MiddleendServiceBaseDescriptorSupplier {
    MiddleendServiceFileDescriptorSupplier() {}
  }

  private static final class MiddleendServiceMethodDescriptorSupplier
      extends MiddleendServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MiddleendServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MiddleendServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MiddleendServiceFileDescriptorSupplier())
              .addMethod(getCreateEncryptedVolumeMethod())
              .addMethod(getDeleteEncryptedVolumeMethod())
              .addMethod(getUpdateEncryptedVolumeMethod())
              .addMethod(getListEncryptedVolumesMethod())
              .addMethod(getGetEncryptedVolumeMethod())
              .addMethod(getEncryptedVolumeStatsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
