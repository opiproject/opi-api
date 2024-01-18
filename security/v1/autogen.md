# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [ipsec.proto](#ipsec-proto)
    - [Addrs](#opi_api-security-v1-Addrs)
    - [CaCerts](#opi_api-security-v1-CaCerts)
    - [CertPolicy](#opi_api-security-v1-CertPolicy)
    - [Certs](#opi_api-security-v1-Certs)
    - [Child](#opi_api-security-v1-Child)
    - [Connection](#opi_api-security-v1-Connection)
    - [Groups](#opi_api-security-v1-Groups)
    - [IPsecInitiateRequest](#opi_api-security-v1-IPsecInitiateRequest)
    - [IPsecInitiateResponse](#opi_api-security-v1-IPsecInitiateResponse)
    - [IPsecListCertsRequest](#opi_api-security-v1-IPsecListCertsRequest)
    - [IPsecListCertsResponse](#opi_api-security-v1-IPsecListCertsResponse)
    - [IPsecListConnsRequest](#opi_api-security-v1-IPsecListConnsRequest)
    - [IPsecListConnsResponse](#opi_api-security-v1-IPsecListConnsResponse)
    - [IPsecListSasRequest](#opi_api-security-v1-IPsecListSasRequest)
    - [IPsecListSasResponse](#opi_api-security-v1-IPsecListSasResponse)
    - [IPsecLoadConnRequest](#opi_api-security-v1-IPsecLoadConnRequest)
    - [IPsecLoadConnResponse](#opi_api-security-v1-IPsecLoadConnResponse)
    - [IPsecRekeyRequest](#opi_api-security-v1-IPsecRekeyRequest)
    - [IPsecRekeyResponse](#opi_api-security-v1-IPsecRekeyResponse)
    - [IPsecStatsRequest](#opi_api-security-v1-IPsecStatsRequest)
    - [IPsecStatsResponse](#opi_api-security-v1-IPsecStatsResponse)
    - [IPsecTerminateRequest](#opi_api-security-v1-IPsecTerminateRequest)
    - [IPsecTerminateResponse](#opi_api-security-v1-IPsecTerminateResponse)
    - [IPsecUnloadConnRequest](#opi_api-security-v1-IPsecUnloadConnRequest)
    - [IPsecUnloadConnResponse](#opi_api-security-v1-IPsecUnloadConnResponse)
    - [IPsecVersionRequest](#opi_api-security-v1-IPsecVersionRequest)
    - [IPsecVersionResponse](#opi_api-security-v1-IPsecVersionResponse)
    - [ListCert](#opi_api-security-v1-ListCert)
    - [ListChild](#opi_api-security-v1-ListChild)
    - [ListChildSa](#opi_api-security-v1-ListChildSa)
    - [ListConnAuth](#opi_api-security-v1-ListConnAuth)
    - [ListConnResp](#opi_api-security-v1-ListConnResp)
    - [ListIkeSa](#opi_api-security-v1-ListIkeSa)
    - [LocalAuth](#opi_api-security-v1-LocalAuth)
    - [Pools](#opi_api-security-v1-Pools)
    - [Proposals](#opi_api-security-v1-Proposals)
    - [PubKeys](#opi_api-security-v1-PubKeys)
    - [RemoteAuth](#opi_api-security-v1-RemoteAuth)
    - [TrafficSelectors](#opi_api-security-v1-TrafficSelectors)
    - [TrafficSelectors.TrafficSelector](#opi_api-security-v1-TrafficSelectors-TrafficSelector)
    - [Vips](#opi_api-security-v1-Vips)
  
    - [AuthType](#opi_api-security-v1-AuthType)
    - [CertificateType](#opi_api-security-v1-CertificateType)
    - [ChildSaState](#opi_api-security-v1-ChildSaState)
    - [CryptoAlgorithm](#opi_api-security-v1-CryptoAlgorithm)
    - [DHGroups](#opi_api-security-v1-DHGroups)
    - [IkeSaState](#opi_api-security-v1-IkeSaState)
    - [IntegAlgorithm](#opi_api-security-v1-IntegAlgorithm)
    - [IpsecMode](#opi_api-security-v1-IpsecMode)
    - [PRFunction](#opi_api-security-v1-PRFunction)
    - [X509CertificateFlag](#opi_api-security-v1-X509CertificateFlag)
  
    - [IPsecService](#opi_api-security-v1-IPsecService)
  
- [Scalar Value Types](#scalar-value-types)



<a name="ipsec-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## ipsec.proto
Copyright (C) 2021 Intel Corporation
Copyright (c) 2023 Dell Inc, or its subsidiaries.
SPDX-License-Identifier: Apache-2.0

Major pieces taken from:
https://github.com/ligato/cn-infra/blob/master/examples/cryptodata-proto-plugin/ipsec/ipsec.proto


<a name="opi_api-security-v1-Addrs"></a>

### Addrs
IP addresses or hostanmes


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| addr | [string](#string) |  |  |






<a name="opi_api-security-v1-CaCerts"></a>

### CaCerts



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| cacert | [string](#string) | repeated |  |






<a name="opi_api-security-v1-CertPolicy"></a>

### CertPolicy



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| cert_policy | [string](#string) | repeated |  |






<a name="opi_api-security-v1-Certs"></a>

### Certs



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| cert | [string](#string) | repeated |  |






<a name="opi_api-security-v1-Child"></a>

### Child
Child SA


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Child SA name |
| ag_proposals | [Proposals](#opi_api-security-v1-Proposals) |  |  |
| esp_proposals | [Proposals](#opi_api-security-v1-Proposals) |  |  |
| local_ts | [TrafficSelectors](#opi_api-security-v1-TrafficSelectors) |  |  |
| remote_ts | [TrafficSelectors](#opi_api-security-v1-TrafficSelectors) |  |  |
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






<a name="opi_api-security-v1-Connection"></a>

### Connection
IKE connection


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | connection name |
| version | [string](#string) |  |  |
| local_addrs | [Addrs](#opi_api-security-v1-Addrs) | repeated |  |
| remote_addrs | [Addrs](#opi_api-security-v1-Addrs) | repeated |  |
| local_port | [uint32](#uint32) |  |  |
| remote_port | [uint32](#uint32) |  |  |
| proposals | [Proposals](#opi_api-security-v1-Proposals) |  |  |
| vips | [Vips](#opi_api-security-v1-Vips) |  |  |
| dscp | [uint64](#uint64) |  | We use only the lower 6 bytes |
| encap | [string](#string) |  |  |
| mobike | [string](#string) |  |  |
| dpd_delay | [uint32](#uint32) |  |  |
| dpd_timeout | [uint32](#uint32) |  |  |
| reauth_time | [uint32](#uint32) |  |  |
| rekey_time | [uint32](#uint32) |  |  |
| pools | [Pools](#opi_api-security-v1-Pools) |  |  |
| local_auth | [LocalAuth](#opi_api-security-v1-LocalAuth) |  |  |
| remote_auth | [RemoteAuth](#opi_api-security-v1-RemoteAuth) |  |  |
| children | [Child](#opi_api-security-v1-Child) | repeated |  |






<a name="opi_api-security-v1-Groups"></a>

### Groups



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group | [string](#string) | repeated |  |






<a name="opi_api-security-v1-IPsecInitiateRequest"></a>

### IPsecInitiateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| child | [string](#string) |  |  |
| ike | [string](#string) |  |  |
| timeout | [string](#string) |  |  |
| loglevel | [string](#string) |  |  |






<a name="opi_api-security-v1-IPsecInitiateResponse"></a>

### IPsecInitiateResponse
Intentionally empty






<a name="opi_api-security-v1-IPsecListCertsRequest"></a>

### IPsecListCertsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| type | [string](#string) |  |  |
| flag | [string](#string) |  |  |
| subject | [string](#string) |  |  |






<a name="opi_api-security-v1-IPsecListCertsResponse"></a>

### IPsecListCertsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| certs | [ListCert](#opi_api-security-v1-ListCert) | repeated |  |






<a name="opi_api-security-v1-IPsecListConnsRequest"></a>

### IPsecListConnsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| ike | [string](#string) |  |  |






<a name="opi_api-security-v1-IPsecListConnsResponse"></a>

### IPsecListConnsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| connection | [ListConnResp](#opi_api-security-v1-ListConnResp) | repeated |  |






<a name="opi_api-security-v1-IPsecListSasRequest"></a>

### IPsecListSasRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| noblock | [string](#string) |  |  |
| ike | [string](#string) |  |  |
| ike_id | [uint64](#uint64) |  |  |
| child | [string](#string) |  |  |
| child_id | [uint64](#uint64) |  |  |






<a name="opi_api-security-v1-IPsecListSasResponse"></a>

### IPsecListSasResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| ikesas | [ListIkeSa](#opi_api-security-v1-ListIkeSa) | repeated |  |






<a name="opi_api-security-v1-IPsecLoadConnRequest"></a>

### IPsecLoadConnRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| connection | [Connection](#opi_api-security-v1-Connection) |  |  |






<a name="opi_api-security-v1-IPsecLoadConnResponse"></a>

### IPsecLoadConnResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| success | [string](#string) |  |  |






<a name="opi_api-security-v1-IPsecRekeyRequest"></a>

### IPsecRekeyRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| child | [string](#string) |  |  |
| ike | [string](#string) |  |  |
| child_id | [uint64](#uint64) |  |  |
| ike_id | [uint64](#uint64) |  |  |
| reauth | [string](#string) |  |  |






<a name="opi_api-security-v1-IPsecRekeyResponse"></a>

### IPsecRekeyResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| success | [string](#string) |  |  |
| matches | [uint32](#uint32) |  |  |






<a name="opi_api-security-v1-IPsecStatsRequest"></a>

### IPsecStatsRequest
Intentionally empty






<a name="opi_api-security-v1-IPsecStatsResponse"></a>

### IPsecStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| status | [string](#string) |  | Generic status string for now |






<a name="opi_api-security-v1-IPsecTerminateRequest"></a>

### IPsecTerminateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| child | [string](#string) |  |  |
| ike | [string](#string) |  |  |
| child_id | [uint64](#uint64) |  |  |
| ike_id | [uint64](#uint64) |  |  |
| force | [string](#string) |  |  |
| timeout | [string](#string) |  |  |
| loglevel | [string](#string) |  |  |






<a name="opi_api-security-v1-IPsecTerminateResponse"></a>

### IPsecTerminateResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| success | [string](#string) |  |  |
| matches | [uint32](#uint32) |  |  |
| terminated | [uint32](#uint32) |  |  |






<a name="opi_api-security-v1-IPsecUnloadConnRequest"></a>

### IPsecUnloadConnRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-security-v1-IPsecUnloadConnResponse"></a>

### IPsecUnloadConnResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| success | [string](#string) |  |  |






<a name="opi_api-security-v1-IPsecVersionRequest"></a>

### IPsecVersionRequest
Intentionally empty






<a name="opi_api-security-v1-IPsecVersionResponse"></a>

### IPsecVersionResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| daemon | [string](#string) |  |  |
| version | [string](#string) |  |  |
| sysname | [string](#string) |  |  |
| release | [string](#string) |  |  |
| machine | [string](#string) |  |  |






<a name="opi_api-security-v1-ListCert"></a>

### ListCert
list-cert


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| type | [CertificateType](#opi_api-security-v1-CertificateType) |  |  |
| flag | [X509CertificateFlag](#opi_api-security-v1-X509CertificateFlag) |  |  |
| hasprivkey | [string](#string) |  |  |
| data | [string](#string) |  |  |
| subject | [string](#string) |  |  |
| notbefore | [string](#string) |  |  |
| notafter | [string](#string) |  |  |






<a name="opi_api-security-v1-ListChild"></a>

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
| local_ts | [TrafficSelectors](#opi_api-security-v1-TrafficSelectors) |  |  |
| remote_ts | [TrafficSelectors](#opi_api-security-v1-TrafficSelectors) |  |  |
| interface | [string](#string) |  |  |
| priority | [string](#string) |  |  |






<a name="opi_api-security-v1-ListChildSa"></a>

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






<a name="opi_api-security-v1-ListConnAuth"></a>

### ListConnAuth



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| class | [string](#string) |  |  |
| eaptype | [string](#string) |  |  |
| eapvendor | [string](#string) |  |  |
| xauth | [string](#string) |  |  |
| revocation | [string](#string) |  |  |
| id | [string](#string) |  |  |
| ca_id | [string](#string) |  |  |
| aaa_id | [string](#string) |  |  |
| eap_id | [string](#string) |  |  |
| xauth_id | [string](#string) |  |  |
| group | [Groups](#opi_api-security-v1-Groups) |  |  |
| cert_policy | [CertPolicy](#opi_api-security-v1-CertPolicy) |  |  |
| certs | [Certs](#opi_api-security-v1-Certs) |  |  |
| cacerts | [CaCerts](#opi_api-security-v1-CaCerts) |  |  |






<a name="opi_api-security-v1-ListConnResp"></a>

### ListConnResp



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Connection name |
| local_addrs | [Addrs](#opi_api-security-v1-Addrs) | repeated |  |
| remote_addrs | [Addrs](#opi_api-security-v1-Addrs) | repeated |  |
| version | [string](#string) |  |  |
| reauth_time | [uint32](#uint32) |  |  |
| rekey_time | [uint32](#uint32) |  |  |
| unique | [string](#string) |  |  |
| dpd_delay | [uint32](#uint32) |  |  |
| dpd_timeout | [uint32](#uint32) |  |  |
| ppk | [string](#string) |  |  |
| ppk_required | [string](#string) |  |  |
| local_auth | [ListConnAuth](#opi_api-security-v1-ListConnAuth) | repeated |  |
| remote_auth | [ListConnAuth](#opi_api-security-v1-ListConnAuth) | repeated |  |
| children | [ListChild](#opi_api-security-v1-ListChild) | repeated |  |






<a name="opi_api-security-v1-ListIkeSa"></a>

### ListIkeSa



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | IKE_SA name |
| uniqueid | [string](#string) |  |  |
| version | [string](#string) |  |  |
| ikestate | [IkeSaState](#opi_api-security-v1-IkeSaState) |  |  |
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
| childsas | [ListChildSa](#opi_api-security-v1-ListChildSa) | repeated |  |






<a name="opi_api-security-v1-LocalAuth"></a>

### LocalAuth



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| auth | [AuthType](#opi_api-security-v1-AuthType) |  |  |
| id | [string](#string) |  |  |
| eap_id | [string](#string) |  |  |
| aaa_id | [string](#string) |  |  |
| xauth_id | [string](#string) |  |  |
| certs | [Certs](#opi_api-security-v1-Certs) |  |  |
| pubkeys | [PubKeys](#opi_api-security-v1-PubKeys) |  |  |






<a name="opi_api-security-v1-Pools"></a>

### Pools



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| pool | [string](#string) | repeated |  |






<a name="opi_api-security-v1-Proposals"></a>

### Proposals



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| crypto_alg | [CryptoAlgorithm](#opi_api-security-v1-CryptoAlgorithm) | repeated |  |
| integ_alg | [IntegAlgorithm](#opi_api-security-v1-IntegAlgorithm) | repeated |  |
| prf | [PRFunction](#opi_api-security-v1-PRFunction) | repeated |  |
| dhgroups | [DHGroups](#opi_api-security-v1-DHGroups) | repeated |  |






<a name="opi_api-security-v1-PubKeys"></a>

### PubKeys



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| pubkey | [string](#string) | repeated |  |






<a name="opi_api-security-v1-RemoteAuth"></a>

### RemoteAuth



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| auth | [AuthType](#opi_api-security-v1-AuthType) |  |  |
| id | [string](#string) |  |  |
| eap_id | [string](#string) |  |  |
| groups | [Groups](#opi_api-security-v1-Groups) |  |  |
| cert_policy | [CertPolicy](#opi_api-security-v1-CertPolicy) |  |  |
| certs | [Certs](#opi_api-security-v1-Certs) |  |  |
| ca_certs | [CaCerts](#opi_api-security-v1-CaCerts) |  |  |
| pubkeys | [PubKeys](#opi_api-security-v1-PubKeys) |  |  |






<a name="opi_api-security-v1-TrafficSelectors"></a>

### TrafficSelectors



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| ts | [TrafficSelectors.TrafficSelector](#opi_api-security-v1-TrafficSelectors-TrafficSelector) | repeated |  |






<a name="opi_api-security-v1-TrafficSelectors-TrafficSelector"></a>

### TrafficSelectors.TrafficSelector



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| cidr | [string](#string) |  |  |
| proto | [string](#string) |  |  |
| port | [string](#string) |  |  |






<a name="opi_api-security-v1-Vips"></a>

### Vips



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vip | [string](#string) | repeated |  |





 


<a name="opi_api-security-v1-AuthType"></a>

### AuthType
Authentication Type

| Name | Number | Description |
| ---- | ------ | ----------- |
| AUTH_TYPE_UNSPECIFIED | 0 |  |
| AUTH_TYPE_PUBKEY | 1 |  |
| AUTH_TYPE_PSK | 2 |  |
| AUTH_TYPE_XAUTH | 3 |  |
| AUTH_TYPE_EAP | 4 |  |



<a name="opi_api-security-v1-CertificateType"></a>

### CertificateType
Certificate type

| Name | Number | Description |
| ---- | ------ | ----------- |
| CERTIFICATE_TYPE_X509_UNSPECIFIED | 0 |  |
| CERTIFICATE_TYPE_X509_AC | 1 |  |
| CERTIFICATE_TYPE_X509_CRL | 2 |  |
| CERTIFICATE_TYPE_OCSP_RESPONSE | 3 |  |
| CERTIFICATE_TYPE_PUBKEY | 4 |  |



<a name="opi_api-security-v1-ChildSaState"></a>

### ChildSaState
CHILD_SA state

| Name | Number | Description |
| ---- | ------ | ----------- |
| CHILD_SA_STATE_UNSPECIFIED | 0 |  |
| CHILD_SA_STATE_CREATED | 1 |  |
| CHILD_SA_STATE_ROUTED | 2 |  |
| CHILD_SA_STATE_INSTALLING | 3 |  |
| CHILD_SA_STATE_INSTALLED | 4 |  |
| CHILD_SA_STATE_UPDATING | 5 |  |
| CHILD_SA_STATE_REKEYING | 6 |  |
| CHILD_SA_STATE_REKEYED | 7 |  |
| CHILD_SA_STATE_RETRYING | 8 |  |
| CHILD_SA_STATE_DELETING | 9 |  |
| CHILD_SA_STATE_DELETED | 10 |  |
| CHILD_SA_STATE_DESTROYING | 11 |  |



<a name="opi_api-security-v1-CryptoAlgorithm"></a>

### CryptoAlgorithm
Cryptographic algorithm for encryption

| Name | Number | Description |
| ---- | ------ | ----------- |
| CRYPTO_ALGORITHM_UNSPECIFIED | 0 |  |
| CRYPTO_ALGORITHM_AES128 | 1 |  |
| CRYPTO_ALGORITHM_AES192 | 2 |  |
| CRYPTO_ALGORITHM_AES256 | 3 |  |
| CRYPTO_ALGORITHM_AES128GCM128 | 4 |  |
| CRYPTO_ALGORITHM_AES256GCM128 | 5 |  |
| CRYPTO_ALGORITHM_AES128GMAC | 6 |  |
| CRYPTO_ALGORITHM_AES256GMAC | 7 |  |



<a name="opi_api-security-v1-DHGroups"></a>

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



<a name="opi_api-security-v1-IkeSaState"></a>

### IkeSaState
IKE_SA state

| Name | Number | Description |
| ---- | ------ | ----------- |
| IKE_SA_STATE_UNSPECIFIED | 0 |  |
| IKE_SA_STATE_CREATED | 1 |  |
| IKE_SA_STATE_CONNECTING | 2 |  |
| IKE_SA_STATE_ESTABLISHED | 3 |  |
| IKE_SA_STATE_PASSIVE | 4 |  |
| IKE_SA_STATE_REKEYING | 5 |  |
| IKE_SA_STATE_REKEYED | 6 |  |
| IKE_SA_STATE_DELETING | 7 |  |
| IKE_SA_STATE_DESTROYING | 8 |  |



<a name="opi_api-security-v1-IntegAlgorithm"></a>

### IntegAlgorithm
Cryptographic algorithm for authentication

| Name | Number | Description |
| ---- | ------ | ----------- |
| INTEG_ALGORITHM_UNSPECIFIED | 0 |  |
| INTEG_ALGORITHM_MD5 | 1 |  |
| INTEG_ALGORITHM_MD5_128 | 2 |  |
| INTEG_ALGORITHM_SHA1 | 3 |  |
| INTEG_ALGORITHM_SHA1_160 | 4 |  |
| INTEG_ALGORITHM_SHA256 | 5 |  |
| INTEG_ALGORITHM_SHA384 | 7 |  |
| INTEG_ALGORITHM_SHA512 | 8 |  |
| INTEG_ALGORITHM_SHA256_96 | 9 |  |



<a name="opi_api-security-v1-IpsecMode"></a>

### IpsecMode
Tunnel mode

| Name | Number | Description |
| ---- | ------ | ----------- |
| IPSEC_MODE_UNSPECIFIED | 0 |  |
| IPSEC_MODE_TUNNEL_MODE | 1 |  |
| IPSEC_MODE_TRANSPORT_MODE | 2 |  |



<a name="opi_api-security-v1-PRFunction"></a>

### PRFunction
Pesudo Random Function

| Name | Number | Description |
| ---- | ------ | ----------- |
| PR_FUNCTION_UNSPECIFIED | 0 |  |
| PR_FUNCTION_MD5 | 1 |  |
| PR_FUNCTION_SHA1 | 2 |  |
| PR_FUNCTION_AESXCBC | 3 |  |
| PR_FUNCTION_AESCMAC | 4 |  |
| PR_FUNCTION_SHA256 | 5 |  |
| PR_FUNCTION_SHA384 | 6 |  |
| PR_FUNCTION_SHA512 | 7 |  |



<a name="opi_api-security-v1-X509CertificateFlag"></a>

### X509CertificateFlag
X.509 certificate flag

| Name | Number | Description |
| ---- | ------ | ----------- |
| X509_CERTIFICATE_FLAG_UNSPECIFIED | 0 |  |
| X509_CERTIFICATE_FLAG_CA | 1 |  |
| X509_CERTIFICATE_FLAG_AA | 2 |  |
| X509_CERTIFICATE_FLAG_OCSP | 3 |  |


 

 


<a name="opi_api-security-v1-IPsecService"></a>

### IPsecService
Service functions for IPSec Protocol

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| IPsecVersion | [IPsecVersionRequest](#opi_api-security-v1-IPsecVersionRequest) | [IPsecVersionResponse](#opi_api-security-v1-IPsecVersionResponse) |  |
| IPsecStats | [IPsecStatsRequest](#opi_api-security-v1-IPsecStatsRequest) | [IPsecStatsResponse](#opi_api-security-v1-IPsecStatsResponse) |  |
| IPsecInitiate | [IPsecInitiateRequest](#opi_api-security-v1-IPsecInitiateRequest) | [IPsecInitiateResponse](#opi_api-security-v1-IPsecInitiateResponse) |  |
| IPsecTerminate | [IPsecTerminateRequest](#opi_api-security-v1-IPsecTerminateRequest) | [IPsecTerminateResponse](#opi_api-security-v1-IPsecTerminateResponse) |  |
| IPsecRekey | [IPsecRekeyRequest](#opi_api-security-v1-IPsecRekeyRequest) | [IPsecRekeyResponse](#opi_api-security-v1-IPsecRekeyResponse) |  |
| IPsecListSas | [IPsecListSasRequest](#opi_api-security-v1-IPsecListSasRequest) | [IPsecListSasResponse](#opi_api-security-v1-IPsecListSasResponse) |  |
| IPsecListConns | [IPsecListConnsRequest](#opi_api-security-v1-IPsecListConnsRequest) | [IPsecListConnsResponse](#opi_api-security-v1-IPsecListConnsResponse) |  |
| IPsecListCerts | [IPsecListCertsRequest](#opi_api-security-v1-IPsecListCertsRequest) | [IPsecListCertsResponse](#opi_api-security-v1-IPsecListCertsResponse) |  |
| IPsecLoadConn | [IPsecLoadConnRequest](#opi_api-security-v1-IPsecLoadConnRequest) | [IPsecLoadConnResponse](#opi_api-security-v1-IPsecLoadConnResponse) |  |
| IPsecUnloadConn | [IPsecUnloadConnRequest](#opi_api-security-v1-IPsecUnloadConnRequest) | [IPsecUnloadConnResponse](#opi_api-security-v1-IPsecUnloadConnResponse) |  |

 



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

