# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: frontend_nvme_pcie.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


import common_pb2 as common__pb2
import uuid_pb2 as uuid__pb2
import object_key_pb2 as object__key__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x18\x66rontend_nvme_pcie.proto\x12\x12opi_api.storage.v1\x1a\x0c\x63ommon.proto\x1a\nuuid.proto\x1a\x10object_key.proto\"\xb0\x01\n\rNVMeSubsystem\x12(\n\x02id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\x0b\n\x03nqn\x18\x02 \x01(\t\x12\x15\n\rserial_number\x18\x03 \x01(\t\x12\x14\n\x0cmodel_number\x18\x04 \x01(\t\x12\x0e\n\x06max_ns\x18\x05 \x01(\x03\x12\x19\n\x11\x66irmware_revision\x18\x06 \x01(\t\x12\x10\n\x08\x66ru_guid\x18\x07 \x01(\x0c\"\xe8\x01\n\x0eNVMeController\x12(\n\x02id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\x1a\n\x12nvme_controller_id\x18\x02 \x01(\r\x12\x32\n\x0csubsystem_id\x18\x03 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\x38\n\x07pcie_id\x18\x04 \x01(\x0b\x32\'.opi_api.storage.v1.NvmeControllerPciId\x12\x12\n\nmax_io_qps\x18\x05 \x01(\r\x12\x0e\n\x06max_ns\x18\x06 \x01(\r\"\xa1\x03\n\rNVMeNamespace\x12(\n\x02id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\x32\n\x0csubsystem_id\x18\x02 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\x33\n\rcontroller_id\x18\x03 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\x11\n\thost_nsid\x18\x04 \x01(\r\x12\x0c\n\x04\x62\x64\x65v\x18\x05 \x01(\t\x12\x12\n\nblock_size\x18\x06 \x01(\x03\x12\x12\n\nnum_blocks\x18\x07 \x01(\x03\x12\r\n\x05nguid\x18\x08 \x01(\t\x12\r\n\x05\x65ui64\x18\t \x01(\x06\x12%\n\x04uuid\x18\n \x01(\x0b\x32\x17.opi_api.common.v1.Uuid\x12\x33\n\rcrypto_key_id\x18\x0b \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\x1a\n\x12optimal_write_size\x18\x0c \x01(\r\x12\x1e\n\x16pref_write_granularity\x18\r \x01(\r\"R\n\x1aNVMeSubsystemCreateRequest\x12\x34\n\tsubsystem\x18\x01 \x01(\x0b\x32!.opi_api.storage.v1.NVMeSubsystem\"\x1d\n\x1bNVMeSubsystemCreateResponse\"P\n\x1aNVMeSubsystemDeleteRequest\x12\x32\n\x0csubsystem_id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"-\n\x1bNVMeSubsystemDeleteResponse\x12\x0e\n\x06result\x18\x01 \x01(\r\"R\n\x1aNVMeSubsystemUpdateRequest\x12\x34\n\tsubsystem\x18\x01 \x01(\x0b\x32!.opi_api.storage.v1.NVMeSubsystem\"-\n\x1bNVMeSubsystemUpdateResponse\x12\x0e\n\x06result\x18\x01 \x01(\r\"\x1a\n\x18NVMeSubsystemListRequest\"Q\n\x19NVMeSubsystemListResponse\x12\x34\n\tsubsystem\x18\x01 \x03(\x0b\x32!.opi_api.storage.v1.NVMeSubsystem\"M\n\x17NVMeSubsystemGetRequest\x12\x32\n\x0csubsystem_id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"P\n\x18NVMeSubsystemGetResponse\x12\x34\n\tsubsystem\x18\x01 \x01(\x0b\x32!.opi_api.storage.v1.NVMeSubsystem\"O\n\x19NVMeSubsystemStatsRequest\x12\x32\n\x0csubsystem_id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"+\n\x1aNVMeSubsystemStatsResponse\x12\r\n\x05stats\x18\x01 \x01(\t\"U\n\x1bNVMeControllerCreateRequest\x12\x36\n\ncontroller\x18\x01 \x01(\x0b\x32\".opi_api.storage.v1.NVMeController\"\x1e\n\x1cNVMeControllerCreateResponse\"R\n\x1bNVMeControllerDeleteRequest\x12\x33\n\rcontroller_id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"\x1e\n\x1cNVMeControllerDeleteResponse\"U\n\x1bNVMeControllerUpdateRequest\x12\x36\n\ncontroller\x18\x01 \x01(\x0b\x32\".opi_api.storage.v1.NVMeController\"\x1e\n\x1cNVMeControllerUpdateResponse\"O\n\x19NVMeControllerListRequest\x12\x32\n\x0csubsystem_id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"T\n\x1aNVMeControllerListResponse\x12\x36\n\ncontroller\x18\x01 \x03(\x0b\x32\".opi_api.storage.v1.NVMeController\"O\n\x18NVMeControllerGetRequest\x12\x33\n\rcontroller_id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"V\n\x19NVMeControllerGetResponse\x12\x39\n\rcontroller_id\x18\x01 \x01(\x0b\x32\".opi_api.storage.v1.NVMeController\"F\n\x1aNVMeControllerStatsRequest\x12(\n\x02id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"V\n\x1bNVMeControllerStatsResponse\x12(\n\x02id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\r\n\x05stats\x18\x02 \x01(\t\"R\n\x1aNVMeNamespaceCreateRequest\x12\x34\n\tnamespace\x18\x01 \x01(\x0b\x32!.opi_api.storage.v1.NVMeNamespace\"\x1d\n\x1bNVMeNamespaceCreateResponse\"P\n\x1aNVMeNamespaceDeleteRequest\x12\x32\n\x0cnamespace_id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"\x1d\n\x1bNVMeNamespaceDeleteResponse\"R\n\x1aNVMeNamespaceUpdateRequest\x12\x34\n\tnamespace\x18\x01 \x01(\x0b\x32!.opi_api.storage.v1.NVMeNamespace\"\x1d\n\x1bNVMeNamespaceUpdateResponse\"\x83\x01\n\x18NVMeNamespaceListRequest\x12\x32\n\x0csubsystem_id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\x33\n\rcontroller_id\x18\x02 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"Q\n\x19NVMeNamespaceListResponse\x12\x34\n\tnamespace\x18\x01 \x03(\x0b\x32!.opi_api.storage.v1.NVMeNamespace\"M\n\x17NVMeNamespaceGetRequest\x12\x32\n\x0cnamespace_id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"P\n\x18NVMeNamespaceGetResponse\x12\x34\n\tnamespace\x18\x01 \x01(\x0b\x32!.opi_api.storage.v1.NVMeNamespace\"O\n\x19NVMeNamespaceStatsRequest\x12\x32\n\x0cnamespace_id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"U\n\x1aNVMeNamespaceStatsResponse\x12(\n\x02id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\r\n\x05stats\x18\x02 \x01(\t2\xe0\x05\n\x14NVMeSubsystemService\x12x\n\x13NVMeSubsystemCreate\x12..opi_api.storage.v1.NVMeSubsystemCreateRequest\x1a/.opi_api.storage.v1.NVMeSubsystemCreateResponse\"\x00\x12x\n\x13NVMeSubsystemDelete\x12..opi_api.storage.v1.NVMeSubsystemDeleteRequest\x1a/.opi_api.storage.v1.NVMeSubsystemDeleteResponse\"\x00\x12x\n\x13NVMeSubsystemUpdate\x12..opi_api.storage.v1.NVMeSubsystemUpdateRequest\x1a/.opi_api.storage.v1.NVMeSubsystemUpdateResponse\"\x00\x12r\n\x11NVMeSubsystemList\x12,.opi_api.storage.v1.NVMeSubsystemListRequest\x1a-.opi_api.storage.v1.NVMeSubsystemListResponse\"\x00\x12o\n\x10NVMeSubsystemGet\x12+.opi_api.storage.v1.NVMeSubsystemGetRequest\x1a,.opi_api.storage.v1.NVMeSubsystemGetResponse\"\x00\x12u\n\x12NVMeSubsystemStats\x12-.opi_api.storage.v1.NVMeSubsystemStatsRequest\x1a..opi_api.storage.v1.NVMeSubsystemStatsResponse\"\x00\x32\xf3\x05\n\x15NVMeControllerService\x12{\n\x14NVMeControllerCreate\x12/.opi_api.storage.v1.NVMeControllerCreateRequest\x1a\x30.opi_api.storage.v1.NVMeControllerCreateResponse\"\x00\x12{\n\x14NVMeControllerDelete\x12/.opi_api.storage.v1.NVMeControllerDeleteRequest\x1a\x30.opi_api.storage.v1.NVMeControllerDeleteResponse\"\x00\x12{\n\x14NVMeControllerUpdate\x12/.opi_api.storage.v1.NVMeControllerUpdateRequest\x1a\x30.opi_api.storage.v1.NVMeControllerUpdateResponse\"\x00\x12u\n\x12NVMeControllerList\x12-.opi_api.storage.v1.NVMeControllerListRequest\x1a..opi_api.storage.v1.NVMeControllerListResponse\"\x00\x12r\n\x11NVMeControllerGet\x12,.opi_api.storage.v1.NVMeControllerGetRequest\x1a-.opi_api.storage.v1.NVMeControllerGetResponse\"\x00\x12x\n\x13NVMeControllerStats\x12..opi_api.storage.v1.NVMeControllerStatsRequest\x1a/.opi_api.storage.v1.NVMeControllerStatsResponse\"\x00\x32\xe0\x05\n\x14NVMeNamespaceService\x12x\n\x13NVMeNamespaceCreate\x12..opi_api.storage.v1.NVMeNamespaceCreateRequest\x1a/.opi_api.storage.v1.NVMeNamespaceCreateResponse\"\x00\x12x\n\x13NVMeNamespaceDelete\x12..opi_api.storage.v1.NVMeNamespaceDeleteRequest\x1a/.opi_api.storage.v1.NVMeNamespaceDeleteResponse\"\x00\x12x\n\x13NVMeNamespaceUpdate\x12..opi_api.storage.v1.NVMeNamespaceUpdateRequest\x1a/.opi_api.storage.v1.NVMeNamespaceUpdateResponse\"\x00\x12r\n\x11NVMeNamespaceList\x12,.opi_api.storage.v1.NVMeNamespaceListRequest\x1a-.opi_api.storage.v1.NVMeNamespaceListResponse\"\x00\x12o\n\x10NVMeNamespaceGet\x12+.opi_api.storage.v1.NVMeNamespaceGetRequest\x1a,.opi_api.storage.v1.NVMeNamespaceGetResponse\"\x00\x12u\n\x12NVMeNamespaceStats\x12-.opi_api.storage.v1.NVMeNamespaceStatsRequest\x1a..opi_api.storage.v1.NVMeNamespaceStatsResponse\"\x00\x42\x31Z/github.com/opiproject/opi-api/storage/v1/gen/gob\x06proto3')



_NVMESUBSYSTEM = DESCRIPTOR.message_types_by_name['NVMeSubsystem']
_NVMECONTROLLER = DESCRIPTOR.message_types_by_name['NVMeController']
_NVMENAMESPACE = DESCRIPTOR.message_types_by_name['NVMeNamespace']
_NVMESUBSYSTEMCREATEREQUEST = DESCRIPTOR.message_types_by_name['NVMeSubsystemCreateRequest']
_NVMESUBSYSTEMCREATERESPONSE = DESCRIPTOR.message_types_by_name['NVMeSubsystemCreateResponse']
_NVMESUBSYSTEMDELETEREQUEST = DESCRIPTOR.message_types_by_name['NVMeSubsystemDeleteRequest']
_NVMESUBSYSTEMDELETERESPONSE = DESCRIPTOR.message_types_by_name['NVMeSubsystemDeleteResponse']
_NVMESUBSYSTEMUPDATEREQUEST = DESCRIPTOR.message_types_by_name['NVMeSubsystemUpdateRequest']
_NVMESUBSYSTEMUPDATERESPONSE = DESCRIPTOR.message_types_by_name['NVMeSubsystemUpdateResponse']
_NVMESUBSYSTEMLISTREQUEST = DESCRIPTOR.message_types_by_name['NVMeSubsystemListRequest']
_NVMESUBSYSTEMLISTRESPONSE = DESCRIPTOR.message_types_by_name['NVMeSubsystemListResponse']
_NVMESUBSYSTEMGETREQUEST = DESCRIPTOR.message_types_by_name['NVMeSubsystemGetRequest']
_NVMESUBSYSTEMGETRESPONSE = DESCRIPTOR.message_types_by_name['NVMeSubsystemGetResponse']
_NVMESUBSYSTEMSTATSREQUEST = DESCRIPTOR.message_types_by_name['NVMeSubsystemStatsRequest']
_NVMESUBSYSTEMSTATSRESPONSE = DESCRIPTOR.message_types_by_name['NVMeSubsystemStatsResponse']
_NVMECONTROLLERCREATEREQUEST = DESCRIPTOR.message_types_by_name['NVMeControllerCreateRequest']
_NVMECONTROLLERCREATERESPONSE = DESCRIPTOR.message_types_by_name['NVMeControllerCreateResponse']
_NVMECONTROLLERDELETEREQUEST = DESCRIPTOR.message_types_by_name['NVMeControllerDeleteRequest']
_NVMECONTROLLERDELETERESPONSE = DESCRIPTOR.message_types_by_name['NVMeControllerDeleteResponse']
_NVMECONTROLLERUPDATEREQUEST = DESCRIPTOR.message_types_by_name['NVMeControllerUpdateRequest']
_NVMECONTROLLERUPDATERESPONSE = DESCRIPTOR.message_types_by_name['NVMeControllerUpdateResponse']
_NVMECONTROLLERLISTREQUEST = DESCRIPTOR.message_types_by_name['NVMeControllerListRequest']
_NVMECONTROLLERLISTRESPONSE = DESCRIPTOR.message_types_by_name['NVMeControllerListResponse']
_NVMECONTROLLERGETREQUEST = DESCRIPTOR.message_types_by_name['NVMeControllerGetRequest']
_NVMECONTROLLERGETRESPONSE = DESCRIPTOR.message_types_by_name['NVMeControllerGetResponse']
_NVMECONTROLLERSTATSREQUEST = DESCRIPTOR.message_types_by_name['NVMeControllerStatsRequest']
_NVMECONTROLLERSTATSRESPONSE = DESCRIPTOR.message_types_by_name['NVMeControllerStatsResponse']
_NVMENAMESPACECREATEREQUEST = DESCRIPTOR.message_types_by_name['NVMeNamespaceCreateRequest']
_NVMENAMESPACECREATERESPONSE = DESCRIPTOR.message_types_by_name['NVMeNamespaceCreateResponse']
_NVMENAMESPACEDELETEREQUEST = DESCRIPTOR.message_types_by_name['NVMeNamespaceDeleteRequest']
_NVMENAMESPACEDELETERESPONSE = DESCRIPTOR.message_types_by_name['NVMeNamespaceDeleteResponse']
_NVMENAMESPACEUPDATEREQUEST = DESCRIPTOR.message_types_by_name['NVMeNamespaceUpdateRequest']
_NVMENAMESPACEUPDATERESPONSE = DESCRIPTOR.message_types_by_name['NVMeNamespaceUpdateResponse']
_NVMENAMESPACELISTREQUEST = DESCRIPTOR.message_types_by_name['NVMeNamespaceListRequest']
_NVMENAMESPACELISTRESPONSE = DESCRIPTOR.message_types_by_name['NVMeNamespaceListResponse']
_NVMENAMESPACEGETREQUEST = DESCRIPTOR.message_types_by_name['NVMeNamespaceGetRequest']
_NVMENAMESPACEGETRESPONSE = DESCRIPTOR.message_types_by_name['NVMeNamespaceGetResponse']
_NVMENAMESPACESTATSREQUEST = DESCRIPTOR.message_types_by_name['NVMeNamespaceStatsRequest']
_NVMENAMESPACESTATSRESPONSE = DESCRIPTOR.message_types_by_name['NVMeNamespaceStatsResponse']
NVMeSubsystem = _reflection.GeneratedProtocolMessageType('NVMeSubsystem', (_message.Message,), {
  'DESCRIPTOR' : _NVMESUBSYSTEM,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeSubsystem)
  })
_sym_db.RegisterMessage(NVMeSubsystem)

NVMeController = _reflection.GeneratedProtocolMessageType('NVMeController', (_message.Message,), {
  'DESCRIPTOR' : _NVMECONTROLLER,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeController)
  })
_sym_db.RegisterMessage(NVMeController)

NVMeNamespace = _reflection.GeneratedProtocolMessageType('NVMeNamespace', (_message.Message,), {
  'DESCRIPTOR' : _NVMENAMESPACE,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeNamespace)
  })
_sym_db.RegisterMessage(NVMeNamespace)

NVMeSubsystemCreateRequest = _reflection.GeneratedProtocolMessageType('NVMeSubsystemCreateRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMESUBSYSTEMCREATEREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeSubsystemCreateRequest)
  })
_sym_db.RegisterMessage(NVMeSubsystemCreateRequest)

NVMeSubsystemCreateResponse = _reflection.GeneratedProtocolMessageType('NVMeSubsystemCreateResponse', (_message.Message,), {
  'DESCRIPTOR' : _NVMESUBSYSTEMCREATERESPONSE,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeSubsystemCreateResponse)
  })
_sym_db.RegisterMessage(NVMeSubsystemCreateResponse)

NVMeSubsystemDeleteRequest = _reflection.GeneratedProtocolMessageType('NVMeSubsystemDeleteRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMESUBSYSTEMDELETEREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeSubsystemDeleteRequest)
  })
_sym_db.RegisterMessage(NVMeSubsystemDeleteRequest)

NVMeSubsystemDeleteResponse = _reflection.GeneratedProtocolMessageType('NVMeSubsystemDeleteResponse', (_message.Message,), {
  'DESCRIPTOR' : _NVMESUBSYSTEMDELETERESPONSE,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeSubsystemDeleteResponse)
  })
_sym_db.RegisterMessage(NVMeSubsystemDeleteResponse)

NVMeSubsystemUpdateRequest = _reflection.GeneratedProtocolMessageType('NVMeSubsystemUpdateRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMESUBSYSTEMUPDATEREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeSubsystemUpdateRequest)
  })
_sym_db.RegisterMessage(NVMeSubsystemUpdateRequest)

NVMeSubsystemUpdateResponse = _reflection.GeneratedProtocolMessageType('NVMeSubsystemUpdateResponse', (_message.Message,), {
  'DESCRIPTOR' : _NVMESUBSYSTEMUPDATERESPONSE,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeSubsystemUpdateResponse)
  })
_sym_db.RegisterMessage(NVMeSubsystemUpdateResponse)

NVMeSubsystemListRequest = _reflection.GeneratedProtocolMessageType('NVMeSubsystemListRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMESUBSYSTEMLISTREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeSubsystemListRequest)
  })
_sym_db.RegisterMessage(NVMeSubsystemListRequest)

NVMeSubsystemListResponse = _reflection.GeneratedProtocolMessageType('NVMeSubsystemListResponse', (_message.Message,), {
  'DESCRIPTOR' : _NVMESUBSYSTEMLISTRESPONSE,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeSubsystemListResponse)
  })
