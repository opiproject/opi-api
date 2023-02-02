// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: interface.proto

package opi_api.network.cloud.v1alpha1;

public interface HostIfSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.HostIfSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * VF has vf set to true, otherwise the interface is assumed to be a PF
   * </pre>
   *
   * <code>bool vf = 1;</code>
   * @return The vf.
   */
  boolean getVf();

  /**
   * <pre>
   * ConnTrackEnable will enable full connection tracking, enabled for new connections
   * </pre>
   *
   * <code>bool enable_connection_tracking = 2;</code>
   * @return The enableConnectionTracking.
   */
  boolean getEnableConnectionTracking();

  /**
   * <pre>
   * DPU will assign a mac address to a PF, user can modify this (effective upon reboot)
   * </pre>
   *
   * <code>bytes mac_address = 3;</code>
   * @return The macAddress.
   */
  com.google.protobuf.ByteString getMacAddress();

  /**
   * <pre>
   * interface name (this can be populated from what is obtaine from the driver
   * for easier troublsehooting, or other operations
   * </pre>
   *
   * <code>string ifname = 4;</code>
   * @return The ifname.
   */
  java.lang.String getIfname();
  /**
   * <pre>
   * interface name (this can be populated from what is obtaine from the driver
   * for easier troublsehooting, or other operations
   * </pre>
   *
   * <code>string ifname = 4;</code>
   * @return The bytes for ifname.
   */
  com.google.protobuf.ByteString
      getIfnameBytes();
}
