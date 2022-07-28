# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [ipsec.proto](#ipsec-proto)
    - [IPSec](#opi-security-v1-IPSec)
    - [IPSecServiceCreateRequest](#opi-security-v1-IPSecServiceCreateRequest)
    - [IPSecServiceCreateResponse](#opi-security-v1-IPSecServiceCreateResponse)
    - [IPSecServiceDeleteRequest](#opi-security-v1-IPSecServiceDeleteRequest)
    - [IPSecServiceDeleteResponse](#opi-security-v1-IPSecServiceDeleteResponse)
    - [IPSecServiceGetRequest](#opi-security-v1-IPSecServiceGetRequest)
    - [IPSecServiceGetResponse](#opi-security-v1-IPSecServiceGetResponse)
    - [IPSecServiceListRequest](#opi-security-v1-IPSecServiceListRequest)
    - [IPSecServiceListResponse](#opi-security-v1-IPSecServiceListResponse)
    - [IPSecServiceUpdateRequest](#opi-security-v1-IPSecServiceUpdateRequest)
    - [IPSecServiceUpdateResponse](#opi-security-v1-IPSecServiceUpdateResponse)
    - [ResyncRequest](#opi-security-v1-ResyncRequest)
    - [SecurityAssociations](#opi-security-v1-SecurityAssociations)
    - [SecurityAssociations.SA](#opi-security-v1-SecurityAssociations-SA)
    - [SecurityPolicyDatabases](#opi-security-v1-SecurityPolicyDatabases)
    - [SecurityPolicyDatabases.SPD](#opi-security-v1-SecurityPolicyDatabases-SPD)
    - [SecurityPolicyDatabases.SPD.Interface](#opi-security-v1-SecurityPolicyDatabases-SPD-Interface)
    - [SecurityPolicyDatabases.SPD.PolicyEntry](#opi-security-v1-SecurityPolicyDatabases-SPD-PolicyEntry)
    - [TunnelInterfaces](#opi-security-v1-TunnelInterfaces)
    - [TunnelInterfaces.Tunnel](#opi-security-v1-TunnelInterfaces-Tunnel)
  
    - [CryptoAlgorithm](#opi-security-v1-CryptoAlgorithm)
    - [IntegAlgorithm](#opi-security-v1-IntegAlgorithm)
    - [SecurityAssociations.SA.IPSecProtocol](#opi-security-v1-SecurityAssociations-SA-IPSecProtocol)
    - [SecurityPolicyDatabases.SPD.PolicyEntry.Action](#opi-security-v1-SecurityPolicyDatabases-SPD-PolicyEntry-Action)
  
    - [IPSecService](#opi-security-v1-IPSecService)
  
- [Scalar Value Types](#scalar-value-types)



<a name="ipsec-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## ipsec.proto
Copyright (C) 2021 Intel Corporation
SPDX-License-Identifier: Apache-2.0

Piece taken from https://github.com/ligato/cn-infra/blob/master/examples/cryptodata-proto-plugin/ipsec/ipsec.proto


<a name="opi-security-v1-IPSec"></a>

### IPSec



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| ID | [int64](#int64) |  |  |
| tunnel | [TunnelInterfaces](#opi-security-v1-TunnelInterfaces) |  |  |
| policy | [SecurityPolicyDatabases](#opi-security-v1-SecurityPolicyDatabases) |  |  |
| sa | [SecurityAssociations](#opi-security-v1-SecurityAssociations) |  |  |






<a name="opi-security-v1-IPSecServiceCreateRequest"></a>

### IPSecServiceCreateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| ipsec | [IPSec](#opi-security-v1-IPSec) |  |  |






<a name="opi-security-v1-IPSecServiceCreateResponse"></a>

### IPSecServiceCreateResponse
Intentionally empty for now






<a name="opi-security-v1-IPSecServiceDeleteRequest"></a>

### IPSecServiceDeleteRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| ID | [int64](#int64) |  |  |






<a name="opi-security-v1-IPSecServiceDeleteResponse"></a>

### IPSecServiceDeleteResponse
Intentionally empty for now






<a name="opi-security-v1-IPSecServiceGetRequest"></a>

### IPSecServiceGetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |






<a name="opi-security-v1-IPSecServiceGetResponse"></a>

### IPSecServiceGetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| ipsec | [IPSec](#opi-security-v1-IPSec) |  |  |






<a name="opi-security-v1-IPSecServiceListRequest"></a>

### IPSecServiceListRequest
Intentionally empty for now






<a name="opi-security-v1-IPSecServiceListResponse"></a>

### IPSecServiceListResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| ipsec | [IPSec](#opi-security-v1-IPSec) | repeated |  |






<a name="opi-security-v1-IPSecServiceUpdateRequest"></a>

### IPSecServiceUpdateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| ipsec | [IPSec](#opi-security-v1-IPSec) |  |  |






<a name="opi-security-v1-IPSecServiceUpdateResponse"></a>

### IPSecServiceUpdateResponse
Intentionally empty for now






<a name="opi-security-v1-ResyncRequest"></a>

### ResyncRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| tunnels | [TunnelInterfaces.Tunnel](#opi-security-v1-TunnelInterfaces-Tunnel) | repeated |  |
| spds | [SecurityPolicyDatabases.SPD](#opi-security-v1-SecurityPolicyDatabases-SPD) | repeated |  |
| sas | [SecurityAssociations.SA](#opi-security-v1-SecurityAssociations-SA) | repeated |  |






<a name="opi-security-v1-SecurityAssociations"></a>

### SecurityAssociations
Security Association (SA)


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| sas | [SecurityAssociations.SA](#opi-security-v1-SecurityAssociations-SA) | repeated |  |






<a name="opi-security-v1-SecurityAssociations-SA"></a>

### SecurityAssociations.SA



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | security association name |
| spi | [uint32](#uint32) |  | security parameter index |
| protocol | [SecurityAssociations.SA.IPSecProtocol](#opi-security-v1-SecurityAssociations-SA-IPSecProtocol) |  |  |
| crypto_alg | [CryptoAlgorithm](#opi-security-v1-CryptoAlgorithm) |  |  |
| crypto_key | [string](#string) |  |  |
| integ_alg | [IntegAlgorithm](#opi-security-v1-IntegAlgorithm) |  |  |
| integ_key | [string](#string) |  |  |
| use_esn | [bool](#bool) |  | Use extended sequence number |
| use_anti_replay | [bool](#bool) |  | Use anti replay |
| tunnel_src_addr | [string](#string) |  |  |
| tunnel_dst_addr | [string](#string) |  |  |
| enable_udp_encap | [bool](#bool) |  | Enable UDP encapsulation for NAT traversal |






<a name="opi-security-v1-SecurityPolicyDatabases"></a>

### SecurityPolicyDatabases
Security Policy Database (SPD)


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| spds | [SecurityPolicyDatabases.SPD](#opi-security-v1-SecurityPolicyDatabases-SPD) | repeated | list of all SPDs |






<a name="opi-security-v1-SecurityPolicyDatabases-SPD"></a>

### SecurityPolicyDatabases.SPD



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| interfaces | [SecurityPolicyDatabases.SPD.Interface](#opi-security-v1-SecurityPolicyDatabases-SPD-Interface) | repeated | list of interfaces belonging to this SPD |
| policy_entries | [SecurityPolicyDatabases.SPD.PolicyEntry](#opi-security-v1-SecurityPolicyDatabases-SPD-PolicyEntry) | repeated | list of policy entries belonging to this SPD |






<a name="opi-security-v1-SecurityPolicyDatabases-SPD-Interface"></a>

### SecurityPolicyDatabases.SPD.Interface
Interface


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | interface name |






<a name="opi-security-v1-SecurityPolicyDatabases-SPD-PolicyEntry"></a>

### SecurityPolicyDatabases.SPD.PolicyEntry
Policy Entry


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| sa | [string](#string) |  | security association name |
| priority | [int32](#int32) |  |  |
| is_outbound | [bool](#bool) |  |  |
| remote_addr_start | [string](#string) |  |  |
| remote_addr_stop | [string](#string) |  |  |
| local_addr_start | [string](#string) |  |  |
| local_addr_stop | [string](#string) |  |  |
| protocol | [uint32](#uint32) |  |  |
| remote_port_start | [uint32](#uint32) |  |  |
| remote_port_stop | [uint32](#uint32) |  |  |
| local_port_start | [uint32](#uint32) |  |  |
| local_port_stop | [uint32](#uint32) |  |  |
| action | [SecurityPolicyDatabases.SPD.PolicyEntry.Action](#opi-security-v1-SecurityPolicyDatabases-SPD-PolicyEntry-Action) |  | policy action |






<a name="opi-security-v1-TunnelInterfaces"></a>

### TunnelInterfaces
Tunnel Interfaces


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| tunnels | [TunnelInterfaces.Tunnel](#opi-security-v1-TunnelInterfaces-Tunnel) | repeated |  |






<a name="opi-security-v1-TunnelInterfaces-Tunnel"></a>

### TunnelInterfaces.Tunnel



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | tunnel name |
| esn | [bool](#bool) |  | extended sequence number |
| anti_replay | [bool](#bool) |  | anti replay option |
| local_ip | [string](#string) |  |  |
| remote_ip | [string](#string) |  |  |
| local_spi | [uint32](#uint32) |  |  |
| remote_spi | [uint32](#uint32) |  |  |
| crypto_alg | [CryptoAlgorithm](#opi-security-v1-CryptoAlgorithm) |  |  |
| local_crypto_key | [string](#string) |  |  |
| remote_crypto_key | [string](#string) |  |  |
| integ_alg | [IntegAlgorithm](#opi-security-v1-IntegAlgorithm) |  |  |
| local_integ_key | [string](#string) |  |  |
| remote_integ_key | [string](#string) |  |  |
| enabled | [bool](#bool) |  | Extra fields related to interface |
| ip_addresses | [string](#string) | repeated |  |
| vrf | [uint32](#uint32) |  |  |





 


<a name="opi-security-v1-CryptoAlgorithm"></a>

### CryptoAlgorithm
Cryptographic algorithm for encryption

| Name | Number | Description |
| ---- | ------ | ----------- |
| NONE_CRYPTO | 0 |  |
| AES_CBC_128 | 1 |  |
| AES_CBC_192 | 2 |  |
| AES_CBC_256 | 3 |  |



<a name="opi-security-v1-IntegAlgorithm"></a>

### IntegAlgorithm
Cryptographic algorithm for authentication

| Name | Number | Description |
| ---- | ------ | ----------- |
| NONE_INTEG | 0 |  |
| MD5_96 | 1 |  |
| SHA1_96 | 2 |  |
| SHA_256_96 | 3 |  |
| SHA_256_128 | 4 |  |
| SHA_384_192 | 5 |  |
| SHA_512_256 | 6 |  |



<a name="opi-security-v1-SecurityAssociations-SA-IPSecProtocol"></a>

### SecurityAssociations.SA.IPSecProtocol
IPSec protocol

| Name | Number | Description |
| ---- | ------ | ----------- |
| AH | 0 |  |
| ESP | 1 |  |



<a name="opi-security-v1-SecurityPolicyDatabases-SPD-PolicyEntry-Action"></a>

### SecurityPolicyDatabases.SPD.PolicyEntry.Action
Policy action

| Name | Number | Description |
| ---- | ------ | ----------- |
| BYPASS | 0 |  |
| DISCARD | 1 |  |
| PROTECT | 3 | RESOLVE = 2; // unused in VPP |


 

 


<a name="opi-security-v1-IPSecService"></a>

### IPSecService


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| IPSecServiceCreate | [IPSecServiceCreateRequest](#opi-security-v1-IPSecServiceCreateRequest) | [IPSecServiceCreateResponse](#opi-security-v1-IPSecServiceCreateResponse) |  |
| IPSecServiceDelete | [IPSecServiceDeleteRequest](#opi-security-v1-IPSecServiceDeleteRequest) | [IPSecServiceDeleteResponse](#opi-security-v1-IPSecServiceDeleteResponse) |  |
| IPSecServiceUpdate | [IPSecServiceUpdateRequest](#opi-security-v1-IPSecServiceUpdateRequest) | [IPSecServiceUpdateResponse](#opi-security-v1-IPSecServiceUpdateResponse) |  |
| IPSecServiceList | [IPSecServiceListRequest](#opi-security-v1-IPSecServiceListRequest) | [IPSecServiceListResponse](#opi-security-v1-IPSecServiceListResponse) |  |
| IPSecServiceGet | [IPSecServiceGetRequest](#opi-security-v1-IPSecServiceGetRequest) | [IPSecServiceGetResponse](#opi-security-v1-IPSecServiceGetResponse) |  |

 



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

