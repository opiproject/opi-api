# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [l2_xpu_infra_mgr.proto](#l2_xpu_infra_mgr-proto)
    - [BridgePort](#opi_api-network-evpn_gw-v1alpha1-BridgePort)
    - [BridgePortSpec](#opi_api-network-evpn_gw-v1alpha1-BridgePortSpec)
    - [BridgePortStatus](#opi_api-network-evpn_gw-v1alpha1-BridgePortStatus)
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
    - [LogicalBridgeSpec](#opi_api-network-evpn_gw-v1alpha1-LogicalBridgeSpec)
    - [LogicalBridgeStatus](#opi_api-network-evpn_gw-v1alpha1-LogicalBridgeStatus)
    - [UpdateBridgePortRequest](#opi_api-network-evpn_gw-v1alpha1-UpdateBridgePortRequest)
    - [UpdateLogicalBridgeRequest](#opi_api-network-evpn_gw-v1alpha1-UpdateLogicalBridgeRequest)
  
    - [BPOperStatus](#opi_api-network-evpn_gw-v1alpha1-BPOperStatus)
    - [BridgePortType](#opi_api-network-evpn_gw-v1alpha1-BridgePortType)
    - [LBOperStatus](#opi_api-network-evpn_gw-v1alpha1-LBOperStatus)
  
    - [BridgePortService](#opi_api-network-evpn_gw-v1alpha1-BridgePortService)
    - [LogicalBridgeService](#opi_api-network-evpn_gw-v1alpha1-LogicalBridgeService)
  
- [l3_xpu_infra_mgr.proto](#l3_xpu_infra_mgr-proto)
    - [CreateSviRequest](#opi_api-network-evpn_gw-v1alpha1-CreateSviRequest)
    - [CreateVrfRequest](#opi_api-network-evpn_gw-v1alpha1-CreateVrfRequest)
    - [DeleteSviRequest](#opi_api-network-evpn_gw-v1alpha1-DeleteSviRequest)
    - [DeleteVrfRequest](#opi_api-network-evpn_gw-v1alpha1-DeleteVrfRequest)
    - [GetSviRequest](#opi_api-network-evpn_gw-v1alpha1-GetSviRequest)
    - [GetVrfRequest](#opi_api-network-evpn_gw-v1alpha1-GetVrfRequest)
    - [ListSvisRequest](#opi_api-network-evpn_gw-v1alpha1-ListSvisRequest)
    - [ListSvisResponse](#opi_api-network-evpn_gw-v1alpha1-ListSvisResponse)
    - [ListVrfsRequest](#opi_api-network-evpn_gw-v1alpha1-ListVrfsRequest)
    - [ListVrfsResponse](#opi_api-network-evpn_gw-v1alpha1-ListVrfsResponse)
    - [Svi](#opi_api-network-evpn_gw-v1alpha1-Svi)
    - [SviSpec](#opi_api-network-evpn_gw-v1alpha1-SviSpec)
    - [SviStatus](#opi_api-network-evpn_gw-v1alpha1-SviStatus)
    - [UpdateSviRequest](#opi_api-network-evpn_gw-v1alpha1-UpdateSviRequest)
    - [UpdateVrfRequest](#opi_api-network-evpn_gw-v1alpha1-UpdateVrfRequest)
    - [Vrf](#opi_api-network-evpn_gw-v1alpha1-Vrf)
    - [VrfSpec](#opi_api-network-evpn_gw-v1alpha1-VrfSpec)
    - [VrfStatus](#opi_api-network-evpn_gw-v1alpha1-VrfStatus)
  
    - [SVIOperStatus](#opi_api-network-evpn_gw-v1alpha1-SVIOperStatus)
    - [VRFOperStatus](#opi_api-network-evpn_gw-v1alpha1-VRFOperStatus)
  
    - [SviService](#opi_api-network-evpn_gw-v1alpha1-SviService)
    - [VrfService](#opi_api-network-evpn_gw-v1alpha1-VrfService)
  
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
  
- [uuid.proto](#uuid-proto)
    - [Uuid](#opi_api-common-v1-Uuid)
  
- [Scalar Value Types](#scalar-value-types)



<a name="l2_xpu_infra_mgr-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## l2_xpu_infra_mgr.proto



<a name="opi_api-network-evpn_gw-v1alpha1-BridgePort"></a>

### BridgePort
Bridge Port network configuration and status


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | The resource name of the Bridge Port. &#34;name&#34; is an opaque object handle that is not user settable. &#34;name&#34; will be returned with created object user can only set {resource}_id on the Create request object Format: bridge_ports/{bridge_port} |
| spec | [BridgePortSpec](#opi_api-network-evpn_gw-v1alpha1-BridgePortSpec) |  | Bridge Port network configuration |
| status | [BridgePortStatus](#opi_api-network-evpn_gw-v1alpha1-BridgePortStatus) |  | Bridge Port network status |






<a name="opi_api-network-evpn_gw-v1alpha1-BridgePortSpec"></a>

### BridgePortSpec
Bridge Port network configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| mac_address | [bytes](#bytes) |  | Bridge Port&#39;s MAC address. |
| ptype | [BridgePortType](#opi_api-network-evpn_gw-v1alpha1-BridgePortType) |  | Type of Bridge Port |
| logical_bridges | [string](#string) | repeated | List of Logical Bridges this Bridge Port will attach. This will define the VLANs that will be enabled in this Bridge Port |






<a name="opi_api-network-evpn_gw-v1alpha1-BridgePortStatus"></a>

### BridgePortStatus
operational status of a Bridge Port


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| oper_status | [BPOperStatus](#opi_api-network-evpn_gw-v1alpha1-BPOperStatus) |  | operational status of a Bridge Port |






<a name="opi_api-network-evpn_gw-v1alpha1-CreateBridgePortRequest"></a>

### CreateBridgePortRequest
CreateBridgePortRequest structure


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| bridge_port_id | [string](#string) |  | The ID to use for the bridge port, which will become the final component of the bridge port&#39;s resource name.

This value should be 4-63 characters, and valid characters are /[a-z][0-9]-/. If this is not provided the system will auto-generate it. |
| bridge_port | [BridgePort](#opi_api-network-evpn_gw-v1alpha1-BridgePort) |  | The bridge port to create |






<a name="opi_api-network-evpn_gw-v1alpha1-CreateLogicalBridgeRequest"></a>

### CreateLogicalBridgeRequest
CreateLogicalBridgeRequest structure


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| logical_bridge_id | [string](#string) |  | The ID to use for the logical bridge, which will become the final component of the logical bridge&#39;s resource name.

This value should be 4-63 characters, and valid characters are /[a-z][0-9]-/. If this is not provided the system will auto-generate it. |
| logical_bridge | [LogicalBridge](#opi_api-network-evpn_gw-v1alpha1-LogicalBridge) |  | The logical bridge to create |






<a name="opi_api-network-evpn_gw-v1alpha1-DeleteBridgePortRequest"></a>

### DeleteBridgePortRequest
DeleteBridgePortRequest structure


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | The name of the bridge port to retrieve Format: bridgePorts/{bridge_port} |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-network-evpn_gw-v1alpha1-DeleteLogicalBridgeRequest"></a>

### DeleteLogicalBridgeRequest
DeleteLogicalBridgeRequest structure


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | The name of the logical bridge to retrieve Format: logicalBridges/{logical_bridge} |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-network-evpn_gw-v1alpha1-GetBridgePortRequest"></a>

### GetBridgePortRequest
GetBridgePortRequest structure


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | The name of the bridge port to retrieve Format: bridgePorts/{bridge_port} |






<a name="opi_api-network-evpn_gw-v1alpha1-GetLogicalBridgeRequest"></a>

### GetLogicalBridgeRequest
GetLogicalBridgeRequest structure


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | The name of the logical bridge to retrieve Format: logicalBridges/{logical_bridge} |






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
Logical Bridge network configuration and status


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | The resource name of the Logical Bridge. &#34;name&#34; is an opaque object handle that is not user settable. &#34;name&#34; will be returned with created object user can only set {resource}_id on the Create request object Format: logicalBridges/{logical_bridge} |
| spec | [LogicalBridgeSpec](#opi_api-network-evpn_gw-v1alpha1-LogicalBridgeSpec) |  | Logical Bridge network configuration |
| status | [LogicalBridgeStatus](#opi_api-network-evpn_gw-v1alpha1-LogicalBridgeStatus) |  | Logical Bridge network status |






<a name="opi_api-network-evpn_gw-v1alpha1-LogicalBridgeSpec"></a>

### LogicalBridgeSpec
Logical Bridge network configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vlan_id | [uint32](#uint32) |  | the VLAN of the L2 domain (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: vlan cannot be negative number. --) |
| vni | [uint32](#uint32) | optional | VXLAN VNI for the L2 EVPN. Also used as EVPN route target (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: vni cannot be negative number. --) |
| vtep_ip_prefix | [opi_api.network.opinetcommon.v1alpha1.IPPrefix](#opi_api-network-opinetcommon-v1alpha1-IPPrefix) |  | IPv4 or IPv6 IP address prefix for the VXLAN TEP |






<a name="opi_api-network-evpn_gw-v1alpha1-LogicalBridgeStatus"></a>

### LogicalBridgeStatus
operational status of a Logical Bridge


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| oper_status | [LBOperStatus](#opi_api-network-evpn_gw-v1alpha1-LBOperStatus) |  | operational state of a Logical Bridge |






<a name="opi_api-network-evpn_gw-v1alpha1-UpdateBridgePortRequest"></a>

### UpdateBridgePortRequest
UpdateBridgePortRequest structure


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| bridge_port | [BridgePort](#opi_api-network-evpn_gw-v1alpha1-BridgePort) |  | The object&#39;s `name` field is used to identify the object to be updated. |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | The list of fields to update. |
| allow_missing | [bool](#bool) |  | If set to true, and the object is not found, a new object will be created. In this situation, `update_mask` is ignored. |






<a name="opi_api-network-evpn_gw-v1alpha1-UpdateLogicalBridgeRequest"></a>

### UpdateLogicalBridgeRequest
UpdateLogicalBridgeRequest structure


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| logical_bridge | [LogicalBridge](#opi_api-network-evpn_gw-v1alpha1-LogicalBridge) |  | The object&#39;s `name` field is used to identify the object to be updated. |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | The list of fields to update. |
| allow_missing | [bool](#bool) |  | If set to true, and the object is not found, a new object will be created. In this situation, `update_mask` is ignored. |





 


<a name="opi_api-network-evpn_gw-v1alpha1-BPOperStatus"></a>

### BPOperStatus
BPOperStatus status reflects the operational status of a Bridge Port

| Name | Number | Description |
| ---- | ------ | ----------- |
| BP_OPER_STATUS_UNSPECIFIED | 0 | unknown |
| BP_OPER_STATUS_UP | 1 | Bridge Port is up |
| BP_OPER_STATUS_DOWN | 2 | Bridge Port is down |



<a name="opi_api-network-evpn_gw-v1alpha1-BridgePortType"></a>

### BridgePortType
BridgePortType reflects the different types of a Bridge Port

| Name | Number | Description |
| ---- | ------ | ----------- |
| UNKNOWN | 0 | &#34;unknown&#34; bridge port type |
| ACCESS | 1 | &#34;access&#34; bridge port type |
| TRUNK | 2 | &#34;trunk&#34; bridge port type |



<a name="opi_api-network-evpn_gw-v1alpha1-LBOperStatus"></a>

### LBOperStatus
LBOperStatus status reflects the operational status of a Logical Bridge

| Name | Number | Description |
| ---- | ------ | ----------- |
| LB_OPER_STATUS_UNSPECIFIED | 0 | unknown |
| LB_OPER_STATUS_UP | 1 | Logical Bridge is up |
| LB_OPER_STATUS_DOWN | 2 | Logical Bridge is down |


 

 


<a name="opi_api-network-evpn_gw-v1alpha1-BridgePortService"></a>

### BridgePortService
Management of BridgePort resources

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| CreateBridgePort | [CreateBridgePortRequest](#opi_api-network-evpn_gw-v1alpha1-CreateBridgePortRequest) | [BridgePort](#opi_api-network-evpn_gw-v1alpha1-BridgePort) | Create a Bridge Port |
| ListBridgePorts | [ListBridgePortsRequest](#opi_api-network-evpn_gw-v1alpha1-ListBridgePortsRequest) | [ListBridgePortsResponse](#opi_api-network-evpn_gw-v1alpha1-ListBridgePortsResponse) | List Bridge Ports |
| GetBridgePort | [GetBridgePortRequest](#opi_api-network-evpn_gw-v1alpha1-GetBridgePortRequest) | [BridgePort](#opi_api-network-evpn_gw-v1alpha1-BridgePort) | Retrieve a Bridge Port |
| DeleteBridgePort | [DeleteBridgePortRequest](#opi_api-network-evpn_gw-v1alpha1-DeleteBridgePortRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) | Delete a Bridge Port |
| UpdateBridgePort | [UpdateBridgePortRequest](#opi_api-network-evpn_gw-v1alpha1-UpdateBridgePortRequest) | [BridgePort](#opi_api-network-evpn_gw-v1alpha1-BridgePort) | Update a Bridge Port |


<a name="opi_api-network-evpn_gw-v1alpha1-LogicalBridgeService"></a>

### LogicalBridgeService
Management of LogicalBridge Resources

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| CreateLogicalBridge | [CreateLogicalBridgeRequest](#opi_api-network-evpn_gw-v1alpha1-CreateLogicalBridgeRequest) | [LogicalBridge](#opi_api-network-evpn_gw-v1alpha1-LogicalBridge) | Create a Logical Bridge |
| ListLogicalBridges | [ListLogicalBridgesRequest](#opi_api-network-evpn_gw-v1alpha1-ListLogicalBridgesRequest) | [ListLogicalBridgesResponse](#opi_api-network-evpn_gw-v1alpha1-ListLogicalBridgesResponse) | List Logical Bridges |
| GetLogicalBridge | [GetLogicalBridgeRequest](#opi_api-network-evpn_gw-v1alpha1-GetLogicalBridgeRequest) | [LogicalBridge](#opi_api-network-evpn_gw-v1alpha1-LogicalBridge) | Retrieve a Logical Bridge |
| DeleteLogicalBridge | [DeleteLogicalBridgeRequest](#opi_api-network-evpn_gw-v1alpha1-DeleteLogicalBridgeRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) | Delete a Logical Bridge |
| UpdateLogicalBridge | [UpdateLogicalBridgeRequest](#opi_api-network-evpn_gw-v1alpha1-UpdateLogicalBridgeRequest) | [LogicalBridge](#opi_api-network-evpn_gw-v1alpha1-LogicalBridge) | Update a Logical Bridge |

 



<a name="l3_xpu_infra_mgr-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## l3_xpu_infra_mgr.proto



<a name="opi_api-network-evpn_gw-v1alpha1-CreateSviRequest"></a>

### CreateSviRequest
CreateSviRequest structure


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| svi_id | [string](#string) |  | The ID to use for the svi, which will become the final component of the svi&#39;s resource name.

This value should be 4-63 characters, and valid characters are /[a-z][0-9]-/. If this is not provided the system will auto-generate it. |
| svi | [Svi](#opi_api-network-evpn_gw-v1alpha1-Svi) |  | The Svi to create |






<a name="opi_api-network-evpn_gw-v1alpha1-CreateVrfRequest"></a>

### CreateVrfRequest
CreateVrfRequest structure


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vrf_id | [string](#string) |  | The ID to use for the vrf, which will become the final component of the vrf&#39;s resource name.

This value should be 4-63 characters, and valid characters are /[a-z][0-9]-/. If this is not provided the system will auto-generate it. |
| vrf | [Vrf](#opi_api-network-evpn_gw-v1alpha1-Vrf) |  | The vrf to create |






<a name="opi_api-network-evpn_gw-v1alpha1-DeleteSviRequest"></a>

### DeleteSviRequest
DeleteSviRequest structure


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | The name of the svi to delete Format: svis/{svi} |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-network-evpn_gw-v1alpha1-DeleteVrfRequest"></a>

### DeleteVrfRequest
DeleteVrfRequest structure


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | The name of the vrf to delete Format: vrfs/{vrf} |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-network-evpn_gw-v1alpha1-GetSviRequest"></a>

### GetSviRequest
GetSviRequest structure


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | The name of the svi to retrieve Format: svis/{svi} |






<a name="opi_api-network-evpn_gw-v1alpha1-GetVrfRequest"></a>

### GetVrfRequest
GetVrfRequest structure


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | The name of the vrf to retrieve Format: vrfs/{vrf} |






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
| vrfs | [Vrf](#opi_api-network-evpn_gw-v1alpha1-Vrf) | repeated | List of all the vrfs |
| next_page_token | [string](#string) |  | Next page token of list response |






<a name="opi_api-network-evpn_gw-v1alpha1-Svi"></a>

### Svi
Svi network configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | The resource name of the Svi. &#34;name&#34; is an opaque object handle that is not user settable. &#34;name&#34; will be returned with created object user can only set {resource}_id on the Create request object Format: svis/{svi} |
| spec | [SviSpec](#opi_api-network-evpn_gw-v1alpha1-SviSpec) |  | Svi&#39;s network configuration |
| status | [SviStatus](#opi_api-network-evpn_gw-v1alpha1-SviStatus) |  | Svi&#39;s network status |






<a name="opi_api-network-evpn_gw-v1alpha1-SviSpec"></a>

### SviSpec
Svi&#39;s network configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vrf | [string](#string) |  | Vrf name Format is `vrfs/{vrf}` |
| logical_bridge | [string](#string) |  | Logical Bridge name Format is `logicalBridges/{logical_bridge}` |
| mac_address | [bytes](#bytes) |  | Svi&#39;s MAC address. |
| gw_ip_prefix | [opi_api.network.opinetcommon.v1alpha1.IPPrefix](#opi_api-network-opinetcommon-v1alpha1-IPPrefix) | repeated | The GW IP addresses assigned to the SVI |
| enable_bgp | [bool](#bool) |  | Set to true to enable BGP peering with Vrf on Svi |
| remote_as | [uint32](#uint32) |  | Conditional: The remote AS used by BGP speakers on LB (1-65535) (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: remote_as cannot be negative number. --) |






<a name="opi_api-network-evpn_gw-v1alpha1-SviStatus"></a>

### SviStatus
operational status of a Svi


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| oper_status | [SVIOperStatus](#opi_api-network-evpn_gw-v1alpha1-SVIOperStatus) |  | operational status of a Svi |






<a name="opi_api-network-evpn_gw-v1alpha1-UpdateSviRequest"></a>

### UpdateSviRequest
UpdateSviRequest structure


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| svi | [Svi](#opi_api-network-evpn_gw-v1alpha1-Svi) |  | The object&#39;s `name` field is used to identify the object to be updated. |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | The list of fields to update. |
| allow_missing | [bool](#bool) |  | If set to true, and the object is not found, a new object will be created. In this situation, `update_mask` is ignored. |






<a name="opi_api-network-evpn_gw-v1alpha1-UpdateVrfRequest"></a>

### UpdateVrfRequest
UpdateVrfRequest structure


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vrf | [Vrf](#opi_api-network-evpn_gw-v1alpha1-Vrf) |  | The object&#39;s `name` field is used to identify the object to be updated. |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | The list of fields to update. |
| allow_missing | [bool](#bool) |  | If set to true, and the object is not found, a new object will be created. In this situation, `update_mask` is ignored. |






<a name="opi_api-network-evpn_gw-v1alpha1-Vrf"></a>

### Vrf
Vrf level network configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | The resource name of the Vrf. &#34;name&#34; is an opaque object handle that is not user settable. &#34;name&#34; will be returned with created object user can only set {resource}_id on the Create request object Format: vrfs/{vrf} |
| spec | [VrfSpec](#opi_api-network-evpn_gw-v1alpha1-VrfSpec) |  | Vrf&#39;s network configuration |
| status | [VrfStatus](#opi_api-network-evpn_gw-v1alpha1-VrfStatus) |  | Vrf&#39;s network status |






<a name="opi_api-network-evpn_gw-v1alpha1-VrfSpec"></a>

### VrfSpec
Vrf network configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vni | [uint32](#uint32) | optional | VXLAN VNI for L3 EVPN. Also used as EVPN route target (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: vni cannot be negative number. --) |
| loopback_ip_prefix | [opi_api.network.opinetcommon.v1alpha1.IPPrefix](#opi_api-network-opinetcommon-v1alpha1-IPPrefix) |  | IPv4 or IPv6 loopback address prefix. Also serves as basis for RD in FRR |
| vtep_ip_prefix | [opi_api.network.opinetcommon.v1alpha1.IPPrefix](#opi_api-network-opinetcommon-v1alpha1-IPPrefix) |  | IPv4 or IPv6 IP address prefix for the VXLAN TEP |






<a name="opi_api-network-evpn_gw-v1alpha1-VrfStatus"></a>

### VrfStatus
operational status of a Vrf


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| routing_table | [uint32](#uint32) |  | Routing table number (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: routing_table cannot be negative number. --) |
| local_as | [uint32](#uint32) |  | Local AS configured for VRF (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: local_as cannot be negative number. --) |
| rd | [string](#string) |  | Route distinguisher |
| rmac | [bytes](#bytes) |  | Router MAC address of the Vrf |
| import_rts | [string](#string) | repeated | List of import RTs |
| export_rts | [string](#string) | repeated | List of export RTs |
| logical_bridges | [string](#string) | repeated | List of connected Logical Bridges to Vrf This defines the VLANs that are connected to the Vrf |
| oper_status | [VRFOperStatus](#opi_api-network-evpn_gw-v1alpha1-VRFOperStatus) |  | operational status of a Vrf |





 


<a name="opi_api-network-evpn_gw-v1alpha1-SVIOperStatus"></a>

### SVIOperStatus
SVIOperStatus status reflects the operational status of a Svi

| Name | Number | Description |
| ---- | ------ | ----------- |
| SVI_OPER_STATUS_UNSPECIFIED | 0 | unknown |
| SVI_OPER_STATUS_UP | 1 | Svi is up |
| SVI_OPER_STATUS_DOWN | 2 | Svi is down |



<a name="opi_api-network-evpn_gw-v1alpha1-VRFOperStatus"></a>

### VRFOperStatus
VRFOperStatus status reflects the operational status of a Vrf

| Name | Number | Description |
| ---- | ------ | ----------- |
| VRF_OPER_STATUS_UNSPECIFIED | 0 | unknown |
| VRF_OPER_STATUS_UP | 1 | Vrf is up |
| VRF_OPER_STATUS_DOWN | 2 | Vrf is down |


 

 


<a name="opi_api-network-evpn_gw-v1alpha1-SviService"></a>

### SviService
Management of switch virtual interfaces (SVIs) binding LogicalBridges to VRFs.

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| CreateSvi | [CreateSviRequest](#opi_api-network-evpn_gw-v1alpha1-CreateSviRequest) | [Svi](#opi_api-network-evpn_gw-v1alpha1-Svi) | Create a Svi |
| ListSvis | [ListSvisRequest](#opi_api-network-evpn_gw-v1alpha1-ListSvisRequest) | [ListSvisResponse](#opi_api-network-evpn_gw-v1alpha1-ListSvisResponse) | List Svis |
| GetSvi | [GetSviRequest](#opi_api-network-evpn_gw-v1alpha1-GetSviRequest) | [Svi](#opi_api-network-evpn_gw-v1alpha1-Svi) | Retrieve a Svi |
| DeleteSvi | [DeleteSviRequest](#opi_api-network-evpn_gw-v1alpha1-DeleteSviRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) | Delete a Svi |
| UpdateSvi | [UpdateSviRequest](#opi_api-network-evpn_gw-v1alpha1-UpdateSviRequest) | [Svi](#opi_api-network-evpn_gw-v1alpha1-Svi) | Update a Svi |


<a name="opi_api-network-evpn_gw-v1alpha1-VrfService"></a>

### VrfService
Management of Vrf Resources

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| CreateVrf | [CreateVrfRequest](#opi_api-network-evpn_gw-v1alpha1-CreateVrfRequest) | [Vrf](#opi_api-network-evpn_gw-v1alpha1-Vrf) | Create a Vrf |
| ListVrfs | [ListVrfsRequest](#opi_api-network-evpn_gw-v1alpha1-ListVrfsRequest) | [ListVrfsResponse](#opi_api-network-evpn_gw-v1alpha1-ListVrfsResponse) | List Vrfs |
| GetVrf | [GetVrfRequest](#opi_api-network-evpn_gw-v1alpha1-GetVrfRequest) | [Vrf](#opi_api-network-evpn_gw-v1alpha1-Vrf) | Retrieve a Vrf |
| DeleteVrf | [DeleteVrfRequest](#opi_api-network-evpn_gw-v1alpha1-DeleteVrfRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) | Delete a Vrf |
| UpdateVrf | [UpdateVrfRequest](#opi_api-network-evpn_gw-v1alpha1-UpdateVrfRequest) | [Vrf](#opi_api-network-evpn_gw-v1alpha1-Vrf) | Update a Vrf |

 



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

