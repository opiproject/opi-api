# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: backend_nvme_tcp.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
import object_key_pb2 as object__key__pb2
import opicommon_pb2 as opicommon__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x16\x62\x61\x63kend_nvme_tcp.proto\x12\x12opi_api.storage.v1\x1a\x17google/api/client.proto\x1a\x19google/api/resource.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a google/protobuf/field_mask.proto\x1a\x10object_key.proto\x1a\x0fopicommon.proto\"\xf1\x02\n\x14NVMfRemoteController\x12(\n\x02id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\x35\n\x06trtype\x18\x02 \x01(\x0e\x32%.opi_api.storage.v1.NvmeTransportType\x12\x35\n\x06\x61\x64rfam\x18\x03 \x01(\x0e\x32%.opi_api.storage.v1.NvmeAddressFamily\x12\x0e\n\x06traddr\x18\x04 \x01(\t\x12\x0f\n\x07trsvcid\x18\x05 \x01(\x03\x12\x0e\n\x06subnqn\x18\x06 \x01(\t\x12\r\n\x05hdgst\x18\x07 \x01(\x08\x12\r\n\x05\x64\x64gst\x18\x08 \x01(\x08\x12\x34\n\tmultipath\x18\t \x01(\x0e\x32!.opi_api.storage.v1.NvmeMultipath\x12\x17\n\x0fio_queues_count\x18\n \x01(\x03\x12\x12\n\nqueue_size\x18\x0b \x01(\x03\x12\x0f\n\x07hostnqn\x18\x0c \x01(\t\"\xd8\x01\n!CreateNVMfRemoteControllerRequest\x12?\n\x06parent\x18\x01 \x01(\tB/\xe0\x41\x02\xfa\x41)\n\'opi_api.storage.v1/NVMfRemoteController\x12N\n\x17nv_mf_remote_controller\x18\x02 \x01(\x0b\x32(.opi_api.storage.v1.NVMfRemoteControllerB\x03\xe0\x41\x02\x12\"\n\x1anv_mf_remote_controller_id\x18\x03 \x01(\t\"b\n!DeleteNVMfRemoteControllerRequest\x12=\n\x04name\x18\x01 \x01(\tB/\xe0\x41\x02\xfa\x41)\n\'opi_api.storage.v1/NVMfRemoteController\"\x9f\x01\n!UpdateNVMfRemoteControllerRequest\x12I\n\x17nv_mf_remote_controller\x18\x01 \x01(\x0b\x32(.opi_api.storage.v1.NVMfRemoteController\x12/\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\"\x8a\x01\n ListNVMfRemoteControllersRequest\x12?\n\x06parent\x18\x01 \x01(\tB/\xe0\x41\x02\xfa\x41)\n\'opi_api.storage.v1/NVMfRemoteController\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\"\x88\x01\n!ListNVMfRemoteControllersResponse\x12J\n\x18nv_mf_remote_controllers\x18\x01 \x03(\x0b\x32(.opi_api.storage.v1.NVMfRemoteController\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"_\n\x1eGetNVMfRemoteControllerRequest\x12=\n\x04name\x18\x01 \x01(\tB/\xe0\x41\x02\xfa\x41)\n\'opi_api.storage.v1/NVMfRemoteController\"L\n NVMfRemoteControllerResetRequest\x12(\n\x02id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"L\n NVMfRemoteControllerStatsRequest\x12(\n\x02id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"S\n!NVMfRemoteControllerStatsResponse\x12.\n\x05stats\x18\x01 \x01(\x0b\x32\x1f.opi_api.storage.v1.VolumeStats*\xb4\x01\n\x11NvmeTransportType\x12#\n\x1fNVME_TRANSPORT_TYPE_UNSPECIFIED\x10\x00\x12\x15\n\x11NVME_TRANSPORT_FC\x10\x01\x12\x17\n\x13NVME_TRANSPORT_PCIE\x10\x02\x12\x17\n\x13NVME_TRANSPORT_RDMA\x10\x03\x12\x16\n\x12NVME_TRANSPORT_TCP\x10\x04\x12\x19\n\x15NVME_TRANSPORT_CUSTOM\x10\x05*\xa8\x01\n\x11NvmeAddressFamily\x12#\n\x1fNVME_ADDRESS_FAMILY_UNSPECIFIED\x10\x00\x12\x14\n\x10NVMF_ADRFAM_IPV4\x10\x01\x12\x14\n\x10NVMF_ADRFAM_IPV6\x10\x02\x12\x12\n\x0eNVMF_ADRFAM_IB\x10\x03\x12\x12\n\x0eNVMF_ADRFAM_FC\x10\x04\x12\x1a\n\x16NVMF_ADRFAM_INTRA_HOST\x10\x05*\x86\x01\n\rNvmeMultipath\x12\x1e\n\x1aNVME_MULTIPATH_UNSPECIFIED\x10\x00\x12\x1a\n\x16NVME_MULTIPATH_DISABLE\x10\x01\x12\x1b\n\x17NVME_MULTIPATH_FAILOVER\x10\x02\x12\x1c\n\x18NVME_MULTIPATH_MULTIPATH\x10\x03\x32\x84\n\n\x1bNVMfRemoteControllerService\x12\xf3\x01\n\x1a\x43reateNVMfRemoteController\x12\x35.opi_api.storage.v1.CreateNVMfRemoteControllerRequest\x1a(.opi_api.storage.v1.NVMfRemoteController\"t\x82\xd3\xe4\x93\x02\x32\"\x17/v1/{parent=subsystems}:\x17nv_mf_remote_controller\xda\x41\x39parent,nv_mf_remote_controller,nv_mf_remote_controller_id\x12\x9d\x01\n\x1a\x44\x65leteNVMfRemoteController\x12\x35.opi_api.storage.v1.DeleteNVMfRemoteControllerRequest\x1a\x16.google.protobuf.Empty\"0\x82\xd3\xe4\x93\x02#*!/v1/{name=subsystems}/{subsystem}\xda\x41\x04name\x12\xf3\x01\n\x1aUpdateNVMfRemoteController\x12\x35.opi_api.storage.v1.UpdateNVMfRemoteControllerRequest\x1a(.opi_api.storage.v1.NVMfRemoteController\"t\x82\xd3\xe4\x93\x02H2-/v1/{nv_mf_remote_controller.name=subsystems}:\x17nv_mf_remote_controller\xda\x41#nv_mf_remote_controller,update_mask\x12\xb2\x01\n\x19ListNVMfRemoteControllers\x12\x34.opi_api.storage.v1.ListNVMfRemoteControllersRequest\x1a\x35.opi_api.storage.v1.ListNVMfRemoteControllersResponse\"(\x82\xd3\xe4\x93\x02\x19\x12\x17/v1/{parent=subsystems}\xda\x41\x06parent\x12\xa9\x01\n\x17GetNVMfRemoteController\x12\x32.opi_api.storage.v1.GetNVMfRemoteControllerRequest\x1a(.opi_api.storage.v1.NVMfRemoteController\"0\x82\xd3\xe4\x93\x02#\x12!/v1/{name=subsystems}/{subsystem}\xda\x41\x04name\x12k\n\x19NVMfRemoteControllerReset\x12\x34.opi_api.storage.v1.NVMfRemoteControllerResetRequest\x1a\x16.google.protobuf.Empty\"\x00\x12\x8a\x01\n\x19NVMfRemoteControllerStats\x12\x34.opi_api.storage.v1.NVMfRemoteControllerStatsRequest\x1a\x35.opi_api.storage.v1.NVMfRemoteControllerStatsResponse\"\x00\x42\x62\n\x12opi_api.storage.v1B\x13\x42\x61\x63kendNvmeTcpProtoP\x01Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/gob\x06proto3')

