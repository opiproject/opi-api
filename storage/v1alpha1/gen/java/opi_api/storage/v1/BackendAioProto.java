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
    internal_static_opi_api_storage_v1_CreateAioControllerRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_CreateAioControllerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_DeleteAioControllerRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_DeleteAioControllerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_UpdateAioControllerRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_UpdateAioControllerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_ListAioControllersRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_ListAioControllersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_ListAioControllersResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_ListAioControllersResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_GetAioControllerRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_GetAioControllerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_AioControllerStatsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_AioControllerStatsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_AioControllerStatsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_AioControllerStatsResponse_fieldAccessorTable;

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
      "common.proto\032\nuuid.proto\"\275\001\n\rAioControll" +
      "er\022\014\n\004name\030\001 \001(\t\022\022\n\nblock_size\030\002 \001(\003\022\024\n\014" +
      "blocks_count\030\003 \001(\003\022%\n\004uuid\030\004 \001(\0132\027.opi_a" +
      "pi.common.v1.Uuid\022\020\n\010filename\030\005 \001(\t:;\352A8" +
      "\n$storage.opiproject.org/AioController\022\020" +
      "volumes/{volume}\"w\n\032CreateAioControllerR" +
      "equest\022>\n\016aio_controller\030\002 \001(\0132!.opi_api" +
      ".storage.v1.AioControllerB\003\340A\002\022\031\n\021aio_co" +
      "ntroller_id\030\003 \001(\t\"k\n\032DeleteAioController" +
      "Request\0226\n\004name\030\001 \001(\tB(\340A\002\372A\"\n opi_api.s" +
      "torage.v1/AioController\022\025\n\rallow_missing" +
      "\030\002 \001(\010\"\210\001\n\032UpdateAioControllerRequest\0229\n" +
      "\016aio_controller\030\001 \001(\0132!.opi_api.storage." +
      "v1.AioController\022/\n\013update_mask\030\002 \001(\0132\032." +
      "google.protobuf.FieldMask\"|\n\031ListAioCont" +
      "rollersRequest\0228\n\006parent\030\001 \001(\tB(\340A\002\372A\"\n " +
      "opi_api.storage.v1/AioController\022\021\n\tpage" +
      "_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"q\n\032ListA" +
      "ioControllersResponse\022:\n\017aio_controllers" +
      "\030\001 \003(\0132!.opi_api.storage.v1.AioControlle" +
      "r\022\027\n\017next_page_token\030\002 \001(\t\"Q\n\027GetAioCont" +
      "rollerRequest\0226\n\004name\030\001 \001(\tB(\340A\002\372A\"\n opi" +
      "_api.storage.v1/AioController\"I\n\031AioCont" +
      "rollerStatsRequest\022,\n\006handle\030\001 \001(\0132\034.opi" +
      "_api.common.v1.ObjectKey\"z\n\032AioControlle" +
      "rStatsResponse\022,\n\006handle\030\001 \001(\0132\034.opi_api" +
      ".common.v1.ObjectKey\022.\n\005stats\030\002 \001(\0132\037.op" +
      "i_api.storage.v1.VolumeStats2\317\007\n\024AioCont" +
      "rollerService\022\260\001\n\023CreateAioController\022.." +
      "opi_api.storage.v1.CreateAioControllerRe" +
      "quest\032!.opi_api.storage.v1.AioController" +
      "\"F\202\323\344\223\002\035\"\013/v1/volumes:\016aio_controller\332A " +
      "aio_controller,aio_controller_id\022\217\001\n\023Del" +
      "eteAioController\022..opi_api.storage.v1.De" +
      "leteAioControllerRequest\032\026.google.protob" +
      "uf.Empty\"0\202\323\344\223\002#*!/v1/{name=subsystems}/" +
      "{subsystem}\332A\004name\022\303\001\n\023UpdateAioControll" +
      "er\022..opi_api.storage.v1.UpdateAioControl" +
      "lerRequest\032!.opi_api.storage.v1.AioContr" +
      "oller\"Y\202\323\344\223\00262$/v1/{aio_controller.name=" +
      "subsystems}:\016aio_controller\332A\032aio_contro" +
      "ller,update_mask\022\235\001\n\022ListAioControllers\022" +
      "-.opi_api.storage.v1.ListAioControllersR" +
      "equest\032..opi_api.storage.v1.ListAioContr" +
      "ollersResponse\"(\202\323\344\223\002\031\022\027/v1/{parent=subs" +
      "ystems}\332A\006parent\022\224\001\n\020GetAioController\022+." +
      "opi_api.storage.v1.GetAioControllerReque" +
      "st\032!.opi_api.storage.v1.AioController\"0\202" +
      "\323\344\223\002#\022!/v1/{name=subsystems}/{subsystem}" +
      "\332A\004name\022u\n\022AioControllerStats\022-.opi_api." +
      "storage.v1.AioControllerStatsRequest\032..o" +
      "pi_api.storage.v1.AioControllerStatsResp" +
      "onse\"\000B^\n\022opi_api.storage.v1B\017BackendAio" +
      "ProtoP\001Z5github.com/opiproject/opi-api/s" +
      "torage/v1alpha1/gen/gob\006proto3"
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
    internal_static_opi_api_storage_v1_AioController_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opi_api_storage_v1_AioController_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_AioController_descriptor,
        new java.lang.String[] { "Name", "BlockSize", "BlocksCount", "Uuid", "Filename", });
    internal_static_opi_api_storage_v1_CreateAioControllerRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opi_api_storage_v1_CreateAioControllerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_CreateAioControllerRequest_descriptor,
        new java.lang.String[] { "AioController", "AioControllerId", });
    internal_static_opi_api_storage_v1_DeleteAioControllerRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_opi_api_storage_v1_DeleteAioControllerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_DeleteAioControllerRequest_descriptor,
        new java.lang.String[] { "Name", "AllowMissing", });
    internal_static_opi_api_storage_v1_UpdateAioControllerRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_opi_api_storage_v1_UpdateAioControllerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_UpdateAioControllerRequest_descriptor,
        new java.lang.String[] { "AioController", "UpdateMask", });
    internal_static_opi_api_storage_v1_ListAioControllersRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_opi_api_storage_v1_ListAioControllersRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_ListAioControllersRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_opi_api_storage_v1_ListAioControllersResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_opi_api_storage_v1_ListAioControllersResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_ListAioControllersResponse_descriptor,
        new java.lang.String[] { "AioControllers", "NextPageToken", });
    internal_static_opi_api_storage_v1_GetAioControllerRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_opi_api_storage_v1_GetAioControllerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_GetAioControllerRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_opi_api_storage_v1_AioControllerStatsRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_opi_api_storage_v1_AioControllerStatsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_AioControllerStatsRequest_descriptor,
        new java.lang.String[] { "Handle", });
    internal_static_opi_api_storage_v1_AioControllerStatsResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_opi_api_storage_v1_AioControllerStatsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_AioControllerStatsResponse_descriptor,
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
