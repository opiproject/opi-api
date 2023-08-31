# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [backend_aio.proto](#backend_aio-proto)
    - [AioVolume](#opi_api-storage-v1-AioVolume)
    - [CreateAioVolumeRequest](#opi_api-storage-v1-CreateAioVolumeRequest)
    - [DeleteAioVolumeRequest](#opi_api-storage-v1-DeleteAioVolumeRequest)
    - [GetAioVolumeRequest](#opi_api-storage-v1-GetAioVolumeRequest)
    - [ListAioVolumesRequest](#opi_api-storage-v1-ListAioVolumesRequest)
    - [ListAioVolumesResponse](#opi_api-storage-v1-ListAioVolumesResponse)
    - [StatsAioVolumeRequest](#opi_api-storage-v1-StatsAioVolumeRequest)
    - [StatsAioVolumeResponse](#opi_api-storage-v1-StatsAioVolumeResponse)
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
    - [StatsNullVolumeRequest](#opi_api-storage-v1-StatsNullVolumeRequest)
    - [StatsNullVolumeResponse](#opi_api-storage-v1-StatsNullVolumeResponse)
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
    - [GetNvmeRemoteNamespaceRequest](#opi_api-storage-v1-GetNvmeRemoteNamespaceRequest)
    - [ListNvmePathsRequest](#opi_api-storage-v1-ListNvmePathsRequest)
    - [ListNvmePathsResponse](#opi_api-storage-v1-ListNvmePathsResponse)
    - [ListNvmeRemoteControllersRequest](#opi_api-storage-v1-ListNvmeRemoteControllersRequest)
    - [ListNvmeRemoteControllersResponse](#opi_api-storage-v1-ListNvmeRemoteControllersResponse)
    - [ListNvmeRemoteNamespacesRequest](#opi_api-storage-v1-ListNvmeRemoteNamespacesRequest)
    - [ListNvmeRemoteNamespacesResponse](#opi_api-storage-v1-ListNvmeRemoteNamespacesResponse)
    - [NvmePath](#opi_api-storage-v1-NvmePath)
    - [NvmeRemoteController](#opi_api-storage-v1-NvmeRemoteController)
    - [NvmeRemoteNamespace](#opi_api-storage-v1-NvmeRemoteNamespace)
    - [ResetNvmeRemoteControllerRequest](#opi_api-storage-v1-ResetNvmeRemoteControllerRequest)
    - [StatsNvmePathRequest](#opi_api-storage-v1-StatsNvmePathRequest)
    - [StatsNvmePathResponse](#opi_api-storage-v1-StatsNvmePathResponse)
    - [StatsNvmeRemoteControllerRequest](#opi_api-storage-v1-StatsNvmeRemoteControllerRequest)
    - [StatsNvmeRemoteControllerResponse](#opi_api-storage-v1-StatsNvmeRemoteControllerResponse)
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
    - [NvmeControllerStatus](#opi_api-storage-v1-NvmeControllerStatus)
    - [NvmeNamespace](#opi_api-storage-v1-NvmeNamespace)
    - [NvmeNamespaceSpec](#opi_api-storage-v1-NvmeNamespaceSpec)
    - [NvmeNamespaceStatus](#opi_api-storage-v1-NvmeNamespaceStatus)
    - [NvmeSubsystem](#opi_api-storage-v1-NvmeSubsystem)
    - [NvmeSubsystemSpec](#opi_api-storage-v1-NvmeSubsystemSpec)
    - [NvmeSubsystemStatus](#opi_api-storage-v1-NvmeSubsystemStatus)
    - [StatsNvmeControllerRequest](#opi_api-storage-v1-StatsNvmeControllerRequest)
    - [StatsNvmeControllerResponse](#opi_api-storage-v1-StatsNvmeControllerResponse)
    - [StatsNvmeNamespaceRequest](#opi_api-storage-v1-StatsNvmeNamespaceRequest)
    - [StatsNvmeNamespaceResponse](#opi_api-storage-v1-StatsNvmeNamespaceResponse)
    - [StatsNvmeSubsystemRequest](#opi_api-storage-v1-StatsNvmeSubsystemRequest)
    - [StatsNvmeSubsystemResponse](#opi_api-storage-v1-StatsNvmeSubsystemResponse)
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
    - [StatsVirtioBlkRequest](#opi_api-storage-v1-StatsVirtioBlkRequest)
    - [StatsVirtioBlkResponse](#opi_api-storage-v1-StatsVirtioBlkResponse)
    - [UpdateVirtioBlkRequest](#opi_api-storage-v1-UpdateVirtioBlkRequest)
    - [VirtioBlk](#opi_api-storage-v1-VirtioBlk)
  
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
    - [StatsVirtioScsiControllerRequest](#opi_api-storage-v1-StatsVirtioScsiControllerRequest)
    - [StatsVirtioScsiControllerResponse](#opi_api-storage-v1-StatsVirtioScsiControllerResponse)
    - [StatsVirtioScsiLunRequest](#opi_api-storage-v1-StatsVirtioScsiLunRequest)
    - [StatsVirtioScsiLunResponse](#opi_api-storage-v1-StatsVirtioScsiLunResponse)
    - [StatsVirtioScsiTargetRequest](#opi_api-storage-v1-StatsVirtioScsiTargetRequest)
    - [StatsVirtioScsiTargetResponse](#opi_api-storage-v1-StatsVirtioScsiTargetResponse)
    - [UpdateVirtioScsiControllerRequest](#opi_api-storage-v1-UpdateVirtioScsiControllerRequest)
    - [UpdateVirtioScsiLunRequest](#opi_api-storage-v1-UpdateVirtioScsiLunRequest)
    - [UpdateVirtioScsiTargetRequest](#opi_api-storage-v1-UpdateVirtioScsiTargetRequest)
    - [VirtioScsiController](#opi_api-storage-v1-VirtioScsiController)
    - [VirtioScsiLun](#opi_api-storage-v1-VirtioScsiLun)
    - [VirtioScsiTarget](#opi_api-storage-v1-VirtioScsiTarget)
  
    - [FrontendVirtioScsiService](#opi_api-storage-v1-FrontendVirtioScsiService)
  
- [middleend_encryption.proto](#middleend_encryption-proto)
    - [CreateEncryptedVolumeRequest](#opi_api-storage-v1-CreateEncryptedVolumeRequest)
    - [DeleteEncryptedVolumeRequest](#opi_api-storage-v1-DeleteEncryptedVolumeRequest)
    - [EncryptedVolume](#opi_api-storage-v1-EncryptedVolume)
    - [GetEncryptedVolumeRequest](#opi_api-storage-v1-GetEncryptedVolumeRequest)
    - [ListEncryptedVolumesRequest](#opi_api-storage-v1-ListEncryptedVolumesRequest)
    - [ListEncryptedVolumesResponse](#opi_api-storage-v1-ListEncryptedVolumesResponse)
    - [StatsEncryptedVolumeRequest](#opi_api-storage-v1-StatsEncryptedVolumeRequest)
    - [StatsEncryptedVolumeResponse](#opi_api-storage-v1-StatsEncryptedVolumeResponse)
    - [UpdateEncryptedVolumeRequest](#opi_api-storage-v1-UpdateEncryptedVolumeRequest)
  
    - [MiddleendEncryptionService](#opi_api-storage-v1-MiddleendEncryptionService)
  
- [middleend_qos_volume.proto](#middleend_qos_volume-proto)
    - [CreateQosVolumeRequest](#opi_api-storage-v1-CreateQosVolumeRequest)
    - [DeleteQosVolumeRequest](#opi_api-storage-v1-DeleteQosVolumeRequest)
    - [GetQosVolumeRequest](#opi_api-storage-v1-GetQosVolumeRequest)
    - [Limits](#opi_api-storage-v1-Limits)
    - [ListQosVolumesRequest](#opi_api-storage-v1-ListQosVolumesRequest)
    - [ListQosVolumesResponse](#opi_api-storage-v1-ListQosVolumesResponse)
    - [QosVolume](#opi_api-storage-v1-QosVolume)
    - [StatsQosVolumeRequest](#opi_api-storage-v1-StatsQosVolumeRequest)
    - [StatsQosVolumeResponse](#opi_api-storage-v1-StatsQosVolumeResponse)
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
| block_size | [int64](#int64) |  | The size of each block in the AioVolume. |
| blocks_count | [int64](#int64) |  | The total number of blocks in the AioVolume. |
| uuid | [opi_api.common.v1.Uuid](#opi_api-common-v1-Uuid) |  | The UUID (Universally Unique Identifier) of the AioVolume. |
| filename | [string](#string) |  | The filename associated with the AioVolume. |






<a name="opi_api-storage-v1-CreateAioVolumeRequest"></a>

### CreateAioVolumeRequest
Represents a request to create an Aio Volume.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| aio_volume | [AioVolume](#opi_api-storage-v1-AioVolume) |  | The Aio Volume to be created. |
| aio_volume_id | [string](#string) |  | An optional ID to assign to the Aio Volume. If this is not provided the system will auto-generate it. |






<a name="opi_api-storage-v1-DeleteAioVolumeRequest"></a>

### DeleteAioVolumeRequest
Represents a request to delete an AioVolume.


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






<a name="opi_api-storage-v1-StatsAioVolumeRequest"></a>

### StatsAioVolumeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-StatsAioVolumeResponse"></a>

### StatsAioVolumeResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  |  |






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
| CreateAioVolume | [CreateAioVolumeRequest](#opi_api-storage-v1-CreateAioVolumeRequest) | [AioVolume](#opi_api-storage-v1-AioVolume) | Create an Aio Volume |
| DeleteAioVolume | [DeleteAioVolumeRequest](#opi_api-storage-v1-DeleteAioVolumeRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) | Delete an Aio Volume |
| UpdateAioVolume | [UpdateAioVolumeRequest](#opi_api-storage-v1-UpdateAioVolumeRequest) | [AioVolume](#opi_api-storage-v1-AioVolume) | Update an Aio Volume |
| ListAioVolumes | [ListAioVolumesRequest](#opi_api-storage-v1-ListAioVolumesRequest) | [ListAioVolumesResponse](#opi_api-storage-v1-ListAioVolumesResponse) | List Aio Volumes |
| GetAioVolume | [GetAioVolumeRequest](#opi_api-storage-v1-GetAioVolumeRequest) | [AioVolume](#opi_api-storage-v1-AioVolume) | Get an Aio Volume |
| StatsAioVolume | [StatsAioVolumeRequest](#opi_api-storage-v1-StatsAioVolumeRequest) | [StatsAioVolumeResponse](#opi_api-storage-v1-StatsAioVolumeResponse) | Get an Aio Volume statistics |

 



<a name="backend_iscsi-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## backend_iscsi.proto


 

 

 

 



<a name="backend_null-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## backend_null.proto



<a name="opi_api-storage-v1-CreateNullVolumeRequest"></a>

### CreateNullVolumeRequest
Represents a request to create an Null Volume.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| null_volume | [NullVolume](#opi_api-storage-v1-NullVolume) |  | The Null Volume to be created. |
| null_volume_id | [string](#string) |  | An optional ID to assign to the Null Volume. If this is not provided the system will auto-generate it. |






<a name="opi_api-storage-v1-DeleteNullVolumeRequest"></a>

### DeleteNullVolumeRequest
Represents a request to delete an Null Volume.


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
| block_size | [int64](#int64) |  | The block size of the NullVolume. This field is required. |
| blocks_count | [int64](#int64) |  | The number of blocks in the NullVolume. This field is required. |
| uuid | [opi_api.common.v1.Uuid](#opi_api-common-v1-Uuid) |  | The UUID of the NullVolume. This field is optional. |






<a name="opi_api-storage-v1-StatsNullVolumeRequest"></a>

### StatsNullVolumeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-StatsNullVolumeResponse"></a>

### StatsNullVolumeResponse



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
| CreateNullVolume | [CreateNullVolumeRequest](#opi_api-storage-v1-CreateNullVolumeRequest) | [NullVolume](#opi_api-storage-v1-NullVolume) | Create an Null Volume |
| DeleteNullVolume | [DeleteNullVolumeRequest](#opi_api-storage-v1-DeleteNullVolumeRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) | Delete an Null Volume |
| UpdateNullVolume | [UpdateNullVolumeRequest](#opi_api-storage-v1-UpdateNullVolumeRequest) | [NullVolume](#opi_api-storage-v1-NullVolume) | Update an Null Volume |
| ListNullVolumes | [ListNullVolumesRequest](#opi_api-storage-v1-ListNullVolumesRequest) | [ListNullVolumesResponse](#opi_api-storage-v1-ListNullVolumesResponse) | List Null Volumes |
| GetNullVolume | [GetNullVolumeRequest](#opi_api-storage-v1-GetNullVolumeRequest) | [NullVolume](#opi_api-storage-v1-NullVolume) | Get an Null Volume |
| StatsNullVolume | [StatsNullVolumeRequest](#opi_api-storage-v1-StatsNullVolumeRequest) | [StatsNullVolumeResponse](#opi_api-storage-v1-StatsNullVolumeResponse) | Get an Null Volume statistics |

 



<a name="backend_nvme_pcie-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## backend_nvme_pcie.proto


 

 

 

 



<a name="backend_nvme_tcp-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## backend_nvme_tcp.proto



<a name="opi_api-storage-v1-CreateNvmePathRequest"></a>

### CreateNvmePathRequest
Represents a request to create an Nvme Path.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nvme_path | [NvmePath](#opi_api-storage-v1-NvmePath) |  | The Nvme Path to be created. |
| nvme_path_id | [string](#string) |  | An optional ID to assign to the Nvme Path. If this is not provided the system will auto-generate it. |






<a name="opi_api-storage-v1-CreateNvmeRemoteControllerRequest"></a>

### CreateNvmeRemoteControllerRequest
Represents a request to create an Nvme Remote Controller.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nvme_remote_controller | [NvmeRemoteController](#opi_api-storage-v1-NvmeRemoteController) |  | The Nvme Remote Controller to be created. |
| nvme_remote_controller_id | [string](#string) |  | An optional ID to assign to the Nvme Remote Controller. If this is not provided the system will auto-generate it. |






<a name="opi_api-storage-v1-DeleteNvmePathRequest"></a>

### DeleteNvmePathRequest
Represents a request to delete an Nvme Path.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | object&#39;s unique identifier |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-storage-v1-DeleteNvmeRemoteControllerRequest"></a>

### DeleteNvmeRemoteControllerRequest
Represents a request to delete an Nvme Remote Controller.


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






<a name="opi_api-storage-v1-GetNvmeRemoteNamespaceRequest"></a>

### GetNvmeRemoteNamespaceRequest



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
| traddr | [string](#string) |  | Destination address (e.g. IP address, BDF for local PCIe) |
| trsvcid | [int64](#int64) |  | Destination service id (e.g. Port) |
| subnqn | [string](#string) |  | Subsystem NQN |
| source_traddr | [string](#string) |  | Source address (e.g. IP of local NIC) |
| source_trsvcid | [int64](#int64) |  | Source port (e.g. Port of local NIC) |
| hostnqn | [string](#string) |  | Host NQN |






<a name="opi_api-storage-v1-NvmeRemoteController"></a>

### NvmeRemoteController



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | name is an opaque object handle that is not user settable. name will be returned with created object user can only set {resource}_id on the Create request object |
| multipath | [NvmeMultipath](#opi_api-storage-v1-NvmeMultipath) |  |  |
| io_queues_count | [int64](#int64) |  |  |
| queue_size | [int64](#int64) |  |  |
| hdgst | [bool](#bool) |  |  |
| ddgst | [bool](#bool) |  |  |
| psk | [bytes](#bytes) |  | Nvme/TCP published secure channel specification (TP 8011) based on TLS 1.3 and PSK. Use PSK interchange format with base64 encoding as input. Also use information about hash function in interchange format for retained PSK generation. If no hash is selected, use configured PSK as retained PSK. Check the size of interchange PSK to determine cipher suite. Calculate CRC-32 bytes to ensure validity of PSK. Example: &#34;NVMeTLSkey-1:01:VRLbtnN9AQb2WXW3c9&#43;wEf/DRLz0QuLdbYvEhwtdWwNf9LrZ:&#34; if PSK field is empty, then unsecure connection Nvme/TCP without TLS will be made |






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






<a name="opi_api-storage-v1-ResetNvmeRemoteControllerRequest"></a>

### ResetNvmeRemoteControllerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-StatsNvmePathRequest"></a>

### StatsNvmePathRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-StatsNvmePathResponse"></a>

### StatsNvmePathResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  |  |






<a name="opi_api-storage-v1-StatsNvmeRemoteControllerRequest"></a>

### StatsNvmeRemoteControllerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-StatsNvmeRemoteControllerResponse"></a>

### StatsNvmeRemoteControllerResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  |  |






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
| CreateNvmeRemoteController | [CreateNvmeRemoteControllerRequest](#opi_api-storage-v1-CreateNvmeRemoteControllerRequest) | [NvmeRemoteController](#opi_api-storage-v1-NvmeRemoteController) | Create an Nvme Remote Controller |
| DeleteNvmeRemoteController | [DeleteNvmeRemoteControllerRequest](#opi_api-storage-v1-DeleteNvmeRemoteControllerRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) | Delete an Nvme Remote Controller |
| UpdateNvmeRemoteController | [UpdateNvmeRemoteControllerRequest](#opi_api-storage-v1-UpdateNvmeRemoteControllerRequest) | [NvmeRemoteController](#opi_api-storage-v1-NvmeRemoteController) | Update an Nvme Remote Controller |
| ListNvmeRemoteControllers | [ListNvmeRemoteControllersRequest](#opi_api-storage-v1-ListNvmeRemoteControllersRequest) | [ListNvmeRemoteControllersResponse](#opi_api-storage-v1-ListNvmeRemoteControllersResponse) | List Nvme Remote Controllers |
| GetNvmeRemoteController | [GetNvmeRemoteControllerRequest](#opi_api-storage-v1-GetNvmeRemoteControllerRequest) | [NvmeRemoteController](#opi_api-storage-v1-NvmeRemoteController) | Get an Nvme Remote Controller |
| ResetNvmeRemoteController | [ResetNvmeRemoteControllerRequest](#opi_api-storage-v1-ResetNvmeRemoteControllerRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) | Reset an Nvme Remote Controller |
| StatsNvmeRemoteController | [StatsNvmeRemoteControllerRequest](#opi_api-storage-v1-StatsNvmeRemoteControllerRequest) | [StatsNvmeRemoteControllerResponse](#opi_api-storage-v1-StatsNvmeRemoteControllerResponse) | Get an Nvme Remote Controller statistics |
| ListNvmeRemoteNamespaces | [ListNvmeRemoteNamespacesRequest](#opi_api-storage-v1-ListNvmeRemoteNamespacesRequest) | [ListNvmeRemoteNamespacesResponse](#opi_api-storage-v1-ListNvmeRemoteNamespacesResponse) | List Nvme Remote Namespaces |
| GetNvmeRemoteNamespace | [GetNvmeRemoteNamespaceRequest](#opi_api-storage-v1-GetNvmeRemoteNamespaceRequest) | [NvmeRemoteNamespace](#opi_api-storage-v1-NvmeRemoteNamespace) | Get an Nvme Remote Namespace |
| CreateNvmePath | [CreateNvmePathRequest](#opi_api-storage-v1-CreateNvmePathRequest) | [NvmePath](#opi_api-storage-v1-NvmePath) | Create an Nvme Path |
| DeleteNvmePath | [DeleteNvmePathRequest](#opi_api-storage-v1-DeleteNvmePathRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) | Delete an Nvme Path |
| UpdateNvmePath | [UpdateNvmePathRequest](#opi_api-storage-v1-UpdateNvmePathRequest) | [NvmePath](#opi_api-storage-v1-NvmePath) | Update an Nvme Path |
| ListNvmePaths | [ListNvmePathsRequest](#opi_api-storage-v1-ListNvmePathsRequest) | [ListNvmePathsResponse](#opi_api-storage-v1-ListNvmePathsResponse) | List Nvme Paths |
| GetNvmePath | [GetNvmePathRequest](#opi_api-storage-v1-GetNvmePathRequest) | [NvmePath](#opi_api-storage-v1-NvmePath) | Get an Nvme Path |
| StatsNvmePath | [StatsNvmePathRequest](#opi_api-storage-v1-StatsNvmePathRequest) | [StatsNvmePathResponse](#opi_api-storage-v1-StatsNvmePathResponse) | Get an Nvme Path statistics |

 



<a name="frontend_nvme_pcie-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## frontend_nvme_pcie.proto



<a name="opi_api-storage-v1-CreateNvmeControllerRequest"></a>

### CreateNvmeControllerRequest
Represents a request to create an Nvme Controller.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nvme_controller | [NvmeController](#opi_api-storage-v1-NvmeController) |  | The Nvme Controller to be created. |
| nvme_controller_id | [string](#string) |  | An optional ID to assign to the Nvme Controller. If this is not provided the system will auto-generate it. |






<a name="opi_api-storage-v1-CreateNvmeNamespaceRequest"></a>

### CreateNvmeNamespaceRequest
Represents a request to create an Nvme Namespace.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nvme_namespace | [NvmeNamespace](#opi_api-storage-v1-NvmeNamespace) |  | The Nvme Namespace to be created. |
| nvme_namespace_id | [string](#string) |  | An optional ID to assign to the Nvme Namespace. If this is not provided the system will auto-generate it. |






<a name="opi_api-storage-v1-CreateNvmeSubsystemRequest"></a>

### CreateNvmeSubsystemRequest
Represents a request to create an Nvme Subsystem.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nvme_subsystem | [NvmeSubsystem](#opi_api-storage-v1-NvmeSubsystem) |  | The Nvme Subsystem to be created. |
| nvme_subsystem_id | [string](#string) |  | An optional ID to assign to the Nvme Subsystem. If this is not provided the system will auto-generate it. |






<a name="opi_api-storage-v1-DeleteNvmeControllerRequest"></a>

### DeleteNvmeControllerRequest
Represents a request to delete an Nvme Controller.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-storage-v1-DeleteNvmeNamespaceRequest"></a>

### DeleteNvmeNamespaceRequest
Represents a request to delete an Nvme Namespace.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-storage-v1-DeleteNvmeSubsystemRequest"></a>

### DeleteNvmeSubsystemRequest
Represents a request to delete an Nvme Subsystem.


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
| nvme_controller_id | [int32](#int32) | optional | subsystem controller id range: 0 to 65535. must not be reused under the same subsystem |
| subsystem_name_ref | [string](#string) |  | subsystem information |
| pcie_id | [PciEndpoint](#opi_api-storage-v1-PciEndpoint) |  | xPU&#39;s PCI ID for the controller |
| max_nsq | [int32](#int32) |  | maximum number of host submission queues allowed. If not set, the xPU will provide a default. |
| max_ncq | [int32](#int32) |  | maximum number of host completion queues allowed. If not set, the xPU will provide a default. |
| sqes | [int32](#int32) |  | maximum number of submission queue entries per submission queue, as a power of 2. default value as per spec is 6 |
| cqes | [int32](#int32) |  | maximum number of completion queue entries per completion queue, as a power of 2. default value as per spec is 4 |
| max_namespaces | [int32](#int32) |  | maximum Number of namespaces that will be provisioned under the controller. |
| min_limit | [QosLimit](#opi_api-storage-v1-QosLimit) |  | min QoS limits for the controller |
| max_limit | [QosLimit](#opi_api-storage-v1-QosLimit) |  | max QoS limits for the controller |






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






<a name="opi_api-storage-v1-NvmeSubsystemStatus"></a>

### NvmeSubsystemStatus



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| firmware_revision | [string](#string) |  | firmware revision, must not exceed &#39;NSV_CTRLR_FW_REV_LEN&#39; |
| fru_guid | [bytes](#bytes) |  | FRU identfier, 16bytes opaque identity for the type of unit |






<a name="opi_api-storage-v1-StatsNvmeControllerRequest"></a>

### StatsNvmeControllerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-StatsNvmeControllerResponse"></a>

### StatsNvmeControllerResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  |  |






<a name="opi_api-storage-v1-StatsNvmeNamespaceRequest"></a>

### StatsNvmeNamespaceRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-StatsNvmeNamespaceResponse"></a>

### StatsNvmeNamespaceResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  |  |






<a name="opi_api-storage-v1-StatsNvmeSubsystemRequest"></a>

### StatsNvmeSubsystemRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-StatsNvmeSubsystemResponse"></a>

### StatsNvmeSubsystemResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  |  |






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
| CreateNvmeSubsystem | [CreateNvmeSubsystemRequest](#opi_api-storage-v1-CreateNvmeSubsystemRequest) | [NvmeSubsystem](#opi_api-storage-v1-NvmeSubsystem) | Create an Nvme Subsystem |
| DeleteNvmeSubsystem | [DeleteNvmeSubsystemRequest](#opi_api-storage-v1-DeleteNvmeSubsystemRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) | Delete an Nvme Subsystem Fails if there are any associated objects |
| UpdateNvmeSubsystem | [UpdateNvmeSubsystemRequest](#opi_api-storage-v1-UpdateNvmeSubsystemRequest) | [NvmeSubsystem](#opi_api-storage-v1-NvmeSubsystem) | Update an Nvme Subsystem |
| ListNvmeSubsystems | [ListNvmeSubsystemsRequest](#opi_api-storage-v1-ListNvmeSubsystemsRequest) | [ListNvmeSubsystemsResponse](#opi_api-storage-v1-ListNvmeSubsystemsResponse) | List Nvme Subsystems |
| GetNvmeSubsystem | [GetNvmeSubsystemRequest](#opi_api-storage-v1-GetNvmeSubsystemRequest) | [NvmeSubsystem](#opi_api-storage-v1-NvmeSubsystem) | Get an Nvme Subsystem |
| StatsNvmeSubsystem | [StatsNvmeSubsystemRequest](#opi_api-storage-v1-StatsNvmeSubsystemRequest) | [StatsNvmeSubsystemResponse](#opi_api-storage-v1-StatsNvmeSubsystemResponse) | Get an Nvme Subsystem statistics |
| CreateNvmeController | [CreateNvmeControllerRequest](#opi_api-storage-v1-CreateNvmeControllerRequest) | [NvmeController](#opi_api-storage-v1-NvmeController) | Create an Nvme Controller |
| DeleteNvmeController | [DeleteNvmeControllerRequest](#opi_api-storage-v1-DeleteNvmeControllerRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) | Delete an Nvme Controller Fails if there are any associated objects |
| UpdateNvmeController | [UpdateNvmeControllerRequest](#opi_api-storage-v1-UpdateNvmeControllerRequest) | [NvmeController](#opi_api-storage-v1-NvmeController) | Update an Nvme Controller |
| ListNvmeControllers | [ListNvmeControllersRequest](#opi_api-storage-v1-ListNvmeControllersRequest) | [ListNvmeControllersResponse](#opi_api-storage-v1-ListNvmeControllersResponse) | List Nvme Controllers |
| GetNvmeController | [GetNvmeControllerRequest](#opi_api-storage-v1-GetNvmeControllerRequest) | [NvmeController](#opi_api-storage-v1-NvmeController) | Get an Nvme Controller |
| StatsNvmeController | [StatsNvmeControllerRequest](#opi_api-storage-v1-StatsNvmeControllerRequest) | [StatsNvmeControllerResponse](#opi_api-storage-v1-StatsNvmeControllerResponse) | Get an Nvme Controller statistics |
| CreateNvmeNamespace | [CreateNvmeNamespaceRequest](#opi_api-storage-v1-CreateNvmeNamespaceRequest) | [NvmeNamespace](#opi_api-storage-v1-NvmeNamespace) | Create an Nvme Namespace |
| DeleteNvmeNamespace | [DeleteNvmeNamespaceRequest](#opi_api-storage-v1-DeleteNvmeNamespaceRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) | Delete an Nvme Namespace |
| UpdateNvmeNamespace | [UpdateNvmeNamespaceRequest](#opi_api-storage-v1-UpdateNvmeNamespaceRequest) | [NvmeNamespace](#opi_api-storage-v1-NvmeNamespace) | Update an Nvme Namespace |
| ListNvmeNamespaces | [ListNvmeNamespacesRequest](#opi_api-storage-v1-ListNvmeNamespacesRequest) | [ListNvmeNamespacesResponse](#opi_api-storage-v1-ListNvmeNamespacesResponse) | List Nvme Namespaces |
| GetNvmeNamespace | [GetNvmeNamespaceRequest](#opi_api-storage-v1-GetNvmeNamespaceRequest) | [NvmeNamespace](#opi_api-storage-v1-NvmeNamespace) | Get an Nvme Namespace |
| StatsNvmeNamespace | [StatsNvmeNamespaceRequest](#opi_api-storage-v1-StatsNvmeNamespaceRequest) | [StatsNvmeNamespaceResponse](#opi_api-storage-v1-StatsNvmeNamespaceResponse) | Get an Nvme Namespace statistics |

 



<a name="frontend_virtio_blk-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## frontend_virtio_blk.proto



<a name="opi_api-storage-v1-CreateVirtioBlkRequest"></a>

### CreateVirtioBlkRequest
Represents a request to create an Virtio Blk.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| virtio_blk | [VirtioBlk](#opi_api-storage-v1-VirtioBlk) |  | The Virtio Blk to be created. |
| virtio_blk_id | [string](#string) |  | An optional ID to assign to the Virtio Blk. If this is not provided the system will auto-generate it. |






<a name="opi_api-storage-v1-DeleteVirtioBlkRequest"></a>

### DeleteVirtioBlkRequest
Represents a request to delete an Virtio Blk.


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






<a name="opi_api-storage-v1-StatsVirtioBlkRequest"></a>

### StatsVirtioBlkRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-StatsVirtioBlkResponse"></a>

### StatsVirtioBlkResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  |  |






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





 

 

 


<a name="opi_api-storage-v1-FrontendVirtioBlkService"></a>

### FrontendVirtioBlkService
Front End (host-facing) APIs. Mostly used for Virtio-blk emulation emulation and host presentation as alternative to Nvme.

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| CreateVirtioBlk | [CreateVirtioBlkRequest](#opi_api-storage-v1-CreateVirtioBlkRequest) | [VirtioBlk](#opi_api-storage-v1-VirtioBlk) | Create an Virtio Blk |
| DeleteVirtioBlk | [DeleteVirtioBlkRequest](#opi_api-storage-v1-DeleteVirtioBlkRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) | Delete an Virtio Blk |
| UpdateVirtioBlk | [UpdateVirtioBlkRequest](#opi_api-storage-v1-UpdateVirtioBlkRequest) | [VirtioBlk](#opi_api-storage-v1-VirtioBlk) | Update an Virtio Blk |
| ListVirtioBlks | [ListVirtioBlksRequest](#opi_api-storage-v1-ListVirtioBlksRequest) | [ListVirtioBlksResponse](#opi_api-storage-v1-ListVirtioBlksResponse) | List Virtio Blks |
| GetVirtioBlk | [GetVirtioBlkRequest](#opi_api-storage-v1-GetVirtioBlkRequest) | [VirtioBlk](#opi_api-storage-v1-VirtioBlk) | Get an Virtio Blk |
| StatsVirtioBlk | [StatsVirtioBlkRequest](#opi_api-storage-v1-StatsVirtioBlkRequest) | [StatsVirtioBlkResponse](#opi_api-storage-v1-StatsVirtioBlkResponse) | Get an Virtio Blk statistics |

 



<a name="frontend_virtio_fs-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## frontend_virtio_fs.proto


 

 

 

 



<a name="frontend_virtio_scsi-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## frontend_virtio_scsi.proto



<a name="opi_api-storage-v1-CreateVirtioScsiControllerRequest"></a>

### CreateVirtioScsiControllerRequest
Represents a request to create an Virtio Scsi Controller.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| virtio_scsi_controller | [VirtioScsiController](#opi_api-storage-v1-VirtioScsiController) |  | The Virtio Scsi Controller to be created. |
| virtio_scsi_controller_id | [string](#string) |  | An optional ID to assign to the Virtio Scsi Controller. If this is not provided the system will auto-generate it. |






<a name="opi_api-storage-v1-CreateVirtioScsiLunRequest"></a>

### CreateVirtioScsiLunRequest
Represents a request to create an Virtio Scsi Lun.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| virtio_scsi_lun | [VirtioScsiLun](#opi_api-storage-v1-VirtioScsiLun) |  | The Virtio Scsi Lun to be created. |
| virtio_scsi_lun_id | [string](#string) |  | An optional ID to assign to the Virtio Scsi Lun. If this is not provided the system will auto-generate it. |






<a name="opi_api-storage-v1-CreateVirtioScsiTargetRequest"></a>

### CreateVirtioScsiTargetRequest
Represents a request to create an Virtio Scsi Target.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| virtio_scsi_target | [VirtioScsiTarget](#opi_api-storage-v1-VirtioScsiTarget) |  | The Virtio Scsi Target to be created. |
| virtio_scsi_target_id | [string](#string) |  | An optional ID to assign to the Virtio Scsi Target. If this is not provided the system will auto-generate it. |






<a name="opi_api-storage-v1-DeleteVirtioScsiControllerRequest"></a>

### DeleteVirtioScsiControllerRequest
Represents a request to delete an Virtio Scsi Controller.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-storage-v1-DeleteVirtioScsiLunRequest"></a>

### DeleteVirtioScsiLunRequest
Represents a request to delete an Virtio Scsi Lun.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-storage-v1-DeleteVirtioScsiTargetRequest"></a>

### DeleteVirtioScsiTargetRequest
Represents a request to delete an Virtio Scsi Target.


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






<a name="opi_api-storage-v1-StatsVirtioScsiControllerRequest"></a>

### StatsVirtioScsiControllerRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-StatsVirtioScsiControllerResponse"></a>

### StatsVirtioScsiControllerResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  |  |






<a name="opi_api-storage-v1-StatsVirtioScsiLunRequest"></a>

### StatsVirtioScsiLunRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| controller_name_ref | [string](#string) |  |  |






<a name="opi_api-storage-v1-StatsVirtioScsiLunResponse"></a>

### StatsVirtioScsiLunResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  |  |






<a name="opi_api-storage-v1-StatsVirtioScsiTargetRequest"></a>

### StatsVirtioScsiTargetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-StatsVirtioScsiTargetResponse"></a>

### StatsVirtioScsiTargetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  |  |






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






<a name="opi_api-storage-v1-VirtioScsiLun"></a>

### VirtioScsiLun



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | name is an opaque object handle that is not user settable. name will be returned with created object user can only set {resource}_id on the Create request object |
| target_name_ref | [string](#string) |  | The target that this LUN is in |
| volume_name_ref | [string](#string) |  | The middle/back-end volume for this LLUN |






<a name="opi_api-storage-v1-VirtioScsiTarget"></a>

### VirtioScsiTarget



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | name is an opaque object handle that is not user settable. name will be returned with created object user can only set {resource}_id on the Create request object |
| max_luns | [int32](#int32) |  | maximum LUNs within a target |





 

 

 


<a name="opi_api-storage-v1-FrontendVirtioScsiService"></a>

### FrontendVirtioScsiService
Front End (host-facing) APIs. Mostly used for Virtio-scsi emulation and host presentation as alternative to Virtio-blk.

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| CreateVirtioScsiTarget | [CreateVirtioScsiTargetRequest](#opi_api-storage-v1-CreateVirtioScsiTargetRequest) | [VirtioScsiTarget](#opi_api-storage-v1-VirtioScsiTarget) | Create an Virtio Scsi Target |
| DeleteVirtioScsiTarget | [DeleteVirtioScsiTargetRequest](#opi_api-storage-v1-DeleteVirtioScsiTargetRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) | Delete an Virtio Scsi Target |
| UpdateVirtioScsiTarget | [UpdateVirtioScsiTargetRequest](#opi_api-storage-v1-UpdateVirtioScsiTargetRequest) | [VirtioScsiTarget](#opi_api-storage-v1-VirtioScsiTarget) | Update an Virtio Scsi Target |
| ListVirtioScsiTargets | [ListVirtioScsiTargetsRequest](#opi_api-storage-v1-ListVirtioScsiTargetsRequest) | [ListVirtioScsiTargetsResponse](#opi_api-storage-v1-ListVirtioScsiTargetsResponse) | List Virtio Scsi Targets |
| GetVirtioScsiTarget | [GetVirtioScsiTargetRequest](#opi_api-storage-v1-GetVirtioScsiTargetRequest) | [VirtioScsiTarget](#opi_api-storage-v1-VirtioScsiTarget) | Get an Virtio Scsi Target |
| StatsVirtioScsiTarget | [StatsVirtioScsiTargetRequest](#opi_api-storage-v1-StatsVirtioScsiTargetRequest) | [StatsVirtioScsiTargetResponse](#opi_api-storage-v1-StatsVirtioScsiTargetResponse) | Get an Virtio Scsi Target statistics |
| CreateVirtioScsiController | [CreateVirtioScsiControllerRequest](#opi_api-storage-v1-CreateVirtioScsiControllerRequest) | [VirtioScsiController](#opi_api-storage-v1-VirtioScsiController) | Create an Virtio Scsi Controller |
| DeleteVirtioScsiController | [DeleteVirtioScsiControllerRequest](#opi_api-storage-v1-DeleteVirtioScsiControllerRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) | Delete an Virtio Scsi Controller |
| UpdateVirtioScsiController | [UpdateVirtioScsiControllerRequest](#opi_api-storage-v1-UpdateVirtioScsiControllerRequest) | [VirtioScsiController](#opi_api-storage-v1-VirtioScsiController) | Update an Virtio Scsi Controller |
| ListVirtioScsiControllers | [ListVirtioScsiControllersRequest](#opi_api-storage-v1-ListVirtioScsiControllersRequest) | [ListVirtioScsiControllersResponse](#opi_api-storage-v1-ListVirtioScsiControllersResponse) | List Virtio Scsi Controllers |
| GetVirtioScsiController | [GetVirtioScsiControllerRequest](#opi_api-storage-v1-GetVirtioScsiControllerRequest) | [VirtioScsiController](#opi_api-storage-v1-VirtioScsiController) | Get an Virtio Scsi Controller |
| StatsVirtioScsiController | [StatsVirtioScsiControllerRequest](#opi_api-storage-v1-StatsVirtioScsiControllerRequest) | [StatsVirtioScsiControllerResponse](#opi_api-storage-v1-StatsVirtioScsiControllerResponse) | Get an Virtio Scsi Controller statistics |
| CreateVirtioScsiLun | [CreateVirtioScsiLunRequest](#opi_api-storage-v1-CreateVirtioScsiLunRequest) | [VirtioScsiLun](#opi_api-storage-v1-VirtioScsiLun) | Create an Virtio Scsi Lun |
| DeleteVirtioScsiLun | [DeleteVirtioScsiLunRequest](#opi_api-storage-v1-DeleteVirtioScsiLunRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) | Delete an Virtio Scsi Lun |
| UpdateVirtioScsiLun | [UpdateVirtioScsiLunRequest](#opi_api-storage-v1-UpdateVirtioScsiLunRequest) | [VirtioScsiLun](#opi_api-storage-v1-VirtioScsiLun) | Update an Virtio Scsi Lun |
| ListVirtioScsiLuns | [ListVirtioScsiLunsRequest](#opi_api-storage-v1-ListVirtioScsiLunsRequest) | [ListVirtioScsiLunsResponse](#opi_api-storage-v1-ListVirtioScsiLunsResponse) | List Virtio Scsi Luns |
| GetVirtioScsiLun | [GetVirtioScsiLunRequest](#opi_api-storage-v1-GetVirtioScsiLunRequest) | [VirtioScsiLun](#opi_api-storage-v1-VirtioScsiLun) | Get an Virtio Scsi Lun |
| StatsVirtioScsiLun | [StatsVirtioScsiLunRequest](#opi_api-storage-v1-StatsVirtioScsiLunRequest) | [StatsVirtioScsiLunResponse](#opi_api-storage-v1-StatsVirtioScsiLunResponse) | Get an Virtio Scsi Lun statistics |

 



<a name="middleend_encryption-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## middleend_encryption.proto



<a name="opi_api-storage-v1-CreateEncryptedVolumeRequest"></a>

### CreateEncryptedVolumeRequest
Represents a request to create an Encrypted Volume.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| encrypted_volume | [EncryptedVolume](#opi_api-storage-v1-EncryptedVolume) |  | The Encrypted Volume to be created. |
| encrypted_volume_id | [string](#string) |  | An optional ID to assign to the Encrypted Volume. If this is not provided the system will auto-generate it. |






<a name="opi_api-storage-v1-DeleteEncryptedVolumeRequest"></a>

### DeleteEncryptedVolumeRequest
Represents a request to delete an Encrypted Volume.


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






<a name="opi_api-storage-v1-StatsEncryptedVolumeRequest"></a>

### StatsEncryptedVolumeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-StatsEncryptedVolumeResponse"></a>

### StatsEncryptedVolumeResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  |  |






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
| CreateEncryptedVolume | [CreateEncryptedVolumeRequest](#opi_api-storage-v1-CreateEncryptedVolumeRequest) | [EncryptedVolume](#opi_api-storage-v1-EncryptedVolume) | Create an Encrypted Volume |
| DeleteEncryptedVolume | [DeleteEncryptedVolumeRequest](#opi_api-storage-v1-DeleteEncryptedVolumeRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) | Delete an Encrypted Volume |
| UpdateEncryptedVolume | [UpdateEncryptedVolumeRequest](#opi_api-storage-v1-UpdateEncryptedVolumeRequest) | [EncryptedVolume](#opi_api-storage-v1-EncryptedVolume) | Update an Encrypted Volume |
| ListEncryptedVolumes | [ListEncryptedVolumesRequest](#opi_api-storage-v1-ListEncryptedVolumesRequest) | [ListEncryptedVolumesResponse](#opi_api-storage-v1-ListEncryptedVolumesResponse) | List Encrypted Volumes |
| GetEncryptedVolume | [GetEncryptedVolumeRequest](#opi_api-storage-v1-GetEncryptedVolumeRequest) | [EncryptedVolume](#opi_api-storage-v1-EncryptedVolume) | Get an Encrypted Volume |
| StatsEncryptedVolume | [StatsEncryptedVolumeRequest](#opi_api-storage-v1-StatsEncryptedVolumeRequest) | [StatsEncryptedVolumeResponse](#opi_api-storage-v1-StatsEncryptedVolumeResponse) | Get an Encrypted Volume statistics |

 



<a name="middleend_qos_volume-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## middleend_qos_volume.proto



<a name="opi_api-storage-v1-CreateQosVolumeRequest"></a>

### CreateQosVolumeRequest
Represents a request to create an QoS Volume.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| qos_volume | [QosVolume](#opi_api-storage-v1-QosVolume) |  | The QoS Volume to be created. |
| qos_volume_id | [string](#string) |  | An optional ID to assign to the QoS Volume. If this is not provided the system will auto-generate it. |






<a name="opi_api-storage-v1-DeleteQosVolumeRequest"></a>

### DeleteQosVolumeRequest
Represents a request to delete an Encrypted Volume.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-storage-v1-GetQosVolumeRequest"></a>

### GetQosVolumeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-Limits"></a>

### Limits



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| min | [QosLimit](#opi_api-storage-v1-QosLimit) |  |  |
| max | [QosLimit](#opi_api-storage-v1-QosLimit) |  |  |






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
| volume_name_ref | [string](#string) |  | Middleend/backend volume to apply QoS on |
| limits | [Limits](#opi_api-storage-v1-Limits) |  | At least one limit value should be set, oitherwise volume does not make sense. AIP-203 says that a field should be described as REQUIRED if it is a field on a resource that a user provides somewhere as input. In this case, the resource is only valid if a &#34;truthy&#34; value is stored. &#34;truthy&#34; is defined as: * For primitives, values other than 0, 0.0, empty string/bytes, and false * For repeated fields maps, values with at least one entry * For messages, any message with at least one &#34;truthy&#34; field. We cannot mark both min and max QosLimit as REQUIRED directly here, since it forces one limit field is set on both. Limits message is added to overcome it. REQUIRED on limits forces at least one limit field in either min/max sub message is set. |






<a name="opi_api-storage-v1-StatsQosVolumeRequest"></a>

### StatsQosVolumeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="opi_api-storage-v1-StatsQosVolumeResponse"></a>

### StatsQosVolumeResponse



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
| CreateQosVolume | [CreateQosVolumeRequest](#opi_api-storage-v1-CreateQosVolumeRequest) | [QosVolume](#opi_api-storage-v1-QosVolume) | Create an Qos Volume |
| DeleteQosVolume | [DeleteQosVolumeRequest](#opi_api-storage-v1-DeleteQosVolumeRequest) | [.google.protobuf.Empty](#google-protobuf-Empty) | Delete an Qos Volume |
| UpdateQosVolume | [UpdateQosVolumeRequest](#opi_api-storage-v1-UpdateQosVolumeRequest) | [QosVolume](#opi_api-storage-v1-QosVolume) | Update an Qos Volume |
| ListQosVolumes | [ListQosVolumesRequest](#opi_api-storage-v1-ListQosVolumesRequest) | [ListQosVolumesResponse](#opi_api-storage-v1-ListQosVolumesResponse) | List Qos Volumes |
| GetQosVolume | [GetQosVolumeRequest](#opi_api-storage-v1-GetQosVolumeRequest) | [QosVolume](#opi_api-storage-v1-QosVolume) | Get an Qos Volume |
| StatsQosVolume | [StatsQosVolumeRequest](#opi_api-storage-v1-StatsQosVolumeRequest) | [StatsQosVolumeResponse](#opi_api-storage-v1-StatsQosVolumeResponse) | Get an Qos Volume statistics |

 



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
| port_id | [google.protobuf.Int32Value](#google-protobuf-Int32Value) |  | The &#34;port&#34; or &#34;device&#34;. In other words, the connector/cable that&#39;s plugged into a particular host. This number may end up matching the host-assigned &#34;device&#34; value in the bus:device:function identifier, but it does not strictly have to and that should not be relied upon. |
| physical_function | [google.protobuf.Int32Value](#google-protobuf-Int32Value) |  | Physical function index. This may end up matching the host-assigned &#34;function&#34; value in the bus:device:function identifier, but it does not strictly have to and that should not be relied upon. |
| virtual_function | [google.protobuf.Int32Value](#google-protobuf-Int32Value) |  | Virtual function index. 1-based index. The value 0 is reserved to represent the PCI physical &#34;device&#34;. This may end up matching the host-assigned &#34;function&#34; value in the bus:device:function identifier, but it does not strictly have to and that should not be relied upon. |






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