_sym_db.RegisterMessage(NVMeSubsystemListResponse)

NVMeSubsystemGetRequest = _reflection.GeneratedProtocolMessageType('NVMeSubsystemGetRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMESUBSYSTEMGETREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeSubsystemGetRequest)
  })
_sym_db.RegisterMessage(NVMeSubsystemGetRequest)

NVMeSubsystemGetResponse = _reflection.GeneratedProtocolMessageType('NVMeSubsystemGetResponse', (_message.Message,), {
  'DESCRIPTOR' : _NVMESUBSYSTEMGETRESPONSE,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeSubsystemGetResponse)
  })
_sym_db.RegisterMessage(NVMeSubsystemGetResponse)

NVMeSubsystemStatsRequest = _reflection.GeneratedProtocolMessageType('NVMeSubsystemStatsRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMESUBSYSTEMSTATSREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeSubsystemStatsRequest)
  })
_sym_db.RegisterMessage(NVMeSubsystemStatsRequest)

NVMeSubsystemStatsResponse = _reflection.GeneratedProtocolMessageType('NVMeSubsystemStatsResponse', (_message.Message,), {
  'DESCRIPTOR' : _NVMESUBSYSTEMSTATSRESPONSE,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeSubsystemStatsResponse)
  })
_sym_db.RegisterMessage(NVMeSubsystemStatsResponse)

