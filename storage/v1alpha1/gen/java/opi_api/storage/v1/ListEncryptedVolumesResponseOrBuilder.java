// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: middleend_encryption.proto

package opi_api.storage.v1;

public interface ListEncryptedVolumesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.ListEncryptedVolumesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .opi_api.storage.v1.EncryptedVolume encrypted_volumes = 1;</code>
   */
  java.util.List<opi_api.storage.v1.EncryptedVolume> 
      getEncryptedVolumesList();
  /**
   * <code>repeated .opi_api.storage.v1.EncryptedVolume encrypted_volumes = 1;</code>
   */
  opi_api.storage.v1.EncryptedVolume getEncryptedVolumes(int index);
  /**
   * <code>repeated .opi_api.storage.v1.EncryptedVolume encrypted_volumes = 1;</code>
   */
  int getEncryptedVolumesCount();
  /**
   * <code>repeated .opi_api.storage.v1.EncryptedVolume encrypted_volumes = 1;</code>
   */
  java.util.List<? extends opi_api.storage.v1.EncryptedVolumeOrBuilder> 
      getEncryptedVolumesOrBuilderList();
  /**
   * <code>repeated .opi_api.storage.v1.EncryptedVolume encrypted_volumes = 1;</code>
   */
  opi_api.storage.v1.EncryptedVolumeOrBuilder getEncryptedVolumesOrBuilder(
      int index);

  /**
   * <pre>
   * Next page token of list response
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Next page token of list response
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
