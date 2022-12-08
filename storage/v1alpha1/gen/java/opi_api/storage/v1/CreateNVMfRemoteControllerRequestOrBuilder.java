// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_nvme_tcp.proto

package opi_api.storage.v1;

public interface CreateNVMfRemoteControllerRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.CreateNVMfRemoteControllerRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <code>.opi_api.storage.v1.NVMfRemoteController nv_mf_remote_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the nvMfRemoteController field is set.
   */
  boolean hasNvMfRemoteController();
  /**
   * <code>.opi_api.storage.v1.NVMfRemoteController nv_mf_remote_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The nvMfRemoteController.
   */
  opi_api.storage.v1.NVMfRemoteController getNvMfRemoteController();
  /**
   * <code>.opi_api.storage.v1.NVMfRemoteController nv_mf_remote_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  opi_api.storage.v1.NVMfRemoteControllerOrBuilder getNvMfRemoteControllerOrBuilder();

  /**
   * <code>string nv_mf_remote_controller_id = 3;</code>
   * @return The nvMfRemoteControllerId.
   */
  java.lang.String getNvMfRemoteControllerId();
  /**
   * <code>string nv_mf_remote_controller_id = 3;</code>
   * @return The bytes for nvMfRemoteControllerId.
   */
  com.google.protobuf.ByteString
      getNvMfRemoteControllerIdBytes();
}
