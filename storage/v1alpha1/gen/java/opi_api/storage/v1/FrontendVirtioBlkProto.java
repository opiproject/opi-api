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
    internal_static_opi_api_storage_v1_VirtioBlkCreateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_VirtioBlkCreateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_VirtioBlkDeleteRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_VirtioBlkDeleteRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_VirtioBlkUpdateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_VirtioBlkUpdateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_VirtioBlkListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_VirtioBlkListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_VirtioBlkListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_VirtioBlkListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_VirtioBlkGetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_VirtioBlkGetRequest_fieldAccessorTable;
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
      "rage.v1\032\014common.proto\032\033google/protobuf/e" +
      "mpty.proto\032\034google/api/annotations.proto" +
      "\"\230\001\n\tVirtioBlk\022\n\n\002id\030\001 \001(\003\022\014\n\004name\030\002 \001(\t" +
      "\0228\n\007pcie_id\030\003 \001(\0132\'.opi_api.storage.v1.N" +
      "vmeControllerPciId\022\014\n\004bdev\030\004 \001(\t\022\022\n\nmax_" +
      "io_qps\030\005 \001(\003\022\025\n\rserial_number\030\006 \001(\t\"K\n\026V" +
      "irtioBlkCreateRequest\0221\n\ncontroller\030\001 \001(" +
      "\0132\035.opi_api.storage.v1.VirtioBlk\"/\n\026Virt" +
      "ioBlkDeleteRequest\022\025\n\rcontroller_id\030\001 \001(" +
      "\003\"K\n\026VirtioBlkUpdateRequest\0221\n\ncontrolle" +
      "r\030\001 \001(\0132\035.opi_api.storage.v1.VirtioBlk\"," +
      "\n\024VirtioBlkListRequest\022\024\n\014virtioblk_id\030\001" +
      " \001(\003\"J\n\025VirtioBlkListResponse\0221\n\ncontrol" +
      "ler\030\001 \003(\0132\035.opi_api.storage.v1.VirtioBlk" +
      "\",\n\023VirtioBlkGetRequest\022\025\n\rcontroller_id" +
      "\030\001 \001(\003\".\n\025VirtioBlkStatsRequest\022\025\n\rcontr" +
      "oller_id\030\001 \001(\003\"3\n\026VirtioBlkStatsResponse" +
      "\022\n\n\002id\030\001 \001(\003\022\r\n\005stats\030\002 \001(\t2\374\005\n\030Frontend" +
      "VirtioBlkService\022\177\n\017VirtioBlkCreate\022*.op" +
      "i_api.storage.v1.VirtioBlkCreateRequest\032" +
      "\035.opi_api.storage.v1.VirtioBlk\"!\202\323\344\223\002\033\"\016" +
      "/v1/virtioblks:\tvirtioblk\022y\n\017VirtioBlkDe" +
      "lete\022*.opi_api.storage.v1.VirtioBlkDelet" +
      "eRequest\032\026.google.protobuf.Empty\"\"\202\323\344\223\002\034" +
      "*\032/v1/virtioblks/{virtioblk}\022\177\n\017VirtioBl" +
      "kUpdate\022*.opi_api.storage.v1.VirtioBlkUp" +
      "dateRequest\032\035.opi_api.storage.v1.VirtioB" +
      "lk\"!\202\323\344\223\002\0332\016/v1/virtioblks:\tvirtioblk\022|\n" +
      "\rVirtioBlkList\022(.opi_api.storage.v1.Virt" +
      "ioBlkListRequest\032).opi_api.storage.v1.Vi" +
      "rtioBlkListResponse\"\026\202\323\344\223\002\020\022\016/v1/virtiob" +
      "lks\022z\n\014VirtioBlkGet\022\'.opi_api.storage.v1" +
      ".VirtioBlkGetRequest\032\035.opi_api.storage.v" +
      "1.VirtioBlk\"\"\202\323\344\223\002\034\022\032/v1/virtioblks/{vir" +
      "tioblk}\022i\n\016VirtioBlkStats\022).opi_api.stor" +
      "age.v1.VirtioBlkStatsRequest\032*.opi_api.s" +
      "torage.v1.VirtioBlkStatsResponse\"\000Be\n\022op" +
      "i_api.storage.v1B\026FrontendVirtioBlkProto" +
      "P\001Z5github.com/opiproject/opi-api/storag" +
      "e/v1alpha1/gen/gob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          opi_api.storage.v1.CommonProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_opi_api_storage_v1_VirtioBlk_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opi_api_storage_v1_VirtioBlk_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_VirtioBlk_descriptor,
        new java.lang.String[] { "Id", "Name", "PcieId", "Bdev", "MaxIoQps", "SerialNumber", });
    internal_static_opi_api_storage_v1_VirtioBlkCreateRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opi_api_storage_v1_VirtioBlkCreateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_VirtioBlkCreateRequest_descriptor,
        new java.lang.String[] { "Controller", });
    internal_static_opi_api_storage_v1_VirtioBlkDeleteRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_opi_api_storage_v1_VirtioBlkDeleteRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_VirtioBlkDeleteRequest_descriptor,
        new java.lang.String[] { "ControllerId", });
    internal_static_opi_api_storage_v1_VirtioBlkUpdateRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_opi_api_storage_v1_VirtioBlkUpdateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_VirtioBlkUpdateRequest_descriptor,
        new java.lang.String[] { "Controller", });
    internal_static_opi_api_storage_v1_VirtioBlkListRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_opi_api_storage_v1_VirtioBlkListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_VirtioBlkListRequest_descriptor,
        new java.lang.String[] { "VirtioblkId", });
    internal_static_opi_api_storage_v1_VirtioBlkListResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_opi_api_storage_v1_VirtioBlkListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_VirtioBlkListResponse_descriptor,
        new java.lang.String[] { "Controller", });
    internal_static_opi_api_storage_v1_VirtioBlkGetRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_opi_api_storage_v1_VirtioBlkGetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_VirtioBlkGetRequest_descriptor,
        new java.lang.String[] { "ControllerId", });
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
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    opi_api.storage.v1.CommonProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
