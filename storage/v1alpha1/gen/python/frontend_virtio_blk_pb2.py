# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: frontend_virtio_blk.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


import common_pb2 as common__pb2
import object_key_pb2 as object__key__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x19\x66rontend_virtio_blk.proto\x12\x12opi_api.storage.v1\x1a\x0c\x63ommon.proto\x1a\x10object_key.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a\x1cgoogle/api/annotations.proto\"\xa0\x01\n\tVirtioBlk\x12(\n\x02id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\x30\n\x07pcie_id\x18\x02 \x01(\x0b\x32\x1f.opi_api.storage.v1.PciEndpoint\x12\x0c\n\x04\x62\x64\x65v\x18\x03 \x01(\t\x12\x12\n\nmax_io_qps\x18\x04 \x01(\x03\x12\x15\n\rserial_number\x18\x05 \x01(\t\"K\n\x16\x43reateVirtioBlkRequest\x12\x31\n\ncontroller\x18\x01 \x01(\x0b\x32\x1d.opi_api.storage.v1.VirtioBlk\"M\n\x16\x44\x65leteVirtioBlkRequest\x12\x33\n\rcontroller_id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"K\n\x16UpdateVirtioBlkRequest\x12\x31\n\ncontroller\x18\x01 \x01(\x0b\x32\x1d.opi_api.storage.v1.VirtioBlk\"=\n\x14ListVirtioBlkRequest\x12\x11\n\tpage_size\x18\x01 \x01(\x05\x12\x12\n\npage_token\x18\x02 \x01(\t\"d\n\x15ListVirtioBlkResponse\x12\x32\n\x0b\x63ontrollers\x18\x01 \x03(\x0b\x32\x1d.opi_api.storage.v1.VirtioBlk\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"J\n\x13GetVirtioBlkRequest\x12\x33\n\rcontroller_id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"L\n\x15VirtioBlkStatsRequest\x12\x33\n\rcontroller_id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"Q\n\x16VirtioBlkStatsResponse\x12(\n\x02id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\r\n\x05stats\x18\x02 \x01(\t2\xfc\x05\n\x18\x46rontendVirtioBlkService\x12\x7f\n\x0f\x43reateVirtioBlk\x12*.opi_api.storage.v1.CreateVirtioBlkRequest\x1a\x1d.opi_api.storage.v1.VirtioBlk\"!\x82\xd3\xe4\x93\x02\x1b\"\x0e/v1/virtioblks:\tvirtioblk\x12y\n\x0f\x44\x65leteVirtioBlk\x12*.opi_api.storage.v1.DeleteVirtioBlkRequest\x1a\x16.google.protobuf.Empty\"\"\x82\xd3\xe4\x93\x02\x1c*\x1a/v1/virtioblks/{virtioblk}\x12\x7f\n\x0fUpdateVirtioBlk\x12*.opi_api.storage.v1.UpdateVirtioBlkRequest\x1a\x1d.opi_api.storage.v1.VirtioBlk\"!\x82\xd3\xe4\x93\x02\x1b\x32\x0e/v1/virtioblks:\tvirtioblk\x12|\n\rListVirtioBlk\x12(.opi_api.storage.v1.ListVirtioBlkRequest\x1a).opi_api.storage.v1.ListVirtioBlkResponse\"\x16\x82\xd3\xe4\x93\x02\x10\x12\x0e/v1/virtioblks\x12z\n\x0cGetVirtioBlk\x12\'.opi_api.storage.v1.GetVirtioBlkRequest\x1a\x1d.opi_api.storage.v1.VirtioBlk\"\"\x82\xd3\xe4\x93\x02\x1c\x12\x1a/v1/virtioblks/{virtioblk}\x12i\n\x0eVirtioBlkStats\x12).opi_api.storage.v1.VirtioBlkStatsRequest\x1a*.opi_api.storage.v1.VirtioBlkStatsResponse\"\x00\x42\x65\n\x12opi_api.storage.v1B\x16\x46rontendVirtioBlkProtoP\x01Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/gob\x06proto3')



_VIRTIOBLK = DESCRIPTOR.message_types_by_name['VirtioBlk']
_CREATEVIRTIOBLKREQUEST = DESCRIPTOR.message_types_by_name['CreateVirtioBlkRequest']
_DELETEVIRTIOBLKREQUEST = DESCRIPTOR.message_types_by_name['DeleteVirtioBlkRequest']
_UPDATEVIRTIOBLKREQUEST = DESCRIPTOR.message_types_by_name['UpdateVirtioBlkRequest']
_LISTVIRTIOBLKREQUEST = DESCRIPTOR.message_types_by_name['ListVirtioBlkRequest']
_LISTVIRTIOBLKRESPONSE = DESCRIPTOR.message_types_by_name['ListVirtioBlkResponse']
_GETVIRTIOBLKREQUEST = DESCRIPTOR.message_types_by_name['GetVirtioBlkRequest']
_VIRTIOBLKSTATSREQUEST = DESCRIPTOR.message_types_by_name['VirtioBlkStatsRequest']
_VIRTIOBLKSTATSRESPONSE = DESCRIPTOR.message_types_by_name['VirtioBlkStatsResponse']
VirtioBlk = _reflection.GeneratedProtocolMessageType('VirtioBlk', (_message.Message,), {
  'DESCRIPTOR' : _VIRTIOBLK,
  '__module__' : 'frontend_virtio_blk_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.VirtioBlk)
  })
_sym_db.RegisterMessage(VirtioBlk)

CreateVirtioBlkRequest = _reflection.GeneratedProtocolMessageType('CreateVirtioBlkRequest', (_message.Message,), {
  'DESCRIPTOR' : _CREATEVIRTIOBLKREQUEST,
  '__module__' : 'frontend_virtio_blk_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.CreateVirtioBlkRequest)
  })
_sym_db.RegisterMessage(CreateVirtioBlkRequest)

DeleteVirtioBlkRequest = _reflection.GeneratedProtocolMessageType('DeleteVirtioBlkRequest', (_message.Message,), {
  'DESCRIPTOR' : _DELETEVIRTIOBLKREQUEST,
  '__module__' : 'frontend_virtio_blk_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.DeleteVirtioBlkRequest)
  })
_sym_db.RegisterMessage(DeleteVirtioBlkRequest)

UpdateVirtioBlkRequest = _reflection.GeneratedProtocolMessageType('UpdateVirtioBlkRequest', (_message.Message,), {
  'DESCRIPTOR' : _UPDATEVIRTIOBLKREQUEST,
  '__module__' : 'frontend_virtio_blk_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.UpdateVirtioBlkRequest)
  })
_sym_db.RegisterMessage(UpdateVirtioBlkRequest)

ListVirtioBlkRequest = _reflection.GeneratedProtocolMessageType('ListVirtioBlkRequest', (_message.Message,), {
  'DESCRIPTOR' : _LISTVIRTIOBLKREQUEST,
  '__module__' : 'frontend_virtio_blk_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListVirtioBlkRequest)
  })
_sym_db.RegisterMessage(ListVirtioBlkRequest)

ListVirtioBlkResponse = _reflection.GeneratedProtocolMessageType('ListVirtioBlkResponse', (_message.Message,), {
  'DESCRIPTOR' : _LISTVIRTIOBLKRESPONSE,
  '__module__' : 'frontend_virtio_blk_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListVirtioBlkResponse)
  })
_sym_db.RegisterMessage(ListVirtioBlkResponse)

GetVirtioBlkRequest = _reflection.GeneratedProtocolMessageType('GetVirtioBlkRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETVIRTIOBLKREQUEST,
  '__module__' : 'frontend_virtio_blk_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.GetVirtioBlkRequest)
  })
_sym_db.RegisterMessage(GetVirtioBlkRequest)

VirtioBlkStatsRequest = _reflection.GeneratedProtocolMessageType('VirtioBlkStatsRequest', (_message.Message,), {
  'DESCRIPTOR' : _VIRTIOBLKSTATSREQUEST,
  '__module__' : 'frontend_virtio_blk_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.VirtioBlkStatsRequest)
  })
_sym_db.RegisterMessage(VirtioBlkStatsRequest)

VirtioBlkStatsResponse = _reflection.GeneratedProtocolMessageType('VirtioBlkStatsResponse', (_message.Message,), {
  'DESCRIPTOR' : _VIRTIOBLKSTATSRESPONSE,
  '__module__' : 'frontend_virtio_blk_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.VirtioBlkStatsResponse)
  })
_sym_db.RegisterMessage(VirtioBlkStatsResponse)

_FRONTENDVIRTIOBLKSERVICE = DESCRIPTOR.services_by_name['FrontendVirtioBlkService']
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\022opi_api.storage.v1B\026FrontendVirtioBlkProtoP\001Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/go'
  _FRONTENDVIRTIOBLKSERVICE.methods_by_name['CreateVirtioBlk']._options = None
  _FRONTENDVIRTIOBLKSERVICE.methods_by_name['CreateVirtioBlk']._serialized_options = b'\202\323\344\223\002\033\"\016/v1/virtioblks:\tvirtioblk'
  _FRONTENDVIRTIOBLKSERVICE.methods_by_name['DeleteVirtioBlk']._options = None
  _FRONTENDVIRTIOBLKSERVICE.methods_by_name['DeleteVirtioBlk']._serialized_options = b'\202\323\344\223\002\034*\032/v1/virtioblks/{virtioblk}'
  _FRONTENDVIRTIOBLKSERVICE.methods_by_name['UpdateVirtioBlk']._options = None
  _FRONTENDVIRTIOBLKSERVICE.methods_by_name['UpdateVirtioBlk']._serialized_options = b'\202\323\344\223\002\0332\016/v1/virtioblks:\tvirtioblk'
  _FRONTENDVIRTIOBLKSERVICE.methods_by_name['ListVirtioBlk']._options = None
  _FRONTENDVIRTIOBLKSERVICE.methods_by_name['ListVirtioBlk']._serialized_options = b'\202\323\344\223\002\020\022\016/v1/virtioblks'
  _FRONTENDVIRTIOBLKSERVICE.methods_by_name['GetVirtioBlk']._options = None
  _FRONTENDVIRTIOBLKSERVICE.methods_by_name['GetVirtioBlk']._serialized_options = b'\202\323\344\223\002\034\022\032/v1/virtioblks/{virtioblk}'
  _VIRTIOBLK._serialized_start=141
  _VIRTIOBLK._serialized_end=301
  _CREATEVIRTIOBLKREQUEST._serialized_start=303
  _CREATEVIRTIOBLKREQUEST._serialized_end=378
  _DELETEVIRTIOBLKREQUEST._serialized_start=380
  _DELETEVIRTIOBLKREQUEST._serialized_end=457
  _UPDATEVIRTIOBLKREQUEST._serialized_start=459
  _UPDATEVIRTIOBLKREQUEST._serialized_end=534
  _LISTVIRTIOBLKREQUEST._serialized_start=536
  _LISTVIRTIOBLKREQUEST._serialized_end=597
  _LISTVIRTIOBLKRESPONSE._serialized_start=599
  _LISTVIRTIOBLKRESPONSE._serialized_end=699
  _GETVIRTIOBLKREQUEST._serialized_start=701
  _GETVIRTIOBLKREQUEST._serialized_end=775
  _VIRTIOBLKSTATSREQUEST._serialized_start=777
  _VIRTIOBLKSTATSREQUEST._serialized_end=853
  _VIRTIOBLKSTATSRESPONSE._serialized_start=855
  _VIRTIOBLKSTATSRESPONSE._serialized_end=936
  _FRONTENDVIRTIOBLKSERVICE._serialized_start=939
  _FRONTENDVIRTIOBLKSERVICE._serialized_end=1703
# @@protoc_insertion_point(module_scope)
