# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from storage import frontend_virtio_blk_pb2 as storage_dot_frontend__virtio__blk__pb2


class FrontendVirtioBlkServiceStub(object):
    """Front End (host-facing) APIs. Mostly used for Virtio-blk emulation and host presentation as alternative to Nvme.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.CreateVirtioBlk = channel.unary_unary(
                '/opi_api.storage.v1.FrontendVirtioBlkService/CreateVirtioBlk',
                request_serializer=storage_dot_frontend__virtio__blk__pb2.CreateVirtioBlkRequest.SerializeToString,
                response_deserializer=storage_dot_frontend__virtio__blk__pb2.VirtioBlk.FromString,
                _registered_method=True)
        self.DeleteVirtioBlk = channel.unary_unary(
                '/opi_api.storage.v1.FrontendVirtioBlkService/DeleteVirtioBlk',
                request_serializer=storage_dot_frontend__virtio__blk__pb2.DeleteVirtioBlkRequest.SerializeToString,
                response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
                _registered_method=True)
        self.UpdateVirtioBlk = channel.unary_unary(
                '/opi_api.storage.v1.FrontendVirtioBlkService/UpdateVirtioBlk',
                request_serializer=storage_dot_frontend__virtio__blk__pb2.UpdateVirtioBlkRequest.SerializeToString,
                response_deserializer=storage_dot_frontend__virtio__blk__pb2.VirtioBlk.FromString,
                _registered_method=True)
        self.ListVirtioBlks = channel.unary_unary(
                '/opi_api.storage.v1.FrontendVirtioBlkService/ListVirtioBlks',
                request_serializer=storage_dot_frontend__virtio__blk__pb2.ListVirtioBlksRequest.SerializeToString,
                response_deserializer=storage_dot_frontend__virtio__blk__pb2.ListVirtioBlksResponse.FromString,
                _registered_method=True)
        self.GetVirtioBlk = channel.unary_unary(
                '/opi_api.storage.v1.FrontendVirtioBlkService/GetVirtioBlk',
                request_serializer=storage_dot_frontend__virtio__blk__pb2.GetVirtioBlkRequest.SerializeToString,
                response_deserializer=storage_dot_frontend__virtio__blk__pb2.VirtioBlk.FromString,
                _registered_method=True)
        self.StatsVirtioBlk = channel.unary_unary(
                '/opi_api.storage.v1.FrontendVirtioBlkService/StatsVirtioBlk',
                request_serializer=storage_dot_frontend__virtio__blk__pb2.StatsVirtioBlkRequest.SerializeToString,
                response_deserializer=storage_dot_frontend__virtio__blk__pb2.StatsVirtioBlkResponse.FromString,
                _registered_method=True)


class FrontendVirtioBlkServiceServicer(object):
    """Front End (host-facing) APIs. Mostly used for Virtio-blk emulation and host presentation as alternative to Nvme.
    """

    def CreateVirtioBlk(self, request, context):
        """Create an Virtio Blk
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DeleteVirtioBlk(self, request, context):
        """Delete an Virtio Blk
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UpdateVirtioBlk(self, request, context):
        """Update an Virtio Blk
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ListVirtioBlks(self, request, context):
        """List Virtio Blks
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetVirtioBlk(self, request, context):
        """Get an Virtio Blk
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def StatsVirtioBlk(self, request, context):
        """Get an Virtio Blk statistics
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_FrontendVirtioBlkServiceServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'CreateVirtioBlk': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateVirtioBlk,
                    request_deserializer=storage_dot_frontend__virtio__blk__pb2.CreateVirtioBlkRequest.FromString,
                    response_serializer=storage_dot_frontend__virtio__blk__pb2.VirtioBlk.SerializeToString,
            ),
            'DeleteVirtioBlk': grpc.unary_unary_rpc_method_handler(
                    servicer.DeleteVirtioBlk,
                    request_deserializer=storage_dot_frontend__virtio__blk__pb2.DeleteVirtioBlkRequest.FromString,
                    response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
            ),
            'UpdateVirtioBlk': grpc.unary_unary_rpc_method_handler(
                    servicer.UpdateVirtioBlk,
                    request_deserializer=storage_dot_frontend__virtio__blk__pb2.UpdateVirtioBlkRequest.FromString,
                    response_serializer=storage_dot_frontend__virtio__blk__pb2.VirtioBlk.SerializeToString,
            ),
            'ListVirtioBlks': grpc.unary_unary_rpc_method_handler(
                    servicer.ListVirtioBlks,
                    request_deserializer=storage_dot_frontend__virtio__blk__pb2.ListVirtioBlksRequest.FromString,
                    response_serializer=storage_dot_frontend__virtio__blk__pb2.ListVirtioBlksResponse.SerializeToString,
            ),
            'GetVirtioBlk': grpc.unary_unary_rpc_method_handler(
                    servicer.GetVirtioBlk,
                    request_deserializer=storage_dot_frontend__virtio__blk__pb2.GetVirtioBlkRequest.FromString,
                    response_serializer=storage_dot_frontend__virtio__blk__pb2.VirtioBlk.SerializeToString,
            ),
            'StatsVirtioBlk': grpc.unary_unary_rpc_method_handler(
                    servicer.StatsVirtioBlk,
                    request_deserializer=storage_dot_frontend__virtio__blk__pb2.StatsVirtioBlkRequest.FromString,
                    response_serializer=storage_dot_frontend__virtio__blk__pb2.StatsVirtioBlkResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'opi_api.storage.v1.FrontendVirtioBlkService', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))
    server.add_registered_method_handlers('opi_api.storage.v1.FrontendVirtioBlkService', rpc_method_handlers)


 # This class is part of an EXPERIMENTAL API.
class FrontendVirtioBlkService(object):
    """Front End (host-facing) APIs. Mostly used for Virtio-blk emulation and host presentation as alternative to Nvme.
    """

    @staticmethod
    def CreateVirtioBlk(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(
            request,
            target,
            '/opi_api.storage.v1.FrontendVirtioBlkService/CreateVirtioBlk',
            storage_dot_frontend__virtio__blk__pb2.CreateVirtioBlkRequest.SerializeToString,
            storage_dot_frontend__virtio__blk__pb2.VirtioBlk.FromString,
            options,
            channel_credentials,
            insecure,
            call_credentials,
            compression,
            wait_for_ready,
            timeout,
            metadata,
            _registered_method=True)

    @staticmethod
    def DeleteVirtioBlk(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(
            request,
            target,
            '/opi_api.storage.v1.FrontendVirtioBlkService/DeleteVirtioBlk',
            storage_dot_frontend__virtio__blk__pb2.DeleteVirtioBlkRequest.SerializeToString,
            google_dot_protobuf_dot_empty__pb2.Empty.FromString,
            options,
            channel_credentials,
            insecure,
            call_credentials,
            compression,
            wait_for_ready,
            timeout,
            metadata,
            _registered_method=True)

    @staticmethod
    def UpdateVirtioBlk(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(
            request,
            target,
            '/opi_api.storage.v1.FrontendVirtioBlkService/UpdateVirtioBlk',
            storage_dot_frontend__virtio__blk__pb2.UpdateVirtioBlkRequest.SerializeToString,
            storage_dot_frontend__virtio__blk__pb2.VirtioBlk.FromString,
            options,
            channel_credentials,
            insecure,
            call_credentials,
            compression,
            wait_for_ready,
            timeout,
            metadata,
            _registered_method=True)

    @staticmethod
    def ListVirtioBlks(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(
            request,
            target,
            '/opi_api.storage.v1.FrontendVirtioBlkService/ListVirtioBlks',
            storage_dot_frontend__virtio__blk__pb2.ListVirtioBlksRequest.SerializeToString,
            storage_dot_frontend__virtio__blk__pb2.ListVirtioBlksResponse.FromString,
            options,
            channel_credentials,
            insecure,
            call_credentials,
            compression,
            wait_for_ready,
            timeout,
            metadata,
            _registered_method=True)

    @staticmethod
    def GetVirtioBlk(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(
            request,
            target,
            '/opi_api.storage.v1.FrontendVirtioBlkService/GetVirtioBlk',
            storage_dot_frontend__virtio__blk__pb2.GetVirtioBlkRequest.SerializeToString,
            storage_dot_frontend__virtio__blk__pb2.VirtioBlk.FromString,
            options,
            channel_credentials,
            insecure,
            call_credentials,
            compression,
            wait_for_ready,
            timeout,
            metadata,
            _registered_method=True)

    @staticmethod
    def StatsVirtioBlk(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(
            request,
            target,
            '/opi_api.storage.v1.FrontendVirtioBlkService/StatsVirtioBlk',
            storage_dot_frontend__virtio__blk__pb2.StatsVirtioBlkRequest.SerializeToString,
            storage_dot_frontend__virtio__blk__pb2.StatsVirtioBlkResponse.FromString,
            options,
            channel_credentials,
            insecure,
            call_credentials,
            compression,
            wait_for_ready,
            timeout,
            metadata,
            _registered_method=True)
