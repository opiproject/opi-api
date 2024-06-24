# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [ipsec.proto](#ipsec-proto)
    - [AntiReplayStats](#opi_api-security-v2alpha1-AntiReplayStats)
    - [AntiReplayWindow](#opi_api-security-v2alpha1-AntiReplayWindow)
    - [CaCerts](#opi_api-security-v2alpha1-CaCerts)
    - [ChildSaInfo](#opi_api-security-v2alpha1-ChildSaInfo)
    - [CreateIkeConnRequest](#opi_api-security-v2alpha1-CreateIkeConnRequest)
    - [CreateIkeConnResponse](#opi_api-security-v2alpha1-CreateIkeConnResponse)
    - [CreateIkePeerRequest](#opi_api-security-v2alpha1-CreateIkePeerRequest)
    - [CreateIkePeerResponse](#opi_api-security-v2alpha1-CreateIkePeerResponse)
    - [CreateIpsecSaRequest](#opi_api-security-v2alpha1-CreateIpsecSaRequest)
    - [CreateIpsecSaResponse](#opi_api-security-v2alpha1-CreateIpsecSaResponse)
    - [DSAuth](#opi_api-security-v2alpha1-DSAuth)
    - [DeleteIkeConnRequest](#opi_api-security-v2alpha1-DeleteIkeConnRequest)
    - [DeleteIkeConnResponse](#opi_api-security-v2alpha1-DeleteIkeConnResponse)
    - [DeleteIkePeerRequest](#opi_api-security-v2alpha1-DeleteIkePeerRequest)
    - [DeleteIkePeerResponse](#opi_api-security-v2alpha1-DeleteIkePeerResponse)
    - [DeleteIpsecSaRequest](#opi_api-security-v2alpha1-DeleteIpsecSaRequest)
    - [DeleteIpsecSaResponse](#opi_api-security-v2alpha1-DeleteIpsecSaResponse)
    - [DscpMapping](#opi_api-security-v2alpha1-DscpMapping)
    - [Encap](#opi_api-security-v2alpha1-Encap)
    - [EspAlgorithms](#opi_api-security-v2alpha1-EspAlgorithms)
    - [GetIkeConnRequest](#opi_api-security-v2alpha1-GetIkeConnRequest)
    - [GetIkeConnResponse](#opi_api-security-v2alpha1-GetIkeConnResponse)
    - [GetIkePeerRequest](#opi_api-security-v2alpha1-GetIkePeerRequest)
    - [GetIkePeerResponse](#opi_api-security-v2alpha1-GetIkePeerResponse)
    - [GetIpsecSaRequest](#opi_api-security-v2alpha1-GetIpsecSaRequest)
    - [GetIpsecSaResponse](#opi_api-security-v2alpha1-GetIpsecSaResponse)
    - [IkeConnection](#opi_api-security-v2alpha1-IkeConnection)
    - [IkeConnectionState](#opi_api-security-v2alpha1-IkeConnectionState)
    - [IkeFragmentation](#opi_api-security-v2alpha1-IkeFragmentation)
    - [IkePeer](#opi_api-security-v2alpha1-IkePeer)
    - [IkePeerAuthentication](#opi_api-security-v2alpha1-IkePeerAuthentication)
    - [IkeSaLifetimeHard](#opi_api-security-v2alpha1-IkeSaLifetimeHard)
    - [IkeSaLifetimeSoft](#opi_api-security-v2alpha1-IkeSaLifetimeSoft)
    - [IpsecPolicy](#opi_api-security-v2alpha1-IpsecPolicy)
    - [IpsecPolicyConfig](#opi_api-security-v2alpha1-IpsecPolicyConfig)
    - [IpsecSA](#opi_api-security-v2alpha1-IpsecSA)
    - [IpsecSaConfig](#opi_api-security-v2alpha1-IpsecSaConfig)
    - [IpsecSaLifetimeHard](#opi_api-security-v2alpha1-IpsecSaLifetimeHard)
    - [IpsecSaLifetimeSoft](#opi_api-security-v2alpha1-IpsecSaLifetimeSoft)
    - [IpsecSaState](#opi_api-security-v2alpha1-IpsecSaState)
    - [IpsecSaTemplate](#opi_api-security-v2alpha1-IpsecSaTemplate)
    - [Lifetime](#opi_api-security-v2alpha1-Lifetime)
    - [ListIkeConnsRequest](#opi_api-security-v2alpha1-ListIkeConnsRequest)
    - [ListIkeConnsResponse](#opi_api-security-v2alpha1-ListIkeConnsResponse)
    - [ListIkePeersRequest](#opi_api-security-v2alpha1-ListIkePeersRequest)
    - [ListIkePeersResponse](#opi_api-security-v2alpha1-ListIkePeersResponse)
    - [ListIpsecSasRequest](#opi_api-security-v2alpha1-ListIpsecSasRequest)
    - [ListIpsecSasResponse](#opi_api-security-v2alpha1-ListIpsecSasResponse)
    - [NumberIkeSAs](#opi_api-security-v2alpha1-NumberIkeSAs)
    - [PortRange](#opi_api-security-v2alpha1-PortRange)
    - [SpdProcessingInfo](#opi_api-security-v2alpha1-SpdProcessingInfo)
    - [TrafficSelector](#opi_api-security-v2alpha1-TrafficSelector)
    - [Tunnel](#opi_api-security-v2alpha1-Tunnel)
    - [UpdateIkeConnRequest](#opi_api-security-v2alpha1-UpdateIkeConnRequest)
    - [UpdateIkeConnResponse](#opi_api-security-v2alpha1-UpdateIkeConnResponse)
    - [UpdateIkePeerRequest](#opi_api-security-v2alpha1-UpdateIkePeerRequest)
    - [UpdateIkePeerResponse](#opi_api-security-v2alpha1-UpdateIkePeerResponse)
    - [UpdateIpsecSaRequest](#opi_api-security-v2alpha1-UpdateIpsecSaRequest)
    - [UpdateIpsecSaResponse](#opi_api-security-v2alpha1-UpdateIpsecSaResponse)
  
    - [AuthType](#opi_api-security-v2alpha1-AuthType)
    - [AutoStartupMode](#opi_api-security-v2alpha1-AutoStartupMode)
    - [DHGroups](#opi_api-security-v2alpha1-DHGroups)
    - [DSAlgorithm](#opi_api-security-v2alpha1-DSAlgorithm)
    - [DfBitAction](#opi_api-security-v2alpha1-DfBitAction)
    - [EncAlgorithm](#opi_api-security-v2alpha1-EncAlgorithm)
    - [EspEncap](#opi_api-security-v2alpha1-EspEncap)
    - [IkeVersion](#opi_api-security-v2alpha1-IkeVersion)
    - [IntegAlgorithm](#opi_api-security-v2alpha1-IntegAlgorithm)
    - [IpsecMode](#opi_api-security-v2alpha1-IpsecMode)
    - [IpsecProtocol](#opi_api-security-v2alpha1-IpsecProtocol)
    - [IpsecSpdAction](#opi_api-security-v2alpha1-IpsecSpdAction)
    - [LifetimeAction](#opi_api-security-v2alpha1-LifetimeAction)
    - [PRF](#opi_api-security-v2alpha1-PRF)
  
    - [IpsecService](#opi_api-security-v2alpha1-IpsecService)
  
- [Scalar Value Types](#scalar-value-types)



<a name="ipsec-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## ipsec.proto
Copyright (C) 2021 Intel Corporation
Copyright (c) 2023 Dell Inc, or its subsidiaries.
SPDX-License-Identifier: Apache-2.0

Major pieces taken from:
https://github.com/ligato/cn-infra/blob/master/examples/cryptodata-proto-plugin/ipsec/ipsec.proto

Service functions for IKE.

The configuration model is derived from RFC 9061.


<a name="opi_api-security-v2alpha1-AntiReplayStats"></a>

### AntiReplayStats
Anti-replay stats


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| replay_window | [AntiReplayWindow](#opi_api-security-v2alpha1-AntiReplayWindow) |  | ARW state |
| packet_dropped | [uint64](#uint64) |  | Packets dropped because they are replay packets |
| failed | [uint64](#uint64) |  | Number of packets detected out of the replay window |
| seq_num_counter | [uint64](#uint64) |  | Current value of the sequence number |






<a name="opi_api-security-v2alpha1-AntiReplayWindow"></a>

### AntiReplayWindow
Anti-replay window state. Three parameters define the state of the replay
window: window size (w), highest sequence number authenticated (t), and lower
bound of the window (b), according to Appendix A2.1 in RFC 4303 (w = t - b &#43;
1)


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| w | [uint32](#uint32) |  | Size of the replay window |
| t | [uint64](#uint64) |  | Highest sequence number authenticated so far, upper bound of window |
| b | [uint64](#uint64) |  | Lower bound of window |






<a name="opi_api-security-v2alpha1-CaCerts"></a>

### CaCerts



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| cacert | [string](#string) | repeated |  |






<a name="opi_api-security-v2alpha1-ChildSaInfo"></a>

### ChildSaInfo
Specific information for IPsec SAs. It includes Perfect Forward Secrecy (PFS)
group and IPsec SA rekey lifetimes.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| fs_groups | [uint32](#uint32) | repeated | If non-zero, forward secrecy is required when a new IPsec SA is being created. The non-zero value indicates the DH group number to use for the key exchange process used to achieve forward secrecy. The list is ordered following from the higher priority to lower priority. The first node of the list will be the algorithm with higher priority. |
| lifetime_soft | [IpsecSaLifetimeSoft](#opi_api-security-v2alpha1-IpsecSaLifetimeSoft) |  | Soft IPsec SA lifetime. After the lifetime, the lifetime action is performed. |
| lifetime_hard | [IpsecSaLifetimeHard](#opi_api-security-v2alpha1-IpsecSaLifetimeHard) |  | Hard IPsec SA lifetime. The action will be used to terminate the IPsec SA. |






<a name="opi_api-security-v2alpha1-CreateIkeConnRequest"></a>

### CreateIkeConnRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| connection | [IkeConnection](#opi_api-security-v2alpha1-IkeConnection) |  |  |






<a name="opi_api-security-v2alpha1-CreateIkeConnResponse"></a>

### CreateIkeConnResponse







<a name="opi_api-security-v2alpha1-CreateIkePeerRequest"></a>

### CreateIkePeerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [IkePeer](#opi_api-security-v2alpha1-IkePeer) |  |  |






<a name="opi_api-security-v2alpha1-CreateIkePeerResponse"></a>

### CreateIkePeerResponse







<a name="opi_api-security-v2alpha1-CreateIpsecSaRequest"></a>

### CreateIpsecSaRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| sa | [IpsecSA](#opi_api-security-v2alpha1-IpsecSA) |  |  |






<a name="opi_api-security-v2alpha1-CreateIpsecSaResponse"></a>

### CreateIpsecSaResponse







<a name="opi_api-security-v2alpha1-DSAuth"></a>

### DSAuth
Digital Signature Authentication


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| algorithm | [DSAlgorithm](#opi_api-security-v2alpha1-DSAlgorithm) |  | The digital signature algorithm |
| raw_public_key | [string](#string) |  |  |
| cert | [string](#string) |  |  |
| private_key | [string](#string) |  |  |
| ca_certs | [CaCerts](#opi_api-security-v2alpha1-CaCerts) |  |  |






<a name="opi_api-security-v2alpha1-DeleteIkeConnRequest"></a>

### DeleteIkeConnRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) | repeated | Connection name identifying the IKE connection to delete |






<a name="opi_api-security-v2alpha1-DeleteIkeConnResponse"></a>

### DeleteIkeConnResponse







<a name="opi_api-security-v2alpha1-DeleteIkePeerRequest"></a>

### DeleteIkePeerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Name of the IKE peer to delete |






<a name="opi_api-security-v2alpha1-DeleteIkePeerResponse"></a>

### DeleteIkePeerResponse







<a name="opi_api-security-v2alpha1-DeleteIpsecSaRequest"></a>

### DeleteIpsecSaRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Name of the SA to delete |






<a name="opi_api-security-v2alpha1-DeleteIpsecSaResponse"></a>

### DeleteIpsecSaResponse







<a name="opi_api-security-v2alpha1-DscpMapping"></a>

### DscpMapping



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [uint32](#uint32) |  | The list entry index with the different mappings. |
| inner_dscp | [uint32](#uint32) |  | The DSCP value of the inner IP packet. |
| outer_dscp | [uint32](#uint32) |  | The DSCP value of the outer IP packet. |






<a name="opi_api-security-v2alpha1-Encap"></a>

### Encap
Defines the type of encapsulation in case NAT traversal is required and
includes port information.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| espencap | [EspEncap](#opi_api-security-v2alpha1-EspEncap) |  | Type of encapsulation to use. |
| sport | [uint32](#uint32) |  | Encapsulation source port. Default = 4500 |
| dport | [uint32](#uint32) |  | Encapsulation destination port. Default = 4500 |






<a name="opi_api-security-v2alpha1-EspAlgorithms"></a>

### EspAlgorithms
Configuration of ESP parameters and algorithms


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| integrity | [IntegAlgorithm](#opi_api-security-v2alpha1-IntegAlgorithm) | repeated | Configuration of ESP authentication based on the specified integrity algorithm. With AEAD encryption algorithms, the integrity node is not used. |
| encryption | [EncAlgorithm](#opi_api-security-v2alpha1-EncAlgorithm) | repeated | Encryption of AEAD algorithm for the IPsec SAs. This list is ordered from higher priority to lower priority. The first node of the list will be the algorithm with the higher priority. If the list is empty then AES-256-GCM will be applied. |
| tfc_pad | [bool](#bool) | optional | If Traffic Flow Confidentiality (TFC) padding for ESP encryption can be used (true) or not (false). |






<a name="opi_api-security-v2alpha1-GetIkeConnRequest"></a>

### GetIkeConnRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Connection name identifying the IKE connection to retrieve |






<a name="opi_api-security-v2alpha1-GetIkeConnResponse"></a>

### GetIkeConnResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| connection | [IkeConnection](#opi_api-security-v2alpha1-IkeConnection) |  |  |






<a name="opi_api-security-v2alpha1-GetIkePeerRequest"></a>

### GetIkePeerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Name of the IKE peer to retrieve |






<a name="opi_api-security-v2alpha1-GetIkePeerResponse"></a>

### GetIkePeerResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peer | [IkePeer](#opi_api-security-v2alpha1-IkePeer) |  |  |






<a name="opi_api-security-v2alpha1-GetIpsecSaRequest"></a>

### GetIpsecSaRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Name of the SA to retrieve |






<a name="opi_api-security-v2alpha1-GetIpsecSaResponse"></a>

### GetIpsecSaResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| sa | [IpsecSA](#opi_api-security-v2alpha1-IpsecSA) |  |  |






<a name="opi_api-security-v2alpha1-IkeConnection"></a>

### IkeConnection
An IKE Connection specification


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Identifier for this connection entry. |
| autostartup | [AutoStartupMode](#opi_api-security-v2alpha1-AutoStartupMode) |  | IKE/IPsec connection startup behavior. Default: AUTO_STARTUP_MODE_ADD |
| version | [IkeVersion](#opi_api-security-v2alpha1-IkeVersion) |  | IKE version. Only version 2 is supported. |
| fragmentation | [IkeFragmentation](#opi_api-security-v2alpha1-IkeFragmentation) |  | IKE fragmentation |
| ike_sa_lifetime_soft | [IkeSaLifetimeSoft](#opi_api-security-v2alpha1-IkeSaLifetimeSoft) |  | IKE SA soft lifetime |
| ike_sa_lifetime_hard | [IkeSaLifetimeHard](#opi_api-security-v2alpha1-IkeSaLifetimeHard) |  | IKE SA hard lifetime |
| encryption_alg | [EncAlgorithm](#opi_api-security-v2alpha1-EncAlgorithm) | repeated | Cryptographic algorithms |
| integrity_alg | [IntegAlgorithm](#opi_api-security-v2alpha1-IntegAlgorithm) | repeated |  |
| prf | [PRF](#opi_api-security-v2alpha1-PRF) | repeated |  |
| dhgroups | [DHGroups](#opi_api-security-v2alpha1-DHGroups) | repeated |  |
| local | [string](#string) |  | Local peer name. |
| remote | [string](#string) |  | Remote peer name. |
| encap | [Encap](#opi_api-security-v2alpha1-Encap) | optional | Configuration information about the encapsulation that should be used when NAT traversal is required. No encapsulation is used if this field is not specified. |
| local_port | [uint32](#uint32) | optional | Local UDP port for IKE communication. Defaults to 500 if not specified. |
| remote_port | [uint32](#uint32) | optional | Remote UDP port for IKE communication. Defaults to 500 if not specified. |
| if_id | [string](#string) |  | Interface that this connection is associated with. Used for route based VPNs. |
| policies | [IpsecPolicy](#opi_api-security-v2alpha1-IpsecPolicy) | repeated | IPsec policies that apply to the connection |
| state | [IkeConnectionState](#opi_api-security-v2alpha1-IkeConnectionState) |  | Connection state / status |






<a name="opi_api-security-v2alpha1-IkeConnectionState"></a>

### IkeConnectionState
IKE state data for an IKE connection


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| initiator | [bool](#bool) |  | True if the local endpoint is acting as the initiator for this connection. |
| initiator_ike_spi | [uint32](#uint32) |  | Initiator&#39;s IKE SA SPI |
| responder_ike_sa | [uint32](#uint32) |  | Responder&#39;s IKE SA SPI |
| nat_local | [bool](#bool) |  | True if the local endpoint is behind a NAT. |
| nat_remote | [bool](#bool) |  | True if the remote endpoint is behind a NAT. |
| encap | [Encap](#opi_api-security-v2alpha1-Encap) |  | Provides information about the encapsulation that IKE is using. |
| established | [uint64](#uint64) |  | Seconds since this IKE SA has been established. |
| current_rekey_time | [uint64](#uint64) |  | Seconds before IKE SA is rekeyed |
| current_reauth_time | [uint64](#uint64) |  | Seconds before IKE SA is re-authenticated |






<a name="opi_api-security-v2alpha1-IkeFragmentation"></a>

### IkeFragmentation
IKEv2 Fragmentation, as per RFC 7383. If IKEv2 fragmentation is enabled, it
is possible to specify the MTU.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| enabled | [bool](#bool) |  | Enable/Disable IKEv2 fragmentation. |
| mtu | [uint32](#uint32) | optional | When fragmentation is enabled, the MTU that IKEv2 can use for IKEv2 fragmentation. |






<a name="opi_api-security-v2alpha1-IkePeer"></a>

### IkePeer
IKE Peer


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Name to uniquely identify the peer. |
| ip_address | [opi_api.network.opinetcommon.v1alpha1.IPAddress](#opi_api-network-opinetcommon-v1alpha1-IPAddress) | optional | IPv4 or IPv6 address of the peer. |
| fqdn | [string](#string) | optional | FQDN of the peer. |
| peer_auth | [IkePeerAuthentication](#opi_api-security-v2alpha1-IkePeerAuthentication) | optional |  |






<a name="opi_api-security-v2alpha1-IkePeerAuthentication"></a>

### IkePeerAuthentication
IKE Peer Authentication


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| auth_method | [AuthType](#opi_api-security-v2alpha1-AuthType) |  | Authentication method |
| eap_type | [uint32](#uint32) | optional | EAP method type specified with a value extracted from the IANA registry. This information provides the particular EAP method to be used. Depending on the EAP method, pre-shared keys or certificates may be used. |
| psk | [string](#string) | optional | Pre-shared secret value. This value MUST be set of the EAP method uses a pre-shared key or pre-shared authentication has been chosen. |
| digital_signature | [DSAuth](#opi_api-security-v2alpha1-DSAuth) | optional | Digital signature |






<a name="opi_api-security-v2alpha1-IkeSaLifetimeHard"></a>

### IkeSaLifetimeHard
IKE SA hard lifetime. When this time is reached, the IKE SA is removed.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| over_time | [uint32](#uint32) |  | Time in seconds before the IKE SA is removed. The value 0 means infinite. |






<a name="opi_api-security-v2alpha1-IkeSaLifetimeSoft"></a>

### IkeSaLifetimeSoft
IKE SA soft lifetime. Two lifetime values can be configured, either rekey
time of the IKE SA or reauth time of the IKE SA. When the rekey lifetime
expires, a rekey of the IKE SA starts. When reauth lifetime expires, an IKE
SA re-authentication starts.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| rekey_time | [uint32](#uint32) |  | Time in seconds between each IKE SA rekey. The value of 0 means infinite. |
| reauth_time | [uint32](#uint32) |  | Time in seconds between each IKE SA re-authentication. The value of 0 means infinite. |






<a name="opi_api-security-v2alpha1-IpsecPolicy"></a>

### IpsecPolicy



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Unique name to identify the IPsec policy in the SPD. |
| reqid | [uint64](#uint64) |  | This value allows linking this IPsec policy with the IPsec SAs with the same reqid. A value of 0 (the default) means that the reqid is unused. |
| config | [IpsecPolicyConfig](#opi_api-security-v2alpha1-IpsecPolicyConfig) |  | IPsec Policy configuration |






<a name="opi_api-security-v2alpha1-IpsecPolicyConfig"></a>

### IpsecPolicyConfig
Holds configuration information for an IPsec SPD entry.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| arw_size | [uint32](#uint32) | optional | Anti-Replay-Window size. If not set, the default value is 64, following the recommendation in RFC4303. |
| traffic_selector | [TrafficSelector](#opi_api-security-v2alpha1-TrafficSelector) |  | Packets are selected for processing actions based on Traffic Selector values, which refer to IP and inner protocol header information. |
| processing | [SpdProcessingInfo](#opi_api-security-v2alpha1-SpdProcessingInfo) |  | SPD processing to be performed on packets that match the traffic selector. |






<a name="opi_api-security-v2alpha1-IpsecSA"></a>

### IpsecSA
An IPsec Security Association (SA)


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Unique name in the SAD to identify this SA |
| reqid | [uint64](#uint64) |  | This value allows linking this IPsec SA with an IPsec policy with the same reqid |
| config | [IpsecSaConfig](#opi_api-security-v2alpha1-IpsecSaConfig) |  | IPsec SA configuration |
| state | [IpsecSaState](#opi_api-security-v2alpha1-IpsecSaState) |  | IPsec SA state |






<a name="opi_api-security-v2alpha1-IpsecSaConfig"></a>

### IpsecSaConfig
IPsec Security Association Configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| spi | [uint32](#uint32) |  | IPsec SA Security Parameter Index (SPI) |
| esn | [bool](#bool) |  | True if this IPsec SA is using extended sequence numbers. If true, the 64-bit extended sequence number counter is used. If false, the normal 32-bit sequence number counter is used. |
| arw_size | [uint32](#uint32) | optional | Anti-Replay-Window size. If not set, the default value is 64, following the recommendation in RFC4303. |
| traffic_selector | [TrafficSelector](#opi_api-security-v2alpha1-TrafficSelector) |  | Packets are selected for processing actions based on Traffic Selector values, which refer to IP and inner protocol header information. |
| protocol | [IpsecProtocol](#opi_api-security-v2alpha1-IpsecProtocol) |  | Security protocol of the IPsec SA. Only ESP is supported. |
| mode | [IpsecMode](#opi_api-security-v2alpha1-IpsecMode) |  | IPsec SA has to be processed in transport or tunnel mode. If not specified, transport mode is used. |
| esp_algorithms | [EspAlgorithms](#opi_api-security-v2alpha1-EspAlgorithms) |  | IPsec ESP algorithm configuration |
| tunnel | [Tunnel](#opi_api-security-v2alpha1-Tunnel) | optional | Tunnel configuration. Only relevant when mode = Tunnel. |
| lifetime_soft | [IpsecSaLifetimeSoft](#opi_api-security-v2alpha1-IpsecSaLifetimeSoft) |  | Soft IPsec SA lifetime. After the lifetime, the lifetime action is performed. |
| lifetime_hard | [IpsecSaLifetimeHard](#opi_api-security-v2alpha1-IpsecSaLifetimeHard) |  | Hard IPsec SA lifetime. The action will be used to terminate the IPsec SA. |
| encap | [Encap](#opi_api-security-v2alpha1-Encap) |  | Provides information about the encapsulation that the IPsec SA is using. |






<a name="opi_api-security-v2alpha1-IpsecSaLifetimeHard"></a>

### IpsecSaLifetimeHard



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| lifetime | [Lifetime](#opi_api-security-v2alpha1-Lifetime) |  |  |






<a name="opi_api-security-v2alpha1-IpsecSaLifetimeSoft"></a>

### IpsecSaLifetimeSoft



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| lifetime | [Lifetime](#opi_api-security-v2alpha1-Lifetime) |  |  |
| action | [LifetimeAction](#opi_api-security-v2alpha1-LifetimeAction) |  |  |






<a name="opi_api-security-v2alpha1-IpsecSaState"></a>

### IpsecSaState
IPsec Security Association State


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| lifetime | [Lifetime](#opi_api-security-v2alpha1-Lifetime) |  | SA Current Lifetime |
| replay_stats | [AntiReplayStats](#opi_api-security-v2alpha1-AntiReplayStats) |  | State about the anti-replay window |






<a name="opi_api-security-v2alpha1-IpsecSaTemplate"></a>

### IpsecSaTemplate



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| esn | [bool](#bool) |  | True if this IPsec SA is using extended sequence numbers. If true, the 64-bit extended sequence number counter is used. If false, the normal 32-bit sequence number counter is used. |
| mode | [IpsecMode](#opi_api-security-v2alpha1-IpsecMode) |  | IPsec SA has to be processed in transport or tunnel mode. If not specified, transport mode is used. |
| protocol | [IpsecProtocol](#opi_api-security-v2alpha1-IpsecProtocol) |  | Security protocol of the IPsec SA. Only ESP is supported. |
| esp_algorithms | [EspAlgorithms](#opi_api-security-v2alpha1-EspAlgorithms) |  | IPsec ESP algorithm configuration |
| tunnel | [Tunnel](#opi_api-security-v2alpha1-Tunnel) | optional | Tunnel configuration. Only relevant when mode = Tunnel. |






<a name="opi_api-security-v2alpha1-Lifetime"></a>

### Lifetime



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| time | [uint32](#uint32) |  | Time in seconds since the IPsec SA was added. For example, if this value is 180 seconds, it means the IPsec SA expires in 180 seconds after it was added. A value of 0 implies infinite. |
| bytes | [uint64](#uint64) |  | If the IPsec SA processes the number of bytes expressed in this field, the IPsec SA expires and should be rekeyed. A value of 0 implies infinite. |
| packets | [uint64](#uint64) |  | If the IPsec SA processes the number of packets expressed in this field, the IPsec SA expires and should be rekeyed. A value of 0 implies infinite. |
| idle | [uint32](#uint32) |  | If the IPsec SA is idle during this number of seconds, the IPsec SA should be removed. A value of 0 implies infinite. |






<a name="opi_api-security-v2alpha1-ListIkeConnsRequest"></a>

### ListIkeConnsRequest







<a name="opi_api-security-v2alpha1-ListIkeConnsResponse"></a>

### ListIkeConnsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| connections | [IkeConnection](#opi_api-security-v2alpha1-IkeConnection) | repeated |  |






<a name="opi_api-security-v2alpha1-ListIkePeersRequest"></a>

### ListIkePeersRequest







<a name="opi_api-security-v2alpha1-ListIkePeersResponse"></a>

### ListIkePeersResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| peers | [IkePeer](#opi_api-security-v2alpha1-IkePeer) | repeated |  |






<a name="opi_api-security-v2alpha1-ListIpsecSasRequest"></a>

### ListIpsecSasRequest
Intentionally empty






<a name="opi_api-security-v2alpha1-ListIpsecSasResponse"></a>

### ListIpsecSasResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| sas | [IpsecSA](#opi_api-security-v2alpha1-IpsecSA) | repeated |  |






<a name="opi_api-security-v2alpha1-NumberIkeSAs"></a>

### NumberIkeSAs
General information about the IKE SAs. In particular, it provides the number
of IKE SAs.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| total | [uint64](#uint64) |  | Total number of active IKE SAs. |
| half_open | [uint64](#uint64) |  | Number of half-open active IKE SAs. |






<a name="opi_api-security-v2alpha1-PortRange"></a>

### PortRange
A port range, such as that expressed in RFC 4301, for example 1500 (Start
Port Number) - 1600 (End Port Number). A port range is used in the Traffic
Selector. To express a single prot, set the same value as start and end.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| start | [uint32](#uint32) |  | Start port number. |
| end | [uint32](#uint32) |  | End port number. The end port number must be equal to or greater than the start port number. |






<a name="opi_api-security-v2alpha1-SpdProcessingInfo"></a>

### SpdProcessingInfo
SPD processing. If the required processing action is protect, it contains the
required information to process the packet.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| action | [IpsecSpdAction](#opi_api-security-v2alpha1-IpsecSpdAction) |  |  |
| sa_config | [IpsecSaTemplate](#opi_api-security-v2alpha1-IpsecSaTemplate) | optional | IPsec SA configuration included in the SPD entry. |






<a name="opi_api-security-v2alpha1-TrafficSelector"></a>

### TrafficSelector
A Traffic Selector used in IPsec policies and IPsec SAs.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| local_prefix | [opi_api.network.opinetcommon.v1alpha1.IPPrefix](#opi_api-network-opinetcommon-v1alpha1-IPPrefix) |  | Local IP address prefix. |
| remote_prefix | [opi_api.network.opinetcommon.v1alpha1.IPPrefix](#opi_api-network-opinetcommon-v1alpha1-IPPrefix) |  | Remote IP address prefix. |
| inner_protocol | [uint32](#uint32) |  | Inner protocol that is going to be protected with IPsec. If no protocol is specified, all inner protocol will be protected. |
| local_ports | [PortRange](#opi_api-security-v2alpha1-PortRange) | repeated | List of local ports. When the inner protocol is ICMP, this 16-bit value represents code and type. If this list is not defined, it is assumed that start and end are 0 by default (any port). |
| remote_ports | [PortRange](#opi_api-security-v2alpha1-PortRange) | repeated | List of remote ports. When the inner protocol is ICMP, this 16-bit value represents code and type. If this list is not defined, it is assumed that start and end are 0 by default (any port). |






<a name="opi_api-security-v2alpha1-Tunnel"></a>

### Tunnel
The parameters required to define the IP tunnel endpoints when IPsec SA
requires tunnel mode. The tunnel is defined by two endpoints: the local IP
address and the remote IP address.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| local | [opi_api.network.opinetcommon.v1alpha1.IPAddress](#opi_api-network-opinetcommon-v1alpha1-IPAddress) | optional | Local IP address tunnel endpoint |
| remote | [opi_api.network.opinetcommon.v1alpha1.IPAddress](#opi_api-network-opinetcommon-v1alpha1-IPAddress) | optional | Remote IP address tunnel endpoint |
| df_bit | [DfBitAction](#opi_api-security-v2alpha1-DfBitAction) |  | Allow configuring the DF bit when encapsulating tunnel mode IPsec traffic. RFC 4301 describes three options to handle the DF bit during tunnel encapsulation: clear, set and copy from the inner IP header. This must be ignored or has no meaning when the local/remote IP addresses are IPv6 addresses. |
| bypass_dscp | [bool](#bool) |  | If true, copy the DSCP value from the inner header to the outer header. If false, map the DSCP values from an inner header to values in an outer header following the dscp_mapping. |
| dscp_mapping | [DscpMapping](#opi_api-security-v2alpha1-DscpMapping) | repeated | A list that represents an array with the mapping from the inner DSCP value to outer DSCP value when bypass_dscp is false. To express a default mapping in the list where any other inner dscp value is not matching a node in the list, a new node has to be included at the end of the list where the inner-dscp is not defined (ANY) and the outer-dscp includes the value of the mapping. If there is no value set in the outer-dscp, the default value for this leaf is 0. |






<a name="opi_api-security-v2alpha1-UpdateIkeConnRequest"></a>

### UpdateIkeConnRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Connection name identifying the IKE connection to update |
| connection | [IkeConnection](#opi_api-security-v2alpha1-IkeConnection) |  | Updated IKE connection specification |






<a name="opi_api-security-v2alpha1-UpdateIkeConnResponse"></a>

### UpdateIkeConnResponse







<a name="opi_api-security-v2alpha1-UpdateIkePeerRequest"></a>

### UpdateIkePeerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Name identifying the IKE peer to update |
| peer | [IkePeer](#opi_api-security-v2alpha1-IkePeer) |  | Updated IKE peer specification |






<a name="opi_api-security-v2alpha1-UpdateIkePeerResponse"></a>

### UpdateIkePeerResponse







<a name="opi_api-security-v2alpha1-UpdateIpsecSaRequest"></a>

### UpdateIpsecSaRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Name of the SA to update |
| sa | [IpsecSA](#opi_api-security-v2alpha1-IpsecSA) |  |  |






<a name="opi_api-security-v2alpha1-UpdateIpsecSaResponse"></a>

### UpdateIpsecSaResponse






 


<a name="opi_api-security-v2alpha1-AuthType"></a>

### AuthType
Authentication Type

| Name | Number | Description |
| ---- | ------ | ----------- |
| AUTH_TYPE_UNSPECIFIED | 0 |  |
| AUTH_TYPE_PUBKEY | 1 |  |
| AUTH_TYPE_PSK | 2 |  |
| AUTH_TYPE_XAUTH | 3 |  |
| AUTH_TYPE_EAP | 4 |  |



<a name="opi_api-security-v2alpha1-AutoStartupMode"></a>

### AutoStartupMode
IKE connection startup behavior

| Name | Number | Description |
| ---- | ------ | ----------- |
| AUTO_STARTUP_MODE_UNSPECIFIED | 0 |  |
| AUTO_STARTUP_MODE_ADD | 1 | IKE/IPsec connection configuration is only loaded into the IKE implementation, but IKE/IPsec SA is not started. |
| AUTO_STARTUP_MODE_ON_DEMAND | 2 | IKE/IPsec connection configuration is loaded into the IKE implementation. The IPsec policies are configured but the IKE SAs are not established immediately. The IKE implementation will negotiate the IPsec SAs when they are required. |
| AUTO_STARTUP_MODE_START | 3 | IKE/IPsec connection configuration is loaded and the IKEv2-based IPsec SAs are established immediately without waiting for any packet. |



<a name="opi_api-security-v2alpha1-DHGroups"></a>

### DHGroups
Diffie Hellman Groups

| Name | Number | Description |
| ---- | ------ | ----------- |
| DH_GROUPS_UNSPECIFIED | 0 |  |
| DH_GROUPS_MODP768 | 1 |  |
| DH_GROUPS_MODP1024 | 2 |  |
| DH_GROUPS_MODP1536 | 3 |  |
| DH_GROUPS_MODP2048 | 4 |  |
| DH_GROUPS_MODP3072 | 5 |  |
| DH_GROUPS_MODP4096 | 6 |  |
| DH_GROUPS_MODP6144 | 7 |  |
| DH_GROUPS_MODP8192 | 8 |  |
| DH_GROUPS_MODP1024S160 | 9 |  |
| DH_GROUPS_MODP2048S224 | 10 |  |
| DH_GROUPS_MODP2048S256 | 11 |  |
| DH_GROUPS_CURVE25519 | 12 |  |



<a name="opi_api-security-v2alpha1-DSAlgorithm"></a>

### DSAlgorithm
Digital Signature Algorithm
Encoding follows the IANA encoding for IKEv2 Authentication Method
https://www.iana.org/assignments/ikev2-parameters/ikev2-parameters.xhtml#ikev2-parameters-12

| Name | Number | Description |
| ---- | ------ | ----------- |
| DS_ALGORITHM_UNSPECIFIED | 0 |  |
| DS_ALGORITHM_RSA | 1 |  |
| DS_ALGORITHM_ECDSA_SHA256_P256 | 9 |  |
| DS_ALGORITHM_ECDSA_SHA384_P384 | 10 |  |
| DS_ALGORITHM_ECDSA_SHA512_P512 | 11 |  |



<a name="opi_api-security-v2alpha1-DfBitAction"></a>

### DfBitAction
Don&#39;t Fragment (DF) bit handling when encapsulating tunnel mode IPsec
traffic.

| Name | Number | Description |
| ---- | ------ | ----------- |
| DF_BIT_ACTION_UNSPECIFIED | 0 |  |
| DF_BIT_ACTION_CLEAR | 1 | Disable the Don&#39;t Fragment (DF) bit in the outer header. |
| DF_BIT_ACTION_SET | 2 | Enable the DF bit in the outer header |
| DF_BIT_ACTION_COPY | 3 | Copy the DF bit to the outer header |



<a name="opi_api-security-v2alpha1-EncAlgorithm"></a>

### EncAlgorithm
Cryptographic algorithm for encryption.

| Name | Number | Description |
| ---- | ------ | ----------- |
| ENC_ALGORITHM_UNSPECIFIED | 0 |  |
| ENC_ALGORITHM_AES128CBC | 1 | AES-CBC with a 128 bit key |
| ENC_ALGORITHM_AES192CBC | 2 | AES-CBC with a 192 bit key |
| ENC_ALGORITHM_AES256CBC | 3 | AES-CBC with a 256 bit key |
| ENC_ALGORITHM_AES128GCM128 | 4 | AES-GCM with a 128 bit key and a 128 byte tag |
| ENC_ALGORITHM_AES192GCM128 | 5 | AES-GCM with a 192 bit key and a 128 byte tag |
| ENC_ALGORITHM_AES256GCM128 | 6 | AES-GCM with a 256 bit key and a 128 byte tag |
| ENC_ALGORITHM_CHACHA20POLY1305 | 7 |  |



<a name="opi_api-security-v2alpha1-EspEncap"></a>

### EspEncap
ESP Encapsulation method for NAT traversal

| Name | Number | Description |
| ---- | ------ | ----------- |
| ESP_ENCAP_UNSPECIFIED | 0 |  |
| ESP_ENCAP_ESP_IN_UDP | 1 |  |



<a name="opi_api-security-v2alpha1-IkeVersion"></a>

### IkeVersion
IKE Version

| Name | Number | Description |
| ---- | ------ | ----------- |
| IKE_VERSION_UNSPECIFIED | 0 |  |
| IKE_VERSION_IKEV2 | 2 |  |



<a name="opi_api-security-v2alpha1-IntegAlgorithm"></a>

### IntegAlgorithm
Cryptographic algorithm for authentication.

| Name | Number | Description |
| ---- | ------ | ----------- |
| INTEG_ALGORITHM_UNSPECIFIED | 0 |  |
| INTEG_ALGORITHM_SHA1_96 | 1 | SHA-1 with a 96 bit truncated hash output length |
| INTEG_ALGORITHM_SHA256_128 | 2 | SHA-256 with a 128 bit truncated hash output length |
| INTEG_ALGORITHM_SHA384_192 | 3 | SHA-384 with a 192 bit truncated hash output length |
| INTEG_ALGORITHM_SHA512_512 | 4 | SHA-512 with a 256 bit truncated hash output length |
| INTEG_ALGORITHM_AES128GMAC | 5 | AES-GMAC with a 128 bit key |
| INTEG_ALGORITHM_AES256GMAC | 6 | AES-GMAC with a 256 bit key |



<a name="opi_api-security-v2alpha1-IpsecMode"></a>

### IpsecMode
Tunnel mode

| Name | Number | Description |
| ---- | ------ | ----------- |
| IPSEC_MODE_UNSPECIFIED | 0 |  |
| IPSEC_MODE_TUNNEL_MODE | 1 |  |
| IPSEC_MODE_TRANSPORT_MODE | 2 |  |



<a name="opi_api-security-v2alpha1-IpsecProtocol"></a>

### IpsecProtocol
IPsec security protocols

| Name | Number | Description |
| ---- | ------ | ----------- |
| IPSEC_PROTOCOL_UNSPECIFIED | 0 |  |
| IPSEC_PROTOCOL_ESP | 1 |  |



<a name="opi_api-security-v2alpha1-IpsecSpdAction"></a>

### IpsecSpdAction
IPsec Security Policy Actions

| Name | Number | Description |
| ---- | ------ | ----------- |
| IPSEC_SPD_ACTION_UNSPECIFIED | 0 |  |
| IPSEC_SPD_ACTION_PROTECT | 1 | Protect the traffic with IPsec. |
| IPSEC_SPD_ACTION_BYPASS | 2 | Bypass the traffic. The packet is forwarded without IPsec protection. |
| IPSEC_SPD_ACTION_DISCARD | 3 | Discard the traffic. The IP packet is discarded. |



<a name="opi_api-security-v2alpha1-LifetimeAction"></a>

### LifetimeAction


| Name | Number | Description |
| ---- | ------ | ----------- |
| LIFETIME_ACTION_UNSPECIFIED | 0 |  |
| LIFETIME_ACTION_TERMINATE_CLEAR | 1 | Terminates the IPsec SA and allows the packets through. |
| LIFETIME_ACTION_TERMINATE_HOLD | 2 | Terminates the IPsec SA and drops the packets. |
| LIFETIME_ACTION_REPLACE | 3 | Replaces the IPsec SA with a new one. Rekey. |



<a name="opi_api-security-v2alpha1-PRF"></a>

### PRF
Pesudo Random Function  (PRF)

| Name | Number | Description |
| ---- | ------ | ----------- |
| PRF_UNSPECIFIED | 0 |  |
| PRF_SHA1 | 1 |  |
| PRF_AESXCBC | 2 |  |
| PRF_AESCMAC | 3 |  |
| PRF_SHA256 | 4 |  |
| PRF_SHA384 | 5 |  |
| PRF_SHA512 | 6 |  |


 

 


<a name="opi_api-security-v2alpha1-IpsecService"></a>

### IpsecService
The IPsec service defines operations on:
- IKE Peer Association Database (PAD)
- IKE Connections
- IPsec Security Associations (SAs)

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| CreateIkePeer | [CreateIkePeerRequest](#opi_api-security-v2alpha1-CreateIkePeerRequest) | [CreateIkePeerResponse](#opi_api-security-v2alpha1-CreateIkePeerResponse) | Create an IKE peer. This request includes the specification of the keys and certificates associated with the peer. |
| UpdateIkePeer | [UpdateIkePeerRequest](#opi_api-security-v2alpha1-UpdateIkePeerRequest) | [UpdateIkePeerResponse](#opi_api-security-v2alpha1-UpdateIkePeerResponse) | Update an existing IKE peer specification. |
| DeleteIkePeer | [DeleteIkePeerRequest](#opi_api-security-v2alpha1-DeleteIkePeerRequest) | [DeleteIkePeerResponse](#opi_api-security-v2alpha1-DeleteIkePeerResponse) | Delete an existing IKE peer specification. |
| GetIkePeer | [GetIkePeerRequest](#opi_api-security-v2alpha1-GetIkePeerRequest) | [GetIkePeerResponse](#opi_api-security-v2alpha1-GetIkePeerResponse) | Get an existing IKE peer specification. |
| ListIkePeers | [ListIkePeersRequest](#opi_api-security-v2alpha1-ListIkePeersRequest) | [ListIkePeersResponse](#opi_api-security-v2alpha1-ListIkePeersResponse) | List existing IKE peers. |
| CreateIkeConn | [CreateIkeConnRequest](#opi_api-security-v2alpha1-CreateIkeConnRequest) | [CreateIkeConnResponse](#opi_api-security-v2alpha1-CreateIkeConnResponse) | Create an IKE connection. The request includes specification of the local and remote IKE peers and the specification of the IPsec SAs (aka child SAs) from this IKE connection. |
| UpdateIkeConn | [UpdateIkeConnRequest](#opi_api-security-v2alpha1-UpdateIkeConnRequest) | [UpdateIkeConnResponse](#opi_api-security-v2alpha1-UpdateIkeConnResponse) | Update an existing IKE connection. |
| DeleteIkeConn | [DeleteIkeConnRequest](#opi_api-security-v2alpha1-DeleteIkeConnRequest) | [DeleteIkeConnResponse](#opi_api-security-v2alpha1-DeleteIkeConnResponse) | Delete an existing IKE connection. |
| GetIkeConn | [GetIkeConnRequest](#opi_api-security-v2alpha1-GetIkeConnRequest) | [GetIkeConnResponse](#opi_api-security-v2alpha1-GetIkeConnResponse) | Retrieve an IKE connection. |
| ListIkeConns | [ListIkeConnsRequest](#opi_api-security-v2alpha1-ListIkeConnsRequest) | [ListIkeConnsResponse](#opi_api-security-v2alpha1-ListIkeConnsResponse) | List existing IKE connections |
| CreateIpsecSa | [CreateIpsecSaRequest](#opi_api-security-v2alpha1-CreateIpsecSaRequest) | [CreateIpsecSaResponse](#opi_api-security-v2alpha1-CreateIpsecSaResponse) | Create an IPsec Security Association |
| UpdateIpsecSa | [UpdateIpsecSaRequest](#opi_api-security-v2alpha1-UpdateIpsecSaRequest) | [UpdateIpsecSaResponse](#opi_api-security-v2alpha1-UpdateIpsecSaResponse) | Update an existing IPsec Security Association |
| DeleteIpsecSa | [DeleteIpsecSaRequest](#opi_api-security-v2alpha1-DeleteIpsecSaRequest) | [DeleteIpsecSaResponse](#opi_api-security-v2alpha1-DeleteIpsecSaResponse) | Delete an existing IPsec Security Association |
| GetIpsecSa | [GetIpsecSaRequest](#opi_api-security-v2alpha1-GetIpsecSaRequest) | [GetIpsecSaResponse](#opi_api-security-v2alpha1-GetIpsecSaResponse) | Get an IPsec Security Association |
| ListIpsecSas | [ListIpsecSasRequest](#opi_api-security-v2alpha1-ListIpsecSasRequest) | [ListIpsecSasResponse](#opi_api-security-v2alpha1-ListIpsecSasResponse) | List existing IPsec Security Associations |

 



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

