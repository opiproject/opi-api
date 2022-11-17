package opi_api.storage.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: transactions.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TransactionServiceGrpc {

  private TransactionServiceGrpc() {}

  public static final String SERVICE_NAME = "opi_api.storage.v1.TransactionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.CreateTransactionRequest,
      opi_api.storage.v1.Transaction> getCreateTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTransaction",
      requestType = opi_api.storage.v1.CreateTransactionRequest.class,
      responseType = opi_api.storage.v1.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.CreateTransactionRequest,
      opi_api.storage.v1.Transaction> getCreateTransactionMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.CreateTransactionRequest, opi_api.storage.v1.Transaction> getCreateTransactionMethod;
    if ((getCreateTransactionMethod = TransactionServiceGrpc.getCreateTransactionMethod) == null) {
      synchronized (TransactionServiceGrpc.class) {
        if ((getCreateTransactionMethod = TransactionServiceGrpc.getCreateTransactionMethod) == null) {
          TransactionServiceGrpc.getCreateTransactionMethod = getCreateTransactionMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.CreateTransactionRequest, opi_api.storage.v1.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.CreateTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new TransactionServiceMethodDescriptorSupplier("CreateTransaction"))
              .build();
        }
      }
    }
    return getCreateTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteTransactionRequest,
      com.google.protobuf.Empty> getDeleteTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTransaction",
      requestType = opi_api.storage.v1.DeleteTransactionRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteTransactionRequest,
      com.google.protobuf.Empty> getDeleteTransactionMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.DeleteTransactionRequest, com.google.protobuf.Empty> getDeleteTransactionMethod;
    if ((getDeleteTransactionMethod = TransactionServiceGrpc.getDeleteTransactionMethod) == null) {
      synchronized (TransactionServiceGrpc.class) {
        if ((getDeleteTransactionMethod = TransactionServiceGrpc.getDeleteTransactionMethod) == null) {
          TransactionServiceGrpc.getDeleteTransactionMethod = getDeleteTransactionMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.DeleteTransactionRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.DeleteTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new TransactionServiceMethodDescriptorSupplier("DeleteTransaction"))
              .build();
        }
      }
    }
    return getDeleteTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.storage.v1.ExecuteTransactionRequest,
      com.google.protobuf.Empty> getExecuteTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExecuteTransaction",
      requestType = opi_api.storage.v1.ExecuteTransactionRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.storage.v1.ExecuteTransactionRequest,
      com.google.protobuf.Empty> getExecuteTransactionMethod() {
    io.grpc.MethodDescriptor<opi_api.storage.v1.ExecuteTransactionRequest, com.google.protobuf.Empty> getExecuteTransactionMethod;
    if ((getExecuteTransactionMethod = TransactionServiceGrpc.getExecuteTransactionMethod) == null) {
      synchronized (TransactionServiceGrpc.class) {
        if ((getExecuteTransactionMethod = TransactionServiceGrpc.getExecuteTransactionMethod) == null) {
          TransactionServiceGrpc.getExecuteTransactionMethod = getExecuteTransactionMethod =
              io.grpc.MethodDescriptor.<opi_api.storage.v1.ExecuteTransactionRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExecuteTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.storage.v1.ExecuteTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new TransactionServiceMethodDescriptorSupplier("ExecuteTransaction"))
              .build();
        }
      }
    }
    return getExecuteTransactionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TransactionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TransactionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TransactionServiceStub>() {
        @java.lang.Override
        public TransactionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TransactionServiceStub(channel, callOptions);
        }
      };
    return TransactionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TransactionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TransactionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TransactionServiceBlockingStub>() {
        @java.lang.Override
        public TransactionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TransactionServiceBlockingStub(channel, callOptions);
        }
      };
    return TransactionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TransactionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TransactionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TransactionServiceFutureStub>() {
        @java.lang.Override
        public TransactionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TransactionServiceFutureStub(channel, callOptions);
        }
      };
    return TransactionServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TransactionServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createTransaction(opi_api.storage.v1.CreateTransactionRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.Transaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTransactionMethod(), responseObserver);
    }

    /**
     */
    public void deleteTransaction(opi_api.storage.v1.DeleteTransactionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTransactionMethod(), responseObserver);
    }

    /**
     */
    public void executeTransaction(opi_api.storage.v1.ExecuteTransactionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExecuteTransactionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateTransactionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.CreateTransactionRequest,
                opi_api.storage.v1.Transaction>(
                  this, METHODID_CREATE_TRANSACTION)))
          .addMethod(
            getDeleteTransactionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.DeleteTransactionRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_TRANSACTION)))
          .addMethod(
            getExecuteTransactionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.storage.v1.ExecuteTransactionRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_EXECUTE_TRANSACTION)))
          .build();
    }
  }

  /**
   */
  public static final class TransactionServiceStub extends io.grpc.stub.AbstractAsyncStub<TransactionServiceStub> {
    private TransactionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransactionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TransactionServiceStub(channel, callOptions);
    }

    /**
     */
    public void createTransaction(opi_api.storage.v1.CreateTransactionRequest request,
        io.grpc.stub.StreamObserver<opi_api.storage.v1.Transaction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTransaction(opi_api.storage.v1.DeleteTransactionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void executeTransaction(opi_api.storage.v1.ExecuteTransactionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExecuteTransactionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TransactionServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TransactionServiceBlockingStub> {
    private TransactionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransactionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TransactionServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public opi_api.storage.v1.Transaction createTransaction(opi_api.storage.v1.CreateTransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteTransaction(opi_api.storage.v1.DeleteTransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty executeTransaction(opi_api.storage.v1.ExecuteTransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExecuteTransactionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TransactionServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TransactionServiceFutureStub> {
    private TransactionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransactionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TransactionServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.storage.v1.Transaction> createTransaction(
        opi_api.storage.v1.CreateTransactionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteTransaction(
        opi_api.storage.v1.DeleteTransactionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> executeTransaction(
        opi_api.storage.v1.ExecuteTransactionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExecuteTransactionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TRANSACTION = 0;
  private static final int METHODID_DELETE_TRANSACTION = 1;
  private static final int METHODID_EXECUTE_TRANSACTION = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TransactionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TransactionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_TRANSACTION:
          serviceImpl.createTransaction((opi_api.storage.v1.CreateTransactionRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.storage.v1.Transaction>) responseObserver);
          break;
        case METHODID_DELETE_TRANSACTION:
          serviceImpl.deleteTransaction((opi_api.storage.v1.DeleteTransactionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_EXECUTE_TRANSACTION:
          serviceImpl.executeTransaction((opi_api.storage.v1.ExecuteTransactionRequest) request,
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

  private static abstract class TransactionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TransactionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return opi_api.storage.v1.TransactionsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TransactionService");
    }
  }

  private static final class TransactionServiceFileDescriptorSupplier
      extends TransactionServiceBaseDescriptorSupplier {
    TransactionServiceFileDescriptorSupplier() {}
  }

  private static final class TransactionServiceMethodDescriptorSupplier
      extends TransactionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TransactionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TransactionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TransactionServiceFileDescriptorSupplier())
              .addMethod(getCreateTransactionMethod())
              .addMethod(getDeleteTransactionMethod())
              .addMethod(getExecuteTransactionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
