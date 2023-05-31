// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: underlayroute.proto

package opi_api.network.cloud.v1alpha1;

public interface UnderlayRouteLookupKeyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.UnderlayRouteLookupKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * route table id this route belongs to
   * </pre>
   *
   * <code>string route_table_name_ref = 1;</code>
   * @return The routeTableNameRef.
   */
  java.lang.String getRouteTableNameRef();
  /**
   * <pre>
   * route table id this route belongs to
   * </pre>
   *
   * <code>string route_table_name_ref = 1;</code>
   * @return The bytes for routeTableNameRef.
   */
  com.google.protobuf.ByteString
      getRouteTableNameRefBytes();

  /**
   * <pre>
   * destination address
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix dest_prefix = 2;</code>
   * @return Whether the destPrefix field is set.
   */
  boolean hasDestPrefix();
  /**
   * <pre>
   * destination address
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix dest_prefix = 2;</code>
   * @return The destPrefix.
   */
  opi_api.network.opinetcommon.v1alpha1.IPPrefix getDestPrefix();
  /**
   * <pre>
   * destination address
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix dest_prefix = 2;</code>
   */
  opi_api.network.opinetcommon.v1alpha1.IPPrefixOrBuilder getDestPrefixOrBuilder();

  /**
   * <pre>
   * next-hop address
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPAddress next_hop_address = 3;</code>
   * @return Whether the nextHopAddress field is set.
   */
  boolean hasNextHopAddress();
  /**
   * <pre>
   * next-hop address
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPAddress next_hop_address = 3;</code>
   * @return The nextHopAddress.
   */
  opi_api.network.opinetcommon.v1alpha1.IPAddress getNextHopAddress();
  /**
   * <pre>
   * next-hop address
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPAddress next_hop_address = 3;</code>
   */
  opi_api.network.opinetcommon.v1alpha1.IPAddressOrBuilder getNextHopAddressOrBuilder();

  /**
   * <pre>
   * interface index, if the next-hop is an interface
   * </pre>
   *
   * <code>int32 ifid = 4;</code>
   * @return The ifid.
   */
  int getIfid();

  /**
   * <pre>
   * protocol via which the route is learned
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.RouteProtocol proto = 6;</code>
   * @return The enum numeric value on the wire for proto.
   */
  int getProtoValue();
  /**
   * <pre>
   * protocol via which the route is learned
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.RouteProtocol proto = 6;</code>
   * @return The proto.
   */
  opi_api.network.opinetcommon.v1alpha1.RouteProtocol getProto();
}
