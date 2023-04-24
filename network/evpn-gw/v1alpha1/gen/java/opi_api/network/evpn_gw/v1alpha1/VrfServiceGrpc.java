package opi_api.network.evpn_gw.v1alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Management of Vrf Resources
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: l3_xpu_infra_mgr.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class VrfServiceGrpc {

  private VrfServiceGrpc() {}

  public static final String SERVICE_NAME = "opi_api.network.evpn_gw.v1alpha1.VrfService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest,
      opi_api.network.evpn_gw.v1alpha1.Vrf> getCreateVrfMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateVrf",
      requestType = opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest.class,
      responseType = opi_api.network.evpn_gw.v1alpha1.Vrf.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest,
      opi_api.network.evpn_gw.v1alpha1.Vrf> getCreateVrfMethod() {
    io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest, opi_api.network.evpn_gw.v1alpha1.Vrf> getCreateVrfMethod;
    if ((getCreateVrfMethod = VrfServiceGrpc.getCreateVrfMethod) == null) {
      synchronized (VrfServiceGrpc.class) {
        if ((getCreateVrfMethod = VrfServiceGrpc.getCreateVrfMethod) == null) {
          VrfServiceGrpc.getCreateVrfMethod = getCreateVrfMethod =
              io.grpc.MethodDescriptor.<opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest, opi_api.network.evpn_gw.v1alpha1.Vrf>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateVrf"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.evpn_gw.v1alpha1.Vrf.getDefaultInstance()))
              .setSchemaDescriptor(new VrfServiceMethodDescriptorSupplier("CreateVrf"))
              .build();
        }
      }
    }
    return getCreateVrfMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.ListVrfsRequest,
      opi_api.network.evpn_gw.v1alpha1.ListVrfsResponse> getListVrfsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListVrfs",
      requestType = opi_api.network.evpn_gw.v1alpha1.ListVrfsRequest.class,
      responseType = opi_api.network.evpn_gw.v1alpha1.ListVrfsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.ListVrfsRequest,
      opi_api.network.evpn_gw.v1alpha1.ListVrfsResponse> getListVrfsMethod() {
    io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.ListVrfsRequest, opi_api.network.evpn_gw.v1alpha1.ListVrfsResponse> getListVrfsMethod;
    if ((getListVrfsMethod = VrfServiceGrpc.getListVrfsMethod) == null) {
      synchronized (VrfServiceGrpc.class) {
        if ((getListVrfsMethod = VrfServiceGrpc.getListVrfsMethod) == null) {
          VrfServiceGrpc.getListVrfsMethod = getListVrfsMethod =
              io.grpc.MethodDescriptor.<opi_api.network.evpn_gw.v1alpha1.ListVrfsRequest, opi_api.network.evpn_gw.v1alpha1.ListVrfsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListVrfs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.evpn_gw.v1alpha1.ListVrfsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.evpn_gw.v1alpha1.ListVrfsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VrfServiceMethodDescriptorSupplier("ListVrfs"))
              .build();
        }
      }
    }
    return getListVrfsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.GetVrfRequest,
      opi_api.network.evpn_gw.v1alpha1.Vrf> getGetVrfMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVrf",
      requestType = opi_api.network.evpn_gw.v1alpha1.GetVrfRequest.class,
      responseType = opi_api.network.evpn_gw.v1alpha1.Vrf.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.GetVrfRequest,
      opi_api.network.evpn_gw.v1alpha1.Vrf> getGetVrfMethod() {
    io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.GetVrfRequest, opi_api.network.evpn_gw.v1alpha1.Vrf> getGetVrfMethod;
    if ((getGetVrfMethod = VrfServiceGrpc.getGetVrfMethod) == null) {
      synchronized (VrfServiceGrpc.class) {
        if ((getGetVrfMethod = VrfServiceGrpc.getGetVrfMethod) == null) {
          VrfServiceGrpc.getGetVrfMethod = getGetVrfMethod =
              io.grpc.MethodDescriptor.<opi_api.network.evpn_gw.v1alpha1.GetVrfRequest, opi_api.network.evpn_gw.v1alpha1.Vrf>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetVrf"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.evpn_gw.v1alpha1.GetVrfRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.evpn_gw.v1alpha1.Vrf.getDefaultInstance()))
              .setSchemaDescriptor(new VrfServiceMethodDescriptorSupplier("GetVrf"))
              .build();
        }
      }
    }
    return getGetVrfMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.DeleteVrfRequest,
      com.google.protobuf.Empty> getDeleteVrfMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteVrf",
      requestType = opi_api.network.evpn_gw.v1alpha1.DeleteVrfRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.DeleteVrfRequest,
      com.google.protobuf.Empty> getDeleteVrfMethod() {
    io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.DeleteVrfRequest, com.google.protobuf.Empty> getDeleteVrfMethod;
    if ((getDeleteVrfMethod = VrfServiceGrpc.getDeleteVrfMethod) == null) {
      synchronized (VrfServiceGrpc.class) {
        if ((getDeleteVrfMethod = VrfServiceGrpc.getDeleteVrfMethod) == null) {
          VrfServiceGrpc.getDeleteVrfMethod = getDeleteVrfMethod =
              io.grpc.MethodDescriptor.<opi_api.network.evpn_gw.v1alpha1.DeleteVrfRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteVrf"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.evpn_gw.v1alpha1.DeleteVrfRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new VrfServiceMethodDescriptorSupplier("DeleteVrf"))
              .build();
        }
      }
    }
    return getDeleteVrfMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VrfServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VrfServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VrfServiceStub>() {
        @java.lang.Override
        public VrfServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VrfServiceStub(channel, callOptions);
        }
      };
    return VrfServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VrfServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VrfServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VrfServiceBlockingStub>() {
        @java.lang.Override
        public VrfServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VrfServiceBlockingStub(channel, callOptions);
        }
      };
    return VrfServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VrfServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VrfServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VrfServiceFutureStub>() {
        @java.lang.Override
        public VrfServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VrfServiceFutureStub(channel, callOptions);
        }
      };
    return VrfServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Management of Vrf Resources
   * </pre>
   */
  public static abstract class VrfServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create a Vrf
     * </pre>
     */
    public void createVrf(opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.evpn_gw.v1alpha1.Vrf> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateVrfMethod(), responseObserver);
    }

    /**
     * <pre>
     * List Vrfs
     * </pre>
     */
    public void listVrfs(opi_api.network.evpn_gw.v1alpha1.ListVrfsRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.evpn_gw.v1alpha1.ListVrfsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListVrfsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve a Vrf
     * </pre>
     */
    public void getVrf(opi_api.network.evpn_gw.v1alpha1.GetVrfRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.evpn_gw.v1alpha1.Vrf> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVrfMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a Vrf
     * </pre>
     */
    public void deleteVrf(opi_api.network.evpn_gw.v1alpha1.DeleteVrfRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteVrfMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateVrfMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest,
                opi_api.network.evpn_gw.v1alpha1.Vrf>(
                  this, METHODID_CREATE_VRF)))
          .addMethod(
            getListVrfsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.evpn_gw.v1alpha1.ListVrfsRequest,
                opi_api.network.evpn_gw.v1alpha1.ListVrfsResponse>(
                  this, METHODID_LIST_VRFS)))
          .addMethod(
            getGetVrfMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.evpn_gw.v1alpha1.GetVrfRequest,
                opi_api.network.evpn_gw.v1alpha1.Vrf>(
                  this, METHODID_GET_VRF)))
          .addMethod(
            getDeleteVrfMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.evpn_gw.v1alpha1.DeleteVrfRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_VRF)))
          .build();
    }
  }

  /**
   * <pre>
   * Management of Vrf Resources
   * </pre>
   */
  public static final class VrfServiceStub extends io.grpc.stub.AbstractAsyncStub<VrfServiceStub> {
    private VrfServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VrfServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VrfServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a Vrf
     * </pre>
     */
    public void createVrf(opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.evpn_gw.v1alpha1.Vrf> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateVrfMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List Vrfs
     * </pre>
     */
    public void listVrfs(opi_api.network.evpn_gw.v1alpha1.ListVrfsRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.evpn_gw.v1alpha1.ListVrfsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListVrfsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve a Vrf
     * </pre>
     */
    public void getVrf(opi_api.network.evpn_gw.v1alpha1.GetVrfRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.evpn_gw.v1alpha1.Vrf> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVrfMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a Vrf
     * </pre>
     */
    public void deleteVrf(opi_api.network.evpn_gw.v1alpha1.DeleteVrfRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteVrfMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Management of Vrf Resources
   * </pre>
   */
  public static final class VrfServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<VrfServiceBlockingStub> {
    private VrfServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VrfServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VrfServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a Vrf
     * </pre>
     */
    public opi_api.network.evpn_gw.v1alpha1.Vrf createVrf(opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateVrfMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List Vrfs
     * </pre>
     */
    public opi_api.network.evpn_gw.v1alpha1.ListVrfsResponse listVrfs(opi_api.network.evpn_gw.v1alpha1.ListVrfsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListVrfsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve a Vrf
     * </pre>
     */
    public opi_api.network.evpn_gw.v1alpha1.Vrf getVrf(opi_api.network.evpn_gw.v1alpha1.GetVrfRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVrfMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a Vrf
     * </pre>
     */
    public com.google.protobuf.Empty deleteVrf(opi_api.network.evpn_gw.v1alpha1.DeleteVrfRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteVrfMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Management of Vrf Resources
   * </pre>
   */
  public static final class VrfServiceFutureStub extends io.grpc.stub.AbstractFutureStub<VrfServiceFutureStub> {
    private VrfServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VrfServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VrfServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a Vrf
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.evpn_gw.v1alpha1.Vrf> createVrf(
        opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateVrfMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List Vrfs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.evpn_gw.v1alpha1.ListVrfsResponse> listVrfs(
        opi_api.network.evpn_gw.v1alpha1.ListVrfsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListVrfsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve a Vrf
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.evpn_gw.v1alpha1.Vrf> getVrf(
        opi_api.network.evpn_gw.v1alpha1.GetVrfRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVrfMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a Vrf
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteVrf(
        opi_api.network.evpn_gw.v1alpha1.DeleteVrfRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteVrfMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_VRF = 0;
  private static final int METHODID_LIST_VRFS = 1;
  private static final int METHODID_GET_VRF = 2;
  private static final int METHODID_DELETE_VRF = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VrfServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(VrfServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_VRF:
          serviceImpl.createVrf((opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.evpn_gw.v1alpha1.Vrf>) responseObserver);
          break;
        case METHODID_LIST_VRFS:
          serviceImpl.listVrfs((opi_api.network.evpn_gw.v1alpha1.ListVrfsRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.evpn_gw.v1alpha1.ListVrfsResponse>) responseObserver);
          break;
        case METHODID_GET_VRF:
          serviceImpl.getVrf((opi_api.network.evpn_gw.v1alpha1.GetVrfRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.evpn_gw.v1alpha1.Vrf>) responseObserver);
          break;
        case METHODID_DELETE_VRF:
          serviceImpl.deleteVrf((opi_api.network.evpn_gw.v1alpha1.DeleteVrfRequest) request,
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

  private static abstract class VrfServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VrfServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return opi_api.network.evpn_gw.v1alpha1.L3XpuInfraMgrProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VrfService");
    }
  }

  private static final class VrfServiceFileDescriptorSupplier
      extends VrfServiceBaseDescriptorSupplier {
    VrfServiceFileDescriptorSupplier() {}
  }

  private static final class VrfServiceMethodDescriptorSupplier
      extends VrfServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    VrfServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (VrfServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VrfServiceFileDescriptorSupplier())
              .addMethod(getCreateVrfMethod())
              .addMethod(getListVrfsMethod())
              .addMethod(getGetVrfMethod())
              .addMethod(getDeleteVrfMethod())
              .build();
        }
      }
    }
    return result;
  }
}
