// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_nvme_tcp.proto

package opi_api.storage.v1;

public interface NVMfRemoteControllerStatsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.NVMfRemoteControllerStatsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>string stats = 2;</code>
   * @return The stats.
   */
  java.lang.String getStats();
  /**
   * <code>string stats = 2;</code>
   * @return The bytes for stats.
   */
  com.google.protobuf.ByteString
      getStatsBytes();
}
