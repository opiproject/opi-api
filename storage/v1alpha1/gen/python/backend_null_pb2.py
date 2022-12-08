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


from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
import object_key_pb2 as object__key__pb2
import uuid_pb2 as uuid__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x12\x62\x61\x63kend_null.proto\x12\x12opi_api.storage.v1\x1a\x17google/api/client.proto\x1a\x19google/api/resource.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a google/protobuf/field_mask.proto\x1a\x10object_key.proto\x1a\nuuid.proto\"\x8a\x01\n\tNullDebug\x12,\n\x06handle\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\x12\n\nblock_size\x18\x02 \x01(\x03\x12\x14\n\x0c\x62locks_count\x18\x03 \x01(\x03\x12%\n\x04uuid\x18\x04 \x01(\x0b\x32\x17.opi_api.common.v1.Uuid\"\x9d\x01\n\x16\x43reateNullDebugRequest\x12\x34\n\x06parent\x18\x01 \x01(\tB$\xe0\x41\x02\xfa\x41\x1e\n\x1copi_api.storage.v1/NullDebug\x12\x36\n\nnull_debug\x18\x02 \x01(\x0b\x32\x1d.opi_api.storage.v1.NullDebugB\x03\xe0\x41\x02\x12\x15\n\rnull_debug_id\x18\x03 \x01(\t\"L\n\x16\x44\x65leteNullDebugRequest\x12\x32\n\x04name\x18\x01 \x01(\tB$\xe0\x41\x02\xfa\x41\x1e\n\x1copi_api.storage.v1/NullDebug\"|\n\x16UpdateNullDebugRequest\x12\x31\n\nnull_debug\x18\x01 \x01(\x0b\x32\x1d.opi_api.storage.v1.NullDebug\x12/\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\"t\n\x15ListNullDebugsRequest\x12\x34\n\x06parent\x18\x01 \x01(\tB$\xe0\x41\x02\xfa\x41\x1e\n\x1copi_api.storage.v1/NullDebug\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\"e\n\x16ListNullDebugsResponse\x12\x32\n\x0bnull_debugs\x18\x01 \x03(\x0b\x32\x1d.opi_api.storage.v1.NullDebug\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"I\n\x13GetNullDebugRequest\x12\x32\n\x04name\x18\x01 \x01(\tB$\xe0\x41\x02\xfa\x41\x1e\n\x1copi_api.storage.v1/NullDebug\"E\n\x15NullDebugStatsRequest\x12,\n\x06handle\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"U\n\x16NullDebugStatsResponse\x12,\n\x06handle\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\r\n\x05stats\x18\x02 \x01(\t2\x82\x07\n\x10NullDebugService\x12\xab\x01\n\x0f\x43reateNullDebug\x12*.opi_api.storage.v1.CreateNullDebugRequest\x1a\x1d.opi_api.storage.v1.NullDebug\"M\x82\xd3\xe4\x93\x02%\"\x17/v1/{parent=subsystems}:\nnull_debug\xda\x41\x1fparent,null_debug,null_debug_id\x12\x87\x01\n\x0f\x44\x65leteNullDebug\x12*.opi_api.storage.v1.DeleteNullDebugRequest\x1a\x16.google.protobuf.Empty\"0\x82\xd3\xe4\x93\x02#*!/v1/{name=subsystems}/{subsystem}\xda\x41\x04name\x12\xab\x01\n\x0fUpdateNullDebug\x12*.opi_api.storage.v1.UpdateNullDebugRequest\x1a\x1d.opi_api.storage.v1.NullDebug\"M\x82\xd3\xe4\x93\x02.2 /v1/{null_debug.name=subsystems}:\nnull_debug\xda\x41\x16null_debug,update_mask\x12\x91\x01\n\x0eListNullDebugs\x12).opi_api.storage.v1.ListNullDebugsRequest\x1a*.opi_api.storage.v1.ListNullDebugsResponse\"(\x82\xd3\xe4\x93\x02\x19\x12\x17/v1/{parent=subsystems}\xda\x41\x06parent\x12\x88\x01\n\x0cGetNullDebug\x12\'.opi_api.storage.v1.GetNullDebugRequest\x1a\x1d.opi_api.storage.v1.NullDebug\"0\x82\xd3\xe4\x93\x02#\x12!/v1/{name=subsystems}/{subsystem}\xda\x41\x04name\x12i\n\x0eNullDebugStats\x12).opi_api.storage.v1.NullDebugStatsRequest\x1a*.opi_api.storage.v1.NullDebugStatsResponse\"\x00\x42_\n\x12opi_api.storage.v1B\x10\x42\x61\x63kendNullProtoP\x01Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/gob\x06proto3')



_NULLDEBUG = DESCRIPTOR.message_types_by_name['NullDebug']
_CREATENULLDEBUGREQUEST = DESCRIPTOR.message_types_by_name['CreateNullDebugRequest']
_DELETENULLDEBUGREQUEST = DESCRIPTOR.message_types_by_name['DeleteNullDebugRequest']
_UPDATENULLDEBUGREQUEST = DESCRIPTOR.message_types_by_name['UpdateNullDebugRequest']
_LISTNULLDEBUGSREQUEST = DESCRIPTOR.message_types_by_name['ListNullDebugsRequest']
_LISTNULLDEBUGSRESPONSE = DESCRIPTOR.message_types_by_name['ListNullDebugsResponse']
_GETNULLDEBUGREQUEST = DESCRIPTOR.message_types_by_name['GetNullDebugRequest']
_NULLDEBUGSTATSREQUEST = DESCRIPTOR.message_types_by_name['NullDebugStatsRequest']
_NULLDEBUGSTATSRESPONSE = DESCRIPTOR.message_types_by_name['NullDebugStatsResponse']
NullDebug = _reflection.GeneratedProtocolMessageType('NullDebug', (_message.Message,), {
  'DESCRIPTOR' : _NULLDEBUG,
  '__module__' : 'backend_null_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NullDebug)
  })
_sym_db.RegisterMessage(NullDebug)

CreateNullDebugRequest = _reflection.GeneratedProtocolMessageType('CreateNullDebugRequest', (_message.Message,), {
  'DESCRIPTOR' : _CREATENULLDEBUGREQUEST,
  '__module__' : 'backend_null_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.CreateNullDebugRequest)
  })
_sym_db.RegisterMessage(CreateNullDebugRequest)

DeleteNullDebugRequest = _reflection.GeneratedProtocolMessageType('DeleteNullDebugRequest', (_message.Message,), {
  'DESCRIPTOR' : _DELETENULLDEBUGREQUEST,
  '__module__' : 'backend_null_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.DeleteNullDebugRequest)
  })
_sym_db.RegisterMessage(DeleteNullDebugRequest)

UpdateNullDebugRequest = _reflection.GeneratedProtocolMessageType('UpdateNullDebugRequest', (_message.Message,), {
  'DESCRIPTOR' : _UPDATENULLDEBUGREQUEST,
  '__module__' : 'backend_null_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.UpdateNullDebugRequest)
  })
_sym_db.RegisterMessage(UpdateNullDebugRequest)

ListNullDebugsRequest = _reflection.GeneratedProtocolMessageType('ListNullDebugsRequest', (_message.Message,), {
  'DESCRIPTOR' : _LISTNULLDEBUGSREQUEST,
  '__module__' : 'backend_null_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListNullDebugsRequest)
  })
_sym_db.RegisterMessage(ListNullDebugsRequest)

ListNullDebugsResponse = _reflection.GeneratedProtocolMessageType('ListNullDebugsResponse', (_message.Message,), {
  'DESCRIPTOR' : _LISTNULLDEBUGSRESPONSE,
  '__module__' : 'backend_null_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListNullDebugsResponse)
  })
_sym_db.RegisterMessage(ListNullDebugsResponse)

GetNullDebugRequest = _reflection.GeneratedProtocolMessageType('GetNullDebugRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETNULLDEBUGREQUEST,
  '__module__' : 'backend_null_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.GetNullDebugRequest)
  })
_sym_db.RegisterMessage(GetNullDebugRequest)

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
  DESCRIPTOR._serialized_options = b'\n\022opi_api.storage.v1B\020BackendNullProtoP\001Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/go'
  _CREATENULLDEBUGREQUEST.fields_by_name['parent']._options = None
  _CREATENULLDEBUGREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\036\n\034opi_api.storage.v1/NullDebug'
  _CREATENULLDEBUGREQUEST.fields_by_name['null_debug']._options = None
  _CREATENULLDEBUGREQUEST.fields_by_name['null_debug']._serialized_options = b'\340A\002'
  _DELETENULLDEBUGREQUEST.fields_by_name['name']._options = None
  _DELETENULLDEBUGREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\036\n\034opi_api.storage.v1/NullDebug'
  _LISTNULLDEBUGSREQUEST.fields_by_name['parent']._options = None
  _LISTNULLDEBUGSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\036\n\034opi_api.storage.v1/NullDebug'
  _GETNULLDEBUGREQUEST.fields_by_name['name']._options = None
  _GETNULLDEBUGREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\036\n\034opi_api.storage.v1/NullDebug'
  _NULLDEBUGSERVICE.methods_by_name['CreateNullDebug']._options = None
  _NULLDEBUGSERVICE.methods_by_name['CreateNullDebug']._serialized_options = b'\202\323\344\223\002%\"\027/v1/{parent=subsystems}:\nnull_debug\332A\037parent,null_debug,null_debug_id'
  _NULLDEBUGSERVICE.methods_by_name['DeleteNullDebug']._options = None
  _NULLDEBUGSERVICE.methods_by_name['DeleteNullDebug']._serialized_options = b'\202\323\344\223\002#*!/v1/{name=subsystems}/{subsystem}\332A\004name'
  _NULLDEBUGSERVICE.methods_by_name['UpdateNullDebug']._options = None
  _NULLDEBUGSERVICE.methods_by_name['UpdateNullDebug']._serialized_options = b'\202\323\344\223\002.2 /v1/{null_debug.name=subsystems}:\nnull_debug\332A\026null_debug,update_mask'
  _NULLDEBUGSERVICE.methods_by_name['ListNullDebugs']._options = None
  _NULLDEBUGSERVICE.methods_by_name['ListNullDebugs']._serialized_options = b'\202\323\344\223\002\031\022\027/v1/{parent=subsystems}\332A\006parent'
  _NULLDEBUGSERVICE.methods_by_name['GetNullDebug']._options = None
  _NULLDEBUGSERVICE.methods_by_name['GetNullDebug']._serialized_options = b'\202\323\344\223\002#\022!/v1/{name=subsystems}/{subsystem}\332A\004name'
  _NULLDEBUG._serialized_start=251
  _NULLDEBUG._serialized_end=389
  _CREATENULLDEBUGREQUEST._serialized_start=392
  _CREATENULLDEBUGREQUEST._serialized_end=549
  _DELETENULLDEBUGREQUEST._serialized_start=551
  _DELETENULLDEBUGREQUEST._serialized_end=627
  _UPDATENULLDEBUGREQUEST._serialized_start=629
  _UPDATENULLDEBUGREQUEST._serialized_end=753
  _LISTNULLDEBUGSREQUEST._serialized_start=755
  _LISTNULLDEBUGSREQUEST._serialized_end=871
  _LISTNULLDEBUGSRESPONSE._serialized_start=873
  _LISTNULLDEBUGSRESPONSE._serialized_end=974
  _GETNULLDEBUGREQUEST._serialized_start=976
  _GETNULLDEBUGREQUEST._serialized_end=1049
  _NULLDEBUGSTATSREQUEST._serialized_start=1051
  _NULLDEBUGSTATSREQUEST._serialized_end=1120
  _NULLDEBUGSTATSRESPONSE._serialized_start=1122
  _NULLDEBUGSTATSRESPONSE._serialized_end=1207
  _NULLDEBUGSERVICE._serialized_start=1210
  _NULLDEBUGSERVICE._serialized_end=2108
# @@protoc_insertion_point(module_scope)
