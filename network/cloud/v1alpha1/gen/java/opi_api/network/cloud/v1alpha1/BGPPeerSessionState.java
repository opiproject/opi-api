// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bgp.proto

package opi_api.network.cloud.v1alpha1;

/**
 * <pre>
 * BGP peer session's last_state
 * </pre>
 *
 * Protobuf enum {@code opi_api.network.cloud.v1alpha1.BGPPeerSessionState}
 */
public enum BGPPeerSessionState
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * unspecified
   * </pre>
   *
   * <code>BGP_PEER_SESSION_STATE_UNSPECIFIED = 0;</code>
   */
  BGP_PEER_SESSION_STATE_UNSPECIFIED(0),
  /**
   * <pre>
   * idle
   * </pre>
   *
   * <code>BGP_PEER_SESSION_STATE_IDLE = 1;</code>
   */
  BGP_PEER_SESSION_STATE_IDLE(1),
  /**
   * <pre>
   * connect
   * </pre>
   *
   * <code>BGP_PEER_SESSION_STATE_CONNECT = 2;</code>
   */
  BGP_PEER_SESSION_STATE_CONNECT(2),
  /**
   * <pre>
   * active
   * </pre>
   *
   * <code>BGP_PEER_SESSION_STATE_ACTIVE = 3;</code>
   */
  BGP_PEER_SESSION_STATE_ACTIVE(3),
  /**
   * <pre>
   * open-sent
   * </pre>
   *
   * <code>BGP_PEER_SESSION_STATE_OPENSENT = 4;</code>
   */
  BGP_PEER_SESSION_STATE_OPENSENT(4),
  /**
   * <pre>
   * open-confirm
   * </pre>
   *
   * <code>BGP_PEER_SESSION_STATE_OPENCONFIRM = 5;</code>
   */
  BGP_PEER_SESSION_STATE_OPENCONFIRM(5),
  /**
   * <pre>
   * open-established
   * </pre>
   *
   * <code>BGP_PEER_SESSION_STATE_ESTABLISHED = 6;</code>
   */
  BGP_PEER_SESSION_STATE_ESTABLISHED(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * unspecified
   * </pre>
   *
   * <code>BGP_PEER_SESSION_STATE_UNSPECIFIED = 0;</code>
   */
  public static final int BGP_PEER_SESSION_STATE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * idle
   * </pre>
   *
   * <code>BGP_PEER_SESSION_STATE_IDLE = 1;</code>
   */
  public static final int BGP_PEER_SESSION_STATE_IDLE_VALUE = 1;
  /**
   * <pre>
   * connect
   * </pre>
   *
   * <code>BGP_PEER_SESSION_STATE_CONNECT = 2;</code>
   */
  public static final int BGP_PEER_SESSION_STATE_CONNECT_VALUE = 2;
  /**
   * <pre>
   * active
   * </pre>
   *
   * <code>BGP_PEER_SESSION_STATE_ACTIVE = 3;</code>
   */
  public static final int BGP_PEER_SESSION_STATE_ACTIVE_VALUE = 3;
  /**
   * <pre>
   * open-sent
   * </pre>
   *
   * <code>BGP_PEER_SESSION_STATE_OPENSENT = 4;</code>
   */
  public static final int BGP_PEER_SESSION_STATE_OPENSENT_VALUE = 4;
  /**
   * <pre>
   * open-confirm
   * </pre>
   *
   * <code>BGP_PEER_SESSION_STATE_OPENCONFIRM = 5;</code>
   */
  public static final int BGP_PEER_SESSION_STATE_OPENCONFIRM_VALUE = 5;
  /**
   * <pre>
   * open-established
   * </pre>
   *
   * <code>BGP_PEER_SESSION_STATE_ESTABLISHED = 6;</code>
   */
  public static final int BGP_PEER_SESSION_STATE_ESTABLISHED_VALUE = 6;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static BGPPeerSessionState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static BGPPeerSessionState forNumber(int value) {
    switch (value) {
      case 0: return BGP_PEER_SESSION_STATE_UNSPECIFIED;
      case 1: return BGP_PEER_SESSION_STATE_IDLE;
      case 2: return BGP_PEER_SESSION_STATE_CONNECT;
      case 3: return BGP_PEER_SESSION_STATE_ACTIVE;
      case 4: return BGP_PEER_SESSION_STATE_OPENSENT;
      case 5: return BGP_PEER_SESSION_STATE_OPENCONFIRM;
      case 6: return BGP_PEER_SESSION_STATE_ESTABLISHED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<BGPPeerSessionState>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      BGPPeerSessionState> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<BGPPeerSessionState>() {
          public BGPPeerSessionState findValueByNumber(int number) {
            return BGPPeerSessionState.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return opi_api.network.cloud.v1alpha1.BGPProto.getDescriptor().getEnumTypes().get(3);
  }

  private static final BGPPeerSessionState[] VALUES = values();

  public static BGPPeerSessionState valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private BGPPeerSessionState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:opi_api.network.cloud.v1alpha1.BGPPeerSessionState)
}
