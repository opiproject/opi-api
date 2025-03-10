# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from storage import backend_nvme_pb2 as storage_dot_backend__nvme__pb2


class NvmeRemoteControllerServiceStub(object):
    """Back End APIs. Responsible for connection to external Nvme devices
    e.g. connection to Nvme/TCP Nvme/RDMA and local Nvme/Pcie ssds
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.CreateNvmeRemoteController = channel.unary_unary(
                '/opi_api.storage.v1.NvmeRemoteControllerService/CreateNvmeRemoteController',
                request_serializer=storage_dot_backend__nvme__pb2.CreateNvmeRemoteControllerRequest.SerializeToString,
                response_deserializer=storage_dot_backend__nvme__pb2.NvmeRemoteController.FromString,
                _registered_method=True)
        self.DeleteNvmeRemoteController = channel.unary_unary(
                '/opi_api.storage.v1.NvmeRemoteControllerService/DeleteNvmeRemoteController',
                request_serializer=storage_dot_backend__nvme__pb2.DeleteNvmeRemoteControllerRequest.SerializeToString,
                response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
                _registered_method=True)
        self.UpdateNvmeRemoteController = channel.unary_unary(
                '/opi_api.storage.v1.NvmeRemoteControllerService/UpdateNvmeRemoteController',
                request_serializer=storage_dot_backend__nvme__pb2.UpdateNvmeRemoteControllerRequest.SerializeToString,
                response_deserializer=storage_dot_backend__nvme__pb2.NvmeRemoteController.FromString,
                _registered_method=True)
        self.ListNvmeRemoteControllers = channel.unary_unary(
                '/opi_api.storage.v1.NvmeRemoteControllerService/ListNvmeRemoteControllers',
                request_serializer=storage_dot_backend__nvme__pb2.ListNvmeRemoteControllersRequest.SerializeToString,
                response_deserializer=storage_dot_backend__nvme__pb2.ListNvmeRemoteControllersResponse.FromString,
                _registered_method=True)
        self.GetNvmeRemoteController = channel.unary_unary(
                '/opi_api.storage.v1.NvmeRemoteControllerService/GetNvmeRemoteController',
                request_serializer=storage_dot_backend__nvme__pb2.GetNvmeRemoteControllerRequest.SerializeToString,
                response_deserializer=storage_dot_backend__nvme__pb2.NvmeRemoteController.FromString,
                _registered_method=True)
        self.ResetNvmeRemoteController = channel.unary_unary(
                '/opi_api.storage.v1.NvmeRemoteControllerService/ResetNvmeRemoteController',
                request_serializer=storage_dot_backend__nvme__pb2.ResetNvmeRemoteControllerRequest.SerializeToString,
                response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
                _registered_method=True)
        self.StatsNvmeRemoteController = channel.unary_unary(
                '/opi_api.storage.v1.NvmeRemoteControllerService/StatsNvmeRemoteController',
                request_serializer=storage_dot_backend__nvme__pb2.StatsNvmeRemoteControllerRequest.SerializeToString,
                response_deserializer=storage_dot_backend__nvme__pb2.StatsNvmeRemoteControllerResponse.FromString,
                _registered_method=True)
        self.ListNvmeRemoteNamespaces = channel.unary_unary(
                '/opi_api.storage.v1.NvmeRemoteControllerService/ListNvmeRemoteNamespaces',
                request_serializer=storage_dot_backend__nvme__pb2.ListNvmeRemoteNamespacesRequest.SerializeToString,
                response_deserializer=storage_dot_backend__nvme__pb2.ListNvmeRemoteNamespacesResponse.FromString,
                _registered_method=True)
        self.GetNvmeRemoteNamespace = channel.unary_unary(
                '/opi_api.storage.v1.NvmeRemoteControllerService/GetNvmeRemoteNamespace',
                request_serializer=storage_dot_backend__nvme__pb2.GetNvmeRemoteNamespaceRequest.SerializeToString,
                response_deserializer=storage_dot_backend__nvme__pb2.NvmeRemoteNamespace.FromString,
                _registered_method=True)
        self.CreateNvmePath = channel.unary_unary(
                '/opi_api.storage.v1.NvmeRemoteControllerService/CreateNvmePath',
                request_serializer=storage_dot_backend__nvme__pb2.CreateNvmePathRequest.SerializeToString,
                response_deserializer=storage_dot_backend__nvme__pb2.NvmePath.FromString,
                _registered_method=True)
        self.DeleteNvmePath = channel.unary_unary(
                '/opi_api.storage.v1.NvmeRemoteControllerService/DeleteNvmePath',
                request_serializer=storage_dot_backend__nvme__pb2.DeleteNvmePathRequest.SerializeToString,
                response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
                _registered_method=True)
        self.UpdateNvmePath = channel.unary_unary(
                '/opi_api.storage.v1.NvmeRemoteControllerService/UpdateNvmePath',
                request_serializer=storage_dot_backend__nvme__pb2.UpdateNvmePathRequest.SerializeToString,
                response_deserializer=storage_dot_backend__nvme__pb2.NvmePath.FromString,
                _registered_method=True)
        self.ListNvmePaths = channel.unary_unary(
                '/opi_api.storage.v1.NvmeRemoteControllerService/ListNvmePaths',
                request_serializer=storage_dot_backend__nvme__pb2.ListNvmePathsRequest.SerializeToString,
                response_deserializer=storage_dot_backend__nvme__pb2.ListNvmePathsResponse.FromString,
                _registered_method=True)
        self.GetNvmePath = channel.unary_unary(
                '/opi_api.storage.v1.NvmeRemoteControllerService/GetNvmePath',
                request_serializer=storage_dot_backend__nvme__pb2.GetNvmePathRequest.SerializeToString,
                response_deserializer=storage_dot_backend__nvme__pb2.NvmePath.FromString,
                _registered_method=True)
        self.StatsNvmePath = channel.unary_unary(
                '/opi_api.storage.v1.NvmeRemoteControllerService/StatsNvmePath',
                request_serializer=storage_dot_backend__nvme__pb2.StatsNvmePathRequest.SerializeToString,
                response_deserializer=storage_dot_backend__nvme__pb2.StatsNvmePathResponse.FromString,
                _registered_method=True)


class NvmeRemoteControllerServiceServicer(object):
    """Back End APIs. Responsible for connection to external Nvme devices
    e.g. connection to Nvme/TCP Nvme/RDMA and local Nvme/Pcie ssds
    """

    def CreateNvmeRemoteController(self, request, context):
        """Create an Nvme Remote Controller
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DeleteNvmeRemoteController(self, request, context):
        """Delete an Nvme Remote Controller
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UpdateNvmeRemoteController(self, request, context):
        """Update an Nvme Remote Controller
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ListNvmeRemoteControllers(self, request, context):
        """List Nvme Remote Controllers
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetNvmeRemoteController(self, request, context):
        """Get an Nvme Remote Controller
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ResetNvmeRemoteController(self, request, context):
        """Reset an Nvme Remote Controller
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def StatsNvmeRemoteController(self, request, context):
        """Get an Nvme Remote Controller statistics
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ListNvmeRemoteNamespaces(self, request, context):
        """List Nvme Remote Namespaces
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetNvmeRemoteNamespace(self, request, context):
        """Get an Nvme Remote Namespace
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def CreateNvmePath(self, request, context):
        """Create an Nvme Path
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DeleteNvmePath(self, request, context):
        """Delete an Nvme Path
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UpdateNvmePath(self, request, context):
        """Update an Nvme Path
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ListNvmePaths(self, request, context):
        """List Nvme Paths
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetNvmePath(self, request, context):
        """Get an Nvme Path
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def StatsNvmePath(self, request, context):
        """Get an Nvme Path statistics
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_NvmeRemoteControllerServiceServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'CreateNvmeRemoteController': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateNvmeRemoteController,
                    request_deserializer=storage_dot_backend__nvme__pb2.CreateNvmeRemoteControllerRequest.FromString,
                    response_serializer=storage_dot_backend__nvme__pb2.NvmeRemoteController.SerializeToString,
            ),
            'DeleteNvmeRemoteController': grpc.unary_unary_rpc_method_handler(
                    servicer.DeleteNvmeRemoteController,
                    request_deserializer=storage_dot_backend__nvme__pb2.DeleteNvmeRemoteControllerRequest.FromString,
                    response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
            ),
            'UpdateNvmeRemoteController': grpc.unary_unary_rpc_method_handler(
                    servicer.UpdateNvmeRemoteController,
                    request_deserializer=storage_dot_backend__nvme__pb2.UpdateNvmeRemoteControllerRequest.FromString,
                    response_serializer=storage_dot_backend__nvme__pb2.NvmeRemoteController.SerializeToString,
            ),
            'ListNvmeRemoteControllers': grpc.unary_unary_rpc_method_handler(
                    servicer.ListNvmeRemoteControllers,
                    request_deserializer=storage_dot_backend__nvme__pb2.ListNvmeRemoteControllersRequest.FromString,
                    response_serializer=storage_dot_backend__nvme__pb2.ListNvmeRemoteControllersResponse.SerializeToString,
            ),
            'GetNvmeRemoteController': grpc.unary_unary_rpc_method_handler(
                    servicer.GetNvmeRemoteController,
                    request_deserializer=storage_dot_backend__nvme__pb2.GetNvmeRemoteControllerRequest.FromString,
                    response_serializer=storage_dot_backend__nvme__pb2.NvmeRemoteController.SerializeToString,
            ),
            'ResetNvmeRemoteController': grpc.unary_unary_rpc_method_handler(
                    servicer.ResetNvmeRemoteController,
                    request_deserializer=storage_dot_backend__nvme__pb2.ResetNvmeRemoteControllerRequest.FromString,
                    response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
            ),
            'StatsNvmeRemoteController': grpc.unary_unary_rpc_method_handler(
                    servicer.StatsNvmeRemoteController,
                    request_deserializer=storage_dot_backend__nvme__pb2.StatsNvmeRemoteControllerRequest.FromString,
                    response_serializer=storage_dot_backend__nvme__pb2.StatsNvmeRemoteControllerResponse.SerializeToString,
            ),
            'ListNvmeRemoteNamespaces': grpc.unary_unary_rpc_method_handler(
                    servicer.ListNvmeRemoteNamespaces,
                    request_deserializer=storage_dot_backend__nvme__pb2.ListNvmeRemoteNamespacesRequest.FromString,
                    response_serializer=storage_dot_backend__nvme__pb2.ListNvmeRemoteNamespacesResponse.SerializeToString,
            ),
            'GetNvmeRemoteNamespace': grpc.unary_unary_rpc_method_handler(
                    servicer.GetNvmeRemoteNamespace,
                    request_deserializer=storage_dot_backend__nvme__pb2.GetNvmeRemoteNamespaceRequest.FromString,
                    response_serializer=storage_dot_backend__nvme__pb2.NvmeRemoteNamespace.SerializeToString,
            ),
            'CreateNvmePath': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateNvmePath,
                    request_deserializer=storage_dot_backend__nvme__pb2.CreateNvmePathRequest.FromString,
                    response_serializer=storage_dot_backend__nvme__pb2.NvmePath.SerializeToString,
            ),
            'DeleteNvmePath': grpc.unary_unary_rpc_method_handler(
                    servicer.DeleteNvmePath,
                    request_deserializer=storage_dot_backend__nvme__pb2.DeleteNvmePathRequest.FromString,
                    response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
            ),
            'UpdateNvmePath': grpc.unary_unary_rpc_method_handler(
                    servicer.UpdateNvmePath,
                    request_deserializer=storage_dot_backend__nvme__pb2.UpdateNvmePathRequest.FromString,
                    response_serializer=storage_dot_backend__nvme__pb2.NvmePath.SerializeToString,
            ),
            'ListNvmePaths': grpc.unary_unary_rpc_method_handler(
                    servicer.ListNvmePaths,
                    request_deserializer=storage_dot_backend__nvme__pb2.ListNvmePathsRequest.FromString,
                    response_serializer=storage_dot_backend__nvme__pb2.ListNvmePathsResponse.SerializeToString,
            ),
            'GetNvmePath': grpc.unary_unary_rpc_method_handler(
                    servicer.GetNvmePath,
                    request_deserializer=storage_dot_backend__nvme__pb2.GetNvmePathRequest.FromString,
                    response_serializer=storage_dot_backend__nvme__pb2.NvmePath.SerializeToString,
            ),
            'StatsNvmePath': grpc.unary_unary_rpc_method_handler(
                    servicer.StatsNvmePath,
                    request_deserializer=storage_dot_backend__nvme__pb2.StatsNvmePathRequest.FromString,
                    response_serializer=storage_dot_backend__nvme__pb2.StatsNvmePathResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'opi_api.storage.v1.NvmeRemoteControllerService', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))
    server.add_registered_method_handlers('opi_api.storage.v1.NvmeRemoteControllerService', rpc_method_handlers)


 # This class is part of an EXPERIMENTAL API.