_NVMETRANSPORTTYPE = DESCRIPTOR.enum_types_by_name['NvmeTransportType']
NvmeTransportType = enum_type_wrapper.EnumTypeWrapper(_NVMETRANSPORTTYPE)
_NVMEADDRESSFAMILY = DESCRIPTOR.enum_types_by_name['NvmeAddressFamily']
NvmeAddressFamily = enum_type_wrapper.EnumTypeWrapper(_NVMEADDRESSFAMILY)
_NVMEMULTIPATH = DESCRIPTOR.enum_types_by_name['NvmeMultipath']
NvmeMultipath = enum_type_wrapper.EnumTypeWrapper(_NVMEMULTIPATH)
NVME_TRANSPORT_TYPE_UNSPECIFIED = 0
NVME_TRANSPORT_FC = 1
NVME_TRANSPORT_PCIE = 2
NVME_TRANSPORT_RDMA = 3
NVME_TRANSPORT_TCP = 4
NVME_TRANSPORT_CUSTOM = 5
NVME_ADDRESS_FAMILY_UNSPECIFIED = 0
NVMF_ADRFAM_IPV4 = 1
NVMF_ADRFAM_IPV6 = 2
NVMF_ADRFAM_IB = 3
NVMF_ADRFAM_FC = 4
NVMF_ADRFAM_INTRA_HOST = 5
NVME_MULTIPATH_UNSPECIFIED = 0
NVME_MULTIPATH_DISABLE = 1
NVME_MULTIPATH_FAILOVER = 2
NVME_MULTIPATH_MULTIPATH = 3


