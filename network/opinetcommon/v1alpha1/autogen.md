# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [ip.proto](#ip-proto)
- [openconfig_interfaces.proto](#openconfig_interfaces-proto)
    - [Interface](#opi_api-network-v1-Interface)
    - [Interface.Config](#opi_api-network-v1-Interface-Config)
    - [Interface.HoldTime](#opi_api-network-v1-Interface-HoldTime)
    - [Interface.HoldTime.Config](#opi_api-network-v1-Interface-HoldTime-Config)
    - [Interface.HoldTime.State](#opi_api-network-v1-Interface-HoldTime-State)
    - [Interface.State](#opi_api-network-v1-Interface-State)
    - [Interface.State.Counters](#opi_api-network-v1-Interface-State-Counters)
    - [Interface.Subinterfaces](#opi_api-network-v1-Interface-Subinterfaces)
    - [Interface.Subinterfaces.Subinterface](#opi_api-network-v1-Interface-Subinterfaces-Subinterface)
    - [Interface.Subinterfaces.Subinterface.Config](#opi_api-network-v1-Interface-Subinterfaces-Subinterface-Config)
    - [Interface.Subinterfaces.Subinterface.State](#opi_api-network-v1-Interface-Subinterfaces-Subinterface-State)
    - [Interface.Subinterfaces.Subinterface.State.Counters](#opi_api-network-v1-Interface-Subinterfaces-Subinterface-State-Counters)
    - [Interfaces](#opi_api-network-v1-Interfaces)
    - [NetInterfaceGetRequest](#opi_api-network-v1-NetInterfaceGetRequest)
    - [NetInterfaceGetResponse](#opi_api-network-v1-NetInterfaceGetResponse)
    - [NetInterfaceListRequest](#opi_api-network-v1-NetInterfaceListRequest)
    - [NetInterfaceListResponse](#opi_api-network-v1-NetInterfaceListResponse)
    - [NetInterfaceUpdateRequest](#opi_api-network-v1-NetInterfaceUpdateRequest)
    - [NetInterfaceUpdateResponse](#opi_api-network-v1-NetInterfaceUpdateResponse)
  
    - [InterfaceState](#opi_api-network-v1-InterfaceState)
    - [InterfaceType](#opi_api-network-v1-InterfaceType)
  
    - [NetInterface](#opi_api-network-v1-NetInterface)
  
- [inventory.proto](#inventory-proto)
    - [BIOSInfo](#opi_api-inventory-v1-BIOSInfo)
    - [BaseboardInfo](#opi_api-inventory-v1-BaseboardInfo)
    - [CPUInfo](#opi_api-inventory-v1-CPUInfo)
    - [ChassisInfo](#opi_api-inventory-v1-ChassisInfo)
    - [DeviceInfo](#opi_api-inventory-v1-DeviceInfo)
    - [InventoryGetRequest](#opi_api-inventory-v1-InventoryGetRequest)
    - [InventoryGetResponse](#opi_api-inventory-v1-InventoryGetResponse)
    - [MemoryInfo](#opi_api-inventory-v1-MemoryInfo)
    - [SystemInfo](#opi_api-inventory-v1-SystemInfo)
  
    - [InventorySvc](#opi_api-inventory-v1-InventorySvc)
  
- [object_key.proto](#object_key-proto)
    - [ObjectKey](#opi_api-common-v1-ObjectKey)
  
- [uuid.proto](#uuid-proto)
    - [Uuid](#opi_api-common-v1-Uuid)
  
- [Scalar Value Types](#scalar-value-types)



<a name="ip-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## ip.proto


 

 

 

 



<a name="openconfig_interfaces-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## openconfig_interfaces.proto
openconfig-interfaces.proto file
Derived from the OpenConfig interfaces model github.com/openconfig/public/release/models/interfaces


<a name="opi_api-network-v1-Interface"></a>

### Interface
Main Data Structure


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| config | [Interface.Config](#opi_api-network-v1-Interface-Config) |  |  |
| state | [Interface.State](#opi_api-network-v1-Interface-State) |  |  |
| holdtime | [Interface.HoldTime](#opi_api-network-v1-Interface-HoldTime) |  |  |
| subinterfaces | [Interface.Subinterfaces](#opi_api-network-v1-Interface-Subinterfaces) |  |  |






<a name="opi_api-network-v1-Interface-Config"></a>

### Interface.Config



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| type | [InterfaceType](#opi_api-network-v1-InterfaceType) |  |  |
| mtu | [uint32](#uint32) |  |  |
| loopback_mode | [bool](#bool) |  |  |
| description | [string](#string) |  |  |
| enabled | [bool](#bool) |  |  |






<a name="opi_api-network-v1-Interface-HoldTime"></a>

### Interface.HoldTime



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| config | [Interface.HoldTime.Config](#opi_api-network-v1-Interface-HoldTime-Config) |  |  |
| state | [Interface.HoldTime.State](#opi_api-network-v1-Interface-HoldTime-State) |  |  |






<a name="opi_api-network-v1-Interface-HoldTime-Config"></a>

### Interface.HoldTime.Config



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| up | [uint32](#uint32) |  |  |
| down | [uint32](#uint32) |  |  |






<a name="opi_api-network-v1-Interface-HoldTime-State"></a>

### Interface.HoldTime.State



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| up | [uint32](#uint32) |  |  |
| down | [uint32](#uint32) |  |  |






<a name="opi_api-network-v1-Interface-State"></a>

### Interface.State



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| type | [InterfaceType](#opi_api-network-v1-InterfaceType) |  |  |
| mtu | [uint32](#uint32) |  |  |
| loopback_mode | [bool](#bool) |  |  |
| description | [string](#string) |  |  |
| enabled | [bool](#bool) |  |  |
| ifindex | [uint32](#uint32) |  |  |
| admin_status | [InterfaceState](#opi_api-network-v1-InterfaceState) |  |  |
| oper_status | [InterfaceState](#opi_api-network-v1-InterfaceState) |  |  |
| last_change | [uint64](#uint64) |  |  |
| logical | [bool](#bool) |  |  |
| management | [bool](#bool) |  |  |
| cpu | [bool](#bool) |  |  |
| counters | [Interface.State.Counters](#opi_api-network-v1-Interface-State-Counters) |  |  |






<a name="opi_api-network-v1-Interface-State-Counters"></a>

### Interface.State.Counters



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| in_octets | [uint64](#uint64) |  |  |
| in_packets | [uint64](#uint64) |  |  |
| in_unicast_pkts | [uint64](#uint64) |  |  |
| in_broadcast_pkts | [uint64](#uint64) |  |  |
| in_multicast_pkts | [uint64](#uint64) |  |  |
| in_discards | [uint64](#uint64) |  |  |
| in_errors | [uint64](#uint64) |  |  |
| in_unknown_protos | [uint64](#uint64) |  |  |
| in_fcs_errors | [uint64](#uint64) |  |  |
| out_octets | [uint64](#uint64) |  |  |
| out_packets | [uint64](#uint64) |  |  |
| out_unicast_pkts | [uint64](#uint64) |  |  |
| out_broadcast_pkts | [uint64](#uint64) |  |  |
| out_multicast_pkts | [uint64](#uint64) |  |  |
| out_discards | [uint64](#uint64) |  |  |
| out_errors | [uint64](#uint64) |  |  |
| carrier_transitions | [uint64](#uint64) |  |  |
| last_clear | [uint64](#uint64) |  |  |






<a name="opi_api-network-v1-Interface-Subinterfaces"></a>

### Interface.Subinterfaces



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| subinterface | [Interface.Subinterfaces.Subinterface](#opi_api-network-v1-Interface-Subinterfaces-Subinterface) | repeated |  |






<a name="opi_api-network-v1-Interface-Subinterfaces-Subinterface"></a>

### Interface.Subinterfaces.Subinterface



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| index | [uint64](#uint64) |  |  |
| config | [Interface.Subinterfaces.Subinterface.Config](#opi_api-network-v1-Interface-Subinterfaces-Subinterface-Config) |  |  |
| state | [Interface.Subinterfaces.Subinterface.State](#opi_api-network-v1-Interface-Subinterfaces-Subinterface-State) |  |  |






<a name="opi_api-network-v1-Interface-Subinterfaces-Subinterface-Config"></a>

### Interface.Subinterfaces.Subinterface.Config



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| index | [uint64](#uint64) |  |  |
| description | [string](#string) |  |  |
| enabled | [bool](#bool) |  |  |






<a name="opi_api-network-v1-Interface-Subinterfaces-Subinterface-State"></a>

### Interface.Subinterfaces.Subinterface.State



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| index | [uint32](#uint32) |  |  |
| description | [string](#string) |  |  |
| enabled | [bool](#bool) |  |  |
| name | [string](#string) |  |  |
| ifindex | [uint32](#uint32) |  |  |
| admin_status | [InterfaceState](#opi_api-network-v1-InterfaceState) |  |  |
| oper_status | [InterfaceState](#opi_api-network-v1-InterfaceState) |  |  |
| last_change | [uint64](#uint64) |  |  |
| logical | [bool](#bool) |  |  |
| management | [bool](#bool) |  |  |
| cpu | [bool](#bool) |  |  |
| counters | [Interface.Subinterfaces.Subinterface.State.Counters](#opi_api-network-v1-Interface-Subinterfaces-Subinterface-State-Counters) |  |  |






<a name="opi_api-network-v1-Interface-Subinterfaces-Subinterface-State-Counters"></a>

### Interface.Subinterfaces.Subinterface.State.Counters



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| in_octets | [uint64](#uint64) |  |  |
| in_packets | [uint64](#uint64) |  |  |
| in_unicast_pkts | [uint64](#uint64) |  |  |
| in_broadcast_pkts | [uint64](#uint64) |  |  |
| in_multicast_pkts | [uint64](#uint64) |  |  |
| in_discards | [uint64](#uint64) |  |  |
| in_errors | [uint64](#uint64) |  |  |
| in_unknown_protos | [uint64](#uint64) |  |  |
| in_fcs_errors | [uint64](#uint64) |  |  |
| out_octets | [uint64](#uint64) |  |  |
| out_packets | [uint64](#uint64) |  |  |
| out_unicast_pkts | [uint64](#uint64) |  |  |
| out_broadcast_pkts | [uint64](#uint64) |  |  |
| out_multicast_pkts | [uint64](#uint64) |  |  |
| out_discards | [uint64](#uint64) |  |  |
| out_errors | [uint64](#uint64) |  |  |
| carrier_transitions | [uint64](#uint64) |  |  |
| last_clear | [uint64](#uint64) |  |  |






<a name="opi_api-network-v1-Interfaces"></a>

### Interfaces



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| interface | [Interface](#opi_api-network-v1-Interface) | repeated |  |






<a name="opi_api-network-v1-NetInterfaceGetRequest"></a>

### NetInterfaceGetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-network-v1-NetInterfaceGetResponse"></a>

### NetInterfaceGetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| interface | [Interface](#opi_api-network-v1-Interface) |  |  |






<a name="opi_api-network-v1-NetInterfaceListRequest"></a>

### NetInterfaceListRequest
empty






<a name="opi_api-network-v1-NetInterfaceListResponse"></a>

### NetInterfaceListResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| interface | [Interface](#opi_api-network-v1-Interface) | repeated |  |






<a name="opi_api-network-v1-NetInterfaceUpdateRequest"></a>

### NetInterfaceUpdateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| interface | [Interface](#opi_api-network-v1-Interface) |  |  |






<a name="opi_api-network-v1-NetInterfaceUpdateResponse"></a>

### NetInterfaceUpdateResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| result | [uint32](#uint32) |  |  |





 


<a name="opi_api-network-v1-InterfaceState"></a>

### InterfaceState


| Name | Number | Description |
| ---- | ------ | ----------- |
| DOWN | 0 |  |
| UP | 1 |  |



<a name="opi_api-network-v1-InterfaceType"></a>

### InterfaceType
Data Types

| Name | Number | Description |
| ---- | ------ | ----------- |
| ETHERNET | 0 |  |
| LOOPBACK | 1 |  |


 

 


<a name="opi_api-network-v1-NetInterface"></a>

### NetInterface
Service functions for Network Interface exported by the server

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| NetInterfaceGet | [NetInterfaceGetRequest](#opi_api-network-v1-NetInterfaceGetRequest) | [NetInterfaceGetResponse](#opi_api-network-v1-NetInterfaceGetResponse) | Retrieves the interface information for a given interface |
| NetInterfaceList | [NetInterfaceListRequest](#opi_api-network-v1-NetInterfaceListRequest) | [NetInterfaceListResponse](#opi_api-network-v1-NetInterfaceListResponse) | Retrieves the set of interfaces on the device |
| NetInterfaceUpdate | [NetInterfaceUpdateRequest](#opi_api-network-v1-NetInterfaceUpdateRequest) | [NetInterfaceUpdateResponse](#opi_api-network-v1-NetInterfaceUpdateResponse) | A method for setting or changing configuration of an interface |

 



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






<a name="opi_api-inventory-v1-DeviceInfo"></a>

### DeviceInfo
TODO: remove this message


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| description | [string](#string) |  |  |
| id | [string](#string) |  |  |
| mfg_name | [string](#string) |  |  |
| mfg_date | [string](#string) |  |  |
| hw_version | [string](#string) |  |  |
| fw_version | [string](#string) |  |  |
| sw_version | [string](#string) |  |  |
| serial_no | [string](#string) |  |  |
| part_no | [string](#string) |  |  |






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
| devinfo | [DeviceInfo](#opi_api-inventory-v1-DeviceInfo) |  |  |






<a name="opi_api-inventory-v1-MemoryInfo"></a>

### MemoryInfo
Physical Memory Array (Type 16)
 This structure describes a collection of memory devices that operate together to form a memory address
 space.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| total_physical_bytes | [int64](#int64) |  | Maximum memory capacity, in kilobytes, for this array If the capacity is not represented in this field, then this field contains 8000 0000h and the Extended Maximum Capacity field should be used. Values 2 TB (8000 0000h) or greater must be represented in the Extended Maximum Capacity field. |
| total_usable_bytes | [int64](#int64) |  | TBD |






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