class NvmeRemoteControllerService(object):
    """Back End APIs. Responsible for connection to external Nvme devices
    e.g. connection to Nvme/TCP Nvme/RDMA and local Nvme/Pcie ssds
    """

    @staticmethod
    def CreateNvmeRemoteController(request,
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
            '/opi_api.storage.v1.NvmeRemoteControllerService/CreateNvmeRemoteController',
            storage_dot_backend__nvme__pb2.CreateNvmeRemoteControllerRequest.SerializeToString,
            storage_dot_backend__nvme__pb2.NvmeRemoteController.FromString,
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
    def DeleteNvmeRemoteController(request,
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
            '/opi_api.storage.v1.NvmeRemoteControllerService/DeleteNvmeRemoteController',
            storage_dot_backend__nvme__pb2.DeleteNvmeRemoteControllerRequest.SerializeToString,
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
    def UpdateNvmeRemoteController(request,
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
            '/opi_api.storage.v1.NvmeRemoteControllerService/UpdateNvmeRemoteController',
            storage_dot_backend__nvme__pb2.UpdateNvmeRemoteControllerRequest.SerializeToString,
            storage_dot_backend__nvme__pb2.NvmeRemoteController.FromString,
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
    def ListNvmeRemoteControllers(request,
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
            '/opi_api.storage.v1.NvmeRemoteControllerService/ListNvmeRemoteControllers',
            storage_dot_backend__nvme__pb2.ListNvmeRemoteControllersRequest.SerializeToString,
            storage_dot_backend__nvme__pb2.ListNvmeRemoteControllersResponse.FromString,
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
    def GetNvmeRemoteController(request,
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
            '/opi_api.storage.v1.NvmeRemoteControllerService/GetNvmeRemoteController',
            storage_dot_backend__nvme__pb2.GetNvmeRemoteControllerRequest.SerializeToString,
            storage_dot_backend__nvme__pb2.NvmeRemoteController.FromString,
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
    def ResetNvmeRemoteController(request,
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
            '/opi_api.storage.v1.NvmeRemoteControllerService/ResetNvmeRemoteController',
            storage_dot_backend__nvme__pb2.ResetNvmeRemoteControllerRequest.SerializeToString,
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
    def StatsNvmeRemoteController(request,
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
            '/opi_api.storage.v1.NvmeRemoteControllerService/StatsNvmeRemoteController',
            storage_dot_backend__nvme__pb2.StatsNvmeRemoteControllerRequest.SerializeToString,
            storage_dot_backend__nvme__pb2.StatsNvmeRemoteControllerResponse.FromString,
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
    def ListNvmeRemoteNamespaces(request,
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
            '/opi_api.storage.v1.NvmeRemoteControllerService/ListNvmeRemoteNamespaces',
            storage_dot_backend__nvme__pb2.ListNvmeRemoteNamespacesRequest.SerializeToString,
            storage_dot_backend__nvme__pb2.ListNvmeRemoteNamespacesResponse.FromString,
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
    def GetNvmeRemoteNamespace(request,
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
            '/opi_api.storage.v1.NvmeRemoteControllerService/GetNvmeRemoteNamespace',
            storage_dot_backend__nvme__pb2.GetNvmeRemoteNamespaceRequest.SerializeToString,
            storage_dot_backend__nvme__pb2.NvmeRemoteNamespace.FromString,
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
    def CreateNvmePath(request,
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
            '/opi_api.storage.v1.NvmeRemoteControllerService/CreateNvmePath',
            storage_dot_backend__nvme__pb2.CreateNvmePathRequest.SerializeToString,
            storage_dot_backend__nvme__pb2.NvmePath.FromString,
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
    def DeleteNvmePath(request,
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
            '/opi_api.storage.v1.NvmeRemoteControllerService/DeleteNvmePath',
            storage_dot_backend__nvme__pb2.DeleteNvmePathRequest.SerializeToString,
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
    def UpdateNvmePath(request,
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
            '/opi_api.storage.v1.NvmeRemoteControllerService/UpdateNvmePath',
            storage_dot_backend__nvme__pb2.UpdateNvmePathRequest.SerializeToString,
            storage_dot_backend__nvme__pb2.NvmePath.FromString,
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
    def ListNvmePaths(request,
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
            '/opi_api.storage.v1.NvmeRemoteControllerService/ListNvmePaths',
            storage_dot_backend__nvme__pb2.ListNvmePathsRequest.SerializeToString,
            storage_dot_backend__nvme__pb2.ListNvmePathsResponse.FromString,
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
    def GetNvmePath(request,
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
            '/opi_api.storage.v1.NvmeRemoteControllerService/GetNvmePath',
            storage_dot_backend__nvme__pb2.GetNvmePathRequest.SerializeToString,
            storage_dot_backend__nvme__pb2.NvmePath.FromString,
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
    def StatsNvmePath(request,
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
            '/opi_api.storage.v1.NvmeRemoteControllerService/StatsNvmePath',
            storage_dot_backend__nvme__pb2.StatsNvmePathRequest.SerializeToString,
            storage_dot_backend__nvme__pb2.StatsNvmePathResponse.FromString,
            options,
            channel_credentials,
            insecure,
            call_credentials,
            compression,
            wait_for_ready,
            timeout,
            metadata,
            _registered_method=True)