NVMeControllerCreateRequest = _reflection.GeneratedProtocolMessageType('NVMeControllerCreateRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMECONTROLLERCREATEREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeControllerCreateRequest)
  })
_sym_db.RegisterMessage(NVMeControllerCreateRequest)

NVMeControllerCreateResponse = _reflection.GeneratedProtocolMessageType('NVMeControllerCreateResponse', (_message.Message,), {
  'DESCRIPTOR' : _NVMECONTROLLERCREATERESPONSE,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeControllerCreateResponse)
  })
_sym_db.RegisterMessage(NVMeControllerCreateResponse)

NVMeControllerDeleteRequest = _reflection.GeneratedProtocolMessageType('NVMeControllerDeleteRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMECONTROLLERDELETEREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeControllerDeleteRequest)
  })
_sym_db.RegisterMessage(NVMeControllerDeleteRequest)

NVMeControllerDeleteResponse = _reflection.GeneratedProtocolMessageType('NVMeControllerDeleteResponse', (_message.Message,), {
  'DESCRIPTOR' : _NVMECONTROLLERDELETERESPONSE,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeControllerDeleteResponse)
  })
_sym_db.RegisterMessage(NVMeControllerDeleteResponse)

NVMeControllerUpdateRequest = _reflection.GeneratedProtocolMessageType('NVMeControllerUpdateRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMECONTROLLERUPDATEREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeControllerUpdateRequest)
  })
