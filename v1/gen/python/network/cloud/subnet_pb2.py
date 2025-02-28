# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# NO CHECKED-IN PROTOBUF GENCODE
# source: network/cloud/subnet.proto
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
    'network/cloud/subnet.proto'
)
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from network.opinetcommon import networktypes_pb2 as network_dot_opinetcommon_dot_networktypes__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1anetwork/cloud/subnet.proto\x12\x1eopi_api.network.cloud.v1alpha1\x1a\'network/opinetcommon/networktypes.proto\x1a\x19google/api/resource.proto\"\xe0\x01\n\x06Subnet\x12\x12\n\x04name\x18\x01 \x01(\tR\x04name\x12>\n\x04spec\x18\x02 \x01(\x0b\x32*.opi_api.network.cloud.v1alpha1.SubnetSpecR\x04spec\x12\x44\n\x06status\x18\x03 \x01(\x0b\x32,.opi_api.network.cloud.v1alpha1.SubnetStatusR\x06status:<\xea\x41\x39\n%opi_api.network.cloud.v1alpha1/subnet\x12\x10subnets/{subnet}\"\xc2\t\n\nSubnetSpec\x12 \n\x0cvpc_name_ref\x18\x01 \x01(\tR\nvpcNameRef\x12N\n\tv4_prefix\x18\x02 \x01(\x0b\x32\x31.opi_api.network.opinetcommon.v1alpha1.IPv4PrefixR\x08v4Prefix\x12N\n\tv6_prefix\x18\x03 \x01(\x0b\x32\x31.opi_api.network.opinetcommon.v1alpha1.IPv6PrefixR\x08v6Prefix\x12\x33\n\x16ipv4_virtual_router_ip\x18\x04 \x01(\rR\x13ipv4VirtualRouterIp\x12\x33\n\x16ipv6_virtual_router_ip\x18\x05 \x01(\x0cR\x13ipv6VirtualRouterIp\x12,\n\x12virtual_router_mac\x18\x06 \x01(\x0cR\x10virtualRouterMac\x12\x34\n\x17v4_route_table_name_ref\x18\x07 \x01(\tR\x13v4RouteTableNameRef\x12\x34\n\x17v6_route_table_name_ref\x18\x08 \x01(\tR\x13v6RouteTableNameRef\x12I\n\"ingess_v4_security_policy_name_ref\x18\t \x03(\tR\x1dingessV4SecurityPolicyNameRef\x12K\n#ingress_v6_security_policy_name_ref\x18\n \x03(\tR\x1eingressV6SecurityPolicyNameRef\x12I\n\"egress_v4_security_policy_name_ref\x18\x0b \x03(\tR\x1d\x65gressV4SecurityPolicyNameRef\x12I\n\"egress_v6_security_policy_name_ref\x18\x0c \x03(\tR\x1d\x65gressV6SecurityPolicyNameRef\x12O\n\x0c\x61\x63\x63\x65ss_encap\x18\r \x01(\x0b\x32,.opi_api.network.opinetcommon.v1alpha1.EncapR\x0b\x61\x63\x63\x65ssEncap\x12O\n\x0c\x66\x61\x62ric_encap\x18\x0e \x01(\x0b\x32,.opi_api.network.opinetcommon.v1alpha1.EncapR\x0b\x66\x61\x62ricEncap\x12\x35\n\x17host_interface_name_ref\x18\x0f \x03(\tR\x14hostInterfaceNameRef\x12\x10\n\x03tos\x18\x10 \x01(\x05R\x03tos\x12\x1c\n\tconnected\x18\x11 \x01(\x08R\tconnected\x12I\n\"ingress_default_sg_policy_name_ref\x18\x12 \x01(\tR\x1dingressDefaultSgPolicyNameRef\x12G\n!egress_default_sg_policy_name_ref\x18\x13 \x01(\tR\x1c\x65gressDefaultSgPolicyNameRef\x12#\n\rremote_subnet\x18\x14 \x01(\x08R\x0cremoteSubnet\"H\n\x0cSubnetStatus\x12\x19\n\x08hw_index\x18\x01 \x01(\x05R\x07hwIndex\x12\x1d\n\nvnic_count\x18\x02 \x01(\x05R\tvnicCountBl\n\x1eopi_api.network.cloud.v1alpha1B\x0bSubnetProtoP\x01Z;github.com/opiproject/opi-api/network/cloud/v1alpha1/gen/gob\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'network.cloud.subnet_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\036opi_api.network.cloud.v1alpha1B\013SubnetProtoP\001Z;github.com/opiproject/opi-api/network/cloud/v1alpha1/gen/go'
  _globals['_SUBNET']._loaded_options = None
  _globals['_SUBNET']._serialized_options = b'\352A9\n%opi_api.network.cloud.v1alpha1/subnet\022\020subnets/{subnet}'
  _globals['_SUBNET']._serialized_start=131
  _globals['_SUBNET']._serialized_end=355
  _globals['_SUBNETSPEC']._serialized_start=358
  _globals['_SUBNETSPEC']._serialized_end=1576
  _globals['_SUBNETSTATUS']._serialized_start=1578
  _globals['_SUBNETSTATUS']._serialized_end=1650
# @@protoc_insertion_point(module_scope)
