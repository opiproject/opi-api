# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: vpc.proto
# Protobuf Python Version: 4.25.1
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


import networktypes_pb2 as networktypes__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\tvpc.proto\x12\x1eopi_api.network.cloud.v1alpha1\x1a\x12networktypes.proto\x1a\x19google/api/resource.proto\"\xce\x01\n\x03Vpc\x12\x12\n\x04name\x18\x01 \x01(\tR\x04name\x12;\n\x04spec\x18\x02 \x01(\x0b\x32\'.opi_api.network.cloud.v1alpha1.VpcSpecR\x04spec\x12\x41\n\x06status\x18\x03 \x01(\x0b\x32).opi_api.network.cloud.v1alpha1.VpcStatusR\x06status:3\xea\x41\x30\n\"opi_api.network.cloud.v1alpha1/vpc\x12\nvpcs/{vpc}\"\xf3\x04\n\x07VpcSpec\x12;\n\x04type\x18\x01 \x01(\x0e\x32\'.opi_api.network.cloud.v1alpha1.VPCTypeR\x04type\x12\x34\n\x17v4_route_table_name_ref\x18\x02 \x01(\tR\x13v4RouteTableNameRef\x12\x34\n\x17v6_route_table_name_ref\x18\x03 \x01(\tR\x13v6RouteTableNameRef\x12K\n#ingress_v4_security_policy_name_ref\x18\x04 \x03(\tR\x1eingressV4SecurityPolicyNameRef\x12K\n#ingress_v6_security_policy_name_ref\x18\x05 \x03(\tR\x1eingressV6SecurityPolicyNameRef\x12I\n\"egress_v4_security_policy_name_ref\x18\x06 \x03(\tR\x1d\x65gressV4SecurityPolicyNameRef\x12I\n\"egress_v6_security_policy_name_ref\x18\x07 \x03(\tR\x1d\x65gressV6SecurityPolicyNameRef\x12,\n\x12virtual_router_mac\x18\x08 \x01(\x0cR\x10virtualRouterMac\x12O\n\x0c\x66\x61\x62ric_encap\x18\t \x01(\x0b\x32,.opi_api.network.opinetcommon.v1alpha1.EncapR\x0b\x66\x61\x62ricEncap\x12\x10\n\x03tos\x18\n \x01(\x05R\x03tos\"\xcf\x01\n\tVpcStatus\x12L\n\thw_handle\x18\x01 \x01(\x0b\x32/.opi_api.network.opinetcommon.v1alpha1.HwHandleR\x08hwHandle\x12Q\n\x0c\x62\x64_hw_handle\x18\x02 \x01(\x0b\x32/.opi_api.network.opinetcommon.v1alpha1.HwHandleR\nbdHwHandle\x12!\n\x0csubnet_count\x18\x03 \x01(\x05R\x0bsubnetCount\"\xe6\x01\n\x07VPCPeer\x12\x12\n\x04name\x18\x01 \x01(\tR\x04name\x12?\n\x04spec\x18\x02 \x01(\x0b\x32+.opi_api.network.cloud.v1alpha1.VPCPeerSpecR\x04spec\x12\x45\n\x06status\x18\x03 \x01(\x0b\x32-.opi_api.network.cloud.v1alpha1.VPCPeerStatusR\x06status:?\xea\x41<\n&opi_api.network.cloud.v1alpha1/vpcpeer\x12\x12vpcpeers/{vpcpeer}\"U\n\x0bVPCPeerSpec\x12\"\n\rvpc1_name_ref\x18\x01 \x01(\tR\x0bvpc1NameRef\x12\"\n\rvpc2_name_ref\x18\x02 \x01(\tR\x0bvpc2NameRef\"\x0f\n\rVPCPeerStatus*e\n\x07VPCType\x12\x18\n\x14VPC_TYPE_UNSPECIFIED\x10\x00\x12\x15\n\x11VPC_TYPE_UNDERLAY\x10\x01\x12\x13\n\x0fVPC_TYPE_TENANT\x10\x02\x12\x14\n\x10VPC_TYPE_CONTROL\x10\x03\x42i\n\x1eopi_api.network.cloud.v1alpha1B\x08VpcProtoP\x01Z;github.com/opiproject/opi-api/network/cloud/v1alpha1/gen/gob\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'vpc_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\036opi_api.network.cloud.v1alpha1B\010VpcProtoP\001Z;github.com/opiproject/opi-api/network/cloud/v1alpha1/gen/go'
  _globals['_VPC']._options = None
  _globals['_VPC']._serialized_options = b'\352A0\n\"opi_api.network.cloud.v1alpha1/vpc\022\nvpcs/{vpc}'
  _globals['_VPCPEER']._options = None
  _globals['_VPCPEER']._serialized_options = b'\352A<\n&opi_api.network.cloud.v1alpha1/vpcpeer\022\022vpcpeers/{vpcpeer}'
  _globals['_VPCTYPE']._serialized_start=1478
  _globals['_VPCTYPE']._serialized_end=1579
  _globals['_VPC']._serialized_start=93
  _globals['_VPC']._serialized_end=299
  _globals['_VPCSPEC']._serialized_start=302
  _globals['_VPCSPEC']._serialized_end=929
  _globals['_VPCSTATUS']._serialized_start=932
  _globals['_VPCSTATUS']._serialized_end=1139
  _globals['_VPCPEER']._serialized_start=1142
  _globals['_VPCPEER']._serialized_end=1372
  _globals['_VPCPEERSPEC']._serialized_start=1374
  _globals['_VPCPEERSPEC']._serialized_end=1459
  _globals['_VPCPEERSTATUS']._serialized_start=1461
  _globals['_VPCPEERSTATUS']._serialized_end=1476
# @@protoc_insertion_point(module_scope)
