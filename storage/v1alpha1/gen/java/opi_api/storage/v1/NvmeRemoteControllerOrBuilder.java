// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_nvme.proto

package opi_api.storage.v1;

public interface NvmeRemoteControllerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.NvmeRemoteController)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * name is an opaque object handle that is not user settable.
   * name will be returned with created object
   * user can only set {resource}_id on the Create request object
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
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
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Multipath mode
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeMultipath multipath = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for multipath.
   */
  int getMultipathValue();
  /**
   * <pre>
   * Multipath mode
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeMultipath multipath = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The multipath.
   */
  opi_api.storage.v1.NvmeMultipath getMultipath();

  /**
   * <pre>
   * Subsystem NQN
   * </pre>
   *
   * <code>string subnqn = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The subnqn.
   */
  java.lang.String getSubnqn();
  /**
   * <pre>
   * Subsystem NQN
   * </pre>
   *
   * <code>string subnqn = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for subnqn.
   */
  com.google.protobuf.ByteString
      getSubnqnBytes();

  /**
   * <pre>
   * Host NQN
   * </pre>
   *
   * <code>string hostnqn = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The hostnqn.
   */
  java.lang.String getHostnqn();
  /**
   * <pre>
   * Host NQN
   * </pre>
   *
   * <code>string hostnqn = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for hostnqn.
   */
  com.google.protobuf.ByteString
      getHostnqnBytes();

  /**
   * <pre>
   * IO queues count
   * </pre>
   *
   * <code>int64 io_queues_count = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The ioQueuesCount.
   */
  long getIoQueuesCount();

  /**
   * <pre>
   * Queue size
   * </pre>
   *
   * <code>int64 queue_size = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The queueSize.
   */
  long getQueueSize();

  /**
   * <pre>
   * Nvme over TCP specific fields
   * </pre>
   *
   * <code>.opi_api.storage.v1.TcpController tcp = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the tcp field is set.
   */
  boolean hasTcp();
  /**
   * <pre>
   * Nvme over TCP specific fields
   * </pre>
   *
   * <code>.opi_api.storage.v1.TcpController tcp = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The tcp.
   */
  opi_api.storage.v1.TcpController getTcp();
  /**
   * <pre>
   * Nvme over TCP specific fields
   * </pre>
   *
   * <code>.opi_api.storage.v1.TcpController tcp = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  opi_api.storage.v1.TcpControllerOrBuilder getTcpOrBuilder();
}
