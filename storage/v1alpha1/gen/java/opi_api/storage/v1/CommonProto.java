// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package opi_api.storage.v1;

public final class CommonProto {
  private CommonProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_NvmeControllerPciId_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_NvmeControllerPciId_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014common.proto\022\022opi_api.storage.v1\"^\n\023Nv" +
      "meControllerPciId\022\013\n\003bus\030\001 \001(\r\022\016\n\006device" +
      "\030\002 \001(\r\022\020\n\010function\030\003 \001(\r\022\030\n\020virtual_func" +
      "tion\030\004 \001(\rBZ\n\022opi_api.storage.v1B\013Common" +
      "ProtoP\001Z5github.com/opiproject/opi-api/s" +
      "torage/v1alpha1/gen/gob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_opi_api_storage_v1_NvmeControllerPciId_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opi_api_storage_v1_NvmeControllerPciId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_NvmeControllerPciId_descriptor,
        new java.lang.String[] { "Bus", "Device", "Function", "VirtualFunction", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
