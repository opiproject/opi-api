# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: openconfig_interfaces.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


import networktypes_pb2 as networktypes__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1bopenconfig_interfaces.proto\x12\x18opi_api.network.v1alpha1\x1a\x12networktypes.proto\x1a\x17google/api/client.proto\x1a\x19google/api/resource.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a google/protobuf/field_mask.proto\"\x97\x01\n\x06\x43onfig\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x35\n\x04type\x18\x02 \x01(\x0e\x32\'.opi_api.network.v1alpha1.InterfaceType\x12\x0b\n\x03mtu\x18\x03 \x01(\r\x12\x15\n\rloopback_mode\x18\x04 \x01(\x08\x12\x13\n\x0b\x64\x65scription\x18\x05 \x01(\t\x12\x0f\n\x07\x65nabled\x18\x06 \x01(\x08\"\xb0\x03\n\x08\x43ounters\x12\x11\n\trx_octets\x18\x01 \x01(\x04\x12\x12\n\nrx_packets\x18\x02 \x01(\x04\x12\x17\n\x0frx_unicast_pkts\x18\x03 \x01(\x04\x12\x19\n\x11rx_broadcast_pkts\x18\x04 \x01(\x04\x12\x19\n\x11rx_multicast_pkts\x18\x05 \x01(\x04\x12\x13\n\x0brx_discards\x18\x06 \x01(\x04\x12\x11\n\trx_errors\x18\x07 \x01(\x04\x12\x19\n\x11rx_unknown_protos\x18\x08 \x01(\x04\x12\x15\n\rrx_fcs_errors\x18\t \x01(\x04\x12\x12\n\nout_octets\x18\n \x01(\x04\x12\x13\n\x0bout_packets\x18\x0b \x01(\x04\x12\x18\n\x10out_unicast_pkts\x18\x0c \x01(\x04\x12\x1a\n\x12out_broadcast_pkts\x18\r \x01(\x04\x12\x1a\n\x12out_multicast_pkts\x18\x0e \x01(\x04\x12\x14\n\x0cout_discards\x18\x0f \x01(\x04\x12\x12\n\nout_errors\x18\x10 \x01(\x04\x12\x1b\n\x13\x63\x61rrier_transitions\x18\x11 \x01(\x04\x12\x12\n\nlast_clear\x18\x12 \x01(\x04\"\xa5\x03\n\x05State\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x35\n\x04type\x18\x02 \x01(\x0e\x32\'.opi_api.network.v1alpha1.InterfaceType\x12\x0b\n\x03mtu\x18\x03 \x01(\r\x12\x15\n\rloopback_mode\x18\x04 \x01(\x08\x12\x13\n\x0b\x64\x65scription\x18\x05 \x01(\t\x12\x0f\n\x07\x65nabled\x18\x06 \x01(\x08\x12\x0f\n\x07ifindex\x18\x07 \x01(\r\x12\x46\n\x0b\x61\x64min_state\x18\x08 \x01(\x0e\x32\x31.opi_api.network.opinetcommon.v1alpha1.AdminState\x12\x37\n\noper_state\x18\t \x01(\x0e\x32#.opi_api.network.v1alpha1.OperState\x12\x13\n\x0blast_change\x18\n \x01(\x04\x12\x0f\n\x07logical\x18\x0b \x01(\x08\x12\x12\n\nmanagement\x18\x0c \x01(\x08\x12\x0b\n\x03\x63pu\x18\r \x01(\x08\x12\x34\n\x08\x63ounters\x18\x0e \x01(\x0b\x32\".opi_api.network.v1alpha1.Counters\"\xee\x06\n\x0cNetInterface\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x30\n\x06\x63onfig\x18\x02 \x01(\x0b\x32 .opi_api.network.v1alpha1.Config\x12.\n\x05state\x18\x03 \x01(\x0b\x32\x1f.opi_api.network.v1alpha1.State\x12\x41\n\x08holdtime\x18\x04 \x01(\x0b\x32/.opi_api.network.v1alpha1.NetInterface.HoldTime\x12K\n\rsubinterfaces\x18\x05 \x01(\x0b\x32\x34.opi_api.network.v1alpha1.NetInterface.Subinterfaces\x1a\xf9\x01\n\x08HoldTime\x12O\n\x0bhold_config\x18\x01 \x01(\x0b\x32:.opi_api.network.v1alpha1.NetInterface.HoldTime.HoldConfig\x12M\n\nhold_state\x18\x02 \x01(\x0b\x32\x39.opi_api.network.v1alpha1.NetInterface.HoldTime.HoldState\x1a&\n\nHoldConfig\x12\n\n\x02up\x18\x01 \x01(\r\x12\x0c\n\x04\x64own\x18\x02 \x01(\r\x1a%\n\tHoldState\x12\n\n\x02up\x18\x01 \x01(\r\x12\x0c\n\x04\x64own\x18\x02 \x01(\r\x1a\xe1\x02\n\rSubinterfaces\x12W\n\x0csubinterface\x18\x02 \x03(\x0b\x32\x41.opi_api.network.v1alpha1.NetInterface.Subinterfaces.Subinterface\x1a\xf6\x01\n\x0cSubinterface\x12\r\n\x05index\x18\x01 \x01(\x03\x12\x63\n\x0csubif_config\x18\x02 \x01(\x0b\x32M.opi_api.network.v1alpha1.NetInterface.Subinterfaces.Subinterface.SubifConfig\x12.\n\x05state\x18\x03 \x01(\x0b\x32\x1f.opi_api.network.v1alpha1.State\x1a\x42\n\x0bSubifConfig\x12\r\n\x05index\x18\x01 \x01(\x04\x12\x13\n\x0b\x64\x65scription\x18\x02 \x01(\t\x12\x0f\n\x07\x65nabled\x18\x03 \x01(\x08\"M\n\x16GetNetInterfaceRequest\x12\x33\n\x04name\x18\x01 \x01(\tB%\xe0\x41\x02\xfa\x41\x1f\n\x1dopi_api.network.v1/Interfaces\"x\n\x18ListNetInterfacesRequest\x12\x35\n\x06parent\x18\x01 \x01(\tB%\xe0\x41\x02\xfa\x41\x1f\n\x1dopi_api.network.v1/Interfaces\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\"t\n\x19ListNetInterfacesResponse\x12>\n\x0enet_interfaces\x18\x01 \x03(\x0b\x32&.opi_api.network.v1alpha1.NetInterface\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"\x8b\x01\n\x19UpdateNetInterfaceRequest\x12=\n\rnet_interface\x18\x01 \x01(\x0b\x32&.opi_api.network.v1alpha1.NetInterface\x12/\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask*K\n\rInterfaceType\x12\x1e\n\x1aINTERFACE_TYPE_UNSPECIFIED\x10\x00\x12\x0c\n\x08\x45THERNET\x10\x01\x12\x0c\n\x08LOOPBACK\x10\x02*\xd4\x01\n\tOperState\x12\x1a\n\x16OPER_STATE_UNSPECIFIED\x10\x00\x12\x11\n\rOPER_STATE_UP\x10\x02\x12\x13\n\x0fOPER_STATE_DOWN\x10\x03\x12\x16\n\x12OPER_STATE_TESTING\x10\x04\x12\x16\n\x12OPER_STATE_UNKNOWN\x10\x05\x12\x16\n\x12OPER_STATE_DORMANT\x10\x06\x12\x1a\n\x16OPER_STATE_NOT_PRESENT\x10\x07\x12\x1f\n\x1bOPER_STATE_LOWER_LAYER_DOWN\x10\x08\x32\xba\x04\n\x13NetInterfaceService\x12\x9f\x01\n\x0fGetNetInterface\x12\x30.opi_api.network.v1alpha1.GetNetInterfaceRequest\x1a&.opi_api.network.v1alpha1.NetInterface\"2\x82\xd3\xe4\x93\x02%\x12#/v1/{name=interfaces/*/interface/*}\xda\x41\x04name\x12\xa6\x01\n\x11ListNetInterfaces\x12\x32.opi_api.network.v1alpha1.ListNetInterfacesRequest\x1a\x33.opi_api.network.v1alpha1.ListNetInterfacesResponse\"(\x82\xd3\xe4\x93\x02\x19\x12\x17/v1/{parent=interfaces}\xda\x41\x06parent\x12\xd7\x01\n\x12UpdateNetInterface\x12\x33.opi_api.network.v1alpha1.UpdateNetInterfaceRequest\x1a&.opi_api.network.v1alpha1.NetInterface\"d\x82\xd3\xe4\x93\x02\x42\x32\x31/v1/{net_interface.name=interfaces/*/interface/*}:\rnet_interface\xda\x41\x19net_interface,update_maskBn\n\x18opi_api.network.v1alpha1B\x19OpenconfigInterfacesProtoP\x01Z5github.com/opiproject/opi-api/network/v1alpha1/gen/gob\x06proto3')

_INTERFACETYPE = DESCRIPTOR.enum_types_by_name['InterfaceType']
InterfaceType = enum_type_wrapper.EnumTypeWrapper(_INTERFACETYPE)
_OPERSTATE = DESCRIPTOR.enum_types_by_name['OperState']
OperState = enum_type_wrapper.EnumTypeWrapper(_OPERSTATE)
INTERFACE_TYPE_UNSPECIFIED = 0
ETHERNET = 1
LOOPBACK = 2
OPER_STATE_UNSPECIFIED = 0
OPER_STATE_UP = 2
OPER_STATE_DOWN = 3
OPER_STATE_TESTING = 4
OPER_STATE_UNKNOWN = 5
OPER_STATE_DORMANT = 6
OPER_STATE_NOT_PRESENT = 7
OPER_STATE_LOWER_LAYER_DOWN = 8


_CONFIG = DESCRIPTOR.message_types_by_name['Config']
_COUNTERS = DESCRIPTOR.message_types_by_name['Counters']
_STATE = DESCRIPTOR.message_types_by_name['State']
_NETINTERFACE = DESCRIPTOR.message_types_by_name['NetInterface']
_NETINTERFACE_HOLDTIME = _NETINTERFACE.nested_types_by_name['HoldTime']
_NETINTERFACE_HOLDTIME_HOLDCONFIG = _NETINTERFACE_HOLDTIME.nested_types_by_name['HoldConfig']
_NETINTERFACE_HOLDTIME_HOLDSTATE = _NETINTERFACE_HOLDTIME.nested_types_by_name['HoldState']
_NETINTERFACE_SUBINTERFACES = _NETINTERFACE.nested_types_by_name['Subinterfaces']
_NETINTERFACE_SUBINTERFACES_SUBINTERFACE = _NETINTERFACE_SUBINTERFACES.nested_types_by_name['Subinterface']
_NETINTERFACE_SUBINTERFACES_SUBINTERFACE_SUBIFCONFIG = _NETINTERFACE_SUBINTERFACES_SUBINTERFACE.nested_types_by_name['SubifConfig']
_GETNETINTERFACEREQUEST = DESCRIPTOR.message_types_by_name['GetNetInterfaceRequest']
_LISTNETINTERFACESREQUEST = DESCRIPTOR.message_types_by_name['ListNetInterfacesRequest']
_LISTNETINTERFACESRESPONSE = DESCRIPTOR.message_types_by_name['ListNetInterfacesResponse']
_UPDATENETINTERFACEREQUEST = DESCRIPTOR.message_types_by_name['UpdateNetInterfaceRequest']
Config = _reflection.GeneratedProtocolMessageType('Config', (_message.Message,), {
  'DESCRIPTOR' : _CONFIG,
  '__module__' : 'openconfig_interfaces_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.v1alpha1.Config)
  })
_sym_db.RegisterMessage(Config)

Counters = _reflection.GeneratedProtocolMessageType('Counters', (_message.Message,), {
  'DESCRIPTOR' : _COUNTERS,
  '__module__' : 'openconfig_interfaces_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.v1alpha1.Counters)
  })
_sym_db.RegisterMessage(Counters)

State = _reflection.GeneratedProtocolMessageType('State', (_message.Message,), {
  'DESCRIPTOR' : _STATE,
  '__module__' : 'openconfig_interfaces_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.v1alpha1.State)
  })
_sym_db.RegisterMessage(State)

NetInterface = _reflection.GeneratedProtocolMessageType('NetInterface', (_message.Message,), {

  'HoldTime' : _reflection.GeneratedProtocolMessageType('HoldTime', (_message.Message,), {

    'HoldConfig' : _reflection.GeneratedProtocolMessageType('HoldConfig', (_message.Message,), {
      'DESCRIPTOR' : _NETINTERFACE_HOLDTIME_HOLDCONFIG,
      '__module__' : 'openconfig_interfaces_pb2'
      # @@protoc_insertion_point(class_scope:opi_api.network.v1alpha1.NetInterface.HoldTime.HoldConfig)
      })
    ,

    'HoldState' : _reflection.GeneratedProtocolMessageType('HoldState', (_message.Message,), {
      'DESCRIPTOR' : _NETINTERFACE_HOLDTIME_HOLDSTATE,
      '__module__' : 'openconfig_interfaces_pb2'
      # @@protoc_insertion_point(class_scope:opi_api.network.v1alpha1.NetInterface.HoldTime.HoldState)
      })
    ,
    'DESCRIPTOR' : _NETINTERFACE_HOLDTIME,
    '__module__' : 'openconfig_interfaces_pb2'
    # @@protoc_insertion_point(class_scope:opi_api.network.v1alpha1.NetInterface.HoldTime)
    })
  ,

  'Subinterfaces' : _reflection.GeneratedProtocolMessageType('Subinterfaces', (_message.Message,), {

    'Subinterface' : _reflection.GeneratedProtocolMessageType('Subinterface', (_message.Message,), {

      'SubifConfig' : _reflection.GeneratedProtocolMessageType('SubifConfig', (_message.Message,), {
        'DESCRIPTOR' : _NETINTERFACE_SUBINTERFACES_SUBINTERFACE_SUBIFCONFIG,
        '__module__' : 'openconfig_interfaces_pb2'
        # @@protoc_insertion_point(class_scope:opi_api.network.v1alpha1.NetInterface.Subinterfaces.Subinterface.SubifConfig)
        })
      ,
      'DESCRIPTOR' : _NETINTERFACE_SUBINTERFACES_SUBINTERFACE,
      '__module__' : 'openconfig_interfaces_pb2'
      # @@protoc_insertion_point(class_scope:opi_api.network.v1alpha1.NetInterface.Subinterfaces.Subinterface)
      })
    ,
    'DESCRIPTOR' : _NETINTERFACE_SUBINTERFACES,
    '__module__' : 'openconfig_interfaces_pb2'
    # @@protoc_insertion_point(class_scope:opi_api.network.v1alpha1.NetInterface.Subinterfaces)
    })
  ,
  'DESCRIPTOR' : _NETINTERFACE,
  '__module__' : 'openconfig_interfaces_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.v1alpha1.NetInterface)
  })
_sym_db.RegisterMessage(NetInterface)
_sym_db.RegisterMessage(NetInterface.HoldTime)
_sym_db.RegisterMessage(NetInterface.HoldTime.HoldConfig)
_sym_db.RegisterMessage(NetInterface.HoldTime.HoldState)
_sym_db.RegisterMessage(NetInterface.Subinterfaces)
_sym_db.RegisterMessage(NetInterface.Subinterfaces.Subinterface)
_sym_db.RegisterMessage(NetInterface.Subinterfaces.Subinterface.SubifConfig)

GetNetInterfaceRequest = _reflection.GeneratedProtocolMessageType('GetNetInterfaceRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETNETINTERFACEREQUEST,
  '__module__' : 'openconfig_interfaces_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.v1alpha1.GetNetInterfaceRequest)
  })
