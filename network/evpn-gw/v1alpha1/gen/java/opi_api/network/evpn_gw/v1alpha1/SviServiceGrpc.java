package opi_api.network.evpn_gw.v1alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Management of switch virtual interfaces (SVIs) binding LogicalBridges to VRFs.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: l3_xpu_infra_mgr.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SviServiceGrpc {

  private SviServiceGrpc() {}

  public static final String SERVICE_NAME = "opi_api.network.evpn_gw.v1alpha1.SviService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.CreateSviRequest,
      opi_api.network.evpn_gw.v1alpha1.Svi> getCreateSviMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSvi",
      requestType = opi_api.network.evpn_gw.v1alpha1.CreateSviRequest.class,
      responseType = opi_api.network.evpn_gw.v1alpha1.Svi.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.CreateSviRequest,
      opi_api.network.evpn_gw.v1alpha1.Svi> getCreateSviMethod() {
    io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.CreateSviRequest, opi_api.network.evpn_gw.v1alpha1.Svi> getCreateSviMethod;
    if ((getCreateSviMethod = SviServiceGrpc.getCreateSviMethod) == null) {
      synchronized (SviServiceGrpc.class) {
        if ((getCreateSviMethod = SviServiceGrpc.getCreateSviMethod) == null) {
          SviServiceGrpc.getCreateSviMethod = getCreateSviMethod =
              io.grpc.MethodDescriptor.<opi_api.network.evpn_gw.v1alpha1.CreateSviRequest, opi_api.network.evpn_gw.v1alpha1.Svi>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSvi"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.evpn_gw.v1alpha1.CreateSviRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.evpn_gw.v1alpha1.Svi.getDefaultInstance()))
              .setSchemaDescriptor(new SviServiceMethodDescriptorSupplier("CreateSvi"))
              .build();
        }
      }
    }
    return getCreateSviMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.ListSvisRequest,
      opi_api.network.evpn_gw.v1alpha1.ListSvisResponse> getListSvisMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSvis",
      requestType = opi_api.network.evpn_gw.v1alpha1.ListSvisRequest.class,
      responseType = opi_api.network.evpn_gw.v1alpha1.ListSvisResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.ListSvisRequest,
      opi_api.network.evpn_gw.v1alpha1.ListSvisResponse> getListSvisMethod() {
    io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.ListSvisRequest, opi_api.network.evpn_gw.v1alpha1.ListSvisResponse> getListSvisMethod;
    if ((getListSvisMethod = SviServiceGrpc.getListSvisMethod) == null) {
      synchronized (SviServiceGrpc.class) {
        if ((getListSvisMethod = SviServiceGrpc.getListSvisMethod) == null) {
          SviServiceGrpc.getListSvisMethod = getListSvisMethod =
              io.grpc.MethodDescriptor.<opi_api.network.evpn_gw.v1alpha1.ListSvisRequest, opi_api.network.evpn_gw.v1alpha1.ListSvisResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSvis"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.evpn_gw.v1alpha1.ListSvisRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.evpn_gw.v1alpha1.ListSvisResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SviServiceMethodDescriptorSupplier("ListSvis"))
              .build();
        }
      }
    }
    return getListSvisMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.GetSviRequest,
      opi_api.network.evpn_gw.v1alpha1.Svi> getGetSviMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSvi",
      requestType = opi_api.network.evpn_gw.v1alpha1.GetSviRequest.class,
      responseType = opi_api.network.evpn_gw.v1alpha1.Svi.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.GetSviRequest,
      opi_api.network.evpn_gw.v1alpha1.Svi> getGetSviMethod() {
    io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.GetSviRequest, opi_api.network.evpn_gw.v1alpha1.Svi> getGetSviMethod;
    if ((getGetSviMethod = SviServiceGrpc.getGetSviMethod) == null) {
      synchronized (SviServiceGrpc.class) {
        if ((getGetSviMethod = SviServiceGrpc.getGetSviMethod) == null) {
          SviServiceGrpc.getGetSviMethod = getGetSviMethod =
              io.grpc.MethodDescriptor.<opi_api.network.evpn_gw.v1alpha1.GetSviRequest, opi_api.network.evpn_gw.v1alpha1.Svi>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSvi"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.evpn_gw.v1alpha1.GetSviRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.evpn_gw.v1alpha1.Svi.getDefaultInstance()))
              .setSchemaDescriptor(new SviServiceMethodDescriptorSupplier("GetSvi"))
              .build();
        }
      }
    }
    return getGetSviMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.DeleteSviRequest,
      com.google.protobuf.Empty> getDeleteSviMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSvi",
      requestType = opi_api.network.evpn_gw.v1alpha1.DeleteSviRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.DeleteSviRequest,
      com.google.protobuf.Empty> getDeleteSviMethod() {
    io.grpc.MethodDescriptor<opi_api.network.evpn_gw.v1alpha1.DeleteSviRequest, com.google.protobuf.Empty> getDeleteSviMethod;
    if ((getDeleteSviMethod = SviServiceGrpc.getDeleteSviMethod) == null) {
      synchronized (SviServiceGrpc.class) {
        if ((getDeleteSviMethod = SviServiceGrpc.getDeleteSviMethod) == null) {
          SviServiceGrpc.getDeleteSviMethod = getDeleteSviMethod =
              io.grpc.MethodDescriptor.<opi_api.network.evpn_gw.v1alpha1.DeleteSviRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSvi"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.evpn_gw.v1alpha1.DeleteSviRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new SviServiceMethodDescriptorSupplier("DeleteSvi"))
              .build();
        }
      }
    }
    return getDeleteSviMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SviServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SviServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SviServiceStub>() {
        @java.lang.Override
        public SviServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SviServiceStub(channel, callOptions);
        }
      };
    return SviServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SviServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SviServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SviServiceBlockingStub>() {
        @java.lang.Override
        public SviServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SviServiceBlockingStub(channel, callOptions);
        }
      };
    return SviServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SviServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SviServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SviServiceFutureStub>() {
        @java.lang.Override
        public SviServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SviServiceFutureStub(channel, callOptions);
        }
      };
    return SviServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Management of switch virtual interfaces (SVIs) binding LogicalBridges to VRFs.
   * </pre>
   */
  public static abstract class SviServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create a Svi
     * </pre>
     */
    public void createSvi(opi_api.network.evpn_gw.v1alpha1.CreateSviRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.evpn_gw.v1alpha1.Svi> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSviMethod(), responseObserver);
    }

    /**
     * <pre>
     * List Svis
     * </pre>
     */
    public void listSvis(opi_api.network.evpn_gw.v1alpha1.ListSvisRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.evpn_gw.v1alpha1.ListSvisResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSvisMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve a Svi
     * (-- api-linter: core::0131::method-signature=disabled
     *     aip.dev/not-precedent: "vrf" and "vlan_id" are the keys. --)
     * (-- api-linter: client-libraries::4232::required-fields=disabled
     *     aip.dev/not-precedent: vrf" and "vlan_id" are the required fields. --)
     * (-- api-linter: core::0131::http-uri-name=disabled
     *     aip.dev/not-precedent: No "name" is used as key. --)
     * </pre>
     */
    public void getSvi(opi_api.network.evpn_gw.v1alpha1.GetSviRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.evpn_gw.v1alpha1.Svi> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSviMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a Svi
     * (-- api-linter: core::0135::method-signature=disabled
     *     aip.dev/not-precedent: "vrf" and "vlan_id" are the keys. --)
     * (-- api-linter: client-libraries::4232::required-fields=disabled
     *     aip.dev/not-precedent: "vrf" and "vlan_id" are the required fields. --)
     * (-- api-linter: core::0135::http-uri-name=disabled
     *     aip.dev/not-precedent: The "name" is not used as key. --)
     * </pre>
     */
    public void deleteSvi(opi_api.network.evpn_gw.v1alpha1.DeleteSviRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSviMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateSviMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.evpn_gw.v1alpha1.CreateSviRequest,
                opi_api.network.evpn_gw.v1alpha1.Svi>(
                  this, METHODID_CREATE_SVI)))
          .addMethod(
            getListSvisMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.evpn_gw.v1alpha1.ListSvisRequest,
                opi_api.network.evpn_gw.v1alpha1.ListSvisResponse>(
                  this, METHODID_LIST_SVIS)))
          .addMethod(
            getGetSviMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.evpn_gw.v1alpha1.GetSviRequest,
                opi_api.network.evpn_gw.v1alpha1.Svi>(
                  this, METHODID_GET_SVI)))
          .addMethod(
            getDeleteSviMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.evpn_gw.v1alpha1.DeleteSviRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_SVI)))
          .build();
    }
  }

  /**
   * <pre>
   * Management of switch virtual interfaces (SVIs) binding LogicalBridges to VRFs.
   * </pre>
   */
  public static final class SviServiceStub extends io.grpc.stub.AbstractAsyncStub<SviServiceStub> {
    private SviServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SviServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SviServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a Svi
     * </pre>
     */
    public void createSvi(opi_api.network.evpn_gw.v1alpha1.CreateSviRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.evpn_gw.v1alpha1.Svi> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSviMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List Svis
     * </pre>
     */
    public void listSvis(opi_api.network.evpn_gw.v1alpha1.ListSvisRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.evpn_gw.v1alpha1.ListSvisResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSvisMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve a Svi
     * (-- api-linter: core::0131::method-signature=disabled
     *     aip.dev/not-precedent: "vrf" and "vlan_id" are the keys. --)
     * (-- api-linter: client-libraries::4232::required-fields=disabled
     *     aip.dev/not-precedent: vrf" and "vlan_id" are the required fields. --)
     * (-- api-linter: core::0131::http-uri-name=disabled
     *     aip.dev/not-precedent: No "name" is used as key. --)
     * </pre>
     */
    public void getSvi(opi_api.network.evpn_gw.v1alpha1.GetSviRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.evpn_gw.v1alpha1.Svi> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSviMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a Svi
     * (-- api-linter: core::0135::method-signature=disabled
     *     aip.dev/not-precedent: "vrf" and "vlan_id" are the keys. --)
     * (-- api-linter: client-libraries::4232::required-fields=disabled
     *     aip.dev/not-precedent: "vrf" and "vlan_id" are the required fields. --)
     * (-- api-linter: core::0135::http-uri-name=disabled
     *     aip.dev/not-precedent: The "name" is not used as key. --)
     * </pre>
     */
    public void deleteSvi(opi_api.network.evpn_gw.v1alpha1.DeleteSviRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSviMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Management of switch virtual interfaces (SVIs) binding LogicalBridges to VRFs.
   * </pre>
   */
  public static final class SviServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SviServiceBlockingStub> {
    private SviServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SviServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SviServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a Svi
     * </pre>
     */
    public opi_api.network.evpn_gw.v1alpha1.Svi createSvi(opi_api.network.evpn_gw.v1alpha1.CreateSviRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSviMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List Svis
     * </pre>
     */
    public opi_api.network.evpn_gw.v1alpha1.ListSvisResponse listSvis(opi_api.network.evpn_gw.v1alpha1.ListSvisRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSvisMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve a Svi
     * (-- api-linter: core::0131::method-signature=disabled
     *     aip.dev/not-precedent: "vrf" and "vlan_id" are the keys. --)
     * (-- api-linter: client-libraries::4232::required-fields=disabled
     *     aip.dev/not-precedent: vrf" and "vlan_id" are the required fields. --)
     * (-- api-linter: core::0131::http-uri-name=disabled
     *     aip.dev/not-precedent: No "name" is used as key. --)
     * </pre>
     */
    public opi_api.network.evpn_gw.v1alpha1.Svi getSvi(opi_api.network.evpn_gw.v1alpha1.GetSviRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSviMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a Svi
     * (-- api-linter: core::0135::method-signature=disabled
     *     aip.dev/not-precedent: "vrf" and "vlan_id" are the keys. --)
     * (-- api-linter: client-libraries::4232::required-fields=disabled
     *     aip.dev/not-precedent: "vrf" and "vlan_id" are the required fields. --)
     * (-- api-linter: core::0135::http-uri-name=disabled
     *     aip.dev/not-precedent: The "name" is not used as key. --)
     * </pre>
     */
    public com.google.protobuf.Empty deleteSvi(opi_api.network.evpn_gw.v1alpha1.DeleteSviRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSviMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Management of switch virtual interfaces (SVIs) binding LogicalBridges to VRFs.
   * </pre>
   */
  public static final class SviServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SviServiceFutureStub> {
    private SviServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SviServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SviServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a Svi
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.evpn_gw.v1alpha1.Svi> createSvi(
        opi_api.network.evpn_gw.v1alpha1.CreateSviRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSviMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List Svis
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.evpn_gw.v1alpha1.ListSvisResponse> listSvis(
        opi_api.network.evpn_gw.v1alpha1.ListSvisRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSvisMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve a Svi
     * (-- api-linter: core::0131::method-signature=disabled
     *     aip.dev/not-precedent: "vrf" and "vlan_id" are the keys. --)
     * (-- api-linter: client-libraries::4232::required-fields=disabled
     *     aip.dev/not-precedent: vrf" and "vlan_id" are the required fields. --)
     * (-- api-linter: core::0131::http-uri-name=disabled
     *     aip.dev/not-precedent: No "name" is used as key. --)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.evpn_gw.v1alpha1.Svi> getSvi(
        opi_api.network.evpn_gw.v1alpha1.GetSviRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSviMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a Svi
     * (-- api-linter: core::0135::method-signature=disabled
     *     aip.dev/not-precedent: "vrf" and "vlan_id" are the keys. --)
     * (-- api-linter: client-libraries::4232::required-fields=disabled
     *     aip.dev/not-precedent: "vrf" and "vlan_id" are the required fields. --)
     * (-- api-linter: core::0135::http-uri-name=disabled
     *     aip.dev/not-precedent: The "name" is not used as key. --)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteSvi(
        opi_api.network.evpn_gw.v1alpha1.DeleteSviRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSviMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_SVI = 0;
  private static final int METHODID_LIST_SVIS = 1;
  private static final int METHODID_GET_SVI = 2;
  private static final int METHODID_DELETE_SVI = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SviServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SviServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_SVI:
          serviceImpl.createSvi((opi_api.network.evpn_gw.v1alpha1.CreateSviRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.evpn_gw.v1alpha1.Svi>) responseObserver);
          break;
        case METHODID_LIST_SVIS:
          serviceImpl.listSvis((opi_api.network.evpn_gw.v1alpha1.ListSvisRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.evpn_gw.v1alpha1.ListSvisResponse>) responseObserver);
          break;
        case METHODID_GET_SVI:
          serviceImpl.getSvi((opi_api.network.evpn_gw.v1alpha1.GetSviRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.evpn_gw.v1alpha1.Svi>) responseObserver);
          break;
        case METHODID_DELETE_SVI:
          serviceImpl.deleteSvi((opi_api.network.evpn_gw.v1alpha1.DeleteSviRequest) request,
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

  private static abstract class SviServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SviServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return opi_api.network.evpn_gw.v1alpha1.L3XpuInfraMgrProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SviService");
    }
  }

  private static final class SviServiceFileDescriptorSupplier
      extends SviServiceBaseDescriptorSupplier {
    SviServiceFileDescriptorSupplier() {}
  }

  private static final class SviServiceMethodDescriptorSupplier
      extends SviServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SviServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SviServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SviServiceFileDescriptorSupplier())
              .addMethod(getCreateSviMethod())
              .addMethod(getListSvisMethod())
              .addMethod(getGetSviMethod())
              .addMethod(getDeleteSviMethod())
              .build();
        }
      }
    }
    return result;
  }
}
