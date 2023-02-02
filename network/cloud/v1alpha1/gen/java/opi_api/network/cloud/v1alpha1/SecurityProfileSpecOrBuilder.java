// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: networkpolicy.proto

package opi_api.network.cloud.v1alpha1;

public interface SecurityProfileSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.SecurityProfileSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * unique identifier of security profile
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * unique identifier of security profile
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
   * @return The id.
   */
  opi_api.common.v1.ObjectKey getId();
  /**
   * <pre>
   * unique identifier of security profile
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
   */
  opi_api.common.v1.ObjectKeyOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * ConnTrackEn, if set to true, will enable full connection tracking
   * if connection_tracking_enable is modified on the fly, it will take affect only
   * on sessions created thereafter and doesn't affect existing sessions
   * </pre>
   *
   * <code>bool connection_tracking_enable = 2;</code>
   * @return The connectionTrackingEnable.
   */
  boolean getConnectionTrackingEnable();

  /**
   * <pre>
   * rule_stats_enable, if set to true, will enable per security policy rule
   * statistics feature in the datapath (by default rule stats functionality is
   * turned off and can be enabled on the fly for debugging)
   * </pre>
   *
   * <code>bool rule_stats_enable = 3;</code>
   * @return The ruleStatsEnable.
   */
  boolean getRuleStatsEnable();

  /**
   * <pre>
   * default_firewall_action is the action taken by the smartnic when policies are
   * configured on the subnet or vnic, no rule matches and default action for policy is none
   * this will have effect iff policy is attached on either vnic or subnet.
   * if no action is specified  in security profile, default action is "deny"
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.SecurityRuleAction default_firewall_action = 4;</code>
   * @return The enum numeric value on the wire for defaultFirewallAction.
   */
  int getDefaultFirewallActionValue();
  /**
   * <pre>
   * default_firewall_action is the action taken by the smartnic when policies are
   * configured on the subnet or vnic, no rule matches and default action for policy is none
   * this will have effect iff policy is attached on either vnic or subnet.
   * if no action is specified  in security profile, default action is "deny"
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.SecurityRuleAction default_firewall_action = 4;</code>
   * @return The defaultFirewallAction.
   */
  opi_api.network.opinetcommon.v1alpha1.SecurityRuleAction getDefaultFirewallAction();

  /**
   * <pre>
   * timeouts for established sessions per TCP/UDP/ICMP and other protocols
   * range:1-86400, default=600
   * </pre>
   *
   * <code>int32 tcp_idle_timeout = 5;</code>
   * @return The tcpIdleTimeout.
   */
  int getTcpIdleTimeout();

  /**
   * <pre>
   * range:1-86400, default=120
   * </pre>
   *
   * <code>int32 udp_idle_timeout = 6;</code>
   * @return The udpIdleTimeout.
   */
  int getUdpIdleTimeout();

  /**
   * <pre>
   * range:1-86400, default=15
   * </pre>
   *
   * <code>int32 icmp_idle_timeout = 7;</code>
   * @return The icmpIdleTimeout.
   */
  int getIcmpIdleTimeout();

  /**
   * <pre>
   * range:1-86400, default=90
   * </pre>
   *
   * <code>int32 other_idle_timeout = 8;</code>
   * @return The otherIdleTimeout.
   */
  int getOtherIdleTimeout();

  /**
   * <pre>
   * TCP specific timeouts
   * tcp_connection_setup_timeout is the maximum allowed time since first SYN seen to
   * 3-way handshake completion, session gets cleaned up if 3-way handshake is
   * not completed and session moves to ESTABLISHED state by then.  range:1-60, default=10
   * </pre>
   *
   * <code>int32 tcp_connection_setup_timeout = 9;</code>
   * @return The tcpConnectionSetupTimeout.
   */
  int getTcpConnectionSetupTimeout();

  /**
   * <pre>
   * tcp_half_close_timeout is the maximum allowed time since first FIN seen to
   * 3/4way close, session gets cleaned up if this timer elapses. range:1-172800, default=120
   * </pre>
   *
   * <code>int32 tcp_half_close_timeout = 10;</code>
   * @return The tcpHalfCloseTimeout.
   */
  int getTcpHalfCloseTimeout();

  /**
   * <pre>
   * tcp_close_timeout is wait time since FIN is seen from *both* sides (or RST)
   * before cleaning up the session range:1-300, default=15
   * </pre>
   *
   * <code>int32 tcp_close_timeout = 11;</code>
   * @return The tcpCloseTimeout.
   */
  int getTcpCloseTimeout();

  /**
   * <pre>
   * timeouts applicable to sessions installed with drop action
   * range:1-300, default=90
   * </pre>
   *
   * <code>int32 tcp_dorp_timeout = 12;</code>
   * @return The tcpDorpTimeout.
   */
  int getTcpDorpTimeout();

  /**
   * <pre>
   * range:1-172800, default=60
   * </pre>
   *
   * <code>int32 udp_drop_timeout = 13;</code>
   * @return The udpDropTimeout.
   */
  int getUdpDropTimeout();

  /**
   * <pre>
   * range:1-300, default=30
   * </pre>
   *
   * <code>int32 icmp_drop_timeout = 14;</code>
   * @return The icmpDropTimeout.
   */
  int getIcmpDropTimeout();

  /**
   * <pre>
   * range:1-300, default=60
   * </pre>
   *
   * <code>int32 other_drop_timeout = 15;</code>
   * @return The otherDropTimeout.
   */
  int getOtherDropTimeout();
}
