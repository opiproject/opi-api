// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_nvme_tcp.proto

package opi_api.storage.v1;

public interface NVMfPathStatsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.NVMfPathStatsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * object's unique identifier
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * object's unique identifier
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
   * @return The id.
   */
  opi_api.common.v1.ObjectKey getId();
  /**
   * <pre>
   * object's unique identifier
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
   */
  opi_api.common.v1.ObjectKeyOrBuilder getIdOrBuilder();
}
