# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: backend_aio.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
import object_key_pb2 as object__key__pb2
import uuid_pb2 as uuid__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x11\x62\x61\x63kend_aio.proto\x12\x12opi_api.storage.v1\x1a\x1bgoogle/protobuf/empty.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x10object_key.proto\x1a\nuuid.proto\"\xa0\x01\n\rAioController\x12,\n\x06handle\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\x12\n\nblock_size\x18\x02 \x01(\x03\x12\x14\n\x0c\x62locks_count\x18\x03 \x01(\x03\x12%\n\x04uuid\x18\x04 \x01(\x0b\x32\x17.opi_api.common.v1.Uuid\x12\x10\n\x08\x66ilename\x18\x05 \x01(\t\"O\n\x1a\x43reateAioControllerRequest\x12\x31\n\x06\x64\x65vice\x18\x01 \x01(\x0b\x32!.opi_api.storage.v1.AioController\"J\n\x1a\x44\x65leteAioControllerRequest\x12,\n\x06handle\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"O\n\x1aUpdateAioControllerRequest\x12\x31\n\x06\x64\x65vice\x18\x01 \x01(\x0b\x32!.opi_api.storage.v1.AioController\"A\n\x18ListAioControllerRequest\x12\x11\n\tpage_size\x18\x01 \x01(\x05\x12\x12\n\npage_token\x18\x02 \x01(\t\"h\n\x19ListAioControllerResponse\x12\x32\n\x07\x64\x65vices\x18\x01 \x03(\x0b\x32!.opi_api.storage.v1.AioController\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"G\n\x17GetAioControllerRequest\x12,\n\x06handle\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"I\n\x19\x41ioControllerStatsRequest\x12,\n\x06handle\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"Y\n\x1a\x41ioControllerStatsResponse\x12,\n\x06handle\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\r\n\x05stats\x18\x02 \x01(\t2\xc1\x06\n\x14\x41ioControllerService\x12\x8b\x01\n\x13\x43reateAioController\x12..opi_api.storage.v1.CreateAioControllerRequest\x1a!.opi_api.storage.v1.AioController\"!\x82\xd3\xe4\x93\x02\x1b\"\x0e/v1/subsystems:\tsubsystem\x12\x81\x01\n\x13\x44\x65leteAioController\x12..opi_api.storage.v1.DeleteAioControllerRequest\x1a\x16.google.protobuf.Empty\"\"\x82\xd3\xe4\x93\x02\x1c*\x1a/v1/subsystems/{subsystem}\x12\x8b\x01\n\x13UpdateAioController\x12..opi_api.storage.v1.UpdateAioControllerRequest\x1a!.opi_api.storage.v1.AioController\"!\x82\xd3\xe4\x93\x02\x1b\x32\x0e/v1/subsystems:\tsubsystem\x12\x88\x01\n\x11ListAioController\x12,.opi_api.storage.v1.ListAioControllerRequest\x1a-.opi_api.storage.v1.ListAioControllerResponse\"\x16\x82\xd3\xe4\x93\x02\x10\x12\x0e/v1/subsystems\x12\x86\x01\n\x10GetAioController\x12+.opi_api.storage.v1.GetAioControllerRequest\x1a!.opi_api.storage.v1.AioController\"\"\x82\xd3\xe4\x93\x02\x1c\x12\x1a/v1/subsystems/{subsystem}\x12u\n\x12\x41ioControllerStats\x12-.opi_api.storage.v1.AioControllerStatsRequest\x1a..opi_api.storage.v1.AioControllerStatsResponse\"\x00\x42^\n\x12opi_api.storage.v1B\x0f\x42\x61\x63kendAioProtoP\x01Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/gob\x06proto3')



_AIOCONTROLLER = DESCRIPTOR.message_types_by_name['AioController']
_CREATEAIOCONTROLLERREQUEST = DESCRIPTOR.message_types_by_name['CreateAioControllerRequest']
_DELETEAIOCONTROLLERREQUEST = DESCRIPTOR.message_types_by_name['DeleteAioControllerRequest']
_UPDATEAIOCONTROLLERREQUEST = DESCRIPTOR.message_types_by_name['UpdateAioControllerRequest']
_LISTAIOCONTROLLERREQUEST = DESCRIPTOR.message_types_by_name['ListAioControllerRequest']
_LISTAIOCONTROLLERRESPONSE = DESCRIPTOR.message_types_by_name['ListAioControllerResponse']
_GETAIOCONTROLLERREQUEST = DESCRIPTOR.message_types_by_name['GetAioControllerRequest']
_AIOCONTROLLERSTATSREQUEST = DESCRIPTOR.message_types_by_name['AioControllerStatsRequest']
_AIOCONTROLLERSTATSRESPONSE = DESCRIPTOR.message_types_by_name['AioControllerStatsResponse']
AioController = _reflection.GeneratedProtocolMessageType('AioController', (_message.Message,), {
  'DESCRIPTOR' : _AIOCONTROLLER,
  '__module__' : 'backend_aio_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.AioController)
  })
_sym_db.RegisterMessage(AioController)

CreateAioControllerRequest = _reflection.GeneratedProtocolMessageType('CreateAioControllerRequest', (_message.Message,), {
  'DESCRIPTOR' : _CREATEAIOCONTROLLERREQUEST,
  '__module__' : 'backend_aio_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.CreateAioControllerRequest)
  })
_sym_db.RegisterMessage(CreateAioControllerRequest)

DeleteAioControllerRequest = _reflection.GeneratedProtocolMessageType('DeleteAioControllerRequest', (_message.Message,), {
  'DESCRIPTOR' : _DELETEAIOCONTROLLERREQUEST,
  '__module__' : 'backend_aio_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.DeleteAioControllerRequest)
  })
_sym_db.RegisterMessage(DeleteAioControllerRequest)

UpdateAioControllerRequest = _reflection.GeneratedProtocolMessageType('UpdateAioControllerRequest', (_message.Message,), {
  'DESCRIPTOR' : _UPDATEAIOCONTROLLERREQUEST,
  '__module__' : 'backend_aio_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.UpdateAioControllerRequest)
  })
_sym_db.RegisterMessage(UpdateAioControllerRequest)

ListAioControllerRequest = _reflection.GeneratedProtocolMessageType('ListAioControllerRequest', (_message.Message,), {
  'DESCRIPTOR' : _LISTAIOCONTROLLERREQUEST,
  '__module__' : 'backend_aio_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListAioControllerRequest)
  })
_sym_db.RegisterMessage(ListAioControllerRequest)

ListAioControllerResponse = _reflection.GeneratedProtocolMessageType('ListAioControllerResponse', (_message.Message,), {
  'DESCRIPTOR' : _LISTAIOCONTROLLERRESPONSE,
  '__module__' : 'backend_aio_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListAioControllerResponse)
  })
_sym_db.RegisterMessage(ListAioControllerResponse)

GetAioControllerRequest = _reflection.GeneratedProtocolMessageType('GetAioControllerRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETAIOCONTROLLERREQUEST,
  '__module__' : 'backend_aio_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.GetAioControllerRequest)
  })
_sym_db.RegisterMessage(GetAioControllerRequest)

AioControllerStatsRequest = _reflection.GeneratedProtocolMessageType('AioControllerStatsRequest', (_message.Message,), {
  'DESCRIPTOR' : _AIOCONTROLLERSTATSREQUEST,
  '__module__' : 'backend_aio_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.AioControllerStatsRequest)
  })
_sym_db.RegisterMessage(AioControllerStatsRequest)

AioControllerStatsResponse = _reflection.GeneratedProtocolMessageType('AioControllerStatsResponse', (_message.Message,), {
  'DESCRIPTOR' : _AIOCONTROLLERSTATSRESPONSE,
  '__module__' : 'backend_aio_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.AioControllerStatsResponse)
  })
_sym_db.RegisterMessage(AioControllerStatsResponse)

_AIOCONTROLLERSERVICE = DESCRIPTOR.services_by_name['AioControllerService']
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\022opi_api.storage.v1B\017BackendAioProtoP\001Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/go'
  _AIOCONTROLLERSERVICE.methods_by_name['CreateAioController']._options = None
  _AIOCONTROLLERSERVICE.methods_by_name['CreateAioController']._serialized_options = b'\202\323\344\223\002\033\"\016/v1/subsystems:\tsubsystem'
  _AIOCONTROLLERSERVICE.methods_by_name['DeleteAioController']._options = None
  _AIOCONTROLLERSERVICE.methods_by_name['DeleteAioController']._serialized_options = b'\202\323\344\223\002\034*\032/v1/subsystems/{subsystem}'
  _AIOCONTROLLERSERVICE.methods_by_name['UpdateAioController']._options = None
  _AIOCONTROLLERSERVICE.methods_by_name['UpdateAioController']._serialized_options = b'\202\323\344\223\002\0332\016/v1/subsystems:\tsubsystem'
  _AIOCONTROLLERSERVICE.methods_by_name['ListAioController']._options = None
  _AIOCONTROLLERSERVICE.methods_by_name['ListAioController']._serialized_options = b'\202\323\344\223\002\020\022\016/v1/subsystems'
  _AIOCONTROLLERSERVICE.methods_by_name['GetAioController']._options = None
  _AIOCONTROLLERSERVICE.methods_by_name['GetAioController']._serialized_options = b'\202\323\344\223\002\034\022\032/v1/subsystems/{subsystem}'
  _AIOCONTROLLER._serialized_start=131
  _AIOCONTROLLER._serialized_end=291
  _CREATEAIOCONTROLLERREQUEST._serialized_start=293
  _CREATEAIOCONTROLLERREQUEST._serialized_end=372
  _DELETEAIOCONTROLLERREQUEST._serialized_start=374
  _DELETEAIOCONTROLLERREQUEST._serialized_end=448
  _UPDATEAIOCONTROLLERREQUEST._serialized_start=450
  _UPDATEAIOCONTROLLERREQUEST._serialized_end=529
  _LISTAIOCONTROLLERREQUEST._serialized_start=531
  _LISTAIOCONTROLLERREQUEST._serialized_end=596
  _LISTAIOCONTROLLERRESPONSE._serialized_start=598
  _LISTAIOCONTROLLERRESPONSE._serialized_end=702
  _GETAIOCONTROLLERREQUEST._serialized_start=704
  _GETAIOCONTROLLERREQUEST._serialized_end=775
  _AIOCONTROLLERSTATSREQUEST._serialized_start=777
  _AIOCONTROLLERSTATSREQUEST._serialized_end=850
  _AIOCONTROLLERSTATSRESPONSE._serialized_start=852
  _AIOCONTROLLERSTATSRESPONSE._serialized_end=941
  _AIOCONTROLLERSERVICE._serialized_start=944
  _AIOCONTROLLERSERVICE._serialized_end=1777
# @@protoc_insertion_point(module_scope)
