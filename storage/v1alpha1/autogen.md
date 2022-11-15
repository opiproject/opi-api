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
    - [NullDebugDeleteRequest](#opi_api-storage-v1-NullDebugDeleteRequest)
    - [NullDebugGetRequest](#opi_api-storage-v1-NullDebugGetRequest)
    - [NullDebugListRequest](#opi_api-storage-v1-NullDebugListRequest)
    - [NullDebugListResponse](#opi_api-storage-v1-NullDebugListResponse)
    - [NullDebugStatsRequest](#opi_api-storage-v1-NullDebugStatsRequest)
    - [NullDebugStatsResponse](#opi_api-storage-v1-NullDebugStatsResponse)
    - [NullDebugUpdateRequest](#opi_api-storage-v1-NullDebugUpdateRequest)
  
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
  
- [frontend_nvme_pcie.proto](#frontend_nvme_pcie-proto)
    - [CreateNVMeControllerRequest](#opi_api-storage-v1-CreateNVMeControllerRequest)
    - [CreateNVMeNamespaceRequest](#opi_api-storage-v1-CreateNVMeNamespaceRequest)
    - [CreateNVMeSubsystemRequest](#opi_api-storage-v1-CreateNVMeSubsystemRequest)
    - [DeleteNVMeControllerRequest](#opi_api-storage-v1-DeleteNVMeControllerRequest)
    - [DeleteNVMeNamespaceRequest](#opi_api-storage-v1-DeleteNVMeNamespaceRequest)
    - [DeleteNVMeSubsystemRequest](#opi_api-storage-v1-DeleteNVMeSubsystemRequest)
    - [GetNVMeControllerRequest](#opi_api-storage-v1-GetNVMeControllerRequest)
    - [GetNVMeNamespaceRequest](#opi_api-storage-v1-GetNVMeNamespaceRequest)
    - [GetNVMeSubsystemRequest](#opi_api-storage-v1-GetNVMeSubsystemRequest)
    - [ListNVMeControllerRequest](#opi_api-storage-v1-ListNVMeControllerRequest)
    - [ListNVMeControllerResponse](#opi_api-storage-v1-ListNVMeControllerResponse)
    - [ListNVMeNamespaceRequest](#opi_api-storage-v1-ListNVMeNamespaceRequest)
    - [ListNVMeNamespaceResponse](#opi_api-storage-v1-ListNVMeNamespaceResponse)
    - [ListNVMeSubsystemRequest](#opi_api-storage-v1-ListNVMeSubsystemRequest)
    - [ListNVMeSubsystemResponse](#opi_api-storage-v1-ListNVMeSubsystemResponse)
    - [NVMeController](#opi_api-storage-v1-NVMeController)
    - [NVMeControllerSpec](#opi_api-storage-v1-NVMeControllerSpec)
    - [NVMeControllerStatsRequest](#opi_api-storage-v1-NVMeControllerStatsRequest)
    - [NVMeControllerStatsResponse](#opi_api-storage-v1-NVMeControllerStatsResponse)
    - [NVMeControllerStatus](#opi_api-storage-v1-NVMeControllerStatus)
    - [NVMeNamespace](#opi_api-storage-v1-NVMeNamespace)
    - [NVMeNamespaceSpec](#opi_api-storage-v1-NVMeNamespaceSpec)
    - [NVMeNamespaceStatsRequest](#opi_api-storage-v1-NVMeNamespaceStatsRequest)
    - [NVMeNamespaceStatsResponse](#opi_api-storage-v1-NVMeNamespaceStatsResponse)
    - [NVMeNamespaceStatus](#opi_api-storage-v1-NVMeNamespaceStatus)
    - [NVMeSubsystem](#opi_api-storage-v1-NVMeSubsystem)
    - [NVMeSubsystemSpec](#opi_api-storage-v1-NVMeSubsystemSpec)
    - [NVMeSubsystemStatsRequest](#opi_api-storage-v1-NVMeSubsystemStatsRequest)
    - [NVMeSubsystemStatsResponse](#opi_api-storage-v1-NVMeSubsystemStatsResponse)
    - [NVMeSubsystemStatus](#opi_api-storage-v1-NVMeSubsystemStatus)
    - [UpdateNVMeControllerRequest](#opi_api-storage-v1-UpdateNVMeControllerRequest)
    - [UpdateNVMeNamespaceRequest](#opi_api-storage-v1-UpdateNVMeNamespaceRequest)
    - [UpdateNVMeSubsystemRequest](#opi_api-storage-v1-UpdateNVMeSubsystemRequest)
  
    - [NVMeNamespacePciOperState](#opi_api-storage-v1-NVMeNamespacePciOperState)
    - [NVMeNamespacePciState](#opi_api-storage-v1-NVMeNamespacePciState)
  
    - [FrontendNvmeService](#opi_api-storage-v1-FrontendNvmeService)
  
- [frontend_virtio_blk.proto](#frontend_virtio_blk-proto)
    - [CreateVirtioBlkRequest](#opi_api-storage-v1-CreateVirtioBlkRequest)
    - [DeleteVirtioBlkRequest](#opi_api-storage-v1-DeleteVirtioBlkRequest)
    - [GetVirtioBlkRequest](#opi_api-storage-v1-GetVirtioBlkRequest)
    - [ListVirtioBlkRequest](#opi_api-storage-v1-ListVirtioBlkRequest)
    - [ListVirtioBlkResponse](#opi_api-storage-v1-ListVirtioBlkResponse)
    - [UpdateVirtioBlkRequest](#opi_api-storage-v1-UpdateVirtioBlkRequest)
    - [VirtioBlk](#opi_api-storage-v1-VirtioBlk)
    - [VirtioBlkStatsRequest](#opi_api-storage-v1-VirtioBlkStatsRequest)
    - [VirtioBlkStatsResponse](#opi_api-storage-v1-VirtioBlkStatsResponse)
  
    - [FrontendVirtioBlkService](#opi_api-storage-v1-FrontendVirtioBlkService)
  
- [frontend_virtio_fs.proto](#frontend_virtio_fs-proto)
- [frontend_virtio_scsi.proto](#frontend_virtio_scsi-proto)
    - [CreateVirtioScsiControllerRequest](#opi_api-storage-v1-CreateVirtioScsiControllerRequest)
    - [CreateVirtioScsiLunRequest](#opi_api-storage-v1-CreateVirtioScsiLunRequest)
    - [CreateVirtioScsiTargetRequest](#opi_api-storage-v1-CreateVirtioScsiTargetRequest)
    - [DeleteVirtioScsiControllerRequest](#opi_api-storage-v1-DeleteVirtioScsiControllerRequest)
    - [DeleteVirtioScsiLunRequest](#opi_api-storage-v1-DeleteVirtioScsiLunRequest)
    - [DeleteVirtioScsiTargetRequest](#opi_api-storage-v1-DeleteVirtioScsiTargetRequest)
    - [GetVirtioScsiControllerRequest](#opi_api-storage-v1-GetVirtioScsiControllerRequest)
    - [GetVirtioScsiLunRequest](#opi_api-storage-v1-GetVirtioScsiLunRequest)
    - [GetVirtioScsiTargetRequest](#opi_api-storage-v1-GetVirtioScsiTargetRequest)
    - [ListVirtioScsiControllerRequest](#opi_api-storage-v1-ListVirtioScsiControllerRequest)
    - [ListVirtioScsiControllerResponse](#opi_api-storage-v1-ListVirtioScsiControllerResponse)
    - [ListVirtioScsiLunRequest](#opi_api-storage-v1-ListVirtioScsiLunRequest)
    - [ListVirtioScsiLunResponse](#opi_api-storage-v1-ListVirtioScsiLunResponse)
    - [ListVirtioScsiTargetRequest](#opi_api-storage-v1-ListVirtioScsiTargetRequest)
    - [ListVirtioScsiTargetResponse](#opi_api-storage-v1-ListVirtioScsiTargetResponse)
    - [UpdateVirtioScsiControllerRequest](#opi_api-storage-v1-UpdateVirtioScsiControllerRequest)
    - [UpdateVirtioScsiLunRequest](#opi_api-storage-v1-UpdateVirtioScsiLunRequest)
    - [UpdateVirtioScsiTargetRequest](#opi_api-storage-v1-UpdateVirtioScsiTargetRequest)
    - [VirtioScsiController](#opi_api-storage-v1-VirtioScsiController)
    - [VirtioScsiControllerStatsRequest](#opi_api-storage-v1-VirtioScsiControllerStatsRequest)
    - [VirtioScsiControllerStatsResponse](#opi_api-storage-v1-VirtioScsiControllerStatsResponse)
    - [VirtioScsiLun](#opi_api-storage-v1-VirtioScsiLun)
    - [VirtioScsiLunStatsRequest](#opi_api-storage-v1-VirtioScsiLunStatsRequest)
    - [VirtioScsiLunStatsResponse](#opi_api-storage-v1-VirtioScsiLunStatsResponse)
    - [VirtioScsiTarget](#opi_api-storage-v1-VirtioScsiTarget)
    - [VirtioScsiTargetStatsRequest](#opi_api-storage-v1-VirtioScsiTargetStatsRequest)
    - [VirtioScsiTargetStatsResponse](#opi_api-storage-v1-VirtioScsiTargetStatsResponse)
  
    - [FrontendVirtioScsiService](#opi_api-storage-v1-FrontendVirtioScsiService)
  
- [middleend.proto](#middleend-proto)
    - [CreateCryptoRequest](#opi_api-storage-v1-CreateCryptoRequest)
    - [Crypto](#opi_api-storage-v1-Crypto)
    - [CryptoStatsRequest](#opi_api-storage-v1-CryptoStatsRequest)
    - [CryptoStatsResponse](#opi_api-storage-v1-CryptoStatsResponse)
    - [DeleteCryptoRequest](#opi_api-storage-v1-DeleteCryptoRequest)
    - [GetCryptoRequest](#opi_api-storage-v1-GetCryptoRequest)
    - [ListCryptoRequest](#opi_api-storage-v1-ListCryptoRequest)
    - [ListCryptoResponse](#opi_api-storage-v1-ListCryptoResponse)
    - [UpdateCryptoRequest](#opi_api-storage-v1-UpdateCryptoRequest)
  
    - [MiddleendService](#opi_api-storage-v1-MiddleendService)
  
- [opicommon.proto](#opicommon-proto)
    - [PciEndpoint](#opi_api-storage-v1-PciEndpoint)
  
    - [CryptoType](#opi_api-storage-v1-CryptoType)
  
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
| block_size | [int64](#int64) |  |  |
| blocks_count | [int64](#int64) |  |  |
| uuid | [opi_api.common.v1.Uuid](#opi_api-common-v1-Uuid) |  |  |
| filename | [string](#string) |  |  |






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
Back End (network-facing) APIs. This service is for AIO generic kernel block device.

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
| handle | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |
| block_size | [int64](#int64) |  |  |
| blocks_count | [int64](#int64) |  |  |
| uuid | [opi_api.common.v1.Uuid](#opi_api-common-v1-Uuid) |  |  |






<a name="opi_api-storage-v1-NullDebugCreateRequest"></a>

### NullDebugCreateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| device | [NullDebug](#opi_api-storage-v1-NullDebug) |  |  |






<a name="opi_api-storage-v1-NullDebugDeleteRequest"></a>

### NullDebugDeleteRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| handle | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-NullDebugGetRequest"></a>

### NullDebugGetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| handle | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






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
| handle | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-NullDebugStatsResponse"></a>

### NullDebugStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| handle | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |
| stats | [string](#string) |  |  |






<a name="opi_api-storage-v1-NullDebugUpdateRequest"></a>

### NullDebugUpdateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| device | [NullDebug](#opi_api-storage-v1-NullDebug) |  |  |





 

 

 


<a name="opi_api-storage-v1-NullDebugService"></a>

### NullDebugService
Back End (network-facing) APIs. This is debug interface for null block devices.

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| NullDebugCreate | [NullDebugCreateRequest](#opi_api-storage-v1-NullDebugCreateRequest) | [NullDebug](#opi_api-storage-v1-NullDebug) |  |
| NullDebugDelete | [NullDebugDeleteRequest](#opi_api-storage-v1-NullDebugDeleteRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| NullDebugUpdate | [NullDebugUpdateRequest](#opi_api-storage-v1-NullDebugUpdateRequest) | [NullDebug](#opi_api-storage-v1-NullDebug) |  |
| NullDebugList | [NullDebugListRequest](#opi_api-storage-v1-NullDebugListRequest) | [NullDebugListResponse](#opi_api-storage-v1-NullDebugListResponse) |  |
| NullDebugGet | [NullDebugGetRequest](#opi_api-storage-v1-NullDebugGetRequest) | [NullDebug](#opi_api-storage-v1-NullDebug) |  |
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
| io_queues_count | [int64](#int64) |  |  |
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
| NVME_ADDRESS_FAMILY_UNSPECIFIED | 0 |  |
| NVMF_ADRFAM_IPV4 | 1 |  |
| NVMF_ADRFAM_IPV6 | 2 |  |
| NVMF_ADRFAM_IB | 3 |  |
| NVMF_ADRFAM_FC | 4 |  |
| NVMF_ADRFAM_INTRA_HOST | 5 |  |



<a name="opi_api-storage-v1-NvmeMultipath"></a>

### NvmeMultipath


| Name | Number | Description |
| ---- | ------ | ----------- |
| NVME_MULTIPATH_UNSPECIFIED | 0 |  |
| NVME_MULTIPATH_DISABLE | 1 |  |
| NVME_MULTIPATH_FAILOVER | 2 |  |
| NVME_MULTIPATH_MULTIPATH | 3 |  |



<a name="opi_api-storage-v1-NvmeTransportType"></a>

### NvmeTransportType


| Name | Number | Description |
| ---- | ------ | ----------- |
| NVME_TRANSPORT_TYPE_UNSPECIFIED | 0 |  |
| NVME_TRANSPORT_FC | 1 |  |
| NVME_TRANSPORT_PCIE | 2 |  |
| NVME_TRANSPORT_RDMA | 3 |  |
| NVME_TRANSPORT_TCP | 4 |  |
| NVME_TRANSPORT_CUSTOM | 5 |  |


 

 


<a name="opi_api-storage-v1-NVMfRemoteControllerService"></a>

### NVMfRemoteControllerService
Back End (network-facing) APIs. NVMe/TCP and NVMe/RoCEv2 protocols are covered by this service.

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| NVMfRemoteControllerConnect | [NVMfRemoteControllerConnectRequest](#opi_api-storage-v1-NVMfRemoteControllerConnectRequest) | [NVMfRemoteControllerConnectResponse](#opi_api-storage-v1-NVMfRemoteControllerConnectResponse) |  |
| NVMfRemoteControllerDisconnect | [NVMfRemoteControllerDisconnectRequest](#opi_api-storage-v1-NVMfRemoteControllerDisconnectRequest) | [NVMfRemoteControllerDisconnectResponse](#opi_api-storage-v1-NVMfRemoteControllerDisconnectResponse) |  |
| NVMfRemoteControllerReset | [NVMfRemoteControllerResetRequest](#opi_api-storage-v1-NVMfRemoteControllerResetRequest) | [NVMfRemoteControllerResetResponse](#opi_api-storage-v1-NVMfRemoteControllerResetResponse) |  |
| NVMfRemoteControllerList | [NVMfRemoteControllerListRequest](#opi_api-storage-v1-NVMfRemoteControllerListRequest) | [NVMfRemoteControllerListResponse](#opi_api-storage-v1-NVMfRemoteControllerListResponse) |  |
| NVMfRemoteControllerGet | [NVMfRemoteControllerGetRequest](#opi_api-storage-v1-NVMfRemoteControllerGetRequest) | [NVMfRemoteControllerGetResponse](#opi_api-storage-v1-NVMfRemoteControllerGetResponse) |  |
| NVMfRemoteControllerStats | [NVMfRemoteControllerStatsRequest](#opi_api-storage-v1-NVMfRemoteControllerStatsRequest) | [NVMfRemoteControllerStatsResponse](#opi_api-storage-v1-NVMfRemoteControllerStatsResponse) |  |

 



<a name="frontend_nvme_pcie-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## frontend_nvme_pcie.proto



<a name="opi_api-storage-v1-CreateNVMeControllerRequest"></a>

### CreateNVMeControllerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller | [NVMeController](#opi_api-storage-v1-NVMeController) |  |  |






<a name="opi_api-storage-v1-CreateNVMeNamespaceRequest"></a>

### CreateNVMeNamespaceRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| namespace | [NVMeNamespace](#opi_api-storage-v1-NVMeNamespace) |  |  |






<a name="opi_api-storage-v1-CreateNVMeSubsystemRequest"></a>

### CreateNVMeSubsystemRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| subsystem | [NVMeSubsystem](#opi_api-storage-v1-NVMeSubsystem) |  |  |






<a name="opi_api-storage-v1-DeleteNVMeControllerRequest"></a>

### DeleteNVMeControllerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-DeleteNVMeNamespaceRequest"></a>

### DeleteNVMeNamespaceRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| namespace_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-DeleteNVMeSubsystemRequest"></a>

### DeleteNVMeSubsystemRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| subsystem_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-GetNVMeControllerRequest"></a>

### GetNVMeControllerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-GetNVMeNamespaceRequest"></a>

### GetNVMeNamespaceRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| namespace_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-GetNVMeSubsystemRequest"></a>

### GetNVMeSubsystemRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| subsystem_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-ListNVMeControllerRequest"></a>

### ListNVMeControllerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| subsystem_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |
| page_size | [int32](#int32) |  |  |
| page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListNVMeControllerResponse"></a>

### ListNVMeControllerResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controllers | [NVMeController](#opi_api-storage-v1-NVMeController) | repeated |  |
| next_page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListNVMeNamespaceRequest"></a>

### ListNVMeNamespaceRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| subsystem_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |
| controller_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |
| page_size | [int32](#int32) |  |  |
| page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListNVMeNamespaceResponse"></a>

### ListNVMeNamespaceResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| namespaces | [NVMeNamespace](#opi_api-storage-v1-NVMeNamespace) | repeated |  |
| next_page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListNVMeSubsystemRequest"></a>

### ListNVMeSubsystemRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| page_size | [int32](#int32) |  |  |
| page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListNVMeSubsystemResponse"></a>

### ListNVMeSubsystemResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| subsystems | [NVMeSubsystem](#opi_api-storage-v1-NVMeSubsystem) | repeated |  |
| next_page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-NVMeController"></a>

### NVMeController



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| spec | [NVMeControllerSpec](#opi_api-storage-v1-NVMeControllerSpec) |  |  |
| status | [NVMeControllerStatus](#opi_api-storage-v1-NVMeControllerStatus) |  |  |






<a name="opi_api-storage-v1-NVMeControllerSpec"></a>

### NVMeControllerSpec



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | object&#39;s unique identifier |
| nvme_controller_id | [int32](#int32) |  | subsystem controller id range: 0 to 65535. must not be reused under the same subsystem |
| subsystem_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | subsystem information |
| pcie_id | [PciEndpoint](#opi_api-storage-v1-PciEndpoint) |  | xPU&#39;s PCI ID for the controller |
| max_nsq | [int32](#int32) |  | maximum number of host submission queues allowed. If not set, the xPU will provide a default. |
| max_ncq | [int32](#int32) |  | maximum number of host completion queues allowed. If not set, the xPU will provide a default. |
| sqes | [int32](#int32) |  | maximum number of submission queue entries per submission queue, as a power of 2. default value as per spec is 6 |
| cqes | [int32](#int32) |  | maximum number of completion queue entries per completion queue, as a power of 2. default value as per spec is 4 |
| max_namespaces | [int32](#int32) |  | maximum Number of namespaces that will be provisioned under the controller. |






<a name="opi_api-storage-v1-NVMeControllerStatsRequest"></a>

### NVMeControllerStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-NVMeControllerStatsResponse"></a>

### NVMeControllerStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |
| stats | [string](#string) |  |  |






<a name="opi_api-storage-v1-NVMeControllerStatus"></a>

### NVMeControllerStatus



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| active | [bool](#bool) |  | Device is in use by host nvme driver |






<a name="opi_api-storage-v1-NVMeNamespace"></a>

### NVMeNamespace



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| spec | [NVMeNamespaceSpec](#opi_api-storage-v1-NVMeNamespaceSpec) |  |  |
| status | [NVMeNamespaceStatus](#opi_api-storage-v1-NVMeNamespaceStatus) |  |  |






<a name="opi_api-storage-v1-NVMeNamespaceSpec"></a>

### NVMeNamespaceSpec



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | namespace&#39;s unique key |
| subsystem_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | subsystem for this namespace |
| controller_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | key of the PCIe controller object that will host this namespace. |
| host_nsid | [int32](#int32) |  | NSID present to the host by the NVMe PCIe controller. If not provided, then the controller will assign an unused NSID within the max namespace range - auto assigned nsid may not work for live migration |
| block_size | [int64](#int64) |  | Block size in bytes, must be power of 2 and must be less than the max io size supported. Typically tested values are 512, and 4k. |
| blocks_count | [int64](#int64) |  | Size/Capacity of the namespace in blocks, size in bytes will be BlockSize x NumBlocks. |
| nguid | [string](#string) |  | Globally unique identifier for the namespace |
| eui64 | [int64](#int64) |  | 64bit Extended unique identifier for the namespace mandatory if guid is not specified |
| uuid | [opi_api.common.v1.Uuid](#opi_api-common-v1-Uuid) |  | Globally unique identifier for the namespace |
| volume_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | The back/middle-end volume to back this namespace. |
| optimal_write_size | [int32](#int32) |  | optimal write size hint to host driver. Host IO stack may use this to regulate IO size. Must be a multiple of the preferred write granularity. Must not exceed the controller maximum IO size value configured in the nvme agent config file. |
| pref_write_granularity | [int32](#int32) |  | preferred write granularity hint to the host driver. Host IO stack may use this to align IO sizes to the write granularity for optimum performance. |






<a name="opi_api-storage-v1-NVMeNamespaceStatsRequest"></a>

### NVMeNamespaceStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| namespace_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-NVMeNamespaceStatsResponse"></a>

### NVMeNamespaceStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |
| stats | [string](#string) |  |  |






<a name="opi_api-storage-v1-NVMeNamespaceStatus"></a>

### NVMeNamespaceStatus



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| pci_state | [NVMeNamespacePciState](#opi_api-storage-v1-NVMeNamespacePciState) |  | config state of the namespace object, (enabled, disable, deleting) |
| pci_oper_state | [NVMeNamespacePciOperState](#opi_api-storage-v1-NVMeNamespacePciOperState) |  | Operational state of the namespace object, (connected, disconnected) |






<a name="opi_api-storage-v1-NVMeSubsystem"></a>

### NVMeSubsystem



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| spec | [NVMeSubsystemSpec](#opi_api-storage-v1-NVMeSubsystemSpec) |  |  |
| status | [NVMeSubsystemStatus](#opi_api-storage-v1-NVMeSubsystemStatus) |  |  |






<a name="opi_api-storage-v1-NVMeSubsystemSpec"></a>

### NVMeSubsystemSpec



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | object&#39;s unique identifier |
| nqn | [string](#string) |  | NVMe subsystem NQN to which the controller belongs Refer to the NQN format in the NVMe base specifications, must not exceed &#39;NSV_NVME_SUBSYSTEM_NQN_LEN&#39; bytes |
| serial_number | [string](#string) |  | serial number must not exceed &#39;NSV_CTRLR_SERIAL_NO_LEN&#39; bytes |
| model_number | [string](#string) |  | model number, must not exceed &#39;NSV_CTRLR_MODEL_NO_LEN&#39; bytes |
| max_namespaces | [int64](#int64) |  | maximum namespaces within a subsystem |






<a name="opi_api-storage-v1-NVMeSubsystemStatsRequest"></a>

### NVMeSubsystemStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| subsystem_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-NVMeSubsystemStatsResponse"></a>

### NVMeSubsystemStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| stats | [string](#string) |  |  |






<a name="opi_api-storage-v1-NVMeSubsystemStatus"></a>

### NVMeSubsystemStatus



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| firmware_revision | [string](#string) |  | firmware revision, must not exceed &#39;NSV_CTRLR_FW_REV_LEN&#39; |
| fru_guid | [bytes](#bytes) |  | FRU identfier, 16bytes opaque identity for the type of unit |






<a name="opi_api-storage-v1-UpdateNVMeControllerRequest"></a>

### UpdateNVMeControllerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller | [NVMeController](#opi_api-storage-v1-NVMeController) |  |  |






<a name="opi_api-storage-v1-UpdateNVMeNamespaceRequest"></a>

### UpdateNVMeNamespaceRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| namespace | [NVMeNamespace](#opi_api-storage-v1-NVMeNamespace) |  |  |






<a name="opi_api-storage-v1-UpdateNVMeSubsystemRequest"></a>

### UpdateNVMeSubsystemRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| subsystem | [NVMeSubsystem](#opi_api-storage-v1-NVMeSubsystem) |  |  |





 


<a name="opi_api-storage-v1-NVMeNamespacePciOperState"></a>

### NVMeNamespacePciOperState
Namespace PCIe operational states

| Name | Number | Description |
| ---- | ------ | ----------- |
| NV_ME_NAMESPACE_PCI_OPER_STATE_UNSPECIFIED | 0 | unspecified |
| NVME_NAMESPACE_PCI_OPER_STATE_ONLINE | 1 | namespace is online and operational |
| NVME_NAMESPACE_PCI_OPER_STATE_OFFLINE | 2 | namespace is offline |



<a name="opi_api-storage-v1-NVMeNamespacePciState"></a>

### NVMeNamespacePciState
Namespace  Administrative States

| Name | Number | Description |
| ---- | ------ | ----------- |
| NV_ME_NAMESPACE_PCI_STATE_UNSPECIFIED | 0 | unspecified |
| NVME_NAMESPACE_PCI_STATE_DISABLED | 1 | namespace disabled state |
| NVME_NAMESPACE_PCI_STATE_ENABLED | 2 | namespace enabled state |
| NVME_NAMESPACE_PCI_STATE_DELETING | 3 | namespace being deleted |


 

 


<a name="opi_api-storage-v1-FrontendNvmeService"></a>

### FrontendNvmeService
Front End (host-facing) APIs. Mostly used for NVMe/PCIe emulation and host presentation.

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| CreateNVMeSubsystem | [CreateNVMeSubsystemRequest](#opi_api-storage-v1-CreateNVMeSubsystemRequest) | [NVMeSubsystem](#opi_api-storage-v1-NVMeSubsystem) |  |
| DeleteNVMeSubsystem | [DeleteNVMeSubsystemRequest](#opi_api-storage-v1-DeleteNVMeSubsystemRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateNVMeSubsystem | [UpdateNVMeSubsystemRequest](#opi_api-storage-v1-UpdateNVMeSubsystemRequest) | [NVMeSubsystem](#opi_api-storage-v1-NVMeSubsystem) |  |
| ListNVMeSubsystem | [ListNVMeSubsystemRequest](#opi_api-storage-v1-ListNVMeSubsystemRequest) | [ListNVMeSubsystemResponse](#opi_api-storage-v1-ListNVMeSubsystemResponse) |  |
| GetNVMeSubsystem | [GetNVMeSubsystemRequest](#opi_api-storage-v1-GetNVMeSubsystemRequest) | [NVMeSubsystem](#opi_api-storage-v1-NVMeSubsystem) |  |
| NVMeSubsystemStats | [NVMeSubsystemStatsRequest](#opi_api-storage-v1-NVMeSubsystemStatsRequest) | [NVMeSubsystemStatsResponse](#opi_api-storage-v1-NVMeSubsystemStatsResponse) |  |
| CreateNVMeController | [CreateNVMeControllerRequest](#opi_api-storage-v1-CreateNVMeControllerRequest) | [NVMeController](#opi_api-storage-v1-NVMeController) |  |
| DeleteNVMeController | [DeleteNVMeControllerRequest](#opi_api-storage-v1-DeleteNVMeControllerRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateNVMeController | [UpdateNVMeControllerRequest](#opi_api-storage-v1-UpdateNVMeControllerRequest) | [NVMeController](#opi_api-storage-v1-NVMeController) |  |
| ListNVMeController | [ListNVMeControllerRequest](#opi_api-storage-v1-ListNVMeControllerRequest) | [ListNVMeControllerResponse](#opi_api-storage-v1-ListNVMeControllerResponse) |  |
| GetNVMeController | [GetNVMeControllerRequest](#opi_api-storage-v1-GetNVMeControllerRequest) | [NVMeController](#opi_api-storage-v1-NVMeController) |  |
| NVMeControllerStats | [NVMeControllerStatsRequest](#opi_api-storage-v1-NVMeControllerStatsRequest) | [NVMeControllerStatsResponse](#opi_api-storage-v1-NVMeControllerStatsResponse) |  |
| CreateNVMeNamespace | [CreateNVMeNamespaceRequest](#opi_api-storage-v1-CreateNVMeNamespaceRequest) | [NVMeNamespace](#opi_api-storage-v1-NVMeNamespace) |  |
| DeleteNVMeNamespace | [DeleteNVMeNamespaceRequest](#opi_api-storage-v1-DeleteNVMeNamespaceRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateNVMeNamespace | [UpdateNVMeNamespaceRequest](#opi_api-storage-v1-UpdateNVMeNamespaceRequest) | [NVMeNamespace](#opi_api-storage-v1-NVMeNamespace) |  |
| ListNVMeNamespace | [ListNVMeNamespaceRequest](#opi_api-storage-v1-ListNVMeNamespaceRequest) | [ListNVMeNamespaceResponse](#opi_api-storage-v1-ListNVMeNamespaceResponse) |  |
| GetNVMeNamespace | [GetNVMeNamespaceRequest](#opi_api-storage-v1-GetNVMeNamespaceRequest) | [NVMeNamespace](#opi_api-storage-v1-NVMeNamespace) |  |
| NVMeNamespaceStats | [NVMeNamespaceStatsRequest](#opi_api-storage-v1-NVMeNamespaceStatsRequest) | [NVMeNamespaceStatsResponse](#opi_api-storage-v1-NVMeNamespaceStatsResponse) |  |

 



<a name="frontend_virtio_blk-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## frontend_virtio_blk.proto



<a name="opi_api-storage-v1-CreateVirtioBlkRequest"></a>

### CreateVirtioBlkRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller | [VirtioBlk](#opi_api-storage-v1-VirtioBlk) |  |  |






<a name="opi_api-storage-v1-DeleteVirtioBlkRequest"></a>

### DeleteVirtioBlkRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-GetVirtioBlkRequest"></a>

### GetVirtioBlkRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-ListVirtioBlkRequest"></a>

### ListVirtioBlkRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| page_size | [int32](#int32) |  |  |
| page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListVirtioBlkResponse"></a>

### ListVirtioBlkResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controllers | [VirtioBlk](#opi_api-storage-v1-VirtioBlk) | repeated |  |
| next_page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-UpdateVirtioBlkRequest"></a>

### UpdateVirtioBlkRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller | [VirtioBlk](#opi_api-storage-v1-VirtioBlk) |  |  |






<a name="opi_api-storage-v1-VirtioBlk"></a>

### VirtioBlk



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |
| pcie_id | [PciEndpoint](#opi_api-storage-v1-PciEndpoint) |  | The PCI endpoint where this device should appear |
| volume_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | The back/middle-end volume to back this controller |
| max_io_qps | [int64](#int64) |  |  |






<a name="opi_api-storage-v1-VirtioBlkStatsRequest"></a>

### VirtioBlkStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-VirtioBlkStatsResponse"></a>

### VirtioBlkStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |
| stats | [string](#string) |  |  |





 

 

 


<a name="opi_api-storage-v1-FrontendVirtioBlkService"></a>

### FrontendVirtioBlkService
Front End (host-facing) APIs. Mostly used for Virtio-blk emulation emulation and host presentation as alternative to Nvme.

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| CreateVirtioBlk | [CreateVirtioBlkRequest](#opi_api-storage-v1-CreateVirtioBlkRequest) | [VirtioBlk](#opi_api-storage-v1-VirtioBlk) |  |
| DeleteVirtioBlk | [DeleteVirtioBlkRequest](#opi_api-storage-v1-DeleteVirtioBlkRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateVirtioBlk | [UpdateVirtioBlkRequest](#opi_api-storage-v1-UpdateVirtioBlkRequest) | [VirtioBlk](#opi_api-storage-v1-VirtioBlk) |  |
| ListVirtioBlk | [ListVirtioBlkRequest](#opi_api-storage-v1-ListVirtioBlkRequest) | [ListVirtioBlkResponse](#opi_api-storage-v1-ListVirtioBlkResponse) |  |
| GetVirtioBlk | [GetVirtioBlkRequest](#opi_api-storage-v1-GetVirtioBlkRequest) | [VirtioBlk](#opi_api-storage-v1-VirtioBlk) |  |
| VirtioBlkStats | [VirtioBlkStatsRequest](#opi_api-storage-v1-VirtioBlkStatsRequest) | [VirtioBlkStatsResponse](#opi_api-storage-v1-VirtioBlkStatsResponse) |  |

 



<a name="frontend_virtio_fs-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## frontend_virtio_fs.proto


 

 

 

 



<a name="frontend_virtio_scsi-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## frontend_virtio_scsi.proto



<a name="opi_api-storage-v1-CreateVirtioScsiControllerRequest"></a>

### CreateVirtioScsiControllerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller | [VirtioScsiController](#opi_api-storage-v1-VirtioScsiController) |  |  |






<a name="opi_api-storage-v1-CreateVirtioScsiLunRequest"></a>

### CreateVirtioScsiLunRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| lun | [VirtioScsiLun](#opi_api-storage-v1-VirtioScsiLun) |  |  |






<a name="opi_api-storage-v1-CreateVirtioScsiTargetRequest"></a>

### CreateVirtioScsiTargetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| target | [VirtioScsiTarget](#opi_api-storage-v1-VirtioScsiTarget) |  |  |






<a name="opi_api-storage-v1-DeleteVirtioScsiControllerRequest"></a>

### DeleteVirtioScsiControllerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-DeleteVirtioScsiLunRequest"></a>

### DeleteVirtioScsiLunRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |
| lun_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-DeleteVirtioScsiTargetRequest"></a>

### DeleteVirtioScsiTargetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| target_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-GetVirtioScsiControllerRequest"></a>

### GetVirtioScsiControllerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-GetVirtioScsiLunRequest"></a>

### GetVirtioScsiLunRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |
| lun_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-GetVirtioScsiTargetRequest"></a>

### GetVirtioScsiTargetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| target_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-ListVirtioScsiControllerRequest"></a>

### ListVirtioScsiControllerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| page_size | [int32](#int32) |  |  |
| page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListVirtioScsiControllerResponse"></a>

### ListVirtioScsiControllerResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controllers | [VirtioScsiController](#opi_api-storage-v1-VirtioScsiController) | repeated |  |
| next_page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListVirtioScsiLunRequest"></a>

### ListVirtioScsiLunRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |
| page_size | [int32](#int32) |  |  |
| page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListVirtioScsiLunResponse"></a>

### ListVirtioScsiLunResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| luns | [VirtioScsiLun](#opi_api-storage-v1-VirtioScsiLun) | repeated |  |
| next_page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListVirtioScsiTargetRequest"></a>

### ListVirtioScsiTargetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| page_size | [int32](#int32) |  |  |
| page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListVirtioScsiTargetResponse"></a>

### ListVirtioScsiTargetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| targets | [VirtioScsiTarget](#opi_api-storage-v1-VirtioScsiTarget) | repeated |  |
| next_page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-UpdateVirtioScsiControllerRequest"></a>

### UpdateVirtioScsiControllerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller | [VirtioScsiController](#opi_api-storage-v1-VirtioScsiController) |  |  |






<a name="opi_api-storage-v1-UpdateVirtioScsiLunRequest"></a>

### UpdateVirtioScsiLunRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| lun | [VirtioScsiLun](#opi_api-storage-v1-VirtioScsiLun) |  |  |






<a name="opi_api-storage-v1-UpdateVirtioScsiTargetRequest"></a>

### UpdateVirtioScsiTargetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| target | [VirtioScsiTarget](#opi_api-storage-v1-VirtioScsiTarget) |  |  |






<a name="opi_api-storage-v1-VirtioScsiController"></a>

### VirtioScsiController



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |
| pcie_id | [PciEndpoint](#opi_api-storage-v1-PciEndpoint) |  | xPU&#39;s PCI ID for the controller |






<a name="opi_api-storage-v1-VirtioScsiControllerStatsRequest"></a>

### VirtioScsiControllerStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-VirtioScsiControllerStatsResponse"></a>

### VirtioScsiControllerStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |
| stats | [string](#string) |  |  |






<a name="opi_api-storage-v1-VirtioScsiLun"></a>

### VirtioScsiLun



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |
| target_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | The target that this LUN is in |
| volume_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | The middle/back-end volume for this LLUN |






<a name="opi_api-storage-v1-VirtioScsiLunStatsRequest"></a>

### VirtioScsiLunStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| controller_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |
| lun_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-VirtioScsiLunStatsResponse"></a>

### VirtioScsiLunStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |
| stats | [string](#string) |  |  |






<a name="opi_api-storage-v1-VirtioScsiTarget"></a>

### VirtioScsiTarget



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |
| max_luns | [int32](#int32) |  | maximum LUNs within a target |






<a name="opi_api-storage-v1-VirtioScsiTargetStatsRequest"></a>

### VirtioScsiTargetStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| target_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-VirtioScsiTargetStatsResponse"></a>

### VirtioScsiTargetStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |
| stats | [string](#string) |  |  |





 

 

 


<a name="opi_api-storage-v1-FrontendVirtioScsiService"></a>

### FrontendVirtioScsiService
Front End (host-facing) APIs. Mostly used for Virtio-scsi emulation and host presentation as alternative to Virtio-blk.

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| CreateVirtioScsiTarget | [CreateVirtioScsiTargetRequest](#opi_api-storage-v1-CreateVirtioScsiTargetRequest) | [VirtioScsiTarget](#opi_api-storage-v1-VirtioScsiTarget) |  |
| DeleteVirtioScsiTarget | [DeleteVirtioScsiTargetRequest](#opi_api-storage-v1-DeleteVirtioScsiTargetRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateVirtioScsiTarget | [UpdateVirtioScsiTargetRequest](#opi_api-storage-v1-UpdateVirtioScsiTargetRequest) | [VirtioScsiTarget](#opi_api-storage-v1-VirtioScsiTarget) |  |
| ListVirtioScsiTarget | [ListVirtioScsiTargetRequest](#opi_api-storage-v1-ListVirtioScsiTargetRequest) | [ListVirtioScsiTargetResponse](#opi_api-storage-v1-ListVirtioScsiTargetResponse) |  |
| GetVirtioScsiTarget | [GetVirtioScsiTargetRequest](#opi_api-storage-v1-GetVirtioScsiTargetRequest) | [VirtioScsiTarget](#opi_api-storage-v1-VirtioScsiTarget) |  |
| VirtioScsiTargetStats | [VirtioScsiTargetStatsRequest](#opi_api-storage-v1-VirtioScsiTargetStatsRequest) | [VirtioScsiTargetStatsResponse](#opi_api-storage-v1-VirtioScsiTargetStatsResponse) |  |
| CreateVirtioScsiController | [CreateVirtioScsiControllerRequest](#opi_api-storage-v1-CreateVirtioScsiControllerRequest) | [VirtioScsiController](#opi_api-storage-v1-VirtioScsiController) |  |
| DeleteVirtioScsiController | [DeleteVirtioScsiControllerRequest](#opi_api-storage-v1-DeleteVirtioScsiControllerRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateVirtioScsiController | [UpdateVirtioScsiControllerRequest](#opi_api-storage-v1-UpdateVirtioScsiControllerRequest) | [VirtioScsiController](#opi_api-storage-v1-VirtioScsiController) |  |
| ListVirtioScsiController | [ListVirtioScsiControllerRequest](#opi_api-storage-v1-ListVirtioScsiControllerRequest) | [ListVirtioScsiControllerResponse](#opi_api-storage-v1-ListVirtioScsiControllerResponse) |  |
| GetVirtioScsiController | [GetVirtioScsiControllerRequest](#opi_api-storage-v1-GetVirtioScsiControllerRequest) | [VirtioScsiController](#opi_api-storage-v1-VirtioScsiController) |  |
| VirtioScsiControllerStats | [VirtioScsiControllerStatsRequest](#opi_api-storage-v1-VirtioScsiControllerStatsRequest) | [VirtioScsiControllerStatsResponse](#opi_api-storage-v1-VirtioScsiControllerStatsResponse) |  |
| CreateVirtioScsiLun | [CreateVirtioScsiLunRequest](#opi_api-storage-v1-CreateVirtioScsiLunRequest) | [VirtioScsiLun](#opi_api-storage-v1-VirtioScsiLun) |  |
| DeleteVirtioScsiLun | [DeleteVirtioScsiLunRequest](#opi_api-storage-v1-DeleteVirtioScsiLunRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateVirtioScsiLun | [UpdateVirtioScsiLunRequest](#opi_api-storage-v1-UpdateVirtioScsiLunRequest) | [VirtioScsiLun](#opi_api-storage-v1-VirtioScsiLun) |  |
| ListVirtioScsiLun | [ListVirtioScsiLunRequest](#opi_api-storage-v1-ListVirtioScsiLunRequest) | [ListVirtioScsiLunResponse](#opi_api-storage-v1-ListVirtioScsiLunResponse) |  |
| GetVirtioScsiLun | [GetVirtioScsiLunRequest](#opi_api-storage-v1-GetVirtioScsiLunRequest) | [VirtioScsiLun](#opi_api-storage-v1-VirtioScsiLun) |  |
| VirtioScsiLunStats | [VirtioScsiLunStatsRequest](#opi_api-storage-v1-VirtioScsiLunStatsRequest) | [VirtioScsiLunStatsResponse](#opi_api-storage-v1-VirtioScsiLunStatsResponse) |  |

 



<a name="middleend-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## middleend.proto



<a name="opi_api-storage-v1-CreateCryptoRequest"></a>

### CreateCryptoRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| volume | [Crypto](#opi_api-storage-v1-Crypto) |  |  |






<a name="opi_api-storage-v1-Crypto"></a>

### Crypto



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| crypto_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |
| volume_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | The back/middle-end volume to back this volume |
| key | [bytes](#bytes) |  | Key to be used for encryption |
| cipher | [CryptoType](#opi_api-storage-v1-CryptoType) |  | Cipher to use |






<a name="opi_api-storage-v1-CryptoStatsRequest"></a>

### CryptoStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| crypto_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-CryptoStatsResponse"></a>

### CryptoStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| crypto_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |
| stats | [string](#string) |  |  |






<a name="opi_api-storage-v1-DeleteCryptoRequest"></a>

### DeleteCryptoRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| crypto_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-GetCryptoRequest"></a>

### GetCryptoRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| crypto_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-ListCryptoRequest"></a>

### ListCryptoRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| page_size | [int32](#int32) |  |  |
| page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListCryptoResponse"></a>

### ListCryptoResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| volumes | [Crypto](#opi_api-storage-v1-Crypto) | repeated |  |
| next_page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-UpdateCryptoRequest"></a>

### UpdateCryptoRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| volume | [Crypto](#opi_api-storage-v1-Crypto) |  |  |





 

 

 


<a name="opi_api-storage-v1-MiddleendService"></a>

### MiddleendService
Middle End (Storage Services) APIs. For example, encryption, compression, raid, QoS, multipath, ...

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| CreateCrypto | [CreateCryptoRequest](#opi_api-storage-v1-CreateCryptoRequest) | [Crypto](#opi_api-storage-v1-Crypto) |  |
| DeleteCrypto | [DeleteCryptoRequest](#opi_api-storage-v1-DeleteCryptoRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateCrypto | [UpdateCryptoRequest](#opi_api-storage-v1-UpdateCryptoRequest) | [Crypto](#opi_api-storage-v1-Crypto) |  |
| ListCrypto | [ListCryptoRequest](#opi_api-storage-v1-ListCryptoRequest) | [ListCryptoResponse](#opi_api-storage-v1-ListCryptoResponse) |  |
| GetCrypto | [GetCryptoRequest](#opi_api-storage-v1-GetCryptoRequest) | [Crypto](#opi_api-storage-v1-Crypto) |  |
| CryptoStats | [CryptoStatsRequest](#opi_api-storage-v1-CryptoStatsRequest) | [CryptoStatsResponse](#opi_api-storage-v1-CryptoStatsResponse) |  |

 



<a name="opicommon-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## opicommon.proto



<a name="opi_api-storage-v1-PciEndpoint"></a>

### PciEndpoint
Many front-ends expose PCI devices to the host. This represents that endpoint.
This device will ultimately be surfaced by the operating system at some
Bus:Device:Function, but note that the values set here are not necessarily
the same values that the operating system will choose. Instead, these are
xPU-internal values.
While the term &#34;device&#34; is often used for the entity attached to a PCI slot,
we&#39;ll use the term &#34;port&#34; which also commonly used with PCI switches and avoids
confusion with storage &#34;devices&#34;.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| port_id | [int32](#int32) |  | The &#34;port&#34; or &#34;device&#34;. In other words, the connector/cable that&#39;s plugged into a particular host. This number may end up matching the host-assigned &#34;device&#34; value in the bus:device:function identifier, but it does not strictly have to and that should not be relied upon. |
| physical_function | [int32](#int32) |  | Physical function index. This may end up matching the host-assigned &#34;function&#34; value in the bus:device:function identifier, but it does not strictly have to and that should not be relied upon. |
| virtual_function | [int32](#int32) |  | Virtual function index. This may end up matching the host-assigned &#34;function&#34; value in the bus:device:function identifier, but it does not strictly have to and that should not be relied upon. |





 


<a name="opi_api-storage-v1-CryptoType"></a>

### CryptoType
AES encryption type to be used

| Name | Number | Description |
| ---- | ------ | ----------- |
| CRYPTO_TYPE_UNSPECIFIED | 0 |  |
| CRYPTO_TYPE_AES_CBC_128 | 1 |  |
| CRYPTO_TYPE_AES_CBC_192 | 2 |  |
| CRYPTO_TYPE_AES_CBC_256 | 3 |  |
| CRYPTO_TYPE_AES_XTS_128 | 4 |  |
| CRYPTO_TYPE_AES_XTS_192 | 5 |  |
| CRYPTO_TYPE_AES_XTS_256 | 6 |  |


 

 

 



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