_NVMFREMOTECONTROLLER = DESCRIPTOR.message_types_by_name['NVMfRemoteController']
_CREATENVMFREMOTECONTROLLERREQUEST = DESCRIPTOR.message_types_by_name['CreateNVMfRemoteControllerRequest']
_DELETENVMFREMOTECONTROLLERREQUEST = DESCRIPTOR.message_types_by_name['DeleteNVMfRemoteControllerRequest']
_UPDATENVMFREMOTECONTROLLERREQUEST = DESCRIPTOR.message_types_by_name['UpdateNVMfRemoteControllerRequest']
_LISTNVMFREMOTECONTROLLERSREQUEST = DESCRIPTOR.message_types_by_name['ListNVMfRemoteControllersRequest']
_LISTNVMFREMOTECONTROLLERSRESPONSE = DESCRIPTOR.message_types_by_name['ListNVMfRemoteControllersResponse']
_GETNVMFREMOTECONTROLLERREQUEST = DESCRIPTOR.message_types_by_name['GetNVMfRemoteControllerRequest']
_NVMFREMOTECONTROLLERRESETREQUEST = DESCRIPTOR.message_types_by_name['NVMfRemoteControllerResetRequest']
_NVMFREMOTECONTROLLERSTATSREQUEST = DESCRIPTOR.message_types_by_name['NVMfRemoteControllerStatsRequest']
_NVMFREMOTECONTROLLERSTATSRESPONSE = DESCRIPTOR.message_types_by_name['NVMfRemoteControllerStatsResponse']
NVMfRemoteController = _reflection.GeneratedProtocolMessageType('NVMfRemoteController', (_message.Message,), {
  'DESCRIPTOR' : _NVMFREMOTECONTROLLER,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMfRemoteController)
  })
_sym_db.RegisterMessage(NVMfRemoteController)

CreateNVMfRemoteControllerRequest = _reflection.GeneratedProtocolMessageType('CreateNVMfRemoteControllerRequest', (_message.Message,), {
  'DESCRIPTOR' : _CREATENVMFREMOTECONTROLLERREQUEST,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.CreateNVMfRemoteControllerRequest)
  })
_sym_db.RegisterMessage(CreateNVMfRemoteControllerRequest)

DeleteNVMfRemoteControllerRequest = _reflection.GeneratedProtocolMessageType('DeleteNVMfRemoteControllerRequest', (_message.Message,), {
  'DESCRIPTOR' : _DELETENVMFREMOTECONTROLLERREQUEST,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.DeleteNVMfRemoteControllerRequest)
  })
_sym_db.RegisterMessage(DeleteNVMfRemoteControllerRequest)

UpdateNVMfRemoteControllerRequest = _reflection.GeneratedProtocolMessageType('UpdateNVMfRemoteControllerRequest', (_message.Message,), {
  'DESCRIPTOR' : _UPDATENVMFREMOTECONTROLLERREQUEST,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.UpdateNVMfRemoteControllerRequest)
  })
