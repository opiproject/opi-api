// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: l2_xpu_infra_mgr.proto

package opi_api.network.evpn_gw.v1alpha1;

/**
 * <pre>
 * operational status of a Bridge Port
 * </pre>
 *
 * Protobuf type {@code opi_api.network.evpn_gw.v1alpha1.BridgePortStatus}
 */
public final class BridgePortStatus extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.evpn_gw.v1alpha1.BridgePortStatus)
    BridgePortStatusOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BridgePortStatus.newBuilder() to construct.
  private BridgePortStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BridgePortStatus() {
    operStatus_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BridgePortStatus();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BridgePortStatus(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            int rawValue = input.readEnum();

            operStatus_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.network.evpn_gw.v1alpha1.L2XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_BridgePortStatus_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.evpn_gw.v1alpha1.L2XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_BridgePortStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.evpn_gw.v1alpha1.BridgePortStatus.class, opi_api.network.evpn_gw.v1alpha1.BridgePortStatus.Builder.class);
  }

  public static final int OPER_STATUS_FIELD_NUMBER = 1;
  private int operStatus_;
  /**
   * <pre>
   * operational status of a Bridge Port
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.BPOperStatus oper_status = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for operStatus.
   */
  @java.lang.Override public int getOperStatusValue() {
    return operStatus_;
  }
  /**
   * <pre>
   * operational status of a Bridge Port
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.BPOperStatus oper_status = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The operStatus.
   */
  @java.lang.Override public opi_api.network.evpn_gw.v1alpha1.BPOperStatus getOperStatus() {
    @SuppressWarnings("deprecation")
    opi_api.network.evpn_gw.v1alpha1.BPOperStatus result = opi_api.network.evpn_gw.v1alpha1.BPOperStatus.valueOf(operStatus_);
    return result == null ? opi_api.network.evpn_gw.v1alpha1.BPOperStatus.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (operStatus_ != opi_api.network.evpn_gw.v1alpha1.BPOperStatus.BP_OPER_STATUS_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, operStatus_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (operStatus_ != opi_api.network.evpn_gw.v1alpha1.BPOperStatus.BP_OPER_STATUS_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, operStatus_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof opi_api.network.evpn_gw.v1alpha1.BridgePortStatus)) {
      return super.equals(obj);
    }
    opi_api.network.evpn_gw.v1alpha1.BridgePortStatus other = (opi_api.network.evpn_gw.v1alpha1.BridgePortStatus) obj;

    if (operStatus_ != other.operStatus_) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + OPER_STATUS_FIELD_NUMBER;
    hash = (53 * hash) + operStatus_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.evpn_gw.v1alpha1.BridgePortStatus parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.evpn_gw.v1alpha1.BridgePortStatus parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.BridgePortStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.evpn_gw.v1alpha1.BridgePortStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.BridgePortStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.evpn_gw.v1alpha1.BridgePortStatus parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.BridgePortStatus parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.evpn_gw.v1alpha1.BridgePortStatus parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.BridgePortStatus parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.evpn_gw.v1alpha1.BridgePortStatus parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.BridgePortStatus parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.evpn_gw.v1alpha1.BridgePortStatus parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(opi_api.network.evpn_gw.v1alpha1.BridgePortStatus prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * operational status of a Bridge Port
   * </pre>
   *
   * Protobuf type {@code opi_api.network.evpn_gw.v1alpha1.BridgePortStatus}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.evpn_gw.v1alpha1.BridgePortStatus)
      opi_api.network.evpn_gw.v1alpha1.BridgePortStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.evpn_gw.v1alpha1.L2XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_BridgePortStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.evpn_gw.v1alpha1.L2XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_BridgePortStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.evpn_gw.v1alpha1.BridgePortStatus.class, opi_api.network.evpn_gw.v1alpha1.BridgePortStatus.Builder.class);
    }

    // Construct using opi_api.network.evpn_gw.v1alpha1.BridgePortStatus.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      operStatus_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.evpn_gw.v1alpha1.L2XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_BridgePortStatus_descriptor;
    }

    @java.lang.Override
    public opi_api.network.evpn_gw.v1alpha1.BridgePortStatus getDefaultInstanceForType() {
      return opi_api.network.evpn_gw.v1alpha1.BridgePortStatus.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.evpn_gw.v1alpha1.BridgePortStatus build() {
      opi_api.network.evpn_gw.v1alpha1.BridgePortStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.evpn_gw.v1alpha1.BridgePortStatus buildPartial() {
      opi_api.network.evpn_gw.v1alpha1.BridgePortStatus result = new opi_api.network.evpn_gw.v1alpha1.BridgePortStatus(this);
      result.operStatus_ = operStatus_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof opi_api.network.evpn_gw.v1alpha1.BridgePortStatus) {
        return mergeFrom((opi_api.network.evpn_gw.v1alpha1.BridgePortStatus)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.evpn_gw.v1alpha1.BridgePortStatus other) {
      if (other == opi_api.network.evpn_gw.v1alpha1.BridgePortStatus.getDefaultInstance()) return this;
      if (other.operStatus_ != 0) {
        setOperStatusValue(other.getOperStatusValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      opi_api.network.evpn_gw.v1alpha1.BridgePortStatus parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.evpn_gw.v1alpha1.BridgePortStatus) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int operStatus_ = 0;
    /**
     * <pre>
     * operational status of a Bridge Port
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.BPOperStatus oper_status = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The enum numeric value on the wire for operStatus.
     */
    @java.lang.Override public int getOperStatusValue() {
      return operStatus_;
    }
    /**
     * <pre>
     * operational status of a Bridge Port
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.BPOperStatus oper_status = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The enum numeric value on the wire for operStatus to set.
     * @return This builder for chaining.
     */
    public Builder setOperStatusValue(int value) {
      
      operStatus_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * operational status of a Bridge Port
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.BPOperStatus oper_status = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The operStatus.
     */
    @java.lang.Override
    public opi_api.network.evpn_gw.v1alpha1.BPOperStatus getOperStatus() {
      @SuppressWarnings("deprecation")
      opi_api.network.evpn_gw.v1alpha1.BPOperStatus result = opi_api.network.evpn_gw.v1alpha1.BPOperStatus.valueOf(operStatus_);
      return result == null ? opi_api.network.evpn_gw.v1alpha1.BPOperStatus.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * operational status of a Bridge Port
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.BPOperStatus oper_status = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The operStatus to set.
     * @return This builder for chaining.
     */
    public Builder setOperStatus(opi_api.network.evpn_gw.v1alpha1.BPOperStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      operStatus_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * operational status of a Bridge Port
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.BPOperStatus oper_status = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearOperStatus() {
      
      operStatus_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:opi_api.network.evpn_gw.v1alpha1.BridgePortStatus)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.evpn_gw.v1alpha1.BridgePortStatus)
  private static final opi_api.network.evpn_gw.v1alpha1.BridgePortStatus DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.evpn_gw.v1alpha1.BridgePortStatus();
  }

  public static opi_api.network.evpn_gw.v1alpha1.BridgePortStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BridgePortStatus>
      PARSER = new com.google.protobuf.AbstractParser<BridgePortStatus>() {
    @java.lang.Override
    public BridgePortStatus parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BridgePortStatus(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BridgePortStatus> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BridgePortStatus> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.evpn_gw.v1alpha1.BridgePortStatus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

