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
  
- [backend_nvme.proto](#backend_nvme-proto)
    - [CreateNvmePathRequest](#opi_api-storage-v1-CreateNvmePathRequest)
    - [CreateNvmeRemoteControllerRequest](#opi_api-storage-v1-CreateNvmeRemoteControllerRequest)
    - [DeleteNvmePathRequest](#opi_api-storage-v1-DeleteNvmePathRequest)
    - [DeleteNvmeRemoteControllerRequest](#opi_api-storage-v1-DeleteNvmeRemoteControllerRequest)
    - [FabricsPath](#opi_api-storage-v1-FabricsPath)
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
    - [TcpController](#opi_api-storage-v1-TcpController)
    - [UpdateNvmePathRequest](#opi_api-storage-v1-UpdateNvmePathRequest)
    - [UpdateNvmeRemoteControllerRequest](#opi_api-storage-v1-UpdateNvmeRemoteControllerRequest)
  
    - [NvmeMultipath](#opi_api-storage-v1-NvmeMultipath)
  
    - [NvmeRemoteControllerService](#opi_api-storage-v1-NvmeRemoteControllerService)
  
- [frontend_nvme.proto](#frontend_nvme-proto)
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
  
    - [NvmeNamespaceStatus.OperState](#opi_api-storage-v1-NvmeNamespaceStatus-OperState)
    - [NvmeNamespaceStatus.State](#opi_api-storage-v1-NvmeNamespaceStatus-State)
  
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
    - [FabricsEndpoint](#opi_api-storage-v1-FabricsEndpoint)
    - [PciEndpoint](#opi_api-storage-v1-PciEndpoint)
    - [QosLimit](#opi_api-storage-v1-QosLimit)
    - [VolumeStats](#opi_api-storage-v1-VolumeStats)
  
    - [EncryptionType](#opi_api-storage-v1-EncryptionType)
    - [NvmeAddressFamily](#opi_api-storage-v1-NvmeAddressFamily)
    - [NvmeTransportType](#opi_api-storage-v1-NvmeTransportType)
  
- [Scalar Value Types](#scalar-value-types)



<a name="backend_aio-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## backend_aio.proto



<a name="opi_api-storage-v1-AioVolume"></a>

### AioVolume
Volume represented by Linux kernel block device or a file on a Linux filesystem


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | name is an opaque object handle that is not user settable. name will be returned with created object user can only set {resource}_id on the Create request object |
| block_size | [int64](#int64) |  | The size of each block in the AioVolume. |
| blocks_count | [int64](#int64) |  | The total number of blocks in the AioVolume. |
| uuid | [string](#string) |  | The UUID (Universally Unique Identifier) of the AioVolume. |
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
Represents a request to delete an Aio Volume.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Object&#39;s unique identifier to delete |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-storage-v1-GetAioVolumeRequest"></a>

### GetAioVolumeRequest
Represents a request to get an Aio Volume.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Object&#39;s unique identifier to retrieve |






<a name="opi_api-storage-v1-ListAioVolumesRequest"></a>

### ListAioVolumesRequest
Represents a request to list all Aio Volumes.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| page_size | [int32](#int32) |  | page size of list request |
| page_token | [string](#string) |  | page token of list request |






<a name="opi_api-storage-v1-ListAioVolumesResponse"></a>

### ListAioVolumesResponse
Represents a response to list all Aio Volumes.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| aio_volumes | [AioVolume](#opi_api-storage-v1-AioVolume) | repeated | List of Aio volumes |
| next_page_token | [string](#string) |  | Next page token of list response |






<a name="opi_api-storage-v1-StatsAioVolumeRequest"></a>

### StatsAioVolumeRequest
Represents a request to get an Aio Volume statistics.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Object&#39;s unique identifier to retrieve statistics |






<a name="opi_api-storage-v1-StatsAioVolumeResponse"></a>

### StatsAioVolumeResponse
Represents a response to get an Aio Volume statistics.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  | Volume statistics |






<a name="opi_api-storage-v1-UpdateAioVolumeRequest"></a>

### UpdateAioVolumeRequest
Represents a request to update an Aio Volume.


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
| name | [string](#string) |  | Object&#39;s unique identifier to delete |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-storage-v1-GetNullVolumeRequest"></a>

### GetNullVolumeRequest
Represents a request to get an Null Volume.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Object&#39;s unique identifier to retrieve |






<a name="opi_api-storage-v1-ListNullVolumesRequest"></a>

### ListNullVolumesRequest
Represents a request to list all Null Volumes.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| page_size | [int32](#int32) |  | page size of list request |
| page_token | [string](#string) |  | page token of list request |






<a name="opi_api-storage-v1-ListNullVolumesResponse"></a>

### ListNullVolumesResponse
Represents a response to list all Null Volumes.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| null_volumes | [NullVolume](#opi_api-storage-v1-NullVolume) | repeated | List of Null volumes |
| next_page_token | [string](#string) |  | Next page token of list response |






<a name="opi_api-storage-v1-NullVolume"></a>

### NullVolume
Null volume which discards writes and returns random reads


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | name is an opaque object handle that is not user settable. name will be returned with created object user can only set {resource}_id on the Create request object |
| block_size | [int64](#int64) |  | The block size of the NullVolume. This field is required. |
| blocks_count | [int64](#int64) |  | The number of blocks in the NullVolume. This field is required. |
| uuid | [string](#string) |  | The UUID of the NullVolume. This field is optional. |






<a name="opi_api-storage-v1-StatsNullVolumeRequest"></a>

### StatsNullVolumeRequest
Represents a request to get an Null Volume statistics.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Object&#39;s unique identifier to retrieve statistics |






<a name="opi_api-storage-v1-StatsNullVolumeResponse"></a>

### StatsNullVolumeResponse
Represents a response to get an Null Volume statistics.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  | Volume statistics |






<a name="opi_api-storage-v1-UpdateNullVolumeRequest"></a>

### UpdateNullVolumeRequest
Represents a request to update an Null Volume.


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

 



<a name="backend_nvme-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## backend_nvme.proto



<a name="opi_api-storage-v1-CreateNvmePathRequest"></a>

### CreateNvmePathRequest
Represents a request to create an Nvme Path.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | Parent&#39;s remote controller unique identifier |
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
(-- api-linter: core::0135::force-field=disabled
    aip.dev/not-precedent: disabled since cascade deleting is a dangerous
                           operation and we want to force a user to delete
                           all child resources(paths) on
                           its own --)
Represents a request to delete an Nvme Remote Controller.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Object&#39;s unique identifier to delete |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-storage-v1-FabricsPath"></a>

### FabricsPath
Represents Fabrics transport path parameters


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| trsvcid | [int64](#int64) |  | Destination service id (e.g. Port) |
| subnqn | [string](#string) |  | Subsystem NQN |
| adrfam | [NvmeAddressFamily](#opi_api-storage-v1-NvmeAddressFamily) |  | Address family |
| source_traddr | [string](#string) |  | Source address (e.g. IP of local NIC) |
| source_trsvcid | [int64](#int64) |  | Source port (e.g. Port of local NIC) |
| hostnqn | [string](#string) |  | Host NQN |






<a name="opi_api-storage-v1-GetNvmePathRequest"></a>

### GetNvmePathRequest
Represents a request to get an Nvme Path.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Object&#39;s unique identifier to retrieve |






<a name="opi_api-storage-v1-GetNvmeRemoteControllerRequest"></a>

### GetNvmeRemoteControllerRequest
Represents a request to get an Nvme Remote Controller.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Object&#39;s unique identifier to retrieve |






<a name="opi_api-storage-v1-GetNvmeRemoteNamespaceRequest"></a>

### GetNvmeRemoteNamespaceRequest
Represents a request to get an Nvme Remote Namespace.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Object&#39;s unique identifier to retrieve |






<a name="opi_api-storage-v1-ListNvmePathsRequest"></a>

### ListNvmePathsRequest
Represents a request to list all Nvme Paths.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | Parent&#39;s object unique identifier |
| page_size | [int32](#int32) |  | page size of list request |
| page_token | [string](#string) |  | page token of list request |






<a name="opi_api-storage-v1-ListNvmePathsResponse"></a>

### ListNvmePathsResponse
Represents a response to list all Nvme Paths.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nvme_paths | [NvmePath](#opi_api-storage-v1-NvmePath) | repeated | List of Nvme Paths |
| next_page_token | [string](#string) |  | Next page token of list response |






<a name="opi_api-storage-v1-ListNvmeRemoteControllersRequest"></a>

### ListNvmeRemoteControllersRequest
Represents a request to list all Nvme Remote Controllers.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| page_size | [int32](#int32) |  | page size of list request |
| page_token | [string](#string) |  | page token of list request |






<a name="opi_api-storage-v1-ListNvmeRemoteControllersResponse"></a>

### ListNvmeRemoteControllersResponse
Represents a response to list all Nvme Remote Controllers.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nvme_remote_controllers | [NvmeRemoteController](#opi_api-storage-v1-NvmeRemoteController) | repeated | List of Nvme Remote Controllers |
| next_page_token | [string](#string) |  | Next page token of list response |






<a name="opi_api-storage-v1-ListNvmeRemoteNamespacesRequest"></a>

### ListNvmeRemoteNamespacesRequest
Represents a request to list all Nvme Remote Namespaces.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | The controller&#39;s unique object identifier. This lists namespaces for a particular controller. |
| page_size | [int32](#int32) |  | page size of list request |
| page_token | [string](#string) |  | page token of list request |






<a name="opi_api-storage-v1-ListNvmeRemoteNamespacesResponse"></a>

### ListNvmeRemoteNamespacesResponse
Represents a response to list all Nvme Remote Namespaces.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nvme_remote_namespaces | [NvmeRemoteNamespace](#opi_api-storage-v1-NvmeRemoteNamespace) | repeated | List of Remote Namespaces |
| next_page_token | [string](#string) |  | Next page token of list response |






<a name="opi_api-storage-v1-NvmePath"></a>

### NvmePath
Represents a specific path to target controller


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | name is an opaque object handle that is not user settable. name will be returned with created object user can only set {resource}_id on the Create request object |
| trtype | [NvmeTransportType](#opi_api-storage-v1-NvmeTransportType) |  | Transport type |
| traddr | [string](#string) |  | Destination address (e.g. IP address, BDF for local PCIe) |
| fabrics | [FabricsPath](#opi_api-storage-v1-FabricsPath) |  | Not applicable for local PCIe. Required for Nvme over fabrics transport types |






<a name="opi_api-storage-v1-NvmeRemoteController"></a>

### NvmeRemoteController
Represents a target controller


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | name is an opaque object handle that is not user settable. name will be returned with created object user can only set {resource}_id on the Create request object |
| multipath | [NvmeMultipath](#opi_api-storage-v1-NvmeMultipath) |  | Multipath mode |
| io_queues_count | [int64](#int64) |  | IO queues count |
| queue_size | [int64](#int64) |  | Queue size |
| tcp | [TcpController](#opi_api-storage-v1-TcpController) |  | Nvme over TCP specific fields |






<a name="opi_api-storage-v1-NvmeRemoteNamespace"></a>

### NvmeRemoteNamespace
Represent Nvme namespace created on bridge after connection to a target


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | name is an opaque object handle that is not user settable. name will be returned with created object user can only set {resource}_id on the Create request object |
| nsid | [int32](#int32) |  | NSID |
| nguid | [string](#string) |  | Globally unique identifier for the namespace |
| eui64 | [int64](#int64) |  | 64bit Extended unique identifier for the namespace mandatory if guid is not specified |
| uuid | [string](#string) |  | Globally unique identifier for the namespace |






<a name="opi_api-storage-v1-ResetNvmeRemoteControllerRequest"></a>

### ResetNvmeRemoteControllerRequest
Represents a request to reset an Nvme Remote Controller.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Object&#39;s unique identifier to reset |






<a name="opi_api-storage-v1-StatsNvmePathRequest"></a>

### StatsNvmePathRequest
Represents a request to get an Nvme Path statistics.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Object&#39;s unique identifier to retrieve statistics |






<a name="opi_api-storage-v1-StatsNvmePathResponse"></a>

### StatsNvmePathResponse
Represents a response to get an Nvme Path statistics.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  | Path statistics |






<a name="opi_api-storage-v1-StatsNvmeRemoteControllerRequest"></a>

### StatsNvmeRemoteControllerRequest
Represents a request to get an Nvme Remote Controller statistics.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Object&#39;s unique identifier to retrieve statistics |






<a name="opi_api-storage-v1-StatsNvmeRemoteControllerResponse"></a>

### StatsNvmeRemoteControllerResponse
Represents a response to get an Nvme Remote Controller statistics.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  | Controller statistics |






<a name="opi_api-storage-v1-TcpController"></a>

### TcpController
Represents parameters specific for TCP target controller


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| hdgst | [bool](#bool) |  | Header digest |
| ddgst | [bool](#bool) |  | Data digest |
| psk | [bytes](#bytes) |  | Nvme/TCP published secure channel specification (TP 8011) based on TLS 1.3 and PSK. Use PSK interchange format with base64 encoding as input. Also use information about hash function in interchange format for retained PSK generation. If no hash is selected, use configured PSK as retained PSK. Check the size of interchange PSK to determine cipher suite. Calculate CRC-32 bytes to ensure validity of PSK. Example: &#34;NVMeTLSkey-1:01:VRLbtnN9AQb2WXW3c9&#43;wEf/DRLz0QuLdbYvEhwtdWwNf9LrZ:&#34; if PSK field is empty, then unsecure connection Nvme/TCP without TLS will be made |






<a name="opi_api-storage-v1-UpdateNvmePathRequest"></a>

### UpdateNvmePathRequest
Represents a request to update an Nvme Path.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nvme_path | [NvmePath](#opi_api-storage-v1-NvmePath) |  | The object&#39;s `name` field is used to identify the object to be updated. |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | The list of fields to update. |
| allow_missing | [bool](#bool) |  | If set to true, and the object is not found, a new object will be created. In this situation, `update_mask` is ignored. |






<a name="opi_api-storage-v1-UpdateNvmeRemoteControllerRequest"></a>

### UpdateNvmeRemoteControllerRequest
Represents a request to update an Nvme Remote Controller.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nvme_remote_controller | [NvmeRemoteController](#opi_api-storage-v1-NvmeRemoteController) |  | The object&#39;s `name` field is used to identify the object to be updated. |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | The list of fields to update. |
| allow_missing | [bool](#bool) |  | If set to true, and the object is not found, a new object will be created. In this situation, `update_mask` is ignored. |





 


<a name="opi_api-storage-v1-NvmeMultipath"></a>

### NvmeMultipath
Multipath mode value options

| Name | Number | Description |
| ---- | ------ | ----------- |
| NVME_MULTIPATH_UNSPECIFIED | 0 | Multipath mode is not specified |
| NVME_MULTIPATH_DISABLE | 1 | Multipathing is disabled |
| NVME_MULTIPATH_FAILOVER | 2 | Failover mode where only one active connection is maintained and path is changed only at switch-over |
| NVME_MULTIPATH_MULTIPATH | 3 | Multipath mode where active connections are maintained for every path |


 

 


<a name="opi_api-storage-v1-NvmeRemoteControllerService"></a>

### NvmeRemoteControllerService
Back End APIs. Responsible for connection to external Nvme devices
e.g. connection to Nvme/TCP Nvme/RDMA and local Nvme/Pcie ssds

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

 



<a name="frontend_nvme-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## frontend_nvme.proto



<a name="opi_api-storage-v1-CreateNvmeControllerRequest"></a>

### CreateNvmeControllerRequest
Represents a request to create an Nvme Controller.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | Parent&#39;s subsystem unique identifier |
| nvme_controller | [NvmeController](#opi_api-storage-v1-NvmeController) |  | The Nvme Controller to be created |
| nvme_controller_id | [string](#string) |  | An optional ID to assign to the Nvme Controller. If this is not provided the system will auto-generate it. |






<a name="opi_api-storage-v1-CreateNvmeNamespaceRequest"></a>

### CreateNvmeNamespaceRequest
Represents a request to create an Nvme Namespace.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | Parent&#39;s subsystem unique identifier |
| nvme_namespace | [NvmeNamespace](#opi_api-storage-v1-NvmeNamespace) |  | The Nvme Namespace to be created |
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
| name | [string](#string) |  | Object&#39;s unique identifier to delete |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-storage-v1-DeleteNvmeNamespaceRequest"></a>

### DeleteNvmeNamespaceRequest
Represents a request to delete an Nvme Namespace.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Object&#39;s unique identifier to delete |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-storage-v1-DeleteNvmeSubsystemRequest"></a>

### DeleteNvmeSubsystemRequest
(-- api-linter: core::0135::force-field=disabled
    aip.dev/not-precedent: disabled since cascade deleting is a dangerous
                           operation and we want to force a user to delete
                           all child resources(controllers and namespaces) on
                           its own --)
Represents a request to delete an Nvme Subsystem.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Object&#39;s unique identifier to delete |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-storage-v1-GetNvmeControllerRequest"></a>

### GetNvmeControllerRequest
Represents a request to get an Nvme Controller.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Object&#39;s unique identifier to retrieve |






<a name="opi_api-storage-v1-GetNvmeNamespaceRequest"></a>

### GetNvmeNamespaceRequest
Represents a request to get an Nvme Namespace.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Object&#39;s unique identifier to retrieve |






<a name="opi_api-storage-v1-GetNvmeSubsystemRequest"></a>

### GetNvmeSubsystemRequest
Represents a request to get an Nvme Subsystem.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Object&#39;s unique identifier to retrieve |






<a name="opi_api-storage-v1-ListNvmeControllersRequest"></a>

### ListNvmeControllersRequest
Represents a request to list all Nvme Controllers.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | Parent&#39;s subsystem unique identifier |
| page_size | [int32](#int32) |  | page size of list request |
| page_token | [string](#string) |  | page token of list request |






<a name="opi_api-storage-v1-ListNvmeControllersResponse"></a>

### ListNvmeControllersResponse
Represents a response to list all Nvme Controllers.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nvme_controllers | [NvmeController](#opi_api-storage-v1-NvmeController) | repeated | List of Nvme controllers |
| next_page_token | [string](#string) |  | Next page token of list response |






<a name="opi_api-storage-v1-ListNvmeNamespacesRequest"></a>

### ListNvmeNamespacesRequest
Represents a request to list all Nvme Namespaces.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | Parent&#39;s subsystem unique identifier |
| page_size | [int32](#int32) |  | page size of list request |
| page_token | [string](#string) |  | page token of list request |






<a name="opi_api-storage-v1-ListNvmeNamespacesResponse"></a>

### ListNvmeNamespacesResponse
Represents a response to list all Nvme Namespaces.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nvme_namespaces | [NvmeNamespace](#opi_api-storage-v1-NvmeNamespace) | repeated | List of Nvme Namespaces |
| next_page_token | [string](#string) |  | Next page token of list response |






<a name="opi_api-storage-v1-ListNvmeSubsystemsRequest"></a>

### ListNvmeSubsystemsRequest
Represents a request to list all Nvme Subsystems.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| page_size | [int32](#int32) |  | page size of list request |
| page_token | [string](#string) |  | page token of list request |






<a name="opi_api-storage-v1-ListNvmeSubsystemsResponse"></a>

### ListNvmeSubsystemsResponse
Represents a response to list all Nvme Subsystems.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nvme_subsystems | [NvmeSubsystem](#opi_api-storage-v1-NvmeSubsystem) | repeated | List of Nvme Subsystems |
| next_page_token | [string](#string) |  | Next page token of list response |






<a name="opi_api-storage-v1-NvmeController"></a>

### NvmeController
Represents Nvme Controller


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | name is an opaque object handle that is not user settable. name will be returned with created object user can only set {resource}_id on the Create request object |
| spec | [NvmeControllerSpec](#opi_api-storage-v1-NvmeControllerSpec) |  | spec holds configurable values |
| status | [NvmeControllerStatus](#opi_api-storage-v1-NvmeControllerStatus) |  | status holds server generated values |






<a name="opi_api-storage-v1-NvmeControllerSpec"></a>

### NvmeControllerSpec
Represents Nvme Controller configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nvme_controller_id | [int32](#int32) | optional | subsystem controller id range: 0 to 65535. must not be reused under the same subsystem |
| trtype | [NvmeTransportType](#opi_api-storage-v1-NvmeTransportType) |  | transport type |
| pcie_id | [PciEndpoint](#opi_api-storage-v1-PciEndpoint) |  | Required for pcie transport type to expose emulated Pcie Nvme controllers to Host |
| fabrics_id | [FabricsEndpoint](#opi_api-storage-v1-FabricsEndpoint) |  | Required for Nvme over fabrics transport types to create Nvme over Fabrics controllers to expose for example local SSDs over a network |
| max_nsq | [int32](#int32) |  | maximum number of host submission queues allowed. If not set, the xPU will provide a default. |
| max_ncq | [int32](#int32) |  | maximum number of host completion queues allowed. If not set, the xPU will provide a default. |
| sqes | [int32](#int32) |  | maximum number of submission queue entries per submission queue, as a power of 2. default value as per spec is 6 |
| cqes | [int32](#int32) |  | maximum number of completion queue entries per completion queue, as a power of 2. default value as per spec is 4 |
| max_namespaces | [int32](#int32) |  | maximum Number of namespaces that will be provisioned under the controller. |
| min_limit | [QosLimit](#opi_api-storage-v1-QosLimit) |  | min QoS limits for the controller |
| max_limit | [QosLimit](#opi_api-storage-v1-QosLimit) |  | max QoS limits for the controller |






<a name="opi_api-storage-v1-NvmeControllerStatus"></a>

### NvmeControllerStatus
Represents Nvme Controller status


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| active | [bool](#bool) |  | Device is in use by host nvme driver |






<a name="opi_api-storage-v1-NvmeNamespace"></a>

### NvmeNamespace
Represents Nvme Namespace


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | name is an opaque object handle that is not user settable. name will be returned with created object user can only set {resource}_id on the Create request object |
| spec | [NvmeNamespaceSpec](#opi_api-storage-v1-NvmeNamespaceSpec) |  | spec holds configurable values |
| status | [NvmeNamespaceStatus](#opi_api-storage-v1-NvmeNamespaceStatus) |  | status holds server generated values |






<a name="opi_api-storage-v1-NvmeNamespaceSpec"></a>

### NvmeNamespaceSpec
Represents Nvme Namespace configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| host_nsid | [int32](#int32) |  | NSID presented by the Nvme controller. If not provided, then the controller will assign an unused NSID within the max namespace range - auto assigned nsid may not work for live migration |
| nguid | [string](#string) |  | Globally unique identifier for the namespace |
| eui64 | [int64](#int64) |  | 64bit Extended unique identifier for the namespace mandatory if guid is not specified |
| uuid | [string](#string) |  | Globally unique identifier for the namespace |
| volume_name_ref | [string](#string) |  | The back/middle-end volume to back this namespace. |






<a name="opi_api-storage-v1-NvmeNamespaceStatus"></a>

### NvmeNamespaceStatus
Represents Nvme Namespace status


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| state | [NvmeNamespaceStatus.State](#opi_api-storage-v1-NvmeNamespaceStatus-State) |  | State of the namespace object, (enabled, disable, deleting) |
| oper_state | [NvmeNamespaceStatus.OperState](#opi_api-storage-v1-NvmeNamespaceStatus-OperState) |  | Operational state of the namespace object, (connected, disconnected) |






<a name="opi_api-storage-v1-NvmeSubsystem"></a>

### NvmeSubsystem
Represents Nvme Subsystem


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | name is an opaque object handle that is not user settable. name will be returned with created object user can only set {resource}_id on the Create request object |
| spec | [NvmeSubsystemSpec](#opi_api-storage-v1-NvmeSubsystemSpec) |  | spec holds configurable values |
| status | [NvmeSubsystemStatus](#opi_api-storage-v1-NvmeSubsystemStatus) |  | status holds server generated values |






<a name="opi_api-storage-v1-NvmeSubsystemSpec"></a>

### NvmeSubsystemSpec
Represents Nvme Subsystem configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nqn | [string](#string) |  | Nvme subsystem NQN to which the controller belongs Refer to the NQN format in the Nvme base specifications, must not exceed &#39;NSV_NVME_SUBSYSTEM_NQN_LEN&#39; bytes |
| serial_number | [string](#string) |  | serial number must not exceed &#39;NSV_CTRLR_SERIAL_NO_LEN&#39; bytes |
| model_number | [string](#string) |  | model number, must not exceed &#39;NSV_CTRLR_MODEL_NO_LEN&#39; bytes |
| max_namespaces | [int64](#int64) |  | maximum namespaces within a subsystem |
| hostnqn | [string](#string) |  | host NQN |
| psk | [bytes](#bytes) |  | psk key for TCP transport |






<a name="opi_api-storage-v1-NvmeSubsystemStatus"></a>

### NvmeSubsystemStatus
Represents Nvme Subsystem status


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| firmware_revision | [string](#string) |  | firmware revision, must not exceed &#39;NSV_CTRLR_FW_REV_LEN&#39; |
| fru_guid | [bytes](#bytes) |  | FRU identfier, 16bytes opaque identity for the type of unit |






<a name="opi_api-storage-v1-StatsNvmeControllerRequest"></a>

### StatsNvmeControllerRequest
Represents a request to get an Nvme Controller statistics.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Object&#39;s unique identifier to retrieve statistics |






<a name="opi_api-storage-v1-StatsNvmeControllerResponse"></a>

### StatsNvmeControllerResponse
Represents a response to get an Nvme Controller statistics.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  | Controller statistics |






<a name="opi_api-storage-v1-StatsNvmeNamespaceRequest"></a>

### StatsNvmeNamespaceRequest
Represents a request to get an Nvme Namespace statistics.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Object&#39;s unique identifier to retrieve statistics |






<a name="opi_api-storage-v1-StatsNvmeNamespaceResponse"></a>

### StatsNvmeNamespaceResponse
Represents a response to get an Nvme Namespace statistics.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  | Namespace statistics |






<a name="opi_api-storage-v1-StatsNvmeSubsystemRequest"></a>

### StatsNvmeSubsystemRequest
Represents a request to get an Nvme Subsystems statistics.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Object&#39;s unique identifier to retrieve statistics |






<a name="opi_api-storage-v1-StatsNvmeSubsystemResponse"></a>

### StatsNvmeSubsystemResponse
Represents a response to get an Nvme Subsystems statistics.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  | Subsystem statistics |






<a name="opi_api-storage-v1-UpdateNvmeControllerRequest"></a>

### UpdateNvmeControllerRequest
Represents a request to update an Nvme Controller.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nvme_controller | [NvmeController](#opi_api-storage-v1-NvmeController) |  | The object&#39;s `name` field is used to identify the object to be updated. |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | The list of fields to update. |
| allow_missing | [bool](#bool) |  | If set to true, and the object is not found, a new object will be created. In this situation, `update_mask` is ignored. |






<a name="opi_api-storage-v1-UpdateNvmeNamespaceRequest"></a>

### UpdateNvmeNamespaceRequest
Represents a request to update an Nvme Namespace.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nvme_namespace | [NvmeNamespace](#opi_api-storage-v1-NvmeNamespace) |  | The object&#39;s `name` field is used to identify the object to be updated. |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | The list of fields to update. |
| allow_missing | [bool](#bool) |  | If set to true, and the object is not found, a new object will be created. In this situation, `update_mask` is ignored. |






<a name="opi_api-storage-v1-UpdateNvmeSubsystemRequest"></a>

### UpdateNvmeSubsystemRequest
Represents a request to update an Nvme Subsystem.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nvme_subsystem | [NvmeSubsystem](#opi_api-storage-v1-NvmeSubsystem) |  | The object&#39;s `name` field is used to identify the object to be updated. |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | The list of fields to update. |
| allow_missing | [bool](#bool) |  | If set to true, and the object is not found, a new object will be created. In this situation, `update_mask` is ignored. |





 


<a name="opi_api-storage-v1-NvmeNamespaceStatus-OperState"></a>

### NvmeNamespaceStatus.OperState
Namespace operational states

| Name | Number | Description |
| ---- | ------ | ----------- |
| OPER_STATE_UNSPECIFIED | 0 | unspecified |
| OPER_STATE_ONLINE | 1 | namespace is online and operational |
| OPER_STATE_OFFLINE | 2 | namespace is offline |



<a name="opi_api-storage-v1-NvmeNamespaceStatus-State"></a>

### NvmeNamespaceStatus.State
Namespace Administrative States

| Name | Number | Description |
| ---- | ------ | ----------- |
| STATE_UNSPECIFIED | 0 | unspecified |
| STATE_DISABLED | 1 | namespace disabled state |
| STATE_ENABLED | 2 | namespace enabled state |
| STATE_DELETING | 3 | namespace being deleted |


 

 


<a name="opi_api-storage-v1-FrontendNvmeService"></a>

### FrontendNvmeService
Front End APIs. Used for creation of xPU managed Nvme devices
e.g. emulated host-facing Nvme/Pcie controllers as well as
Nvme-oF controllers

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
| name | [string](#string) |  | Object&#39;s unique identifier to delete |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-storage-v1-GetVirtioBlkRequest"></a>

### GetVirtioBlkRequest
Represents a request to get an Virtio Blk.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Object&#39;s unique identifier to retrieve |






<a name="opi_api-storage-v1-ListVirtioBlksRequest"></a>

### ListVirtioBlksRequest
Represents a request to list all Virtio Blks.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| page_size | [int32](#int32) |  | page size of list request |
| page_token | [string](#string) |  | page token of list request |






<a name="opi_api-storage-v1-ListVirtioBlksResponse"></a>

### ListVirtioBlksResponse
Represents a response to list all Virtio Blks.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| virtio_blks | [VirtioBlk](#opi_api-storage-v1-VirtioBlk) | repeated | List of Virtio-Blk devices |
| next_page_token | [string](#string) |  | Next page token of list response |






<a name="opi_api-storage-v1-StatsVirtioBlkRequest"></a>

### StatsVirtioBlkRequest
Represents a request to get an Virtio Blk statistics.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Object&#39;s unique identifier to retrieve statistics |






<a name="opi_api-storage-v1-StatsVirtioBlkResponse"></a>

### StatsVirtioBlkResponse
Represents a response to get an Virtio Blk statistics.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  | Device statistics |






<a name="opi_api-storage-v1-UpdateVirtioBlkRequest"></a>

### UpdateVirtioBlkRequest
Represents a request to update an Virtio Blk.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| virtio_blk | [VirtioBlk](#opi_api-storage-v1-VirtioBlk) |  | The object&#39;s `name` field is used to identify the object to be updated. |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | The list of fields to update. |
| allow_missing | [bool](#bool) |  | If set to true, and the object is not found, a new object will be created. In this situation, `update_mask` is ignored. |






<a name="opi_api-storage-v1-VirtioBlk"></a>

### VirtioBlk
Represnts emulated Virtio-blk device


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | name is an opaque object handle that is not user settable. name will be returned with created object user can only set {resource}_id on the Create request object |
| pcie_id | [PciEndpoint](#opi_api-storage-v1-PciEndpoint) |  | The PCI endpoint where this device should appear |
| volume_name_ref | [string](#string) |  | The back/middle-end volume to back this controller |
| max_io_qps | [int64](#int64) |  | Max IO queue pairs |
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
| name | [string](#string) |  | Object&#39;s unique identifier to delete |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-storage-v1-DeleteVirtioScsiLunRequest"></a>

### DeleteVirtioScsiLunRequest
Represents a request to delete an Virtio Scsi Lun.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Object&#39;s unique identifier to delete |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-storage-v1-DeleteVirtioScsiTargetRequest"></a>

### DeleteVirtioScsiTargetRequest
Represents a request to delete an Virtio Scsi Target.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Object&#39;s unique identifier to delete |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-storage-v1-GetVirtioScsiControllerRequest"></a>

### GetVirtioScsiControllerRequest
Represents a request to get an Virtio Scsi Controller.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Object&#39;s unique identifier to retrieve |






<a name="opi_api-storage-v1-GetVirtioScsiLunRequest"></a>

### GetVirtioScsiLunRequest
Represents a request to get an Virtio Scsi Lun.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Object&#39;s unique identifier to retrieve |






<a name="opi_api-storage-v1-GetVirtioScsiTargetRequest"></a>

### GetVirtioScsiTargetRequest
Represents a request to get an Virtio Scsi Target.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Object&#39;s unique identifier to retrieve |






<a name="opi_api-storage-v1-ListVirtioScsiControllersRequest"></a>

### ListVirtioScsiControllersRequest
Represents a request to list all Virtio Scsi Controllers.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | Parent&#39;s object unique identifier |
| page_size | [int32](#int32) |  | page size of list request |
| page_token | [string](#string) |  | page token of list request |






<a name="opi_api-storage-v1-ListVirtioScsiControllersResponse"></a>

### ListVirtioScsiControllersResponse
Represents a response to list all Virtio Scsi Controllers.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| virtio_scsi_controllers | [VirtioScsiController](#opi_api-storage-v1-VirtioScsiController) | repeated | List of Scsi Controllers |
| next_page_token | [string](#string) |  | Next page token of list response |






<a name="opi_api-storage-v1-ListVirtioScsiLunsRequest"></a>

### ListVirtioScsiLunsRequest
Represents a request to list all Virtio Scsi Luns.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | Parent&#39;s object unique identifier |
| page_size | [int32](#int32) |  | page size of list request |
| page_token | [string](#string) |  | page token of list request |






<a name="opi_api-storage-v1-ListVirtioScsiLunsResponse"></a>

### ListVirtioScsiLunsResponse
Represents a response to list all Virtio Scsi Luns.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| virtio_scsi_luns | [VirtioScsiLun](#opi_api-storage-v1-VirtioScsiLun) | repeated | List of Scsi Luns |
| next_page_token | [string](#string) |  | Next page token of list response |






<a name="opi_api-storage-v1-ListVirtioScsiTargetsRequest"></a>

### ListVirtioScsiTargetsRequest
Represents a request to list all Virtio Scsi Targets.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | Parent&#39;s object unique identifier |
| page_size | [int32](#int32) |  | page size of list request |
| page_token | [string](#string) |  | page token of list request |






<a name="opi_api-storage-v1-ListVirtioScsiTargetsResponse"></a>

### ListVirtioScsiTargetsResponse
Represents a response to list all Virtio Scsi Targets.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| virtio_scsi_targets | [VirtioScsiTarget](#opi_api-storage-v1-VirtioScsiTarget) | repeated | List of Scsi Targets |
| next_page_token | [string](#string) |  | Next page token of list response |






<a name="opi_api-storage-v1-StatsVirtioScsiControllerRequest"></a>

### StatsVirtioScsiControllerRequest
Represents a request to get an Virtio Scsi Controller statistics.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Object&#39;s unique identifier to retrieve statistics |






<a name="opi_api-storage-v1-StatsVirtioScsiControllerResponse"></a>

### StatsVirtioScsiControllerResponse
Represents a response to get an Virtio Scsi Controller statistics.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  | Scsi Controller statistics |






<a name="opi_api-storage-v1-StatsVirtioScsiLunRequest"></a>

### StatsVirtioScsiLunRequest
Represents a request to get an Virtio Scsi Lun statistics.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Object&#39;s unique identifier to retrieve statistics |
| controller_name_ref | [string](#string) |  | Controller&#39;s uniqie identifier |






<a name="opi_api-storage-v1-StatsVirtioScsiLunResponse"></a>

### StatsVirtioScsiLunResponse
Represents a response to get an Virtio Scsi Lun statistics.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  | Scsi Lun statistics |






<a name="opi_api-storage-v1-StatsVirtioScsiTargetRequest"></a>

### StatsVirtioScsiTargetRequest
Represents a request to get an Virtio Scsi Target statistics.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Object&#39;s unique identifier to retrieve statistics |






<a name="opi_api-storage-v1-StatsVirtioScsiTargetResponse"></a>

### StatsVirtioScsiTargetResponse
Represents a response to get an Virtio Scsi Target statistics.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  | Scsi Target statistics |






<a name="opi_api-storage-v1-UpdateVirtioScsiControllerRequest"></a>

### UpdateVirtioScsiControllerRequest
Represents a request to update an Virtio Scsi Controller.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| virtio_scsi_controller | [VirtioScsiController](#opi_api-storage-v1-VirtioScsiController) |  | The object&#39;s `name` field is used to identify the object to be updated. |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | The list of fields to update. |
| allow_missing | [bool](#bool) |  | If set to true, and the object is not found, a new object will be created. In this situation, `update_mask` is ignored. |






<a name="opi_api-storage-v1-UpdateVirtioScsiLunRequest"></a>

### UpdateVirtioScsiLunRequest
Represents a request to update an Virtio Scsi Lun.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| virtio_scsi_lun | [VirtioScsiLun](#opi_api-storage-v1-VirtioScsiLun) |  | The object&#39;s `name` field is used to identify the object to be updated. |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | The list of fields to update. |
| allow_missing | [bool](#bool) |  | If set to true, and the object is not found, a new object will be created. In this situation, `update_mask` is ignored. |






<a name="opi_api-storage-v1-UpdateVirtioScsiTargetRequest"></a>

### UpdateVirtioScsiTargetRequest
Represents a request to update an Virtio Scsi Target.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| virtio_scsi_target | [VirtioScsiTarget](#opi_api-storage-v1-VirtioScsiTarget) |  | The object&#39;s `name` field is used to identify the object to be updated. |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | The list of fields to update. |
| allow_missing | [bool](#bool) |  | If set to true, and the object is not found, a new object will be created. In this situation, `update_mask` is ignored. |






<a name="opi_api-storage-v1-VirtioScsiController"></a>

### VirtioScsiController
Represents Scsi Controller


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | name is an opaque object handle that is not user settable. name will be returned with created object user can only set {resource}_id on the Create request object |
| pcie_id | [PciEndpoint](#opi_api-storage-v1-PciEndpoint) |  | xPU&#39;s PCI ID for the controller |
| min_limit | [QosLimit](#opi_api-storage-v1-QosLimit) |  | min QoS limits for the controller |
| max_limit | [QosLimit](#opi_api-storage-v1-QosLimit) |  | max QoS limits for the controller |






<a name="opi_api-storage-v1-VirtioScsiLun"></a>

### VirtioScsiLun
Represents Scsi Lun


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | name is an opaque object handle that is not user settable. name will be returned with created object user can only set {resource}_id on the Create request object |
| target_name_ref | [string](#string) |  | The target that this LUN is in |
| volume_name_ref | [string](#string) |  | The middle/back-end volume for this LLUN |






<a name="opi_api-storage-v1-VirtioScsiTarget"></a>

### VirtioScsiTarget
Represents Scsi Target


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
| name | [string](#string) |  | Object&#39;s unique identifier to delete |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-storage-v1-EncryptedVolume"></a>

### EncryptedVolume
Represents volume encrypting IOs


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | name is an opaque object handle that is not user settable. name will be returned with created object user can only set {resource}_id on the Create request object |
| volume_name_ref | [string](#string) |  | The back/middle-end volume to back this volume |
| key | [bytes](#bytes) |  | Key to be used for encryption |
| cipher | [EncryptionType](#opi_api-storage-v1-EncryptionType) |  | Cipher to use |






<a name="opi_api-storage-v1-GetEncryptedVolumeRequest"></a>

### GetEncryptedVolumeRequest
Represents a request to get an Encrypted Volume.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Object&#39;s unique identifier to retrieve |






<a name="opi_api-storage-v1-ListEncryptedVolumesRequest"></a>

### ListEncryptedVolumesRequest
Represents a request to list all Encrypted Volumes.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | Parent&#39;s object unique identifier |
| page_size | [int32](#int32) |  | page size of list request |
| page_token | [string](#string) |  | page token of list request |






<a name="opi_api-storage-v1-ListEncryptedVolumesResponse"></a>

### ListEncryptedVolumesResponse
Represents a response to list all Encrypted Volumes.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| encrypted_volumes | [EncryptedVolume](#opi_api-storage-v1-EncryptedVolume) | repeated | List of Encrypted Volumes |
| next_page_token | [string](#string) |  | Next page token of list response |






<a name="opi_api-storage-v1-StatsEncryptedVolumeRequest"></a>

### StatsEncryptedVolumeRequest
Represents a request to get an Encrypted Volume statistics.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Object&#39;s unique identifier to retrieve statistics |






<a name="opi_api-storage-v1-StatsEncryptedVolumeResponse"></a>

### StatsEncryptedVolumeResponse
Represents a response to get an Encrypted Volume statistics.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  | Volume statistics |






<a name="opi_api-storage-v1-UpdateEncryptedVolumeRequest"></a>

### UpdateEncryptedVolumeRequest
Represents a request to update an Encrypted Volume.


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
Represents a request to delete an QoS Volume.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Object&#39;s unique identifier to delete |
| allow_missing | [bool](#bool) |  | If set to true, and the resource is not found, the request will succeed but no action will be taken on the server |






<a name="opi_api-storage-v1-GetQosVolumeRequest"></a>

### GetQosVolumeRequest
Represents a request to get an QoS Volume.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Object&#39;s unique identifier to retrieve |






<a name="opi_api-storage-v1-Limits"></a>

### Limits
Represents limits for Qos Volume


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| min | [QosLimit](#opi_api-storage-v1-QosLimit) |  | Min QoS limits for the volume |
| max | [QosLimit](#opi_api-storage-v1-QosLimit) |  | Max QoS limits for the volume |






<a name="opi_api-storage-v1-ListQosVolumesRequest"></a>

### ListQosVolumesRequest
Represents a request to list all QoS Volumes.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| parent | [string](#string) |  | Parent&#39;s object unique identifier |
| page_size | [int32](#int32) |  | page size of list request |
| page_token | [string](#string) |  | page token of list request |






<a name="opi_api-storage-v1-ListQosVolumesResponse"></a>

### ListQosVolumesResponse
Represents a response to list all QoS Volumes.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| qos_volumes | [QosVolume](#opi_api-storage-v1-QosVolume) | repeated | List of Qos Volumes |
| next_page_token | [string](#string) |  | Next page token of list response |






<a name="opi_api-storage-v1-QosVolume"></a>

### QosVolume
Represents volume providing quality of service capabilities


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | name is an opaque object handle that is not user settable. name will be returned with created object user can only set {resource}_id on the Create request object |
| volume_name_ref | [string](#string) |  | Middleend/backend volume to apply QoS on |
| limits | [Limits](#opi_api-storage-v1-Limits) |  | At least one limit value should be set, oitherwise volume does not make sense. AIP-203 says that a field should be described as REQUIRED if it is a field on a resource that a user provides somewhere as input. In this case, the resource is only valid if a &#34;truthy&#34; value is stored. &#34;truthy&#34; is defined as: * For primitives, values other than 0, 0.0, empty string/bytes, and false * For repeated fields maps, values with at least one entry * For messages, any message with at least one &#34;truthy&#34; field. We cannot mark both min and max QosLimit as REQUIRED directly here, since it forces one limit field is set on both. Limits message is added to overcome it. REQUIRED on limits forces at least one limit field in either min/max sub message is set. |






<a name="opi_api-storage-v1-StatsQosVolumeRequest"></a>

### StatsQosVolumeRequest
Represents a request to get an QoS Volume statistics.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Object&#39;s unique identifier to retrieve statistics |






<a name="opi_api-storage-v1-StatsQosVolumeResponse"></a>

### StatsQosVolumeResponse
Represents a response to get an QoS Volume statistics.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| stats | [VolumeStats](#opi_api-storage-v1-VolumeStats) |  | Volume statistics |






<a name="opi_api-storage-v1-UpdateQosVolumeRequest"></a>

### UpdateQosVolumeRequest
Represents a request to update an QoS Volume.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| qos_volume | [QosVolume](#opi_api-storage-v1-QosVolume) |  | The object&#39;s `name` field is used to identify the object to be updated. |
| update_mask | [google.protobuf.FieldMask](#google-protobuf-FieldMask) |  | The list of fields to update. |
| allow_missing | [bool](#bool) |  | If set to true, and the object is not found, a new object will be created. In this situation, `update_mask` is ignored. |





 

 

 


<a name="opi_api-storage-v1-MiddleendQosVolumeService"></a>

### MiddleendQosVolumeService
Middle End (Storage Services) APIs. For example, encryption, compression, raid, QoS, multipath, ...

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



<a name="opi_api-storage-v1-FabricsEndpoint"></a>

### FabricsEndpoint
Represents Fabrics Endpoint


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| traddr | [string](#string) |  | ip address for TCP and RDMA |
| trsvcid | [string](#string) |  | port for TCP and RDMA |
| adrfam | [NvmeAddressFamily](#opi_api-storage-v1-NvmeAddressFamily) |  | address family |






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
Represents Volume statistics


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| read_bytes_count | [int32](#int32) |  | Count of read bytes |
| read_ops_count | [int32](#int32) |  | Count of read operations |
| write_bytes_count | [int32](#int32) |  | Count of written bytes |
| write_ops_count | [int32](#int32) |  | Count of write opeations |
| unmap_bytes_count | [int32](#int32) |  | Count of unmapped bytes |
| unmap_ops_count | [int32](#int32) |  | Count of unmap operations |
| read_latency_ticks | [int32](#int32) |  | Read latency ticks |
| write_latency_ticks | [int32](#int32) |  | Write latency ticks |
| unmap_latency_ticks | [int32](#int32) |  | Unmap latency ticks |





 


<a name="opi_api-storage-v1-EncryptionType"></a>

### EncryptionType
AES encryption types

| Name | Number | Description |
| ---- | ------ | ----------- |
| ENCRYPTION_TYPE_UNSPECIFIED | 0 | Encryption type is not specified |
| ENCRYPTION_TYPE_AES_CBC_128 | 1 | AES CBC 128 encryption type |
| ENCRYPTION_TYPE_AES_CBC_192 | 2 | AES CBC 192 encryption type |
| ENCRYPTION_TYPE_AES_CBC_256 | 3 | AES CBC 256 encryption type |
| ENCRYPTION_TYPE_AES_XTS_128 | 4 | AES XTS 128 encryption type |
| ENCRYPTION_TYPE_AES_XTS_192 | 5 | AES XTS 192 encryption type |
| ENCRYPTION_TYPE_AES_XTS_256 | 6 | AES XTS 256 encryption type |



<a name="opi_api-storage-v1-NvmeAddressFamily"></a>

### NvmeAddressFamily
Address family value options

| Name | Number | Description |
| ---- | ------ | ----------- |
| NVME_ADDRESS_FAMILY_UNSPECIFIED | 0 | Address family is not specified |
| NVME_ADDRESS_FAMILY_IPV4 | 1 | IPv4 address family |
| NVME_ADDRESS_FAMILY_IPV6 | 2 | IPv6 address family |
| NVME_ADDRESS_FAMILY_IB | 3 | InfiniBand address family |
| NVME_ADDRESS_FAMILY_FC | 4 | Fibre channel address family |
| NVME_ADDRESS_FAMILY_INTRA_HOST | 5 | Intra host address family |



<a name="opi_api-storage-v1-NvmeTransportType"></a>

### NvmeTransportType
Transport type value options

| Name | Number | Description |
| ---- | ------ | ----------- |
| NVME_TRANSPORT_TYPE_UNSPECIFIED | 0 | Transport type is not specified |
| NVME_TRANSPORT_TYPE_FC | 1 | Fibre channel transport type |
| NVME_TRANSPORT_TYPE_PCIE | 2 | Pcie transport type |
| NVME_TRANSPORT_TYPE_RDMA | 3 | RDMA transport type |
| NVME_TRANSPORT_TYPE_TCP | 4 | TCP transport type |
| NVME_TRANSPORT_TYPE_CUSTOM | 5 | Custom transport type |


 

 

 



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

