# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

import backend_aio_pb2 as backend__aio__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2


class AioRemoteControllerServiceStub(object):
    """Back End (network-facing) APIs.

    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.AioRemoteControllerCreate = channel.unary_unary(
                '/opi_api.storage.v1.AioRemoteControllerService/AioRemoteControllerCreate',
                request_serializer=backend__aio__pb2.AioRemoteControllerCreateRequest.SerializeToString,
                response_deserializer=backend__aio__pb2.AioRemoteController.FromString,
                )
        self.AioRemoteControllerDelete = channel.unary_unary(
                '/opi_api.storage.v1.AioRemoteControllerService/AioRemoteControllerDelete',
                request_serializer=backend__aio__pb2.AioRemoteControllerDeleteRequest.SerializeToString,
                response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
                )
        self.AioRemoteControllerGet = channel.unary_unary(
                '/opi_api.storage.v1.AioRemoteControllerService/AioRemoteControllerGet',
                request_serializer=backend__aio__pb2.AioRemoteControllerGetRequest.SerializeToString,
                response_deserializer=backend__aio__pb2.AioRemoteController.FromString,
                )
        self.AioRemoteControllerGetList = channel.unary_unary(
                '/opi_api.storage.v1.AioRemoteControllerService/AioRemoteControllerGetList',
                request_serializer=backend__aio__pb2.AioRemoteControllerGetListRequest.SerializeToString,
                response_deserializer=backend__aio__pb2.AioRemoteControllerList.FromString,
                )
        self.AioRemoteControllerGetStats = channel.unary_unary(
                '/opi_api.storage.v1.AioRemoteControllerService/AioRemoteControllerGetStats',
                request_serializer=backend__aio__pb2.AioRemoteControllerGetStatsRequest.SerializeToString,
                response_deserializer=backend__aio__pb2.AioRemoteControllerStats.FromString,
                )
        self.AioRemoteControllerUpdate = channel.unary_unary(
                '/opi_api.storage.v1.AioRemoteControllerService/AioRemoteControllerUpdate',
                request_serializer=backend__aio__pb2.AioRemoteControllerUpdateRequest.SerializeToString,
                response_deserializer=backend__aio__pb2.AioRemoteController.FromString,
                )


class AioRemoteControllerServiceServicer(object):
    """Back End (network-facing) APIs.

    """

    def AioRemoteControllerCreate(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def AioRemoteControllerDelete(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def AioRemoteControllerGet(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def AioRemoteControllerGetList(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def AioRemoteControllerGetStats(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def AioRemoteControllerUpdate(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_AioRemoteControllerServiceServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'AioRemoteControllerCreate': grpc.unary_unary_rpc_method_handler(
                    servicer.AioRemoteControllerCreate,
                    request_deserializer=backend__aio__pb2.AioRemoteControllerCreateRequest.FromString,
                    response_serializer=backend__aio__pb2.AioRemoteController.SerializeToString,
            ),
            'AioRemoteControllerDelete': grpc.unary_unary_rpc_method_handler(
                    servicer.AioRemoteControllerDelete,
                    request_deserializer=backend__aio__pb2.AioRemoteControllerDeleteRequest.FromString,
                    response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
            ),
            'AioRemoteControllerGet': grpc.unary_unary_rpc_method_handler(
                    servicer.AioRemoteControllerGet,
                    request_deserializer=backend__aio__pb2.AioRemoteControllerGetRequest.FromString,
                    response_serializer=backend__aio__pb2.AioRemoteController.SerializeToString,
            ),
            'AioRemoteControllerGetList': grpc.unary_unary_rpc_method_handler(
                    servicer.AioRemoteControllerGetList,
                    request_deserializer=backend__aio__pb2.AioRemoteControllerGetListRequest.FromString,
                    response_serializer=backend__aio__pb2.AioRemoteControllerList.SerializeToString,
            ),
            'AioRemoteControllerGetStats': grpc.unary_unary_rpc_method_handler(
                    servicer.AioRemoteControllerGetStats,
                    request_deserializer=backend__aio__pb2.AioRemoteControllerGetStatsRequest.FromString,
                    response_serializer=backend__aio__pb2.AioRemoteControllerStats.SerializeToString,
            ),
            'AioRemoteControllerUpdate': grpc.unary_unary_rpc_method_handler(
                    servicer.AioRemoteControllerUpdate,
                    request_deserializer=backend__aio__pb2.AioRemoteControllerUpdateRequest.FromString,
                    response_serializer=backend__aio__pb2.AioRemoteController.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'opi_api.storage.v1.AioRemoteControllerService', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class AioRemoteControllerService(object):
    """Back End (network-facing) APIs.

    """

    @staticmethod
    def AioRemoteControllerCreate(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/opi_api.storage.v1.AioRemoteControllerService/AioRemoteControllerCreate',
            backend__aio__pb2.AioRemoteControllerCreateRequest.SerializeToString,
            backend__aio__pb2.AioRemoteController.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def AioRemoteControllerDelete(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/opi_api.storage.v1.AioRemoteControllerService/AioRemoteControllerDelete',
            backend__aio__pb2.AioRemoteControllerDeleteRequest.SerializeToString,
            google_dot_protobuf_dot_empty__pb2.Empty.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def AioRemoteControllerGet(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/opi_api.storage.v1.AioRemoteControllerService/AioRemoteControllerGet',
            backend__aio__pb2.AioRemoteControllerGetRequest.SerializeToString,
            backend__aio__pb2.AioRemoteController.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def AioRemoteControllerGetList(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/opi_api.storage.v1.AioRemoteControllerService/AioRemoteControllerGetList',
            backend__aio__pb2.AioRemoteControllerGetListRequest.SerializeToString,
            backend__aio__pb2.AioRemoteControllerList.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def AioRemoteControllerGetStats(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/opi_api.storage.v1.AioRemoteControllerService/AioRemoteControllerGetStats',
            backend__aio__pb2.AioRemoteControllerGetStatsRequest.SerializeToString,
            backend__aio__pb2.AioRemoteControllerStats.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def AioRemoteControllerUpdate(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/opi_api.storage.v1.AioRemoteControllerService/AioRemoteControllerUpdate',
            backend__aio__pb2.AioRemoteControllerUpdateRequest.SerializeToString,
            backend__aio__pb2.AioRemoteController.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
