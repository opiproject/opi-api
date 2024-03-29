# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: middleend_qos_volume.proto
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


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1amiddleend_qos_volume.proto\x12\x12opi_api.storage.v1\x1a\x0fopicommon.proto\x1a\x17google/api/client.proto\x1a\x19google/api/resource.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a google/protobuf/field_mask.proto\"\xdc\x01\n\tQosVolume\x12\x18\n\x04name\x18\x01 \x01(\tB\x04\xe2\x41\x01\x08R\x04name\x12,\n\x0fvolume_name_ref\x18\x02 \x01(\tB\x04\xe2\x41\x01\x02R\rvolumeNameRef\x12\x38\n\x06limits\x18\x03 \x01(\x0b\x32\x1a.opi_api.storage.v1.LimitsB\x04\xe2\x41\x01\x02R\x06limits:M\xea\x41J\n\x1copi_api.storage.v1/QosVolume\x12\x13qosVolumes/{volume}*\nqosVolumes2\tqosVolume\"t\n\x06Limits\x12\x34\n\x03min\x18\x01 \x01(\x0b\x32\x1c.opi_api.storage.v1.QosLimitB\x04\xe2\x41\x01\x01R\x03min\x12\x34\n\x03max\x18\x02 \x01(\x0b\x32\x1c.opi_api.storage.v1.QosLimitB\x04\xe2\x41\x01\x01R\x03max\"\x86\x01\n\x16\x43reateQosVolumeRequest\x12\x42\n\nqos_volume\x18\x01 \x01(\x0b\x32\x1d.opi_api.storage.v1.QosVolumeB\x04\xe2\x41\x01\x02R\tqosVolume\x12(\n\rqos_volume_id\x18\x02 \x01(\tB\x04\xe2\x41\x01\x01R\x0bqosVolumeId\"~\n\x16\x44\x65leteQosVolumeRequest\x12\x39\n\x04name\x18\x01 \x01(\tB%\xe2\x41\x01\x02\xfa\x41\x1e\n\x1copi_api.storage.v1/QosVolumeR\x04name\x12)\n\rallow_missing\x18\x02 \x01(\x08\x42\x04\xe2\x41\x01\x01R\x0c\x61llowMissing\"\xca\x01\n\x16UpdateQosVolumeRequest\x12\x42\n\nqos_volume\x18\x01 \x01(\x0b\x32\x1d.opi_api.storage.v1.QosVolumeB\x04\xe2\x41\x01\x02R\tqosVolume\x12\x41\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x04\xe2\x41\x01\x01R\nupdateMask\x12)\n\rallow_missing\x18\x03 \x01(\x08\x42\x04\xe2\x41\x01\x01R\x0c\x61llowMissing\"\x9e\x01\n\x15ListQosVolumesRequest\x12=\n\x06parent\x18\x01 \x01(\tB%\xe2\x41\x01\x02\xfa\x41\x1e\x12\x1copi_api.storage.v1/QosVolumeR\x06parent\x12!\n\tpage_size\x18\x02 \x01(\x05\x42\x04\xe2\x41\x01\x01R\x08pageSize\x12#\n\npage_token\x18\x03 \x01(\tB\x04\xe2\x41\x01\x01R\tpageToken\"\x80\x01\n\x16ListQosVolumesResponse\x12>\n\x0bqos_volumes\x18\x01 \x03(\x0b\x32\x1d.opi_api.storage.v1.QosVolumeR\nqosVolumes\x12&\n\x0fnext_page_token\x18\x02 \x01(\tR\rnextPageToken\"P\n\x13GetQosVolumeRequest\x12\x39\n\x04name\x18\x01 \x01(\tB%\xe2\x41\x01\x02\xfa\x41\x1e\n\x1copi_api.storage.v1/QosVolumeR\x04name\"R\n\x15StatsQosVolumeRequest\x12\x39\n\x04name\x18\x01 \x01(\tB%\xe2\x41\x01\x02\xfa\x41\x1e\n\x1copi_api.storage.v1/QosVolumeR\x04name\"O\n\x16StatsQosVolumeResponse\x12\x35\n\x05stats\x18\x01 \x01(\x0b\x32\x1f.opi_api.storage.v1.VolumeStatsR\x05stats2\x91\x07\n\x19MiddleendQosVolumeService\x12\x9b\x01\n\x0f\x43reateQosVolume\x12*.opi_api.storage.v1.CreateQosVolumeRequest\x1a\x1d.opi_api.storage.v1.QosVolume\"=\xda\x41\x18qos_volume,qos_volume_id\x82\xd3\xe4\x93\x02\x1c\"\x0e/v1/qosVolumes:\nqos_volume\x12}\n\x0f\x44\x65leteQosVolume\x12*.opi_api.storage.v1.DeleteQosVolumeRequest\x1a\x16.google.protobuf.Empty\"&\xda\x41\x04name\x82\xd3\xe4\x93\x02\x19*\x17/v1/{name=qosVolumes/*}\x12\xad\x01\n\x0fUpdateQosVolume\x12*.opi_api.storage.v1.UpdateQosVolumeRequest\x1a\x1d.opi_api.storage.v1.QosVolume\"O\xda\x41\x16qos_volume,update_mask\x82\xd3\xe4\x93\x02\x30\x32\"/v1/{qos_volume.name=qosVolumes/*}:\nqos_volume\x12\x8e\x01\n\x0eListQosVolumes\x12).opi_api.storage.v1.ListQosVolumesRequest\x1a*.opi_api.storage.v1.ListQosVolumesResponse\"%\xda\x41\x06parent\x82\xd3\xe4\x93\x02\x16\x12\x14/v1/{parent=volumes}\x12~\n\x0cGetQosVolume\x12\'.opi_api.storage.v1.GetQosVolumeRequest\x1a\x1d.opi_api.storage.v1.QosVolume\"&\xda\x41\x04name\x82\xd3\xe4\x93\x02\x19\x12\x17/v1/{name=qosVolumes/*}\x12\x95\x01\n\x0eStatsQosVolume\x12).opi_api.storage.v1.StatsQosVolumeRequest\x1a*.opi_api.storage.v1.StatsQosVolumeResponse\",\xda\x41\x04name\x82\xd3\xe4\x93\x02\x1f\x12\x1d/v1/{name=qosVolumes/*}:statsBf\n\x12opi_api.storage.v1B\x17MiddleendQosVolumeProtoP\x01Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/gob\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'middleend_qos_volume_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\022opi_api.storage.v1B\027MiddleendQosVolumeProtoP\001Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/go'
  _globals['_QOSVOLUME'].fields_by_name['name']._options = None
  _globals['_QOSVOLUME'].fields_by_name['name']._serialized_options = b'\342A\001\010'
  _globals['_QOSVOLUME'].fields_by_name['volume_name_ref']._options = None
  _globals['_QOSVOLUME'].fields_by_name['volume_name_ref']._serialized_options = b'\342A\001\002'
  _globals['_QOSVOLUME'].fields_by_name['limits']._options = None
  _globals['_QOSVOLUME'].fields_by_name['limits']._serialized_options = b'\342A\001\002'
  _globals['_QOSVOLUME']._options = None
  _globals['_QOSVOLUME']._serialized_options = b'\352AJ\n\034opi_api.storage.v1/QosVolume\022\023qosVolumes/{volume}*\nqosVolumes2\tqosVolume'
  _globals['_LIMITS'].fields_by_name['min']._options = None
  _globals['_LIMITS'].fields_by_name['min']._serialized_options = b'\342A\001\001'
  _globals['_LIMITS'].fields_by_name['max']._options = None
  _globals['_LIMITS'].fields_by_name['max']._serialized_options = b'\342A\001\001'
  _globals['_CREATEQOSVOLUMEREQUEST'].fields_by_name['qos_volume']._options = None
  _globals['_CREATEQOSVOLUMEREQUEST'].fields_by_name['qos_volume']._serialized_options = b'\342A\001\002'
  _globals['_CREATEQOSVOLUMEREQUEST'].fields_by_name['qos_volume_id']._options = None
  _globals['_CREATEQOSVOLUMEREQUEST'].fields_by_name['qos_volume_id']._serialized_options = b'\342A\001\001'
  _globals['_DELETEQOSVOLUMEREQUEST'].fields_by_name['name']._options = None
  _globals['_DELETEQOSVOLUMEREQUEST'].fields_by_name['name']._serialized_options = b'\342A\001\002\372A\036\n\034opi_api.storage.v1/QosVolume'
  _globals['_DELETEQOSVOLUMEREQUEST'].fields_by_name['allow_missing']._options = None
  _globals['_DELETEQOSVOLUMEREQUEST'].fields_by_name['allow_missing']._serialized_options = b'\342A\001\001'
  _globals['_UPDATEQOSVOLUMEREQUEST'].fields_by_name['qos_volume']._options = None
  _globals['_UPDATEQOSVOLUMEREQUEST'].fields_by_name['qos_volume']._serialized_options = b'\342A\001\002'
  _globals['_UPDATEQOSVOLUMEREQUEST'].fields_by_name['update_mask']._options = None
  _globals['_UPDATEQOSVOLUMEREQUEST'].fields_by_name['update_mask']._serialized_options = b'\342A\001\001'
  _globals['_UPDATEQOSVOLUMEREQUEST'].fields_by_name['allow_missing']._options = None
  _globals['_UPDATEQOSVOLUMEREQUEST'].fields_by_name['allow_missing']._serialized_options = b'\342A\001\001'
  _globals['_LISTQOSVOLUMESREQUEST'].fields_by_name['parent']._options = None
  _globals['_LISTQOSVOLUMESREQUEST'].fields_by_name['parent']._serialized_options = b'\342A\001\002\372A\036\022\034opi_api.storage.v1/QosVolume'
  _globals['_LISTQOSVOLUMESREQUEST'].fields_by_name['page_size']._options = None
  _globals['_LISTQOSVOLUMESREQUEST'].fields_by_name['page_size']._serialized_options = b'\342A\001\001'
  _globals['_LISTQOSVOLUMESREQUEST'].fields_by_name['page_token']._options = None
  _globals['_LISTQOSVOLUMESREQUEST'].fields_by_name['page_token']._serialized_options = b'\342A\001\001'
  _globals['_GETQOSVOLUMEREQUEST'].fields_by_name['name']._options = None
  _globals['_GETQOSVOLUMEREQUEST'].fields_by_name['name']._serialized_options = b'\342A\001\002\372A\036\n\034opi_api.storage.v1/QosVolume'
  _globals['_STATSQOSVOLUMEREQUEST'].fields_by_name['name']._options = None
  _globals['_STATSQOSVOLUMEREQUEST'].fields_by_name['name']._serialized_options = b'\342A\001\002\372A\036\n\034opi_api.storage.v1/QosVolume'
  _globals['_MIDDLEENDQOSVOLUMESERVICE'].methods_by_name['CreateQosVolume']._options = None
  _globals['_MIDDLEENDQOSVOLUMESERVICE'].methods_by_name['CreateQosVolume']._serialized_options = b'\332A\030qos_volume,qos_volume_id\202\323\344\223\002\034\"\016/v1/qosVolumes:\nqos_volume'
  _globals['_MIDDLEENDQOSVOLUMESERVICE'].methods_by_name['DeleteQosVolume']._options = None
  _globals['_MIDDLEENDQOSVOLUMESERVICE'].methods_by_name['DeleteQosVolume']._serialized_options = b'\332A\004name\202\323\344\223\002\031*\027/v1/{name=qosVolumes/*}'
  _globals['_MIDDLEENDQOSVOLUMESERVICE'].methods_by_name['UpdateQosVolume']._options = None
  _globals['_MIDDLEENDQOSVOLUMESERVICE'].methods_by_name['UpdateQosVolume']._serialized_options = b'\332A\026qos_volume,update_mask\202\323\344\223\00202\"/v1/{qos_volume.name=qosVolumes/*}:\nqos_volume'
  _globals['_MIDDLEENDQOSVOLUMESERVICE'].methods_by_name['ListQosVolumes']._options = None
  _globals['_MIDDLEENDQOSVOLUMESERVICE'].methods_by_name['ListQosVolumes']._serialized_options = b'\332A\006parent\202\323\344\223\002\026\022\024/v1/{parent=volumes}'
  _globals['_MIDDLEENDQOSVOLUMESERVICE'].methods_by_name['GetQosVolume']._options = None
  _globals['_MIDDLEENDQOSVOLUMESERVICE'].methods_by_name['GetQosVolume']._serialized_options = b'\332A\004name\202\323\344\223\002\031\022\027/v1/{name=qosVolumes/*}'
  _globals['_MIDDLEENDQOSVOLUMESERVICE'].methods_by_name['StatsQosVolume']._options = None
  _globals['_MIDDLEENDQOSVOLUMESERVICE'].methods_by_name['StatsQosVolume']._serialized_options = b'\332A\004name\202\323\344\223\002\037\022\035/v1/{name=qosVolumes/*}:stats'
  _globals['_QOSVOLUME']._serialized_start=246
  _globals['_QOSVOLUME']._serialized_end=466
  _globals['_LIMITS']._serialized_start=468
  _globals['_LIMITS']._serialized_end=584
  _globals['_CREATEQOSVOLUMEREQUEST']._serialized_start=587
  _globals['_CREATEQOSVOLUMEREQUEST']._serialized_end=721
  _globals['_DELETEQOSVOLUMEREQUEST']._serialized_start=723
  _globals['_DELETEQOSVOLUMEREQUEST']._serialized_end=849
  _globals['_UPDATEQOSVOLUMEREQUEST']._serialized_start=852
  _globals['_UPDATEQOSVOLUMEREQUEST']._serialized_end=1054
  _globals['_LISTQOSVOLUMESREQUEST']._serialized_start=1057
  _globals['_LISTQOSVOLUMESREQUEST']._serialized_end=1215
  _globals['_LISTQOSVOLUMESRESPONSE']._serialized_start=1218
  _globals['_LISTQOSVOLUMESRESPONSE']._serialized_end=1346
  _globals['_GETQOSVOLUMEREQUEST']._serialized_start=1348
  _globals['_GETQOSVOLUMEREQUEST']._serialized_end=1428
  _globals['_STATSQOSVOLUMEREQUEST']._serialized_start=1430
  _globals['_STATSQOSVOLUMEREQUEST']._serialized_end=1512
  _globals['_STATSQOSVOLUMERESPONSE']._serialized_start=1514
  _globals['_STATSQOSVOLUMERESPONSE']._serialized_end=1593
  _globals['_MIDDLEENDQOSVOLUMESERVICE']._serialized_start=1596
  _globals['_MIDDLEENDQOSVOLUMESERVICE']._serialized_end=2509
# @@protoc_insertion_point(module_scope)
