# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: middleend_encryption.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


import opicommon_pb2 as opicommon__pb2
import object_key_pb2 as object__key__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1amiddleend_encryption.proto\x12\x12opi_api.storage.v1\x1a\x0fopicommon.proto\x1a\x10object_key.proto\x1a\x17google/api/client.proto\x1a\x19google/api/resource.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a google/protobuf/field_mask.proto\"\xe9\x01\n\x0f\x45ncryptedVolume\x12\x38\n\x04name\x18\x01 \x01(\tB*\xe0\x41\x03\xfa\x41$\n\"opi_api.storage.v1/EncryptedVolume\x12\x1c\n\x0fvolume_name_ref\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x0b\n\x03key\x18\x03 \x01(\x0c\x12\x32\n\x06\x63ipher\x18\x04 \x01(\x0e\x32\".opi_api.storage.v1.EncryptionType:=\xea\x41:\n&storage.opiproject.org/EncryptedVolume\x12\x10volumes/{volume}\"\x7f\n\x1c\x43reateEncryptedVolumeRequest\x12\x42\n\x10\x65ncrypted_volume\x18\x01 \x01(\x0b\x32#.opi_api.storage.v1.EncryptedVolumeB\x03\xe0\x41\x02\x12\x1b\n\x13\x65ncrypted_volume_id\x18\x02 \x01(\t\"o\n\x1c\x44\x65leteEncryptedVolumeRequest\x12\x38\n\x04name\x18\x01 \x01(\tB*\xe0\x41\x02\xfa\x41$\n\"opi_api.storage.v1/EncryptedVolume\x12\x15\n\rallow_missing\x18\x02 \x01(\x08\"\xa5\x01\n\x1cUpdateEncryptedVolumeRequest\x12=\n\x10\x65ncrypted_volume\x18\x01 \x01(\x0b\x32#.opi_api.storage.v1.EncryptedVolume\x12/\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12\x15\n\rallow_missing\x18\x03 \x01(\x08\"\x80\x01\n\x1bListEncryptedVolumesRequest\x12:\n\x06parent\x18\x01 \x01(\tB*\xe0\x41\x02\xfa\x41$\n\"opi_api.storage.v1/EncryptedVolume\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\"w\n\x1cListEncryptedVolumesResponse\x12>\n\x11\x65ncrypted_volumes\x18\x01 \x03(\x0b\x32#.opi_api.storage.v1.EncryptedVolume\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"U\n\x19GetEncryptedVolumeRequest\x12\x38\n\x04name\x18\x01 \x01(\tB*\xe0\x41\x02\xfa\x41$\n\"opi_api.storage.v1/EncryptedVolume\"W\n\x1b\x45ncryptedVolumeStatsRequest\x12\x38\n\x04name\x18\x01 \x01(\tB*\xe0\x41\x02\xfa\x41$\n\"opi_api.storage.v1/EncryptedVolume\"N\n\x1c\x45ncryptedVolumeStatsResponse\x12.\n\x05stats\x18\x01 \x01(\x0b\x32\x1f.opi_api.storage.v1.VolumeStats2\xf7\x07\n\x1aMiddleendEncryptionService\x12\xbc\x01\n\x15\x43reateEncryptedVolume\x12\x30.opi_api.storage.v1.CreateEncryptedVolumeRequest\x1a#.opi_api.storage.v1.EncryptedVolume\"L\x82\xd3\xe4\x93\x02\x1f\"\x0b/v1/volumes:\x10\x65ncrypted_volume\xda\x41$encrypted_volume,encrypted_volume_id\x12\x8d\x01\n\x15\x44\x65leteEncryptedVolume\x12\x30.opi_api.storage.v1.DeleteEncryptedVolumeRequest\x1a\x16.google.protobuf.Empty\"*\x82\xd3\xe4\x93\x02\x1d*\x1b/v1/{name=volumes}/{volume}\xda\x41\x04name\x12\xcf\x01\n\x15UpdateEncryptedVolume\x12\x30.opi_api.storage.v1.UpdateEncryptedVolumeRequest\x1a#.opi_api.storage.v1.EncryptedVolume\"_\x82\xd3\xe4\x93\x02:2&/v1/{encrypted_volume.name=subsystems}:\x10\x65ncrypted_volume\xda\x41\x1c\x65ncrypted_volume,update_mask\x12\xa0\x01\n\x14ListEncryptedVolumes\x12/.opi_api.storage.v1.ListEncryptedVolumesRequest\x1a\x30.opi_api.storage.v1.ListEncryptedVolumesResponse\"%\x82\xd3\xe4\x93\x02\x16\x12\x14/v1/{parent=volumes}\xda\x41\x06parent\x12\x97\x01\n\x12GetEncryptedVolume\x12-.opi_api.storage.v1.GetEncryptedVolumeRequest\x1a#.opi_api.storage.v1.EncryptedVolume\"-\x82\xd3\xe4\x93\x02 \x12\x1e/v1/{name=subsystems}/{volume}\xda\x41\x04name\x12{\n\x14\x45ncryptedVolumeStats\x12/.opi_api.storage.v1.EncryptedVolumeStatsRequest\x1a\x30.opi_api.storage.v1.EncryptedVolumeStatsResponse\"\x00\x42g\n\x12opi_api.storage.v1B\x18MiddleendEncryptionProtoP\x01Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/gob\x06proto3')



_ENCRYPTEDVOLUME = DESCRIPTOR.message_types_by_name['EncryptedVolume']
_CREATEENCRYPTEDVOLUMEREQUEST = DESCRIPTOR.message_types_by_name['CreateEncryptedVolumeRequest']
_DELETEENCRYPTEDVOLUMEREQUEST = DESCRIPTOR.message_types_by_name['DeleteEncryptedVolumeRequest']
_UPDATEENCRYPTEDVOLUMEREQUEST = DESCRIPTOR.message_types_by_name['UpdateEncryptedVolumeRequest']
_LISTENCRYPTEDVOLUMESREQUEST = DESCRIPTOR.message_types_by_name['ListEncryptedVolumesRequest']
_LISTENCRYPTEDVOLUMESRESPONSE = DESCRIPTOR.message_types_by_name['ListEncryptedVolumesResponse']
_GETENCRYPTEDVOLUMEREQUEST = DESCRIPTOR.message_types_by_name['GetEncryptedVolumeRequest']
_ENCRYPTEDVOLUMESTATSREQUEST = DESCRIPTOR.message_types_by_name['EncryptedVolumeStatsRequest']
_ENCRYPTEDVOLUMESTATSRESPONSE = DESCRIPTOR.message_types_by_name['EncryptedVolumeStatsResponse']
EncryptedVolume = _reflection.GeneratedProtocolMessageType('EncryptedVolume', (_message.Message,), {
  'DESCRIPTOR' : _ENCRYPTEDVOLUME,
  '__module__' : 'middleend_encryption_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.EncryptedVolume)
  })
_sym_db.RegisterMessage(EncryptedVolume)

CreateEncryptedVolumeRequest = _reflection.GeneratedProtocolMessageType('CreateEncryptedVolumeRequest', (_message.Message,), {
  'DESCRIPTOR' : _CREATEENCRYPTEDVOLUMEREQUEST,
  '__module__' : 'middleend_encryption_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.CreateEncryptedVolumeRequest)
  })
_sym_db.RegisterMessage(CreateEncryptedVolumeRequest)

DeleteEncryptedVolumeRequest = _reflection.GeneratedProtocolMessageType('DeleteEncryptedVolumeRequest', (_message.Message,), {
  'DESCRIPTOR' : _DELETEENCRYPTEDVOLUMEREQUEST,
  '__module__' : 'middleend_encryption_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.DeleteEncryptedVolumeRequest)
  })
_sym_db.RegisterMessage(DeleteEncryptedVolumeRequest)

UpdateEncryptedVolumeRequest = _reflection.GeneratedProtocolMessageType('UpdateEncryptedVolumeRequest', (_message.Message,), {
  'DESCRIPTOR' : _UPDATEENCRYPTEDVOLUMEREQUEST,
  '__module__' : 'middleend_encryption_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.UpdateEncryptedVolumeRequest)
  })
_sym_db.RegisterMessage(UpdateEncryptedVolumeRequest)

ListEncryptedVolumesRequest = _reflection.GeneratedProtocolMessageType('ListEncryptedVolumesRequest', (_message.Message,), {
  'DESCRIPTOR' : _LISTENCRYPTEDVOLUMESREQUEST,
  '__module__' : 'middleend_encryption_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListEncryptedVolumesRequest)
  })
_sym_db.RegisterMessage(ListEncryptedVolumesRequest)

ListEncryptedVolumesResponse = _reflection.GeneratedProtocolMessageType('ListEncryptedVolumesResponse', (_message.Message,), {
  'DESCRIPTOR' : _LISTENCRYPTEDVOLUMESRESPONSE,
  '__module__' : 'middleend_encryption_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListEncryptedVolumesResponse)
  })
_sym_db.RegisterMessage(ListEncryptedVolumesResponse)

GetEncryptedVolumeRequest = _reflection.GeneratedProtocolMessageType('GetEncryptedVolumeRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETENCRYPTEDVOLUMEREQUEST,
  '__module__' : 'middleend_encryption_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.GetEncryptedVolumeRequest)
  })
