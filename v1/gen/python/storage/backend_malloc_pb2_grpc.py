# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from storage import backend_malloc_pb2 as storage_dot_backend__malloc__pb2


class MallocVolumeServiceStub(object):
    """Back End Malloc Volume APIs. This is debug interface for malloc block devices.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.CreateMallocVolume = channel.unary_unary(
                '/opi_api.storage.v1.MallocVolumeService/CreateMallocVolume',
                request_serializer=storage_dot_backend__malloc__pb2.CreateMallocVolumeRequest.SerializeToString,
                response_deserializer=storage_dot_backend__malloc__pb2.MallocVolume.FromString,
                _registered_method=True)
        self.DeleteMallocVolume = channel.unary_unary(
                '/opi_api.storage.v1.MallocVolumeService/DeleteMallocVolume',
                request_serializer=storage_dot_backend__malloc__pb2.DeleteMallocVolumeRequest.SerializeToString,
                response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
                _registered_method=True)
        self.UpdateMallocVolume = channel.unary_unary(
                '/opi_api.storage.v1.MallocVolumeService/UpdateMallocVolume',
                request_serializer=storage_dot_backend__malloc__pb2.UpdateMallocVolumeRequest.SerializeToString,
                response_deserializer=storage_dot_backend__malloc__pb2.MallocVolume.FromString,
                _registered_method=True)
        self.ListMallocVolumes = channel.unary_unary(
                '/opi_api.storage.v1.MallocVolumeService/ListMallocVolumes',
                request_serializer=storage_dot_backend__malloc__pb2.ListMallocVolumesRequest.SerializeToString,
                response_deserializer=storage_dot_backend__malloc__pb2.ListMallocVolumesResponse.FromString,
                _registered_method=True)
        self.GetMallocVolume = channel.unary_unary(
                '/opi_api.storage.v1.MallocVolumeService/GetMallocVolume',
                request_serializer=storage_dot_backend__malloc__pb2.GetMallocVolumeRequest.SerializeToString,
                response_deserializer=storage_dot_backend__malloc__pb2.MallocVolume.FromString,
                _registered_method=True)
        self.StatsMallocVolume = channel.unary_unary(
                '/opi_api.storage.v1.MallocVolumeService/StatsMallocVolume',
                request_serializer=storage_dot_backend__malloc__pb2.StatsMallocVolumeRequest.SerializeToString,
                response_deserializer=storage_dot_backend__malloc__pb2.StatsMallocVolumeResponse.FromString,
                _registered_method=True)


class MallocVolumeServiceServicer(object):
    """Back End Malloc Volume APIs. This is debug interface for malloc block devices.
    """

    def CreateMallocVolume(self, request, context):
        """Create a Malloc Volume
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DeleteMallocVolume(self, request, context):
        """Delete a Malloc Volume
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UpdateMallocVolume(self, request, context):
        """Update a Malloc Volume
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ListMallocVolumes(self, request, context):
        """List Malloc Volumes
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetMallocVolume(self, request, context):
        """Get a Malloc Volume
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def StatsMallocVolume(self, request, context):
        """Get a Malloc Volume statistics
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MallocVolumeServiceServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'CreateMallocVolume': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateMallocVolume,
                    request_deserializer=storage_dot_backend__malloc__pb2.CreateMallocVolumeRequest.FromString,
                    response_serializer=storage_dot_backend__malloc__pb2.MallocVolume.SerializeToString,
            ),
            'DeleteMallocVolume': grpc.unary_unary_rpc_method_handler(
                    servicer.DeleteMallocVolume,
                    request_deserializer=storage_dot_backend__malloc__pb2.DeleteMallocVolumeRequest.FromString,
                    response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
            ),
            'UpdateMallocVolume': grpc.unary_unary_rpc_method_handler(
                    servicer.UpdateMallocVolume,
                    request_deserializer=storage_dot_backend__malloc__pb2.UpdateMallocVolumeRequest.FromString,
                    response_serializer=storage_dot_backend__malloc__pb2.MallocVolume.SerializeToString,
            ),
            'ListMallocVolumes': grpc.unary_unary_rpc_method_handler(
                    servicer.ListMallocVolumes,
                    request_deserializer=storage_dot_backend__malloc__pb2.ListMallocVolumesRequest.FromString,
                    response_serializer=storage_dot_backend__malloc__pb2.ListMallocVolumesResponse.SerializeToString,
            ),
            'GetMallocVolume': grpc.unary_unary_rpc_method_handler(
                    servicer.GetMallocVolume,
                    request_deserializer=storage_dot_backend__malloc__pb2.GetMallocVolumeRequest.FromString,
                    response_serializer=storage_dot_backend__malloc__pb2.MallocVolume.SerializeToString,
            ),
            'StatsMallocVolume': grpc.unary_unary_rpc_method_handler(
                    servicer.StatsMallocVolume,
                    request_deserializer=storage_dot_backend__malloc__pb2.StatsMallocVolumeRequest.FromString,
                    response_serializer=storage_dot_backend__malloc__pb2.StatsMallocVolumeResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'opi_api.storage.v1.MallocVolumeService', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))
    server.add_registered_method_handlers('opi_api.storage.v1.MallocVolumeService', rpc_method_handlers)


 # This class is part of an EXPERIMENTAL API.
class MallocVolumeService(object):
    """Back End Malloc Volume APIs. This is debug interface for malloc block devices.
    """

    @staticmethod
    def CreateMallocVolume(request,
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
            '/opi_api.storage.v1.MallocVolumeService/CreateMallocVolume',
            storage_dot_backend__malloc__pb2.CreateMallocVolumeRequest.SerializeToString,
            storage_dot_backend__malloc__pb2.MallocVolume.FromString,
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
    def DeleteMallocVolume(request,
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
            '/opi_api.storage.v1.MallocVolumeService/DeleteMallocVolume',
            storage_dot_backend__malloc__pb2.DeleteMallocVolumeRequest.SerializeToString,
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
    def UpdateMallocVolume(request,
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
            '/opi_api.storage.v1.MallocVolumeService/UpdateMallocVolume',
            storage_dot_backend__malloc__pb2.UpdateMallocVolumeRequest.SerializeToString,
            storage_dot_backend__malloc__pb2.MallocVolume.FromString,
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
    def ListMallocVolumes(request,
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
            '/opi_api.storage.v1.MallocVolumeService/ListMallocVolumes',
            storage_dot_backend__malloc__pb2.ListMallocVolumesRequest.SerializeToString,
            storage_dot_backend__malloc__pb2.ListMallocVolumesResponse.FromString,
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
    def GetMallocVolume(request,
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
            '/opi_api.storage.v1.MallocVolumeService/GetMallocVolume',
            storage_dot_backend__malloc__pb2.GetMallocVolumeRequest.SerializeToString,
            storage_dot_backend__malloc__pb2.MallocVolume.FromString,
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
    def StatsMallocVolume(request,
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
            '/opi_api.storage.v1.MallocVolumeService/StatsMallocVolume',
            storage_dot_backend__malloc__pb2.StatsMallocVolumeRequest.SerializeToString,
            storage_dot_backend__malloc__pb2.StatsMallocVolumeResponse.FromString,
            options,
            channel_credentials,
            insecure,
            call_credentials,
            compression,
            wait_for_ready,
            timeout,
            metadata,
            _registered_method=True)
