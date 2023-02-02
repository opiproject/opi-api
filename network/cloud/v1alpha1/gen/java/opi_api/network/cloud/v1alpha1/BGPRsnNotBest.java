// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bgp.proto

package opi_api.network.cloud.v1alpha1;

/**
 * <pre>
 * BGP Reason for not best route
 * </pre>
 *
 * Protobuf enum {@code opi_api.network.cloud.v1alpha1.BGPRsnNotBest}
 */
public enum BGPRsnNotBest
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * not considered
   * (-- api-linter: core::0126::unspecified=disabled
   *     aip.dev/not-precedent: zero is not-considered, not unspecified. --)
   * </pre>
   *
   * <code>BGP_REASON_NOT_CONSIDERED = 0;</code>
   */
  BGP_REASON_NOT_CONSIDERED(0),
  /**
   * <pre>
   * route is best
   * </pre>
   *
   * <code>BGP_REASON_ROUTE_IS_BEST = 1;</code>
   */
  BGP_REASON_ROUTE_IS_BEST(1),
  /**
   * <pre>
   * weight based
   * </pre>
   *
   * <code>BGP_REASON_WEIGHT = 2;</code>
   */
  BGP_REASON_WEIGHT(2),
  /**
   * <pre>
   * local preference
   * </pre>
   *
   * <code>BGP_REASON_LOCAL_PREF = 3;</code>
   */
  BGP_REASON_LOCAL_PREF(3),
  /**
   * <pre>
   * local origin preferred
   * </pre>
   *
   * <code>BGP_REASON_LCL_ORIG_PRFRRED = 4;</code>
   */
  BGP_REASON_LCL_ORIG_PRFRRED(4),
  /**
   * <pre>
   * as path lengt
   * </pre>
   *
   * <code>BGP_REASON_AS_PATH_LEN = 5;</code>
   */
  BGP_REASON_AS_PATH_LEN(5),
  /**
   * <pre>
   * origin based
   * </pre>
   *
   * <code>BGP_REASON_ORIGIN = 6;</code>
   */
  BGP_REASON_ORIGIN(6),
  /**
   * <pre>
   * med
   * </pre>
   *
   * <code>BGP_REASON_MED = 7;</code>
   */
  BGP_REASON_MED(7),
  /**
   * <pre>
   * origin tie
   * </pre>
   *
   * <code>BGP_REASON_LOCAL_ORIG_TIE = 8;</code>
   */
  BGP_REASON_LOCAL_ORIG_TIE(8),
  /**
   * <pre>
   * ebpg vs. ibgp peer
   * </pre>
   *
   * <code>BGP_REASON_EBGP_V_IBGP_PEER = 9;</code>
   */
  BGP_REASON_EBGP_V_IBGP_PEER(9),
  /**
   * <pre>
   * admin distance
   * </pre>
   *
   * <code>BGP_REASON_ADMIN_DISTANCE = 10;</code>
   */
  BGP_REASON_ADMIN_DISTANCE(10),
  /**
   * <pre>
   * path next to cst
   * </pre>
   *
   * <code>BGP_REASON_PATH_TO_NEXT_CST = 11;</code>
   */
  BGP_REASON_PATH_TO_NEXT_CST(11),
  /**
   * <pre>
   * preferenc existing
   * </pre>
   *
   * <code>BGP_REASON_PREF_EXISTING = 12;</code>
   */
  BGP_REASON_PREF_EXISTING(12),
  /**
   * <pre>
   * reason identifier
   * (-- api-linter: core::0140::abbreviations=disabled
   *     aip.dev/not-precedent: --)
   * </pre>
   *
   * <code>BGP_REASON_IDENTIFIER = 13;</code>
   */
  BGP_REASON_IDENTIFIER(13),
  /**
   * <pre>
   * cluster length
   * </pre>
   *
   * <code>BGP_REASON_CLUSTER_LEN = 14;</code>
   */
  BGP_REASON_CLUSTER_LEN(14),
  /**
   * <pre>
   * peer address type
   * </pre>
   *
   * <code>BGP_REASON_PEER_ADDR_TYPE = 15;</code>
   */
  BGP_REASON_PEER_ADDR_TYPE(15),
  /**
   * <pre>
   * peer address
   * </pre>
   *
   * <code>BGP_REASON_PEER_ADDR = 16;</code>
   */
  BGP_REASON_PEER_ADDR(16),
  /**
   * <pre>
   * peer port
   * </pre>
   *
   * <code>BGP_REASON_PEER_PORT = 17;</code>
   */
  BGP_REASON_PEER_PORT(17),
  /**
   * <pre>
   * path id
   * </pre>
   *
   * <code>BGP_REASON_PATH_ID = 18;</code>
   */
  BGP_REASON_PATH_ID(18),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * not considered
   * (-- api-linter: core::0126::unspecified=disabled
   *     aip.dev/not-precedent: zero is not-considered, not unspecified. --)
   * </pre>
   *
   * <code>BGP_REASON_NOT_CONSIDERED = 0;</code>
   */
  public static final int BGP_REASON_NOT_CONSIDERED_VALUE = 0;
  /**
   * <pre>
   * route is best
   * </pre>
   *
   * <code>BGP_REASON_ROUTE_IS_BEST = 1;</code>
   */
  public static final int BGP_REASON_ROUTE_IS_BEST_VALUE = 1;
  /**
   * <pre>
   * weight based
   * </pre>
   *
   * <code>BGP_REASON_WEIGHT = 2;</code>
   */
  public static final int BGP_REASON_WEIGHT_VALUE = 2;
  /**
   * <pre>
   * local preference
   * </pre>
   *
   * <code>BGP_REASON_LOCAL_PREF = 3;</code>
   */
  public static final int BGP_REASON_LOCAL_PREF_VALUE = 3;
  /**
   * <pre>
   * local origin preferred
   * </pre>
   *
   * <code>BGP_REASON_LCL_ORIG_PRFRRED = 4;</code>
   */
  public static final int BGP_REASON_LCL_ORIG_PRFRRED_VALUE = 4;
  /**
   * <pre>
   * as path lengt
   * </pre>
   *
   * <code>BGP_REASON_AS_PATH_LEN = 5;</code>
   */
  public static final int BGP_REASON_AS_PATH_LEN_VALUE = 5;
  /**
   * <pre>
   * origin based
   * </pre>
   *
   * <code>BGP_REASON_ORIGIN = 6;</code>
   */
  public static final int BGP_REASON_ORIGIN_VALUE = 6;
  /**
   * <pre>
   * med
   * </pre>
   *
   * <code>BGP_REASON_MED = 7;</code>
   */
  public static final int BGP_REASON_MED_VALUE = 7;
  /**
   * <pre>
   * origin tie
   * </pre>
   *
   * <code>BGP_REASON_LOCAL_ORIG_TIE = 8;</code>
   */
  public static final int BGP_REASON_LOCAL_ORIG_TIE_VALUE = 8;
  /**
   * <pre>
   * ebpg vs. ibgp peer
   * </pre>
   *
   * <code>BGP_REASON_EBGP_V_IBGP_PEER = 9;</code>
   */
  public static final int BGP_REASON_EBGP_V_IBGP_PEER_VALUE = 9;
  /**
   * <pre>
   * admin distance
   * </pre>
   *
   * <code>BGP_REASON_ADMIN_DISTANCE = 10;</code>
   */
  public static final int BGP_REASON_ADMIN_DISTANCE_VALUE = 10;
  /**
   * <pre>
   * path next to cst
   * </pre>
   *
   * <code>BGP_REASON_PATH_TO_NEXT_CST = 11;</code>
   */
  public static final int BGP_REASON_PATH_TO_NEXT_CST_VALUE = 11;
  /**
   * <pre>
   * preferenc existing
   * </pre>
   *
   * <code>BGP_REASON_PREF_EXISTING = 12;</code>
   */
  public static final int BGP_REASON_PREF_EXISTING_VALUE = 12;
  /**
   * <pre>
   * reason identifier
   * (-- api-linter: core::0140::abbreviations=disabled
   *     aip.dev/not-precedent: --)
   * </pre>
   *
   * <code>BGP_REASON_IDENTIFIER = 13;</code>
   */
  public static final int BGP_REASON_IDENTIFIER_VALUE = 13;
  /**
   * <pre>
   * cluster length
   * </pre>
   *
   * <code>BGP_REASON_CLUSTER_LEN = 14;</code>
   */
  public static final int BGP_REASON_CLUSTER_LEN_VALUE = 14;
  /**
   * <pre>
   * peer address type
   * </pre>
   *
   * <code>BGP_REASON_PEER_ADDR_TYPE = 15;</code>
   */
  public static final int BGP_REASON_PEER_ADDR_TYPE_VALUE = 15;
  /**
   * <pre>
   * peer address
   * </pre>
   *
   * <code>BGP_REASON_PEER_ADDR = 16;</code>
   */
  public static final int BGP_REASON_PEER_ADDR_VALUE = 16;
  /**
   * <pre>
   * peer port
   * </pre>
   *
   * <code>BGP_REASON_PEER_PORT = 17;</code>
   */
  public static final int BGP_REASON_PEER_PORT_VALUE = 17;
  /**
   * <pre>
   * path id
   * </pre>
   *
   * <code>BGP_REASON_PATH_ID = 18;</code>
   */
  public static final int BGP_REASON_PATH_ID_VALUE = 18;


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
  public static BGPRsnNotBest valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static BGPRsnNotBest forNumber(int value) {
    switch (value) {
      case 0: return BGP_REASON_NOT_CONSIDERED;
      case 1: return BGP_REASON_ROUTE_IS_BEST;
      case 2: return BGP_REASON_WEIGHT;
      case 3: return BGP_REASON_LOCAL_PREF;
      case 4: return BGP_REASON_LCL_ORIG_PRFRRED;
      case 5: return BGP_REASON_AS_PATH_LEN;
      case 6: return BGP_REASON_ORIGIN;
      case 7: return BGP_REASON_MED;
      case 8: return BGP_REASON_LOCAL_ORIG_TIE;
      case 9: return BGP_REASON_EBGP_V_IBGP_PEER;
      case 10: return BGP_REASON_ADMIN_DISTANCE;
      case 11: return BGP_REASON_PATH_TO_NEXT_CST;
      case 12: return BGP_REASON_PREF_EXISTING;
      case 13: return BGP_REASON_IDENTIFIER;
      case 14: return BGP_REASON_CLUSTER_LEN;
      case 15: return BGP_REASON_PEER_ADDR_TYPE;
      case 16: return BGP_REASON_PEER_ADDR;
      case 17: return BGP_REASON_PEER_PORT;
      case 18: return BGP_REASON_PATH_ID;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<BGPRsnNotBest>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      BGPRsnNotBest> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<BGPRsnNotBest>() {
          public BGPRsnNotBest findValueByNumber(int number) {
            return BGPRsnNotBest.forNumber(number);
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
    return opi_api.network.cloud.v1alpha1.BGPProto.getDescriptor().getEnumTypes().get(11);
  }

  private static final BGPRsnNotBest[] VALUES = values();

  public static BGPRsnNotBest valueOf(
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

  private BGPRsnNotBest(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:opi_api.network.cloud.v1alpha1.BGPRsnNotBest)
}

