// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bgp.proto

package opi_api.network.cloud.v1alpha1;

public interface BGPNLRIPrefixSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.BGPNLRIPrefixSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * BGP address family
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.BGPAfi afi = 1;</code>
   * @return The enum numeric value on the wire for afi.
   */
  int getAfiValue();
  /**
   * <pre>
   * BGP address family
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.BGPAfi afi = 1;</code>
   * @return The afi.
   */
  opi_api.network.cloud.v1alpha1.BGPAfi getAfi();

  /**
   * <pre>
   * BGP sub-address family
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.BGPSafi safi = 2;</code>
   * @return The enum numeric value on the wire for safi.
   */
  int getSafiValue();
  /**
   * <pre>
   * BGP sub-address family
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.BGPSafi safi = 2;</code>
   * @return The safi.
   */
  opi_api.network.cloud.v1alpha1.BGPSafi getSafi();

  /**
   * <pre>
   * prefix in NLRI
   * </pre>
   *
   * <code>bytes prefix = 3;</code>
   * @return The prefix.
   */
  com.google.protobuf.ByteString getPrefix();

  /**
   * <pre>
   * prefix length
   * </pre>
   *
   * <code>int32 prefix_len = 4;</code>
   * @return The prefixLen.
   */
  int getPrefixLen();

  /**
   * <pre>
   * route source (learned from BGP peer or AFM)
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.NLRISrc route_source = 5;</code>
   * @return The enum numeric value on the wire for routeSource.
   */
  int getRouteSourceValue();
  /**
   * <pre>
   * route source (learned from BGP peer or AFM)
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.NLRISrc route_source = 5;</code>
   * @return The routeSource.
   */
  opi_api.network.cloud.v1alpha1.NLRISrc getRouteSource();

  /**
   * <pre>
   * route source index
   * </pre>
   *
   * <code>int32 route_source_index = 6;</code>
   * @return The routeSourceIndex.
   */
  int getRouteSourceIndex();

  /**
   * <pre>
   * path ID
   * </pre>
   *
   * <code>int32 path_id = 7;</code>
   * @return The pathId.
   */
  int getPathId();
}
