// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_virtio_scsi.proto

package opi_api.storage.v1;

/**
 * Protobuf type {@code opi_api.storage.v1.ListVirtioScsiTargetsResponse}
 */
public final class ListVirtioScsiTargetsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.ListVirtioScsiTargetsResponse)
    ListVirtioScsiTargetsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListVirtioScsiTargetsResponse.newBuilder() to construct.
  private ListVirtioScsiTargetsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListVirtioScsiTargetsResponse() {
    virtioScsiTargets_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListVirtioScsiTargetsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListVirtioScsiTargetsResponse(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              virtioScsiTargets_ = new java.util.ArrayList<opi_api.storage.v1.VirtioScsiTarget>();
              mutable_bitField0_ |= 0x00000001;
            }
            virtioScsiTargets_.add(
                input.readMessage(opi_api.storage.v1.VirtioScsiTarget.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        virtioScsiTargets_ = java.util.Collections.unmodifiableList(virtioScsiTargets_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.storage.v1.FrontendVirtioScsiProto.internal_static_opi_api_storage_v1_ListVirtioScsiTargetsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.FrontendVirtioScsiProto.internal_static_opi_api_storage_v1_ListVirtioScsiTargetsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.ListVirtioScsiTargetsResponse.class, opi_api.storage.v1.ListVirtioScsiTargetsResponse.Builder.class);
  }

  public static final int VIRTIO_SCSI_TARGETS_FIELD_NUMBER = 1;
  private java.util.List<opi_api.storage.v1.VirtioScsiTarget> virtioScsiTargets_;
  /**
   * <code>repeated .opi_api.storage.v1.VirtioScsiTarget virtio_scsi_targets = 1;</code>
   */
  @java.lang.Override
  public java.util.List<opi_api.storage.v1.VirtioScsiTarget> getVirtioScsiTargetsList() {
    return virtioScsiTargets_;
  }
  /**
   * <code>repeated .opi_api.storage.v1.VirtioScsiTarget virtio_scsi_targets = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends opi_api.storage.v1.VirtioScsiTargetOrBuilder> 
      getVirtioScsiTargetsOrBuilderList() {
    return virtioScsiTargets_;
  }
  /**
   * <code>repeated .opi_api.storage.v1.VirtioScsiTarget virtio_scsi_targets = 1;</code>
   */
  @java.lang.Override
  public int getVirtioScsiTargetsCount() {
    return virtioScsiTargets_.size();
  }
  /**
   * <code>repeated .opi_api.storage.v1.VirtioScsiTarget virtio_scsi_targets = 1;</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.VirtioScsiTarget getVirtioScsiTargets(int index) {
    return virtioScsiTargets_.get(index);
  }
  /**
   * <code>repeated .opi_api.storage.v1.VirtioScsiTarget virtio_scsi_targets = 1;</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.VirtioScsiTargetOrBuilder getVirtioScsiTargetsOrBuilder(
      int index) {
    return virtioScsiTargets_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < virtioScsiTargets_.size(); i++) {
      output.writeMessage(1, virtioScsiTargets_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < virtioScsiTargets_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, virtioScsiTargets_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof opi_api.storage.v1.ListVirtioScsiTargetsResponse)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.ListVirtioScsiTargetsResponse other = (opi_api.storage.v1.ListVirtioScsiTargetsResponse) obj;

    if (!getVirtioScsiTargetsList()
        .equals(other.getVirtioScsiTargetsList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getVirtioScsiTargetsCount() > 0) {
      hash = (37 * hash) + VIRTIO_SCSI_TARGETS_FIELD_NUMBER;
      hash = (53 * hash) + getVirtioScsiTargetsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.ListVirtioScsiTargetsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.ListVirtioScsiTargetsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.ListVirtioScsiTargetsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.ListVirtioScsiTargetsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.ListVirtioScsiTargetsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.ListVirtioScsiTargetsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.ListVirtioScsiTargetsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.ListVirtioScsiTargetsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.ListVirtioScsiTargetsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.ListVirtioScsiTargetsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.ListVirtioScsiTargetsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.ListVirtioScsiTargetsResponse parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.ListVirtioScsiTargetsResponse prototype) {
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
   * Protobuf type {@code opi_api.storage.v1.ListVirtioScsiTargetsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.ListVirtioScsiTargetsResponse)
      opi_api.storage.v1.ListVirtioScsiTargetsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.FrontendVirtioScsiProto.internal_static_opi_api_storage_v1_ListVirtioScsiTargetsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.FrontendVirtioScsiProto.internal_static_opi_api_storage_v1_ListVirtioScsiTargetsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.ListVirtioScsiTargetsResponse.class, opi_api.storage.v1.ListVirtioScsiTargetsResponse.Builder.class);
    }

    // Construct using opi_api.storage.v1.ListVirtioScsiTargetsResponse.newBuilder()
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
        getVirtioScsiTargetsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (virtioScsiTargetsBuilder_ == null) {
        virtioScsiTargets_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        virtioScsiTargetsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.FrontendVirtioScsiProto.internal_static_opi_api_storage_v1_ListVirtioScsiTargetsResponse_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.ListVirtioScsiTargetsResponse getDefaultInstanceForType() {
      return opi_api.storage.v1.ListVirtioScsiTargetsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.ListVirtioScsiTargetsResponse build() {
      opi_api.storage.v1.ListVirtioScsiTargetsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.ListVirtioScsiTargetsResponse buildPartial() {
      opi_api.storage.v1.ListVirtioScsiTargetsResponse result = new opi_api.storage.v1.ListVirtioScsiTargetsResponse(this);
      int from_bitField0_ = bitField0_;
      if (virtioScsiTargetsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          virtioScsiTargets_ = java.util.Collections.unmodifiableList(virtioScsiTargets_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.virtioScsiTargets_ = virtioScsiTargets_;
      } else {
        result.virtioScsiTargets_ = virtioScsiTargetsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof opi_api.storage.v1.ListVirtioScsiTargetsResponse) {
        return mergeFrom((opi_api.storage.v1.ListVirtioScsiTargetsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.ListVirtioScsiTargetsResponse other) {
      if (other == opi_api.storage.v1.ListVirtioScsiTargetsResponse.getDefaultInstance()) return this;
      if (virtioScsiTargetsBuilder_ == null) {
        if (!other.virtioScsiTargets_.isEmpty()) {
          if (virtioScsiTargets_.isEmpty()) {
            virtioScsiTargets_ = other.virtioScsiTargets_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureVirtioScsiTargetsIsMutable();
            virtioScsiTargets_.addAll(other.virtioScsiTargets_);
          }
          onChanged();
        }
      } else {
        if (!other.virtioScsiTargets_.isEmpty()) {
          if (virtioScsiTargetsBuilder_.isEmpty()) {
            virtioScsiTargetsBuilder_.dispose();
            virtioScsiTargetsBuilder_ = null;
            virtioScsiTargets_ = other.virtioScsiTargets_;
            bitField0_ = (bitField0_ & ~0x00000001);
            virtioScsiTargetsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getVirtioScsiTargetsFieldBuilder() : null;
          } else {
            virtioScsiTargetsBuilder_.addAllMessages(other.virtioScsiTargets_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      opi_api.storage.v1.ListVirtioScsiTargetsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.ListVirtioScsiTargetsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<opi_api.storage.v1.VirtioScsiTarget> virtioScsiTargets_ =
      java.util.Collections.emptyList();
    private void ensureVirtioScsiTargetsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        virtioScsiTargets_ = new java.util.ArrayList<opi_api.storage.v1.VirtioScsiTarget>(virtioScsiTargets_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.storage.v1.VirtioScsiTarget, opi_api.storage.v1.VirtioScsiTarget.Builder, opi_api.storage.v1.VirtioScsiTargetOrBuilder> virtioScsiTargetsBuilder_;

    /**
     * <code>repeated .opi_api.storage.v1.VirtioScsiTarget virtio_scsi_targets = 1;</code>
     */
    public java.util.List<opi_api.storage.v1.VirtioScsiTarget> getVirtioScsiTargetsList() {
      if (virtioScsiTargetsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(virtioScsiTargets_);
      } else {
        return virtioScsiTargetsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioScsiTarget virtio_scsi_targets = 1;</code>
     */
    public int getVirtioScsiTargetsCount() {
      if (virtioScsiTargetsBuilder_ == null) {
        return virtioScsiTargets_.size();
      } else {
        return virtioScsiTargetsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioScsiTarget virtio_scsi_targets = 1;</code>
     */
    public opi_api.storage.v1.VirtioScsiTarget getVirtioScsiTargets(int index) {
      if (virtioScsiTargetsBuilder_ == null) {
        return virtioScsiTargets_.get(index);
      } else {
        return virtioScsiTargetsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioScsiTarget virtio_scsi_targets = 1;</code>
     */
    public Builder setVirtioScsiTargets(
        int index, opi_api.storage.v1.VirtioScsiTarget value) {
      if (virtioScsiTargetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVirtioScsiTargetsIsMutable();
        virtioScsiTargets_.set(index, value);
        onChanged();
      } else {
        virtioScsiTargetsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioScsiTarget virtio_scsi_targets = 1;</code>
     */
    public Builder setVirtioScsiTargets(
        int index, opi_api.storage.v1.VirtioScsiTarget.Builder builderForValue) {
      if (virtioScsiTargetsBuilder_ == null) {
        ensureVirtioScsiTargetsIsMutable();
        virtioScsiTargets_.set(index, builderForValue.build());
        onChanged();
      } else {
        virtioScsiTargetsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioScsiTarget virtio_scsi_targets = 1;</code>
     */
    public Builder addVirtioScsiTargets(opi_api.storage.v1.VirtioScsiTarget value) {
      if (virtioScsiTargetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVirtioScsiTargetsIsMutable();
        virtioScsiTargets_.add(value);
        onChanged();
      } else {
        virtioScsiTargetsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioScsiTarget virtio_scsi_targets = 1;</code>
     */
    public Builder addVirtioScsiTargets(
        int index, opi_api.storage.v1.VirtioScsiTarget value) {
      if (virtioScsiTargetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVirtioScsiTargetsIsMutable();
        virtioScsiTargets_.add(index, value);
        onChanged();
      } else {
        virtioScsiTargetsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioScsiTarget virtio_scsi_targets = 1;</code>
     */
    public Builder addVirtioScsiTargets(
        opi_api.storage.v1.VirtioScsiTarget.Builder builderForValue) {
      if (virtioScsiTargetsBuilder_ == null) {
        ensureVirtioScsiTargetsIsMutable();
        virtioScsiTargets_.add(builderForValue.build());
        onChanged();
      } else {
        virtioScsiTargetsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioScsiTarget virtio_scsi_targets = 1;</code>
     */
    public Builder addVirtioScsiTargets(
        int index, opi_api.storage.v1.VirtioScsiTarget.Builder builderForValue) {
      if (virtioScsiTargetsBuilder_ == null) {
        ensureVirtioScsiTargetsIsMutable();
        virtioScsiTargets_.add(index, builderForValue.build());
        onChanged();
      } else {
        virtioScsiTargetsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioScsiTarget virtio_scsi_targets = 1;</code>
     */
    public Builder addAllVirtioScsiTargets(
        java.lang.Iterable<? extends opi_api.storage.v1.VirtioScsiTarget> values) {
      if (virtioScsiTargetsBuilder_ == null) {
        ensureVirtioScsiTargetsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, virtioScsiTargets_);
        onChanged();
      } else {
        virtioScsiTargetsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioScsiTarget virtio_scsi_targets = 1;</code>
     */
    public Builder clearVirtioScsiTargets() {
      if (virtioScsiTargetsBuilder_ == null) {
        virtioScsiTargets_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        virtioScsiTargetsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioScsiTarget virtio_scsi_targets = 1;</code>
     */
    public Builder removeVirtioScsiTargets(int index) {
      if (virtioScsiTargetsBuilder_ == null) {
        ensureVirtioScsiTargetsIsMutable();
        virtioScsiTargets_.remove(index);
        onChanged();
      } else {
        virtioScsiTargetsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioScsiTarget virtio_scsi_targets = 1;</code>
     */
    public opi_api.storage.v1.VirtioScsiTarget.Builder getVirtioScsiTargetsBuilder(
        int index) {
      return getVirtioScsiTargetsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioScsiTarget virtio_scsi_targets = 1;</code>
     */
    public opi_api.storage.v1.VirtioScsiTargetOrBuilder getVirtioScsiTargetsOrBuilder(
        int index) {
      if (virtioScsiTargetsBuilder_ == null) {
        return virtioScsiTargets_.get(index);  } else {
        return virtioScsiTargetsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioScsiTarget virtio_scsi_targets = 1;</code>
     */
    public java.util.List<? extends opi_api.storage.v1.VirtioScsiTargetOrBuilder> 
         getVirtioScsiTargetsOrBuilderList() {
      if (virtioScsiTargetsBuilder_ != null) {
        return virtioScsiTargetsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(virtioScsiTargets_);
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioScsiTarget virtio_scsi_targets = 1;</code>
     */
    public opi_api.storage.v1.VirtioScsiTarget.Builder addVirtioScsiTargetsBuilder() {
      return getVirtioScsiTargetsFieldBuilder().addBuilder(
          opi_api.storage.v1.VirtioScsiTarget.getDefaultInstance());
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioScsiTarget virtio_scsi_targets = 1;</code>
     */
    public opi_api.storage.v1.VirtioScsiTarget.Builder addVirtioScsiTargetsBuilder(
        int index) {
      return getVirtioScsiTargetsFieldBuilder().addBuilder(
          index, opi_api.storage.v1.VirtioScsiTarget.getDefaultInstance());
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioScsiTarget virtio_scsi_targets = 1;</code>
     */
    public java.util.List<opi_api.storage.v1.VirtioScsiTarget.Builder> 
         getVirtioScsiTargetsBuilderList() {
      return getVirtioScsiTargetsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.storage.v1.VirtioScsiTarget, opi_api.storage.v1.VirtioScsiTarget.Builder, opi_api.storage.v1.VirtioScsiTargetOrBuilder> 
        getVirtioScsiTargetsFieldBuilder() {
      if (virtioScsiTargetsBuilder_ == null) {
        virtioScsiTargetsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            opi_api.storage.v1.VirtioScsiTarget, opi_api.storage.v1.VirtioScsiTarget.Builder, opi_api.storage.v1.VirtioScsiTargetOrBuilder>(
                virtioScsiTargets_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        virtioScsiTargets_ = null;
      }
      return virtioScsiTargetsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.ListVirtioScsiTargetsResponse)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListVirtioScsiTargetsResponse)
  private static final opi_api.storage.v1.ListVirtioScsiTargetsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.ListVirtioScsiTargetsResponse();
  }

  public static opi_api.storage.v1.ListVirtioScsiTargetsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListVirtioScsiTargetsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListVirtioScsiTargetsResponse>() {
    @java.lang.Override
    public ListVirtioScsiTargetsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListVirtioScsiTargetsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListVirtioScsiTargetsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListVirtioScsiTargetsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.ListVirtioScsiTargetsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

