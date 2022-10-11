# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [backend_aio.proto](#backend_aio-proto)
    - [AioController](#opi_api-storage-v1-AioController)
    - [AioControllerCreateRequest](#opi_api-storage-v1-AioControllerCreateRequest)
    - [AioControllerDeleteRequest](#opi_api-storage-v1-AioControllerDeleteRequest)
    - [AioControllerGetListRequest](#opi_api-storage-v1-AioControllerGetListRequest)
    - [AioControllerGetRequest](#opi_api-storage-v1-AioControllerGetRequest)
    - [AioControllerGetStatsRequest](#opi_api-storage-v1-AioControllerGetStatsRequest)
    - [AioControllerList](#opi_api-storage-v1-AioControllerList)
    - [AioControllerStats](#opi_api-storage-v1-AioControllerStats)
    - [AioControllerStatsRequest](#opi_api-storage-v1-AioControllerStatsRequest)
    - [AioControllerUpdateRequest](#opi_api-storage-v1-AioControllerUpdateRequest)
  
    - [AioControllerService](#opi_api-storage-v1-AioControllerService)
  
- [backend_iscsi.proto](#backend_iscsi-proto)
- [backend_null.proto](#backend_null-proto)
    - [NullDebug](#opi_api-storage-v1-NullDebug)
    - [NullDebugCreateRequest](#opi_api-storage-v1-NullDebugCreateRequest)
    - [NullDebugCreateResponse](#opi_api-storage-v1-NullDebugCreateResponse)
    - [NullDebugDeleteRequest](#opi_api-storage-v1-NullDebugDeleteRequest)
    - [NullDebugDeleteResponse](#opi_api-storage-v1-NullDebugDeleteResponse)
    - [NullDebugGetRequest](#opi_api-storage-v1-NullDebugGetRequest)
    - [NullDebugGetResponse](#opi_api-storage-v1-NullDebugGetResponse)
    - [NullDebugListRequest](#opi_api-storage-v1-NullDebugListRequest)
    - [NullDebugListResponse](#opi_api-storage-v1-NullDebugListResponse)
    - [NullDebugStatsRequest](#opi_api-storage-v1-NullDebugStatsRequest)
    - [NullDebugStatsResponse](#opi_api-storage-v1-NullDebugStatsResponse)
    - [NullDebugUpdateRequest](#opi_api-storage-v1-NullDebugUpdateRequest)
    - [NullDebugUpdateResponse](#opi_api-storage-v1-NullDebugUpdateResponse)
  
    - [NullDebugService](#opi_api-storage-v1-NullDebugService)
  
- [backend_nvme_pcie.proto](#backend_nvme_pcie-proto)
- [backend_nvme_tcp.proto](#backend_nvme_tcp-proto)
    - [NVMfRemoteController](#opi_api-storage-v1-NVMfRemoteController)
    - [NVMfRemoteControllerConnectRequest](#opi_api-storage-v1-NVMfRemoteControllerConnectRequest)
    - [NVMfRemoteControllerConnectResponse](#opi_api-storage-v1-NVMfRemoteControllerConnectResponse)
    - [NVMfRemoteControllerDisconnectRequest](#opi_api-storage-v1-NVMfRemoteControllerDisconnectRequest)
    - [NVMfRemoteControllerDisconnectResponse](#opi_api-storage-v1-NVMfRemoteControllerDisconnectResponse)
    - [NVMfRemoteControllerGetRequest](#opi_api-storage-v1-NVMfRemoteControllerGetRequest)
    - [NVMfRemoteControllerGetResponse](#opi_api-storage-v1-NVMfRemoteControllerGetResponse)
    - [NVMfRemoteControllerListRequest](#opi_api-storage-v1-NVMfRemoteControllerListRequest)
    - [NVMfRemoteControllerListResponse](#opi_api-storage-v1-NVMfRemoteControllerListResponse)
    - [NVMfRemoteControllerResetRequest](#opi_api-storage-v1-NVMfRemoteControllerResetRequest)
    - [NVMfRemoteControllerResetResponse](#opi_api-storage-v1-NVMfRemoteControllerResetResponse)
    - [NVMfRemoteControllerStatsRequest](#opi_api-storage-v1-NVMfRemoteControllerStatsRequest)
    - [NVMfRemoteControllerStatsResponse](#opi_api-storage-v1-NVMfRemoteControllerStatsResponse)
  
    - [NvmeAddressFamily](#opi_api-storage-v1-NvmeAddressFamily)
    - [NvmeMultipath](#opi_api-storage-v1-NvmeMultipath)
    - [NvmeTransportType](#opi_api-storage-v1-NvmeTransportType)
  
    - [NVMfRemoteControllerService](#opi_api-storage-v1-NVMfRemoteControllerService)
  
- [common.proto](#common-proto)
    - [NvmeControllerPciId](#opi_api-storage-v1-NvmeControllerPciId)
  
- [frontend_nvme_pcie.proto](#frontend_nvme_pcie-proto)
    - [NVMeController](#opi_api-storage-v1-NVMeController)
    - [NVMeControllerCreateRequest](#opi_api-storage-v1-NVMeControllerCreateRequest)
    - [NVMeControllerCreateResponse](#opi_api-storage-v1-NVMeControllerCreateResponse)
    - [NVMeControllerDeleteRequest](#opi_api-storage-v1-NVMeControllerDeleteRequest)
    - [NVMeControllerDeleteResponse](#opi_api-storage-v1-NVMeControllerDeleteResponse)
    - [NVMeControllerGetRequest](#opi_api-storage-v1-NVMeControllerGetRequest)
    - [NVMeControllerGetResponse](#opi_api-storage-v1-NVMeControllerGetResponse)
    - [NVMeControllerListRequest](#opi_api-storage-v1-NVMeControllerListRequest)
    - [NVMeControllerListResponse](#opi_api-storage-v1-NVMeControllerListResponse)
    - [NVMeControllerStatsRequest](#opi_api-storage-v1-NVMeControllerStatsRequest)
    - [NVMeControllerStatsResponse](#opi_api-storage-v1-NVMeControllerStatsResponse)
    - [NVMeControllerUpdateRequest](#opi_api-storage-v1-NVMeControllerUpdateRequest)
    - [NVMeControllerUpdateResponse](#opi_api-storage-v1-NVMeControllerUpdateResponse)
    - [NVMeNamespace](#opi_api-storage-v1-NVMeNamespace)
    - [NVMeNamespaceCreateRequest](#opi_api-storage-v1-NVMeNamespaceCreateRequest)
    - [NVMeNamespaceCreateResponse](#opi_api-storage-v1-NVMeNamespaceCreateResponse)
    - [NVMeNamespaceDeleteRequest](#opi_api-storage-v1-NVMeNamespaceDeleteRequest)
    - [NVMeNamespaceDeleteResponse](#opi_api-storage-v1-NVMeNamespaceDeleteResponse)
    - [NVMeNamespaceGetRequest](#opi_api-storage-v1-NVMeNamespaceGetRequest)
    - [NVMeNamespaceGetResponse](#opi_api-storage-v1-NVMeNamespaceGetResponse)
    - [NVMeNamespaceListRequest](#opi_api-storage-v1-NVMeNamespaceListRequest)
    - [NVMeNamespaceListResponse](#opi_api-storage-v1-NVMeNamespaceListResponse)
    - [NVMeNamespaceStatsRequest](#opi_api-storage-v1-NVMeNamespaceStatsRequest)
    - [NVMeNamespaceStatsResponse](#opi_api-storage-v1-NVMeNamespaceStatsResponse)
    - [NVMeNamespaceUpdateRequest](#opi_api-storage-v1-NVMeNamespaceUpdateRequest)
    - [NVMeNamespaceUpdateResponse](#opi_api-storage-v1-NVMeNamespaceUpdateResponse)
    - [NVMeSubsystem](#opi_api-storage-v1-NVMeSubsystem)
    - [NVMeSubsystemCreateRequest](#opi_api-storage-v1-NVMeSubsystemCreateRequest)
    - [NVMeSubsystemCreateResponse](#opi_api-storage-v1-NVMeSubsystemCreateResponse)
    - [NVMeSubsystemDeleteRequest](#opi_api-storage-v1-NVMeSubsystemDeleteRequest)
    - [NVMeSubsystemDeleteResponse](#opi_api-storage-v1-NVMeSubsystemDeleteResponse)
    - [NVMeSubsystemGetRequest](#opi_api-storage-v1-NVMeSubsystemGetRequest)
    - [NVMeSubsystemGetResponse](#opi_api-storage-v1-NVMeSubsystemGetResponse)
    - [NVMeSubsystemListRequest](#opi_api-storage-v1-NVMeSubsystemListRequest)
    - [NVMeSubsystemListResponse](#opi_api-storage-v1-NVMeSubsystemListResponse)
    - [NVMeSubsystemStatsRequest](#opi_api-storage-v1-NVMeSubsystemStatsRequest)
    - [NVMeSubsystemStatsResponse](#opi_api-storage-v1-NVMeSubsystemStatsResponse)
    - [NVMeSubsystemUpdateRequest](#opi_api-storage-v1-NVMeSubsystemUpdateRequest)
    - [NVMeSubsystemUpdateResponse](#opi_api-storage-v1-NVMeSubsystemUpdateResponse)
  
    - [NVMeControllerService](#opi_api-storage-v1-NVMeControllerService)
    - [NVMeNamespaceService](#opi_api-storage-v1-NVMeNamespaceService)
    - [NVMeSubsystemService](#opi_api-storage-v1-NVMeSubsystemService)
  
- [frontend_virtio_blk.proto](#frontend_virtio_blk-proto)
    - [VirtioBlk](#opi_api-storage-v1-VirtioBlk)
    - [VirtioBlkCreateRequest](#opi_api-storage-v1-VirtioBlkCreateRequest)
    - [VirtioBlkCreateResponse](#opi_api-storage-v1-VirtioBlkCreateResponse)
    - [VirtioBlkDeleteRequest](#opi_api-storage-v1-VirtioBlkDeleteRequest)
    - [VirtioBlkDeleteResponse](#opi_api-storage-v1-VirtioBlkDeleteResponse)
    - [VirtioBlkGetRequest](#opi_api-storage-v1-VirtioBlkGetRequest)
    - [VirtioBlkGetResponse](#opi_api-storage-v1-VirtioBlkGetResponse)
    - [VirtioBlkListRequest](#opi_api-storage-v1-VirtioBlkListRequest)
    - [VirtioBlkListResponse](#opi_api-storage-v1-VirtioBlkListResponse)
    - [VirtioBlkStatsRequest](#opi_api-storage-v1-VirtioBlkStatsRequest)
    - [VirtioBlkStatsResponse](#opi_api-storage-v1-VirtioBlkStatsResponse)
    - [VirtioBlkUpdateRequest](#opi_api-storage-v1-VirtioBlkUpdateRequest)
    - [VirtioBlkUpdateResponse](#opi_api-storage-v1-VirtioBlkUpdateResponse)
  
    - [VirtioBlkService](#opi_api-storage-v1-VirtioBlkService)
  
- [frontend_virtio_fs.proto](#frontend_virtio_fs-proto)
- [frontend_virtio_scsi.proto](#frontend_virtio_scsi-proto)
    - [VirtioScsiController](#opi_api-storage-v1-VirtioScsiController)
    - [VirtioScsiControllerCreateRequest](#opi_api-storage-v1-VirtioScsiControllerCreateRequest)
    - [VirtioScsiControllerCreateResponse](#opi_api-storage-v1-VirtioScsiControllerCreateResponse)
    - [VirtioScsiControllerDeleteRequest](#opi_api-storage-v1-VirtioScsiControllerDeleteRequest)
    - [VirtioScsiControllerDeleteResponse](#opi_api-storage-v1-VirtioScsiControllerDeleteResponse)
    - [VirtioScsiControllerGetRequest](#opi_api-storage-v1-VirtioScsiControllerGetRequest)
    - [VirtioScsiControllerGetResponse](#opi_api-storage-v1-VirtioScsiControllerGetResponse)
    - [VirtioScsiControllerListRequest](#opi_api-storage-v1-VirtioScsiControllerListRequest)
    - [VirtioScsiControllerListResponse](#opi_api-storage-v1-VirtioScsiControllerListResponse)
    - [VirtioScsiControllerStatsRequest](#opi_api-storage-v1-VirtioScsiControllerStatsRequest)
    - [VirtioScsiControllerStatsResponse](#opi_api-storage-v1-VirtioScsiControllerStatsResponse)
    - [VirtioScsiControllerUpdateRequest](#opi_api-storage-v1-VirtioScsiControllerUpdateRequest)
    - [VirtioScsiControllerUpdateResponse](#opi_api-storage-v1-VirtioScsiControllerUpdateResponse)
    - [VirtioScsiLun](#opi_api-storage-v1-VirtioScsiLun)
    - [VirtioScsiLunCreateRequest](#opi_api-storage-v1-VirtioScsiLunCreateRequest)
    - [VirtioScsiLunCreateResponse](#opi_api-storage-v1-VirtioScsiLunCreateResponse)
    - [VirtioScsiLunDeleteRequest](#opi_api-storage-v1-VirtioScsiLunDeleteRequest)
    - [VirtioScsiLunDeleteResponse](#opi_api-storage-v1-VirtioScsiLunDeleteResponse)
    - [VirtioScsiLunGetRequest](#opi_api-storage-v1-VirtioScsiLunGetRequest)
    - [VirtioScsiLunGetResponse](#opi_api-storage-v1-VirtioScsiLunGetResponse)
    - [VirtioScsiLunListRequest](#opi_api-storage-v1-VirtioScsiLunListRequest)
    - [VirtioScsiLunListResponse](#opi_api-storage-v1-VirtioScsiLunListResponse)
    - [VirtioScsiLunStatsRequest](#opi_api-storage-v1-VirtioScsiLunStatsRequest)
    - [VirtioScsiLunStatsResponse](#opi_api-storage-v1-VirtioScsiLunStatsResponse)
    - [VirtioScsiLunUpdateRequest](#opi_api-storage-v1-VirtioScsiLunUpdateRequest)
    - [VirtioScsiLunUpdateResponse](#opi_api-storage-v1-VirtioScsiLunUpdateResponse)
  
    - [VirtioScsiControllerService](#opi_api-storage-v1-VirtioScsiControllerService)
    - [VirtioScsiLunService](#opi_api-storage-v1-VirtioScsiLunService)
  
- [middleend.proto](#middleend-proto)
- [object_key.proto](#object_key-proto)
    - [ObjectKey](#opi_api-common-v1-ObjectKey)
  
- [uuid.proto](#uuid-proto)
    - [Uuid](#opi_api-common-v1-Uuid)
  
- [Scalar Value Types](#scalar-value-types)



<a name="backend_aio-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## backend_aio.proto



<a name="opi_api-storage-v1-AioController"></a>

### AioController



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| handle | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | handle is an opaque object handle that is not user settable. handle will be returned with created object |
| id | [int64](#int64) |  |  |
| name | [string](#string) |  |  |
| block_size | [int64](#int64) |  |  |
| num_blocks | [int64](#int64) |  |  |
| uuid | [opi_api.common.v1.Uuid](#opi_api-common-v1-Uuid) |  |  |






<a name="opi_api-storage-v1-AioControllerCreateRequest"></a>

### AioControllerCreateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| device | [AioController](#opi_api-storage-v1-AioController) |  |  |






<a name="opi_api-storage-v1-AioControllerDeleteRequest"></a>

### AioControllerDeleteRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| handle | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-AioControllerGetListRequest"></a>

### AioControllerGetListRequest
Intentionally empty






<a name="opi_api-storage-v1-AioControllerGetRequest"></a>

### AioControllerGetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| handle | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-AioControllerGetStatsRequest"></a>

### AioControllerGetStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| handle | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-AioControllerList"></a>

### AioControllerList



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| device | [AioController](#opi_api-storage-v1-AioController) | repeated |  |






<a name="opi_api-storage-v1-AioControllerStats"></a>

### AioControllerStats



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| handle | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |
| stats | [string](#string) |  |  |






<a name="opi_api-storage-v1-AioControllerStatsRequest"></a>

### AioControllerStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| handle | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-AioControllerUpdateRequest"></a>

### AioControllerUpdateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| device | [AioController](#opi_api-storage-v1-AioController) |  |  |





 

 

 


<a name="opi_api-storage-v1-AioControllerService"></a>

### AioControllerService


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| AioControllerCreate | [AioControllerCreateRequest](#opi_api-storage-v1-AioControllerCreateRequest) | [AioController](#opi_api-storage-v1-AioController) |  |
| AioControllerDelete | [AioControllerDeleteRequest](#opi_api-storage-v1-AioControllerDeleteRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| AioControllerGet | [AioControllerGetRequest](#opi_api-storage-v1-AioControllerGetRequest) | [AioController](#opi_api-storage-v1-AioController) |  |
| AioControllerGetList | [AioControllerGetListRequest](#opi_api-storage-v1-AioControllerGetListRequest) | [AioControllerList](#opi_api-storage-v1-AioControllerList) |  |
| AioControllerGetStats | [AioControllerGetStatsRequest](#opi_api-storage-v1-AioControllerGetStatsRequest) | [AioControllerStats](#opi_api-storage-v1-AioControllerStats) |  |
| AioControllerUpdate | [AioControllerUpdateRequest](#opi_api-storage-v1-AioControllerUpdateRequest) | [AioController](#opi_api-storage-v1-AioController) |  |

 



<a name="backend_iscsi-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## backend_iscsi.proto


 

 

 

 



<a name="backend_null-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## backend_null.proto



<a name="opi_api-storage-v1-NullDebug"></a>

### NullDebug



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |
| name | [string](#string) |  |  |
| block_size | [int64](#int64) |  |  |
| num_blocks | [int64](#int64) |  |  |
| uuid | [opi_api.common.v1.Uuid](#opi_api-common-v1-Uuid) |  |  |






<a name="opi_api-storage-v1-NullDebugCreateRequest"></a>

### NullDebugCreateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| device | [NullDebug](#opi_api-storage-v1-NullDebug) |  |  |






<a name="opi_api-storage-v1-NullDebugCreateResponse"></a>

### NullDebugCreateResponse
Intentionally empty.






<a name="opi_api-storage-v1-NullDebugDeleteRequest"></a>

### NullDebugDeleteRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-NullDebugDeleteResponse"></a>

### NullDebugDeleteResponse
Intentionally empty.






<a name="opi_api-storage-v1-NullDebugGetRequest"></a>

### NullDebugGetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-NullDebugGetResponse"></a>

### NullDebugGetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| device | [NullDebug](#opi_api-storage-v1-NullDebug) |  |  |






<a name="opi_api-storage-v1-NullDebugListRequest"></a>

### NullDebugListRequest
Intentionally empty.






<a name="opi_api-storage-v1-NullDebugListResponse"></a>

### NullDebugListResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| device | [NullDebug](#opi_api-storage-v1-NullDebug) | repeated |  |






<a name="opi_api-storage-v1-NullDebugStatsRequest"></a>

### NullDebugStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-NullDebugStatsResponse"></a>

### NullDebugStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |
| stats | [string](#string) |  |  |






<a name="opi_api-storage-v1-NullDebugUpdateRequest"></a>

### NullDebugUpdateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| device | [NullDebug](#opi_api-storage-v1-NullDebug) |  |  |






<a name="opi_api-storage-v1-NullDebugUpdateResponse"></a>

### NullDebugUpdateResponse
Intentionally empty.





 

 

 


<a name="opi_api-storage-v1-NullDebugService"></a>

### NullDebugService


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| NullDebugCreate | [NullDebugCreateRequest](#opi_api-storage-v1-NullDebugCreateRequest) | [NullDebugCreateResponse](#opi_api-storage-v1-NullDebugCreateResponse) |  |
| NullDebugDelete | [NullDebugDeleteRequest](#opi_api-storage-v1-NullDebugDeleteRequest) | [NullDebugDeleteResponse](#opi_api-storage-v1-NullDebugDeleteResponse) |  |
| NullDebugUpdate | [NullDebugUpdateRequest](#opi_api-storage-v1-NullDebugUpdateRequest) | [NullDebugUpdateResponse](#opi_api-storage-v1-NullDebugUpdateResponse) |  |
| NullDebugList | [NullDebugListRequest](#opi_api-storage-v1-NullDebugListRequest) | [NullDebugListResponse](#opi_api-storage-v1-NullDebugListResponse) |  |
| NullDebugGet | [NullDebugGetRequest](#opi_api-storage-v1-NullDebugGetRequest) | [NullDebugGetResponse](#opi_api-storage-v1-NullDebugGetResponse) |  |
| NullDebugStats | [NullDebugStatsRequest](#opi_api-storage-v1-NullDebugStatsRequest) | [NullDebugStatsResponse](#opi_api-storage-v1-NullDebugStatsResponse) |  |

 



<a name="backend_nvme_pcie-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## backend_nvme_pcie.proto


 

 

 

 



<a name="backend_nvme_tcp-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## backend_nvme_tcp.proto



<a name="opi_api-storage-v1-NVMfRemoteController"></a>

### NVMfRemoteController



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |
| trtype | [NvmeTransportType](#opi_api-storage-v1-NvmeTransportType) |  |  |
| adrfam | [NvmeAddressFamily](#opi_api-storage-v1-NvmeAddressFamily) |  |  |
| traddr | [string](#string) |  |  |
| trsvcid | [int64](#int64) |  |  |
| subnqn | [string](#string) |  |  |
| hdgst | [bool](#bool) |  |  |
| ddgst | [bool](#bool) |  |  |
| multipath | [NvmeMultipath](#opi_api-storage-v1-NvmeMultipath) |  |  |
| num_io_queues | [int64](#int64) |  |  |
| queue_size | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-NVMfRemoteControllerConnectRequest"></a>

### NVMfRemoteControllerConnectRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| ctrl | [NVMfRemoteController](#opi_api-storage-v1-NVMfRemoteController) |  |  |






<a name="opi_api-storage-v1-NVMfRemoteControllerConnectResponse"></a>

### NVMfRemoteControllerConnectResponse
Intentionally empty.






<a name="opi_api-storage-v1-NVMfRemoteControllerDisconnectRequest"></a>

### NVMfRemoteControllerDisconnectRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-NVMfRemoteControllerDisconnectResponse"></a>

### NVMfRemoteControllerDisconnectResponse
Intentionally empty.






<a name="opi_api-storage-v1-NVMfRemoteControllerGetRequest"></a>

### NVMfRemoteControllerGetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-NVMfRemoteControllerGetResponse"></a>

### NVMfRemoteControllerGetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| ctrl | [NVMfRemoteController](#opi_api-storage-v1-NVMfRemoteController) |  |  |






<a name="opi_api-storage-v1-NVMfRemoteControllerListRequest"></a>

### NVMfRemoteControllerListRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-NVMfRemoteControllerListResponse"></a>

### NVMfRemoteControllerListResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| ctrl | [NVMfRemoteController](#opi_api-storage-v1-NVMfRemoteController) | repeated |  |






<a name="opi_api-storage-v1-NVMfRemoteControllerResetRequest"></a>

### NVMfRemoteControllerResetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-NVMfRemoteControllerResetResponse"></a>

### NVMfRemoteControllerResetResponse
Intentionally empty.






<a name="opi_api-storage-v1-NVMfRemoteControllerStatsRequest"></a>

### NVMfRemoteControllerStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-NVMfRemoteControllerStatsResponse"></a>

### NVMfRemoteControllerStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |
| stats | [string](#string) |  |  |





 


<a name="opi_api-storage-v1-NvmeAddressFamily"></a>

### NvmeAddressFamily


| Name | Number | Description |
| ---- | ------ | ----------- |
| NVMF_ADRFAM_IPV4 | 0 |  |
| NVMF_ADRFAM_IPV6 | 1 |  |
| NVMF_ADRFAM_IB | 2 |  |
| NVMF_ADRFAM_FC | 3 |  |
| NVMF_ADRFAM_INTRA_HOST | 4 |  |



<a name="opi_api-storage-v1-NvmeMultipath"></a>

### NvmeMultipath


| Name | Number | Description |
| ---- | ------ | ----------- |
| NVME_MPIO_DISABLE | 0 |  |
| NVME_MPIO_FAILOVER | 1 |  |
| NVME_MPIO_MULTIPATH | 2 |  |



<a name="opi_api-storage-v1-NvmeTransportType"></a>

### NvmeTransportType


| Name | Number | Description |
| ---- | ------ | ----------- |
| NVME_TRANSPORT_FC | 0 |  |
| NVME_TRANSPORT_PCIE | 1 |  |
| NVME_TRANSPORT_RDMA | 2 |  |
| NVME_TRANSPORT_TCP | 3 |  |
| NVME_TRANSPORT_CUSTOM | 4 |  |


 

 


<a name="opi_api-storage-v1-NVMfRemoteControllerService"></a>

### NVMfRemoteControllerService


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| NVMfRemoteControllerConnect | [NVMfRemoteControllerConnectRequest](#opi_api-storage-v1-NVMfRemoteControllerConnectRequest) | [NVMfRemoteControllerConnectResponse](#opi_api-storage-v1-NVMfRemoteControllerConnectResponse) |  |
| NVMfRemoteControllerDisconnect | [NVMfRemoteControllerDisconnectRequest](#opi_api-storage-v1-NVMfRemoteControllerDisconnectRequest) | [NVMfRemoteControllerDisconnectResponse](#opi_api-storage-v1-NVMfRemoteControllerDisconnectResponse) |  |
| NVMfRemoteControllerReset | [NVMfRemoteControllerResetRequest](#opi_api-storage-v1-NVMfRemoteControllerResetRequest) | [NVMfRemoteControllerResetResponse](#opi_api-storage-v1-NVMfRemoteControllerResetResponse) |  |
| NVMfRemoteControllerList | [NVMfRemoteControllerListRequest](#opi_api-storage-v1-NVMfRemoteControllerListRequest) | [NVMfRemoteControllerListResponse](#opi_api-storage-v1-NVMfRemoteControllerListResponse) |  |
| NVMfRemoteControllerGet | [NVMfRemoteControllerGetRequest](#opi_api-storage-v1-NVMfRemoteControllerGetRequest) | [NVMfRemoteControllerGetResponse](#opi_api-storage-v1-NVMfRemoteControllerGetResponse) |  |
| NVMfRemoteControllerStats | [NVMfRemoteControllerStatsRequest](#opi_api-storage-v1-NVMfRemoteControllerStatsRequest) | [NVMfRemoteControllerStatsResponse](#opi_api-storage-v1-NVMfRemoteControllerStatsResponse) |  |

 



<a name="common-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## common.proto



<a name="opi_api-storage-v1-NvmeControllerPciId"></a>

### NvmeControllerPciId
The controller PCI-ID is used to address a given virtual controller. Virtual
controllers are organized into devices with Physical functions and SRIOV
virtual function within the physical functions. Currently, xPUs may
expose multiple devices with one physical function each and one or more
virtual functions under the physical function.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| bus | [uint32](#uint32) |  | Bus number, provided for future usage if needed. Currently set to ’0’ |
| device | [uint32](#uint32) |  | Device number, based on the NVMe device layout |
| function | [uint32](#uint32) |  | Physical function, always set to 0 in current model |
| virtual_function | [uint32](#uint32) |  | SRIOV Virtual function within the Device and Physical function. Set to 0 for Physical Function. Virtual Function numbering starts from 1 |





 

 

 

 



<a name="frontend_nvme_pcie-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## frontend_nvme_pcie.proto



<a name="opi_api-storage-v1-NVMeController"></a>

### NVMeController



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |
| name | [string](#string) |  |  |
| subsystem_id | [string](#string) |  |  |
| pcie_id | [NvmeControllerPciId](#opi_api-storage-v1-NvmeControllerPciId) |  |  |
| max_io_qps | [int64](#int64) |  |  |
| max_ns | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-NVMeControllerCreateRequest"></a>

### NVMeControllerCreateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller | [NVMeController](#opi_api-storage-v1-NVMeController) |  |  |






<a name="opi_api-storage-v1-NVMeControllerCreateResponse"></a>

### NVMeControllerCreateResponse
Intentionally empty.






<a name="opi_api-storage-v1-NVMeControllerDeleteRequest"></a>

### NVMeControllerDeleteRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| subsystem_id | [int64](#int64) |  |  |
| controller_id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-NVMeControllerDeleteResponse"></a>

### NVMeControllerDeleteResponse
Intentionally empty.






<a name="opi_api-storage-v1-NVMeControllerGetRequest"></a>

### NVMeControllerGetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| subsystem_id | [int64](#int64) |  |  |
| controller_id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-NVMeControllerGetResponse"></a>

### NVMeControllerGetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller | [NVMeController](#opi_api-storage-v1-NVMeController) |  |  |






<a name="opi_api-storage-v1-NVMeControllerListRequest"></a>

### NVMeControllerListRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| subsystem_id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-NVMeControllerListResponse"></a>

### NVMeControllerListResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller | [NVMeController](#opi_api-storage-v1-NVMeController) | repeated |  |






<a name="opi_api-storage-v1-NVMeControllerStatsRequest"></a>

### NVMeControllerStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| subsystem_id | [int64](#int64) |  |  |
| controller_id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-NVMeControllerStatsResponse"></a>

### NVMeControllerStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |
| stats | [string](#string) |  |  |






<a name="opi_api-storage-v1-NVMeControllerUpdateRequest"></a>

### NVMeControllerUpdateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller | [NVMeController](#opi_api-storage-v1-NVMeController) |  |  |






<a name="opi_api-storage-v1-NVMeControllerUpdateResponse"></a>

### NVMeControllerUpdateResponse
Intentionally empty.






<a name="opi_api-storage-v1-NVMeNamespace"></a>

### NVMeNamespace



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |
| name | [string](#string) |  |  |
| subsystem_id | [string](#string) |  |  |
| controller_id | [int64](#int64) |  |  |
| nsid | [int64](#int64) |  |  |
| bdev | [string](#string) |  |  |
| block_size | [int64](#int64) |  |  |
| num_blocks | [int64](#int64) |  |  |
| nguid | [string](#string) |  |  |
| eui64 | [string](#string) |  |  |
| uuid | [opi_api.common.v1.Uuid](#opi_api-common-v1-Uuid) |  |  |
| multipath | [string](#string) |  |  |
| authentication | [string](#string) |  |  |






<a name="opi_api-storage-v1-NVMeNamespaceCreateRequest"></a>

### NVMeNamespaceCreateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| namespace | [NVMeNamespace](#opi_api-storage-v1-NVMeNamespace) |  |  |






<a name="opi_api-storage-v1-NVMeNamespaceCreateResponse"></a>

### NVMeNamespaceCreateResponse
Intentionally empty.






<a name="opi_api-storage-v1-NVMeNamespaceDeleteRequest"></a>

### NVMeNamespaceDeleteRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| subsystem_id | [int64](#int64) |  |  |
| controller_id | [int64](#int64) |  |  |
| namespace_id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-NVMeNamespaceDeleteResponse"></a>

### NVMeNamespaceDeleteResponse
Intentionally empty.






<a name="opi_api-storage-v1-NVMeNamespaceGetRequest"></a>

### NVMeNamespaceGetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| subsystem_id | [int64](#int64) |  |  |
| controller_id | [int64](#int64) |  |  |
| namespace_id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-NVMeNamespaceGetResponse"></a>

### NVMeNamespaceGetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| namespace | [NVMeNamespace](#opi_api-storage-v1-NVMeNamespace) |  |  |






<a name="opi_api-storage-v1-NVMeNamespaceListRequest"></a>

### NVMeNamespaceListRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| subsystem_id | [int64](#int64) |  |  |
| controller_id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-NVMeNamespaceListResponse"></a>

### NVMeNamespaceListResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| namespace | [NVMeNamespace](#opi_api-storage-v1-NVMeNamespace) | repeated |  |






<a name="opi_api-storage-v1-NVMeNamespaceStatsRequest"></a>

### NVMeNamespaceStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| subsystem_id | [int64](#int64) |  |  |
| controller_id | [int64](#int64) |  |  |
| namespace_id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-NVMeNamespaceStatsResponse"></a>

### NVMeNamespaceStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |
| stats | [string](#string) |  |  |






<a name="opi_api-storage-v1-NVMeNamespaceUpdateRequest"></a>

### NVMeNamespaceUpdateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| namespace | [NVMeNamespace](#opi_api-storage-v1-NVMeNamespace) |  |  |






<a name="opi_api-storage-v1-NVMeNamespaceUpdateResponse"></a>

### NVMeNamespaceUpdateResponse
Intentionally empty.






<a name="opi_api-storage-v1-NVMeSubsystem"></a>

### NVMeSubsystem



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nqn | [string](#string) |  |  |
| serial_number | [string](#string) |  |  |
| model_number | [string](#string) |  |  |
| max_ns | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-NVMeSubsystemCreateRequest"></a>

### NVMeSubsystemCreateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| subsystem | [NVMeSubsystem](#opi_api-storage-v1-NVMeSubsystem) |  |  |






<a name="opi_api-storage-v1-NVMeSubsystemCreateResponse"></a>

### NVMeSubsystemCreateResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| uuid | [opi_api.common.v1.Uuid](#opi_api-common-v1-Uuid) |  |  |






<a name="opi_api-storage-v1-NVMeSubsystemDeleteRequest"></a>

### NVMeSubsystemDeleteRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nqn | [string](#string) |  |  |






<a name="opi_api-storage-v1-NVMeSubsystemDeleteResponse"></a>

### NVMeSubsystemDeleteResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| result | [uint32](#uint32) |  |  |






<a name="opi_api-storage-v1-NVMeSubsystemGetRequest"></a>

### NVMeSubsystemGetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nqn | [string](#string) |  |  |






<a name="opi_api-storage-v1-NVMeSubsystemGetResponse"></a>

### NVMeSubsystemGetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| subsystem | [NVMeSubsystem](#opi_api-storage-v1-NVMeSubsystem) |  |  |






<a name="opi_api-storage-v1-NVMeSubsystemListRequest"></a>

### NVMeSubsystemListRequest
Intentionally empty.






<a name="opi_api-storage-v1-NVMeSubsystemListResponse"></a>

### NVMeSubsystemListResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| subsystem | [NVMeSubsystem](#opi_api-storage-v1-NVMeSubsystem) | repeated |  |






<a name="opi_api-storage-v1-NVMeSubsystemStatsRequest"></a>

### NVMeSubsystemStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nqn | [string](#string) |  |  |






<a name="opi_api-storage-v1-NVMeSubsystemStatsResponse"></a>

### NVMeSubsystemStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| stats | [string](#string) |  |  |






<a name="opi_api-storage-v1-NVMeSubsystemUpdateRequest"></a>

### NVMeSubsystemUpdateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| subsystem | [NVMeSubsystem](#opi_api-storage-v1-NVMeSubsystem) |  |  |






<a name="opi_api-storage-v1-NVMeSubsystemUpdateResponse"></a>

### NVMeSubsystemUpdateResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| result | [uint32](#uint32) |  |  |





 

 

 


<a name="opi_api-storage-v1-NVMeControllerService"></a>

### NVMeControllerService


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| NVMeControllerCreate | [NVMeControllerCreateRequest](#opi_api-storage-v1-NVMeControllerCreateRequest) | [NVMeControllerCreateResponse](#opi_api-storage-v1-NVMeControllerCreateResponse) |  |
| NVMeControllerDelete | [NVMeControllerDeleteRequest](#opi_api-storage-v1-NVMeControllerDeleteRequest) | [NVMeControllerDeleteResponse](#opi_api-storage-v1-NVMeControllerDeleteResponse) |  |
| NVMeControllerUpdate | [NVMeControllerUpdateRequest](#opi_api-storage-v1-NVMeControllerUpdateRequest) | [NVMeControllerUpdateResponse](#opi_api-storage-v1-NVMeControllerUpdateResponse) |  |
| NVMeControllerList | [NVMeControllerListRequest](#opi_api-storage-v1-NVMeControllerListRequest) | [NVMeControllerListResponse](#opi_api-storage-v1-NVMeControllerListResponse) |  |
| NVMeControllerGet | [NVMeControllerGetRequest](#opi_api-storage-v1-NVMeControllerGetRequest) | [NVMeControllerGetResponse](#opi_api-storage-v1-NVMeControllerGetResponse) |  |
| NVMeControllerStats | [NVMeControllerStatsRequest](#opi_api-storage-v1-NVMeControllerStatsRequest) | [NVMeControllerStatsResponse](#opi_api-storage-v1-NVMeControllerStatsResponse) |  |


<a name="opi_api-storage-v1-NVMeNamespaceService"></a>

### NVMeNamespaceService


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| NVMeNamespaceCreate | [NVMeNamespaceCreateRequest](#opi_api-storage-v1-NVMeNamespaceCreateRequest) | [NVMeNamespaceCreateResponse](#opi_api-storage-v1-NVMeNamespaceCreateResponse) |  |
| NVMeNamespaceDelete | [NVMeNamespaceDeleteRequest](#opi_api-storage-v1-NVMeNamespaceDeleteRequest) | [NVMeNamespaceDeleteResponse](#opi_api-storage-v1-NVMeNamespaceDeleteResponse) |  |
| NVMeNamespaceUpdate | [NVMeNamespaceUpdateRequest](#opi_api-storage-v1-NVMeNamespaceUpdateRequest) | [NVMeNamespaceUpdateResponse](#opi_api-storage-v1-NVMeNamespaceUpdateResponse) |  |
| NVMeNamespaceList | [NVMeNamespaceListRequest](#opi_api-storage-v1-NVMeNamespaceListRequest) | [NVMeNamespaceListResponse](#opi_api-storage-v1-NVMeNamespaceListResponse) |  |
| NVMeNamespaceGet | [NVMeNamespaceGetRequest](#opi_api-storage-v1-NVMeNamespaceGetRequest) | [NVMeNamespaceGetResponse](#opi_api-storage-v1-NVMeNamespaceGetResponse) |  |
| NVMeNamespaceStats | [NVMeNamespaceStatsRequest](#opi_api-storage-v1-NVMeNamespaceStatsRequest) | [NVMeNamespaceStatsResponse](#opi_api-storage-v1-NVMeNamespaceStatsResponse) |  |


<a name="opi_api-storage-v1-NVMeSubsystemService"></a>

### NVMeSubsystemService


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| NVMeSubsystemCreate | [NVMeSubsystemCreateRequest](#opi_api-storage-v1-NVMeSubsystemCreateRequest) | [NVMeSubsystemCreateResponse](#opi_api-storage-v1-NVMeSubsystemCreateResponse) |  |
| NVMeSubsystemDelete | [NVMeSubsystemDeleteRequest](#opi_api-storage-v1-NVMeSubsystemDeleteRequest) | [NVMeSubsystemDeleteResponse](#opi_api-storage-v1-NVMeSubsystemDeleteResponse) |  |
| NVMeSubsystemUpdate | [NVMeSubsystemUpdateRequest](#opi_api-storage-v1-NVMeSubsystemUpdateRequest) | [NVMeSubsystemUpdateResponse](#opi_api-storage-v1-NVMeSubsystemUpdateResponse) |  |
| NVMeSubsystemList | [NVMeSubsystemListRequest](#opi_api-storage-v1-NVMeSubsystemListRequest) | [NVMeSubsystemListResponse](#opi_api-storage-v1-NVMeSubsystemListResponse) |  |
| NVMeSubsystemGet | [NVMeSubsystemGetRequest](#opi_api-storage-v1-NVMeSubsystemGetRequest) | [NVMeSubsystemGetResponse](#opi_api-storage-v1-NVMeSubsystemGetResponse) |  |
| NVMeSubsystemStats | [NVMeSubsystemStatsRequest](#opi_api-storage-v1-NVMeSubsystemStatsRequest) | [NVMeSubsystemStatsResponse](#opi_api-storage-v1-NVMeSubsystemStatsResponse) |  |

 



<a name="frontend_virtio_blk-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## frontend_virtio_blk.proto



<a name="opi_api-storage-v1-VirtioBlk"></a>

### VirtioBlk



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |
| name | [string](#string) |  |  |
| pcie_id | [NvmeControllerPciId](#opi_api-storage-v1-NvmeControllerPciId) |  |  |
| bdev | [string](#string) |  |  |
| max_io_qps | [int64](#int64) |  |  |
| serial_number | [string](#string) |  |  |






<a name="opi_api-storage-v1-VirtioBlkCreateRequest"></a>

### VirtioBlkCreateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller | [VirtioBlk](#opi_api-storage-v1-VirtioBlk) |  |  |






<a name="opi_api-storage-v1-VirtioBlkCreateResponse"></a>

### VirtioBlkCreateResponse
Intentionally empty.






<a name="opi_api-storage-v1-VirtioBlkDeleteRequest"></a>

### VirtioBlkDeleteRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller_id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-VirtioBlkDeleteResponse"></a>

### VirtioBlkDeleteResponse
Intentionally empty.






<a name="opi_api-storage-v1-VirtioBlkGetRequest"></a>

### VirtioBlkGetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller_id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-VirtioBlkGetResponse"></a>

### VirtioBlkGetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller | [VirtioBlk](#opi_api-storage-v1-VirtioBlk) |  |  |






<a name="opi_api-storage-v1-VirtioBlkListRequest"></a>

### VirtioBlkListRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| subsystem_id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-VirtioBlkListResponse"></a>

### VirtioBlkListResponse







<a name="opi_api-storage-v1-VirtioBlkStatsRequest"></a>

### VirtioBlkStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller_id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-VirtioBlkStatsResponse"></a>

### VirtioBlkStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |
| stats | [string](#string) |  |  |






<a name="opi_api-storage-v1-VirtioBlkUpdateRequest"></a>

### VirtioBlkUpdateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller | [VirtioBlk](#opi_api-storage-v1-VirtioBlk) |  |  |






<a name="opi_api-storage-v1-VirtioBlkUpdateResponse"></a>

### VirtioBlkUpdateResponse
Intentionally empty.





 

 

 


<a name="opi_api-storage-v1-VirtioBlkService"></a>

### VirtioBlkService


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| VirtioBlkCreate | [VirtioBlkCreateRequest](#opi_api-storage-v1-VirtioBlkCreateRequest) | [VirtioBlkCreateResponse](#opi_api-storage-v1-VirtioBlkCreateResponse) |  |
| VirtioBlkDelete | [VirtioBlkDeleteRequest](#opi_api-storage-v1-VirtioBlkDeleteRequest) | [VirtioBlkDeleteResponse](#opi_api-storage-v1-VirtioBlkDeleteResponse) |  |
| VirtioBlkUpdate | [VirtioBlkUpdateRequest](#opi_api-storage-v1-VirtioBlkUpdateRequest) | [VirtioBlkUpdateResponse](#opi_api-storage-v1-VirtioBlkUpdateResponse) |  |
| VirtioBlkList | [VirtioBlkListRequest](#opi_api-storage-v1-VirtioBlkListRequest) | [VirtioBlkListResponse](#opi_api-storage-v1-VirtioBlkListResponse) |  |
| VirtioBlkGet | [VirtioBlkGetRequest](#opi_api-storage-v1-VirtioBlkGetRequest) | [VirtioBlkGetResponse](#opi_api-storage-v1-VirtioBlkGetResponse) |  |
| VirtioBlkStats | [VirtioBlkStatsRequest](#opi_api-storage-v1-VirtioBlkStatsRequest) | [VirtioBlkStatsResponse](#opi_api-storage-v1-VirtioBlkStatsResponse) |  |

 



<a name="frontend_virtio_fs-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## frontend_virtio_fs.proto


 

 

 

 



<a name="frontend_virtio_scsi-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## frontend_virtio_scsi.proto



<a name="opi_api-storage-v1-VirtioScsiController"></a>

### VirtioScsiController



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |
| name | [string](#string) |  |  |
| pcie_id | [NvmeControllerPciId](#opi_api-storage-v1-NvmeControllerPciId) |  |  |






<a name="opi_api-storage-v1-VirtioScsiControllerCreateRequest"></a>

### VirtioScsiControllerCreateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller | [VirtioScsiController](#opi_api-storage-v1-VirtioScsiController) |  |  |






<a name="opi_api-storage-v1-VirtioScsiControllerCreateResponse"></a>

### VirtioScsiControllerCreateResponse
Intentionally empty.






<a name="opi_api-storage-v1-VirtioScsiControllerDeleteRequest"></a>

### VirtioScsiControllerDeleteRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller_id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-VirtioScsiControllerDeleteResponse"></a>

### VirtioScsiControllerDeleteResponse
Intentionally empty.






<a name="opi_api-storage-v1-VirtioScsiControllerGetRequest"></a>

### VirtioScsiControllerGetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller_id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-VirtioScsiControllerGetResponse"></a>

### VirtioScsiControllerGetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller | [VirtioScsiController](#opi_api-storage-v1-VirtioScsiController) |  |  |






<a name="opi_api-storage-v1-VirtioScsiControllerListRequest"></a>

### VirtioScsiControllerListRequest
Intentionally empty.






<a name="opi_api-storage-v1-VirtioScsiControllerListResponse"></a>

### VirtioScsiControllerListResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller | [VirtioScsiController](#opi_api-storage-v1-VirtioScsiController) | repeated |  |






<a name="opi_api-storage-v1-VirtioScsiControllerStatsRequest"></a>

### VirtioScsiControllerStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller_id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-VirtioScsiControllerStatsResponse"></a>

### VirtioScsiControllerStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |
| stats | [string](#string) |  |  |






<a name="opi_api-storage-v1-VirtioScsiControllerUpdateRequest"></a>

### VirtioScsiControllerUpdateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller | [VirtioScsiController](#opi_api-storage-v1-VirtioScsiController) |  |  |






<a name="opi_api-storage-v1-VirtioScsiControllerUpdateResponse"></a>

### VirtioScsiControllerUpdateResponse
Intentionally empty.






<a name="opi_api-storage-v1-VirtioScsiLun"></a>

### VirtioScsiLun



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |
| controller_id | [int64](#int64) |  |  |
| bdev | [string](#string) |  |  |






<a name="opi_api-storage-v1-VirtioScsiLunCreateRequest"></a>

### VirtioScsiLunCreateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| lun | [VirtioScsiLun](#opi_api-storage-v1-VirtioScsiLun) |  |  |






<a name="opi_api-storage-v1-VirtioScsiLunCreateResponse"></a>

### VirtioScsiLunCreateResponse
Intentionally empty.






<a name="opi_api-storage-v1-VirtioScsiLunDeleteRequest"></a>

### VirtioScsiLunDeleteRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller_id | [int64](#int64) |  |  |
| lun_id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-VirtioScsiLunDeleteResponse"></a>

### VirtioScsiLunDeleteResponse
Intentionally empty.






<a name="opi_api-storage-v1-VirtioScsiLunGetRequest"></a>

### VirtioScsiLunGetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller_id | [int64](#int64) |  |  |
| lun_id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-VirtioScsiLunGetResponse"></a>

### VirtioScsiLunGetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| lun | [VirtioScsiLun](#opi_api-storage-v1-VirtioScsiLun) |  |  |






<a name="opi_api-storage-v1-VirtioScsiLunListRequest"></a>

### VirtioScsiLunListRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller_id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-VirtioScsiLunListResponse"></a>

### VirtioScsiLunListResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| lun | [VirtioScsiLun](#opi_api-storage-v1-VirtioScsiLun) | repeated |  |






<a name="opi_api-storage-v1-VirtioScsiLunStatsRequest"></a>

### VirtioScsiLunStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller_id | [int64](#int64) |  |  |
| lun_id | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-VirtioScsiLunStatsResponse"></a>

### VirtioScsiLunStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int64](#int64) |  |  |
| stats | [string](#string) |  |  |






<a name="opi_api-storage-v1-VirtioScsiLunUpdateRequest"></a>

### VirtioScsiLunUpdateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| lun | [VirtioScsiLun](#opi_api-storage-v1-VirtioScsiLun) |  |  |






<a name="opi_api-storage-v1-VirtioScsiLunUpdateResponse"></a>

### VirtioScsiLunUpdateResponse
Intentionally empty.





 

 

 


<a name="opi_api-storage-v1-VirtioScsiControllerService"></a>

### VirtioScsiControllerService


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| VirtioScsiControllerCreate | [VirtioScsiControllerCreateRequest](#opi_api-storage-v1-VirtioScsiControllerCreateRequest) | [VirtioScsiControllerCreateResponse](#opi_api-storage-v1-VirtioScsiControllerCreateResponse) |  |
| VirtioScsiControllerDelete | [VirtioScsiControllerDeleteRequest](#opi_api-storage-v1-VirtioScsiControllerDeleteRequest) | [VirtioScsiControllerDeleteResponse](#opi_api-storage-v1-VirtioScsiControllerDeleteResponse) |  |
| VirtioScsiControllerUpdate | [VirtioScsiControllerUpdateRequest](#opi_api-storage-v1-VirtioScsiControllerUpdateRequest) | [VirtioScsiControllerUpdateResponse](#opi_api-storage-v1-VirtioScsiControllerUpdateResponse) |  |
| VirtioScsiControllerList | [VirtioScsiControllerListRequest](#opi_api-storage-v1-VirtioScsiControllerListRequest) | [VirtioScsiControllerListResponse](#opi_api-storage-v1-VirtioScsiControllerListResponse) |  |
| VirtioScsiControllerGet | [VirtioScsiControllerGetRequest](#opi_api-storage-v1-VirtioScsiControllerGetRequest) | [VirtioScsiControllerGetResponse](#opi_api-storage-v1-VirtioScsiControllerGetResponse) |  |
| VirtioScsiControllerStats | [VirtioScsiControllerStatsRequest](#opi_api-storage-v1-VirtioScsiControllerStatsRequest) | [VirtioScsiControllerStatsResponse](#opi_api-storage-v1-VirtioScsiControllerStatsResponse) |  |


<a name="opi_api-storage-v1-VirtioScsiLunService"></a>

### VirtioScsiLunService


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| VirtioScsiLunCreate | [VirtioScsiLunCreateRequest](#opi_api-storage-v1-VirtioScsiLunCreateRequest) | [VirtioScsiLunCreateResponse](#opi_api-storage-v1-VirtioScsiLunCreateResponse) |  |
| VirtioScsiLunDelete | [VirtioScsiLunDeleteRequest](#opi_api-storage-v1-VirtioScsiLunDeleteRequest) | [VirtioScsiLunDeleteResponse](#opi_api-storage-v1-VirtioScsiLunDeleteResponse) |  |
| VirtioScsiLunUpdate | [VirtioScsiLunUpdateRequest](#opi_api-storage-v1-VirtioScsiLunUpdateRequest) | [VirtioScsiLunUpdateResponse](#opi_api-storage-v1-VirtioScsiLunUpdateResponse) |  |
| VirtioScsiLunList | [VirtioScsiLunListRequest](#opi_api-storage-v1-VirtioScsiLunListRequest) | [VirtioScsiLunListResponse](#opi_api-storage-v1-VirtioScsiLunListResponse) |  |
| VirtioScsiLunGet | [VirtioScsiLunGetRequest](#opi_api-storage-v1-VirtioScsiLunGetRequest) | [VirtioScsiLunGetResponse](#opi_api-storage-v1-VirtioScsiLunGetResponse) |  |
| VirtioScsiLunStats | [VirtioScsiLunStatsRequest](#opi_api-storage-v1-VirtioScsiLunStatsRequest) | [VirtioScsiLunStatsResponse](#opi_api-storage-v1-VirtioScsiLunStatsResponse) |  |

 



<a name="middleend-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## middleend.proto


 

 

 

 



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

