package opi_api.inventory.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service functions for the device inventory data
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: inventory.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class InventorySvcGrpc {

  private InventorySvcGrpc() {}

  public static final String SERVICE_NAME = "opi_api.inventory.v1.InventorySvc";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<opi_api.inventory.v1.GetInventoryRequest,
      opi_api.inventory.v1.Inventory> getGetInventoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInventory",
      requestType = opi_api.inventory.v1.GetInventoryRequest.class,
      responseType = opi_api.inventory.v1.Inventory.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.inventory.v1.GetInventoryRequest,
      opi_api.inventory.v1.Inventory> getGetInventoryMethod() {
    io.grpc.MethodDescriptor<opi_api.inventory.v1.GetInventoryRequest, opi_api.inventory.v1.Inventory> getGetInventoryMethod;
    if ((getGetInventoryMethod = InventorySvcGrpc.getGetInventoryMethod) == null) {
      synchronized (InventorySvcGrpc.class) {
        if ((getGetInventoryMethod = InventorySvcGrpc.getGetInventoryMethod) == null) {
          InventorySvcGrpc.getGetInventoryMethod = getGetInventoryMethod =
              io.grpc.MethodDescriptor.<opi_api.inventory.v1.GetInventoryRequest, opi_api.inventory.v1.Inventory>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetInventory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.inventory.v1.GetInventoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.inventory.v1.Inventory.getDefaultInstance()))
              .setSchemaDescriptor(new InventorySvcMethodDescriptorSupplier("GetInventory"))
              .build();
        }
      }
    }
    return getGetInventoryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InventorySvcStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InventorySvcStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InventorySvcStub>() {
        @java.lang.Override
        public InventorySvcStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InventorySvcStub(channel, callOptions);
        }
      };
    return InventorySvcStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InventorySvcBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InventorySvcBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InventorySvcBlockingStub>() {
        @java.lang.Override
        public InventorySvcBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InventorySvcBlockingStub(channel, callOptions);
        }
      };
    return InventorySvcBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InventorySvcFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InventorySvcFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InventorySvcFutureStub>() {
        @java.lang.Override
        public InventorySvcFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InventorySvcFutureStub(channel, callOptions);
        }
      };
    return InventorySvcFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service functions for the device inventory data
   * </pre>
   */
  public static abstract class InventorySvcImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * retrieves the inventory data for the device
     * </pre>
     */
    public void getInventory(opi_api.inventory.v1.GetInventoryRequest request,
        io.grpc.stub.StreamObserver<opi_api.inventory.v1.Inventory> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetInventoryMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetInventoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.inventory.v1.GetInventoryRequest,
                opi_api.inventory.v1.Inventory>(
                  this, METHODID_GET_INVENTORY)))
          .build();
    }
  }

  /**
   * <pre>
   * Service functions for the device inventory data
   * </pre>
   */
  public static final class InventorySvcStub extends io.grpc.stub.AbstractAsyncStub<InventorySvcStub> {
    private InventorySvcStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventorySvcStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InventorySvcStub(channel, callOptions);
    }

    /**
     * <pre>
     * retrieves the inventory data for the device
     * </pre>
     */
    public void getInventory(opi_api.inventory.v1.GetInventoryRequest request,
        io.grpc.stub.StreamObserver<opi_api.inventory.v1.Inventory> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetInventoryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service functions for the device inventory data
   * </pre>
   */
  public static final class InventorySvcBlockingStub extends io.grpc.stub.AbstractBlockingStub<InventorySvcBlockingStub> {
    private InventorySvcBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventorySvcBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InventorySvcBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * retrieves the inventory data for the device
     * </pre>
     */
    public opi_api.inventory.v1.Inventory getInventory(opi_api.inventory.v1.GetInventoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetInventoryMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service functions for the device inventory data
   * </pre>
   */
  public static final class InventorySvcFutureStub extends io.grpc.stub.AbstractFutureStub<InventorySvcFutureStub> {
    private InventorySvcFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventorySvcFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InventorySvcFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * retrieves the inventory data for the device
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.inventory.v1.Inventory> getInventory(
        opi_api.inventory.v1.GetInventoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetInventoryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_INVENTORY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InventorySvcImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InventorySvcImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_INVENTORY:
          serviceImpl.getInventory((opi_api.inventory.v1.GetInventoryRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.inventory.v1.Inventory>) responseObserver);
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

  private static abstract class InventorySvcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InventorySvcBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return opi_api.inventory.v1.InventoryProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InventorySvc");
    }
  }

  private static final class InventorySvcFileDescriptorSupplier
      extends InventorySvcBaseDescriptorSupplier {
    InventorySvcFileDescriptorSupplier() {}
  }

  private static final class InventorySvcMethodDescriptorSupplier
      extends InventorySvcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InventorySvcMethodDescriptorSupplier(String methodName) {
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
      synchronized (InventorySvcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InventorySvcFileDescriptorSupplier())
              .addMethod(getGetInventoryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
