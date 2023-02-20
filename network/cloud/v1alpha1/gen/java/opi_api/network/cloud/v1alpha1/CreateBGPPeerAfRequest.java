// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cloudrpc.proto

package opi_api.network.cloud.v1alpha1;

/**
 * <pre>
 * Create BGPPeerAf Request
 * </pre>
 *
 * Protobuf type {@code opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest}
 */
public final class CreateBGPPeerAfRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest)
    CreateBGPPeerAfRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateBGPPeerAfRequest.newBuilder() to construct.
  private CreateBGPPeerAfRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateBGPPeerAfRequest() {
    parent_ = "";
    bgppeerafId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateBGPPeerAfRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateBGPPeerAfRequest(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            parent_ = s;
            break;
          }
          case 18: {
            opi_api.network.cloud.v1alpha1.BGPPeerAf.Builder subBuilder = null;
            if (bgppeeraf_ != null) {
              subBuilder = bgppeeraf_.toBuilder();
            }
            bgppeeraf_ = input.readMessage(opi_api.network.cloud.v1alpha1.BGPPeerAf.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(bgppeeraf_);
              bgppeeraf_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            bgppeerafId_ = s;
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
    return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_CreateBGPPeerAfRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_CreateBGPPeerAfRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest.class, opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * parent
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * parent
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BGPPEERAF_FIELD_NUMBER = 2;
  private opi_api.network.cloud.v1alpha1.BGPPeerAf bgppeeraf_;
  /**
   * <pre>
   * bgppeeraf
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.BGPPeerAf bgppeeraf = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the bgppeeraf field is set.
   */
  @java.lang.Override
  public boolean hasBgppeeraf() {
    return bgppeeraf_ != null;
  }
  /**
   * <pre>
   * bgppeeraf
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.BGPPeerAf bgppeeraf = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bgppeeraf.
   */
  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.BGPPeerAf getBgppeeraf() {
    return bgppeeraf_ == null ? opi_api.network.cloud.v1alpha1.BGPPeerAf.getDefaultInstance() : bgppeeraf_;
  }
  /**
   * <pre>
   * bgppeeraf
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.BGPPeerAf bgppeeraf = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.BGPPeerAfOrBuilder getBgppeerafOrBuilder() {
    return getBgppeeraf();
  }

  public static final int BGPPEERAF_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object bgppeerafId_;
  /**
   * <pre>
   * bgppeeraf_id
   * </pre>
   *
   * <code>string bgppeeraf_id = 3;</code>
   * @return The bgppeerafId.
   */
  @java.lang.Override
  public java.lang.String getBgppeerafId() {
    java.lang.Object ref = bgppeerafId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bgppeerafId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * bgppeeraf_id
   * </pre>
   *
   * <code>string bgppeeraf_id = 3;</code>
   * @return The bytes for bgppeerafId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBgppeerafIdBytes() {
    java.lang.Object ref = bgppeerafId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bgppeerafId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (bgppeeraf_ != null) {
      output.writeMessage(2, getBgppeeraf());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bgppeerafId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, bgppeerafId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (bgppeeraf_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getBgppeeraf());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bgppeerafId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, bgppeerafId_);
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
    if (!(obj instanceof opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest)) {
      return super.equals(obj);
    }
    opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest other = (opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasBgppeeraf() != other.hasBgppeeraf()) return false;
    if (hasBgppeeraf()) {
      if (!getBgppeeraf()
          .equals(other.getBgppeeraf())) return false;
    }
    if (!getBgppeerafId()
        .equals(other.getBgppeerafId())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasBgppeeraf()) {
      hash = (37 * hash) + BGPPEERAF_FIELD_NUMBER;
      hash = (53 * hash) + getBgppeeraf().hashCode();
    }
    hash = (37 * hash) + BGPPEERAF_ID_FIELD_NUMBER;
    hash = (53 * hash) + getBgppeerafId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest parseFrom(
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
  public static Builder newBuilder(opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest prototype) {
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
   * Create BGPPeerAf Request
   * </pre>
   *
   * Protobuf type {@code opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest)
      opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_CreateBGPPeerAfRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_CreateBGPPeerAfRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest.class, opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest.Builder.class);
    }

    // Construct using opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest.newBuilder()
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
      parent_ = "";

      if (bgppeerafBuilder_ == null) {
        bgppeeraf_ = null;
      } else {
        bgppeeraf_ = null;
        bgppeerafBuilder_ = null;
      }
      bgppeerafId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_CreateBGPPeerAfRequest_descriptor;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest getDefaultInstanceForType() {
      return opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest build() {
      opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest buildPartial() {
      opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest result = new opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest(this);
      result.parent_ = parent_;
      if (bgppeerafBuilder_ == null) {
        result.bgppeeraf_ = bgppeeraf_;
      } else {
        result.bgppeeraf_ = bgppeerafBuilder_.build();
      }
      result.bgppeerafId_ = bgppeerafId_;
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
      if (other instanceof opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest) {
        return mergeFrom((opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest other) {
      if (other == opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasBgppeeraf()) {
        mergeBgppeeraf(other.getBgppeeraf());
      }
      if (!other.getBgppeerafId().isEmpty()) {
        bgppeerafId_ = other.bgppeerafId_;
        onChanged();
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
      opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * parent
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * parent
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * parent
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * parent
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * parent
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
      onChanged();
      return this;
    }

    private opi_api.network.cloud.v1alpha1.BGPPeerAf bgppeeraf_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.cloud.v1alpha1.BGPPeerAf, opi_api.network.cloud.v1alpha1.BGPPeerAf.Builder, opi_api.network.cloud.v1alpha1.BGPPeerAfOrBuilder> bgppeerafBuilder_;
    /**
     * <pre>
     * bgppeeraf
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BGPPeerAf bgppeeraf = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the bgppeeraf field is set.
     */
    public boolean hasBgppeeraf() {
      return bgppeerafBuilder_ != null || bgppeeraf_ != null;
    }
    /**
     * <pre>
     * bgppeeraf
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BGPPeerAf bgppeeraf = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bgppeeraf.
     */
    public opi_api.network.cloud.v1alpha1.BGPPeerAf getBgppeeraf() {
      if (bgppeerafBuilder_ == null) {
        return bgppeeraf_ == null ? opi_api.network.cloud.v1alpha1.BGPPeerAf.getDefaultInstance() : bgppeeraf_;
      } else {
        return bgppeerafBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * bgppeeraf
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BGPPeerAf bgppeeraf = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setBgppeeraf(opi_api.network.cloud.v1alpha1.BGPPeerAf value) {
      if (bgppeerafBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        bgppeeraf_ = value;
        onChanged();
      } else {
        bgppeerafBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * bgppeeraf
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BGPPeerAf bgppeeraf = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setBgppeeraf(
        opi_api.network.cloud.v1alpha1.BGPPeerAf.Builder builderForValue) {
      if (bgppeerafBuilder_ == null) {
        bgppeeraf_ = builderForValue.build();
        onChanged();
      } else {
        bgppeerafBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * bgppeeraf
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BGPPeerAf bgppeeraf = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeBgppeeraf(opi_api.network.cloud.v1alpha1.BGPPeerAf value) {
      if (bgppeerafBuilder_ == null) {
        if (bgppeeraf_ != null) {
          bgppeeraf_ =
            opi_api.network.cloud.v1alpha1.BGPPeerAf.newBuilder(bgppeeraf_).mergeFrom(value).buildPartial();
        } else {
          bgppeeraf_ = value;
        }
        onChanged();
      } else {
        bgppeerafBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * bgppeeraf
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BGPPeerAf bgppeeraf = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearBgppeeraf() {
      if (bgppeerafBuilder_ == null) {
        bgppeeraf_ = null;
        onChanged();
      } else {
        bgppeeraf_ = null;
        bgppeerafBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * bgppeeraf
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BGPPeerAf bgppeeraf = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.network.cloud.v1alpha1.BGPPeerAf.Builder getBgppeerafBuilder() {
      
      onChanged();
      return getBgppeerafFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * bgppeeraf
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BGPPeerAf bgppeeraf = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.network.cloud.v1alpha1.BGPPeerAfOrBuilder getBgppeerafOrBuilder() {
      if (bgppeerafBuilder_ != null) {
        return bgppeerafBuilder_.getMessageOrBuilder();
      } else {
        return bgppeeraf_ == null ?
            opi_api.network.cloud.v1alpha1.BGPPeerAf.getDefaultInstance() : bgppeeraf_;
      }
    }
    /**
     * <pre>
     * bgppeeraf
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BGPPeerAf bgppeeraf = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.cloud.v1alpha1.BGPPeerAf, opi_api.network.cloud.v1alpha1.BGPPeerAf.Builder, opi_api.network.cloud.v1alpha1.BGPPeerAfOrBuilder> 
        getBgppeerafFieldBuilder() {
      if (bgppeerafBuilder_ == null) {
        bgppeerafBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.network.cloud.v1alpha1.BGPPeerAf, opi_api.network.cloud.v1alpha1.BGPPeerAf.Builder, opi_api.network.cloud.v1alpha1.BGPPeerAfOrBuilder>(
                getBgppeeraf(),
                getParentForChildren(),
                isClean());
        bgppeeraf_ = null;
      }
      return bgppeerafBuilder_;
    }

    private java.lang.Object bgppeerafId_ = "";
    /**
     * <pre>
     * bgppeeraf_id
     * </pre>
     *
     * <code>string bgppeeraf_id = 3;</code>
     * @return The bgppeerafId.
     */
    public java.lang.String getBgppeerafId() {
      java.lang.Object ref = bgppeerafId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bgppeerafId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * bgppeeraf_id
     * </pre>
     *
     * <code>string bgppeeraf_id = 3;</code>
     * @return The bytes for bgppeerafId.
     */
    public com.google.protobuf.ByteString
        getBgppeerafIdBytes() {
      java.lang.Object ref = bgppeerafId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bgppeerafId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * bgppeeraf_id
     * </pre>
     *
     * <code>string bgppeeraf_id = 3;</code>
     * @param value The bgppeerafId to set.
     * @return This builder for chaining.
     */
    public Builder setBgppeerafId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      bgppeerafId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * bgppeeraf_id
     * </pre>
     *
     * <code>string bgppeeraf_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearBgppeerafId() {
      
      bgppeerafId_ = getDefaultInstance().getBgppeerafId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * bgppeeraf_id
     * </pre>
     *
     * <code>string bgppeeraf_id = 3;</code>
     * @param value The bytes for bgppeerafId to set.
     * @return This builder for chaining.
     */
    public Builder setBgppeerafIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      bgppeerafId_ = value;
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


    // @@protoc_insertion_point(builder_scope:opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest)
  private static final opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest();
  }

  public static opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateBGPPeerAfRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateBGPPeerAfRequest>() {
    @java.lang.Override
    public CreateBGPPeerAfRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateBGPPeerAfRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateBGPPeerAfRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateBGPPeerAfRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

