// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_null.proto

package opi_api.storage.v1;

public interface UpdateNullDebugRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.UpdateNullDebugRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The object's `name` field is used to identify the object to be updated.
   * </pre>
   *
   * <code>.opi_api.storage.v1.NullDebug null_debug = 1;</code>
   * @return Whether the nullDebug field is set.
   */
  boolean hasNullDebug();
  /**
   * <pre>
   * The object's `name` field is used to identify the object to be updated.
   * </pre>
   *
   * <code>.opi_api.storage.v1.NullDebug null_debug = 1;</code>
   * @return The nullDebug.
   */
  opi_api.storage.v1.NullDebug getNullDebug();
  /**
   * <pre>
   * The object's `name` field is used to identify the object to be updated.
   * </pre>
   *
   * <code>.opi_api.storage.v1.NullDebug null_debug = 1;</code>
   */
  opi_api.storage.v1.NullDebugOrBuilder getNullDebugOrBuilder();

  /**
   * <pre>
   * The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * If set to true, and the object is not found, a new object will be created.
   * In this situation, `update_mask` is ignored.
   * </pre>
   *
   * <code>bool allow_missing = 3;</code>
   * @return The allowMissing.
   */
  boolean getAllowMissing();
}