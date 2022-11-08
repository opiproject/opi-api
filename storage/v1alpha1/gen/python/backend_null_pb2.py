# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: backend_null.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


import object_key_pb2 as object__key__pb2
import uuid_pb2 as uuid__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x12\x62\x61\x63kend_null.proto\x12\x12opi_api.storage.v1\x1a\x10object_key.proto\x1a\nuuid.proto\"t\n\tNullDebug\x12\n\n\x02id\x18\x01 \x01(\x03\x12\x0c\n\x04name\x18\x02 \x01(\t\x12\x12\n\nblock_size\x18\x03 \x01(\x03\x12\x12\n\nnum_blocks\x18\x04 \x01(\x03\x12%\n\x04uuid\x18\x05 \x01(\x0b\x32\x17.opi_api.common.v1.Uuid\"G\n\x16NullDebugCreateRequest\x12-\n\x06\x64\x65vice\x18\x01 \x01(\x0b\x32\x1d.opi_api.storage.v1.NullDebug\"\x19\n\x17NullDebugCreateResponse\"$\n\x16NullDebugDeleteRequest\x12\n\n\x02id\x18\x01 \x01(\x03\"\x19\n\x17NullDebugDeleteResponse\"G\n\x16NullDebugUpdateRequest\x12-\n\x06\x64\x65vice\x18\x01 \x01(\x0b\x32\x1d.opi_api.storage.v1.NullDebug\"\x19\n\x17NullDebugUpdateResponse\"\x16\n\x14NullDebugListRequest\"F\n\x15NullDebugListResponse\x12-\n\x06\x64\x65vice\x18\x01 \x03(\x0b\x32\x1d.opi_api.storage.v1.NullDebug\"!\n\x13NullDebugGetRequest\x12\n\n\x02id\x18\x01 \x01(\x03\"E\n\x14NullDebugGetResponse\x12-\n\x06\x64\x65vice\x18\x01 \x01(\x0b\x32\x1d.opi_api.storage.v1.NullDebug\"#\n\x15NullDebugStatsRequest\x12\n\n\x02id\x18\x01 \x01(\x03\"3\n\x16NullDebugStatsResponse\x12\n\n\x02id\x18\x01 \x01(\x03\x12\r\n\x05stats\x18\x02 \x01(\t2\x94\x05\n\x10NullDebugService\x12l\n\x0fNullDebugCreate\x12*.opi_api.storage.v1.NullDebugCreateRequest\x1a+.opi_api.storage.v1.NullDebugCreateResponse\"\x00\x12l\n\x0fNullDebugDelete\x12*.opi_api.storage.v1.NullDebugDeleteRequest\x1a+.opi_api.storage.v1.NullDebugDeleteResponse\"\x00\x12l\n\x0fNullDebugUpdate\x12*.opi_api.storage.v1.NullDebugUpdateRequest\x1a+.opi_api.storage.v1.NullDebugUpdateResponse\"\x00\x12\x66\n\rNullDebugList\x12(.opi_api.storage.v1.NullDebugListRequest\x1a).opi_api.storage.v1.NullDebugListResponse\"\x00\x12\x63\n\x0cNullDebugGet\x12\'.opi_api.storage.v1.NullDebugGetRequest\x1a(.opi_api.storage.v1.NullDebugGetResponse\"\x00\x12i\n\x0eNullDebugStats\x12).opi_api.storage.v1.NullDebugStatsRequest\x1a*.opi_api.storage.v1.NullDebugStatsResponse\"\x00\x42\x37Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/gob\x06proto3')



