# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [backend_aio.proto](#backend_aio-proto)
    - [AioVolume](#opi_api-storage-v1-AioVolume)
    - [AioVolumeStatsRequest](#opi_api-storage-v1-AioVolumeStatsRequest)
    - [AioVolumeStatsResponse](#opi_api-storage-v1-AioVolumeStatsResponse)
    - [CreateAioVolumeRequest](#opi_api-storage-v1-CreateAioVolumeRequest)
    - [DeleteAioVolumeRequest](#opi_api-storage-v1-DeleteAioVolumeRequest)
    - [GetAioVolumeRequest](#opi_api-storage-v1-GetAioVolumeRequest)
    - [ListAioVolumesRequest](#opi_api-storage-v1-ListAioVolumesRequest)
    - [ListAioVolumesResponse](#opi_api-storage-v1-ListAioVolumesResponse)
    - [UpdateAioVolumeRequest](#opi_api-storage-v1-UpdateAioVolumeRequest)
  
    - [AioVolumeService](#opi_api-storage-v1-AioVolumeService)
  
- [backend_iscsi.proto](#backend_iscsi-proto)
- [backend_null.proto](#backend_null-proto)
    - [CreateNullVolumeRequest](#opi_api-storage-v1-CreateNullVolumeRequest)
    - [DeleteNullVolumeRequest](#opi_api-storage-v1-DeleteNullVolumeRequest)
    - [GetNullVolumeRequest](#opi_api-storage-v1-GetNullVolumeRequest)
    - [ListNullVolumesRequest](#opi_api-storage-v1-ListNullVolumesRequest)
    - [ListNullVolumesResponse](#opi_api-storage-v1-ListNullVolumesResponse)
    - [NullVolume](#opi_api-storage-v1-NullVolume)
    - [NullVolumeStatsRequest](#opi_api-storage-v1-NullVolumeStatsRequest)
    - [NullVolumeStatsResponse](#opi_api-storage-v1-NullVolumeStatsResponse)
    - [UpdateNullVolumeRequest](#opi_api-storage-v1-UpdateNullVolumeRequest)
  
    - [NullVolumeService](#opi_api-storage-v1-NullVolumeService)
  
- [backend_nvme_pcie.proto](#backend_nvme_pcie-proto)
- [backend_nvme_tcp.proto](#backend_nvme_tcp-proto)
    - [CreateNvmePathRequest](#opi_api-storage-v1-CreateNvmePathRequest)
    - [CreateNvmeRemoteControllerRequest](#opi_api-storage-v1-CreateNvmeRemoteControllerRequest)
    - [DeleteNvmePathRequest](#opi_api-storage-v1-DeleteNvmePathRequest)
    - [DeleteNvmeRemoteControllerRequest](#opi_api-storage-v1-DeleteNvmeRemoteControllerRequest)
    - [GetNvmePathRequest](#opi_api-storage-v1-GetNvmePathRequest)
    - [GetNvmeRemoteControllerRequest](#opi_api-storage-v1-GetNvmeRemoteControllerRequest)
    - [ListNvmePathsRequest](#opi_api-storage-v1-ListNvmePathsRequest)
    - [ListNvmePathsResponse](#opi_api-storage-v1-ListNvmePathsResponse)
    - [ListNvmeRemoteControllersRequest](#opi_api-storage-v1-ListNvmeRemoteControllersRequest)
    - [ListNvmeRemoteControllersResponse](#opi_api-storage-v1-ListNvmeRemoteControllersResponse)
    - [ListNvmeRemoteNamespacesRequest](#opi_api-storage-v1-ListNvmeRemoteNamespacesRequest)
    - [ListNvmeRemoteNamespacesResponse](#opi_api-storage-v1-ListNvmeRemoteNamespacesResponse)
    - [NvmePath](#opi_api-storage-v1-NvmePath)
    - [NvmePathStatsRequest](#opi_api-storage-v1-NvmePathStatsRequest)
    - [NvmePathStatsResponse](#opi_api-storage-v1-NvmePathStatsResponse)
    - [NvmeRemoteController](#opi_api-storage-v1-NvmeRemoteController)
    - [NvmeRemoteControllerResetRequest](#opi_api-storage-v1-NvmeRemoteControllerResetRequest)
    - [NvmeRemoteControllerStatsRequest](#opi_api-storage-v1-NvmeRemoteControllerStatsRequest)
    - [NvmeRemoteControllerStatsResponse](#opi_api-storage-v1-NvmeRemoteControllerStatsResponse)
    - [NvmeRemoteNamespace](#opi_api-storage-v1-NvmeRemoteNamespace)
    - [UpdateNvmePathRequest](#opi_api-storage-v1-UpdateNvmePathRequest)
    - [UpdateNvmeRemoteControllerRequest](#opi_api-storage-v1-UpdateNvmeRemoteControllerRequest)
  
    - [NvmeAddressFamily](#opi_api-storage-v1-NvmeAddressFamily)
    - [NvmeMultipath](#opi_api-storage-v1-NvmeMultipath)
    - [NvmeTransportType](#opi_api-storage-v1-NvmeTransportType)
  
    - [NvmeRemoteControllerService](#opi_api-storage-v1-NvmeRemoteControllerService)
  
- [frontend_nvme_pcie.proto](#frontend_nvme_pcie-proto)
    - [CreateNvmeControllerRequest](#opi_api-storage-v1-CreateNvmeControllerRequest)
    - [CreateNvmeNamespaceRequest](#opi_api-storage-v1-CreateNvmeNamespaceRequest)
    - [CreateNvmeSubsystemRequest](#opi_api-storage-v1-CreateNvmeSubsystemRequest)
    - [DeleteNvmeControllerRequest](#opi_api-storage-v1-DeleteNvmeControllerRequest)
    - [DeleteNvmeNamespaceRequest](#opi_api-storage-v1-DeleteNvmeNamespaceRequest)
    - [DeleteNvmeSubsystemRequest](#opi_api-storage-v1-DeleteNvmeSubsystemRequest)
    - [GetNvmeControllerRequest](#opi_api-storage-v1-GetNvmeControllerRequest)
    - [GetNvmeNamespaceRequest](#opi_api-storage-v1-GetNvmeNamespaceRequest)
    - [GetNvmeSubsystemRequest](#opi_api-storage-v1-GetNvmeSubsystemRequest)
    - [ListNvmeControllersRequest](#opi_api-storage-v1-ListNvmeControllersRequest)
    - [ListNvmeControllersResponse](#opi_api-storage-v1-ListNvmeControllersResponse)
    - [ListNvmeNamespacesRequest](#opi_api-storage-v1-ListNvmeNamespacesRequest)
    - [ListNvmeNamespacesResponse](#opi_api-storage-v1-ListNvmeNamespacesResponse)
    - [ListNvmeSubsystemsRequest](#opi_api-storage-v1-ListNvmeSubsystemsRequest)
    - [ListNvmeSubsystemsResponse](#opi_api-storage-v1-ListNvmeSubsystemsResponse)
    - [NvmeController](#opi_api-storage-v1-NvmeController)
    - [NvmeControllerSpec](#opi_api-storage-v1-NvmeControllerSpec)
    - [NvmeControllerStatsRequest](#opi_api-storage-v1-NvmeControllerStatsRequest)
    - [NvmeControllerStatsResponse](#opi_api-storage-v1-NvmeControllerStatsResponse)
    - [NvmeControllerStatus](#opi_api-storage-v1-NvmeControllerStatus)
    - [NvmeNamespace](#opi_api-storage-v1-NvmeNamespace)
    - [NvmeNamespaceSpec](#opi_api-storage-v1-NvmeNamespaceSpec)
    - [NvmeNamespaceStatsRequest](#opi_api-storage-v1-NvmeNamespaceStatsRequest)
    - [NvmeNamespaceStatsResponse](#opi_api-storage-v1-NvmeNamespaceStatsResponse)
    - [NvmeNamespaceStatus](#opi_api-storage-v1-NvmeNamespaceStatus)
    - [NvmeSubsystem](#opi_api-storage-v1-NvmeSubsystem)
    - [NvmeSubsystemSpec](#opi_api-storage-v1-NvmeSubsystemSpec)
    - [NvmeSubsystemStatsRequest](#opi_api-storage-v1-NvmeSubsystemStatsRequest)
    - [NvmeSubsystemStatsResponse](#opi_api-storage-v1-NvmeSubsystemStatsResponse)
    - [NvmeSubsystemStatus](#opi_api-storage-v1-NvmeSubsystemStatus)
    - [UpdateNvmeControllerRequest](#opi_api-storage-v1-UpdateNvmeControllerRequest)
    - [UpdateNvmeNamespaceRequest](#opi_api-storage-v1-UpdateNvmeNamespaceRequest)
    - [UpdateNvmeSubsystemRequest](#opi_api-storage-v1-UpdateNvmeSubsystemRequest)
  
    - [NvmeNamespacePciOperState](#opi_api-storage-v1-NvmeNamespacePciOperState)
    - [NvmeNamespacePciState](#opi_api-storage-v1-NvmeNamespacePciState)
  
    - [FrontendNvmeService](#opi_api-storage-v1-FrontendNvmeService)
  
- [frontend_virtio_blk.proto](#frontend_virtio_blk-proto)
    - [CreateVirtioBlkRequest](#opi_api-storage-v1-CreateVirtioBlkRequest)
    - [DeleteVirtioBlkRequest](#opi_api-storage-v1-DeleteVirtioBlkRequest)
    - [GetVirtioBlkRequest](#opi_api-storage-v1-GetVirtioBlkRequest)
    - [ListVirtioBlksRequest](#opi_api-storage-v1-ListVirtioBlksRequest)
    - [ListVirtioBlksResponse](#opi_api-storage-v1-ListVirtioBlksResponse)
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
    - [ListVirtioScsiControllersRequest](#opi_api-storage-v1-ListVirtioScsiControllersRequest)
    - [ListVirtioScsiControllersResponse](#opi_api-storage-v1-ListVirtioScsiControllersResponse)
    - [ListVirtioScsiLunsRequest](#opi_api-storage-v1-ListVirtioScsiLunsRequest)
    - [ListVirtioScsiLunsResponse](#opi_api-storage-v1-ListVirtioScsiLunsResponse)
    - [ListVirtioScsiTargetsRequest](#opi_api-storage-v1-ListVirtioScsiTargetsRequest)
    - [ListVirtioScsiTargetsResponse](#opi_api-storage-v1-ListVirtioScsiTargetsResponse)
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
  
- [middleend_encryption.proto](#middleend_encryption-proto)
    - [CreateEncryptedVolumeRequest](#opi_api-storage-v1-CreateEncryptedVolumeRequest)
    - [DeleteEncryptedVolumeRequest](#opi_api-storage-v1-DeleteEncryptedVolumeRequest)
    - [EncryptedVolume](#opi_api-storage-v1-EncryptedVolume)
    - [EncryptedVolumeStatsRequest](#opi_api-storage-v1-EncryptedVolumeStatsRequest)
    - [EncryptedVolumeStatsResponse](#opi_api-storage-v1-EncryptedVolumeStatsResponse)
    - [GetEncryptedVolumeRequest](#opi_api-storage-v1-GetEncryptedVolumeRequest)
    - [ListEncryptedVolumesRequest](#opi_api-storage-v1-ListEncryptedVolumesRequest)
    - [ListEncryptedVolumesResponse](#opi_api-storage-v1-ListEncryptedVolumesResponse)
    - [UpdateEncryptedVolumeRequest](#opi_api-storage-v1-UpdateEncryptedVolumeRequest)
  
    - [MiddleendEncryptionService](#opi_api-storage-v1-MiddleendEncryptionService)
  
- [middleend_qos_volume.proto](#middleend_qos_volume-proto)
    - [CreateQosVolumeRequest](#opi_api-storage-v1-CreateQosVolumeRequest)
    - [DeleteQosVolumeRequest](#opi_api-storage-v1-DeleteQosVolumeRequest)
    - [GetQosVolumeRequest](#opi_api-storage-v1-GetQosVolumeRequest)
    - [ListQosVolumesRequest](#opi_api-storage-v1-ListQosVolumesRequest)
    - [ListQosVolumesResponse](#opi_api-storage-v1-ListQosVolumesResponse)
    - [QosVolume](#opi_api-storage-v1-QosVolume)
    - [QosVolumeStatsRequest](#opi_api-storage-v1-QosVolumeStatsRequest)
    - [QosVolumeStatsResponse](#opi_api-storage-v1-QosVolumeStatsResponse)
    - [UpdateQosVolumeRequest](#opi_api-storage-v1-UpdateQosVolumeRequest)
  
    - [MiddleendQosVolumeService](#opi_api-storage-v1-MiddleendQosVolumeService)
  
- [opicommon.proto](#opicommon-proto)
    - [PciEndpoint](#opi_api-storage-v1-PciEndpoint)
    - [QosLimit](#opi_api-storage-v1-QosLimit)
    - [VolumeStats](#opi_api-storage-v1-VolumeStats)
  
    - [EncryptionType](#opi_api-storage-v1-EncryptionType)
  
- [inventory.proto](#inventory-proto)
    - [BIOSInfo](#opi_api-inventory-v1-BIOSInfo)
    - [BaseboardInfo](#opi_api-inventory-v1-BaseboardInfo)
    - [CPUInfo](#opi_api-inventory-v1-CPUInfo)
    - [ChassisInfo](#opi_api-inventory-v1-ChassisInfo)
    - [GetInventoryRequest](#opi_api-inventory-v1-GetInventoryRequest)
    - [Inventory](#opi_api-inventory-v1-Inventory)
    - [MemoryInfo](#opi_api-inventory-v1-MemoryInfo)
    - [PCIeDeviceInfo](#opi_api-inventory-v1-PCIeDeviceInfo)
    - [SystemInfo](#opi_api-inventory-v1-SystemInfo)
  
    - [InventorySvc](#opi_api-inventory-v1-InventorySvc)
  
- [object_key.proto](#object_key-proto)
    - [ObjectKey](#opi_api-common-v1-ObjectKey)
  
- [uuid.proto](#uuid-proto)
    - [Uuid](#opi_api-common-v1-Uuid)
  
- [Scalar Value Types](#scalar-value-types)



<a name="backend_aio-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## backend_aio.proto



<a name="opi_api-storage-v1-AioVolume"></a>

### AioVolume



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | name is an opaque object handle that is not user settable. name will be returned with created object user can only set {resource}_id on the Create request object |
| block_size | [int64](#int64) |  |  |
| blocks_count | [int64](#int64) |  |  |
| uuid | [opi_api.common.v1.Uuid](#opi_api-common-v1-Uuid) |  |  |
| filename | [string](#string) |  |  |






<a name="opi_api-storage-v1-AioVolumeStatsRequest"></a>

### AioVolumeStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-AioVolumeStatsResponse"></a>

### AioVolumeStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  |  |






<a name="opi_api-storage-v1-CreateAioVolumeRequest"></a>

### CreateAioVolumeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| aio_volume | [AioVolume](#opi_api-storage-v1-AioVolume) |  |  |
| aio_volume_id | [string](#string) |  |  |






<a name="opi_api-storage-v1-DeleteAioVolumeRequest"></a>

### DeleteAioVolumeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-storage-v1-GetAioVolumeRequest"></a>

### GetAioVolumeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListAioVolumesRequest"></a>

### ListAioVolumesRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  |  |
| page_size | [int32](#int32) |  |  |
| page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListAioVolumesResponse"></a>

### ListAioVolumesResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| aio_volumes | [AioVolume](#opi_api-storage-v1-AioVolume) | repeated |  |
| next_page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-UpdateAioVolumeRequest"></a>

### UpdateAioVolumeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| aio_volume | [AioVolume](#opi_api-storage-v1-AioVolume) |  | The object&#39;s `name` field is used to identify the object to be updated. |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | The list of fields to update. |
| allow_missing | [bool](#bool) |  | If set to true, and the object is not found, a new object will be created. In this situation, `update_mask` is ignored. |





 

 

 


<a name="opi_api-storage-v1-AioVolumeService"></a>

### AioVolumeService
Back End (network-facing) APIs. This service is for AIO generic kernel block device.

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| CreateAioVolume | [CreateAioVolumeRequest](#opi_api-storage-v1-CreateAioVolumeRequest) | [AioVolume](#opi_api-storage-v1-AioVolume) |  |
| DeleteAioVolume | [DeleteAioVolumeRequest](#opi_api-storage-v1-DeleteAioVolumeRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateAioVolume | [UpdateAioVolumeRequest](#opi_api-storage-v1-UpdateAioVolumeRequest) | [AioVolume](#opi_api-storage-v1-AioVolume) |  |
| ListAioVolumes | [ListAioVolumesRequest](#opi_api-storage-v1-ListAioVolumesRequest) | [ListAioVolumesResponse](#opi_api-storage-v1-ListAioVolumesResponse) |  |
| GetAioVolume | [GetAioVolumeRequest](#opi_api-storage-v1-GetAioVolumeRequest) | [AioVolume](#opi_api-storage-v1-AioVolume) |  |
| AioVolumeStats | [AioVolumeStatsRequest](#opi_api-storage-v1-AioVolumeStatsRequest) | [AioVolumeStatsResponse](#opi_api-storage-v1-AioVolumeStatsResponse) |  |

 



<a name="backend_iscsi-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## backend_iscsi.proto


 

 

 

 



<a name="backend_null-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## backend_null.proto



<a name="opi_api-storage-v1-CreateNullVolumeRequest"></a>

### CreateNullVolumeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| null_volume | [NullVolume](#opi_api-storage-v1-NullVolume) |  |  |
| null_volume_id | [string](#string) |  |  |






<a name="opi_api-storage-v1-DeleteNullVolumeRequest"></a>

### DeleteNullVolumeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-storage-v1-GetNullVolumeRequest"></a>

### GetNullVolumeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListNullVolumesRequest"></a>

### ListNullVolumesRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  |  |
| page_size | [int32](#int32) |  |  |
| page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListNullVolumesResponse"></a>

### ListNullVolumesResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| null_volumes | [NullVolume](#opi_api-storage-v1-NullVolume) | repeated |  |
| next_page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-NullVolume"></a>

### NullVolume



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | name is an opaque object handle that is not user settable. name will be returned with created object user can only set {resource}_id on the Create request object |
| block_size | [int64](#int64) |  |  |
| blocks_count | [int64](#int64) |  |  |
| uuid | [opi_api.common.v1.Uuid](#opi_api-common-v1-Uuid) |  |  |






<a name="opi_api-storage-v1-NullVolumeStatsRequest"></a>

### NullVolumeStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-NullVolumeStatsResponse"></a>

### NullVolumeStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  |  |






<a name="opi_api-storage-v1-UpdateNullVolumeRequest"></a>

### UpdateNullVolumeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| null_volume | [NullVolume](#opi_api-storage-v1-NullVolume) |  | The object&#39;s `name` field is used to identify the object to be updated. |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | The list of fields to update. |
| allow_missing | [bool](#bool) |  | If set to true, and the object is not found, a new object will be created. In this situation, `update_mask` is ignored. |





 

 

 


<a name="opi_api-storage-v1-NullVolumeService"></a>

### NullVolumeService
Back End (network-facing) APIs. This is debug interface for null block devices.

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| CreateNullVolume | [CreateNullVolumeRequest](#opi_api-storage-v1-CreateNullVolumeRequest) | [NullVolume](#opi_api-storage-v1-NullVolume) |  |
| DeleteNullVolume | [DeleteNullVolumeRequest](#opi_api-storage-v1-DeleteNullVolumeRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateNullVolume | [UpdateNullVolumeRequest](#opi_api-storage-v1-UpdateNullVolumeRequest) | [NullVolume](#opi_api-storage-v1-NullVolume) |  |
| ListNullVolumes | [ListNullVolumesRequest](#opi_api-storage-v1-ListNullVolumesRequest) | [ListNullVolumesResponse](#opi_api-storage-v1-ListNullVolumesResponse) |  |
| GetNullVolume | [GetNullVolumeRequest](#opi_api-storage-v1-GetNullVolumeRequest) | [NullVolume](#opi_api-storage-v1-NullVolume) |  |
| NullVolumeStats | [NullVolumeStatsRequest](#opi_api-storage-v1-NullVolumeStatsRequest) | [NullVolumeStatsResponse](#opi_api-storage-v1-NullVolumeStatsResponse) |  |

 



<a name="backend_nvme_pcie-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## backend_nvme_pcie.proto


 

 

 

 



<a name="backend_nvme_tcp-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## backend_nvme_tcp.proto



<a name="opi_api-storage-v1-CreateNvmePathRequest"></a>

### CreateNvmePathRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nvme_path | [NvmePath](#opi_api-storage-v1-NvmePath) |  |  |
| nvme_path_id | [string](#string) |  |  |






<a name="opi_api-storage-v1-CreateNvmeRemoteControllerRequest"></a>

### CreateNvmeRemoteControllerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nvme_remote_controller | [NvmeRemoteController](#opi_api-storage-v1-NvmeRemoteController) |  |  |
| nvme_remote_controller_id | [string](#string) |  |  |






<a name="opi_api-storage-v1-DeleteNvmePathRequest"></a>

### DeleteNvmePathRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | object&#39;s unique identifier |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-storage-v1-DeleteNvmeRemoteControllerRequest"></a>

### DeleteNvmeRemoteControllerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-storage-v1-GetNvmePathRequest"></a>

### GetNvmePathRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-GetNvmeRemoteControllerRequest"></a>

### GetNvmeRemoteControllerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListNvmePathsRequest"></a>

### ListNvmePathsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  |  |
| page_size | [int32](#int32) |  |  |
| page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListNvmePathsResponse"></a>

### ListNvmePathsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nvme_paths | [NvmePath](#opi_api-storage-v1-NvmePath) | repeated |  |
| next_page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListNvmeRemoteControllersRequest"></a>

### ListNvmeRemoteControllersRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  |  |
| page_size | [int32](#int32) |  |  |
| page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListNvmeRemoteControllersResponse"></a>

### ListNvmeRemoteControllersResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nvme_remote_controllers | [NvmeRemoteController](#opi_api-storage-v1-NvmeRemoteController) | repeated |  |
| next_page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListNvmeRemoteNamespacesRequest"></a>

### ListNvmeRemoteNamespacesRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | The controller&#39;s unique object identifier. This lists namespaces for a particular controller. |
| page_size | [int32](#int32) |  |  |
| page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListNvmeRemoteNamespacesResponse"></a>

### ListNvmeRemoteNamespacesResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nvme_remote_namespaces | [NvmeRemoteNamespace](#opi_api-storage-v1-NvmeRemoteNamespace) | repeated |  |
| next_page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-NvmePath"></a>

### NvmePath



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | name is an opaque object handle that is not user settable. name will be returned with created object user can only set {resource}_id on the Create request object |
| controller_name_ref | [string](#string) |  |  |
| trtype | [NvmeTransportType](#opi_api-storage-v1-NvmeTransportType) |  |  |
| adrfam | [NvmeAddressFamily](#opi_api-storage-v1-NvmeAddressFamily) |  |  |
| traddr | [string](#string) |  | Destination address (e.g. IP address) |
| trsvcid | [int64](#int64) |  | Destination service id (e.g. Port) |
| subnqn | [string](#string) |  | Subsystem NQN |
| source_traddr | [string](#string) |  | Source address (e.g. IP of local NIC) |
| source_trsvcid | [int64](#int64) |  | Source port (e.g. Port of local NIC) |
| hostnqn | [string](#string) |  | Host NQN |






<a name="opi_api-storage-v1-NvmePathStatsRequest"></a>

### NvmePathStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-NvmePathStatsResponse"></a>

### NvmePathStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  |  |






<a name="opi_api-storage-v1-NvmeRemoteController"></a>

### NvmeRemoteController



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | name is an opaque object handle that is not user settable. name will be returned with created object user can only set {resource}_id on the Create request object |
| hdgst | [bool](#bool) |  |  |
| ddgst | [bool](#bool) |  |  |
| multipath | [NvmeMultipath](#opi_api-storage-v1-NvmeMultipath) |  |  |
| io_queues_count | [int64](#int64) |  |  |
| queue_size | [int64](#int64) |  |  |
| psk | [bytes](#bytes) |  | Nvme/TCP published secure channel specification (TP 8011) based on TLS 1.3 and PSK. Use PSK interchange format with base64 encoding as input. Also use information about hash function in interchange format for retained PSK generation. If no hash is selected, use configured PSK as retained PSK. Check the size of interchange PSK to determine cipher suite. Calculate CRC-32 bytes to ensure validity of PSK. Example: &#34;NVMeTLSkey-1:01:VRLbtnN9AQb2WXW3c9&#43;wEf/DRLz0QuLdbYvEhwtdWwNf9LrZ:&#34; if PSK field is empty, then unsecure connection Nvme/TCP without TLS will be made |






<a name="opi_api-storage-v1-NvmeRemoteControllerResetRequest"></a>

### NvmeRemoteControllerResetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-NvmeRemoteControllerStatsRequest"></a>

### NvmeRemoteControllerStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-NvmeRemoteControllerStatsResponse"></a>

### NvmeRemoteControllerStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  |  |






<a name="opi_api-storage-v1-NvmeRemoteNamespace"></a>

### NvmeRemoteNamespace



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | name is an opaque object handle that is not user settable. name will be returned with created object user can only set {resource}_id on the Create request object |
| controller_name_ref | [string](#string) |  | controller through which the namespace is visible |
| nsid | [int32](#int32) |  | NSID |
| nguid | [string](#string) |  | Globally unique identifier for the namespace |
| eui64 | [int64](#int64) |  | 64bit Extended unique identifier for the namespace mandatory if guid is not specified |
| uuid | [opi_api.common.v1.Uuid](#opi_api-common-v1-Uuid) |  | Globally unique identifier for the namespace |






<a name="opi_api-storage-v1-UpdateNvmePathRequest"></a>

### UpdateNvmePathRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nvme_path | [NvmePath](#opi_api-storage-v1-NvmePath) |  | The object&#39;s `name` field is used to identify the object to be updated. |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | The list of fields to update. |
| allow_missing | [bool](#bool) |  | If set to true, and the object is not found, a new object will be created. In this situation, `update_mask` is ignored. |






<a name="opi_api-storage-v1-UpdateNvmeRemoteControllerRequest"></a>

### UpdateNvmeRemoteControllerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nvme_remote_controller | [NvmeRemoteController](#opi_api-storage-v1-NvmeRemoteController) |  | The object&#39;s `name` field is used to identify the object to be updated. |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | The list of fields to update. |
| allow_missing | [bool](#bool) |  | If set to true, and the object is not found, a new object will be created. In this situation, `update_mask` is ignored. |





 


<a name="opi_api-storage-v1-NvmeAddressFamily"></a>

### NvmeAddressFamily


| Name | Number | Description |
| ---- | ------ | ----------- |
| NVME_ADDRESS_FAMILY_UNSPECIFIED | 0 |  |
| NVME_ADRFAM_IPV4 | 1 |  |
| NVME_ADRFAM_IPV6 | 2 |  |
| NVME_ADRFAM_IB | 3 |  |
| NVME_ADRFAM_FC | 4 |  |
| NVME_ADRFAM_INTRA_HOST | 5 |  |



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


 

 


<a name="opi_api-storage-v1-NvmeRemoteControllerService"></a>

### NvmeRemoteControllerService
Back End (network-facing) APIs. NVMe/TCP and NVMe/RoCEv2 protocols are covered by this service.

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| CreateNvmeRemoteController | [CreateNvmeRemoteControllerRequest](#opi_api-storage-v1-CreateNvmeRemoteControllerRequest) | [NvmeRemoteController](#opi_api-storage-v1-NvmeRemoteController) |  |
| DeleteNvmeRemoteController | [DeleteNvmeRemoteControllerRequest](#opi_api-storage-v1-DeleteNvmeRemoteControllerRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateNvmeRemoteController | [UpdateNvmeRemoteControllerRequest](#opi_api-storage-v1-UpdateNvmeRemoteControllerRequest) | [NvmeRemoteController](#opi_api-storage-v1-NvmeRemoteController) |  |
| ListNvmeRemoteControllers | [ListNvmeRemoteControllersRequest](#opi_api-storage-v1-ListNvmeRemoteControllersRequest) | [ListNvmeRemoteControllersResponse](#opi_api-storage-v1-ListNvmeRemoteControllersResponse) |  |
| GetNvmeRemoteController | [GetNvmeRemoteControllerRequest](#opi_api-storage-v1-GetNvmeRemoteControllerRequest) | [NvmeRemoteController](#opi_api-storage-v1-NvmeRemoteController) |  |
| NvmeRemoteControllerReset | [NvmeRemoteControllerResetRequest](#opi_api-storage-v1-NvmeRemoteControllerResetRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| NvmeRemoteControllerStats | [NvmeRemoteControllerStatsRequest](#opi_api-storage-v1-NvmeRemoteControllerStatsRequest) | [NvmeRemoteControllerStatsResponse](#opi_api-storage-v1-NvmeRemoteControllerStatsResponse) |  |
| ListNvmeRemoteNamespaces | [ListNvmeRemoteNamespacesRequest](#opi_api-storage-v1-ListNvmeRemoteNamespacesRequest) | [ListNvmeRemoteNamespacesResponse](#opi_api-storage-v1-ListNvmeRemoteNamespacesResponse) |  |
| CreateNvmePath | [CreateNvmePathRequest](#opi_api-storage-v1-CreateNvmePathRequest) | [NvmePath](#opi_api-storage-v1-NvmePath) |  |
| DeleteNvmePath | [DeleteNvmePathRequest](#opi_api-storage-v1-DeleteNvmePathRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateNvmePath | [UpdateNvmePathRequest](#opi_api-storage-v1-UpdateNvmePathRequest) | [NvmePath](#opi_api-storage-v1-NvmePath) |  |
| ListNvmePaths | [ListNvmePathsRequest](#opi_api-storage-v1-ListNvmePathsRequest) | [ListNvmePathsResponse](#opi_api-storage-v1-ListNvmePathsResponse) |  |
| GetNvmePath | [GetNvmePathRequest](#opi_api-storage-v1-GetNvmePathRequest) | [NvmePath](#opi_api-storage-v1-NvmePath) |  |
| NvmePathStats | [NvmePathStatsRequest](#opi_api-storage-v1-NvmePathStatsRequest) | [NvmePathStatsResponse](#opi_api-storage-v1-NvmePathStatsResponse) |  |

 



<a name="frontend_nvme_pcie-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## frontend_nvme_pcie.proto



<a name="opi_api-storage-v1-CreateNvmeControllerRequest"></a>

### CreateNvmeControllerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nvme_controller | [NvmeController](#opi_api-storage-v1-NvmeController) |  |  |
| nvme_controller_id | [string](#string) |  |  |






<a name="opi_api-storage-v1-CreateNvmeNamespaceRequest"></a>

### CreateNvmeNamespaceRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nvme_namespace | [NvmeNamespace](#opi_api-storage-v1-NvmeNamespace) |  |  |
| nvme_namespace_id | [string](#string) |  |  |






<a name="opi_api-storage-v1-CreateNvmeSubsystemRequest"></a>

### CreateNvmeSubsystemRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nvme_subsystem | [NvmeSubsystem](#opi_api-storage-v1-NvmeSubsystem) |  |  |
| nvme_subsystem_id | [string](#string) |  |  |






<a name="opi_api-storage-v1-DeleteNvmeControllerRequest"></a>

### DeleteNvmeControllerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-storage-v1-DeleteNvmeNamespaceRequest"></a>

### DeleteNvmeNamespaceRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-storage-v1-DeleteNvmeSubsystemRequest"></a>

### DeleteNvmeSubsystemRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-storage-v1-GetNvmeControllerRequest"></a>

### GetNvmeControllerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-GetNvmeNamespaceRequest"></a>

### GetNvmeNamespaceRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-GetNvmeSubsystemRequest"></a>

### GetNvmeSubsystemRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListNvmeControllersRequest"></a>

### ListNvmeControllersRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  |  |
| page_size | [int32](#int32) |  |  |
| page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListNvmeControllersResponse"></a>

### ListNvmeControllersResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nvme_controllers | [NvmeController](#opi_api-storage-v1-NvmeController) | repeated |  |
| next_page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListNvmeNamespacesRequest"></a>

### ListNvmeNamespacesRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  |  |
| page_size | [int32](#int32) |  |  |
| page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListNvmeNamespacesResponse"></a>

### ListNvmeNamespacesResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nvme_namespaces | [NvmeNamespace](#opi_api-storage-v1-NvmeNamespace) | repeated |  |
| next_page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListNvmeSubsystemsRequest"></a>

### ListNvmeSubsystemsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  |  |
| page_size | [int32](#int32) |  |  |
| page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListNvmeSubsystemsResponse"></a>

### ListNvmeSubsystemsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nvme_subsystems | [NvmeSubsystem](#opi_api-storage-v1-NvmeSubsystem) | repeated |  |
| next_page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-NvmeController"></a>

### NvmeController



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | name is an opaque object handle that is not user settable. name will be returned with created object user can only set {resource}_id on the Create request object |
| spec | [NvmeControllerSpec](#opi_api-storage-v1-NvmeControllerSpec) |  | spec holds configurable values |
| status | [NvmeControllerStatus](#opi_api-storage-v1-NvmeControllerStatus) |  | status holds server generated values |






<a name="opi_api-storage-v1-NvmeControllerSpec"></a>

### NvmeControllerSpec



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nvme_controller_id | [int32](#int32) |  | subsystem controller id range: 0 to 65535. must not be reused under the same subsystem |
| subsystem_name_ref | [string](#string) |  | subsystem information |
| pcie_id | [PciEndpoint](#opi_api-storage-v1-PciEndpoint) |  | xPU&#39;s PCI ID for the controller |
| max_nsq | [int32](#int32) |  | maximum number of host submission queues allowed. If not set, the xPU will provide a default. |
| max_ncq | [int32](#int32) |  | maximum number of host completion queues allowed. If not set, the xPU will provide a default. |
| sqes | [int32](#int32) |  | maximum number of submission queue entries per submission queue, as a power of 2. default value as per spec is 6 |
| cqes | [int32](#int32) |  | maximum number of completion queue entries per completion queue, as a power of 2. default value as per spec is 4 |
| max_namespaces | [int32](#int32) |  | maximum Number of namespaces that will be provisioned under the controller. |
| min_limit | [QosLimit](#opi_api-storage-v1-QosLimit) |  | min QoS limits for the controller |
| max_limit | [QosLimit](#opi_api-storage-v1-QosLimit) |  | max QoS limits for the controller |






<a name="opi_api-storage-v1-NvmeControllerStatsRequest"></a>

### NvmeControllerStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-NvmeControllerStatsResponse"></a>

### NvmeControllerStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  |  |






<a name="opi_api-storage-v1-NvmeControllerStatus"></a>

### NvmeControllerStatus



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| active | [bool](#bool) |  | Device is in use by host nvme driver |






<a name="opi_api-storage-v1-NvmeNamespace"></a>

### NvmeNamespace



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | name is an opaque object handle that is not user settable. name will be returned with created object user can only set {resource}_id on the Create request object |
| spec | [NvmeNamespaceSpec](#opi_api-storage-v1-NvmeNamespaceSpec) |  | spec holds configurable values |
| status | [NvmeNamespaceStatus](#opi_api-storage-v1-NvmeNamespaceStatus) |  | status holds server generated values |






<a name="opi_api-storage-v1-NvmeNamespaceSpec"></a>

### NvmeNamespaceSpec



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| subsystem_name_ref | [string](#string) |  | subsystem for this namespace |
| host_nsid | [int32](#int32) |  | NSID present to the host by the Nvme PCIe controller. If not provided, then the controller will assign an unused NSID within the max namespace range - auto assigned nsid may not work for live migration |
| nguid | [string](#string) |  | Globally unique identifier for the namespace |
| eui64 | [int64](#int64) |  | 64bit Extended unique identifier for the namespace mandatory if guid is not specified |
| uuid | [opi_api.common.v1.Uuid](#opi_api-common-v1-Uuid) |  | Globally unique identifier for the namespace |
| volume_name_ref | [string](#string) |  | The back/middle-end volume to back this namespace. |






<a name="opi_api-storage-v1-NvmeNamespaceStatsRequest"></a>

### NvmeNamespaceStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-NvmeNamespaceStatsResponse"></a>

### NvmeNamespaceStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  |  |






<a name="opi_api-storage-v1-NvmeNamespaceStatus"></a>

### NvmeNamespaceStatus



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| pci_state | [NvmeNamespacePciState](#opi_api-storage-v1-NvmeNamespacePciState) |  | config state of the namespace object, (enabled, disable, deleting) |
| pci_oper_state | [NvmeNamespacePciOperState](#opi_api-storage-v1-NvmeNamespacePciOperState) |  | Operational state of the namespace object, (connected, disconnected) |






<a name="opi_api-storage-v1-NvmeSubsystem"></a>

### NvmeSubsystem



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | name is an opaque object handle that is not user settable. name will be returned with created object user can only set {resource}_id on the Create request object |
| spec | [NvmeSubsystemSpec](#opi_api-storage-v1-NvmeSubsystemSpec) |  | spec holds configurable values |
| status | [NvmeSubsystemStatus](#opi_api-storage-v1-NvmeSubsystemStatus) |  | status holds server generated values |






<a name="opi_api-storage-v1-NvmeSubsystemSpec"></a>

### NvmeSubsystemSpec



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nqn | [string](#string) |  | Nvme subsystem NQN to which the controller belongs Refer to the NQN format in the Nvme base specifications, must not exceed &#39;NSV_NVME_SUBSYSTEM_NQN_LEN&#39; bytes |
| serial_number | [string](#string) |  | serial number must not exceed &#39;NSV_CTRLR_SERIAL_NO_LEN&#39; bytes |
| model_number | [string](#string) |  | model number, must not exceed &#39;NSV_CTRLR_MODEL_NO_LEN&#39; bytes |
| max_namespaces | [int64](#int64) |  | maximum namespaces within a subsystem |






<a name="opi_api-storage-v1-NvmeSubsystemStatsRequest"></a>

### NvmeSubsystemStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-NvmeSubsystemStatsResponse"></a>

### NvmeSubsystemStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  |  |






<a name="opi_api-storage-v1-NvmeSubsystemStatus"></a>

### NvmeSubsystemStatus



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| firmware_revision | [string](#string) |  | firmware revision, must not exceed &#39;NSV_CTRLR_FW_REV_LEN&#39; |
| fru_guid | [bytes](#bytes) |  | FRU identfier, 16bytes opaque identity for the type of unit |






<a name="opi_api-storage-v1-UpdateNvmeControllerRequest"></a>

### UpdateNvmeControllerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nvme_controller | [NvmeController](#opi_api-storage-v1-NvmeController) |  | The object&#39;s `name` field is used to identify the object to be updated. |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | The list of fields to update. |
| allow_missing | [bool](#bool) |  | If set to true, and the object is not found, a new object will be created. In this situation, `update_mask` is ignored. |






<a name="opi_api-storage-v1-UpdateNvmeNamespaceRequest"></a>

### UpdateNvmeNamespaceRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nvme_namespace | [NvmeNamespace](#opi_api-storage-v1-NvmeNamespace) |  | The object&#39;s `name` field is used to identify the object to be updated. |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | The list of fields to update. |
| allow_missing | [bool](#bool) |  | If set to true, and the object is not found, a new object will be created. In this situation, `update_mask` is ignored. |






<a name="opi_api-storage-v1-UpdateNvmeSubsystemRequest"></a>

### UpdateNvmeSubsystemRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nvme_subsystem | [NvmeSubsystem](#opi_api-storage-v1-NvmeSubsystem) |  | The object&#39;s `name` field is used to identify the object to be updated. |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | The list of fields to update. |
| allow_missing | [bool](#bool) |  | If set to true, and the object is not found, a new object will be created. In this situation, `update_mask` is ignored. |





 


<a name="opi_api-storage-v1-NvmeNamespacePciOperState"></a>

### NvmeNamespacePciOperState
Namespace PCIe operational states

| Name | Number | Description |
| ---- | ------ | ----------- |
| NVME_NAMESPACE_PCI_OPER_STATE_UNSPECIFIED | 0 | unspecified |
| NVME_NAMESPACE_PCI_OPER_STATE_ONLINE | 1 | namespace is online and operational |
| NVME_NAMESPACE_PCI_OPER_STATE_OFFLINE | 2 | namespace is offline |



<a name="opi_api-storage-v1-NvmeNamespacePciState"></a>

### NvmeNamespacePciState
Namespace  Administrative States

| Name | Number | Description |
| ---- | ------ | ----------- |
| NVME_NAMESPACE_PCI_STATE_UNSPECIFIED | 0 | unspecified |
| NVME_NAMESPACE_PCI_STATE_DISABLED | 1 | namespace disabled state |
| NVME_NAMESPACE_PCI_STATE_ENABLED | 2 | namespace enabled state |
| NVME_NAMESPACE_PCI_STATE_DELETING | 3 | namespace being deleted |


 

 


<a name="opi_api-storage-v1-FrontendNvmeService"></a>

### FrontendNvmeService
Front End (host-facing) APIs. Mostly used for Nvme/PCIe emulation and host presentation.

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| CreateNvmeSubsystem | [CreateNvmeSubsystemRequest](#opi_api-storage-v1-CreateNvmeSubsystemRequest) | [NvmeSubsystem](#opi_api-storage-v1-NvmeSubsystem) |  |
| DeleteNvmeSubsystem | [DeleteNvmeSubsystemRequest](#opi_api-storage-v1-DeleteNvmeSubsystemRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) | Fails if there are any associated objects |
| UpdateNvmeSubsystem | [UpdateNvmeSubsystemRequest](#opi_api-storage-v1-UpdateNvmeSubsystemRequest) | [NvmeSubsystem](#opi_api-storage-v1-NvmeSubsystem) |  |
| ListNvmeSubsystems | [ListNvmeSubsystemsRequest](#opi_api-storage-v1-ListNvmeSubsystemsRequest) | [ListNvmeSubsystemsResponse](#opi_api-storage-v1-ListNvmeSubsystemsResponse) |  |
| GetNvmeSubsystem | [GetNvmeSubsystemRequest](#opi_api-storage-v1-GetNvmeSubsystemRequest) | [NvmeSubsystem](#opi_api-storage-v1-NvmeSubsystem) |  |
| NvmeSubsystemStats | [NvmeSubsystemStatsRequest](#opi_api-storage-v1-NvmeSubsystemStatsRequest) | [NvmeSubsystemStatsResponse](#opi_api-storage-v1-NvmeSubsystemStatsResponse) |  |
| CreateNvmeController | [CreateNvmeControllerRequest](#opi_api-storage-v1-CreateNvmeControllerRequest) | [NvmeController](#opi_api-storage-v1-NvmeController) |  |
| DeleteNvmeController | [DeleteNvmeControllerRequest](#opi_api-storage-v1-DeleteNvmeControllerRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) | Fails if there are any associated objects |
| UpdateNvmeController | [UpdateNvmeControllerRequest](#opi_api-storage-v1-UpdateNvmeControllerRequest) | [NvmeController](#opi_api-storage-v1-NvmeController) |  |
| ListNvmeControllers | [ListNvmeControllersRequest](#opi_api-storage-v1-ListNvmeControllersRequest) | [ListNvmeControllersResponse](#opi_api-storage-v1-ListNvmeControllersResponse) |  |
| GetNvmeController | [GetNvmeControllerRequest](#opi_api-storage-v1-GetNvmeControllerRequest) | [NvmeController](#opi_api-storage-v1-NvmeController) |  |
| NvmeControllerStats | [NvmeControllerStatsRequest](#opi_api-storage-v1-NvmeControllerStatsRequest) | [NvmeControllerStatsResponse](#opi_api-storage-v1-NvmeControllerStatsResponse) |  |
| CreateNvmeNamespace | [CreateNvmeNamespaceRequest](#opi_api-storage-v1-CreateNvmeNamespaceRequest) | [NvmeNamespace](#opi_api-storage-v1-NvmeNamespace) |  |
| DeleteNvmeNamespace | [DeleteNvmeNamespaceRequest](#opi_api-storage-v1-DeleteNvmeNamespaceRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateNvmeNamespace | [UpdateNvmeNamespaceRequest](#opi_api-storage-v1-UpdateNvmeNamespaceRequest) | [NvmeNamespace](#opi_api-storage-v1-NvmeNamespace) |  |
| ListNvmeNamespaces | [ListNvmeNamespacesRequest](#opi_api-storage-v1-ListNvmeNamespacesRequest) | [ListNvmeNamespacesResponse](#opi_api-storage-v1-ListNvmeNamespacesResponse) |  |
| GetNvmeNamespace | [GetNvmeNamespaceRequest](#opi_api-storage-v1-GetNvmeNamespaceRequest) | [NvmeNamespace](#opi_api-storage-v1-NvmeNamespace) |  |
| NvmeNamespaceStats | [NvmeNamespaceStatsRequest](#opi_api-storage-v1-NvmeNamespaceStatsRequest) | [NvmeNamespaceStatsResponse](#opi_api-storage-v1-NvmeNamespaceStatsResponse) |  |

 



<a name="frontend_virtio_blk-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## frontend_virtio_blk.proto



<a name="opi_api-storage-v1-CreateVirtioBlkRequest"></a>

### CreateVirtioBlkRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| virtio_blk | [VirtioBlk](#opi_api-storage-v1-VirtioBlk) |  |  |
| virtio_blk_id | [string](#string) |  |  |






<a name="opi_api-storage-v1-DeleteVirtioBlkRequest"></a>

### DeleteVirtioBlkRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-storage-v1-GetVirtioBlkRequest"></a>

### GetVirtioBlkRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListVirtioBlksRequest"></a>

### ListVirtioBlksRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  |  |
| page_size | [int32](#int32) |  |  |
| page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListVirtioBlksResponse"></a>

### ListVirtioBlksResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| virtio_blks | [VirtioBlk](#opi_api-storage-v1-VirtioBlk) | repeated |  |
| next_page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-UpdateVirtioBlkRequest"></a>

### UpdateVirtioBlkRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| virtio_blk | [VirtioBlk](#opi_api-storage-v1-VirtioBlk) |  | The object&#39;s `name` field is used to identify the object to be updated. |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | The list of fields to update. |
| allow_missing | [bool](#bool) |  | If set to true, and the object is not found, a new object will be created. In this situation, `update_mask` is ignored. |






<a name="opi_api-storage-v1-VirtioBlk"></a>

### VirtioBlk



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | name is an opaque object handle that is not user settable. name will be returned with created object user can only set {resource}_id on the Create request object |
| pcie_id | [PciEndpoint](#opi_api-storage-v1-PciEndpoint) |  | The PCI endpoint where this device should appear |
| volume_name_ref | [string](#string) |  | The back/middle-end volume to back this controller |
| max_io_qps | [int64](#int64) |  |  |
| min_limit | [QosLimit](#opi_api-storage-v1-QosLimit) |  | min QoS limits for the virtio-blk device |
| max_limit | [QosLimit](#opi_api-storage-v1-QosLimit) |  | max QoS limits for the virtio-blk device |






<a name="opi_api-storage-v1-VirtioBlkStatsRequest"></a>

### VirtioBlkStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-VirtioBlkStatsResponse"></a>

### VirtioBlkStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  |  |





 

 

 


<a name="opi_api-storage-v1-FrontendVirtioBlkService"></a>

### FrontendVirtioBlkService
Front End (host-facing) APIs. Mostly used for Virtio-blk emulation emulation and host presentation as alternative to Nvme.

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| CreateVirtioBlk | [CreateVirtioBlkRequest](#opi_api-storage-v1-CreateVirtioBlkRequest) | [VirtioBlk](#opi_api-storage-v1-VirtioBlk) |  |
| DeleteVirtioBlk | [DeleteVirtioBlkRequest](#opi_api-storage-v1-DeleteVirtioBlkRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateVirtioBlk | [UpdateVirtioBlkRequest](#opi_api-storage-v1-UpdateVirtioBlkRequest) | [VirtioBlk](#opi_api-storage-v1-VirtioBlk) |  |
| ListVirtioBlks | [ListVirtioBlksRequest](#opi_api-storage-v1-ListVirtioBlksRequest) | [ListVirtioBlksResponse](#opi_api-storage-v1-ListVirtioBlksResponse) |  |
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
| virtio_scsi_controller | [VirtioScsiController](#opi_api-storage-v1-VirtioScsiController) |  |  |
| virtio_scsi_controller_id | [string](#string) |  |  |






<a name="opi_api-storage-v1-CreateVirtioScsiLunRequest"></a>

### CreateVirtioScsiLunRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| virtio_scsi_lun | [VirtioScsiLun](#opi_api-storage-v1-VirtioScsiLun) |  |  |
| virtio_scsi_lun_id | [string](#string) |  |  |






<a name="opi_api-storage-v1-CreateVirtioScsiTargetRequest"></a>

### CreateVirtioScsiTargetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| virtio_scsi_target | [VirtioScsiTarget](#opi_api-storage-v1-VirtioScsiTarget) |  |  |
| virtio_scsi_target_id | [string](#string) |  |  |






<a name="opi_api-storage-v1-DeleteVirtioScsiControllerRequest"></a>

### DeleteVirtioScsiControllerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-storage-v1-DeleteVirtioScsiLunRequest"></a>

### DeleteVirtioScsiLunRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-storage-v1-DeleteVirtioScsiTargetRequest"></a>

### DeleteVirtioScsiTargetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-storage-v1-GetVirtioScsiControllerRequest"></a>

### GetVirtioScsiControllerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-GetVirtioScsiLunRequest"></a>

### GetVirtioScsiLunRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-GetVirtioScsiTargetRequest"></a>

### GetVirtioScsiTargetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListVirtioScsiControllersRequest"></a>

### ListVirtioScsiControllersRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  |  |
| page_size | [int32](#int32) |  |  |
| page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListVirtioScsiControllersResponse"></a>

### ListVirtioScsiControllersResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| virtio_scsi_controllers | [VirtioScsiController](#opi_api-storage-v1-VirtioScsiController) | repeated |  |
| next_page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListVirtioScsiLunsRequest"></a>

### ListVirtioScsiLunsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  |  |
| page_size | [int32](#int32) |  |  |
| page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListVirtioScsiLunsResponse"></a>

### ListVirtioScsiLunsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| virtio_scsi_luns | [VirtioScsiLun](#opi_api-storage-v1-VirtioScsiLun) | repeated |  |
| next_page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListVirtioScsiTargetsRequest"></a>

### ListVirtioScsiTargetsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  |  |
| page_size | [int32](#int32) |  |  |
| page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListVirtioScsiTargetsResponse"></a>

### ListVirtioScsiTargetsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| virtio_scsi_targets | [VirtioScsiTarget](#opi_api-storage-v1-VirtioScsiTarget) | repeated |  |
| next_page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-UpdateVirtioScsiControllerRequest"></a>

### UpdateVirtioScsiControllerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| virtio_scsi_controller | [VirtioScsiController](#opi_api-storage-v1-VirtioScsiController) |  | The object&#39;s `name` field is used to identify the object to be updated. |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | The list of fields to update. |
| allow_missing | [bool](#bool) |  | If set to true, and the object is not found, a new object will be created. In this situation, `update_mask` is ignored. |






<a name="opi_api-storage-v1-UpdateVirtioScsiLunRequest"></a>

### UpdateVirtioScsiLunRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| virtio_scsi_lun | [VirtioScsiLun](#opi_api-storage-v1-VirtioScsiLun) |  | The object&#39;s `name` field is used to identify the object to be updated. |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | The list of fields to update. |
| allow_missing | [bool](#bool) |  | If set to true, and the object is not found, a new object will be created. In this situation, `update_mask` is ignored. |






<a name="opi_api-storage-v1-UpdateVirtioScsiTargetRequest"></a>

### UpdateVirtioScsiTargetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| virtio_scsi_target | [VirtioScsiTarget](#opi_api-storage-v1-VirtioScsiTarget) |  | The object&#39;s `name` field is used to identify the object to be updated. |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | The list of fields to update. |
| allow_missing | [bool](#bool) |  | If set to true, and the object is not found, a new object will be created. In this situation, `update_mask` is ignored. |






<a name="opi_api-storage-v1-VirtioScsiController"></a>

### VirtioScsiController



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | name is an opaque object handle that is not user settable. name will be returned with created object user can only set {resource}_id on the Create request object |
| pcie_id | [PciEndpoint](#opi_api-storage-v1-PciEndpoint) |  | xPU&#39;s PCI ID for the controller |
| min_limit | [QosLimit](#opi_api-storage-v1-QosLimit) |  | min QoS limits for the controller |
| max_limit | [QosLimit](#opi_api-storage-v1-QosLimit) |  | max QoS limits for the controller |






<a name="opi_api-storage-v1-VirtioScsiControllerStatsRequest"></a>

### VirtioScsiControllerStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-VirtioScsiControllerStatsResponse"></a>

### VirtioScsiControllerStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  |  |






<a name="opi_api-storage-v1-VirtioScsiLun"></a>

### VirtioScsiLun



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | name is an opaque object handle that is not user settable. name will be returned with created object user can only set {resource}_id on the Create request object |
| target_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | The target that this LUN is in |
| volume_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | The middle/back-end volume for this LLUN |






<a name="opi_api-storage-v1-VirtioScsiLunStatsRequest"></a>

### VirtioScsiLunStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| controller_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  |  |






<a name="opi_api-storage-v1-VirtioScsiLunStatsResponse"></a>

### VirtioScsiLunStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  |  |






<a name="opi_api-storage-v1-VirtioScsiTarget"></a>

### VirtioScsiTarget



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | name is an opaque object handle that is not user settable. name will be returned with created object user can only set {resource}_id on the Create request object |
| max_luns | [int32](#int32) |  | maximum LUNs within a target |






<a name="opi_api-storage-v1-VirtioScsiTargetStatsRequest"></a>

### VirtioScsiTargetStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-VirtioScsiTargetStatsResponse"></a>

### VirtioScsiTargetStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  |  |





 

 

 


<a name="opi_api-storage-v1-FrontendVirtioScsiService"></a>

### FrontendVirtioScsiService
Front End (host-facing) APIs. Mostly used for Virtio-scsi emulation and host presentation as alternative to Virtio-blk.

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| CreateVirtioScsiTarget | [CreateVirtioScsiTargetRequest](#opi_api-storage-v1-CreateVirtioScsiTargetRequest) | [VirtioScsiTarget](#opi_api-storage-v1-VirtioScsiTarget) |  |
| DeleteVirtioScsiTarget | [DeleteVirtioScsiTargetRequest](#opi_api-storage-v1-DeleteVirtioScsiTargetRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateVirtioScsiTarget | [UpdateVirtioScsiTargetRequest](#opi_api-storage-v1-UpdateVirtioScsiTargetRequest) | [VirtioScsiTarget](#opi_api-storage-v1-VirtioScsiTarget) |  |
| ListVirtioScsiTargets | [ListVirtioScsiTargetsRequest](#opi_api-storage-v1-ListVirtioScsiTargetsRequest) | [ListVirtioScsiTargetsResponse](#opi_api-storage-v1-ListVirtioScsiTargetsResponse) |  |
| GetVirtioScsiTarget | [GetVirtioScsiTargetRequest](#opi_api-storage-v1-GetVirtioScsiTargetRequest) | [VirtioScsiTarget](#opi_api-storage-v1-VirtioScsiTarget) |  |
| VirtioScsiTargetStats | [VirtioScsiTargetStatsRequest](#opi_api-storage-v1-VirtioScsiTargetStatsRequest) | [VirtioScsiTargetStatsResponse](#opi_api-storage-v1-VirtioScsiTargetStatsResponse) |  |
| CreateVirtioScsiController | [CreateVirtioScsiControllerRequest](#opi_api-storage-v1-CreateVirtioScsiControllerRequest) | [VirtioScsiController](#opi_api-storage-v1-VirtioScsiController) |  |
| DeleteVirtioScsiController | [DeleteVirtioScsiControllerRequest](#opi_api-storage-v1-DeleteVirtioScsiControllerRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateVirtioScsiController | [UpdateVirtioScsiControllerRequest](#opi_api-storage-v1-UpdateVirtioScsiControllerRequest) | [VirtioScsiController](#opi_api-storage-v1-VirtioScsiController) |  |
| ListVirtioScsiControllers | [ListVirtioScsiControllersRequest](#opi_api-storage-v1-ListVirtioScsiControllersRequest) | [ListVirtioScsiControllersResponse](#opi_api-storage-v1-ListVirtioScsiControllersResponse) |  |
| GetVirtioScsiController | [GetVirtioScsiControllerRequest](#opi_api-storage-v1-GetVirtioScsiControllerRequest) | [VirtioScsiController](#opi_api-storage-v1-VirtioScsiController) |  |
| VirtioScsiControllerStats | [VirtioScsiControllerStatsRequest](#opi_api-storage-v1-VirtioScsiControllerStatsRequest) | [VirtioScsiControllerStatsResponse](#opi_api-storage-v1-VirtioScsiControllerStatsResponse) |  |
| CreateVirtioScsiLun | [CreateVirtioScsiLunRequest](#opi_api-storage-v1-CreateVirtioScsiLunRequest) | [VirtioScsiLun](#opi_api-storage-v1-VirtioScsiLun) |  |
| DeleteVirtioScsiLun | [DeleteVirtioScsiLunRequest](#opi_api-storage-v1-DeleteVirtioScsiLunRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateVirtioScsiLun | [UpdateVirtioScsiLunRequest](#opi_api-storage-v1-UpdateVirtioScsiLunRequest) | [VirtioScsiLun](#opi_api-storage-v1-VirtioScsiLun) |  |
| ListVirtioScsiLuns | [ListVirtioScsiLunsRequest](#opi_api-storage-v1-ListVirtioScsiLunsRequest) | [ListVirtioScsiLunsResponse](#opi_api-storage-v1-ListVirtioScsiLunsResponse) |  |
| GetVirtioScsiLun | [GetVirtioScsiLunRequest](#opi_api-storage-v1-GetVirtioScsiLunRequest) | [VirtioScsiLun](#opi_api-storage-v1-VirtioScsiLun) |  |
| VirtioScsiLunStats | [VirtioScsiLunStatsRequest](#opi_api-storage-v1-VirtioScsiLunStatsRequest) | [VirtioScsiLunStatsResponse](#opi_api-storage-v1-VirtioScsiLunStatsResponse) |  |

 



<a name="middleend_encryption-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## middleend_encryption.proto



<a name="opi_api-storage-v1-CreateEncryptedVolumeRequest"></a>

### CreateEncryptedVolumeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| encrypted_volume | [EncryptedVolume](#opi_api-storage-v1-EncryptedVolume) |  |  |
| encrypted_volume_id | [string](#string) |  |  |






<a name="opi_api-storage-v1-DeleteEncryptedVolumeRequest"></a>

### DeleteEncryptedVolumeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-storage-v1-EncryptedVolume"></a>

### EncryptedVolume



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | name is an opaque object handle that is not user settable. name will be returned with created object user can only set {resource}_id on the Create request object |
| volume_name_ref | [string](#string) |  | The back/middle-end volume to back this volume |
| key | [bytes](#bytes) |  | Key to be used for encryption |
| cipher | [EncryptionType](#opi_api-storage-v1-EncryptionType) |  | Cipher to use |






<a name="opi_api-storage-v1-EncryptedVolumeStatsRequest"></a>

### EncryptedVolumeStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-EncryptedVolumeStatsResponse"></a>

### EncryptedVolumeStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  |  |






<a name="opi_api-storage-v1-GetEncryptedVolumeRequest"></a>

### GetEncryptedVolumeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListEncryptedVolumesRequest"></a>

### ListEncryptedVolumesRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  |  |
| page_size | [int32](#int32) |  |  |
| page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListEncryptedVolumesResponse"></a>

### ListEncryptedVolumesResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| encrypted_volumes | [EncryptedVolume](#opi_api-storage-v1-EncryptedVolume) | repeated |  |
| next_page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-UpdateEncryptedVolumeRequest"></a>

### UpdateEncryptedVolumeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| encrypted_volume | [EncryptedVolume](#opi_api-storage-v1-EncryptedVolume) |  | The object&#39;s `name` field is used to identify the object to be updated. |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | The list of fields to update. |
| allow_missing | [bool](#bool) |  | If set to true, and the object is not found, a new object will be created. In this situation, `update_mask` is ignored. |





 

 

 


<a name="opi_api-storage-v1-MiddleendEncryptionService"></a>

### MiddleendEncryptionService
Middle End (Storage Services) APIs. For example, encryption, compression, raid, QoS, multipath, ...

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| CreateEncryptedVolume | [CreateEncryptedVolumeRequest](#opi_api-storage-v1-CreateEncryptedVolumeRequest) | [EncryptedVolume](#opi_api-storage-v1-EncryptedVolume) |  |
| DeleteEncryptedVolume | [DeleteEncryptedVolumeRequest](#opi_api-storage-v1-DeleteEncryptedVolumeRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateEncryptedVolume | [UpdateEncryptedVolumeRequest](#opi_api-storage-v1-UpdateEncryptedVolumeRequest) | [EncryptedVolume](#opi_api-storage-v1-EncryptedVolume) |  |
| ListEncryptedVolumes | [ListEncryptedVolumesRequest](#opi_api-storage-v1-ListEncryptedVolumesRequest) | [ListEncryptedVolumesResponse](#opi_api-storage-v1-ListEncryptedVolumesResponse) |  |
| GetEncryptedVolume | [GetEncryptedVolumeRequest](#opi_api-storage-v1-GetEncryptedVolumeRequest) | [EncryptedVolume](#opi_api-storage-v1-EncryptedVolume) |  |
| EncryptedVolumeStats | [EncryptedVolumeStatsRequest](#opi_api-storage-v1-EncryptedVolumeStatsRequest) | [EncryptedVolumeStatsResponse](#opi_api-storage-v1-EncryptedVolumeStatsResponse) |  |

 



<a name="middleend_qos_volume-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## middleend_qos_volume.proto



<a name="opi_api-storage-v1-CreateQosVolumeRequest"></a>

### CreateQosVolumeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| qos_volume | [QosVolume](#opi_api-storage-v1-QosVolume) |  |  |
| qos_volume_id | [string](#string) |  |  |






<a name="opi_api-storage-v1-DeleteQosVolumeRequest"></a>

### DeleteQosVolumeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-storage-v1-GetQosVolumeRequest"></a>

### GetQosVolumeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListQosVolumesRequest"></a>

### ListQosVolumesRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  |  |
| page_size | [int32](#int32) |  |  |
| page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-ListQosVolumesResponse"></a>

### ListQosVolumesResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| qos_volumes | [QosVolume](#opi_api-storage-v1-QosVolume) | repeated |  |
| next_page_token | [string](#string) |  |  |






<a name="opi_api-storage-v1-QosVolume"></a>

### QosVolume



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | name is an opaque object handle that is not user settable. name will be returned with created object user can only set {resource}_id on the Create request object |
| volume_id | [opi_api.common.v1.ObjectKey](#opi_api-common-v1-ObjectKey) |  | Middleend/backend volume to apply QoS on |
| min_limit | [QosLimit](#opi_api-storage-v1-QosLimit) |  |  |
| max_limit | [QosLimit](#opi_api-storage-v1-QosLimit) |  |  |






<a name="opi_api-storage-v1-QosVolumeStatsRequest"></a>

### QosVolumeStatsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-QosVolumeStatsResponse"></a>

### QosVolumeStatsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  |  |






<a name="opi_api-storage-v1-UpdateQosVolumeRequest"></a>

### UpdateQosVolumeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| qos_volume | [QosVolume](#opi_api-storage-v1-QosVolume) |  | The object&#39;s `name` field is used to identify the object to be updated. |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | The list of fields to update. |
| allow_missing | [bool](#bool) |  | If set to true, and the object is not found, a new object will be created. In this situation, `update_mask` is ignored. |





 

 

 


<a name="opi_api-storage-v1-MiddleendQosVolumeService"></a>

### MiddleendQosVolumeService


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| CreateQosVolume | [CreateQosVolumeRequest](#opi_api-storage-v1-CreateQosVolumeRequest) | [QosVolume](#opi_api-storage-v1-QosVolume) |  |
| DeleteQosVolume | [DeleteQosVolumeRequest](#opi_api-storage-v1-DeleteQosVolumeRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) |  |
| UpdateQosVolume | [UpdateQosVolumeRequest](#opi_api-storage-v1-UpdateQosVolumeRequest) | [QosVolume](#opi_api-storage-v1-QosVolume) |  |
| ListQosVolumes | [ListQosVolumesRequest](#opi_api-storage-v1-ListQosVolumesRequest) | [ListQosVolumesResponse](#opi_api-storage-v1-ListQosVolumesResponse) |  |
| GetQosVolume | [GetQosVolumeRequest](#opi_api-storage-v1-GetQosVolumeRequest) | [QosVolume](#opi_api-storage-v1-QosVolume) |  |
| QosVolumeStats | [QosVolumeStatsRequest](#opi_api-storage-v1-QosVolumeStatsRequest) | [QosVolumeStatsResponse](#opi_api-storage-v1-QosVolumeStatsResponse) |  |

 



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
| virtual_function | [int32](#int32) |  | Virtual function index. 1-based index. The value 0 is reserved to represent the PCI physical &#34;device&#34;. This may end up matching the host-assigned &#34;function&#34; value in the bus:device:function identifier, but it does not strictly have to and that should not be relied upon. |






<a name="opi_api-storage-v1-QosLimit"></a>

### QosLimit
QoS limits applied to volumes/devices


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| rd_iops_kiops | [int64](#int64) |  | Read kIOPS |
| wr_iops_kiops | [int64](#int64) |  | Write kIOPS |
| rw_iops_kiops | [int64](#int64) |  | Read/write kIOPS |
| rd_bandwidth_mbs | [int64](#int64) |  | Read bandwidth (MB/s) |
| wr_bandwidth_mbs | [int64](#int64) |  | Write bandwidth (MB/s) |
| rw_bandwidth_mbs | [int64](#int64) |  | Read/write bandwidth (MB/s) |






<a name="opi_api-storage-v1-VolumeStats"></a>

### VolumeStats



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| read_bytes_count | [int32](#int32) |  |  |
| read_ops_count | [int32](#int32) |  |  |
| write_bytes_count | [int32](#int32) |  |  |
| write_ops_count | [int32](#int32) |  |  |
| unmap_bytes_count | [int32](#int32) |  |  |
| unmap_ops_count | [int32](#int32) |  |  |
| read_latency_ticks | [int32](#int32) |  |  |
| write_latency_ticks | [int32](#int32) |  |  |
| unmap_latency_ticks | [int32](#int32) |  |  |





 


<a name="opi_api-storage-v1-EncryptionType"></a>

### EncryptionType
AES encryption types

| Name | Number | Description |
| ---- | ------ | ----------- |
| ENCRYPTION_TYPE_UNSPECIFIED | 0 |  |
| ENCRYPTION_TYPE_AES_CBC_128 | 1 |  |
| ENCRYPTION_TYPE_AES_CBC_192 | 2 |  |
| ENCRYPTION_TYPE_AES_CBC_256 | 3 |  |
| ENCRYPTION_TYPE_AES_XTS_128 | 4 |  |
| ENCRYPTION_TYPE_AES_XTS_192 | 5 |  |
| ENCRYPTION_TYPE_AES_XTS_256 | 6 |  |


 

 

 



<a name="inventory-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## inventory.proto



<a name="opi_api-inventory-v1-BIOSInfo"></a>

### BIOSInfo
BIOS Information (Type 0)


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| vendor | [string](#string) |  | String number of the BIOS Vendor’s Name. |
| version | [string](#string) |  | String number of the BIOS Version. This value is a free-form string that may contain Core and OEM version information. |
| date | [string](#string) |  | String number of the BIOS release date. The date string, if supplied, is in either mm/dd/yy or mm/dd/yyyy format. If the year portion of the string is two digits, the year is assumed to be 19yy. NOTE: In version 2.3 and later of SMBIOS the mm/dd/yyyy format is only used. |






<a name="opi_api-inventory-v1-BaseboardInfo"></a>

### BaseboardInfo
Baseboard (or Module) Information (Type 2)
 The information in this structure defines attributes of a system baseboard (for
 example, a motherboard, planar, server blade, or other standard system module)


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| asset_tag | [string](#string) |  | Number of a null-terminated string |
| serial_number | [string](#string) |  | Number of null-terminated string |
| vendor | [string](#string) |  | Number of null-terminated string |
| version | [string](#string) |  | Number of null-terminated string |
| product | [string](#string) |  | Number of null-terminated string |






<a name="opi_api-inventory-v1-CPUInfo"></a>

### CPUInfo
Processor Information (Type 4)
 The information in this structure (see Table 21) defines the attributes of a single processor; a separate
 structure instance is provided for each system processor socket/slot. For example, a system with an
 IntelDX2™ processor would have a single structure instance while a system with an IntelSX2™ processor
 would have a structure to describe the main CPU and a second structure to describe the 80487 co1054 processor.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| total_cores | [int32](#int32) |  | Number of cores per processor socket See 7.5.6. If the value is unknown, the field is set to 0. For core counts of 256 or greater, the Core Count field is set to FFh and the Core Count 2 field is set to the number of cores. |
| total_threads | [int32](#int32) |  | Number of threads per processor socket See 7.5.8. If the value is unknown, the field is set to 0. For thread counts of 256 or greater, the Thread Count field is set to FFh and the Thread Count 2 field is set to the number of threads. |






<a name="opi_api-inventory-v1-ChassisInfo"></a>

### ChassisInfo
System Enclosure or Chassis (Type 3)
 The information in this structure (see Table 16) defines attributes of the system’s mechanical
 enclosure(s). For example, if a system included a separate enclosure for its peripheral devices, two
 structures would be returned: one for the main system enclosure and the second for the peripheral device
 enclosure. The additions to this structure in version 2.1 of this specification support the population of the
 CIM_Chassis class.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| asset_tag | [string](#string) |  | Number of null-terminated string |
| serial_number | [string](#string) |  | Number of null-terminated string |
| type | [string](#string) |  | Bit 7 Chassis lock is present if 1. Otherwise, either a lock is not present, or it is unknown if the enclosure has a lock. Bits 6:0 Enumeration value; see below. |
| type_description | [string](#string) |  | Table 17 shows the byte values for the System Enclosure or Chassis Types field Number of null-terminated string |
| vendor | [string](#string) |  | Number of null-terminated string |
| version | [string](#string) |  | Number of null-terminated string |






<a name="opi_api-inventory-v1-GetInventoryRequest"></a>

### GetInventoryRequest
Request for Retrieving Inventory data from a device


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | The name of the inventory to retrieve - blank for the full inventory |






<a name="opi_api-inventory-v1-Inventory"></a>

### Inventory
Response for device inventory data


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| bios | [BIOSInfo](#opi_api-inventory-v1-BIOSInfo) |  | BIOS Inventory |
| system | [SystemInfo](#opi_api-inventory-v1-SystemInfo) |  | System Inventory |
| baseboard | [BaseboardInfo](#opi_api-inventory-v1-BaseboardInfo) |  | Baseboard Inventory |
| chassis | [ChassisInfo](#opi_api-inventory-v1-ChassisInfo) |  | Chassis Inventory |
| processor | [CPUInfo](#opi_api-inventory-v1-CPUInfo) |  | CPU Inventory |
| memory | [MemoryInfo](#opi_api-inventory-v1-MemoryInfo) |  | Memory Inventory |
| pci | [PCIeDeviceInfo](#opi_api-inventory-v1-PCIeDeviceInfo) | repeated | PCI Devices Inventory |






<a name="opi_api-inventory-v1-MemoryInfo"></a>

### MemoryInfo
Physical Memory Array (Type 16)
 This structure describes a collection of memory devices that operate together to form a memory address
 space.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| total_physical_bytes | [int64](#int64) |  | Maximum memory capacity, in kilobytes, for this array If the capacity is not represented in this field, then this field contains 8000 0000h and the Extended Maximum Capacity field should be used. Values 2 TB (8000 0000h) or greater must be represented in the Extended Maximum Capacity field. |
| total_usable_bytes | [int64](#int64) |  | TBD |






<a name="opi_api-inventory-v1-PCIeDeviceInfo"></a>

### PCIeDeviceInfo
PCI device information
 TBD: Type 9 or Type 41 ?
 This structure describes a collection of PCI devices.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| driver | [string](#string) |  | Driver assiociated with the device |
| address | [string](#string) |  | BDF address in a string format, for example &#34;0000:00:17.7&#34; |
| vendor | [string](#string) |  | string vendor info |
| product | [string](#string) |  | string product info |
| revision | [string](#string) |  | string revision info |
| subsystem | [string](#string) |  | string subsystem info |
| class | [string](#string) |  | string class info |
| subclass | [string](#string) |  | string subclass info |






<a name="opi_api-inventory-v1-SystemInfo"></a>

### SystemInfo
System Information (Type 1)
 The information in this structure defines attributes of the overall system and is intended to be associated
 with the Component ID group of the system’s MIF. An SMBIOS implementation is associated with a single
 system instance and contains one and only one System Information (Type 1) structure. Table 10 shows
 the contents of this structure.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| family | [string](#string) |  | Number of null-terminated string This text string identifies the family to which a particular computer belongs. A family refers to a set of computers that are similar but not identical from a hardware or software point of view. Typically, a family is composed of different computer models, which have different configurations and pricing points. Computers in the same family often have similar branding and cosmetic features. |
| name | [string](#string) |  | Number of null-terminated string |
| vendor | [string](#string) |  | Number of null-terminated string |
| serial_number | [string](#string) |  | Number of null-terminated string |
| uuid | [string](#string) |  | A UUID is an identifier that is designed to be unique across both time and space. It requires no central registration process. The UUID is 128 bits long. Its format is described in RFC4122, but the actual field contents are opaque and not significant to the SMBIOS specification, which is only concerned with the byte order. Table 11 shows the field names; these field names, particularly for multiplexed fields, follow historical practice. |
| sku | [string](#string) |  | Number of null-terminated string This text string identifies a particular computer configuration for sale. It is sometimes also called a product ID or purchase order number. This number is frequently found in existing fields, but there is no standard format. Typically for a given system board from a given OEM, there are tens of unique processor, memory, hard drive, and optical drive configurations. |
| version | [string](#string) |  | Number of null-terminated string |





 

 

 


<a name="opi_api-inventory-v1-InventorySvc"></a>

### InventorySvc
Service functions for the device inventory data

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| GetInventory | [GetInventoryRequest](#opi_api-inventory-v1-GetInventoryRequest) | [Inventory](#opi_api-inventory-v1-Inventory) | retrieves the inventory data for the device |

 



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

