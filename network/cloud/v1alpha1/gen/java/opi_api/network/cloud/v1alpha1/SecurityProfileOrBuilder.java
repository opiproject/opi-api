// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: networkpolicy.proto

package opi_api.network.cloud.v1alpha1;

public interface SecurityProfileOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.SecurityProfile)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * unique identifier of security profile
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * unique identifier of security profile
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
   * <code>.opi_api.network.cloud.v1alpha1.SecurityProfileSpec spec = 2;</code>
   * @return Whether the spec field is set.
   */
  boolean hasSpec();
  /**
   * <pre>
   * configuration
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.SecurityProfileSpec spec = 2;</code>
   * @return The spec.
   */
  opi_api.network.cloud.v1alpha1.SecurityProfileSpec getSpec();
  /**
   * <pre>
   * configuration
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.SecurityProfileSpec spec = 2;</code>
   */
  opi_api.network.cloud.v1alpha1.SecurityProfileSpecOrBuilder getSpecOrBuilder();

  /**
   * <pre>
   * status
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.SecurityProfileStatus status = 3;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * status
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.SecurityProfileStatus status = 3;</code>
   * @return The status.
   */
  opi_api.network.cloud.v1alpha1.SecurityProfileStatus getStatus();
  /**
   * <pre>
   * status
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.SecurityProfileStatus status = 3;</code>
   */
  opi_api.network.cloud.v1alpha1.SecurityProfileStatusOrBuilder getStatusOrBuilder();
}