_NULLDEBUG = DESCRIPTOR.message_types_by_name['NullDebug']
_NULLDEBUGCREATEREQUEST = DESCRIPTOR.message_types_by_name['NullDebugCreateRequest']
_NULLDEBUGCREATERESPONSE = DESCRIPTOR.message_types_by_name['NullDebugCreateResponse']
_NULLDEBUGDELETEREQUEST = DESCRIPTOR.message_types_by_name['NullDebugDeleteRequest']
_NULLDEBUGDELETERESPONSE = DESCRIPTOR.message_types_by_name['NullDebugDeleteResponse']
_NULLDEBUGUPDATEREQUEST = DESCRIPTOR.message_types_by_name['NullDebugUpdateRequest']
_NULLDEBUGUPDATERESPONSE = DESCRIPTOR.message_types_by_name['NullDebugUpdateResponse']
_NULLDEBUGLISTREQUEST = DESCRIPTOR.message_types_by_name['NullDebugListRequest']
_NULLDEBUGLISTRESPONSE = DESCRIPTOR.message_types_by_name['NullDebugListResponse']
_NULLDEBUGGETREQUEST = DESCRIPTOR.message_types_by_name['NullDebugGetRequest']
_NULLDEBUGGETRESPONSE = DESCRIPTOR.message_types_by_name['NullDebugGetResponse']
_NULLDEBUGSTATSREQUEST = DESCRIPTOR.message_types_by_name['NullDebugStatsRequest']
_NULLDEBUGSTATSRESPONSE = DESCRIPTOR.message_types_by_name['NullDebugStatsResponse']
NullDebug = _reflection.GeneratedProtocolMessageType('NullDebug', (_message.Message,), {
  'DESCRIPTOR' : _NULLDEBUG,
  '__module__' : 'backend_null_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NullDebug)
  })
_sym_db.RegisterMessage(NullDebug)

NullDebugCreateRequest = _reflection.GeneratedProtocolMessageType('NullDebugCreateRequest', (_message.Message,), {
  'DESCRIPTOR' : _NULLDEBUGCREATEREQUEST,
  '__module__' : 'backend_null_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NullDebugCreateRequest)
  })
_sym_db.RegisterMessage(NullDebugCreateRequest)

NullDebugCreateResponse = _reflection.GeneratedProtocolMessageType('NullDebugCreateResponse', (_message.Message,), {
  'DESCRIPTOR' : _NULLDEBUGCREATERESPONSE,
  '__module__' : 'backend_null_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NullDebugCreateResponse)
  })
_sym_db.RegisterMessage(NullDebugCreateResponse)

NullDebugDeleteRequest = _reflection.GeneratedProtocolMessageType('NullDebugDeleteRequest', (_message.Message,), {
  'DESCRIPTOR' : _NULLDEBUGDELETEREQUEST,
  '__module__' : 'backend_null_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NullDebugDeleteRequest)
  })
_sym_db.RegisterMessage(NullDebugDeleteRequest)

NullDebugDeleteResponse = _reflection.GeneratedProtocolMessageType('NullDebugDeleteResponse', (_message.Message,), {
  'DESCRIPTOR' : _NULLDEBUGDELETERESPONSE,
  '__module__' : 'backend_null_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NullDebugDeleteResponse)
  })
_sym_db.RegisterMessage(NullDebugDeleteResponse)

NullDebugUpdateRequest = _reflection.GeneratedProtocolMessageType('NullDebugUpdateRequest', (_message.Message,), {
  'DESCRIPTOR' : _NULLDEBUGUPDATEREQUEST,
  '__module__' : 'backend_null_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NullDebugUpdateRequest)
  })
_sym_db.RegisterMessage(NullDebugUpdateRequest)

NullDebugUpdateResponse = _reflection.GeneratedProtocolMessageType('NullDebugUpdateResponse', (_message.Message,), {
  'DESCRIPTOR' : _NULLDEBUGUPDATERESPONSE,
  '__module__' : 'backend_null_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NullDebugUpdateResponse)
  })
_sym_db.RegisterMessage(NullDebugUpdateResponse)

NullDebugListRequest = _reflection.GeneratedProtocolMessageType('NullDebugListRequest', (_message.Message,), {
  'DESCRIPTOR' : _NULLDEBUGLISTREQUEST,
  '__module__' : 'backend_null_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NullDebugListRequest)
  })
