# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [backend.proto](#backend-proto)
    - [NVMfRemoteController](#opi-storage-v1-NVMfRemoteController)
    - [NVMfRemoteControllerConnectRequest](#opi-storage-v1-NVMfRemoteControllerConnectRequest)
    - [NVMfRemoteControllerConnectResponse](#opi-storage-v1-NVMfRemoteControllerConnectResponse)
    - [NVMfRemoteControllerDisconnectRequest](#opi-storage-v1-NVMfRemoteControllerDisconnectRequest)
    - [NVMfRemoteControllerDisconnectResponse](#opi-storage-v1-NVMfRemoteControllerDisconnectResponse)
    - [NVMfRemoteControllerGetRequest](#opi-storage-v1-NVMfRemoteControllerGetRequest)
    - [NVMfRemoteControllerGetResponse](#opi-storage-v1-NVMfRemoteControllerGetResponse)
    - [NVMfRemoteControllerListRequest](#opi-storage-v1-NVMfRemoteControllerListRequest)
    - [NVMfRemoteControllerListResponse](#opi-storage-v1-NVMfRemoteControllerListResponse)
    - [NVMfRemoteControllerResetRequest](#opi-storage-v1-NVMfRemoteControllerResetRequest)
    - [NVMfRemoteControllerResetResponse](#opi-storage-v1-NVMfRemoteControllerResetResponse)
    - [NVMfRemoteControllerStatsRequest](#opi-storage-v1-NVMfRemoteControllerStatsRequest)
    - [NVMfRemoteControllerStatsResponse](#opi-storage-v1-NVMfRemoteControllerStatsResponse)
  
    - [NvmeAddressFamily](#opi-storage-v1-NvmeAddressFamily)
    - [NvmeMultipath](#opi-storage-v1-NvmeMultipath)
    - [NvmeTransportType](#opi-storage-v1-NvmeTransportType)
  
    - [NVMfRemoteControllerService](#opi-storage-v1-NVMfRemoteControllerService)
  
- [frontend.proto](#frontend-proto)
    - [NVMeController](#opi-storage-v1-NVMeController)
    - [NVMeControllerCreateRequest](#opi-storage-v1-NVMeControllerCreateRequest)
    - [NVMeControllerCreateResponse](#opi-storage-v1-NVMeControllerCreateResponse)
    - [NVMeControllerDeleteRequest](#opi-storage-v1-NVMeControllerDeleteRequest)
    - [NVMeControllerDeleteResponse](#opi-storage-v1-NVMeControllerDeleteResponse)
    - [NVMeControllerGetRequest](#opi-storage-v1-NVMeControllerGetRequest)
    - [NVMeControllerGetResponse](#opi-storage-v1-NVMeControllerGetResponse)
    - [NVMeControllerListRequest](#opi-storage-v1-NVMeControllerListRequest)
    - [NVMeControllerListResponse](#opi-storage-v1-NVMeControllerListResponse)
    - [NVMeControllerStatsRequest](#opi-storage-v1-NVMeControllerStatsRequest)
    - [NVMeControllerStatsResponse](#opi-storage-v1-NVMeControllerStatsResponse)
    - [NVMeControllerUpdateRequest](#opi-storage-v1-NVMeControllerUpdateRequest)
    - [NVMeControllerUpdateResponse](#opi-storage-v1-NVMeControllerUpdateResponse)
    - [NVMeNamespace](#opi-storage-v1-NVMeNamespace)
    - [NVMeNamespaceCreateRequest](#opi-storage-v1-NVMeNamespaceCreateRequest)
    - [NVMeNamespaceCreateResponse](#opi-storage-v1-NVMeNamespaceCreateResponse)
    - [NVMeNamespaceDeleteRequest](#opi-storage-v1-NVMeNamespaceDeleteRequest)
    - [NVMeNamespaceDeleteResponse](#opi-storage-v1-NVMeNamespaceDeleteResponse)
    - [NVMeNamespaceGetRequest](#opi-storage-v1-NVMeNamespaceGetRequest)
    - [NVMeNamespaceGetResponse](#opi-storage-v1-NVMeNamespaceGetResponse)
    - [NVMeNamespaceListRequest](#opi-storage-v1-NVMeNamespaceListRequest)
    - [NVMeNamespaceListResponse](#opi-storage-v1-NVMeNamespaceListResponse)
    - [NVMeNamespaceStatsRequest](#opi-storage-v1-NVMeNamespaceStatsRequest)
    - [NVMeNamespaceStatsResponse](#opi-storage-v1-NVMeNamespaceStatsResponse)
    - [NVMeNamespaceUpdateRequest](#opi-storage-v1-NVMeNamespaceUpdateRequest)
    - [NVMeNamespaceUpdateResponse](#opi-storage-v1-NVMeNamespaceUpdateResponse)
    - [NVMeSubsystem](#opi-storage-v1-NVMeSubsystem)
    - [NVMeSubsystemCreateRequest](#opi-storage-v1-NVMeSubsystemCreateRequest)
    - [NVMeSubsystemCreateResponse](#opi-storage-v1-NVMeSubsystemCreateResponse)
    - [NVMeSubsystemDeleteRequest](#opi-storage-v1-NVMeSubsystemDeleteRequest)
    - [NVMeSubsystemDeleteResponse](#opi-storage-v1-NVMeSubsystemDeleteResponse)
    - [NVMeSubsystemGetRequest](#opi-storage-v1-NVMeSubsystemGetRequest)
    - [NVMeSubsystemGetResponse](#opi-storage-v1-NVMeSubsystemGetResponse)
    - [NVMeSubsystemListRequest](#opi-storage-v1-NVMeSubsystemListRequest)
    - [NVMeSubsystemListResponse](#opi-storage-v1-NVMeSubsystemListResponse)
    - [NVMeSubsystemStatsRequest](#opi-storage-v1-NVMeSubsystemStatsRequest)
    - [NVMeSubsystemStatsResponse](#opi-storage-v1-NVMeSubsystemStatsResponse)
    - [NVMeSubsystemUpdateRequest](#opi-storage-v1-NVMeSubsystemUpdateRequest)
    - [NVMeSubsystemUpdateResponse](#opi-storage-v1-NVMeSubsystemUpdateResponse)
  
    - [NVMeControllerService](#opi-storage-v1-NVMeControllerService)
    - [NVMeNamespaceService](#opi-storage-v1-NVMeNamespaceService)
    - [NVMeSubsystemService](#opi-storage-v1-NVMeSubsystemService)
  
- [middleend.proto](#middleend-proto)
- [Scalar Value Types](#scalar-value-types)



<a name="backend-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## backend.proto



<a name="opi-storage-v1-NVMfRemoteController"></a>

### NVMfRemoteController



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| Id | [int64](#int64) |  |  |
| trtype | [NvmeTransportType](#opi-storage-v1-NvmeTransportType) |  |  |
| adrfam | [NvmeAddressFamily](#opi-storage-v1-NvmeAddressFamily) |  |  |
| traddr | [string](#string) |  |  |
| trsvcid | [int64](#int64) |  |  |
| subnqn | [string](#string) |  |  |
| hdgst | [bool](#bool) |  |  |
| ddgst | [bool](#bool) |  |  |
| multipath | [NvmeMultipath](#opi-storage-v1-NvmeMultipath) |  |  |
| num_io_queues | [int64](#int64) |  |  |
| queue_size | [int64](#int64) |  |  |






<a name="opi-storage-v1-NVMfRemoteControllerConnectRequest"></a>

### NVMfRemoteControllerConnectRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| Controller | [NVMfRemoteController](#opi-storage-v1-NVMfRemoteController) |  |  |






<a name="opi-storage-v1-NVMfRemoteControllerConnectResponse"></a>

### NVMfRemoteControllerConnectResponse
Intentionally empty.






<a name="opi-storage-v1-NVMfRemoteControllerDisconnectRequest"></a>

### NVMfRemoteControllerDisconnectRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| Id | [int64](#int64) |  |  |






<a name="opi-storage-v1-NVMfRemoteControllerDisconnectResponse"></a>

### NVMfRemoteControllerDisconnectResponse
Intentionally empty.






<a name="opi-storage-v1-NVMfRemoteControllerGetRequest"></a>

### NVMfRemoteControllerGetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| Id | [int64](#int64) |  |  |






<a name="opi-storage-v1-NVMfRemoteControllerGetResponse"></a>

### NVMfRemoteControllerGetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| Controller | [NVMfRemoteController](#opi-storage-v1-NVMfRemoteController) |  |  |






<a name="opi-storage-v1-NVMfRemoteControllerListRequest"></a>

### NVMfRemoteControllerListRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| Id | [int64](#int64) |  |  |






<a name="opi-storage-v1-NVMfRemoteControllerListResponse"></a>

### NVMfRemoteControllerListResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| Controller | [NVMfRemoteController](#opi-storage-v1-NVMfRemoteController) | repeated |  |






<a name="opi-storage-v1-NVMfRemoteControllerResetRequest"></a>

### NVMfRemoteControllerResetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| Id | [int64](#int64) |  |  |






<a name="opi-storage-v1-NVMfRemoteControllerResetResponse"></a>

### NVMfRemoteControllerResetResponse
Intentionally empty.






<a name="opi-storage-v1-NVMfRemoteControllerStatsRequest"></a>

### NVMfRemoteControllerStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| Id | [int64](#int64) |  |  |






<a name="opi-storage-v1-NVMfRemoteControllerStatsResponse"></a>

### NVMfRemoteControllerStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| Id | [int64](#int64) |  |  |
| Stats | [string](#string) |  |  |





 


<a name="opi-storage-v1-NvmeAddressFamily"></a>

### NvmeAddressFamily


| Name | Number | Description |
| ---- | ------ | ----------- |
| NVMF_ADRFAM_IPV4 | 0 |  |
| NVMF_ADRFAM_IPV6 | 1 |  |
| NVMF_ADRFAM_IB | 2 |  |
| NVMF_ADRFAM_FC | 3 |  |
| NVMF_ADRFAM_INTRA_HOST | 4 |  |



<a name="opi-storage-v1-NvmeMultipath"></a>

### NvmeMultipath


| Name | Number | Description |
| ---- | ------ | ----------- |
| NVME_MPIO_DISABLE | 0 |  |
| NVME_MPIO_FAILOVER | 1 |  |
| NVME_MPIO_MULTIPATH | 2 |  |



<a name="opi-storage-v1-NvmeTransportType"></a>

### NvmeTransportType


| Name | Number | Description |
| ---- | ------ | ----------- |
| NVME_TRANSPORT_FC | 0 |  |
| NVME_TRANSPORT_PCIE | 1 |  |
| NVME_TRANSPORT_RDMA | 2 |  |
| NVME_TRANSPORT_TCP | 3 |  |
| NVME_TRANSPORT_CUSTOM | 4 |  |


 

 


<a name="opi-storage-v1-NVMfRemoteControllerService"></a>

### NVMfRemoteControllerService


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| NVMfRemoteControllerConnect | [NVMfRemoteControllerConnectRequest](#opi-storage-v1-NVMfRemoteControllerConnectRequest) | [NVMfRemoteControllerConnectResponse](#opi-storage-v1-NVMfRemoteControllerConnectResponse) |  |
| NVMfRemoteControllerDisconnect | [NVMfRemoteControllerDisconnectRequest](#opi-storage-v1-NVMfRemoteControllerDisconnectRequest) | [NVMfRemoteControllerDisconnectResponse](#opi-storage-v1-NVMfRemoteControllerDisconnectResponse) |  |
| NVMfRemoteControllerReset | [NVMfRemoteControllerResetRequest](#opi-storage-v1-NVMfRemoteControllerResetRequest) | [NVMfRemoteControllerResetResponse](#opi-storage-v1-NVMfRemoteControllerResetResponse) |  |
| NVMfRemoteControllerList | [NVMfRemoteControllerListRequest](#opi-storage-v1-NVMfRemoteControllerListRequest) | [NVMfRemoteControllerListResponse](#opi-storage-v1-NVMfRemoteControllerListResponse) |  |
| NVMfRemoteControllerGet | [NVMfRemoteControllerGetRequest](#opi-storage-v1-NVMfRemoteControllerGetRequest) | [NVMfRemoteControllerGetResponse](#opi-storage-v1-NVMfRemoteControllerGetResponse) |  |
| NVMfRemoteControllerStats | [NVMfRemoteControllerStatsRequest](#opi-storage-v1-NVMfRemoteControllerStatsRequest) | [NVMfRemoteControllerStatsResponse](#opi-storage-v1-NVMfRemoteControllerStatsResponse) |  |

 



<a name="frontend-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## frontend.proto



<a name="opi-storage-v1-NVMeController"></a>

### NVMeController



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| Id | [int64](#int64) |  |  |
| Name | [string](#string) |  |  |
| SubsystemId | [string](#string) |  |  |
| PCIeID | [string](#string) |  |  |
| MaxIOQPs | [int64](#int64) |  |  |
| MaxNs | [int64](#int64) |  |  |






<a name="opi-storage-v1-NVMeControllerCreateRequest"></a>

### NVMeControllerCreateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| Controller | [NVMeController](#opi-storage-v1-NVMeController) |  |  |






<a name="opi-storage-v1-NVMeControllerCreateResponse"></a>

### NVMeControllerCreateResponse
Intentionally empty.






<a name="opi-storage-v1-NVMeControllerDeleteRequest"></a>

### NVMeControllerDeleteRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| SubsystemId | [int64](#int64) |  |  |
| ControllerId | [int64](#int64) |  |  |






<a name="opi-storage-v1-NVMeControllerDeleteResponse"></a>

### NVMeControllerDeleteResponse
Intentionally empty.






<a name="opi-storage-v1-NVMeControllerGetRequest"></a>

### NVMeControllerGetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| SubsystemId | [int64](#int64) |  |  |
| ControllerId | [int64](#int64) |  |  |






<a name="opi-storage-v1-NVMeControllerGetResponse"></a>

### NVMeControllerGetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| Controller | [NVMeController](#opi-storage-v1-NVMeController) |  |  |






<a name="opi-storage-v1-NVMeControllerListRequest"></a>

### NVMeControllerListRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| SubsystemId | [int64](#int64) |  |  |






<a name="opi-storage-v1-NVMeControllerListResponse"></a>

### NVMeControllerListResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| Controller | [NVMeController](#opi-storage-v1-NVMeController) | repeated |  |






<a name="opi-storage-v1-NVMeControllerStatsRequest"></a>

### NVMeControllerStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| SubsystemId | [int64](#int64) |  |  |
| ControllerId | [int64](#int64) |  |  |






<a name="opi-storage-v1-NVMeControllerStatsResponse"></a>

### NVMeControllerStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| Id | [int64](#int64) |  |  |
| Stats | [string](#string) |  |  |






<a name="opi-storage-v1-NVMeControllerUpdateRequest"></a>

### NVMeControllerUpdateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| Controller | [NVMeController](#opi-storage-v1-NVMeController) |  |  |






<a name="opi-storage-v1-NVMeControllerUpdateResponse"></a>

### NVMeControllerUpdateResponse
Intentionally empty.






<a name="opi-storage-v1-NVMeNamespace"></a>

### NVMeNamespace



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| Id | [int64](#int64) |  |  |
| Name | [string](#string) |  |  |
| SubsystemId | [string](#string) |  |  |
| ControllerId | [int64](#int64) |  |  |
| NsId | [int64](#int64) |  |  |
| Bdev | [string](#string) |  |  |
| BlockSize | [int64](#int64) |  |  |
| NumBlocks | [int64](#int64) |  |  |
| NGUID | [string](#string) |  |  |
| EUI64 | [string](#string) |  |  |
| UUID | [string](#string) |  |  |
| Multipath | [string](#string) |  |  |
| Authentication | [string](#string) |  |  |






<a name="opi-storage-v1-NVMeNamespaceCreateRequest"></a>

### NVMeNamespaceCreateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| Namespace | [NVMeNamespace](#opi-storage-v1-NVMeNamespace) |  |  |






<a name="opi-storage-v1-NVMeNamespaceCreateResponse"></a>

### NVMeNamespaceCreateResponse
Intentionally empty.






<a name="opi-storage-v1-NVMeNamespaceDeleteRequest"></a>

### NVMeNamespaceDeleteRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| SubsystemId | [int64](#int64) |  |  |
| ControllerId | [int64](#int64) |  |  |
| NamespaceId | [int64](#int64) |  |  |






<a name="opi-storage-v1-NVMeNamespaceDeleteResponse"></a>

### NVMeNamespaceDeleteResponse
Intentionally empty.






<a name="opi-storage-v1-NVMeNamespaceGetRequest"></a>

### NVMeNamespaceGetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| SubsystemId | [int64](#int64) |  |  |
| ControllerId | [int64](#int64) |  |  |
| NamespaceId | [int64](#int64) |  |  |






<a name="opi-storage-v1-NVMeNamespaceGetResponse"></a>

### NVMeNamespaceGetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| Namespace | [NVMeNamespace](#opi-storage-v1-NVMeNamespace) |  |  |






<a name="opi-storage-v1-NVMeNamespaceListRequest"></a>

### NVMeNamespaceListRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| SubsystemId | [int64](#int64) |  |  |
| ControllerId | [int64](#int64) |  |  |






<a name="opi-storage-v1-NVMeNamespaceListResponse"></a>

### NVMeNamespaceListResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| Namespace | [NVMeNamespace](#opi-storage-v1-NVMeNamespace) | repeated |  |






<a name="opi-storage-v1-NVMeNamespaceStatsRequest"></a>

### NVMeNamespaceStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| SubsystemId | [int64](#int64) |  |  |
| ControllerId | [int64](#int64) |  |  |
| NamespaceId | [int64](#int64) |  |  |






<a name="opi-storage-v1-NVMeNamespaceStatsResponse"></a>

### NVMeNamespaceStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| Id | [int64](#int64) |  |  |
| Stats | [string](#string) |  |  |






<a name="opi-storage-v1-NVMeNamespaceUpdateRequest"></a>

### NVMeNamespaceUpdateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| Namespace | [NVMeNamespace](#opi-storage-v1-NVMeNamespace) |  |  |






<a name="opi-storage-v1-NVMeNamespaceUpdateResponse"></a>

### NVMeNamespaceUpdateResponse
Intentionally empty.






<a name="opi-storage-v1-NVMeSubsystem"></a>

### NVMeSubsystem



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| Id | [int64](#int64) |  |  |
| NQN | [string](#string) |  |  |
| SerialNumber | [string](#string) |  |  |
| ModelNumber | [string](#string) |  |  |
| MaxNs | [int64](#int64) |  |  |






<a name="opi-storage-v1-NVMeSubsystemCreateRequest"></a>

### NVMeSubsystemCreateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| Subsystem | [NVMeSubsystem](#opi-storage-v1-NVMeSubsystem) |  |  |






<a name="opi-storage-v1-NVMeSubsystemCreateResponse"></a>

### NVMeSubsystemCreateResponse
Intentionally empty.






<a name="opi-storage-v1-NVMeSubsystemDeleteRequest"></a>

### NVMeSubsystemDeleteRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| Id | [int64](#int64) |  |  |






<a name="opi-storage-v1-NVMeSubsystemDeleteResponse"></a>

### NVMeSubsystemDeleteResponse
Intentionally empty.






<a name="opi-storage-v1-NVMeSubsystemGetRequest"></a>

### NVMeSubsystemGetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| Id | [int64](#int64) |  |  |






<a name="opi-storage-v1-NVMeSubsystemGetResponse"></a>

### NVMeSubsystemGetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| Subsystem | [NVMeSubsystem](#opi-storage-v1-NVMeSubsystem) |  |  |






<a name="opi-storage-v1-NVMeSubsystemListRequest"></a>

### NVMeSubsystemListRequest
Intentionally empty.






<a name="opi-storage-v1-NVMeSubsystemListResponse"></a>

### NVMeSubsystemListResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| Subsystem | [NVMeSubsystem](#opi-storage-v1-NVMeSubsystem) | repeated |  |






<a name="opi-storage-v1-NVMeSubsystemStatsRequest"></a>

### NVMeSubsystemStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| Id | [int64](#int64) |  |  |






<a name="opi-storage-v1-NVMeSubsystemStatsResponse"></a>

### NVMeSubsystemStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| Id | [int64](#int64) |  |  |
| Stats | [string](#string) |  |  |






<a name="opi-storage-v1-NVMeSubsystemUpdateRequest"></a>

### NVMeSubsystemUpdateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| Subsystem | [NVMeSubsystem](#opi-storage-v1-NVMeSubsystem) |  |  |






<a name="opi-storage-v1-NVMeSubsystemUpdateResponse"></a>

### NVMeSubsystemUpdateResponse
Intentionally empty.





 

 

 


<a name="opi-storage-v1-NVMeControllerService"></a>

### NVMeControllerService


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| NVMeControllerCreate | [NVMeControllerCreateRequest](#opi-storage-v1-NVMeControllerCreateRequest) | [NVMeControllerCreateResponse](#opi-storage-v1-NVMeControllerCreateResponse) |  |
| NVMeControllerDelete | [NVMeControllerDeleteRequest](#opi-storage-v1-NVMeControllerDeleteRequest) | [NVMeControllerDeleteResponse](#opi-storage-v1-NVMeControllerDeleteResponse) |  |
| NVMeControllerUpdate | [NVMeControllerUpdateRequest](#opi-storage-v1-NVMeControllerUpdateRequest) | [NVMeControllerUpdateResponse](#opi-storage-v1-NVMeControllerUpdateResponse) |  |
| NVMeControllerList | [NVMeControllerListRequest](#opi-storage-v1-NVMeControllerListRequest) | [NVMeControllerListResponse](#opi-storage-v1-NVMeControllerListResponse) |  |
| NVMeControllerGet | [NVMeControllerGetRequest](#opi-storage-v1-NVMeControllerGetRequest) | [NVMeControllerGetResponse](#opi-storage-v1-NVMeControllerGetResponse) |  |
| NVMeControllerStats | [NVMeControllerStatsRequest](#opi-storage-v1-NVMeControllerStatsRequest) | [NVMeControllerStatsResponse](#opi-storage-v1-NVMeControllerStatsResponse) |  |


<a name="opi-storage-v1-NVMeNamespaceService"></a>

### NVMeNamespaceService


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| NVMeNamespaceCreate | [NVMeNamespaceCreateRequest](#opi-storage-v1-NVMeNamespaceCreateRequest) | [NVMeNamespaceCreateResponse](#opi-storage-v1-NVMeNamespaceCreateResponse) |  |
| NVMeNamespaceDelete | [NVMeNamespaceDeleteRequest](#opi-storage-v1-NVMeNamespaceDeleteRequest) | [NVMeNamespaceDeleteResponse](#opi-storage-v1-NVMeNamespaceDeleteResponse) |  |
| NVMeNamespaceUpdate | [NVMeNamespaceUpdateRequest](#opi-storage-v1-NVMeNamespaceUpdateRequest) | [NVMeNamespaceUpdateResponse](#opi-storage-v1-NVMeNamespaceUpdateResponse) |  |
| NVMeNamespaceList | [NVMeNamespaceListRequest](#opi-storage-v1-NVMeNamespaceListRequest) | [NVMeNamespaceListResponse](#opi-storage-v1-NVMeNamespaceListResponse) |  |
| NVMeNamespaceGet | [NVMeNamespaceGetRequest](#opi-storage-v1-NVMeNamespaceGetRequest) | [NVMeNamespaceGetResponse](#opi-storage-v1-NVMeNamespaceGetResponse) |  |
| NVMeNamespaceStats | [NVMeNamespaceStatsRequest](#opi-storage-v1-NVMeNamespaceStatsRequest) | [NVMeNamespaceStatsResponse](#opi-storage-v1-NVMeNamespaceStatsResponse) |  |


<a name="opi-storage-v1-NVMeSubsystemService"></a>

### NVMeSubsystemService


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| NVMeSubsystemCreate | [NVMeSubsystemCreateRequest](#opi-storage-v1-NVMeSubsystemCreateRequest) | [NVMeSubsystemCreateResponse](#opi-storage-v1-NVMeSubsystemCreateResponse) |  |
| NVMeSubsystemDelete | [NVMeSubsystemDeleteRequest](#opi-storage-v1-NVMeSubsystemDeleteRequest) | [NVMeSubsystemDeleteResponse](#opi-storage-v1-NVMeSubsystemDeleteResponse) |  |
| NVMeSubsystemUpdate | [NVMeSubsystemUpdateRequest](#opi-storage-v1-NVMeSubsystemUpdateRequest) | [NVMeSubsystemUpdateResponse](#opi-storage-v1-NVMeSubsystemUpdateResponse) |  |
| NVMeSubsystemList | [NVMeSubsystemListRequest](#opi-storage-v1-NVMeSubsystemListRequest) | [NVMeSubsystemListResponse](#opi-storage-v1-NVMeSubsystemListResponse) |  |
| NVMeSubsystemGet | [NVMeSubsystemGetRequest](#opi-storage-v1-NVMeSubsystemGetRequest) | [NVMeSubsystemGetResponse](#opi-storage-v1-NVMeSubsystemGetResponse) |  |
| NVMeSubsystemStats | [NVMeSubsystemStatsRequest](#opi-storage-v1-NVMeSubsystemStatsRequest) | [NVMeSubsystemStatsResponse](#opi-storage-v1-NVMeSubsystemStatsResponse) |  |

 



<a name="middleend-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## middleend.proto


 

 

 

 



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

