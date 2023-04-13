// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_virtio_blk.proto

package opi_api.storage.v1;

public final class FrontendVirtioBlkProto {
  private FrontendVirtioBlkProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_VirtioBlk_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_VirtioBlk_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_CreateVirtioBlkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_CreateVirtioBlkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_DeleteVirtioBlkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_DeleteVirtioBlkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_UpdateVirtioBlkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_UpdateVirtioBlkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_ListVirtioBlksRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_ListVirtioBlksRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_ListVirtioBlksResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_ListVirtioBlksResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_GetVirtioBlkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_GetVirtioBlkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_VirtioBlkStatsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_VirtioBlkStatsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_VirtioBlkStatsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_VirtioBlkStatsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031frontend_virtio_blk.proto\022\022opi_api.sto" +
      "rage.v1\032\017opicommon.proto\032\020object_key.pro" +
      "to\032\027google/api/client.proto\032\031google/api/" +
      "resource.proto\032\033google/protobuf/empty.pr" +
      "oto\032\034google/api/annotations.proto\032\037googl" +
      "e/api/field_behavior.proto\032 google/proto" +
      "buf/field_mask.proto\"\216\002\n\tVirtioBlk\022(\n\002id" +
      "\030\001 \001(\0132\034.opi_api.common.v1.ObjectKey\0220\n\007" +
      "pcie_id\030\002 \001(\0132\037.opi_api.storage.v1.PciEn" +
      "dpoint\022/\n\tvolume_id\030\003 \001(\0132\034.opi_api.comm" +
      "on.v1.ObjectKey\022\022\n\nmax_io_qps\030\004 \001(\003\022/\n\tm" +
      "in_limit\030\005 \001(\0132\034.opi_api.storage.v1.QosL" +
      "imit\022/\n\tmax_limit\030\006 \001(\0132\034.opi_api.storag" +
      "e.v1.QosLimit\"\235\001\n\026CreateVirtioBlkRequest" +
      "\0224\n\006parent\030\001 \001(\tB$\340A\002\372A\036\n\034opi_api.storag" +
      "e.v1/VirtioBlk\0226\n\nvirtio_blk\030\002 \001(\0132\035.opi" +
      "_api.storage.v1.VirtioBlkB\003\340A\002\022\025\n\rvirtio" +
      "_blk_id\030\003 \001(\t\"c\n\026DeleteVirtioBlkRequest\022" +
      "2\n\004name\030\001 \001(\tB$\340A\002\372A\036\n\034opi_api.storage.v" +
      "1/VirtioBlk\022\025\n\rallow_missing\030\002 \001(\010\"|\n\026Up" +
      "dateVirtioBlkRequest\0221\n\nvirtio_blk\030\001 \001(\013" +
      "2\035.opi_api.storage.v1.VirtioBlk\022/\n\013updat" +
      "e_mask\030\002 \001(\0132\032.google.protobuf.FieldMask" +
      "\"t\n\025ListVirtioBlksRequest\0224\n\006parent\030\001 \001(" +
      "\tB$\340A\002\372A\036\n\034opi_api.storage.v1/VirtioBlk\022" +
      "\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"e" +
      "\n\026ListVirtioBlksResponse\0222\n\013virtio_blks\030" +
      "\001 \003(\0132\035.opi_api.storage.v1.VirtioBlk\022\027\n\017" +
      "next_page_token\030\002 \001(\t\"I\n\023GetVirtioBlkReq" +
      "uest\0222\n\004name\030\001 \001(\tB$\340A\002\372A\036\n\034opi_api.stor" +
      "age.v1/VirtioBlk\"L\n\025VirtioBlkStatsReques" +
      "t\0223\n\rcontroller_id\030\001 \001(\0132\034.opi_api.commo" +
      "n.v1.ObjectKey\"r\n\026VirtioBlkStatsResponse" +
      "\022(\n\002id\030\001 \001(\0132\034.opi_api.common.v1.ObjectK" +
      "ey\022.\n\005stats\030\002 \001(\0132\037.opi_api.storage.v1.V" +
      "olumeStats2\212\007\n\030FrontendVirtioBlkService\022" +
      "\253\001\n\017CreateVirtioBlk\022*.opi_api.storage.v1" +
      ".CreateVirtioBlkRequest\032\035.opi_api.storag" +
      "e.v1.VirtioBlk\"M\202\323\344\223\002%\"\027/v1/{parent=subs" +
      "ystems}:\nvirtio_blk\332A\037parent,virtio_blk," +
      "virtio_blk_id\022\207\001\n\017DeleteVirtioBlk\022*.opi_" +
      "api.storage.v1.DeleteVirtioBlkRequest\032\026." +
      "google.protobuf.Empty\"0\202\323\344\223\002#*!/v1/{name" +
      "=virtioblks}/{virtioblk}\332A\004name\022\253\001\n\017Upda" +
      "teVirtioBlk\022*.opi_api.storage.v1.UpdateV" +
      "irtioBlkRequest\032\035.opi_api.storage.v1.Vir" +
      "tioBlk\"M\202\323\344\223\002.2 /v1/{virtio_blk.name=sub" +
      "systems}:\nvirtio_blk\332A\026virtio_blk,update" +
      "_mask\022\221\001\n\016ListVirtioBlks\022).opi_api.stora" +
      "ge.v1.ListVirtioBlksRequest\032*.opi_api.st" +
      "orage.v1.ListVirtioBlksResponse\"(\202\323\344\223\002\031\022" +
      "\027/v1/{parent=subsystems}\332A\006parent\022\210\001\n\014Ge" +
      "tVirtioBlk\022\'.opi_api.storage.v1.GetVirti" +
      "oBlkRequest\032\035.opi_api.storage.v1.VirtioB" +
      "lk\"0\202\323\344\223\002#\022!/v1/{name=subsystems}/{virti" +
      "oblk}\332A\004name\022i\n\016VirtioBlkStats\022).opi_api" +
      ".storage.v1.VirtioBlkStatsRequest\032*.opi_" +
      "api.storage.v1.VirtioBlkStatsResponse\"\000B" +
      "e\n\022opi_api.storage.v1B\026FrontendVirtioBlk" +
      "ProtoP\001Z5github.com/opiproject/opi-api/s" +
      "torage/v1alpha1/gen/gob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          opi_api.storage.v1.OpiCommonProto.getDescriptor(),
          opi_api.common.v1.ObjectKeyProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_opi_api_storage_v1_VirtioBlk_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opi_api_storage_v1_VirtioBlk_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_VirtioBlk_descriptor,
        new java.lang.String[] { "Id", "PcieId", "VolumeId", "MaxIoQps", "MinLimit", "MaxLimit", });
    internal_static_opi_api_storage_v1_CreateVirtioBlkRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opi_api_storage_v1_CreateVirtioBlkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_CreateVirtioBlkRequest_descriptor,
        new java.lang.String[] { "Parent", "VirtioBlk", "VirtioBlkId", });
    internal_static_opi_api_storage_v1_DeleteVirtioBlkRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_opi_api_storage_v1_DeleteVirtioBlkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_DeleteVirtioBlkRequest_descriptor,
        new java.lang.String[] { "Name", "AllowMissing", });
    internal_static_opi_api_storage_v1_UpdateVirtioBlkRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_opi_api_storage_v1_UpdateVirtioBlkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_UpdateVirtioBlkRequest_descriptor,
        new java.lang.String[] { "VirtioBlk", "UpdateMask", });
    internal_static_opi_api_storage_v1_ListVirtioBlksRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_opi_api_storage_v1_ListVirtioBlksRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_ListVirtioBlksRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_opi_api_storage_v1_ListVirtioBlksResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_opi_api_storage_v1_ListVirtioBlksResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_ListVirtioBlksResponse_descriptor,
        new java.lang.String[] { "VirtioBlks", "NextPageToken", });
    internal_static_opi_api_storage_v1_GetVirtioBlkRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_opi_api_storage_v1_GetVirtioBlkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_GetVirtioBlkRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_opi_api_storage_v1_VirtioBlkStatsRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_opi_api_storage_v1_VirtioBlkStatsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_VirtioBlkStatsRequest_descriptor,
        new java.lang.String[] { "ControllerId", });
    internal_static_opi_api_storage_v1_VirtioBlkStatsResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_opi_api_storage_v1_VirtioBlkStatsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_VirtioBlkStatsResponse_descriptor,
        new java.lang.String[] { "Id", "Stats", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    opi_api.storage.v1.OpiCommonProto.getDescriptor();
    opi_api.common.v1.ObjectKeyProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
