// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_virtio_blk.proto

package opi_api.storage.v1;

public interface CreateVirtioBlkRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.CreateVirtioBlkRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.opi_api.storage.v1.VirtioBlk virtio_blk = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the virtioBlk field is set.
   */
  boolean hasVirtioBlk();
  /**
   * <code>.opi_api.storage.v1.VirtioBlk virtio_blk = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The virtioBlk.
   */
  opi_api.storage.v1.VirtioBlk getVirtioBlk();
  /**
   * <code>.opi_api.storage.v1.VirtioBlk virtio_blk = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  opi_api.storage.v1.VirtioBlkOrBuilder getVirtioBlkOrBuilder();

  /**
   * <code>string virtio_blk_id = 2;</code>
   * @return The virtioBlkId.
   */
  java.lang.String getVirtioBlkId();
  /**
   * <code>string virtio_blk_id = 2;</code>
   * @return The bytes for virtioBlkId.
   */
  com.google.protobuf.ByteString
      getVirtioBlkIdBytes();
}