_sym_db.RegisterMessage(UpdateNVMfRemoteControllerRequest)

ListNVMfRemoteControllersRequest = _reflection.GeneratedProtocolMessageType('ListNVMfRemoteControllersRequest', (_message.Message,), {
  'DESCRIPTOR' : _LISTNVMFREMOTECONTROLLERSREQUEST,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListNVMfRemoteControllersRequest)
  })
_sym_db.RegisterMessage(ListNVMfRemoteControllersRequest)

ListNVMfRemoteControllersResponse = _reflection.GeneratedProtocolMessageType('ListNVMfRemoteControllersResponse', (_message.Message,), {
  'DESCRIPTOR' : _LISTNVMFREMOTECONTROLLERSRESPONSE,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListNVMfRemoteControllersResponse)
  })
_sym_db.RegisterMessage(ListNVMfRemoteControllersResponse)

GetNVMfRemoteControllerRequest = _reflection.GeneratedProtocolMessageType('GetNVMfRemoteControllerRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETNVMFREMOTECONTROLLERREQUEST,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.GetNVMfRemoteControllerRequest)
  })
_sym_db.RegisterMessage(GetNVMfRemoteControllerRequest)

NVMfRemoteControllerResetRequest = _reflection.GeneratedProtocolMessageType('NVMfRemoteControllerResetRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMFREMOTECONTROLLERRESETREQUEST,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMfRemoteControllerResetRequest)
  })
_sym_db.RegisterMessage(NVMfRemoteControllerResetRequest)

NVMfRemoteControllerStatsRequest = _reflection.GeneratedProtocolMessageType('NVMfRemoteControllerStatsRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMFREMOTECONTROLLERSTATSREQUEST,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMfRemoteControllerStatsRequest)
  })
_sym_db.RegisterMessage(NVMfRemoteControllerStatsRequest)

NVMfRemoteControllerStatsResponse = _reflection.GeneratedProtocolMessageType('NVMfRemoteControllerStatsResponse', (_message.Message,), {
  'DESCRIPTOR' : _NVMFREMOTECONTROLLERSTATSRESPONSE,
  '__module__' : 'backend_nvme_tcp_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMfRemoteControllerStatsResponse)
  })
_sym_db.RegisterMessage(NVMfRemoteControllerStatsResponse)

