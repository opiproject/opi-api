// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_virtio_scsi.proto

package opi_api.storage.v1;

public interface CreateVirtioScsiControllerRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.CreateVirtioScsiControllerRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.opi_api.storage.v1.VirtioScsiController virtio_scsi_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the virtioScsiController field is set.
   */
  boolean hasVirtioScsiController();
  /**
   * <code>.opi_api.storage.v1.VirtioScsiController virtio_scsi_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The virtioScsiController.
   */
  opi_api.storage.v1.VirtioScsiController getVirtioScsiController();
  /**
   * <code>.opi_api.storage.v1.VirtioScsiController virtio_scsi_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  opi_api.storage.v1.VirtioScsiControllerOrBuilder getVirtioScsiControllerOrBuilder();

  /**
   * <code>string virtio_scsi_controller_id = 3;</code>
   * @return The virtioScsiControllerId.
   */
  java.lang.String getVirtioScsiControllerId();
  /**
   * <code>string virtio_scsi_controller_id = 3;</code>
   * @return The bytes for virtioScsiControllerId.
   */
  com.google.protobuf.ByteString
      getVirtioScsiControllerIdBytes();
}
