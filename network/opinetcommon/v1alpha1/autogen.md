# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [networkethernet.proto](#networkethernet-proto)
    - [EthernetConfig](#opi_api-network-opinetcommon-v1alpha1-EthernetConfig)
    - [EthernetCounters](#opi_api-network-opinetcommon-v1alpha1-EthernetCounters)
    - [EthernetInDistribution](#opi_api-network-opinetcommon-v1alpha1-EthernetInDistribution)
    - [EthernetInterface](#opi_api-network-opinetcommon-v1alpha1-EthernetInterface)
    - [EthernetState](#opi_api-network-opinetcommon-v1alpha1-EthernetState)
  
    - [EthDuplexMode](#opi_api-network-opinetcommon-v1alpha1-EthDuplexMode)
    - [EthFecMode](#opi_api-network-opinetcommon-v1alpha1-EthFecMode)
    - [EthPortSpeed](#opi_api-network-opinetcommon-v1alpha1-EthPortSpeed)
  
- [networkinterfaces.proto](#networkinterfaces-proto)
    - [GetNetInterfaceRequest](#opi_api-network-opinetcommon-v1alpha1-GetNetInterfaceRequest)
    - [ListNetInterfacesRequest](#opi_api-network-opinetcommon-v1alpha1-ListNetInterfacesRequest)
    - [ListNetInterfacesResponse](#opi_api-network-opinetcommon-v1alpha1-ListNetInterfacesResponse)
    - [NetInterface](#opi_api-network-opinetcommon-v1alpha1-NetInterface)
    - [NetInterface.HoldTime](#opi_api-network-opinetcommon-v1alpha1-NetInterface-HoldTime)
    - [NetInterface.HoldTime.HoldConfig](#opi_api-network-opinetcommon-v1alpha1-NetInterface-HoldTime-HoldConfig)
    - [NetInterface.HoldTime.HoldState](#opi_api-network-opinetcommon-v1alpha1-NetInterface-HoldTime-HoldState)
    - [NetInterface.Subinterfaces](#opi_api-network-opinetcommon-v1alpha1-NetInterface-Subinterfaces)
    - [NetInterface.Subinterfaces.Subinterface](#opi_api-network-opinetcommon-v1alpha1-NetInterface-Subinterfaces-Subinterface)
    - [NetInterface.Subinterfaces.Subinterface.SubifConfig](#opi_api-network-opinetcommon-v1alpha1-NetInterface-Subinterfaces-Subinterface-SubifConfig)
    - [NetInterfaceConfig](#opi_api-network-opinetcommon-v1alpha1-NetInterfaceConfig)
    - [NetInterfaceCounters](#opi_api-network-opinetcommon-v1alpha1-NetInterfaceCounters)
    - [NetInterfaceState](#opi_api-network-opinetcommon-v1alpha1-NetInterfaceState)
    - [UpdateNetInterfaceRequest](#opi_api-network-opinetcommon-v1alpha1-UpdateNetInterfaceRequest)
  
    - [InterfaceType](#opi_api-network-opinetcommon-v1alpha1-InterfaceType)
    - [OperState](#opi_api-network-opinetcommon-v1alpha1-OperState)
  
    - [NetInterfaceService](#opi_api-network-opinetcommon-v1alpha1-NetInterfaceService)
  
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
  
- [networkvlan.proto](#networkvlan-proto)
    - [SwitchedVlanSetting](#opi_api-network-opinetcommon-v1alpha1-SwitchedVlanSetting)
    - [VlanIf](#opi_api-network-opinetcommon-v1alpha1-VlanIf)
    - [VlanIf.VlanEgressMapping](#opi_api-network-opinetcommon-v1alpha1-VlanIf-VlanEgressMapping)
    - [VlanIf.VlanIngressMapping](#opi_api-network-opinetcommon-v1alpha1-VlanIf-VlanIngressMapping)
    - [VlanIf.VlanMatch](#opi_api-network-opinetcommon-v1alpha1-VlanIf-VlanMatch)
    - [VlanIf.VlanMatch.SingleTagged](#opi_api-network-opinetcommon-v1alpha1-VlanIf-VlanMatch-SingleTagged)
    - [VlanIf.VlanMatch.SingleTagged.SingleTagConfig](#opi_api-network-opinetcommon-v1alpha1-VlanIf-VlanMatch-SingleTagged-SingleTagConfig)
    - [VlanIf.VlanMatch.SingleTagged.SingleTagState](#opi_api-network-opinetcommon-v1alpha1-VlanIf-VlanMatch-SingleTagged-SingleTagState)
    - [VlanIf.VlanMatch.SingleTaggedList](#opi_api-network-opinetcommon-v1alpha1-VlanIf-VlanMatch-SingleTaggedList)
    - [VlanIf.VlanMatch.SingleTaggedList.TagListConfig](#opi_api-network-opinetcommon-v1alpha1-VlanIf-VlanMatch-SingleTaggedList-TagListConfig)
    - [VlanIf.VlanMatch.SingleTaggedList.TagListStatus](#opi_api-network-opinetcommon-v1alpha1-VlanIf-VlanMatch-SingleTaggedList-TagListStatus)
    - [VlanIngressEgressSetting](#opi_api-network-opinetcommon-v1alpha1-VlanIngressEgressSetting)
    - [VlanSwitchedIf](#opi_api-network-opinetcommon-v1alpha1-VlanSwitchedIf)
  
    - [TpidTypes](#opi_api-network-opinetcommon-v1alpha1-TpidTypes)
    - [VlanIfMode](#opi_api-network-opinetcommon-v1alpha1-VlanIfMode)
    - [VlanStackAction](#opi_api-network-opinetcommon-v1alpha1-VlanStackAction)
  
- [Scalar Value Types](#scalar-value-types)



<a name="networkethernet-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## networkethernet.proto
SPDX-License-Identifier: Apache-2.0
Copyright (c) 2024 Dell Inc, or its subsidiaries.

Derived from the OpenConfig interfaces model github.com/openconfig/public/release/models/interfaces

(-- api-linter: core::0141::forbidden-types=disabled
    aip.dev/not-precedent: counters, mtu, index must be uint and not int. --)


<a name="opi_api-network-opinetcommon-v1alpha1-EthernetConfig"></a>

### EthernetConfig
Ethernet Configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| mac_address | [string](#string) |  | MAC address to assign to the Ethernet Interface if not assigned |
| auto_negotiate | [bool](#bool) |  | Set to TRUE to request autonegotiate the transmission parameters with the peer interface |
| standalone_link_training | [bool](#bool) |  | Used when full autonegotiation is not desired by setting to TRUE and setting auto_negotiate to FALSE. It is ignored when auto-negotiate is set to TRUE. |
| duplex_mode | [EthDuplexMode](#opi_api-network-opinetcommon-v1alpha1-EthDuplexMode) |  | Optionally sets the duplex mode that is advertised to the peer interface |
| port_speed | [EthPortSpeed](#opi_api-network-opinetcommon-v1alpha1-EthPortSpeed) |  | Optionally sets the port speed that is advertised to the peer interface |
| enable_flow_control | [bool](#bool) |  | Override for the negotiated flow control on the interface |
| fec_mode | [EthFecMode](#opi_api-network-opinetcommon-v1alpha1-EthFecMode) |  | FEC applied to the physical channel of the interface |






<a name="opi_api-network-opinetcommon-v1alpha1-EthernetCounters"></a>

### EthernetCounters
Ethernet Interface Counters


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| rx_mac_control_frames | [uint64](#uint64) |  | received mac control frame counter |
| rx_mac_pause_frames | [uint64](#uint64) |  | received mac pause frame counter |
| rx_oversize_frames | [uint64](#uint64) |  | frames received that were oversized on the interface (larger then 1518 octets) |
| rx_undersize_frames | [uint64](#uint64) |  | frames received that were undersized on the interface (smaller then 64 octets) |
| rx_jabber_frames | [uint64](#uint64) |  | Number of jabber frames received on the interface. Jabber frames are typically defined as oversize frames which also have a bad CRC |
| rx_fragment_frames | [uint64](#uint64) |  | The total number of frames received that were less than 64 octets in length (excluding framing bits but including FCS octets) and had either a bad Frame Check Sequence (FCS) with an integral number of octets (FCS Error) or a bad FCS with a non-integral number of octets (Alignment Error) |
| rx_ieee8021q_frames | [uint64](#uint64) |  | Number of 802.1q tagged frames received on the interface |
| rx_crc_errors | [uint64](#uint64) |  | The total number of frames received that had FCS errors |
| rx_block_errors | [uint64](#uint64) |  | The number of received errored blocks |
| rx_carrier_errors | [uint64](#uint64) |  | The number of received errored frames due to a carrier issue |
| rx_interrupted_tx | [uint64](#uint64) |  | The number of received errored frames due to interrupted transmission issue |
| rx_late_collision | [uint64](#uint64) |  | The number of received errored frames due to late collision issue |
| rx_mac_errors_rx | [uint64](#uint64) |  | The number of received errored frames due to MAC errors received |
| rx_single_collision | [uint64](#uint64) |  | The number of received errored frames due to single collision issue |
| rx_symbol_error | [uint64](#uint64) |  | The number of received errored frames due to symbol error |
| rx_maxsize_exceeded | [uint64](#uint64) |  | The total number frames received that are well-formed but dropped due to exceeding the maximum frame size on the interface |
| out_mac_control_frames | [uint64](#uint64) |  | MAC layer control frames sent on the interface |
| out_mac_pause_frames | [uint64](#uint64) |  | MAC layer PAUSE frames sent on the interface |
| out_ieee8021q_frames | [uint64](#uint64) |  | Number of 802.1q tagged frames sent on the interface |
| out_mac_errors_tx | [uint64](#uint64) |  | The number of sent errored frames due to MAC errors transmitted |
| eth_rx_distribution | [EthernetInDistribution](#opi_api-network-opinetcommon-v1alpha1-EthernetInDistribution) |  | Receive Frame Distribution counters |






<a name="opi_api-network-opinetcommon-v1alpha1-EthernetInDistribution"></a>

### EthernetInDistribution
Ethernet receive frame distribution counters


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| rx_frames_octets64 | [uint64](#uint64) |  | Receive counter for 64 byte frames |
| rx_frames_octets65_to127 | [uint64](#uint64) |  | Receive counter for 65 to 127 byte frames |
| rx_frames_octets128_to255 | [uint64](#uint64) |  | Receive counter for 128 to 255 byte frames |
| rx_frames_octets256_to511 | [uint64](#uint64) |  | receive counter for 256 to 511 byte frames |
| rx_frames_octets512_to1023 | [uint64](#uint64) |  | receive counter for 512 to 1023 byte frames |
| rx_frames_octets1024_to1518 | [uint64](#uint64) |  | receive counter for 1024 to 1518 byte frames |






<a name="opi_api-network-opinetcommon-v1alpha1-EthernetInterface"></a>

### EthernetInterface
Ethernet Interface


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| config | [EthernetConfig](#opi_api-network-opinetcommon-v1alpha1-EthernetConfig) |  | Ethernet Interface Configuration settings |
| state | [EthernetState](#opi_api-network-opinetcommon-v1alpha1-EthernetState) |  | Ethernet Interface State information |
| switched_vlan | [VlanSwitchedIf](#opi_api-network-opinetcommon-v1alpha1-VlanSwitchedIf) |  | Switched VLAN Interface configuration for interface |






<a name="opi_api-network-opinetcommon-v1alpha1-EthernetState"></a>

### EthernetState
Ethernet interface state settings


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| mac_address | [string](#string) |  | MAC address to assign to the Ethernet Interface if not assigned or being overridden. |
| auto_negotiate | [bool](#bool) |  | Set to TRUE to request autonegotiate the transmission parameters with the peer interface |
| standalone_link_training | [bool](#bool) |  | Used when full autonegotiation is not desired by setting to TRUE and setting auto_negotiate to FALSE. It is ignored when auto-negotiate is set to TRUE. |
| duplex_mode | [EthDuplexMode](#opi_api-network-opinetcommon-v1alpha1-EthDuplexMode) |  | The duplex mode that is negotiated or set interface |
| port_speed | [EthPortSpeed](#opi_api-network-opinetcommon-v1alpha1-EthPortSpeed) |  | The port speed that is negotiated or set for the interface |
| enable_flow_control | [bool](#bool) |  | Override for the negotiated flow control on the interface |
| fec_mode | [EthFecMode](#opi_api-network-opinetcommon-v1alpha1-EthFecMode) |  | FEC applied to the physical channel of the interface |
| hw_mac_address | [string](#string) |  | Hardware MAC address defined for the interface |
| negotiated_duplex_mode | [EthDuplexMode](#opi_api-network-opinetcommon-v1alpha1-EthDuplexMode) |  | Negotiated Duplex mode for the interface |
| negotiated_port_speed | [EthPortSpeed](#opi_api-network-opinetcommon-v1alpha1-EthPortSpeed) |  | Negotiated Port Speed for the interface |
| counters | [EthernetCounters](#opi_api-network-opinetcommon-v1alpha1-EthernetCounters) |  | Ethernet port counters |





 


<a name="opi_api-network-opinetcommon-v1alpha1-EthDuplexMode"></a>

### EthDuplexMode
Ethernet Duplex Mode Definitions

| Name | Number | Description |
| ---- | ------ | ----------- |
| ETH_DUPLEX_MODE_UNSPECIFIED | 0 | Unspecified - interface will negotiate duplex speed directly |
| ETH_DUPLEX_MODE_FULL | 1 | Specify Full Duplex mode in autonegotiation |
| ETH_DUPLEX_MODE_HALF | 2 | Specify Half Duplex mode in autonegotiation |



<a name="opi_api-network-opinetcommon-v1alpha1-EthFecMode"></a>

### EthFecMode
Ethernet Forward Error Correction Mode Definitions

| Name | Number | Description |
| ---- | ------ | ----------- |
| ETH_FEC_MODE_UNSPECIFIED | 0 | Unspecified |
| ETH_FEC_MODE_FC | 1 | Firecode for NRZ channels with less then 100G |
| ETH_FEC_MODE_RS528 | 2 | RS528 is used for channels with NRZ modulation. This FEC is designed to comply with IEEE 802.3, Clause 91. |
| ETH_FEC_MODE_RS544 | 3 | RS544 is used for channels with PAM4 modulation |
| ETH_FEC_MODE_RS544_2X_INTERLEAVE | 4 | RS544-2x-interleave is used for channels with PAM4 modulation |
| ETH_FEC_MODE_DISABLED | 5 | FEC is administratively disabled |



<a name="opi_api-network-opinetcommon-v1alpha1-EthPortSpeed"></a>

### EthPortSpeed
Ethernet Port Speed Definitions

| Name | Number | Description |
| ---- | ------ | ----------- |
| ETH_PORT_SPEED_UNSPECIFIED | 0 | Unspecified - interface will negotiate port speed with the peer interface |
| ETH_PORT_SPEED_10M | 1 | 10M port speed |
| ETH_PORT_SPEED_100M | 2 | 100M port speed |
| ETH_PORT_SPEED_1G | 3 | 1G port speed |
| ETH_PORT_SPEED_2500M | 4 | 2.5G port speed |
| ETH_PORT_SPEED_5G | 5 | 5G port speed |
| ETH_PORT_SPEED_10G | 6 | 10G port speed |
| ETH_PORT_SPEED_25G | 7 | 25G port speed |
| ETH_PORT_SPEED_40G | 8 | 40G port speed |
| ETH_PORT_SPEED_50G | 9 | 50G port speed |
| ETH_PORT_SPEED_100G | 10 | 100G port speed |
| ETH_PORT_SPEED_200G | 11 | 200G port speed |
| ETH_PORT_SPEED_400G | 12 | 400G port speed |
| ETH_PORT_SPEED_600G | 13 | 600G port speed |
| ETH_PORT_SPEED_800G | 14 | 800G port speed |
| ETH_PORT_SPEED_UNKNOWN | 15 | Interface speed is unknown. Systems may report speed UNKNOWN when an interface is down or unpopuplated |


 

 

 



<a name="networkinterfaces-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## networkinterfaces.proto
SPDX-License-Identifier: Apache-2.0
Copyright (c) 2023-2024 Dell Inc, or its subsidiaries.

Derived from the OpenConfig interfaces model github.com/openconfig/public/release/models/interfaces

(-- api-linter: core::0141::forbidden-types=disabled
    aip.dev/not-precedent: counters, mtu, index must be uint and not int. --)


<a name="opi_api-network-opinetcommon-v1alpha1-GetNetInterfaceRequest"></a>

### GetNetInterfaceRequest
Get Interface Request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Name of interface requested |






<a name="opi_api-network-opinetcommon-v1alpha1-ListNetInterfacesRequest"></a>

### ListNetInterfacesRequest
List Interfaces Request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | parent |
| page_size | [int32](#int32) |  | page size |
| page_token | [string](#string) |  | page token |






<a name="opi_api-network-opinetcommon-v1alpha1-ListNetInterfacesResponse"></a>

### ListNetInterfacesResponse
List of Interfaces Response


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| net_interfaces | [NetInterface](#opi_api-network-opinetcommon-v1alpha1-NetInterface) | repeated | List of interfaces |
| next_page_token | [string](#string) |  | next page token |






<a name="opi_api-network-opinetcommon-v1alpha1-NetInterface"></a>

### NetInterface
Interface - physical or virtual interface reported
(-- api-linter: core::0123::resource-annotation=disabled
    aip.dev/not-precedent: the name field is an opaque object --)


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Name of the interface. This is an opaque object that is not user settable. It is returned by the created object |
| config | [NetInterfaceConfig](#opi_api-network-opinetcommon-v1alpha1-NetInterfaceConfig) |  | Configuration settings - rw |
| state | [NetInterfaceState](#opi_api-network-opinetcommon-v1alpha1-NetInterfaceState) |  | Interface State and Statistics - ro |
| holdtime | [NetInterface.HoldTime](#opi_api-network-opinetcommon-v1alpha1-NetInterface-HoldTime) |  | Hold Time Settings |
| subinterfaces | [NetInterface.Subinterfaces](#opi_api-network-opinetcommon-v1alpha1-NetInterface-Subinterfaces) |  | Subinterfaces assigned to the interface |
| ethernet | [EthernetInterface](#opi_api-network-opinetcommon-v1alpha1-EthernetInterface) |  | Ethernet interface |






<a name="opi_api-network-opinetcommon-v1alpha1-NetInterface-HoldTime"></a>

### NetInterface.HoldTime
Hold Time Settings


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| hold_config | [NetInterface.HoldTime.HoldConfig](#opi_api-network-opinetcommon-v1alpha1-NetInterface-HoldTime-HoldConfig) |  | Hold Time Config |
| hold_state | [NetInterface.HoldTime.HoldState](#opi_api-network-opinetcommon-v1alpha1-NetInterface-HoldTime-HoldState) |  | Hold State Settings |






<a name="opi_api-network-opinetcommon-v1alpha1-NetInterface-HoldTime-HoldConfig"></a>

### NetInterface.HoldTime.HoldConfig
Hold Time Config - rw


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| up | [uint32](#uint32) |  | Hold time up |
| down | [uint32](#uint32) |  | Hold time down |






<a name="opi_api-network-opinetcommon-v1alpha1-NetInterface-HoldTime-HoldState"></a>

### NetInterface.HoldTime.HoldState
Hold State Settings - ro


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| up | [uint32](#uint32) |  | Hold state up |
| down | [uint32](#uint32) |  | Hold state down |






<a name="opi_api-network-opinetcommon-v1alpha1-NetInterface-Subinterfaces"></a>

### NetInterface.Subinterfaces
Subinterfaces settings - VLAN, etc.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| subinterface | [NetInterface.Subinterfaces.Subinterface](#opi_api-network-opinetcommon-v1alpha1-NetInterface-Subinterfaces-Subinterface) | repeated | Subinterface Settings |






<a name="opi_api-network-opinetcommon-v1alpha1-NetInterface-Subinterfaces-Subinterface"></a>

### NetInterface.Subinterfaces.Subinterface
Subinterface settings


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| index | [int64](#int64) |  | Subinterface index |
| subif_config | [NetInterface.Subinterfaces.Subinterface.SubifConfig](#opi_api-network-opinetcommon-v1alpha1-NetInterface-Subinterfaces-Subinterface-SubifConfig) |  | Subinterface Configuration |
| state | [NetInterfaceState](#opi_api-network-opinetcommon-v1alpha1-NetInterfaceState) |  | Subinterface State and Statistics |
| vlan | [VlanIf](#opi_api-network-opinetcommon-v1alpha1-VlanIf) |  | Subinterface VLAN |






<a name="opi_api-network-opinetcommon-v1alpha1-NetInterface-Subinterfaces-Subinterface-SubifConfig"></a>

### NetInterface.Subinterfaces.Subinterface.SubifConfig
Subinterface configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| index | [uint64](#uint64) |  | Subinterface Index |
| description | [string](#string) |  | Subinterface description |
| enabled | [bool](#bool) |  | Subinterface enabled |






<a name="opi_api-network-opinetcommon-v1alpha1-NetInterfaceConfig"></a>

### NetInterfaceConfig
Interface config
(-- api-linter: core::0123::resource-annotation=disabled
    aip.dev/not-precedent: the name field is an opaque object --)


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Name of the interface. This is the opaque object used for designating the created interface. |
| type | [InterfaceType](#opi_api-network-opinetcommon-v1alpha1-InterfaceType) |  | Type of interface - Ethernet and others |
| mtu | [uint32](#uint32) |  | MTU for the interface that can be configured |
| loopback_mode | [bool](#bool) |  | Setting the loopback mode of the interface |
| description | [string](#string) |  | Description of the interface and usage |
| enabled | [bool](#bool) |  | Setting for enabling/disabling the interface |
| tpid | [TpidTypes](#opi_api-network-opinetcommon-v1alpha1-TpidTypes) |  | VLAN Tag Protocol Identifier (TPID) |






<a name="opi_api-network-opinetcommon-v1alpha1-NetInterfaceCounters"></a>

### NetInterfaceCounters
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
| last_clear | [uint64](#uint64) |  | Timestamp of the last time the interface counters were cleared |






<a name="opi_api-network-opinetcommon-v1alpha1-NetInterfaceState"></a>

### NetInterfaceState
Interface State information - ro
(-- api-linter: core::0123::resource-annotation=disabled
    aip.dev/not-precedent: the name field is an opaque object --)


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Name of the interface. This is the opaque object used for designating the created interface. |
| type | [InterfaceType](#opi_api-network-opinetcommon-v1alpha1-InterfaceType) |  | Interface type indicator |
| mtu | [uint32](#uint32) |  | Configured MTU size |
| loopback_mode | [bool](#bool) |  | Configured Loopback mode |
| description | [string](#string) |  | Interface description |
| enabled | [bool](#bool) |  | Interface enabled indicator |
| ifindex | [uint32](#uint32) |  | Interface Index |
| admin_state | [AdminState](#opi_api-network-opinetcommon-v1alpha1-AdminState) |  | Admin State |
| oper_state | [OperState](#opi_api-network-opinetcommon-v1alpha1-OperState) |  | Operational State |
| last_change | [uint64](#uint64) |  | Last Change |
| logical | [bool](#bool) |  | Logical interface - when set to true indicates a logical interface with no associated physical port or channel |
| management | [bool](#bool) |  | Management interface - when set to true indicates a dedicated management interface that is independent of the dataplane interfaces such as an out of band management network |
| cpu | [bool](#bool) |  | CPU interface - when set to true the interface is for traffic handled by the system CPU or control plane |
| counters | [NetInterfaceCounters](#opi_api-network-opinetcommon-v1alpha1-NetInterfaceCounters) |  | Interface Statistics Counters |
| tpid | [TpidTypes](#opi_api-network-opinetcommon-v1alpha1-TpidTypes) |  | VLAN Tag Protocol Identifier |






<a name="opi_api-network-opinetcommon-v1alpha1-UpdateNetInterfaceRequest"></a>

### UpdateNetInterfaceRequest
Update Interface Request


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| net_interface | [NetInterface](#opi_api-network-opinetcommon-v1alpha1-NetInterface) |  | Interface update settings |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | list of fields to update |
| allow_missing | [bool](#bool) |  | If set to true, and the object is not found, a new object will be created. In this situation, &#39;update_mask&#39; is ignored. |





 


<a name="opi_api-network-opinetcommon-v1alpha1-InterfaceType"></a>

### InterfaceType
Interface Types Enumeration

| Name | Number | Description |
| ---- | ------ | ----------- |
| INTERFACE_TYPE_UNSPECIFIED | 0 | Interface Unspecified |
| INTERFACE_TYPE_ETHERNET | 1 | Ethernet Interface |
| INTERFACE_TYPE_LOOPBACK | 2 | Loopback Interface |



<a name="opi_api-network-opinetcommon-v1alpha1-OperState"></a>

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


 

 


<a name="opi_api-network-opinetcommon-v1alpha1-NetInterfaceService"></a>

### NetInterfaceService
Service functions for Network Interface exported by the server

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| GetNetInterface | [GetNetInterfaceRequest](#opi_api-network-opinetcommon-v1alpha1-GetNetInterfaceRequest) | [NetInterface](#opi_api-network-opinetcommon-v1alpha1-NetInterface) | Retrieves the interface information for a given interface |
| ListNetInterfaces | [ListNetInterfacesRequest](#opi_api-network-opinetcommon-v1alpha1-ListNetInterfacesRequest) | [ListNetInterfacesResponse](#opi_api-network-opinetcommon-v1alpha1-ListNetInterfacesResponse) | Retrieves the set of interfaces on the device |
| UpdateNetInterface | [UpdateNetInterfaceRequest](#opi_api-network-opinetcommon-v1alpha1-UpdateNetInterfaceRequest) | [NetInterface](#opi_api-network-opinetcommon-v1alpha1-NetInterface) | A method for setting or changing configuration of an interface |

 



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
| ADMIN_STATE_TESTING | 3 | testing |



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
| WILDCARD_MATCH_NONE | 0 | wouldn&#39;t match anything (-- api-linter: core::0126::unspecified=disabled aip.dev/not-precedent: NONE means don&#39;t match anything. --) |
| WILDCARD_MATCH_ANY | 256 | match everything |


 

 

 



<a name="networkvlan-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## networkvlan.proto
SPDX-License-Identifier: Apache-2.0
Copyright (c) 2024 Dell Inc, or its subsidiaries.

Derived from the OpenConfig interfaces model github.com/openconfig/public/release/models/vlan

(-- api-linter: core::0141::forbidden-types=disabled
    aip.dev/not-precedent: counters, mtu, index must be uint and not int. --)


<a name="opi_api-network-opinetcommon-v1alpha1-SwitchedVlanSetting"></a>

### SwitchedVlanSetting
Switched VLAN Configuration Settings that are part of the Ethernet interface


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vlan_interface_mode | [VlanIfMode](#opi_api-network-opinetcommon-v1alpha1-VlanIfMode) |  | Setting for the VLAN interface to access or trunk mode |
| native_vlan | [uint32](#uint32) |  | VLAN ID when the mode is set to trunk mode |
| access_vlan | [uint32](#uint32) |  | VLAN ID when the mode is set to access mode |
| trunk_vlans | [string](#string) |  | Allowed VLANs may be specified for trunk mode interfaces |






<a name="opi_api-network-opinetcommon-v1alpha1-VlanIf"></a>

### VlanIf
VLAN Interface Configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| match | [VlanIf.VlanMatch](#opi_api-network-opinetcommon-v1alpha1-VlanIf-VlanMatch) |  | VLAN Tag matching schemes |
| ingressmapping | [VlanIf.VlanIngressMapping](#opi_api-network-opinetcommon-v1alpha1-VlanIf-VlanIngressMapping) |  | Ingress VLAN stack behaviors after received packets have matched |
| egressmapping | [VlanIf.VlanEgressMapping](#opi_api-network-opinetcommon-v1alpha1-VlanIf-VlanEgressMapping) |  | Egress VLAN stack behaviors for output packets |






<a name="opi_api-network-opinetcommon-v1alpha1-VlanIf-VlanEgressMapping"></a>

### VlanIf.VlanEgressMapping
Egress VLAN stack behaviors for packets that are destined for output via
this subinterface


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| config | [VlanIngressEgressSetting](#opi_api-network-opinetcommon-v1alpha1-VlanIngressEgressSetting) |  | Configuration for egress VLAN stack behaviors for packets that are destined for output via this subinterface |
| state | [VlanIngressEgressSetting](#opi_api-network-opinetcommon-v1alpha1-VlanIngressEgressSetting) |  | State for engress VLAN stack behaviors for packets that are destined for output via this subinterface |






<a name="opi_api-network-opinetcommon-v1alpha1-VlanIf-VlanIngressMapping"></a>

### VlanIf.VlanIngressMapping
Ingress VLAN stack behaviors for packets that arrive on this subinterface
after their VLAN idenitifer(s) have been matched


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| config | [VlanIngressEgressSetting](#opi_api-network-opinetcommon-v1alpha1-VlanIngressEgressSetting) |  | Configuration for ingress VLAN and label behaviors for packets that arrive on this subinterface |
| state | [VlanIngressEgressSetting](#opi_api-network-opinetcommon-v1alpha1-VlanIngressEgressSetting) |  | State for ingress VLAN and label behaviors for packets that arrive on this subinterface |






<a name="opi_api-network-opinetcommon-v1alpha1-VlanIf-VlanMatch"></a>

### VlanIf.VlanMatch
Configuration for VLAN tag matching schemes


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| singletagged | [VlanIf.VlanMatch.SingleTagged](#opi_api-network-opinetcommon-v1alpha1-VlanIf-VlanMatch-SingleTagged) |  | Single tagged VLAN exact matching |
| singletaggedlist | [VlanIf.VlanMatch.SingleTaggedList](#opi_api-network-opinetcommon-v1alpha1-VlanIf-VlanMatch-SingleTaggedList) |  | Single tag list VLAN matching |






<a name="opi_api-network-opinetcommon-v1alpha1-VlanIf-VlanMatch-SingleTagged"></a>

### VlanIf.VlanMatch.SingleTagged
Single Tagged matching of exact VLAN identifier


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| config | [VlanIf.VlanMatch.SingleTagged.SingleTagConfig](#opi_api-network-opinetcommon-v1alpha1-VlanIf-VlanMatch-SingleTagged-SingleTagConfig) |  | Configuration for exact matching of single tagged packets |
| state | [VlanIf.VlanMatch.SingleTagged.SingleTagState](#opi_api-network-opinetcommon-v1alpha1-VlanIf-VlanMatch-SingleTagged-SingleTagState) |  | State for exact matching of single tagged packets |






<a name="opi_api-network-opinetcommon-v1alpha1-VlanIf-VlanMatch-SingleTagged-SingleTagConfig"></a>

### VlanIf.VlanMatch.SingleTagged.SingleTagConfig
Configuration for matching single-tagged packets with an exact
VLAN identifier


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vlan_id | [uint32](#uint32) |  | Single tag VLAN Identifier (1-4094) |






<a name="opi_api-network-opinetcommon-v1alpha1-VlanIf-VlanMatch-SingleTagged-SingleTagState"></a>

### VlanIf.VlanMatch.SingleTagged.SingleTagState
State for matching single-tagged packets with an exact VLAN


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vlan_id | [uint32](#uint32) |  | Single tag VLAN Identifier configured (1-4094) |






<a name="opi_api-network-opinetcommon-v1alpha1-VlanIf-VlanMatch-SingleTaggedList"></a>

### VlanIf.VlanMatch.SingleTaggedList
Single tagged list matching configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| config | [VlanIf.VlanMatch.SingleTaggedList.TagListConfig](#opi_api-network-opinetcommon-v1alpha1-VlanIf-VlanMatch-SingleTaggedList-TagListConfig) |  | Configuration for single tagged VLAN list |
| status | [VlanIf.VlanMatch.SingleTaggedList.TagListStatus](#opi_api-network-opinetcommon-v1alpha1-VlanIf-VlanMatch-SingleTaggedList-TagListStatus) |  | State for sintle tagged list |






<a name="opi_api-network-opinetcommon-v1alpha1-VlanIf-VlanMatch-SingleTaggedList-TagListConfig"></a>

### VlanIf.VlanMatch.SingleTaggedList.TagListConfig
Configuration for matching single-tagged packets with a list of
VLAN identifiers


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vlan_id | [uint32](#uint32) | repeated | List of VLAN identifiers for single-tagged packets |






<a name="opi_api-network-opinetcommon-v1alpha1-VlanIf-VlanMatch-SingleTaggedList-TagListStatus"></a>

### VlanIf.VlanMatch.SingleTaggedList.TagListStatus
State for matching single-tagged packets with a list of VLAN
identifiers


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vlanid | [uint32](#uint32) | repeated | List of VLAN identifiers configured for single-tagged packets |






<a name="opi_api-network-opinetcommon-v1alpha1-VlanIngressEgressSetting"></a>

### VlanIngressEgressSetting
VLAN Ingress and Egress Settings


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vlanstackaction | [VlanStackAction](#opi_api-network-opinetcommon-v1alpha1-VlanStackAction) |  | VLAN stack behaviors for packets that arrive or are transmitted on this subinterface after their VLAN idenitifer(s) have been matched |
| vlan_id | [uint32](#uint32) |  | VLAN identifier - (1-4094) and will utilize 16 bits max |
| tpid | [TpidTypes](#opi_api-network-opinetcommon-v1alpha1-TpidTypes) |  | The tag protocol identifier field (TPID) that is used by the action configured by &#39;vlan-stack-action&#39; when modifying the VLAN stack. |






<a name="opi_api-network-opinetcommon-v1alpha1-VlanSwitchedIf"></a>

### VlanSwitchedIf
VLAN settings associated with the Ethernet Interface


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| config | [SwitchedVlanSetting](#opi_api-network-opinetcommon-v1alpha1-SwitchedVlanSetting) |  | Configuration parameters for VLAN |
| state | [SwitchedVlanSetting](#opi_api-network-opinetcommon-v1alpha1-SwitchedVlanSetting) |  | State variables for VLAN |





 


<a name="opi_api-network-opinetcommon-v1alpha1-TpidTypes"></a>

### TpidTypes
Tag Protocol Identifier (TPID) Types Enumeration

| Name | Number | Description |
| ---- | ------ | ----------- |
| TPID_TYPES_UNSPECIFIED | 0 | Unspecified |
| TPID_TYPES_0X8100 | 1 | Default value for 802.1q single-tagged VLANs |
| TPID_TYPES_0X88A8 | 2 | Value for 802.1ad provider bridging, QinQ, or stacked VLANs |
| TPID_TYPES_0X9100 | 3 | Alternate TPID value |
| TPID_TYPES_0X9200 | 4 | Alternate TPID value |
| TPID_TYPES_ANY | 5 | Any - Wildcard that matches any of the singly or multiply tagged VLANS |



<a name="opi_api-network-opinetcommon-v1alpha1-VlanIfMode"></a>

### VlanIfMode
VLAN Interface Mode

| Name | Number | Description |
| ---- | ------ | ----------- |
| VLAN_IF_MODE_UNSPECIFIED | 0 | Interface Mode Unspecified |
| VLAN_IF_MODE_ACCESS | 1 | Interface mode ACCESS |
| VLAN_IF_MODE_TRUNK | 2 | Interface mode TRUNK |



<a name="opi_api-network-opinetcommon-v1alpha1-VlanStackAction"></a>

### VlanStackAction
Vlan Stack Action to be performed on the VLAN stack

| Name | Number | Description |
| ---- | ------ | ----------- |
| VLAN_STACK_ACTION_UNSPECIFIED | 0 | No action to perform on the VLAN Stack |
| VLAN_STACK_ACTION_PUSH | 1 | PUSH a VLAN onto the VLAN Stack |
| VLAN_STACK_ACTION_POP | 2 | POP a VLAN from the VLAN Stack |
| VLAN_STACK_ACTION_SWAP | 3 | SWAP the VLAN at the top of the VLAN Stack |


 

 

 



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

