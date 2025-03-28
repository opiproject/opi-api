# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# NO CHECKED-IN PROTOBUF GENCODE
# source: network/cloud/tunnel.proto
# Protobuf Python Version: 5.29.3
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import runtime_version as _runtime_version
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
_runtime_version.ValidateProtobufRuntimeVersion(
    _runtime_version.Domain.PUBLIC,
    5,
    29,
    3,
    '',
    'network/cloud/tunnel.proto'
)
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from network.opinetcommon import networktypes_pb2 as network_dot_opinetcommon_dot_networktypes__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1anetwork/cloud/tunnel.proto\x12\x1eopi_api.network.cloud.v1alpha1\x1a\x19google/api/resource.proto\x1a\'network/opinetcommon/networktypes.proto\"\xdf\x01\n\x06Tunnel\x12\x12\n\x04name\x18\x01 \x01(\tR\x04name\x12>\n\x04spec\x18\x02 \x01(\x0b\x32*.opi_api.network.cloud.v1alpha1.TunnelSpecR\x04spec\x12\x44\n\x06status\x18\x03 \x01(\x0b\x32,.opi_api.network.cloud.v1alpha1.TunnelStatusR\x06status:;\xea\x41\x38\n%opi_api.network.cloud.v1alpha1/tunnel\x12\x0ftunnel/{tunnel}\"\xe7\x04\n\nTunnelSpec\x12 \n\x0cvpc_name_ref\x18\x01 \x01(\tR\nvpcNameRef\x12K\n\x08local_ip\x18\x02 \x01(\x0b\x32\x30.opi_api.network.opinetcommon.v1alpha1.IPAddressR\x07localIp\x12M\n\tremote_ip\x18\x03 \x01(\x0b\x32\x30.opi_api.network.opinetcommon.v1alpha1.IPAddressR\x08remoteIp\x12>\n\x04type\x18\x04 \x01(\x0e\x32*.opi_api.network.cloud.v1alpha1.TunnelTypeR\x04type\x12\x42\n\x05\x65ncap\x18\x05 \x01(\x0b\x32,.opi_api.network.opinetcommon.v1alpha1.EncapR\x05\x65ncap\x12*\n\x10nexthop_name_ref\x18\x06 \x01(\tH\x00R\x0enexthopNameRef\x12\x35\n\x16nexthop_group_name_ref\x18\x07 \x01(\tH\x00R\x13nexthopGroupNameRef\x12(\n\x0ftunnel_name_ref\x18\x08 \x01(\tH\x00R\rtunnelNameRef\x12Q\n\rdrop_next_hop\x18\t \x01(\x0b\x32+.opi_api.network.cloud.v1alpha1.DropNexthopH\x00R\x0b\x64ropNextHop\x12\x1f\n\x0bmac_address\x18\n \x01(\x0cR\nmacAddress\x12\x10\n\x03tos\x18\x0b \x01(\x05R\x03tosB\x04\n\x02nh\"\r\n\x0b\x44ropNexthop\"{\n\x0cTunnelStatus\x12L\n\thw_handle\x18\x01 \x01(\x0b\x32/.opi_api.network.opinetcommon.v1alpha1.HwHandleR\x08hwHandle\x12\x1d\n\nvnic_count\x18\x02 \x01(\x05R\tvnicCount*\xb7\x01\n\nTunnelType\x12\x1b\n\x17TUNNEL_TYPE_UNSPECIFIED\x10\x00\x12\x13\n\x0fTUNNEL_TYPE_IGW\x10\x01\x12\x18\n\x14TUNNEL_TYPE_WORKLOAD\x10\x02\x12\x18\n\x14TUNNEL_TYPE_INTER_DC\x10\x03\x12\x17\n\x13TUNNEL_TYPE_SERVICE\x10\x04\x12\x13\n\x0fTUNNEL_TYPE_VNF\x10\x05\x12\x15\n\x11TUNNEL_TYPE_IPSEC\x10\x06\x42l\n\x1eopi_api.network.cloud.v1alpha1B\x0bTunnelProtoP\x01Z;github.com/opiproject/opi-api/network/cloud/v1alpha1/gen/gob\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'network.cloud.tunnel_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\036opi_api.network.cloud.v1alpha1B\013TunnelProtoP\001Z;github.com/opiproject/opi-api/network/cloud/v1alpha1/gen/go'
  _globals['_TUNNEL']._loaded_options = None
  _globals['_TUNNEL']._serialized_options = b'\352A8\n%opi_api.network.cloud.v1alpha1/tunnel\022\017tunnel/{tunnel}'
  _globals['_TUNNELTYPE']._serialized_start=1115
  _globals['_TUNNELTYPE']._serialized_end=1298
  _globals['_TUNNEL']._serialized_start=131
  _globals['_TUNNEL']._serialized_end=354
  _globals['_TUNNELSPEC']._serialized_start=357
  _globals['_TUNNELSPEC']._serialized_end=972
  _globals['_DROPNEXTHOP']._serialized_start=974
  _globals['_DROPNEXTHOP']._serialized_end=987
  _globals['_TUNNELSTATUS']._serialized_start=989
  _globals['_TUNNELSTATUS']._serialized_end=1112
# @@protoc_insertion_point(module_scope)
