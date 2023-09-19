// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_nvme_pcie.proto

package opi_api.storage.v1;

public interface CreateNvmeControllerRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.CreateNvmeControllerRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Nvme Subsystem this Controller belongs to
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * The Nvme Subsystem this Controller belongs to
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The Nvme Controller to be created.
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeController nvme_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the nvmeController field is set.
   */
  boolean hasNvmeController();
  /**
   * <pre>
   * The Nvme Controller to be created.
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeController nvme_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The nvmeController.
   */
  opi_api.storage.v1.NvmeController getNvmeController();
  /**
   * <pre>
   * The Nvme Controller to be created.
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeController nvme_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  opi_api.storage.v1.NvmeControllerOrBuilder getNvmeControllerOrBuilder();

  /**
   * <pre>
   * An optional ID to assign to the Nvme Controller.
   * If this is not provided the system will auto-generate it.
   * </pre>
   *
   * <code>string nvme_controller_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The nvmeControllerId.
   */
  java.lang.String getNvmeControllerId();
  /**
   * <pre>
   * An optional ID to assign to the Nvme Controller.
   * If this is not provided the system will auto-generate it.
   * </pre>
   *
   * <code>string nvme_controller_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for nvmeControllerId.
   */
  com.google.protobuf.ByteString
      getNvmeControllerIdBytes();
}