_sym_db.RegisterMessage(GetEncryptedVolumeRequest)

EncryptedVolumeStatsRequest = _reflection.GeneratedProtocolMessageType('EncryptedVolumeStatsRequest', (_message.Message,), {
  'DESCRIPTOR' : _ENCRYPTEDVOLUMESTATSREQUEST,
  '__module__' : 'middleend_encryption_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.EncryptedVolumeStatsRequest)
  })
_sym_db.RegisterMessage(EncryptedVolumeStatsRequest)

EncryptedVolumeStatsResponse = _reflection.GeneratedProtocolMessageType('EncryptedVolumeStatsResponse', (_message.Message,), {
  'DESCRIPTOR' : _ENCRYPTEDVOLUMESTATSRESPONSE,
  '__module__' : 'middleend_encryption_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.EncryptedVolumeStatsResponse)
  })
_sym_db.RegisterMessage(EncryptedVolumeStatsResponse)

_MIDDLEENDENCRYPTIONSERVICE = DESCRIPTOR.services_by_name['MiddleendEncryptionService']
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\022opi_api.storage.v1B\030MiddleendEncryptionProtoP\001Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/go'
  _ENCRYPTEDVOLUME.fields_by_name['name']._options = None
  _ENCRYPTEDVOLUME.fields_by_name['name']._serialized_options = b'\340A\003\372A$\n\"opi_api.storage.v1/EncryptedVolume'
  _ENCRYPTEDVOLUME.fields_by_name['volume_name_ref']._options = None
  _ENCRYPTEDVOLUME.fields_by_name['volume_name_ref']._serialized_options = b'\340A\002'
  _ENCRYPTEDVOLUME._options = None
  _ENCRYPTEDVOLUME._serialized_options = b'\352A:\n&storage.opiproject.org/EncryptedVolume\022\020volumes/{volume}'
  _CREATEENCRYPTEDVOLUMEREQUEST.fields_by_name['encrypted_volume']._options = None
  _CREATEENCRYPTEDVOLUMEREQUEST.fields_by_name['encrypted_volume']._serialized_options = b'\340A\002'
  _DELETEENCRYPTEDVOLUMEREQUEST.fields_by_name['name']._options = None
  _DELETEENCRYPTEDVOLUMEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A$\n\"opi_api.storage.v1/EncryptedVolume'
  _LISTENCRYPTEDVOLUMESREQUEST.fields_by_name['parent']._options = None
  _LISTENCRYPTEDVOLUMESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A$\n\"opi_api.storage.v1/EncryptedVolume'
  _GETENCRYPTEDVOLUMEREQUEST.fields_by_name['name']._options = None
  _GETENCRYPTEDVOLUMEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A$\n\"opi_api.storage.v1/EncryptedVolume'
  _ENCRYPTEDVOLUMESTATSREQUEST.fields_by_name['name']._options = None
  _ENCRYPTEDVOLUMESTATSREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A$\n\"opi_api.storage.v1/EncryptedVolume'
  _MIDDLEENDENCRYPTIONSERVICE.methods_by_name['CreateEncryptedVolume']._options = None
  _MIDDLEENDENCRYPTIONSERVICE.methods_by_name['CreateEncryptedVolume']._serialized_options = b'\202\323\344\223\002\037\"\013/v1/volumes:\020encrypted_volume\332A$encrypted_volume,encrypted_volume_id'
  _MIDDLEENDENCRYPTIONSERVICE.methods_by_name['DeleteEncryptedVolume']._options = None
  _MIDDLEENDENCRYPTIONSERVICE.methods_by_name['DeleteEncryptedVolume']._serialized_options = b'\202\323\344\223\002\035*\033/v1/{name=volumes}/{volume}\332A\004name'
  _MIDDLEENDENCRYPTIONSERVICE.methods_by_name['UpdateEncryptedVolume']._options = None
  _MIDDLEENDENCRYPTIONSERVICE.methods_by_name['UpdateEncryptedVolume']._serialized_options = b'\202\323\344\223\002:2&/v1/{encrypted_volume.name=subsystems}:\020encrypted_volume\332A\034encrypted_volume,update_mask'
  _MIDDLEENDENCRYPTIONSERVICE.methods_by_name['ListEncryptedVolumes']._options = None
  _MIDDLEENDENCRYPTIONSERVICE.methods_by_name['ListEncryptedVolumes']._serialized_options = b'\202\323\344\223\002\026\022\024/v1/{parent=volumes}\332A\006parent'
  _MIDDLEENDENCRYPTIONSERVICE.methods_by_name['GetEncryptedVolume']._options = None
  _MIDDLEENDENCRYPTIONSERVICE.methods_by_name['GetEncryptedVolume']._serialized_options = b'\202\323\344\223\002 \022\036/v1/{name=subsystems}/{volume}\332A\004name'
  _ENCRYPTEDVOLUME._serialized_start=264
  _ENCRYPTEDVOLUME._serialized_end=497
  _CREATEENCRYPTEDVOLUMEREQUEST._serialized_start=499
  _CREATEENCRYPTEDVOLUMEREQUEST._serialized_end=626
  _DELETEENCRYPTEDVOLUMEREQUEST._serialized_start=628
  _DELETEENCRYPTEDVOLUMEREQUEST._serialized_end=739
  _UPDATEENCRYPTEDVOLUMEREQUEST._serialized_start=742
  _UPDATEENCRYPTEDVOLUMEREQUEST._serialized_end=907
  _LISTENCRYPTEDVOLUMESREQUEST._serialized_start=910
  _LISTENCRYPTEDVOLUMESREQUEST._serialized_end=1038
  _LISTENCRYPTEDVOLUMESRESPONSE._serialized_start=1040
  _LISTENCRYPTEDVOLUMESRESPONSE._serialized_end=1159
  _GETENCRYPTEDVOLUMEREQUEST._serialized_start=1161
  _GETENCRYPTEDVOLUMEREQUEST._serialized_end=1246
  _ENCRYPTEDVOLUMESTATSREQUEST._serialized_start=1248
  _ENCRYPTEDVOLUMESTATSREQUEST._serialized_end=1335
  _ENCRYPTEDVOLUMESTATSRESPONSE._serialized_start=1337
  _ENCRYPTEDVOLUMESTATSRESPONSE._serialized_end=1415
  _MIDDLEENDENCRYPTIONSERVICE._serialized_start=1418
  _MIDDLEENDENCRYPTIONSERVICE._serialized_end=2433
# @@protoc_insertion_point(module_scope)
