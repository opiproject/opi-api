// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: l3_xpu_infra_mgr.proto

package opi_api.network.evpn_gw.v1alpha1;

public interface CreateVrfRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.evpn_gw.v1alpha1.CreateVrfRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The vrf to create
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.Vrf vrf = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the vrf field is set.
   */
  boolean hasVrf();
  /**
   * <pre>
   * The vrf to create
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.Vrf vrf = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The vrf.
   */
  opi_api.network.evpn_gw.v1alpha1.Vrf getVrf();
  /**
   * <pre>
   * The vrf to create
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.Vrf vrf = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  opi_api.network.evpn_gw.v1alpha1.VrfOrBuilder getVrfOrBuilder();
}
