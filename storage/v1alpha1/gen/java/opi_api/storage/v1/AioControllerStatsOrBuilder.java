// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_aio.proto

package opi_api.storage.v1;

public interface AioControllerStatsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.AioControllerStats)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.opi_api.common.v1.ObjectKey handle = 1;</code>
   * @return Whether the handle field is set.
   */
  boolean hasHandle();
  /**
   * <code>.opi_api.common.v1.ObjectKey handle = 1;</code>
   * @return The handle.
   */
  opi_api.common.v1.ObjectKey getHandle();
  /**
   * <code>.opi_api.common.v1.ObjectKey handle = 1;</code>
   */
  opi_api.common.v1.ObjectKeyOrBuilder getHandleOrBuilder();

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