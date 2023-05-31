// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vnic.proto

package opi_api.network.cloud.v1alpha1;

public interface VnicStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.VnicStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * true if vnic's configured total session limit is hit
   * </pre>
   *
   * <code>bool max_session_limit_hit = 13;</code>
   * @return The maxSessionLimitHit.
   */
  boolean getMaxSessionLimitHit();

  /**
   * <pre>
   * true if vnic's configured TCP session limit is hit
   * </pre>
   *
   * <code>bool max_tcp_session_limit_hit = 14;</code>
   * @return The maxTcpSessionLimitHit.
   */
  boolean getMaxTcpSessionLimitHit();

  /**
   * <pre>
   * true if vnic's configured UDP session limit is hit
   * </pre>
   *
   * <code>bool max_udp_session_limit_hit = 15;</code>
   * @return The maxUdpSessionLimitHit.
   */
  boolean getMaxUdpSessionLimitHit();

  /**
   * <pre>
   * true if vnic's configured ICMP session limit is hit
   * </pre>
   *
   * <code>bool max_icmp_session_limit_hit = 16;</code>
   * @return The maxIcmpSessionLimitHit.
   */
  boolean getMaxIcmpSessionLimitHit();

  /**
   * <pre>
   * true if vnic's configured non-TCP/UDP/ICMP session limit is hit
   * </pre>
   *
   * <code>bool max_other_session_limit_hit = 17;</code>
   * @return The maxOtherSessionLimitHit.
   */
  boolean getMaxOtherSessionLimitHit();

  /**
   * <pre>
   * h/w id of the vnic
   * </pre>
   *
   * <code>int32 hw_idx = 1;</code>
   * @return The hwIdx.
   */
  int getHwIdx();

  /**
   * <pre>
   * nexthop h/w id
   * </pre>
   *
   * <code>int32 nexthop_hw_idx = 2;</code>
   * @return The nexthopHwIdx.
   */
  int getNexthopHwIdx();

  /**
   * <pre>
   * ARM cpu bound policer hw_idx for CPS rate limiting
   * </pre>
   *
   * <code>int32 cps_copp_hw_idx = 10;</code>
   * @return The cpsCoppHwIdx.
   */
  int getCpsCoppHwIdx();

  /**
   * <pre>
   * secondary vnic of (primary) vnic
   * </pre>
   *
   * <code>string secondary_vnic_name_ref = 11;</code>
   * @return The secondaryVnicNameRef.
   */
  java.lang.String getSecondaryVnicNameRef();
  /**
   * <pre>
   * secondary vnic of (primary) vnic
   * </pre>
   *
   * <code>string secondary_vnic_name_ref = 11;</code>
   * @return The bytes for secondaryVnicNameRef.
   */
  com.google.protobuf.ByteString
      getSecondaryVnicNameRefBytes();
}