_sym_db.RegisterMessage(GetNetInterfaceRequest)

ListNetInterfacesRequest = _reflection.GeneratedProtocolMessageType('ListNetInterfacesRequest', (_message.Message,), {
  'DESCRIPTOR' : _LISTNETINTERFACESREQUEST,
  '__module__' : 'openconfig_interfaces_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.v1alpha1.ListNetInterfacesRequest)
  })
_sym_db.RegisterMessage(ListNetInterfacesRequest)

ListNetInterfacesResponse = _reflection.GeneratedProtocolMessageType('ListNetInterfacesResponse', (_message.Message,), {
  'DESCRIPTOR' : _LISTNETINTERFACESRESPONSE,
  '__module__' : 'openconfig_interfaces_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.v1alpha1.ListNetInterfacesResponse)
  })
_sym_db.RegisterMessage(ListNetInterfacesResponse)

UpdateNetInterfaceRequest = _reflection.GeneratedProtocolMessageType('UpdateNetInterfaceRequest', (_message.Message,), {
  'DESCRIPTOR' : _UPDATENETINTERFACEREQUEST,
  '__module__' : 'openconfig_interfaces_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.v1alpha1.UpdateNetInterfaceRequest)
  })
_sym_db.RegisterMessage(UpdateNetInterfaceRequest)