_NVMFREMOTECONTROLLERSERVICE = DESCRIPTOR.services_by_name['NVMfRemoteControllerService']
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\022opi_api.storage.v1B\023BackendNvmeTcpProtoP\001Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/go'
  _CREATENVMFREMOTECONTROLLERREQUEST.fields_by_name['parent']._options = None
  _CREATENVMFREMOTECONTROLLERREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A)\n\'opi_api.storage.v1/NVMfRemoteController'
  _CREATENVMFREMOTECONTROLLERREQUEST.fields_by_name['nv_mf_remote_controller']._options = None
  _CREATENVMFREMOTECONTROLLERREQUEST.fields_by_name['nv_mf_remote_controller']._serialized_options = b'\340A\002'
  _DELETENVMFREMOTECONTROLLERREQUEST.fields_by_name['name']._options = None
  _DELETENVMFREMOTECONTROLLERREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A)\n\'opi_api.storage.v1/NVMfRemoteController'
  _LISTNVMFREMOTECONTROLLERSREQUEST.fields_by_name['parent']._options = None
  _LISTNVMFREMOTECONTROLLERSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A)\n\'opi_api.storage.v1/NVMfRemoteController'
  _GETNVMFREMOTECONTROLLERREQUEST.fields_by_name['name']._options = None
  _GETNVMFREMOTECONTROLLERREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A)\n\'opi_api.storage.v1/NVMfRemoteController'
  _NVMFREMOTECONTROLLERSERVICE.methods_by_name['CreateNVMfRemoteController']._options = None
  _NVMFREMOTECONTROLLERSERVICE.methods_by_name['CreateNVMfRemoteController']._serialized_options = b'\202\323\344\223\0022\"\027/v1/{parent=subsystems}:\027nv_mf_remote_controller\332A9parent,nv_mf_remote_controller,nv_mf_remote_controller_id'
  _NVMFREMOTECONTROLLERSERVICE.methods_by_name['DeleteNVMfRemoteController']._options = None
  _NVMFREMOTECONTROLLERSERVICE.methods_by_name['DeleteNVMfRemoteController']._serialized_options = b'\202\323\344\223\002#*!/v1/{name=subsystems}/{subsystem}\332A\004name'
  _NVMFREMOTECONTROLLERSERVICE.methods_by_name['UpdateNVMfRemoteController']._options = None
  _NVMFREMOTECONTROLLERSERVICE.methods_by_name['UpdateNVMfRemoteController']._serialized_options = b'\202\323\344\223\002H2-/v1/{nv_mf_remote_controller.name=subsystems}:\027nv_mf_remote_controller\332A#nv_mf_remote_controller,update_mask'
  _NVMFREMOTECONTROLLERSERVICE.methods_by_name['ListNVMfRemoteControllers']._options = None
  _NVMFREMOTECONTROLLERSERVICE.methods_by_name['ListNVMfRemoteControllers']._serialized_options = b'\202\323\344\223\002\031\022\027/v1/{parent=subsystems}\332A\006parent'
  _NVMFREMOTECONTROLLERSERVICE.methods_by_name['GetNVMfRemoteController']._options = None
  _NVMFREMOTECONTROLLERSERVICE.methods_by_name['GetNVMfRemoteController']._serialized_options = b'\202\323\344\223\002#\022!/v1/{name=subsystems}/{subsystem}\332A\004name'
  _NVMETRANSPORTTYPE._serialized_start=1731
  _NVMETRANSPORTTYPE._serialized_end=1911
  _NVMEADDRESSFAMILY._serialized_start=1914
  _NVMEADDRESSFAMILY._serialized_end=2082
  _NVMEMULTIPATH._serialized_start=2085
  _NVMEMULTIPATH._serialized_end=2219
  _NVMFREMOTECONTROLLER._serialized_start=260
  _NVMFREMOTECONTROLLER._serialized_end=629
  _CREATENVMFREMOTECONTROLLERREQUEST._serialized_start=632
  _CREATENVMFREMOTECONTROLLERREQUEST._serialized_end=848
  _DELETENVMFREMOTECONTROLLERREQUEST._serialized_start=850
  _DELETENVMFREMOTECONTROLLERREQUEST._serialized_end=948
  _UPDATENVMFREMOTECONTROLLERREQUEST._serialized_start=951
  _UPDATENVMFREMOTECONTROLLERREQUEST._serialized_end=1110
  _LISTNVMFREMOTECONTROLLERSREQUEST._serialized_start=1113
  _LISTNVMFREMOTECONTROLLERSREQUEST._serialized_end=1251
  _LISTNVMFREMOTECONTROLLERSRESPONSE._serialized_start=1254
  _LISTNVMFREMOTECONTROLLERSRESPONSE._serialized_end=1390
  _GETNVMFREMOTECONTROLLERREQUEST._serialized_start=1392
  _GETNVMFREMOTECONTROLLERREQUEST._serialized_end=1487
  _NVMFREMOTECONTROLLERRESETREQUEST._serialized_start=1489
  _NVMFREMOTECONTROLLERRESETREQUEST._serialized_end=1565
  _NVMFREMOTECONTROLLERSTATSREQUEST._serialized_start=1567
  _NVMFREMOTECONTROLLERSTATSREQUEST._serialized_end=1643
  _NVMFREMOTECONTROLLERSTATSRESPONSE._serialized_start=1645
  _NVMFREMOTECONTROLLERSTATSRESPONSE._serialized_end=1728
  _NVMFREMOTECONTROLLERSERVICE._serialized_start=2222
  _NVMFREMOTECONTROLLERSERVICE._serialized_end=3506
# @@protoc_insertion_point(module_scope)