_sym_db.RegisterMessage(NVMeControllerUpdateRequest)

NVMeControllerUpdateResponse = _reflection.GeneratedProtocolMessageType('NVMeControllerUpdateResponse', (_message.Message,), {
  'DESCRIPTOR' : _NVMECONTROLLERUPDATERESPONSE,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeControllerUpdateResponse)
  })
_sym_db.RegisterMessage(NVMeControllerUpdateResponse)

NVMeControllerListRequest = _reflection.GeneratedProtocolMessageType('NVMeControllerListRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMECONTROLLERLISTREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeControllerListRequest)
  })
_sym_db.RegisterMessage(NVMeControllerListRequest)

NVMeControllerListResponse = _reflection.GeneratedProtocolMessageType('NVMeControllerListResponse', (_message.Message,), {
  'DESCRIPTOR' : _NVMECONTROLLERLISTRESPONSE,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeControllerListResponse)
  })
_sym_db.RegisterMessage(NVMeControllerListResponse)

NVMeControllerGetRequest = _reflection.GeneratedProtocolMessageType('NVMeControllerGetRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMECONTROLLERGETREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeControllerGetRequest)
  })
_sym_db.RegisterMessage(NVMeControllerGetRequest)

NVMeControllerGetResponse = _reflection.GeneratedProtocolMessageType('NVMeControllerGetResponse', (_message.Message,), {
  'DESCRIPTOR' : _NVMECONTROLLERGETRESPONSE,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeControllerGetResponse)
  })
