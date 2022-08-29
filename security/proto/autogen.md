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
    - [ListCert](#opi-security-v1-ListCert)
    - [ListChild](#opi-security-v1-ListChild)
    - [ListChildSa](#opi-security-v1-ListChildSa)
    - [ListConnAuth](#opi-security-v1-ListConnAuth)
    - [ListConnResp](#opi-security-v1-ListConnResp)
    - [ListIkeSa](#opi-security-v1-ListIkeSa)
    - [LocalAuth](#opi-security-v1-LocalAuth)
    - [Pools](#opi-security-v1-Pools)
    - [Proposals](#opi-security-v1-Proposals)
    - [PubKeys](#opi-security-v1-PubKeys)
    - [RemoteAuth](#opi-security-v1-RemoteAuth)
    - [TrafficSelectors](#opi-security-v1-TrafficSelectors)
    - [TrafficSelectors.TrafficSelector](#opi-security-v1-TrafficSelectors-TrafficSelector)
    - [Uuid](#opi-security-v1-Uuid)
    - [Vips](#opi-security-v1-Vips)
  
    - [AuthType](#opi-security-v1-AuthType)
    - [CertificateType](#opi-security-v1-CertificateType)
    - [ChildSaState](#opi-security-v1-ChildSaState)
    - [CryptoAlgorithm](#opi-security-v1-CryptoAlgorithm)
    - [DiffieHellmanGroups](#opi-security-v1-DiffieHellmanGroups)
    - [IPsecMode](#opi-security-v1-IPsecMode)
    - [IkeSaState](#opi-security-v1-IkeSaState)
    - [IntegAlgorithm](#opi-security-v1-IntegAlgorithm)
    - [PseudoRandomFunction](#opi-security-v1-PseudoRandomFunction)
    - [X509CertificateFlag](#opi-security-v1-X509CertificateFlag)
  
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
| certs | [ListCert](#opi-security-v1-ListCert) | repeated |  |






<a name="opi-security-v1-IPsecListConnsReq"></a>

### IPsecListConnsReq



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| ike | [string](#string) |  |  |






<a name="opi-security-v1-IPsecListConnsResp"></a>

### IPsecListConnsResp



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| connection | [ListConnResp](#opi-security-v1-ListConnResp) | repeated |  |






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
| ikesas | [ListIkeSa](#opi-security-v1-ListIkeSa) | repeated |  |






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






<a name="opi-security-v1-ListCert"></a>

### ListCert
list-cert


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| type | [CertificateType](#opi-security-v1-CertificateType) |  |  |
| flag | [X509CertificateFlag](#opi-security-v1-X509CertificateFlag) |  |  |
| hasprivkey | [string](#string) |  |  |
| data | [string](#string) |  |  |
| subject | [string](#string) |  |  |
| notbefore | [string](#string) |  |  |
| notafter | [string](#string) |  |  |






<a name="opi-security-v1-ListChild"></a>

### ListChild



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Child SA name |
| mode | [string](#string) |  |  |
| label | [string](#string) |  |  |
| rekey_time | [uint32](#uint32) |  |  |
| rekey_bytes | [uint32](#uint32) |  |  |
| rekey_packets | [uint32](#uint32) |  |  |
| dpd_action | [string](#string) |  |  |
| close_action | [string](#string) |  |  |
| local_ts | [TrafficSelectors](#opi-security-v1-TrafficSelectors) |  |  |
| remote_ts | [TrafficSelectors](#opi-security-v1-TrafficSelectors) |  |  |
| interface | [string](#string) |  |  |
| priority | [string](#string) |  |  |






<a name="opi-security-v1-ListChildSa"></a>

### ListChildSa



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| protocol | [string](#string) |  |  |
| encap | [string](#string) |  |  |
| spi_in | [string](#string) |  |  |
| spi_out | [string](#string) |  |  |
| cpi_in | [string](#string) |  |  |
| cpi_out | [string](#string) |  |  |
| mark_in | [string](#string) |  |  |
| mark_mask_in | [string](#string) |  |  |
| mark_out | [string](#string) |  |  |
| mark_mask_out | [string](#string) |  |  |
| if_id_in | [string](#string) |  |  |
| if_id_out | [string](#string) |  |  |
| encr_alg | [string](#string) |  |  |
| encr_keysize | [string](#string) |  |  |
| integ_alg | [string](#string) |  |  |
| integ_keysize | [string](#string) |  |  |
| dh_group | [string](#string) |  |  |
| esn | [string](#string) |  |  |






<a name="opi-security-v1-ListConnAuth"></a>

### ListConnAuth



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| class | [string](#string) |  |  |
| eaptype | [string](#string) |  |  |
| eapvendor | [string](#string) |  |  |
| xauth | [string](#string) |  |  |
| revocation | [string](#string) |  |  |
| id | [string](#string) |  |  |
| aaa_id | [string](#string) |  |  |
| eap_id | [string](#string) |  |  |
| xauth_id | [string](#string) |  |  |
| group | [Groups](#opi-security-v1-Groups) |  |  |
| certs | [Certs](#opi-security-v1-Certs) |  |  |
| cacerts | [CaCerts](#opi-security-v1-CaCerts) |  |  |






<a name="opi-security-v1-ListConnResp"></a>

### ListConnResp



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Connection name |
| local_addrs | [Addrs](#opi-security-v1-Addrs) | repeated |  |
| remote_addrs | [Addrs](#opi-security-v1-Addrs) | repeated |  |
| version | [string](#string) |  |  |
| reauth_time | [uint32](#uint32) |  |  |
| rekey_time | [uint32](#uint32) |  |  |
| unique | [string](#string) |  |  |
| dpd_delay | [uint32](#uint32) |  |  |
| dpd_timeout | [uint32](#uint32) |  |  |
| ppk | [string](#string) |  |  |
| ppk_required | [string](#string) |  |  |
| local_auth | [ListConnAuth](#opi-security-v1-ListConnAuth) |  |  |
| remote_auth | [ListConnAuth](#opi-security-v1-ListConnAuth) |  |  |
| children | [ListChild](#opi-security-v1-ListChild) | repeated |  |






<a name="opi-security-v1-ListIkeSa"></a>

### ListIkeSa



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | IKE_SA name |
| uniqueid | [string](#string) |  |  |
| version | [string](#string) |  |  |
| ikestate | [IkeSaState](#opi-security-v1-IkeSaState) |  |  |
| local_host | [string](#string) |  |  |
| local_port | [string](#string) |  |  |
| local_id | [string](#string) |  |  |
| remote_host | [string](#string) |  |  |
| remote_port | [string](#string) |  |  |
| remote_id | [string](#string) |  |  |
| remote_xauth_id | [string](#string) |  |  |
| remote_eap_id | [string](#string) |  |  |
| initiator | [string](#string) |  |  |
| initiator_spi | [string](#string) |  |  |
| responder_spi | [string](#string) |  |  |
| nat_local | [string](#string) |  |  |
| nat_remote | [string](#string) |  |  |
| nat_fake | [string](#string) |  |  |
| nat_any | [string](#string) |  |  |
| if_id_in | [string](#string) |  |  |
| if_id_out | [string](#string) |  |  |
| encr_alg | [string](#string) |  |  |
| encr_keysize | [string](#string) |  |  |
| integ_alg | [string](#string) |  |  |
| integ_keysize | [string](#string) |  |  |
| prf_alg | [string](#string) |  |  |
| dh_group | [string](#string) |  |  |
| ppk | [string](#string) |  |  |
| established | [string](#string) |  |  |
| rekey_time | [string](#string) |  |  |
| reauth_time | [string](#string) |  |  |
| local_vips | [string](#string) | repeated |  |
| remote_vips | [string](#string) | repeated |  |
| tasks_queued | [string](#string) | repeated |  |
| tasks_active | [string](#string) | repeated |  |
| tasks_passive | [string](#string) | repeated |  |
| childsas | [ListChildSa](#opi-security-v1-ListChildSa) | repeated |  |






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



<a name="opi-security-v1-CertificateType"></a>

### CertificateType
Certificate type

| Name | Number | Description |
| ---- | ------ | ----------- |
| CERT_X509 | 0 |  |
| CERT_X509_AC | 1 |  |
| CERT_X509_CRL | 2 |  |
| CERT_OCSP_RESPONSE | 3 |  |
| CERT_PUBKEY | 4 |  |



<a name="opi-security-v1-ChildSaState"></a>

### ChildSaState
CHILD_SA state

| Name | Number | Description |
| ---- | ------ | ----------- |
| CHILD_CREATED | 0 |  |
| CHILD_ROUTED | 1 |  |
| CHILD_INSTALLING | 2 |  |
| CHILD_INSTALLED | 3 |  |
| CHILD_UPDATING | 4 |  |
| CHILD_REKEYING | 5 |  |
| CHILD_REKEYED | 6 |  |
| CHILD_RETRYING | 7 |  |
| CHILD_DELETING | 8 |  |
| CHILD_DELETED | 9 |  |
| CHILD_DESTROYING | 10 |  |



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



<a name="opi-security-v1-IkeSaState"></a>

### IkeSaState
IKE_SA state

| Name | Number | Description |
| ---- | ------ | ----------- |
| CREATED | 0 |  |
| CONNECTING | 1 |  |
| ESTABLISHED | 2 |  |
| PASSIVE | 3 |  |
| REKEYING | 4 |  |
| REKEYED | 5 |  |
| DELETING | 6 |  |
| DESTROYING | 7 |  |



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



<a name="opi-security-v1-X509CertificateFlag"></a>

### X509CertificateFlag
X.509 certificate flag

| Name | Number | Description |
| ---- | ------ | ----------- |
| X509_CERT_FLAG_NONE | 0 |  |
| X509_CERT_FLAG_CA | 1 |  |
| X509_CERT_FLAG_AA | 2 |  |
| X509_CERT_FLAG_OCSP | 3 |  |


 

 


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
| IPsecUnloadConn | [IPsecUnloadConnReq](#opi-security-v1-IPsecUnloadConnReq) | [IPsecUnloadConnResp](#opi-security-v1-IPsecUnloadConnResp) |  |

 



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

