// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: l3_xpu_infra_mgr.proto

package opi_api.network.evpn_gw.v1alpha1;

public final class L3XpuInfraMgrProto {
  private L3XpuInfraMgrProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_evpn_gw_v1alpha1_Vrf_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_evpn_gw_v1alpha1_Vrf_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_evpn_gw_v1alpha1_CreateVrfRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_evpn_gw_v1alpha1_CreateVrfRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_evpn_gw_v1alpha1_ListVrfsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_evpn_gw_v1alpha1_ListVrfsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_evpn_gw_v1alpha1_ListVrfsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_evpn_gw_v1alpha1_ListVrfsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_evpn_gw_v1alpha1_GetVrfRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_evpn_gw_v1alpha1_GetVrfRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_evpn_gw_v1alpha1_DeleteVrfRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_evpn_gw_v1alpha1_DeleteVrfRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_evpn_gw_v1alpha1_IpAddressMasklen_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_evpn_gw_v1alpha1_IpAddressMasklen_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_evpn_gw_v1alpha1_Svi_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_evpn_gw_v1alpha1_Svi_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_evpn_gw_v1alpha1_CreateSviRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_evpn_gw_v1alpha1_CreateSviRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_evpn_gw_v1alpha1_ListSvisRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_evpn_gw_v1alpha1_ListSvisRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_evpn_gw_v1alpha1_ListSvisResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_evpn_gw_v1alpha1_ListSvisResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_evpn_gw_v1alpha1_GetSviRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_evpn_gw_v1alpha1_GetSviRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_evpn_gw_v1alpha1_DeleteSviRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_evpn_gw_v1alpha1_DeleteSviRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026l3_xpu_infra_mgr.proto\022 opi_api.networ" +
      "k.evpn_gw.v1alpha1\032\034google/api/annotatio" +
      "ns.proto\032\027google/api/client.proto\032\033googl" +
      "e/protobuf/empty.proto\032\037google/api/field" +
      "_behavior.proto\032\031google/api/resource.pro" +
      "to\"\204\002\n\003Vrf\022\021\n\004name\030\001 \001(\tB\003\340A\002\022\013\n\003vni\030\002 \001" +
      "(\r\022\025\n\rrouting_table\030\003 \001(\r\022\030\n\013loopback_ip" +
      "\030\004 \001(\tB\003\340A\002\022\017\n\007vtep_ip\030\005 \001(\t\022\020\n\010local_as" +
      "\030\006 \001(\r\022\n\n\002rd\030\007 \001(\t\022\014\n\004rmac\030\010 \001(\t\022\022\n\nimpo" +
      "rt_rts\030\t \003(\t\022\022\n\nexport_rts\030\n \003(\t\022\020\n\010vlan" +
      "_ids\030\013 \003(\r:5\352A2\n$opi_api.network.evpn_gw" +
      ".v1alpha1/Vrf\022\nvrfs/{vrf}\"K\n\020CreateVrfRe" +
      "quest\0227\n\003vrf\030\001 \001(\0132%.opi_api.network.evp" +
      "n_gw.v1alpha1.VrfB\003\340A\002\"8\n\017ListVrfsReques" +
      "t\022\021\n\tpage_size\030\001 \001(\005\022\022\n\npage_token\030\002 \001(\t" +
      "\"`\n\020ListVrfsResponse\0223\n\004vrfs\030\001 \003(\0132%.opi" +
      "_api.network.evpn_gw.v1alpha1.Vrf\022\027\n\017nex" +
      "t_page_token\030\002 \001(\t\"K\n\rGetVrfRequest\022:\n\004n" +
      "ame\030\001 \001(\tB,\340A\002\372A&\n$opi_api.network.evpn_" +
      "gw.v1alpha1/Vrf\"N\n\020DeleteVrfRequest\022:\n\004n" +
      "ame\030\001 \001(\tB,\340A\002\372A&\n$opi_api.network.evpn_" +
      "gw.v1alpha1/Vrf\"0\n\020IpAddressMasklen\022\017\n\007i" +
      "p_addr\030\001 \001(\t\022\013\n\003len\030\002 \001(\r\"\355\001\n\003Svi\022\020\n\003vrf" +
      "\030\001 \001(\tB\003\340A\002\022\024\n\007vlan_id\030\002 \001(\rB\003\340A\002\022\030\n\013mac" +
      "_address\030\003 \001(\tB\003\340A\002\022F\n\005gw_ip\030\004 \003(\01322.opi" +
      "_api.network.evpn_gw.v1alpha1.IpAddressM" +
      "asklenB\003\340A\002\022\022\n\nenable_bgp\030\005 \001(\010\022\021\n\tremot" +
      "e_as\030\006 \001(\r:5\352A2\n$opi_api.network.evpn_gw" +
      ".v1alpha1/Svi\022\nsvis/{svi}\"K\n\020CreateSviRe" +
      "quest\0227\n\003svi\030\001 \001(\0132%.opi_api.network.evp" +
      "n_gw.v1alpha1.SviB\003\340A\002\"8\n\017ListSvisReques" +
      "t\022\021\n\tpage_size\030\001 \001(\005\022\022\n\npage_token\030\002 \001(\t" +
      "\"`\n\020ListSvisResponse\0223\n\004svis\030\001 \003(\0132%.opi" +
      "_api.network.evpn_gw.v1alpha1.Svi\022\027\n\017nex" +
      "t_page_token\030\002 \001(\t\"7\n\rGetSviRequest\022\020\n\003v" +
      "rf\030\001 \001(\tB\003\340A\002\022\024\n\007vlan_id\030\002 \001(\rB\003\340A\002\":\n\020D" +
      "eleteSviRequest\022\020\n\003vrf\030\001 \001(\tB\003\340A\002\022\024\n\007vla" +
      "n_id\030\002 \001(\rB\003\340A\0022\230\004\n\nVrfService\022\203\001\n\tCreat" +
      "eVrf\0222.opi_api.network.evpn_gw.v1alpha1." +
      "CreateVrfRequest\032%.opi_api.network.evpn_" +
      "gw.v1alpha1.Vrf\"\033\202\323\344\223\002\017\"\010/v1/vrfs:\003vrf\332A" +
      "\003vrf\022\203\001\n\010ListVrfs\0221.opi_api.network.evpn" +
      "_gw.v1alpha1.ListVrfsRequest\0322.opi_api.n" +
      "etwork.evpn_gw.v1alpha1.ListVrfsResponse" +
      "\"\020\202\323\344\223\002\n\022\010/v1/vrfs\022\202\001\n\006GetVrf\022/.opi_api." +
      "network.evpn_gw.v1alpha1.GetVrfRequest\032%" +
      ".opi_api.network.evpn_gw.v1alpha1.Vrf\" \202" +
      "\323\344\223\002\023\022\021/v1/{name=vrfs/*}\332A\004name\022y\n\tDelet" +
      "eVrf\0222.opi_api.network.evpn_gw.v1alpha1." +
      "DeleteVrfRequest\032\026.google.protobuf.Empty" +
      "\" \202\323\344\223\002\023*\021/v1/{name=vrfs/*}\332A\004name2\267\004\n\nS" +
      "viService\022\203\001\n\tCreateSvi\0222.opi_api.networ" +
      "k.evpn_gw.v1alpha1.CreateSviRequest\032%.op" +
      "i_api.network.evpn_gw.v1alpha1.Svi\"\033\202\323\344\223" +
      "\002\017\"\010/v1/svis:\003svi\332A\003svi\022\203\001\n\010ListSvis\0221.o" +
      "pi_api.network.evpn_gw.v1alpha1.ListSvis" +
      "Request\0322.opi_api.network.evpn_gw.v1alph" +
      "a1.ListSvisResponse\"\020\202\323\344\223\002\n\022\010/v1/svis\022\221\001" +
      "\n\006GetSvi\022/.opi_api.network.evpn_gw.v1alp" +
      "ha1.GetSviRequest\032%.opi_api.network.evpn" +
      "_gw.v1alpha1.Svi\"/\202\323\344\223\002\032\022\030/v1/{vrf&vlan_" +
      "id=svis/*}\332A\014vrf, vlan_id\022\210\001\n\tDeleteSvi\022" +
      "2.opi_api.network.evpn_gw.v1alpha1.Delet" +
      "eSviRequest\032\026.google.protobuf.Empty\"/\202\323\344" +
      "\223\002\032*\030/v1/{vrf&vlan_id=svis/*}\332A\014vrf, vla" +
      "n_idBw\n opi_api.network.evpn_gw.v1alpha1" +
      "B\022L3XpuInfraMgrProtoP\001Z=github.com/opipr" +
      "oject/opi-api/network/evpn-gw/v1alpha1/g" +
      "en/gob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_opi_api_network_evpn_gw_v1alpha1_Vrf_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opi_api_network_evpn_gw_v1alpha1_Vrf_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_evpn_gw_v1alpha1_Vrf_descriptor,
        new java.lang.String[] { "Name", "Vni", "RoutingTable", "LoopbackIp", "VtepIp", "LocalAs", "Rd", "Rmac", "ImportRts", "ExportRts", "VlanIds", });
    internal_static_opi_api_network_evpn_gw_v1alpha1_CreateVrfRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opi_api_network_evpn_gw_v1alpha1_CreateVrfRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_evpn_gw_v1alpha1_CreateVrfRequest_descriptor,
        new java.lang.String[] { "Vrf", });
    internal_static_opi_api_network_evpn_gw_v1alpha1_ListVrfsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_opi_api_network_evpn_gw_v1alpha1_ListVrfsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_evpn_gw_v1alpha1_ListVrfsRequest_descriptor,
        new java.lang.String[] { "PageSize", "PageToken", });
    internal_static_opi_api_network_evpn_gw_v1alpha1_ListVrfsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_opi_api_network_evpn_gw_v1alpha1_ListVrfsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_evpn_gw_v1alpha1_ListVrfsResponse_descriptor,
        new java.lang.String[] { "Vrfs", "NextPageToken", });
    internal_static_opi_api_network_evpn_gw_v1alpha1_GetVrfRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_opi_api_network_evpn_gw_v1alpha1_GetVrfRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_evpn_gw_v1alpha1_GetVrfRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_opi_api_network_evpn_gw_v1alpha1_DeleteVrfRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_opi_api_network_evpn_gw_v1alpha1_DeleteVrfRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_evpn_gw_v1alpha1_DeleteVrfRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_opi_api_network_evpn_gw_v1alpha1_IpAddressMasklen_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_opi_api_network_evpn_gw_v1alpha1_IpAddressMasklen_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_evpn_gw_v1alpha1_IpAddressMasklen_descriptor,
        new java.lang.String[] { "IpAddr", "Len", });
    internal_static_opi_api_network_evpn_gw_v1alpha1_Svi_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_opi_api_network_evpn_gw_v1alpha1_Svi_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_evpn_gw_v1alpha1_Svi_descriptor,
        new java.lang.String[] { "Vrf", "VlanId", "MacAddress", "GwIp", "EnableBgp", "RemoteAs", });
    internal_static_opi_api_network_evpn_gw_v1alpha1_CreateSviRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_opi_api_network_evpn_gw_v1alpha1_CreateSviRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_evpn_gw_v1alpha1_CreateSviRequest_descriptor,
        new java.lang.String[] { "Svi", });
    internal_static_opi_api_network_evpn_gw_v1alpha1_ListSvisRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_opi_api_network_evpn_gw_v1alpha1_ListSvisRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_evpn_gw_v1alpha1_ListSvisRequest_descriptor,
        new java.lang.String[] { "PageSize", "PageToken", });
    internal_static_opi_api_network_evpn_gw_v1alpha1_ListSvisResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_opi_api_network_evpn_gw_v1alpha1_ListSvisResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_evpn_gw_v1alpha1_ListSvisResponse_descriptor,
        new java.lang.String[] { "Svis", "NextPageToken", });
    internal_static_opi_api_network_evpn_gw_v1alpha1_GetSviRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_opi_api_network_evpn_gw_v1alpha1_GetSviRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_evpn_gw_v1alpha1_GetSviRequest_descriptor,
        new java.lang.String[] { "Vrf", "VlanId", });
    internal_static_opi_api_network_evpn_gw_v1alpha1_DeleteSviRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_opi_api_network_evpn_gw_v1alpha1_DeleteSviRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_evpn_gw_v1alpha1_DeleteSviRequest_descriptor,
        new java.lang.String[] { "Vrf", "VlanId", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
