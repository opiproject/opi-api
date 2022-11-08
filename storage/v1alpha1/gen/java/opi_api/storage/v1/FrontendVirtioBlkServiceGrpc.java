package opi_api.storage.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Front End (host-facing) APIs. Mostly used for Virtio-blk emulation emulation and host presentation as alternative to Nvme.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: frontend_virtio_blk.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FrontendVirtioBlkServiceGrpc {

  private FrontendVirtioBlkServiceGrpc() {}

  public static final String SERVICE_NAME = "opi_api.storage.v1.FrontendVirtioBlkService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioBlkCreateRequest,
      opi_api.storage.v1.VirtioBlk> getVirtioBlkCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VirtioBlkCreate",
      requestType = opi_api.storage.v1.VirtioBlkCreateRequest.class,
      responseType = opi_api.storage.v1.VirtioBlk.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioBlkCreateRequest,
      opi_api.storage.v1.VirtioBlk> getVirtioBlkCreateMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioBlkCreateRequest, opi_api.storage.v1.VirtioBlk> getVirtioBlkCreateMethod;
    if ((getVirtioBlkCreateMethod = FrontendVirtioBlkServiceGrpc.getVirtioBlkCreateMethod) == null) {
      synchronized (FrontendVirtioBlkServiceGrpc.class) {
        if ((getVirtioBlkCreateMethod = FrontendVirtioBlkServiceGrpc.getVirtioBlkCreateMethod) == null) {
          FrontendVirtioBlkServiceGrpc.getVirtioBlkCreateMethod = getVirtioBlkCreateMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.VirtioBlkCreateRequest, opi_api.storage.v1.VirtioBlk>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VirtioBlkCreate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioBlkCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioBlk.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioBlkServiceMethodDescriptorSupplier("VirtioBlkCreate"))
              .build();
        }
      }
    }
    return getVirtioBlkCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioBlkDeleteRequest,
      com.google.protobuf.Empty> getVirtioBlkDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VirtioBlkDelete",
      requestType = opi_api.storage.v1.VirtioBlkDeleteRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioBlkDeleteRequest,
      com.google.protobuf.Empty> getVirtioBlkDeleteMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioBlkDeleteRequest, com.google.protobuf.Empty> getVirtioBlkDeleteMethod;
    if ((getVirtioBlkDeleteMethod = FrontendVirtioBlkServiceGrpc.getVirtioBlkDeleteMethod) == null) {
      synchronized (FrontendVirtioBlkServiceGrpc.class) {
        if ((getVirtioBlkDeleteMethod = FrontendVirtioBlkServiceGrpc.getVirtioBlkDeleteMethod) == null) {
          FrontendVirtioBlkServiceGrpc.getVirtioBlkDeleteMethod = getVirtioBlkDeleteMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.VirtioBlkDeleteRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VirtioBlkDelete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioBlkDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioBlkServiceMethodDescriptorSupplier("VirtioBlkDelete"))
              .build();
        }
      }
    }
    return getVirtioBlkDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioBlkUpdateRequest,
      opi_api.storage.v1.VirtioBlk> getVirtioBlkUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VirtioBlkUpdate",
      requestType = opi_api.storage.v1.VirtioBlkUpdateRequest.class,
      responseType = opi_api.storage.v1.VirtioBlk.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioBlkUpdateRequest,
      opi_api.storage.v1.VirtioBlk> getVirtioBlkUpdateMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioBlkUpdateRequest, opi_api.storage.v1.VirtioBlk> getVirtioBlkUpdateMethod;
    if ((getVirtioBlkUpdateMethod = FrontendVirtioBlkServiceGrpc.getVirtioBlkUpdateMethod) == null) {
      synchronized (FrontendVirtioBlkServiceGrpc.class) {
        if ((getVirtioBlkUpdateMethod = FrontendVirtioBlkServiceGrpc.getVirtioBlkUpdateMethod) == null) {
          FrontendVirtioBlkServiceGrpc.getVirtioBlkUpdateMethod = getVirtioBlkUpdateMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.VirtioBlkUpdateRequest, opi_api.storage.v1.VirtioBlk>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VirtioBlkUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioBlkUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioBlk.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioBlkServiceMethodDescriptorSupplier("VirtioBlkUpdate"))
              .build();
        }
      }
    }
    return getVirtioBlkUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioBlkListRequest,
      opi_api.storage.v1.VirtioBlkListResponse> getVirtioBlkListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VirtioBlkList",
      requestType = opi_api.storage.v1.VirtioBlkListRequest.class,
      responseType = opi_api.storage.v1.VirtioBlkListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioBlkListRequest,
      opi_api.storage.v1.VirtioBlkListResponse> getVirtioBlkListMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioBlkListRequest, opi_api.storage.v1.VirtioBlkListResponse> getVirtioBlkListMethod;
    if ((getVirtioBlkListMethod = FrontendVirtioBlkServiceGrpc.getVirtioBlkListMethod) == null) {
      synchronized (FrontendVirtioBlkServiceGrpc.class) {
        if ((getVirtioBlkListMethod = FrontendVirtioBlkServiceGrpc.getVirtioBlkListMethod) == null) {
          FrontendVirtioBlkServiceGrpc.getVirtioBlkListMethod = getVirtioBlkListMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.VirtioBlkListRequest, opi_api.storage.v1.VirtioBlkListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VirtioBlkList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioBlkListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioBlkListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioBlkServiceMethodDescriptorSupplier("VirtioBlkList"))
              .build();
        }
      }
    }
    return getVirtioBlkListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioBlkGetRequest,
      opi_api.storage.v1.VirtioBlk> getVirtioBlkGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VirtioBlkGet",
      requestType = opi_api.storage.v1.VirtioBlkGetRequest.class,
      responseType = opi_api.storage.v1.VirtioBlk.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioBlkGetRequest,
      opi_api.storage.v1.VirtioBlk> getVirtioBlkGetMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioBlkGetRequest, opi_api.storage.v1.VirtioBlk> getVirtioBlkGetMethod;
    if ((getVirtioBlkGetMethod = FrontendVirtioBlkServiceGrpc.getVirtioBlkGetMethod) == null) {
      synchronized (FrontendVirtioBlkServiceGrpc.class) {
        if ((getVirtioBlkGetMethod = FrontendVirtioBlkServiceGrpc.getVirtioBlkGetMethod) == null) {
          FrontendVirtioBlkServiceGrpc.getVirtioBlkGetMethod = getVirtioBlkGetMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.VirtioBlkGetRequest, opi_api.storage.v1.VirtioBlk>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VirtioBlkGet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioBlkGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioBlk.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioBlkServiceMethodDescriptorSupplier("VirtioBlkGet"))
              .build();
        }
      }
    }
    return getVirtioBlkGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioBlkStatsRequest,
      opi_api.storage.v1.VirtioBlkStatsResponse> getVirtioBlkStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VirtioBlkStats",
      requestType = opi_api.storage.v1.VirtioBlkStatsRequest.class,
      responseType = opi_api.storage.v1.VirtioBlkStatsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioBlkStatsRequest,
      opi_api.storage.v1.VirtioBlkStatsResponse> getVirtioBlkStatsMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.VirtioBlkStatsRequest, opi_api.storage.v1.VirtioBlkStatsResponse> getVirtioBlkStatsMethod;
    if ((getVirtioBlkStatsMethod = FrontendVirtioBlkServiceGrpc.getVirtioBlkStatsMethod) == null) {
      synchronized (FrontendVirtioBlkServiceGrpc.class) {
        if ((getVirtioBlkStatsMethod = FrontendVirtioBlkServiceGrpc.getVirtioBlkStatsMethod) == null) {
          FrontendVirtioBlkServiceGrpc.getVirtioBlkStatsMethod = getVirtioBlkStatsMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.VirtioBlkStatsRequest, opi_api.storage.v1.VirtioBlkStatsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VirtioBlkStats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioBlkStatsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioBlkStatsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioBlkServiceMethodDescriptorSupplier("VirtioBlkStats"))
              .build();
        }
      }
    }
    return getVirtioBlkStatsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FrontendVirtioBlkServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FrontendVirtioBlkServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FrontendVirtioBlkServiceStub>() {
        @java.lang.Override
        public FrontendVirtioBlkServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FrontendVirtioBlkServiceStub(channel, callOptions);
        }
      };
    return FrontendVirtioBlkServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FrontendVirtioBlkServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FrontendVirtioBlkServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FrontendVirtioBlkServiceBlockingStub>() {
        @java.lang.Override
        public FrontendVirtioBlkServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FrontendVirtioBlkServiceBlockingStub(channel, callOptions);
        }
      };
    return FrontendVirtioBlkServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FrontendVirtioBlkServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FrontendVirtioBlkServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FrontendVirtioBlkServiceFutureStub>() {
        @java.lang.Override
        public FrontendVirtioBlkServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FrontendVirtioBlkServiceFutureStub(channel, callOptions);
        }
      };
    return FrontendVirtioBlkServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Front End (host-facing) APIs. Mostly used for Virtio-blk emulation emulation and host presentation as alternative to Nvme.
   * </pre>
   */
  public static abstract class FrontendVirtioBlkServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void virtioBlkCreate(opi_api.storage.v1.VirtioBlkCreateRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioBlk> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVirtioBlkCreateMethod(), responseObserver);
    }

    /**
     */
    public void virtioBlkDelete(opi_api.storage.v1.VirtioBlkDeleteRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVirtioBlkDeleteMethod(), responseObserver);
    }

    /**
     */
    public void virtioBlkUpdate(opi_api.storage.v1.VirtioBlkUpdateRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioBlk> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVirtioBlkUpdateMethod(), responseObserver);
    }

    /**
     */
    public void virtioBlkList(opi_api.storage.v1.VirtioBlkListRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioBlkListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVirtioBlkListMethod(), responseObserver);
    }

    /**
     */
    public void virtioBlkGet(opi_api.storage.v1.VirtioBlkGetRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioBlk> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVirtioBlkGetMethod(), responseObserver);
    }

    /**
     */
    public void virtioBlkStats(opi_api.storage.v1.VirtioBlkStatsRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioBlkStatsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVirtioBlkStatsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getVirtioBlkCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.VirtioBlkCreateRequest,
                opi_api.storage.v1.VirtioBlk>(
                  this, METHODID_VIRTIO_BLK_CREATE)))
          .addMethod(
            getVirtioBlkDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.VirtioBlkDeleteRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_VIRTIO_BLK_DELETE)))
          .addMethod(
            getVirtioBlkUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.VirtioBlkUpdateRequest,
                opi_api.storage.v1.VirtioBlk>(
                  this, METHODID_VIRTIO_BLK_UPDATE)))
          .addMethod(
            getVirtioBlkListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.VirtioBlkListRequest,
                opi_api.storage.v1.VirtioBlkListResponse>(
                  this, METHODID_VIRTIO_BLK_LIST)))
          .addMethod(
            getVirtioBlkGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.VirtioBlkGetRequest,
                opi_api.storage.v1.VirtioBlk>(
                  this, METHODID_VIRTIO_BLK_GET)))
          .addMethod(
            getVirtioBlkStatsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.VirtioBlkStatsRequest,
                opi_api.storage.v1.VirtioBlkStatsResponse>(
                  this, METHODID_VIRTIO_BLK_STATS)))
          .build();
    }
  }

  /**
   * <pre>
   * Front End (host-facing) APIs. Mostly used for Virtio-blk emulation emulation and host presentation as alternative to Nvme.
   * </pre>
   */
  public static final class FrontendVirtioBlkServiceStub extends io.grpc.stub.AbstractAsyncStub<FrontendVirtioBlkServiceStub> {
    private FrontendVirtioBlkServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FrontendVirtioBlkServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FrontendVirtioBlkServiceStub(channel, callOptions);
    }

    /**
     */
    public void virtioBlkCreate(opi_api.storage.v1.VirtioBlkCreateRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioBlk> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVirtioBlkCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void virtioBlkDelete(opi_api.storage.v1.VirtioBlkDeleteRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVirtioBlkDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void virtioBlkUpdate(opi_api.storage.v1.VirtioBlkUpdateRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioBlk> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVirtioBlkUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void virtioBlkList(opi_api.storage.v1.VirtioBlkListRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioBlkListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVirtioBlkListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void virtioBlkGet(opi_api.storage.v1.VirtioBlkGetRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioBlk> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVirtioBlkGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void virtioBlkStats(opi_api.storage.v1.VirtioBlkStatsRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioBlkStatsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVirtioBlkStatsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Front End (host-facing) APIs. Mostly used for Virtio-blk emulation emulation and host presentation as alternative to Nvme.
   * </pre>
   */
  public static final class FrontendVirtioBlkServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<FrontendVirtioBlkServiceBlockingStub> {
    private FrontendVirtioBlkServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FrontendVirtioBlkServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FrontendVirtioBlkServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public opi_api.storage.v1.VirtioBlk virtioBlkCreate(opi_api.storage.v1.VirtioBlkCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVirtioBlkCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty virtioBlkDelete(opi_api.storage.v1.VirtioBlkDeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVirtioBlkDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.VirtioBlk virtioBlkUpdate(opi_api.storage.v1.VirtioBlkUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVirtioBlkUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.VirtioBlkListResponse virtioBlkList(opi_api.storage.v1.VirtioBlkListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVirtioBlkListMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.VirtioBlk virtioBlkGet(opi_api.storage.v1.VirtioBlkGetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVirtioBlkGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.VirtioBlkStatsResponse virtioBlkStats(opi_api.storage.v1.VirtioBlkStatsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVirtioBlkStatsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Front End (host-facing) APIs. Mostly used for Virtio-blk emulation emulation and host presentation as alternative to Nvme.
   * </pre>
   */
  public static final class FrontendVirtioBlkServiceFutureStub extends io.grpc.stub.AbstractFutureStub<FrontendVirtioBlkServiceFutureStub> {
    private FrontendVirtioBlkServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FrontendVirtioBlkServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FrontendVirtioBlkServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.VirtioBlk> virtioBlkCreate(
        opi_api.storage.v1.VirtioBlkCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVirtioBlkCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> virtioBlkDelete(
        opi_api.storage.v1.VirtioBlkDeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVirtioBlkDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.VirtioBlk> virtioBlkUpdate(
        opi_api.storage.v1.VirtioBlkUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVirtioBlkUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.VirtioBlkListResponse> virtioBlkList(
        opi_api.storage.v1.VirtioBlkListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVirtioBlkListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.VirtioBlk> virtioBlkGet(
        opi_api.storage.v1.VirtioBlkGetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVirtioBlkGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.VirtioBlkStatsResponse> virtioBlkStats(
        opi_api.storage.v1.VirtioBlkStatsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVirtioBlkStatsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_VIRTIO_BLK_CREATE = 0;
  private static final int METHODID_VIRTIO_BLK_DELETE = 1;
  private static final int METHODID_VIRTIO_BLK_UPDATE = 2;
  private static final int METHODID_VIRTIO_BLK_LIST = 3;
  private static final int METHODID_VIRTIO_BLK_GET = 4;
  private static final int METHODID_VIRTIO_BLK_STATS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FrontendVirtioBlkServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FrontendVirtioBlkServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_VIRTIO_BLK_CREATE:
          serviceImpl.virtioBlkCreate((opi_api.storage.v1.VirtioBlkCreateRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioBlk>) responseObserver);
          break;
        case METHODID_VIRTIO_BLK_DELETE:
          serviceImpl.virtioBlkDelete((opi_api.storage.v1.VirtioBlkDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_VIRTIO_BLK_UPDATE:
          serviceImpl.virtioBlkUpdate((opi_api.storage.v1.VirtioBlkUpdateRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioBlk>) responseObserver);
          break;
        case METHODID_VIRTIO_BLK_LIST:
          serviceImpl.virtioBlkList((opi_api.storage.v1.VirtioBlkListRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioBlkListResponse>) responseObserver);
          break;
        case METHODID_VIRTIO_BLK_GET:
          serviceImpl.virtioBlkGet((opi_api.storage.v1.VirtioBlkGetRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioBlk>) responseObserver);
          break;
        case METHODID_VIRTIO_BLK_STATS:
          serviceImpl.virtioBlkStats((opi_api.storage.v1.VirtioBlkStatsRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioBlkStatsResponse>) responseObserver);
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

  private static abstract class FrontendVirtioBlkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FrontendVirtioBlkServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return opi_api.storage.v1.FrontendVirtioBlkProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FrontendVirtioBlkService");
    }
  }

  private static final class FrontendVirtioBlkServiceFileDescriptorSupplier
      extends FrontendVirtioBlkServiceBaseDescriptorSupplier {
    FrontendVirtioBlkServiceFileDescriptorSupplier() {}
  }

  private static final class FrontendVirtioBlkServiceMethodDescriptorSupplier
      extends FrontendVirtioBlkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FrontendVirtioBlkServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FrontendVirtioBlkServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FrontendVirtioBlkServiceFileDescriptorSupplier())
              .addMethod(getVirtioBlkCreateMethod())
              .addMethod(getVirtioBlkDeleteMethod())
              .addMethod(getVirtioBlkUpdateMethod())
              .addMethod(getVirtioBlkListMethod())
              .addMethod(getVirtioBlkGetMethod())
              .addMethod(getVirtioBlkStatsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
