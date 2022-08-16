# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [ipsec.proto](#ipsec-proto)
    - [Addrs](#opi-security-v1-Addrs)
    - [CaCerts](#opi-security-v1-CaCerts)
    - [CertPolicy](#opi-security-v1-CertPolicy)
    - [Certs](#opi-security-v1-Certs)
    - [Child](#opi-security-v1-Child)
    - [Connection](#opi-security-v1-Connection)
    - [Groups](#opi-security-v1-Groups)
    - [IPsecInitiateReq](#opi-security-v1-IPsecInitiateReq)
    - [IPsecInitiateResp](#opi-security-v1-IPsecInitiateResp)
    - [IPsecListCertsReq](#opi-security-v1-IPsecListCertsReq)
    - [IPsecListCertsResp](#opi-security-v1-IPsecListCertsResp)
    - [IPsecListConnsReq](#opi-security-v1-IPsecListConnsReq)
    - [IPsecListConnsResp](#opi-security-v1-IPsecListConnsResp)
    - [IPsecListSasReq](#opi-security-v1-IPsecListSasReq)
    - [IPsecListSasResp](#opi-security-v1-IPsecListSasResp)
    - [IPsecLoadConnReq](#opi-security-v1-IPsecLoadConnReq)
    - [IPsecLoadConnResp](#opi-security-v1-IPsecLoadConnResp)
    - [IPsecRekeyReq](#opi-security-v1-IPsecRekeyReq)
    - [IPsecRekeyResp](#opi-security-v1-IPsecRekeyResp)
    - [IPsecStatsReq](#opi-security-v1-IPsecStatsReq)
    - [IPsecStatsResp](#opi-security-v1-IPsecStatsResp)
    - [IPsecTerminateReq](#opi-security-v1-IPsecTerminateReq)
    - [IPsecTerminateResp](#opi-security-v1-IPsecTerminateResp)
    - [IPsecUnloadConnReq](#opi-security-v1-IPsecUnloadConnReq)
    - [IPsecUnloadConnResp](#opi-security-v1-IPsecUnloadConnResp)
    - [IPsecVersionReq](#opi-security-v1-IPsecVersionReq)
    - [IPsecVersionResp](#opi-security-v1-IPsecVersionResp)
    - [LocalAuth](#opi-security-v1-LocalAuth)
    - [Pools](#opi-security-v1-Pools)
    - [Proposals](#opi-security-v1-Proposals)
    - [PubKeys](#opi-security-v1-PubKeys)
    - [RemoteAuth](#opi-security-v1-RemoteAuth)
    - [ResyncRequest](#opi-security-v1-ResyncRequest)
    - [SecurityAssociations](#opi-security-v1-SecurityAssociations)
    - [SecurityAssociations.Sa](#opi-security-v1-SecurityAssociations-Sa)
    - [SecurityPolicyDatabases](#opi-security-v1-SecurityPolicyDatabases)
    - [SecurityPolicyDatabases.Spd](#opi-security-v1-SecurityPolicyDatabases-Spd)
    - [SecurityPolicyDatabases.Spd.Interface](#opi-security-v1-SecurityPolicyDatabases-Spd-Interface)
    - [SecurityPolicyDatabases.Spd.PolicyEntry](#opi-security-v1-SecurityPolicyDatabases-Spd-PolicyEntry)
    - [TrafficSelectors](#opi-security-v1-TrafficSelectors)
    - [TrafficSelectors.TrafficSelector](#opi-security-v1-TrafficSelectors-TrafficSelector)
    - [TunnelInterfaces](#opi-security-v1-TunnelInterfaces)
    - [TunnelInterfaces.Tunnel](#opi-security-v1-TunnelInterfaces-Tunnel)
    - [Uuid](#opi-security-v1-Uuid)
    - [Vips](#opi-security-v1-Vips)
  
    - [AuthType](#opi-security-v1-AuthType)
    - [CryptoAlgorithm](#opi-security-v1-CryptoAlgorithm)
    - [DiffieHellmanGroups](#opi-security-v1-DiffieHellmanGroups)
    - [IPsecMode](#opi-security-v1-IPsecMode)
    - [IntegAlgorithm](#opi-security-v1-IntegAlgorithm)
    - [PseudoRandomFunction](#opi-security-v1-PseudoRandomFunction)
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


<a name="opi-security-v1-Addrs"></a>

### Addrs
IP addresses or hostanmes


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| addr | [string](#string) |  |  |






<a name="opi-security-v1-CaCerts"></a>

### CaCerts



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| cacert | [string](#string) | repeated |  |






<a name="opi-security-v1-CertPolicy"></a>

### CertPolicy



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| cert_policy | [string](#string) | repeated |  |






<a name="opi-security-v1-Certs"></a>

### Certs



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| cert | [string](#string) | repeated |  |






<a name="opi-security-v1-Child"></a>

### Child
Child SA


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Child SA name |
| ag_proposals | [Proposals](#opi-security-v1-Proposals) |  |  |
| esp_proposals | [Proposals](#opi-security-v1-Proposals) |  |  |
| local_ts | [TrafficSelectors](#opi-security-v1-TrafficSelectors) |  |  |
| remote_ts | [TrafficSelectors](#opi-security-v1-TrafficSelectors) |  |  |
| rekey_time | [uint32](#uint32) |  |  |
| life_time | [uint32](#uint32) |  |  |
| rand_time | [uint32](#uint32) |  |  |
| updown | [string](#string) |  |  |
| inactivity | [uint32](#uint32) |  |  |
| mark_in | [uint32](#uint32) |  |  |
| mark_in_sa | [string](#string) |  |  |
| mark_out | [uint32](#uint32) |  |  |
| set_mark_in | [uint32](#uint32) |  |  |
| set_mark_out | [uint32](#uint32) |  |  |
| hw_offload | [string](#string) |  |  |






<a name="opi-security-v1-Connection"></a>

### Connection
IKE connection


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | connection name |
| version | [string](#string) |  |  |
| local_addrs | [Addrs](#opi-security-v1-Addrs) | repeated |  |
| remote_addrs | [Addrs](#opi-security-v1-Addrs) | repeated |  |
| local_port | [uint32](#uint32) |  |  |
| remote_port | [uint32](#uint32) |  |  |
| proposals | [Proposals](#opi-security-v1-Proposals) |  |  |
| vips | [Vips](#opi-security-v1-Vips) |  |  |
| dscp | [uint64](#uint64) |  | We use only the lower 6 bytes |
| encap | [string](#string) |  |  |
| mobike | [string](#string) |  |  |
| dpd_delay | [uint32](#uint32) |  |  |
| dpd_timeout | [uint32](#uint32) |  |  |
| reauth_time | [uint32](#uint32) |  |  |
| rekey_time | [uint32](#uint32) |  |  |
| pools | [Pools](#opi-security-v1-Pools) |  |  |
| local_auth | [LocalAuth](#opi-security-v1-LocalAuth) |  |  |
| remote_auth | [RemoteAuth](#opi-security-v1-RemoteAuth) |  |  |
| children | [Child](#opi-security-v1-Child) | repeated |  |






<a name="opi-security-v1-Groups"></a>

### Groups



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group | [string](#string) | repeated |  |






<a name="opi-security-v1-IPsecInitiateReq"></a>

### IPsecInitiateReq



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| child | [string](#string) |  |  |
| ike | [string](#string) |  |  |
| timeout | [string](#string) |  |  |
| loglevel | [string](#string) |  |  |






<a name="opi-security-v1-IPsecInitiateResp"></a>

### IPsecInitiateResp
Intentionally empty






<a name="opi-security-v1-IPsecListCertsReq"></a>

### IPsecListCertsReq



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| type | [string](#string) |  |  |
| flag | [string](#string) |  |  |
| subject | [string](#string) |  |  |






<a name="opi-security-v1-IPsecListCertsResp"></a>

### IPsecListCertsResp



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| cert | [Certs](#opi-security-v1-Certs) | repeated |  |






<a name="opi-security-v1-IPsecListConnsReq"></a>

### IPsecListConnsReq



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| ike | [string](#string) |  |  |






<a name="opi-security-v1-IPsecListConnsResp"></a>

### IPsecListConnsResp



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| connection | [Connection](#opi-security-v1-Connection) | repeated |  |






<a name="opi-security-v1-IPsecListSasReq"></a>

### IPsecListSasReq



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| noblock | [string](#string) |  |  |
| ike | [string](#string) |  |  |
| ike_id | [string](#string) |  |  |
| child | [string](#string) |  |  |
| child_id | [string](#string) |  |  |






<a name="opi-security-v1-IPsecListSasResp"></a>

### IPsecListSasResp



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| connection | [Connection](#opi-security-v1-Connection) | repeated |  |






<a name="opi-security-v1-IPsecLoadConnReq"></a>

### IPsecLoadConnReq



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| connection | [Connection](#opi-security-v1-Connection) |  |  |






<a name="opi-security-v1-IPsecLoadConnResp"></a>

### IPsecLoadConnResp



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| success | [string](#string) |  |  |






<a name="opi-security-v1-IPsecRekeyReq"></a>

### IPsecRekeyReq



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| child | [string](#string) |  |  |
| ike | [string](#string) |  |  |
| child_id | [string](#string) |  |  |
| ike_id | [string](#string) |  |  |
| reauth | [string](#string) |  |  |






<a name="opi-security-v1-IPsecRekeyResp"></a>

### IPsecRekeyResp



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| success | [string](#string) |  |  |
| matches | [uint32](#uint32) |  |  |






<a name="opi-security-v1-IPsecStatsReq"></a>

### IPsecStatsReq
Intentionally empty






<a name="opi-security-v1-IPsecStatsResp"></a>

### IPsecStatsResp



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| status | [string](#string) |  | Generic status string for now |






<a name="opi-security-v1-IPsecTerminateReq"></a>

### IPsecTerminateReq



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| child | [string](#string) |  |  |
| ike | [string](#string) |  |  |
| child_id | [string](#string) |  |  |
| ike_id | [string](#string) |  |  |
| force | [string](#string) |  |  |
| timeout | [string](#string) |  |  |
| loglevel | [string](#string) |  |  |






<a name="opi-security-v1-IPsecTerminateResp"></a>

### IPsecTerminateResp



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| success | [string](#string) |  |  |
| matches | [uint32](#uint32) |  |  |
| terminated | [uint32](#uint32) |  |  |






<a name="opi-security-v1-IPsecUnloadConnReq"></a>

### IPsecUnloadConnReq



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi-security-v1-IPsecUnloadConnResp"></a>

### IPsecUnloadConnResp



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| success | [string](#string) |  |  |






<a name="opi-security-v1-IPsecVersionReq"></a>

### IPsecVersionReq
Intentionally empty






<a name="opi-security-v1-IPsecVersionResp"></a>

### IPsecVersionResp



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| daemon | [string](#string) |  |  |
| version | [string](#string) |  |  |
| sysname | [string](#string) |  |  |
| release | [string](#string) |  |  |
| machine | [string](#string) |  |  |






<a name="opi-security-v1-LocalAuth"></a>

### LocalAuth



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| auth | [AuthType](#opi-security-v1-AuthType) |  |  |
| id | [string](#string) |  |  |
| eap_id | [string](#string) |  |  |
| aaa_id | [string](#string) |  |  |
| xauth_id | [string](#string) |  |  |
| certs | [Certs](#opi-security-v1-Certs) |  |  |
| pubkeys | [PubKeys](#opi-security-v1-PubKeys) |  |  |






<a name="opi-security-v1-Pools"></a>

### Pools



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| pool | [string](#string) | repeated |  |






<a name="opi-security-v1-Proposals"></a>

### Proposals



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| crypto_alg | [CryptoAlgorithm](#opi-security-v1-CryptoAlgorithm) | repeated |  |
| integ_alg | [IntegAlgorithm](#opi-security-v1-IntegAlgorithm) | repeated |  |
| prf | [PseudoRandomFunction](#opi-security-v1-PseudoRandomFunction) | repeated |  |
| dhgroups | [DiffieHellmanGroups](#opi-security-v1-DiffieHellmanGroups) | repeated |  |






<a name="opi-security-v1-PubKeys"></a>

### PubKeys



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| pubkey | [string](#string) | repeated |  |






<a name="opi-security-v1-RemoteAuth"></a>

### RemoteAuth



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| auth | [AuthType](#opi-security-v1-AuthType) |  |  |
| id | [string](#string) |  |  |
| eap_id | [string](#string) |  |  |
| groups | [Groups](#opi-security-v1-Groups) |  |  |
| cert_policy | [CertPolicy](#opi-security-v1-CertPolicy) |  |  |
| certs | [Certs](#opi-security-v1-Certs) |  |  |
| ca_certs | [CaCerts](#opi-security-v1-CaCerts) |  |  |
| pubkeys | [PubKeys](#opi-security-v1-PubKeys) |  |  |






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
| dhgroups | [DiffieHellmanGroups](#opi-security-v1-DiffieHellmanGroups) |  |  |
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






<a name="opi-security-v1-TrafficSelectors"></a>

### TrafficSelectors



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| ts | [TrafficSelectors.TrafficSelector](#opi-security-v1-TrafficSelectors-TrafficSelector) | repeated |  |






<a name="opi-security-v1-TrafficSelectors-TrafficSelector"></a>

### TrafficSelectors.TrafficSelector



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| cidr | [string](#string) |  |  |
| proto | [string](#string) |  |  |
| port | [string](#string) |  |  |






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
| dhgroups | [DiffieHellmanGroups](#opi-security-v1-DiffieHellmanGroups) |  |  |
| mode | [IPsecMode](#opi-security-v1-IPsecMode) |  | Tunnel or transport mode |
| enabled | [bool](#bool) |  | Extra fields related to interface |
| ip_addresses | [string](#string) | repeated |  |
| vrf | [uint32](#uint32) |  |  |






<a name="opi-security-v1-Uuid"></a>

### Uuid



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| value | [string](#string) |  |  |






<a name="opi-security-v1-Vips"></a>

### Vips



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vip | [string](#string) | repeated |  |





 


<a name="opi-security-v1-AuthType"></a>

### AuthType
Authentication Type

| Name | Number | Description |
| ---- | ------ | ----------- |
| PUBKEY | 0 |  |
| PSK | 1 |  |
| XAUTH | 2 |  |
| EAP | 3 |  |



<a name="opi-security-v1-CryptoAlgorithm"></a>

### CryptoAlgorithm
Cryptographic algorithm for encryption

| Name | Number | Description |
| ---- | ------ | ----------- |
| NONE_CRYPTO | 0 |  |
| AES128 | 1 |  |
| AES192 | 2 |  |
| AES256 | 3 |  |
| AES128GCM128 | 4 |  |
| AES256GCM128 | 5 |  |
| AES128GMAC | 6 |  |
| AES256GMAC | 7 |  |



<a name="opi-security-v1-DiffieHellmanGroups"></a>

### DiffieHellmanGroups
Diffie Hellman Groups

| Name | Number | Description |
| ---- | ------ | ----------- |
| NONE_DH_GROUP | 0 |  |
| MODP768 | 1 |  |
| MODP1024 | 2 |  |
| MODP1536 | 3 |  |
| MODP2048 | 4 |  |
| MODP3072 | 5 |  |
| MODP4096 | 6 |  |
| MODP6144 | 7 |  |
| MODP8192 | 8 |  |
| MODP1024S160 | 9 |  |
| MODP2048S224 | 10 |  |
| MODP2048S256 | 11 |  |
| CURVE25519 | 12 |  |



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
| MD5 | 1 |  |
| MD5_128 | 2 |  |
| SHA1 | 3 |  |
| SHA1_160 | 4 |  |
| SHA256 | 5 |  |
| SHA384 | 7 |  |
| SHA512 | 8 |  |
| SHA256_96 | 9 |  |



<a name="opi-security-v1-PseudoRandomFunction"></a>

### PseudoRandomFunction


| Name | Number | Description |
| ---- | ------ | ----------- |
| NONE_PRF | 0 |  |
| PRFMD5 | 1 |  |
| PRFSHA1 | 2 |  |
| PRFAESXCBC | 3 |  |
| PRFAESCMAC | 4 |  |
| PRFSHA256 | 5 |  |
| PRFSHA384 | 6 |  |
| PRFSHA512 | 7 |  |



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
| IPsecVersion | [IPsecVersionReq](#opi-security-v1-IPsecVersionReq) | [IPsecVersionResp](#opi-security-v1-IPsecVersionResp) |  |
| IPsecStats | [IPsecStatsReq](#opi-security-v1-IPsecStatsReq) | [IPsecStatsResp](#opi-security-v1-IPsecStatsResp) |  |
| IPsecInitiate | [IPsecInitiateReq](#opi-security-v1-IPsecInitiateReq) | [IPsecInitiateResp](#opi-security-v1-IPsecInitiateResp) |  |
| IPsecTerminate | [IPsecTerminateReq](#opi-security-v1-IPsecTerminateReq) | [IPsecTerminateResp](#opi-security-v1-IPsecTerminateResp) |  |
| IPsecRekey | [IPsecRekeyReq](#opi-security-v1-IPsecRekeyReq) | [IPsecRekeyResp](#opi-security-v1-IPsecRekeyResp) |  |
| IPsecListSas | [IPsecListSasReq](#opi-security-v1-IPsecListSasReq) | [IPsecListSasResp](#opi-security-v1-IPsecListSasResp) |  |
| IPsecListConns | [IPsecListConnsReq](#opi-security-v1-IPsecListConnsReq) | [IPsecListConnsResp](#opi-security-v1-IPsecListConnsResp) |  |
| IPsecListCerts | [IPsecListCertsReq](#opi-security-v1-IPsecListCertsReq) | [IPsecListCertsResp](#opi-security-v1-IPsecListCertsResp) |  |
| IPsecLoadConn | [IPsecLoadConnReq](#opi-security-v1-IPsecLoadConnReq) | [IPsecLoadConnResp](#opi-security-v1-IPsecLoadConnResp) |  |
| IPsecUnloadConn | [IPsecUnloadConnReq](#opi-security-v1-IPsecUnloadConnReq) | [IPsecUnloadConnReq](#opi-security-v1-IPsecUnloadConnReq) |  |

 



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

