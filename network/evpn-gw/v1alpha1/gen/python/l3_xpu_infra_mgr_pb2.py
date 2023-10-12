# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: l3_xpu_infra_mgr.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


import networktypes_pb2 as networktypes__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x16l3_xpu_infra_mgr.proto\x12 opi_api.network.evpn_gw.v1alpha1\x1a\x12networktypes.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a google/protobuf/field_mask.proto\x1a\x19google/api/resource.proto\"\xda\x01\n\x03Vrf\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x08\x12<\n\x04spec\x18\x02 \x01(\x0b\x32).opi_api.network.evpn_gw.v1alpha1.VrfSpecB\x03\xe0\x41\x02\x12@\n\x06status\x18\x03 \x01(\x0b\x32+.opi_api.network.evpn_gw.v1alpha1.VrfStatusB\x03\xe0\x41\x03:@\xea\x41=\n$opi_api.network.evpn_gw.v1alpha1/Vrf\x12\nvrfs/{vrf}*\x04vrfs2\x03vrf\"\xc8\x01\n\x07VrfSpec\x12\x15\n\x03vni\x18\x01 \x01(\rB\x03\xe0\x41\x01H\x00\x88\x01\x01\x12P\n\x12loopback_ip_prefix\x18\x02 \x01(\x0b\x32/.opi_api.network.opinetcommon.v1alpha1.IPPrefixB\x03\xe0\x41\x02\x12L\n\x0evtep_ip_prefix\x18\x03 \x01(\x0b\x32/.opi_api.network.opinetcommon.v1alpha1.IPPrefixB\x03\xe0\x41\x01\x42\x06\n\x04_vni\"\xfd\x01\n\tVrfStatus\x12\x1a\n\rrouting_table\x18\x01 \x01(\rB\x03\xe0\x41\x03\x12\x15\n\x08local_as\x18\x02 \x01(\rB\x03\xe0\x41\x03\x12\x0f\n\x02rd\x18\x03 \x01(\tB\x03\xe0\x41\x03\x12\x11\n\x04rmac\x18\x04 \x01(\x0c\x42\x03\xe0\x41\x03\x12\x17\n\nimport_rts\x18\x05 \x03(\tB\x03\xe0\x41\x03\x12\x17\n\nexport_rts\x18\x06 \x03(\tB\x03\xe0\x41\x03\x12\x1c\n\x0flogical_bridges\x18\x07 \x03(\tB\x03\xe0\x41\x03\x12I\n\x0boper_status\x18\x08 \x01(\x0e\x32/.opi_api.network.evpn_gw.v1alpha1.VRFOperStatusB\x03\xe0\x41\x03\"`\n\x10\x43reateVrfRequest\x12\x13\n\x06vrf_id\x18\x01 \x01(\tB\x03\xe0\x41\x01\x12\x37\n\x03vrf\x18\x02 \x01(\x0b\x32%.opi_api.network.evpn_gw.v1alpha1.VrfB\x03\xe0\x41\x02\"B\n\x0fListVrfsRequest\x12\x16\n\tpage_size\x18\x01 \x01(\x05\x42\x03\xe0\x41\x01\x12\x17\n\npage_token\x18\x02 \x01(\tB\x03\xe0\x41\x01\"`\n\x10ListVrfsResponse\x12\x33\n\x04vrfs\x18\x01 \x03(\x0b\x32%.opi_api.network.evpn_gw.v1alpha1.Vrf\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"K\n\rGetVrfRequest\x12:\n\x04name\x18\x01 \x01(\tB,\xe0\x41\x02\xfa\x41&\n$opi_api.network.evpn_gw.v1alpha1/Vrf\"j\n\x10\x44\x65leteVrfRequest\x12:\n\x04name\x18\x01 \x01(\tB,\xe0\x41\x02\xfa\x41&\n$opi_api.network.evpn_gw.v1alpha1/Vrf\x12\x1a\n\rallow_missing\x18\x02 \x01(\x08\x42\x03\xe0\x41\x01\"\x9d\x01\n\x10UpdateVrfRequest\x12\x37\n\x03vrf\x18\x01 \x01(\x0b\x32%.opi_api.network.evpn_gw.v1alpha1.VrfB\x03\xe0\x41\x02\x12\x34\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x01\x12\x1a\n\rallow_missing\x18\x03 \x01(\x08\x42\x03\xe0\x41\x01\"\xda\x01\n\x03Svi\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x08\x12<\n\x04spec\x18\x02 \x01(\x0b\x32).opi_api.network.evpn_gw.v1alpha1.SviSpecB\x03\xe0\x41\x02\x12@\n\x06status\x18\x03 \x01(\x0b\x32+.opi_api.network.evpn_gw.v1alpha1.SviStatusB\x03\xe0\x41\x03:@\xea\x41=\n$opi_api.network.evpn_gw.v1alpha1/Svi\x12\nsvis/{svi}*\x04svis2\x03svi\"\xab\x02\n\x07SviSpec\x12\x39\n\x03vrf\x18\x01 \x01(\tB,\xe0\x41\x02\xfa\x41&\n$opi_api.network.evpn_gw.v1alpha1/Vrf\x12N\n\x0elogical_bridge\x18\x02 \x01(\tB6\xe0\x41\x02\xfa\x41\x30\n.opi_api.network.evpn_gw.v1alpha1/LogicalBridge\x12\x18\n\x0bmac_address\x18\x03 \x01(\x0c\x42\x03\xe0\x41\x02\x12J\n\x0cgw_ip_prefix\x18\x04 \x03(\x0b\x32/.opi_api.network.opinetcommon.v1alpha1.IPPrefixB\x03\xe0\x41\x02\x12\x17\n\nenable_bgp\x18\x05 \x01(\x08\x42\x03\xe0\x41\x01\x12\x16\n\tremote_as\x18\x06 \x01(\rB\x03\xe0\x41\x01\"V\n\tSviStatus\x12I\n\x0boper_status\x18\x01 \x01(\x0e\x32/.opi_api.network.evpn_gw.v1alpha1.SVIOperStatusB\x03\xe0\x41\x03\"`\n\x10\x43reateSviRequest\x12\x13\n\x06svi_id\x18\x01 \x01(\tB\x03\xe0\x41\x01\x12\x37\n\x03svi\x18\x02 \x01(\x0b\x32%.opi_api.network.evpn_gw.v1alpha1.SviB\x03\xe0\x41\x02\"B\n\x0fListSvisRequest\x12\x16\n\tpage_size\x18\x01 \x01(\x05\x42\x03\xe0\x41\x01\x12\x17\n\npage_token\x18\x02 \x01(\tB\x03\xe0\x41\x01\"`\n\x10ListSvisResponse\x12\x33\n\x04svis\x18\x01 \x03(\x0b\x32%.opi_api.network.evpn_gw.v1alpha1.Svi\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"K\n\rGetSviRequest\x12:\n\x04name\x18\x01 \x01(\tB,\xe0\x41\x02\xfa\x41&\n$opi_api.network.evpn_gw.v1alpha1/Svi\"j\n\x10\x44\x65leteSviRequest\x12:\n\x04name\x18\x01 \x01(\tB,\xe0\x41\x02\xfa\x41&\n$opi_api.network.evpn_gw.v1alpha1/Svi\x12\x1a\n\rallow_missing\x18\x02 \x01(\x08\x42\x03\xe0\x41\x01\"\x9d\x01\n\x10UpdateSviRequest\x12\x37\n\x03svi\x18\x01 \x01(\x0b\x32%.opi_api.network.evpn_gw.v1alpha1.SviB\x03\xe0\x41\x02\x12\x34\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x01\x12\x1a\n\rallow_missing\x18\x03 \x01(\x08\x42\x03\xe0\x41\x01*b\n\rVRFOperStatus\x12\x1f\n\x1bVRF_OPER_STATUS_UNSPECIFIED\x10\x00\x12\x16\n\x12VRF_OPER_STATUS_UP\x10\x01\x12\x18\n\x14VRF_OPER_STATUS_DOWN\x10\x02*b\n\rSVIOperStatus\x12\x1f\n\x1bSVI_OPER_STATUS_UNSPECIFIED\x10\x00\x12\x16\n\x12SVI_OPER_STATUS_UP\x10\x01\x12\x18\n\x14SVI_OPER_STATUS_DOWN\x10\x02\x32\xbe\x05\n\nVrfService\x12\x8a\x01\n\tCreateVrf\x12\x32.opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest\x1a%.opi_api.network.evpn_gw.v1alpha1.Vrf\"\"\x82\xd3\xe4\x93\x02\x0f\"\x08/v1/vrfs:\x03vrf\xda\x41\nvrf,vrf_id\x12\x83\x01\n\x08ListVrfs\x12\x31.opi_api.network.evpn_gw.v1alpha1.ListVrfsRequest\x1a\x32.opi_api.network.evpn_gw.v1alpha1.ListVrfsResponse\"\x10\x82\xd3\xe4\x93\x02\n\x12\x08/v1/vrfs\x12\x82\x01\n\x06GetVrf\x12/.opi_api.network.evpn_gw.v1alpha1.GetVrfRequest\x1a%.opi_api.network.evpn_gw.v1alpha1.Vrf\" \x82\xd3\xe4\x93\x02\x13\x12\x11/v1/{name=vrfs/*}\xda\x41\x04name\x12y\n\tDeleteVrf\x12\x32.opi_api.network.evpn_gw.v1alpha1.DeleteVrfRequest\x1a\x16.google.protobuf.Empty\" \x82\xd3\xe4\x93\x02\x13*\x11/v1/{name=vrfs/*}\xda\x41\x04name\x12\x9c\x01\n\tUpdateVrf\x12\x32.opi_api.network.evpn_gw.v1alpha1.UpdateVrfRequest\x1a%.opi_api.network.evpn_gw.v1alpha1.Vrf\"4\x82\xd3\xe4\x93\x02\x1c\x32\x15/v1/{vrf.name=vrfs/*}:\x03vrf\xda\x41\x0fvrf,update_mask2\xbe\x05\n\nSviService\x12\x8a\x01\n\tCreateSvi\x12\x32.opi_api.network.evpn_gw.v1alpha1.CreateSviRequest\x1a%.opi_api.network.evpn_gw.v1alpha1.Svi\"\"\x82\xd3\xe4\x93\x02\x0f\"\x08/v1/svis:\x03svi\xda\x41\nsvi,svi_id\x12\x83\x01\n\x08ListSvis\x12\x31.opi_api.network.evpn_gw.v1alpha1.ListSvisRequest\x1a\x32.opi_api.network.evpn_gw.v1alpha1.ListSvisResponse\"\x10\x82\xd3\xe4\x93\x02\n\x12\x08/v1/svis\x12\x82\x01\n\x06GetSvi\x12/.opi_api.network.evpn_gw.v1alpha1.GetSviRequest\x1a%.opi_api.network.evpn_gw.v1alpha1.Svi\" \x82\xd3\xe4\x93\x02\x13\x12\x11/v1/{name=svis/*}\xda\x41\x04name\x12y\n\tDeleteSvi\x12\x32.opi_api.network.evpn_gw.v1alpha1.DeleteSviRequest\x1a\x16.google.protobuf.Empty\" \x82\xd3\xe4\x93\x02\x13*\x11/v1/{name=svis/*}\xda\x41\x04name\x12\x9c\x01\n\tUpdateSvi\x12\x32.opi_api.network.evpn_gw.v1alpha1.UpdateSviRequest\x1a%.opi_api.network.evpn_gw.v1alpha1.Svi\"4\x82\xd3\xe4\x93\x02\x1c\x32\x15/v1/{svi.name=svis/*}:\x03svi\xda\x41\x0fsvi,update_maskBw\n opi_api.network.evpn_gw.v1alpha1B\x12L3XpuInfraMgrProtoP\x01Z=github.com/opiproject/opi-api/network/evpn-gw/v1alpha1/gen/gob\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'l3_xpu_infra_mgr_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n opi_api.network.evpn_gw.v1alpha1B\022L3XpuInfraMgrProtoP\001Z=github.com/opiproject/opi-api/network/evpn-gw/v1alpha1/gen/go'
  _VRF.fields_by_name['name']._options = None
  _VRF.fields_by_name['name']._serialized_options = b'\340A\010'
  _VRF.fields_by_name['spec']._options = None
  _VRF.fields_by_name['spec']._serialized_options = b'\340A\002'
  _VRF.fields_by_name['status']._options = None
  _VRF.fields_by_name['status']._serialized_options = b'\340A\003'
  _VRF._options = None
  _VRF._serialized_options = b'\352A=\n$opi_api.network.evpn_gw.v1alpha1/Vrf\022\nvrfs/{vrf}*\004vrfs2\003vrf'
  _VRFSPEC.fields_by_name['vni']._options = None
  _VRFSPEC.fields_by_name['vni']._serialized_options = b'\340A\001'
  _VRFSPEC.fields_by_name['loopback_ip_prefix']._options = None
  _VRFSPEC.fields_by_name['loopback_ip_prefix']._serialized_options = b'\340A\002'
  _VRFSPEC.fields_by_name['vtep_ip_prefix']._options = None
  _VRFSPEC.fields_by_name['vtep_ip_prefix']._serialized_options = b'\340A\001'
  _VRFSTATUS.fields_by_name['routing_table']._options = None
  _VRFSTATUS.fields_by_name['routing_table']._serialized_options = b'\340A\003'
  _VRFSTATUS.fields_by_name['local_as']._options = None
  _VRFSTATUS.fields_by_name['local_as']._serialized_options = b'\340A\003'
  _VRFSTATUS.fields_by_name['rd']._options = None
  _VRFSTATUS.fields_by_name['rd']._serialized_options = b'\340A\003'
  _VRFSTATUS.fields_by_name['rmac']._options = None
  _VRFSTATUS.fields_by_name['rmac']._serialized_options = b'\340A\003'
  _VRFSTATUS.fields_by_name['import_rts']._options = None
  _VRFSTATUS.fields_by_name['import_rts']._serialized_options = b'\340A\003'
  _VRFSTATUS.fields_by_name['export_rts']._options = None
  _VRFSTATUS.fields_by_name['export_rts']._serialized_options = b'\340A\003'
  _VRFSTATUS.fields_by_name['logical_bridges']._options = None
  _VRFSTATUS.fields_by_name['logical_bridges']._serialized_options = b'\340A\003'
  _VRFSTATUS.fields_by_name['oper_status']._options = None
  _VRFSTATUS.fields_by_name['oper_status']._serialized_options = b'\340A\003'
  _CREATEVRFREQUEST.fields_by_name['vrf_id']._options = None
  _CREATEVRFREQUEST.fields_by_name['vrf_id']._serialized_options = b'\340A\001'
  _CREATEVRFREQUEST.fields_by_name['vrf']._options = None
  _CREATEVRFREQUEST.fields_by_name['vrf']._serialized_options = b'\340A\002'
  _LISTVRFSREQUEST.fields_by_name['page_size']._options = None
  _LISTVRFSREQUEST.fields_by_name['page_size']._serialized_options = b'\340A\001'
  _LISTVRFSREQUEST.fields_by_name['page_token']._options = None
  _LISTVRFSREQUEST.fields_by_name['page_token']._serialized_options = b'\340A\001'
  _GETVRFREQUEST.fields_by_name['name']._options = None
  _GETVRFREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A&\n$opi_api.network.evpn_gw.v1alpha1/Vrf'
  _DELETEVRFREQUEST.fields_by_name['name']._options = None
  _DELETEVRFREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A&\n$opi_api.network.evpn_gw.v1alpha1/Vrf'
  _DELETEVRFREQUEST.fields_by_name['allow_missing']._options = None
  _DELETEVRFREQUEST.fields_by_name['allow_missing']._serialized_options = b'\340A\001'
  _UPDATEVRFREQUEST.fields_by_name['vrf']._options = None
  _UPDATEVRFREQUEST.fields_by_name['vrf']._serialized_options = b'\340A\002'
  _UPDATEVRFREQUEST.fields_by_name['update_mask']._options = None
  _UPDATEVRFREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\001'
  _UPDATEVRFREQUEST.fields_by_name['allow_missing']._options = None
  _UPDATEVRFREQUEST.fields_by_name['allow_missing']._serialized_options = b'\340A\001'
  _SVI.fields_by_name['name']._options = None
  _SVI.fields_by_name['name']._serialized_options = b'\340A\010'
  _SVI.fields_by_name['spec']._options = None
  _SVI.fields_by_name['spec']._serialized_options = b'\340A\002'
  _SVI.fields_by_name['status']._options = None
  _SVI.fields_by_name['status']._serialized_options = b'\340A\003'
  _SVI._options = None
  _SVI._serialized_options = b'\352A=\n$opi_api.network.evpn_gw.v1alpha1/Svi\022\nsvis/{svi}*\004svis2\003svi'
  _SVISPEC.fields_by_name['vrf']._options = None
  _SVISPEC.fields_by_name['vrf']._serialized_options = b'\340A\002\372A&\n$opi_api.network.evpn_gw.v1alpha1/Vrf'
  _SVISPEC.fields_by_name['logical_bridge']._options = None
  _SVISPEC.fields_by_name['logical_bridge']._serialized_options = b'\340A\002\372A0\n.opi_api.network.evpn_gw.v1alpha1/LogicalBridge'
  _SVISPEC.fields_by_name['mac_address']._options = None
  _SVISPEC.fields_by_name['mac_address']._serialized_options = b'\340A\002'
  _SVISPEC.fields_by_name['gw_ip_prefix']._options = None
  _SVISPEC.fields_by_name['gw_ip_prefix']._serialized_options = b'\340A\002'
  _SVISPEC.fields_by_name['enable_bgp']._options = None
  _SVISPEC.fields_by_name['enable_bgp']._serialized_options = b'\340A\001'
  _SVISPEC.fields_by_name['remote_as']._options = None
  _SVISPEC.fields_by_name['remote_as']._serialized_options = b'\340A\001'
  _SVISTATUS.fields_by_name['oper_status']._options = None
  _SVISTATUS.fields_by_name['oper_status']._serialized_options = b'\340A\003'
  _CREATESVIREQUEST.fields_by_name['svi_id']._options = None
  _CREATESVIREQUEST.fields_by_name['svi_id']._serialized_options = b'\340A\001'
  _CREATESVIREQUEST.fields_by_name['svi']._options = None
  _CREATESVIREQUEST.fields_by_name['svi']._serialized_options = b'\340A\002'
  _LISTSVISREQUEST.fields_by_name['page_size']._options = None
  _LISTSVISREQUEST.fields_by_name['page_size']._serialized_options = b'\340A\001'
  _LISTSVISREQUEST.fields_by_name['page_token']._options = None
  _LISTSVISREQUEST.fields_by_name['page_token']._serialized_options = b'\340A\001'
  _GETSVIREQUEST.fields_by_name['name']._options = None
  _GETSVIREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A&\n$opi_api.network.evpn_gw.v1alpha1/Svi'
  _DELETESVIREQUEST.fields_by_name['name']._options = None
  _DELETESVIREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A&\n$opi_api.network.evpn_gw.v1alpha1/Svi'
  _DELETESVIREQUEST.fields_by_name['allow_missing']._options = None
  _DELETESVIREQUEST.fields_by_name['allow_missing']._serialized_options = b'\340A\001'
  _UPDATESVIREQUEST.fields_by_name['svi']._options = None
  _UPDATESVIREQUEST.fields_by_name['svi']._serialized_options = b'\340A\002'
  _UPDATESVIREQUEST.fields_by_name['update_mask']._options = None
  _UPDATESVIREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\001'
  _UPDATESVIREQUEST.fields_by_name['allow_missing']._options = None
  _UPDATESVIREQUEST.fields_by_name['allow_missing']._serialized_options = b'\340A\001'
  _VRFSERVICE.methods_by_name['CreateVrf']._options = None
  _VRFSERVICE.methods_by_name['CreateVrf']._serialized_options = b'\202\323\344\223\002\017\"\010/v1/vrfs:\003vrf\332A\nvrf,vrf_id'
  _VRFSERVICE.methods_by_name['ListVrfs']._options = None
  _VRFSERVICE.methods_by_name['ListVrfs']._serialized_options = b'\202\323\344\223\002\n\022\010/v1/vrfs'
  _VRFSERVICE.methods_by_name['GetVrf']._options = None
  _VRFSERVICE.methods_by_name['GetVrf']._serialized_options = b'\202\323\344\223\002\023\022\021/v1/{name=vrfs/*}\332A\004name'
  _VRFSERVICE.methods_by_name['DeleteVrf']._options = None
  _VRFSERVICE.methods_by_name['DeleteVrf']._serialized_options = b'\202\323\344\223\002\023*\021/v1/{name=vrfs/*}\332A\004name'
  _VRFSERVICE.methods_by_name['UpdateVrf']._options = None
  _VRFSERVICE.methods_by_name['UpdateVrf']._serialized_options = b'\202\323\344\223\002\0342\025/v1/{vrf.name=vrfs/*}:\003vrf\332A\017vrf,update_mask'
  _SVISERVICE.methods_by_name['CreateSvi']._options = None
  _SVISERVICE.methods_by_name['CreateSvi']._serialized_options = b'\202\323\344\223\002\017\"\010/v1/svis:\003svi\332A\nsvi,svi_id'
  _SVISERVICE.methods_by_name['ListSvis']._options = None
  _SVISERVICE.methods_by_name['ListSvis']._serialized_options = b'\202\323\344\223\002\n\022\010/v1/svis'
  _SVISERVICE.methods_by_name['GetSvi']._options = None
  _SVISERVICE.methods_by_name['GetSvi']._serialized_options = b'\202\323\344\223\002\023\022\021/v1/{name=svis/*}\332A\004name'
  _SVISERVICE.methods_by_name['DeleteSvi']._options = None
  _SVISERVICE.methods_by_name['DeleteSvi']._serialized_options = b'\202\323\344\223\002\023*\021/v1/{name=svis/*}\332A\004name'
  _SVISERVICE.methods_by_name['UpdateSvi']._options = None
  _SVISERVICE.methods_by_name['UpdateSvi']._serialized_options = b'\202\323\344\223\002\0342\025/v1/{svi.name=svis/*}:\003svi\332A\017svi,update_mask'
  _VRFOPERSTATUS._serialized_start=2767
  _VRFOPERSTATUS._serialized_end=2865
  _SVIOPERSTATUS._serialized_start=2867
  _SVIOPERSTATUS._serialized_end=2965
  _VRF._serialized_start=259
  _VRF._serialized_end=477
  _VRFSPEC._serialized_start=480
  _VRFSPEC._serialized_end=680
  _VRFSTATUS._serialized_start=683
  _VRFSTATUS._serialized_end=936
  _CREATEVRFREQUEST._serialized_start=938
  _CREATEVRFREQUEST._serialized_end=1034
  _LISTVRFSREQUEST._serialized_start=1036
  _LISTVRFSREQUEST._serialized_end=1102
  _LISTVRFSRESPONSE._serialized_start=1104
  _LISTVRFSRESPONSE._serialized_end=1200
  _GETVRFREQUEST._serialized_start=1202
  _GETVRFREQUEST._serialized_end=1277
  _DELETEVRFREQUEST._serialized_start=1279
  _DELETEVRFREQUEST._serialized_end=1385
  _UPDATEVRFREQUEST._serialized_start=1388
  _UPDATEVRFREQUEST._serialized_end=1545
  _SVI._serialized_start=1548
  _SVI._serialized_end=1766
  _SVISPEC._serialized_start=1769
  _SVISPEC._serialized_end=2068
  _SVISTATUS._serialized_start=2070
  _SVISTATUS._serialized_end=2156
  _CREATESVIREQUEST._serialized_start=2158
  _CREATESVIREQUEST._serialized_end=2254
  _LISTSVISREQUEST._serialized_start=2256
  _LISTSVISREQUEST._serialized_end=2322
  _LISTSVISRESPONSE._serialized_start=2324
  _LISTSVISRESPONSE._serialized_end=2420
  _GETSVIREQUEST._serialized_start=2422
  _GETSVIREQUEST._serialized_end=2497
  _DELETESVIREQUEST._serialized_start=2499
  _DELETESVIREQUEST._serialized_end=2605
  _UPDATESVIREQUEST._serialized_start=2608
  _UPDATESVIREQUEST._serialized_end=2765
  _VRFSERVICE._serialized_start=2968
  _VRFSERVICE._serialized_end=3670
  _SVISERVICE._serialized_start=3673
  _SVISERVICE._serialized_end=4375
# @@protoc_insertion_point(module_scope)
