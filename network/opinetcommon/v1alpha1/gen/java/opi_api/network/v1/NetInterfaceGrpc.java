package opi_api.network.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service functions for Network Interface exported by the server
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: openconfig_interfaces.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class NetInterfaceGrpc {

  private NetInterfaceGrpc() {}

  public static final String SERVICE_NAME = "opi_api.network.v1.NetInterface";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<opi_api.network.v1.OpenconfigInterfaces.NetInterfaceGetRequest,
      opi_api.network.v1.OpenconfigInterfaces.NetInterfaceGetResponse> getNetInterfaceGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NetInterfaceGet",
      requestType = opi_api.network.v1.OpenconfigInterfaces.NetInterfaceGetRequest.class,
      responseType = opi_api.network.v1.OpenconfigInterfaces.NetInterfaceGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.v1.OpenconfigInterfaces.NetInterfaceGetRequest,
      opi_api.network.v1.OpenconfigInterfaces.NetInterfaceGetResponse> getNetInterfaceGetMethod() {
    io.grpc.MethodDescriptor<opi_api.network.v1.OpenconfigInterfaces.NetInterfaceGetRequest, opi_api.network.v1.OpenconfigInterfaces.NetInterfaceGetResponse> getNetInterfaceGetMethod;
    if ((getNetInterfaceGetMethod = NetInterfaceGrpc.getNetInterfaceGetMethod) == null) {
      synchronized (NetInterfaceGrpc.class) {
        if ((getNetInterfaceGetMethod = NetInterfaceGrpc.getNetInterfaceGetMethod) == null) {
          NetInterfaceGrpc.getNetInterfaceGetMethod = getNetInterfaceGetMethod =
              io.grpc.MethodDescriptor.<opi_api.network.v1.OpenconfigInterfaces.NetInterfaceGetRequest, opi_api.network.v1.OpenconfigInterfaces.NetInterfaceGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NetInterfaceGet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.v1.OpenconfigInterfaces.NetInterfaceGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.v1.OpenconfigInterfaces.NetInterfaceGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NetInterfaceMethodDescriptorSupplier("NetInterfaceGet"))
              .build();
        }
      }
    }
    return getNetInterfaceGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.v1.OpenconfigInterfaces.NetInterfaceListRequest,
      opi_api.network.v1.OpenconfigInterfaces.NetInterfaceListResponse> getNetInterfaceListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NetInterfaceList",
      requestType = opi_api.network.v1.OpenconfigInterfaces.NetInterfaceListRequest.class,
      responseType = opi_api.network.v1.OpenconfigInterfaces.NetInterfaceListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.v1.OpenconfigInterfaces.NetInterfaceListRequest,
      opi_api.network.v1.OpenconfigInterfaces.NetInterfaceListResponse> getNetInterfaceListMethod() {
    io.grpc.MethodDescriptor<opi_api.network.v1.OpenconfigInterfaces.NetInterfaceListRequest, opi_api.network.v1.OpenconfigInterfaces.NetInterfaceListResponse> getNetInterfaceListMethod;
    if ((getNetInterfaceListMethod = NetInterfaceGrpc.getNetInterfaceListMethod) == null) {
      synchronized (NetInterfaceGrpc.class) {
        if ((getNetInterfaceListMethod = NetInterfaceGrpc.getNetInterfaceListMethod) == null) {
          NetInterfaceGrpc.getNetInterfaceListMethod = getNetInterfaceListMethod =
              io.grpc.MethodDescriptor.<opi_api.network.v1.OpenconfigInterfaces.NetInterfaceListRequest, opi_api.network.v1.OpenconfigInterfaces.NetInterfaceListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NetInterfaceList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.v1.OpenconfigInterfaces.NetInterfaceListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.v1.OpenconfigInterfaces.NetInterfaceListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NetInterfaceMethodDescriptorSupplier("NetInterfaceList"))
              .build();
        }
      }
    }
    return getNetInterfaceListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.v1.OpenconfigInterfaces.NetInterfaceUpdateRequest,
      opi_api.network.v1.OpenconfigInterfaces.NetInterfaceUpdateResponse> getNetInterfaceUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NetInterfaceUpdate",
      requestType = opi_api.network.v1.OpenconfigInterfaces.NetInterfaceUpdateRequest.class,
      responseType = opi_api.network.v1.OpenconfigInterfaces.NetInterfaceUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.v1.OpenconfigInterfaces.NetInterfaceUpdateRequest,
      opi_api.network.v1.OpenconfigInterfaces.NetInterfaceUpdateResponse> getNetInterfaceUpdateMethod() {
    io.grpc.MethodDescriptor<opi_api.network.v1.OpenconfigInterfaces.NetInterfaceUpdateRequest, opi_api.network.v1.OpenconfigInterfaces.NetInterfaceUpdateResponse> getNetInterfaceUpdateMethod;
    if ((getNetInterfaceUpdateMethod = NetInterfaceGrpc.getNetInterfaceUpdateMethod) == null) {
      synchronized (NetInterfaceGrpc.class) {
        if ((getNetInterfaceUpdateMethod = NetInterfaceGrpc.getNetInterfaceUpdateMethod) == null) {
          NetInterfaceGrpc.getNetInterfaceUpdateMethod = getNetInterfaceUpdateMethod =
              io.grpc.MethodDescriptor.<opi_api.network.v1.OpenconfigInterfaces.NetInterfaceUpdateRequest, opi_api.network.v1.OpenconfigInterfaces.NetInterfaceUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NetInterfaceUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.v1.OpenconfigInterfaces.NetInterfaceUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.v1.OpenconfigInterfaces.NetInterfaceUpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NetInterfaceMethodDescriptorSupplier("NetInterfaceUpdate"))
              .build();
        }
      }
    }
    return getNetInterfaceUpdateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NetInterfaceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NetInterfaceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NetInterfaceStub>() {
        @java.lang.Override
        public NetInterfaceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NetInterfaceStub(channel, callOptions);
        }
      };
    return NetInterfaceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NetInterfaceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NetInterfaceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NetInterfaceBlockingStub>() {
        @java.lang.Override
        public NetInterfaceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NetInterfaceBlockingStub(channel, callOptions);
        }
      };
    return NetInterfaceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NetInterfaceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NetInterfaceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NetInterfaceFutureStub>() {
        @java.lang.Override
        public NetInterfaceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NetInterfaceFutureStub(channel, callOptions);
        }
      };
    return NetInterfaceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service functions for Network Interface exported by the server
   * </pre>
   */
  public static abstract class NetInterfaceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Retrieves the interface information for a given interface
     * </pre>
     */
    public void netInterfaceGet(opi_api.network.v1.OpenconfigInterfaces.NetInterfaceGetRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.v1.OpenconfigInterfaces.NetInterfaceGetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNetInterfaceGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the set of interfaces on the device
     * </pre>
     */
    public void netInterfaceList(opi_api.network.v1.OpenconfigInterfaces.NetInterfaceListRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.v1.OpenconfigInterfaces.NetInterfaceListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNetInterfaceListMethod(), responseObserver);
    }

    /**
     * <pre>
     * A method for setting or changing configuration of an interface
     * </pre>
     */
    public void netInterfaceUpdate(opi_api.network.v1.OpenconfigInterfaces.NetInterfaceUpdateRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.v1.OpenconfigInterfaces.NetInterfaceUpdateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNetInterfaceUpdateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getNetInterfaceGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.v1.OpenconfigInterfaces.NetInterfaceGetRequest,
                opi_api.network.v1.OpenconfigInterfaces.NetInterfaceGetResponse>(
                  this, METHODID_NET_INTERFACE_GET)))
          .addMethod(
            getNetInterfaceListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.v1.OpenconfigInterfaces.NetInterfaceListRequest,
                opi_api.network.v1.OpenconfigInterfaces.NetInterfaceListResponse>(
                  this, METHODID_NET_INTERFACE_LIST)))
          .addMethod(
            getNetInterfaceUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.v1.OpenconfigInterfaces.NetInterfaceUpdateRequest,
                opi_api.network.v1.OpenconfigInterfaces.NetInterfaceUpdateResponse>(
                  this, METHODID_NET_INTERFACE_UPDATE)))
          .build();
    }
  }

  /**
   * <pre>
   * Service functions for Network Interface exported by the server
   * </pre>
   */
  public static final class NetInterfaceStub extends io.grpc.stub.AbstractAsyncStub<NetInterfaceStub> {
    private NetInterfaceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetInterfaceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NetInterfaceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the interface information for a given interface
     * </pre>
     */
    public void netInterfaceGet(opi_api.network.v1.OpenconfigInterfaces.NetInterfaceGetRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.v1.OpenconfigInterfaces.NetInterfaceGetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNetInterfaceGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the set of interfaces on the device
     * </pre>
     */
    public void netInterfaceList(opi_api.network.v1.OpenconfigInterfaces.NetInterfaceListRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.v1.OpenconfigInterfaces.NetInterfaceListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNetInterfaceListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * A method for setting or changing configuration of an interface
     * </pre>
     */
    public void netInterfaceUpdate(opi_api.network.v1.OpenconfigInterfaces.NetInterfaceUpdateRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.v1.OpenconfigInterfaces.NetInterfaceUpdateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNetInterfaceUpdateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service functions for Network Interface exported by the server
   * </pre>
   */
  public static final class NetInterfaceBlockingStub extends io.grpc.stub.AbstractBlockingStub<NetInterfaceBlockingStub> {
    private NetInterfaceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetInterfaceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NetInterfaceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the interface information for a given interface
     * </pre>
     */
    public opi_api.network.v1.OpenconfigInterfaces.NetInterfaceGetResponse netInterfaceGet(opi_api.network.v1.OpenconfigInterfaces.NetInterfaceGetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNetInterfaceGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the set of interfaces on the device
     * </pre>
     */
    public opi_api.network.v1.OpenconfigInterfaces.NetInterfaceListResponse netInterfaceList(opi_api.network.v1.OpenconfigInterfaces.NetInterfaceListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNetInterfaceListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * A method for setting or changing configuration of an interface
     * </pre>
     */
    public opi_api.network.v1.OpenconfigInterfaces.NetInterfaceUpdateResponse netInterfaceUpdate(opi_api.network.v1.OpenconfigInterfaces.NetInterfaceUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNetInterfaceUpdateMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service functions for Network Interface exported by the server
   * </pre>
   */
  public static final class NetInterfaceFutureStub extends io.grpc.stub.AbstractFutureStub<NetInterfaceFutureStub> {
    private NetInterfaceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetInterfaceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NetInterfaceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the interface information for a given interface
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.v1.OpenconfigInterfaces.NetInterfaceGetResponse> netInterfaceGet(
        opi_api.network.v1.OpenconfigInterfaces.NetInterfaceGetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNetInterfaceGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the set of interfaces on the device
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.v1.OpenconfigInterfaces.NetInterfaceListResponse> netInterfaceList(
        opi_api.network.v1.OpenconfigInterfaces.NetInterfaceListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNetInterfaceListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * A method for setting or changing configuration of an interface
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.v1.OpenconfigInterfaces.NetInterfaceUpdateResponse> netInterfaceUpdate(
        opi_api.network.v1.OpenconfigInterfaces.NetInterfaceUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNetInterfaceUpdateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_NET_INTERFACE_GET = 0;
  private static final int METHODID_NET_INTERFACE_LIST = 1;
  private static final int METHODID_NET_INTERFACE_UPDATE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NetInterfaceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NetInterfaceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_NET_INTERFACE_GET:
          serviceImpl.netInterfaceGet((opi_api.network.v1.OpenconfigInterfaces.NetInterfaceGetRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.v1.OpenconfigInterfaces.NetInterfaceGetResponse>) responseObserver);
          break;
        case METHODID_NET_INTERFACE_LIST:
          serviceImpl.netInterfaceList((opi_api.network.v1.OpenconfigInterfaces.NetInterfaceListRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.v1.OpenconfigInterfaces.NetInterfaceListResponse>) responseObserver);
          break;
        case METHODID_NET_INTERFACE_UPDATE:
          serviceImpl.netInterfaceUpdate((opi_api.network.v1.OpenconfigInterfaces.NetInterfaceUpdateRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.v1.OpenconfigInterfaces.NetInterfaceUpdateResponse>) responseObserver);
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

  private static abstract class NetInterfaceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NetInterfaceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return opi_api.network.v1.OpenconfigInterfaces.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NetInterface");
    }
  }

  private static final class NetInterfaceFileDescriptorSupplier
      extends NetInterfaceBaseDescriptorSupplier {
    NetInterfaceFileDescriptorSupplier() {}
  }

  private static final class NetInterfaceMethodDescriptorSupplier
      extends NetInterfaceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NetInterfaceMethodDescriptorSupplier(String methodName) {
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
      synchronized (NetInterfaceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NetInterfaceFileDescriptorSupplier())
              .addMethod(getNetInterfaceGetMethod())
              .addMethod(getNetInterfaceListMethod())
              .addMethod(getNetInterfaceUpdateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
