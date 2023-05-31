// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: nexthop.proto

package opi_api.network.cloud.v1alpha1;

public interface NextHopGroupOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.NextHopGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * unique nexthop group id
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * unique nexthop group id
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * configuration
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.NextHopGroupSpec spec = 2;</code>
   * @return Whether the spec field is set.
   */
  boolean hasSpec();
  /**
   * <pre>
   * configuration
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.NextHopGroupSpec spec = 2;</code>
   * @return The spec.
   */
  opi_api.network.cloud.v1alpha1.NextHopGroupSpec getSpec();
  /**
   * <pre>
   * configuration
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.NextHopGroupSpec spec = 2;</code>
   */
  opi_api.network.cloud.v1alpha1.NextHopGroupSpecOrBuilder getSpecOrBuilder();

  /**
   * <pre>
   * status
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.NextHopGroupStatus status = 3;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * status
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.NextHopGroupStatus status = 3;</code>
   * @return The status.
   */
  opi_api.network.cloud.v1alpha1.NextHopGroupStatus getStatus();
  /**
   * <pre>
   * status
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.NextHopGroupStatus status = 3;</code>
   */
  opi_api.network.cloud.v1alpha1.NextHopGroupStatusOrBuilder getStatusOrBuilder();
}