_sym_db.RegisterMessage(NullDebugListRequest)

NullDebugListResponse = _reflection.GeneratedProtocolMessageType('NullDebugListResponse', (_message.Message,), {
  'DESCRIPTOR' : _NULLDEBUGLISTRESPONSE,
  '__module__' : 'backend_null_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NullDebugListResponse)
  })
_sym_db.RegisterMessage(NullDebugListResponse)

NullDebugGetRequest = _reflection.GeneratedProtocolMessageType('NullDebugGetRequest', (_message.Message,), {
  'DESCRIPTOR' : _NULLDEBUGGETREQUEST,
  '__module__' : 'backend_null_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NullDebugGetRequest)
  })
_sym_db.RegisterMessage(NullDebugGetRequest)

NullDebugGetResponse = _reflection.GeneratedProtocolMessageType('NullDebugGetResponse', (_message.Message,), {
  'DESCRIPTOR' : _NULLDEBUGGETRESPONSE,
  '__module__' : 'backend_null_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NullDebugGetResponse)
  })
_sym_db.RegisterMessage(NullDebugGetResponse)

NullDebugStatsRequest = _reflection.GeneratedProtocolMessageType('NullDebugStatsRequest', (_message.Message,), {
  'DESCRIPTOR' : _NULLDEBUGSTATSREQUEST,
  '__module__' : 'backend_null_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NullDebugStatsRequest)
  })
_sym_db.RegisterMessage(NullDebugStatsRequest)

NullDebugStatsResponse = _reflection.GeneratedProtocolMessageType('NullDebugStatsResponse', (_message.Message,), {
  'DESCRIPTOR' : _NULLDEBUGSTATSRESPONSE,
  '__module__' : 'backend_null_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NullDebugStatsResponse)
  })
_sym_db.RegisterMessage(NullDebugStatsResponse)

_NULLDEBUGSERVICE = DESCRIPTOR.services_by_name['NullDebugService']
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/go'
  _NULLDEBUG._serialized_start=72
  _NULLDEBUG._serialized_end=188
  _NULLDEBUGCREATEREQUEST._serialized_start=190
  _NULLDEBUGCREATEREQUEST._serialized_end=261
  _NULLDEBUGCREATERESPONSE._serialized_start=263
  _NULLDEBUGCREATERESPONSE._serialized_end=288
  _NULLDEBUGDELETEREQUEST._serialized_start=290
  _NULLDEBUGDELETEREQUEST._serialized_end=326
  _NULLDEBUGDELETERESPONSE._serialized_start=328
  _NULLDEBUGDELETERESPONSE._serialized_end=353
  _NULLDEBUGUPDATEREQUEST._serialized_start=355
  _NULLDEBUGUPDATEREQUEST._serialized_end=426
  _NULLDEBUGUPDATERESPONSE._serialized_start=428
  _NULLDEBUGUPDATERESPONSE._serialized_end=453
  _NULLDEBUGLISTREQUEST._serialized_start=455
  _NULLDEBUGLISTREQUEST._serialized_end=477
  _NULLDEBUGLISTRESPONSE._serialized_start=479
  _NULLDEBUGLISTRESPONSE._serialized_end=549
  _NULLDEBUGGETREQUEST._serialized_start=551
  _NULLDEBUGGETREQUEST._serialized_end=584
  _NULLDEBUGGETRESPONSE._serialized_start=586
  _NULLDEBUGGETRESPONSE._serialized_end=655
  _NULLDEBUGSTATSREQUEST._serialized_start=657
  _NULLDEBUGSTATSREQUEST._serialized_end=692
  _NULLDEBUGSTATSRESPONSE._serialized_start=694
  _NULLDEBUGSTATSRESPONSE._serialized_end=745
  _NULLDEBUGSERVICE._serialized_start=748
  _NULLDEBUGSERVICE._serialized_end=1408
# @@protoc_insertion_point(module_scope)
