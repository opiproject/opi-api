// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: middleend_encryption.proto

package opi_api.storage.v1;

public interface CreateEncryptedVolumeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.CreateEncryptedVolumeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.opi_api.storage.v1.EncryptedVolume encrypted_volume = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the encryptedVolume field is set.
   */
  boolean hasEncryptedVolume();
  /**
   * <code>.opi_api.storage.v1.EncryptedVolume encrypted_volume = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The encryptedVolume.
   */
  opi_api.storage.v1.EncryptedVolume getEncryptedVolume();
  /**
   * <code>.opi_api.storage.v1.EncryptedVolume encrypted_volume = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  opi_api.storage.v1.EncryptedVolumeOrBuilder getEncryptedVolumeOrBuilder();

  /**
   * <code>string encrypted_volume_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The encryptedVolumeId.
   */
  java.lang.String getEncryptedVolumeId();
  /**
   * <code>string encrypted_volume_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for encryptedVolumeId.
   */
  com.google.protobuf.ByteString
      getEncryptedVolumeIdBytes();
}
