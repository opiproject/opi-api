# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [ipsec.proto](#ipsec-proto)
    - [AntiReplayStats](#opi_api-security-v1alpha1-AntiReplayStats)
    - [AntiReplayWindow](#opi_api-security-v1alpha1-AntiReplayWindow)
    - [CaCerts](#opi_api-security-v1alpha1-CaCerts)
    - [ChildSaInfo](#opi_api-security-v1alpha1-ChildSaInfo)
    - [CreateIkeConnectionRequest](#opi_api-security-v1alpha1-CreateIkeConnectionRequest)
    - [CreateIkePeerRequest](#opi_api-security-v1alpha1-CreateIkePeerRequest)
    - [CreateIpsecPolicyRequest](#opi_api-security-v1alpha1-CreateIpsecPolicyRequest)
    - [CreateIpsecSaRequest](#opi_api-security-v1alpha1-CreateIpsecSaRequest)
    - [DSAuth](#opi_api-security-v1alpha1-DSAuth)
    - [DeleteIkeConnectionRequest](#opi_api-security-v1alpha1-DeleteIkeConnectionRequest)
    - [DeleteIkePeerRequest](#opi_api-security-v1alpha1-DeleteIkePeerRequest)
    - [DeleteIpsecPolicyRequest](#opi_api-security-v1alpha1-DeleteIpsecPolicyRequest)
    - [DeleteIpsecSaRequest](#opi_api-security-v1alpha1-DeleteIpsecSaRequest)
    - [DscpMapping](#opi_api-security-v1alpha1-DscpMapping)
    - [Encap](#opi_api-security-v1alpha1-Encap)
    - [EspAlgorithms](#opi_api-security-v1alpha1-EspAlgorithms)
    - [GetIkeConnectionRequest](#opi_api-security-v1alpha1-GetIkeConnectionRequest)
    - [GetIkePeerRequest](#opi_api-security-v1alpha1-GetIkePeerRequest)
    - [GetIpsecPolicyRequest](#opi_api-security-v1alpha1-GetIpsecPolicyRequest)
    - [GetIpsecSaRequest](#opi_api-security-v1alpha1-GetIpsecSaRequest)
    - [IkeConnection](#opi_api-security-v1alpha1-IkeConnection)
    - [IkeConnectionState](#opi_api-security-v1alpha1-IkeConnectionState)
    - [IkeFragmentation](#opi_api-security-v1alpha1-IkeFragmentation)
    - [IkePeer](#opi_api-security-v1alpha1-IkePeer)
    - [IkePeerAuthentication](#opi_api-security-v1alpha1-IkePeerAuthentication)
    - [IkeSaLifetimeHard](#opi_api-security-v1alpha1-IkeSaLifetimeHard)
    - [IkeSaLifetimeSoft](#opi_api-security-v1alpha1-IkeSaLifetimeSoft)
    - [IpsecPolicy](#opi_api-security-v1alpha1-IpsecPolicy)
    - [IpsecPolicyConfig](#opi_api-security-v1alpha1-IpsecPolicyConfig)
    - [IpsecSa](#opi_api-security-v1alpha1-IpsecSa)
    - [IpsecSaConfig](#opi_api-security-v1alpha1-IpsecSaConfig)
    - [IpsecSaLifetimeHard](#opi_api-security-v1alpha1-IpsecSaLifetimeHard)
    - [IpsecSaLifetimeSoft](#opi_api-security-v1alpha1-IpsecSaLifetimeSoft)
    - [IpsecSaState](#opi_api-security-v1alpha1-IpsecSaState)
    - [IpsecSaTemplate](#opi_api-security-v1alpha1-IpsecSaTemplate)
    - [Lifetime](#opi_api-security-v1alpha1-Lifetime)
    - [ListIkeConnectionsRequest](#opi_api-security-v1alpha1-ListIkeConnectionsRequest)
    - [ListIkeConnectionsResponse](#opi_api-security-v1alpha1-ListIkeConnectionsResponse)
    - [ListIkePeersRequest](#opi_api-security-v1alpha1-ListIkePeersRequest)
    - [ListIkePeersResponse](#opi_api-security-v1alpha1-ListIkePeersResponse)
    - [ListIpsecPoliciesRequest](#opi_api-security-v1alpha1-ListIpsecPoliciesRequest)
    - [ListIpsecPoliciesResponse](#opi_api-security-v1alpha1-ListIpsecPoliciesResponse)
    - [ListIpsecSasRequest](#opi_api-security-v1alpha1-ListIpsecSasRequest)
    - [ListIpsecSasResponse](#opi_api-security-v1alpha1-ListIpsecSasResponse)
    - [NumberIkeSAs](#opi_api-security-v1alpha1-NumberIkeSAs)
    - [PortRange](#opi_api-security-v1alpha1-PortRange)
    - [SpdProcessingInfo](#opi_api-security-v1alpha1-SpdProcessingInfo)
    - [StatsIkeConnectionsRequest](#opi_api-security-v1alpha1-StatsIkeConnectionsRequest)
    - [StatsIkeConnectionsResponse](#opi_api-security-v1alpha1-StatsIkeConnectionsResponse)
    - [TrafficSelector](#opi_api-security-v1alpha1-TrafficSelector)
    - [Tunnel](#opi_api-security-v1alpha1-Tunnel)
    - [UpdateIkeConnectionRequest](#opi_api-security-v1alpha1-UpdateIkeConnectionRequest)
    - [UpdateIkePeerRequest](#opi_api-security-v1alpha1-UpdateIkePeerRequest)
    - [UpdateIpsecPolicyRequest](#opi_api-security-v1alpha1-UpdateIpsecPolicyRequest)
    - [UpdateIpsecSaRequest](#opi_api-security-v1alpha1-UpdateIpsecSaRequest)
  
    - [AuthType](#opi_api-security-v1alpha1-AuthType)
    - [AutoStartupMode](#opi_api-security-v1alpha1-AutoStartupMode)
    - [DHGroups](#opi_api-security-v1alpha1-DHGroups)
    - [DSAlgorithm](#opi_api-security-v1alpha1-DSAlgorithm)
    - [DfBitAction](#opi_api-security-v1alpha1-DfBitAction)
    - [EncAlgorithm](#opi_api-security-v1alpha1-EncAlgorithm)
    - [EspEncap](#opi_api-security-v1alpha1-EspEncap)
    - [IkeVersion](#opi_api-security-v1alpha1-IkeVersion)
    - [IntegAlgorithm](#opi_api-security-v1alpha1-IntegAlgorithm)
    - [IpsecMode](#opi_api-security-v1alpha1-IpsecMode)
    - [IpsecProtocol](#opi_api-security-v1alpha1-IpsecProtocol)
    - [IpsecSpdAction](#opi_api-security-v1alpha1-IpsecSpdAction)
    - [LifetimeAction](#opi_api-security-v1alpha1-LifetimeAction)
    - [PRF](#opi_api-security-v1alpha1-PRF)
  
    - [IkeConnectionService](#opi_api-security-v1alpha1-IkeConnectionService)
    - [IkePeerService](#opi_api-security-v1alpha1-IkePeerService)
    - [IpsecPolicyService](#opi_api-security-v1alpha1-IpsecPolicyService)
    - [IpsecSaService](#opi_api-security-v1alpha1-IpsecSaService)
  
- [Scalar Value Types](#scalar-value-types)



<a name="ipsec-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## ipsec.proto
Copyright (C) 2021 Intel Corporation
Copyright (c) 2023 Dell Inc, or its subsidiaries.
SPDX-License-Identifier: Apache-2.0

Service functions for IKE/IPsec resources.

Operations are defined for the following resources:
- IKE Peer Association Database (PAD)
- IKE Connections
- IPsec Security Policy Database (SPD)
- IPsec Security Associations (SAs)

The configuration model is derived from RFC 9061.


<a name="opi_api-security-v1alpha1-AntiReplayStats"></a>

### AntiReplayStats
Anti-replay stats


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| replay_window | [AntiReplayWindow](#opi_api-security-v1alpha1-AntiReplayWindow) |  | ARW state |
| packet_dropped | [int64](#int64) |  | Packets dropped because they are replay packets |
| failed | [int64](#int64) |  | Number of packets detected out of the replay window |
| seq_num_counter | [uint64](#uint64) |  | Current value of the sequence number (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: The sequence number cannot be negative. --) |






<a name="opi_api-security-v1alpha1-AntiReplayWindow"></a>

### AntiReplayWindow
Anti-replay window state. Three parameters define the state of the replay
window: window size (w), highest sequence number authenticated (t), and lower
bound of the window (b), according to Appendix A2.1 in RFC 4303 (w = t - b &#43;
1)


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| w | [int32](#int32) |  | Size of the replay window. A value in the range [1, 4096]. |
| t | [uint64](#uint64) |  | Highest sequence number authenticated so far, upper bound of window (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: The sequence number cannot be negative. --) |
| b | [uint64](#uint64) |  | Lower bound of window (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: The sequence number cannot be negative. --) |






<a name="opi_api-security-v1alpha1-CaCerts"></a>

### CaCerts
Defines a Certificate Authority (CA) certificate.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| cacert | [string](#string) | repeated | List of CA certificates. |






<a name="opi_api-security-v1alpha1-ChildSaInfo"></a>

### ChildSaInfo
Specific information for IPsec SAs. It includes Perfect Forward Secrecy (PFS)
group and IPsec SA rekey lifetimes.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| fs_groups | [int32](#int32) | repeated | If non-zero, forward secrecy is required when a new IPsec SA is being created. The non-zero value indicates the DH group number to use for the key exchange process used to achieve forward secrecy. The list is ordered following from the higher priority to lower priority. The first node of the list will be the algorithm with higher priority. |
| lifetime_soft | [IpsecSaLifetimeSoft](#opi_api-security-v1alpha1-IpsecSaLifetimeSoft) |  | Soft IPsec SA lifetime. After the lifetime, the lifetime action is performed. |
| lifetime_hard | [IpsecSaLifetimeHard](#opi_api-security-v1alpha1-IpsecSaLifetimeHard) |  | Hard IPsec SA lifetime. The action will be used to terminate the IPsec SA. |






<a name="opi_api-security-v1alpha1-CreateIkeConnectionRequest"></a>

### CreateIkeConnectionRequest
Create an IKE Connection


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| ike_connection_id | [string](#string) |  | The ID to use for the IKE Connection. |
| ike_connection | [IkeConnection](#opi_api-security-v1alpha1-IkeConnection) |  | The IKE Connection to create. |






<a name="opi_api-security-v1alpha1-CreateIkePeerRequest"></a>

### CreateIkePeerRequest
Create an IKE Peer


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| ike_peer_id | [string](#string) |  | The ID to use for the IKE Peer. |
| ike_peer | [IkePeer](#opi_api-security-v1alpha1-IkePeer) |  | The IKE Peer to create. |






<a name="opi_api-security-v1alpha1-CreateIpsecPolicyRequest"></a>

### CreateIpsecPolicyRequest
Create an IPsec Policy


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| ipsec_policy_id | [string](#string) |  | The ID to use for the IPsec Policy. |
| ipsec_policy | [IpsecPolicy](#opi_api-security-v1alpha1-IpsecPolicy) |  | The IPsec Policy to create. |






<a name="opi_api-security-v1alpha1-CreateIpsecSaRequest"></a>

### CreateIpsecSaRequest
Create an IPsec SA


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| ipsec_sa_id | [string](#string) |  | The ID to use for the IPsec SA. |
| ipsec_sa | [IpsecSa](#opi_api-security-v1alpha1-IpsecSa) |  | The IPsec SA to create. |






<a name="opi_api-security-v1alpha1-DSAuth"></a>

### DSAuth
Digital Signature Authentication


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| algorithm | [DSAlgorithm](#opi_api-security-v1alpha1-DSAlgorithm) |  | The digital signature algorithm |
| raw_public_key | [string](#string) |  | Raw public key |
| cert | [string](#string) |  | Certificate |
| private_key | [string](#string) |  | Private key |
| ca_certs | [CaCerts](#opi_api-security-v1alpha1-CaCerts) |  | Certificates |






<a name="opi_api-security-v1alpha1-DeleteIkeConnectionRequest"></a>

### DeleteIkeConnectionRequest
Delete an IKE Connection


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Connection name identifying the IKE connection to delete |






<a name="opi_api-security-v1alpha1-DeleteIkePeerRequest"></a>

### DeleteIkePeerRequest
Delete an IKE Peer


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Name of the IKE peer to delete |






<a name="opi_api-security-v1alpha1-DeleteIpsecPolicyRequest"></a>

### DeleteIpsecPolicyRequest
Delete an IPsec Policy


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Name of the policy to delete |






<a name="opi_api-security-v1alpha1-DeleteIpsecSaRequest"></a>

### DeleteIpsecSaRequest
Delete an IPsec SA


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Name of the SA to delete |






<a name="opi_api-security-v1alpha1-DscpMapping"></a>

### DscpMapping
Mapping from the inner DSCP value to the outer DSCP value.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int32](#int32) |  | The list entry index with the different mappings. |
| inner_dscp | [int32](#int32) |  | The DSCP value of the inner IP packet. |
| outer_dscp | [int32](#int32) |  | The DSCP value of the outer IP packet. |






<a name="opi_api-security-v1alpha1-Encap"></a>

### Encap
Defines the type of encapsulation in case NAT traversal is required and
includes port information.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| espencap | [EspEncap](#opi_api-security-v1alpha1-EspEncap) |  | Type of encapsulation to use. |
| sport | [int32](#int32) |  | Encapsulation source port. Default = 4500 |
| dport | [int32](#int32) |  | Encapsulation destination port. Default = 4500 |






<a name="opi_api-security-v1alpha1-EspAlgorithms"></a>

### EspAlgorithms
Configuration of ESP parameters and algorithms


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| integrity | [IntegAlgorithm](#opi_api-security-v1alpha1-IntegAlgorithm) | repeated | Configuration of ESP authentication based on the specified integrity algorithm. With AEAD encryption algorithms, the integrity node is not used. |
| encryption | [EncAlgorithm](#opi_api-security-v1alpha1-EncAlgorithm) | repeated | Encryption of AEAD algorithm for the IPsec SAs. This list is ordered from higher priority to lower priority. The first node of the list will be the algorithm with the higher priority. If the list is empty then AES-256-GCM will be applied. |
| tfc_pad | [bool](#bool) |  | If Traffic Flow Confidentiality (TFC) padding for ESP encryption can be used (true) or not (false). |






<a name="opi_api-security-v1alpha1-GetIkeConnectionRequest"></a>

### GetIkeConnectionRequest
Get an IKE Connection


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Connection name identifying the IKE connection to retrieve |






<a name="opi_api-security-v1alpha1-GetIkePeerRequest"></a>

### GetIkePeerRequest
Get an IKE Peer


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Name of the IKE peer to retrieve |






<a name="opi_api-security-v1alpha1-GetIpsecPolicyRequest"></a>

### GetIpsecPolicyRequest
Get an IPsec Policy


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Name of the policy to retrieve |






<a name="opi_api-security-v1alpha1-GetIpsecSaRequest"></a>

### GetIpsecSaRequest
Get an IPsec SA


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Name of the SA to retrieve |






<a name="opi_api-security-v1alpha1-IkeConnection"></a>

### IkeConnection
An IKE Connection specification


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Unique name to identify the connection. |
| autostartup | [AutoStartupMode](#opi_api-security-v1alpha1-AutoStartupMode) |  | IKE/IPsec connection startup behavior. Default: AUTO_STARTUP_MODE_ADD |
| version | [IkeVersion](#opi_api-security-v1alpha1-IkeVersion) |  | IKE version. Only version 2 is supported. |
| fragmentation | [IkeFragmentation](#opi_api-security-v1alpha1-IkeFragmentation) |  | IKE fragmentation |
| ike_sa_lifetime_soft | [IkeSaLifetimeSoft](#opi_api-security-v1alpha1-IkeSaLifetimeSoft) |  | IKE SA soft lifetime |
| ike_sa_lifetime_hard | [IkeSaLifetimeHard](#opi_api-security-v1alpha1-IkeSaLifetimeHard) |  | IKE SA hard lifetime |
| encryption_alg | [EncAlgorithm](#opi_api-security-v1alpha1-EncAlgorithm) | repeated | Encryption algorithms |
| integrity_alg | [IntegAlgorithm](#opi_api-security-v1alpha1-IntegAlgorithm) | repeated | Integrity algorithms |
| prf | [PRF](#opi_api-security-v1alpha1-PRF) | repeated | Pseudo Random Function (PRF) algorithms |
| dhgroups | [DHGroups](#opi_api-security-v1alpha1-DHGroups) | repeated | Diffie Hellman groups |
| local | [string](#string) |  | Local peer name. |
| remote | [string](#string) |  | Remote peer name. |
| encap | [Encap](#opi_api-security-v1alpha1-Encap) |  | Configuration information about the encapsulation that should be used when NAT traversal is required. No encapsulation is used if this field is not specified. |
| local_port | [int32](#int32) |  | Local UDP port for IKE communication. Defaults to 500 if not specified. |
| remote_port | [int32](#int32) |  | Remote UDP port for IKE communication. Defaults to 500 if not specified. |
| if_id | [string](#string) |  | Interface that this connection is associated with. Used for route based VPNs. |
| policies | [string](#string) | repeated | IPsec policies that apply to the connection |
| state | [IkeConnectionState](#opi_api-security-v1alpha1-IkeConnectionState) |  | Connection state / status |






<a name="opi_api-security-v1alpha1-IkeConnectionState"></a>

### IkeConnectionState
IKE state data for an IKE connection


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| initiator | [bool](#bool) |  | True if the local endpoint is acting as the initiator for this connection. |
| initiator_ike_spi | [int32](#int32) |  | Initiator&#39;s IKE SA SPI |
| responder_ike_sa | [int32](#int32) |  | Responder&#39;s IKE SA SPI |
| nat_local | [bool](#bool) |  | True if the local endpoint is behind a NAT. |
| nat_remote | [bool](#bool) |  | True if the remote endpoint is behind a NAT. |
| encap | [Encap](#opi_api-security-v1alpha1-Encap) |  | Provides information about the encapsulation that IKE is using. |
| established | [int64](#int64) |  | Seconds since this IKE SA has been established. |
| current_rekey_interval | [google.protobuf.Duration](#google-protobuf-Duration) |  | Seconds before IKE SA is rekeyed |
| current_reauth_interval | [google.protobuf.Duration](#google-protobuf-Duration) |  | Seconds before IKE SA is re-authenticated |






<a name="opi_api-security-v1alpha1-IkeFragmentation"></a>

### IkeFragmentation
IKEv2 Fragmentation, as per RFC 7383. If IKEv2 fragmentation is enabled, it
is possible to specify the MTU.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| enabled | [bool](#bool) |  | Enable/Disable IKEv2 fragmentation. |
| mtu | [int32](#int32) |  | When fragmentation is enabled, the MTU that IKEv2 can use for IKEv2 fragmentation. |






<a name="opi_api-security-v1alpha1-IkePeer"></a>

### IkePeer
IKE Peer


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Name to uniquely identify the peer. |
| ip_address | [opi_api.network.opinetcommon.v1alpha1.IPAddress](#opi_api-network-opinetcommon-v1alpha1-IPAddress) |  | IPv4 or IPv6 address of the peer. |
| fqdn | [string](#string) |  | FQDN of the peer. |
| peer_auth | [IkePeerAuthentication](#opi_api-security-v1alpha1-IkePeerAuthentication) |  | IKE Peer Authentication |






<a name="opi_api-security-v1alpha1-IkePeerAuthentication"></a>

### IkePeerAuthentication
IKE Peer Authentication


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| auth_method | [AuthType](#opi_api-security-v1alpha1-AuthType) |  | Authentication method |
| eap_type | [int32](#int32) |  | EAP method type specified with a value extracted from the IANA registry. This information provides the particular EAP method to be used. Depending on the EAP method, pre-shared keys or certificates may be used. |
| psk | [string](#string) |  | Pre-shared secret value. This value MUST be set of the EAP method uses a pre-shared key or pre-shared authentication has been chosen. |
| digital_signature | [DSAuth](#opi_api-security-v1alpha1-DSAuth) |  | Digital signature |






<a name="opi_api-security-v1alpha1-IkeSaLifetimeHard"></a>

### IkeSaLifetimeHard
IKE SA hard lifetime. When this time is reached, the IKE SA is removed.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| max_duration | [google.protobuf.Duration](#google-protobuf-Duration) |  | Time in seconds before the IKE SA is removed. The value 0 means infinite. |






<a name="opi_api-security-v1alpha1-IkeSaLifetimeSoft"></a>

### IkeSaLifetimeSoft
IKE SA soft lifetime. Two lifetime values can be configured, either rekey
time of the IKE SA or reauth time of the IKE SA. When the rekey lifetime
expires, a rekey of the IKE SA starts. When reauth lifetime expires, an IKE
SA re-authentication starts.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| rekey_interval | [google.protobuf.Duration](#google-protobuf-Duration) |  | Time in seconds between each IKE SA rekey. The value of 0 means infinite. |
| reauth_interval | [google.protobuf.Duration](#google-protobuf-Duration) |  | Time in seconds between each IKE SA re-authentication. The value of 0 means infinite. |






<a name="opi_api-security-v1alpha1-IpsecPolicy"></a>

### IpsecPolicy
Holds configuration information for an IPsec SPD entry.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Unique name to identify the IPsec policy in the SPD. |
| reqid | [int64](#int64) |  | This value allows linking this IPsec policy with the IPsec SAs with the same reqid. A value of 0 (the default) means that the reqid is unused. |
| config | [IpsecPolicyConfig](#opi_api-security-v1alpha1-IpsecPolicyConfig) |  | IPsec Policy configuration |






<a name="opi_api-security-v1alpha1-IpsecPolicyConfig"></a>

### IpsecPolicyConfig
Holds configuration information for an IPsec SPD entry.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| arw_size | [int32](#int32) |  | Anti-Replay-Window size. If not set, the default value is 64, following the recommendation in RFC4303. |
| traffic_selector | [TrafficSelector](#opi_api-security-v1alpha1-TrafficSelector) |  | Packets are selected for processing actions based on Traffic Selector values, which refer to IP and inner protocol header information. |
| processing | [SpdProcessingInfo](#opi_api-security-v1alpha1-SpdProcessingInfo) |  | SPD processing to be performed on packets that match the traffic selector. |






<a name="opi_api-security-v1alpha1-IpsecSa"></a>

### IpsecSa
An IPsec Security Association (SA)


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Unique name in the SAD to identify this SA |
| reqid | [int64](#int64) |  | This value allows linking this IPsec SA with an IPsec policy with the same reqid |
| config | [IpsecSaConfig](#opi_api-security-v1alpha1-IpsecSaConfig) |  | IPsec SA configuration |
| state | [IpsecSaState](#opi_api-security-v1alpha1-IpsecSaState) |  | IPsec SA state |






<a name="opi_api-security-v1alpha1-IpsecSaConfig"></a>

### IpsecSaConfig
IPsec Security Association Configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| spi | [uint32](#uint32) |  | IPsec SA Security Parameter Index (SPI) (-- api-linter: core::0141::forbidden-types=disabled aip.dev/not-precedent: The SPI cannot be negative. --) |
| esn | [bool](#bool) |  | True if this IPsec SA is using extended sequence numbers. If true, the 64-bit extended sequence number counter is used. If false, the normal 32-bit sequence number counter is used. |
| arw_size | [int32](#int32) |  | Anti-Replay-Window size. If not set, the default value is 64, following the recommendation in RFC4303. |
| traffic_selector | [TrafficSelector](#opi_api-security-v1alpha1-TrafficSelector) |  | Packets are selected for processing actions based on Traffic Selector values, which refer to IP and inner protocol header information. |
| protocol | [IpsecProtocol](#opi_api-security-v1alpha1-IpsecProtocol) |  | Security protocol of the IPsec SA. Only ESP is supported. |
| mode | [IpsecMode](#opi_api-security-v1alpha1-IpsecMode) |  | IPsec SA has to be processed in transport or tunnel mode. If not specified, transport mode is used. |
| esp_algorithms | [EspAlgorithms](#opi_api-security-v1alpha1-EspAlgorithms) |  | IPsec ESP algorithm configuration |
| tunnel | [Tunnel](#opi_api-security-v1alpha1-Tunnel) |  | Tunnel configuration. Only relevant when mode = Tunnel. |
| lifetime_soft | [IpsecSaLifetimeSoft](#opi_api-security-v1alpha1-IpsecSaLifetimeSoft) |  | Soft IPsec SA lifetime. After the lifetime, the lifetime action is performed. |
| lifetime_hard | [IpsecSaLifetimeHard](#opi_api-security-v1alpha1-IpsecSaLifetimeHard) |  | Hard IPsec SA lifetime. The action will be used to terminate the IPsec SA. |
| encap | [Encap](#opi_api-security-v1alpha1-Encap) |  | Provides information about the encapsulation that the IPsec SA is using. |






<a name="opi_api-security-v1alpha1-IpsecSaLifetimeHard"></a>

### IpsecSaLifetimeHard
IPsec SA hard lifetime. Specifies a lifetime after which the IPsec SA should
be terminated.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| lifetime | [Lifetime](#opi_api-security-v1alpha1-Lifetime) |  | The lifetime of the IPsec SA. |






<a name="opi_api-security-v1alpha1-IpsecSaLifetimeSoft"></a>

### IpsecSaLifetimeSoft
IPsec SA soft lifetime. Specifies a lifetime and an action to be performed
once the lifetime expires.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| lifetime | [Lifetime](#opi_api-security-v1alpha1-Lifetime) |  | The lifetime of the IPsec SA. |
| action | [LifetimeAction](#opi_api-security-v1alpha1-LifetimeAction) |  | The action to be performed once the lifetime expires. |






<a name="opi_api-security-v1alpha1-IpsecSaState"></a>

### IpsecSaState
IPsec Security Association State


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| lifetime | [Lifetime](#opi_api-security-v1alpha1-Lifetime) |  | SA Current Lifetime |
| replay_stats | [AntiReplayStats](#opi_api-security-v1alpha1-AntiReplayStats) |  | State about the anti-replay window |






<a name="opi_api-security-v1alpha1-IpsecSaTemplate"></a>

### IpsecSaTemplate
IPsec SA configuration template


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| esn | [bool](#bool) |  | True if this IPsec SA is using extended sequence numbers. If true, the 64-bit extended sequence number counter is used. If false, the normal 32-bit sequence number counter is used. |
| mode | [IpsecMode](#opi_api-security-v1alpha1-IpsecMode) |  | IPsec SA has to be processed in transport or tunnel mode. If not specified, transport mode is used. |
| protocol | [IpsecProtocol](#opi_api-security-v1alpha1-IpsecProtocol) |  | Security protocol of the IPsec SA. Only ESP is supported. |
| esp_algorithms | [EspAlgorithms](#opi_api-security-v1alpha1-EspAlgorithms) |  | IPsec ESP algorithm configuration |
| tunnel | [Tunnel](#opi_api-security-v1alpha1-Tunnel) |  | Tunnel configuration. Only relevant when mode = Tunnel. |






<a name="opi_api-security-v1alpha1-Lifetime"></a>

### Lifetime
Lifetime of an IPsec SA. The lifetime can be expressed in terms of time,
bytes, packets, or idle time.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| duration | [google.protobuf.Duration](#google-protobuf-Duration) |  | Time in seconds since the IPsec SA was added. For example, if this value is 180 seconds, it means the IPsec SA expires in 180 seconds after it was added. A value of 0 implies infinite. |
| bytes | [int64](#int64) |  | If the IPsec SA processes the number of bytes expressed in this field, the IPsec SA expires and should be rekeyed. A value of 0 implies infinite. |
| packets | [int64](#int64) |  | If the IPsec SA processes the number of packets expressed in this field, the IPsec SA expires and should be rekeyed. A value of 0 implies infinite. |
| idle | [google.protobuf.Duration](#google-protobuf-Duration) |  | If the IPsec SA is idle during this number of seconds, the IPsec SA should be removed. A value of 0 implies infinite. |






<a name="opi_api-security-v1alpha1-ListIkeConnectionsRequest"></a>

### ListIkeConnectionsRequest
List IKE Connections


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| page_size | [int32](#int32) |  | The maximum number of IKE connections to return. The service may return fewer than this value. |
| page_token | [string](#string) |  | A page token, received from a previous `ListIkeConnections` call. Provide this to retrieve the subsequent page. |






<a name="opi_api-security-v1alpha1-ListIkeConnectionsResponse"></a>

### ListIkeConnectionsResponse
Response to a ListIkeConnectionsRequest


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| ike_connections | [IkeConnection](#opi_api-security-v1alpha1-IkeConnection) | repeated | List of IKE connections |
| next_page_token | [string](#string) |  | A token that can be sent as `page_token` to retrieve the next page. If this field is omitted, there are not subsequent pages. |






<a name="opi_api-security-v1alpha1-ListIkePeersRequest"></a>

### ListIkePeersRequest
List IKE Peers


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| page_size | [int32](#int32) |  | The maximum number of IKE peers to return. The service may return fewer than this value. |
| page_token | [string](#string) |  | A page token, received from a previous `ListIkePeers` call. Provide this to retrieve the subsequent page. |






<a name="opi_api-security-v1alpha1-ListIkePeersResponse"></a>

### ListIkePeersResponse
Response to a ListIkePeersRequest


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| ike_peers | [IkePeer](#opi_api-security-v1alpha1-IkePeer) | repeated | List of IKE peers |
| next_page_token | [string](#string) |  | A token that can be sent as `page_token` to retrieve the next page. If this field is omitted, there are not subsequent pages. |






<a name="opi_api-security-v1alpha1-ListIpsecPoliciesRequest"></a>

### ListIpsecPoliciesRequest
List IPsec Policies


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| page_size | [int32](#int32) |  | The maximum number of IPsec policies to return. The service may return fewer than this value. |
| page_token | [string](#string) |  | A page token, received from a previous `ListIpsecPolicies` call. Provide this to retrieve the subsequent page. |






<a name="opi_api-security-v1alpha1-ListIpsecPoliciesResponse"></a>

### ListIpsecPoliciesResponse
Response to a ListIpsecPoliciesRequest


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| ipsec_policies | [IpsecPolicy](#opi_api-security-v1alpha1-IpsecPolicy) | repeated | List of IPsec policies |
| next_page_token | [string](#string) |  | A token that can be sent as `page_token` to retrieve the next page. If this field is omitted, there are not subsequent pages. |






<a name="opi_api-security-v1alpha1-ListIpsecSasRequest"></a>

### ListIpsecSasRequest
List IPsec SAs


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| page_size | [int32](#int32) |  | The maximum number of IPsec SAs to return. The service may return fewer than this value. |
| page_token | [string](#string) |  | A page token, received from a previous `ListIpsecSas` call. Provide this to retrieve the subsequent page. |






<a name="opi_api-security-v1alpha1-ListIpsecSasResponse"></a>

### ListIpsecSasResponse
Response to a ListIpsecSasRequest


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| ipsec_sas | [IpsecSa](#opi_api-security-v1alpha1-IpsecSa) | repeated | List of IPsec SAs |
| next_page_token | [string](#string) |  | A token that can be sent as `page_token` to retrieve the next page. If this field is omitted, there are not subsequent pages. |






<a name="opi_api-security-v1alpha1-NumberIkeSAs"></a>

### NumberIkeSAs
General information about the IKE SAs. In particular, it provides the number
of IKE SAs.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| total | [int64](#int64) |  | Total number of active IKE SAs. |
| half_open | [int64](#int64) |  | Number of half-open active IKE SAs. |






<a name="opi_api-security-v1alpha1-PortRange"></a>

### PortRange
A port range, such as that expressed in RFC 4301, for example 1500 (Start
Port Number) - 1600 (End Port Number). A port range is used in the Traffic
Selector. To express a single prot, set the same value as start and end.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| start | [int32](#int32) |  | Start port number. |
| end | [int32](#int32) |  | End port number. The end port number must be equal to or greater than the start port number. |






<a name="opi_api-security-v1alpha1-SpdProcessingInfo"></a>

### SpdProcessingInfo
SPD processing. If the required processing action is protect, it contains the
required information to process the packet.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| action | [IpsecSpdAction](#opi_api-security-v1alpha1-IpsecSpdAction) |  | Action to be performed on the packet. |
| sa_config | [IpsecSaTemplate](#opi_api-security-v1alpha1-IpsecSaTemplate) |  | IPsec SA configuration included in the SPD entry. |






<a name="opi_api-security-v1alpha1-StatsIkeConnectionsRequest"></a>

### StatsIkeConnectionsRequest
Request to get IKE Connection statistics






<a name="opi_api-security-v1alpha1-StatsIkeConnectionsResponse"></a>

### StatsIkeConnectionsResponse
Response to a StatsIkeConnectionsRequest


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| number_ike_sas | [NumberIkeSAs](#opi_api-security-v1alpha1-NumberIkeSAs) |  | Number of IKE SAs |






<a name="opi_api-security-v1alpha1-TrafficSelector"></a>

### TrafficSelector
A Traffic Selector used in IPsec policies and IPsec SAs.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| local_prefix | [opi_api.network.opinetcommon.v1alpha1.IPPrefix](#opi_api-network-opinetcommon-v1alpha1-IPPrefix) |  | Local IP address prefix. |
| remote_prefix | [opi_api.network.opinetcommon.v1alpha1.IPPrefix](#opi_api-network-opinetcommon-v1alpha1-IPPrefix) |  | Remote IP address prefix. |
| inner_protocol | [int32](#int32) |  | Inner protocol that is going to be protected with IPsec. If no protocol is specified, all inner protocols will be protected. Protocols are encoded using the IP protocol number. |
| local_ports | [PortRange](#opi_api-security-v1alpha1-PortRange) | repeated | List of local ports. When the inner protocol is ICMP, this 16-bit value represents code and type. If this list is not defined, it is assumed that start and end are 0 by default (any port). |
| remote_ports | [PortRange](#opi_api-security-v1alpha1-PortRange) | repeated | List of remote ports. When the inner protocol is ICMP, this 16-bit value represents code and type. If this list is not defined, it is assumed that start and end are 0 by default (any port). |






<a name="opi_api-security-v1alpha1-Tunnel"></a>

### Tunnel
The parameters required to define the IP tunnel endpoints when IPsec SA
requires tunnel mode. The tunnel is defined by two endpoints: the local IP
address and the remote IP address.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| local | [opi_api.network.opinetcommon.v1alpha1.IPAddress](#opi_api-network-opinetcommon-v1alpha1-IPAddress) |  | Local IP address tunnel endpoint |
| remote | [opi_api.network.opinetcommon.v1alpha1.IPAddress](#opi_api-network-opinetcommon-v1alpha1-IPAddress) |  | Remote IP address tunnel endpoint |
| df_bit | [DfBitAction](#opi_api-security-v1alpha1-DfBitAction) |  | Allow configuring the DF bit when encapsulating tunnel mode IPsec traffic. RFC 4301 describes three options to handle the DF bit during tunnel encapsulation: clear, set and copy from the inner IP header. This must be ignored or has no meaning when the local/remote IP addresses are IPv6 addresses. |
| bypass_dscp | [bool](#bool) |  | If true, copy the DSCP value from the inner header to the outer header. If false, map the DSCP values from an inner header to values in an outer header following the dscp_mapping. |
| dscp_mapping | [DscpMapping](#opi_api-security-v1alpha1-DscpMapping) | repeated | A list that represents an array with the mapping from the inner DSCP value to outer DSCP value when bypass_dscp is false. To express a default mapping in the list where any other inner dscp value is not matching a node in the list, a new node has to be included at the end of the list where the inner-dscp is not defined (ANY) and the outer-dscp includes the value of the mapping. If there is no value set in the outer-dscp, the default value for this leaf is 0. |






<a name="opi_api-security-v1alpha1-UpdateIkeConnectionRequest"></a>

### UpdateIkeConnectionRequest
Update an IKE Connection


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| ike_connection | [IkeConnection](#opi_api-security-v1alpha1-IkeConnection) |  | The connections `name` field identifies the IKE connection to update. |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | The list of fields to update |






<a name="opi_api-security-v1alpha1-UpdateIkePeerRequest"></a>

### UpdateIkePeerRequest
Update an IKE Peer


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| ike_peer | [IkePeer](#opi_api-security-v1alpha1-IkePeer) |  | the peer&#39;s `name` field is used to identify the IKE peer to update. |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | The list of fields to update |






<a name="opi_api-security-v1alpha1-UpdateIpsecPolicyRequest"></a>

### UpdateIpsecPolicyRequest
Update an IPsec Policy


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| ipsec_policy | [IpsecPolicy](#opi_api-security-v1alpha1-IpsecPolicy) |  | The policy&#39;s name field identifies the IPsec policy to update. |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | The list of fields to update |






<a name="opi_api-security-v1alpha1-UpdateIpsecSaRequest"></a>

### UpdateIpsecSaRequest
Update an IPsec SA


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| ipsec_sa | [IpsecSa](#opi_api-security-v1alpha1-IpsecSa) |  | The SA&#39;s name field identifies the IPsec SA to update. |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | The list of fields to update |





 


<a name="opi_api-security-v1alpha1-AuthType"></a>

### AuthType
Authentication Type

| Name | Number | Description |
| ---- | ------ | ----------- |
| AUTH_TYPE_UNSPECIFIED | 0 | Authentication type is not specified |
| AUTH_TYPE_PUBKEY | 1 | Public Key Authentication |
| AUTH_TYPE_PSK | 2 | Pre-shared Key Authentication |
| AUTH_TYPE_XAUTH | 3 | XAUTH Authentication |
| AUTH_TYPE_EAP | 4 | EAP Authentication |



<a name="opi_api-security-v1alpha1-AutoStartupMode"></a>

### AutoStartupMode
IKE connection startup behavior

| Name | Number | Description |
| ---- | ------ | ----------- |
| AUTO_STARTUP_MODE_UNSPECIFIED | 0 | IKE connection startup behavior is not specified |
| AUTO_STARTUP_MODE_ADD | 1 | IKE/IPsec connection configuration is only loaded into the IKE implementation, but IKE/IPsec SA is not started. |
| AUTO_STARTUP_MODE_ON_DEMAND | 2 | IKE/IPsec connection configuration is loaded into the IKE implementation. The IPsec policies are configured but the IKE SAs are not established immediately. The IKE implementation will negotiate the IPsec SAs when they are required. |
| AUTO_STARTUP_MODE_START | 3 | IKE/IPsec connection configuration is loaded and the IKEv2-based IPsec SAs are established immediately without waiting for any packet. |



<a name="opi_api-security-v1alpha1-DHGroups"></a>

### DHGroups
Diffie Hellman Groups

| Name | Number | Description |
| ---- | ------ | ----------- |
| DH_GROUPS_UNSPECIFIED | 0 | DH Group is not specified |
| DH_GROUPS_MODP768 | 1 | MODP768 DH Group |
| DH_GROUPS_MODP1024 | 2 | MODP1024 DH Group |
| DH_GROUPS_MODP1536 | 3 | MODP1536 DH Group |
| DH_GROUPS_MODP2048 | 4 | MODP2048 DH Group |
| DH_GROUPS_MODP3072 | 5 | MODP3072 DH Group |
| DH_GROUPS_MODP4096 | 6 | MODP4096 DH Group |
| DH_GROUPS_MODP6144 | 7 | MODP6144 DH Group |
| DH_GROUPS_MODP8192 | 8 | MODP8192 DH Group |
| DH_GROUPS_MODP1024S160 | 9 | MODP1024S160 DH Group |
| DH_GROUPS_MODP2048S224 | 10 | MODP2048S224 DH Group |
| DH_GROUPS_MODP2048S256 | 11 | MODP2048S256 DH Group |
| DH_GROUPS_CURVE25519 | 12 | Curve25519 DH Group |



<a name="opi_api-security-v1alpha1-DSAlgorithm"></a>

### DSAlgorithm
Digital Signature Algorithm
Encoding follows the IANA encoding for IKEv2 Authentication Method
https://www.iana.org/assignments/ikev2-parameters/ikev2-parameters.xhtml#ikev2-parameters-12

| Name | Number | Description |
| ---- | ------ | ----------- |
| DS_ALGORITHM_UNSPECIFIED | 0 | Digital Signature algorithm is not specified |
| DS_ALGORITHM_RSA | 1 | RSA digital signature algorithm |
| DS_ALGORITHM_ECDSA_SHA256_P256 | 9 | ECDSA digital signature algorithm with SHA-256 and a P-256 curve |
| DS_ALGORITHM_ECDSA_SHA384_P384 | 10 | ECDSA digital signature algorithm with SHA-384 and a P-384 curve |
| DS_ALGORITHM_ECDSA_SHA512_P512 | 11 | ECDSA digital signature algorithm with SHA-512 and a P-512 curve |



<a name="opi_api-security-v1alpha1-DfBitAction"></a>

### DfBitAction
Don&#39;t Fragment (DF) bit handling when encapsulating tunnel mode IPsec
traffic.

| Name | Number | Description |
| ---- | ------ | ----------- |
| DF_BIT_ACTION_UNSPECIFIED | 0 | DF action is not specified. |
| DF_BIT_ACTION_CLEAR | 1 | Disable the Don&#39;t Fragment (DF) bit in the outer header. |
| DF_BIT_ACTION_SET | 2 | Enable the DF bit in the outer header |
| DF_BIT_ACTION_COPY | 3 | Copy the DF bit to the outer header |



<a name="opi_api-security-v1alpha1-EncAlgorithm"></a>

### EncAlgorithm
Cryptographic algorithm for encryption.

| Name | Number | Description |
| ---- | ------ | ----------- |
| ENC_ALGORITHM_UNSPECIFIED | 0 | Encryption algorithm is not specified |
| ENC_ALGORITHM_AES128CBC | 1 | AES-CBC with a 128 bit key |
| ENC_ALGORITHM_AES192CBC | 2 | AES-CBC with a 192 bit key |
| ENC_ALGORITHM_AES256CBC | 3 | AES-CBC with a 256 bit key |
| ENC_ALGORITHM_AES128GCM128 | 4 | AES-GCM with a 128 bit key and a 128 byte tag |
| ENC_ALGORITHM_AES192GCM128 | 5 | AES-GCM with a 192 bit key and a 128 byte tag |
| ENC_ALGORITHM_AES256GCM128 | 6 | AES-GCM with a 256 bit key and a 128 byte tag |
| ENC_ALGORITHM_CHACHA20POLY1305 | 7 | ChaCha20-Poly1305 AEAD algorithm |



<a name="opi_api-security-v1alpha1-EspEncap"></a>

### EspEncap
ESP Encapsulation method for NAT traversal

| Name | Number | Description |
| ---- | ------ | ----------- |
| ESP_ENCAP_UNSPECIFIED | 0 | Unspecified ESP encapsulation method |
| ESP_ENCAP_ESP_IN_UDP | 1 | ESP encapsulation in UDP |



<a name="opi_api-security-v1alpha1-IkeVersion"></a>

### IkeVersion
IKE Version

| Name | Number | Description |
| ---- | ------ | ----------- |
| IKE_VERSION_UNSPECIFIED | 0 | IKE version is not specified |
| IKE_VERSION_IKEV2 | 2 | IKE version 2 |



<a name="opi_api-security-v1alpha1-IntegAlgorithm"></a>

### IntegAlgorithm
Cryptographic algorithm for authentication.

| Name | Number | Description |
| ---- | ------ | ----------- |
| INTEG_ALGORITHM_UNSPECIFIED | 0 | Integrity algorithm is not specified |
| INTEG_ALGORITHM_SHA1_96 | 1 | SHA-1 with a 96 bit truncated hash output length |
| INTEG_ALGORITHM_SHA256_128 | 2 | SHA-256 with a 128 bit truncated hash output length |
| INTEG_ALGORITHM_SHA384_192 | 3 | SHA-384 with a 192 bit truncated hash output length |
| INTEG_ALGORITHM_SHA512_512 | 4 | SHA-512 with a 256 bit truncated hash output length |
| INTEG_ALGORITHM_AES128GMAC | 5 | AES-GMAC with a 128 bit key |
| INTEG_ALGORITHM_AES256GMAC | 6 | AES-GMAC with a 256 bit key |



<a name="opi_api-security-v1alpha1-IpsecMode"></a>

### IpsecMode
IPsec Mode. Tunnel or Transport mode.

| Name | Number | Description |
| ---- | ------ | ----------- |
| IPSEC_MODE_UNSPECIFIED | 0 | IPsec mode is not specified |
| IPSEC_MODE_TUNNEL_MODE | 1 | Tunnel mode IPsec |
| IPSEC_MODE_TRANSPORT_MODE | 2 | Transport mode IPsec |



<a name="opi_api-security-v1alpha1-IpsecProtocol"></a>

### IpsecProtocol
IPsec security protocols

| Name | Number | Description |
| ---- | ------ | ----------- |
| IPSEC_PROTOCOL_UNSPECIFIED | 0 | IPsec protocol is not specified |
| IPSEC_PROTOCOL_ESP | 1 | IPsec ESP |



<a name="opi_api-security-v1alpha1-IpsecSpdAction"></a>

### IpsecSpdAction
IPsec Security Policy Actions

| Name | Number | Description |
| ---- | ------ | ----------- |
| IPSEC_SPD_ACTION_UNSPECIFIED | 0 | IPsec SPD action is not specified |
| IPSEC_SPD_ACTION_PROTECT | 1 | Protect the traffic with IPsec. |
| IPSEC_SPD_ACTION_BYPASS | 2 | Bypass the traffic. The packet is forwarded without IPsec protection. |
| IPSEC_SPD_ACTION_DISCARD | 3 | Discard the traffic. The IP packet is discarded. |



<a name="opi_api-security-v1alpha1-LifetimeAction"></a>

### LifetimeAction
Lifetime action for IPsec SAs

| Name | Number | Description |
| ---- | ------ | ----------- |
| LIFETIME_ACTION_UNSPECIFIED | 0 | Lifetime action is not specified |
| LIFETIME_ACTION_TERMINATE_CLEAR | 1 | Terminates the IPsec SA and allows the packets through. |
| LIFETIME_ACTION_TERMINATE_HOLD | 2 | Terminates the IPsec SA and drops the packets. |
| LIFETIME_ACTION_REPLACE | 3 | Replaces the IPsec SA with a new one. Rekey. |



<a name="opi_api-security-v1alpha1-PRF"></a>

### PRF
Pesudo Random Function (PRF) Algorithm

| Name | Number | Description |
| ---- | ------ | ----------- |
| PRF_UNSPECIFIED | 0 | PRF algorithm is not specified |
| PRF_SHA1 | 1 | SHA-1 PRF |
| PRF_AESXCBC | 2 | AES-XCBC PRF |
| PRF_AESCMAC | 3 | AES-CMAC PRF |
| PRF_SHA256 | 4 | SHA-256 PRF |
| PRF_SHA384 | 5 | SHA-384 PRF |
| PRF_SHA512 | 6 | SHA-512 PRF |


 

 


<a name="opi_api-security-v1alpha1-IkeConnectionService"></a>

### IkeConnectionService
Management of IKE connections. An IKE connection is a logical connection
between two peers that is used to establish IPsec SAs. An IKE connection
includes the configuration of the local and remote peers, the IPsec SAs
that are part of the connection, and the configuration of the IKE connection
itself.

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| CreateIkeConnection | [CreateIkeConnectionRequest](#opi_api-security-v1alpha1-CreateIkeConnectionRequest) | [IkeConnection](#opi_api-security-v1alpha1-IkeConnection) | Create an IKE connection. The request includes specification of the local and remote IKE peers and the specification of the IPsec SAs (aka child SAs) from this IKE connection. |
| UpdateIkeConnection | [UpdateIkeConnectionRequest](#opi_api-security-v1alpha1-UpdateIkeConnectionRequest) | [IkeConnection](#opi_api-security-v1alpha1-IkeConnection) | Update an existing IKE connection. |
| DeleteIkeConnection | [DeleteIkeConnectionRequest](#opi_api-security-v1alpha1-DeleteIkeConnectionRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) | Delete an existing IKE connection. |
| GetIkeConnection | [GetIkeConnectionRequest](#opi_api-security-v1alpha1-GetIkeConnectionRequest) | [IkeConnection](#opi_api-security-v1alpha1-IkeConnection) | Retrieve an IKE connection. |
| ListIkeConnections | [ListIkeConnectionsRequest](#opi_api-security-v1alpha1-ListIkeConnectionsRequest) | [ListIkeConnectionsResponse](#opi_api-security-v1alpha1-ListIkeConnectionsResponse) | List existing IKE connections. |
| StatsIkeConnections | [StatsIkeConnectionsRequest](#opi_api-security-v1alpha1-StatsIkeConnectionsRequest) | [StatsIkeConnectionsResponse](#opi_api-security-v1alpha1-StatsIkeConnectionsResponse) | Get IKE connection statistics. |


<a name="opi_api-security-v1alpha1-IkePeerService"></a>

### IkePeerService
Management of the IKE Peer Association Database (PAD). The PAD contains
information about the peers that are allowed to establish an IKE connection.

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| CreateIkePeer | [CreateIkePeerRequest](#opi_api-security-v1alpha1-CreateIkePeerRequest) | [IkePeer](#opi_api-security-v1alpha1-IkePeer) | Create an IKE peer. This request includes the specification of the keys and certificates associated with the peer. |
| UpdateIkePeer | [UpdateIkePeerRequest](#opi_api-security-v1alpha1-UpdateIkePeerRequest) | [IkePeer](#opi_api-security-v1alpha1-IkePeer) | Update an existing IKE peer specification. |
| DeleteIkePeer | [DeleteIkePeerRequest](#opi_api-security-v1alpha1-DeleteIkePeerRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) | Delete an existing IKE peer specification. |
| GetIkePeer | [GetIkePeerRequest](#opi_api-security-v1alpha1-GetIkePeerRequest) | [IkePeer](#opi_api-security-v1alpha1-IkePeer) | Get an existing IKE peer specification. |
| ListIkePeers | [ListIkePeersRequest](#opi_api-security-v1alpha1-ListIkePeersRequest) | [ListIkePeersResponse](#opi_api-security-v1alpha1-ListIkePeersResponse) | List existing IKE peers. |


<a name="opi_api-security-v1alpha1-IpsecPolicyService"></a>

### IpsecPolicyService
Management of the IPsec Security Policy Database (SPD). The SPD contains
information about the IPsec policies that are used to protect the traffic
between two peers.

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| CreateIpsecPolicy | [CreateIpsecPolicyRequest](#opi_api-security-v1alpha1-CreateIpsecPolicyRequest) | [IpsecPolicy](#opi_api-security-v1alpha1-IpsecPolicy) | Create an IPsec Policy |
| UpdateIpsecPolicy | [UpdateIpsecPolicyRequest](#opi_api-security-v1alpha1-UpdateIpsecPolicyRequest) | [IpsecPolicy](#opi_api-security-v1alpha1-IpsecPolicy) | Update an existing IPsec Policy |
| DeleteIpsecPolicy | [DeleteIpsecPolicyRequest](#opi_api-security-v1alpha1-DeleteIpsecPolicyRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) | Delete an existing IPsec Policy |
| GetIpsecPolicy | [GetIpsecPolicyRequest](#opi_api-security-v1alpha1-GetIpsecPolicyRequest) | [IpsecPolicy](#opi_api-security-v1alpha1-IpsecPolicy) | Get an IPsec Policy |
| ListIpsecPolicies | [ListIpsecPoliciesRequest](#opi_api-security-v1alpha1-ListIpsecPoliciesRequest) | [ListIpsecPoliciesResponse](#opi_api-security-v1alpha1-ListIpsecPoliciesResponse) | List existing IPsec Policies |


<a name="opi_api-security-v1alpha1-IpsecSaService"></a>

### IpsecSaService
Management of the IPsec Security Association Database (SAD). The SAD
contains information about the IPsec SAs that are used to protect the
traffic between two peers

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| CreateIpsecSa | [CreateIpsecSaRequest](#opi_api-security-v1alpha1-CreateIpsecSaRequest) | [IpsecSa](#opi_api-security-v1alpha1-IpsecSa) | Create an IPsec Security Association |
| UpdateIpsecSa | [UpdateIpsecSaRequest](#opi_api-security-v1alpha1-UpdateIpsecSaRequest) | [IpsecSa](#opi_api-security-v1alpha1-IpsecSa) | Update an existing IPsec Security Association |
| DeleteIpsecSa | [DeleteIpsecSaRequest](#opi_api-security-v1alpha1-DeleteIpsecSaRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) | Delete an existing IPsec Security Association |
| GetIpsecSa | [GetIpsecSaRequest](#opi_api-security-v1alpha1-GetIpsecSaRequest) | [IpsecSa](#opi_api-security-v1alpha1-IpsecSa) | Get an IPsec Security Association |
| ListIpsecSas | [ListIpsecSasRequest](#opi_api-security-v1alpha1-ListIpsecSasRequest) | [ListIpsecSasResponse](#opi_api-security-v1alpha1-ListIpsecSasResponse) | List existing IPsec Security Associations |

 



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

