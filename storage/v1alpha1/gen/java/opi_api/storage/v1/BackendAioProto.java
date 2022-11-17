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
    internal_static_opi_api_storage_v1_AioController_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_AioController_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_AioControllerCreateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_AioControllerCreateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_AioControllerDeleteRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_AioControllerDeleteRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_AioControllerUpdateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_AioControllerUpdateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_AioControllerList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_AioControllerList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_AioControllerGetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_AioControllerGetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_AioControllerGetListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_AioControllerGetListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_AioControllerGetStatsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_AioControllerGetStatsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_AioControllerStatsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_AioControllerStatsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_AioControllerStats_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_AioControllerStats_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021backend_aio.proto\022\022opi_api.storage.v1\032" +
      "\033google/protobuf/empty.proto\032\020object_key" +
      ".proto\032\nuuid.proto\"\240\001\n\rAioController\022,\n\006" +
      "handle\030\001 \001(\0132\034.opi_api.common.v1.ObjectK" +
      "ey\022\022\n\nblock_size\030\002 \001(\003\022\024\n\014blocks_count\030\003" +
      " \001(\003\022%\n\004uuid\030\004 \001(\0132\027.opi_api.common.v1.U" +
      "uid\022\020\n\010filename\030\005 \001(\t\"}\n\032AioControllerCr" +
      "eateRequest\0221\n\006device\030\001 \001(\0132!.opi_api.st" +
      "orage.v1.AioController\022,\n\006txn_id\030\002 \001(\0132\034" +
      ".opi_api.common.v1.ObjectKey\"x\n\032AioContr" +
      "ollerDeleteRequest\022,\n\006handle\030\001 \001(\0132\034.opi" +
      "_api.common.v1.ObjectKey\022,\n\006txn_id\030\002 \001(\013" +
      "2\034.opi_api.common.v1.ObjectKey\"}\n\032AioCon" +
      "trollerUpdateRequest\0221\n\006device\030\001 \001(\0132!.o" +
      "pi_api.storage.v1.AioController\022,\n\006txn_i" +
      "d\030\002 \001(\0132\034.opi_api.common.v1.ObjectKey\"F\n" +
      "\021AioControllerList\0221\n\006device\030\001 \003(\0132!.opi" +
      "_api.storage.v1.AioController\"G\n\027AioCont" +
      "rollerGetRequest\022,\n\006handle\030\001 \001(\0132\034.opi_a" +
      "pi.common.v1.ObjectKey\"\035\n\033AioControllerG" +
      "etListRequest\"L\n\034AioControllerGetStatsRe" +
      "quest\022,\n\006handle\030\001 \001(\0132\034.opi_api.common.v" +
      "1.ObjectKey\"I\n\031AioControllerStatsRequest" +
      "\022,\n\006handle\030\001 \001(\0132\034.opi_api.common.v1.Obj" +
      "ectKey\"Q\n\022AioControllerStats\022,\n\006handle\030\001" +
      " \001(\0132\034.opi_api.common.v1.ObjectKey\022\r\n\005st" +
      "ats\030\002 \001(\t2\234\005\n\024AioControllerService\022j\n\023Ai" +
      "oControllerCreate\022..opi_api.storage.v1.A" +
      "ioControllerCreateRequest\032!.opi_api.stor" +
      "age.v1.AioController\"\000\022_\n\023AioControllerD" +
      "elete\022..opi_api.storage.v1.AioController" +
      "DeleteRequest\032\026.google.protobuf.Empty\"\000\022" +
      "d\n\020AioControllerGet\022+.opi_api.storage.v1" +
      ".AioControllerGetRequest\032!.opi_api.stora" +
      "ge.v1.AioController\"\000\022p\n\024AioControllerGe" +
      "tList\022/.opi_api.storage.v1.AioController" +
      "GetListRequest\032%.opi_api.storage.v1.AioC" +
      "ontrollerList\"\000\022s\n\025AioControllerGetStats" +
      "\0220.opi_api.storage.v1.AioControllerGetSt" +
      "atsRequest\032&.opi_api.storage.v1.AioContr" +
      "ollerStats\"\000\022j\n\023AioControllerUpdate\022..op" +
      "i_api.storage.v1.AioControllerUpdateRequ" +
      "est\032!.opi_api.storage.v1.AioController\"\000" +
      "B^\n\022opi_api.storage.v1B\017BackendAioProtoP" +
      "\001Z5github.com/opiproject/opi-api/storage" +
      "/v1alpha1/gen/gob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
          opi_api.common.v1.ObjectKeyProto.getDescriptor(),
          opi_api.common.v1.UuidProto.getDescriptor(),
        });
    internal_static_opi_api_storage_v1_AioController_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opi_api_storage_v1_AioController_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_AioController_descriptor,
        new java.lang.String[] { "Handle", "BlockSize", "BlocksCount", "Uuid", "Filename", });
    internal_static_opi_api_storage_v1_AioControllerCreateRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opi_api_storage_v1_AioControllerCreateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_AioControllerCreateRequest_descriptor,
        new java.lang.String[] { "Device", "TxnId", });
    internal_static_opi_api_storage_v1_AioControllerDeleteRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_opi_api_storage_v1_AioControllerDeleteRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_AioControllerDeleteRequest_descriptor,
        new java.lang.String[] { "Handle", "TxnId", });
    internal_static_opi_api_storage_v1_AioControllerUpdateRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_opi_api_storage_v1_AioControllerUpdateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_AioControllerUpdateRequest_descriptor,
        new java.lang.String[] { "Device", "TxnId", });
    internal_static_opi_api_storage_v1_AioControllerList_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_opi_api_storage_v1_AioControllerList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_AioControllerList_descriptor,
        new java.lang.String[] { "Device", });
    internal_static_opi_api_storage_v1_AioControllerGetRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_opi_api_storage_v1_AioControllerGetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_AioControllerGetRequest_descriptor,
        new java.lang.String[] { "Handle", });
    internal_static_opi_api_storage_v1_AioControllerGetListRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_opi_api_storage_v1_AioControllerGetListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_AioControllerGetListRequest_descriptor,
        new java.lang.String[] { });
    internal_static_opi_api_storage_v1_AioControllerGetStatsRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_opi_api_storage_v1_AioControllerGetStatsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_AioControllerGetStatsRequest_descriptor,
        new java.lang.String[] { "Handle", });
    internal_static_opi_api_storage_v1_AioControllerStatsRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_opi_api_storage_v1_AioControllerStatsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_AioControllerStatsRequest_descriptor,
        new java.lang.String[] { "Handle", });
    internal_static_opi_api_storage_v1_AioControllerStats_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_opi_api_storage_v1_AioControllerStats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_AioControllerStats_descriptor,
        new java.lang.String[] { "Handle", "Stats", });
    com.google.protobuf.EmptyProto.getDescriptor();
    opi_api.common.v1.ObjectKeyProto.getDescriptor();
    opi_api.common.v1.UuidProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
