// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: l2_xpu_infra_mgr.proto

package opi_api.network.evpn_gw.v1alpha1;

public interface CreateBridgePortRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The bridge port to create
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.BridgePort bridge_port = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the bridgePort field is set.
   */
  boolean hasBridgePort();
  /**
   * <pre>
   * The bridge port to create
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.BridgePort bridge_port = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bridgePort.
   */
  opi_api.network.evpn_gw.v1alpha1.BridgePort getBridgePort();
  /**
   * <pre>
   * The bridge port to create
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.BridgePort bridge_port = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  opi_api.network.evpn_gw.v1alpha1.BridgePortOrBuilder getBridgePortOrBuilder();
}
