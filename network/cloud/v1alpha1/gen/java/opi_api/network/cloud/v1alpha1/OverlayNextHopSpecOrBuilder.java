// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: nexthop.proto

package opi_api.network.cloud.v1alpha1;

public interface OverlayNextHopSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.OverlayNextHopSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * tunnel id
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey tunnel_id = 1;</code>
   * @return Whether the tunnelId field is set.
   */
  boolean hasTunnelId();
  /**
   * <pre>
   * tunnel id
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey tunnel_id = 1;</code>
   * @return The tunnelId.
   */
  opi_api.common.v1.ObjectKey getTunnelId();
  /**
   * <pre>
   * tunnel id
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey tunnel_id = 1;</code>
   */
  opi_api.common.v1.ObjectKeyOrBuilder getTunnelIdOrBuilder();
}
