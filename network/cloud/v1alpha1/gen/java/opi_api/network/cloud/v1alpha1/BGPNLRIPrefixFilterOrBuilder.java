// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bgp.proto

package opi_api.network.cloud.v1alpha1;

public interface BGPNLRIPrefixFilterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.BGPNLRIPrefixFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * filter based on extended communities
   * </pre>
   *
   * <code>bytes ext_comm = 1;</code>
   * @return The extComm.
   */
  com.google.protobuf.ByteString getExtComm();

  /**
   * <pre>
   * filter based on l2vni/l3vni
   * </pre>
   *
   * <code>int32 vnid = 2;</code>
   * @return The vnid.
   */
  int getVnid();

  /**
   * <pre>
   * filter based on route type
   * </pre>
   *
   * <code>int32 route_type = 3;</code>
   * @return The routeType.
   */
  int getRouteType();

  /**
   * <pre>
   * filter based on next-hop address
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPAddress next_hop = 4;</code>
   * @return Whether the nextHop field is set.
   */
  boolean hasNextHop();
  /**
   * <pre>
   * filter based on next-hop address
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPAddress next_hop = 4;</code>
   * @return The nextHop.
   */
  opi_api.network.opinetcommon.v1alpha1.IPAddress getNextHop();
  /**
   * <pre>
   * filter based on next-hop address
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPAddress next_hop = 4;</code>
   */
  opi_api.network.opinetcommon.v1alpha1.IPAddressOrBuilder getNextHopOrBuilder();

  /**
   * <pre>
   * filter based on ip address
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPAddress ip_address = 5;</code>
   * @return Whether the ipAddress field is set.
   */
  boolean hasIpAddress();
  /**
   * <pre>
   * filter based on ip address
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPAddress ip_address = 5;</code>
   * @return The ipAddress.
   */
  opi_api.network.opinetcommon.v1alpha1.IPAddress getIpAddress();
  /**
   * <pre>
   * filter based on ip address
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPAddress ip_address = 5;</code>
   */
  opi_api.network.opinetcommon.v1alpha1.IPAddressOrBuilder getIpAddressOrBuilder();

  /**
   * <pre>
   * filter to include only best routes
   * </pre>
   *
   * <code>bool best = 6;</code>
   * @return The best.
   */
  boolean getBest();
}
