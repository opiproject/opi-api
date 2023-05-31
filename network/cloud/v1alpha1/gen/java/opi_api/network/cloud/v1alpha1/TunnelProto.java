// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tunnel.proto

package opi_api.network.cloud.v1alpha1;

public final class TunnelProto {
  private TunnelProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_Tunnel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_Tunnel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_TunnelSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_TunnelSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_DropNexthop_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_DropNexthop_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_TunnelStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_TunnelStatus_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014tunnel.proto\022\036opi_api.network.cloud.v1" +
      "alpha1\032\022networktypes.proto\032\031google/api/r" +
      "esource.proto\"\313\001\n\006Tunnel\022\014\n\004name\030\001 \001(\t\0228" +
      "\n\004spec\030\002 \001(\0132*.opi_api.network.cloud.v1a" +
      "lpha1.TunnelSpec\022<\n\006status\030\003 \001(\0132,.opi_a" +
      "pi.network.cloud.v1alpha1.TunnelStatus:;" +
      "\352A8\n%opi_api.network.cloud.v1alpha1/tunn" +
      "el\022\017tunnel/{tunnel}\"\351\003\n\nTunnelSpec\022\024\n\014vp" +
      "c_name_ref\030\001 \001(\t\022B\n\010local_ip\030\002 \001(\01320.opi" +
      "_api.network.opinetcommon.v1alpha1.IPAdd" +
      "ress\022C\n\tremote_ip\030\003 \001(\01320.opi_api.networ" +
      "k.opinetcommon.v1alpha1.IPAddress\0228\n\004typ" +
      "e\030\004 \001(\0162*.opi_api.network.cloud.v1alpha1" +
      ".TunnelType\022;\n\005encap\030\005 \001(\0132,.opi_api.net" +
      "work.opinetcommon.v1alpha1.Encap\022\032\n\020next" +
      "hop_name_ref\030\006 \001(\tH\000\022 \n\026nexthop_group_na" +
      "me_ref\030\007 \001(\tH\000\022\031\n\017tunnel_name_ref\030\010 \001(\tH" +
      "\000\022D\n\rdrop_next_hop\030\t \001(\0132+.opi_api.netwo" +
      "rk.cloud.v1alpha1.DropNexthopH\000\022\023\n\013mac_a" +
      "ddress\030\n \001(\014\022\013\n\003tos\030\013 \001(\005B\004\n\002nh\"\r\n\013DropN" +
      "exthop\"f\n\014TunnelStatus\022B\n\thw_handle\030\001 \001(" +
      "\0132/.opi_api.network.opinetcommon.v1alpha" +
      "1.HwHandle\022\022\n\nvnic_count\030\002 \001(\005*\267\001\n\nTunne" +
      "lType\022\033\n\027TUNNEL_TYPE_UNSPECIFIED\020\000\022\023\n\017TU" +
      "NNEL_TYPE_IGW\020\001\022\030\n\024TUNNEL_TYPE_WORKLOAD\020" +
      "\002\022\030\n\024TUNNEL_TYPE_INTER_DC\020\003\022\027\n\023TUNNEL_TY" +
      "PE_SERVICE\020\004\022\023\n\017TUNNEL_TYPE_VNF\020\005\022\025\n\021TUN" +
      "NEL_TYPE_IPSEC\020\006Bl\n\036opi_api.network.clou" +
      "d.v1alpha1B\013TunnelProtoP\001Z;github.com/op" +
      "iproject/opi-api/network/cloud/v1alpha1/" +
      "gen/gob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          opi_api.network.opinetcommon.v1alpha1.NetworkTypesProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_opi_api_network_cloud_v1alpha1_Tunnel_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opi_api_network_cloud_v1alpha1_Tunnel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_Tunnel_descriptor,
        new java.lang.String[] { "Name", "Spec", "Status", });
    internal_static_opi_api_network_cloud_v1alpha1_TunnelSpec_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opi_api_network_cloud_v1alpha1_TunnelSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_TunnelSpec_descriptor,
        new java.lang.String[] { "VpcNameRef", "LocalIp", "RemoteIp", "Type", "Encap", "NexthopNameRef", "NexthopGroupNameRef", "TunnelNameRef", "DropNextHop", "MacAddress", "Tos", "Nh", });
    internal_static_opi_api_network_cloud_v1alpha1_DropNexthop_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_opi_api_network_cloud_v1alpha1_DropNexthop_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_DropNexthop_descriptor,
        new java.lang.String[] { });
    internal_static_opi_api_network_cloud_v1alpha1_TunnelStatus_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_opi_api_network_cloud_v1alpha1_TunnelStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_TunnelStatus_descriptor,
        new java.lang.String[] { "HwHandle", "VnicCount", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    opi_api.network.opinetcommon.v1alpha1.NetworkTypesProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
