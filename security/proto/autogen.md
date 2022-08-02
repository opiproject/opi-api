# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [ipsec.proto](#ipsec-proto)
    - [IPsecCreateRequest](#opi-security-v1-IPsecCreateRequest)
    - [IPsecCreateResponse](#opi-security-v1-IPsecCreateResponse)
    - [IPsecDeleteRequest](#opi-security-v1-IPsecDeleteRequest)
    - [IPsecDeleteResponse](#opi-security-v1-IPsecDeleteResponse)
    - [IPsecGetRequest](#opi-security-v1-IPsecGetRequest)
    - [IPsecGetResponse](#opi-security-v1-IPsecGetResponse)
    - [IPsecListRequest](#opi-security-v1-IPsecListRequest)
    - [IPsecListResponse](#opi-security-v1-IPsecListResponse)
    - [IPsecListResponse.IPsecData](#opi-security-v1-IPsecListResponse-IPsecData)
    - [IPsecUpdateRequest](#opi-security-v1-IPsecUpdateRequest)
    - [IPsecUpdateResponse](#opi-security-v1-IPsecUpdateResponse)
    - [ResyncRequest](#opi-security-v1-ResyncRequest)
    - [SecurityAssociations](#opi-security-v1-SecurityAssociations)
    - [SecurityAssociations.Sa](#opi-security-v1-SecurityAssociations-Sa)
    - [SecurityPolicyDatabases](#opi-security-v1-SecurityPolicyDatabases)
    - [SecurityPolicyDatabases.Spd](#opi-security-v1-SecurityPolicyDatabases-Spd)
    - [SecurityPolicyDatabases.Spd.Interface](#opi-security-v1-SecurityPolicyDatabases-Spd-Interface)
    - [SecurityPolicyDatabases.Spd.PolicyEntry](#opi-security-v1-SecurityPolicyDatabases-Spd-PolicyEntry)
    - [TunnelInterfaces](#opi-security-v1-TunnelInterfaces)
    - [TunnelInterfaces.Tunnel](#opi-security-v1-TunnelInterfaces-Tunnel)
    - [Uuid](#opi-security-v1-Uuid)
  
    - [CryptoAlgorithm](#opi-security-v1-CryptoAlgorithm)
    - [IPsecMode](#opi-security-v1-IPsecMode)
    - [IntegAlgorithm](#opi-security-v1-IntegAlgorithm)
    - [SecurityAssociations.Sa.IPsecProtocol](#opi-security-v1-SecurityAssociations-Sa-IPsecProtocol)
    - [SecurityPolicyDatabases.Spd.PolicyEntry.Action](#opi-security-v1-SecurityPolicyDatabases-Spd-PolicyEntry-Action)
  
    - [IPsec](#opi-security-v1-IPsec)
  
- [Scalar Value Types](#scalar-value-types)



<a name="ipsec-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## ipsec.proto
Copyright (C) 2021 Intel Corporation
SPDX-License-Identifier: Apache-2.0

Major pieces taken from:
https://github.com/ligato/cn-infra/blob/master/examples/cryptodata-proto-plugin/ipsec/ipsec.proto


<a name="opi-security-v1-IPsecCreateRequest"></a>

### IPsecCreateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| tunnel | [TunnelInterfaces](#opi-security-v1-TunnelInterfaces) |  |  |
| policy | [SecurityPolicyDatabases](#opi-security-v1-SecurityPolicyDatabases) |  |  |
| sa | [SecurityAssociations](#opi-security-v1-SecurityAssociations) |  |  |






<a name="opi-security-v1-IPsecCreateResponse"></a>

### IPsecCreateResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [Uuid](#opi-security-v1-Uuid) |  |  |






<a name="opi-security-v1-IPsecDeleteRequest"></a>

### IPsecDeleteRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [Uuid](#opi-security-v1-Uuid) |  |  |






<a name="opi-security-v1-IPsecDeleteResponse"></a>

### IPsecDeleteResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [Uuid](#opi-security-v1-Uuid) |  |  |






<a name="opi-security-v1-IPsecGetRequest"></a>

### IPsecGetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [Uuid](#opi-security-v1-Uuid) |  |  |






<a name="opi-security-v1-IPsecGetResponse"></a>

### IPsecGetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [Uuid](#opi-security-v1-Uuid) |  |  |
| tunnel | [TunnelInterfaces](#opi-security-v1-TunnelInterfaces) |  |  |
| policy | [SecurityPolicyDatabases](#opi-security-v1-SecurityPolicyDatabases) |  |  |
| sa | [SecurityAssociations](#opi-security-v1-SecurityAssociations) |  |  |






<a name="opi-security-v1-IPsecListRequest"></a>

### IPsecListRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [Uuid](#opi-security-v1-Uuid) |  |  |






<a name="opi-security-v1-IPsecListResponse"></a>

### IPsecListResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| ipsec | [IPsecListResponse.IPsecData](#opi-security-v1-IPsecListResponse-IPsecData) | repeated |  |






<a name="opi-security-v1-IPsecListResponse-IPsecData"></a>

### IPsecListResponse.IPsecData



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| tunnel | [TunnelInterfaces](#opi-security-v1-TunnelInterfaces) |  |  |
| policy | [SecurityPolicyDatabases](#opi-security-v1-SecurityPolicyDatabases) |  |  |
| sa | [SecurityAssociations](#opi-security-v1-SecurityAssociations) |  |  |






<a name="opi-security-v1-IPsecUpdateRequest"></a>

### IPsecUpdateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [Uuid](#opi-security-v1-Uuid) |  |  |
| tunnel | [TunnelInterfaces](#opi-security-v1-TunnelInterfaces) |  |  |
| policy | [SecurityPolicyDatabases](#opi-security-v1-SecurityPolicyDatabases) |  |  |
| sa | [SecurityAssociations](#opi-security-v1-SecurityAssociations) |  |  |






<a name="opi-security-v1-IPsecUpdateResponse"></a>

### IPsecUpdateResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [Uuid](#opi-security-v1-Uuid) |  |  |






<a name="opi-security-v1-ResyncRequest"></a>

### ResyncRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| tunnels | [TunnelInterfaces.Tunnel](#opi-security-v1-TunnelInterfaces-Tunnel) | repeated |  |
| spds | [SecurityPolicyDatabases.Spd](#opi-security-v1-SecurityPolicyDatabases-Spd) | repeated |  |
| sas | [SecurityAssociations.Sa](#opi-security-v1-SecurityAssociations-Sa) | repeated |  |






<a name="opi-security-v1-SecurityAssociations"></a>

### SecurityAssociations
Security Association (SA)


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| sas | [SecurityAssociations.Sa](#opi-security-v1-SecurityAssociations-Sa) | repeated |  |






<a name="opi-security-v1-SecurityAssociations-Sa"></a>

### SecurityAssociations.Sa



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | security association name |
| spi | [uint32](#uint32) |  | security parameter index |
| protocol | [SecurityAssociations.Sa.IPsecProtocol](#opi-security-v1-SecurityAssociations-Sa-IPsecProtocol) |  |  |
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
| spds | [SecurityPolicyDatabases.Spd](#opi-security-v1-SecurityPolicyDatabases-Spd) | repeated | list of all SPDs |






<a name="opi-security-v1-SecurityPolicyDatabases-Spd"></a>

### SecurityPolicyDatabases.Spd



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| interfaces | [SecurityPolicyDatabases.Spd.Interface](#opi-security-v1-SecurityPolicyDatabases-Spd-Interface) | repeated | list of interfaces belonging to this SPD |
| policy_entries | [SecurityPolicyDatabases.Spd.PolicyEntry](#opi-security-v1-SecurityPolicyDatabases-Spd-PolicyEntry) | repeated | list of policy entries belonging to this SPD |






<a name="opi-security-v1-SecurityPolicyDatabases-Spd-Interface"></a>

### SecurityPolicyDatabases.Spd.Interface
Interface


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | interface name |






<a name="opi-security-v1-SecurityPolicyDatabases-Spd-PolicyEntry"></a>

### SecurityPolicyDatabases.Spd.PolicyEntry
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
| action | [SecurityPolicyDatabases.Spd.PolicyEntry.Action](#opi-security-v1-SecurityPolicyDatabases-Spd-PolicyEntry-Action) |  | policy action |






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
| mode | [IPsecMode](#opi-security-v1-IPsecMode) |  | Tunnel or transport mode |
| enabled | [bool](#bool) |  | Extra fields related to interface |
| ip_addresses | [string](#string) | repeated |  |
| vrf | [uint32](#uint32) |  |  |






<a name="opi-security-v1-Uuid"></a>

### Uuid



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| value | [string](#string) |  |  |





 


<a name="opi-security-v1-CryptoAlgorithm"></a>

### CryptoAlgorithm
Cryptographic algorithm for encryption

| Name | Number | Description |
| ---- | ------ | ----------- |
| NONE_CRYPTO | 0 |  |
| AES_CBC_128 | 1 |  |
| AES_CBC_192 | 2 |  |
| AES_CBC_256 | 3 |  |
| AES_GCM_128 | 4 |  |
| AES_GCM_256 | 5 |  |
| AES_GMAC_128 | 6 |  |
| AES_GMAC_256 | 7 |  |



<a name="opi-security-v1-IPsecMode"></a>

### IPsecMode
Tunnel mode

| Name | Number | Description |
| ---- | ------ | ----------- |
| TUNNEL_MODE | 0 |  |
| TRANSPORT_MODE | 1 |  |



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



<a name="opi-security-v1-SecurityAssociations-Sa-IPsecProtocol"></a>

### SecurityAssociations.Sa.IPsecProtocol
IPsec protocol

| Name | Number | Description |
| ---- | ------ | ----------- |
| AH | 0 |  |
| ESP | 1 |  |



<a name="opi-security-v1-SecurityPolicyDatabases-Spd-PolicyEntry-Action"></a>

### SecurityPolicyDatabases.Spd.PolicyEntry.Action
Policy action

| Name | Number | Description |
| ---- | ------ | ----------- |
| BYPASS | 0 |  |
| DISCARD | 1 |  |
| PROTECT | 3 | RESOLVE = 2; // unused in VPP |


 

 


<a name="opi-security-v1-IPsec"></a>

### IPsec


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| IPsecCreate | [IPsecCreateRequest](#opi-security-v1-IPsecCreateRequest) | [IPsecCreateResponse](#opi-security-v1-IPsecCreateResponse) |  |
| IPsecDelete | [IPsecDeleteRequest](#opi-security-v1-IPsecDeleteRequest) | [IPsecDeleteResponse](#opi-security-v1-IPsecDeleteResponse) |  |
| IPsecUpdate | [IPsecUpdateRequest](#opi-security-v1-IPsecUpdateRequest) | [IPsecUpdateResponse](#opi-security-v1-IPsecUpdateResponse) |  |
| IPsecList | [IPsecListRequest](#opi-security-v1-IPsecListRequest) | [IPsecListResponse](#opi-security-v1-IPsecListResponse) |  |
| IPsecGet | [IPsecGetRequest](#opi-security-v1-IPsecGetRequest) | [IPsecGetResponse](#opi-security-v1-IPsecGetResponse) |  |

 



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

