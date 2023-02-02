// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: underlayroute.proto

package opi_api.network.cloud.v1alpha1;

public interface UnderlayRouteSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.UnderlayRouteSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * route's unique id
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * route's unique id
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
   * @return The id.
   */
  opi_api.common.v1.ObjectKey getId();
  /**
   * <pre>
   * route's unique id
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
   */
  opi_api.common.v1.ObjectKeyOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * route table id this route belongs to
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey route_table_id = 2;</code>
   * @return Whether the routeTableId field is set.
   */
  boolean hasRouteTableId();
  /**
   * <pre>
   * route table id this route belongs to
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey route_table_id = 2;</code>
   * @return The routeTableId.
   */
  opi_api.common.v1.ObjectKey getRouteTableId();
  /**
   * <pre>
   * route table id this route belongs to
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey route_table_id = 2;</code>
   */
  opi_api.common.v1.ObjectKeyOrBuilder getRouteTableIdOrBuilder();

  /**
   * <pre>
   * destination address
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix dest_prefix = 3;</code>
   * @return Whether the destPrefix field is set.
   */
  boolean hasDestPrefix();
  /**
   * <pre>
   * destination address
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix dest_prefix = 3;</code>
   * @return The destPrefix.
   */
  opi_api.network.opinetcommon.v1alpha1.IPPrefix getDestPrefix();
  /**
   * <pre>
   * destination address
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix dest_prefix = 3;</code>
   */
  opi_api.network.opinetcommon.v1alpha1.IPPrefixOrBuilder getDestPrefixOrBuilder();

  /**
   * <pre>
   * next-hop address
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPAddress next_hop_address = 4;</code>
   * @return Whether the nextHopAddress field is set.
   */
  boolean hasNextHopAddress();
  /**
   * <pre>
   * next-hop address
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPAddress next_hop_address = 4;</code>
   * @return The nextHopAddress.
   */
  opi_api.network.opinetcommon.v1alpha1.IPAddress getNextHopAddress();
  /**
   * <pre>
   * next-hop address
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPAddress next_hop_address = 4;</code>
   */
  opi_api.network.opinetcommon.v1alpha1.IPAddressOrBuilder getNextHopAddressOrBuilder();

  /**
   * <pre>
   * route is enabled or not
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.AdminState state = 5;</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * route is enabled or not
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.AdminState state = 5;</code>
   * @return The state.
   */
  opi_api.network.opinetcommon.v1alpha1.AdminState getState();

  /**
   * <pre>
   * enable/disable admin distance
   * </pre>
   *
   * <code>bool enable_admin_distance = 6;</code>
   * @return The enableAdminDistance.
   */
  boolean getEnableAdminDistance();

  /**
   * <pre>
   * admin distance set for a static route vs. what a routing
   * protocol computes it for the dynamic route.
   * </pre>
   *
   * <code>int32 admin_dist = 7;</code>
   * @return The adminDist.
   */
  int getAdminDist();

  /**
   * <pre>
   * interface ID, if this route is configured on RR
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey interface_id = 8;</code>
   * @return Whether the interfaceId field is set.
   */
  boolean hasInterfaceId();
  /**
   * <pre>
   * interface ID, if this route is configured on RR
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey interface_id = 8;</code>
   * @return The interfaceId.
   */
  opi_api.common.v1.ObjectKey getInterfaceId();
  /**
   * <pre>
   * interface ID, if this route is configured on RR
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey interface_id = 8;</code>
   */
  opi_api.common.v1.ObjectKeyOrBuilder getInterfaceIdOrBuilder();
}
