// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: middleend_qos_volume.proto

package opi_api.storage.v1;

public interface ListQosVolumesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.ListQosVolumesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .opi_api.storage.v1.QosVolume qos_volumes = 1;</code>
   */
  java.util.List<opi_api.storage.v1.QosVolume> 
      getQosVolumesList();
  /**
   * <code>repeated .opi_api.storage.v1.QosVolume qos_volumes = 1;</code>
   */
  opi_api.storage.v1.QosVolume getQosVolumes(int index);
  /**
   * <code>repeated .opi_api.storage.v1.QosVolume qos_volumes = 1;</code>
   */
  int getQosVolumesCount();
  /**
   * <code>repeated .opi_api.storage.v1.QosVolume qos_volumes = 1;</code>
   */
  java.util.List<? extends opi_api.storage.v1.QosVolumeOrBuilder> 
      getQosVolumesOrBuilderList();
  /**
   * <code>repeated .opi_api.storage.v1.QosVolume qos_volumes = 1;</code>
   */
  opi_api.storage.v1.QosVolumeOrBuilder getQosVolumesOrBuilder(
      int index);

  /**
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
