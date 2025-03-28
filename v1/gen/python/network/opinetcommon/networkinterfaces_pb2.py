# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# NO CHECKED-IN PROTOBUF GENCODE
# source: network/opinetcommon/networkinterfaces.proto
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
    'network/opinetcommon/networkinterfaces.proto'
)
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from network.opinetcommon import networkethernet_pb2 as network_dot_opinetcommon_dot_networkethernet__pb2
from network.opinetcommon import networktypes_pb2 as network_dot_opinetcommon_dot_networktypes__pb2
from network.opinetcommon import networkvlan_pb2 as network_dot_opinetcommon_dot_networkvlan__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n,network/opinetcommon/networkinterfaces.proto\x12%opi_api.network.opinetcommon.v1alpha1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a google/protobuf/field_mask.proto\x1a*network/opinetcommon/networkethernet.proto\x1a\'network/opinetcommon/networktypes.proto\x1a&network/opinetcommon/networkvlan.proto\"\xce\x02\n\x12NetInterfaceConfig\x12\x17\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x02R\x04name\x12M\n\x04type\x18\x02 \x01(\x0e\x32\x34.opi_api.network.opinetcommon.v1alpha1.InterfaceTypeB\x03\xe0\x41\x02R\x04type\x12\x15\n\x03mtu\x18\x03 \x01(\rB\x03\xe0\x41\x02R\x03mtu\x12(\n\rloopback_mode\x18\x04 \x01(\x08\x42\x03\xe0\x41\x02R\x0cloopbackMode\x12%\n\x0b\x64\x65scription\x18\x05 \x01(\tB\x03\xe0\x41\x02R\x0b\x64\x65scription\x12\x1d\n\x07\x65nabled\x18\x06 \x01(\x08\x42\x03\xe0\x41\x02R\x07\x65nabled\x12I\n\x04tpid\x18\x07 \x01(\x0e\x32\x30.opi_api.network.opinetcommon.v1alpha1.TpidTypesB\x03\xe0\x41\x01R\x04tpid\"\x92\x06\n\x14NetInterfaceCounters\x12 \n\trx_octets\x18\x01 \x01(\x04\x42\x03\xe0\x41\x03R\x08rxOctets\x12\"\n\nrx_packets\x18\x02 \x01(\x04\x42\x03\xe0\x41\x03R\trxPackets\x12+\n\x0frx_unicast_pkts\x18\x03 \x01(\x04\x42\x03\xe0\x41\x03R\rrxUnicastPkts\x12/\n\x11rx_broadcast_pkts\x18\x04 \x01(\x04\x42\x03\xe0\x41\x03R\x0frxBroadcastPkts\x12/\n\x11rx_multicast_pkts\x18\x05 \x01(\x04\x42\x03\xe0\x41\x03R\x0frxMulticastPkts\x12$\n\x0brx_discards\x18\x06 \x01(\x04\x42\x03\xe0\x41\x03R\nrxDiscards\x12 \n\trx_errors\x18\x07 \x01(\x04\x42\x03\xe0\x41\x03R\x08rxErrors\x12/\n\x11rx_unknown_protos\x18\x08 \x01(\x04\x42\x03\xe0\x41\x03R\x0frxUnknownProtos\x12\'\n\rrx_fcs_errors\x18\t \x01(\x04\x42\x03\xe0\x41\x03R\x0brxFcsErrors\x12\"\n\nout_octets\x18\n \x01(\x04\x42\x03\xe0\x41\x03R\toutOctets\x12$\n\x0bout_packets\x18\x0b \x01(\x04\x42\x03\xe0\x41\x03R\noutPackets\x12-\n\x10out_unicast_pkts\x18\x0c \x01(\x04\x42\x03\xe0\x41\x03R\x0eoutUnicastPkts\x12\x31\n\x12out_broadcast_pkts\x18\r \x01(\x04\x42\x03\xe0\x41\x03R\x10outBroadcastPkts\x12\x31\n\x12out_multicast_pkts\x18\x0e \x01(\x04\x42\x03\xe0\x41\x03R\x10outMulticastPkts\x12&\n\x0cout_discards\x18\x0f \x01(\x04\x42\x03\xe0\x41\x03R\x0boutDiscards\x12\"\n\nout_errors\x18\x10 \x01(\x04\x42\x03\xe0\x41\x03R\toutErrors\x12\x34\n\x13\x63\x61rrier_transitions\x18\x11 \x01(\x04\x42\x03\xe0\x41\x03R\x12\x63\x61rrierTransitions\x12\"\n\nlast_clear\x18\x12 \x01(\x04\x42\x03\xe0\x41\x03R\tlastClear\"\xfa\x05\n\x11NetInterfaceState\x12\x17\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x03R\x04name\x12M\n\x04type\x18\x02 \x01(\x0e\x32\x34.opi_api.network.opinetcommon.v1alpha1.InterfaceTypeB\x03\xe0\x41\x03R\x04type\x12\x15\n\x03mtu\x18\x03 \x01(\rB\x03\xe0\x41\x03R\x03mtu\x12(\n\rloopback_mode\x18\x04 \x01(\x08\x42\x03\xe0\x41\x03R\x0cloopbackMode\x12%\n\x0b\x64\x65scription\x18\x05 \x01(\tB\x03\xe0\x41\x03R\x0b\x64\x65scription\x12\x1d\n\x07\x65nabled\x18\x06 \x01(\x08\x42\x03\xe0\x41\x03R\x07\x65nabled\x12\x1d\n\x07ifindex\x18\x07 \x01(\rB\x03\xe0\x41\x03R\x07ifindex\x12W\n\x0b\x61\x64min_state\x18\x08 \x01(\x0e\x32\x31.opi_api.network.opinetcommon.v1alpha1.AdminStateB\x03\xe0\x41\x03R\nadminState\x12T\n\noper_state\x18\t \x01(\x0e\x32\x30.opi_api.network.opinetcommon.v1alpha1.OperStateB\x03\xe0\x41\x03R\toperState\x12$\n\x0blast_change\x18\n \x01(\x04\x42\x03\xe0\x41\x03R\nlastChange\x12\x1d\n\x07logical\x18\x0b \x01(\x08\x42\x03\xe0\x41\x03R\x07logical\x12#\n\nmanagement\x18\x0c \x01(\x08\x42\x03\xe0\x41\x03R\nmanagement\x12\x15\n\x03\x63pu\x18\r \x01(\x08\x42\x03\xe0\x41\x03R\x03\x63pu\x12\\\n\x08\x63ounters\x18\x0e \x01(\x0b\x32;.opi_api.network.opinetcommon.v1alpha1.NetInterfaceCountersB\x03\xe0\x41\x03R\x08\x63ounters\x12I\n\x04tpid\x18\x0f \x01(\x0e\x32\x30.opi_api.network.opinetcommon.v1alpha1.TpidTypesB\x03\xe0\x41\x03R\x04tpid\"\x94\x0c\n\x0cNetInterface\x12\x17\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x08R\x04name\x12V\n\x06\x63onfig\x18\x02 \x01(\x0b\x32\x39.opi_api.network.opinetcommon.v1alpha1.NetInterfaceConfigB\x03\xe0\x41\x02R\x06\x63onfig\x12S\n\x05state\x18\x03 \x01(\x0b\x32\x38.opi_api.network.opinetcommon.v1alpha1.NetInterfaceStateB\x03\xe0\x41\x03R\x05state\x12]\n\x08holdtime\x18\x04 \x01(\x0b\x32<.opi_api.network.opinetcommon.v1alpha1.NetInterface.HoldTimeB\x03\xe0\x41\x01R\x08holdtime\x12l\n\rsubinterfaces\x18\x05 \x01(\x0b\x32\x41.opi_api.network.opinetcommon.v1alpha1.NetInterface.SubinterfacesB\x03\xe0\x41\x01R\rsubinterfaces\x12Y\n\x08\x65thernet\x18\x06 \x01(\x0b\x32\x38.opi_api.network.opinetcommon.v1alpha1.EthernetInterfaceB\x03\xe0\x41\x01R\x08\x65thernet\x1a\xdc\x02\n\x08HoldTime\x12m\n\x0bhold_config\x18\x01 \x01(\x0b\x32G.opi_api.network.opinetcommon.v1alpha1.NetInterface.HoldTime.HoldConfigB\x03\xe0\x41\x01R\nholdConfig\x12j\n\nhold_state\x18\x02 \x01(\x0b\x32\x46.opi_api.network.opinetcommon.v1alpha1.NetInterface.HoldTime.HoldStateB\x03\xe0\x41\x03R\tholdState\x1a:\n\nHoldConfig\x12\x13\n\x02up\x18\x01 \x01(\rB\x03\xe0\x41\x01R\x02up\x12\x17\n\x04\x64own\x18\x02 \x01(\rB\x03\xe0\x41\x01R\x04\x64own\x1a\x39\n\tHoldState\x12\x13\n\x02up\x18\x01 \x01(\rB\x03\xe0\x41\x03R\x02up\x12\x17\n\x04\x64own\x18\x02 \x01(\rB\x03\xe0\x41\x03R\x04\x64own\x1a\xc6\x04\n\rSubinterfaces\x12w\n\x0csubinterface\x18\x02 \x03(\x0b\x32N.opi_api.network.opinetcommon.v1alpha1.NetInterface.Subinterfaces.SubinterfaceB\x03\xe0\x41\x01R\x0csubinterface\x1a\xbb\x03\n\x0cSubinterface\x12\x19\n\x05index\x18\x01 \x01(\x03\x42\x03\xe0\x41\x01R\x05index\x12\x82\x01\n\x0csubif_config\x18\x02 \x01(\x0b\x32Z.opi_api.network.opinetcommon.v1alpha1.NetInterface.Subinterfaces.Subinterface.SubifConfigB\x03\xe0\x41\x01R\x0bsubifConfig\x12S\n\x05state\x18\x03 \x01(\x0b\x32\x38.opi_api.network.opinetcommon.v1alpha1.NetInterfaceStateB\x03\xe0\x41\x03R\x05state\x12\x46\n\x04vlan\x18\x04 \x01(\x0b\x32-.opi_api.network.opinetcommon.v1alpha1.VlanIfB\x03\xe0\x41\x01R\x04vlan\x1an\n\x0bSubifConfig\x12\x19\n\x05index\x18\x01 \x01(\x04\x42\x03\xe0\x41\x01R\x05index\x12%\n\x0b\x64\x65scription\x18\x02 \x01(\tB\x03\xe0\x41\x01R\x0b\x64\x65scription\x12\x1d\n\x07\x65nabled\x18\x03 \x01(\x08\x42\x03\xe0\x41\x01R\x07\x65nabled:n\xea\x41k\n2opi_api.network.opinetcommon.v1alpha1/NetInterface\x12\x18netInterface/{interface}*\rnetInterfaces2\x0cnetInterface\"S\n\x16GetNetInterfaceRequest\x12\x39\n\x04name\x18\x01 \x01(\tB%\xe0\x41\x02\xfa\x41\x1f\n\x1dopi_api.network.v1/InterfacesR\x04name\"\x9f\x01\n\x18ListNetInterfacesRequest\x12=\n\x06parent\x18\x01 \x01(\tB%\xe0\x41\x02\xfa\x41\x1f\n\x1dopi_api.network.v1/InterfacesR\x06parent\x12 \n\tpage_size\x18\x02 \x01(\x05\x42\x03\xe0\x41\x01R\x08pageSize\x12\"\n\npage_token\x18\x03 \x01(\tB\x03\xe0\x41\x01R\tpageToken\"\x9f\x01\n\x19ListNetInterfacesResponse\x12Z\n\x0enet_interfaces\x18\x01 \x03(\x0b\x32\x33.opi_api.network.opinetcommon.v1alpha1.NetInterfaceR\rnetInterfaces\x12&\n\x0fnext_page_token\x18\x02 \x01(\tR\rnextPageToken\"\xe6\x01\n\x19UpdateNetInterfaceRequest\x12]\n\rnet_interface\x18\x01 \x01(\x0b\x32\x33.opi_api.network.opinetcommon.v1alpha1.NetInterfaceB\x03\xe0\x41\x02R\x0cnetInterface\x12@\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x01R\nupdateMask\x12(\n\rallow_missing\x18\x03 \x01(\x08\x42\x03\xe0\x41\x01R\x0c\x61llowMissing*i\n\rInterfaceType\x12\x1e\n\x1aINTERFACE_TYPE_UNSPECIFIED\x10\x00\x12\x1b\n\x17INTERFACE_TYPE_ETHERNET\x10\x01\x12\x1b\n\x17INTERFACE_TYPE_LOOPBACK\x10\x02*\xd4\x01\n\tOperState\x12\x1a\n\x16OPER_STATE_UNSPECIFIED\x10\x00\x12\x11\n\rOPER_STATE_UP\x10\x02\x12\x13\n\x0fOPER_STATE_DOWN\x10\x03\x12\x16\n\x12OPER_STATE_TESTING\x10\x04\x12\x16\n\x12OPER_STATE_UNKNOWN\x10\x05\x12\x16\n\x12OPER_STATE_DORMANT\x10\x06\x12\x1a\n\x16OPER_STATE_NOT_PRESENT\x10\x07\x12\x1f\n\x1bOPER_STATE_LOWER_LAYER_DOWN\x10\x08\x32\x88\x05\n\x13NetInterfaceService\x12\xb9\x01\n\x0fGetNetInterface\x12=.opi_api.network.opinetcommon.v1alpha1.GetNetInterfaceRequest\x1a\x33.opi_api.network.opinetcommon.v1alpha1.NetInterface\"2\xda\x41\x04name\x82\xd3\xe4\x93\x02%\x12#/v1/{name=interfaces/*/interface/*}\x12\xc0\x01\n\x11ListNetInterfaces\x12?.opi_api.network.opinetcommon.v1alpha1.ListNetInterfacesRequest\x1a@.opi_api.network.opinetcommon.v1alpha1.ListNetInterfacesResponse\"(\xda\x41\x06parent\x82\xd3\xe4\x93\x02\x19\x12\x17/v1/{parent=interfaces}\x12\xf1\x01\n\x12UpdateNetInterface\x12@.opi_api.network.opinetcommon.v1alpha1.UpdateNetInterfaceRequest\x1a\x33.opi_api.network.opinetcommon.v1alpha1.NetInterface\"d\xda\x41\x19net_interface,update_mask\x82\xd3\xe4\x93\x02\x42\x32\x31/v1/{net_interface.name=interfaces/*/interface/*}:\rnet_interfaceB\x85\x01\n%opi_api.network.opinetcommon.v1alpha1B\x16NetworkInterfacesProtoP\x01ZBgithub.com/opiproject/opi-api/network/opinetcommon/v1alpha1/gen/gob\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'network.opinetcommon.networkinterfaces_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n%opi_api.network.opinetcommon.v1alpha1B\026NetworkInterfacesProtoP\001ZBgithub.com/opiproject/opi-api/network/opinetcommon/v1alpha1/gen/go'
  _globals['_NETINTERFACECONFIG'].fields_by_name['name']._loaded_options = None
  _globals['_NETINTERFACECONFIG'].fields_by_name['name']._serialized_options = b'\340A\002'
  _globals['_NETINTERFACECONFIG'].fields_by_name['type']._loaded_options = None
  _globals['_NETINTERFACECONFIG'].fields_by_name['type']._serialized_options = b'\340A\002'
  _globals['_NETINTERFACECONFIG'].fields_by_name['mtu']._loaded_options = None
  _globals['_NETINTERFACECONFIG'].fields_by_name['mtu']._serialized_options = b'\340A\002'
  _globals['_NETINTERFACECONFIG'].fields_by_name['loopback_mode']._loaded_options = None
  _globals['_NETINTERFACECONFIG'].fields_by_name['loopback_mode']._serialized_options = b'\340A\002'
  _globals['_NETINTERFACECONFIG'].fields_by_name['description']._loaded_options = None
  _globals['_NETINTERFACECONFIG'].fields_by_name['description']._serialized_options = b'\340A\002'
  _globals['_NETINTERFACECONFIG'].fields_by_name['enabled']._loaded_options = None
  _globals['_NETINTERFACECONFIG'].fields_by_name['enabled']._serialized_options = b'\340A\002'
  _globals['_NETINTERFACECONFIG'].fields_by_name['tpid']._loaded_options = None
  _globals['_NETINTERFACECONFIG'].fields_by_name['tpid']._serialized_options = b'\340A\001'
  _globals['_NETINTERFACECOUNTERS'].fields_by_name['rx_octets']._loaded_options = None
  _globals['_NETINTERFACECOUNTERS'].fields_by_name['rx_octets']._serialized_options = b'\340A\003'
  _globals['_NETINTERFACECOUNTERS'].fields_by_name['rx_packets']._loaded_options = None
  _globals['_NETINTERFACECOUNTERS'].fields_by_name['rx_packets']._serialized_options = b'\340A\003'
  _globals['_NETINTERFACECOUNTERS'].fields_by_name['rx_unicast_pkts']._loaded_options = None
  _globals['_NETINTERFACECOUNTERS'].fields_by_name['rx_unicast_pkts']._serialized_options = b'\340A\003'
  _globals['_NETINTERFACECOUNTERS'].fields_by_name['rx_broadcast_pkts']._loaded_options = None
  _globals['_NETINTERFACECOUNTERS'].fields_by_name['rx_broadcast_pkts']._serialized_options = b'\340A\003'
  _globals['_NETINTERFACECOUNTERS'].fields_by_name['rx_multicast_pkts']._loaded_options = None
  _globals['_NETINTERFACECOUNTERS'].fields_by_name['rx_multicast_pkts']._serialized_options = b'\340A\003'
  _globals['_NETINTERFACECOUNTERS'].fields_by_name['rx_discards']._loaded_options = None
  _globals['_NETINTERFACECOUNTERS'].fields_by_name['rx_discards']._serialized_options = b'\340A\003'
  _globals['_NETINTERFACECOUNTERS'].fields_by_name['rx_errors']._loaded_options = None
  _globals['_NETINTERFACECOUNTERS'].fields_by_name['rx_errors']._serialized_options = b'\340A\003'
  _globals['_NETINTERFACECOUNTERS'].fields_by_name['rx_unknown_protos']._loaded_options = None
  _globals['_NETINTERFACECOUNTERS'].fields_by_name['rx_unknown_protos']._serialized_options = b'\340A\003'
  _globals['_NETINTERFACECOUNTERS'].fields_by_name['rx_fcs_errors']._loaded_options = None
  _globals['_NETINTERFACECOUNTERS'].fields_by_name['rx_fcs_errors']._serialized_options = b'\340A\003'
  _globals['_NETINTERFACECOUNTERS'].fields_by_name['out_octets']._loaded_options = None
  _globals['_NETINTERFACECOUNTERS'].fields_by_name['out_octets']._serialized_options = b'\340A\003'
  _globals['_NETINTERFACECOUNTERS'].fields_by_name['out_packets']._loaded_options = None
  _globals['_NETINTERFACECOUNTERS'].fields_by_name['out_packets']._serialized_options = b'\340A\003'
  _globals['_NETINTERFACECOUNTERS'].fields_by_name['out_unicast_pkts']._loaded_options = None
  _globals['_NETINTERFACECOUNTERS'].fields_by_name['out_unicast_pkts']._serialized_options = b'\340A\003'
  _globals['_NETINTERFACECOUNTERS'].fields_by_name['out_broadcast_pkts']._loaded_options = None
  _globals['_NETINTERFACECOUNTERS'].fields_by_name['out_broadcast_pkts']._serialized_options = b'\340A\003'
  _globals['_NETINTERFACECOUNTERS'].fields_by_name['out_multicast_pkts']._loaded_options = None
  _globals['_NETINTERFACECOUNTERS'].fields_by_name['out_multicast_pkts']._serialized_options = b'\340A\003'
  _globals['_NETINTERFACECOUNTERS'].fields_by_name['out_discards']._loaded_options = None
  _globals['_NETINTERFACECOUNTERS'].fields_by_name['out_discards']._serialized_options = b'\340A\003'
  _globals['_NETINTERFACECOUNTERS'].fields_by_name['out_errors']._loaded_options = None
  _globals['_NETINTERFACECOUNTERS'].fields_by_name['out_errors']._serialized_options = b'\340A\003'
  _globals['_NETINTERFACECOUNTERS'].fields_by_name['carrier_transitions']._loaded_options = None
  _globals['_NETINTERFACECOUNTERS'].fields_by_name['carrier_transitions']._serialized_options = b'\340A\003'
  _globals['_NETINTERFACECOUNTERS'].fields_by_name['last_clear']._loaded_options = None
  _globals['_NETINTERFACECOUNTERS'].fields_by_name['last_clear']._serialized_options = b'\340A\003'
  _globals['_NETINTERFACESTATE'].fields_by_name['name']._loaded_options = None
  _globals['_NETINTERFACESTATE'].fields_by_name['name']._serialized_options = b'\340A\003'
  _globals['_NETINTERFACESTATE'].fields_by_name['type']._loaded_options = None
  _globals['_NETINTERFACESTATE'].fields_by_name['type']._serialized_options = b'\340A\003'
  _globals['_NETINTERFACESTATE'].fields_by_name['mtu']._loaded_options = None
  _globals['_NETINTERFACESTATE'].fields_by_name['mtu']._serialized_options = b'\340A\003'
  _globals['_NETINTERFACESTATE'].fields_by_name['loopback_mode']._loaded_options = None
  _globals['_NETINTERFACESTATE'].fields_by_name['loopback_mode']._serialized_options = b'\340A\003'
  _globals['_NETINTERFACESTATE'].fields_by_name['description']._loaded_options = None
  _globals['_NETINTERFACESTATE'].fields_by_name['description']._serialized_options = b'\340A\003'
  _globals['_NETINTERFACESTATE'].fields_by_name['enabled']._loaded_options = None
  _globals['_NETINTERFACESTATE'].fields_by_name['enabled']._serialized_options = b'\340A\003'
  _globals['_NETINTERFACESTATE'].fields_by_name['ifindex']._loaded_options = None
  _globals['_NETINTERFACESTATE'].fields_by_name['ifindex']._serialized_options = b'\340A\003'
  _globals['_NETINTERFACESTATE'].fields_by_name['admin_state']._loaded_options = None
  _globals['_NETINTERFACESTATE'].fields_by_name['admin_state']._serialized_options = b'\340A\003'
  _globals['_NETINTERFACESTATE'].fields_by_name['oper_state']._loaded_options = None
  _globals['_NETINTERFACESTATE'].fields_by_name['oper_state']._serialized_options = b'\340A\003'
  _globals['_NETINTERFACESTATE'].fields_by_name['last_change']._loaded_options = None
  _globals['_NETINTERFACESTATE'].fields_by_name['last_change']._serialized_options = b'\340A\003'
  _globals['_NETINTERFACESTATE'].fields_by_name['logical']._loaded_options = None
  _globals['_NETINTERFACESTATE'].fields_by_name['logical']._serialized_options = b'\340A\003'
  _globals['_NETINTERFACESTATE'].fields_by_name['management']._loaded_options = None
  _globals['_NETINTERFACESTATE'].fields_by_name['management']._serialized_options = b'\340A\003'
  _globals['_NETINTERFACESTATE'].fields_by_name['cpu']._loaded_options = None
  _globals['_NETINTERFACESTATE'].fields_by_name['cpu']._serialized_options = b'\340A\003'
  _globals['_NETINTERFACESTATE'].fields_by_name['counters']._loaded_options = None
  _globals['_NETINTERFACESTATE'].fields_by_name['counters']._serialized_options = b'\340A\003'
  _globals['_NETINTERFACESTATE'].fields_by_name['tpid']._loaded_options = None
  _globals['_NETINTERFACESTATE'].fields_by_name['tpid']._serialized_options = b'\340A\003'
  _globals['_NETINTERFACE_HOLDTIME_HOLDCONFIG'].fields_by_name['up']._loaded_options = None
  _globals['_NETINTERFACE_HOLDTIME_HOLDCONFIG'].fields_by_name['up']._serialized_options = b'\340A\001'
  _globals['_NETINTERFACE_HOLDTIME_HOLDCONFIG'].fields_by_name['down']._loaded_options = None
  _globals['_NETINTERFACE_HOLDTIME_HOLDCONFIG'].fields_by_name['down']._serialized_options = b'\340A\001'
  _globals['_NETINTERFACE_HOLDTIME_HOLDSTATE'].fields_by_name['up']._loaded_options = None
  _globals['_NETINTERFACE_HOLDTIME_HOLDSTATE'].fields_by_name['up']._serialized_options = b'\340A\003'
  _globals['_NETINTERFACE_HOLDTIME_HOLDSTATE'].fields_by_name['down']._loaded_options = None
  _globals['_NETINTERFACE_HOLDTIME_HOLDSTATE'].fields_by_name['down']._serialized_options = b'\340A\003'
  _globals['_NETINTERFACE_HOLDTIME'].fields_by_name['hold_config']._loaded_options = None
  _globals['_NETINTERFACE_HOLDTIME'].fields_by_name['hold_config']._serialized_options = b'\340A\001'
  _globals['_NETINTERFACE_HOLDTIME'].fields_by_name['hold_state']._loaded_options = None
  _globals['_NETINTERFACE_HOLDTIME'].fields_by_name['hold_state']._serialized_options = b'\340A\003'
  _globals['_NETINTERFACE_SUBINTERFACES_SUBINTERFACE_SUBIFCONFIG'].fields_by_name['index']._loaded_options = None
  _globals['_NETINTERFACE_SUBINTERFACES_SUBINTERFACE_SUBIFCONFIG'].fields_by_name['index']._serialized_options = b'\340A\001'
  _globals['_NETINTERFACE_SUBINTERFACES_SUBINTERFACE_SUBIFCONFIG'].fields_by_name['description']._loaded_options = None
  _globals['_NETINTERFACE_SUBINTERFACES_SUBINTERFACE_SUBIFCONFIG'].fields_by_name['description']._serialized_options = b'\340A\001'
  _globals['_NETINTERFACE_SUBINTERFACES_SUBINTERFACE_SUBIFCONFIG'].fields_by_name['enabled']._loaded_options = None
  _globals['_NETINTERFACE_SUBINTERFACES_SUBINTERFACE_SUBIFCONFIG'].fields_by_name['enabled']._serialized_options = b'\340A\001'
  _globals['_NETINTERFACE_SUBINTERFACES_SUBINTERFACE'].fields_by_name['index']._loaded_options = None
  _globals['_NETINTERFACE_SUBINTERFACES_SUBINTERFACE'].fields_by_name['index']._serialized_options = b'\340A\001'
  _globals['_NETINTERFACE_SUBINTERFACES_SUBINTERFACE'].fields_by_name['subif_config']._loaded_options = None
  _globals['_NETINTERFACE_SUBINTERFACES_SUBINTERFACE'].fields_by_name['subif_config']._serialized_options = b'\340A\001'
  _globals['_NETINTERFACE_SUBINTERFACES_SUBINTERFACE'].fields_by_name['state']._loaded_options = None
  _globals['_NETINTERFACE_SUBINTERFACES_SUBINTERFACE'].fields_by_name['state']._serialized_options = b'\340A\003'
  _globals['_NETINTERFACE_SUBINTERFACES_SUBINTERFACE'].fields_by_name['vlan']._loaded_options = None
  _globals['_NETINTERFACE_SUBINTERFACES_SUBINTERFACE'].fields_by_name['vlan']._serialized_options = b'\340A\001'
  _globals['_NETINTERFACE_SUBINTERFACES'].fields_by_name['subinterface']._loaded_options = None
  _globals['_NETINTERFACE_SUBINTERFACES'].fields_by_name['subinterface']._serialized_options = b'\340A\001'
  _globals['_NETINTERFACE'].fields_by_name['name']._loaded_options = None
  _globals['_NETINTERFACE'].fields_by_name['name']._serialized_options = b'\340A\010'
  _globals['_NETINTERFACE'].fields_by_name['config']._loaded_options = None
  _globals['_NETINTERFACE'].fields_by_name['config']._serialized_options = b'\340A\002'
  _globals['_NETINTERFACE'].fields_by_name['state']._loaded_options = None
  _globals['_NETINTERFACE'].fields_by_name['state']._serialized_options = b'\340A\003'
  _globals['_NETINTERFACE'].fields_by_name['holdtime']._loaded_options = None
  _globals['_NETINTERFACE'].fields_by_name['holdtime']._serialized_options = b'\340A\001'
  _globals['_NETINTERFACE'].fields_by_name['subinterfaces']._loaded_options = None
  _globals['_NETINTERFACE'].fields_by_name['subinterfaces']._serialized_options = b'\340A\001'
  _globals['_NETINTERFACE'].fields_by_name['ethernet']._loaded_options = None
  _globals['_NETINTERFACE'].fields_by_name['ethernet']._serialized_options = b'\340A\001'
  _globals['_NETINTERFACE']._loaded_options = None
  _globals['_NETINTERFACE']._serialized_options = b'\352Ak\n2opi_api.network.opinetcommon.v1alpha1/NetInterface\022\030netInterface/{interface}*\rnetInterfaces2\014netInterface'
  _globals['_GETNETINTERFACEREQUEST'].fields_by_name['name']._loaded_options = None
  _globals['_GETNETINTERFACEREQUEST'].fields_by_name['name']._serialized_options = b'\340A\002\372A\037\n\035opi_api.network.v1/Interfaces'
  _globals['_LISTNETINTERFACESREQUEST'].fields_by_name['parent']._loaded_options = None
  _globals['_LISTNETINTERFACESREQUEST'].fields_by_name['parent']._serialized_options = b'\340A\002\372A\037\n\035opi_api.network.v1/Interfaces'
  _globals['_LISTNETINTERFACESREQUEST'].fields_by_name['page_size']._loaded_options = None
  _globals['_LISTNETINTERFACESREQUEST'].fields_by_name['page_size']._serialized_options = b'\340A\001'
  _globals['_LISTNETINTERFACESREQUEST'].fields_by_name['page_token']._loaded_options = None
  _globals['_LISTNETINTERFACESREQUEST'].fields_by_name['page_token']._serialized_options = b'\340A\001'
  _globals['_UPDATENETINTERFACEREQUEST'].fields_by_name['net_interface']._loaded_options = None
  _globals['_UPDATENETINTERFACEREQUEST'].fields_by_name['net_interface']._serialized_options = b'\340A\002'
  _globals['_UPDATENETINTERFACEREQUEST'].fields_by_name['update_mask']._loaded_options = None
  _globals['_UPDATENETINTERFACEREQUEST'].fields_by_name['update_mask']._serialized_options = b'\340A\001'
  _globals['_UPDATENETINTERFACEREQUEST'].fields_by_name['allow_missing']._loaded_options = None
  _globals['_UPDATENETINTERFACEREQUEST'].fields_by_name['allow_missing']._serialized_options = b'\340A\001'
  _globals['_NETINTERFACESERVICE'].methods_by_name['GetNetInterface']._loaded_options = None
  _globals['_NETINTERFACESERVICE'].methods_by_name['GetNetInterface']._serialized_options = b'\332A\004name\202\323\344\223\002%\022#/v1/{name=interfaces/*/interface/*}'
  _globals['_NETINTERFACESERVICE'].methods_by_name['ListNetInterfaces']._loaded_options = None
  _globals['_NETINTERFACESERVICE'].methods_by_name['ListNetInterfaces']._serialized_options = b'\332A\006parent\202\323\344\223\002\031\022\027/v1/{parent=interfaces}'
  _globals['_NETINTERFACESERVICE'].methods_by_name['UpdateNetInterface']._loaded_options = None
  _globals['_NETINTERFACESERVICE'].methods_by_name['UpdateNetInterface']._serialized_options = b'\332A\031net_interface,update_mask\202\323\344\223\002B21/v1/{net_interface.name=interfaces/*/interface/*}:\rnet_interface'
  _globals['_INTERFACETYPE']._serialized_start=4453
  _globals['_INTERFACETYPE']._serialized_end=4558
  _globals['_OPERSTATE']._serialized_start=4561
  _globals['_OPERSTATE']._serialized_end=4773
  _globals['_NETINTERFACECONFIG']._serialized_start=362
  _globals['_NETINTERFACECONFIG']._serialized_end=696
  _globals['_NETINTERFACECOUNTERS']._serialized_start=699
  _globals['_NETINTERFACECOUNTERS']._serialized_end=1485
  _globals['_NETINTERFACESTATE']._serialized_start=1488
  _globals['_NETINTERFACESTATE']._serialized_end=2250
  _globals['_NETINTERFACE']._serialized_start=2253
  _globals['_NETINTERFACE']._serialized_end=3809
  _globals['_NETINTERFACE_HOLDTIME']._serialized_start=2764
  _globals['_NETINTERFACE_HOLDTIME']._serialized_end=3112
  _globals['_NETINTERFACE_HOLDTIME_HOLDCONFIG']._serialized_start=2995
  _globals['_NETINTERFACE_HOLDTIME_HOLDCONFIG']._serialized_end=3053
  _globals['_NETINTERFACE_HOLDTIME_HOLDSTATE']._serialized_start=3055
  _globals['_NETINTERFACE_HOLDTIME_HOLDSTATE']._serialized_end=3112
  _globals['_NETINTERFACE_SUBINTERFACES']._serialized_start=3115
  _globals['_NETINTERFACE_SUBINTERFACES']._serialized_end=3697
  _globals['_NETINTERFACE_SUBINTERFACES_SUBINTERFACE']._serialized_start=3254
  _globals['_NETINTERFACE_SUBINTERFACES_SUBINTERFACE']._serialized_end=3697
  _globals['_NETINTERFACE_SUBINTERFACES_SUBINTERFACE_SUBIFCONFIG']._serialized_start=3587
  _globals['_NETINTERFACE_SUBINTERFACES_SUBINTERFACE_SUBIFCONFIG']._serialized_end=3697
  _globals['_GETNETINTERFACEREQUEST']._serialized_start=3811
  _globals['_GETNETINTERFACEREQUEST']._serialized_end=3894
  _globals['_LISTNETINTERFACESREQUEST']._serialized_start=3897
  _globals['_LISTNETINTERFACESREQUEST']._serialized_end=4056
  _globals['_LISTNETINTERFACESRESPONSE']._serialized_start=4059
  _globals['_LISTNETINTERFACESRESPONSE']._serialized_end=4218
  _globals['_UPDATENETINTERFACEREQUEST']._serialized_start=4221
  _globals['_UPDATENETINTERFACEREQUEST']._serialized_end=4451
  _globals['_NETINTERFACESERVICE']._serialized_start=4776
  _globals['_NETINTERFACESERVICE']._serialized_end=5424
# @@protoc_insertion_point(module_scope)
