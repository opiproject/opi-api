// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_aio.proto

package opi_api.storage.v1;

public final class BackendAioProto {
  private BackendAioProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_AioVolume_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_AioVolume_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_CreateAioVolumeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_CreateAioVolumeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_DeleteAioVolumeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_DeleteAioVolumeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_UpdateAioVolumeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_UpdateAioVolumeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_ListAioVolumesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_ListAioVolumesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_ListAioVolumesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_ListAioVolumesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_GetAioVolumeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_GetAioVolumeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_AioVolumeStatsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_AioVolumeStatsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_AioVolumeStatsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_AioVolumeStatsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021backend_aio.proto\022\022opi_api.storage.v1\032" +
      "\027google/api/client.proto\032\031google/api/res" +
      "ource.proto\032\033google/protobuf/empty.proto" +
      "\032\034google/api/annotations.proto\032\037google/a" +
      "pi/field_behavior.proto\032 google/protobuf" +
      "/field_mask.proto\032\020object_key.proto\032\017opi" +
      "common.proto\032\nuuid.proto\"\265\001\n\tAioVolume\022\014" +
      "\n\004name\030\001 \001(\t\022\022\n\nblock_size\030\002 \001(\003\022\024\n\014bloc" +
      "ks_count\030\003 \001(\003\022%\n\004uuid\030\004 \001(\0132\027.opi_api.c" +
      "ommon.v1.Uuid\022\020\n\010filename\030\005 \001(\t:7\352A4\n st" +
      "orage.opiproject.org/AioVolume\022\020volumes/" +
      "{volume}\"g\n\026CreateAioVolumeRequest\0226\n\nai" +
      "o_volume\030\002 \001(\0132\035.opi_api.storage.v1.AioV" +
      "olumeB\003\340A\002\022\025\n\raio_volume_id\030\003 \001(\t\"c\n\026Del" +
      "eteAioVolumeRequest\0222\n\004name\030\001 \001(\tB$\340A\002\372A" +
      "\036\n\034opi_api.storage.v1/AioVolume\022\025\n\rallow" +
      "_missing\030\002 \001(\010\"\223\001\n\026UpdateAioVolumeReques" +
      "t\0221\n\naio_volume\030\001 \001(\0132\035.opi_api.storage." +
      "v1.AioVolume\022/\n\013update_mask\030\002 \001(\0132\032.goog" +
      "le.protobuf.FieldMask\022\025\n\rallow_missing\030\003" +
      " \001(\010\"t\n\025ListAioVolumesRequest\0224\n\006parent\030" +
      "\001 \001(\tB$\340A\002\372A\036\n\034opi_api.storage.v1/AioVol" +
      "ume\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001" +
      "(\t\"e\n\026ListAioVolumesResponse\0222\n\013aio_volu" +
      "mes\030\001 \003(\0132\035.opi_api.storage.v1.AioVolume" +
      "\022\027\n\017next_page_token\030\002 \001(\t\"I\n\023GetAioVolum" +
      "eRequest\0222\n\004name\030\001 \001(\tB$\340A\002\372A\036\n\034opi_api." +
      "storage.v1/AioVolume\"E\n\025AioVolumeStatsRe" +
      "quest\022,\n\006handle\030\001 \001(\0132\034.opi_api.common.v" +
      "1.ObjectKey\"v\n\026AioVolumeStatsResponse\022,\n" +
      "\006handle\030\001 \001(\0132\034.opi_api.common.v1.Object" +
      "Key\022.\n\005stats\030\002 \001(\0132\037.opi_api.storage.v1." +
      "VolumeStats2\357\006\n\020AioVolumeService\022\230\001\n\017Cre" +
      "ateAioVolume\022*.opi_api.storage.v1.Create" +
      "AioVolumeRequest\032\035.opi_api.storage.v1.Ai" +
      "oVolume\":\202\323\344\223\002\031\"\013/v1/volumes:\naio_volume" +
      "\332A\030aio_volume,aio_volume_id\022\207\001\n\017DeleteAi" +
      "oVolume\022*.opi_api.storage.v1.DeleteAioVo" +
      "lumeRequest\032\026.google.protobuf.Empty\"0\202\323\344" +
      "\223\002#*!/v1/{name=subsystems}/{subsystem}\332A" +
      "\004name\022\253\001\n\017UpdateAioVolume\022*.opi_api.stor" +
      "age.v1.UpdateAioVolumeRequest\032\035.opi_api." +
      "storage.v1.AioVolume\"M\202\323\344\223\002.2 /v1/{aio_v" +
      "olume.name=subsystems}:\naio_volume\332A\026aio" +
      "_volume,update_mask\022\221\001\n\016ListAioVolumes\022)" +
      ".opi_api.storage.v1.ListAioVolumesReques" +
      "t\032*.opi_api.storage.v1.ListAioVolumesRes" +
      "ponse\"(\202\323\344\223\002\031\022\027/v1/{parent=subsystems}\332A" +
      "\006parent\022\210\001\n\014GetAioVolume\022\'.opi_api.stora" +
      "ge.v1.GetAioVolumeRequest\032\035.opi_api.stor" +
      "age.v1.AioVolume\"0\202\323\344\223\002#\022!/v1/{name=subs" +
      "ystems}/{subsystem}\332A\004name\022i\n\016AioVolumeS" +
      "tats\022).opi_api.storage.v1.AioVolumeStats" +
      "Request\032*.opi_api.storage.v1.AioVolumeSt" +
      "atsResponse\"\000B^\n\022opi_api.storage.v1B\017Bac" +
      "kendAioProtoP\001Z5github.com/opiproject/op" +
      "i-api/storage/v1alpha1/gen/gob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          opi_api.common.v1.ObjectKeyProto.getDescriptor(),
          opi_api.storage.v1.OpiCommonProto.getDescriptor(),
          opi_api.common.v1.UuidProto.getDescriptor(),
        });
    internal_static_opi_api_storage_v1_AioVolume_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opi_api_storage_v1_AioVolume_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_AioVolume_descriptor,
        new java.lang.String[] { "Name", "BlockSize", "BlocksCount", "Uuid", "Filename", });
    internal_static_opi_api_storage_v1_CreateAioVolumeRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opi_api_storage_v1_CreateAioVolumeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_CreateAioVolumeRequest_descriptor,
        new java.lang.String[] { "AioVolume", "AioVolumeId", });
    internal_static_opi_api_storage_v1_DeleteAioVolumeRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_opi_api_storage_v1_DeleteAioVolumeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_DeleteAioVolumeRequest_descriptor,
        new java.lang.String[] { "Name", "AllowMissing", });
    internal_static_opi_api_storage_v1_UpdateAioVolumeRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_opi_api_storage_v1_UpdateAioVolumeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_UpdateAioVolumeRequest_descriptor,
        new java.lang.String[] { "AioVolume", "UpdateMask", "AllowMissing", });
    internal_static_opi_api_storage_v1_ListAioVolumesRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_opi_api_storage_v1_ListAioVolumesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_ListAioVolumesRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_opi_api_storage_v1_ListAioVolumesResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_opi_api_storage_v1_ListAioVolumesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_ListAioVolumesResponse_descriptor,
        new java.lang.String[] { "AioVolumes", "NextPageToken", });
    internal_static_opi_api_storage_v1_GetAioVolumeRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_opi_api_storage_v1_GetAioVolumeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_GetAioVolumeRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_opi_api_storage_v1_AioVolumeStatsRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_opi_api_storage_v1_AioVolumeStatsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_AioVolumeStatsRequest_descriptor,
        new java.lang.String[] { "Handle", });
    internal_static_opi_api_storage_v1_AioVolumeStatsResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_opi_api_storage_v1_AioVolumeStatsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_AioVolumeStatsResponse_descriptor,
        new java.lang.String[] { "Handle", "Stats", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.ClientProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    opi_api.common.v1.ObjectKeyProto.getDescriptor();
    opi_api.storage.v1.OpiCommonProto.getDescriptor();
    opi_api.common.v1.UuidProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
