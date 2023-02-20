# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [bgp.proto](#bgp-proto)
    - [BGPAdjRibOut](#opi_api-network-cloud-v1alpha1-BGPAdjRibOut)
    - [BGPAdjRibOutSpec](#opi_api-network-cloud-v1alpha1-BGPAdjRibOutSpec)
    - [BGPAdjRibOutStatus](#opi_api-network-cloud-v1alpha1-BGPAdjRibOutStatus)
    - [BGPNLRIPrefix](#opi_api-network-cloud-v1alpha1-BGPNLRIPrefix)
    - [BGPNLRIPrefixFilter](#opi_api-network-cloud-v1alpha1-BGPNLRIPrefixFilter)
    - [BGPNLRIPrefixSpec](#opi_api-network-cloud-v1alpha1-BGPNLRIPrefixSpec)
    - [BGPNLRIPrefixStatus](#opi_api-network-cloud-v1alpha1-BGPNLRIPrefixStatus)
    - [BGPPeer](#opi_api-network-cloud-v1alpha1-BGPPeer)
    - [BGPPeerAf](#opi_api-network-cloud-v1alpha1-BGPPeerAf)
    - [BGPPeerAfSpec](#opi_api-network-cloud-v1alpha1-BGPPeerAfSpec)
    - [BGPPeerAfStatus](#opi_api-network-cloud-v1alpha1-BGPPeerAfStatus)
    - [BGPPeerSpec](#opi_api-network-cloud-v1alpha1-BGPPeerSpec)
    - [BGPPeerStatus](#opi_api-network-cloud-v1alpha1-BGPPeerStatus)
    - [Bgp](#opi_api-network-cloud-v1alpha1-Bgp)
    - [BgpSpec](#opi_api-network-cloud-v1alpha1-BgpSpec)
    - [BgpStatus](#opi_api-network-cloud-v1alpha1-BgpStatus)
  
    - [BGPAddrType](#opi_api-network-cloud-v1alpha1-BGPAddrType)
    - [BGPAfi](#opi_api-network-cloud-v1alpha1-BGPAfi)
    - [BGPClearRouteOptions](#opi_api-network-cloud-v1alpha1-BGPClearRouteOptions)
    - [BGPOperState](#opi_api-network-cloud-v1alpha1-BGPOperState)
    - [BGPOriginAttr](#opi_api-network-cloud-v1alpha1-BGPOriginAttr)
    - [BGPPeerRRClient](#opi_api-network-cloud-v1alpha1-BGPPeerRRClient)
    - [BGPPeerSessionState](#opi_api-network-cloud-v1alpha1-BGPPeerSessionState)
    - [BGPPeerType](#opi_api-network-cloud-v1alpha1-BGPPeerType)
    - [BGPRsnNotBest](#opi_api-network-cloud-v1alpha1-BGPRsnNotBest)
    - [BGPSafi](#opi_api-network-cloud-v1alpha1-BGPSafi)
    - [BgpAddPathCapNegCap](#opi_api-network-cloud-v1alpha1-BgpAddPathCapNegCap)
    - [BgpAroAdvertState](#opi_api-network-cloud-v1alpha1-BgpAroAdvertState)
    - [BgpAsSize](#opi_api-network-cloud-v1alpha1-BgpAsSize)
    - [BgpNlriIsActive](#opi_api-network-cloud-v1alpha1-BgpNlriIsActive)
    - [NLRISrc](#opi_api-network-cloud-v1alpha1-NLRISrc)
  
- [cloudrpc.proto](#cloudrpc-proto)
    - [CreateBGPPeerAfRequest](#opi_api-network-cloud-v1alpha1-CreateBGPPeerAfRequest)
    - [CreateBGPPeerRequest](#opi_api-network-cloud-v1alpha1-CreateBGPPeerRequest)
    - [CreateBgpRequest](#opi_api-network-cloud-v1alpha1-CreateBgpRequest)
    - [CreateDeviceRequest](#opi_api-network-cloud-v1alpha1-CreateDeviceRequest)
    - [CreateInterfaceRequest](#opi_api-network-cloud-v1alpha1-CreateInterfaceRequest)
    - [CreateMappingRequest](#opi_api-network-cloud-v1alpha1-CreateMappingRequest)
    - [CreateNextHopGroupRequest](#opi_api-network-cloud-v1alpha1-CreateNextHopGroupRequest)
    - [CreateNextHopRequest](#opi_api-network-cloud-v1alpha1-CreateNextHopRequest)
    - [CreateRouteRequest](#opi_api-network-cloud-v1alpha1-CreateRouteRequest)
    - [CreateRouteTableRequest](#opi_api-network-cloud-v1alpha1-CreateRouteTableRequest)
    - [CreateSecurityPolicyRequest](#opi_api-network-cloud-v1alpha1-CreateSecurityPolicyRequest)
    - [CreateSecurityProfileRequest](#opi_api-network-cloud-v1alpha1-CreateSecurityProfileRequest)
    - [CreateSecurityRuleRequest](#opi_api-network-cloud-v1alpha1-CreateSecurityRuleRequest)
    - [CreateSubnetRequest](#opi_api-network-cloud-v1alpha1-CreateSubnetRequest)
    - [CreateTunnelRequest](#opi_api-network-cloud-v1alpha1-CreateTunnelRequest)
    - [CreateUnderlayRouteRequest](#opi_api-network-cloud-v1alpha1-CreateUnderlayRouteRequest)
    - [CreateVPCPeerRequest](#opi_api-network-cloud-v1alpha1-CreateVPCPeerRequest)
    - [CreateVnicRequest](#opi_api-network-cloud-v1alpha1-CreateVnicRequest)
    - [CreateVpcRequest](#opi_api-network-cloud-v1alpha1-CreateVpcRequest)
    - [DeleteBGPPeerAfRequest](#opi_api-network-cloud-v1alpha1-DeleteBGPPeerAfRequest)
    - [DeleteBGPPeerRequest](#opi_api-network-cloud-v1alpha1-DeleteBGPPeerRequest)
    - [DeleteBgpRequest](#opi_api-network-cloud-v1alpha1-DeleteBgpRequest)
    - [DeleteDeviceRequest](#opi_api-network-cloud-v1alpha1-DeleteDeviceRequest)
    - [DeleteInterfaceRequest](#opi_api-network-cloud-v1alpha1-DeleteInterfaceRequest)
    - [DeleteMappingRequest](#opi_api-network-cloud-v1alpha1-DeleteMappingRequest)
    - [DeleteNextHopGroupRequest](#opi_api-network-cloud-v1alpha1-DeleteNextHopGroupRequest)
    - [DeleteNextHopRequest](#opi_api-network-cloud-v1alpha1-DeleteNextHopRequest)
    - [DeleteRouteRequest](#opi_api-network-cloud-v1alpha1-DeleteRouteRequest)
    - [DeleteRouteTableRequest](#opi_api-network-cloud-v1alpha1-DeleteRouteTableRequest)
    - [DeleteSecurityPolicyRequest](#opi_api-network-cloud-v1alpha1-DeleteSecurityPolicyRequest)
    - [DeleteSecurityProfileRequest](#opi_api-network-cloud-v1alpha1-DeleteSecurityProfileRequest)
    - [DeleteSecurityRuleRequest](#opi_api-network-cloud-v1alpha1-DeleteSecurityRuleRequest)
    - [DeleteSubnetRequest](#opi_api-network-cloud-v1alpha1-DeleteSubnetRequest)
    - [DeleteTunnelRequest](#opi_api-network-cloud-v1alpha1-DeleteTunnelRequest)
    - [DeleteUnderlayRouteRequest](#opi_api-network-cloud-v1alpha1-DeleteUnderlayRouteRequest)
    - [DeleteVPCPeerRequest](#opi_api-network-cloud-v1alpha1-DeleteVPCPeerRequest)
    - [DeleteVnicRequest](#opi_api-network-cloud-v1alpha1-DeleteVnicRequest)
    - [DeleteVpcRequest](#opi_api-network-cloud-v1alpha1-DeleteVpcRequest)
    - [GetBGPPeerAfRequest](#opi_api-network-cloud-v1alpha1-GetBGPPeerAfRequest)
    - [GetBGPPeerRequest](#opi_api-network-cloud-v1alpha1-GetBGPPeerRequest)
    - [GetBgpRequest](#opi_api-network-cloud-v1alpha1-GetBgpRequest)
    - [GetDeviceCapabilitiesRequest](#opi_api-network-cloud-v1alpha1-GetDeviceCapabilitiesRequest)
    - [GetDeviceRequest](#opi_api-network-cloud-v1alpha1-GetDeviceRequest)
    - [GetInterfaceRequest](#opi_api-network-cloud-v1alpha1-GetInterfaceRequest)
    - [GetMappingRequest](#opi_api-network-cloud-v1alpha1-GetMappingRequest)
    - [GetNextHopGroupRequest](#opi_api-network-cloud-v1alpha1-GetNextHopGroupRequest)
    - [GetNextHopRequest](#opi_api-network-cloud-v1alpha1-GetNextHopRequest)
    - [GetPortRequest](#opi_api-network-cloud-v1alpha1-GetPortRequest)
    - [GetRouteRequest](#opi_api-network-cloud-v1alpha1-GetRouteRequest)
    - [GetRouteTableRequest](#opi_api-network-cloud-v1alpha1-GetRouteTableRequest)
    - [GetSecurityPolicyRequest](#opi_api-network-cloud-v1alpha1-GetSecurityPolicyRequest)
    - [GetSecurityProfileRequest](#opi_api-network-cloud-v1alpha1-GetSecurityProfileRequest)
    - [GetSecurityRuleRequest](#opi_api-network-cloud-v1alpha1-GetSecurityRuleRequest)
    - [GetSubnetRequest](#opi_api-network-cloud-v1alpha1-GetSubnetRequest)
    - [GetTunnelRequest](#opi_api-network-cloud-v1alpha1-GetTunnelRequest)
    - [GetUnderlayRouteRequest](#opi_api-network-cloud-v1alpha1-GetUnderlayRouteRequest)
    - [GetVPCPeerRequest](#opi_api-network-cloud-v1alpha1-GetVPCPeerRequest)
    - [GetVnicRequest](#opi_api-network-cloud-v1alpha1-GetVnicRequest)
    - [GetVpcRequest](#opi_api-network-cloud-v1alpha1-GetVpcRequest)
    - [ListBGPPeerAfsRequest](#opi_api-network-cloud-v1alpha1-ListBGPPeerAfsRequest)
    - [ListBGPPeerAfsResponse](#opi_api-network-cloud-v1alpha1-ListBGPPeerAfsResponse)
    - [ListBGPPeersRequest](#opi_api-network-cloud-v1alpha1-ListBGPPeersRequest)
    - [ListBGPPeersResponse](#opi_api-network-cloud-v1alpha1-ListBGPPeersResponse)
    - [ListBgpsRequest](#opi_api-network-cloud-v1alpha1-ListBgpsRequest)
    - [ListBgpsResponse](#opi_api-network-cloud-v1alpha1-ListBgpsResponse)
    - [ListDevicesRequest](#opi_api-network-cloud-v1alpha1-ListDevicesRequest)
    - [ListDevicesResponse](#opi_api-network-cloud-v1alpha1-ListDevicesResponse)
    - [ListInterfacesRequest](#opi_api-network-cloud-v1alpha1-ListInterfacesRequest)
    - [ListInterfacesResponse](#opi_api-network-cloud-v1alpha1-ListInterfacesResponse)
    - [ListMappingsRequest](#opi_api-network-cloud-v1alpha1-ListMappingsRequest)
    - [ListMappingsResponse](#opi_api-network-cloud-v1alpha1-ListMappingsResponse)
    - [ListNextHopGroupsRequest](#opi_api-network-cloud-v1alpha1-ListNextHopGroupsRequest)
    - [ListNextHopGroupsResponse](#opi_api-network-cloud-v1alpha1-ListNextHopGroupsResponse)
    - [ListNextHopsRequest](#opi_api-network-cloud-v1alpha1-ListNextHopsRequest)
    - [ListNextHopsResponse](#opi_api-network-cloud-v1alpha1-ListNextHopsResponse)
    - [ListPortsRequest](#opi_api-network-cloud-v1alpha1-ListPortsRequest)
    - [ListPortsResponse](#opi_api-network-cloud-v1alpha1-ListPortsResponse)
    - [ListRouteTablesRequest](#opi_api-network-cloud-v1alpha1-ListRouteTablesRequest)
    - [ListRouteTablesResponse](#opi_api-network-cloud-v1alpha1-ListRouteTablesResponse)
    - [ListRoutesRequest](#opi_api-network-cloud-v1alpha1-ListRoutesRequest)
    - [ListRoutesResponse](#opi_api-network-cloud-v1alpha1-ListRoutesResponse)
    - [ListSecurityPolicysRequest](#opi_api-network-cloud-v1alpha1-ListSecurityPolicysRequest)
    - [ListSecurityPolicysResponse](#opi_api-network-cloud-v1alpha1-ListSecurityPolicysResponse)
    - [ListSecurityProfilesRequest](#opi_api-network-cloud-v1alpha1-ListSecurityProfilesRequest)
    - [ListSecurityProfilesResponse](#opi_api-network-cloud-v1alpha1-ListSecurityProfilesResponse)
    - [ListSecurityRulesRequest](#opi_api-network-cloud-v1alpha1-ListSecurityRulesRequest)
    - [ListSecurityRulesResponse](#opi_api-network-cloud-v1alpha1-ListSecurityRulesResponse)
    - [ListSubnetsRequest](#opi_api-network-cloud-v1alpha1-ListSubnetsRequest)
    - [ListSubnetsResponse](#opi_api-network-cloud-v1alpha1-ListSubnetsResponse)
    - [ListTunnelsRequest](#opi_api-network-cloud-v1alpha1-ListTunnelsRequest)
    - [ListTunnelsResponse](#opi_api-network-cloud-v1alpha1-ListTunnelsResponse)
    - [ListUnderlayRoutesRequest](#opi_api-network-cloud-v1alpha1-ListUnderlayRoutesRequest)
    - [ListUnderlayRoutesResponse](#opi_api-network-cloud-v1alpha1-ListUnderlayRoutesResponse)
    - [ListVPCPeersRequest](#opi_api-network-cloud-v1alpha1-ListVPCPeersRequest)
    - [ListVPCPeersResponse](#opi_api-network-cloud-v1alpha1-ListVPCPeersResponse)
    - [ListVnicsRequest](#opi_api-network-cloud-v1alpha1-ListVnicsRequest)
    - [ListVnicsResponse](#opi_api-network-cloud-v1alpha1-ListVnicsResponse)
    - [ListVpcsRequest](#opi_api-network-cloud-v1alpha1-ListVpcsRequest)
    - [ListVpcsResponse](#opi_api-network-cloud-v1alpha1-ListVpcsResponse)
    - [UpdateBGPPeerAfRequest](#opi_api-network-cloud-v1alpha1-UpdateBGPPeerAfRequest)
    - [UpdateBGPPeerRequest](#opi_api-network-cloud-v1alpha1-UpdateBGPPeerRequest)
    - [UpdateBgpRequest](#opi_api-network-cloud-v1alpha1-UpdateBgpRequest)
    - [UpdateDeviceRequest](#opi_api-network-cloud-v1alpha1-UpdateDeviceRequest)
    - [UpdateInterfaceRequest](#opi_api-network-cloud-v1alpha1-UpdateInterfaceRequest)
    - [UpdateMappingRequest](#opi_api-network-cloud-v1alpha1-UpdateMappingRequest)
    - [UpdateNextHopGroupRequest](#opi_api-network-cloud-v1alpha1-UpdateNextHopGroupRequest)
    - [UpdateNextHopRequest](#opi_api-network-cloud-v1alpha1-UpdateNextHopRequest)
    - [UpdatePortRequest](#opi_api-network-cloud-v1alpha1-UpdatePortRequest)
    - [UpdateRouteRequest](#opi_api-network-cloud-v1alpha1-UpdateRouteRequest)
    - [UpdateRouteTableRequest](#opi_api-network-cloud-v1alpha1-UpdateRouteTableRequest)
    - [UpdateSecurityPolicyRequest](#opi_api-network-cloud-v1alpha1-UpdateSecurityPolicyRequest)
    - [UpdateSecurityProfileRequest](#opi_api-network-cloud-v1alpha1-UpdateSecurityProfileRequest)
    - [UpdateSecurityRuleRequest](#opi_api-network-cloud-v1alpha1-UpdateSecurityRuleRequest)
    - [UpdateSubnetRequest](#opi_api-network-cloud-v1alpha1-UpdateSubnetRequest)
    - [UpdateTunnelRequest](#opi_api-network-cloud-v1alpha1-UpdateTunnelRequest)
    - [UpdateUnderlayRouteRequest](#opi_api-network-cloud-v1alpha1-UpdateUnderlayRouteRequest)
    - [UpdateVPCPeerRequest](#opi_api-network-cloud-v1alpha1-UpdateVPCPeerRequest)
    - [UpdateVnicRequest](#opi_api-network-cloud-v1alpha1-UpdateVnicRequest)
    - [UpdateVpcRequest](#opi_api-network-cloud-v1alpha1-UpdateVpcRequest)
  
    - [CloudInfraService](#opi_api-network-cloud-v1alpha1-CloudInfraService)
  
- [device.proto](#device-proto)
    - [Device](#opi_api-network-cloud-v1alpha1-Device)
    - [DeviceCapabilities](#opi_api-network-cloud-v1alpha1-DeviceCapabilities)
    - [DeviceCapabilitiesDynamicRouting](#opi_api-network-cloud-v1alpha1-DeviceCapabilitiesDynamicRouting)
    - [DeviceCapabilitiesNetworkPolicy](#opi_api-network-cloud-v1alpha1-DeviceCapabilitiesNetworkPolicy)
    - [DeviceSpec](#opi_api-network-cloud-v1alpha1-DeviceSpec)
    - [DeviceStatus](#opi_api-network-cloud-v1alpha1-DeviceStatus)
    - [MgmtNetworkSpec](#opi_api-network-cloud-v1alpha1-MgmtNetworkSpec)
    - [PCIeFunctionsSpec](#opi_api-network-cloud-v1alpha1-PCIeFunctionsSpec)
    - [SystemAlert](#opi_api-network-cloud-v1alpha1-SystemAlert)
    - [SystemEvent](#opi_api-network-cloud-v1alpha1-SystemEvent)
  
- [interface.proto](#interface-proto)
    - [BGPCommunity](#opi_api-network-cloud-v1alpha1-BGPCommunity)
    - [ControlIfSpec](#opi_api-network-cloud-v1alpha1-ControlIfSpec)
    - [HostIfSpec](#opi_api-network-cloud-v1alpha1-HostIfSpec)
    - [HostIfStatus](#opi_api-network-cloud-v1alpha1-HostIfStatus)
    - [Interface](#opi_api-network-cloud-v1alpha1-Interface)
    - [InterfaceSpec](#opi_api-network-cloud-v1alpha1-InterfaceSpec)
    - [InterfaceStatus](#opi_api-network-cloud-v1alpha1-InterfaceStatus)
    - [L3IfSpec](#opi_api-network-cloud-v1alpha1-L3IfSpec)
    - [LoopbackIfSpec](#opi_api-network-cloud-v1alpha1-LoopbackIfSpec)
    - [LoopbackIfStatus](#opi_api-network-cloud-v1alpha1-LoopbackIfStatus)
    - [UplinkIfStatus](#opi_api-network-cloud-v1alpha1-UplinkIfStatus)
    - [UplinkPCSpec](#opi_api-network-cloud-v1alpha1-UplinkPCSpec)
    - [UplinkSpec](#opi_api-network-cloud-v1alpha1-UplinkSpec)
  
    - [IfStatus](#opi_api-network-cloud-v1alpha1-IfStatus)
    - [IfType](#opi_api-network-cloud-v1alpha1-IfType)
  
- [mapping.proto](#mapping-proto)
    - [L2MappingKey](#opi_api-network-cloud-v1alpha1-L2MappingKey)
    - [L3MappingKey](#opi_api-network-cloud-v1alpha1-L3MappingKey)
    - [Mapping](#opi_api-network-cloud-v1alpha1-Mapping)
    - [MappingLookupFilter](#opi_api-network-cloud-v1alpha1-MappingLookupFilter)
    - [MappingSpec](#opi_api-network-cloud-v1alpha1-MappingSpec)
    - [MappingStatus](#opi_api-network-cloud-v1alpha1-MappingStatus)
  
    - [MappingKeyType](#opi_api-network-cloud-v1alpha1-MappingKeyType)
    - [MappingType](#opi_api-network-cloud-v1alpha1-MappingType)
  
- [networkpolicy.proto](#networkpolicy-proto)
    - [ALGSpec](#opi_api-network-cloud-v1alpha1-ALGSpec)
    - [DNSOptions](#opi_api-network-cloud-v1alpha1-DNSOptions)
    - [FTPOptions](#opi_api-network-cloud-v1alpha1-FTPOptions)
    - [MSRPCOptions](#opi_api-network-cloud-v1alpha1-MSRPCOptions)
    - [PolicyLookupMatch](#opi_api-network-cloud-v1alpha1-PolicyLookupMatch)
    - [PolicyLookupResult](#opi_api-network-cloud-v1alpha1-PolicyLookupResult)
    - [SecurityPolicy](#opi_api-network-cloud-v1alpha1-SecurityPolicy)
    - [SecurityPolicyLookupRequest](#opi_api-network-cloud-v1alpha1-SecurityPolicyLookupRequest)
    - [SecurityPolicyLookupRequest.VnicLookupInfo](#opi_api-network-cloud-v1alpha1-SecurityPolicyLookupRequest-VnicLookupInfo)
    - [SecurityPolicySpec](#opi_api-network-cloud-v1alpha1-SecurityPolicySpec)
    - [SecurityPolicyStatus](#opi_api-network-cloud-v1alpha1-SecurityPolicyStatus)
    - [SecurityProfile](#opi_api-network-cloud-v1alpha1-SecurityProfile)
    - [SecurityProfileSpec](#opi_api-network-cloud-v1alpha1-SecurityProfileSpec)
    - [SecurityProfileStatus](#opi_api-network-cloud-v1alpha1-SecurityProfileStatus)
    - [SecurityRule](#opi_api-network-cloud-v1alpha1-SecurityRule)
    - [SecurityRuleAttrs](#opi_api-network-cloud-v1alpha1-SecurityRuleAttrs)
    - [SecurityRuleInfo](#opi_api-network-cloud-v1alpha1-SecurityRuleInfo)
    - [SecurityRuleSpec](#opi_api-network-cloud-v1alpha1-SecurityRuleSpec)
    - [SecurityRuleStatus](#opi_api-network-cloud-v1alpha1-SecurityRuleStatus)
    - [SunRPCOptions](#opi_api-network-cloud-v1alpha1-SunRPCOptions)
  
    - [ALGType](#opi_api-network-cloud-v1alpha1-ALGType)
    - [PolicyRuleFormat](#opi_api-network-cloud-v1alpha1-PolicyRuleFormat)
    - [SecurityPolicyType](#opi_api-network-cloud-v1alpha1-SecurityPolicyType)
  
- [nexthop.proto](#nexthop-proto)
    - [IPNextHopSpec](#opi_api-network-cloud-v1alpha1-IPNextHopSpec)
    - [NextHop](#opi_api-network-cloud-v1alpha1-NextHop)
    - [NextHopGroup](#opi_api-network-cloud-v1alpha1-NextHopGroup)
    - [NextHopGroupLookup](#opi_api-network-cloud-v1alpha1-NextHopGroupLookup)
    - [NextHopGroupSpec](#opi_api-network-cloud-v1alpha1-NextHopGroupSpec)
    - [NextHopGroupStatus](#opi_api-network-cloud-v1alpha1-NextHopGroupStatus)
    - [NextHopLookup](#opi_api-network-cloud-v1alpha1-NextHopLookup)
    - [NextHopSpec](#opi_api-network-cloud-v1alpha1-NextHopSpec)
    - [NextHopStatus](#opi_api-network-cloud-v1alpha1-NextHopStatus)
    - [OverlayNextHopSpec](#opi_api-network-cloud-v1alpha1-OverlayNextHopSpec)
    - [OverlayNextHopStatus](#opi_api-network-cloud-v1alpha1-OverlayNextHopStatus)
    - [UnderlayNextHopSpec](#opi_api-network-cloud-v1alpha1-UnderlayNextHopSpec)
    - [UnderlayNextHopStatus](#opi_api-network-cloud-v1alpha1-UnderlayNextHopStatus)
  
    - [NextHopGroupType](#opi_api-network-cloud-v1alpha1-NextHopGroupType)
    - [NextHopType](#opi_api-network-cloud-v1alpha1-NextHopType)
  
- [port.proto](#port-proto)
    - [Port](#opi_api-network-cloud-v1alpha1-Port)
    - [PortLinkFSMRecord](#opi_api-network-cloud-v1alpha1-PortLinkFSMRecord)
    - [PortLinkStatus](#opi_api-network-cloud-v1alpha1-PortLinkStatus)
    - [PortSpec](#opi_api-network-cloud-v1alpha1-PortSpec)
    - [PortStatus](#opi_api-network-cloud-v1alpha1-PortStatus)
    - [PortXcvrStatus](#opi_api-network-cloud-v1alpha1-PortXcvrStatus)
  
    - [MediaType](#opi_api-network-cloud-v1alpha1-MediaType)
    - [PortAdminState](#opi_api-network-cloud-v1alpha1-PortAdminState)
    - [PortFecType](#opi_api-network-cloud-v1alpha1-PortFecType)
    - [PortLinkFSM](#opi_api-network-cloud-v1alpha1-PortLinkFSM)
    - [PortLoopBackMode](#opi_api-network-cloud-v1alpha1-PortLoopBackMode)
    - [PortOperState](#opi_api-network-cloud-v1alpha1-PortOperState)
    - [PortPauseType](#opi_api-network-cloud-v1alpha1-PortPauseType)
    - [PortSpeed](#opi_api-network-cloud-v1alpha1-PortSpeed)
    - [PortType](#opi_api-network-cloud-v1alpha1-PortType)
    - [PortXcvrPid](#opi_api-network-cloud-v1alpha1-PortXcvrPid)
    - [PortXcvrState](#opi_api-network-cloud-v1alpha1-PortXcvrState)
  
- [route.proto](#route-proto)
    - [OverlayNextHopIPInfo](#opi_api-network-cloud-v1alpha1-OverlayNextHopIPInfo)
    - [Route](#opi_api-network-cloud-v1alpha1-Route)
    - [RouteAttrs](#opi_api-network-cloud-v1alpha1-RouteAttrs)
    - [RouteId](#opi_api-network-cloud-v1alpha1-RouteId)
    - [RouteInfo](#opi_api-network-cloud-v1alpha1-RouteInfo)
    - [RouteSpec](#opi_api-network-cloud-v1alpha1-RouteSpec)
    - [RouteStatus](#opi_api-network-cloud-v1alpha1-RouteStatus)
    - [RouteTable](#opi_api-network-cloud-v1alpha1-RouteTable)
    - [RouteTableSpec](#opi_api-network-cloud-v1alpha1-RouteTableSpec)
    - [RouteTableStatus](#opi_api-network-cloud-v1alpha1-RouteTableStatus)
    - [VPCPeerNhInfo](#opi_api-network-cloud-v1alpha1-VPCPeerNhInfo)
  
    - [RouteClass](#opi_api-network-cloud-v1alpha1-RouteClass)
  
- [subnet.proto](#subnet-proto)
    - [Subnet](#opi_api-network-cloud-v1alpha1-Subnet)
    - [SubnetSpec](#opi_api-network-cloud-v1alpha1-SubnetSpec)
    - [SubnetStatus](#opi_api-network-cloud-v1alpha1-SubnetStatus)
  
- [tunnel.proto](#tunnel-proto)
    - [DropNexthop](#opi_api-network-cloud-v1alpha1-DropNexthop)
    - [Tunnel](#opi_api-network-cloud-v1alpha1-Tunnel)
    - [TunnelSpec](#opi_api-network-cloud-v1alpha1-TunnelSpec)
    - [TunnelStatus](#opi_api-network-cloud-v1alpha1-TunnelStatus)
  
    - [TunnelType](#opi_api-network-cloud-v1alpha1-TunnelType)
  
- [underlayroute.proto](#underlayroute-proto)
    - [UnderlayRoute](#opi_api-network-cloud-v1alpha1-UnderlayRoute)
    - [UnderlayRouteLookupKey](#opi_api-network-cloud-v1alpha1-UnderlayRouteLookupKey)
    - [UnderlayRouteSpec](#opi_api-network-cloud-v1alpha1-UnderlayRouteSpec)
    - [UnderlayRouteStatus](#opi_api-network-cloud-v1alpha1-UnderlayRouteStatus)
  
- [vnic.proto](#vnic-proto)
    - [Vnic](#opi_api-network-cloud-v1alpha1-Vnic)
    - [VnicSpec](#opi_api-network-cloud-v1alpha1-VnicSpec)
    - [VnicStatus](#opi_api-network-cloud-v1alpha1-VnicStatus)
  
- [vpc.proto](#vpc-proto)
    - [VPCPeer](#opi_api-network-cloud-v1alpha1-VPCPeer)
    - [VPCPeerSpec](#opi_api-network-cloud-v1alpha1-VPCPeerSpec)
    - [VPCPeerStatus](#opi_api-network-cloud-v1alpha1-VPCPeerStatus)
    - [Vpc](#opi_api-network-cloud-v1alpha1-Vpc)
    - [VpcSpec](#opi_api-network-cloud-v1alpha1-VpcSpec)
    - [VpcStatus](#opi_api-network-cloud-v1alpha1-VpcStatus)
  
    - [VPCType](#opi_api-network-cloud-v1alpha1-VPCType)
  
- [inventory.proto](#inventory-proto)
    - [BIOSInfo](#opi_api-inventory-v1-BIOSInfo)
    - [BaseboardInfo](#opi_api-inventory-v1-BaseboardInfo)
    - [CPUInfo](#opi_api-inventory-v1-CPUInfo)
    - [ChassisInfo](#opi_api-inventory-v1-ChassisInfo)
    - [InventoryGetRequest](#opi_api-inventory-v1-InventoryGetRequest)
    - [InventoryGetResponse](#opi_api-inventory-v1-InventoryGetResponse)
    - [MemoryInfo](#opi_api-inventory-v1-MemoryInfo)
    - [PCIeDeviceInfo](#opi_api-inventory-v1-PCIeDeviceInfo)
    - [SystemInfo](#opi_api-inventory-v1-SystemInfo)
  
    - [InventorySvc](#opi_api-inventory-v1-InventorySvc)
  
- [object_key.proto](#object_key-proto)
    - [ObjectKey](#opi_api-common-v1-ObjectKey)
  
- [uuid.proto](#uuid-proto)
    - [Uuid](#opi_api-common-v1-Uuid)
  
- [Scalar Value Types](#scalar-value-types)



<a name="bgp-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## bgp.proto



<a name="opi_api-network-cloud-v1alpha1-BGPAdjRibOut"></a>

### BGPAdjRibOut
BGP AdjRibOut object, is a read only object specifiying BGP RIB adjacencies
spec is used to query specific adjacencies


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| spec | [BGPAdjRibOutSpec](#opi_api-network-cloud-v1alpha1-BGPAdjRibOutSpec) |  | filter for get operations |
| status | [BGPAdjRibOutStatus](#opi_api-network-cloud-v1alpha1-BGPAdjRibOutStatus) |  | adjacency information |






<a name="opi_api-network-cloud-v1alpha1-BGPAdjRibOutSpec"></a>

### BGPAdjRibOutSpec
BGP Adj-RIB-Out spec for get operations

empty for now; add support for more filtered gets in future






<a name="opi_api-network-cloud-v1alpha1-BGPAdjRibOutStatus"></a>

### BGPAdjRibOutStatus
BGP Adj-RIB-Out table contains set of routes advertised to all peers


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer_addr | [opi_api.network.opinetcommon.v1alpha1.IPAddress](#opi_api-network-opinetcommon-v1alpha1-IPAddress) |  | BGP peer IP address |
| afi | [BGPAfi](#opi_api-network-cloud-v1alpha1-BGPAfi) |  | BGP address family |
| safi | [BGPSafi](#opi_api-network-cloud-v1alpha1-BGPSafi) |  | BGP sub-address family |
| prefix | [bytes](#bytes) |  | Prefix in NLRI |
| prefix_len | [int32](#int32) |  | Prefix length |
| state | [BgpAroAdvertState](#opi_api-network-cloud-v1alpha1-BgpAroAdvertState) |  | Advertisement status |
| as_size | [BgpAsSize](#opi_api-network-cloud-v1alpha1-BgpAsSize) |  | AS size |
| as_path_str | [bytes](#bytes) |  | AS path string |
| comm | [bytes](#bytes) | repeated | The community list associated with the route after export policy has been applied |
| ext_comm | [bytes](#bytes) | repeated | The extended community membership associated with the route after export policy has been applied |
| med_present | [bool](#bool) |  | BGP Multi-Exit Discriminator value advertised to the peer |
| med | [uint32](#uint32) |  | med value (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: must use uint32 per BGP spec. --) |






<a name="opi_api-network-cloud-v1alpha1-BGPNLRIPrefix"></a>

### BGPNLRIPrefix
BGP NLRI prefix object, this object is not conifgured by the user
rather populated by the BGP automatically, spec is defined for get operations


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| spec | [BGPNLRIPrefixSpec](#opi_api-network-cloud-v1alpha1-BGPNLRIPrefixSpec) |  | configuration |
| state | [BGPNLRIPrefixStatus](#opi_api-network-cloud-v1alpha1-BGPNLRIPrefixStatus) |  | status |






<a name="opi_api-network-cloud-v1alpha1-BGPNLRIPrefixFilter"></a>

### BGPNLRIPrefixFilter
BGP NLRI prefix filter object, returned in get response for BGP prefixes


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| ext_comm | [bytes](#bytes) |  | filter based on extended communities |
| vnid | [int32](#int32) |  | filter based on l2vni/l3vni |
| route_type | [int32](#int32) |  | filter based on route type |
| next_hop | [opi_api.network.opinetcommon.v1alpha1.IPAddress](#opi_api-network-opinetcommon-v1alpha1-IPAddress) |  | filter based on next-hop address |
| ip_address | [opi_api.network.opinetcommon.v1alpha1.IPAddress](#opi_api-network-opinetcommon-v1alpha1-IPAddress) |  | filter based on ip address |
| best | [bool](#bool) |  | filter to include only best routes |






<a name="opi_api-network-cloud-v1alpha1-BGPNLRIPrefixSpec"></a>

### BGPNLRIPrefixSpec
BGP NLRI prefix spec object


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| afi | [BGPAfi](#opi_api-network-cloud-v1alpha1-BGPAfi) |  | BGP address family |
| safi | [BGPSafi](#opi_api-network-cloud-v1alpha1-BGPSafi) |  | BGP sub-address family |
| prefix | [bytes](#bytes) |  | prefix in NLRI |
| prefix_len | [int32](#int32) |  | prefix length |
| route_source | [NLRISrc](#opi_api-network-cloud-v1alpha1-NLRISrc) |  | route source (learned from BGP peer or AFM) |
| route_source_index | [int32](#int32) |  | route source index |
| path_id | [int32](#int32) |  | path ID |






<a name="opi_api-network-cloud-v1alpha1-BGPNLRIPrefixStatus"></a>

### BGPNLRIPrefixStatus
BGP NLRI prefix table


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| afi | [BGPAfi](#opi_api-network-cloud-v1alpha1-BGPAfi) |  | BGP address family |
| safi | [BGPSafi](#opi_api-network-cloud-v1alpha1-BGPSafi) |  | BGP sub-address family |
| prefix | [bytes](#bytes) |  | prefix in NLRI |
| prefix_len | [int32](#int32) |  | prefix length |
| route_source | [NLRISrc](#opi_api-network-cloud-v1alpha1-NLRISrc) |  | route source (learned from BGP peer or AFM) |
| route_source_index | [int32](#int32) |  | route source index |
| path_id | [int32](#int32) |  | path ID |
| best_route | [bool](#bool) |  | chosen as BGP best route or not |
| as_path_str | [bytes](#bytes) |  | AS path string |
| path_orig_id | [bytes](#bytes) |  | originator ID |
| next_hop_addr | [bytes](#bytes) |  | next-hop address |
| as_size | [BgpAsSize](#opi_api-network-cloud-v1alpha1-BgpAsSize) |  | Size of each ASN in the AS path string |
| ecmp_route | [bool](#bool) |  | Is this route part of an ECMP set |
| peer_addr | [opi_api.network.opinetcommon.v1alpha1.IPAddress](#opi_api-network-opinetcommon-v1alpha1-IPAddress) |  | Peer IP |
| flap_stats_flapcnt | [int32](#int32) |  | The number of times this route has flapped since statistics were last cleared. |
| flap_stats_supprsd | [bool](#bool) |  | Whether or not this route is suppressed. |
| is_active | [BgpNlriIsActive](#opi_api-network-cloud-v1alpha1-BgpNlriIsActive) |  | An indication of whether or not this route is installed in the forwarding table |
| stale | [bool](#bool) |  | Whether or not this route was last sent by the peer before BGP detected that the peer was restarting. |
| flap_starttime | [int32](#int32) |  | The value of sysUpTime when this route flapped |
| reason_not_best | [BGPRsnNotBest](#opi_api-network-cloud-v1alpha1-BGPRsnNotBest) |  | If bgpNlriPrefixBest is &#39;true&#39;, then this field is set to &#39;routeIsBest&#39;. Otherwise, it reports the stage in the decision process when the route was determined to be non-best. |
| ext_comm | [bytes](#bytes) | repeated | The extended community membership associated with the route after import policy has been applied. |
| comm | [bytes](#bytes) | repeated | The community list associated with the route after import policy has been applied. |
| local_pref | [int32](#int32) |  | Calculated local preference |
| origin | [BGPOriginAttr](#opi_api-network-cloud-v1alpha1-BGPOriginAttr) |  | Origin attribute |
| med_present | [bool](#bool) |  | Multi-Exit Discriminator present, med value can&#39;t be used to indicate this |
| med | [uint32](#uint32) |  | med value (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: must use uint32 per BGP spec. --) |
| peer_type | [BGPPeerType](#opi_api-network-cloud-v1alpha1-BGPPeerType) |  | Peer type |






<a name="opi_api-network-cloud-v1alpha1-BGPPeer"></a>

### BGPPeer
BGP peer object


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| spec | [BGPPeerSpec](#opi_api-network-cloud-v1alpha1-BGPPeerSpec) |  | bgp peer configuration |
| status | [BGPPeerStatus](#opi_api-network-cloud-v1alpha1-BGPPeerStatus) |  | bgp peer status |






<a name="opi_api-network-cloud-v1alpha1-BGPPeerAf"></a>

### BGPPeerAf
BGP peer AF object


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| spec | [BGPPeerAfSpec](#opi_api-network-cloud-v1alpha1-BGPPeerAfSpec) |  | configuration |
| state | [BGPPeerAfStatus](#opi_api-network-cloud-v1alpha1-BGPPeerAfStatus) |  | status |






<a name="opi_api-network-cloud-v1alpha1-BGPPeerAfSpec"></a>

### BGPPeerAfSpec
BGP peer AF configurations


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | unique key/identifier of peer AF config |
| local_addr | [opi_api.network.opinetcommon.v1alpha1.IPAddress](#opi_api-network-opinetcommon-v1alpha1-IPAddress) |  | BGP local IP address |
| peer_addr | [opi_api.network.opinetcommon.v1alpha1.IPAddress](#opi_api-network-opinetcommon-v1alpha1-IPAddress) |  | BGP peer IP address |
| afi | [BGPAfi](#opi_api-network-cloud-v1alpha1-BGPAfi) |  | BGP address family |
| safi | [BGPSafi](#opi_api-network-cloud-v1alpha1-BGPSafi) |  | BGP sub-address family |
| nexthop_self | [bool](#bool) |  | enforce this router to set self as next-hop for advertised routes |
| default_orig | [bool](#bool) |  | originate a default route to this peer |
| local_port | [int32](#int32) |  | The local port configured for the peering session |
| remote_port | [int32](#int32) |  | The remote port configured for the peering session |
| local_addr_scope_id | [int32](#int32) |  | For a peer identified by a link-local IPv6 addresses, this is the scope ID of bgpPeerLocalAddr and bgpPeerRemoteAddr. For a peer identified only by interface (bgpPeerLocalAddr and bgpPeerRemoteAddr are both zero), this is the interface index of the local point-to-point interface through which the peer is reachable |






<a name="opi_api-network-cloud-v1alpha1-BGPPeerAfStatus"></a>

### BGPPeerAfStatus
BGP peer AF status


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| update_group | [int32](#int32) |  | BGP The index of the update group that the peer is a member of for this AFI/SAFI |
| local_addr_scope_id | [int32](#int32) |  | For a peer identified by a link-local IPv6 addresses, this is the scope ID of bgpPeerLocalAddr and bgpPeerRemoteAddr. |
| route_refresh | [bool](#bool) |  | send a Route Refresh request to the peer for this AFI/SAFI. |
| add_path_cap_neg | [BgpAddPathCapNegCap](#opi_api-network-cloud-v1alpha1-BgpAddPathCapNegCap) |  | The BGP additional path capability negotiated with this peer for this AFI/SAFI. |
| reflector_client | [BGPPeerRRClient](#opi_api-network-cloud-v1alpha1-BGPPeerRRClient) |  | This value indicates whether the given peer is a reflector client of this router for this AFI/SAFI, or not |






<a name="opi_api-network-cloud-v1alpha1-BGPPeerSpec"></a>

### BGPPeerSpec
BGP peer configurations


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | unique key/identifier of peer |
| state | [opi_api.network.opinetcommon.v1alpha1.AdminState](#opi_api-network-opinetcommon-v1alpha1-AdminState) |  | peer enable/disable admin state. if peer is not enabled then local router must not initiate connections to the neighbor and must not respond to TCP connections attempts from neighbor |
| local_address | [opi_api.network.opinetcommon.v1alpha1.IPAddress](#opi_api-network-opinetcommon-v1alpha1-IPAddress) |  | BGP local IP address. control plane chooses the local IP address of the session if an all 0 IP address is provided |
| peer_addr | [opi_api.network.opinetcommon.v1alpha1.IPAddress](#opi_api-network-opinetcommon-v1alpha1-IPAddress) |  | BGP peer IP address |
| remote_asn | [uint32](#uint32) |  | remote 4-byte AS number (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: must use uint32 per BGP spec. --) |
| send_comm | [bool](#bool) |  | send regular community attributes to neighbor |
| send_ext_comm | [bool](#bool) |  | send extended community attributes to neighbor |
| rr_client | [BGPPeerRRClient](#opi_api-network-cloud-v1alpha1-BGPPeerRRClient) |  | peer is a route reflector client |
| connect_retry | [int32](#int32) |  | BGP session connect-retry timer in seconds |
| holdtime | [int32](#int32) |  | BGP session configured holdtime timer in seconds |
| keep_alive | [int32](#int32) |  | BGP session configured keepalive timer in seconds |
| password | [bytes](#bytes) |  | MD5 authentication |
| ttl | [int32](#int32) |  | TTL, set 1 to enable fast-external-fallover for directly connected eBGP sessions range:1-255, default 64 (-- api-linter: core::0214::ttl-type=disabled aip.dev/not-precedent: ttl is not a duration. --) |
| idle_holdtime | [int32](#int32) |  | IdleHoldTime in seconds, range:1-32767, default 15 |
| allow_local_as | [int32](#int32) |  | The number of instances of the local AS identifier that may be contained in the route&#39;s AS-Path without rejecting the route. Changing the value of this object while the peer is active triggers BGP to refresh its routes from the peer range:0-255, default 0 |






<a name="opi_api-network-cloud-v1alpha1-BGPPeerStatus"></a>

### BGPPeerStatus
BGP peer status


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| session_state | [BGPPeerSessionState](#opi_api-network-cloud-v1alpha1-BGPPeerSessionState) |  | BGP session state |
| prev_session_state | [BGPPeerSessionState](#opi_api-network-cloud-v1alpha1-BGPPeerSessionState) |  | BGP session previous status |
| last_error_rcvd | [bytes](#bytes) |  | last error received |
| last_error_sent | [bytes](#bytes) |  | Last error sent |
| local_addr | [opi_api.network.opinetcommon.v1alpha1.IPAddress](#opi_api-network-opinetcommon-v1alpha1-IPAddress) |  | selected local address of the peer |
| holdtime | [int32](#int32) |  | BGP session holdtime in seconds established with peer |
| keepalive | [int32](#int32) |  | BGP session keepalive in seconds established with peer |
| caps_sent | [int32](#int32) |  | BGP The capabilities announced to the peer on the most recent open message sent to the peer. |
| caps_rcvd | [int32](#int32) |  | BGP The capabilities received on the most recent open message received from the peer. |
| caps_neg | [int32](#int32) |  | BGP The capabilities negotiated for the session with the peer |
| sel_local_addr_type | [BGPAddrType](#opi_api-network-cloud-v1alpha1-BGPAddrType) |  | BGP The address family of the local address used by the transport connection for the peering session. |
| incoming_notifications | [int32](#int32) |  | Number of BGP Notifications received for this connection. |
| outbound_notifications | [int32](#int32) |  | Number of BGP Notifications sent for this connection. |
| incoming_updates | [int32](#int32) |  | Number of BGP Updates received for this connection. |
| outgoing_updates | [int32](#int32) |  | Number of BGP Updates received for this connection. |
| incoming_keepalives | [int32](#int32) |  | Number of BGP Keepalives received for this connection. |
| outgoing_keepalives | [int32](#int32) |  | Number of BGP Opens sent for this connection. |
| incoming_refreshes | [int32](#int32) |  | Number of BGP Route Refreshes received for this connection. |
| outgoing_refreshes | [int32](#int32) |  | Number of BGP Route Refreshes sent for this connection. |
| incoming_total_messages | [int32](#int32) |  | Total number of BGP messages received for this connection. |
| outgoing_total_messages | [int32](#int32) |  | Total number of BGP messages sent for this connection. |
| fsm_est_transitions | [int32](#int32) |  | Number of times BGP FSM transitioned to established state. |
| connect_retry_count | [int32](#int32) |  | Number of retries after a flap. |
| peergr | [int32](#int32) |  | Peer Group ID. |
| stale_pathtime | [int32](#int32) |  | Number of sec to stale the routes before deleting them. |
| orf_entry_count | [int32](#int32) |  | Number of ORF entries of all types received from the peer. |
| rcvd_msg_elpstime | [int32](#int32) |  | Number of received message elapsed time. |
| route_refr_sent | [int32](#int32) |  | Number of Route Refreshes sent to the peer. |
| route_refr_rcvd | [int32](#int32) |  | Number of Route Refreshes received from the peer. |
| incoming_prfxes | [int32](#int32) |  | Number of prefixes received from the peer. |
| outgoing_prfxes | [int32](#int32) |  | Number of prefixes advertised to the peer including withdrawn prefixes. |
| outgoing_prfxes_advertised | [int32](#int32) |  | Number of prefixes advertised to the peer. |
| connect_retry_int | [int32](#int32) |  | Connection retry time interval. |
| outgoing_update_elpstime | [int32](#int32) |  | Time in sec since last update was sent to the peer. |
| outgoing_prfxes_denied | [int32](#int32) |  | Number of prefixes failed export policy. |
| outgoing_prfxes_imp_wdr | [int32](#int32) |  | Number of prefixes for which implicit withdraw has been sent. |
| outgoing_prfxes_exp_wdr | [int32](#int32) |  | Number of prefixes for which explicit withdraw has been sent. |
| incoming_prfxes_imp_wdr | [int32](#int32) |  | Number of prefixes for which implicit withdraw has been rcvd. |
| incoming_prfxes_exp_wdr | [int32](#int32) |  | Number of prefixes for which explicit withdraw has been rcvd. |
| received_holdtime | [int32](#int32) |  | Hold time received in open message. |
| fsm_establishedtime | [int32](#int32) |  | For how long is this peer in established state in sec. |
| incoming_updates_elpstime | [int32](#int32) |  | Elapsed time in sec since the last BGP message is received. |
| incoming_opens | [int32](#int32) |  | Number of BGP Opens received for this connection. |
| outgoing_opens | [int32](#int32) |  | Number of BGP Opens sent for this connection. |
| peer_index | [int32](#int32) |  | Peer Index |
| ttl | [int32](#int32) |  | Current TTL value in use (-- api-linter: core::0214::ttl-type=disabled aip.dev/not-precedent: ttl is not a duration. --) |
| oper_state | [BGPOperState](#opi_api-network-cloud-v1alpha1-BGPOperState) |  | Operational status of this peer |






<a name="opi_api-network-cloud-v1alpha1-Bgp"></a>

### Bgp
BGP object


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| spec | [BgpSpec](#opi_api-network-cloud-v1alpha1-BgpSpec) |  | BGP Configuration |
| status | [BgpStatus](#opi_api-network-cloud-v1alpha1-BgpStatus) |  | BGP Status |






<a name="opi_api-network-cloud-v1alpha1-BgpSpec"></a>

### BgpSpec
BGP configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | unique key/identifier of BGP config |
| local_asn | [uint32](#uint32) |  | the local autonomous system number (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: must use uint32 per BGP spec. --) |
| router_id | [fixed32](#fixed32) |  | router ID for this bgp instance (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: must use fixed32 per BGP spec. --) |
| cluster_id | [fixed32](#fixed32) |  | cluster ID of the local router. router ID will be used as cluster ID if cluster ID is not configured or configured to zero (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: must use fixed32 per BGP spec. --) |
| disable | [bool](#bool) |  | disable/enable BGP |
| suppress_default_resolution | [bool](#bool) |  | exclude default route from being used to resolve nexthop reachability in the underlay changing this will deactivate and activate the routing stack RIB |






<a name="opi_api-network-cloud-v1alpha1-BgpStatus"></a>

### BgpStatus
operational status of BGP


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| oper_state | [BGPOperState](#opi_api-network-cloud-v1alpha1-BGPOperState) |  | BGP current oper status |
| adj_rib_out_routes_count | [int32](#int32) |  | The total number of Adj-RIB-Out routes currently allocated |
| peak_num_adj_rib_out_routes | [int32](#int32) |  | The peak number of Adj-RIB-Out routes that have been allocated at any one time |
| rem_delaytime | [int32](#int32) |  | The maximum time remaining until route selection takes place following a restart, in hundredths of a second. |
| table_ver | [int32](#int32) |  | The table version number of the Loc-RIB |





 


<a name="opi_api-network-cloud-v1alpha1-BGPAddrType"></a>

### BGPAddrType
bgp address type

| Name | Number | Description |
| ---- | ------ | ----------- |
| BGP_ADDR_TYPE_UNSPECIFIED | 0 | other |
| BGP_ADDR_TYPE_IPV4 | 1 | ipv4 |
| BGP_ADDR_TYPE_IPV6 | 2 | ipv6 |
| BGP_ADDR_TYPE_NSAP | 3 | nsap |
| BGP_ADDR_TYPE_HDLC | 4 | hdlc |
| BGP_ADDR_TYPE_BBN1822 | 5 | bbn-1822 |
| BGP_ADDR_TYPE_IEEE802 | 6 | ieee 802 |
| BGP_ADDR_TYPE_E163 | 7 | e163 |
| BGP_ADDR_TYPE_E164 | 8 | e164 |
| BGP_ADDR_TYPE_F69 | 9 | f69 |
| BGP_ADDR_TYPE_X121 | 10 | x121 |
| BGP_ADDR_TYPE_IPX | 11 | ipx |
| BGP_ADDR_TYPE_APPLETALK | 12 | apple-talk |
| BGP_ADDR_TYPE_DECNETIV | 13 | dec net |
| BGP_ADDR_TYPE_BANYANVIN | 14 | banyan |
| BGP_ADDR_TYPE_E164_NSAP | 15 | nsap |
| BGP_ADDR_TYPE_IPV4_TNA | 16 | ipv4 tna |
| BGP_ADDR_TYPE_IPV6_TNA | 17 | ipv6 tna |
| BGP_ADDR_TYPE_NSAP_TNA | 18 | nsap tna |
| BGP_ADDR_TYPE_VPN_IPV4 | 19 | vpn ipv4 |
| BGP_ADDR_TYPE_VPN_IPV6 | 20 | vpn ipv6 |
| BGP_ADDR_TYPE_L2VPN | 25 | l2vpn |



<a name="opi_api-network-cloud-v1alpha1-BGPAfi"></a>

### BGPAfi
BGP address family identifier

| Name | Number | Description |
| ---- | ------ | ----------- |
| BGP_AFI_UNSPECIFIED | 0 | AFI_UNSPECIFIED |
| BGP_AFI_IPV4 | 1 | AFI_IPV4 |
| BGP_AFI_IPV6 | 2 | AFI_IPv6 |
| BGP_AFI_L2VPN | 25 | AFI_L2VPN |



<a name="opi_api-network-cloud-v1alpha1-BGPClearRouteOptions"></a>

### BGPClearRouteOptions
clear route request&#39;s options

| Name | Number | Description |
| ---- | ------ | ----------- |
| BGP_CLEAR_ROUTE_OPTIONS_UNSPECIFIED | 0 | unspecified |
| BGP_CLEAR_ROUTE_OPTIONS_HARD | 1 | toggle session |
| BGP_CLEAR_ROUTE_OPTIONS_REFRESH_IN | 2 | request route refresh from peer |
| BGP_CLEAR_ROUTE_OPTIONS_REFRESH_OUT | 3 | send all routes to peer |
| BGP_CLEAR_ROUTE_OPTIONS_REFRESH_BOTH | 4 | send all routes to peer and request route refresh from peer |



<a name="opi_api-network-cloud-v1alpha1-BGPOperState"></a>

### BGPOperState
bgp operational status

| Name | Number | Description |
| ---- | ------ | ----------- |
| BGP_OPER_STATE_UNSPECIFIED | 0 | unspecified |
| BGP_OPER_STATE_UP | 1 | up |
| BGP_OPER_STATE_DOWN | 2 | down |
| BGP_OPER_STATE_GOING_UP | 3 | going up |
| BGP_OPER_STATE_GOING_DOWN | 4 | going down |
| BGP_OPER_STATE_ACT_FAILED | 5 | activation failed |



<a name="opi_api-network-cloud-v1alpha1-BGPOriginAttr"></a>

### BGPOriginAttr
bgp origin attribute

| Name | Number | Description |
| ---- | ------ | ----------- |
| BGP_ORIGIN_ATTR_UNSPECIFIED | 0 | unspecified |
| BGP_ORIGIN_ATTR_IGP | 1 | igp |
| BGP_ORIGIN_ATTR_EGP | 2 | egp |
| BGP_ORIGIN_ATTR_INCOMPLETE | 3 | incomplete |



<a name="opi_api-network-cloud-v1alpha1-BGPPeerRRClient"></a>

### BGPPeerRRClient
BGP peer RR client

| Name | Number | Description |
| ---- | ------ | ----------- |
| BGP_PEER_RR_CLIENT_UNSPECIFIED | 0 | RR_UNSPECIFIED |
| BGP_PEER_RR_CLIENT | 1 | RR_CLIENT |
| BGP_PEER_RR_MESHED_CLIENT | 2 | RR_MESHED_CLIENT |



<a name="opi_api-network-cloud-v1alpha1-BGPPeerSessionState"></a>

### BGPPeerSessionState
BGP peer session&#39;s last_state

| Name | Number | Description |
| ---- | ------ | ----------- |
| BGP_PEER_SESSION_STATE_UNSPECIFIED | 0 | unspecified |
| BGP_PEER_SESSION_STATE_IDLE | 1 | idle |
| BGP_PEER_SESSION_STATE_CONNECT | 2 | connect |
| BGP_PEER_SESSION_STATE_ACTIVE | 3 | active |
| BGP_PEER_SESSION_STATE_OPENSENT | 4 | open-sent |
| BGP_PEER_SESSION_STATE_OPENCONFIRM | 5 | open-confirm |
| BGP_PEER_SESSION_STATE_ESTABLISHED | 6 | open-established |



<a name="opi_api-network-cloud-v1alpha1-BGPPeerType"></a>

### BGPPeerType
bgp peer type

| Name | Number | Description |
| ---- | ------ | ----------- |
| BGP_PEER_TYPE_UNSPECIFIED | 0 | unspecified |
| BGP_PEER_TYPE_NONE | 1 | none (per protocol) |
| BGP_PEER_TYPE_IBGP | 2 | ibgp |
| BGP_PEER_TYPE_EBGP | 3 | ebgp |



<a name="opi_api-network-cloud-v1alpha1-BGPRsnNotBest"></a>

### BGPRsnNotBest
BGP Reason for not best route

| Name | Number | Description |
| ---- | ------ | ----------- |
| BGP_REASON_NOT_CONSIDERED | 0 | not considered (-- api-linter: core::0126::unspecified=disabled aip.dev/not-precedent: zero is not-considered, not unspecified. --) |
| BGP_REASON_ROUTE_IS_BEST | 1 | route is best |
| BGP_REASON_WEIGHT | 2 | weight based |
| BGP_REASON_LOCAL_PREF | 3 | local preference |
| BGP_REASON_LCL_ORIG_PRFRRED | 4 | local origin preferred |
| BGP_REASON_AS_PATH_LEN | 5 | as path lengt |
| BGP_REASON_ORIGIN | 6 | origin based |
| BGP_REASON_MED | 7 | med |
| BGP_REASON_LOCAL_ORIG_TIE | 8 | origin tie |
| BGP_REASON_EBGP_V_IBGP_PEER | 9 | ebpg vs. ibgp peer |
| BGP_REASON_ADMIN_DISTANCE | 10 | admin distance |
| BGP_REASON_PATH_TO_NEXT_CST | 11 | path next to cst |
| BGP_REASON_PREF_EXISTING | 12 | preferenc existing |
| BGP_REASON_IDENTIFIER | 13 | reason identifier (-- api-linter: core::0140::abbreviations=disabled aip.dev/not-precedent: --) |
| BGP_REASON_CLUSTER_LEN | 14 | cluster length |
| BGP_REASON_PEER_ADDR_TYPE | 15 | peer address type |
| BGP_REASON_PEER_ADDR | 16 | peer address |
| BGP_REASON_PEER_PORT | 17 | peer port |
| BGP_REASON_PATH_ID | 18 | path id |



<a name="opi_api-network-cloud-v1alpha1-BGPSafi"></a>

### BGPSafi
BGP sub-address family identitfier

| Name | Number | Description |
| ---- | ------ | ----------- |
| BGP_SAFI_UNSPECIFIED | 0 | SAFI_UNSPECIFIED |
| BGP_SAFI_UNICAST | 1 | SAFI_UNICAST |
| BGP_SAFI_EVPN | 70 | SAFI_EVPN |



<a name="opi_api-network-cloud-v1alpha1-BgpAddPathCapNegCap"></a>

### BgpAddPathCapNegCap
bgp add path capability negotiation

| Name | Number | Description |
| ---- | ------ | ----------- |
| BGP_ADD_PATH_SR_DISABLE | 0 | disabled (-- api-linter: core::0126::unspecified=disabled aip.dev/not-precedent: zero is disabled, not unspecified. --) |
| BGP_ADD_PATH_SR_RECEIVE | 1 | receive |
| BGP_ADD_PATH_SR_SEND | 2 | send |
| BGP_ADD_PATH_SR_BOTH | 3 | both |
| BGP_ADD_PATH_SR_INHERIT | 4 | inherit |
| BGP_ADD_PATH_SR_UNKNOWN | 5 | uknown |



<a name="opi_api-network-cloud-v1alpha1-BgpAroAdvertState"></a>

### BgpAroAdvertState
BGP ARO Advertisement State

| Name | Number | Description |
| ---- | ------ | ----------- |
| BGP_ARO_ADVERT_STATE_UNSPECIFIED | 0 | unspecified |
| BGP_ARO_ADVERT_STATE_ADVERTISED | 1 | advertised |
| BGP_ARO_ADVERT_STATE_SUPPRESSED | 2 | suppressed |
| BGP_ARO_ADVERT_STATE_PENDING_WITHDRAWAL | 3 | pending withdrawal |
| BGP_ARO_ADVERT_STATE_WITHDRAWN | 4 | withdrawn |



<a name="opi_api-network-cloud-v1alpha1-BgpAsSize"></a>

### BgpAsSize
bgp as size

| Name | Number | Description |
| ---- | ------ | ----------- |
| BGP_AS_SIZE_UNSPECIFIED | 0 | unspecified |
| BGP_AS_SIZE_TWO_OCTET | 1 | two bytes |
| BGP_AS_SIZE_FOUR_OCTET | 2 | four bytes |



<a name="opi_api-network-cloud-v1alpha1-BgpNlriIsActive"></a>

### BgpNlriIsActive
NLRI active values

| Name | Number | Description |
| ---- | ------ | ----------- |
| BGP_NLRI_IS_ACTIVE_UNSPECIFIED | 0 | unspecified |
| BGP_NLRI_IS_ACTIVE_NOT_TRACKED | 1 | not tracked |
| BGP_NLRI_IS_ACTIVE_INACTIVE | 2 | inactive |
| BGP_NLRI_IS_ACTIVE_ACTIVE | 3 | active |



<a name="opi_api-network-cloud-v1alpha1-NLRISrc"></a>

### NLRISrc
NLRI source

| Name | Number | Description |
| ---- | ------ | ----------- |
| NLRI_SRC_UNSPECIFIED | 0 | unspecified |
| NLRI_SRC_PEER | 1 | learned from peer |
| NLRI_SRC_AFM | 2 | learned from AFM |
| NLRI_SRC_SELF | 3 | created by itself |


 

 

 



<a name="cloudrpc-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## cloudrpc.proto



<a name="opi_api-network-cloud-v1alpha1-CreateBGPPeerAfRequest"></a>

### CreateBGPPeerAfRequest
Create BGPPeerAf Request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | parent |
| bgppeeraf | [BGPPeerAf](#opi_api-network-cloud-v1alpha1-BGPPeerAf) |  | bgppeeraf |
| bgppeeraf_id | [string](#string) |  | bgppeeraf_id |






<a name="opi_api-network-cloud-v1alpha1-CreateBGPPeerRequest"></a>

### CreateBGPPeerRequest
Create BGPPeer Request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | parent |
| bgppeer | [BGPPeer](#opi_api-network-cloud-v1alpha1-BGPPeer) |  | bgppeer |
| bgppeer_id | [string](#string) |  | bgppeer_id |






<a name="opi_api-network-cloud-v1alpha1-CreateBgpRequest"></a>

### CreateBgpRequest
Create Bgp Request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | parent |
| bgp | [Bgp](#opi_api-network-cloud-v1alpha1-Bgp) |  | bgp |
| bgp_id | [string](#string) |  | bgp_id |






<a name="opi_api-network-cloud-v1alpha1-CreateDeviceRequest"></a>

### CreateDeviceRequest
Create Device Request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | parent |
| device | [Device](#opi_api-network-cloud-v1alpha1-Device) |  | device |
| device_id | [string](#string) |  | device_id |






<a name="opi_api-network-cloud-v1alpha1-CreateInterfaceRequest"></a>

### CreateInterfaceRequest
Create Interface Request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | parent |
| interface | [Interface](#opi_api-network-cloud-v1alpha1-Interface) |  | interface |
| interface_id | [string](#string) |  | interface_id |






<a name="opi_api-network-cloud-v1alpha1-CreateMappingRequest"></a>

### CreateMappingRequest
Create Mapping Request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | parent |
| mapping | [Mapping](#opi_api-network-cloud-v1alpha1-Mapping) |  | mapping |
| mapping_id | [string](#string) |  | mapping_id |






<a name="opi_api-network-cloud-v1alpha1-CreateNextHopGroupRequest"></a>

### CreateNextHopGroupRequest
Create NextHopGroup Request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | parent |
| nexthopgroup | [NextHopGroup](#opi_api-network-cloud-v1alpha1-NextHopGroup) |  | nexthopgroup |
| nexthopgroup_id | [string](#string) |  | nexthopgroup_id |






<a name="opi_api-network-cloud-v1alpha1-CreateNextHopRequest"></a>

### CreateNextHopRequest
Create NextHop Request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | parent |
| nexthop | [NextHop](#opi_api-network-cloud-v1alpha1-NextHop) |  | nexthop |
| nexthop_id | [string](#string) |  | nexthop_id |






<a name="opi_api-network-cloud-v1alpha1-CreateRouteRequest"></a>

### CreateRouteRequest
Create Route Request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | parent |
| route | [Route](#opi_api-network-cloud-v1alpha1-Route) |  | route |
| route_id | [string](#string) |  | route_id |






<a name="opi_api-network-cloud-v1alpha1-CreateRouteTableRequest"></a>

### CreateRouteTableRequest
Create RouteTable Request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | parent |
| routetable | [RouteTable](#opi_api-network-cloud-v1alpha1-RouteTable) |  | routetable |
| routetable_id | [string](#string) |  | routetable_id |






<a name="opi_api-network-cloud-v1alpha1-CreateSecurityPolicyRequest"></a>

### CreateSecurityPolicyRequest
Create SecurityPolicy Request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | parent |
| securitypolicy | [SecurityPolicy](#opi_api-network-cloud-v1alpha1-SecurityPolicy) |  | securitypolicy |
| securitypolicy_id | [string](#string) |  | securitypolicy_id |






<a name="opi_api-network-cloud-v1alpha1-CreateSecurityProfileRequest"></a>

### CreateSecurityProfileRequest
Create SecurityProfile Request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | parent |
| securityprofile | [SecurityProfile](#opi_api-network-cloud-v1alpha1-SecurityProfile) |  | securityprofile |
| securityprofile_id | [string](#string) |  | securityprofile_id |






<a name="opi_api-network-cloud-v1alpha1-CreateSecurityRuleRequest"></a>

### CreateSecurityRuleRequest
Create SecurityRule Request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | parent |
| securityrule | [SecurityRule](#opi_api-network-cloud-v1alpha1-SecurityRule) |  | securityrule |
| securityrule_id | [string](#string) |  | securityrule_id |






<a name="opi_api-network-cloud-v1alpha1-CreateSubnetRequest"></a>

### CreateSubnetRequest
Create Subnet Request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | parent |
| subnet | [Subnet](#opi_api-network-cloud-v1alpha1-Subnet) |  | subnet |
| subnet_id | [string](#string) |  | subnet_id |






<a name="opi_api-network-cloud-v1alpha1-CreateTunnelRequest"></a>

### CreateTunnelRequest
Create Tunnel Request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | parent |
| tunnel | [Tunnel](#opi_api-network-cloud-v1alpha1-Tunnel) |  | tunnel |
| tunnel_id | [string](#string) |  | tunnel_id |






<a name="opi_api-network-cloud-v1alpha1-CreateUnderlayRouteRequest"></a>

### CreateUnderlayRouteRequest
Create UnderlayRoute Request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | parent |
| underlayroute | [UnderlayRoute](#opi_api-network-cloud-v1alpha1-UnderlayRoute) |  | underlayroute |
| underlayroute_id | [string](#string) |  | underlayroute_id |






<a name="opi_api-network-cloud-v1alpha1-CreateVPCPeerRequest"></a>

### CreateVPCPeerRequest
Create VPCPeer Request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | parent |
| vpcpeer | [VPCPeer](#opi_api-network-cloud-v1alpha1-VPCPeer) |  | vpcpeer |
| vpcpeer_id | [string](#string) |  | vpcpeer_id |






<a name="opi_api-network-cloud-v1alpha1-CreateVnicRequest"></a>

### CreateVnicRequest
Create Vnic Request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | parent |
| vnic | [Vnic](#opi_api-network-cloud-v1alpha1-Vnic) |  | vnic |
| vnic_id | [string](#string) |  | vnic_id |






<a name="opi_api-network-cloud-v1alpha1-CreateVpcRequest"></a>

### CreateVpcRequest
Create Vpc Request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | parent |
| vpc | [Vpc](#opi_api-network-cloud-v1alpha1-Vpc) |  | vpc |
| vpc_id | [string](#string) |  | vpc_id |






<a name="opi_api-network-cloud-v1alpha1-DeleteBGPPeerAfRequest"></a>

### DeleteBGPPeerAfRequest
Delete bgppeeraf request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  | bgppeeraf id |






<a name="opi_api-network-cloud-v1alpha1-DeleteBGPPeerRequest"></a>

### DeleteBGPPeerRequest
Delete bgppeer request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  | bgppeer id |






<a name="opi_api-network-cloud-v1alpha1-DeleteBgpRequest"></a>

### DeleteBgpRequest
Delete bgp request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  | bgp id |






<a name="opi_api-network-cloud-v1alpha1-DeleteDeviceRequest"></a>

### DeleteDeviceRequest
Delete device request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  | device id |






<a name="opi_api-network-cloud-v1alpha1-DeleteInterfaceRequest"></a>

### DeleteInterfaceRequest
Delete interface request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  | interface id |






<a name="opi_api-network-cloud-v1alpha1-DeleteMappingRequest"></a>

### DeleteMappingRequest
Delete mapping request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  | mapping id |






<a name="opi_api-network-cloud-v1alpha1-DeleteNextHopGroupRequest"></a>

### DeleteNextHopGroupRequest
Delete nexthopgroup request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  | nexthopgroup id |






<a name="opi_api-network-cloud-v1alpha1-DeleteNextHopRequest"></a>

### DeleteNextHopRequest
Delete nexthop request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  | nexthop id |






<a name="opi_api-network-cloud-v1alpha1-DeleteRouteRequest"></a>

### DeleteRouteRequest
Delete route request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  | route id |






<a name="opi_api-network-cloud-v1alpha1-DeleteRouteTableRequest"></a>

### DeleteRouteTableRequest
Delete routetable request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  | routetable id |






<a name="opi_api-network-cloud-v1alpha1-DeleteSecurityPolicyRequest"></a>

### DeleteSecurityPolicyRequest
Delete securitypolicy request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  | securitypolicy id |






<a name="opi_api-network-cloud-v1alpha1-DeleteSecurityProfileRequest"></a>

### DeleteSecurityProfileRequest
Delete securityprofile request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  | securityprofile id |






<a name="opi_api-network-cloud-v1alpha1-DeleteSecurityRuleRequest"></a>

### DeleteSecurityRuleRequest
Delete securityrule request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  | securityrule id |






<a name="opi_api-network-cloud-v1alpha1-DeleteSubnetRequest"></a>

### DeleteSubnetRequest
Delete subnet request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  | subnet id |






<a name="opi_api-network-cloud-v1alpha1-DeleteTunnelRequest"></a>

### DeleteTunnelRequest
Delete Tunnel request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  | tunnel id |






<a name="opi_api-network-cloud-v1alpha1-DeleteUnderlayRouteRequest"></a>

### DeleteUnderlayRouteRequest
Delete underlayroute request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  | underlayroute id |






<a name="opi_api-network-cloud-v1alpha1-DeleteVPCPeerRequest"></a>

### DeleteVPCPeerRequest
Delete vpcpeer request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  | vpcpeer id |






<a name="opi_api-network-cloud-v1alpha1-DeleteVnicRequest"></a>

### DeleteVnicRequest
Delete vnic request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  | vnic id |






<a name="opi_api-network-cloud-v1alpha1-DeleteVpcRequest"></a>

### DeleteVpcRequest
Delete vpc request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  | vpc id |






<a name="opi_api-network-cloud-v1alpha1-GetBGPPeerAfRequest"></a>

### GetBGPPeerAfRequest
Get bgppeeraf request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  |  |






<a name="opi_api-network-cloud-v1alpha1-GetBGPPeerRequest"></a>

### GetBGPPeerRequest
Get bgppeer request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  |  |






<a name="opi_api-network-cloud-v1alpha1-GetBgpRequest"></a>

### GetBgpRequest
Get bgp request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  |  |






<a name="opi_api-network-cloud-v1alpha1-GetDeviceCapabilitiesRequest"></a>

### GetDeviceCapabilitiesRequest
Get DeviceCapabilities Request






<a name="opi_api-network-cloud-v1alpha1-GetDeviceRequest"></a>

### GetDeviceRequest
Get device request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  |  |






<a name="opi_api-network-cloud-v1alpha1-GetInterfaceRequest"></a>

### GetInterfaceRequest
Get interface request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  |  |






<a name="opi_api-network-cloud-v1alpha1-GetMappingRequest"></a>

### GetMappingRequest
Get mapping request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  |  |






<a name="opi_api-network-cloud-v1alpha1-GetNextHopGroupRequest"></a>

### GetNextHopGroupRequest
Get nexthopgroup request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  |  |






<a name="opi_api-network-cloud-v1alpha1-GetNextHopRequest"></a>

### GetNextHopRequest
Get nexthop request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  |  |






<a name="opi_api-network-cloud-v1alpha1-GetPortRequest"></a>

### GetPortRequest
Get port request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  |  |






<a name="opi_api-network-cloud-v1alpha1-GetRouteRequest"></a>

### GetRouteRequest
Get route request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  |  |






<a name="opi_api-network-cloud-v1alpha1-GetRouteTableRequest"></a>

### GetRouteTableRequest
Get routetable request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  |  |






<a name="opi_api-network-cloud-v1alpha1-GetSecurityPolicyRequest"></a>

### GetSecurityPolicyRequest
Get securitypolicy request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  |  |






<a name="opi_api-network-cloud-v1alpha1-GetSecurityProfileRequest"></a>

### GetSecurityProfileRequest
Get securityprofile request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  |  |






<a name="opi_api-network-cloud-v1alpha1-GetSecurityRuleRequest"></a>

### GetSecurityRuleRequest
Get securityrule request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  |  |






<a name="opi_api-network-cloud-v1alpha1-GetSubnetRequest"></a>

### GetSubnetRequest
Get subnet request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  |  |






<a name="opi_api-network-cloud-v1alpha1-GetTunnelRequest"></a>

### GetTunnelRequest
Get Tunnel request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  |  |






<a name="opi_api-network-cloud-v1alpha1-GetUnderlayRouteRequest"></a>

### GetUnderlayRouteRequest
Get underlayroute request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  |  |






<a name="opi_api-network-cloud-v1alpha1-GetVPCPeerRequest"></a>

### GetVPCPeerRequest
Get vpcpeer request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  |  |






<a name="opi_api-network-cloud-v1alpha1-GetVnicRequest"></a>

### GetVnicRequest
Get vnic request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  |  |






<a name="opi_api-network-cloud-v1alpha1-GetVpcRequest"></a>

### GetVpcRequest
Get vpc request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  |  |






<a name="opi_api-network-cloud-v1alpha1-ListBGPPeerAfsRequest"></a>

### ListBGPPeerAfsRequest
List bgppeeraf request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | parent |
| page_size | [int32](#int32) |  | pagination: page-size |
| page_token | [string](#string) |  | pagination: start token |






<a name="opi_api-network-cloud-v1alpha1-ListBGPPeerAfsResponse"></a>

### ListBGPPeerAfsResponse
List bgppeeraf response


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| bgppeeraf | [BGPPeerAf](#opi_api-network-cloud-v1alpha1-BGPPeerAf) | repeated | list of bgppeerafs |
| next_page_token | [string](#string) |  | next page token |






<a name="opi_api-network-cloud-v1alpha1-ListBGPPeersRequest"></a>

### ListBGPPeersRequest
List bgppeer request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | parent |
| page_size | [int32](#int32) |  | pagination: page-size |
| page_token | [string](#string) |  | pagination: start token |






<a name="opi_api-network-cloud-v1alpha1-ListBGPPeersResponse"></a>

### ListBGPPeersResponse
List bgppeer response


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| bgppeer | [BGPPeer](#opi_api-network-cloud-v1alpha1-BGPPeer) | repeated | list of bgppeers |
| next_page_token | [string](#string) |  | next page token |






<a name="opi_api-network-cloud-v1alpha1-ListBgpsRequest"></a>

### ListBgpsRequest
List bgp request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | parent |
| page_size | [int32](#int32) |  | pagination: page-size |
| page_token | [string](#string) |  | pagination: start token |






<a name="opi_api-network-cloud-v1alpha1-ListBgpsResponse"></a>

### ListBgpsResponse
List bgp response


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| bgp | [Bgp](#opi_api-network-cloud-v1alpha1-Bgp) | repeated | list of bgps |
| next_page_token | [string](#string) |  | next page token |






<a name="opi_api-network-cloud-v1alpha1-ListDevicesRequest"></a>

### ListDevicesRequest
List device request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | parent |
| page_size | [int32](#int32) |  | pagination: page-size |
| page_token | [string](#string) |  | pagination: start token |






<a name="opi_api-network-cloud-v1alpha1-ListDevicesResponse"></a>

### ListDevicesResponse
List device response


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| device | [Device](#opi_api-network-cloud-v1alpha1-Device) | repeated | list of devices |
| next_page_token | [string](#string) |  | next page token |






<a name="opi_api-network-cloud-v1alpha1-ListInterfacesRequest"></a>

### ListInterfacesRequest
List interface request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | parent |
| page_size | [int32](#int32) |  | pagination: page-size |
| page_token | [string](#string) |  | pagination: start token |






<a name="opi_api-network-cloud-v1alpha1-ListInterfacesResponse"></a>

### ListInterfacesResponse
List interface response


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| interface | [Interface](#opi_api-network-cloud-v1alpha1-Interface) | repeated | list of interfaces |
| next_page_token | [string](#string) |  | next page token |






<a name="opi_api-network-cloud-v1alpha1-ListMappingsRequest"></a>

### ListMappingsRequest
List mapping request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | parent |
| page_size | [int32](#int32) |  | pagination: page-size |
| page_token | [string](#string) |  | pagination: start token |






<a name="opi_api-network-cloud-v1alpha1-ListMappingsResponse"></a>

### ListMappingsResponse
List mapping response


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| mapping | [Mapping](#opi_api-network-cloud-v1alpha1-Mapping) | repeated | list of mappings |
| next_page_token | [string](#string) |  | next page token |






<a name="opi_api-network-cloud-v1alpha1-ListNextHopGroupsRequest"></a>

### ListNextHopGroupsRequest
List nexthopgroup request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | parent |
| page_size | [int32](#int32) |  | pagination: page-size |
| page_token | [string](#string) |  | pagination: start token |






<a name="opi_api-network-cloud-v1alpha1-ListNextHopGroupsResponse"></a>

### ListNextHopGroupsResponse
List nexthopgroup response


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nexthopgroup | [NextHopGroup](#opi_api-network-cloud-v1alpha1-NextHopGroup) | repeated | list of nexthopgroups |
| next_page_token | [string](#string) |  | next page token |






<a name="opi_api-network-cloud-v1alpha1-ListNextHopsRequest"></a>

### ListNextHopsRequest
List nexthop request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | parent |
| page_size | [int32](#int32) |  | pagination: page-size |
| page_token | [string](#string) |  | pagination: start token |






<a name="opi_api-network-cloud-v1alpha1-ListNextHopsResponse"></a>

### ListNextHopsResponse
List nexthop response


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nexthop | [NextHop](#opi_api-network-cloud-v1alpha1-NextHop) | repeated | list of nexthops |
| next_page_token | [string](#string) |  | next page token |






<a name="opi_api-network-cloud-v1alpha1-ListPortsRequest"></a>

### ListPortsRequest
List port request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | parent |
| page_size | [int32](#int32) |  | pagination: page-size |
| page_token | [string](#string) |  | pagination: start token |






<a name="opi_api-network-cloud-v1alpha1-ListPortsResponse"></a>

### ListPortsResponse
List port response


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| port | [Port](#opi_api-network-cloud-v1alpha1-Port) | repeated | list of ports |
| next_page_token | [string](#string) |  | next page token |






<a name="opi_api-network-cloud-v1alpha1-ListRouteTablesRequest"></a>

### ListRouteTablesRequest
List routetable request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | parent |
| page_size | [int32](#int32) |  | pagination: page-size |
| page_token | [string](#string) |  | pagination: start token |






<a name="opi_api-network-cloud-v1alpha1-ListRouteTablesResponse"></a>

### ListRouteTablesResponse
List routetable response


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| routetable | [RouteTable](#opi_api-network-cloud-v1alpha1-RouteTable) | repeated | list of routetables |
| next_page_token | [string](#string) |  | next page token |






<a name="opi_api-network-cloud-v1alpha1-ListRoutesRequest"></a>

### ListRoutesRequest
List route request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | parent |
| page_size | [int32](#int32) |  | pagination: page-size |
| page_token | [string](#string) |  | pagination: start token |






<a name="opi_api-network-cloud-v1alpha1-ListRoutesResponse"></a>

### ListRoutesResponse
List route response


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| route | [Route](#opi_api-network-cloud-v1alpha1-Route) | repeated | list of routes |
| next_page_token | [string](#string) |  | next page token |






<a name="opi_api-network-cloud-v1alpha1-ListSecurityPolicysRequest"></a>

### ListSecurityPolicysRequest
List securitypolicy request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | parent |
| page_size | [int32](#int32) |  | pagination: page-size |
| page_token | [string](#string) |  | pagination: start token |






<a name="opi_api-network-cloud-v1alpha1-ListSecurityPolicysResponse"></a>

### ListSecurityPolicysResponse
List securitypolicy response


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| securitypolicy | [SecurityPolicy](#opi_api-network-cloud-v1alpha1-SecurityPolicy) | repeated | list of securitypolicys |
| next_page_token | [string](#string) |  | next page token |






<a name="opi_api-network-cloud-v1alpha1-ListSecurityProfilesRequest"></a>

### ListSecurityProfilesRequest
List securityprofile request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | parent |
| page_size | [int32](#int32) |  | pagination: page-size |
| page_token | [string](#string) |  | pagination: start token |






<a name="opi_api-network-cloud-v1alpha1-ListSecurityProfilesResponse"></a>

### ListSecurityProfilesResponse
List securityprofile response


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| securityprofile | [SecurityProfile](#opi_api-network-cloud-v1alpha1-SecurityProfile) | repeated | list of securityprofiles |
| next_page_token | [string](#string) |  | next page token |






<a name="opi_api-network-cloud-v1alpha1-ListSecurityRulesRequest"></a>

### ListSecurityRulesRequest
List securityrule request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | parent |
| page_size | [int32](#int32) |  | pagination: page-size |
| page_token | [string](#string) |  | pagination: start token |






<a name="opi_api-network-cloud-v1alpha1-ListSecurityRulesResponse"></a>

### ListSecurityRulesResponse
List securityrule response


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| securityrule | [SecurityRule](#opi_api-network-cloud-v1alpha1-SecurityRule) | repeated | list of securityrules |
| next_page_token | [string](#string) |  | next page token |






<a name="opi_api-network-cloud-v1alpha1-ListSubnetsRequest"></a>

### ListSubnetsRequest
List subnet request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | parent |
| page_size | [int32](#int32) |  | pagination: page-size |
| page_token | [string](#string) |  | pagination: start token |






<a name="opi_api-network-cloud-v1alpha1-ListSubnetsResponse"></a>

### ListSubnetsResponse
List subnet response


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| subnet | [Subnet](#opi_api-network-cloud-v1alpha1-Subnet) | repeated | list of subnets |
| next_page_token | [string](#string) |  | next page token |






<a name="opi_api-network-cloud-v1alpha1-ListTunnelsRequest"></a>

### ListTunnelsRequest
List Tunnel request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | parent |
| page_size | [int32](#int32) |  | pagination: page-size |
| page_token | [string](#string) |  | pagination: start token |






<a name="opi_api-network-cloud-v1alpha1-ListTunnelsResponse"></a>

### ListTunnelsResponse
List Tunnel response


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| tunnel | [Tunnel](#opi_api-network-cloud-v1alpha1-Tunnel) | repeated | list of tunnels |
| next_page_token | [string](#string) |  | next page token |






<a name="opi_api-network-cloud-v1alpha1-ListUnderlayRoutesRequest"></a>

### ListUnderlayRoutesRequest
List underlayroute request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | parent |
| page_size | [int32](#int32) |  | pagination: page-size |
| page_token | [string](#string) |  | pagination: start token |






<a name="opi_api-network-cloud-v1alpha1-ListUnderlayRoutesResponse"></a>

### ListUnderlayRoutesResponse
List underlayroute response


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| underlayroute | [UnderlayRoute](#opi_api-network-cloud-v1alpha1-UnderlayRoute) | repeated | list of underlayroutes |
| next_page_token | [string](#string) |  | next page token |






<a name="opi_api-network-cloud-v1alpha1-ListVPCPeersRequest"></a>

### ListVPCPeersRequest
List vpcpeer request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | parent |
| page_size | [int32](#int32) |  | pagination: page-size |
| page_token | [string](#string) |  | pagination: start token |






<a name="opi_api-network-cloud-v1alpha1-ListVPCPeersResponse"></a>

### ListVPCPeersResponse
List vpcpeer response


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vpcpeer | [VPCPeer](#opi_api-network-cloud-v1alpha1-VPCPeer) | repeated | list of vpcpeers |
| next_page_token | [string](#string) |  | next page token |






<a name="opi_api-network-cloud-v1alpha1-ListVnicsRequest"></a>

### ListVnicsRequest
List vnic request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | parent |
| page_size | [int32](#int32) |  | pagination: page-size |
| page_token | [string](#string) |  | pagination: start token |






<a name="opi_api-network-cloud-v1alpha1-ListVnicsResponse"></a>

### ListVnicsResponse
List vnic response


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vnic | [Vnic](#opi_api-network-cloud-v1alpha1-Vnic) | repeated | list of vnics |
| next_page_token | [string](#string) |  | next page token |






<a name="opi_api-network-cloud-v1alpha1-ListVpcsRequest"></a>

### ListVpcsRequest
List vpc request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | parent |
| page_size | [int32](#int32) |  | pagination: page-size |
| page_token | [string](#string) |  | pagination: start token |






<a name="opi_api-network-cloud-v1alpha1-ListVpcsResponse"></a>

### ListVpcsResponse
List vpc response


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vpc | [Vpc](#opi_api-network-cloud-v1alpha1-Vpc) | repeated | list of vpcs |
| next_page_token | [string](#string) |  | next page token |






<a name="opi_api-network-cloud-v1alpha1-UpdateBGPPeerAfRequest"></a>

### UpdateBGPPeerAfRequest
Update bgppeeraf request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| bgppeeraf | [BGPPeerAf](#opi_api-network-cloud-v1alpha1-BGPPeerAf) |  | updated bgppeeraf info |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | list of fields to update. |






<a name="opi_api-network-cloud-v1alpha1-UpdateBGPPeerRequest"></a>

### UpdateBGPPeerRequest
Update bgppeer request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| bgppeer | [BGPPeer](#opi_api-network-cloud-v1alpha1-BGPPeer) |  | updated bgppeer info |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | list of fields to update. |






<a name="opi_api-network-cloud-v1alpha1-UpdateBgpRequest"></a>

### UpdateBgpRequest
Update bgp request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| bgp | [Bgp](#opi_api-network-cloud-v1alpha1-Bgp) |  | updated bgp info |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | list of fields to update. |






<a name="opi_api-network-cloud-v1alpha1-UpdateDeviceRequest"></a>

### UpdateDeviceRequest
Update device request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| device | [Device](#opi_api-network-cloud-v1alpha1-Device) |  | updated device info |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | list of fields to update. |






<a name="opi_api-network-cloud-v1alpha1-UpdateInterfaceRequest"></a>

### UpdateInterfaceRequest
Update interface request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| interface | [Interface](#opi_api-network-cloud-v1alpha1-Interface) |  | updated interface info |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | list of fields to update. |






<a name="opi_api-network-cloud-v1alpha1-UpdateMappingRequest"></a>

### UpdateMappingRequest
Update mapping request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| mapping | [Mapping](#opi_api-network-cloud-v1alpha1-Mapping) |  | updated mapping info |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | list of fields to update. |






<a name="opi_api-network-cloud-v1alpha1-UpdateNextHopGroupRequest"></a>

### UpdateNextHopGroupRequest
Update nexthopgroup request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nexthopgroup | [NextHopGroup](#opi_api-network-cloud-v1alpha1-NextHopGroup) |  | updated nexthopgroup info |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | list of fields to update. |






<a name="opi_api-network-cloud-v1alpha1-UpdateNextHopRequest"></a>

### UpdateNextHopRequest
Update nexthop request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nexthop | [NextHop](#opi_api-network-cloud-v1alpha1-NextHop) |  | updated nexthop info |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | list of fields to update. |






<a name="opi_api-network-cloud-v1alpha1-UpdatePortRequest"></a>

### UpdatePortRequest
Update port request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| port | [Port](#opi_api-network-cloud-v1alpha1-Port) |  | updated port info |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | list of fields to update. |






<a name="opi_api-network-cloud-v1alpha1-UpdateRouteRequest"></a>

### UpdateRouteRequest
Update route request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| route | [Route](#opi_api-network-cloud-v1alpha1-Route) |  | updated route info |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | list of fields to update. |






<a name="opi_api-network-cloud-v1alpha1-UpdateRouteTableRequest"></a>

### UpdateRouteTableRequest
Update routetable request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| routetable | [RouteTable](#opi_api-network-cloud-v1alpha1-RouteTable) |  | updated routetable info |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | list of fields to update. |






<a name="opi_api-network-cloud-v1alpha1-UpdateSecurityPolicyRequest"></a>

### UpdateSecurityPolicyRequest
Update securitypolicy request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| securitypolicy | [SecurityPolicy](#opi_api-network-cloud-v1alpha1-SecurityPolicy) |  | updated securitypolicy info |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | list of fields to update. |






<a name="opi_api-network-cloud-v1alpha1-UpdateSecurityProfileRequest"></a>

### UpdateSecurityProfileRequest
Update securityprofile request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| securityprofile | [SecurityProfile](#opi_api-network-cloud-v1alpha1-SecurityProfile) |  | updated securityprofile info |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | list of fields to update. |






<a name="opi_api-network-cloud-v1alpha1-UpdateSecurityRuleRequest"></a>

### UpdateSecurityRuleRequest
Update securityrule request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| securityrule | [SecurityRule](#opi_api-network-cloud-v1alpha1-SecurityRule) |  | updated securityrule info |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | list of fields to update. |






<a name="opi_api-network-cloud-v1alpha1-UpdateSubnetRequest"></a>

### UpdateSubnetRequest
Update subnet request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| subnet | [Subnet](#opi_api-network-cloud-v1alpha1-Subnet) |  | updated subnet info |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | list of fields to update. |






<a name="opi_api-network-cloud-v1alpha1-UpdateTunnelRequest"></a>

### UpdateTunnelRequest
Update Tunnel request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| tunnel | [Tunnel](#opi_api-network-cloud-v1alpha1-Tunnel) |  | updated tunnel info |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | list of fields to update. |






<a name="opi_api-network-cloud-v1alpha1-UpdateUnderlayRouteRequest"></a>

### UpdateUnderlayRouteRequest
Update underlayroute request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| underlayroute | [UnderlayRoute](#opi_api-network-cloud-v1alpha1-UnderlayRoute) |  | updated underlayroute info |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | list of fields to update. |






<a name="opi_api-network-cloud-v1alpha1-UpdateVPCPeerRequest"></a>

### UpdateVPCPeerRequest
Update vpcpeer request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vpcpeer | [VPCPeer](#opi_api-network-cloud-v1alpha1-VPCPeer) |  | updated vpcpeer info |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | list of fields to update. |






<a name="opi_api-network-cloud-v1alpha1-UpdateVnicRequest"></a>

### UpdateVnicRequest
Update vnic request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vnic | [Vnic](#opi_api-network-cloud-v1alpha1-Vnic) |  | updated vnic info |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | list of fields to update. |






<a name="opi_api-network-cloud-v1alpha1-UpdateVpcRequest"></a>

### UpdateVpcRequest
Update vpc request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vpc | [Vpc](#opi_api-network-cloud-v1alpha1-Vpc) |  | updated vpc info |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | list of fields to update. |





 

 

 


<a name="opi_api-network-cloud-v1alpha1-CloudInfraService"></a>

### CloudInfraService
Cloud Infra APIs - to manage a multi-node cloud infrastructure on a xPU

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| GetDeviceCapabilities | [GetDeviceCapabilitiesRequest](#opi_api-network-cloud-v1alpha1-GetDeviceCapabilitiesRequest) | [DeviceCapabilities](#opi_api-network-cloud-v1alpha1-DeviceCapabilities) | device capabilities |
| CreateDevice | [CreateDeviceRequest](#opi_api-network-cloud-v1alpha1-CreateDeviceRequest) | [Device](#opi_api-network-cloud-v1alpha1-Device) | device apis |
| DeleteDevice | [DeleteDeviceRequest](#opi_api-network-cloud-v1alpha1-DeleteDeviceRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateDevice | [UpdateDeviceRequest](#opi_api-network-cloud-v1alpha1-UpdateDeviceRequest) | [Device](#opi_api-network-cloud-v1alpha1-Device) |  |
| ListDevices | [ListDevicesRequest](#opi_api-network-cloud-v1alpha1-ListDevicesRequest) | [ListDevicesResponse](#opi_api-network-cloud-v1alpha1-ListDevicesResponse) |  |
| GetDevice | [GetDeviceRequest](#opi_api-network-cloud-v1alpha1-GetDeviceRequest) | [Device](#opi_api-network-cloud-v1alpha1-Device) |  |
| UpdatePort | [UpdatePortRequest](#opi_api-network-cloud-v1alpha1-UpdatePortRequest) | [Port](#opi_api-network-cloud-v1alpha1-Port) | port apis |
| ListPorts | [ListPortsRequest](#opi_api-network-cloud-v1alpha1-ListPortsRequest) | [ListPortsResponse](#opi_api-network-cloud-v1alpha1-ListPortsResponse) |  |
| GetPort | [GetPortRequest](#opi_api-network-cloud-v1alpha1-GetPortRequest) | [Port](#opi_api-network-cloud-v1alpha1-Port) |  |
| CreateVnic | [CreateVnicRequest](#opi_api-network-cloud-v1alpha1-CreateVnicRequest) | [Vnic](#opi_api-network-cloud-v1alpha1-Vnic) | vnic apis |
| DeleteVnic | [DeleteVnicRequest](#opi_api-network-cloud-v1alpha1-DeleteVnicRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateVnic | [UpdateVnicRequest](#opi_api-network-cloud-v1alpha1-UpdateVnicRequest) | [Vnic](#opi_api-network-cloud-v1alpha1-Vnic) |  |
| ListVnics | [ListVnicsRequest](#opi_api-network-cloud-v1alpha1-ListVnicsRequest) | [ListVnicsResponse](#opi_api-network-cloud-v1alpha1-ListVnicsResponse) |  |
| GetVnic | [GetVnicRequest](#opi_api-network-cloud-v1alpha1-GetVnicRequest) | [Vnic](#opi_api-network-cloud-v1alpha1-Vnic) |  |
| CreateInterface | [CreateInterfaceRequest](#opi_api-network-cloud-v1alpha1-CreateInterfaceRequest) | [Interface](#opi_api-network-cloud-v1alpha1-Interface) | interface apis |
| DeleteInterface | [DeleteInterfaceRequest](#opi_api-network-cloud-v1alpha1-DeleteInterfaceRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateInterface | [UpdateInterfaceRequest](#opi_api-network-cloud-v1alpha1-UpdateInterfaceRequest) | [Interface](#opi_api-network-cloud-v1alpha1-Interface) |  |
| ListInterfaces | [ListInterfacesRequest](#opi_api-network-cloud-v1alpha1-ListInterfacesRequest) | [ListInterfacesResponse](#opi_api-network-cloud-v1alpha1-ListInterfacesResponse) |  |
| GetInterface | [GetInterfaceRequest](#opi_api-network-cloud-v1alpha1-GetInterfaceRequest) | [Interface](#opi_api-network-cloud-v1alpha1-Interface) |  |
| CreateRouteTable | [CreateRouteTableRequest](#opi_api-network-cloud-v1alpha1-CreateRouteTableRequest) | [RouteTable](#opi_api-network-cloud-v1alpha1-RouteTable) | routetable apis |
| DeleteRouteTable | [DeleteRouteTableRequest](#opi_api-network-cloud-v1alpha1-DeleteRouteTableRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateRouteTable | [UpdateRouteTableRequest](#opi_api-network-cloud-v1alpha1-UpdateRouteTableRequest) | [RouteTable](#opi_api-network-cloud-v1alpha1-RouteTable) |  |
| ListRouteTables | [ListRouteTablesRequest](#opi_api-network-cloud-v1alpha1-ListRouteTablesRequest) | [ListRouteTablesResponse](#opi_api-network-cloud-v1alpha1-ListRouteTablesResponse) |  |
| GetRouteTable | [GetRouteTableRequest](#opi_api-network-cloud-v1alpha1-GetRouteTableRequest) | [RouteTable](#opi_api-network-cloud-v1alpha1-RouteTable) |  |
| CreateRoute | [CreateRouteRequest](#opi_api-network-cloud-v1alpha1-CreateRouteRequest) | [Route](#opi_api-network-cloud-v1alpha1-Route) | route apis |
| DeleteRoute | [DeleteRouteRequest](#opi_api-network-cloud-v1alpha1-DeleteRouteRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateRoute | [UpdateRouteRequest](#opi_api-network-cloud-v1alpha1-UpdateRouteRequest) | [Route](#opi_api-network-cloud-v1alpha1-Route) |  |
| ListRoutes | [ListRoutesRequest](#opi_api-network-cloud-v1alpha1-ListRoutesRequest) | [ListRoutesResponse](#opi_api-network-cloud-v1alpha1-ListRoutesResponse) |  |
| GetRoute | [GetRouteRequest](#opi_api-network-cloud-v1alpha1-GetRouteRequest) | [Route](#opi_api-network-cloud-v1alpha1-Route) |  |
| CreateUnderlayRoute | [CreateUnderlayRouteRequest](#opi_api-network-cloud-v1alpha1-CreateUnderlayRouteRequest) | [UnderlayRoute](#opi_api-network-cloud-v1alpha1-UnderlayRoute) | underlayroute apis |
| DeleteUnderlayRoute | [DeleteUnderlayRouteRequest](#opi_api-network-cloud-v1alpha1-DeleteUnderlayRouteRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateUnderlayRoute | [UpdateUnderlayRouteRequest](#opi_api-network-cloud-v1alpha1-UpdateUnderlayRouteRequest) | [UnderlayRoute](#opi_api-network-cloud-v1alpha1-UnderlayRoute) |  |
| ListUnderlayRoutes | [ListUnderlayRoutesRequest](#opi_api-network-cloud-v1alpha1-ListUnderlayRoutesRequest) | [ListUnderlayRoutesResponse](#opi_api-network-cloud-v1alpha1-ListUnderlayRoutesResponse) |  |
| GetUnderlayRoute | [GetUnderlayRouteRequest](#opi_api-network-cloud-v1alpha1-GetUnderlayRouteRequest) | [UnderlayRoute](#opi_api-network-cloud-v1alpha1-UnderlayRoute) |  |
| CreateBgp | [CreateBgpRequest](#opi_api-network-cloud-v1alpha1-CreateBgpRequest) | [Bgp](#opi_api-network-cloud-v1alpha1-Bgp) | bgp (optional) apis |
| DeleteBgp | [DeleteBgpRequest](#opi_api-network-cloud-v1alpha1-DeleteBgpRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateBgp | [UpdateBgpRequest](#opi_api-network-cloud-v1alpha1-UpdateBgpRequest) | [Bgp](#opi_api-network-cloud-v1alpha1-Bgp) |  |
| ListBgps | [ListBgpsRequest](#opi_api-network-cloud-v1alpha1-ListBgpsRequest) | [ListBgpsResponse](#opi_api-network-cloud-v1alpha1-ListBgpsResponse) |  |
| GetBgp | [GetBgpRequest](#opi_api-network-cloud-v1alpha1-GetBgpRequest) | [Bgp](#opi_api-network-cloud-v1alpha1-Bgp) |  |
| CreateBGPPeer | [CreateBGPPeerRequest](#opi_api-network-cloud-v1alpha1-CreateBGPPeerRequest) | [BGPPeer](#opi_api-network-cloud-v1alpha1-BGPPeer) | bgppeer (optional) apis |
| DeleteBGPPeer | [DeleteBGPPeerRequest](#opi_api-network-cloud-v1alpha1-DeleteBGPPeerRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateBGPPeer | [UpdateBGPPeerRequest](#opi_api-network-cloud-v1alpha1-UpdateBGPPeerRequest) | [BGPPeer](#opi_api-network-cloud-v1alpha1-BGPPeer) |  |
| ListBGPPeers | [ListBGPPeersRequest](#opi_api-network-cloud-v1alpha1-ListBGPPeersRequest) | [ListBGPPeersResponse](#opi_api-network-cloud-v1alpha1-ListBGPPeersResponse) |  |
| GetBGPPeer | [GetBGPPeerRequest](#opi_api-network-cloud-v1alpha1-GetBGPPeerRequest) | [BGPPeer](#opi_api-network-cloud-v1alpha1-BGPPeer) |  |
| CreateBGPPeerAf | [CreateBGPPeerAfRequest](#opi_api-network-cloud-v1alpha1-CreateBGPPeerAfRequest) | [BGPPeerAf](#opi_api-network-cloud-v1alpha1-BGPPeerAf) | bgppeeraf (optional) apis |
| DeleteBGPPeerAf | [DeleteBGPPeerAfRequest](#opi_api-network-cloud-v1alpha1-DeleteBGPPeerAfRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateBGPPeerAf | [UpdateBGPPeerAfRequest](#opi_api-network-cloud-v1alpha1-UpdateBGPPeerAfRequest) | [BGPPeerAf](#opi_api-network-cloud-v1alpha1-BGPPeerAf) |  |
| ListBGPPeerAfs | [ListBGPPeerAfsRequest](#opi_api-network-cloud-v1alpha1-ListBGPPeerAfsRequest) | [ListBGPPeerAfsResponse](#opi_api-network-cloud-v1alpha1-ListBGPPeerAfsResponse) |  |
| GetBGPPeerAf | [GetBGPPeerAfRequest](#opi_api-network-cloud-v1alpha1-GetBGPPeerAfRequest) | [BGPPeerAf](#opi_api-network-cloud-v1alpha1-BGPPeerAf) |  |
| CreateMapping | [CreateMappingRequest](#opi_api-network-cloud-v1alpha1-CreateMappingRequest) | [Mapping](#opi_api-network-cloud-v1alpha1-Mapping) | mapping apis |
| DeleteMapping | [DeleteMappingRequest](#opi_api-network-cloud-v1alpha1-DeleteMappingRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateMapping | [UpdateMappingRequest](#opi_api-network-cloud-v1alpha1-UpdateMappingRequest) | [Mapping](#opi_api-network-cloud-v1alpha1-Mapping) |  |
| ListMappings | [ListMappingsRequest](#opi_api-network-cloud-v1alpha1-ListMappingsRequest) | [ListMappingsResponse](#opi_api-network-cloud-v1alpha1-ListMappingsResponse) |  |
| GetMapping | [GetMappingRequest](#opi_api-network-cloud-v1alpha1-GetMappingRequest) | [Mapping](#opi_api-network-cloud-v1alpha1-Mapping) |  |
| CreateNextHop | [CreateNextHopRequest](#opi_api-network-cloud-v1alpha1-CreateNextHopRequest) | [NextHop](#opi_api-network-cloud-v1alpha1-NextHop) | nexthop apis |
| DeleteNextHop | [DeleteNextHopRequest](#opi_api-network-cloud-v1alpha1-DeleteNextHopRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateNextHop | [UpdateNextHopRequest](#opi_api-network-cloud-v1alpha1-UpdateNextHopRequest) | [NextHop](#opi_api-network-cloud-v1alpha1-NextHop) |  |
| ListNextHop | [ListNextHopsRequest](#opi_api-network-cloud-v1alpha1-ListNextHopsRequest) | [ListNextHopsResponse](#opi_api-network-cloud-v1alpha1-ListNextHopsResponse) |  |
| GetNextHop | [GetNextHopRequest](#opi_api-network-cloud-v1alpha1-GetNextHopRequest) | [NextHop](#opi_api-network-cloud-v1alpha1-NextHop) |  |
| CreateNextHopGroup | [CreateNextHopGroupRequest](#opi_api-network-cloud-v1alpha1-CreateNextHopGroupRequest) | [NextHopGroup](#opi_api-network-cloud-v1alpha1-NextHopGroup) | nexthopgroup apis |
| DeleteNextHopGroup | [DeleteNextHopGroupRequest](#opi_api-network-cloud-v1alpha1-DeleteNextHopGroupRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateNextHopGroup | [UpdateNextHopGroupRequest](#opi_api-network-cloud-v1alpha1-UpdateNextHopGroupRequest) | [NextHopGroup](#opi_api-network-cloud-v1alpha1-NextHopGroup) |  |
| ListNextHopGroups | [ListNextHopGroupsRequest](#opi_api-network-cloud-v1alpha1-ListNextHopGroupsRequest) | [ListNextHopGroupsResponse](#opi_api-network-cloud-v1alpha1-ListNextHopGroupsResponse) |  |
| GetNextHopGroup | [GetNextHopGroupRequest](#opi_api-network-cloud-v1alpha1-GetNextHopGroupRequest) | [NextHopGroup](#opi_api-network-cloud-v1alpha1-NextHopGroup) |  |
| CreateSubnet | [CreateSubnetRequest](#opi_api-network-cloud-v1alpha1-CreateSubnetRequest) | [Subnet](#opi_api-network-cloud-v1alpha1-Subnet) | subnet apis |
| DeleteSubnet | [DeleteSubnetRequest](#opi_api-network-cloud-v1alpha1-DeleteSubnetRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateSubnet | [UpdateSubnetRequest](#opi_api-network-cloud-v1alpha1-UpdateSubnetRequest) | [Subnet](#opi_api-network-cloud-v1alpha1-Subnet) |  |
| ListSubnets | [ListSubnetsRequest](#opi_api-network-cloud-v1alpha1-ListSubnetsRequest) | [ListSubnetsResponse](#opi_api-network-cloud-v1alpha1-ListSubnetsResponse) |  |
| GetSubnet | [GetSubnetRequest](#opi_api-network-cloud-v1alpha1-GetSubnetRequest) | [Subnet](#opi_api-network-cloud-v1alpha1-Subnet) |  |
| CreateTunnel | [CreateTunnelRequest](#opi_api-network-cloud-v1alpha1-CreateTunnelRequest) | [Tunnel](#opi_api-network-cloud-v1alpha1-Tunnel) | tunnel apis |
| DeleteTunnel | [DeleteTunnelRequest](#opi_api-network-cloud-v1alpha1-DeleteTunnelRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateTunnel | [UpdateTunnelRequest](#opi_api-network-cloud-v1alpha1-UpdateTunnelRequest) | [Tunnel](#opi_api-network-cloud-v1alpha1-Tunnel) |  |
| ListTunnels | [ListTunnelsRequest](#opi_api-network-cloud-v1alpha1-ListTunnelsRequest) | [ListTunnelsResponse](#opi_api-network-cloud-v1alpha1-ListTunnelsResponse) |  |
| GetTunnel | [GetTunnelRequest](#opi_api-network-cloud-v1alpha1-GetTunnelRequest) | [Tunnel](#opi_api-network-cloud-v1alpha1-Tunnel) |  |
| CreateVpc | [CreateVpcRequest](#opi_api-network-cloud-v1alpha1-CreateVpcRequest) | [Vpc](#opi_api-network-cloud-v1alpha1-Vpc) | vpc apis |
| DeleteVpc | [DeleteVpcRequest](#opi_api-network-cloud-v1alpha1-DeleteVpcRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateVpc | [UpdateVpcRequest](#opi_api-network-cloud-v1alpha1-UpdateVpcRequest) | [Vpc](#opi_api-network-cloud-v1alpha1-Vpc) |  |
| ListVpcs | [ListVpcsRequest](#opi_api-network-cloud-v1alpha1-ListVpcsRequest) | [ListVpcsResponse](#opi_api-network-cloud-v1alpha1-ListVpcsResponse) |  |
| GetVpc | [GetVpcRequest](#opi_api-network-cloud-v1alpha1-GetVpcRequest) | [Vpc](#opi_api-network-cloud-v1alpha1-Vpc) |  |
| CreateVPCPeer | [CreateVPCPeerRequest](#opi_api-network-cloud-v1alpha1-CreateVPCPeerRequest) | [VPCPeer](#opi_api-network-cloud-v1alpha1-VPCPeer) | vpcpeer apis |
| DeleteVPCPeer | [DeleteVPCPeerRequest](#opi_api-network-cloud-v1alpha1-DeleteVPCPeerRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateVPCPeer | [UpdateVPCPeerRequest](#opi_api-network-cloud-v1alpha1-UpdateVPCPeerRequest) | [VPCPeer](#opi_api-network-cloud-v1alpha1-VPCPeer) |  |
| ListVPCPeers | [ListVPCPeersRequest](#opi_api-network-cloud-v1alpha1-ListVPCPeersRequest) | [ListVPCPeersResponse](#opi_api-network-cloud-v1alpha1-ListVPCPeersResponse) |  |
| GetVPCPeer | [GetVPCPeerRequest](#opi_api-network-cloud-v1alpha1-GetVPCPeerRequest) | [VPCPeer](#opi_api-network-cloud-v1alpha1-VPCPeer) |  |
| CreateSecurityPolicy | [CreateSecurityPolicyRequest](#opi_api-network-cloud-v1alpha1-CreateSecurityPolicyRequest) | [SecurityPolicy](#opi_api-network-cloud-v1alpha1-SecurityPolicy) | securitypolicy apis |
| DeleteSecurityPolicy | [DeleteSecurityPolicyRequest](#opi_api-network-cloud-v1alpha1-DeleteSecurityPolicyRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateSecurityPolicy | [UpdateSecurityPolicyRequest](#opi_api-network-cloud-v1alpha1-UpdateSecurityPolicyRequest) | [SecurityPolicy](#opi_api-network-cloud-v1alpha1-SecurityPolicy) |  |
| ListSecurityPolicys | [ListSecurityPolicysRequest](#opi_api-network-cloud-v1alpha1-ListSecurityPolicysRequest) | [ListSecurityPolicysResponse](#opi_api-network-cloud-v1alpha1-ListSecurityPolicysResponse) |  |
| GetSecurityPolicy | [GetSecurityPolicyRequest](#opi_api-network-cloud-v1alpha1-GetSecurityPolicyRequest) | [SecurityPolicy](#opi_api-network-cloud-v1alpha1-SecurityPolicy) |  |
| CreateSecurityRule | [CreateSecurityRuleRequest](#opi_api-network-cloud-v1alpha1-CreateSecurityRuleRequest) | [SecurityRule](#opi_api-network-cloud-v1alpha1-SecurityRule) | securityrule apis |
| DeleteSecurityRule | [DeleteSecurityRuleRequest](#opi_api-network-cloud-v1alpha1-DeleteSecurityRuleRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateSecurityRule | [UpdateSecurityRuleRequest](#opi_api-network-cloud-v1alpha1-UpdateSecurityRuleRequest) | [SecurityRule](#opi_api-network-cloud-v1alpha1-SecurityRule) |  |
| ListSecurityRules | [ListSecurityRulesRequest](#opi_api-network-cloud-v1alpha1-ListSecurityRulesRequest) | [ListSecurityRulesResponse](#opi_api-network-cloud-v1alpha1-ListSecurityRulesResponse) |  |
| GetSecurityRule | [GetSecurityRuleRequest](#opi_api-network-cloud-v1alpha1-GetSecurityRuleRequest) | [SecurityRule](#opi_api-network-cloud-v1alpha1-SecurityRule) |  |
| CreateSecurityProfile | [CreateSecurityProfileRequest](#opi_api-network-cloud-v1alpha1-CreateSecurityProfileRequest) | [SecurityProfile](#opi_api-network-cloud-v1alpha1-SecurityProfile) | securityprofile apis |
| DeleteSecurityProfile | [DeleteSecurityProfileRequest](#opi_api-network-cloud-v1alpha1-DeleteSecurityProfileRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateSecurityProfile | [UpdateSecurityProfileRequest](#opi_api-network-cloud-v1alpha1-UpdateSecurityProfileRequest) | [SecurityProfile](#opi_api-network-cloud-v1alpha1-SecurityProfile) |  |
| ListSecurityProfiles | [ListSecurityProfilesRequest](#opi_api-network-cloud-v1alpha1-ListSecurityProfilesRequest) | [ListSecurityProfilesResponse](#opi_api-network-cloud-v1alpha1-ListSecurityProfilesResponse) |  |
| GetSecurityProfile | [GetSecurityProfileRequest](#opi_api-network-cloud-v1alpha1-GetSecurityProfileRequest) | [SecurityProfile](#opi_api-network-cloud-v1alpha1-SecurityProfile) |  |

 



<a name="device-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## device.proto



<a name="opi_api-network-cloud-v1alpha1-Device"></a>

### Device
device level network configuration and status


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| spec | [DeviceSpec](#opi_api-network-cloud-v1alpha1-DeviceSpec) |  | device&#39;s network configuration |
| status | [DeviceStatus](#opi_api-network-cloud-v1alpha1-DeviceStatus) |  | device&#39;s network status |






<a name="opi_api-network-cloud-v1alpha1-DeviceCapabilities"></a>

### DeviceCapabilities
device capabilities indicate the capabilities of software/hardware
as exposed by current firmware of the device. This can help cloud controller
to adapt to the underlying xPU capabilities/feature


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| routing_capabilties | [DeviceCapabilitiesDynamicRouting](#opi_api-network-cloud-v1alpha1-DeviceCapabilitiesDynamicRouting) |  | traffic routing capabilities |
| network_policy_capabilities | [DeviceCapabilitiesNetworkPolicy](#opi_api-network-cloud-v1alpha1-DeviceCapabilitiesNetworkPolicy) |  | network security policy capabilities |






<a name="opi_api-network-cloud-v1alpha1-DeviceCapabilitiesDynamicRouting"></a>

### DeviceCapabilitiesDynamicRouting
device capabilities for dynamic routing


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| underlay_bgp | [bool](#bool) |  | device is capable of doing bgp routing for the underlay |






<a name="opi_api-network-cloud-v1alpha1-DeviceCapabilitiesNetworkPolicy"></a>

### DeviceCapabilitiesNetworkPolicy
device capabilities for network security policies


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| compact_rules | [bool](#bool) |  | compact routes: capability for the datapath to do summarized route lookups vs flat flow lookups (default) |






<a name="opi_api-network-cloud-v1alpha1-DeviceSpec"></a>

### DeviceSpec
device&#39;s network configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | object&#39;s unique identifier |
| ipv4_address | [opi_api.network.opinetcommon.v1alpha1.IPAddress](#opi_api-network-opinetcommon-v1alpha1-IPAddress) |  | underlay ipv4 address for tunnel initiation/termination |
| ipv6_address | [opi_api.network.opinetcommon.v1alpha1.IPAddress](#opi_api-network-opinetcommon-v1alpha1-IPAddress) |  | underlay ipv6 address for tunnel initiation/termination |
| mac_addr | [bytes](#bytes) |  | device&#39;s mac address - for outer ethernet header |
| gateway_ip | [opi_api.network.opinetcommon.v1alpha1.IPAddress](#opi_api-network-opinetcommon-v1alpha1-IPAddress) |  | IP address of the underlay gateway in the underlay |
| pcie_functions | [PCIeFunctionsSpec](#opi_api-network-cloud-v1alpha1-PCIeFunctionsSpec) |  | number and type of pcie functions exposed |
| overlay_routing_enabled | [bool](#bool) |  | ovelay routing |
| systemname | [string](#string) |  | system name is used as named identifier in protocols (e.g. LLDP) |
| mgmt_network_spec | [MgmtNetworkSpec](#opi_api-network-cloud-v1alpha1-MgmtNetworkSpec) |  | management network details |






<a name="opi_api-network-cloud-v1alpha1-DeviceStatus"></a>

### DeviceStatus
device&#39;s network status


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| description | [string](#string) |  | device description |
| system_mac_address | [bytes](#bytes) |  | system MAC address (unique for a device in cluster) |
| vendor_id | [string](#string) |  | vendor identifier |
| chip_type | [string](#string) |  | chip type |
| os_version | [string](#string) |  | OS version |
| pcie_port_count | [int32](#int32) |  | number of PCIe ports |
| port_count | [int32](#int32) |  | Number of uplink ports |
| host_if_count | [int32](#int32) |  | number of host interfaces |
| pipeline | [string](#string) |  | Network DataPath Program Name |
| critical_events | [SystemEvent](#opi_api-network-cloud-v1alpha1-SystemEvent) | repeated | critical network events at device level |
| alerts | [SystemAlert](#opi_api-network-cloud-v1alpha1-SystemAlert) | repeated | active network alerts at device level |






<a name="opi_api-network-cloud-v1alpha1-MgmtNetworkSpec"></a>

### MgmtNetworkSpec
MgmtNetworkSpec captures all the management network related parameters


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| lldp_mgmt_ip | [opi_api.network.opinetcommon.v1alpha1.IPAddress](#opi_api-network-opinetcommon-v1alpha1-IPAddress) |  | LLDPMgmtIP, if configured, will be used to advertise in LLDP&#39;s management address TLV |
| mgmt_ip | [opi_api.network.opinetcommon.v1alpha1.IPAddress](#opi_api-network-opinetcommon-v1alpha1-IPAddress) |  | MgmtIP is the management IP address of the DSC (also for flow log generation) |
| vlan | [int32](#int32) |  | Vlan ID (0-4095) is the management network&#39;s vlan tag (zero = untagged) |
| gateway_ip | [opi_api.network.opinetcommon.v1alpha1.IPAddress](#opi_api-network-opinetcommon-v1alpha1-IPAddress) |  | IP address of the default gateway in the management vlan |
| gateway_mac | [bytes](#bytes) |  | MAC address of the default gateway in the management vlan |






<a name="opi_api-network-cloud-v1alpha1-PCIeFunctionsSpec"></a>

### PCIeFunctionsSpec
PCIe functions to be configured on the device


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| pf_count | [int32](#int32) |  | number of physical functions |
| vf_count | [int32](#int32) |  | number of virtual functions |






<a name="opi_api-network-cloud-v1alpha1-SystemAlert"></a>

### SystemAlert
critical alerts effecting the health of the system


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| alert_time | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  | alert timestamp |
| alert_description | [string](#string) |  | name of the alert |






<a name="opi_api-network-cloud-v1alpha1-SystemEvent"></a>

### SystemEvent
system events happened during device operations


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| event_time | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  | event timestamp |
| event_description | [string](#string) |  | name of the event |





 

 

 

 



<a name="interface-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## interface.proto



<a name="opi_api-network-cloud-v1alpha1-BGPCommunity"></a>

### BGPCommunity
BGP standard community


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| asn | [int32](#int32) |  | first 16-bit of standard community (range:0-65535) |
| community | [int32](#int32) |  | second 16-bit of standard community (range:0-65535) |






<a name="opi_api-network-cloud-v1alpha1-ControlIfSpec"></a>

### ControlIfSpec
Inband control interface configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| prefix | [opi_api.network.opinetcommon.v1alpha1.IPPrefix](#opi_api-network-opinetcommon-v1alpha1-IPPrefix) |  | IP address hosted on the inband control interface |
| mac_address | [bytes](#bytes) |  | mac address of the interface |






<a name="opi_api-network-cloud-v1alpha1-HostIfSpec"></a>

### HostIfSpec
HostIfSpec represents a host visisble device (e.g. eth interface)
Host interfaces are created based on the device configuration (see device.proto)
This object provides cloud provider a control over the host VFs or PFs for various
cloud infrastructure functions (e.g. rate limiting)


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vf | [bool](#bool) |  | VF has vf set to true, otherwise the interface is assumed to be a PF |
| enable_connection_tracking | [bool](#bool) |  | ConnTrackEnable will enable full connection tracking, enabled for new connections |
| mac_address | [bytes](#bytes) |  | DPU will assign a mac address to a PF, user can modify this (effective upon reboot) |
| ifname | [string](#string) |  | interface name (this can be populated from what is obtaine from the driver for easier troublsehooting, or other operations |






<a name="opi_api-network-cloud-v1alpha1-HostIfStatus"></a>

### HostIfStatus
operational status of host interfaces


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| hw_if_idxes | [bytes](#bytes) | repeated | hw ifidx is a range of hw specifc interfaces index values associated with this host interface |
| mac_address | [bytes](#bytes) |  | MAC address of this interface |
| status | [IfStatus](#opi_api-network-cloud-v1alpha1-IfStatus) |  | operational status of this interface |
| ifname | [string](#string) |  | host interface name |






<a name="opi_api-network-cloud-v1alpha1-Interface"></a>

### Interface
interface - ethernet interface (layer2 and layer3 configuration)


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| spec | [InterfaceSpec](#opi_api-network-cloud-v1alpha1-InterfaceSpec) |  | interface configuration |
| status | [InterfaceStatus](#opi_api-network-cloud-v1alpha1-InterfaceStatus) |  | interface status |






<a name="opi_api-network-cloud-v1alpha1-InterfaceSpec"></a>

### InterfaceSpec
InterfaceSpec is used to add or update of an interface


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | interface key |
| ifid | [int32](#int32) |  | interface number is numerical port identifier starting from 1 range [1...max-ports#] |
| admin_status | [IfStatus](#opi_api-network-cloud-v1alpha1-IfStatus) |  | admin state - default up for host facing interfaces (PF/VFs) it will drop the traffic to/from cloud infra |
| uplink_spec | [UplinkSpec](#opi_api-network-cloud-v1alpha1-UplinkSpec) |  | uplink specific configuration |
| uplink_pc_spec | [UplinkPCSpec](#opi_api-network-cloud-v1alpha1-UplinkPCSpec) |  | uplink port-channel configuration |
| l3_if_spec | [L3IfSpec](#opi_api-network-cloud-v1alpha1-L3IfSpec) |  | layer3 interface configuration |
| loopback_if_spec | [LoopbackIfSpec](#opi_api-network-cloud-v1alpha1-LoopbackIfSpec) |  | loopback interface configuration |
| control_if_spec | [ControlIfSpec](#opi_api-network-cloud-v1alpha1-ControlIfSpec) |  | control interface configuration |
| host_if_spec | [HostIfSpec](#opi_api-network-cloud-v1alpha1-HostIfSpec) |  | host facing interface&#39;s configuration |






<a name="opi_api-network-cloud-v1alpha1-InterfaceStatus"></a>

### InterfaceStatus
operational status of an interface, if any


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| if_index | [uint32](#uint32) |  | encoded interface index of this interface (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: interface index is an opaque uint32 value. --) |
| oper_status | [IfStatus](#opi_api-network-cloud-v1alpha1-IfStatus) |  | operational status of the interface |
| uplink_if_status | [UplinkIfStatus](#opi_api-network-cloud-v1alpha1-UplinkIfStatus) |  | uplink specific status |
| loopback_if_status | [LoopbackIfStatus](#opi_api-network-cloud-v1alpha1-LoopbackIfStatus) |  | loopback interface specific status |
| host_if_status | [HostIfStatus](#opi_api-network-cloud-v1alpha1-HostIfStatus) |  | host interface specific status |






<a name="opi_api-network-cloud-v1alpha1-L3IfSpec"></a>

### L3IfSpec
L3 interface configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vpc_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | vpc/vrf this L3 interface belongs to |
| port_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | Physical port of this L3 interface |
| prefix | [opi_api.network.opinetcommon.v1alpha1.IPPrefix](#opi_api-network-opinetcommon-v1alpha1-IPPrefix) | repeated | IP address, prefix of this L3 interface |
| encap | [opi_api.network.opinetcommon.v1alpha1.Encap](#opi_api-network-opinetcommon-v1alpha1-Encap) |  | encap used for packet rewrites if this is a L3 sub interface |
| mac_address | [bytes](#bytes) |  | MAC address of this L3 interface; can be set only once |






<a name="opi_api-network-cloud-v1alpha1-LoopbackIfSpec"></a>

### LoopbackIfSpec
Loopback interface configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| prefix | [opi_api.network.opinetcommon.v1alpha1.IPPrefix](#opi_api-network-opinetcommon-v1alpha1-IPPrefix) |  | IP address hosted on the loopback interface (also DPU&#39;s TEP IP) |
| communities | [BGPCommunity](#opi_api-network-cloud-v1alpha1-BGPCommunity) | repeated | BGP standard community to be attached to the route advertising this loopback TEP IP |






<a name="opi_api-network-cloud-v1alpha1-LoopbackIfStatus"></a>

### LoopbackIfStatus
operational status of loopback interface


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| ifname | [string](#string) |  | loopback interface name in DPU&#39;s OS |






<a name="opi_api-network-cloud-v1alpha1-UplinkIfStatus"></a>

### UplinkIfStatus
operational status of uplink interface


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| hw_if_idx | [int32](#int32) |  | hw specific index associated with this uplink, useful for operations |
| hw_port_number | [int32](#int32) |  | hw port number is hw identifier of the port, usefor for operations |






<a name="opi_api-network-cloud-v1alpha1-UplinkPCSpec"></a>

### UplinkPCSpec
Uplink port-channel configuration; interface type IF_TYPE_UPLINK_PC


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| member_ifids_bitmap | [uint64](#uint64) |  | bitmap of member ifids that make up this the port-channel e.g. if uplink interfaces 1 and 2 part of this port channel this is set to 0x11 (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: bitmap must be uint and not int. --) |
| native_vlanid | [int32](#int32) |  | native vlan-id, untagged rx/tx vlan id |






<a name="opi_api-network-cloud-v1alpha1-UplinkSpec"></a>

### UplinkSpec
Uplink configuration; interface type IF_TYPE_UPLINK


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| port_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | physical port id corresponding to this interface |
| native_vlanid | [int32](#int32) |  | native vlan-id, untagged rx/tx vlan id |





 


<a name="opi_api-network-cloud-v1alpha1-IfStatus"></a>

### IfStatus
IfStatus status reflects the operational status of Interface
(-- api-linter: core::0216::synonyms=disabled
    aip.dev/not-precedent: interface status is up or down, not interface state. --)

| Name | Number | Description |
| ---- | ------ | ----------- |
| IF_STATUS_UNSPECIFIED | 0 | unknown |
| IF_STATUS_UP | 1 | interface is up |
| IF_STATUS_DOWN | 2 | interface is down |



<a name="opi_api-network-cloud-v1alpha1-IfType"></a>

### IfType
types of interfaces

| Name | Number | Description |
| ---- | ------ | ----------- |
| IF_TYPE_UNSPECIFIED | 0 | unspecified |
| IF_TYPE_UPLINK | 1 | uplink interface |
| IF_TYPE_UPLINK_PC | 2 | uplink port-channel interface |
| IF_TYPE_L3 | 3 | L3 interface |
| IF_TYPE_LOOPBACK | 4 | loopback interface |
| IF_TYPE_CONTROL | 5 | inband management/control interface |
| IF_TYPE_HOST | 6 | host visible PF/VF device |


 

 

 



<a name="mapping-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## mapping.proto



<a name="opi_api-network-cloud-v1alpha1-L2MappingKey"></a>

### L2MappingKey
L2MappingKey is the 2nd-ary key of the remote MAC mapping


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| subnet_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | subnet id of this MAC |
| mac_address | [bytes](#bytes) |  | MAC address of this mapping |






<a name="opi_api-network-cloud-v1alpha1-L3MappingKey"></a>

### L3MappingKey
L3MappingKey is the 2nd-ary key of the remote IP mapping


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vpc_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | virtual private cloud of the IP mapping |
| ip_address | [opi_api.network.opinetcommon.v1alpha1.IPAddress](#opi_api-network-opinetcommon-v1alpha1-IPAddress) |  | private/overlay IP of the mapping |






<a name="opi_api-network-cloud-v1alpha1-Mapping"></a>

### Mapping
mapping object


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| spec | [MappingSpec](#opi_api-network-cloud-v1alpha1-MappingSpec) |  | configuration |
| status | [MappingStatus](#opi_api-network-cloud-v1alpha1-MappingStatus) |  | status |






<a name="opi_api-network-cloud-v1alpha1-MappingLookupFilter"></a>

### MappingLookupFilter
Filter criteria for a mapping lookup api


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| local | [bool](#bool) |  | Local is set to true for local mappings or else false |
| key_type | [MappingKeyType](#opi_api-network-cloud-v1alpha1-MappingKeyType) |  | KeyType is used for query based on L3 or L2 without specifically providing exact key (i.e. list all L2/L3 mappings) |
| type | [MappingType](#opi_api-network-cloud-v1alpha1-MappingType) |  | Type is used to specify the type of mapping |
| ip_key | [L3MappingKey](#opi_api-network-cloud-v1alpha1-L3MappingKey) |  | IP mapping key |
| mac_key | [L2MappingKey](#opi_api-network-cloud-v1alpha1-L2MappingKey) |  | MAC mapping key |
| ip_address | [opi_api.network.opinetcommon.v1alpha1.IPAddress](#opi_api-network-opinetcommon-v1alpha1-IPAddress) |  | IP address |
| mac_address | [bytes](#bytes) |  | MAC address |
| vpc_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | VPC id |






<a name="opi_api-network-cloud-v1alpha1-MappingSpec"></a>

### MappingSpec
MappingSpec captures configuration of each mapping
NOTE: Mapping is either on the local host/TEP or remote TEP


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | unique mapping id |
| ip_key | [L3MappingKey](#opi_api-network-cloud-v1alpha1-L3MappingKey) |  | IP mapping key |
| mac_key | [L2MappingKey](#opi_api-network-cloud-v1alpha1-L2MappingKey) |  | MAC mapping key |
| subnet_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | subnet this mapping is in |
| vnic_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | if IP is that of local vnic, corresponding vnic id this is mandatory attribute for local IP mappings |
| tunnel_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | Tunnel ID of the remote TEP for remote mapping this is mandatory attribute for remote MAC/IP mappings for non-ECMP cases |
| nh_group_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | overlay nexthop/TEP group for remote mappings this is mandatory attribute for remote MAC/IP mappings for ECMP cases |
| mac_addr | [bytes](#bytes) |  | overlay MAC address of this mapping |
| encap | [opi_api.network.opinetcommon.v1alpha1.Encap](#opi_api-network-opinetcommon-v1alpha1-Encap) |  | fabric encap information specific to this mapping, if any |
| public_ip | [opi_api.network.opinetcommon.v1alpha1.IPAddress](#opi_api-network-opinetcommon-v1alpha1-IPAddress) |  | public IP, if overlay IP has corresponding public IP |
| tags | [uint32](#uint32) | repeated | tag/label/security group of this IP mapping, these tags/labels/SGs can be used in defining security policy rules range: 1 - 4294967294 (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: the allowed values need it to be uint32. --) |
| type | [MappingType](#opi_api-network-cloud-v1alpha1-MappingType) |  | type of the IP mapping endpoint, default is vpc mapping |






<a name="opi_api-network-cloud-v1alpha1-MappingStatus"></a>

### MappingStatus
operational status of a mapping


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| public_nat_index | [int32](#int32) |  | private to public IP xlation nat index |
| private_nat_index | [int32](#int32) |  | public to private IP xlation nat index |
| tunnel_ip | [opi_api.network.opinetcommon.v1alpha1.IPAddress](#opi_api-network-opinetcommon-v1alpha1-IPAddress) | repeated | tunnel IP address |
| svc_port_map_hw_handle | [opi_api.network.opinetcommon.v1alpha1.HwHandle](#opi_api-network-opinetcommon-v1alpha1-HwHandle) |  | service to backend port mapping hw handle |
| vnf_tunnel_hw_handle | [opi_api.network.opinetcommon.v1alpha1.HwHandle](#opi_api-network-opinetcommon-v1alpha1-HwHandle) |  | VNF tunnel hw handle |
| rewrite_index | [int32](#int32) |  | rewrite index |





 


<a name="opi_api-network-cloud-v1alpha1-MappingKeyType"></a>

### MappingKeyType
mapping key type can be L2 or L3

| Name | Number | Description |
| ---- | ------ | ----------- |
| MAPPING_KEY_TYPE_UNSPECIFIED | 0 | unspecified |
| MAPPING_KEY_TYPE_L2 | 1 | l2 mapping |
| MAPPING_KEY_TYPE_L3 | 2 | l3 mapping |



<a name="opi_api-network-cloud-v1alpha1-MappingType"></a>

### MappingType
MappingType captures the type of the mapping

| Name | Number | Description |
| ---- | ------ | ----------- |
| MAPPING_TYPE_UNSPECIFIED | 0 | unspecified |
| MAPPING_TYPE_VPC | 1 | MAPPING_TYPE_VPC is used for regular VPC endpoints and is the default |
| MAPPING_TYPE_SERVICE | 2 | MAPPING_TYPE_SERVICE is used for mappings that represent service endpoints |
| MAPPING_TYPE_LB_VIP | 3 | MAPPING_TYPE_LB_VIP is used for mappings that represent load balancer service VIP |


 

 

 



<a name="networkpolicy-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## networkpolicy.proto



<a name="opi_api-network-cloud-v1alpha1-ALGSpec"></a>

### ALGSpec
ALC configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| alg_type | [ALGType](#opi_api-network-cloud-v1alpha1-ALGType) |  | ALG to invoke (if set to ALG_TYPE_UNSPECIFIED, no ALG is invoked) |
| idle_timeout | [int32](#int32) |  | IdleTimeout indicates ALG specific session timeout in seconds if IdleTimeout is not set, timeout from SecurityProfile object is applied on both control and data sessions of the ALG |
| ftp_options | [FTPOptions](#opi_api-network-cloud-v1alpha1-FTPOptions) |  | ftp alg options |
| dns_options | [DNSOptions](#opi_api-network-cloud-v1alpha1-DNSOptions) |  | dns alg options |
| msrpc_options | [MSRPCOptions](#opi_api-network-cloud-v1alpha1-MSRPCOptions) |  | msrpc options |
| sunrpc_options | [SunRPCOptions](#opi_api-network-cloud-v1alpha1-SunRPCOptions) |  | sunrpc options |






<a name="opi_api-network-cloud-v1alpha1-DNSOptions"></a>

### DNSOptions
DNS ALG specific options
these options are applicable to DNS request messages only


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| drop_multi_query_messages | [bool](#bool) |  | when DropMultiQueryMessage is set, drop DNS query messages that contain more than one DNS query in same packet |
| drop_large_domain_name_messages | [bool](#bool) |  | when DropLargeDomainNameMessage is set, DNS mwessages containing domain name exceeding 255 bytes are dropped |
| drop_long_label_messages | [bool](#bool) |  | when DropLongLabelMessage is set, DNS messages containing labels exceeding 63 bytes are dropped |
| drop_multi_zone_messages | [bool](#bool) |  | when DropMultiZoneMessagesis set, DNS messages containing more than one zone are dropped |
| response_timeout | [int32](#int32) |  | DNS session will be closed if response is not seen for a DNS query within ResponseTimeout seconds, default 60 |
| max_message_length | [int32](#int32) |  | MaxMessageLength defines the maximum length of the DNS query/response message the ALG will handle range:512-8192,default=512 |






<a name="opi_api-network-cloud-v1alpha1-FTPOptions"></a>

### FTPOptions
FTP ALG specific options


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| allow_ip_mismatch | [bool](#bool) |  | allow FTP data sessions with IP address that is different from control sessions |






<a name="opi_api-network-cloud-v1alpha1-MSRPCOptions"></a>

### MSRPCOptions
MSRPC ALG specific options


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| program_id | [bytes](#bytes) | repeated | RPC program uuids |






<a name="opi_api-network-cloud-v1alpha1-PolicyLookupMatch"></a>

### PolicyLookupMatch
PolicyLookupMatch captures all the policy lookup match conditions


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| source_ip | [opi_api.network.opinetcommon.v1alpha1.IPAddress](#opi_api-network-opinetcommon-v1alpha1-IPAddress) |  | source IP address |
| source_tags | [uint32](#uint32) | repeated | tags corresponding to the source; an implementation may limit the maximum number of tags range:1-4294967294 (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: tags are 32bit values. --) |
| destination_ip | [opi_api.network.opinetcommon.v1alpha1.IPAddress](#opi_api-network-opinetcommon-v1alpha1-IPAddress) |  | destination IP address |
| destination_tags | [uint32](#uint32) | repeated | tags corresponding to the destination; an implementation may limit the maximum number of tags range:1-4294967294 (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: tags are 32bit values. --) |
| protocol | [int32](#int32) |  | IP protocol |
| source_port | [int32](#int32) |  | source port, valid only for TCP and UDP |
| destination_port | [int32](#int32) |  | destination port, valid only for TCP and UDP |
| icmp_type | [int32](#int32) |  | valid only for ICMPv4 and ICMPv6 |
| icmp_code | [int32](#int32) |  | valid only for ICMPv4 and ICMPv6 |






<a name="opi_api-network-cloud-v1alpha1-PolicyLookupResult"></a>

### PolicyLookupResult
PolicyLookupResult captures the results of one security policy lookup


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| rule_hw_handle | [opi_api.network.opinetcommon.v1alpha1.HwHandle](#opi_api-network-opinetcommon-v1alpha1-HwHandle) |  | h/w id of the rule that matched |
| priority | [int32](#int32) |  | priority of the rule that matched |
| action | [opi_api.network.opinetcommon.v1alpha1.SecurityRuleAction](#opi_api-network-opinetcommon-v1alpha1-SecurityRuleAction) |  | action associated with the rule |
| alg_type | [ALGType](#opi_api-network-cloud-v1alpha1-ALGType) |  | ALG associated with the rule, if any |
| terminating | [bool](#bool) |  | terminating is set to true, if this rule is configured as terminating |






<a name="opi_api-network-cloud-v1alpha1-SecurityPolicy"></a>

### SecurityPolicy
security policy object


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| spec | [SecurityPolicySpec](#opi_api-network-cloud-v1alpha1-SecurityPolicySpec) |  | configuration |
| status | [SecurityPolicyStatus](#opi_api-network-cloud-v1alpha1-SecurityPolicyStatus) |  | status |






<a name="opi_api-network-cloud-v1alpha1-SecurityPolicyLookupRequest"></a>

### SecurityPolicyLookupRequest
SecurityPolicyLookup is used to fetch security policy based on various
lookup criteria


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| policy_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | security policy uuid to do the lookup in |
| vnic_lookup_info | [SecurityPolicyLookupRequest.VnicLookupInfo](#opi_api-network-cloud-v1alpha1-SecurityPolicyLookupRequest-VnicLookupInfo) |  | vnic specific policies will be evaluated when vnic info is provided |
| match_fields | [PolicyLookupMatch](#opi_api-network-cloud-v1alpha1-PolicyLookupMatch) |  | packet match fields |






<a name="opi_api-network-cloud-v1alpha1-SecurityPolicyLookupRequest-VnicLookupInfo"></a>

### SecurityPolicyLookupRequest.VnicLookupInfo
given a vnic and policy direction (ingress/egress) and packet fields,
evaluate all the policies and return the results


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vnic_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | vnic uuid |
| policy_direction | [opi_api.network.opinetcommon.v1alpha1.PolicyDir](#opi_api-network-opinetcommon-v1alpha1-PolicyDir) |  | policy evaluation direction |
| address_family | [opi_api.network.opinetcommon.v1alpha1.IpAf](#opi_api-network-opinetcommon-v1alpha1-IpAf) |  | IPv4 or IPv6 policy |






<a name="opi_api-network-cloud-v1alpha1-SecurityPolicySpec"></a>

### SecurityPolicySpec
security policy configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | unique identifier of security policy |
| type | [SecurityPolicyType](#opi_api-network-cloud-v1alpha1-SecurityPolicyType) |  | SecurityPolicyType is either TENANT or UNDERLAY (aka. infra) policy - only one instance of UNDERLAY policy is allowed (or makes sense) - if Type is not specified, policy type defaults to TENANT policy |
| address_family | [opi_api.network.opinetcommon.v1alpha1.IpAf](#opi_api-network-opinetcommon-v1alpha1-IpAf) |  | IPv4 or IPv6 policy |
| stateless | [bool](#bool) |  | when Stateless attribute is set on a policy, the policy is applied for traffic in both directions before deciding the final action of the flow when Stateless is set to false, the policy behavior is same as Network Security Group (NSG) construct whereas if Stateless is set to true, the behavior is same as ACL construct |
| default_security_action | [opi_api.network.opinetcommon.v1alpha1.SecurityRuleAction](#opi_api-network-opinetcommon-v1alpha1-SecurityRuleAction) |  | DefaultFWAction is the action taken by the firewall when security policies are configured on vnic but no rule is hit. Similarly, when NACLs are configured on a subnet and no rule is hit, this action is taken by the firewall. if this attribute is not set, it will inherit from security profile and if that is also not set then default &#34;deny&#34; action is enforced When no policy is configured on subnet and vnic, this knob doesn&#39;t apply and traffic is allowed in that case |
| rules | [SecurityRuleInfo](#opi_api-network-cloud-v1alpha1-SecurityRuleInfo) | repeated | list of security rules |
| rule_format | [PolicyRuleFormat](#opi_api-network-cloud-v1alpha1-PolicyRuleFormat) |  | PolicyRuleFormat indicates whether the policy is set of flattened rules or whether they are aggregated (DPU can be efficient based ont his hint) |






<a name="opi_api-network-cloud-v1alpha1-SecurityPolicyStatus"></a>

### SecurityPolicyStatus
operational status of security policy, if any


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| rule_count | [int32](#int32) |  | no.of unique rules in h/w |
| vpc_count | [int32](#int32) |  | no. of VPCs using the policy |
| subnet_count | [int32](#int32) |  | no. of subnets using the policy |
| vnic_count | [int32](#int32) |  | no. of vnics using the policy |
| hw_pool_handle | [opi_api.network.opinetcommon.v1alpha1.HwHandle](#opi_api-network-opinetcommon-v1alpha1-HwHandle) |  | security policy h/w pool handle, if any |
| hw_handle | [opi_api.network.opinetcommon.v1alpha1.HwHandle](#opi_api-network-opinetcommon-v1alpha1-HwHandle) |  | security-policy h/w handle |
| policy_base_address | [uint64](#uint64) |  | security-policy base address (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: this is the actual 64bit memory address. --) |






<a name="opi_api-network-cloud-v1alpha1-SecurityProfile"></a>

### SecurityProfile
security profile object


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| spec | [SecurityProfileSpec](#opi_api-network-cloud-v1alpha1-SecurityProfileSpec) |  | configuration |
| status | [SecurityProfileStatus](#opi_api-network-cloud-v1alpha1-SecurityProfileStatus) |  | status |






<a name="opi_api-network-cloud-v1alpha1-SecurityProfileSpec"></a>

### SecurityProfileSpec
security profile - defaults for network security behavior
- currently security profile object is global and only a singleton object,
  any attempt to create multiple objects will be treated as an error
- if no object is created, indicated default values will be used
- all timeouts specified in this object are in seconds


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | unique identifier of security profile |
| connection_tracking_enable | [bool](#bool) |  | ConnTrackEn, if set to true, will enable full connection tracking if connection_tracking_enable is modified on the fly, it will take affect only on sessions created thereafter and doesn&#39;t affect existing sessions |
| rule_stats_enable | [bool](#bool) |  | rule_stats_enable, if set to true, will enable per security policy rule statistics feature in the datapath (by default rule stats functionality is turned off and can be enabled on the fly for debugging) |
| default_firewall_action | [opi_api.network.opinetcommon.v1alpha1.SecurityRuleAction](#opi_api-network-opinetcommon-v1alpha1-SecurityRuleAction) |  | default_firewall_action is the action taken by the smartnic when policies are configured on the subnet or vnic, no rule matches and default action for policy is none this will have effect iff policy is attached on either vnic or subnet. if no action is specified in security profile, default action is &#34;deny&#34; |
| tcp_idle_timeout | [int32](#int32) |  | timeouts for established sessions per TCP/UDP/ICMP and other protocols range:1-86400, default=600 |
| udp_idle_timeout | [int32](#int32) |  | range:1-86400, default=120 |
| icmp_idle_timeout | [int32](#int32) |  | range:1-86400, default=15 |
| other_idle_timeout | [int32](#int32) |  | range:1-86400, default=90 |
| tcp_connection_setup_timeout | [int32](#int32) |  | TCP specific timeouts tcp_connection_setup_timeout is the maximum allowed time since first SYN seen to 3-way handshake completion, session gets cleaned up if 3-way handshake is not completed and session moves to ESTABLISHED state by then. range:1-60, default=10 |
| tcp_half_close_timeout | [int32](#int32) |  | tcp_half_close_timeout is the maximum allowed time since first FIN seen to 3/4way close, session gets cleaned up if this timer elapses. range:1-172800, default=120 |
| tcp_close_timeout | [int32](#int32) |  | tcp_close_timeout is wait time since FIN is seen from *both* sides (or RST) before cleaning up the session range:1-300, default=15 |
| tcp_dorp_timeout | [int32](#int32) |  | timeouts applicable to sessions installed with drop action range:1-300, default=90 |
| udp_drop_timeout | [int32](#int32) |  | range:1-172800, default=60 |
| icmp_drop_timeout | [int32](#int32) |  | range:1-300, default=30 |
| other_drop_timeout | [int32](#int32) |  | range:1-300, default=60 |






<a name="opi_api-network-cloud-v1alpha1-SecurityProfileStatus"></a>

### SecurityProfileStatus
operational status of security profile, if any






<a name="opi_api-network-cloud-v1alpha1-SecurityRule"></a>

### SecurityRule
security rule object


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| spec | [SecurityRuleSpec](#opi_api-network-cloud-v1alpha1-SecurityRuleSpec) |  | configuration |
| status | [SecurityRuleStatus](#opi_api-network-cloud-v1alpha1-SecurityRuleStatus) |  | status |






<a name="opi_api-network-cloud-v1alpha1-SecurityRuleAttrs"></a>

### SecurityRuleAttrs
security rule attributes


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| priority | [int32](#int32) |  | priority of this rule (lower the numeric value, higher the priority is) if there are multiple rules with same highest priority that match the packet, the first such matching rule in the policy is picked (i.e., based on the order, first in the list of such matching rules) range:0-65534 |
| match | [opi_api.network.opinetcommon.v1alpha1.RuleMatch](#opi_api-network-opinetcommon-v1alpha1-RuleMatch) |  | rule match criteria |
| action | [opi_api.network.opinetcommon.v1alpha1.SecurityRuleAction](#opi_api-network-opinetcommon-v1alpha1-SecurityRuleAction) |  | action to take when this rule is matched |
| terminating | [bool](#bool) |  | when a rule marked as terminating is picked (based on the priority) as the matching rule from a policy, then the action of such rule will prevail or stick over the matching rules picked from already evaluated policies and the search for other matching rules in policies yet to be evaluated for that packet will stop (i.e., packet hitting terminating rule will pick corresponding action irrespective any other matching rules across all policies) |
| alg_spec | [ALGSpec](#opi_api-network-cloud-v1alpha1-ALGSpec) |  | ALGSpec, if specified contains ALG specific behavior |






<a name="opi_api-network-cloud-v1alpha1-SecurityRuleInfo"></a>

### SecurityRuleInfo
SecurityRuleInfo is a single rule in the security policy


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | rule id needed if incremental rule ADD/DEL/UPD functionality is needed |
| attrs | [SecurityRuleAttrs](#opi_api-network-cloud-v1alpha1-SecurityRuleAttrs) |  | rule attributes |






<a name="opi_api-network-cloud-v1alpha1-SecurityRuleSpec"></a>

### SecurityRuleSpec
security rule configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | unique identifier of security rule |
| security_policy_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | security policy this rule belongs to |
| attrs | [SecurityRuleAttrs](#opi_api-network-cloud-v1alpha1-SecurityRuleAttrs) |  | rule information |






<a name="opi_api-network-cloud-v1alpha1-SecurityRuleStatus"></a>

### SecurityRuleStatus
operational status of the security rule, if any






<a name="opi_api-network-cloud-v1alpha1-SunRPCOptions"></a>

### SunRPCOptions
SunRPC ALG specific options


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| program_id | [bytes](#bytes) | repeated | RPC program identifiers |





 


<a name="opi_api-network-cloud-v1alpha1-ALGType"></a>

### ALGType
ALG specifices with Application Level Gateway (ALG) should be invoked
when a rule match happens. This ALG will also be reported in the flow logs.
Any platform specific limitations may result into errors during configuration

| Name | Number | Description |
| ---- | ------ | ----------- |
| ALG_TYPE_UNSPECIFIED | 0 | unspecified |
| ALG_TYPE_TFTP | 1 | TFTP ALG |
| ALG_TYPE_FTP | 2 | FTP ALG |
| ALG_TYPE_DNS | 3 | DNS ALG |
| ALG_TYPE_SUNRPC | 4 | SUNRPC ALG |
| ALG_TYPE_MSRPC | 5 | MSRPC ALG |
| ALG_TYPE_RTSP | 6 | RTSP ALG |



<a name="opi_api-network-cloud-v1alpha1-PolicyRuleFormat"></a>

### PolicyRuleFormat
PolicyRuleFormat captures what format is used for the rules in a given
SecurityPolicySpec object

| Name | Number | Description |
| ---- | ------ | ----------- |
| POLICY_RULE_FORMAT_UNSPECIFIED | 0 | POLICY_RULE_FORMAT_UNSPECIFIED indicates that user has not set format explicitly, in which case POLICY_RULE_FORMAT_FLATTENED is assumed for an implementation is agnostic to flattened or compressed rules |
| POLICY_RULE_FORMAT_FLATTENED | 1 | POLICY_RULE_FORMAT_FLATTENED is used when xPU expands the user configured rules so that each rule has only single source IP address/prefix/range, destination IP address/prefix/range, source port range, destination port range as match conditions In this format none of the rules must use SrcIPList, DstIPList, PortList, ICMPMatchList attributes, wherever applicable |
| POLICY_RULE_FORMAT_COMPACT | 2 | POLICY_RULE_FORMAT_COMPACT is used when rules contain list of source IP, destination IP, src port range, destination port ranges as match conditions In this format, ALL the rules must use SrcIPList, DstIPList, PortList, ICMPMatchList attributes only, whereever applicable |



<a name="opi_api-network-cloud-v1alpha1-SecurityPolicyType"></a>

### SecurityPolicyType
types of security policies

| Name | Number | Description |
| ---- | ------ | ----------- |
| SECURITY_POLICY_TYPE_UNSPECIFIED | 0 | unspecified |
| SECURITY_POLICY_TYPE_UNDERLAY | 1 | UNDERLAY security policy object is singleton object per DSC |
| SECURITY_POLICY_TYPE_TENANT | 2 | TENANT security policy objects are attached to tenant VPCs |


 

 

 



<a name="nexthop-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## nexthop.proto



<a name="opi_api-network-cloud-v1alpha1-IPNextHopSpec"></a>

### IPNextHopSpec
IP nexthop information


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vpc_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | egress VRF id |
| ip_address | [opi_api.network.opinetcommon.v1alpha1.IPAddress](#opi_api-network-opinetcommon-v1alpha1-IPAddress) |  | nexthop&#39;s IP address |
| vlan | [int32](#int32) |  | egress vlan |
| mac | [bytes](#bytes) |  | mac address |






<a name="opi_api-network-cloud-v1alpha1-NextHop"></a>

### NextHop
nexthop object


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| spec | [NextHopSpec](#opi_api-network-cloud-v1alpha1-NextHopSpec) |  | configuration |
| status | [NextHopStatus](#opi_api-network-cloud-v1alpha1-NextHopStatus) |  | status |






<a name="opi_api-network-cloud-v1alpha1-NextHopGroup"></a>

### NextHopGroup
nexthop group object


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| spec | [NextHopGroupSpec](#opi_api-network-cloud-v1alpha1-NextHopGroupSpec) |  | configuration |
| status | [NextHopGroupStatus](#opi_api-network-cloud-v1alpha1-NextHopGroupStatus) |  | status |






<a name="opi_api-network-cloud-v1alpha1-NextHopGroupLookup"></a>

### NextHopGroupLookup
nexthop group lookup request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| type | [NextHopGroupType](#opi_api-network-cloud-v1alpha1-NextHopGroupType) |  | retrieve based on the group type |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | retreive based on nh id |






<a name="opi_api-network-cloud-v1alpha1-NextHopGroupSpec"></a>

### NextHopGroupSpec
nexthop group specification - a nextgroup consists of bunch of nexthops


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | unique nexthop group id |
| type | [NextHopGroupType](#opi_api-network-cloud-v1alpha1-NextHopGroupType) |  | type of the nexthop |
| members | [NextHopSpec](#opi_api-network-cloud-v1alpha1-NextHopSpec) | repeated | zero or more member nexthops or nexthop groups |






<a name="opi_api-network-cloud-v1alpha1-NextHopGroupStatus"></a>

### NextHopGroupStatus
operational status of nexthop group, if any


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| members | [NextHopStatus](#opi_api-network-cloud-v1alpha1-NextHopStatus) | repeated | nexthop group member status |
| hw_handle | [opi_api.network.opinetcommon.v1alpha1.HwHandle](#opi_api-network-opinetcommon-v1alpha1-HwHandle) |  | nexthop group hw id |






<a name="opi_api-network-cloud-v1alpha1-NextHopLookup"></a>

### NextHopLookup
nexthop get request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| type | [NextHopType](#opi_api-network-cloud-v1alpha1-NextHopType) |  | nexthop type to be retrieved |
| nh_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | nexthop to be retrieved |






<a name="opi_api-network-cloud-v1alpha1-NextHopSpec"></a>

### NextHopSpec
nexthop specification


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | unique nexthop id |
| overlay_nh_info | [OverlayNextHopSpec](#opi_api-network-cloud-v1alpha1-OverlayNextHopSpec) |  | Tunnel/TEP member is used for overlay routing |
| underlay_nh_info | [UnderlayNextHopSpec](#opi_api-network-cloud-v1alpha1-UnderlayNextHopSpec) |  | Underlay nexthop info is used for a resolved underlay IP |
| ip_nh_info | [IPNextHopSpec](#opi_api-network-cloud-v1alpha1-IPNextHopSpec) |  | Indirectly resolve to the next hop of another IP |






<a name="opi_api-network-cloud-v1alpha1-NextHopStatus"></a>

### NextHopStatus
operational status of nexthop, if any


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| hw_handle | [opi_api.network.opinetcommon.v1alpha1.HwHandle](#opi_api-network-opinetcommon-v1alpha1-HwHandle) |  | nexthop hw id |
| underlay_nh_info | [UnderlayNextHopStatus](#opi_api-network-cloud-v1alpha1-UnderlayNextHopStatus) |  | nh is underlay |
| overlay_nh_info | [OverlayNextHopStatus](#opi_api-network-cloud-v1alpha1-OverlayNextHopStatus) |  | nh is overlay |






<a name="opi_api-network-cloud-v1alpha1-OverlayNextHopSpec"></a>

### OverlayNextHopSpec
Overlay nexthop information


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| tunnel_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | tunnel id |






<a name="opi_api-network-cloud-v1alpha1-OverlayNextHopStatus"></a>

### OverlayNextHopStatus
overlay next hop status


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| tunnel_ip | [opi_api.network.opinetcommon.v1alpha1.IPAddress](#opi_api-network-opinetcommon-v1alpha1-IPAddress) |  | tunnel ip |






<a name="opi_api-network-cloud-v1alpha1-UnderlayNextHopSpec"></a>

### UnderlayNextHopSpec
Underlay nexthop information


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| l3_interface_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | L3 interface of this nexthop (outer SMAC, vlan tag and outgoing port are picked from this L3 interface) |
| underlay_nh_mac | [bytes](#bytes) |  | underlay_nh_mac is the outer DMAC in case of VxLAN fabric |






<a name="opi_api-network-cloud-v1alpha1-UnderlayNextHopStatus"></a>

### UnderlayNextHopStatus
underlay next hop status


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| port | [int32](#int32) |  | port |
| vlan | [int32](#int32) |  | vlan |





 


<a name="opi_api-network-cloud-v1alpha1-NextHopGroupType"></a>

### NextHopGroupType
type of the nexthop group

| Name | Number | Description |
| ---- | ------ | ----------- |
| NEXT_HOP_GROUP_TYPE_UNSPECIFIED | 0 | unspecified |
| NEXT_HOP_GROUP_TYPE_OVERLAY_ECMP | 1 | ECMP for overlay routes pointing to VTEPs |
| NEXT_HOP_GROUP_TYPE_UNDERLAY_ECMP | 2 | ECMP for underlay VTEPs pointing to nexthops |



<a name="opi_api-network-cloud-v1alpha1-NextHopType"></a>

### NextHopType
next hop type

| Name | Number | Description |
| ---- | ------ | ----------- |
| NEXT_HOP_TYPE_UNSPECIFIED | 0 | unspecified |
| NEXT_HOP_TYPE_IP | 1 | ip |
| NEXT_HOP_TYPE_UNDERLAY | 2 | underlay |
| NEXT_HOP_TYPE_OVERLAY | 3 | overlay |


 

 

 



<a name="port-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## port.proto



<a name="opi_api-network-cloud-v1alpha1-Port"></a>

### Port
link level configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| spec | [PortSpec](#opi_api-network-cloud-v1alpha1-PortSpec) |  | port configuration |
| status | [PortStatus](#opi_api-network-cloud-v1alpha1-PortStatus) |  | status of port |






<a name="opi_api-network-cloud-v1alpha1-PortLinkFSMRecord"></a>

### PortLinkFSMRecord
port&#39;s link state machine transition record


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| fsm_state | [PortLinkFSM](#opi_api-network-cloud-v1alpha1-PortLinkFSM) |  | internal port link state machine |
| state_time | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  | port state time stamp |
| duration | [string](#string) |  | port state duration |






<a name="opi_api-network-cloud-v1alpha1-PortLinkStatus"></a>

### PortLinkStatus
port link status


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| oper_state | [PortOperState](#opi_api-network-cloud-v1alpha1-PortOperState) |  | operational state of port |
| port_speed | [PortSpeed](#opi_api-network-cloud-v1alpha1-PortSpeed) |  | operational speed of the port |
| autoneg_en | [bool](#bool) |  | operational state of AN |
| lanes_count | [int32](#int32) |  | operational value of NumLanes |
| fec_type | [PortFecType](#opi_api-network-cloud-v1alpha1-PortFecType) |  | operational fec type of port |






<a name="opi_api-network-cloud-v1alpha1-PortSpec"></a>

### PortSpec
port configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | unique port id |
| port_number | [int32](#int32) |  | port number is numerical port identifier starting from 1 |
| admin_state | [PortAdminState](#opi_api-network-cloud-v1alpha1-PortAdminState) |  | port admin state |
| type | [PortType](#opi_api-network-cloud-v1alpha1-PortType) |  | type of port |
| speed | [PortSpeed](#opi_api-network-cloud-v1alpha1-PortSpeed) |  | operational speed of the port |
| fec_type | [PortFecType](#opi_api-network-cloud-v1alpha1-PortFecType) |  | Forward Error Correction (FEC) type - ReedSolomon (RS), Firecode (FC) or None |
| autoneg_enable | [bool](#bool) |  | set AutoNegEn to true to enable auto negotiation |
| debounce_timeout | [int32](#int32) |  | values for link debounce timeout in msec (default = 0 ms) |
| mtu | [int32](#int32) |  | MTU size in bytes (64 to 9216) |
| pause_type | [PortPauseType](#opi_api-network-cloud-v1alpha1-PortPauseType) |  | pause type - PFC or Link Level or Disable |
| tx_pause_en | [bool](#bool) |  | MAC TX pause enable |
| rx_pause_en | [bool](#bool) |  | MAC RX pause enable |
| loopback_mode | [PortLoopBackMode](#opi_api-network-cloud-v1alpha1-PortLoopBackMode) |  | port loopback mode - MAC or PHY |
| lanes_count | [int32](#int32) |  | number of serdes lanes for port (range: 1-4) |






<a name="opi_api-network-cloud-v1alpha1-PortStatus"></a>

### PortStatus
port status


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| if_index | [uint32](#uint32) |  | encoded interface index (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: interface index is an opaque uint32 value. --) |
| link_status | [PortLinkStatus](#opi_api-network-cloud-v1alpha1-PortLinkStatus) |  | operational link status |
| xcvr_status | [PortXcvrStatus](#opi_api-network-cloud-v1alpha1-PortXcvrStatus) |  | transceiver status |
| fsm_state | [PortLinkFSM](#opi_api-network-cloud-v1alpha1-PortLinkFSM) |  | internal port link state machine |
| mac_id | [int32](#int32) |  | mac associated with the port |
| mac_ch | [int32](#int32) |  | mac channel associated with the port |
| fsm_record | [PortLinkFSMRecord](#opi_api-network-cloud-v1alpha1-PortLinkFSMRecord) | repeated | port link state machine record |






<a name="opi_api-network-cloud-v1alpha1-PortXcvrStatus"></a>

### PortXcvrStatus
transciever status


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| port | [int32](#int32) |  | port number |
| state | [PortXcvrState](#opi_api-network-cloud-v1alpha1-PortXcvrState) |  | xcvr state |
| pid | [PortXcvrPid](#opi_api-network-cloud-v1alpha1-PortXcvrPid) |  | xcvr pid |
| media_type | [MediaType](#opi_api-network-cloud-v1alpha1-MediaType) |  | media type |
| xcvr_sprom | [bytes](#bytes) |  | xcvr sprom |
| vendorname | [string](#string) |  | xcvr vendor name |
| vendor_oui | [string](#string) |  | xcvr vendor oui |
| encoding_type | [int32](#int32) |  | encoding type |
| serial_number | [string](#string) |  | xcvr serial number |
| part_number | [string](#string) |  | xcvr part number |
| revision | [string](#string) |  | xcvr firmware revision |
| temperature | [int32](#int32) |  | xcvr temperature |
| warn_temperature | [int32](#int32) |  | xcvr warning tempreture |
| alarm_temperature | [int32](#int32) |  | xcvr alarming tempreture |





 


<a name="opi_api-network-cloud-v1alpha1-MediaType"></a>

### MediaType
port&#39;s media type

| Name | Number | Description |
| ---- | ------ | ----------- |
| MEDIA_TYPE_UNSPECIFIED | 0 | media not connected |
| MEDIA_TYPE_COPPER | 1 | copper cable |
| MEDIA_TYPE_FIBER | 2 | fiber cable |



<a name="opi_api-network-cloud-v1alpha1-PortAdminState"></a>

### PortAdminState
PortAdminState specifies if the port is enabled (admin up) or disabled (admin down)

| Name | Number | Description |
| ---- | ------ | ----------- |
| PORT_ADMIN_STATE_UNSPECIFIED | 0 | port admin state not configured |
| PORT_ADMIN_STATE_DOWN | 1 | port is admin disabled |
| PORT_ADMIN_STATE_UP | 2 | port is admin enabled |



<a name="opi_api-network-cloud-v1alpha1-PortFecType"></a>

### PortFecType
Forward Error Correction

| Name | Number | Description |
| ---- | ------ | ----------- |
| PORT_FEC_TYPE_UNSPECIFIED | 0 | Disable FEC |
| PORT_FEC_TYPE_FC | 1 | FireCode (FC) FEC |
| PORT_FEC_TYPE_RS | 2 | ReedSolomon (RS) FEC |



<a name="opi_api-network-cloud-v1alpha1-PortLinkFSM"></a>

### PortLinkFSM
port link state

| Name | Number | Description |
| ---- | ------ | ----------- |
| PORT_LINK_FSM_UNSPECIFIED | 0 | unspecified1 |
| PORT_LINK_FSM_ENABLED | 1 | enabled |
| PORT_LINK_FSM_AN_CFG | 2 | auto negotiation configured |
| PORT_LINK_FSM_AN_DISABLED | 3 | auto negotiation disabled |
| PORT_LINK_FSM_AN_START | 4 | auto negotiation started |
| PORT_LINK_FSM_AN_SIGNAL_DETECT | 5 | auto negotiation signal detect |
| PORT_LINK_FSM_AN_WAIT_HCD | 6 | auto negotiation wait HCD |
| PORT_LINK_FSM_AN_COMPLETE | 7 | auto negotiation complete |
| PORT_LINK_FSM_SERDES_CFG | 8 | seredes configured |
| PORT_LINK_FSM_WAIT_SERDES_RDY | 9 | serdes ready |
| PORT_LINK_FSM_MAC_CFG | 10 | mac configured |
| PORT_LINK_FSM_SIGNAL_DETECT | 11 | signal detected |
| PORT_LINK_FSM_AN_DFE_TUNING | 12 | auto negotiation dfe tuning |
| PORT_LINK_FSM_DFE_TUNING | 13 | dfe tuning enabled |
| PORT_LINK_FSM_DFE_DISABLED | 14 | dfe disabled |
| PORT_LINK_FSM_DFE_START_ICAL | 15 | dfe start ical |
| PORT_LINK_FSM_DFE_WAIT_ICAL | 16 | dfe wait ical |
| PORT_LINK_FSM_DFE_START_PCAL | 17 | dfe start pcal |
| PORT_LINK_FSM_DFE_WAIT_PCAL | 18 | dfe wait pcal |
| PORT_LINK_FSM_DFE_PCAL_CONTINUOUS | 19 | dfe pcal continuous |
| PORT_LINK_FSM_CLEAR_MAC_REMOTE_FAULTS | 20 | clear mac remote faults |
| PORT_LINK_FSM_WAIT_MAC_SYNC | 21 | wait mac sync |
| PORT_LINK_FSM_WAIT_MAC_FAULTS_CLEAR | 22 | mac faults cleared |
| PORT_LINK_FSM_WAIT_PHY_LINK_UP | 23 | wait phy link up |
| PORT_LINK_FSM_UP | 24 | link up |



<a name="opi_api-network-cloud-v1alpha1-PortLoopBackMode"></a>

### PortLoopBackMode
loop back mode configuration

| Name | Number | Description |
| ---- | ------ | ----------- |
| PORT_LOOP_BACK_MODE_UNSPECIFIED | 0 | No loopback |
| PORT_LOOP_BACK_MODE_MAC | 1 | MAC loopback |
| PORT_LOOP_BACK_MODE_PHY | 2 | PHY/Serdes loopback |



<a name="opi_api-network-cloud-v1alpha1-PortOperState"></a>

### PortOperState
PortOperState reflects the current status of the port

| Name | Number | Description |
| ---- | ------ | ----------- |
| PORT_OPER_STATE_UNSPECIFIED | 0 | unknown |
| PORT_OPER_STATE_UP | 1 | port is linked up |
| PORT_OPER_STATE_DOWN | 2 | port link status is down |



<a name="opi_api-network-cloud-v1alpha1-PortPauseType"></a>

### PortPauseType
port pause type

| Name | Number | Description |
| ---- | ------ | ----------- |
| PORT_PAUSE_TYPE_UNSPECIFIED | 0 | Disable Pause |
| PORT_PAUSE_TYPE_LINK | 1 | Link level pause |
| PORT_PAUSE_TYPE_PFC | 2 | PFC |



<a name="opi_api-network-cloud-v1alpha1-PortSpeed"></a>

### PortSpeed
PortSpeed specifies the speed of the port

| Name | Number | Description |
| ---- | ------ | ----------- |
| PORT_SPEED_UNSPECIFIED | 0 | unconfigured |
| PORT_SPEED_10M | 1 | port speed is 10Mbps |
| PORT_SPEED_100M | 2 | port speed is 100Mbps |
| PORT_SPEED_1G | 3 | port speed is 1Gbps |
| PORT_SPEED_10G | 4 | port speed is 10Gbps |
| PORT_SPEED_25G | 5 | port speed is 25Gbps |
| PORT_SPEED_40G | 6 | port speed is 40Gbps |
| PORT_SPEED_50G | 7 | port speed is 50Gbps |
| PORT_SPEED_100G | 8 | port speed is 100Gbps |
| PORT_SPEED_200G | 9 | port speed is 200Gbps |
| PORT_SPEED_400G | 10 | port speed is 400Gbps |



<a name="opi_api-network-cloud-v1alpha1-PortType"></a>

### PortType
port type - date or management

| Name | Number | Description |
| ---- | ------ | ----------- |
| PORT_TYPE_UNSPECIFIED | 0 | unspecified |
| PORT_TYPE_ETH | 1 | data ethernet |
| PORT_TYPE_ETH_MGMT | 2 | management ethernet |



<a name="opi_api-network-cloud-v1alpha1-PortXcvrPid"></a>

### PortXcvrPid
transciever product id

| Name | Number | Description |
| ---- | ------ | ----------- |
| PORT_XCVR_PID_UNSPECIFIED | 0 | unspecified |
| PORT_XCVR_PID_QSFP_100G_CR4 | 1 | Copper QSFP 100G CR4 |
| PORT_XCVR_PID_QSFP_40GBASE_CR4 | 2 | QSFP 40G CR4 |
| PORT_XCVR_PID_SFP_25GBASE_CR_S | 3 | 25G CR S |
| PORT_XCVR_PID_SFP_25GBASE_CR_L | 4 | 25G CR L |
| PORT_XCVR_PID_SFP_25GBASE_CR_N | 5 | 25G CR N |
| PORT_XCVR_PID_QSFP_50G_CR2_FC | 6 | 50G CR2 FC |
| PORT_XCVR_PID_QSFP_50G_CR2 | 7 | 50G CR2 |
| PORT_XCVR_PID_QSFP_200G_CR4 | 8 | 200G CR4 |
| PORT_XCVR_PID_QSFP_100G_AOC | 50 | Fiber QSFP 100G AOC |
| PORT_XCVR_PID_QSFP_100G_ACC | 51 | QSFP 100G ACC |
| PORT_XCVR_PID_QSFP_100G_SR4 | 52 | QSFP 100G SR4 |
| PORT_XCVR_PID_QSFP_100G_LR4 | 53 | QSFP 100G LR4 |
| PORT_XCVR_PID_QSFP_100G_ER4 | 54 | QSFP 100G ER4 |
| PORT_XCVR_PID_QSFP_40GBASE_ER4 | 55 | QSFP 40G ER4 |
| PORT_XCVR_PID_QSFP_40GBASE_SR4 | 56 | QSFP 40G SR4 |
| PORT_XCVR_PID_QSFP_40GBASE_LR4 | 57 | QSFP 40G LR4 |
| PORT_XCVR_PID_QSFP_40GBASE_AOC | 58 | QSFP 40G AOC |
| PORT_XCVR_PID_SFP_25GBASE_SR | 59 | SFP 25G SR |
| PORT_XCVR_PID_SFP_25GBASE_LR | 60 | SFP 25G LR |
| PORT_XCVR_PID_SFP_25GBASE_ER | 61 | SFP 25G ER |
| PORT_XCVR_PID_SFP_25GBASE_AOC | 62 | SFP 25G AOC |
| PORT_XCVR_PID_SFP_10GBASE_SR | 63 | SFP 10G SR |
| PORT_XCVR_PID_SFP_10GBASE_LR | 64 | SFP 10G LR |
| PORT_XCVR_PID_SFP_10GBASE_LRM | 65 | SFP 10G LRM |
| PORT_XCVR_PID_SFP_10GBASE_ER | 66 | SFP 10G ER |
| PORT_XCVR_PID_SFP_10GBASE_AOC | 67 | SFP 10G AOC |
| PORT_XCVR_PID_SFP_10GBASE_CU | 68 | SFP 10G CU |
| PORT_XCVR_PID_QSFP_100G_CWDM4 | 69 | QSFP 100G CXWDM4 |
| PORT_XCVR_PID_QSFP_100G_PSM4 | 70 | QSFP 100G PSM4 |
| PORT_XCVR_PID_SFP_25GBASE_ACC | 71 | SFP 125G ACC |
| PORT_XCVR_PID_SFP_10GBASE_T | 72 | SFP 10G BASE T |
| PORT_XCVR_PID_SFP_1000BASE_T | 73 | SFP 100G BASE T |



<a name="opi_api-network-cloud-v1alpha1-PortXcvrState"></a>

### PortXcvrState
port&#39;s transceiver state

| Name | Number | Description |
| ---- | ------ | ----------- |
| PORT_XCVR_STATE_UNSPECIFIED | 0 | state - removed |
| PORT_XCVR_STATE_INSERTED | 1 | state - inserted |
| PORT_XCVR_STATE_PENDING | 2 | state - pending |
| PORT_XCVR_STATE_SPROM_READ | 3 | state - sprom read |
| PORT_XCVR_STATE_SPROM_READ_ERR | 4 | state - sprom read error |


 

 

 



<a name="route-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## route.proto



<a name="opi_api-network-cloud-v1alpha1-OverlayNextHopIPInfo"></a>

### OverlayNextHopIPInfo
OverlayNextHopIPInfo captures list of overlay IP destinations for a given
route. Overlay destination could be the destinaton TEP or a service node
- when more than one overlay nexthop IP is configured, one of them is
  picked based on the flow hash
- when more than one overlay nexthop IP is configured, IPv4 is considered
- if VPCId is not set, the lookups will continue in the current VPC


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nexthop_ip | [opi_api.network.opinetcommon.v1alpha1.IPAddress](#opi_api-network-opinetcommon-v1alpha1-IPAddress) | repeated | overlay nexthop IP list |
| nexthop_mac | [bytes](#bytes) | repeated | overlay MAC (DMAC inner) to be used when corresponding to the overlay nexthop IP picked |
| vpc_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | if next hop IP (e.g. a mapping entry) is in another/peer VPC, vpc_id is set |






<a name="opi_api-network-cloud-v1alpha1-Route"></a>

### Route
route object


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| spec | [RouteSpec](#opi_api-network-cloud-v1alpha1-RouteSpec) |  | route configuration |
| status | [RouteStatus](#opi_api-network-cloud-v1alpha1-RouteStatus) |  | route status |






<a name="opi_api-network-cloud-v1alpha1-RouteAttrs"></a>

### RouteAttrs
route attributes

Routes types: static route, internet route, service routes, etc.
Priority of a route allows the cloud controller to manage the routes
based on arbitrary algorithm (vs longest prefix match)
Route class priority can be used to order the lookup of certain class
of routes. If priority is same (or not specified for any routes),
then the lookup is done according to the longest prefix match.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| prefix | [opi_api.network.opinetcommon.v1alpha1.IPPrefix](#opi_api-network-opinetcommon-v1alpha1-IPPrefix) |  | IP prefix |
| route_class | [RouteClass](#opi_api-network-cloud-v1alpha1-RouteClass) |  | class of the route |
| class_priority | [int32](#int32) |  | priority of the route class this route belongs to (range: 0-15) route table must have set priority_enable to true for this to take effect |
| priority | [int32](#int32) |  | priority of the route within the class. Priority behavior: - lower the numerical value, higher the priority in the datapath - a route table MUST have either all the routes with priority set or no priority set on all the routes - if multiple routes have same priority, route with longest prefix length will take effect - if no priority value is set (i.e. 0) then route priority is computed as 128 - &lt;prefix length&gt;, so longer prefixes will have higher precedence over shorter ones giving regular LPM semantics - Priority attribute on the route is used only when PriorityEn is set to true on the corresponding routing table - range:0-1023 |
| overlay_nh_ip_info | [OverlayNextHopIPInfo](#opi_api-network-cloud-v1alpha1-OverlayNextHopIPInfo) |  | overlay IP nexthop information for this route |
| nexthop_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | nexthop for this route |
| nh_group_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | ECMP nexthop for this route |
| vpc_nh_info | [VPCPeerNhInfo](#opi_api-network-cloud-v1alpha1-VPCPeerNhInfo) |  | peer&#39;s VPC nexthop info, in case of VPC peering |
| tunnel_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | Tunnel this prefix is pointing to |
| route_table_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | if next hop is a route table: used to create exceptions in hierarchal routing. next hop can&#39;t point to same route table (causing rout lookup loop) |
| eval_mapping | [bool](#bool) |  | EvalMapping is set in cases where mapping lookup result will provided the forwarding information, this is useful to punch holes in some routes that encompass sub-prefixes that require different forwarding behavior e.g. 10.1.0.0/16 -&gt; Tunnel-X 10.1.1.0/24 -&gt; EvalMapping |
| tos | [int32](#int32) |  | the ToS value (range: 0-255) configured on the route will override ToS configuration in vpc, subnet and tunnel objects |
| encap | [opi_api.network.opinetcommon.v1alpha1.Encap](#opi_api-network-opinetcommon-v1alpha1-Encap) |  | override encap for this route (from what is programmed for a subnet or a vpc) |
| overlay_mac | [bytes](#bytes) |  | when a custom overlay MAC is provided in the route configuration, the MAC address is used as inner DMAC in the (VxLAN) encapped packet |






<a name="opi_api-network-cloud-v1alpha1-RouteId"></a>

### RouteId
route identifier


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | unique route id (this id is not scoped under VPC or subnet) |
| route_table_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | route table this route belongs to |






<a name="opi_api-network-cloud-v1alpha1-RouteInfo"></a>

### RouteInfo
route configuration information


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | unique id of this specific route (used for specific route update) |
| attrs | [RouteAttrs](#opi_api-network-cloud-v1alpha1-RouteAttrs) |  | route attributes |






<a name="opi_api-network-cloud-v1alpha1-RouteSpec"></a>

### RouteSpec
route specification


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | globally unique route table id |
| route_table_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | route table this route belongs to |
| attrs | [RouteAttrs](#opi_api-network-cloud-v1alpha1-RouteAttrs) |  | route configuration |






<a name="opi_api-network-cloud-v1alpha1-RouteStatus"></a>

### RouteStatus
operational status of the route, if any






<a name="opi_api-network-cloud-v1alpha1-RouteTable"></a>

### RouteTable
route table object


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| spec | [RouteTableSpec](#opi_api-network-cloud-v1alpha1-RouteTableSpec) |  | route table configuration |
| status | [RouteTableStatus](#opi_api-network-cloud-v1alpha1-RouteTableStatus) |  | route table status |






<a name="opi_api-network-cloud-v1alpha1-RouteTableSpec"></a>

### RouteTableSpec
Route table - a prioritized list of static routes/prefixes used for
forwarding traffic within a VPC, across VPCs or to the outside world
Individual routes within the route table can be updated using Route object


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | globally unique route table id |
| af | [opi_api.network.opinetcommon.v1alpha1.IpAf](#opi_api-network-opinetcommon-v1alpha1-IpAf) |  | IP address family |
| priority_enable | [bool](#bool) |  | enable or disable priority based routing for the route table |
| routes | [RouteInfo](#opi_api-network-cloud-v1alpha1-RouteInfo) | repeated | all routes in this route table In a given route table, same prefix must not appear more than once. For multipathing, use nexthop group instead |






<a name="opi_api-network-cloud-v1alpha1-RouteTableStatus"></a>

### RouteTableStatus
operational status of the route table, if any


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vpc_count | [int32](#int32) |  | no. of VPCs using the route table |
| subnet_count | [int32](#int32) |  | no. of subnets using the route table |
| vnic_count | [int32](#int32) |  | no. of vnics using the route table |
| pool_id | [int32](#int32) |  | route table pool |
| hw_idx | [int32](#int32) |  | route table h/w index |
| route_table_base_address | [uint64](#uint64) |  | route table base memory address (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: this is the actual 64bit memory address. --) |
| hw_lpm_block_idx | [int32](#int32) |  | LPM memory block id |
| hw_lpm_rewrite_block_idx | [int32](#int32) |  | LPM info block id that contains rewrites |






<a name="opi_api-network-cloud-v1alpha1-VPCPeerNhInfo"></a>

### VPCPeerNhInfo
Inter VPC routing: if a route in a route table points to VPCPeerNhInfo
that contains peer VPC&#39;s uuid and the route table, to launch a
lookup in the route table.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vpc_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | peer VPC&#39;s id |
| route_table_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | route table id in the peer VPC |





 


<a name="opi_api-network-cloud-v1alpha1-RouteClass"></a>

### RouteClass
RouteClass captures different types/classes of routes

| Name | Number | Description |
| ---- | ------ | ----------- |
| ROUTE_CLASS_UNSPECIFIED | 0 | unspecified |
| ROUTE_CLASS_INTERNET | 1 | route pointing to Internet |
| ROUTE_CLASS_SERVICE | 2 | route used for internal/shared services |
| ROUTE_CLASS_VPC | 3 | VPC internal routes |


 

 

 



<a name="subnet-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## subnet.proto



<a name="opi_api-network-cloud-v1alpha1-Subnet"></a>

### Subnet
subnet object


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| spec | [SubnetSpec](#opi_api-network-cloud-v1alpha1-SubnetSpec) |  | configuration |
| status | [SubnetStatus](#opi_api-network-cloud-v1alpha1-SubnetStatus) |  | status |






<a name="opi_api-network-cloud-v1alpha1-SubnetSpec"></a>

### SubnetSpec
SubnetSpec captures subnet specific configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | unique identifier of the subnet |
| vpc_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | virtual private cloud this subnet is belongs to |
| v4_prefix | [opi_api.network.opinetcommon.v1alpha1.IPv4Prefix](#opi_api-network-opinetcommon-v1alpha1-IPv4Prefix) |  | IPv4 prefix of this subnet, this must be a sub prefix of VPC&#39;s prefix |
| v6_prefix | [opi_api.network.opinetcommon.v1alpha1.IPv6Prefix](#opi_api-network-opinetcommon-v1alpha1-IPv6Prefix) |  | IPv6 prefix of this subnet, this must be a sub prefix of VPC&#39;s prefix |
| ipv4_virtual_router_ip | [uint32](#uint32) |  | IPv4 Virtual Router (VR) IP of this subnet, this IP is owned by the device and packets originated by this device carry this IP as source IP (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: ipv4 address is unsigned. --) |
| ipv6_virtual_router_ip | [bytes](#bytes) |  | Ipv6 Virtual Router (VR) IP of this subnet, this IP is owned by the device and packets originated by this device carry this IP as source IP |
| virtual_router_mac | [bytes](#bytes) |  | Virtual Router (VR) MAC address, any packets originated or routed by the device carry this MAC as source MAC |
| v4_route_table_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | identifier of the IPv4 route table to be used |
| v6_router_table_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | identifier of the IPv6 route table to be used, if any |
| ingess_v4_security_policy_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) | repeated | security policies per subnet: - all vnics in this subnet will inherit the policies configured under subnet - multiple policies per vnic per direction (ingress/egress) can be specified - an implementation may limit the #policies per subnet in each direction identifier of ingress IPv4 security policy to be enforced |
| ingress_v6_security_policy_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) | repeated | identifier of ingress IPv6 security policy to be enforced |
| egress_v4_security_policy_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) | repeated | identifier of egress IPv4 security policy to be enforced |
| egress_v6_security_policy_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) | repeated | identifier of egress IPv6 security policy to be enforced |
| access_encap | [opi_api.network.opinetcommon.v1alpha1.Encap](#opi_api-network-opinetcommon-v1alpha1-Encap) |  | AccessEncap is either ENCAP_TYPE_NONE (untagged) or ENCAP_TYPE_DOT1Q and when AccessEncap is ENCAP_TYPE_DOT1Q, multiple vnics can send traffic with same DOT1Q tag, in which case vnics are identified with their MAC or IP based on the datapath in addition to the DOT1Q tag - when subnet&#39;s AccessEncap is ENCAP_TYPE_NONE, vnics can also be identified by the encap of their own (e.g. VLAN as VNIC or QinQ as VNIC etc.) - when subnet&#39;s AccessEncap is ENCAP_TYPE_DOT1Q, it is expected that all traffic from vnics in that subnet is transmitted with this encap (so vnics can be configured with VnicEncap as ENCAP_TYPE_NONE, so they inherit the subnet&#39;s encap) - it is also possible to have subnet encap as ENCAP_TYPE_DOT1Q with certain tag value but some vnic&#39;s in that subnet to have different DOT1Q encap than that of subnet |
| fabric_encap | [opi_api.network.opinetcommon.v1alpha1.Encap](#opi_api-network-opinetcommon-v1alpha1-Encap) |  | encapped traffic coming with the specified encap from fabric side will be mapped to this subnet and traffic from workloads in this subnet will carry this encap towards the fabric side |
| host_interface_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) | repeated | when operating in DEVICE_OPER_MODE_HOST mode with multiple host PFs/VFs present, subnet needs to be attached to a PF/VF (aka. host interface), HostIf is list of such VF/PFs |
| tos | [int32](#int32) |  | ToS field is 1 byte value that is populated in the DSCP field of IPv4 outer header or in the Traffic Class field of IPv6 outer header, this value, if non-zero, will be used as-is (i.e., not interpreted) during encap time by the dataplane; tunnel objects, if configured with ToS, will override this |
| connected | [bool](#bool) |  | a subnet is marked connected if vnics in this subnet can communicate with external endpoints via routes with some kind of NAT (e.g. 1:1 NAT, NAPT) |
| ingress_default_sg_policy | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | default ingress stateful security policy for this subnet if configured, is the 1st policy evaluated before other security policies on a given vnic |
| egress_default_sg_policy | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | default egress stateful security policy for this subnet if configured, is the 1st policy evaluated before other security polices on a given vnic |
| remote_subnet | [bool](#bool) |  | remote_subnet, if set, indicates that the subnet does not have any IP mappings in local pod and such subnets are used to program all remote pod IP mappings behind it |






<a name="opi_api-network-cloud-v1alpha1-SubnetStatus"></a>

### SubnetStatus
operational status of the subnet, if any


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| hw_index | [int32](#int32) |  | subnet&#39;s hw handle |
| vnic_count | [int32](#int32) |  | number of vnics in the subnet |





 

 

 

 



<a name="tunnel-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## tunnel.proto



<a name="opi_api-network-cloud-v1alpha1-DropNexthop"></a>

### DropNexthop
DropNexthop is used to blackhole the traffic






<a name="opi_api-network-cloud-v1alpha1-Tunnel"></a>

### Tunnel
tunnel object


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| spec | [TunnelSpec](#opi_api-network-cloud-v1alpha1-TunnelSpec) |  | configuration |
| status | [TunnelStatus](#opi_api-network-cloud-v1alpha1-TunnelStatus) |  | operational status |






<a name="opi_api-network-cloud-v1alpha1-TunnelSpec"></a>

### TunnelSpec
tunnel configuration - identified by 3-tuple (LocalIP, RemoteIP, encap)
If multiple tunnels with same RemoteIP address are created, they should
have same Type attribute value i.e., different tunnels with same IP can&#39;t
have different tunnel type


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | unique tunnel identifier |
| vpc_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | virtual private cloud this is tunnel belongs to |
| local_ip | [opi_api.network.opinetcommon.v1alpha1.IPAddress](#opi_api-network-opinetcommon-v1alpha1-IPAddress) |  | local IP of the tunnel (used as outer SIP in tunneled packets) |
| remote_ip | [opi_api.network.opinetcommon.v1alpha1.IPAddress](#opi_api-network-opinetcommon-v1alpha1-IPAddress) |  | remote IP of the tunnel (used as outer DIP in tunneled packets) |
| type | [TunnelType](#opi_api-network-cloud-v1alpha1-TunnelType) |  | type of the tunnel |
| encap | [opi_api.network.opinetcommon.v1alpha1.Encap](#opi_api-network-opinetcommon-v1alpha1-Encap) |  | encap used while sending traffic to this tunnel |
| nexthop_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | underlay nexthop for this tunnel |
| nexthop_group_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | underlay nexthop group for this tunnel |
| tunnel_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | a tunnel can point to another tunnel for double encap - supported combinations of double encap is platform specific - unsupported combination of cascading tunnels would result in configuration failure - when tunnel points to another IPSEC tunnel, it is similar to IPSEC tunnel mode |
| drop_next_hop | [DropNexthop](#opi_api-network-cloud-v1alpha1-DropNexthop) |  | DropNexthop is used to explicitly drop traffic destined to this tunnel even when there is reachability, this is administrative override |
| mac_address | [bytes](#bytes) |  | MAC address of the remote IP (i.e., remote side of the tunnel) set to zero if dataplane is expected to resolve this |
| tos | [int32](#int32) |  | when ToS is configured on a tunnel object, all traffic destined to the tunnel will carry dscp value as configured. ToS field is 1 byte value that is populated in the DSCP field of IPv4 outer header or in the Traffic Class field of IPv6 outer header, this value, if non-zero, will be used as-is (i.e., not interpreted) during encap time by the dataplane. The ToS value configured on the tunnel will override ToS configuration in vpc and subnet objects |






<a name="opi_api-network-cloud-v1alpha1-TunnelStatus"></a>

### TunnelStatus
operational status of the tunnel, if any


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| hw_handle | [opi_api.network.opinetcommon.v1alpha1.HwHandle](#opi_api-network-opinetcommon-v1alpha1-HwHandle) |  | tunnel_hw_handle |
| vnic_count | [int32](#int32) |  | no. of vnics behind the tunnel |





 


<a name="opi_api-network-cloud-v1alpha1-TunnelType"></a>

### TunnelType
TunnelType defines the role of the tunnel

| Name | Number | Description |
| ---- | ------ | ----------- |
| TUNNEL_TYPE_UNSPECIFIED | 0 | unspecified |
| TUNNEL_TYPE_IGW | 1 | tunnel type for Internet Gateway |
| TUNNEL_TYPE_WORKLOAD | 2 | tunnel type for east-traffic workloads with in a data center |
| TUNNEL_TYPE_INTER_DC | 3 | tunnel type for inter data center traffic |
| TUNNEL_TYPE_SERVICE | 4 | tunnel type for provider services |
| TUNNEL_TYPE_VNF | 5 | tunnel pointing to an intermediate Virtual Network Function (VNF) devices |
| TUNNEL_TYPE_IPSEC | 6 | tunnel type ipsec |


 

 

 



<a name="underlayroute-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## underlayroute.proto



<a name="opi_api-network-cloud-v1alpha1-UnderlayRoute"></a>

### UnderlayRoute
Underlay Route can be static or dynamic underlay route


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| spec | [UnderlayRouteSpec](#opi_api-network-cloud-v1alpha1-UnderlayRouteSpec) |  | Underlayroute configuration (can specify fields to query route for get operations) |
| status | [UnderlayRouteStatus](#opi_api-network-cloud-v1alpha1-UnderlayRouteStatus) |  | UnderlayRoute status |






<a name="opi_api-network-cloud-v1alpha1-UnderlayRouteLookupKey"></a>

### UnderlayRouteLookupKey
UnderlayRouteLookupKey can be used to query one or more routes based on various fields


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| route_table_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | route table id this route belongs to |
| dest_prefix | [opi_api.network.opinetcommon.v1alpha1.IPPrefix](#opi_api-network-opinetcommon-v1alpha1-IPPrefix) |  | destination address |
| next_hop_address | [opi_api.network.opinetcommon.v1alpha1.IPAddress](#opi_api-network-opinetcommon-v1alpha1-IPAddress) |  | next-hop address |
| ifid | [int32](#int32) |  | interface index, if the next-hop is an interface |
| proto | [opi_api.network.opinetcommon.v1alpha1.RouteProtocol](#opi_api-network-opinetcommon-v1alpha1-RouteProtocol) |  | protocol via which the route is learned |






<a name="opi_api-network-cloud-v1alpha1-UnderlayRouteSpec"></a>

### UnderlayRouteSpec
control plane static route configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | route&#39;s unique id |
| route_table_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | route table id this route belongs to |
| dest_prefix | [opi_api.network.opinetcommon.v1alpha1.IPPrefix](#opi_api-network-opinetcommon-v1alpha1-IPPrefix) |  | destination address |
| next_hop_address | [opi_api.network.opinetcommon.v1alpha1.IPAddress](#opi_api-network-opinetcommon-v1alpha1-IPAddress) |  | next-hop address |
| state | [opi_api.network.opinetcommon.v1alpha1.AdminState](#opi_api-network-opinetcommon-v1alpha1-AdminState) |  | route is enabled or not |
| enable_admin_distance | [bool](#bool) |  | enable/disable admin distance |
| admin_dist | [int32](#int32) |  | admin distance set for a static route vs. what a routing protocol computes it for the dynamic route. |
| interface_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | interface ID, if this route is configured on RR |






<a name="opi_api-network-cloud-v1alpha1-UnderlayRouteStatus"></a>

### UnderlayRouteStatus
Underlay Route status for a control plane static or dynamic route


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| route_table_id | [int32](#int32) |  | route table id this route belongs to |
| dest_prefix | [opi_api.network.opinetcommon.v1alpha1.IPPrefix](#opi_api-network-opinetcommon-v1alpha1-IPPrefix) |  | destination address |
| next_hop_address | [opi_api.network.opinetcommon.v1alpha1.IPAddress](#opi_api-network-opinetcommon-v1alpha1-IPAddress) |  | next-hop address |
| if_index | [int32](#int32) |  | interface index, if the next-hop is an interface |
| type | [opi_api.network.opinetcommon.v1alpha1.RouteType](#opi_api-network-opinetcommon-v1alpha1-RouteType) |  | type of route |
| proto | [opi_api.network.opinetcommon.v1alpha1.RouteProtocol](#opi_api-network-opinetcommon-v1alpha1-RouteProtocol) |  | protocol via which the route is learned |
| age | [int32](#int32) |  | The number of seconds since this route was last updated or otherwise determined to be correct. |
| metric | [int32](#int32) |  | The primary routing metric for this route |
| fib_route | [bool](#bool) |  | Is this route programmed either to a forwarding table, or to a partner that queries route information |
| connected | [bool](#bool) |  | Indicates whether the route destination is directly connected |
| admin_distance | [int32](#int32) |  | Administrative distance for this route |





 

 

 

 



<a name="vnic-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## vnic.proto



<a name="opi_api-network-cloud-v1alpha1-Vnic"></a>

### Vnic
vnic is a generic abstraction representing tenant workload&#39;s interface
tenant workload could be a VM, container or bare-metal.  VNIC is identified
using various mechanisms to ensure it can be abstractly represented on the DPU.
VNIC represents a different abstraction from that of a port or interface object


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| spec | [VnicSpec](#opi_api-network-cloud-v1alpha1-VnicSpec) |  | vnic configuration |
| status | [VnicStatus](#opi_api-network-cloud-v1alpha1-VnicStatus) |  | vnic status |






<a name="opi_api-network-cloud-v1alpha1-VnicSpec"></a>

### VnicSpec
vnic configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | unique vnic id |
| subnet_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | id of the subnet this vnic belongs to |
| vnic_encap | [opi_api.network.opinetcommon.v1alpha1.Encap](#opi_api-network-opinetcommon-v1alpha1-Encap) |  | vnic encap information to be used while sending packets to this vnic |
| mac_address | [bytes](#bytes) |  | overlay MAC of this VNIC |
| source_guard_enable | [bool](#bool) |  | enable or disable reverse path checks while rx/tx traffic from/to this vnic |
| fabric_encap | [opi_api.network.opinetcommon.v1alpha1.Encap](#opi_api-network-opinetcommon-v1alpha1-Encap) |  | fabric encap information to be used for traffic originated from this vnic |
| vnf | [bool](#bool) |  | VNFs (virtual network functions are workloads that implement network features such as firewalls, virtual switches/bridges, security monitoring, etc. since VNFs are devices in the middle, they can rx/tx traffic on behalf of other workloads to allow for source/destination checks, and exceptions that of a mapping |
| ingress_v4_security_policy_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) | repeated | identifier of ingress IPv4 security policy to be enforced |
| ingress_v6_security_policy_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) | repeated | identifier of ingress IPv6 security policy to be enforced |
| egress_v4_security_policy_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) | repeated | identifier of egress IPv4 security policy to be enforced |
| egress_v6_security_policy_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) | repeated | identifier of egress IPv6 security policy to be enforced |
| host_if_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | if VNIC Is attahced to a PF/VF, this identifies the corresponding interface object |
| tunnel_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | when operating in DEVICE_OPER_MODE_SMART_SWITCH, vnic can be behind a tunnel between the host and the DSC |
| max_sessions | [int32](#int32) |  | max_sessions, if set, is total number of active sessions (across all protocols) allowed from/to this vnic; zero means unlimited |
| public_mac_address | [bytes](#bytes) |  | guest workload&#39;s MAC in rx/tx direction is rewritten with this mac if non zero |
| allow_internet_access | [bool](#bool) |  | if allow_internet_access is set to false and traffic from the vnic hits a route of class ROUTE_CLASS_INTERNET, then traffic is dropped. To allow Internet connectivity for the vnic, AllowInternetAccess must be set to true |
| max_cps | [int32](#int32) |  | max_cps, if non-zero, is the maximum no. of connections per second (cps) allowed for this vnic and if cps exceeds this configured limit all new connections will get dropped; zero means unlimited |
| cps_burst | [int32](#int32) |  | CPS burst to be absorbed when CPS exceeds MaxCPS; zero means no burst is allowed |
| primary_vnic_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | multiple vnics can be created with same MAC but only of them can be primary VNIC and all 2nd-ary vnics refer to the primary vnic, both primary and secondary vnic can have one or more local IP mappings behind them |
| v4_route_table_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | identifier of the IPv4 route table to be used |
| v6_route_table_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | identifier of the IPv6 route table to be used, if any |
| service_ip | [opi_api.network.opinetcommon.v1alpha1.IPAddress](#opi_api-network-opinetcommon-v1alpha1-IPAddress) |  | vnic if assigned a VIP in the underlay, can be used as outer encap source IP, if configured, for traffic going to certain vpc private service endpoints |
| max_tcp_sessions | [int32](#int32) |  | max_tcp_sessions is the maximum number of TCP sessions allowed from/to this vnic, if it is non-zero; zero implies no limit |
| max_udp_sessions | [int32](#int32) |  | max_udp_sessions is the maximum number of UDP sessions allowed from/to this vnic, if it is non-zero; zero implies no limit |
| max_icmp_sessions | [int32](#int32) |  | max_icmp_sessions is the maximum number of ICMP sessions allowed from/to this vnic, if it is non-zero; zero implies no limit |
| max_other_sessions | [int32](#int32) |  | max other session is the maximum number of non-TCP/UDP/ICMP sessions allowed from/to this vnic; zero implies no limit |






<a name="opi_api-network-cloud-v1alpha1-VnicStatus"></a>

### VnicStatus
operational status of Vnic, if any


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| max_session_limit_hit | [bool](#bool) |  | true if vnic&#39;s configured total session limit is hit |
| max_tcp_session_limit_hit | [bool](#bool) |  | true if vnic&#39;s configured TCP session limit is hit |
| max_udp_session_limit_hit | [bool](#bool) |  | true if vnic&#39;s configured UDP session limit is hit |
| max_icmp_session_limit_hit | [bool](#bool) |  | true if vnic&#39;s configured ICMP session limit is hit |
| max_other_session_limit_hit | [bool](#bool) |  | true if vnic&#39;s configured non-TCP/UDP/ICMP session limit is hit |
| hw_idx | [int32](#int32) |  | h/w id of the vnic |
| nexthop_hw_idx | [int32](#int32) |  | nexthop h/w id |
| cps_copp_hw_idx | [int32](#int32) |  | ARM cpu bound policer hw_idx for CPS rate limiting |
| secondary_vnic_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | secondary vnic of (primary) vnic |





 

 

 

 



<a name="vpc-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## vpc.proto



<a name="opi_api-network-cloud-v1alpha1-VPCPeer"></a>

### VPCPeer
Virtual Private Cloud Peer (aka. pairing) object


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| spec | [VPCPeerSpec](#opi_api-network-cloud-v1alpha1-VPCPeerSpec) |  | configuration |
| status | [VPCPeerStatus](#opi_api-network-cloud-v1alpha1-VPCPeerStatus) |  | status |






<a name="opi_api-network-cloud-v1alpha1-VPCPeerSpec"></a>

### VPCPeerSpec
VPCPeerSpec captures configuration for a VPC peering relation
Given two vpcs, only one vpc peering objects needs to be created as
the vpc peering is commutative relation


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | unique id/key idenitifying this VPC peering relation |
| vpc1_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | unique key/identifier of VPC1 |
| vpc2_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | unique key/identifier of VPC2 |






<a name="opi_api-network-cloud-v1alpha1-VPCPeerStatus"></a>

### VPCPeerStatus
operational status of a VPC peering, if any






<a name="opi_api-network-cloud-v1alpha1-Vpc"></a>

### Vpc
Virtual Private Cloud object


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| spec | [VpcSpec](#opi_api-network-cloud-v1alpha1-VpcSpec) |  | configuration |
| status | [VpcStatus](#opi_api-network-cloud-v1alpha1-VpcStatus) |  | status |






<a name="opi_api-network-cloud-v1alpha1-VpcSpec"></a>

### VpcSpec
VpcSpec captures VPC configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | unique key/identifier of VPC |
| type | [VPCType](#opi_api-network-cloud-v1alpha1-VPCType) |  | type of the VPC |
| v4_route_table_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | identifier of the IPv4 route table to be used and this route table is inherited by the subnets under this VPC, if they are created with no route table explicitly |
| v6_route_table_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | identifier of the IPv6 route table to be used, if any and this route table is inherited by the subnets under this VPC, if they are created with no route table explicitly |
| ingress_v4_security_policy_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) | repeated | For various security policies - all vnics in this VPC will inherit the policies configured under VPC - there can be multiple policies per vnic per direction (ingress/egress) - vpc policy in each direction is to be aggregated to contain all rules in a given direction identifier of ingress IPv4 security policy to be enforced |
| ingress_v6_security_policy_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) | repeated | identifier of ingress IPv6 security policy to be enforced |
| egress_v4_security_policy_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) | repeated | identifier of egress IPv4 security policy to be enforced |
| egress_v6_security_policy_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) | repeated | identifier of egress IPv6 security policy to be enforced |
| virtual_router_mac | [bytes](#bytes) |  | Virtual Router (VR) MAC address, any packets originated or routed in this VPC carry this MAC as source MAC |
| fabric_encap | [opi_api.network.opinetcommon.v1alpha1.Encap](#opi_api-network-opinetcommon-v1alpha1-Encap) |  | encapped traffic coming with the specified encap from fabric side will be mapped to this VPC. FabricEncap is needed only for VPCs of type VPC_TYPE_TENANT, for other types of VPCs user need not provide fabric encap and will be unused when provided |
| tos | [int32](#int32) |  | ToS field is 1 byte value that is populated in the DSCP field of IPv4 outer header or in the Traffic Class field of IPv6 outer header, this value, if non-zero, will be used as-is (i.e., not interpreted) during encap time by the dataplane - subnets under this VPC don&#39;t inherit this ToS value, subnets need to be explicitly configured with same ToS value as that of VPC or potentially different ToS value of their own - tunnel objects, if configured with tos, will override this tos value |






<a name="opi_api-network-cloud-v1alpha1-VpcStatus"></a>

### VpcStatus
operational status of a VPC, if any


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| hw_handle | [opi_api.network.opinetcommon.v1alpha1.HwHandle](#opi_api-network-opinetcommon-v1alpha1-HwHandle) |  | vpc hw handle |
| bd_hw_handle | [opi_api.network.opinetcommon.v1alpha1.HwHandle](#opi_api-network-opinetcommon-v1alpha1-HwHandle) |  | vpc&#39;s layer2 hw handle |
| subnet_count | [int32](#int32) |  | number of subnets in the vpc |





 


<a name="opi_api-network-cloud-v1alpha1-VPCType"></a>

### VPCType
type of the virtual private cloud

| Name | Number | Description |
| ---- | ------ | ----------- |
| VPC_TYPE_UNSPECIFIED | 0 | unspecified |
| VPC_TYPE_UNDERLAY | 1 | underlay |
| VPC_TYPE_TENANT | 2 | tenant |
| VPC_TYPE_CONTROL | 3 | control |


 

 

 



<a name="inventory-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## inventory.proto



<a name="opi_api-inventory-v1-BIOSInfo"></a>

### BIOSInfo
BIOS Information (Type 0)


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vendor | [string](#string) |  | String number of the BIOS Vendor’s Name. |
| version | [string](#string) |  | String number of the BIOS Version. This value is a free-form string that may contain Core and OEM version information. |
| date | [string](#string) |  | String number of the BIOS release date. The date string, if supplied, is in either mm/dd/yy or mm/dd/yyyy format. If the year portion of the string is two digits, the year is assumed to be 19yy. NOTE: The mm/dd/yyyy format is required for SMBIOS version 2.3 and later |






<a name="opi_api-inventory-v1-BaseboardInfo"></a>

### BaseboardInfo
Baseboard (or Module) Information (Type 2)
 The information in this structure defines attributes of a system baseboard (for
 example, a motherboard, planar, server blade, or other standard system module)


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| asset_tag | [string](#string) |  | Number of a null-terminated string |
| serial_number | [string](#string) |  | Number of null-terminated string |
| vendor | [string](#string) |  | Number of null-terminated string |
| version | [string](#string) |  | Number of null-terminated string |
| product | [string](#string) |  | Number of null-terminated string |






<a name="opi_api-inventory-v1-CPUInfo"></a>

### CPUInfo
Processor Information (Type 4)
 The information in this structure (see Table 21) defines the attributes of a single processor; a separate
 structure instance is provided for each system processor socket/slot. For example, a system with an
 IntelDX2™ processor would have a single structure instance while a system with an IntelSX2™ processor
 would have a structure to describe the main CPU and a second structure to describe the 80487 co1054 processor.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| total_cores | [int32](#int32) |  | Number of cores per processor socket See 7.5.6. If the value is unknown, the field is set to 0. For core counts of 256 or greater, the Core Count field is set to FFh and the Core Count 2 field is set to the number of cores. |
| total_threads | [int32](#int32) |  | Number of threads per processor socket See 7.5.8. If the value is unknown, the field is set to 0. For thread counts of 256 or greater, the Thread Count field is set to FFh and the Thread Count 2 field is set to the number of threads. |






<a name="opi_api-inventory-v1-ChassisInfo"></a>

### ChassisInfo
System Enclosure or Chassis (Type 3)
 The information in this structure (see Table 16) defines attributes of the system’s mechanical
 enclosure(s). For example, if a system included a separate enclosure for its peripheral devices, two
 structures would be returned: one for the main system enclosure and the second for the peripheral device
 enclosure. The additions to this structure in version 2.1 of this specification support the population of the
 CIM_Chassis class.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| asset_tag | [string](#string) |  | Number of null-terminated string |
| serial_number | [string](#string) |  | Number of null-terminated string |
| type | [string](#string) |  | Bit 7 Chassis lock is present if 1. Otherwise, either a lock is not present, or it is unknown if the enclosure has a lock. Bits 6:0 Enumeration value; see below. |
| type_description | [string](#string) |  | Table 17 shows the byte values for the System Enclosure or Chassis Types field Number of null-terminated string |
| vendor | [string](#string) |  | Number of null-terminated string |
| version | [string](#string) |  | Number of null-terminated string |






<a name="opi_api-inventory-v1-InventoryGetRequest"></a>

### InventoryGetRequest
Empty






<a name="opi_api-inventory-v1-InventoryGetResponse"></a>

### InventoryGetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| bios | [BIOSInfo](#opi_api-inventory-v1-BIOSInfo) |  |  |
| system | [SystemInfo](#opi_api-inventory-v1-SystemInfo) |  |  |
| baseboard | [BaseboardInfo](#opi_api-inventory-v1-BaseboardInfo) |  |  |
| chassis | [ChassisInfo](#opi_api-inventory-v1-ChassisInfo) |  |  |
| processor | [CPUInfo](#opi_api-inventory-v1-CPUInfo) |  |  |
| memory | [MemoryInfo](#opi_api-inventory-v1-MemoryInfo) |  |  |
| pci | [PCIeDeviceInfo](#opi_api-inventory-v1-PCIeDeviceInfo) | repeated |  |






<a name="opi_api-inventory-v1-MemoryInfo"></a>

### MemoryInfo
Physical Memory Array (Type 16)
 This structure describes a collection of memory devices that operate together to form a memory address
 space.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| total_physical_bytes | [int64](#int64) |  | Maximum memory capacity, in kilobytes, for this array If the capacity is not represented in this field, then this field contains 8000 0000h and the Extended Maximum Capacity field should be used. Values 2 TB (8000 0000h) or greater must be represented in the Extended Maximum Capacity field. |
| total_usable_bytes | [int64](#int64) |  | TBD |






<a name="opi_api-inventory-v1-PCIeDeviceInfo"></a>

### PCIeDeviceInfo
PCI device information
 TBD: Type 9 or Type 41 ?
 This structure describes a collection of PCI devices.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| driver | [string](#string) |  | Driver assiociated with the device |
| address | [string](#string) |  | BDF address in a string format, for example &#34;0000:00:17.7&#34; |
| vendor | [string](#string) |  | string vendor info |
| product | [string](#string) |  | string product info |
| revision | [string](#string) |  | string revision info |
| subsystem | [string](#string) |  | string subsystem info |
| class | [string](#string) |  | string class info |
| subclass | [string](#string) |  | string subclass info |






<a name="opi_api-inventory-v1-SystemInfo"></a>

### SystemInfo
System Information (Type 1)
 The information in this structure defines attributes of the overall system and is intended to be associated
 with the Component ID group of the system’s MIF. An SMBIOS implementation is associated with a single
 system instance and contains one and only one System Information (Type 1) structure. Table 10 shows
 the contents of this structure.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| family | [string](#string) |  | Number of null-terminated string This text string identifies the family to which a particular computer belongs. A family refers to a set of computers that are similar but not identical from a hardware or software point of view. Typically, a family is composed of different computer models, which have different configurations and pricing points. Computers in the same family often have similar branding and cosmetic features. |
| name | [string](#string) |  | Number of null-terminated string |
| vendor | [string](#string) |  | Number of null-terminated string |
| serial_number | [string](#string) |  | Number of null-terminated string |
| uuid | [string](#string) |  | A UUID is an identifier that is designed to be unique across both time and space. It requires no central registration process. The UUID is 128 bits long. Its format is described in RFC4122, but the actual field contents are opaque and not significant to the SMBIOS specification, which is only concerned with the byte order. Table 11 shows the field names; these field names, particularly for multiplexed fields, follow historical practice. |
| sku | [string](#string) |  | Number of null-terminated string This text string identifies a particular computer configuration for sale. It is sometimes also called a product ID or purchase order number. This number is frequently found in existing fields, but there is no standard format. Typically for a given system board from a given OEM, there are tens of unique processor, memory, hard drive, and optical drive configurations. |
| version | [string](#string) |  | Number of null-terminated string |





 

 

 


<a name="opi_api-inventory-v1-InventorySvc"></a>

### InventorySvc
Service functions for the device inventory data

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| InventoryGet | [InventoryGetRequest](#opi_api-inventory-v1-InventoryGetRequest) | [InventoryGetResponse](#opi_api-inventory-v1-InventoryGetResponse) | retrieves the inventory data for the device |

 



<a name="object_key-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## object_key.proto



<a name="opi_api-common-v1-ObjectKey"></a>

### ObjectKey
Object Keys are opaque values. The object key uniquely
identifies a given configuration object. The key used must be unique within
the agent&#39;s context for the give object type and must be non-zero. No other
restrictions apply on the usage of the key.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| value | [string](#string) |  | The value of the ObjectKey |





 

 

 

 



<a name="uuid-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## uuid.proto



<a name="opi_api-common-v1-Uuid"></a>

### Uuid
A universally unique identifier (UUID) is a 128-bit label
When generated according to the standard methods, UUIDs are, for practical purposes, unique.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| value | [string](#string) |  | The value of the UUID |





 

 

 

 



## Scalar Value Types

| .proto Type | Notes | C++ | Java | Python | Go | C# | PHP | Ruby |
| ----------- | ----- | --- | ---- | ------ | -- | -- | --- | ---- |
| <a name="double" /> double |  | double | double | float | float64 | double | float | Float |
| <a name="float" /> float |  | float | float | float | float32 | float | float | Float |
| <a name="int32" /> int32 | Uses variable-length encoding. Inefficient for encoding negative numbers – if your field is likely to have negative values, use sint32 instead. | int32 | int | int | int32 | int | integer | Bignum or Fixnum (as required) |
| <a name="int64" /> int64 | Uses variable-length encoding. Inefficient for encoding negative numbers – if your field is likely to have negative values, use sint64 instead. | int64 | long | int/long | int64 | long | integer/string | Bignum |
| <a name="uint32" /> uint32 | Uses variable-length encoding. | uint32 | int | int/long | uint32 | uint | integer | Bignum or Fixnum (as required) |
| <a name="uint64" /> uint64 | Uses variable-length encoding. | uint64 | long | int/long | uint64 | ulong | integer/string | Bignum or Fixnum (as required) |
| <a name="sint32" /> sint32 | Uses variable-length encoding. Signed int value. These more efficiently encode negative numbers than regular int32s. | int32 | int | int | int32 | int | integer | Bignum or Fixnum (as required) |
| <a name="sint64" /> sint64 | Uses variable-length encoding. Signed int value. These more efficiently encode negative numbers than regular int64s. | int64 | long | int/long | int64 | long | integer/string | Bignum |
| <a name="fixed32" /> fixed32 | Always four bytes. More efficient than uint32 if values are often greater than 2^28. | uint32 | int | int | uint32 | uint | integer | Bignum or Fixnum (as required) |
| <a name="fixed64" /> fixed64 | Always eight bytes. More efficient than uint64 if values are often greater than 2^56. | uint64 | long | int/long | uint64 | ulong | integer/string | Bignum |
| <a name="sfixed32" /> sfixed32 | Always four bytes. | int32 | int | int | int32 | int | integer | Bignum or Fixnum (as required) |
| <a name="sfixed64" /> sfixed64 | Always eight bytes. | int64 | long | int/long | int64 | long | integer/string | Bignum |
| <a name="bool" /> bool |  | bool | boolean | boolean | bool | bool | boolean | TrueClass/FalseClass |
| <a name="string" /> string | A string must always contain UTF-8 encoded or 7-bit ASCII text. | string | String | str/unicode | string | string | string | String (UTF-8) |
| <a name="bytes" /> bytes | May contain any arbitrary sequence of bytes. | string | ByteString | str | []byte | ByteString | string | String (ASCII-8BIT) |

