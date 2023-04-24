package opi_api.network.evpn_gw.v1alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Management of LogicalBridge Resources
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: l2_xpu_infra_mgr.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LogicalBridgeServiceGrpc {

  private LogicalBridgeServiceGrpc() {}

  public static final String SERVICE_NAME = "opi_api.network.evpn_gw.v1alpha1.LogicalBridgeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.CreateLogicalBridgeRequest,
      opi_api.network.evpn_gw.v1alpha1.LogicalBridge> getCreateLogicalBridgeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateLogicalBridge",
      requestType = opi_api.network.evpn_gw.v1alpha1.CreateLogicalBridgeRequest.class,
      responseType = opi_api.network.evpn_gw.v1alpha1.LogicalBridge.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.CreateLogicalBridgeRequest,
      opi_api.network.evpn_gw.v1alpha1.LogicalBridge> getCreateLogicalBridgeMethod() {
    io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.CreateLogicalBridgeRequest, opi_api.network.evpn_gw.v1alpha1.LogicalBridge> getCreateLogicalBridgeMethod;
    if ((getCreateLogicalBridgeMethod = LogicalBridgeServiceGrpc.getCreateLogicalBridgeMethod) == null) {
      synchronized (LogicalBridgeServiceGrpc.class) {
        if ((getCreateLogicalBridgeMethod = LogicalBridgeServiceGrpc.getCreateLogicalBridgeMethod) == null) {
          LogicalBridgeServiceGrpc.getCreateLogicalBridgeMethod = getCreateLogicalBridgeMethod =
              io.grpc.MethodDescriptor.<opi_api.network.evpn_gw.v1alpha1.CreateLogicalBridgeRequest, opi_api.network.evpn_gw.v1alpha1.LogicalBridge>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateLogicalBridge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.evpn_gw.v1alpha1.CreateLogicalBridgeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.evpn_gw.v1alpha1.LogicalBridge.getDefaultInstance()))
              .setSchemaDescriptor(new LogicalBridgeServiceMethodDescriptorSupplier("CreateLogicalBridge"))
              .build();
        }
      }
    }
    return getCreateLogicalBridgeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesRequest,
      opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse> getListLogicalBridgesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListLogicalBridges",
      requestType = opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesRequest.class,
      responseType = opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesRequest,
      opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse> getListLogicalBridgesMethod() {
    io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesRequest, opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse> getListLogicalBridgesMethod;
    if ((getListLogicalBridgesMethod = LogicalBridgeServiceGrpc.getListLogicalBridgesMethod) == null) {
      synchronized (LogicalBridgeServiceGrpc.class) {
        if ((getListLogicalBridgesMethod = LogicalBridgeServiceGrpc.getListLogicalBridgesMethod) == null) {
          LogicalBridgeServiceGrpc.getListLogicalBridgesMethod = getListLogicalBridgesMethod =
              io.grpc.MethodDescriptor.<opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesRequest, opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListLogicalBridges"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogicalBridgeServiceMethodDescriptorSupplier("ListLogicalBridges"))
              .build();
        }
      }
    }
    return getListLogicalBridgesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.GetLogicalBridgeRequest,
      opi_api.network.evpn_gw.v1alpha1.LogicalBridge> getGetLogicalBridgeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLogicalBridge",
      requestType = opi_api.network.evpn_gw.v1alpha1.GetLogicalBridgeRequest.class,
      responseType = opi_api.network.evpn_gw.v1alpha1.LogicalBridge.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.GetLogicalBridgeRequest,
      opi_api.network.evpn_gw.v1alpha1.LogicalBridge> getGetLogicalBridgeMethod() {
    io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.GetLogicalBridgeRequest, opi_api.network.evpn_gw.v1alpha1.LogicalBridge> getGetLogicalBridgeMethod;
    if ((getGetLogicalBridgeMethod = LogicalBridgeServiceGrpc.getGetLogicalBridgeMethod) == null) {
      synchronized (LogicalBridgeServiceGrpc.class) {
        if ((getGetLogicalBridgeMethod = LogicalBridgeServiceGrpc.getGetLogicalBridgeMethod) == null) {
          LogicalBridgeServiceGrpc.getGetLogicalBridgeMethod = getGetLogicalBridgeMethod =
              io.grpc.MethodDescriptor.<opi_api.network.evpn_gw.v1alpha1.GetLogicalBridgeRequest, opi_api.network.evpn_gw.v1alpha1.LogicalBridge>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLogicalBridge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.evpn_gw.v1alpha1.GetLogicalBridgeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.evpn_gw.v1alpha1.LogicalBridge.getDefaultInstance()))
              .setSchemaDescriptor(new LogicalBridgeServiceMethodDescriptorSupplier("GetLogicalBridge"))
              .build();
        }
      }
    }
    return getGetLogicalBridgeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.DeleteLogicalBridgeRequest,
      com.google.protobuf.Empty> getDeleteLogicalBridgeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteLogicalBridge",
      requestType = opi_api.network.evpn_gw.v1alpha1.DeleteLogicalBridgeRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.DeleteLogicalBridgeRequest,
      com.google.protobuf.Empty> getDeleteLogicalBridgeMethod() {
    io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.DeleteLogicalBridgeRequest, com.google.protobuf.Empty> getDeleteLogicalBridgeMethod;
    if ((getDeleteLogicalBridgeMethod = LogicalBridgeServiceGrpc.getDeleteLogicalBridgeMethod) == null) {
      synchronized (LogicalBridgeServiceGrpc.class) {
        if ((getDeleteLogicalBridgeMethod = LogicalBridgeServiceGrpc.getDeleteLogicalBridgeMethod) == null) {
          LogicalBridgeServiceGrpc.getDeleteLogicalBridgeMethod = getDeleteLogicalBridgeMethod =
              io.grpc.MethodDescriptor.<opi_api.network.evpn_gw.v1alpha1.DeleteLogicalBridgeRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteLogicalBridge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.evpn_gw.v1alpha1.DeleteLogicalBridgeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new LogicalBridgeServiceMethodDescriptorSupplier("DeleteLogicalBridge"))
              .build();
        }
      }
    }
    return getDeleteLogicalBridgeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LogicalBridgeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogicalBridgeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogicalBridgeServiceStub>() {
        @java.lang.Override
        public LogicalBridgeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogicalBridgeServiceStub(channel, callOptions);
        }
      };
    return LogicalBridgeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LogicalBridgeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogicalBridgeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogicalBridgeServiceBlockingStub>() {
        @java.lang.Override
        public LogicalBridgeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogicalBridgeServiceBlockingStub(channel, callOptions);
        }
      };
    return LogicalBridgeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LogicalBridgeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogicalBridgeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogicalBridgeServiceFutureStub>() {
        @java.lang.Override
        public LogicalBridgeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogicalBridgeServiceFutureStub(channel, callOptions);
        }
      };
    return LogicalBridgeServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Management of LogicalBridge Resources
   * </pre>
   */
  public static abstract class LogicalBridgeServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create a LogicalBridge
     * (-- api-linter: core::0133::method-signature=disabled
     *     aip.dev/not-precedent: The "logical_bridge" is top-level resource. --)
     * </pre>
     */
    public void createLogicalBridge(opi_api.network.evpn_gw.v1alpha1.CreateLogicalBridgeRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.evpn_gw.v1alpha1.LogicalBridge> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateLogicalBridgeMethod(), responseObserver);
    }

    /**
     * <pre>
     * List LogicalBridges
     * </pre>
     */
    public void listLogicalBridges(opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListLogicalBridgesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve a LogicalBridge
     * (-- api-linter: core::0131::method-signature=disabled
     *     aip.dev/not-precedent: "vlan_id" is the key. --)
     * (-- api-linter: client-libraries::4232::required-fields=disabled
     *     aip.dev/not-precedent: "vlan_id" is the required field. --)
     * (-- api-linter: core::0131::http-uri-name=disabled
     *     aip.dev/not-precedent: No "name" is used as key. --)
     * </pre>
     */
    public void getLogicalBridge(opi_api.network.evpn_gw.v1alpha1.GetLogicalBridgeRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.evpn_gw.v1alpha1.LogicalBridge> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLogicalBridgeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a LogicalBridge
     * (-- api-linter: core::0135::method-signature=disabled
     *     aip.dev/not-precedent: "vlan_id" is the key. --)
     * (-- api-linter: client-libraries::4232::required-fields=disabled
     *     aip.dev/not-precedent: "vlan_id" is the required field. --)
     * (-- api-linter: core::0135::http-uri-name=disabled
     *     aip.dev/not-precedent: The "name" is not used as key. --)
     * </pre>
     */
    public void deleteLogicalBridge(opi_api.network.evpn_gw.v1alpha1.DeleteLogicalBridgeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteLogicalBridgeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateLogicalBridgeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.evpn_gw.v1alpha1.CreateLogicalBridgeRequest,
                opi_api.network.evpn_gw.v1alpha1.LogicalBridge>(
                  this, METHODID_CREATE_LOGICAL_BRIDGE)))
          .addMethod(
            getListLogicalBridgesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesRequest,
                opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse>(
                  this, METHODID_LIST_LOGICAL_BRIDGES)))
          .addMethod(
            getGetLogicalBridgeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.evpn_gw.v1alpha1.GetLogicalBridgeRequest,
                opi_api.network.evpn_gw.v1alpha1.LogicalBridge>(
                  this, METHODID_GET_LOGICAL_BRIDGE)))
          .addMethod(
            getDeleteLogicalBridgeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.evpn_gw.v1alpha1.DeleteLogicalBridgeRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_LOGICAL_BRIDGE)))
          .build();
    }
  }

  /**
   * <pre>
   * Management of LogicalBridge Resources
   * </pre>
   */
  public static final class LogicalBridgeServiceStub extends io.grpc.stub.AbstractAsyncStub<LogicalBridgeServiceStub> {
    private LogicalBridgeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogicalBridgeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogicalBridgeServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a LogicalBridge
     * (-- api-linter: core::0133::method-signature=disabled
     *     aip.dev/not-precedent: The "logical_bridge" is top-level resource. --)
     * </pre>
     */
    public void createLogicalBridge(opi_api.network.evpn_gw.v1alpha1.CreateLogicalBridgeRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.evpn_gw.v1alpha1.LogicalBridge> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateLogicalBridgeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List LogicalBridges
     * </pre>
     */
    public void listLogicalBridges(opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListLogicalBridgesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve a LogicalBridge
     * (-- api-linter: core::0131::method-signature=disabled
     *     aip.dev/not-precedent: "vlan_id" is the key. --)
     * (-- api-linter: client-libraries::4232::required-fields=disabled
     *     aip.dev/not-precedent: "vlan_id" is the required field. --)
     * (-- api-linter: core::0131::http-uri-name=disabled
     *     aip.dev/not-precedent: No "name" is used as key. --)
     * </pre>
     */
    public void getLogicalBridge(opi_api.network.evpn_gw.v1alpha1.GetLogicalBridgeRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.evpn_gw.v1alpha1.LogicalBridge> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLogicalBridgeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a LogicalBridge
     * (-- api-linter: core::0135::method-signature=disabled
     *     aip.dev/not-precedent: "vlan_id" is the key. --)
     * (-- api-linter: client-libraries::4232::required-fields=disabled
     *     aip.dev/not-precedent: "vlan_id" is the required field. --)
     * (-- api-linter: core::0135::http-uri-name=disabled
     *     aip.dev/not-precedent: The "name" is not used as key. --)
     * </pre>
     */
    public void deleteLogicalBridge(opi_api.network.evpn_gw.v1alpha1.DeleteLogicalBridgeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteLogicalBridgeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Management of LogicalBridge Resources
   * </pre>
   */
  public static final class LogicalBridgeServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<LogicalBridgeServiceBlockingStub> {
    private LogicalBridgeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogicalBridgeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogicalBridgeServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a LogicalBridge
     * (-- api-linter: core::0133::method-signature=disabled
     *     aip.dev/not-precedent: The "logical_bridge" is top-level resource. --)
     * </pre>
     */
    public opi_api.network.evpn_gw.v1alpha1.LogicalBridge createLogicalBridge(opi_api.network.evpn_gw.v1alpha1.CreateLogicalBridgeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateLogicalBridgeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List LogicalBridges
     * </pre>
     */
    public opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse listLogicalBridges(opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListLogicalBridgesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve a LogicalBridge
     * (-- api-linter: core::0131::method-signature=disabled
     *     aip.dev/not-precedent: "vlan_id" is the key. --)
     * (-- api-linter: client-libraries::4232::required-fields=disabled
     *     aip.dev/not-precedent: "vlan_id" is the required field. --)
     * (-- api-linter: core::0131::http-uri-name=disabled
     *     aip.dev/not-precedent: No "name" is used as key. --)
     * </pre>
     */
    public opi_api.network.evpn_gw.v1alpha1.LogicalBridge getLogicalBridge(opi_api.network.evpn_gw.v1alpha1.GetLogicalBridgeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLogicalBridgeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a LogicalBridge
     * (-- api-linter: core::0135::method-signature=disabled
     *     aip.dev/not-precedent: "vlan_id" is the key. --)
     * (-- api-linter: client-libraries::4232::required-fields=disabled
     *     aip.dev/not-precedent: "vlan_id" is the required field. --)
     * (-- api-linter: core::0135::http-uri-name=disabled
     *     aip.dev/not-precedent: The "name" is not used as key. --)
     * </pre>
     */
    public com.google.protobuf.Empty deleteLogicalBridge(opi_api.network.evpn_gw.v1alpha1.DeleteLogicalBridgeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteLogicalBridgeMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Management of LogicalBridge Resources
   * </pre>
   */
  public static final class LogicalBridgeServiceFutureStub extends io.grpc.stub.AbstractFutureStub<LogicalBridgeServiceFutureStub> {
    private LogicalBridgeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogicalBridgeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogicalBridgeServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a LogicalBridge
     * (-- api-linter: core::0133::method-signature=disabled
     *     aip.dev/not-precedent: The "logical_bridge" is top-level resource. --)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.evpn_gw.v1alpha1.LogicalBridge> createLogicalBridge(
        opi_api.network.evpn_gw.v1alpha1.CreateLogicalBridgeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateLogicalBridgeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List LogicalBridges
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse> listLogicalBridges(
        opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListLogicalBridgesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve a LogicalBridge
     * (-- api-linter: core::0131::method-signature=disabled
     *     aip.dev/not-precedent: "vlan_id" is the key. --)
     * (-- api-linter: client-libraries::4232::required-fields=disabled
     *     aip.dev/not-precedent: "vlan_id" is the required field. --)
     * (-- api-linter: core::0131::http-uri-name=disabled
     *     aip.dev/not-precedent: No "name" is used as key. --)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.evpn_gw.v1alpha1.LogicalBridge> getLogicalBridge(
        opi_api.network.evpn_gw.v1alpha1.GetLogicalBridgeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLogicalBridgeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a LogicalBridge
     * (-- api-linter: core::0135::method-signature=disabled
     *     aip.dev/not-precedent: "vlan_id" is the key. --)
     * (-- api-linter: client-libraries::4232::required-fields=disabled
     *     aip.dev/not-precedent: "vlan_id" is the required field. --)
     * (-- api-linter: core::0135::http-uri-name=disabled
     *     aip.dev/not-precedent: The "name" is not used as key. --)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteLogicalBridge(
        opi_api.network.evpn_gw.v1alpha1.DeleteLogicalBridgeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteLogicalBridgeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_LOGICAL_BRIDGE = 0;
  private static final int METHODID_LIST_LOGICAL_BRIDGES = 1;
  private static final int METHODID_GET_LOGICAL_BRIDGE = 2;
  private static final int METHODID_DELETE_LOGICAL_BRIDGE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LogicalBridgeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LogicalBridgeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_LOGICAL_BRIDGE:
          serviceImpl.createLogicalBridge((opi_api.network.evpn_gw.v1alpha1.CreateLogicalBridgeRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.evpn_gw.v1alpha1.LogicalBridge>) responseObserver);
          break;
        case METHODID_LIST_LOGICAL_BRIDGES:
          serviceImpl.listLogicalBridges((opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse>) responseObserver);
          break;
        case METHODID_GET_LOGICAL_BRIDGE:
          serviceImpl.getLogicalBridge((opi_api.network.evpn_gw.v1alpha1.GetLogicalBridgeRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.evpn_gw.v1alpha1.LogicalBridge>) responseObserver);
          break;
        case METHODID_DELETE_LOGICAL_BRIDGE:
          serviceImpl.deleteLogicalBridge((opi_api.network.evpn_gw.v1alpha1.DeleteLogicalBridgeRequest) request,
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

  private static abstract class LogicalBridgeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LogicalBridgeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return opi_api.network.evpn_gw.v1alpha1.L2XpuInfraMgrProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LogicalBridgeService");
    }
  }

  private static final class LogicalBridgeServiceFileDescriptorSupplier
      extends LogicalBridgeServiceBaseDescriptorSupplier {
    LogicalBridgeServiceFileDescriptorSupplier() {}
  }

  private static final class LogicalBridgeServiceMethodDescriptorSupplier
      extends LogicalBridgeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LogicalBridgeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LogicalBridgeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LogicalBridgeServiceFileDescriptorSupplier())
              .addMethod(getCreateLogicalBridgeMethod())
              .addMethod(getListLogicalBridgesMethod())
              .addMethod(getGetLogicalBridgeMethod())
              .addMethod(getDeleteLogicalBridgeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
