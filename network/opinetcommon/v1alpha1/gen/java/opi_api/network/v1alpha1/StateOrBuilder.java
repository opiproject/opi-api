// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: openconfig_interfaces.proto

package opi_api.network.v1alpha1;

public interface StateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.v1alpha1.State)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the interface.  This is the opaque object
   * used for designating the created interface.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the interface.  This is the opaque object
   * used for designating the created interface.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Interface type indicator
   * </pre>
   *
   * <code>.opi_api.network.v1alpha1.InterfaceType type = 2;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Interface type indicator
   * </pre>
   *
   * <code>.opi_api.network.v1alpha1.InterfaceType type = 2;</code>
   * @return The type.
   */
  opi_api.network.v1alpha1.InterfaceType getType();

  /**
   * <pre>
   * Configured MTU size
   * </pre>
   *
   * <code>uint32 mtu = 3;</code>
   * @return The mtu.
   */
  int getMtu();

  /**
   * <pre>
   * Configured Loopback mode
   * </pre>
   *
   * <code>bool loopback_mode = 4;</code>
   * @return The loopbackMode.
   */
  boolean getLoopbackMode();

  /**
   * <pre>
   * Interface description
   * </pre>
   *
   * <code>string description = 5;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Interface description
   * </pre>
   *
   * <code>string description = 5;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Interface enabled indicator
   * </pre>
   *
   * <code>bool enabled = 6;</code>
   * @return The enabled.
   */
  boolean getEnabled();

  /**
   * <pre>
   * Interface Index
   * </pre>
   *
   * <code>uint32 ifindex = 7;</code>
   * @return The ifindex.
   */
  int getIfindex();

  /**
   * <pre>
   * Admin State
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.AdminState admin_state = 8;</code>
   * @return The enum numeric value on the wire for adminState.
   */
  int getAdminStateValue();
  /**
   * <pre>
   * Admin State
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.AdminState admin_state = 8;</code>
   * @return The adminState.
   */
  opi_api.network.opinetcommon.v1alpha1.AdminState getAdminState();

  /**
   * <pre>
   * Operational State
   * </pre>
   *
   * <code>.opi_api.network.v1alpha1.OperState oper_state = 9;</code>
   * @return The enum numeric value on the wire for operState.
   */
  int getOperStateValue();
  /**
   * <pre>
   * Operational State
   * </pre>
   *
   * <code>.opi_api.network.v1alpha1.OperState oper_state = 9;</code>
   * @return The operState.
   */
  opi_api.network.v1alpha1.OperState getOperState();

  /**
   * <pre>
   * Last Change
   * </pre>
   *
   * <code>uint64 last_change = 10;</code>
   * @return The lastChange.
   */
  long getLastChange();

  /**
   * <pre>
   * Logical interface
   * </pre>
   *
   * <code>bool logical = 11;</code>
   * @return The logical.
   */
  boolean getLogical();

  /**
   * <pre>
   * Management interface indicator
   * </pre>
   *
   * <code>bool management = 12;</code>
   * @return The management.
   */
  boolean getManagement();

  /**
   * <pre>
   * CPU
   * </pre>
   *
   * <code>bool cpu = 13;</code>
   * @return The cpu.
   */
  boolean getCpu();

  /**
   * <pre>
   * Interface Statistics Counters
   * </pre>
   *
   * <code>.opi_api.network.v1alpha1.Counters counters = 14;</code>
   * @return Whether the counters field is set.
   */
  boolean hasCounters();
  /**
   * <pre>
   * Interface Statistics Counters
   * </pre>
   *
   * <code>.opi_api.network.v1alpha1.Counters counters = 14;</code>
   * @return The counters.
   */
  opi_api.network.v1alpha1.Counters getCounters();
  /**
   * <pre>
   * Interface Statistics Counters
   * </pre>
   *
   * <code>.opi_api.network.v1alpha1.Counters counters = 14;</code>
   */
  opi_api.network.v1alpha1.CountersOrBuilder getCountersOrBuilder();
}
