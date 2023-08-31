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
  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.CreateVirtioBlkRequest,
      opi_api.storage.v1.VirtioBlk> getCreateVirtioBlkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateVirtioBlk",
      requestType = opi_api.storage.v1.CreateVirtioBlkRequest.class,
      responseType = opi_api.storage.v1.VirtioBlk.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.CreateVirtioBlkRequest,
      opi_api.storage.v1.VirtioBlk> getCreateVirtioBlkMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.CreateVirtioBlkRequest, opi_api.storage.v1.VirtioBlk> getCreateVirtioBlkMethod;
    if ((getCreateVirtioBlkMethod = FrontendVirtioBlkServiceGrpc.getCreateVirtioBlkMethod) == null) {
      synchronized (FrontendVirtioBlkServiceGrpc.class) {
        if ((getCreateVirtioBlkMethod = FrontendVirtioBlkServiceGrpc.getCreateVirtioBlkMethod) == null) {
          FrontendVirtioBlkServiceGrpc.getCreateVirtioBlkMethod = getCreateVirtioBlkMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.CreateVirtioBlkRequest, opi_api.storage.v1.VirtioBlk>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateVirtioBlk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.CreateVirtioBlkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioBlk.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioBlkServiceMethodDescriptorSupplier("CreateVirtioBlk"))
              .build();
        }
      }
    }
    return getCreateVirtioBlkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteVirtioBlkRequest,
      com.google.protobuf.Empty> getDeleteVirtioBlkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteVirtioBlk",
      requestType = opi_api.storage.v1.DeleteVirtioBlkRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteVirtioBlkRequest,
      com.google.protobuf.Empty> getDeleteVirtioBlkMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteVirtioBlkRequest, com.google.protobuf.Empty> getDeleteVirtioBlkMethod;
    if ((getDeleteVirtioBlkMethod = FrontendVirtioBlkServiceGrpc.getDeleteVirtioBlkMethod) == null) {
      synchronized (FrontendVirtioBlkServiceGrpc.class) {
        if ((getDeleteVirtioBlkMethod = FrontendVirtioBlkServiceGrpc.getDeleteVirtioBlkMethod) == null) {
          FrontendVirtioBlkServiceGrpc.getDeleteVirtioBlkMethod = getDeleteVirtioBlkMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.DeleteVirtioBlkRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteVirtioBlk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.DeleteVirtioBlkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioBlkServiceMethodDescriptorSupplier("DeleteVirtioBlk"))
              .build();
        }
      }
    }
    return getDeleteVirtioBlkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateVirtioBlkRequest,
      opi_api.storage.v1.VirtioBlk> getUpdateVirtioBlkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateVirtioBlk",
      requestType = opi_api.storage.v1.UpdateVirtioBlkRequest.class,
      responseType = opi_api.storage.v1.VirtioBlk.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateVirtioBlkRequest,
      opi_api.storage.v1.VirtioBlk> getUpdateVirtioBlkMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateVirtioBlkRequest, opi_api.storage.v1.VirtioBlk> getUpdateVirtioBlkMethod;
    if ((getUpdateVirtioBlkMethod = FrontendVirtioBlkServiceGrpc.getUpdateVirtioBlkMethod) == null) {
      synchronized (FrontendVirtioBlkServiceGrpc.class) {
        if ((getUpdateVirtioBlkMethod = FrontendVirtioBlkServiceGrpc.getUpdateVirtioBlkMethod) == null) {
          FrontendVirtioBlkServiceGrpc.getUpdateVirtioBlkMethod = getUpdateVirtioBlkMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.UpdateVirtioBlkRequest, opi_api.storage.v1.VirtioBlk>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateVirtioBlk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.UpdateVirtioBlkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioBlk.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioBlkServiceMethodDescriptorSupplier("UpdateVirtioBlk"))
              .build();
        }
      }
    }
    return getUpdateVirtioBlkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.ListVirtioBlksRequest,
      opi_api.storage.v1.ListVirtioBlksResponse> getListVirtioBlksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListVirtioBlks",
      requestType = opi_api.storage.v1.ListVirtioBlksRequest.class,
      responseType = opi_api.storage.v1.ListVirtioBlksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.ListVirtioBlksRequest,
      opi_api.storage.v1.ListVirtioBlksResponse> getListVirtioBlksMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.ListVirtioBlksRequest, opi_api.storage.v1.ListVirtioBlksResponse> getListVirtioBlksMethod;
    if ((getListVirtioBlksMethod = FrontendVirtioBlkServiceGrpc.getListVirtioBlksMethod) == null) {
      synchronized (FrontendVirtioBlkServiceGrpc.class) {
        if ((getListVirtioBlksMethod = FrontendVirtioBlkServiceGrpc.getListVirtioBlksMethod) == null) {
          FrontendVirtioBlkServiceGrpc.getListVirtioBlksMethod = getListVirtioBlksMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.ListVirtioBlksRequest, opi_api.storage.v1.ListVirtioBlksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListVirtioBlks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListVirtioBlksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListVirtioBlksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioBlkServiceMethodDescriptorSupplier("ListVirtioBlks"))
              .build();
        }
      }
    }
    return getListVirtioBlksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.GetVirtioBlkRequest,
      opi_api.storage.v1.VirtioBlk> getGetVirtioBlkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVirtioBlk",
      requestType = opi_api.storage.v1.GetVirtioBlkRequest.class,
      responseType = opi_api.storage.v1.VirtioBlk.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.GetVirtioBlkRequest,
      opi_api.storage.v1.VirtioBlk> getGetVirtioBlkMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.GetVirtioBlkRequest, opi_api.storage.v1.VirtioBlk> getGetVirtioBlkMethod;
    if ((getGetVirtioBlkMethod = FrontendVirtioBlkServiceGrpc.getGetVirtioBlkMethod) == null) {
      synchronized (FrontendVirtioBlkServiceGrpc.class) {
        if ((getGetVirtioBlkMethod = FrontendVirtioBlkServiceGrpc.getGetVirtioBlkMethod) == null) {
          FrontendVirtioBlkServiceGrpc.getGetVirtioBlkMethod = getGetVirtioBlkMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.GetVirtioBlkRequest, opi_api.storage.v1.VirtioBlk>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetVirtioBlk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.GetVirtioBlkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.VirtioBlk.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioBlkServiceMethodDescriptorSupplier("GetVirtioBlk"))
              .build();
        }
      }
    }
    return getGetVirtioBlkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.StatsVirtioBlkRequest,
      opi_api.storage.v1.StatsVirtioBlkResponse> getStatsVirtioBlkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StatsVirtioBlk",
      requestType = opi_api.storage.v1.StatsVirtioBlkRequest.class,
      responseType = opi_api.storage.v1.StatsVirtioBlkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.StatsVirtioBlkRequest,
      opi_api.storage.v1.StatsVirtioBlkResponse> getStatsVirtioBlkMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.StatsVirtioBlkRequest, opi_api.storage.v1.StatsVirtioBlkResponse> getStatsVirtioBlkMethod;
    if ((getStatsVirtioBlkMethod = FrontendVirtioBlkServiceGrpc.getStatsVirtioBlkMethod) == null) {
      synchronized (FrontendVirtioBlkServiceGrpc.class) {
        if ((getStatsVirtioBlkMethod = FrontendVirtioBlkServiceGrpc.getStatsVirtioBlkMethod) == null) {
          FrontendVirtioBlkServiceGrpc.getStatsVirtioBlkMethod = getStatsVirtioBlkMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.StatsVirtioBlkRequest, opi_api.storage.v1.StatsVirtioBlkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StatsVirtioBlk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.StatsVirtioBlkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.StatsVirtioBlkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FrontendVirtioBlkServiceMethodDescriptorSupplier("StatsVirtioBlk"))
              .build();
        }
      }
    }
    return getStatsVirtioBlkMethod;
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
     * <pre>
     * Create an Virtio Blk
     * </pre>
     */
    public void createVirtioBlk(opi_api.storage.v1.CreateVirtioBlkRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioBlk> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateVirtioBlkMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an Virtio Blk
     * </pre>
     */
    public void deleteVirtioBlk(opi_api.storage.v1.DeleteVirtioBlkRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteVirtioBlkMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an Virtio Blk
     * </pre>
     */
    public void updateVirtioBlk(opi_api.storage.v1.UpdateVirtioBlkRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioBlk> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateVirtioBlkMethod(), responseObserver);
    }

    /**
     * <pre>
     * List Virtio Blks
     * </pre>
     */
    public void listVirtioBlks(opi_api.storage.v1.ListVirtioBlksRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListVirtioBlksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListVirtioBlksMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an Virtio Blk
     * </pre>
     */
    public void getVirtioBlk(opi_api.storage.v1.GetVirtioBlkRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioBlk> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVirtioBlkMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an Virtio Blk statistics
     * </pre>
     */
    public void statsVirtioBlk(opi_api.storage.v1.StatsVirtioBlkRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.StatsVirtioBlkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStatsVirtioBlkMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateVirtioBlkMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.CreateVirtioBlkRequest,
                opi_api.storage.v1.VirtioBlk>(
                  this, METHODID_CREATE_VIRTIO_BLK)))
          .addMethod(
            getDeleteVirtioBlkMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.DeleteVirtioBlkRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_VIRTIO_BLK)))
          .addMethod(
            getUpdateVirtioBlkMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.UpdateVirtioBlkRequest,
                opi_api.storage.v1.VirtioBlk>(
                  this, METHODID_UPDATE_VIRTIO_BLK)))
          .addMethod(
            getListVirtioBlksMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.ListVirtioBlksRequest,
                opi_api.storage.v1.ListVirtioBlksResponse>(
                  this, METHODID_LIST_VIRTIO_BLKS)))
          .addMethod(
            getGetVirtioBlkMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.GetVirtioBlkRequest,
                opi_api.storage.v1.VirtioBlk>(
                  this, METHODID_GET_VIRTIO_BLK)))
          .addMethod(
            getStatsVirtioBlkMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.StatsVirtioBlkRequest,
                opi_api.storage.v1.StatsVirtioBlkResponse>(
                  this, METHODID_STATS_VIRTIO_BLK)))
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
     * <pre>
     * Create an Virtio Blk
     * </pre>
     */
    public void createVirtioBlk(opi_api.storage.v1.CreateVirtioBlkRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioBlk> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateVirtioBlkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an Virtio Blk
     * </pre>
     */
    public void deleteVirtioBlk(opi_api.storage.v1.DeleteVirtioBlkRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteVirtioBlkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an Virtio Blk
     * </pre>
     */
    public void updateVirtioBlk(opi_api.storage.v1.UpdateVirtioBlkRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioBlk> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateVirtioBlkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List Virtio Blks
     * </pre>
     */
    public void listVirtioBlks(opi_api.storage.v1.ListVirtioBlksRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListVirtioBlksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListVirtioBlksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an Virtio Blk
     * </pre>
     */
    public void getVirtioBlk(opi_api.storage.v1.GetVirtioBlkRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioBlk> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVirtioBlkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an Virtio Blk statistics
     * </pre>
     */
    public void statsVirtioBlk(opi_api.storage.v1.StatsVirtioBlkRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.StatsVirtioBlkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStatsVirtioBlkMethod(), getCallOptions()), request, responseObserver);
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
     * <pre>
     * Create an Virtio Blk
     * </pre>
     */
    public opi_api.storage.v1.VirtioBlk createVirtioBlk(opi_api.storage.v1.CreateVirtioBlkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateVirtioBlkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an Virtio Blk
     * </pre>
     */
    public com.google.protobuf.Empty deleteVirtioBlk(opi_api.storage.v1.DeleteVirtioBlkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteVirtioBlkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an Virtio Blk
     * </pre>
     */
    public opi_api.storage.v1.VirtioBlk updateVirtioBlk(opi_api.storage.v1.UpdateVirtioBlkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateVirtioBlkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List Virtio Blks
     * </pre>
     */
    public opi_api.storage.v1.ListVirtioBlksResponse listVirtioBlks(opi_api.storage.v1.ListVirtioBlksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListVirtioBlksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an Virtio Blk
     * </pre>
     */
    public opi_api.storage.v1.VirtioBlk getVirtioBlk(opi_api.storage.v1.GetVirtioBlkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVirtioBlkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an Virtio Blk statistics
     * </pre>
     */
    public opi_api.storage.v1.StatsVirtioBlkResponse statsVirtioBlk(opi_api.storage.v1.StatsVirtioBlkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStatsVirtioBlkMethod(), getCallOptions(), request);
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
     * <pre>
     * Create an Virtio Blk
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.VirtioBlk> createVirtioBlk(
        opi_api.storage.v1.CreateVirtioBlkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateVirtioBlkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an Virtio Blk
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteVirtioBlk(
        opi_api.storage.v1.DeleteVirtioBlkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteVirtioBlkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an Virtio Blk
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.VirtioBlk> updateVirtioBlk(
        opi_api.storage.v1.UpdateVirtioBlkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateVirtioBlkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List Virtio Blks
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.ListVirtioBlksResponse> listVirtioBlks(
        opi_api.storage.v1.ListVirtioBlksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListVirtioBlksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an Virtio Blk
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.VirtioBlk> getVirtioBlk(
        opi_api.storage.v1.GetVirtioBlkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVirtioBlkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an Virtio Blk statistics
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.StatsVirtioBlkResponse> statsVirtioBlk(
        opi_api.storage.v1.StatsVirtioBlkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStatsVirtioBlkMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_VIRTIO_BLK = 0;
  private static final int METHODID_DELETE_VIRTIO_BLK = 1;
  private static final int METHODID_UPDATE_VIRTIO_BLK = 2;
  private static final int METHODID_LIST_VIRTIO_BLKS = 3;
  private static final int METHODID_GET_VIRTIO_BLK = 4;
  private static final int METHODID_STATS_VIRTIO_BLK = 5;

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
        case METHODID_CREATE_VIRTIO_BLK:
          serviceImpl.createVirtioBlk((opi_api.storage.v1.CreateVirtioBlkRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioBlk>) responseObserver);
          break;
        case METHODID_DELETE_VIRTIO_BLK:
          serviceImpl.deleteVirtioBlk((opi_api.storage.v1.DeleteVirtioBlkRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_VIRTIO_BLK:
          serviceImpl.updateVirtioBlk((opi_api.storage.v1.UpdateVirtioBlkRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioBlk>) responseObserver);
          break;
        case METHODID_LIST_VIRTIO_BLKS:
          serviceImpl.listVirtioBlks((opi_api.storage.v1.ListVirtioBlksRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.ListVirtioBlksResponse>) responseObserver);
          break;
        case METHODID_GET_VIRTIO_BLK:
          serviceImpl.getVirtioBlk((opi_api.storage.v1.GetVirtioBlkRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.VirtioBlk>) responseObserver);
          break;
        case METHODID_STATS_VIRTIO_BLK:
          serviceImpl.statsVirtioBlk((opi_api.storage.v1.StatsVirtioBlkRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.StatsVirtioBlkResponse>) responseObserver);
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
              .addMethod(getCreateVirtioBlkMethod())
              .addMethod(getDeleteVirtioBlkMethod())
              .addMethod(getUpdateVirtioBlkMethod())
              .addMethod(getListVirtioBlksMethod())
              .addMethod(getGetVirtioBlkMethod())
              .addMethod(getStatsVirtioBlkMethod())
              .build();
        }
      }
    }
    return result;
  }
}
