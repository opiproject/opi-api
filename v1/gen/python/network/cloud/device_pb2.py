# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# NO CHECKED-IN PROTOBUF GENCODE
# source: network/cloud/device.proto
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
    'network/cloud/device.proto'
)
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from network.opinetcommon import networktypes_pb2 as network_dot_opinetcommon_dot_networktypes__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1anetwork/cloud/device.proto\x12\x1eopi_api.network.cloud.v1alpha1\x1a\x19google/api/resource.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\'network/opinetcommon/networktypes.proto\"\x88\x02\n\x12\x44\x65viceCapabilities\x12q\n\x13routing_capabilties\x18\x01 \x01(\x0b\x32@.opi_api.network.cloud.v1alpha1.DeviceCapabilitiesDynamicRoutingR\x12routingCapabilties\x12\x7f\n\x1bnetwork_policy_capabilities\x18\x02 \x01(\x0b\x32?.opi_api.network.cloud.v1alpha1.DeviceCapabilitiesNetworkPolicyR\x19networkPolicyCapabilities\"E\n DeviceCapabilitiesDynamicRouting\x12!\n\x0cunderlay_bgp\x18\x01 \x01(\x08R\x0bunderlayBgp\"F\n\x1f\x44\x65viceCapabilitiesNetworkPolicy\x12#\n\rcompact_rules\x18\x01 \x01(\x08R\x0c\x63ompactRules\"\xe0\x01\n\x06\x44\x65vice\x12\x12\n\x04name\x18\x01 \x01(\tR\x04name\x12>\n\x04spec\x18\x02 \x01(\x0b\x32*.opi_api.network.cloud.v1alpha1.DeviceSpecR\x04spec\x12\x44\n\x06status\x18\x03 \x01(\x0b\x32,.opi_api.network.cloud.v1alpha1.DeviceStatusR\x06status:<\xea\x41\x39\n%opi_api.network.cloud.v1alpha1/device\x12\x10\x64\x65vices/{device}\"\xb1\x04\n\nDeviceSpec\x12S\n\x0cipv4_address\x18\x01 \x01(\x0b\x32\x30.opi_api.network.opinetcommon.v1alpha1.IPAddressR\x0bipv4Address\x12S\n\x0cipv6_address\x18\x02 \x01(\x0b\x32\x30.opi_api.network.opinetcommon.v1alpha1.IPAddressR\x0bipv6Address\x12\x19\n\x08mac_addr\x18\x03 \x01(\x0cR\x07macAddr\x12O\n\ngateway_ip\x18\x04 \x01(\x0b\x32\x30.opi_api.network.opinetcommon.v1alpha1.IPAddressR\tgatewayIp\x12X\n\x0epcie_functions\x18\x05 \x01(\x0b\x32\x31.opi_api.network.cloud.v1alpha1.PCIeFunctionsSpecR\rpcieFunctions\x12\x36\n\x17overlay_routing_enabled\x18\x06 \x01(\x08R\x15overlayRoutingEnabled\x12\x1e\n\nsystemname\x18\x07 \x01(\tR\nsystemname\x12[\n\x11mgmt_network_spec\x18\x08 \x01(\x0b\x32/.opi_api.network.cloud.v1alpha1.MgmtNetworkSpecR\x0fmgmtNetworkSpec\"I\n\x11PCIeFunctionsSpec\x12\x19\n\x08pf_count\x18\x01 \x01(\x05R\x07pfCount\x12\x19\n\x08vf_count\x18\x02 \x01(\x05R\x07vfCount\"\xb6\x02\n\x0fMgmtNetworkSpec\x12R\n\x0clldp_mgmt_ip\x18\x01 \x01(\x0b\x32\x30.opi_api.network.opinetcommon.v1alpha1.IPAddressR\nlldpMgmtIp\x12I\n\x07mgmt_ip\x18\x02 \x01(\x0b\x32\x30.opi_api.network.opinetcommon.v1alpha1.IPAddressR\x06mgmtIp\x12\x12\n\x04vlan\x18\x03 \x01(\x05R\x04vlan\x12O\n\ngateway_ip\x18\x04 \x01(\x0b\x32\x30.opi_api.network.opinetcommon.v1alpha1.IPAddressR\tgatewayIp\x12\x1f\n\x0bgateway_mac\x18\x05 \x01(\x0cR\ngatewayMac\"\xd9\x03\n\x0c\x44\x65viceStatus\x12 \n\x0b\x64\x65scription\x18\x01 \x01(\tR\x0b\x64\x65scription\x12,\n\x12system_mac_address\x18\x02 \x01(\x0cR\x10systemMacAddress\x12\x1b\n\tvendor_id\x18\x03 \x01(\tR\x08vendorId\x12\x1b\n\tchip_type\x18\x04 \x01(\tR\x08\x63hipType\x12\x1d\n\nos_version\x18\x05 \x01(\tR\tosVersion\x12&\n\x0fpcie_port_count\x18\x06 \x01(\x05R\rpciePortCount\x12\x1d\n\nport_count\x18\x07 \x01(\x05R\tportCount\x12\"\n\rhost_if_count\x18\x08 \x01(\x05R\x0bhostIfCount\x12\x1a\n\x08pipeline\x18\t \x01(\tR\x08pipeline\x12T\n\x0f\x63ritical_events\x18\n \x03(\x0b\x32+.opi_api.network.cloud.v1alpha1.SystemEventR\x0e\x63riticalEvents\x12\x43\n\x06\x61lerts\x18\x0b \x03(\x0b\x32+.opi_api.network.cloud.v1alpha1.SystemAlertR\x06\x61lerts\"u\n\x0bSystemEvent\x12\x39\n\nevent_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.TimestampR\teventTime\x12+\n\x11\x65vent_description\x18\x02 \x01(\tR\x10\x65ventDescription\"u\n\x0bSystemAlert\x12\x39\n\nalert_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.TimestampR\talertTime\x12+\n\x11\x61lert_description\x18\x02 \x01(\tR\x10\x61lertDescriptionBl\n\x1eopi_api.network.cloud.v1alpha1B\x0b\x44\x65viceProtoP\x01Z;github.com/opiproject/opi-api/network/cloud/v1alpha1/gen/gob\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'network.cloud.device_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\036opi_api.network.cloud.v1alpha1B\013DeviceProtoP\001Z;github.com/opiproject/opi-api/network/cloud/v1alpha1/gen/go'
  _globals['_DEVICE']._loaded_options = None
  _globals['_DEVICE']._serialized_options = b'\352A9\n%opi_api.network.cloud.v1alpha1/device\022\020devices/{device}'
  _globals['_DEVICECAPABILITIES']._serialized_start=164
  _globals['_DEVICECAPABILITIES']._serialized_end=428
  _globals['_DEVICECAPABILITIESDYNAMICROUTING']._serialized_start=430
  _globals['_DEVICECAPABILITIESDYNAMICROUTING']._serialized_end=499
  _globals['_DEVICECAPABILITIESNETWORKPOLICY']._serialized_start=501
  _globals['_DEVICECAPABILITIESNETWORKPOLICY']._serialized_end=571
  _globals['_DEVICE']._serialized_start=574
  _globals['_DEVICE']._serialized_end=798
  _globals['_DEVICESPEC']._serialized_start=801
  _globals['_DEVICESPEC']._serialized_end=1362
  _globals['_PCIEFUNCTIONSSPEC']._serialized_start=1364
  _globals['_PCIEFUNCTIONSSPEC']._serialized_end=1437
  _globals['_MGMTNETWORKSPEC']._serialized_start=1440
  _globals['_MGMTNETWORKSPEC']._serialized_end=1750
  _globals['_DEVICESTATUS']._serialized_start=1753
  _globals['_DEVICESTATUS']._serialized_end=2226
  _globals['_SYSTEMEVENT']._serialized_start=2228
  _globals['_SYSTEMEVENT']._serialized_end=2345
  _globals['_SYSTEMALERT']._serialized_start=2347
  _globals['_SYSTEMALERT']._serialized_end=2464
# @@protoc_insertion_point(module_scope)
