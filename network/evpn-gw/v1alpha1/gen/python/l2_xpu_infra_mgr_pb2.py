# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: l2_xpu_infra_mgr.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x16l2_xpu_infra_mgr.proto\x12 opi_api.network.evpn_gw.v1alpha1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a google/protobuf/field_mask.proto\x1a\x19google/api/resource.proto\"\xe1\x02\n\rLogicalBridge\x12G\n\x04name\x18\x01 \x01(\tB9\xe0\x41\x03\xe0\x41\x05\xfa\x41\x30\n.opi_api.network.evpn_gw.v1alpha1/LogicalBridge\x12\x46\n\x04spec\x18\x02 \x01(\x0b\x32\x33.opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpecB\x03\xe0\x41\x02\x12J\n\x06status\x18\x03 \x01(\x0b\x32\x35.opi_api.network.evpn_gw.v1alpha1.LogicalBridgeStatusB\x03\xe0\x41\x03:s\xea\x41p\n.opi_api.network.evpn_gw.v1alpha1/LogicalBridge\x12\x1flogicalBridges/{logical_bridge}*\x0elogicalBridges2\rlogicalBridge\"H\n\x11LogicalBridgeSpec\x12\x14\n\x07vlan_id\x18\x01 \x01(\rB\x03\xe0\x41\x02\x12\x15\n\x03vni\x18\x02 \x01(\rB\x03\xe0\x41\x01H\x00\x88\x01\x01\x42\x06\n\x04_vni\"_\n\x13LogicalBridgeStatus\x12H\n\x0boper_status\x18\x01 \x01(\x0e\x32..opi_api.network.evpn_gw.v1alpha1.LBOperStatusB\x03\xe0\x41\x03\"\x8a\x01\n\x1a\x43reateLogicalBridgeRequest\x12\x1e\n\x11logical_bridge_id\x18\x01 \x01(\tB\x03\xe0\x41\x01\x12L\n\x0elogical_bridge\x18\x02 \x01(\x0b\x32/.opi_api.network.evpn_gw.v1alpha1.LogicalBridgeB\x03\xe0\x41\x02\"L\n\x19ListLogicalBridgesRequest\x12\x16\n\tpage_size\x18\x01 \x01(\x05\x42\x03\xe0\x41\x01\x12\x17\n\npage_token\x18\x02 \x01(\tB\x03\xe0\x41\x01\"\x7f\n\x1aListLogicalBridgesResponse\x12H\n\x0flogical_bridges\x18\x01 \x03(\x0b\x32/.opi_api.network.evpn_gw.v1alpha1.LogicalBridge\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"_\n\x17GetLogicalBridgeRequest\x12\x44\n\x04name\x18\x01 \x01(\tB6\xe0\x41\x02\xfa\x41\x30\n.opi_api.network.evpn_gw.v1alpha1/LogicalBridge\"~\n\x1a\x44\x65leteLogicalBridgeRequest\x12\x44\n\x04name\x18\x01 \x01(\tB6\xe0\x41\x02\xfa\x41\x30\n.opi_api.network.evpn_gw.v1alpha1/LogicalBridge\x12\x1a\n\rallow_missing\x18\x02 \x01(\x08\x42\x03\xe0\x41\x01\"\xbc\x01\n\x1aUpdateLogicalBridgeRequest\x12L\n\x0elogical_bridge\x18\x01 \x01(\x0b\x32/.opi_api.network.evpn_gw.v1alpha1.LogicalBridgeB\x03\xe0\x41\x02\x12\x34\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x01\x12\x1a\n\rallow_missing\x18\x03 \x01(\x08\x42\x03\xe0\x41\x01\"\xc6\x02\n\nBridgePort\x12\x44\n\x04name\x18\x01 \x01(\tB6\xe0\x41\x03\xe0\x41\x05\xfa\x41-\n+opi_api.network.evpn_gw.v1alpha1/BridgePort\x12\x43\n\x04spec\x18\x02 \x01(\x0b\x32\x30.opi_api.network.evpn_gw.v1alpha1.BridgePortSpecB\x03\xe0\x41\x02\x12G\n\x06status\x18\x03 \x01(\x0b\x32\x32.opi_api.network.evpn_gw.v1alpha1.BridgePortStatusB\x03\xe0\x41\x03:d\xea\x41\x61\n+opi_api.network.evpn_gw.v1alpha1/BridgePort\x12\x19\x62ridgePorts/{bridge_port}*\x0b\x62ridgePorts2\nbridgePort\"\x8e\x01\n\x0e\x42ridgePortSpec\x12\x18\n\x0bmac_address\x18\x01 \x01(\x0c\x42\x03\xe0\x41\x02\x12\x44\n\x05ptype\x18\x02 \x01(\x0e\x32\x30.opi_api.network.evpn_gw.v1alpha1.BridgePortTypeB\x03\xe0\x41\x02\x12\x1c\n\x0flogical_bridges\x18\x03 \x03(\tB\x03\xe0\x41\x01\"\\\n\x10\x42ridgePortStatus\x12H\n\x0boper_status\x18\x01 \x01(\x0e\x32..opi_api.network.evpn_gw.v1alpha1.BPOperStatusB\x03\xe0\x41\x03\"~\n\x17\x43reateBridgePortRequest\x12\x1b\n\x0e\x62ridge_port_id\x18\x01 \x01(\tB\x03\xe0\x41\x01\x12\x46\n\x0b\x62ridge_port\x18\x02 \x01(\x0b\x32,.opi_api.network.evpn_gw.v1alpha1.BridgePortB\x03\xe0\x41\x02\"I\n\x16ListBridgePortsRequest\x12\x16\n\tpage_size\x18\x01 \x01(\x05\x42\x03\xe0\x41\x01\x12\x17\n\npage_token\x18\x02 \x01(\tB\x03\xe0\x41\x01\"v\n\x17ListBridgePortsResponse\x12\x42\n\x0c\x62ridge_ports\x18\x01 \x03(\x0b\x32,.opi_api.network.evpn_gw.v1alpha1.BridgePort\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"Y\n\x14GetBridgePortRequest\x12\x41\n\x04name\x18\x01 \x01(\tB3\xe0\x41\x02\xfa\x41-\n+opi_api.network.evpn_gw.v1alpha1/BridgePort\"x\n\x17\x44\x65leteBridgePortRequest\x12\x41\n\x04name\x18\x01 \x01(\tB3\xe0\x41\x02\xfa\x41-\n+opi_api.network.evpn_gw.v1alpha1/BridgePort\x12\x1a\n\rallow_missing\x18\x02 \x01(\x08\x42\x03\xe0\x41\x01\"\xb3\x01\n\x17UpdateBridgePortRequest\x12\x46\n\x0b\x62ridge_port\x18\x01 \x01(\x0b\x32,.opi_api.network.evpn_gw.v1alpha1.BridgePortB\x03\xe0\x41\x02\x12\x34\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x01\x12\x1a\n\rallow_missing\x18\x03 \x01(\x08\x42\x03\xe0\x41\x01*^\n\x0cLBOperStatus\x12\x1e\n\x1aLB_OPER_STATUS_UNSPECIFIED\x10\x00\x12\x15\n\x11LB_OPER_STATUS_UP\x10\x01\x12\x17\n\x13LB_OPER_STATUS_DOWN\x10\x02*^\n\x0c\x42POperStatus\x12\x1e\n\x1a\x42P_OPER_STATUS_UNSPECIFIED\x10\x00\x12\x15\n\x11\x42P_OPER_STATUS_UP\x10\x01\x12\x17\n\x13\x42P_OPER_STATUS_DOWN\x10\x02*4\n\x0e\x42ridgePortType\x12\x0b\n\x07UNKNOWN\x10\x00\x12\n\n\x06\x41\x43\x43\x45SS\x10\x01\x12\t\n\x05TRUNK\x10\x02\x32\xc9\x07\n\x14LogicalBridgeService\x12\xd3\x01\n\x13\x43reateLogicalBridge\x12<.opi_api.network.evpn_gw.v1alpha1.CreateLogicalBridgeRequest\x1a/.opi_api.network.evpn_gw.v1alpha1.LogicalBridge\"M\x82\xd3\xe4\x93\x02$\"\x12/v1/logicalBridges:\x0elogical_bridge\xda\x41 logical_bridge,logical_bridge_id\x12\xab\x01\n\x12ListLogicalBridges\x12;.opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesRequest\x1a<.opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse\"\x1a\x82\xd3\xe4\x93\x02\x14\x12\x12/v1/logicalBridges\x12\xaa\x01\n\x10GetLogicalBridge\x12\x39.opi_api.network.evpn_gw.v1alpha1.GetLogicalBridgeRequest\x1a/.opi_api.network.evpn_gw.v1alpha1.LogicalBridge\"*\x82\xd3\xe4\x93\x02\x1d\x12\x1b/v1/{name=logicalBridges/*}\xda\x41\x04name\x12\x97\x01\n\x13\x44\x65leteLogicalBridge\x12<.opi_api.network.evpn_gw.v1alpha1.DeleteLogicalBridgeRequest\x1a\x16.google.protobuf.Empty\"*\x82\xd3\xe4\x93\x02\x1d*\x1b/v1/{name=logicalBridges/*}\xda\x41\x04name\x12\xe5\x01\n\x13UpdateLogicalBridge\x12<.opi_api.network.evpn_gw.v1alpha1.UpdateLogicalBridgeRequest\x1a/.opi_api.network.evpn_gw.v1alpha1.LogicalBridge\"_\x82\xd3\xe4\x93\x02<2*/v1/{logical_bridge.name=logicalBridges/*}:\x0elogical_bridge\xda\x41\x1alogical_bridge,update_mask2\xfb\x06\n\x11\x42ridgePortService\x12\xbe\x01\n\x10\x43reateBridgePort\x12\x39.opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest\x1a,.opi_api.network.evpn_gw.v1alpha1.BridgePort\"A\x82\xd3\xe4\x93\x02\x1e\"\x0f/v1/bridgePorts:\x0b\x62ridge_port\xda\x41\x1a\x62ridge_port,bridge_port_id\x12\x9f\x01\n\x0fListBridgePorts\x12\x38.opi_api.network.evpn_gw.v1alpha1.ListBridgePortsRequest\x1a\x39.opi_api.network.evpn_gw.v1alpha1.ListBridgePortsResponse\"\x17\x82\xd3\xe4\x93\x02\x11\x12\x0f/v1/bridgePorts\x12\x9e\x01\n\rGetBridgePort\x12\x36.opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest\x1a,.opi_api.network.evpn_gw.v1alpha1.BridgePort\"\'\x82\xd3\xe4\x93\x02\x1a\x12\x18/v1/{name=bridgePorts/*}\xda\x41\x04name\x12\x8e\x01\n\x10\x44\x65leteBridgePort\x12\x39.opi_api.network.evpn_gw.v1alpha1.DeleteBridgePortRequest\x1a\x16.google.protobuf.Empty\"\'\x82\xd3\xe4\x93\x02\x1a*\x18/v1/{name=bridgePorts/*}\xda\x41\x04name\x12\xd0\x01\n\x10UpdateBridgePort\x12\x39.opi_api.network.evpn_gw.v1alpha1.UpdateBridgePortRequest\x1a,.opi_api.network.evpn_gw.v1alpha1.BridgePort\"S\x82\xd3\xe4\x93\x02\x33\x32$/v1/{bridge_port.name=bridgePorts/*}:\x0b\x62ridge_port\xda\x41\x17\x62ridge_port,update_maskBw\n opi_api.network.evpn_gw.v1alpha1B\x12L2XpuInfraMgrProtoP\x01Z=github.com/opiproject/opi-api/network/evpn-gw/v1alpha1/gen/gob\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'l2_xpu_infra_mgr_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n opi_api.network.evpn_gw.v1alpha1B\022L2XpuInfraMgrProtoP\001Z=github.com/opiproject/opi-api/network/evpn-gw/v1alpha1/gen/go'
  _LOGICALBRIDGE.fields_by_name['name']._options = None
  _LOGICALBRIDGE.fields_by_name['name']._serialized_options = b'\340A\003\340A\005\372A0\n.opi_api.network.evpn_gw.v1alpha1/LogicalBridge'
  _LOGICALBRIDGE.fields_by_name['spec']._options = None
  _LOGICALBRIDGE.fields_by_name['spec']._serialized_options = b'\340A\002'
  _LOGICALBRIDGE.fields_by_name['status']._options = None
  _LOGICALBRIDGE.fields_by_name['status']._serialized_options = b'\340A\003'
  _LOGICALBRIDGE._options = None
  _LOGICALBRIDGE._serialized_options = b'\352Ap\n.opi_api.network.evpn_gw.v1alpha1/LogicalBridge\022\037logicalBridges/{logical_bridge}*\016logicalBridges2\rlogicalBridge'
  _LOGICALBRIDGESPEC.fields_by_name['vlan_id']._options = None
  _LOGICALBRIDGESPEC.fields_by_name['vlan_id']._serialized_options = b'\340A\002'
  _LOGICALBRIDGESPEC.fields_by_name['vni']._options = None
  _LOGICALBRIDGESPEC.fields_by_name['vni']._serialized_options = b'\340A\001'
  _LOGICALBRIDGESTATUS.fields_by_name['oper_status']._options = None
  _LOGICALBRIDGESTATUS.fields_by_name['oper_status']._serialized_options = b'\340A\003'
  _CREATELOGICALBRIDGEREQUEST.fields_by_name['logical_bridge_id']._options = None
  _CREATELOGICALBRIDGEREQUEST.fields_by_name['logical_bridge_id']._serialized_options = b'\340A\001'
  _CREATELOGICALBRIDGEREQUEST.fields_by_name['logical_bridge']._options = None
  _CREATELOGICALBRIDGEREQUEST.fields_by_name['logical_bridge']._serialized_options = b'\340A\002'
  _LISTLOGICALBRIDGESREQUEST.fields_by_name['page_size']._options = None
  _LISTLOGICALBRIDGESREQUEST.fields_by_name['page_size']._serialized_options = b'\340A\001'
  _LISTLOGICALBRIDGESREQUEST.fields_by_name['page_token']._options = None
  _LISTLOGICALBRIDGESREQUEST.fields_by_name['page_token']._serialized_options = b'\340A\001'
  _GETLOGICALBRIDGEREQUEST.fields_by_name['name']._options = None
  _GETLOGICALBRIDGEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A0\n.opi_api.network.evpn_gw.v1alpha1/LogicalBridge'
  _DELETELOGICALBRIDGEREQUEST.fields_by_name['name']._options = None
  _DELETELOGICALBRIDGEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A0\n.opi_api.network.evpn_gw.v1alpha1/LogicalBridge'
  _DELETELOGICALBRIDGEREQUEST.fields_by_name['allow_missing']._options = None
  _DELETELOGICALBRIDGEREQUEST.fields_by_name['allow_missing']._serialized_options = b'\340A\001'
  _UPDATELOGICALBRIDGEREQUEST.fields_by_name['logical_bridge']._options = None
  _UPDATELOGICALBRIDGEREQUEST.fields_by_name['logical_bridge']._serialized_options = b'\340A\002'
  _UPDATELOGICALBRIDGEREQUEST.fields_by_name['update_mask']._options = None
  _UPDATELOGICALBRIDGEREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\001'
  _UPDATELOGICALBRIDGEREQUEST.fields_by_name['allow_missing']._options = None
  _UPDATELOGICALBRIDGEREQUEST.fields_by_name['allow_missing']._serialized_options = b'\340A\001'
  _BRIDGEPORT.fields_by_name['name']._options = None
  _BRIDGEPORT.fields_by_name['name']._serialized_options = b'\340A\003\340A\005\372A-\n+opi_api.network.evpn_gw.v1alpha1/BridgePort'
  _BRIDGEPORT.fields_by_name['spec']._options = None
  _BRIDGEPORT.fields_by_name['spec']._serialized_options = b'\340A\002'
  _BRIDGEPORT.fields_by_name['status']._options = None
  _BRIDGEPORT.fields_by_name['status']._serialized_options = b'\340A\003'
  _BRIDGEPORT._options = None
  _BRIDGEPORT._serialized_options = b'\352Aa\n+opi_api.network.evpn_gw.v1alpha1/BridgePort\022\031bridgePorts/{bridge_port}*\013bridgePorts2\nbridgePort'
  _BRIDGEPORTSPEC.fields_by_name['mac_address']._options = None
  _BRIDGEPORTSPEC.fields_by_name['mac_address']._serialized_options = b'\340A\002'
  _BRIDGEPORTSPEC.fields_by_name['ptype']._options = None
  _BRIDGEPORTSPEC.fields_by_name['ptype']._serialized_options = b'\340A\002'
  _BRIDGEPORTSPEC.fields_by_name['logical_bridges']._options = None
  _BRIDGEPORTSPEC.fields_by_name['logical_bridges']._serialized_options = b'\340A\001'
  _BRIDGEPORTSTATUS.fields_by_name['oper_status']._options = None
  _BRIDGEPORTSTATUS.fields_by_name['oper_status']._serialized_options = b'\340A\003'
  _CREATEBRIDGEPORTREQUEST.fields_by_name['bridge_port_id']._options = None
  _CREATEBRIDGEPORTREQUEST.fields_by_name['bridge_port_id']._serialized_options = b'\340A\001'
  _CREATEBRIDGEPORTREQUEST.fields_by_name['bridge_port']._options = None
  _CREATEBRIDGEPORTREQUEST.fields_by_name['bridge_port']._serialized_options = b'\340A\002'
  _LISTBRIDGEPORTSREQUEST.fields_by_name['page_size']._options = None
  _LISTBRIDGEPORTSREQUEST.fields_by_name['page_size']._serialized_options = b'\340A\001'
  _LISTBRIDGEPORTSREQUEST.fields_by_name['page_token']._options = None
  _LISTBRIDGEPORTSREQUEST.fields_by_name['page_token']._serialized_options = b'\340A\001'
  _GETBRIDGEPORTREQUEST.fields_by_name['name']._options = None
  _GETBRIDGEPORTREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A-\n+opi_api.network.evpn_gw.v1alpha1/BridgePort'
  _DELETEBRIDGEPORTREQUEST.fields_by_name['name']._options = None
  _DELETEBRIDGEPORTREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A-\n+opi_api.network.evpn_gw.v1alpha1/BridgePort'
  _DELETEBRIDGEPORTREQUEST.fields_by_name['allow_missing']._options = None
  _DELETEBRIDGEPORTREQUEST.fields_by_name['allow_missing']._serialized_options = b'\340A\001'
  _UPDATEBRIDGEPORTREQUEST.fields_by_name['bridge_port']._options = None
  _UPDATEBRIDGEPORTREQUEST.fields_by_name['bridge_port']._serialized_options = b'\340A\002'
  _UPDATEBRIDGEPORTREQUEST.fields_by_name['update_mask']._options = None
  _UPDATEBRIDGEPORTREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\001'
  _UPDATEBRIDGEPORTREQUEST.fields_by_name['allow_missing']._options = None
  _UPDATEBRIDGEPORTREQUEST.fields_by_name['allow_missing']._serialized_options = b'\340A\001'
  _LOGICALBRIDGESERVICE.methods_by_name['CreateLogicalBridge']._options = None
  _LOGICALBRIDGESERVICE.methods_by_name['CreateLogicalBridge']._serialized_options = b'\202\323\344\223\002$\"\022/v1/logicalBridges:\016logical_bridge\332A logical_bridge,logical_bridge_id'
  _LOGICALBRIDGESERVICE.methods_by_name['ListLogicalBridges']._options = None
  _LOGICALBRIDGESERVICE.methods_by_name['ListLogicalBridges']._serialized_options = b'\202\323\344\223\002\024\022\022/v1/logicalBridges'
  _LOGICALBRIDGESERVICE.methods_by_name['GetLogicalBridge']._options = None
  _LOGICALBRIDGESERVICE.methods_by_name['GetLogicalBridge']._serialized_options = b'\202\323\344\223\002\035\022\033/v1/{name=logicalBridges/*}\332A\004name'
  _LOGICALBRIDGESERVICE.methods_by_name['DeleteLogicalBridge']._options = None
  _LOGICALBRIDGESERVICE.methods_by_name['DeleteLogicalBridge']._serialized_options = b'\202\323\344\223\002\035*\033/v1/{name=logicalBridges/*}\332A\004name'
  _LOGICALBRIDGESERVICE.methods_by_name['UpdateLogicalBridge']._options = None
  _LOGICALBRIDGESERVICE.methods_by_name['UpdateLogicalBridge']._serialized_options = b'\202\323\344\223\002<2*/v1/{logical_bridge.name=logicalBridges/*}:\016logical_bridge\332A\032logical_bridge,update_mask'
  _BRIDGEPORTSERVICE.methods_by_name['CreateBridgePort']._options = None
  _BRIDGEPORTSERVICE.methods_by_name['CreateBridgePort']._serialized_options = b'\202\323\344\223\002\036\"\017/v1/bridgePorts:\013bridge_port\332A\032bridge_port,bridge_port_id'
  _BRIDGEPORTSERVICE.methods_by_name['ListBridgePorts']._options = None
  _BRIDGEPORTSERVICE.methods_by_name['ListBridgePorts']._serialized_options = b'\202\323\344\223\002\021\022\017/v1/bridgePorts'
  _BRIDGEPORTSERVICE.methods_by_name['GetBridgePort']._options = None
  _BRIDGEPORTSERVICE.methods_by_name['GetBridgePort']._serialized_options = b'\202\323\344\223\002\032\022\030/v1/{name=bridgePorts/*}\332A\004name'
  _BRIDGEPORTSERVICE.methods_by_name['DeleteBridgePort']._options = None
  _BRIDGEPORTSERVICE.methods_by_name['DeleteBridgePort']._serialized_options = b'\202\323\344\223\002\032*\030/v1/{name=bridgePorts/*}\332A\004name'
  _BRIDGEPORTSERVICE.methods_by_name['UpdateBridgePort']._options = None
  _BRIDGEPORTSERVICE.methods_by_name['UpdateBridgePort']._serialized_options = b'\202\323\344\223\00232$/v1/{bridge_port.name=bridgePorts/*}:\013bridge_port\332A\027bridge_port,update_mask'
  _LBOPERSTATUS._serialized_start=2815
  _LBOPERSTATUS._serialized_end=2909
  _BPOPERSTATUS._serialized_start=2911
  _BPOPERSTATUS._serialized_end=3005
  _BRIDGEPORTTYPE._serialized_start=3007
  _BRIDGEPORTTYPE._serialized_end=3059
  _LOGICALBRIDGE._serialized_start=239
  _LOGICALBRIDGE._serialized_end=592
  _LOGICALBRIDGESPEC._serialized_start=594
  _LOGICALBRIDGESPEC._serialized_end=666
  _LOGICALBRIDGESTATUS._serialized_start=668
  _LOGICALBRIDGESTATUS._serialized_end=763
  _CREATELOGICALBRIDGEREQUEST._serialized_start=766
  _CREATELOGICALBRIDGEREQUEST._serialized_end=904
  _LISTLOGICALBRIDGESREQUEST._serialized_start=906
  _LISTLOGICALBRIDGESREQUEST._serialized_end=982
  _LISTLOGICALBRIDGESRESPONSE._serialized_start=984
  _LISTLOGICALBRIDGESRESPONSE._serialized_end=1111
  _GETLOGICALBRIDGEREQUEST._serialized_start=1113
  _GETLOGICALBRIDGEREQUEST._serialized_end=1208
  _DELETELOGICALBRIDGEREQUEST._serialized_start=1210
  _DELETELOGICALBRIDGEREQUEST._serialized_end=1336
  _UPDATELOGICALBRIDGEREQUEST._serialized_start=1339
  _UPDATELOGICALBRIDGEREQUEST._serialized_end=1527
  _BRIDGEPORT._serialized_start=1530
  _BRIDGEPORT._serialized_end=1856
  _BRIDGEPORTSPEC._serialized_start=1859
  _BRIDGEPORTSPEC._serialized_end=2001
  _BRIDGEPORTSTATUS._serialized_start=2003
  _BRIDGEPORTSTATUS._serialized_end=2095
  _CREATEBRIDGEPORTREQUEST._serialized_start=2097
  _CREATEBRIDGEPORTREQUEST._serialized_end=2223
  _LISTBRIDGEPORTSREQUEST._serialized_start=2225
  _LISTBRIDGEPORTSREQUEST._serialized_end=2298
  _LISTBRIDGEPORTSRESPONSE._serialized_start=2300
  _LISTBRIDGEPORTSRESPONSE._serialized_end=2418
  _GETBRIDGEPORTREQUEST._serialized_start=2420
  _GETBRIDGEPORTREQUEST._serialized_end=2509
  _DELETEBRIDGEPORTREQUEST._serialized_start=2511
  _DELETEBRIDGEPORTREQUEST._serialized_end=2631
  _UPDATEBRIDGEPORTREQUEST._serialized_start=2634
  _UPDATEBRIDGEPORTREQUEST._serialized_end=2813
  _LOGICALBRIDGESERVICE._serialized_start=3062
  _LOGICALBRIDGESERVICE._serialized_end=4031
  _BRIDGEPORTSERVICE._serialized_start=4034
  _BRIDGEPORTSERVICE._serialized_end=4925
# @@protoc_insertion_point(module_scope)
