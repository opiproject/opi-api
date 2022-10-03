# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [oc_interfaces.proto](#oc_interfaces-proto)
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
  
- [Scalar Value Types](#scalar-value-types)



<a name="oc_interfaces-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## oc_interfaces.proto
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