_sym_db.RegisterMessage(NVMeControllerGetResponse)

NVMeControllerStatsRequest = _reflection.GeneratedProtocolMessageType('NVMeControllerStatsRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMECONTROLLERSTATSREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeControllerStatsRequest)
  })
_sym_db.RegisterMessage(NVMeControllerStatsRequest)

NVMeControllerStatsResponse = _reflection.GeneratedProtocolMessageType('NVMeControllerStatsResponse', (_message.Message,), {
  'DESCRIPTOR' : _NVMECONTROLLERSTATSRESPONSE,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeControllerStatsResponse)
  })
_sym_db.RegisterMessage(NVMeControllerStatsResponse)

NVMeNamespaceCreateRequest = _reflection.GeneratedProtocolMessageType('NVMeNamespaceCreateRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMENAMESPACECREATEREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeNamespaceCreateRequest)
  })
_sym_db.RegisterMessage(NVMeNamespaceCreateRequest)

NVMeNamespaceCreateResponse = _reflection.GeneratedProtocolMessageType('NVMeNamespaceCreateResponse', (_message.Message,), {
  'DESCRIPTOR' : _NVMENAMESPACECREATERESPONSE,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeNamespaceCreateResponse)
  })
_sym_db.RegisterMessage(NVMeNamespaceCreateResponse)

