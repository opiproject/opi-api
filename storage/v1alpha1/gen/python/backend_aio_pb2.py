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


from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
import object_key_pb2 as object__key__pb2
import opicommon_pb2 as opicommon__pb2
import uuid_pb2 as uuid__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x11\x62\x61\x63kend_aio.proto\x12\x12opi_api.storage.v1\x1a\x17google/api/client.proto\x1a\x19google/api/resource.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a google/protobuf/field_mask.proto\x1a\x10object_key.proto\x1a\x0fopicommon.proto\x1a\nuuid.proto\"\xb5\x01\n\tAioVolume\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x12\n\nblock_size\x18\x02 \x01(\x03\x12\x14\n\x0c\x62locks_count\x18\x03 \x01(\x03\x12%\n\x04uuid\x18\x04 \x01(\x0b\x32\x17.opi_api.common.v1.Uuid\x12\x10\n\x08\x66ilename\x18\x05 \x01(\t:7\xea\x41\x34\n storage.opiproject.org/AioVolume\x12\x10volumes/{volume}\"g\n\x16\x43reateAioVolumeRequest\x12\x36\n\naio_volume\x18\x02 \x01(\x0b\x32\x1d.opi_api.storage.v1.AioVolumeB\x03\xe0\x41\x02\x12\x15\n\raio_volume_id\x18\x03 \x01(\t\"c\n\x16\x44\x65leteAioVolumeRequest\x12\x32\n\x04name\x18\x01 \x01(\tB$\xe0\x41\x02\xfa\x41\x1e\n\x1copi_api.storage.v1/AioVolume\x12\x15\n\rallow_missing\x18\x02 \x01(\x08\"\x93\x01\n\x16UpdateAioVolumeRequest\x12\x31\n\naio_volume\x18\x01 \x01(\x0b\x32\x1d.opi_api.storage.v1.AioVolume\x12/\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12\x15\n\rallow_missing\x18\x03 \x01(\x08\"t\n\x15ListAioVolumesRequest\x12\x34\n\x06parent\x18\x01 \x01(\tB$\xe0\x41\x02\xfa\x41\x1e\n\x1copi_api.storage.v1/AioVolume\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\"e\n\x16ListAioVolumesResponse\x12\x32\n\x0b\x61io_volumes\x18\x01 \x03(\x0b\x32\x1d.opi_api.storage.v1.AioVolume\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"I\n\x13GetAioVolumeRequest\x12\x32\n\x04name\x18\x01 \x01(\tB$\xe0\x41\x02\xfa\x41\x1e\n\x1copi_api.storage.v1/AioVolume\"E\n\x15\x41ioVolumeStatsRequest\x12,\n\x06handle\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"v\n\x16\x41ioVolumeStatsResponse\x12,\n\x06handle\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12.\n\x05stats\x18\x02 \x01(\x0b\x32\x1f.opi_api.storage.v1.VolumeStats2\xef\x06\n\x10\x41ioVolumeService\x12\x98\x01\n\x0f\x43reateAioVolume\x12*.opi_api.storage.v1.CreateAioVolumeRequest\x1a\x1d.opi_api.storage.v1.AioVolume\":\x82\xd3\xe4\x93\x02\x19\"\x0b/v1/volumes:\naio_volume\xda\x41\x18\x61io_volume,aio_volume_id\x12\x87\x01\n\x0f\x44\x65leteAioVolume\x12*.opi_api.storage.v1.DeleteAioVolumeRequest\x1a\x16.google.protobuf.Empty\"0\x82\xd3\xe4\x93\x02#*!/v1/{name=subsystems}/{subsystem}\xda\x41\x04name\x12\xab\x01\n\x0fUpdateAioVolume\x12*.opi_api.storage.v1.UpdateAioVolumeRequest\x1a\x1d.opi_api.storage.v1.AioVolume\"M\x82\xd3\xe4\x93\x02.2 /v1/{aio_volume.name=subsystems}:\naio_volume\xda\x41\x16\x61io_volume,update_mask\x12\x91\x01\n\x0eListAioVolumes\x12).opi_api.storage.v1.ListAioVolumesRequest\x1a*.opi_api.storage.v1.ListAioVolumesResponse\"(\x82\xd3\xe4\x93\x02\x19\x12\x17/v1/{parent=subsystems}\xda\x41\x06parent\x12\x88\x01\n\x0cGetAioVolume\x12\'.opi_api.storage.v1.GetAioVolumeRequest\x1a\x1d.opi_api.storage.v1.AioVolume\"0\x82\xd3\xe4\x93\x02#\x12!/v1/{name=subsystems}/{subsystem}\xda\x41\x04name\x12i\n\x0e\x41ioVolumeStats\x12).opi_api.storage.v1.AioVolumeStatsRequest\x1a*.opi_api.storage.v1.AioVolumeStatsResponse\"\x00\x42^\n\x12opi_api.storage.v1B\x0f\x42\x61\x63kendAioProtoP\x01Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/gob\x06proto3')



_AIOVOLUME = DESCRIPTOR.message_types_by_name['AioVolume']
_CREATEAIOVOLUMEREQUEST = DESCRIPTOR.message_types_by_name['CreateAioVolumeRequest']
_DELETEAIOVOLUMEREQUEST = DESCRIPTOR.message_types_by_name['DeleteAioVolumeRequest']
_UPDATEAIOVOLUMEREQUEST = DESCRIPTOR.message_types_by_name['UpdateAioVolumeRequest']
_LISTAIOVOLUMESREQUEST = DESCRIPTOR.message_types_by_name['ListAioVolumesRequest']
_LISTAIOVOLUMESRESPONSE = DESCRIPTOR.message_types_by_name['ListAioVolumesResponse']
_GETAIOVOLUMEREQUEST = DESCRIPTOR.message_types_by_name['GetAioVolumeRequest']
_AIOVOLUMESTATSREQUEST = DESCRIPTOR.message_types_by_name['AioVolumeStatsRequest']
_AIOVOLUMESTATSRESPONSE = DESCRIPTOR.message_types_by_name['AioVolumeStatsResponse']
AioVolume = _reflection.GeneratedProtocolMessageType('AioVolume', (_message.Message,), {
  'DESCRIPTOR' : _AIOVOLUME,
  '__module__' : 'backend_aio_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.AioVolume)
  })
_sym_db.RegisterMessage(AioVolume)

CreateAioVolumeRequest = _reflection.GeneratedProtocolMessageType('CreateAioVolumeRequest', (_message.Message,), {
  'DESCRIPTOR' : _CREATEAIOVOLUMEREQUEST,
  '__module__' : 'backend_aio_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.CreateAioVolumeRequest)
  })
_sym_db.RegisterMessage(CreateAioVolumeRequest)

DeleteAioVolumeRequest = _reflection.GeneratedProtocolMessageType('DeleteAioVolumeRequest', (_message.Message,), {
  'DESCRIPTOR' : _DELETEAIOVOLUMEREQUEST,
  '__module__' : 'backend_aio_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.DeleteAioVolumeRequest)
  })
_sym_db.RegisterMessage(DeleteAioVolumeRequest)

UpdateAioVolumeRequest = _reflection.GeneratedProtocolMessageType('UpdateAioVolumeRequest', (_message.Message,), {
  'DESCRIPTOR' : _UPDATEAIOVOLUMEREQUEST,
  '__module__' : 'backend_aio_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.UpdateAioVolumeRequest)
  })
_sym_db.RegisterMessage(UpdateAioVolumeRequest)

ListAioVolumesRequest = _reflection.GeneratedProtocolMessageType('ListAioVolumesRequest', (_message.Message,), {
  'DESCRIPTOR' : _LISTAIOVOLUMESREQUEST,
  '__module__' : 'backend_aio_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListAioVolumesRequest)
  })
_sym_db.RegisterMessage(ListAioVolumesRequest)

ListAioVolumesResponse = _reflection.GeneratedProtocolMessageType('ListAioVolumesResponse', (_message.Message,), {
  'DESCRIPTOR' : _LISTAIOVOLUMESRESPONSE,
  '__module__' : 'backend_aio_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListAioVolumesResponse)
  })
_sym_db.RegisterMessage(ListAioVolumesResponse)

GetAioVolumeRequest = _reflection.GeneratedProtocolMessageType('GetAioVolumeRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETAIOVOLUMEREQUEST,
  '__module__' : 'backend_aio_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.GetAioVolumeRequest)
  })
_sym_db.RegisterMessage(GetAioVolumeRequest)

AioVolumeStatsRequest = _reflection.GeneratedProtocolMessageType('AioVolumeStatsRequest', (_message.Message,), {
  'DESCRIPTOR' : _AIOVOLUMESTATSREQUEST,
  '__module__' : 'backend_aio_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.AioVolumeStatsRequest)
  })
_sym_db.RegisterMessage(AioVolumeStatsRequest)

AioVolumeStatsResponse = _reflection.GeneratedProtocolMessageType('AioVolumeStatsResponse', (_message.Message,), {
  'DESCRIPTOR' : _AIOVOLUMESTATSRESPONSE,
  '__module__' : 'backend_aio_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.AioVolumeStatsResponse)
  })
_sym_db.RegisterMessage(AioVolumeStatsResponse)

_AIOVOLUMESERVICE = DESCRIPTOR.services_by_name['AioVolumeService']
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\022opi_api.storage.v1B\017BackendAioProtoP\001Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/go'
  _AIOVOLUME._options = None
  _AIOVOLUME._serialized_options = b'\352A4\n storage.opiproject.org/AioVolume\022\020volumes/{volume}'
  _CREATEAIOVOLUMEREQUEST.fields_by_name['aio_volume']._options = None
  _CREATEAIOVOLUMEREQUEST.fields_by_name['aio_volume']._serialized_options = b'\340A\002'
  _DELETEAIOVOLUMEREQUEST.fields_by_name['name']._options = None
  _DELETEAIOVOLUMEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\036\n\034opi_api.storage.v1/AioVolume'
  _LISTAIOVOLUMESREQUEST.fields_by_name['parent']._options = None
  _LISTAIOVOLUMESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\036\n\034opi_api.storage.v1/AioVolume'
  _GETAIOVOLUMEREQUEST.fields_by_name['name']._options = None
  _GETAIOVOLUMEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\036\n\034opi_api.storage.v1/AioVolume'
  _AIOVOLUMESERVICE.methods_by_name['CreateAioVolume']._options = None
  _AIOVOLUMESERVICE.methods_by_name['CreateAioVolume']._serialized_options = b'\202\323\344\223\002\031\"\013/v1/volumes:\naio_volume\332A\030aio_volume,aio_volume_id'
  _AIOVOLUMESERVICE.methods_by_name['DeleteAioVolume']._options = None
  _AIOVOLUMESERVICE.methods_by_name['DeleteAioVolume']._serialized_options = b'\202\323\344\223\002#*!/v1/{name=subsystems}/{subsystem}\332A\004name'
  _AIOVOLUMESERVICE.methods_by_name['UpdateAioVolume']._options = None
  _AIOVOLUMESERVICE.methods_by_name['UpdateAioVolume']._serialized_options = b'\202\323\344\223\002.2 /v1/{aio_volume.name=subsystems}:\naio_volume\332A\026aio_volume,update_mask'
  _AIOVOLUMESERVICE.methods_by_name['ListAioVolumes']._options = None
  _AIOVOLUMESERVICE.methods_by_name['ListAioVolumes']._serialized_options = b'\202\323\344\223\002\031\022\027/v1/{parent=subsystems}\332A\006parent'
  _AIOVOLUMESERVICE.methods_by_name['GetAioVolume']._options = None
  _AIOVOLUMESERVICE.methods_by_name['GetAioVolume']._serialized_options = b'\202\323\344\223\002#\022!/v1/{name=subsystems}/{subsystem}\332A\004name'
  _AIOVOLUME._serialized_start=267
  _AIOVOLUME._serialized_end=448
  _CREATEAIOVOLUMEREQUEST._serialized_start=450
  _CREATEAIOVOLUMEREQUEST._serialized_end=553
  _DELETEAIOVOLUMEREQUEST._serialized_start=555
  _DELETEAIOVOLUMEREQUEST._serialized_end=654
  _UPDATEAIOVOLUMEREQUEST._serialized_start=657
  _UPDATEAIOVOLUMEREQUEST._serialized_end=804
  _LISTAIOVOLUMESREQUEST._serialized_start=806
  _LISTAIOVOLUMESREQUEST._serialized_end=922
  _LISTAIOVOLUMESRESPONSE._serialized_start=924
  _LISTAIOVOLUMESRESPONSE._serialized_end=1025
  _GETAIOVOLUMEREQUEST._serialized_start=1027
  _GETAIOVOLUMEREQUEST._serialized_end=1100
  _AIOVOLUMESTATSREQUEST._serialized_start=1102
  _AIOVOLUMESTATSREQUEST._serialized_end=1171
  _AIOVOLUMESTATSRESPONSE._serialized_start=1173
  _AIOVOLUMESTATSRESPONSE._serialized_end=1291
  _AIOVOLUMESERVICE._serialized_start=1294
  _AIOVOLUMESERVICE._serialized_end=2173
# @@protoc_insertion_point(module_scope)
