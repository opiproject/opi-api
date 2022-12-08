// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_virtio_blk.proto

package opi_api.storage.v1;

/**
 * Protobuf type {@code opi_api.storage.v1.CreateVirtioBlkRequest}
 */
public final class CreateVirtioBlkRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.CreateVirtioBlkRequest)
    CreateVirtioBlkRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateVirtioBlkRequest.newBuilder() to construct.
  private CreateVirtioBlkRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateVirtioBlkRequest() {
    parent_ = "";
    virtioBlkId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateVirtioBlkRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateVirtioBlkRequest(
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
            opi_api.storage.v1.VirtioBlk.Builder subBuilder = null;
            if (virtioBlk_ != null) {
              subBuilder = virtioBlk_.toBuilder();
            }
            virtioBlk_ = input.readMessage(opi_api.storage.v1.VirtioBlk.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(virtioBlk_);
              virtioBlk_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            virtioBlkId_ = s;
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
    return opi_api.storage.v1.FrontendVirtioBlkProto.internal_static_opi_api_storage_v1_CreateVirtioBlkRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.FrontendVirtioBlkProto.internal_static_opi_api_storage_v1_CreateVirtioBlkRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.CreateVirtioBlkRequest.class, opi_api.storage.v1.CreateVirtioBlkRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
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

  public static final int VIRTIO_BLK_FIELD_NUMBER = 2;
  private opi_api.storage.v1.VirtioBlk virtioBlk_;
  /**
   * <code>.opi_api.storage.v1.VirtioBlk virtio_blk = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the virtioBlk field is set.
   */
  @java.lang.Override
  public boolean hasVirtioBlk() {
    return virtioBlk_ != null;
  }
  /**
   * <code>.opi_api.storage.v1.VirtioBlk virtio_blk = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The virtioBlk.
   */
  @java.lang.Override
  public opi_api.storage.v1.VirtioBlk getVirtioBlk() {
    return virtioBlk_ == null ? opi_api.storage.v1.VirtioBlk.getDefaultInstance() : virtioBlk_;
  }
  /**
   * <code>.opi_api.storage.v1.VirtioBlk virtio_blk = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.VirtioBlkOrBuilder getVirtioBlkOrBuilder() {
    return getVirtioBlk();
  }

  public static final int VIRTIO_BLK_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object virtioBlkId_;
  /**
   * <code>string virtio_blk_id = 3;</code>
   * @return The virtioBlkId.
   */
  @java.lang.Override
  public java.lang.String getVirtioBlkId() {
    java.lang.Object ref = virtioBlkId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      virtioBlkId_ = s;
      return s;
    }
  }
  /**
   * <code>string virtio_blk_id = 3;</code>
   * @return The bytes for virtioBlkId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVirtioBlkIdBytes() {
    java.lang.Object ref = virtioBlkId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      virtioBlkId_ = b;
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
    if (virtioBlk_ != null) {
      output.writeMessage(2, getVirtioBlk());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(virtioBlkId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, virtioBlkId_);
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
    if (virtioBlk_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getVirtioBlk());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(virtioBlkId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, virtioBlkId_);
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
    if (!(obj instanceof opi_api.storage.v1.CreateVirtioBlkRequest)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.CreateVirtioBlkRequest other = (opi_api.storage.v1.CreateVirtioBlkRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasVirtioBlk() != other.hasVirtioBlk()) return false;
    if (hasVirtioBlk()) {
      if (!getVirtioBlk()
          .equals(other.getVirtioBlk())) return false;
    }
    if (!getVirtioBlkId()
        .equals(other.getVirtioBlkId())) return false;
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
    if (hasVirtioBlk()) {
      hash = (37 * hash) + VIRTIO_BLK_FIELD_NUMBER;
      hash = (53 * hash) + getVirtioBlk().hashCode();
    }
    hash = (37 * hash) + VIRTIO_BLK_ID_FIELD_NUMBER;
    hash = (53 * hash) + getVirtioBlkId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.CreateVirtioBlkRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.CreateVirtioBlkRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateVirtioBlkRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.CreateVirtioBlkRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateVirtioBlkRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.CreateVirtioBlkRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateVirtioBlkRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.CreateVirtioBlkRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateVirtioBlkRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.CreateVirtioBlkRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateVirtioBlkRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.CreateVirtioBlkRequest parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.CreateVirtioBlkRequest prototype) {
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
   * Protobuf type {@code opi_api.storage.v1.CreateVirtioBlkRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.CreateVirtioBlkRequest)
      opi_api.storage.v1.CreateVirtioBlkRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.FrontendVirtioBlkProto.internal_static_opi_api_storage_v1_CreateVirtioBlkRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.FrontendVirtioBlkProto.internal_static_opi_api_storage_v1_CreateVirtioBlkRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.CreateVirtioBlkRequest.class, opi_api.storage.v1.CreateVirtioBlkRequest.Builder.class);
    }

    // Construct using opi_api.storage.v1.CreateVirtioBlkRequest.newBuilder()
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

      if (virtioBlkBuilder_ == null) {
        virtioBlk_ = null;
      } else {
        virtioBlk_ = null;
        virtioBlkBuilder_ = null;
      }
      virtioBlkId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.FrontendVirtioBlkProto.internal_static_opi_api_storage_v1_CreateVirtioBlkRequest_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.CreateVirtioBlkRequest getDefaultInstanceForType() {
      return opi_api.storage.v1.CreateVirtioBlkRequest.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.CreateVirtioBlkRequest build() {
      opi_api.storage.v1.CreateVirtioBlkRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.CreateVirtioBlkRequest buildPartial() {
      opi_api.storage.v1.CreateVirtioBlkRequest result = new opi_api.storage.v1.CreateVirtioBlkRequest(this);
      result.parent_ = parent_;
      if (virtioBlkBuilder_ == null) {
        result.virtioBlk_ = virtioBlk_;
      } else {
        result.virtioBlk_ = virtioBlkBuilder_.build();
      }
      result.virtioBlkId_ = virtioBlkId_;
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
      if (other instanceof opi_api.storage.v1.CreateVirtioBlkRequest) {
        return mergeFrom((opi_api.storage.v1.CreateVirtioBlkRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.CreateVirtioBlkRequest other) {
      if (other == opi_api.storage.v1.CreateVirtioBlkRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasVirtioBlk()) {
        mergeVirtioBlk(other.getVirtioBlk());
      }
      if (!other.getVirtioBlkId().isEmpty()) {
        virtioBlkId_ = other.virtioBlkId_;
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
      opi_api.storage.v1.CreateVirtioBlkRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.CreateVirtioBlkRequest) e.getUnfinishedMessage();
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
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
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

    private opi_api.storage.v1.VirtioBlk virtioBlk_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.VirtioBlk, opi_api.storage.v1.VirtioBlk.Builder, opi_api.storage.v1.VirtioBlkOrBuilder> virtioBlkBuilder_;
    /**
     * <code>.opi_api.storage.v1.VirtioBlk virtio_blk = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the virtioBlk field is set.
     */
    public boolean hasVirtioBlk() {
      return virtioBlkBuilder_ != null || virtioBlk_ != null;
    }
    /**
     * <code>.opi_api.storage.v1.VirtioBlk virtio_blk = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The virtioBlk.
     */
    public opi_api.storage.v1.VirtioBlk getVirtioBlk() {
      if (virtioBlkBuilder_ == null) {
        return virtioBlk_ == null ? opi_api.storage.v1.VirtioBlk.getDefaultInstance() : virtioBlk_;
      } else {
        return virtioBlkBuilder_.getMessage();
      }
    }
    /**
     * <code>.opi_api.storage.v1.VirtioBlk virtio_blk = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setVirtioBlk(opi_api.storage.v1.VirtioBlk value) {
      if (virtioBlkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        virtioBlk_ = value;
        onChanged();
      } else {
        virtioBlkBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.VirtioBlk virtio_blk = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setVirtioBlk(
        opi_api.storage.v1.VirtioBlk.Builder builderForValue) {
      if (virtioBlkBuilder_ == null) {
        virtioBlk_ = builderForValue.build();
        onChanged();
      } else {
        virtioBlkBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.VirtioBlk virtio_blk = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeVirtioBlk(opi_api.storage.v1.VirtioBlk value) {
      if (virtioBlkBuilder_ == null) {
        if (virtioBlk_ != null) {
          virtioBlk_ =
            opi_api.storage.v1.VirtioBlk.newBuilder(virtioBlk_).mergeFrom(value).buildPartial();
        } else {
          virtioBlk_ = value;
        }
        onChanged();
      } else {
        virtioBlkBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.VirtioBlk virtio_blk = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearVirtioBlk() {
      if (virtioBlkBuilder_ == null) {
        virtioBlk_ = null;
        onChanged();
      } else {
        virtioBlk_ = null;
        virtioBlkBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.VirtioBlk virtio_blk = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.storage.v1.VirtioBlk.Builder getVirtioBlkBuilder() {
      
      onChanged();
      return getVirtioBlkFieldBuilder().getBuilder();
    }
    /**
     * <code>.opi_api.storage.v1.VirtioBlk virtio_blk = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.storage.v1.VirtioBlkOrBuilder getVirtioBlkOrBuilder() {
      if (virtioBlkBuilder_ != null) {
        return virtioBlkBuilder_.getMessageOrBuilder();
      } else {
        return virtioBlk_ == null ?
            opi_api.storage.v1.VirtioBlk.getDefaultInstance() : virtioBlk_;
      }
    }
    /**
     * <code>.opi_api.storage.v1.VirtioBlk virtio_blk = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.VirtioBlk, opi_api.storage.v1.VirtioBlk.Builder, opi_api.storage.v1.VirtioBlkOrBuilder> 
        getVirtioBlkFieldBuilder() {
      if (virtioBlkBuilder_ == null) {
        virtioBlkBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.storage.v1.VirtioBlk, opi_api.storage.v1.VirtioBlk.Builder, opi_api.storage.v1.VirtioBlkOrBuilder>(
                getVirtioBlk(),
                getParentForChildren(),
                isClean());
        virtioBlk_ = null;
      }
      return virtioBlkBuilder_;
    }

    private java.lang.Object virtioBlkId_ = "";
    /**
     * <code>string virtio_blk_id = 3;</code>
     * @return The virtioBlkId.
     */
    public java.lang.String getVirtioBlkId() {
      java.lang.Object ref = virtioBlkId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        virtioBlkId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string virtio_blk_id = 3;</code>
     * @return The bytes for virtioBlkId.
     */
    public com.google.protobuf.ByteString
        getVirtioBlkIdBytes() {
      java.lang.Object ref = virtioBlkId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        virtioBlkId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string virtio_blk_id = 3;</code>
     * @param value The virtioBlkId to set.
     * @return This builder for chaining.
     */
    public Builder setVirtioBlkId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      virtioBlkId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string virtio_blk_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearVirtioBlkId() {
      
      virtioBlkId_ = getDefaultInstance().getVirtioBlkId();
      onChanged();
      return this;
    }
    /**
     * <code>string virtio_blk_id = 3;</code>
     * @param value The bytes for virtioBlkId to set.
     * @return This builder for chaining.
     */
    public Builder setVirtioBlkIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      virtioBlkId_ = value;
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.CreateVirtioBlkRequest)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.CreateVirtioBlkRequest)
  private static final opi_api.storage.v1.CreateVirtioBlkRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.CreateVirtioBlkRequest();
  }

  public static opi_api.storage.v1.CreateVirtioBlkRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateVirtioBlkRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateVirtioBlkRequest>() {
    @java.lang.Override
    public CreateVirtioBlkRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateVirtioBlkRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateVirtioBlkRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateVirtioBlkRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.CreateVirtioBlkRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