NVMeNamespaceDeleteRequest = _reflection.GeneratedProtocolMessageType('NVMeNamespaceDeleteRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMENAMESPACEDELETEREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeNamespaceDeleteRequest)
  })
_sym_db.RegisterMessage(NVMeNamespaceDeleteRequest)

NVMeNamespaceDeleteResponse = _reflection.GeneratedProtocolMessageType('NVMeNamespaceDeleteResponse', (_message.Message,), {
  'DESCRIPTOR' : _NVMENAMESPACEDELETERESPONSE,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeNamespaceDeleteResponse)
  })
_sym_db.RegisterMessage(NVMeNamespaceDeleteResponse)

NVMeNamespaceUpdateRequest = _reflection.GeneratedProtocolMessageType('NVMeNamespaceUpdateRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMENAMESPACEUPDATEREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeNamespaceUpdateRequest)
  })
_sym_db.RegisterMessage(NVMeNamespaceUpdateRequest)

NVMeNamespaceUpdateResponse = _reflection.GeneratedProtocolMessageType('NVMeNamespaceUpdateResponse', (_message.Message,), {
  'DESCRIPTOR' : _NVMENAMESPACEUPDATERESPONSE,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeNamespaceUpdateResponse)
  })
_sym_db.RegisterMessage(NVMeNamespaceUpdateResponse)

