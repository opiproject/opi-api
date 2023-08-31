// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: l2_xpu_infra_mgr.proto

package opi_api.network.evpn_gw.v1alpha1;

/**
 * <pre>
 * Logical Bridge network configuration
 * </pre>
 *
 * Protobuf type {@code opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec}
 */
public final class LogicalBridgeSpec extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec)
    LogicalBridgeSpecOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LogicalBridgeSpec.newBuilder() to construct.
  private LogicalBridgeSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LogicalBridgeSpec() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LogicalBridgeSpec();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LogicalBridgeSpec(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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

            vlanId_ = input.readUInt32();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000001;
            vni_ = input.readUInt32();
            break;
          }
          case 26: {
            opi_api.network.opinetcommon.v1alpha1.IPPrefix.Builder subBuilder = null;
            if (vtepIpPrefix_ != null) {
              subBuilder = vtepIpPrefix_.toBuilder();
            }
            vtepIpPrefix_ = input.readMessage(opi_api.network.opinetcommon.v1alpha1.IPPrefix.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(vtepIpPrefix_);
              vtepIpPrefix_ = subBuilder.buildPartial();
            }

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
    return opi_api.network.evpn_gw.v1alpha1.L2XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_LogicalBridgeSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.evpn_gw.v1alpha1.L2XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_LogicalBridgeSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec.class, opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec.Builder.class);
  }

  private int bitField0_;
  public static final int VLAN_ID_FIELD_NUMBER = 1;
  private int vlanId_;
  /**
   * <pre>
   * the VLAN of the L2 domain
   * (-- api-linter: core::0141::forbidden-types=disabled
   *     aip.dev/not-precedent: vlan cannot be negative number. --)
   * </pre>
   *
   * <code>uint32 vlan_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The vlanId.
   */
  @java.lang.Override
  public int getVlanId() {
    return vlanId_;
  }

  public static final int VNI_FIELD_NUMBER = 2;
  private int vni_;
  /**
   * <pre>
   *VXLAN VNI for the L2 EVPN. Also used as EVPN route target
   * (-- api-linter: core::0141::forbidden-types=disabled
   *     aip.dev/not-precedent: vni cannot be negative number. --)
   * </pre>
   *
   * <code>optional uint32 vni = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the vni field is set.
   */
  @java.lang.Override
  public boolean hasVni() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   *VXLAN VNI for the L2 EVPN. Also used as EVPN route target
   * (-- api-linter: core::0141::forbidden-types=disabled
   *     aip.dev/not-precedent: vni cannot be negative number. --)
   * </pre>
   *
   * <code>optional uint32 vni = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The vni.
   */
  @java.lang.Override
  public int getVni() {
    return vni_;
  }

  public static final int VTEP_IP_PREFIX_FIELD_NUMBER = 3;
  private opi_api.network.opinetcommon.v1alpha1.IPPrefix vtepIpPrefix_;
  /**
   * <pre>
   * IPv4 or IPv6 IP address prefix for the VXLAN TEP
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix vtep_ip_prefix = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the vtepIpPrefix field is set.
   */
  @java.lang.Override
  public boolean hasVtepIpPrefix() {
    return vtepIpPrefix_ != null;
  }
  /**
   * <pre>
   * IPv4 or IPv6 IP address prefix for the VXLAN TEP
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix vtep_ip_prefix = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The vtepIpPrefix.
   */
  @java.lang.Override
  public opi_api.network.opinetcommon.v1alpha1.IPPrefix getVtepIpPrefix() {
    return vtepIpPrefix_ == null ? opi_api.network.opinetcommon.v1alpha1.IPPrefix.getDefaultInstance() : vtepIpPrefix_;
  }
  /**
   * <pre>
   * IPv4 or IPv6 IP address prefix for the VXLAN TEP
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix vtep_ip_prefix = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  @java.lang.Override
  public opi_api.network.opinetcommon.v1alpha1.IPPrefixOrBuilder getVtepIpPrefixOrBuilder() {
    return getVtepIpPrefix();
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
    if (vlanId_ != 0) {
      output.writeUInt32(1, vlanId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeUInt32(2, vni_);
    }
    if (vtepIpPrefix_ != null) {
      output.writeMessage(3, getVtepIpPrefix());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (vlanId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, vlanId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, vni_);
    }
    if (vtepIpPrefix_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getVtepIpPrefix());
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
    if (!(obj instanceof opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec)) {
      return super.equals(obj);
    }
    opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec other = (opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec) obj;

    if (getVlanId()
        != other.getVlanId()) return false;
    if (hasVni() != other.hasVni()) return false;
    if (hasVni()) {
      if (getVni()
          != other.getVni()) return false;
    }
    if (hasVtepIpPrefix() != other.hasVtepIpPrefix()) return false;
    if (hasVtepIpPrefix()) {
      if (!getVtepIpPrefix()
          .equals(other.getVtepIpPrefix())) return false;
    }
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
    hash = (37 * hash) + VLAN_ID_FIELD_NUMBER;
    hash = (53 * hash) + getVlanId();
    if (hasVni()) {
      hash = (37 * hash) + VNI_FIELD_NUMBER;
      hash = (53 * hash) + getVni();
    }
    if (hasVtepIpPrefix()) {
      hash = (37 * hash) + VTEP_IP_PREFIX_FIELD_NUMBER;
      hash = (53 * hash) + getVtepIpPrefix().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec parseFrom(
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
  public static Builder newBuilder(opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec prototype) {
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
   * Logical Bridge network configuration
   * </pre>
   *
   * Protobuf type {@code opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec)
      opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.evpn_gw.v1alpha1.L2XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_LogicalBridgeSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.evpn_gw.v1alpha1.L2XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_LogicalBridgeSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec.class, opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec.Builder.class);
    }

    // Construct using opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec.newBuilder()
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
      vlanId_ = 0;

      vni_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      if (vtepIpPrefixBuilder_ == null) {
        vtepIpPrefix_ = null;
      } else {
        vtepIpPrefix_ = null;
        vtepIpPrefixBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.evpn_gw.v1alpha1.L2XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_LogicalBridgeSpec_descriptor;
    }

    @java.lang.Override
    public opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec getDefaultInstanceForType() {
      return opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec build() {
      opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec buildPartial() {
      opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec result = new opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.vlanId_ = vlanId_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.vni_ = vni_;
        to_bitField0_ |= 0x00000001;
      }
      if (vtepIpPrefixBuilder_ == null) {
        result.vtepIpPrefix_ = vtepIpPrefix_;
      } else {
        result.vtepIpPrefix_ = vtepIpPrefixBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec) {
        return mergeFrom((opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec other) {
      if (other == opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec.getDefaultInstance()) return this;
      if (other.getVlanId() != 0) {
        setVlanId(other.getVlanId());
      }
      if (other.hasVni()) {
        setVni(other.getVni());
      }
      if (other.hasVtepIpPrefix()) {
        mergeVtepIpPrefix(other.getVtepIpPrefix());
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
      opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int vlanId_ ;
    /**
     * <pre>
     * the VLAN of the L2 domain
     * (-- api-linter: core::0141::forbidden-types=disabled
     *     aip.dev/not-precedent: vlan cannot be negative number. --)
     * </pre>
     *
     * <code>uint32 vlan_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The vlanId.
     */
    @java.lang.Override
    public int getVlanId() {
      return vlanId_;
    }
    /**
     * <pre>
     * the VLAN of the L2 domain
     * (-- api-linter: core::0141::forbidden-types=disabled
     *     aip.dev/not-precedent: vlan cannot be negative number. --)
     * </pre>
     *
     * <code>uint32 vlan_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The vlanId to set.
     * @return This builder for chaining.
     */
    public Builder setVlanId(int value) {
      
      vlanId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the VLAN of the L2 domain
     * (-- api-linter: core::0141::forbidden-types=disabled
     *     aip.dev/not-precedent: vlan cannot be negative number. --)
     * </pre>
     *
     * <code>uint32 vlan_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearVlanId() {
      
      vlanId_ = 0;
      onChanged();
      return this;
    }

    private int vni_ ;
    /**
     * <pre>
     *VXLAN VNI for the L2 EVPN. Also used as EVPN route target
     * (-- api-linter: core::0141::forbidden-types=disabled
     *     aip.dev/not-precedent: vni cannot be negative number. --)
     * </pre>
     *
     * <code>optional uint32 vni = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return Whether the vni field is set.
     */
    @java.lang.Override
    public boolean hasVni() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     *VXLAN VNI for the L2 EVPN. Also used as EVPN route target
     * (-- api-linter: core::0141::forbidden-types=disabled
     *     aip.dev/not-precedent: vni cannot be negative number. --)
     * </pre>
     *
     * <code>optional uint32 vni = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The vni.
     */
    @java.lang.Override
    public int getVni() {
      return vni_;
    }
    /**
     * <pre>
     *VXLAN VNI for the L2 EVPN. Also used as EVPN route target
     * (-- api-linter: core::0141::forbidden-types=disabled
     *     aip.dev/not-precedent: vni cannot be negative number. --)
     * </pre>
     *
     * <code>optional uint32 vni = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The vni to set.
     * @return This builder for chaining.
     */
    public Builder setVni(int value) {
      bitField0_ |= 0x00000001;
      vni_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *VXLAN VNI for the L2 EVPN. Also used as EVPN route target
     * (-- api-linter: core::0141::forbidden-types=disabled
     *     aip.dev/not-precedent: vni cannot be negative number. --)
     * </pre>
     *
     * <code>optional uint32 vni = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearVni() {
      bitField0_ = (bitField0_ & ~0x00000001);
      vni_ = 0;
      onChanged();
      return this;
    }

    private opi_api.network.opinetcommon.v1alpha1.IPPrefix vtepIpPrefix_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.opinetcommon.v1alpha1.IPPrefix, opi_api.network.opinetcommon.v1alpha1.IPPrefix.Builder, opi_api.network.opinetcommon.v1alpha1.IPPrefixOrBuilder> vtepIpPrefixBuilder_;
    /**
     * <pre>
     * IPv4 or IPv6 IP address prefix for the VXLAN TEP
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix vtep_ip_prefix = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return Whether the vtepIpPrefix field is set.
     */
    public boolean hasVtepIpPrefix() {
      return vtepIpPrefixBuilder_ != null || vtepIpPrefix_ != null;
    }
    /**
     * <pre>
     * IPv4 or IPv6 IP address prefix for the VXLAN TEP
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix vtep_ip_prefix = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The vtepIpPrefix.
     */
    public opi_api.network.opinetcommon.v1alpha1.IPPrefix getVtepIpPrefix() {
      if (vtepIpPrefixBuilder_ == null) {
        return vtepIpPrefix_ == null ? opi_api.network.opinetcommon.v1alpha1.IPPrefix.getDefaultInstance() : vtepIpPrefix_;
      } else {
        return vtepIpPrefixBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * IPv4 or IPv6 IP address prefix for the VXLAN TEP
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix vtep_ip_prefix = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setVtepIpPrefix(opi_api.network.opinetcommon.v1alpha1.IPPrefix value) {
      if (vtepIpPrefixBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        vtepIpPrefix_ = value;
        onChanged();
      } else {
        vtepIpPrefixBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * IPv4 or IPv6 IP address prefix for the VXLAN TEP
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix vtep_ip_prefix = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setVtepIpPrefix(
        opi_api.network.opinetcommon.v1alpha1.IPPrefix.Builder builderForValue) {
      if (vtepIpPrefixBuilder_ == null) {
        vtepIpPrefix_ = builderForValue.build();
        onChanged();
      } else {
        vtepIpPrefixBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * IPv4 or IPv6 IP address prefix for the VXLAN TEP
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix vtep_ip_prefix = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder mergeVtepIpPrefix(opi_api.network.opinetcommon.v1alpha1.IPPrefix value) {
      if (vtepIpPrefixBuilder_ == null) {
        if (vtepIpPrefix_ != null) {
          vtepIpPrefix_ =
            opi_api.network.opinetcommon.v1alpha1.IPPrefix.newBuilder(vtepIpPrefix_).mergeFrom(value).buildPartial();
        } else {
          vtepIpPrefix_ = value;
        }
        onChanged();
      } else {
        vtepIpPrefixBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * IPv4 or IPv6 IP address prefix for the VXLAN TEP
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix vtep_ip_prefix = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder clearVtepIpPrefix() {
      if (vtepIpPrefixBuilder_ == null) {
        vtepIpPrefix_ = null;
        onChanged();
      } else {
        vtepIpPrefix_ = null;
        vtepIpPrefixBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * IPv4 or IPv6 IP address prefix for the VXLAN TEP
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix vtep_ip_prefix = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public opi_api.network.opinetcommon.v1alpha1.IPPrefix.Builder getVtepIpPrefixBuilder() {
      
      onChanged();
      return getVtepIpPrefixFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * IPv4 or IPv6 IP address prefix for the VXLAN TEP
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix vtep_ip_prefix = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public opi_api.network.opinetcommon.v1alpha1.IPPrefixOrBuilder getVtepIpPrefixOrBuilder() {
      if (vtepIpPrefixBuilder_ != null) {
        return vtepIpPrefixBuilder_.getMessageOrBuilder();
      } else {
        return vtepIpPrefix_ == null ?
            opi_api.network.opinetcommon.v1alpha1.IPPrefix.getDefaultInstance() : vtepIpPrefix_;
      }
    }
    /**
     * <pre>
     * IPv4 or IPv6 IP address prefix for the VXLAN TEP
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix vtep_ip_prefix = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.opinetcommon.v1alpha1.IPPrefix, opi_api.network.opinetcommon.v1alpha1.IPPrefix.Builder, opi_api.network.opinetcommon.v1alpha1.IPPrefixOrBuilder> 
        getVtepIpPrefixFieldBuilder() {
      if (vtepIpPrefixBuilder_ == null) {
        vtepIpPrefixBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.network.opinetcommon.v1alpha1.IPPrefix, opi_api.network.opinetcommon.v1alpha1.IPPrefix.Builder, opi_api.network.opinetcommon.v1alpha1.IPPrefixOrBuilder>(
                getVtepIpPrefix(),
                getParentForChildren(),
                isClean());
        vtepIpPrefix_ = null;
      }
      return vtepIpPrefixBuilder_;
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


    // @@protoc_insertion_point(builder_scope:opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec)
  private static final opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec();
  }

  public static opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LogicalBridgeSpec>
      PARSER = new com.google.protobuf.AbstractParser<LogicalBridgeSpec>() {
    @java.lang.Override
    public LogicalBridgeSpec parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LogicalBridgeSpec(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LogicalBridgeSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LogicalBridgeSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

