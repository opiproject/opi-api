# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: frontend_nvme_pcie.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


import opicommon_pb2 as opicommon__pb2
import uuid_pb2 as uuid__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x18\x66rontend_nvme_pcie.proto\x12\x12opi_api.storage.v1\x1a\x0fopicommon.proto\x1a\nuuid.proto\x1a\x17google/api/client.proto\x1a\x19google/api/resource.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a google/protobuf/field_mask.proto\"\x9e\x02\n\rNvmeSubsystem\x12\x39\n\x04name\x18\x01 \x01(\tB+\xe0\x41\x03\xe0\x41\x05\xfa\x41\"\n opi_api.storage.v1/NvmeSubsystem\x12\x38\n\x04spec\x18\x02 \x01(\x0b\x32%.opi_api.storage.v1.NvmeSubsystemSpecB\x03\xe0\x41\x02\x12<\n\x06status\x18\x03 \x01(\x0b\x32\'.opi_api.storage.v1.NvmeSubsystemStatusB\x03\xe0\x41\x03:Z\xea\x41W\n$storage.opiproject.org/NvmeSubsystem\x12\x10volumes/{volume}*\x0envmeSubsystems2\rnvmeSubsystem\"y\n\x11NvmeSubsystemSpec\x12\x10\n\x03nqn\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x1a\n\rserial_number\x18\x02 \x01(\tB\x03\xe0\x41\x01\x12\x19\n\x0cmodel_number\x18\x03 \x01(\tB\x03\xe0\x41\x01\x12\x1b\n\x0emax_namespaces\x18\x04 \x01(\x03\x42\x03\xe0\x41\x01\"L\n\x13NvmeSubsystemStatus\x12\x1e\n\x11\x66irmware_revision\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x15\n\x08\x66ru_guid\x18\x02 \x01(\x0c\x42\x03\xe0\x41\x03\"\xce\x02\n\x0eNvmeController\x12:\n\x04name\x18\x01 \x01(\tB,\xe0\x41\x03\xe0\x41\x05\xfa\x41#\n!opi_api.storage.v1/NvmeController\x12\x39\n\x04spec\x18\x02 \x01(\x0b\x32&.opi_api.storage.v1.NvmeControllerSpecB\x03\xe0\x41\x02\x12=\n\x06status\x18\x03 \x01(\x0b\x32(.opi_api.storage.v1.NvmeControllerStatusB\x03\xe0\x41\x03:\x85\x01\xea\x41\x81\x01\n%storage.opiproject.org/NvmeController\x12\x37nvmeSubsystems/{subsystem}/nvmeControllers/{controller}*\x0fnvmeControllers2\x0envmeController\"\xe3\x02\n\x12NvmeControllerSpec\x12$\n\x12nvme_controller_id\x18\x01 \x01(\x05\x42\x03\xe0\x41\x01H\x00\x88\x01\x01\x12\x35\n\x07pcie_id\x18\x02 \x01(\x0b\x32\x1f.opi_api.storage.v1.PciEndpointB\x03\xe0\x41\x02\x12\x14\n\x07max_nsq\x18\x03 \x01(\x05\x42\x03\xe0\x41\x01\x12\x14\n\x07max_ncq\x18\x04 \x01(\x05\x42\x03\xe0\x41\x01\x12\x11\n\x04sqes\x18\x05 \x01(\x05\x42\x03\xe0\x41\x01\x12\x11\n\x04\x63qes\x18\x06 \x01(\x05\x42\x03\xe0\x41\x01\x12\x1b\n\x0emax_namespaces\x18\x07 \x01(\x05\x42\x03\xe0\x41\x01\x12\x34\n\tmin_limit\x18\x08 \x01(\x0b\x32\x1c.opi_api.storage.v1.QosLimitB\x03\xe0\x41\x01\x12\x34\n\tmax_limit\x18\t \x01(\x0b\x32\x1c.opi_api.storage.v1.QosLimitB\x03\xe0\x41\x01\x42\x15\n\x13_nvme_controller_id\"+\n\x14NvmeControllerStatus\x12\x13\n\x06\x61\x63tive\x18\x01 \x01(\x08\x42\x03\xe0\x41\x03\"\xc3\x02\n\rNvmeNamespace\x12\x39\n\x04name\x18\x01 \x01(\tB+\xe0\x41\x03\xe0\x41\x05\xfa\x41\"\n opi_api.storage.v1/NvmeNamespace\x12\x38\n\x04spec\x18\x02 \x01(\x0b\x32%.opi_api.storage.v1.NvmeNamespaceSpecB\x03\xe0\x41\x02\x12<\n\x06status\x18\x03 \x01(\x0b\x32\'.opi_api.storage.v1.NvmeNamespaceStatusB\x03\xe0\x41\x03:\x7f\xea\x41|\n$storage.opiproject.org/NvmeNamespace\x12\x35nvmeSubsystems/{subsystem}/nvmeNamespaces/{namespace}*\x0envmeNamespaces2\rnvmeNamespace\"\x9d\x01\n\x11NvmeNamespaceSpec\x12\x16\n\thost_nsid\x18\x01 \x01(\x05\x42\x03\xe0\x41\x01\x12\x12\n\x05nguid\x18\x02 \x01(\tB\x03\xe0\x41\x01\x12\x12\n\x05\x65ui64\x18\x03 \x01(\x03\x42\x03\xe0\x41\x01\x12*\n\x04uuid\x18\x04 \x01(\x0b\x32\x17.opi_api.common.v1.UuidB\x03\xe0\x41\x01\x12\x1c\n\x0fvolume_name_ref\x18\x05 \x01(\tB\x03\xe0\x41\x02\"\xa4\x01\n\x13NvmeNamespaceStatus\x12\x41\n\tpci_state\x18\x01 \x01(\x0e\x32).opi_api.storage.v1.NvmeNamespacePciStateB\x03\xe0\x41\x03\x12J\n\x0epci_oper_state\x18\x02 \x01(\x0e\x32-.opi_api.storage.v1.NvmeNamespacePciOperStateB\x03\xe0\x41\x03\"|\n\x1a\x43reateNvmeSubsystemRequest\x12>\n\x0envme_subsystem\x18\x01 \x01(\x0b\x32!.opi_api.storage.v1.NvmeSubsystemB\x03\xe0\x41\x02\x12\x1e\n\x11nvme_subsystem_id\x18\x02 \x01(\tB\x03\xe0\x41\x01\"p\n\x1a\x44\x65leteNvmeSubsystemRequest\x12\x36\n\x04name\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\n opi_api.storage.v1/NvmeSubsystem\x12\x1a\n\rallow_missing\x18\x02 \x01(\x08\x42\x03\xe0\x41\x01\"\xae\x01\n\x1aUpdateNvmeSubsystemRequest\x12>\n\x0envme_subsystem\x18\x01 \x01(\x0b\x32!.opi_api.storage.v1.NvmeSubsystemB\x03\xe0\x41\x02\x12\x34\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x01\x12\x1a\n\rallow_missing\x18\x03 \x01(\x08\x42\x03\xe0\x41\x01\"\x86\x01\n\x19ListNvmeSubsystemsRequest\x12\x38\n\x06parent\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\n opi_api.storage.v1/NvmeSubsystem\x12\x16\n\tpage_size\x18\x02 \x01(\x05\x42\x03\xe0\x41\x01\x12\x17\n\npage_token\x18\x03 \x01(\tB\x03\xe0\x41\x01\"q\n\x1aListNvmeSubsystemsResponse\x12:\n\x0fnvme_subsystems\x18\x01 \x03(\x0b\x32!.opi_api.storage.v1.NvmeSubsystem\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"Q\n\x17GetNvmeSubsystemRequest\x12\x36\n\x04name\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\n opi_api.storage.v1/NvmeSubsystem\"S\n\x19StatsNvmeSubsystemRequest\x12\x36\n\x04name\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\n opi_api.storage.v1/NvmeSubsystem\"L\n\x1aStatsNvmeSubsystemResponse\x12.\n\x05stats\x18\x01 \x01(\x0b\x32\x1f.opi_api.storage.v1.VolumeStats\"\xba\x01\n\x1b\x43reateNvmeControllerRequest\x12\x38\n\x06parent\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\n opi_api.storage.v1/NvmeSubsystem\x12@\n\x0fnvme_controller\x18\x02 \x01(\x0b\x32\".opi_api.storage.v1.NvmeControllerB\x03\xe0\x41\x02\x12\x1f\n\x12nvme_controller_id\x18\x03 \x01(\tB\x03\xe0\x41\x01\"r\n\x1b\x44\x65leteNvmeControllerRequest\x12\x37\n\x04name\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!opi_api.storage.v1/NvmeController\x12\x1a\n\rallow_missing\x18\x02 \x01(\x08\x42\x03\xe0\x41\x01\"\xb1\x01\n\x1bUpdateNvmeControllerRequest\x12@\n\x0fnvme_controller\x18\x01 \x01(\x0b\x32\".opi_api.storage.v1.NvmeControllerB\x03\xe0\x41\x02\x12\x34\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x01\x12\x1a\n\rallow_missing\x18\x03 \x01(\x08\x42\x03\xe0\x41\x01\"\x88\x01\n\x1aListNvmeControllersRequest\x12\x39\n\x06parent\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!opi_api.storage.v1/NvmeController\x12\x16\n\tpage_size\x18\x02 \x01(\x05\x42\x03\xe0\x41\x01\x12\x17\n\npage_token\x18\x03 \x01(\tB\x03\xe0\x41\x01\"t\n\x1bListNvmeControllersResponse\x12<\n\x10nvme_controllers\x18\x01 \x03(\x0b\x32\".opi_api.storage.v1.NvmeController\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"S\n\x18GetNvmeControllerRequest\x12\x37\n\x04name\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!opi_api.storage.v1/NvmeController\"U\n\x1aStatsNvmeControllerRequest\x12\x37\n\x04name\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!opi_api.storage.v1/NvmeController\"M\n\x1bStatsNvmeControllerResponse\x12.\n\x05stats\x18\x01 \x01(\x0b\x32\x1f.opi_api.storage.v1.VolumeStats\"\xb6\x01\n\x1a\x43reateNvmeNamespaceRequest\x12\x38\n\x06parent\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\n opi_api.storage.v1/NvmeSubsystem\x12>\n\x0envme_namespace\x18\x02 \x01(\x0b\x32!.opi_api.storage.v1.NvmeNamespaceB\x03\xe0\x41\x02\x12\x1e\n\x11nvme_namespace_id\x18\x03 \x01(\tB\x03\xe0\x41\x01\"p\n\x1a\x44\x65leteNvmeNamespaceRequest\x12\x36\n\x04name\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\n opi_api.storage.v1/NvmeNamespace\x12\x1a\n\rallow_missing\x18\x02 \x01(\x08\x42\x03\xe0\x41\x01\"\xae\x01\n\x1aUpdateNvmeNamespaceRequest\x12>\n\x0envme_namespace\x18\x01 \x01(\x0b\x32!.opi_api.storage.v1.NvmeNamespaceB\x03\xe0\x41\x02\x12\x34\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x01\x12\x1a\n\rallow_missing\x18\x03 \x01(\x08\x42\x03\xe0\x41\x01\"\x86\x01\n\x19ListNvmeNamespacesRequest\x12\x38\n\x06parent\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\n opi_api.storage.v1/NvmeNamespace\x12\x16\n\tpage_size\x18\x02 \x01(\x05\x42\x03\xe0\x41\x01\x12\x17\n\npage_token\x18\x03 \x01(\tB\x03\xe0\x41\x01\"q\n\x1aListNvmeNamespacesResponse\x12:\n\x0fnvme_namespaces\x18\x01 \x03(\x0b\x32!.opi_api.storage.v1.NvmeNamespace\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"Q\n\x17GetNvmeNamespaceRequest\x12\x36\n\x04name\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\n opi_api.storage.v1/NvmeNamespace\"S\n\x19StatsNvmeNamespaceRequest\x12\x36\n\x04name\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\n opi_api.storage.v1/NvmeNamespace\"L\n\x1aStatsNvmeNamespaceResponse\x12.\n\x05stats\x18\x01 \x01(\x0b\x32\x1f.opi_api.storage.v1.VolumeStats*\xb5\x01\n\x15NvmeNamespacePciState\x12(\n$NVME_NAMESPACE_PCI_STATE_UNSPECIFIED\x10\x00\x12%\n!NVME_NAMESPACE_PCI_STATE_DISABLED\x10\x01\x12$\n NVME_NAMESPACE_PCI_STATE_ENABLED\x10\x02\x12%\n!NVME_NAMESPACE_PCI_STATE_DELETING\x10\x03*\x9f\x01\n\x19NvmeNamespacePciOperState\x12-\n)NVME_NAMESPACE_PCI_OPER_STATE_UNSPECIFIED\x10\x00\x12(\n$NVME_NAMESPACE_PCI_OPER_STATE_ONLINE\x10\x01\x12)\n%NVME_NAMESPACE_PCI_OPER_STATE_OFFLINE\x10\x02\x32\x9a\x18\n\x13\x46rontendNvmeService\x12\xb0\x01\n\x13\x43reateNvmeSubsystem\x12..opi_api.storage.v1.CreateNvmeSubsystemRequest\x1a!.opi_api.storage.v1.NvmeSubsystem\"F\x82\xd3\xe4\x93\x02\x1d\"\x0b/v1/volumes:\x0envme_subsystem\xda\x41 nvme_subsystem,nvme_subsystem_id\x12\x89\x01\n\x13\x44\x65leteNvmeSubsystem\x12..opi_api.storage.v1.DeleteNvmeSubsystemRequest\x1a\x16.google.protobuf.Empty\"*\x82\xd3\xe4\x93\x02\x1d*\x1b/v1/{name=NvmeSubsystems/*}\xda\x41\x04name\x12\xc3\x01\n\x13UpdateNvmeSubsystem\x12..opi_api.storage.v1.UpdateNvmeSubsystemRequest\x1a!.opi_api.storage.v1.NvmeSubsystem\"Y\x82\xd3\xe4\x93\x02\x36\x32$/v1/{nvme_subsystem.name=subsystems}:\x0envme_subsystem\xda\x41\x1anvme_subsystem,update_mask\x12\x9d\x01\n\x12ListNvmeSubsystems\x12-.opi_api.storage.v1.ListNvmeSubsystemsRequest\x1a..opi_api.storage.v1.ListNvmeSubsystemsResponse\"(\x82\xd3\xe4\x93\x02\x19\x12\x17/v1/{parent=subsystems}\xda\x41\x06parent\x12\x8e\x01\n\x10GetNvmeSubsystem\x12+.opi_api.storage.v1.GetNvmeSubsystemRequest\x1a!.opi_api.storage.v1.NvmeSubsystem\"*\x82\xd3\xe4\x93\x02\x1d\x12\x1b/v1/{name=NvmeSubsystems/*}\xda\x41\x04name\x12\xa5\x01\n\x12StatsNvmeSubsystem\x12-.opi_api.storage.v1.StatsNvmeSubsystemRequest\x1a..opi_api.storage.v1.StatsNvmeSubsystemResponse\"0\x82\xd3\xe4\x93\x02#\x12!/v1/{name=NvmeSubsystems/*}:stats\xda\x41\x04name\x12\xdf\x01\n\x14\x43reateNvmeController\x12/.opi_api.storage.v1.CreateNvmeControllerRequest\x1a\".opi_api.storage.v1.NvmeController\"r\x82\xd3\xe4\x93\x02@\"-/v1/{parent=nvmeSubsystems/*}/nvmeControllers:\x0fnvme_controller\xda\x41)parent,nvme_controller,nvme_controller_id\x12\x8c\x01\n\x14\x44\x65leteNvmeController\x12/.opi_api.storage.v1.DeleteNvmeControllerRequest\x1a\x16.google.protobuf.Empty\"+\x82\xd3\xe4\x93\x02\x1e*\x1c/v1/{name=NvmeControllers/*}\xda\x41\x04name\x12\xc9\x01\n\x14UpdateNvmeController\x12/.opi_api.storage.v1.UpdateNvmeControllerRequest\x1a\".opi_api.storage.v1.NvmeController\"\\\x82\xd3\xe4\x93\x02\x38\x32%/v1/{nvme_controller.name=subsystems}:\x0fnvme_controller\xda\x41\x1bnvme_controller,update_mask\x12\xa0\x01\n\x13ListNvmeControllers\x12..opi_api.storage.v1.ListNvmeControllersRequest\x1a/.opi_api.storage.v1.ListNvmeControllersResponse\"(\x82\xd3\xe4\x93\x02\x19\x12\x17/v1/{parent=subsystems}\xda\x41\x06parent\x12\x92\x01\n\x11GetNvmeController\x12,.opi_api.storage.v1.GetNvmeControllerRequest\x1a\".opi_api.storage.v1.NvmeController\"+\x82\xd3\xe4\x93\x02\x1e\x12\x1c/v1/{name=NvmeControllers/*}\xda\x41\x04name\x12\xa9\x01\n\x13StatsNvmeController\x12..opi_api.storage.v1.StatsNvmeControllerRequest\x1a/.opi_api.storage.v1.StatsNvmeControllerResponse\"1\x82\xd3\xe4\x93\x02$\x12\"/v1/{name=NvmeControllers/*}:stats\xda\x41\x04name\x12\xd8\x01\n\x13\x43reateNvmeNamespace\x12..opi_api.storage.v1.CreateNvmeNamespaceRequest\x1a!.opi_api.storage.v1.NvmeNamespace\"n\x82\xd3\xe4\x93\x02>\",/v1/{parent=nvmeSubsystems/*}/nvmeNamespaces:\x0envme_namespace\xda\x41\'parent,nvme_namespace,nvme_namespace_id\x12\x89\x01\n\x13\x44\x65leteNvmeNamespace\x12..opi_api.storage.v1.DeleteNvmeNamespaceRequest\x1a\x16.google.protobuf.Empty\"*\x82\xd3\xe4\x93\x02\x1d*\x1b/v1/{name=NvmeNamespaces/*}\xda\x41\x04name\x12\xc3\x01\n\x13UpdateNvmeNamespace\x12..opi_api.storage.v1.UpdateNvmeNamespaceRequest\x1a!.opi_api.storage.v1.NvmeNamespace\"Y\x82\xd3\xe4\x93\x02\x36\x32$/v1/{nvme_namespace.name=subsystems}:\x0envme_namespace\xda\x41\x1anvme_namespace,update_mask\x12\x9d\x01\n\x12ListNvmeNamespaces\x12-.opi_api.storage.v1.ListNvmeNamespacesRequest\x1a..opi_api.storage.v1.ListNvmeNamespacesResponse\"(\x82\xd3\xe4\x93\x02\x19\x12\x17/v1/{parent=subsystems}\xda\x41\x06parent\x12\x8e\x01\n\x10GetNvmeNamespace\x12+.opi_api.storage.v1.GetNvmeNamespaceRequest\x1a!.opi_api.storage.v1.NvmeNamespace\"*\x82\xd3\xe4\x93\x02\x1d\x12\x1b/v1/{name=NvmeNamespaces/*}\xda\x41\x04name\x12\xa5\x01\n\x12StatsNvmeNamespace\x12-.opi_api.storage.v1.StatsNvmeNamespaceRequest\x1a..opi_api.storage.v1.StatsNvmeNamespaceResponse\"0\x82\xd3\xe4\x93\x02#\x12!/v1/{name=NvmeNamespaces/*}:stats\xda\x41\x04nameBd\n\x12opi_api.storage.v1B\x15\x46rontendNvmePcieProtoP\x01Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/gob\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'frontend_nvme_pcie_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\022opi_api.storage.v1B\025FrontendNvmePcieProtoP\001Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/go'
  _NVMESUBSYSTEM.fields_by_name['name']._options = None
  _NVMESUBSYSTEM.fields_by_name['name']._serialized_options = b'\340A\003\340A\005\372A\"\n opi_api.storage.v1/NvmeSubsystem'
  _NVMESUBSYSTEM.fields_by_name['spec']._options = None
  _NVMESUBSYSTEM.fields_by_name['spec']._serialized_options = b'\340A\002'
  _NVMESUBSYSTEM.fields_by_name['status']._options = None
  _NVMESUBSYSTEM.fields_by_name['status']._serialized_options = b'\340A\003'
  _NVMESUBSYSTEM._options = None
  _NVMESUBSYSTEM._serialized_options = b'\352AW\n$storage.opiproject.org/NvmeSubsystem\022\020volumes/{volume}*\016nvmeSubsystems2\rnvmeSubsystem'
  _NVMESUBSYSTEMSPEC.fields_by_name['nqn']._options = None
  _NVMESUBSYSTEMSPEC.fields_by_name['nqn']._serialized_options = b'\340A\002'
  _NVMESUBSYSTEMSPEC.fields_by_name['serial_number']._options = None
  _NVMESUBSYSTEMSPEC.fields_by_name['serial_number']._serialized_options = b'\340A\001'
  _NVMESUBSYSTEMSPEC.fields_by_name['model_number']._options = None
  _NVMESUBSYSTEMSPEC.fields_by_name['model_number']._serialized_options = b'\340A\001'
  _NVMESUBSYSTEMSPEC.fields_by_name['max_namespaces']._options = None
  _NVMESUBSYSTEMSPEC.fields_by_name['max_namespaces']._serialized_options = b'\340A\001'
  _NVMESUBSYSTEMSTATUS.fields_by_name['firmware_revision']._options = None
  _NVMESUBSYSTEMSTATUS.fields_by_name['firmware_revision']._serialized_options = b'\340A\003'
  _NVMESUBSYSTEMSTATUS.fields_by_name['fru_guid']._options = None
  _NVMESUBSYSTEMSTATUS.fields_by_name['fru_guid']._serialized_options = b'\340A\003'
  _NVMECONTROLLER.fields_by_name['name']._options = None
  _NVMECONTROLLER.fields_by_name['name']._serialized_options = b'\340A\003\340A\005\372A#\n!opi_api.storage.v1/NvmeController'
  _NVMECONTROLLER.fields_by_name['spec']._options = None
  _NVMECONTROLLER.fields_by_name['spec']._serialized_options = b'\340A\002'
  _NVMECONTROLLER.fields_by_name['status']._options = None
  _NVMECONTROLLER.fields_by_name['status']._serialized_options = b'\340A\003'
  _NVMECONTROLLER._options = None
  _NVMECONTROLLER._serialized_options = b'\352A\201\001\n%storage.opiproject.org/NvmeController\0227nvmeSubsystems/{subsystem}/nvmeControllers/{controller}*\017nvmeControllers2\016nvmeController'
  _NVMECONTROLLERSPEC.fields_by_name['nvme_controller_id']._options = None
  _NVMECONTROLLERSPEC.fields_by_name['nvme_controller_id']._serialized_options = b'\340A\001'
  _NVMECONTROLLERSPEC.fields_by_name['pcie_id']._options = None
  _NVMECONTROLLERSPEC.fields_by_name['pcie_id']._serialized_options = b'\340A\002'
  _NVMECONTROLLERSPEC.fields_by_name['max_nsq']._options = None
  _NVMECONTROLLERSPEC.fields_by_name['max_nsq']._serialized_options = b'\340A\001'
  _NVMECONTROLLERSPEC.fields_by_name['max_ncq']._options = None
  _NVMECONTROLLERSPEC.fields_by_name['max_ncq']._serialized_options = b'\340A\001'
  _NVMECONTROLLERSPEC.fields_by_name['sqes']._options = None
  _NVMECONTROLLERSPEC.fields_by_name['sqes']._serialized_options = b'\340A\001'
  _NVMECONTROLLERSPEC.fields_by_name['cqes']._options = None
  _NVMECONTROLLERSPEC.fields_by_name['cqes']._serialized_options = b'\340A\001'
  _NVMECONTROLLERSPEC.fields_by_name['max_namespaces']._options = None
  _NVMECONTROLLERSPEC.fields_by_name['max_namespaces']._serialized_options = b'\340A\001'
  _NVMECONTROLLERSPEC.fields_by_name['min_limit']._options = None
  _NVMECONTROLLERSPEC.fields_by_name['min_limit']._serialized_options = b'\340A\001'
  _NVMECONTROLLERSPEC.fields_by_name['max_limit']._options = None
  _NVMECONTROLLERSPEC.fields_by_name['max_limit']._serialized_options = b'\340A\001'
  _NVMECONTROLLERSTATUS.fields_by_name['active']._options = None
  _NVMECONTROLLERSTATUS.fields_by_name['active']._serialized_options = b'\340A\003'
  _NVMENAMESPACE.fields_by_name['name']._options = None
  _NVMENAMESPACE.fields_by_name['name']._serialized_options = b'\340A\003\340A\005\372A\"\n opi_api.storage.v1/NvmeNamespace'
  _NVMENAMESPACE.fields_by_name['spec']._options = None
  _NVMENAMESPACE.fields_by_name['spec']._serialized_options = b'\340A\002'
  _NVMENAMESPACE.fields_by_name['status']._options = None
  _NVMENAMESPACE.fields_by_name['status']._serialized_options = b'\340A\003'
  _NVMENAMESPACE._options = None
  _NVMENAMESPACE._serialized_options = b'\352A|\n$storage.opiproject.org/NvmeNamespace\0225nvmeSubsystems/{subsystem}/nvmeNamespaces/{namespace}*\016nvmeNamespaces2\rnvmeNamespace'
  _NVMENAMESPACESPEC.fields_by_name['host_nsid']._options = None
  _NVMENAMESPACESPEC.fields_by_name['host_nsid']._serialized_options = b'\340A\001'
  _NVMENAMESPACESPEC.fields_by_name['nguid']._options = None
  _NVMENAMESPACESPEC.fields_by_name['nguid']._serialized_options = b'\340A\001'
  _NVMENAMESPACESPEC.fields_by_name['eui64']._options = None
  _NVMENAMESPACESPEC.fields_by_name['eui64']._serialized_options = b'\340A\001'
  _NVMENAMESPACESPEC.fields_by_name['uuid']._options = None
  _NVMENAMESPACESPEC.fields_by_name['uuid']._serialized_options = b'\340A\001'
  _NVMENAMESPACESPEC.fields_by_name['volume_name_ref']._options = None
  _NVMENAMESPACESPEC.fields_by_name['volume_name_ref']._serialized_options = b'\340A\002'
  _NVMENAMESPACESTATUS.fields_by_name['pci_state']._options = None
  _NVMENAMESPACESTATUS.fields_by_name['pci_state']._serialized_options = b'\340A\003'
  _NVMENAMESPACESTATUS.fields_by_name['pci_oper_state']._options = None
  _NVMENAMESPACESTATUS.fields_by_name['pci_oper_state']._serialized_options = b'\340A\003'
  _CREATENVMESUBSYSTEMREQUEST.fields_by_name['nvme_subsystem']._options = None
  _CREATENVMESUBSYSTEMREQUEST.fields_by_name['nvme_subsystem']._serialized_options = b'\340A\002'
  _CREATENVMESUBSYSTEMREQUEST.fields_by_name['nvme_subsystem_id']._options = None
  _CREATENVMESUBSYSTEMREQUEST.fields_by_name['nvme_subsystem_id']._serialized_options = b'\340A\001'
  _DELETENVMESUBSYSTEMREQUEST.fields_by_name['name']._options = None
  _DELETENVMESUBSYSTEMREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\"\n opi_api.storage.v1/NvmeSubsystem'
  _DELETENVMESUBSYSTEMREQUEST.fields_by_name['allow_missing']._options = None
  _DELETENVMESUBSYSTEMREQUEST.fields_by_name['allow_missing']._serialized_options = b'\340A\001'
  _UPDATENVMESUBSYSTEMREQUEST.fields_by_name['nvme_subsystem']._options = None
  _UPDATENVMESUBSYSTEMREQUEST.fields_by_name['nvme_subsystem']._serialized_options = b'\340A\002'
  _UPDATENVMESUBSYSTEMREQUEST.fields_by_name['update_mask']._options = None
  _UPDATENVMESUBSYSTEMREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\001'
  _UPDATENVMESUBSYSTEMREQUEST.fields_by_name['allow_missing']._options = None
  _UPDATENVMESUBSYSTEMREQUEST.fields_by_name['allow_missing']._serialized_options = b'\340A\001'
  _LISTNVMESUBSYSTEMSREQUEST.fields_by_name['parent']._options = None
  _LISTNVMESUBSYSTEMSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\"\n opi_api.storage.v1/NvmeSubsystem'
  _LISTNVMESUBSYSTEMSREQUEST.fields_by_name['page_size']._options = None
  _LISTNVMESUBSYSTEMSREQUEST.fields_by_name['page_size']._serialized_options = b'\340A\001'
  _LISTNVMESUBSYSTEMSREQUEST.fields_by_name['page_token']._options = None
  _LISTNVMESUBSYSTEMSREQUEST.fields_by_name['page_token']._serialized_options = b'\340A\001'
  _GETNVMESUBSYSTEMREQUEST.fields_by_name['name']._options = None
  _GETNVMESUBSYSTEMREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\"\n opi_api.storage.v1/NvmeSubsystem'
  _STATSNVMESUBSYSTEMREQUEST.fields_by_name['name']._options = None
  _STATSNVMESUBSYSTEMREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\"\n opi_api.storage.v1/NvmeSubsystem'
  _CREATENVMECONTROLLERREQUEST.fields_by_name['parent']._options = None
  _CREATENVMECONTROLLERREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\"\n opi_api.storage.v1/NvmeSubsystem'
  _CREATENVMECONTROLLERREQUEST.fields_by_name['nvme_controller']._options = None
  _CREATENVMECONTROLLERREQUEST.fields_by_name['nvme_controller']._serialized_options = b'\340A\002'
  _CREATENVMECONTROLLERREQUEST.fields_by_name['nvme_controller_id']._options = None
  _CREATENVMECONTROLLERREQUEST.fields_by_name['nvme_controller_id']._serialized_options = b'\340A\001'
  _DELETENVMECONTROLLERREQUEST.fields_by_name['name']._options = None
  _DELETENVMECONTROLLERREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A#\n!opi_api.storage.v1/NvmeController'
  _DELETENVMECONTROLLERREQUEST.fields_by_name['allow_missing']._options = None
  _DELETENVMECONTROLLERREQUEST.fields_by_name['allow_missing']._serialized_options = b'\340A\001'
  _UPDATENVMECONTROLLERREQUEST.fields_by_name['nvme_controller']._options = None
  _UPDATENVMECONTROLLERREQUEST.fields_by_name['nvme_controller']._serialized_options = b'\340A\002'
  _UPDATENVMECONTROLLERREQUEST.fields_by_name['update_mask']._options = None
  _UPDATENVMECONTROLLERREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\001'
  _UPDATENVMECONTROLLERREQUEST.fields_by_name['allow_missing']._options = None
  _UPDATENVMECONTROLLERREQUEST.fields_by_name['allow_missing']._serialized_options = b'\340A\001'
  _LISTNVMECONTROLLERSREQUEST.fields_by_name['parent']._options = None
  _LISTNVMECONTROLLERSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A#\n!opi_api.storage.v1/NvmeController'
  _LISTNVMECONTROLLERSREQUEST.fields_by_name['page_size']._options = None
  _LISTNVMECONTROLLERSREQUEST.fields_by_name['page_size']._serialized_options = b'\340A\001'
  _LISTNVMECONTROLLERSREQUEST.fields_by_name['page_token']._options = None
  _LISTNVMECONTROLLERSREQUEST.fields_by_name['page_token']._serialized_options = b'\340A\001'
  _GETNVMECONTROLLERREQUEST.fields_by_name['name']._options = None
  _GETNVMECONTROLLERREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A#\n!opi_api.storage.v1/NvmeController'
  _STATSNVMECONTROLLERREQUEST.fields_by_name['name']._options = None
  _STATSNVMECONTROLLERREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A#\n!opi_api.storage.v1/NvmeController'
  _CREATENVMENAMESPACEREQUEST.fields_by_name['parent']._options = None
  _CREATENVMENAMESPACEREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\"\n opi_api.storage.v1/NvmeSubsystem'
  _CREATENVMENAMESPACEREQUEST.fields_by_name['nvme_namespace']._options = None
  _CREATENVMENAMESPACEREQUEST.fields_by_name['nvme_namespace']._serialized_options = b'\340A\002'
  _CREATENVMENAMESPACEREQUEST.fields_by_name['nvme_namespace_id']._options = None
  _CREATENVMENAMESPACEREQUEST.fields_by_name['nvme_namespace_id']._serialized_options = b'\340A\001'
  _DELETENVMENAMESPACEREQUEST.fields_by_name['name']._options = None
  _DELETENVMENAMESPACEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\"\n opi_api.storage.v1/NvmeNamespace'
  _DELETENVMENAMESPACEREQUEST.fields_by_name['allow_missing']._options = None
  _DELETENVMENAMESPACEREQUEST.fields_by_name['allow_missing']._serialized_options = b'\340A\001'
  _UPDATENVMENAMESPACEREQUEST.fields_by_name['nvme_namespace']._options = None
  _UPDATENVMENAMESPACEREQUEST.fields_by_name['nvme_namespace']._serialized_options = b'\340A\002'
  _UPDATENVMENAMESPACEREQUEST.fields_by_name['update_mask']._options = None
  _UPDATENVMENAMESPACEREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\001'
  _UPDATENVMENAMESPACEREQUEST.fields_by_name['allow_missing']._options = None
  _UPDATENVMENAMESPACEREQUEST.fields_by_name['allow_missing']._serialized_options = b'\340A\001'
  _LISTNVMENAMESPACESREQUEST.fields_by_name['parent']._options = None
  _LISTNVMENAMESPACESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\"\n opi_api.storage.v1/NvmeNamespace'
  _LISTNVMENAMESPACESREQUEST.fields_by_name['page_size']._options = None
  _LISTNVMENAMESPACESREQUEST.fields_by_name['page_size']._serialized_options = b'\340A\001'
  _LISTNVMENAMESPACESREQUEST.fields_by_name['page_token']._options = None
  _LISTNVMENAMESPACESREQUEST.fields_by_name['page_token']._serialized_options = b'\340A\001'
  _GETNVMENAMESPACEREQUEST.fields_by_name['name']._options = None
  _GETNVMENAMESPACEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\"\n opi_api.storage.v1/NvmeNamespace'
  _STATSNVMENAMESPACEREQUEST.fields_by_name['name']._options = None
  _STATSNVMENAMESPACEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\"\n opi_api.storage.v1/NvmeNamespace'
  _FRONTENDNVMESERVICE.methods_by_name['CreateNvmeSubsystem']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['CreateNvmeSubsystem']._serialized_options = b'\202\323\344\223\002\035\"\013/v1/volumes:\016nvme_subsystem\332A nvme_subsystem,nvme_subsystem_id'
  _FRONTENDNVMESERVICE.methods_by_name['DeleteNvmeSubsystem']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['DeleteNvmeSubsystem']._serialized_options = b'\202\323\344\223\002\035*\033/v1/{name=NvmeSubsystems/*}\332A\004name'
  _FRONTENDNVMESERVICE.methods_by_name['UpdateNvmeSubsystem']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['UpdateNvmeSubsystem']._serialized_options = b'\202\323\344\223\00262$/v1/{nvme_subsystem.name=subsystems}:\016nvme_subsystem\332A\032nvme_subsystem,update_mask'
  _FRONTENDNVMESERVICE.methods_by_name['ListNvmeSubsystems']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['ListNvmeSubsystems']._serialized_options = b'\202\323\344\223\002\031\022\027/v1/{parent=subsystems}\332A\006parent'
  _FRONTENDNVMESERVICE.methods_by_name['GetNvmeSubsystem']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['GetNvmeSubsystem']._serialized_options = b'\202\323\344\223\002\035\022\033/v1/{name=NvmeSubsystems/*}\332A\004name'
  _FRONTENDNVMESERVICE.methods_by_name['StatsNvmeSubsystem']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['StatsNvmeSubsystem']._serialized_options = b'\202\323\344\223\002#\022!/v1/{name=NvmeSubsystems/*}:stats\332A\004name'
  _FRONTENDNVMESERVICE.methods_by_name['CreateNvmeController']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['CreateNvmeController']._serialized_options = b'\202\323\344\223\002@\"-/v1/{parent=nvmeSubsystems/*}/nvmeControllers:\017nvme_controller\332A)parent,nvme_controller,nvme_controller_id'
  _FRONTENDNVMESERVICE.methods_by_name['DeleteNvmeController']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['DeleteNvmeController']._serialized_options = b'\202\323\344\223\002\036*\034/v1/{name=NvmeControllers/*}\332A\004name'
  _FRONTENDNVMESERVICE.methods_by_name['UpdateNvmeController']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['UpdateNvmeController']._serialized_options = b'\202\323\344\223\00282%/v1/{nvme_controller.name=subsystems}:\017nvme_controller\332A\033nvme_controller,update_mask'
  _FRONTENDNVMESERVICE.methods_by_name['ListNvmeControllers']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['ListNvmeControllers']._serialized_options = b'\202\323\344\223\002\031\022\027/v1/{parent=subsystems}\332A\006parent'
  _FRONTENDNVMESERVICE.methods_by_name['GetNvmeController']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['GetNvmeController']._serialized_options = b'\202\323\344\223\002\036\022\034/v1/{name=NvmeControllers/*}\332A\004name'
  _FRONTENDNVMESERVICE.methods_by_name['StatsNvmeController']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['StatsNvmeController']._serialized_options = b'\202\323\344\223\002$\022\"/v1/{name=NvmeControllers/*}:stats\332A\004name'
  _FRONTENDNVMESERVICE.methods_by_name['CreateNvmeNamespace']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['CreateNvmeNamespace']._serialized_options = b'\202\323\344\223\002>\",/v1/{parent=nvmeSubsystems/*}/nvmeNamespaces:\016nvme_namespace\332A\'parent,nvme_namespace,nvme_namespace_id'
  _FRONTENDNVMESERVICE.methods_by_name['DeleteNvmeNamespace']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['DeleteNvmeNamespace']._serialized_options = b'\202\323\344\223\002\035*\033/v1/{name=NvmeNamespaces/*}\332A\004name'
  _FRONTENDNVMESERVICE.methods_by_name['UpdateNvmeNamespace']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['UpdateNvmeNamespace']._serialized_options = b'\202\323\344\223\00262$/v1/{nvme_namespace.name=subsystems}:\016nvme_namespace\332A\032nvme_namespace,update_mask'
  _FRONTENDNVMESERVICE.methods_by_name['ListNvmeNamespaces']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['ListNvmeNamespaces']._serialized_options = b'\202\323\344\223\002\031\022\027/v1/{parent=subsystems}\332A\006parent'
  _FRONTENDNVMESERVICE.methods_by_name['GetNvmeNamespace']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['GetNvmeNamespace']._serialized_options = b'\202\323\344\223\002\035\022\033/v1/{name=NvmeNamespaces/*}\332A\004name'
  _FRONTENDNVMESERVICE.methods_by_name['StatsNvmeNamespace']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['StatsNvmeNamespace']._serialized_options = b'\202\323\344\223\002#\022!/v1/{name=NvmeNamespaces/*}:stats\332A\004name'
  _NVMENAMESPACEPCISTATE._serialized_start=5021
  _NVMENAMESPACEPCISTATE._serialized_end=5202
  _NVMENAMESPACEPCIOPERSTATE._serialized_start=5205
  _NVMENAMESPACEPCIOPERSTATE._serialized_end=5364
  _NVMESUBSYSTEM._serialized_start=256
  _NVMESUBSYSTEM._serialized_end=542
  _NVMESUBSYSTEMSPEC._serialized_start=544
  _NVMESUBSYSTEMSPEC._serialized_end=665
  _NVMESUBSYSTEMSTATUS._serialized_start=667
  _NVMESUBSYSTEMSTATUS._serialized_end=743
  _NVMECONTROLLER._serialized_start=746
  _NVMECONTROLLER._serialized_end=1080
  _NVMECONTROLLERSPEC._serialized_start=1083
  _NVMECONTROLLERSPEC._serialized_end=1438
  _NVMECONTROLLERSTATUS._serialized_start=1440
  _NVMECONTROLLERSTATUS._serialized_end=1483
  _NVMENAMESPACE._serialized_start=1486
  _NVMENAMESPACE._serialized_end=1809
  _NVMENAMESPACESPEC._serialized_start=1812
  _NVMENAMESPACESPEC._serialized_end=1969
  _NVMENAMESPACESTATUS._serialized_start=1972
  _NVMENAMESPACESTATUS._serialized_end=2136
  _CREATENVMESUBSYSTEMREQUEST._serialized_start=2138
  _CREATENVMESUBSYSTEMREQUEST._serialized_end=2262
  _DELETENVMESUBSYSTEMREQUEST._serialized_start=2264
  _DELETENVMESUBSYSTEMREQUEST._serialized_end=2376
  _UPDATENVMESUBSYSTEMREQUEST._serialized_start=2379
  _UPDATENVMESUBSYSTEMREQUEST._serialized_end=2553
  _LISTNVMESUBSYSTEMSREQUEST._serialized_start=2556
  _LISTNVMESUBSYSTEMSREQUEST._serialized_end=2690
  _LISTNVMESUBSYSTEMSRESPONSE._serialized_start=2692
  _LISTNVMESUBSYSTEMSRESPONSE._serialized_end=2805
  _GETNVMESUBSYSTEMREQUEST._serialized_start=2807
  _GETNVMESUBSYSTEMREQUEST._serialized_end=2888
  _STATSNVMESUBSYSTEMREQUEST._serialized_start=2890
  _STATSNVMESUBSYSTEMREQUEST._serialized_end=2973
  _STATSNVMESUBSYSTEMRESPONSE._serialized_start=2975
  _STATSNVMESUBSYSTEMRESPONSE._serialized_end=3051
  _CREATENVMECONTROLLERREQUEST._serialized_start=3054
  _CREATENVMECONTROLLERREQUEST._serialized_end=3240
  _DELETENVMECONTROLLERREQUEST._serialized_start=3242
  _DELETENVMECONTROLLERREQUEST._serialized_end=3356
  _UPDATENVMECONTROLLERREQUEST._serialized_start=3359
  _UPDATENVMECONTROLLERREQUEST._serialized_end=3536
  _LISTNVMECONTROLLERSREQUEST._serialized_start=3539
  _LISTNVMECONTROLLERSREQUEST._serialized_end=3675
  _LISTNVMECONTROLLERSRESPONSE._serialized_start=3677
  _LISTNVMECONTROLLERSRESPONSE._serialized_end=3793
  _GETNVMECONTROLLERREQUEST._serialized_start=3795
  _GETNVMECONTROLLERREQUEST._serialized_end=3878
  _STATSNVMECONTROLLERREQUEST._serialized_start=3880
  _STATSNVMECONTROLLERREQUEST._serialized_end=3965
  _STATSNVMECONTROLLERRESPONSE._serialized_start=3967
  _STATSNVMECONTROLLERRESPONSE._serialized_end=4044
  _CREATENVMENAMESPACEREQUEST._serialized_start=4047
  _CREATENVMENAMESPACEREQUEST._serialized_end=4229
  _DELETENVMENAMESPACEREQUEST._serialized_start=4231
  _DELETENVMENAMESPACEREQUEST._serialized_end=4343
  _UPDATENVMENAMESPACEREQUEST._serialized_start=4346
  _UPDATENVMENAMESPACEREQUEST._serialized_end=4520
  _LISTNVMENAMESPACESREQUEST._serialized_start=4523
  _LISTNVMENAMESPACESREQUEST._serialized_end=4657
  _LISTNVMENAMESPACESRESPONSE._serialized_start=4659
  _LISTNVMENAMESPACESRESPONSE._serialized_end=4772
  _GETNVMENAMESPACEREQUEST._serialized_start=4774
  _GETNVMENAMESPACEREQUEST._serialized_end=4855
  _STATSNVMENAMESPACEREQUEST._serialized_start=4857
  _STATSNVMENAMESPACEREQUEST._serialized_end=4940
  _STATSNVMENAMESPACERESPONSE._serialized_start=4942
  _STATSNVMENAMESPACERESPONSE._serialized_end=5018
  _FRONTENDNVMESERVICE._serialized_start=5367
  _FRONTENDNVMESERVICE._serialized_end=8465
# @@protoc_insertion_point(module_scope)
