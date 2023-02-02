// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: interface.proto

package opi_api.network.cloud.v1alpha1;

public interface HostIfStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.HostIfStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * hw ifidx is a range of hw specifc interfaces index values associated with this host interface
   * </pre>
   *
   * <code>repeated bytes hw_if_idxes = 1;</code>
   * @return A list containing the hwIfIdxes.
   */
  java.util.List<com.google.protobuf.ByteString> getHwIfIdxesList();
  /**
   * <pre>
   * hw ifidx is a range of hw specifc interfaces index values associated with this host interface
   * </pre>
   *
   * <code>repeated bytes hw_if_idxes = 1;</code>
   * @return The count of hwIfIdxes.
   */
  int getHwIfIdxesCount();
  /**
   * <pre>
   * hw ifidx is a range of hw specifc interfaces index values associated with this host interface
   * </pre>
   *
   * <code>repeated bytes hw_if_idxes = 1;</code>
   * @param index The index of the element to return.
   * @return The hwIfIdxes at the given index.
   */
  com.google.protobuf.ByteString getHwIfIdxes(int index);

  /**
   * <pre>
   * MAC address of this interface
   * </pre>
   *
   * <code>bytes mac_address = 2;</code>
   * @return The macAddress.
   */
  com.google.protobuf.ByteString getMacAddress();

  /**
   * <pre>
   * operational status of this interface
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.IfStatus status = 3;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * operational status of this interface
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.IfStatus status = 3;</code>
   * @return The status.
   */
  opi_api.network.cloud.v1alpha1.IfStatus getStatus();

  /**
   * <pre>
   * host interface name
   * </pre>
   *
   * <code>string ifname = 4;</code>
   * @return The ifname.
   */
  java.lang.String getIfname();
  /**
   * <pre>
   * host interface name
   * </pre>
   *
   * <code>string ifname = 4;</code>
   * @return The bytes for ifname.
   */
  com.google.protobuf.ByteString
      getIfnameBytes();
}
