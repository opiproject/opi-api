# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [networktypes.proto](#networktypes-proto)
    - [AddressRange](#opi_api-network-opinetcommon-v1alpha1-AddressRange)
    - [Encap](#opi_api-network-opinetcommon-v1alpha1-Encap)
    - [EncapVal](#opi_api-network-opinetcommon-v1alpha1-EncapVal)
    - [HwHandle](#opi_api-network-opinetcommon-v1alpha1-HwHandle)
    - [ICMPMatch](#opi_api-network-opinetcommon-v1alpha1-ICMPMatch)
    - [ICMPMatchList](#opi_api-network-opinetcommon-v1alpha1-ICMPMatchList)
    - [IPAddress](#opi_api-network-opinetcommon-v1alpha1-IPAddress)
    - [IPEntry](#opi_api-network-opinetcommon-v1alpha1-IPEntry)
    - [IPList](#opi_api-network-opinetcommon-v1alpha1-IPList)
    - [IPPrefix](#opi_api-network-opinetcommon-v1alpha1-IPPrefix)
    - [IPRange](#opi_api-network-opinetcommon-v1alpha1-IPRange)
    - [IPv4Prefix](#opi_api-network-opinetcommon-v1alpha1-IPv4Prefix)
    - [IPv6Prefix](#opi_api-network-opinetcommon-v1alpha1-IPv6Prefix)
    - [PortListMatch](#opi_api-network-opinetcommon-v1alpha1-PortListMatch)
    - [PortMatch](#opi_api-network-opinetcommon-v1alpha1-PortMatch)
    - [PortRange](#opi_api-network-opinetcommon-v1alpha1-PortRange)
    - [RuleL3Match](#opi_api-network-opinetcommon-v1alpha1-RuleL3Match)
    - [RuleL4Match](#opi_api-network-opinetcommon-v1alpha1-RuleL4Match)
    - [RuleMatch](#opi_api-network-opinetcommon-v1alpha1-RuleMatch)
  
    - [AdminState](#opi_api-network-opinetcommon-v1alpha1-AdminState)
    - [EncapType](#opi_api-network-opinetcommon-v1alpha1-EncapType)
    - [IpAf](#opi_api-network-opinetcommon-v1alpha1-IpAf)
    - [PolicyDir](#opi_api-network-opinetcommon-v1alpha1-PolicyDir)
    - [RouteProtocol](#opi_api-network-opinetcommon-v1alpha1-RouteProtocol)
    - [RouteType](#opi_api-network-opinetcommon-v1alpha1-RouteType)
    - [SecurityRuleAction](#opi_api-network-opinetcommon-v1alpha1-SecurityRuleAction)
    - [WildcardMatch](#opi_api-network-opinetcommon-v1alpha1-WildcardMatch)
  
- [openconfig_interfaces.proto](#openconfig_interfaces-proto)
    - [Config](#opi_api-network-v1alpha1-Config)
    - [Counters](#opi_api-network-v1alpha1-Counters)
    - [GetNetInterfaceRequest](#opi_api-network-v1alpha1-GetNetInterfaceRequest)
    - [ListNetInterfacesRequest](#opi_api-network-v1alpha1-ListNetInterfacesRequest)
    - [ListNetInterfacesResponse](#opi_api-network-v1alpha1-ListNetInterfacesResponse)
    - [NetInterface](#opi_api-network-v1alpha1-NetInterface)
    - [NetInterface.HoldTime](#opi_api-network-v1alpha1-NetInterface-HoldTime)
    - [NetInterface.HoldTime.HoldConfig](#opi_api-network-v1alpha1-NetInterface-HoldTime-HoldConfig)
    - [NetInterface.HoldTime.HoldState](#opi_api-network-v1alpha1-NetInterface-HoldTime-HoldState)
    - [NetInterface.Subinterfaces](#opi_api-network-v1alpha1-NetInterface-Subinterfaces)
    - [NetInterface.Subinterfaces.Subinterface](#opi_api-network-v1alpha1-NetInterface-Subinterfaces-Subinterface)
    - [NetInterface.Subinterfaces.Subinterface.SubifConfig](#opi_api-network-v1alpha1-NetInterface-Subinterfaces-Subinterface-SubifConfig)
    - [State](#opi_api-network-v1alpha1-State)
    - [UpdateNetInterfaceRequest](#opi_api-network-v1alpha1-UpdateNetInterfaceRequest)
  
    - [AdminState](#opi_api-network-v1alpha1-AdminState)
    - [InterfaceType](#opi_api-network-v1alpha1-InterfaceType)
    - [OperState](#opi_api-network-v1alpha1-OperState)
  
    - [NetInterfaceService](#opi_api-network-v1alpha1-NetInterfaceService)
  
- [inventory.proto](#inventory-proto)
    - [BIOSInfo](#opi_api-inventory-v1-BIOSInfo)
    - [BaseboardInfo](#opi_api-inventory-v1-BaseboardInfo)
    - [CPUInfo](#opi_api-inventory-v1-CPUInfo)
    - [ChassisInfo](#opi_api-inventory-v1-ChassisInfo)
    - [GetInventoryRequest](#opi_api-inventory-v1-GetInventoryRequest)
    - [Inventory](#opi_api-inventory-v1-Inventory)
    - [MemoryInfo](#opi_api-inventory-v1-MemoryInfo)
    - [PCIeDeviceInfo](#opi_api-inventory-v1-PCIeDeviceInfo)
    - [SystemInfo](#opi_api-inventory-v1-SystemInfo)
  
    - [InventorySvc](#opi_api-inventory-v1-InventorySvc)
  
- [object_key.proto](#object_key-proto)
    - [ObjectKey](#opi_api-common-v1-ObjectKey)
  
- [uuid.proto](#uuid-proto)
    - [Uuid](#opi_api-common-v1-Uuid)
  
- [Scalar Value Types](#scalar-value-types)



<a name="networktypes-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## networktypes.proto



<a name="opi_api-network-opinetcommon-v1alpha1-AddressRange"></a>

### AddressRange
AddressRange represents an IPv4 or IPv6 address range


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| ipv4_range | [IPRange](#opi_api-network-opinetcommon-v1alpha1-IPRange) |  | IPv4 address range |
| ipv6_range | [IPRange](#opi_api-network-opinetcommon-v1alpha1-IPRange) |  | IPv6 address range |






<a name="opi_api-network-opinetcommon-v1alpha1-Encap"></a>

### Encap
fabric encap


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| type | [EncapType](#opi_api-network-opinetcommon-v1alpha1-EncapType) |  | encyp type |
| value | [EncapVal](#opi_api-network-opinetcommon-v1alpha1-EncapVal) |  | encap value |






<a name="opi_api-network-opinetcommon-v1alpha1-EncapVal"></a>

### EncapVal
tag values for various encap types


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vlan_id | [int32](#int32) |  | vlan id for DOT1Q |
| mpls_tag | [int32](#int32) |  | MPLS tag/slot for MPLS over UDP |
| vnid | [int32](#int32) |  | VXLAN VNID (24bit value) |
| vsid | [int32](#int32) |  | NVGRE VSID |






<a name="opi_api-network-opinetcommon-v1alpha1-HwHandle"></a>

### HwHandle
Opaque handle to identify the index in hardware


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| idx | [uint64](#uint64) |  | hardware handle (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: hw handle must be uint64. --) |






<a name="opi_api-network-opinetcommon-v1alpha1-ICMPMatch"></a>

### ICMPMatch
ICMPv4/ICMPv6 rule match criteria


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| type | [int32](#int32) |  | match any ICMP type |
| type_wildcard | [WildcardMatch](#opi_api-network-opinetcommon-v1alpha1-WildcardMatch) |  | match any ICMP type |
| code | [int32](#int32) |  | match any ICMP code |
| code_wildcard | [WildcardMatch](#opi_api-network-opinetcommon-v1alpha1-WildcardMatch) |  | match any ICMP code |






<a name="opi_api-network-opinetcommon-v1alpha1-ICMPMatchList"></a>

### ICMPMatchList
ICMP type/code match condition list


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| icmp_match_list | [ICMPMatch](#opi_api-network-opinetcommon-v1alpha1-ICMPMatch) | repeated | ICMP type/code list |






<a name="opi_api-network-opinetcommon-v1alpha1-IPAddress"></a>

### IPAddress
IP Address object


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| af | [IpAf](#opi_api-network-opinetcommon-v1alpha1-IpAf) |  | IP Address family |
| v4_addr | [fixed32](#fixed32) |  | IPv4 address (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: must use fixed32 --) |
| v6_addr | [bytes](#bytes) |  | IPv6 address |






<a name="opi_api-network-opinetcommon-v1alpha1-IPEntry"></a>

### IPEntry
IPEntry represents any form of IP address/prefix/range/tag etc.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| prefix | [IPPrefix](#opi_api-network-opinetcommon-v1alpha1-IPPrefix) |  | IP prefix |
| range | [AddressRange](#opi_api-network-opinetcommon-v1alpha1-AddressRange) |  | IP range |
| tag | [int32](#int32) |  | tag that represents IP addres/pfx/range, range:1-4294967294 |






<a name="opi_api-network-opinetcommon-v1alpha1-IPList"></a>

### IPList
IPList is a list of IPEntry objects


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| ip_entries | [IPEntry](#opi_api-network-opinetcommon-v1alpha1-IPEntry) | repeated | list of ip entries (prefix, range) |






<a name="opi_api-network-opinetcommon-v1alpha1-IPPrefix"></a>

### IPPrefix
IP Prefix object


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| addr | [IPAddress](#opi_api-network-opinetcommon-v1alpha1-IPAddress) |  | IP prefix address |
| len | [int32](#int32) |  | IP Prefix length (range:0-128) |






<a name="opi_api-network-opinetcommon-v1alpha1-IPRange"></a>

### IPRange
IP Range


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| low | [IPAddress](#opi_api-network-opinetcommon-v1alpha1-IPAddress) |  | starting IP address |
| high | [IPAddress](#opi_api-network-opinetcommon-v1alpha1-IPAddress) |  | ending IP address |






<a name="opi_api-network-opinetcommon-v1alpha1-IPv4Prefix"></a>

### IPv4Prefix
IPv4 Prefix


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| addr | [fixed32](#fixed32) |  | IPv4 address portion (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: must use fixed32 --) |
| len | [int32](#int32) |  | prefix length; range:0-32 |






<a name="opi_api-network-opinetcommon-v1alpha1-IPv6Prefix"></a>

### IPv6Prefix
IPv6 Prefix


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| addr | [bytes](#bytes) |  | IPv6 address bytes |
| len | [int32](#int32) |  | prefix length: range:0-128 |






<a name="opi_api-network-opinetcommon-v1alpha1-PortListMatch"></a>

### PortListMatch
TCP/UDP source and destination port list


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| src_port_range | [PortRange](#opi_api-network-opinetcommon-v1alpha1-PortRange) | repeated | list of source ports or port ranges |
| dst_port_range | [PortRange](#opi_api-network-opinetcommon-v1alpha1-PortRange) | repeated | list of destination ports or port ranges |






<a name="opi_api-network-opinetcommon-v1alpha1-PortMatch"></a>

### PortMatch
TCP/UDP rule match criteria


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| src_port_range | [PortRange](#opi_api-network-opinetcommon-v1alpha1-PortRange) |  | source port range |
| dst_port_range | [PortRange](#opi_api-network-opinetcommon-v1alpha1-PortRange) |  | destination port range |






<a name="opi_api-network-opinetcommon-v1alpha1-PortRange"></a>

### PortRange
PortRange object has low and high end of the port ranges


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| port_low | [int32](#int32) |  | range:0-65535 |
| port_high | [int32](#int32) |  | range:0-65535 |






<a name="opi_api-network-opinetcommon-v1alpha1-RuleL3Match"></a>

### RuleL3Match
L3 rule match criteria


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| proto_num | [int32](#int32) |  | protocol number |
| proto_wild_card | [WildcardMatch](#opi_api-network-opinetcommon-v1alpha1-WildcardMatch) |  | match ANY protocol |
| src_prefix | [IPPrefix](#opi_api-network-opinetcommon-v1alpha1-IPPrefix) |  | ip prefix |
| src_range | [AddressRange](#opi_api-network-opinetcommon-v1alpha1-AddressRange) |  | source ip address range |
| src_tag | [int32](#int32) |  | source tag for the range (range:1-429496729) |
| src_ip_list | [IPList](#opi_api-network-opinetcommon-v1alpha1-IPList) |  | ip list |
| dst_prefix | [IPPrefix](#opi_api-network-opinetcommon-v1alpha1-IPPrefix) |  | ip prefix |
| dst_range | [AddressRange](#opi_api-network-opinetcommon-v1alpha1-AddressRange) |  | destination ip range |
| dst_tag | [int32](#int32) |  | destination tag (range:1-429496729) |
| dst_ip_list | [IPList](#opi_api-network-opinetcommon-v1alpha1-IPList) |  | ip list |






<a name="opi_api-network-opinetcommon-v1alpha1-RuleL4Match"></a>

### RuleL4Match
L4 rule match criteria


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| ports | [PortMatch](#opi_api-network-opinetcommon-v1alpha1-PortMatch) |  | source and/or destination ports/ranges |
| type_code | [ICMPMatch](#opi_api-network-opinetcommon-v1alpha1-ICMPMatch) |  | ICMP type/code match criteria |
| port_list | [PortListMatch](#opi_api-network-opinetcommon-v1alpha1-PortListMatch) |  | list of source and/or destination ports/ranges |
| icmp_match_list | [ICMPMatchList](#opi_api-network-opinetcommon-v1alpha1-ICMPMatchList) |  | list ICMP type/code match criteria |






<a name="opi_api-network-opinetcommon-v1alpha1-RuleMatch"></a>

### RuleMatch
rule match criteria


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| l3_match | [RuleL3Match](#opi_api-network-opinetcommon-v1alpha1-RuleL3Match) |  | Layer 3 match criteria |
| l4_match | [RuleL4Match](#opi_api-network-opinetcommon-v1alpha1-RuleL4Match) |  | Layer 4 match criteria |





 


<a name="opi_api-network-opinetcommon-v1alpha1-AdminState"></a>

### AdminState
admin state of control plane objects

| Name | Number | Description |
| ---- | ------ | ----------- |
| ADMIN_STATE_UNSPECIFIED | 0 | unspecified |
| ADMIN_STATE_ENABLE | 1 | enable |
| ADMIN_STATE_DISABLE | 2 | disable |



<a name="opi_api-network-opinetcommon-v1alpha1-EncapType"></a>

### EncapType
encap types in the network

| Name | Number | Description |
| ---- | ------ | ----------- |
| ENCAP_TYPE_UNSPECIFIED | 0 | no encap |
| ENCAP_TYPE_DOT1Q | 1 | 802.1q |
| ENCAP_TYPE_MPLS_OVER_UDP | 2 | MPLS over UDP |
| ENCAP_TYPE_VXLAN | 3 | VXLAN |
| ENCAP_TYPE_NVGRE | 4 | NVGRE |



<a name="opi_api-network-opinetcommon-v1alpha1-IpAf"></a>

### IpAf
IP address families

| Name | Number | Description |
| ---- | ------ | ----------- |
| IP_AF_UNSPECIFIED | 0 | unspecified |
| IP_AF_INET | 1 | ipv4 |
| IP_AF_INET6 | 2 | ipv6 |



<a name="opi_api-network-opinetcommon-v1alpha1-PolicyDir"></a>

### PolicyDir
direction in which policy is enforced
INGRESS/EGRESS is w.r.t vnic (i.e., traffic leaving vnic is marked as
EGRESS and traffic going to vnic is marked as INGRESS

| Name | Number | Description |
| ---- | ------ | ----------- |
| POLICY_DIR_UNSPECIFIED | 0 | unspecified |
| POLICY_DIR_INGRESS | 1 | ingress (towards vnic from network) |
| POLICY_DIR_EGRESS | 2 | egress (from vnic to network) |



<a name="opi_api-network-opinetcommon-v1alpha1-RouteProtocol"></a>

### RouteProtocol
route protocols

| Name | Number | Description |
| ---- | ------ | ----------- |
| ROUTE_PROTOCOL_UNSPECIFIED | 0 | unspecified |
| ROUTE_PROTOCOL_LOCAL | 1 | local |
| ROUTE_PROTOCOL_STATIC | 2 | static |
| ROUTE_PROTOCOL_BGP | 3 | bgp (dynamic) |



<a name="opi_api-network-opinetcommon-v1alpha1-RouteType"></a>

### RouteType
route type

| Name | Number | Description |
| ---- | ------ | ----------- |
| ROUTE_TYPE_UNSPECIFIED | 0 | unspecified |
| ROUTE_TYPE_OTHER | 1 | other |
| ROUTE_TYPE_REJECT | 2 | reject |
| ROUTE_TYPE_LOCAL | 3 | local |
| ROUTE_TYPE_REMOTE | 4 | remote |



<a name="opi_api-network-opinetcommon-v1alpha1-SecurityRuleAction"></a>

### SecurityRuleAction
security rule action is one of the below

| Name | Number | Description |
| ---- | ------ | ----------- |
| SECURITY_RULE_ACTION_NONE | 0 | no action (-- api-linter: core::0126::unspecified=disabled aip.dev/not-precedent: NONE means no action. --) |
| SECURITY_RULE_ACTION_ALLOW | 1 | allow |
| SECURITY_RULE_ACTION_DENY | 2 | deny |



<a name="opi_api-network-opinetcommon-v1alpha1-WildcardMatch"></a>

### WildcardMatch
WildcardMatch options

| Name | Number | Description |
| ---- | ------ | ----------- |
| MATCH_NONE | 0 | wouldn&#39;t match anything (-- api-linter: core::0126::unspecified=disabled aip.dev/not-precedent: NONE means don&#39;t match anything. --) |
| MATCH_ANY | 256 | match everything |


 

 

 



<a name="openconfig_interfaces-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## openconfig_interfaces.proto
openconfig_interfaces.proto file
Derived from the OpenConfig interfaces model github.com/openconfig/public/release/models/interfaces
Copyright (c) 2023 Dell Inc, or its subsidiaries.
(-- api-linter: core::0141::forbidden-types=disabled
    aip.dev/not-precedent: counters, mtu, index must be uint and not int. --)


<a name="opi_api-network-v1alpha1-Config"></a>

### Config
Interface config
(-- api-linter: core::0123::resource-annotation=disabled
    aip.dev/not-precedent: the name field is an opaque object --)


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Name of the interface. This is the opaque object used for designating the created interface. |
| type | [InterfaceType](#opi_api-network-v1alpha1-InterfaceType) |  | Type of interface - Ethernet and others |
| mtu | [uint32](#uint32) |  | MTU for the interface that can be configured |
| loopback_mode | [bool](#bool) |  | Setting the loopback mode of the interface |
| description | [string](#string) |  | Description of the interface and usage |
| enabled | [bool](#bool) |  | Setting for enabling/disabling the interface |






<a name="opi_api-network-v1alpha1-Counters"></a>

### Counters
Statistics Counters for the interface - ro


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| rx_octets | [uint64](#uint64) |  | Received Octet counter |
| rx_packets | [uint64](#uint64) |  | Received Packet counter |
| rx_unicast_pkts | [uint64](#uint64) |  | Unicast packets received counter |
| rx_broadcast_pkts | [uint64](#uint64) |  | Broadcast packets received counter |
| rx_multicast_pkts | [uint64](#uint64) |  | multicast packets received counter |
| rx_discards | [uint64](#uint64) |  | discarded received packets counter |
| rx_errors | [uint64](#uint64) |  | Receive error counter |
| rx_unknown_protos | [uint64](#uint64) |  | Unknown received protocol counter |
| rx_fcs_errors | [uint64](#uint64) |  | Received FCS error counter |
| out_octets | [uint64](#uint64) |  | Transmit octet counter |
| out_packets | [uint64](#uint64) |  | Transmit packet counter |
| out_unicast_pkts | [uint64](#uint64) |  | Unicast packet transmit counter |
| out_broadcast_pkts | [uint64](#uint64) |  | Broadcast packet transmit counter |
| out_multicast_pkts | [uint64](#uint64) |  | Multicast packet transmit counter |
| out_discards | [uint64](#uint64) |  | Discarded transmit packet counter |
| out_errors | [uint64](#uint64) |  | Transmit error counter |
| carrier_transitions | [uint64](#uint64) |  | Carrier transition count |
| last_clear | [uint64](#uint64) |  | Last Clear |






<a name="opi_api-network-v1alpha1-GetNetInterfaceRequest"></a>

### GetNetInterfaceRequest
Get Interface Request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Name of interface requested |






<a name="opi_api-network-v1alpha1-ListNetInterfacesRequest"></a>

### ListNetInterfacesRequest
List Interfaces Request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | parent |
| page_size | [int32](#int32) |  | page size |
| page_token | [string](#string) |  | page token |






<a name="opi_api-network-v1alpha1-ListNetInterfacesResponse"></a>

### ListNetInterfacesResponse
List of Interfaces Response


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| net_interfaces | [NetInterface](#opi_api-network-v1alpha1-NetInterface) | repeated | List of interfaces |
| next_page_token | [string](#string) |  | next page token |






<a name="opi_api-network-v1alpha1-NetInterface"></a>

### NetInterface
Interface - physical or virtual interface reported
(-- api-linter: core::0123::resource-annotation=disabled
    aip.dev/not-precedent: the name field is an opaque object --)


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Name of the interface. This is an opaque object that is not user settable. It is returned by the created object |
| config | [Config](#opi_api-network-v1alpha1-Config) |  | Configuration settings - rw |
| state | [State](#opi_api-network-v1alpha1-State) |  | Interface State and Statistics - ro |
| holdtime | [NetInterface.HoldTime](#opi_api-network-v1alpha1-NetInterface-HoldTime) |  | Hold Time Settings |
| subinterfaces | [NetInterface.Subinterfaces](#opi_api-network-v1alpha1-NetInterface-Subinterfaces) |  | Subinterfaces assigned to the interface |






<a name="opi_api-network-v1alpha1-NetInterface-HoldTime"></a>

### NetInterface.HoldTime
Hold Time Settings


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| hold_config | [NetInterface.HoldTime.HoldConfig](#opi_api-network-v1alpha1-NetInterface-HoldTime-HoldConfig) |  | Hold Time Config |
| hold_state | [NetInterface.HoldTime.HoldState](#opi_api-network-v1alpha1-NetInterface-HoldTime-HoldState) |  | Hold State Settings |






<a name="opi_api-network-v1alpha1-NetInterface-HoldTime-HoldConfig"></a>

### NetInterface.HoldTime.HoldConfig
Hold Time Config - rw


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| up | [uint32](#uint32) |  | Hold time up |
| down | [uint32](#uint32) |  | Hold time down |






<a name="opi_api-network-v1alpha1-NetInterface-HoldTime-HoldState"></a>

### NetInterface.HoldTime.HoldState
Hold State Settings - ro


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| up | [uint32](#uint32) |  | Hold state up |
| down | [uint32](#uint32) |  | Hold state down |






<a name="opi_api-network-v1alpha1-NetInterface-Subinterfaces"></a>

### NetInterface.Subinterfaces
Subinterfaces settings - VLAN, etc.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| subinterface | [NetInterface.Subinterfaces.Subinterface](#opi_api-network-v1alpha1-NetInterface-Subinterfaces-Subinterface) | repeated | Subinterface Settings |






<a name="opi_api-network-v1alpha1-NetInterface-Subinterfaces-Subinterface"></a>

### NetInterface.Subinterfaces.Subinterface
Subinterface settings


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| index | [int64](#int64) |  | Subinterface index |
| subif_config | [NetInterface.Subinterfaces.Subinterface.SubifConfig](#opi_api-network-v1alpha1-NetInterface-Subinterfaces-Subinterface-SubifConfig) |  | Subinterface Configuration |
| state | [State](#opi_api-network-v1alpha1-State) |  | Subinterface State and Statistics |






<a name="opi_api-network-v1alpha1-NetInterface-Subinterfaces-Subinterface-SubifConfig"></a>

### NetInterface.Subinterfaces.Subinterface.SubifConfig
Subinterface configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| index | [uint64](#uint64) |  | Subinterface Index |
| description | [string](#string) |  | Subinterface description |
| enabled | [bool](#bool) |  | Subinterface enabled |






<a name="opi_api-network-v1alpha1-State"></a>

### State
Interface State information - ro
(-- api-linter: core::0123::resource-annotation=disabled
    aip.dev/not-precedent: the name field is an opaque object --)


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Name of the interface. This is the opaque object used for designating the created interface. |
| type | [InterfaceType](#opi_api-network-v1alpha1-InterfaceType) |  | Interface type indicator |
| mtu | [uint32](#uint32) |  | Configured MTU size |
| loopback_mode | [bool](#bool) |  | Configured Loopback mode |
| description | [string](#string) |  | Interface description |
| enabled | [bool](#bool) |  | Interface enabled indicator |
| ifindex | [uint32](#uint32) |  | Interface Index |
| admin_state | [AdminState](#opi_api-network-v1alpha1-AdminState) |  | Admin State |
| oper_state | [OperState](#opi_api-network-v1alpha1-OperState) |  | Operational State |
| last_change | [uint64](#uint64) |  | Last Change |
| logical | [bool](#bool) |  | Logical interface |
| management | [bool](#bool) |  | Management interface indicator |
| cpu | [bool](#bool) |  | CPU |
| counters | [Counters](#opi_api-network-v1alpha1-Counters) |  | Interface Statistics Counters |






<a name="opi_api-network-v1alpha1-UpdateNetInterfaceRequest"></a>

### UpdateNetInterfaceRequest
Update Interface Request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| net_interface | [NetInterface](#opi_api-network-v1alpha1-NetInterface) |  | Interface update settings |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | list of fields to update |





 


<a name="opi_api-network-v1alpha1-AdminState"></a>

### AdminState
Admin State Enumeration

| Name | Number | Description |
| ---- | ------ | ----------- |
| ADMIN_STATE_UNSPECIFIED | 0 | Unspecified |
| ADMIN_STATE_UP | 1 | Up |
| ADMIN_STATE_DOWN | 2 | Down |
| ADMIN_STATE_TESTING | 3 | Testing |



<a name="opi_api-network-v1alpha1-InterfaceType"></a>

### InterfaceType
Interface Types Enumeration

| Name | Number | Description |
| ---- | ------ | ----------- |
| INTERFACE_TYPE_UNSPECIFIED | 0 | Interface Unspecified |
| ETHERNET | 1 | Ethernet Interface |
| LOOPBACK | 2 | Loopback Interface |



<a name="opi_api-network-v1alpha1-OperState"></a>

### OperState
Operational State Enumeration

| Name | Number | Description |
| ---- | ------ | ----------- |
| OPER_STATE_UNSPECIFIED | 0 | Unspecified |
| OPER_STATE_UP | 2 | Operational Up |
| OPER_STATE_DOWN | 3 | Operational Down |
| OPER_STATE_TESTING | 4 | Operational Testing |
| OPER_STATE_UNKNOWN | 5 | Unknown |
| OPER_STATE_DORMANT | 6 | Dormant |
| OPER_STATE_NOT_PRESENT | 7 | Not Present |
| OPER_STATE_LOWER_LAYER_DOWN | 8 | Lower Layer Down |


 

 


<a name="opi_api-network-v1alpha1-NetInterfaceService"></a>

### NetInterfaceService
Service functions for Network Interface exported by the server

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| GetNetInterface | [GetNetInterfaceRequest](#opi_api-network-v1alpha1-GetNetInterfaceRequest) | [NetInterface](#opi_api-network-v1alpha1-NetInterface) | Retrieves the interface information for a given interface |
| ListNetInterfaces | [ListNetInterfacesRequest](#opi_api-network-v1alpha1-ListNetInterfacesRequest) | [ListNetInterfacesResponse](#opi_api-network-v1alpha1-ListNetInterfacesResponse) | Retrieves the set of interfaces on the device |
| UpdateNetInterface | [UpdateNetInterfaceRequest](#opi_api-network-v1alpha1-UpdateNetInterfaceRequest) | [NetInterface](#opi_api-network-v1alpha1-NetInterface) | A method for setting or changing configuration of an interface |

 



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
| date | [string](#string) |  | String number of the BIOS release date. The date string, if supplied, is in either mm/dd/yy or mm/dd/yyyy format. If the year portion of the string is two digits, the year is assumed to be 19yy. NOTE: In version 2.3 and later of SMBIOS the mm/dd/yyyy format is only used. |






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






<a name="opi_api-inventory-v1-GetInventoryRequest"></a>

### GetInventoryRequest
Request for Retrieving Inventory data from a device


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | The name of the inventory to retrieve - blank for the full inventory |






<a name="opi_api-inventory-v1-Inventory"></a>

### Inventory
Response for device inventory data


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| bios | [BIOSInfo](#opi_api-inventory-v1-BIOSInfo) |  | BIOS Inventory |
| system | [SystemInfo](#opi_api-inventory-v1-SystemInfo) |  | System Inventory |
| baseboard | [BaseboardInfo](#opi_api-inventory-v1-BaseboardInfo) |  | Baseboard Inventory |
| chassis | [ChassisInfo](#opi_api-inventory-v1-ChassisInfo) |  | Chassis Inventory |
| processor | [CPUInfo](#opi_api-inventory-v1-CPUInfo) |  | CPU Inventory |
| memory | [MemoryInfo](#opi_api-inventory-v1-MemoryInfo) |  | Memory Inventory |
| pci | [PCIeDeviceInfo](#opi_api-inventory-v1-PCIeDeviceInfo) | repeated | PCI Devices Inventory |






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
| GetInventory | [GetInventoryRequest](#opi_api-inventory-v1-GetInventoryRequest) | [Inventory](#opi_api-inventory-v1-Inventory) | retrieves the inventory data for the device |

 



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

