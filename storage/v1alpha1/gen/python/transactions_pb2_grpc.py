# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
import transactions_pb2 as transactions__pb2


class TransactionServiceStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.CreateTransaction = channel.unary_unary(
                '/opi_api.storage.v1.TransactionService/CreateTransaction',
                request_serializer=transactions__pb2.CreateTransactionRequest.SerializeToString,
                response_deserializer=transactions__pb2.Transaction.FromString,
                )
        self.DeleteTransaction = channel.unary_unary(
                '/opi_api.storage.v1.TransactionService/DeleteTransaction',
                request_serializer=transactions__pb2.DeleteTransactionRequest.SerializeToString,
                response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
                )
        self.ExecuteTransaction = channel.unary_unary(
                '/opi_api.storage.v1.TransactionService/ExecuteTransaction',
                request_serializer=transactions__pb2.ExecuteTransactionRequest.SerializeToString,
                response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
                )


class TransactionServiceServicer(object):
    """Missing associated documentation comment in .proto file."""

    def CreateTransaction(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DeleteTransaction(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ExecuteTransaction(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_TransactionServiceServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'CreateTransaction': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateTransaction,
                    request_deserializer=transactions__pb2.CreateTransactionRequest.FromString,
                    response_serializer=transactions__pb2.Transaction.SerializeToString,
            ),
            'DeleteTransaction': grpc.unary_unary_rpc_method_handler(
                    servicer.DeleteTransaction,
                    request_deserializer=transactions__pb2.DeleteTransactionRequest.FromString,
                    response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
            ),
            'ExecuteTransaction': grpc.unary_unary_rpc_method_handler(
                    servicer.ExecuteTransaction,
                    request_deserializer=transactions__pb2.ExecuteTransactionRequest.FromString,
                    response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'opi_api.storage.v1.TransactionService', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class TransactionService(object):
    """Missing associated documentation comment in .proto file."""

    @staticmethod
    def CreateTransaction(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/opi_api.storage.v1.TransactionService/CreateTransaction',
            transactions__pb2.CreateTransactionRequest.SerializeToString,
            transactions__pb2.Transaction.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DeleteTransaction(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/opi_api.storage.v1.TransactionService/DeleteTransaction',
            transactions__pb2.DeleteTransactionRequest.SerializeToString,
            google_dot_protobuf_dot_empty__pb2.Empty.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ExecuteTransaction(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/opi_api.storage.v1.TransactionService/ExecuteTransaction',
            transactions__pb2.ExecuteTransactionRequest.SerializeToString,
            google_dot_protobuf_dot_empty__pb2.Empty.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
