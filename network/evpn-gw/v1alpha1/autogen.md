# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [l2_xpu_infra_mgr.proto](#l2_xpu_infra_mgr-proto)
    - [BridgePort](#opi_api-network-evpn_gw-v1alpha1-BridgePort)
    - [CreateBridgePortRequest](#opi_api-network-evpn_gw-v1alpha1-CreateBridgePortRequest)
    - [CreateLogicalBridgeRequest](#opi_api-network-evpn_gw-v1alpha1-CreateLogicalBridgeRequest)
    - [DeleteBridgePortRequest](#opi_api-network-evpn_gw-v1alpha1-DeleteBridgePortRequest)
    - [DeleteLogicalBridgeRequest](#opi_api-network-evpn_gw-v1alpha1-DeleteLogicalBridgeRequest)
    - [GetBridgePortRequest](#opi_api-network-evpn_gw-v1alpha1-GetBridgePortRequest)
    - [GetLogicalBridgeRequest](#opi_api-network-evpn_gw-v1alpha1-GetLogicalBridgeRequest)
    - [ListBridgePortsRequest](#opi_api-network-evpn_gw-v1alpha1-ListBridgePortsRequest)
    - [ListBridgePortsResponse](#opi_api-network-evpn_gw-v1alpha1-ListBridgePortsResponse)
    - [ListLogicalBridgesRequest](#opi_api-network-evpn_gw-v1alpha1-ListLogicalBridgesRequest)
    - [ListLogicalBridgesResponse](#opi_api-network-evpn_gw-v1alpha1-ListLogicalBridgesResponse)
    - [LogicalBridge](#opi_api-network-evpn_gw-v1alpha1-LogicalBridge)
  
    - [BridgePort.BridgePortType](#opi_api-network-evpn_gw-v1alpha1-BridgePort-BridgePortType)
  
    - [BridgePortService](#opi_api-network-evpn_gw-v1alpha1-BridgePortService)
    - [LogicalBridgeService](#opi_api-network-evpn_gw-v1alpha1-LogicalBridgeService)
  
- [l3_xpu_infra_mgr.proto](#l3_xpu_infra_mgr-proto)
    - [CreateSviRequest](#opi_api-network-evpn_gw-v1alpha1-CreateSviRequest)
    - [CreateVrfRequest](#opi_api-network-evpn_gw-v1alpha1-CreateVrfRequest)
    - [DeleteSviRequest](#opi_api-network-evpn_gw-v1alpha1-DeleteSviRequest)
    - [DeleteVrfRequest](#opi_api-network-evpn_gw-v1alpha1-DeleteVrfRequest)
    - [GetSviRequest](#opi_api-network-evpn_gw-v1alpha1-GetSviRequest)
    - [GetVrfRequest](#opi_api-network-evpn_gw-v1alpha1-GetVrfRequest)
    - [IpAddressMasklen](#opi_api-network-evpn_gw-v1alpha1-IpAddressMasklen)
    - [ListSvisRequest](#opi_api-network-evpn_gw-v1alpha1-ListSvisRequest)
    - [ListSvisResponse](#opi_api-network-evpn_gw-v1alpha1-ListSvisResponse)
    - [ListVrfsRequest](#opi_api-network-evpn_gw-v1alpha1-ListVrfsRequest)
    - [ListVrfsResponse](#opi_api-network-evpn_gw-v1alpha1-ListVrfsResponse)
    - [Svi](#opi_api-network-evpn_gw-v1alpha1-Svi)
    - [Vrf](#opi_api-network-evpn_gw-v1alpha1-Vrf)
  
    - [SviService](#opi_api-network-evpn_gw-v1alpha1-SviService)
    - [VrfService](#opi_api-network-evpn_gw-v1alpha1-VrfService)
  
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



<a name="l2_xpu_infra_mgr-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## l2_xpu_infra_mgr.proto



<a name="opi_api-network-evpn_gw-v1alpha1-BridgePort"></a>

### BridgePort
BridgePort structure


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Free text description |
| vport_id | [uint32](#uint32) |  | Key. Read-only. Assigned by the server in CreateBridgePort (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: vport_id cannot be negative number. --) |
| mac_address | [string](#string) |  | Use &#34;aa:bb:cc:dd:ee:ff&#34; format |
| ptype | [BridgePort.BridgePortType](#opi_api-network-evpn_gw-v1alpha1-BridgePort-BridgePortType) |  | holds the type of the bridge port |
| vlan_id | [uint32](#uint32) | repeated | Configured vlan ids on the bridge port (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: vlan cannot be negative number. --) |






<a name="opi_api-network-evpn_gw-v1alpha1-CreateBridgePortRequest"></a>

### CreateBridgePortRequest
CreateBridgePortRequest structure


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| bridge_port | [BridgePort](#opi_api-network-evpn_gw-v1alpha1-BridgePort) |  | The bridge port to create |






<a name="opi_api-network-evpn_gw-v1alpha1-CreateLogicalBridgeRequest"></a>

### CreateLogicalBridgeRequest
CreateLogicalBridgeRequest structure


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| logical_bridge | [LogicalBridge](#opi_api-network-evpn_gw-v1alpha1-LogicalBridge) |  | The logical bridge to create |






<a name="opi_api-network-evpn_gw-v1alpha1-DeleteBridgePortRequest"></a>

### DeleteBridgePortRequest
(-- api-linter: core::0135::request-unknown-fields=disabled
    aip.dev/not-precedent: We really need &#34;vport_id&#34; because is used as key
    for deletion. --)
DeleteBridgePortRequest structure


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vport_id | [uint32](#uint32) |  | The vport id of the bridge port to delete (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: vport_id cannot be negative number. --) |






<a name="opi_api-network-evpn_gw-v1alpha1-DeleteLogicalBridgeRequest"></a>

### DeleteLogicalBridgeRequest
(-- api-linter: core::0135::request-unknown-fields=disabled
    aip.dev/not-precedent: We really need &#34;vlan_id&#34; because is used as key
    for deletion. --)
DeleteLogicalBridgeRequest structure


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vlan_id | [uint32](#uint32) |  | The vlan id of the logical bridge to delete (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: vlan cannot be negative number. --) |






<a name="opi_api-network-evpn_gw-v1alpha1-GetBridgePortRequest"></a>

### GetBridgePortRequest
(-- api-linter: core::0135::request-unknown-fields=disabled
    aip.dev/not-precedent: We really need &#34;vport_id&#34; because is used as key
    for the retrieve operation. --)
GetBridgePortRequest structure


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vport_id | [uint32](#uint32) |  | The vport id of the bridge port to retrieve (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: vport_id cannot be negative number. --) |






<a name="opi_api-network-evpn_gw-v1alpha1-GetLogicalBridgeRequest"></a>

### GetLogicalBridgeRequest
(-- api-linter: core::0135::request-unknown-fields=disabled
    aip.dev/not-precedent: We really need &#34;vlan_id&#34; because is used as key
    for the retrieve operation. --)
GetLogicalBridgeRequest structure


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vlan_id | [uint32](#uint32) |  | The vlan id of the logical bridge to retrieve (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: vlan cannot be negative number. --) |






<a name="opi_api-network-evpn_gw-v1alpha1-ListBridgePortsRequest"></a>

### ListBridgePortsRequest
ListBridgePortsRequest structure


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| page_size | [int32](#int32) |  | page size of list request |
| page_token | [string](#string) |  | page token of list request |






<a name="opi_api-network-evpn_gw-v1alpha1-ListBridgePortsResponse"></a>

### ListBridgePortsResponse
ListBridgePortsResponse structure


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| bridge_ports | [BridgePort](#opi_api-network-evpn_gw-v1alpha1-BridgePort) | repeated | List of all the bridge ports |
| next_page_token | [string](#string) |  | Next page token of list response |






<a name="opi_api-network-evpn_gw-v1alpha1-ListLogicalBridgesRequest"></a>

### ListLogicalBridgesRequest
ListLogicalBridgesRequest structure


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| page_size | [int32](#int32) |  | page size of list request |
| page_token | [string](#string) |  | page token of list request |






<a name="opi_api-network-evpn_gw-v1alpha1-ListLogicalBridgesResponse"></a>

### ListLogicalBridgesResponse
ListLogicalBridgesResponse structure


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| logical_bridges | [LogicalBridge](#opi_api-network-evpn_gw-v1alpha1-LogicalBridge) | repeated | List of all the logical bridges |
| next_page_token | [string](#string) |  | Next page token of list response |






<a name="opi_api-network-evpn_gw-v1alpha1-LogicalBridge"></a>

### LogicalBridge
LogicalBridge structure


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Free text description |
| vlan_id | [uint32](#uint32) |  | Key (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: vlan cannot be negative number. --) |
| vni | [uint32](#uint32) |  | VXLAN VNI for L2 EVPN. Also used as EVPN route target (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: vni cannot be negative number. --) |





 


<a name="opi_api-network-evpn_gw-v1alpha1-BridgePort-BridgePortType"></a>

### BridgePort.BridgePortType
Defines the available types of a bridge port

| Name | Number | Description |
| ---- | ------ | ----------- |
| UNKNOWN | 0 | &#34;unknown&#34; bridge port type |
| ACCESS | 1 | &#34;access&#34; bridge port type |
| TRUNK | 2 | &#34;trunk&#34; bridge port type |


 

 


<a name="opi_api-network-evpn_gw-v1alpha1-BridgePortService"></a>

### BridgePortService
Management of BridgePort resources

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| CreateBridgePort | [CreateBridgePortRequest](#opi_api-network-evpn_gw-v1alpha1-CreateBridgePortRequest) | [BridgePort](#opi_api-network-evpn_gw-v1alpha1-BridgePort) | Create a BridgePort (-- api-linter: core::0133::method-signature=disabled aip.dev/not-precedent: The &#34;bridge_port&#34; is top-level resource. --) |
| ListBridgePorts | [ListBridgePortsRequest](#opi_api-network-evpn_gw-v1alpha1-ListBridgePortsRequest) | [ListBridgePortsResponse](#opi_api-network-evpn_gw-v1alpha1-ListBridgePortsResponse) | List BridgePorts |
| GetBridgePort | [GetBridgePortRequest](#opi_api-network-evpn_gw-v1alpha1-GetBridgePortRequest) | [BridgePort](#opi_api-network-evpn_gw-v1alpha1-BridgePort) | Retrieve a BridgePort (-- api-linter: core::0131::method-signature=disabled aip.dev/not-precedent: &#34;vport_id&#34; is the key. --) (-- api-linter: client-libraries::4232::required-fields=disabled aip.dev/not-precedent: &#34;vport_id&#34; is the required field. --) (-- api-linter: core::0131::http-uri-name=disabled aip.dev/not-precedent: No &#34;name&#34; is used as key. --) |
| DeleteBridgePort | [DeleteBridgePortRequest](#opi_api-network-evpn_gw-v1alpha1-DeleteBridgePortRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) | Delete a BridgePort (-- api-linter: core::0135::method-signature=disabled aip.dev/not-precedent: &#34;vport_id&#34; is the key. --) (-- api-linter: client-libraries::4232::required-fields=disabled aip.dev/not-precedent: &#34;vport_id&#34; is the required field. --) (-- api-linter: core::0135::http-uri-name=disabled aip.dev/not-precedent: The &#34;name&#34; is not used as key. --) |


<a name="opi_api-network-evpn_gw-v1alpha1-LogicalBridgeService"></a>

### LogicalBridgeService
Management of LogicalBridge Resources

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| CreateLogicalBridge | [CreateLogicalBridgeRequest](#opi_api-network-evpn_gw-v1alpha1-CreateLogicalBridgeRequest) | [LogicalBridge](#opi_api-network-evpn_gw-v1alpha1-LogicalBridge) | Create a LogicalBridge (-- api-linter: core::0133::method-signature=disabled aip.dev/not-precedent: The &#34;logical_bridge&#34; is top-level resource. --) |
| ListLogicalBridges | [ListLogicalBridgesRequest](#opi_api-network-evpn_gw-v1alpha1-ListLogicalBridgesRequest) | [ListLogicalBridgesResponse](#opi_api-network-evpn_gw-v1alpha1-ListLogicalBridgesResponse) | List LogicalBridges |
| GetLogicalBridge | [GetLogicalBridgeRequest](#opi_api-network-evpn_gw-v1alpha1-GetLogicalBridgeRequest) | [LogicalBridge](#opi_api-network-evpn_gw-v1alpha1-LogicalBridge) | Retrieve a LogicalBridge (-- api-linter: core::0131::method-signature=disabled aip.dev/not-precedent: &#34;vlan_id&#34; is the key. --) (-- api-linter: client-libraries::4232::required-fields=disabled aip.dev/not-precedent: &#34;vlan_id&#34; is the required field. --) (-- api-linter: core::0131::http-uri-name=disabled aip.dev/not-precedent: No &#34;name&#34; is used as key. --) |
| DeleteLogicalBridge | [DeleteLogicalBridgeRequest](#opi_api-network-evpn_gw-v1alpha1-DeleteLogicalBridgeRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) | Delete a LogicalBridge (-- api-linter: core::0135::method-signature=disabled aip.dev/not-precedent: &#34;vlan_id&#34; is the key. --) (-- api-linter: client-libraries::4232::required-fields=disabled aip.dev/not-precedent: &#34;vlan_id&#34; is the required field. --) (-- api-linter: core::0135::http-uri-name=disabled aip.dev/not-precedent: The &#34;name&#34; is not used as key. --) |

 



<a name="l3_xpu_infra_mgr-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## l3_xpu_infra_mgr.proto



<a name="opi_api-network-evpn_gw-v1alpha1-CreateSviRequest"></a>

### CreateSviRequest
CreateSviRequest structure


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| svi | [Svi](#opi_api-network-evpn_gw-v1alpha1-Svi) |  | The Svi to create |






<a name="opi_api-network-evpn_gw-v1alpha1-CreateVrfRequest"></a>

### CreateVrfRequest
CreateVrfRequest structure


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vrf | [Vrf](#opi_api-network-evpn_gw-v1alpha1-Vrf) |  | The vrf to create |






<a name="opi_api-network-evpn_gw-v1alpha1-DeleteSviRequest"></a>

### DeleteSviRequest
(-- api-linter: core::0135::request-unknown-fields=disabled
    aip.dev/not-precedent: We really need &#34;vrf&#34;, &#34;vlan_id&#34; because are used as keys
    for deletion. --)
(-- api-linter: core::0135::request-name-required=disabled
    aip.dev/not-precedent: The &#34;vrf&#34;, &#34;vlan_id&#34; keys are used for deletion. --)
DeleteSviRequest structure


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vrf | [string](#string) |  | The name of the associated vrf |
| vlan_id | [uint32](#uint32) |  | The vlan id of the associated logical bridge (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: vlan cannot be negative number. --) |






<a name="opi_api-network-evpn_gw-v1alpha1-DeleteVrfRequest"></a>

### DeleteVrfRequest
DeleteVrfRequest structure


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | The name of the vrf to delete |






<a name="opi_api-network-evpn_gw-v1alpha1-GetSviRequest"></a>

### GetSviRequest
(-- api-linter: core::0135::request-unknown-fields=disabled
    aip.dev/not-precedent: We really need &#34;vrf&#34;, &#34;vlan_id&#34; because are used as keys
    for the retrieve operation. --)
(-- api-linter: core::0131::request-name-required=disabled
    aip.dev/not-precedent: We really need &#34;vrf&#34;, &#34;vlan_id&#34; because are used as keys
    for the retrieve operation. --)
(-- api-linter: core::0131::request-unknown-fields=disabled
    aip.dev/not-precedent: We really need &#34;vrf&#34;, &#34;vlan_id&#34; because are used as keys
    for the retrieve operation. --)
GetSviRequest structure


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vrf | [string](#string) |  | The name of the associated vrf |
| vlan_id | [uint32](#uint32) |  | The vlan id of the associated logical bridge (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: vlan cannot be negative number. --) |






<a name="opi_api-network-evpn_gw-v1alpha1-GetVrfRequest"></a>

### GetVrfRequest
GetVrfRequest structure


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | The name of the vrf to retrieve |






<a name="opi_api-network-evpn_gw-v1alpha1-IpAddressMasklen"></a>

### IpAddressMasklen
IpAddressMasklen structure


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| ip_addr | [string](#string) |  | IP address |
| len | [uint32](#uint32) |  | Length of the subnet prefix mask (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: subnet mask cannot be negative number. --) |






<a name="opi_api-network-evpn_gw-v1alpha1-ListSvisRequest"></a>

### ListSvisRequest
ListSvisRequest structure


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| page_size | [int32](#int32) |  | page size of list request |
| page_token | [string](#string) |  | page token of list request |






<a name="opi_api-network-evpn_gw-v1alpha1-ListSvisResponse"></a>

### ListSvisResponse
ListSvisResponse structure


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| svis | [Svi](#opi_api-network-evpn_gw-v1alpha1-Svi) | repeated | List of all the svis |
| next_page_token | [string](#string) |  | Next page token of list response |






<a name="opi_api-network-evpn_gw-v1alpha1-ListVrfsRequest"></a>

### ListVrfsRequest
ListVrfsRequest structure


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| page_size | [int32](#int32) |  | page size of list request |
| page_token | [string](#string) |  | page token of list request |






<a name="opi_api-network-evpn_gw-v1alpha1-ListVrfsResponse"></a>

### ListVrfsResponse
ListVrfsResponse structure


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vrfs | [Vrf](#opi_api-network-evpn_gw-v1alpha1-Vrf) | repeated | List of all the bridge ports |
| next_page_token | [string](#string) |  | Next page token of list response |






<a name="opi_api-network-evpn_gw-v1alpha1-Svi"></a>

### Svi
(-- api-linter: core::0123::resource-name-field=disabled
    aip.dev/not-precedent: The &#34;vrf&#34;, &#34;vlan_id&#34; are used for unique identification
    of the svi object. --)
Svi structure


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vrf | [string](#string) |  | Name of the VRF |
| vlan_id | [uint32](#uint32) |  | Key of the LogicalBridge (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: vlan cannot be negative number. --) |
| mac_address | [string](#string) |  | Use &#34;aa:bb:cc:dd:ee:ff&#34; format. Randomly assigned if not specified |
| gw_ip | [IpAddressMasklen](#opi_api-network-evpn_gw-v1alpha1-IpAddressMasklen) | repeated | The GW IP addresses with masks assigned to the SVI |
| enable_bgp | [bool](#bool) |  | Set to true to enable BGP peering with VRF on SVI |
| remote_as | [uint32](#uint32) |  | Conditional: The remote AS used by BGP speakers on LB (1-65535) (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: remote_as cannot be negative number. --) |






<a name="opi_api-network-evpn_gw-v1alpha1-Vrf"></a>

### Vrf
Vrf structure


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Key, also used as name of the Linux vrf device (max 9 chars) |
| vni | [uint32](#uint32) |  | VXLAN VNI for L3 EVPN. Also used as EVPN route target (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: vni cannot be negative number. --) |
| routing_table | [uint32](#uint32) |  | Linux routing table number (range 1001-3999). Defaults to vni (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: routing_table cannot be negative number. --) |
| loopback_ip | [string](#string) |  | IPv4 or IPv6 loopback address. Also serves as basis for RD in FRR |
| vtep_ip | [string](#string) |  | IPv4 or IPv6 IP address for the VXLAN TEP |
| local_as | [uint32](#uint32) |  | Read-only: Local AS configured for VRF (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: local_as cannot be negative number. --) |
| rd | [string](#string) |  | Read-only: Route distinguisher chosen by FRR |
| rmac | [string](#string) |  | Read-only: Router MAC address of the VRF |
| import_rts | [string](#string) | repeated | Read-only: List of import RTs chosen by FRR |
| export_rts | [string](#string) | repeated | Read-only: List of export RTs chosen by FRR |
| vlan_ids | [uint32](#uint32) | repeated | Read-only: List of connected LogicalBridges (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: vlan cannot be negative number. --) |





 

 

 


<a name="opi_api-network-evpn_gw-v1alpha1-SviService"></a>

### SviService
Management of switch virtual interfaces (SVIs) binding LogicalBridges to VRFs.

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| CreateSvi | [CreateSviRequest](#opi_api-network-evpn_gw-v1alpha1-CreateSviRequest) | [Svi](#opi_api-network-evpn_gw-v1alpha1-Svi) | Create a Svi |
| ListSvis | [ListSvisRequest](#opi_api-network-evpn_gw-v1alpha1-ListSvisRequest) | [ListSvisResponse](#opi_api-network-evpn_gw-v1alpha1-ListSvisResponse) | List Svis |
| GetSvi | [GetSviRequest](#opi_api-network-evpn_gw-v1alpha1-GetSviRequest) | [Svi](#opi_api-network-evpn_gw-v1alpha1-Svi) | Retrieve a Svi (-- api-linter: core::0131::method-signature=disabled aip.dev/not-precedent: &#34;vrf&#34; and &#34;vlan_id&#34; are the keys. --) (-- api-linter: client-libraries::4232::required-fields=disabled aip.dev/not-precedent: vrf&#34; and &#34;vlan_id&#34; are the required fields. --) (-- api-linter: core::0131::http-uri-name=disabled aip.dev/not-precedent: No &#34;name&#34; is used as key. --) |
| DeleteSvi | [DeleteSviRequest](#opi_api-network-evpn_gw-v1alpha1-DeleteSviRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) | Delete a Svi (-- api-linter: core::0135::method-signature=disabled aip.dev/not-precedent: &#34;vrf&#34; and &#34;vlan_id&#34; are the keys. --) (-- api-linter: client-libraries::4232::required-fields=disabled aip.dev/not-precedent: &#34;vrf&#34; and &#34;vlan_id&#34; are the required fields. --) (-- api-linter: core::0135::http-uri-name=disabled aip.dev/not-precedent: The &#34;name&#34; is not used as key. --) |


<a name="opi_api-network-evpn_gw-v1alpha1-VrfService"></a>

### VrfService
Management of Vrf Resources

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| CreateVrf | [CreateVrfRequest](#opi_api-network-evpn_gw-v1alpha1-CreateVrfRequest) | [Vrf](#opi_api-network-evpn_gw-v1alpha1-Vrf) | Create a Vrf |
| ListVrfs | [ListVrfsRequest](#opi_api-network-evpn_gw-v1alpha1-ListVrfsRequest) | [ListVrfsResponse](#opi_api-network-evpn_gw-v1alpha1-ListVrfsResponse) | List Vrfs |
| GetVrf | [GetVrfRequest](#opi_api-network-evpn_gw-v1alpha1-GetVrfRequest) | [Vrf](#opi_api-network-evpn_gw-v1alpha1-Vrf) | Retrieve a Vrf |
| DeleteVrf | [DeleteVrfRequest](#opi_api-network-evpn_gw-v1alpha1-DeleteVrfRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) | Delete a Vrf |

 



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

