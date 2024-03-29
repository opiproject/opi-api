# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: frontend_virtio_blk.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


import opicommon_pb2 as opicommon__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x19\x66rontend_virtio_blk.proto\x12\x12opi_api.storage.v1\x1a\x0fopicommon.proto\x1a\x17google/api/client.proto\x1a\x19google/api/resource.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a google/protobuf/field_mask.proto\"\x88\x03\n\tVirtioBlk\x12\x18\n\x04name\x18\x01 \x01(\tB\x04\xe2\x41\x01\x08R\x04name\x12>\n\x07pcie_id\x18\x02 \x01(\x0b\x32\x1f.opi_api.storage.v1.PciEndpointB\x04\xe2\x41\x01\x02R\x06pcieId\x12,\n\x0fvolume_name_ref\x18\x03 \x01(\tB\x04\xe2\x41\x01\x02R\rvolumeNameRef\x12\"\n\nmax_io_qps\x18\x04 \x01(\x03\x42\x04\xe2\x41\x01\x01R\x08maxIoQps\x12?\n\tmin_limit\x18\x05 \x01(\x0b\x32\x1c.opi_api.storage.v1.QosLimitB\x04\xe2\x41\x01\x01R\x08minLimit\x12?\n\tmax_limit\x18\x06 \x01(\x0b\x32\x1c.opi_api.storage.v1.QosLimitB\x04\xe2\x41\x01\x01R\x08maxLimit:M\xea\x41J\n\x1copi_api.storage.v1/VirtioBlk\x12\x13virtioBlks/{volume}*\nvirtioBlks2\tvirtioBlk\"\x86\x01\n\x16\x43reateVirtioBlkRequest\x12\x42\n\nvirtio_blk\x18\x01 \x01(\x0b\x32\x1d.opi_api.storage.v1.VirtioBlkB\x04\xe2\x41\x01\x02R\tvirtioBlk\x12(\n\rvirtio_blk_id\x18\x02 \x01(\tB\x04\xe2\x41\x01\x01R\x0bvirtioBlkId\"~\n\x16\x44\x65leteVirtioBlkRequest\x12\x39\n\x04name\x18\x01 \x01(\tB%\xe2\x41\x01\x02\xfa\x41\x1e\n\x1copi_api.storage.v1/VirtioBlkR\x04name\x12)\n\rallow_missing\x18\x02 \x01(\x08\x42\x04\xe2\x41\x01\x01R\x0c\x61llowMissing\"\xca\x01\n\x16UpdateVirtioBlkRequest\x12\x42\n\nvirtio_blk\x18\x01 \x01(\x0b\x32\x1d.opi_api.storage.v1.VirtioBlkB\x04\xe2\x41\x01\x02R\tvirtioBlk\x12\x41\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x04\xe2\x41\x01\x01R\nupdateMask\x12)\n\rallow_missing\x18\x03 \x01(\x08\x42\x04\xe2\x41\x01\x01R\x0c\x61llowMissing\"_\n\x15ListVirtioBlksRequest\x12!\n\tpage_size\x18\x01 \x01(\x05\x42\x04\xe2\x41\x01\x01R\x08pageSize\x12#\n\npage_token\x18\x02 \x01(\tB\x04\xe2\x41\x01\x01R\tpageToken\"\x80\x01\n\x16ListVirtioBlksResponse\x12>\n\x0bvirtio_blks\x18\x01 \x03(\x0b\x32\x1d.opi_api.storage.v1.VirtioBlkR\nvirtioBlks\x12&\n\x0fnext_page_token\x18\x02 \x01(\tR\rnextPageToken\"P\n\x13GetVirtioBlkRequest\x12\x39\n\x04name\x18\x01 \x01(\tB%\xe2\x41\x01\x02\xfa\x41\x1e\n\x1copi_api.storage.v1/VirtioBlkR\x04name\"R\n\x15StatsVirtioBlkRequest\x12\x39\n\x04name\x18\x01 \x01(\tB%\xe2\x41\x01\x02\xfa\x41\x1e\n\x1copi_api.storage.v1/VirtioBlkR\x04name\"O\n\x16StatsVirtioBlkResponse\x12\x35\n\x05stats\x18\x01 \x01(\x0b\x32\x1f.opi_api.storage.v1.VolumeStatsR\x05stats2\x80\x07\n\x18\x46rontendVirtioBlkService\x12\x9b\x01\n\x0f\x43reateVirtioBlk\x12*.opi_api.storage.v1.CreateVirtioBlkRequest\x1a\x1d.opi_api.storage.v1.VirtioBlk\"=\xda\x41\x18virtio_blk,virtio_blk_id\x82\xd3\xe4\x93\x02\x1c\"\x0e/v1/virtioBlks:\nvirtio_blk\x12}\n\x0f\x44\x65leteVirtioBlk\x12*.opi_api.storage.v1.DeleteVirtioBlkRequest\x1a\x16.google.protobuf.Empty\"&\xda\x41\x04name\x82\xd3\xe4\x93\x02\x19*\x17/v1/{name=virtioBlks/*}\x12\xad\x01\n\x0fUpdateVirtioBlk\x12*.opi_api.storage.v1.UpdateVirtioBlkRequest\x1a\x1d.opi_api.storage.v1.VirtioBlk\"O\xda\x41\x16virtio_blk,update_mask\x82\xd3\xe4\x93\x02\x30\x32\"/v1/{virtio_blk.name=virtioBlks/*}:\nvirtio_blk\x12\x7f\n\x0eListVirtioBlks\x12).opi_api.storage.v1.ListVirtioBlksRequest\x1a*.opi_api.storage.v1.ListVirtioBlksResponse\"\x16\x82\xd3\xe4\x93\x02\x10\x12\x0e/v1/virtioBlks\x12~\n\x0cGetVirtioBlk\x12\'.opi_api.storage.v1.GetVirtioBlkRequest\x1a\x1d.opi_api.storage.v1.VirtioBlk\"&\xda\x41\x04name\x82\xd3\xe4\x93\x02\x19\x12\x17/v1/{name=virtioBlks/*}\x12\x95\x01\n\x0eStatsVirtioBlk\x12).opi_api.storage.v1.StatsVirtioBlkRequest\x1a*.opi_api.storage.v1.StatsVirtioBlkResponse\",\xda\x41\x04name\x82\xd3\xe4\x93\x02\x1f\x12\x1d/v1/{name=virtioBlks/*}:statsBe\n\x12opi_api.storage.v1B\x16\x46rontendVirtioBlkProtoP\x01Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/gob\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'frontend_virtio_blk_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\022opi_api.storage.v1B\026FrontendVirtioBlkProtoP\001Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/go'
  _globals['_VIRTIOBLK'].fields_by_name['name']._options = None
  _globals['_VIRTIOBLK'].fields_by_name['name']._serialized_options = b'\342A\001\010'
  _globals['_VIRTIOBLK'].fields_by_name['pcie_id']._options = None
  _globals['_VIRTIOBLK'].fields_by_name['pcie_id']._serialized_options = b'\342A\001\002'
  _globals['_VIRTIOBLK'].fields_by_name['volume_name_ref']._options = None
  _globals['_VIRTIOBLK'].fields_by_name['volume_name_ref']._serialized_options = b'\342A\001\002'
  _globals['_VIRTIOBLK'].fields_by_name['max_io_qps']._options = None
  _globals['_VIRTIOBLK'].fields_by_name['max_io_qps']._serialized_options = b'\342A\001\001'
  _globals['_VIRTIOBLK'].fields_by_name['min_limit']._options = None
  _globals['_VIRTIOBLK'].fields_by_name['min_limit']._serialized_options = b'\342A\001\001'
  _globals['_VIRTIOBLK'].fields_by_name['max_limit']._options = None
  _globals['_VIRTIOBLK'].fields_by_name['max_limit']._serialized_options = b'\342A\001\001'
  _globals['_VIRTIOBLK']._options = None
  _globals['_VIRTIOBLK']._serialized_options = b'\352AJ\n\034opi_api.storage.v1/VirtioBlk\022\023virtioBlks/{volume}*\nvirtioBlks2\tvirtioBlk'
  _globals['_CREATEVIRTIOBLKREQUEST'].fields_by_name['virtio_blk']._options = None
  _globals['_CREATEVIRTIOBLKREQUEST'].fields_by_name['virtio_blk']._serialized_options = b'\342A\001\002'
  _globals['_CREATEVIRTIOBLKREQUEST'].fields_by_name['virtio_blk_id']._options = None
  _globals['_CREATEVIRTIOBLKREQUEST'].fields_by_name['virtio_blk_id']._serialized_options = b'\342A\001\001'
  _globals['_DELETEVIRTIOBLKREQUEST'].fields_by_name['name']._options = None
  _globals['_DELETEVIRTIOBLKREQUEST'].fields_by_name['name']._serialized_options = b'\342A\001\002\372A\036\n\034opi_api.storage.v1/VirtioBlk'
  _globals['_DELETEVIRTIOBLKREQUEST'].fields_by_name['allow_missing']._options = None
  _globals['_DELETEVIRTIOBLKREQUEST'].fields_by_name['allow_missing']._serialized_options = b'\342A\001\001'
  _globals['_UPDATEVIRTIOBLKREQUEST'].fields_by_name['virtio_blk']._options = None
  _globals['_UPDATEVIRTIOBLKREQUEST'].fields_by_name['virtio_blk']._serialized_options = b'\342A\001\002'
  _globals['_UPDATEVIRTIOBLKREQUEST'].fields_by_name['update_mask']._options = None
  _globals['_UPDATEVIRTIOBLKREQUEST'].fields_by_name['update_mask']._serialized_options = b'\342A\001\001'
  _globals['_UPDATEVIRTIOBLKREQUEST'].fields_by_name['allow_missing']._options = None
  _globals['_UPDATEVIRTIOBLKREQUEST'].fields_by_name['allow_missing']._serialized_options = b'\342A\001\001'
  _globals['_LISTVIRTIOBLKSREQUEST'].fields_by_name['page_size']._options = None
  _globals['_LISTVIRTIOBLKSREQUEST'].fields_by_name['page_size']._serialized_options = b'\342A\001\001'
  _globals['_LISTVIRTIOBLKSREQUEST'].fields_by_name['page_token']._options = None
  _globals['_LISTVIRTIOBLKSREQUEST'].fields_by_name['page_token']._serialized_options = b'\342A\001\001'
  _globals['_GETVIRTIOBLKREQUEST'].fields_by_name['name']._options = None
  _globals['_GETVIRTIOBLKREQUEST'].fields_by_name['name']._serialized_options = b'\342A\001\002\372A\036\n\034opi_api.storage.v1/VirtioBlk'
  _globals['_STATSVIRTIOBLKREQUEST'].fields_by_name['name']._options = None
  _globals['_STATSVIRTIOBLKREQUEST'].fields_by_name['name']._serialized_options = b'\342A\001\002\372A\036\n\034opi_api.storage.v1/VirtioBlk'
  _globals['_FRONTENDVIRTIOBLKSERVICE'].methods_by_name['CreateVirtioBlk']._options = None
  _globals['_FRONTENDVIRTIOBLKSERVICE'].methods_by_name['CreateVirtioBlk']._serialized_options = b'\332A\030virtio_blk,virtio_blk_id\202\323\344\223\002\034\"\016/v1/virtioBlks:\nvirtio_blk'
  _globals['_FRONTENDVIRTIOBLKSERVICE'].methods_by_name['DeleteVirtioBlk']._options = None
  _globals['_FRONTENDVIRTIOBLKSERVICE'].methods_by_name['DeleteVirtioBlk']._serialized_options = b'\332A\004name\202\323\344\223\002\031*\027/v1/{name=virtioBlks/*}'
  _globals['_FRONTENDVIRTIOBLKSERVICE'].methods_by_name['UpdateVirtioBlk']._options = None
  _globals['_FRONTENDVIRTIOBLKSERVICE'].methods_by_name['UpdateVirtioBlk']._serialized_options = b'\332A\026virtio_blk,update_mask\202\323\344\223\00202\"/v1/{virtio_blk.name=virtioBlks/*}:\nvirtio_blk'
  _globals['_FRONTENDVIRTIOBLKSERVICE'].methods_by_name['ListVirtioBlks']._options = None
  _globals['_FRONTENDVIRTIOBLKSERVICE'].methods_by_name['ListVirtioBlks']._serialized_options = b'\202\323\344\223\002\020\022\016/v1/virtioBlks'
  _globals['_FRONTENDVIRTIOBLKSERVICE'].methods_by_name['GetVirtioBlk']._options = None
  _globals['_FRONTENDVIRTIOBLKSERVICE'].methods_by_name['GetVirtioBlk']._serialized_options = b'\332A\004name\202\323\344\223\002\031\022\027/v1/{name=virtioBlks/*}'
  _globals['_FRONTENDVIRTIOBLKSERVICE'].methods_by_name['StatsVirtioBlk']._options = None
  _globals['_FRONTENDVIRTIOBLKSERVICE'].methods_by_name['StatsVirtioBlk']._serialized_options = b'\332A\004name\202\323\344\223\002\037\022\035/v1/{name=virtioBlks/*}:stats'
  _globals['_VIRTIOBLK']._serialized_start=245
  _globals['_VIRTIOBLK']._serialized_end=637
  _globals['_CREATEVIRTIOBLKREQUEST']._serialized_start=640
  _globals['_CREATEVIRTIOBLKREQUEST']._serialized_end=774
  _globals['_DELETEVIRTIOBLKREQUEST']._serialized_start=776
  _globals['_DELETEVIRTIOBLKREQUEST']._serialized_end=902
  _globals['_UPDATEVIRTIOBLKREQUEST']._serialized_start=905
  _globals['_UPDATEVIRTIOBLKREQUEST']._serialized_end=1107
  _globals['_LISTVIRTIOBLKSREQUEST']._serialized_start=1109
  _globals['_LISTVIRTIOBLKSREQUEST']._serialized_end=1204
  _globals['_LISTVIRTIOBLKSRESPONSE']._serialized_start=1207
  _globals['_LISTVIRTIOBLKSRESPONSE']._serialized_end=1335
  _globals['_GETVIRTIOBLKREQUEST']._serialized_start=1337
  _globals['_GETVIRTIOBLKREQUEST']._serialized_end=1417
  _globals['_STATSVIRTIOBLKREQUEST']._serialized_start=1419
  _globals['_STATSVIRTIOBLKREQUEST']._serialized_end=1501
  _globals['_STATSVIRTIOBLKRESPONSE']._serialized_start=1503
  _globals['_STATSVIRTIOBLKRESPONSE']._serialized_end=1582
  _globals['_FRONTENDVIRTIOBLKSERVICE']._serialized_start=1585
  _globals['_FRONTENDVIRTIOBLKSERVICE']._serialized_end=2481
# @@protoc_insertion_point(module_scope)
