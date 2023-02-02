// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bgp.proto

package opi_api.network.cloud.v1alpha1;

/**
 * <pre>
 * BGP peer AF status
 * </pre>
 *
 * Protobuf type {@code opi_api.network.cloud.v1alpha1.BGPPeerAfStatus}
 */
public final class BGPPeerAfStatus extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.cloud.v1alpha1.BGPPeerAfStatus)
    BGPPeerAfStatusOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BGPPeerAfStatus.newBuilder() to construct.
  private BGPPeerAfStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BGPPeerAfStatus() {
    addPathCapNeg_ = 0;
    reflectorClient_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BGPPeerAfStatus();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BGPPeerAfStatus(
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

            updateGroup_ = input.readInt32();
            break;
          }
          case 16: {

            localAddrScopeId_ = input.readInt32();
            break;
          }
          case 24: {

            routeRefresh_ = input.readBool();
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            addPathCapNeg_ = rawValue;
            break;
          }
          case 40: {
            int rawValue = input.readEnum();

            reflectorClient_ = rawValue;
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
    return opi_api.network.cloud.v1alpha1.BGPProto.internal_static_opi_api_network_cloud_v1alpha1_BGPPeerAfStatus_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.cloud.v1alpha1.BGPProto.internal_static_opi_api_network_cloud_v1alpha1_BGPPeerAfStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.cloud.v1alpha1.BGPPeerAfStatus.class, opi_api.network.cloud.v1alpha1.BGPPeerAfStatus.Builder.class);
  }

  public static final int UPDATE_GROUP_FIELD_NUMBER = 1;
  private int updateGroup_;
  /**
   * <pre>
   * BGP The index of the update group that the peer is a member of for this AFI/SAFI
   * </pre>
   *
   * <code>int32 update_group = 1;</code>
   * @return The updateGroup.
   */
  @java.lang.Override
  public int getUpdateGroup() {
    return updateGroup_;
  }

  public static final int LOCAL_ADDR_SCOPE_ID_FIELD_NUMBER = 2;
  private int localAddrScopeId_;
  /**
   * <pre>
   * For a peer identified by a link-local IPv6 addresses, this is the scope ID
   * of bgpPeerLocalAddr and bgpPeerRemoteAddr.
   * </pre>
   *
   * <code>int32 local_addr_scope_id = 2;</code>
   * @return The localAddrScopeId.
   */
  @java.lang.Override
  public int getLocalAddrScopeId() {
    return localAddrScopeId_;
  }

  public static final int ROUTE_REFRESH_FIELD_NUMBER = 3;
  private boolean routeRefresh_;
  /**
   * <pre>
   * send a Route Refresh request to the peer for this AFI/SAFI.
   * </pre>
   *
   * <code>bool route_refresh = 3;</code>
   * @return The routeRefresh.
   */
  @java.lang.Override
  public boolean getRouteRefresh() {
    return routeRefresh_;
  }

  public static final int ADD_PATH_CAP_NEG_FIELD_NUMBER = 4;
  private int addPathCapNeg_;
  /**
   * <pre>
   *The BGP additional path capability negotiated with this peer for this AFI/SAFI.
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.BgpAddPathCapNegCap add_path_cap_neg = 4;</code>
   * @return The enum numeric value on the wire for addPathCapNeg.
   */
  @java.lang.Override public int getAddPathCapNegValue() {
    return addPathCapNeg_;
  }
  /**
   * <pre>
   *The BGP additional path capability negotiated with this peer for this AFI/SAFI.
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.BgpAddPathCapNegCap add_path_cap_neg = 4;</code>
   * @return The addPathCapNeg.
   */
  @java.lang.Override public opi_api.network.cloud.v1alpha1.BgpAddPathCapNegCap getAddPathCapNeg() {
    @SuppressWarnings("deprecation")
    opi_api.network.cloud.v1alpha1.BgpAddPathCapNegCap result = opi_api.network.cloud.v1alpha1.BgpAddPathCapNegCap.valueOf(addPathCapNeg_);
    return result == null ? opi_api.network.cloud.v1alpha1.BgpAddPathCapNegCap.UNRECOGNIZED : result;
  }

  public static final int REFLECTOR_CLIENT_FIELD_NUMBER = 5;
  private int reflectorClient_;
  /**
   * <pre>
   * This value indicates whether the given peer is a reflector client of this
   * router for this AFI/SAFI, or not
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.BGPPeerRRClient reflector_client = 5;</code>
   * @return The enum numeric value on the wire for reflectorClient.
   */
  @java.lang.Override public int getReflectorClientValue() {
    return reflectorClient_;
  }
  /**
   * <pre>
   * This value indicates whether the given peer is a reflector client of this
   * router for this AFI/SAFI, or not
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.BGPPeerRRClient reflector_client = 5;</code>
   * @return The reflectorClient.
   */
  @java.lang.Override public opi_api.network.cloud.v1alpha1.BGPPeerRRClient getReflectorClient() {
    @SuppressWarnings("deprecation")
    opi_api.network.cloud.v1alpha1.BGPPeerRRClient result = opi_api.network.cloud.v1alpha1.BGPPeerRRClient.valueOf(reflectorClient_);
    return result == null ? opi_api.network.cloud.v1alpha1.BGPPeerRRClient.UNRECOGNIZED : result;
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
    if (updateGroup_ != 0) {
      output.writeInt32(1, updateGroup_);
    }
    if (localAddrScopeId_ != 0) {
      output.writeInt32(2, localAddrScopeId_);
    }
    if (routeRefresh_ != false) {
      output.writeBool(3, routeRefresh_);
    }
    if (addPathCapNeg_ != opi_api.network.cloud.v1alpha1.BgpAddPathCapNegCap.BGP_ADD_PATH_SR_DISABLE.getNumber()) {
      output.writeEnum(4, addPathCapNeg_);
    }
    if (reflectorClient_ != opi_api.network.cloud.v1alpha1.BGPPeerRRClient.BGP_PEER_RR_CLIENT_UNSPECIFIED.getNumber()) {
      output.writeEnum(5, reflectorClient_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (updateGroup_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, updateGroup_);
    }
    if (localAddrScopeId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, localAddrScopeId_);
    }
    if (routeRefresh_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, routeRefresh_);
    }
    if (addPathCapNeg_ != opi_api.network.cloud.v1alpha1.BgpAddPathCapNegCap.BGP_ADD_PATH_SR_DISABLE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, addPathCapNeg_);
    }
    if (reflectorClient_ != opi_api.network.cloud.v1alpha1.BGPPeerRRClient.BGP_PEER_RR_CLIENT_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(5, reflectorClient_);
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
    if (!(obj instanceof opi_api.network.cloud.v1alpha1.BGPPeerAfStatus)) {
      return super.equals(obj);
    }
    opi_api.network.cloud.v1alpha1.BGPPeerAfStatus other = (opi_api.network.cloud.v1alpha1.BGPPeerAfStatus) obj;

    if (getUpdateGroup()
        != other.getUpdateGroup()) return false;
    if (getLocalAddrScopeId()
        != other.getLocalAddrScopeId()) return false;
    if (getRouteRefresh()
        != other.getRouteRefresh()) return false;
    if (addPathCapNeg_ != other.addPathCapNeg_) return false;
    if (reflectorClient_ != other.reflectorClient_) return false;
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
    hash = (37 * hash) + UPDATE_GROUP_FIELD_NUMBER;
    hash = (53 * hash) + getUpdateGroup();
    hash = (37 * hash) + LOCAL_ADDR_SCOPE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getLocalAddrScopeId();
    hash = (37 * hash) + ROUTE_REFRESH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getRouteRefresh());
    hash = (37 * hash) + ADD_PATH_CAP_NEG_FIELD_NUMBER;
    hash = (53 * hash) + addPathCapNeg_;
    hash = (37 * hash) + REFLECTOR_CLIENT_FIELD_NUMBER;
    hash = (53 * hash) + reflectorClient_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.cloud.v1alpha1.BGPPeerAfStatus parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.BGPPeerAfStatus parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.BGPPeerAfStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.BGPPeerAfStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.BGPPeerAfStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.BGPPeerAfStatus parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.BGPPeerAfStatus parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.BGPPeerAfStatus parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.BGPPeerAfStatus parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.BGPPeerAfStatus parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.BGPPeerAfStatus parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.BGPPeerAfStatus parseFrom(
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
  public static Builder newBuilder(opi_api.network.cloud.v1alpha1.BGPPeerAfStatus prototype) {
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
   * BGP peer AF status
   * </pre>
   *
   * Protobuf type {@code opi_api.network.cloud.v1alpha1.BGPPeerAfStatus}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.cloud.v1alpha1.BGPPeerAfStatus)
      opi_api.network.cloud.v1alpha1.BGPPeerAfStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.cloud.v1alpha1.BGPProto.internal_static_opi_api_network_cloud_v1alpha1_BGPPeerAfStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.cloud.v1alpha1.BGPProto.internal_static_opi_api_network_cloud_v1alpha1_BGPPeerAfStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.cloud.v1alpha1.BGPPeerAfStatus.class, opi_api.network.cloud.v1alpha1.BGPPeerAfStatus.Builder.class);
    }

    // Construct using opi_api.network.cloud.v1alpha1.BGPPeerAfStatus.newBuilder()
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
      updateGroup_ = 0;

      localAddrScopeId_ = 0;

      routeRefresh_ = false;

      addPathCapNeg_ = 0;

      reflectorClient_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.cloud.v1alpha1.BGPProto.internal_static_opi_api_network_cloud_v1alpha1_BGPPeerAfStatus_descriptor;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.BGPPeerAfStatus getDefaultInstanceForType() {
      return opi_api.network.cloud.v1alpha1.BGPPeerAfStatus.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.BGPPeerAfStatus build() {
      opi_api.network.cloud.v1alpha1.BGPPeerAfStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.BGPPeerAfStatus buildPartial() {
      opi_api.network.cloud.v1alpha1.BGPPeerAfStatus result = new opi_api.network.cloud.v1alpha1.BGPPeerAfStatus(this);
      result.updateGroup_ = updateGroup_;
      result.localAddrScopeId_ = localAddrScopeId_;
      result.routeRefresh_ = routeRefresh_;
      result.addPathCapNeg_ = addPathCapNeg_;
      result.reflectorClient_ = reflectorClient_;
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
      if (other instanceof opi_api.network.cloud.v1alpha1.BGPPeerAfStatus) {
        return mergeFrom((opi_api.network.cloud.v1alpha1.BGPPeerAfStatus)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.cloud.v1alpha1.BGPPeerAfStatus other) {
      if (other == opi_api.network.cloud.v1alpha1.BGPPeerAfStatus.getDefaultInstance()) return this;
      if (other.getUpdateGroup() != 0) {
        setUpdateGroup(other.getUpdateGroup());
      }
      if (other.getLocalAddrScopeId() != 0) {
        setLocalAddrScopeId(other.getLocalAddrScopeId());
      }
      if (other.getRouteRefresh() != false) {
        setRouteRefresh(other.getRouteRefresh());
      }
      if (other.addPathCapNeg_ != 0) {
        setAddPathCapNegValue(other.getAddPathCapNegValue());
      }
      if (other.reflectorClient_ != 0) {
        setReflectorClientValue(other.getReflectorClientValue());
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
      opi_api.network.cloud.v1alpha1.BGPPeerAfStatus parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.cloud.v1alpha1.BGPPeerAfStatus) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int updateGroup_ ;
    /**
     * <pre>
     * BGP The index of the update group that the peer is a member of for this AFI/SAFI
     * </pre>
     *
     * <code>int32 update_group = 1;</code>
     * @return The updateGroup.
     */
    @java.lang.Override
    public int getUpdateGroup() {
      return updateGroup_;
    }
    /**
     * <pre>
     * BGP The index of the update group that the peer is a member of for this AFI/SAFI
     * </pre>
     *
     * <code>int32 update_group = 1;</code>
     * @param value The updateGroup to set.
     * @return This builder for chaining.
     */
    public Builder setUpdateGroup(int value) {
      
      updateGroup_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * BGP The index of the update group that the peer is a member of for this AFI/SAFI
     * </pre>
     *
     * <code>int32 update_group = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUpdateGroup() {
      
      updateGroup_ = 0;
      onChanged();
      return this;
    }

    private int localAddrScopeId_ ;
    /**
     * <pre>
     * For a peer identified by a link-local IPv6 addresses, this is the scope ID
     * of bgpPeerLocalAddr and bgpPeerRemoteAddr.
     * </pre>
     *
     * <code>int32 local_addr_scope_id = 2;</code>
     * @return The localAddrScopeId.
     */
    @java.lang.Override
    public int getLocalAddrScopeId() {
      return localAddrScopeId_;
    }
    /**
     * <pre>
     * For a peer identified by a link-local IPv6 addresses, this is the scope ID
     * of bgpPeerLocalAddr and bgpPeerRemoteAddr.
     * </pre>
     *
     * <code>int32 local_addr_scope_id = 2;</code>
     * @param value The localAddrScopeId to set.
     * @return This builder for chaining.
     */
    public Builder setLocalAddrScopeId(int value) {
      
      localAddrScopeId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * For a peer identified by a link-local IPv6 addresses, this is the scope ID
     * of bgpPeerLocalAddr and bgpPeerRemoteAddr.
     * </pre>
     *
     * <code>int32 local_addr_scope_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLocalAddrScopeId() {
      
      localAddrScopeId_ = 0;
      onChanged();
      return this;
    }

    private boolean routeRefresh_ ;
    /**
     * <pre>
     * send a Route Refresh request to the peer for this AFI/SAFI.
     * </pre>
     *
     * <code>bool route_refresh = 3;</code>
     * @return The routeRefresh.
     */
    @java.lang.Override
    public boolean getRouteRefresh() {
      return routeRefresh_;
    }
    /**
     * <pre>
     * send a Route Refresh request to the peer for this AFI/SAFI.
     * </pre>
     *
     * <code>bool route_refresh = 3;</code>
     * @param value The routeRefresh to set.
     * @return This builder for chaining.
     */
    public Builder setRouteRefresh(boolean value) {
      
      routeRefresh_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * send a Route Refresh request to the peer for this AFI/SAFI.
     * </pre>
     *
     * <code>bool route_refresh = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRouteRefresh() {
      
      routeRefresh_ = false;
      onChanged();
      return this;
    }

    private int addPathCapNeg_ = 0;
    /**
     * <pre>
     *The BGP additional path capability negotiated with this peer for this AFI/SAFI.
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BgpAddPathCapNegCap add_path_cap_neg = 4;</code>
     * @return The enum numeric value on the wire for addPathCapNeg.
     */
    @java.lang.Override public int getAddPathCapNegValue() {
      return addPathCapNeg_;
    }
    /**
     * <pre>
     *The BGP additional path capability negotiated with this peer for this AFI/SAFI.
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BgpAddPathCapNegCap add_path_cap_neg = 4;</code>
     * @param value The enum numeric value on the wire for addPathCapNeg to set.
     * @return This builder for chaining.
     */
    public Builder setAddPathCapNegValue(int value) {
      
      addPathCapNeg_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *The BGP additional path capability negotiated with this peer for this AFI/SAFI.
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BgpAddPathCapNegCap add_path_cap_neg = 4;</code>
     * @return The addPathCapNeg.
     */
    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.BgpAddPathCapNegCap getAddPathCapNeg() {
      @SuppressWarnings("deprecation")
      opi_api.network.cloud.v1alpha1.BgpAddPathCapNegCap result = opi_api.network.cloud.v1alpha1.BgpAddPathCapNegCap.valueOf(addPathCapNeg_);
      return result == null ? opi_api.network.cloud.v1alpha1.BgpAddPathCapNegCap.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     *The BGP additional path capability negotiated with this peer for this AFI/SAFI.
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BgpAddPathCapNegCap add_path_cap_neg = 4;</code>
     * @param value The addPathCapNeg to set.
     * @return This builder for chaining.
     */
    public Builder setAddPathCapNeg(opi_api.network.cloud.v1alpha1.BgpAddPathCapNegCap value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      addPathCapNeg_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *The BGP additional path capability negotiated with this peer for this AFI/SAFI.
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BgpAddPathCapNegCap add_path_cap_neg = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearAddPathCapNeg() {
      
      addPathCapNeg_ = 0;
      onChanged();
      return this;
    }

    private int reflectorClient_ = 0;
    /**
     * <pre>
     * This value indicates whether the given peer is a reflector client of this
     * router for this AFI/SAFI, or not
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BGPPeerRRClient reflector_client = 5;</code>
     * @return The enum numeric value on the wire for reflectorClient.
     */
    @java.lang.Override public int getReflectorClientValue() {
      return reflectorClient_;
    }
    /**
     * <pre>
     * This value indicates whether the given peer is a reflector client of this
     * router for this AFI/SAFI, or not
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BGPPeerRRClient reflector_client = 5;</code>
     * @param value The enum numeric value on the wire for reflectorClient to set.
     * @return This builder for chaining.
     */
    public Builder setReflectorClientValue(int value) {
      
      reflectorClient_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This value indicates whether the given peer is a reflector client of this
     * router for this AFI/SAFI, or not
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BGPPeerRRClient reflector_client = 5;</code>
     * @return The reflectorClient.
     */
    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.BGPPeerRRClient getReflectorClient() {
      @SuppressWarnings("deprecation")
      opi_api.network.cloud.v1alpha1.BGPPeerRRClient result = opi_api.network.cloud.v1alpha1.BGPPeerRRClient.valueOf(reflectorClient_);
      return result == null ? opi_api.network.cloud.v1alpha1.BGPPeerRRClient.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * This value indicates whether the given peer is a reflector client of this
     * router for this AFI/SAFI, or not
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BGPPeerRRClient reflector_client = 5;</code>
     * @param value The reflectorClient to set.
     * @return This builder for chaining.
     */
    public Builder setReflectorClient(opi_api.network.cloud.v1alpha1.BGPPeerRRClient value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      reflectorClient_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This value indicates whether the given peer is a reflector client of this
     * router for this AFI/SAFI, or not
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BGPPeerRRClient reflector_client = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearReflectorClient() {
      
      reflectorClient_ = 0;
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


    // @@protoc_insertion_point(builder_scope:opi_api.network.cloud.v1alpha1.BGPPeerAfStatus)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.BGPPeerAfStatus)
  private static final opi_api.network.cloud.v1alpha1.BGPPeerAfStatus DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.cloud.v1alpha1.BGPPeerAfStatus();
  }

  public static opi_api.network.cloud.v1alpha1.BGPPeerAfStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BGPPeerAfStatus>
      PARSER = new com.google.protobuf.AbstractParser<BGPPeerAfStatus>() {
    @java.lang.Override
    public BGPPeerAfStatus parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BGPPeerAfStatus(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BGPPeerAfStatus> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BGPPeerAfStatus> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.BGPPeerAfStatus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