NVMeNamespaceListRequest = _reflection.GeneratedProtocolMessageType('NVMeNamespaceListRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMENAMESPACELISTREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeNamespaceListRequest)
  })
_sym_db.RegisterMessage(NVMeNamespaceListRequest)

NVMeNamespaceListResponse = _reflection.GeneratedProtocolMessageType('NVMeNamespaceListResponse', (_message.Message,), {
  'DESCRIPTOR' : _NVMENAMESPACELISTRESPONSE,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeNamespaceListResponse)
  })
_sym_db.RegisterMessage(NVMeNamespaceListResponse)

NVMeNamespaceGetRequest = _reflection.GeneratedProtocolMessageType('NVMeNamespaceGetRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMENAMESPACEGETREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeNamespaceGetRequest)
  })
_sym_db.RegisterMessage(NVMeNamespaceGetRequest)

NVMeNamespaceGetResponse = _reflection.GeneratedProtocolMessageType('NVMeNamespaceGetResponse', (_message.Message,), {
  'DESCRIPTOR' : _NVMENAMESPACEGETRESPONSE,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeNamespaceGetResponse)
  })
_sym_db.RegisterMessage(NVMeNamespaceGetResponse)

NVMeNamespaceStatsRequest = _reflection.GeneratedProtocolMessageType('NVMeNamespaceStatsRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMENAMESPACESTATSREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeNamespaceStatsRequest)
  })
_sym_db.RegisterMessage(NVMeNamespaceStatsRequest)

NVMeNamespaceStatsResponse = _reflection.GeneratedProtocolMessageType('NVMeNamespaceStatsResponse', (_message.Message,), {
  'DESCRIPTOR' : _NVMENAMESPACESTATSRESPONSE,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeNamespaceStatsResponse)
  })
_sym_db.RegisterMessage(NVMeNamespaceStatsResponse)

