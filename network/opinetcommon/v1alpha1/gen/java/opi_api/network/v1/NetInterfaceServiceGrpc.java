package opi_api.network.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service functions for Network Interface exported by the server
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: oc_interfaces.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class NetInterfaceServiceGrpc {

  private NetInterfaceServiceGrpc() {}

  public static final String SERVICE_NAME = "opi_api.network.v1.NetInterfaceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<opi_api.network.v1.GetNetInterfaceRequest,
      opi_api.network.v1.NetInterface> getGetNetInterfaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNetInterface",
      requestType = opi_api.network.v1.GetNetInterfaceRequest.class,
      responseType = opi_api.network.v1.NetInterface.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.v1.GetNetInterfaceRequest,
      opi_api.network.v1.NetInterface> getGetNetInterfaceMethod() {
    io.grpc.MethodDescriptor<opi_api.network.v1.GetNetInterfaceRequest, opi_api.network.v1.NetInterface> getGetNetInterfaceMethod;
    if ((getGetNetInterfaceMethod = NetInterfaceServiceGrpc.getGetNetInterfaceMethod) == null) {
      synchronized (NetInterfaceServiceGrpc.class) {
        if ((getGetNetInterfaceMethod = NetInterfaceServiceGrpc.getGetNetInterfaceMethod) == null) {
          NetInterfaceServiceGrpc.getGetNetInterfaceMethod = getGetNetInterfaceMethod =
              io.grpc.MethodDescriptor.<opi_api.network.v1.GetNetInterfaceRequest, opi_api.network.v1.NetInterface>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNetInterface"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.v1.GetNetInterfaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.v1.NetInterface.getDefaultInstance()))
              .setSchemaDescriptor(new NetInterfaceServiceMethodDescriptorSupplier("GetNetInterface"))
              .build();
        }
      }
    }
    return getGetNetInterfaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.v1.ListNetInterfacesRequest,
      opi_api.network.v1.ListNetInterfacesResponse> getListNetInterfacesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNetInterfaces",
      requestType = opi_api.network.v1.ListNetInterfacesRequest.class,
      responseType = opi_api.network.v1.ListNetInterfacesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.v1.ListNetInterfacesRequest,
      opi_api.network.v1.ListNetInterfacesResponse> getListNetInterfacesMethod() {
    io.grpc.MethodDescriptor<opi_api.network.v1.ListNetInterfacesRequest, opi_api.network.v1.ListNetInterfacesResponse> getListNetInterfacesMethod;
    if ((getListNetInterfacesMethod = NetInterfaceServiceGrpc.getListNetInterfacesMethod) == null) {
      synchronized (NetInterfaceServiceGrpc.class) {
        if ((getListNetInterfacesMethod = NetInterfaceServiceGrpc.getListNetInterfacesMethod) == null) {
          NetInterfaceServiceGrpc.getListNetInterfacesMethod = getListNetInterfacesMethod =
              io.grpc.MethodDescriptor.<opi_api.network.v1.ListNetInterfacesRequest, opi_api.network.v1.ListNetInterfacesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNetInterfaces"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.v1.ListNetInterfacesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.v1.ListNetInterfacesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NetInterfaceServiceMethodDescriptorSupplier("ListNetInterfaces"))
              .build();
        }
      }
    }
    return getListNetInterfacesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.v1.UpdateNetInterfaceRequest,
      opi_api.network.v1.NetInterface> getUpdateNetInterfaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateNetInterface",
      requestType = opi_api.network.v1.UpdateNetInterfaceRequest.class,
      responseType = opi_api.network.v1.NetInterface.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.v1.UpdateNetInterfaceRequest,
      opi_api.network.v1.NetInterface> getUpdateNetInterfaceMethod() {
    io.grpc.MethodDescriptor<opi_api.network.v1.UpdateNetInterfaceRequest, opi_api.network.v1.NetInterface> getUpdateNetInterfaceMethod;
    if ((getUpdateNetInterfaceMethod = NetInterfaceServiceGrpc.getUpdateNetInterfaceMethod) == null) {
      synchronized (NetInterfaceServiceGrpc.class) {
        if ((getUpdateNetInterfaceMethod = NetInterfaceServiceGrpc.getUpdateNetInterfaceMethod) == null) {
          NetInterfaceServiceGrpc.getUpdateNetInterfaceMethod = getUpdateNetInterfaceMethod =
              io.grpc.MethodDescriptor.<opi_api.network.v1.UpdateNetInterfaceRequest, opi_api.network.v1.NetInterface>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateNetInterface"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.v1.UpdateNetInterfaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.v1.NetInterface.getDefaultInstance()))
              .setSchemaDescriptor(new NetInterfaceServiceMethodDescriptorSupplier("UpdateNetInterface"))
              .build();
        }
      }
    }
    return getUpdateNetInterfaceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NetInterfaceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NetInterfaceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NetInterfaceServiceStub>() {
        @java.lang.Override
        public NetInterfaceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NetInterfaceServiceStub(channel, callOptions);
        }
      };
    return NetInterfaceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NetInterfaceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NetInterfaceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NetInterfaceServiceBlockingStub>() {
        @java.lang.Override
        public NetInterfaceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NetInterfaceServiceBlockingStub(channel, callOptions);
        }
      };
    return NetInterfaceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NetInterfaceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NetInterfaceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NetInterfaceServiceFutureStub>() {
        @java.lang.Override
        public NetInterfaceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NetInterfaceServiceFutureStub(channel, callOptions);
        }
      };
    return NetInterfaceServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service functions for Network Interface exported by the server
   * </pre>
   */
  public static abstract class NetInterfaceServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Retrieves the interface information for a given interface
     * </pre>
     */
    public void getNetInterface(opi_api.network.v1.GetNetInterfaceRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.v1.NetInterface> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNetInterfaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the set of interfaces on the device
     * </pre>
     */
    public void listNetInterfaces(opi_api.network.v1.ListNetInterfacesRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.v1.ListNetInterfacesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListNetInterfacesMethod(), responseObserver);
    }

    /**
     * <pre>
     * A method for setting or changing configuration of an interface
     * </pre>
     */
    public void updateNetInterface(opi_api.network.v1.UpdateNetInterfaceRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.v1.NetInterface> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateNetInterfaceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetNetInterfaceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.v1.GetNetInterfaceRequest,
                opi_api.network.v1.NetInterface>(
                  this, METHODID_GET_NET_INTERFACE)))
          .addMethod(
            getListNetInterfacesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.v1.ListNetInterfacesRequest,
                opi_api.network.v1.ListNetInterfacesResponse>(
                  this, METHODID_LIST_NET_INTERFACES)))
          .addMethod(
            getUpdateNetInterfaceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.v1.UpdateNetInterfaceRequest,
                opi_api.network.v1.NetInterface>(
                  this, METHODID_UPDATE_NET_INTERFACE)))
          .build();
    }
  }

  /**
   * <pre>
   * Service functions for Network Interface exported by the server
   * </pre>
   */
  public static final class NetInterfaceServiceStub extends io.grpc.stub.AbstractAsyncStub<NetInterfaceServiceStub> {
    private NetInterfaceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetInterfaceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NetInterfaceServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the interface information for a given interface
     * </pre>
     */
    public void getNetInterface(opi_api.network.v1.GetNetInterfaceRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.v1.NetInterface> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNetInterfaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the set of interfaces on the device
     * </pre>
     */
    public void listNetInterfaces(opi_api.network.v1.ListNetInterfacesRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.v1.ListNetInterfacesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListNetInterfacesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * A method for setting or changing configuration of an interface
     * </pre>
     */
    public void updateNetInterface(opi_api.network.v1.UpdateNetInterfaceRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.v1.NetInterface> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateNetInterfaceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service functions for Network Interface exported by the server
   * </pre>
   */
  public static final class NetInterfaceServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<NetInterfaceServiceBlockingStub> {
    private NetInterfaceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetInterfaceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NetInterfaceServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the interface information for a given interface
     * </pre>
     */
    public opi_api.network.v1.NetInterface getNetInterface(opi_api.network.v1.GetNetInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNetInterfaceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the set of interfaces on the device
     * </pre>
     */
    public opi_api.network.v1.ListNetInterfacesResponse listNetInterfaces(opi_api.network.v1.ListNetInterfacesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListNetInterfacesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * A method for setting or changing configuration of an interface
     * </pre>
     */
    public opi_api.network.v1.NetInterface updateNetInterface(opi_api.network.v1.UpdateNetInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateNetInterfaceMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service functions for Network Interface exported by the server
   * </pre>
   */
  public static final class NetInterfaceServiceFutureStub extends io.grpc.stub.AbstractFutureStub<NetInterfaceServiceFutureStub> {
    private NetInterfaceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetInterfaceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NetInterfaceServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the interface information for a given interface
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.v1.NetInterface> getNetInterface(
        opi_api.network.v1.GetNetInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNetInterfaceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the set of interfaces on the device
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.v1.ListNetInterfacesResponse> listNetInterfaces(
        opi_api.network.v1.ListNetInterfacesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListNetInterfacesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * A method for setting or changing configuration of an interface
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.v1.NetInterface> updateNetInterface(
        opi_api.network.v1.UpdateNetInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateNetInterfaceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_NET_INTERFACE = 0;
  private static final int METHODID_LIST_NET_INTERFACES = 1;
  private static final int METHODID_UPDATE_NET_INTERFACE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NetInterfaceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NetInterfaceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_NET_INTERFACE:
          serviceImpl.getNetInterface((opi_api.network.v1.GetNetInterfaceRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.v1.NetInterface>) responseObserver);
          break;
        case METHODID_LIST_NET_INTERFACES:
          serviceImpl.listNetInterfaces((opi_api.network.v1.ListNetInterfacesRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.v1.ListNetInterfacesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_NET_INTERFACE:
          serviceImpl.updateNetInterface((opi_api.network.v1.UpdateNetInterfaceRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.v1.NetInterface>) responseObserver);
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

  private static abstract class NetInterfaceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NetInterfaceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return opi_api.network.v1.OcInterfacesProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NetInterfaceService");
    }
  }

  private static final class NetInterfaceServiceFileDescriptorSupplier
      extends NetInterfaceServiceBaseDescriptorSupplier {
    NetInterfaceServiceFileDescriptorSupplier() {}
  }

  private static final class NetInterfaceServiceMethodDescriptorSupplier
      extends NetInterfaceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NetInterfaceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (NetInterfaceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NetInterfaceServiceFileDescriptorSupplier())
              .addMethod(getGetNetInterfaceMethod())
              .addMethod(getListNetInterfacesMethod())
              .addMethod(getUpdateNetInterfaceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
