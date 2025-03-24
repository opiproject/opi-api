# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# NO CHECKED-IN PROTOBUF GENCODE
# source: network/cloud/route.proto
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
    'network/cloud/route.proto'
)
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from network.opinetcommon import networktypes_pb2 as network_dot_opinetcommon_dot_networktypes__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x19network/cloud/route.proto\x12\x1eopi_api.network.cloud.v1alpha1\x1a\x19google/api/resource.proto\x1a\'network/opinetcommon/networktypes.proto\"\xf8\x01\n\nRouteTable\x12\x12\n\x04name\x18\x01 \x01(\tR\x04name\x12\x42\n\x04spec\x18\x02 \x01(\x0b\x32..opi_api.network.cloud.v1alpha1.RouteTableSpecR\x04spec\x12H\n\x06status\x18\x03 \x01(\x0b\x32\x30.opi_api.network.cloud.v1alpha1.RouteTableStatusR\x06status:H\xea\x41\x45\n)opi_api.network.cloud.v1alpha1/routetable\x12\x18routetables/{routetable}\"\xb9\x01\n\x0eRouteTableSpec\x12;\n\x02\x61\x66\x18\x01 \x01(\x0e\x32+.opi_api.network.opinetcommon.v1alpha1.IpAfR\x02\x61\x66\x12\'\n\x0fpriority_enable\x18\x02 \x01(\x08R\x0epriorityEnable\x12\x41\n\x06routes\x18\x03 \x03(\x0b\x32).opi_api.network.cloud.v1alpha1.RouteInfoR\x06routes\"h\n\tRouteInfo\x12\x19\n\x08route_id\x18\x01 \x01(\tR\x07routeId\x12@\n\x05\x61ttrs\x18\x02 \x01(\x0b\x32*.opi_api.network.cloud.v1alpha1.RouteAttrsR\x05\x61ttrs\"\xbb\x02\n\x10RouteTableStatus\x12\x1b\n\tvpc_count\x18\x01 \x01(\x05R\x08vpcCount\x12!\n\x0csubnet_count\x18\x02 \x01(\x05R\x0bsubnetCount\x12\x1d\n\nvnic_count\x18\x03 \x01(\x05R\tvnicCount\x12\x17\n\x07pool_id\x18\x04 \x01(\x05R\x06poolId\x12\x15\n\x06hw_idx\x18\x05 \x01(\x05R\x05hwIdx\x12\x37\n\x18route_table_base_address\x18\x06 \x01(\x04R\x15routeTableBaseAddress\x12\'\n\x10hw_lpm_block_idx\x18\x07 \x01(\x05R\rhwLpmBlockIdx\x12\x36\n\x18hw_lpm_rewrite_block_idx\x18\x08 \x01(\x05R\x14hwLpmRewriteBlockIdx\"\xf3\x05\n\nRouteAttrs\x12G\n\x06prefix\x18\x01 \x01(\x0b\x32/.opi_api.network.opinetcommon.v1alpha1.IPPrefixR\x06prefix\x12K\n\x0broute_class\x18\x02 \x01(\x0e\x32*.opi_api.network.cloud.v1alpha1.RouteClassR\nrouteClass\x12%\n\x0e\x63lass_priority\x18\x03 \x01(\x05R\rclassPriority\x12\x1a\n\x08priority\x18\x04 \x01(\x05R\x08priority\x12\x63\n\x12overlay_nh_ip_info\x18\x05 \x01(\x0b\x32\x34.opi_api.network.cloud.v1alpha1.OverlayNextHopIPInfoH\x00R\x0foverlayNhIpInfo\x12*\n\x10nexthop_name_ref\x18\x06 \x01(\tH\x00R\x0enexthopNameRef\x12+\n\x11nh_group_name_ref\x18\x07 \x01(\tH\x00R\x0enhGroupNameRef\x12O\n\x0bvpc_nh_info\x18\x08 \x01(\x0b\x32-.opi_api.network.cloud.v1alpha1.VPCPeerNhInfoH\x00R\tvpcNhInfo\x12(\n\x0ftunnel_name_ref\x18\t \x01(\tH\x00R\rtunnelNameRef\x12\x31\n\x14route_table_name_ref\x18\n \x01(\tH\x00R\x11routeTableNameRef\x12#\n\x0c\x65val_mapping\x18\x0b \x01(\x08H\x00R\x0b\x65valMapping\x12\x10\n\x03tos\x18\x0c \x01(\x05R\x03tos\x12\x42\n\x05\x65ncap\x18\r \x01(\x0b\x32,.opi_api.network.opinetcommon.v1alpha1.EncapR\x05\x65ncap\x12\x1f\n\x0boverlay_mac\x18\x0e \x01(\x0cR\noverlayMacB\x04\n\x02nh\"b\n\rVPCPeerNhInfo\x12 \n\x0cvpc_name_ref\x18\x01 \x01(\tR\nvpcNameRef\x12/\n\x14route_table_name_ref\x18\x02 \x01(\tR\x11routeTableNameRef\"\xaa\x01\n\x14OverlayNextHopIPInfo\x12O\n\nnexthop_ip\x18\x01 \x03(\x0b\x32\x30.opi_api.network.opinetcommon.v1alpha1.IPAddressR\tnexthopIp\x12\x1f\n\x0bnexthop_mac\x18\x02 \x03(\x0cR\nnexthopMac\x12 \n\x0cvpc_name_ref\x18\x03 \x01(\tR\nvpcNameRef\"U\n\x07RouteId\x12\x19\n\x08route_id\x18\x01 \x01(\tR\x07routeId\x12/\n\x14route_table_name_ref\x18\x02 \x01(\tR\x11routeTableNameRef\"\xda\x01\n\x05Route\x12\x12\n\x04name\x18\x01 \x01(\tR\x04name\x12=\n\x04spec\x18\x02 \x01(\x0b\x32).opi_api.network.cloud.v1alpha1.RouteSpecR\x04spec\x12\x43\n\x06status\x18\x03 \x01(\x0b\x32+.opi_api.network.cloud.v1alpha1.RouteStatusR\x06status:9\xea\x41\x36\n$opi_api.network.cloud.v1alpha1/route\x12\x0eroutes/{route}\"~\n\tRouteSpec\x12/\n\x14route_table_name_ref\x18\x01 \x01(\tR\x11routeTableNameRef\x12@\n\x05\x61ttrs\x18\x02 \x01(\x0b\x32*.opi_api.network.cloud.v1alpha1.RouteAttrsR\x05\x61ttrs\"\r\n\x0bRouteStatus*q\n\nRouteClass\x12\x1b\n\x17ROUTE_CLASS_UNSPECIFIED\x10\x00\x12\x18\n\x14ROUTE_CLASS_INTERNET\x10\x01\x12\x17\n\x13ROUTE_CLASS_SERVICE\x10\x02\x12\x13\n\x0fROUTE_CLASS_VPC\x10\x03\x42k\n\x1eopi_api.network.cloud.v1alpha1B\nRouteProtoP\x01Z;github.com/opiproject/opi-api/network/cloud/v1alpha1/gen/gob\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'network.cloud.route_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\036opi_api.network.cloud.v1alpha1B\nRouteProtoP\001Z;github.com/opiproject/opi-api/network/cloud/v1alpha1/gen/go'
  _globals['_ROUTETABLE']._loaded_options = None
  _globals['_ROUTETABLE']._serialized_options = b'\352AE\n)opi_api.network.cloud.v1alpha1/routetable\022\030routetables/{routetable}'
  _globals['_ROUTE']._loaded_options = None
  _globals['_ROUTE']._serialized_options = b'\352A6\n$opi_api.network.cloud.v1alpha1/route\022\016routes/{route}'
  _globals['_ROUTECLASS']._serialized_start=2474
  _globals['_ROUTECLASS']._serialized_end=2587
  _globals['_ROUTETABLE']._serialized_start=130
  _globals['_ROUTETABLE']._serialized_end=378
  _globals['_ROUTETABLESPEC']._serialized_start=381
  _globals['_ROUTETABLESPEC']._serialized_end=566
  _globals['_ROUTEINFO']._serialized_start=568
  _globals['_ROUTEINFO']._serialized_end=672
  _globals['_ROUTETABLESTATUS']._serialized_start=675
  _globals['_ROUTETABLESTATUS']._serialized_end=990
  _globals['_ROUTEATTRS']._serialized_start=993
  _globals['_ROUTEATTRS']._serialized_end=1748
  _globals['_VPCPEERNHINFO']._serialized_start=1750
  _globals['_VPCPEERNHINFO']._serialized_end=1848
  _globals['_OVERLAYNEXTHOPIPINFO']._serialized_start=1851
  _globals['_OVERLAYNEXTHOPIPINFO']._serialized_end=2021
  _globals['_ROUTEID']._serialized_start=2023
  _globals['_ROUTEID']._serialized_end=2108
  _globals['_ROUTE']._serialized_start=2111
  _globals['_ROUTE']._serialized_end=2329
  _globals['_ROUTESPEC']._serialized_start=2331
  _globals['_ROUTESPEC']._serialized_end=2457
  _globals['_ROUTESTATUS']._serialized_start=2459
  _globals['_ROUTESTATUS']._serialized_end=2472
# @@protoc_insertion_point(module_scope)