_NVMESUBSYSTEMSERVICE = DESCRIPTOR.services_by_name['NVMeSubsystemService']
_NVMECONTROLLERSERVICE = DESCRIPTOR.services_by_name['NVMeControllerService']
_NVMENAMESPACESERVICE = DESCRIPTOR.services_by_name['NVMeNamespaceService']
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'Z/github.com/opiproject/opi-api/storage/v1/gen/go'
  _NVMESUBSYSTEM._serialized_start=93
  _NVMESUBSYSTEM._serialized_end=269
  _NVMECONTROLLER._serialized_start=272
  _NVMECONTROLLER._serialized_end=504
  _NVMENAMESPACE._serialized_start=507
  _NVMENAMESPACE._serialized_end=924
  _NVMESUBSYSTEMCREATEREQUEST._serialized_start=926
  _NVMESUBSYSTEMCREATEREQUEST._serialized_end=1008
  _NVMESUBSYSTEMCREATERESPONSE._serialized_start=1010
  _NVMESUBSYSTEMCREATERESPONSE._serialized_end=1039
  _NVMESUBSYSTEMDELETEREQUEST._serialized_start=1041
  _NVMESUBSYSTEMDELETEREQUEST._serialized_end=1121
  _NVMESUBSYSTEMDELETERESPONSE._serialized_start=1123
  _NVMESUBSYSTEMDELETERESPONSE._serialized_end=1168
  _NVMESUBSYSTEMUPDATEREQUEST._serialized_start=1170
  _NVMESUBSYSTEMUPDATEREQUEST._serialized_end=1252
  _NVMESUBSYSTEMUPDATERESPONSE._serialized_start=1254
  _NVMESUBSYSTEMUPDATERESPONSE._serialized_end=1299
  _NVMESUBSYSTEMLISTREQUEST._serialized_start=1301
  _NVMESUBSYSTEMLISTREQUEST._serialized_end=1327
  _NVMESUBSYSTEMLISTRESPONSE._serialized_start=1329
  _NVMESUBSYSTEMLISTRESPONSE._serialized_end=1410
  _NVMESUBSYSTEMGETREQUEST._serialized_start=1412
  _NVMESUBSYSTEMGETREQUEST._serialized_end=1489
  _NVMESUBSYSTEMGETRESPONSE._serialized_start=1491
  _NVMESUBSYSTEMGETRESPONSE._serialized_end=1571
  _NVMESUBSYSTEMSTATSREQUEST._serialized_start=1573
  _NVMESUBSYSTEMSTATSREQUEST._serialized_end=1652
  _NVMESUBSYSTEMSTATSRESPONSE._serialized_start=1654
  _NVMESUBSYSTEMSTATSRESPONSE._serialized_end=1697
  _NVMECONTROLLERCREATEREQUEST._serialized_start=1699
  _NVMECONTROLLERCREATEREQUEST._serialized_end=1784
  _NVMECONTROLLERCREATERESPONSE._serialized_start=1786
  _NVMECONTROLLERCREATERESPONSE._serialized_end=1816
  _NVMECONTROLLERDELETEREQUEST._serialized_start=1818
  _NVMECONTROLLERDELETEREQUEST._serialized_end=1900
  _NVMECONTROLLERDELETERESPONSE._serialized_start=1902
  _NVMECONTROLLERDELETERESPONSE._serialized_end=1932
  _NVMECONTROLLERUPDATEREQUEST._serialized_start=1934
  _NVMECONTROLLERUPDATEREQUEST._serialized_end=2019
  _NVMECONTROLLERUPDATERESPONSE._serialized_start=2021
  _NVMECONTROLLERUPDATERESPONSE._serialized_end=2051
  _NVMECONTROLLERLISTREQUEST._serialized_start=2053
  _NVMECONTROLLERLISTREQUEST._serialized_end=2132
  _NVMECONTROLLERLISTRESPONSE._serialized_start=2134
  _NVMECONTROLLERLISTRESPONSE._serialized_end=2218
  _NVMECONTROLLERGETREQUEST._serialized_start=2220
  _NVMECONTROLLERGETREQUEST._serialized_end=2299
  _NVMECONTROLLERGETRESPONSE._serialized_start=2301
  _NVMECONTROLLERGETRESPONSE._serialized_end=2387
  _NVMECONTROLLERSTATSREQUEST._serialized_start=2389
  _NVMECONTROLLERSTATSREQUEST._serialized_end=2459
  _NVMECONTROLLERSTATSRESPONSE._serialized_start=2461
  _NVMECONTROLLERSTATSRESPONSE._serialized_end=2547
  _NVMENAMESPACECREATEREQUEST._serialized_start=2549
  _NVMENAMESPACECREATEREQUEST._serialized_end=2631
  _NVMENAMESPACECREATERESPONSE._serialized_start=2633
  _NVMENAMESPACECREATERESPONSE._serialized_end=2662
  _NVMENAMESPACEDELETEREQUEST._serialized_start=2664
  _NVMENAMESPACEDELETEREQUEST._serialized_end=2744
  _NVMENAMESPACEDELETERESPONSE._serialized_start=2746
  _NVMENAMESPACEDELETERESPONSE._serialized_end=2775
  _NVMENAMESPACEUPDATEREQUEST._serialized_start=2777
  _NVMENAMESPACEUPDATEREQUEST._serialized_end=2859
  _NVMENAMESPACEUPDATERESPONSE._serialized_start=2861
  _NVMENAMESPACEUPDATERESPONSE._serialized_end=2890
  _NVMENAMESPACELISTREQUEST._serialized_start=2893
  _NVMENAMESPACELISTREQUEST._serialized_end=3024
  _NVMENAMESPACELISTRESPONSE._serialized_start=3026
  _NVMENAMESPACELISTRESPONSE._serialized_end=3107
  _NVMENAMESPACEGETREQUEST._serialized_start=3109
  _NVMENAMESPACEGETREQUEST._serialized_end=3186
  _NVMENAMESPACEGETRESPONSE._serialized_start=3188
  _NVMENAMESPACEGETRESPONSE._serialized_end=3268
  _NVMENAMESPACESTATSREQUEST._serialized_start=3270
  _NVMENAMESPACESTATSREQUEST._serialized_end=3349
  _NVMENAMESPACESTATSRESPONSE._serialized_start=3351
  _NVMENAMESPACESTATSRESPONSE._serialized_end=3436
  _NVMESUBSYSTEMSERVICE._serialized_start=3439
  _NVMESUBSYSTEMSERVICE._serialized_end=4175
  _NVMECONTROLLERSERVICE._serialized_start=4178
  _NVMECONTROLLERSERVICE._serialized_end=4933
  _NVMENAMESPACESERVICE._serialized_start=4936
  _NVMENAMESPACESERVICE._serialized_end=5672
# @@protoc_insertion_point(module_scope)
