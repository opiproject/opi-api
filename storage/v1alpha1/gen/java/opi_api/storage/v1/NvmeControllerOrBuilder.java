// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_nvme.proto

package opi_api.storage.v1;

public interface NvmeControllerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.NvmeController)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * name is an opaque object handle that is not user settable.
   * name will be returned with created object
   * user can only set {resource}_id on the Create request object
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * name is an opaque object handle that is not user settable.
   * name will be returned with created object
   * user can only set {resource}_id on the Create request object
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * spec holds configurable values
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeControllerSpec spec = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the spec field is set.
   */
  boolean hasSpec();
  /**
   * <pre>
   * spec holds configurable values
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeControllerSpec spec = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The spec.
   */
  opi_api.storage.v1.NvmeControllerSpec getSpec();
  /**
   * <pre>
   * spec holds configurable values
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeControllerSpec spec = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  opi_api.storage.v1.NvmeControllerSpecOrBuilder getSpecOrBuilder();

  /**
   * <pre>
   * status holds server generated values
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeControllerStatus status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * status holds server generated values
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeControllerStatus status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  opi_api.storage.v1.NvmeControllerStatus getStatus();
  /**
   * <pre>
   * status holds server generated values
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeControllerStatus status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  opi_api.storage.v1.NvmeControllerStatusOrBuilder getStatusOrBuilder();
}
