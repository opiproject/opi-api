// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: device.proto

package opi_api.network.cloud.v1alpha1;

public final class DeviceProto {
  private DeviceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_DeviceCapabilities_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_DeviceCapabilities_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_DeviceCapabilitiesDynamicRouting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_DeviceCapabilitiesDynamicRouting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_DeviceCapabilitiesNetworkPolicy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_DeviceCapabilitiesNetworkPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_Device_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_Device_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_DeviceSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_DeviceSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_PCIeFunctionsSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_PCIeFunctionsSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_MgmtNetworkSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_MgmtNetworkSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_DeviceStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_DeviceStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_SystemEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_SystemEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_SystemAlert_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_SystemAlert_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_CreateDeviceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_CreateDeviceRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014device.proto\022\036opi_api.network.cloud.v1" +
      "alpha1\032\020object_key.proto\032\022networktypes.p" +
      "roto\032\027google/api/client.proto\032\031google/ap" +
      "i/resource.proto\032\034google/api/annotations" +
      ".proto\032\037google/api/field_behavior.proto\032" +
      "\037google/protobuf/timestamp.proto\"\331\001\n\022Dev" +
      "iceCapabilities\022]\n\023routing_capabilties\030\001" +
      " \001(\0132@.opi_api.network.cloud.v1alpha1.De" +
      "viceCapabilitiesDynamicRouting\022d\n\033networ" +
      "k_policy_capabilities\030\002 \001(\0132?.opi_api.ne" +
      "twork.cloud.v1alpha1.DeviceCapabilitiesN" +
      "etworkPolicy\"8\n DeviceCapabilitiesDynami" +
      "cRouting\022\024\n\014underlay_bgp\030\001 \001(\010\"8\n\037Device" +
      "CapabilitiesNetworkPolicy\022\025\n\rcompact_rul" +
      "es\030\001 \001(\010\"\200\001\n\006Device\0228\n\004spec\030\001 \001(\0132*.opi_" +
      "api.network.cloud.v1alpha1.DeviceSpec\022<\n" +
      "\006status\030\002 \001(\0132,.opi_api.network.cloud.v1" +
      "alpha1.DeviceStatus\"\352\003\n\nDeviceSpec\022(\n\002id" +
      "\030\001 \001(\0132\034.opi_api.common.v1.ObjectKey\022F\n\014" +
      "ipv4_address\030\002 \001(\01320.opi_api.network.opi" +
      "netcommon.v1alpha1.IPAddress\022F\n\014ipv6_add" +
      "ress\030\003 \001(\01320.opi_api.network.opinetcommo" +
      "n.v1alpha1.IPAddress\022\020\n\010mac_addr\030\004 \001(\014\022D" +
      "\n\ngateway_ip\030\005 \001(\01320.opi_api.network.opi" +
      "netcommon.v1alpha1.IPAddress\022I\n\016pcie_fun" +
      "ctions\030\006 \001(\01321.opi_api.network.cloud.v1a" +
      "lpha1.PCIeFunctionsSpec\022\037\n\027overlay_routi" +
      "ng_enabled\030\007 \001(\010\022\022\n\nsystemname\030\010 \001(\t\022J\n\021" +
      "mgmt_network_spec\030\t \001(\0132/.opi_api.networ" +
      "k.cloud.v1alpha1.MgmtNetworkSpec\"7\n\021PCIe" +
      "FunctionsSpec\022\020\n\010pf_count\030\005 \001(\005\022\020\n\010vf_co" +
      "unt\030\006 \001(\005\"\205\002\n\017MgmtNetworkSpec\022F\n\014lldp_mg" +
      "mt_ip\030\001 \001(\01320.opi_api.network.opinetcomm" +
      "on.v1alpha1.IPAddress\022A\n\007mgmt_ip\030\002 \001(\01320" +
      ".opi_api.network.opinetcommon.v1alpha1.I" +
      "PAddress\022\014\n\004vlan\030\003 \001(\005\022D\n\ngateway_ip\030\004 \001" +
      "(\01320.opi_api.network.opinetcommon.v1alph" +
      "a1.IPAddress\022\023\n\013gateway_mac\030\005 \001(\014\"\322\002\n\014De" +
      "viceStatus\022\023\n\013description\030\001 \001(\t\022\032\n\022syste" +
      "m_mac_address\030\002 \001(\014\022\021\n\tvendor_id\030\003 \001(\t\022\021" +
      "\n\tchip_type\030\004 \001(\t\022\022\n\nos_version\030\005 \001(\t\022\027\n" +
      "\017pcie_port_count\030\006 \001(\005\022\022\n\nport_count\030\007 \001" +
      "(\005\022\025\n\rhost_if_count\030\010 \001(\005\022\020\n\010pipeline\030\t " +
      "\001(\t\022D\n\017critical_events\030\n \003(\0132+.opi_api.n" +
      "etwork.cloud.v1alpha1.SystemEvent\022;\n\006ale" +
      "rts\030\013 \003(\0132+.opi_api.network.cloud.v1alph" +
      "a1.SystemAlert\"X\n\013SystemEvent\022.\n\nevent_t" +
      "ime\030\001 \001(\0132\032.google.protobuf.Timestamp\022\031\n" +
      "\021event_description\030\002 \001(\t\"X\n\013SystemAlert\022" +
      ".\n\nalert_time\030\001 \001(\0132\032.google.protobuf.Ti" +
      "mestamp\022\031\n\021alert_description\030\002 \001(\t\"\236\001\n\023C" +
      "reateDeviceRequest\0227\n\006parent\030\001 \001(\tB\'\340A\002\372" +
      "A!\n\037opi_api.network.v1alpha1/Device\022;\n\006d" +
      "evice\030\002 \001(\0132&.opi_api.network.cloud.v1al" +
      "pha1.DeviceB\003\340A\002\022\021\n\tdevice_id\030\003 \001(\t2\300\001\n\021" +
      "CloudInfraService\022\252\001\n\014CreateDevice\0223.opi" +
      "_api.network.cloud.v1alpha1.CreateDevice" +
      "Request\032&.opi_api.network.cloud.v1alpha1" +
      ".Device\"=\202\323\344\223\002\035\"\023/v1/{parent=device}:\006de" +
      "vice\332A\027parent,device,device_idBl\n\036opi_ap" +
      "i.network.cloud.v1alpha1B\013DeviceProtoP\001Z" +
      ";github.com/opiproject/opi-api/network/c" +
      "loud/v1alpha1/gen/gob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          opi_api.common.v1.ObjectKeyProto.getDescriptor(),
          opi_api.network.opinetcommon.v1alpha1.NetworkTypesProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_opi_api_network_cloud_v1alpha1_DeviceCapabilities_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opi_api_network_cloud_v1alpha1_DeviceCapabilities_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_DeviceCapabilities_descriptor,
        new java.lang.String[] { "RoutingCapabilties", "NetworkPolicyCapabilities", });
    internal_static_opi_api_network_cloud_v1alpha1_DeviceCapabilitiesDynamicRouting_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opi_api_network_cloud_v1alpha1_DeviceCapabilitiesDynamicRouting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_DeviceCapabilitiesDynamicRouting_descriptor,
        new java.lang.String[] { "UnderlayBgp", });
    internal_static_opi_api_network_cloud_v1alpha1_DeviceCapabilitiesNetworkPolicy_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_opi_api_network_cloud_v1alpha1_DeviceCapabilitiesNetworkPolicy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_DeviceCapabilitiesNetworkPolicy_descriptor,
        new java.lang.String[] { "CompactRules", });
    internal_static_opi_api_network_cloud_v1alpha1_Device_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_opi_api_network_cloud_v1alpha1_Device_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_Device_descriptor,
        new java.lang.String[] { "Spec", "Status", });
    internal_static_opi_api_network_cloud_v1alpha1_DeviceSpec_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_opi_api_network_cloud_v1alpha1_DeviceSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_DeviceSpec_descriptor,
        new java.lang.String[] { "Id", "Ipv4Address", "Ipv6Address", "MacAddr", "GatewayIp", "PcieFunctions", "OverlayRoutingEnabled", "Systemname", "MgmtNetworkSpec", });
    internal_static_opi_api_network_cloud_v1alpha1_PCIeFunctionsSpec_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_opi_api_network_cloud_v1alpha1_PCIeFunctionsSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_PCIeFunctionsSpec_descriptor,
        new java.lang.String[] { "PfCount", "VfCount", });
    internal_static_opi_api_network_cloud_v1alpha1_MgmtNetworkSpec_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_opi_api_network_cloud_v1alpha1_MgmtNetworkSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_MgmtNetworkSpec_descriptor,
        new java.lang.String[] { "LldpMgmtIp", "MgmtIp", "Vlan", "GatewayIp", "GatewayMac", });
    internal_static_opi_api_network_cloud_v1alpha1_DeviceStatus_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_opi_api_network_cloud_v1alpha1_DeviceStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_DeviceStatus_descriptor,
        new java.lang.String[] { "Description", "SystemMacAddress", "VendorId", "ChipType", "OsVersion", "PciePortCount", "PortCount", "HostIfCount", "Pipeline", "CriticalEvents", "Alerts", });
    internal_static_opi_api_network_cloud_v1alpha1_SystemEvent_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_opi_api_network_cloud_v1alpha1_SystemEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_SystemEvent_descriptor,
        new java.lang.String[] { "EventTime", "EventDescription", });
    internal_static_opi_api_network_cloud_v1alpha1_SystemAlert_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_opi_api_network_cloud_v1alpha1_SystemAlert_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_SystemAlert_descriptor,
        new java.lang.String[] { "AlertTime", "AlertDescription", });
    internal_static_opi_api_network_cloud_v1alpha1_CreateDeviceRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_opi_api_network_cloud_v1alpha1_CreateDeviceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_CreateDeviceRequest_descriptor,
        new java.lang.String[] { "Parent", "Device", "DeviceId", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    opi_api.common.v1.ObjectKeyProto.getDescriptor();
    opi_api.network.opinetcommon.v1alpha1.NetworkTypesProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
