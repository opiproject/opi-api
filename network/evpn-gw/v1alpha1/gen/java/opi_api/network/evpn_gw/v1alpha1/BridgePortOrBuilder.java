// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: l2_xpu_infra_mgr.proto

package opi_api.network.evpn_gw.v1alpha1;

public interface BridgePortOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.evpn_gw.v1alpha1.BridgePort)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the Bridge Port.
   * "name" is an opaque object handle that is not user settable.
   * "name" will be returned with created object
   * user can only set {resource}_id on the Create request object
   * Format: bridge_ports/{bridge_port}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the Bridge Port.
   * "name" is an opaque object handle that is not user settable.
   * "name" will be returned with created object
   * user can only set {resource}_id on the Create request object
   * Format: bridge_ports/{bridge_port}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Bridge Port network configuration
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.BridgePortSpec spec = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the spec field is set.
   */
  boolean hasSpec();
  /**
   * <pre>
   * Bridge Port network configuration
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.BridgePortSpec spec = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The spec.
   */
  opi_api.network.evpn_gw.v1alpha1.BridgePortSpec getSpec();
  /**
   * <pre>
   * Bridge Port network configuration
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.BridgePortSpec spec = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  opi_api.network.evpn_gw.v1alpha1.BridgePortSpecOrBuilder getSpecOrBuilder();

  /**
   * <pre>
   * Bridge Port network status
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.BridgePortStatus status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * Bridge Port network status
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.BridgePortStatus status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  opi_api.network.evpn_gw.v1alpha1.BridgePortStatus getStatus();
  /**
   * <pre>
   * Bridge Port network status
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.BridgePortStatus status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  opi_api.network.evpn_gw.v1alpha1.BridgePortStatusOrBuilder getStatusOrBuilder();
}
