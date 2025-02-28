# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# NO CHECKED-IN PROTOBUF GENCODE
# source: network/evpn-gw/l2_xpu_infra_mgr.proto
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
    'network/evpn-gw/l2_xpu_infra_mgr.proto'
)
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from network.opinetcommon import networktypes_pb2 as network_dot_opinetcommon_dot_networktypes__pb2
from network.evpn_gw import component_pb2 as network_dot_evpn__gw_dot_component__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n&network/evpn-gw/l2_xpu_infra_mgr.proto\x12 opi_api.network.evpn_gw.v1alpha1\x1a\'network/opinetcommon/networktypes.proto\x1a\x1fnetwork/evpn-gw/component.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a google/protobuf/field_mask.proto\x1a\x19google/api/resource.proto\"\xbf\x02\n\rLogicalBridge\x12\x17\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x08R\x04name\x12L\n\x04spec\x18\x02 \x01(\x0b\x32\x33.opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpecB\x03\xe0\x41\x02R\x04spec\x12R\n\x06status\x18\x03 \x01(\x0b\x32\x35.opi_api.network.evpn_gw.v1alpha1.LogicalBridgeStatusB\x03\xe0\x41\x03R\x06status:s\xea\x41p\n.opi_api.network.evpn_gw.v1alpha1/LogicalBridge\x12\x1flogicalBridges/{logical_bridge}*\x0elogicalBridges2\rlogicalBridge\"\xb1\x01\n\x11LogicalBridgeSpec\x12\x1c\n\x07vlan_id\x18\x01 \x01(\rB\x03\xe0\x41\x02R\x06vlanId\x12\x1a\n\x03vni\x18\x02 \x01(\rB\x03\xe0\x41\x01H\x00R\x03vni\x88\x01\x01\x12Z\n\x0evtep_ip_prefix\x18\x03 \x01(\x0b\x32/.opi_api.network.opinetcommon.v1alpha1.IPPrefixB\x03\xe0\x41\x01R\x0cvtepIpPrefixB\x06\n\x04_vni\"\xbd\x01\n\x13LogicalBridgeStatus\x12T\n\x0boper_status\x18\x01 \x01(\x0e\x32..opi_api.network.evpn_gw.v1alpha1.LBOperStatusB\x03\xe0\x41\x03R\noperStatus\x12P\n\ncomponents\x18\x02 \x03(\x0b\x32+.opi_api.network.evpn_gw.v1alpha1.ComponentB\x03\xe0\x41\x03R\ncomponents\"\xaa\x01\n\x1a\x43reateLogicalBridgeRequest\x12/\n\x11logical_bridge_id\x18\x01 \x01(\tB\x03\xe0\x41\x01R\x0flogicalBridgeId\x12[\n\x0elogical_bridge\x18\x02 \x01(\x0b\x32/.opi_api.network.evpn_gw.v1alpha1.LogicalBridgeB\x03\xe0\x41\x02R\rlogicalBridge\"a\n\x19ListLogicalBridgesRequest\x12 \n\tpage_size\x18\x01 \x01(\x05\x42\x03\xe0\x41\x01R\x08pageSize\x12\"\n\npage_token\x18\x02 \x01(\tB\x03\xe0\x41\x01R\tpageToken\"\x9e\x01\n\x1aListLogicalBridgesResponse\x12X\n\x0flogical_bridges\x18\x01 \x03(\x0b\x32/.opi_api.network.evpn_gw.v1alpha1.LogicalBridgeR\x0elogicalBridges\x12&\n\x0fnext_page_token\x18\x02 \x01(\tR\rnextPageToken\"e\n\x17GetLogicalBridgeRequest\x12J\n\x04name\x18\x01 \x01(\tB6\xe0\x41\x02\xfa\x41\x30\n.opi_api.network.evpn_gw.v1alpha1/LogicalBridgeR\x04name\"\x92\x01\n\x1a\x44\x65leteLogicalBridgeRequest\x12J\n\x04name\x18\x01 \x01(\tB6\xe0\x41\x02\xfa\x41\x30\n.opi_api.network.evpn_gw.v1alpha1/LogicalBridgeR\x04name\x12(\n\rallow_missing\x18\x02 \x01(\x08\x42\x03\xe0\x41\x01R\x0c\x61llowMissing\"\xe5\x01\n\x1aUpdateLogicalBridgeRequest\x12[\n\x0elogical_bridge\x18\x01 \x01(\x0b\x32/.opi_api.network.evpn_gw.v1alpha1.LogicalBridgeB\x03\xe0\x41\x02R\rlogicalBridge\x12@\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x01R\nupdateMask\x12(\n\rallow_missing\x18\x03 \x01(\x08\x42\x03\xe0\x41\x01R\x0c\x61llowMissing\"\xa7\x02\n\nBridgePort\x12\x17\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x08R\x04name\x12I\n\x04spec\x18\x02 \x01(\x0b\x32\x30.opi_api.network.evpn_gw.v1alpha1.BridgePortSpecB\x03\xe0\x41\x02R\x04spec\x12O\n\x06status\x18\x03 \x01(\x0b\x32\x32.opi_api.network.evpn_gw.v1alpha1.BridgePortStatusB\x03\xe0\x41\x03R\x06status:d\xea\x41\x61\n+opi_api.network.evpn_gw.v1alpha1/BridgePort\x12\x19\x62ridgePorts/{bridge_port}*\x0b\x62ridgePorts2\nbridgePort\"\xb1\x01\n\x0e\x42ridgePortSpec\x12$\n\x0bmac_address\x18\x01 \x01(\x0c\x42\x03\xe0\x41\x02R\nmacAddress\x12K\n\x05ptype\x18\x02 \x01(\x0e\x32\x30.opi_api.network.evpn_gw.v1alpha1.BridgePortTypeB\x03\xe0\x41\x02R\x05ptype\x12,\n\x0flogical_bridges\x18\x03 \x03(\tB\x03\xe0\x41\x01R\x0elogicalBridges\"\xba\x01\n\x10\x42ridgePortStatus\x12T\n\x0boper_status\x18\x01 \x01(\x0e\x32..opi_api.network.evpn_gw.v1alpha1.BPOperStatusB\x03\xe0\x41\x03R\noperStatus\x12P\n\ncomponents\x18\x02 \x03(\x0b\x32+.opi_api.network.evpn_gw.v1alpha1.ComponentB\x03\xe0\x41\x03R\ncomponents\"\x98\x01\n\x17\x43reateBridgePortRequest\x12)\n\x0e\x62ridge_port_id\x18\x01 \x01(\tB\x03\xe0\x41\x01R\x0c\x62ridgePortId\x12R\n\x0b\x62ridge_port\x18\x02 \x01(\x0b\x32,.opi_api.network.evpn_gw.v1alpha1.BridgePortB\x03\xe0\x41\x02R\nbridgePort\"^\n\x16ListBridgePortsRequest\x12 \n\tpage_size\x18\x01 \x01(\x05\x42\x03\xe0\x41\x01R\x08pageSize\x12\"\n\npage_token\x18\x02 \x01(\tB\x03\xe0\x41\x01R\tpageToken\"\x92\x01\n\x17ListBridgePortsResponse\x12O\n\x0c\x62ridge_ports\x18\x01 \x03(\x0b\x32,.opi_api.network.evpn_gw.v1alpha1.BridgePortR\x0b\x62ridgePorts\x12&\n\x0fnext_page_token\x18\x02 \x01(\tR\rnextPageToken\"_\n\x14GetBridgePortRequest\x12G\n\x04name\x18\x01 \x01(\tB3\xe0\x41\x02\xfa\x41-\n+opi_api.network.evpn_gw.v1alpha1/BridgePortR\x04name\"\x8c\x01\n\x17\x44\x65leteBridgePortRequest\x12G\n\x04name\x18\x01 \x01(\tB3\xe0\x41\x02\xfa\x41-\n+opi_api.network.evpn_gw.v1alpha1/BridgePortR\x04name\x12(\n\rallow_missing\x18\x02 \x01(\x08\x42\x03\xe0\x41\x01R\x0c\x61llowMissing\"\xd9\x01\n\x17UpdateBridgePortRequest\x12R\n\x0b\x62ridge_port\x18\x01 \x01(\x0b\x32,.opi_api.network.evpn_gw.v1alpha1.BridgePortB\x03\xe0\x41\x02R\nbridgePort\x12@\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x01R\nupdateMask\x12(\n\rallow_missing\x18\x03 \x01(\x08\x42\x03\xe0\x41\x01R\x0c\x61llowMissing*\x80\x01\n\x0cLBOperStatus\x12\x1e\n\x1aLB_OPER_STATUS_UNSPECIFIED\x10\x00\x12\x15\n\x11LB_OPER_STATUS_UP\x10\x01\x12\x17\n\x13LB_OPER_STATUS_DOWN\x10\x02\x12 \n\x1cLB_OPER_STATUS_TO_BE_DELETED\x10\x03*\x80\x01\n\x0c\x42POperStatus\x12\x1e\n\x1a\x42P_OPER_STATUS_UNSPECIFIED\x10\x00\x12\x15\n\x11\x42P_OPER_STATUS_UP\x10\x01\x12\x17\n\x13\x42P_OPER_STATUS_DOWN\x10\x02\x12 \n\x1c\x42P_OPER_STATUS_TO_BE_DELETED\x10\x03*k\n\x0e\x42ridgePortType\x12 \n\x1c\x42RIDGE_PORT_TYPE_UNSPECIFIED\x10\x00\x12\x1b\n\x17\x42RIDGE_PORT_TYPE_ACCESS\x10\x01\x12\x1a\n\x16\x42RIDGE_PORT_TYPE_TRUNK\x10\x02\x32\xc9\x07\n\x14LogicalBridgeService\x12\xd3\x01\n\x13\x43reateLogicalBridge\x12<.opi_api.network.evpn_gw.v1alpha1.CreateLogicalBridgeRequest\x1a/.opi_api.network.evpn_gw.v1alpha1.LogicalBridge\"M\xda\x41 logical_bridge,logical_bridge_id\x82\xd3\xe4\x93\x02$\"\x12/v1/logicalBridges:\x0elogical_bridge\x12\xab\x01\n\x12ListLogicalBridges\x12;.opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesRequest\x1a<.opi_api.network.evpn_gw.v1alpha1.ListLogicalBridgesResponse\"\x1a\x82\xd3\xe4\x93\x02\x14\x12\x12/v1/logicalBridges\x12\xaa\x01\n\x10GetLogicalBridge\x12\x39.opi_api.network.evpn_gw.v1alpha1.GetLogicalBridgeRequest\x1a/.opi_api.network.evpn_gw.v1alpha1.LogicalBridge\"*\xda\x41\x04name\x82\xd3\xe4\x93\x02\x1d\x12\x1b/v1/{name=logicalBridges/*}\x12\x97\x01\n\x13\x44\x65leteLogicalBridge\x12<.opi_api.network.evpn_gw.v1alpha1.DeleteLogicalBridgeRequest\x1a\x16.google.protobuf.Empty\"*\xda\x41\x04name\x82\xd3\xe4\x93\x02\x1d*\x1b/v1/{name=logicalBridges/*}\x12\xe5\x01\n\x13UpdateLogicalBridge\x12<.opi_api.network.evpn_gw.v1alpha1.UpdateLogicalBridgeRequest\x1a/.opi_api.network.evpn_gw.v1alpha1.LogicalBridge\"_\xda\x41\x1alogical_bridge,update_mask\x82\xd3\xe4\x93\x02<2*/v1/{logical_bridge.name=logicalBridges/*}:\x0elogical_bridge2\xfb\x06\n\x11\x42ridgePortService\x12\xbe\x01\n\x10\x43reateBridgePort\x12\x39.opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest\x1a,.opi_api.network.evpn_gw.v1alpha1.BridgePort\"A\xda\x41\x1a\x62ridge_port,bridge_port_id\x82\xd3\xe4\x93\x02\x1e\"\x0f/v1/bridgePorts:\x0b\x62ridge_port\x12\x9f\x01\n\x0fListBridgePorts\x12\x38.opi_api.network.evpn_gw.v1alpha1.ListBridgePortsRequest\x1a\x39.opi_api.network.evpn_gw.v1alpha1.ListBridgePortsResponse\"\x17\x82\xd3\xe4\x93\x02\x11\x12\x0f/v1/bridgePorts\x12\x9e\x01\n\rGetBridgePort\x12\x36.opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest\x1a,.opi_api.network.evpn_gw.v1alpha1.BridgePort\"\'\xda\x41\x04name\x82\xd3\xe4\x93\x02\x1a\x12\x18/v1/{name=bridgePorts/*}\x12\x8e\x01\n\x10\x44\x65leteBridgePort\x12\x39.opi_api.network.evpn_gw.v1alpha1.DeleteBridgePortRequest\x1a\x16.google.protobuf.Empty\"\'\xda\x41\x04name\x82\xd3\xe4\x93\x02\x1a*\x18/v1/{name=bridgePorts/*}\x12\xd0\x01\n\x10UpdateBridgePort\x12\x39.opi_api.network.evpn_gw.v1alpha1.UpdateBridgePortRequest\x1a,.opi_api.network.evpn_gw.v1alpha1.BridgePort\"S\xda\x41\x17\x62ridge_port,update_mask\x82\xd3\xe4\x93\x02\x33\x32$/v1/{bridge_port.name=bridgePorts/*}:\x0b\x62ridge_portBw\n opi_api.network.evpn_gw.v1alpha1B\x12L2XpuInfraMgrProtoP\x01Z=github.com/opiproject/opi-api/network/evpn-gw/v1alpha1/gen/gob\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'network.evpn_gw.l2_xpu_infra_mgr_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n opi_api.network.evpn_gw.v1alpha1B\022L2XpuInfraMgrProtoP\001Z=github.com/opiproject/opi-api/network/evpn-gw/v1alpha1/gen/go'
  _globals['_LOGICALBRIDGE'].fields_by_name['name']._loaded_options = None
  _globals['_LOGICALBRIDGE'].fields_by_name['name']._serialized_options = b'\340A\010'
  _globals['_LOGICALBRIDGE'].fields_by_name['spec']._loaded_options = None
  _globals['_LOGICALBRIDGE'].fields_by_name['spec']._serialized_options = b'\340A\002'
  _globals['_LOGICALBRIDGE'].fields_by_name['status']._loaded_options = None
  _globals['_LOGICALBRIDGE'].fields_by_name['status']._serialized_options = b'\340A\003'
  _globals['_LOGICALBRIDGE']._loaded_options = None
  _globals['_LOGICALBRIDGE']._serialized_options = b'\352Ap\n.opi_api.network.evpn_gw.v1alpha1/LogicalBridge\022\037logicalBridges/{logical_bridge}*\016logicalBridges2\rlogicalBridge'
  _globals['_LOGICALBRIDGESPEC'].fields_by_name['vlan_id']._loaded_options = None
  _globals['_LOGICALBRIDGESPEC'].fields_by_name['vlan_id']._serialized_options = b'\340A\002'
  _globals['_LOGICALBRIDGESPEC'].fields_by_name['vni']._loaded_options = None
  _globals['_LOGICALBRIDGESPEC'].fields_by_name['vni']._serialized_options = b'\340A\001'
  _globals['_LOGICALBRIDGESPEC'].fields_by_name['vtep_ip_prefix']._loaded_options = None
  _globals['_LOGICALBRIDGESPEC'].fields_by_name['vtep_ip_prefix']._serialized_options = b'\340A\001'
  _globals['_LOGICALBRIDGESTATUS'].fields_by_name['oper_status']._loaded_options = None
  _globals['_LOGICALBRIDGESTATUS'].fields_by_name['oper_status']._serialized_options = b'\340A\003'
  _globals['_LOGICALBRIDGESTATUS'].fields_by_name['components']._loaded_options = None
  _globals['_LOGICALBRIDGESTATUS'].fields_by_name['components']._serialized_options = b'\340A\003'
  _globals['_CREATELOGICALBRIDGEREQUEST'].fields_by_name['logical_bridge_id']._loaded_options = None
  _globals['_CREATELOGICALBRIDGEREQUEST'].fields_by_name['logical_bridge_id']._serialized_options = b'\340A\001'
  _globals['_CREATELOGICALBRIDGEREQUEST'].fields_by_name['logical_bridge']._loaded_options = None
  _globals['_CREATELOGICALBRIDGEREQUEST'].fields_by_name['logical_bridge']._serialized_options = b'\340A\002'
  _globals['_LISTLOGICALBRIDGESREQUEST'].fields_by_name['page_size']._loaded_options = None
  _globals['_LISTLOGICALBRIDGESREQUEST'].fields_by_name['page_size']._serialized_options = b'\340A\001'
  _globals['_LISTLOGICALBRIDGESREQUEST'].fields_by_name['page_token']._loaded_options = None
  _globals['_LISTLOGICALBRIDGESREQUEST'].fields_by_name['page_token']._serialized_options = b'\340A\001'
  _globals['_GETLOGICALBRIDGEREQUEST'].fields_by_name['name']._loaded_options = None
  _globals['_GETLOGICALBRIDGEREQUEST'].fields_by_name['name']._serialized_options = b'\340A\002\372A0\n.opi_api.network.evpn_gw.v1alpha1/LogicalBridge'
  _globals['_DELETELOGICALBRIDGEREQUEST'].fields_by_name['name']._loaded_options = None
  _globals['_DELETELOGICALBRIDGEREQUEST'].fields_by_name['name']._serialized_options = b'\340A\002\372A0\n.opi_api.network.evpn_gw.v1alpha1/LogicalBridge'
  _globals['_DELETELOGICALBRIDGEREQUEST'].fields_by_name['allow_missing']._loaded_options = None
  _globals['_DELETELOGICALBRIDGEREQUEST'].fields_by_name['allow_missing']._serialized_options = b'\340A\001'
  _globals['_UPDATELOGICALBRIDGEREQUEST'].fields_by_name['logical_bridge']._loaded_options = None
  _globals['_UPDATELOGICALBRIDGEREQUEST'].fields_by_name['logical_bridge']._serialized_options = b'\340A\002'
  _globals['_UPDATELOGICALBRIDGEREQUEST'].fields_by_name['update_mask']._loaded_options = None
  _globals['_UPDATELOGICALBRIDGEREQUEST'].fields_by_name['update_mask']._serialized_options = b'\340A\001'
  _globals['_UPDATELOGICALBRIDGEREQUEST'].fields_by_name['allow_missing']._loaded_options = None
  _globals['_UPDATELOGICALBRIDGEREQUEST'].fields_by_name['allow_missing']._serialized_options = b'\340A\001'
  _globals['_BRIDGEPORT'].fields_by_name['name']._loaded_options = None
  _globals['_BRIDGEPORT'].fields_by_name['name']._serialized_options = b'\340A\010'
  _globals['_BRIDGEPORT'].fields_by_name['spec']._loaded_options = None
  _globals['_BRIDGEPORT'].fields_by_name['spec']._serialized_options = b'\340A\002'
  _globals['_BRIDGEPORT'].fields_by_name['status']._loaded_options = None
  _globals['_BRIDGEPORT'].fields_by_name['status']._serialized_options = b'\340A\003'
  _globals['_BRIDGEPORT']._loaded_options = None
  _globals['_BRIDGEPORT']._serialized_options = b'\352Aa\n+opi_api.network.evpn_gw.v1alpha1/BridgePort\022\031bridgePorts/{bridge_port}*\013bridgePorts2\nbridgePort'
  _globals['_BRIDGEPORTSPEC'].fields_by_name['mac_address']._loaded_options = None
  _globals['_BRIDGEPORTSPEC'].fields_by_name['mac_address']._serialized_options = b'\340A\002'
  _globals['_BRIDGEPORTSPEC'].fields_by_name['ptype']._loaded_options = None
  _globals['_BRIDGEPORTSPEC'].fields_by_name['ptype']._serialized_options = b'\340A\002'
  _globals['_BRIDGEPORTSPEC'].fields_by_name['logical_bridges']._loaded_options = None
  _globals['_BRIDGEPORTSPEC'].fields_by_name['logical_bridges']._serialized_options = b'\340A\001'
  _globals['_BRIDGEPORTSTATUS'].fields_by_name['oper_status']._loaded_options = None
  _globals['_BRIDGEPORTSTATUS'].fields_by_name['oper_status']._serialized_options = b'\340A\003'
  _globals['_BRIDGEPORTSTATUS'].fields_by_name['components']._loaded_options = None
  _globals['_BRIDGEPORTSTATUS'].fields_by_name['components']._serialized_options = b'\340A\003'
  _globals['_CREATEBRIDGEPORTREQUEST'].fields_by_name['bridge_port_id']._loaded_options = None
  _globals['_CREATEBRIDGEPORTREQUEST'].fields_by_name['bridge_port_id']._serialized_options = b'\340A\001'
  _globals['_CREATEBRIDGEPORTREQUEST'].fields_by_name['bridge_port']._loaded_options = None
  _globals['_CREATEBRIDGEPORTREQUEST'].fields_by_name['bridge_port']._serialized_options = b'\340A\002'
  _globals['_LISTBRIDGEPORTSREQUEST'].fields_by_name['page_size']._loaded_options = None
  _globals['_LISTBRIDGEPORTSREQUEST'].fields_by_name['page_size']._serialized_options = b'\340A\001'
  _globals['_LISTBRIDGEPORTSREQUEST'].fields_by_name['page_token']._loaded_options = None
  _globals['_LISTBRIDGEPORTSREQUEST'].fields_by_name['page_token']._serialized_options = b'\340A\001'
  _globals['_GETBRIDGEPORTREQUEST'].fields_by_name['name']._loaded_options = None
  _globals['_GETBRIDGEPORTREQUEST'].fields_by_name['name']._serialized_options = b'\340A\002\372A-\n+opi_api.network.evpn_gw.v1alpha1/BridgePort'
  _globals['_DELETEBRIDGEPORTREQUEST'].fields_by_name['name']._loaded_options = None
  _globals['_DELETEBRIDGEPORTREQUEST'].fields_by_name['name']._serialized_options = b'\340A\002\372A-\n+opi_api.network.evpn_gw.v1alpha1/BridgePort'
  _globals['_DELETEBRIDGEPORTREQUEST'].fields_by_name['allow_missing']._loaded_options = None
  _globals['_DELETEBRIDGEPORTREQUEST'].fields_by_name['allow_missing']._serialized_options = b'\340A\001'
  _globals['_UPDATEBRIDGEPORTREQUEST'].fields_by_name['bridge_port']._loaded_options = None
  _globals['_UPDATEBRIDGEPORTREQUEST'].fields_by_name['bridge_port']._serialized_options = b'\340A\002'
  _globals['_UPDATEBRIDGEPORTREQUEST'].fields_by_name['update_mask']._loaded_options = None
  _globals['_UPDATEBRIDGEPORTREQUEST'].fields_by_name['update_mask']._serialized_options = b'\340A\001'
  _globals['_UPDATEBRIDGEPORTREQUEST'].fields_by_name['allow_missing']._loaded_options = None
  _globals['_UPDATEBRIDGEPORTREQUEST'].fields_by_name['allow_missing']._serialized_options = b'\340A\001'
  _globals['_LOGICALBRIDGESERVICE'].methods_by_name['CreateLogicalBridge']._loaded_options = None
  _globals['_LOGICALBRIDGESERVICE'].methods_by_name['CreateLogicalBridge']._serialized_options = b'\332A logical_bridge,logical_bridge_id\202\323\344\223\002$\"\022/v1/logicalBridges:\016logical_bridge'
  _globals['_LOGICALBRIDGESERVICE'].methods_by_name['ListLogicalBridges']._loaded_options = None
  _globals['_LOGICALBRIDGESERVICE'].methods_by_name['ListLogicalBridges']._serialized_options = b'\202\323\344\223\002\024\022\022/v1/logicalBridges'
  _globals['_LOGICALBRIDGESERVICE'].methods_by_name['GetLogicalBridge']._loaded_options = None
  _globals['_LOGICALBRIDGESERVICE'].methods_by_name['GetLogicalBridge']._serialized_options = b'\332A\004name\202\323\344\223\002\035\022\033/v1/{name=logicalBridges/*}'
  _globals['_LOGICALBRIDGESERVICE'].methods_by_name['DeleteLogicalBridge']._loaded_options = None
  _globals['_LOGICALBRIDGESERVICE'].methods_by_name['DeleteLogicalBridge']._serialized_options = b'\332A\004name\202\323\344\223\002\035*\033/v1/{name=logicalBridges/*}'
  _globals['_LOGICALBRIDGESERVICE'].methods_by_name['UpdateLogicalBridge']._loaded_options = None
  _globals['_LOGICALBRIDGESERVICE'].methods_by_name['UpdateLogicalBridge']._serialized_options = b'\332A\032logical_bridge,update_mask\202\323\344\223\002<2*/v1/{logical_bridge.name=logicalBridges/*}:\016logical_bridge'
  _globals['_BRIDGEPORTSERVICE'].methods_by_name['CreateBridgePort']._loaded_options = None
  _globals['_BRIDGEPORTSERVICE'].methods_by_name['CreateBridgePort']._serialized_options = b'\332A\032bridge_port,bridge_port_id\202\323\344\223\002\036\"\017/v1/bridgePorts:\013bridge_port'
  _globals['_BRIDGEPORTSERVICE'].methods_by_name['ListBridgePorts']._loaded_options = None
  _globals['_BRIDGEPORTSERVICE'].methods_by_name['ListBridgePorts']._serialized_options = b'\202\323\344\223\002\021\022\017/v1/bridgePorts'
  _globals['_BRIDGEPORTSERVICE'].methods_by_name['GetBridgePort']._loaded_options = None
  _globals['_BRIDGEPORTSERVICE'].methods_by_name['GetBridgePort']._serialized_options = b'\332A\004name\202\323\344\223\002\032\022\030/v1/{name=bridgePorts/*}'
  _globals['_BRIDGEPORTSERVICE'].methods_by_name['DeleteBridgePort']._loaded_options = None
  _globals['_BRIDGEPORTSERVICE'].methods_by_name['DeleteBridgePort']._serialized_options = b'\332A\004name\202\323\344\223\002\032*\030/v1/{name=bridgePorts/*}'
  _globals['_BRIDGEPORTSERVICE'].methods_by_name['UpdateBridgePort']._loaded_options = None
  _globals['_BRIDGEPORTSERVICE'].methods_by_name['UpdateBridgePort']._serialized_options = b'\332A\027bridge_port,update_mask\202\323\344\223\00232$/v1/{bridge_port.name=bridgePorts/*}:\013bridge_port'
  _globals['_LBOPERSTATUS']._serialized_start=3467
  _globals['_LBOPERSTATUS']._serialized_end=3595
  _globals['_BPOPERSTATUS']._serialized_start=3598
  _globals['_BPOPERSTATUS']._serialized_end=3726
  _globals['_BRIDGEPORTTYPE']._serialized_start=3728
  _globals['_BRIDGEPORTTYPE']._serialized_end=3835
  _globals['_LOGICALBRIDGE']._serialized_start=329
  _globals['_LOGICALBRIDGE']._serialized_end=648
  _globals['_LOGICALBRIDGESPEC']._serialized_start=651
  _globals['_LOGICALBRIDGESPEC']._serialized_end=828
  _globals['_LOGICALBRIDGESTATUS']._serialized_start=831
  _globals['_LOGICALBRIDGESTATUS']._serialized_end=1020
  _globals['_CREATELOGICALBRIDGEREQUEST']._serialized_start=1023
  _globals['_CREATELOGICALBRIDGEREQUEST']._serialized_end=1193
  _globals['_LISTLOGICALBRIDGESREQUEST']._serialized_start=1195
  _globals['_LISTLOGICALBRIDGESREQUEST']._serialized_end=1292
  _globals['_LISTLOGICALBRIDGESRESPONSE']._serialized_start=1295
  _globals['_LISTLOGICALBRIDGESRESPONSE']._serialized_end=1453
  _globals['_GETLOGICALBRIDGEREQUEST']._serialized_start=1455
  _globals['_GETLOGICALBRIDGEREQUEST']._serialized_end=1556
  _globals['_DELETELOGICALBRIDGEREQUEST']._serialized_start=1559
  _globals['_DELETELOGICALBRIDGEREQUEST']._serialized_end=1705
  _globals['_UPDATELOGICALBRIDGEREQUEST']._serialized_start=1708
  _globals['_UPDATELOGICALBRIDGEREQUEST']._serialized_end=1937
  _globals['_BRIDGEPORT']._serialized_start=1940
  _globals['_BRIDGEPORT']._serialized_end=2235
  _globals['_BRIDGEPORTSPEC']._serialized_start=2238
  _globals['_BRIDGEPORTSPEC']._serialized_end=2415
  _globals['_BRIDGEPORTSTATUS']._serialized_start=2418
  _globals['_BRIDGEPORTSTATUS']._serialized_end=2604
  _globals['_CREATEBRIDGEPORTREQUEST']._serialized_start=2607
  _globals['_CREATEBRIDGEPORTREQUEST']._serialized_end=2759
  _globals['_LISTBRIDGEPORTSREQUEST']._serialized_start=2761
  _globals['_LISTBRIDGEPORTSREQUEST']._serialized_end=2855
  _globals['_LISTBRIDGEPORTSRESPONSE']._serialized_start=2858
  _globals['_LISTBRIDGEPORTSRESPONSE']._serialized_end=3004
  _globals['_GETBRIDGEPORTREQUEST']._serialized_start=3006
  _globals['_GETBRIDGEPORTREQUEST']._serialized_end=3101
  _globals['_DELETEBRIDGEPORTREQUEST']._serialized_start=3104
  _globals['_DELETEBRIDGEPORTREQUEST']._serialized_end=3244
  _globals['_UPDATEBRIDGEPORTREQUEST']._serialized_start=3247
  _globals['_UPDATEBRIDGEPORTREQUEST']._serialized_end=3464
  _globals['_LOGICALBRIDGESERVICE']._serialized_start=3838
  _globals['_LOGICALBRIDGESERVICE']._serialized_end=4807
  _globals['_BRIDGEPORTSERVICE']._serialized_start=4810
  _globals['_BRIDGEPORTSERVICE']._serialized_end=5701
# @@protoc_insertion_point(module_scope)