_NETINTERFACESERVICE = DESCRIPTOR.services_by_name['NetInterfaceService']
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\030opi_api.network.v1alpha1B\031OpenconfigInterfacesProtoP\001Z5github.com/opiproject/opi-api/network/v1alpha1/gen/go'
  _GETNETINTERFACEREQUEST.fields_by_name['name']._options = None
  _GETNETINTERFACEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\037\n\035opi_api.network.v1/Interfaces'
  _LISTNETINTERFACESREQUEST.fields_by_name['parent']._options = None
  _LISTNETINTERFACESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\037\n\035opi_api.network.v1/Interfaces'
  _NETINTERFACESERVICE.methods_by_name['GetNetInterface']._options = None
  _NETINTERFACESERVICE.methods_by_name['GetNetInterface']._serialized_options = b'\202\323\344\223\002%\022#/v1/{name=interfaces/*/interface/*}\332A\004name'
  _NETINTERFACESERVICE.methods_by_name['ListNetInterfaces']._options = None
  _NETINTERFACESERVICE.methods_by_name['ListNetInterfaces']._serialized_options = b'\202\323\344\223\002\031\022\027/v1/{parent=interfaces}\332A\006parent'
  _NETINTERFACESERVICE.methods_by_name['UpdateNetInterface']._options = None
  _NETINTERFACESERVICE.methods_by_name['UpdateNetInterface']._serialized_options = b'\202\323\344\223\002B21/v1/{net_interface.name=interfaces/*/interface/*}:\rnet_interface\332A\031net_interface,update_mask'
  _INTERFACETYPE._serialized_start=2581
  _INTERFACETYPE._serialized_end=2656
  _OPERSTATE._serialized_start=2659
  _OPERSTATE._serialized_end=2871
  _CONFIG._serialized_start=227
  _CONFIG._serialized_end=378
  _COUNTERS._serialized_start=381
  _COUNTERS._serialized_end=813
  _STATE._serialized_start=816
  _STATE._serialized_end=1237
  _NETINTERFACE._serialized_start=1240
  _NETINTERFACE._serialized_end=2118
  _NETINTERFACE_HOLDTIME._serialized_start=1513
  _NETINTERFACE_HOLDTIME._serialized_end=1762
  _NETINTERFACE_HOLDTIME_HOLDCONFIG._serialized_start=1685
  _NETINTERFACE_HOLDTIME_HOLDCONFIG._serialized_end=1723
  _NETINTERFACE_HOLDTIME_HOLDSTATE._serialized_start=1725
  _NETINTERFACE_HOLDTIME_HOLDSTATE._serialized_end=1762
  _NETINTERFACE_SUBINTERFACES._serialized_start=1765
  _NETINTERFACE_SUBINTERFACES._serialized_end=2118
  _NETINTERFACE_SUBINTERFACES_SUBINTERFACE._serialized_start=1872
  _NETINTERFACE_SUBINTERFACES_SUBINTERFACE._serialized_end=2118
  _NETINTERFACE_SUBINTERFACES_SUBINTERFACE_SUBIFCONFIG._serialized_start=2052
  _NETINTERFACE_SUBINTERFACES_SUBINTERFACE_SUBIFCONFIG._serialized_end=2118
  _GETNETINTERFACEREQUEST._serialized_start=2120
  _GETNETINTERFACEREQUEST._serialized_end=2197
  _LISTNETINTERFACESREQUEST._serialized_start=2199
  _LISTNETINTERFACESREQUEST._serialized_end=2319
  _LISTNETINTERFACESRESPONSE._serialized_start=2321
  _LISTNETINTERFACESRESPONSE._serialized_end=2437
  _UPDATENETINTERFACEREQUEST._serialized_start=2440
  _UPDATENETINTERFACEREQUEST._serialized_end=2579
  _NETINTERFACESERVICE._serialized_start=2874
  _NETINTERFACESERVICE._serialized_end=3444
# @@protoc_insertion_point(module_scope)
