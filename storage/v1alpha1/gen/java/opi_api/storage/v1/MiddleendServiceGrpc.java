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
  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.CreateCryptoRequest,
      opi_api.storage.v1.Crypto> getCreateCryptoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCrypto",
      requestType = opi_api.storage.v1.CreateCryptoRequest.class,
      responseType = opi_api.storage.v1.Crypto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.CreateCryptoRequest,
      opi_api.storage.v1.Crypto> getCreateCryptoMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.CreateCryptoRequest, opi_api.storage.v1.Crypto> getCreateCryptoMethod;
    if ((getCreateCryptoMethod = MiddleendServiceGrpc.getCreateCryptoMethod) == null) {
      synchronized (MiddleendServiceGrpc.class) {
        if ((getCreateCryptoMethod = MiddleendServiceGrpc.getCreateCryptoMethod) == null) {
          MiddleendServiceGrpc.getCreateCryptoMethod = getCreateCryptoMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.CreateCryptoRequest, opi_api.storage.v1.Crypto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCrypto"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.CreateCryptoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.Crypto.getDefaultInstance()))
              .setSchemaDescriptor(new MiddleendServiceMethodDescriptorSupplier("CreateCrypto"))
              .build();
        }
      }
    }
    return getCreateCryptoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteCryptoRequest,
      com.google.protobuf.Empty> getDeleteCryptoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCrypto",
      requestType = opi_api.storage.v1.DeleteCryptoRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteCryptoRequest,
      com.google.protobuf.Empty> getDeleteCryptoMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteCryptoRequest, com.google.protobuf.Empty> getDeleteCryptoMethod;
    if ((getDeleteCryptoMethod = MiddleendServiceGrpc.getDeleteCryptoMethod) == null) {
      synchronized (MiddleendServiceGrpc.class) {
        if ((getDeleteCryptoMethod = MiddleendServiceGrpc.getDeleteCryptoMethod) == null) {
          MiddleendServiceGrpc.getDeleteCryptoMethod = getDeleteCryptoMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.DeleteCryptoRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCrypto"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.DeleteCryptoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new MiddleendServiceMethodDescriptorSupplier("DeleteCrypto"))
              .build();
        }
      }
    }
    return getDeleteCryptoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateCryptoRequest,
      opi_api.storage.v1.Crypto> getUpdateCryptoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCrypto",
      requestType = opi_api.storage.v1.UpdateCryptoRequest.class,
      responseType = opi_api.storage.v1.Crypto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateCryptoRequest,
      opi_api.storage.v1.Crypto> getUpdateCryptoMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.UpdateCryptoRequest, opi_api.storage.v1.Crypto> getUpdateCryptoMethod;
    if ((getUpdateCryptoMethod = MiddleendServiceGrpc.getUpdateCryptoMethod) == null) {
      synchronized (MiddleendServiceGrpc.class) {
        if ((getUpdateCryptoMethod = MiddleendServiceGrpc.getUpdateCryptoMethod) == null) {
          MiddleendServiceGrpc.getUpdateCryptoMethod = getUpdateCryptoMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.UpdateCryptoRequest, opi_api.storage.v1.Crypto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCrypto"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.UpdateCryptoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.Crypto.getDefaultInstance()))
              .setSchemaDescriptor(new MiddleendServiceMethodDescriptorSupplier("UpdateCrypto"))
              .build();
        }
      }
    }
    return getUpdateCryptoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.ListCryptoRequest,
      opi_api.storage.v1.ListCryptoResponse> getListCryptoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCrypto",
      requestType = opi_api.storage.v1.ListCryptoRequest.class,
      responseType = opi_api.storage.v1.ListCryptoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.ListCryptoRequest,
      opi_api.storage.v1.ListCryptoResponse> getListCryptoMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.ListCryptoRequest, opi_api.storage.v1.ListCryptoResponse> getListCryptoMethod;
    if ((getListCryptoMethod = MiddleendServiceGrpc.getListCryptoMethod) == null) {
      synchronized (MiddleendServiceGrpc.class) {
        if ((getListCryptoMethod = MiddleendServiceGrpc.getListCryptoMethod) == null) {
          MiddleendServiceGrpc.getListCryptoMethod = getListCryptoMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.ListCryptoRequest, opi_api.storage.v1.ListCryptoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCrypto"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListCryptoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ListCryptoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MiddleendServiceMethodDescriptorSupplier("ListCrypto"))
              .build();
        }
      }
    }
    return getListCryptoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.GetCryptoRequest,
      opi_api.storage.v1.Crypto> getGetCryptoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCrypto",
      requestType = opi_api.storage.v1.GetCryptoRequest.class,
      responseType = opi_api.storage.v1.Crypto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.GetCryptoRequest,
      opi_api.storage.v1.Crypto> getGetCryptoMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.GetCryptoRequest, opi_api.storage.v1.Crypto> getGetCryptoMethod;
    if ((getGetCryptoMethod = MiddleendServiceGrpc.getGetCryptoMethod) == null) {
      synchronized (MiddleendServiceGrpc.class) {
        if ((getGetCryptoMethod = MiddleendServiceGrpc.getGetCryptoMethod) == null) {
          MiddleendServiceGrpc.getGetCryptoMethod = getGetCryptoMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.GetCryptoRequest, opi_api.storage.v1.Crypto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCrypto"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.GetCryptoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.Crypto.getDefaultInstance()))
              .setSchemaDescriptor(new MiddleendServiceMethodDescriptorSupplier("GetCrypto"))
              .build();
        }
      }
    }
    return getGetCryptoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.CryptoStatsRequest,
      opi_api.storage.v1.CryptoStatsResponse> getCryptoStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CryptoStats",
      requestType = opi_api.storage.v1.CryptoStatsRequest.class,
      responseType = opi_api.storage.v1.CryptoStatsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.CryptoStatsRequest,
      opi_api.storage.v1.CryptoStatsResponse> getCryptoStatsMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.CryptoStatsRequest, opi_api.storage.v1.CryptoStatsResponse> getCryptoStatsMethod;
    if ((getCryptoStatsMethod = MiddleendServiceGrpc.getCryptoStatsMethod) == null) {
      synchronized (MiddleendServiceGrpc.class) {
        if ((getCryptoStatsMethod = MiddleendServiceGrpc.getCryptoStatsMethod) == null) {
          MiddleendServiceGrpc.getCryptoStatsMethod = getCryptoStatsMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.CryptoStatsRequest, opi_api.storage.v1.CryptoStatsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CryptoStats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.CryptoStatsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.CryptoStatsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MiddleendServiceMethodDescriptorSupplier("CryptoStats"))
              .build();
        }
      }
    }
    return getCryptoStatsMethod;
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
    public void createCrypto(opi_api.storage.v1.CreateCryptoRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.Crypto> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCryptoMethod(), responseObserver);
    }

    /**
     */
    public void deleteCrypto(opi_api.storage.v1.DeleteCryptoRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCryptoMethod(), responseObserver);
    }

    /**
     */
    public void updateCrypto(opi_api.storage.v1.UpdateCryptoRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.Crypto> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCryptoMethod(), responseObserver);
    }

    /**
     */
    public void listCrypto(opi_api.storage.v1.ListCryptoRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListCryptoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCryptoMethod(), responseObserver);
    }

    /**
     */
    public void getCrypto(opi_api.storage.v1.GetCryptoRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.Crypto> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCryptoMethod(), responseObserver);
    }

    /**
     */
    public void cryptoStats(opi_api.storage.v1.CryptoStatsRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.CryptoStatsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCryptoStatsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateCryptoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.CreateCryptoRequest,
                opi_api.storage.v1.Crypto>(
                  this, METHODID_CREATE_CRYPTO)))
          .addMethod(
            getDeleteCryptoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.DeleteCryptoRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_CRYPTO)))
          .addMethod(
            getUpdateCryptoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.UpdateCryptoRequest,
                opi_api.storage.v1.Crypto>(
                  this, METHODID_UPDATE_CRYPTO)))
          .addMethod(
            getListCryptoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.ListCryptoRequest,
                opi_api.storage.v1.ListCryptoResponse>(
                  this, METHODID_LIST_CRYPTO)))
          .addMethod(
            getGetCryptoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.GetCryptoRequest,
                opi_api.storage.v1.Crypto>(
                  this, METHODID_GET_CRYPTO)))
          .addMethod(
            getCryptoStatsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.CryptoStatsRequest,
                opi_api.storage.v1.CryptoStatsResponse>(
                  this, METHODID_CRYPTO_STATS)))
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
    public void createCrypto(opi_api.storage.v1.CreateCryptoRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.Crypto> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCryptoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteCrypto(opi_api.storage.v1.DeleteCryptoRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCryptoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateCrypto(opi_api.storage.v1.UpdateCryptoRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.Crypto> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCryptoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listCrypto(opi_api.storage.v1.ListCryptoRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.ListCryptoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCryptoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCrypto(opi_api.storage.v1.GetCryptoRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.Crypto> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCryptoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cryptoStats(opi_api.storage.v1.CryptoStatsRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.CryptoStatsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCryptoStatsMethod(), getCallOptions()), request, responseObserver);
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
    public opi_api.storage.v1.Crypto createCrypto(opi_api.storage.v1.CreateCryptoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCryptoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteCrypto(opi_api.storage.v1.DeleteCryptoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCryptoMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.Crypto updateCrypto(opi_api.storage.v1.UpdateCryptoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCryptoMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.ListCryptoResponse listCrypto(opi_api.storage.v1.ListCryptoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCryptoMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.Crypto getCrypto(opi_api.storage.v1.GetCryptoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCryptoMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.storage.v1.CryptoStatsResponse cryptoStats(opi_api.storage.v1.CryptoStatsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCryptoStatsMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.Crypto> createCrypto(
        opi_api.storage.v1.CreateCryptoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCryptoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteCrypto(
        opi_api.storage.v1.DeleteCryptoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCryptoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.Crypto> updateCrypto(
        opi_api.storage.v1.UpdateCryptoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCryptoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.ListCryptoResponse> listCrypto(
        opi_api.storage.v1.ListCryptoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCryptoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.Crypto> getCrypto(
        opi_api.storage.v1.GetCryptoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCryptoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.CryptoStatsResponse> cryptoStats(
        opi_api.storage.v1.CryptoStatsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCryptoStatsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CRYPTO = 0;
  private static final int METHODID_DELETE_CRYPTO = 1;
  private static final int METHODID_UPDATE_CRYPTO = 2;
  private static final int METHODID_LIST_CRYPTO = 3;
  private static final int METHODID_GET_CRYPTO = 4;
  private static final int METHODID_CRYPTO_STATS = 5;

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
        case METHODID_CREATE_CRYPTO:
          serviceImpl.createCrypto((opi_api.storage.v1.CreateCryptoRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.Crypto>) responseObserver);
          break;
        case METHODID_DELETE_CRYPTO:
          serviceImpl.deleteCrypto((opi_api.storage.v1.DeleteCryptoRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_CRYPTO:
          serviceImpl.updateCrypto((opi_api.storage.v1.UpdateCryptoRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.Crypto>) responseObserver);
          break;
        case METHODID_LIST_CRYPTO:
          serviceImpl.listCrypto((opi_api.storage.v1.ListCryptoRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.ListCryptoResponse>) responseObserver);
          break;
        case METHODID_GET_CRYPTO:
          serviceImpl.getCrypto((opi_api.storage.v1.GetCryptoRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.Crypto>) responseObserver);
          break;
        case METHODID_CRYPTO_STATS:
          serviceImpl.cryptoStats((opi_api.storage.v1.CryptoStatsRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.CryptoStatsResponse>) responseObserver);
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
              .addMethod(getCreateCryptoMethod())
              .addMethod(getDeleteCryptoMethod())
              .addMethod(getUpdateCryptoMethod())
              .addMethod(getListCryptoMethod())
              .addMethod(getGetCryptoMethod())
              .addMethod(getCryptoStatsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
