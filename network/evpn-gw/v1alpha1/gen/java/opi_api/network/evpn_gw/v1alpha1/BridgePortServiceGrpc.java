package opi_api.network.evpn_gw.v1alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Management of BridgePort resources
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: l2_xpu_infra_mgr.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BridgePortServiceGrpc {

  private BridgePortServiceGrpc() {}

  public static final String SERVICE_NAME = "opi_api.network.evpn_gw.v1alpha1.BridgePortService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest,
      opi_api.network.evpn_gw.v1alpha1.BridgePort> getCreateBridgePortMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBridgePort",
      requestType = opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest.class,
      responseType = opi_api.network.evpn_gw.v1alpha1.BridgePort.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest,
      opi_api.network.evpn_gw.v1alpha1.BridgePort> getCreateBridgePortMethod() {
    io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest, opi_api.network.evpn_gw.v1alpha1.BridgePort> getCreateBridgePortMethod;
    if ((getCreateBridgePortMethod = BridgePortServiceGrpc.getCreateBridgePortMethod) == null) {
      synchronized (BridgePortServiceGrpc.class) {
        if ((getCreateBridgePortMethod = BridgePortServiceGrpc.getCreateBridgePortMethod) == null) {
          BridgePortServiceGrpc.getCreateBridgePortMethod = getCreateBridgePortMethod =
              io.grpc.MethodDescriptor.<opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest, opi_api.network.evpn_gw.v1alpha1.BridgePort>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateBridgePort"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.evpn_gw.v1alpha1.BridgePort.getDefaultInstance()))
              .setSchemaDescriptor(new BridgePortServiceMethodDescriptorSupplier("CreateBridgePort"))
              .build();
        }
      }
    }
    return getCreateBridgePortMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.ListBridgePortsRequest,
      opi_api.network.evpn_gw.v1alpha1.ListBridgePortsResponse> getListBridgePortsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListBridgePorts",
      requestType = opi_api.network.evpn_gw.v1alpha1.ListBridgePortsRequest.class,
      responseType = opi_api.network.evpn_gw.v1alpha1.ListBridgePortsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.ListBridgePortsRequest,
      opi_api.network.evpn_gw.v1alpha1.ListBridgePortsResponse> getListBridgePortsMethod() {
    io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.ListBridgePortsRequest, opi_api.network.evpn_gw.v1alpha1.ListBridgePortsResponse> getListBridgePortsMethod;
    if ((getListBridgePortsMethod = BridgePortServiceGrpc.getListBridgePortsMethod) == null) {
      synchronized (BridgePortServiceGrpc.class) {
        if ((getListBridgePortsMethod = BridgePortServiceGrpc.getListBridgePortsMethod) == null) {
          BridgePortServiceGrpc.getListBridgePortsMethod = getListBridgePortsMethod =
              io.grpc.MethodDescriptor.<opi_api.network.evpn_gw.v1alpha1.ListBridgePortsRequest, opi_api.network.evpn_gw.v1alpha1.ListBridgePortsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListBridgePorts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.evpn_gw.v1alpha1.ListBridgePortsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.evpn_gw.v1alpha1.ListBridgePortsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BridgePortServiceMethodDescriptorSupplier("ListBridgePorts"))
              .build();
        }
      }
    }
    return getListBridgePortsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest,
      opi_api.network.evpn_gw.v1alpha1.BridgePort> getGetBridgePortMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBridgePort",
      requestType = opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest.class,
      responseType = opi_api.network.evpn_gw.v1alpha1.BridgePort.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest,
      opi_api.network.evpn_gw.v1alpha1.BridgePort> getGetBridgePortMethod() {
    io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest, opi_api.network.evpn_gw.v1alpha1.BridgePort> getGetBridgePortMethod;
    if ((getGetBridgePortMethod = BridgePortServiceGrpc.getGetBridgePortMethod) == null) {
      synchronized (BridgePortServiceGrpc.class) {
        if ((getGetBridgePortMethod = BridgePortServiceGrpc.getGetBridgePortMethod) == null) {
          BridgePortServiceGrpc.getGetBridgePortMethod = getGetBridgePortMethod =
              io.grpc.MethodDescriptor.<opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest, opi_api.network.evpn_gw.v1alpha1.BridgePort>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBridgePort"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.evpn_gw.v1alpha1.BridgePort.getDefaultInstance()))
              .setSchemaDescriptor(new BridgePortServiceMethodDescriptorSupplier("GetBridgePort"))
              .build();
        }
      }
    }
    return getGetBridgePortMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.DeleteBridgePortRequest,
      com.google.protobuf.Empty> getDeleteBridgePortMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteBridgePort",
      requestType = opi_api.network.evpn_gw.v1alpha1.DeleteBridgePortRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.DeleteBridgePortRequest,
      com.google.protobuf.Empty> getDeleteBridgePortMethod() {
    io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.DeleteBridgePortRequest, com.google.protobuf.Empty> getDeleteBridgePortMethod;
    if ((getDeleteBridgePortMethod = BridgePortServiceGrpc.getDeleteBridgePortMethod) == null) {
      synchronized (BridgePortServiceGrpc.class) {
        if ((getDeleteBridgePortMethod = BridgePortServiceGrpc.getDeleteBridgePortMethod) == null) {
          BridgePortServiceGrpc.getDeleteBridgePortMethod = getDeleteBridgePortMethod =
              io.grpc.MethodDescriptor.<opi_api.network.evpn_gw.v1alpha1.DeleteBridgePortRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteBridgePort"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.evpn_gw.v1alpha1.DeleteBridgePortRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new BridgePortServiceMethodDescriptorSupplier("DeleteBridgePort"))
              .build();
        }
      }
    }
    return getDeleteBridgePortMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BridgePortServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BridgePortServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BridgePortServiceStub>() {
        @java.lang.Override
        public BridgePortServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BridgePortServiceStub(channel, callOptions);
        }
      };
    return BridgePortServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BridgePortServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BridgePortServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BridgePortServiceBlockingStub>() {
        @java.lang.Override
        public BridgePortServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BridgePortServiceBlockingStub(channel, callOptions);
        }
      };
    return BridgePortServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BridgePortServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BridgePortServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BridgePortServiceFutureStub>() {
        @java.lang.Override
        public BridgePortServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BridgePortServiceFutureStub(channel, callOptions);
        }
      };
    return BridgePortServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Management of BridgePort resources
   * </pre>
   */
  public static abstract class BridgePortServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create a BridgePort
     * (-- api-linter: core::0133::method-signature=disabled
     *     aip.dev/not-precedent: The "bridge_port" is top-level resource. --)
     * </pre>
     */
    public void createBridgePort(opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.evpn_gw.v1alpha1.BridgePort> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateBridgePortMethod(), responseObserver);
    }

    /**
     * <pre>
     * List BridgePorts
     * </pre>
     */
    public void listBridgePorts(opi_api.network.evpn_gw.v1alpha1.ListBridgePortsRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.evpn_gw.v1alpha1.ListBridgePortsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListBridgePortsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve a BridgePort
     * (-- api-linter: core::0131::method-signature=disabled
     *     aip.dev/not-precedent: "vport_id" is the key. --)
     * (-- api-linter: client-libraries::4232::required-fields=disabled
     *     aip.dev/not-precedent: "vport_id" is the required field. --)
     * (-- api-linter: core::0131::http-uri-name=disabled
     *     aip.dev/not-precedent: No "name" is used as key. --)
     * </pre>
     */
    public void getBridgePort(opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.evpn_gw.v1alpha1.BridgePort> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBridgePortMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a BridgePort
     * (-- api-linter: core::0135::method-signature=disabled
     *     aip.dev/not-precedent: "vport_id" is the key. --)
     * (-- api-linter: client-libraries::4232::required-fields=disabled
     *     aip.dev/not-precedent: "vport_id" is the required field. --)
     * (-- api-linter: core::0135::http-uri-name=disabled
     *     aip.dev/not-precedent: The "name" is not used as key. --)
     * </pre>
     */
    public void deleteBridgePort(opi_api.network.evpn_gw.v1alpha1.DeleteBridgePortRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteBridgePortMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateBridgePortMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest,
                opi_api.network.evpn_gw.v1alpha1.BridgePort>(
                  this, METHODID_CREATE_BRIDGE_PORT)))
          .addMethod(
            getListBridgePortsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.evpn_gw.v1alpha1.ListBridgePortsRequest,
                opi_api.network.evpn_gw.v1alpha1.ListBridgePortsResponse>(
                  this, METHODID_LIST_BRIDGE_PORTS)))
          .addMethod(
            getGetBridgePortMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest,
                opi_api.network.evpn_gw.v1alpha1.BridgePort>(
                  this, METHODID_GET_BRIDGE_PORT)))
          .addMethod(
            getDeleteBridgePortMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.evpn_gw.v1alpha1.DeleteBridgePortRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_BRIDGE_PORT)))
          .build();
    }
  }

  /**
   * <pre>
   * Management of BridgePort resources
   * </pre>
   */
  public static final class BridgePortServiceStub extends io.grpc.stub.AbstractAsyncStub<BridgePortServiceStub> {
    private BridgePortServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BridgePortServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BridgePortServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a BridgePort
     * (-- api-linter: core::0133::method-signature=disabled
     *     aip.dev/not-precedent: The "bridge_port" is top-level resource. --)
     * </pre>
     */
    public void createBridgePort(opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.evpn_gw.v1alpha1.BridgePort> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateBridgePortMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List BridgePorts
     * </pre>
     */
    public void listBridgePorts(opi_api.network.evpn_gw.v1alpha1.ListBridgePortsRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.evpn_gw.v1alpha1.ListBridgePortsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListBridgePortsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve a BridgePort
     * (-- api-linter: core::0131::method-signature=disabled
     *     aip.dev/not-precedent: "vport_id" is the key. --)
     * (-- api-linter: client-libraries::4232::required-fields=disabled
     *     aip.dev/not-precedent: "vport_id" is the required field. --)
     * (-- api-linter: core::0131::http-uri-name=disabled
     *     aip.dev/not-precedent: No "name" is used as key. --)
     * </pre>
     */
    public void getBridgePort(opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.evpn_gw.v1alpha1.BridgePort> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBridgePortMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a BridgePort
     * (-- api-linter: core::0135::method-signature=disabled
     *     aip.dev/not-precedent: "vport_id" is the key. --)
     * (-- api-linter: client-libraries::4232::required-fields=disabled
     *     aip.dev/not-precedent: "vport_id" is the required field. --)
     * (-- api-linter: core::0135::http-uri-name=disabled
     *     aip.dev/not-precedent: The "name" is not used as key. --)
     * </pre>
     */
    public void deleteBridgePort(opi_api.network.evpn_gw.v1alpha1.DeleteBridgePortRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteBridgePortMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Management of BridgePort resources
   * </pre>
   */
  public static final class BridgePortServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<BridgePortServiceBlockingStub> {
    private BridgePortServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BridgePortServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BridgePortServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a BridgePort
     * (-- api-linter: core::0133::method-signature=disabled
     *     aip.dev/not-precedent: The "bridge_port" is top-level resource. --)
     * </pre>
     */
    public opi_api.network.evpn_gw.v1alpha1.BridgePort createBridgePort(opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateBridgePortMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List BridgePorts
     * </pre>
     */
    public opi_api.network.evpn_gw.v1alpha1.ListBridgePortsResponse listBridgePorts(opi_api.network.evpn_gw.v1alpha1.ListBridgePortsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListBridgePortsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve a BridgePort
     * (-- api-linter: core::0131::method-signature=disabled
     *     aip.dev/not-precedent: "vport_id" is the key. --)
     * (-- api-linter: client-libraries::4232::required-fields=disabled
     *     aip.dev/not-precedent: "vport_id" is the required field. --)
     * (-- api-linter: core::0131::http-uri-name=disabled
     *     aip.dev/not-precedent: No "name" is used as key. --)
     * </pre>
     */
    public opi_api.network.evpn_gw.v1alpha1.BridgePort getBridgePort(opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBridgePortMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a BridgePort
     * (-- api-linter: core::0135::method-signature=disabled
     *     aip.dev/not-precedent: "vport_id" is the key. --)
     * (-- api-linter: client-libraries::4232::required-fields=disabled
     *     aip.dev/not-precedent: "vport_id" is the required field. --)
     * (-- api-linter: core::0135::http-uri-name=disabled
     *     aip.dev/not-precedent: The "name" is not used as key. --)
     * </pre>
     */
    public com.google.protobuf.Empty deleteBridgePort(opi_api.network.evpn_gw.v1alpha1.DeleteBridgePortRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteBridgePortMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Management of BridgePort resources
   * </pre>
   */
  public static final class BridgePortServiceFutureStub extends io.grpc.stub.AbstractFutureStub<BridgePortServiceFutureStub> {
    private BridgePortServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BridgePortServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BridgePortServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a BridgePort
     * (-- api-linter: core::0133::method-signature=disabled
     *     aip.dev/not-precedent: The "bridge_port" is top-level resource. --)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.evpn_gw.v1alpha1.BridgePort> createBridgePort(
        opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateBridgePortMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List BridgePorts
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.evpn_gw.v1alpha1.ListBridgePortsResponse> listBridgePorts(
        opi_api.network.evpn_gw.v1alpha1.ListBridgePortsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListBridgePortsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve a BridgePort
     * (-- api-linter: core::0131::method-signature=disabled
     *     aip.dev/not-precedent: "vport_id" is the key. --)
     * (-- api-linter: client-libraries::4232::required-fields=disabled
     *     aip.dev/not-precedent: "vport_id" is the required field. --)
     * (-- api-linter: core::0131::http-uri-name=disabled
     *     aip.dev/not-precedent: No "name" is used as key. --)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.evpn_gw.v1alpha1.BridgePort> getBridgePort(
        opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBridgePortMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a BridgePort
     * (-- api-linter: core::0135::method-signature=disabled
     *     aip.dev/not-precedent: "vport_id" is the key. --)
     * (-- api-linter: client-libraries::4232::required-fields=disabled
     *     aip.dev/not-precedent: "vport_id" is the required field. --)
     * (-- api-linter: core::0135::http-uri-name=disabled
     *     aip.dev/not-precedent: The "name" is not used as key. --)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteBridgePort(
        opi_api.network.evpn_gw.v1alpha1.DeleteBridgePortRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteBridgePortMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_BRIDGE_PORT = 0;
  private static final int METHODID_LIST_BRIDGE_PORTS = 1;
  private static final int METHODID_GET_BRIDGE_PORT = 2;
  private static final int METHODID_DELETE_BRIDGE_PORT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BridgePortServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BridgePortServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_BRIDGE_PORT:
          serviceImpl.createBridgePort((opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.evpn_gw.v1alpha1.BridgePort>) responseObserver);
          break;
        case METHODID_LIST_BRIDGE_PORTS:
          serviceImpl.listBridgePorts((opi_api.network.evpn_gw.v1alpha1.ListBridgePortsRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.evpn_gw.v1alpha1.ListBridgePortsResponse>) responseObserver);
          break;
        case METHODID_GET_BRIDGE_PORT:
          serviceImpl.getBridgePort((opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.evpn_gw.v1alpha1.BridgePort>) responseObserver);
          break;
        case METHODID_DELETE_BRIDGE_PORT:
          serviceImpl.deleteBridgePort((opi_api.network.evpn_gw.v1alpha1.DeleteBridgePortRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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

  private static abstract class BridgePortServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BridgePortServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return opi_api.network.evpn_gw.v1alpha1.L2XpuInfraMgrProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BridgePortService");
    }
  }

  private static final class BridgePortServiceFileDescriptorSupplier
      extends BridgePortServiceBaseDescriptorSupplier {
    BridgePortServiceFileDescriptorSupplier() {}
  }

  private static final class BridgePortServiceMethodDescriptorSupplier
      extends BridgePortServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BridgePortServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BridgePortServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BridgePortServiceFileDescriptorSupplier())
              .addMethod(getCreateBridgePortMethod())
              .addMethod(getListBridgePortsMethod())
              .addMethod(getGetBridgePortMethod())
              .addMethod(getDeleteBridgePortMethod())
              .build();
        }
      }
    }
    return result;
  }
}
