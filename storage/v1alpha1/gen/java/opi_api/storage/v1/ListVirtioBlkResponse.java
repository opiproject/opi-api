// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_virtio_blk.proto

package opi_api.storage.v1;

/**
 * Protobuf type {@code opi_api.storage.v1.ListVirtioBlkResponse}
 */
public final class ListVirtioBlkResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.ListVirtioBlkResponse)
    ListVirtioBlkResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListVirtioBlkResponse.newBuilder() to construct.
  private ListVirtioBlkResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListVirtioBlkResponse() {
    controllers_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListVirtioBlkResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListVirtioBlkResponse(
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
              controllers_ = new java.util.ArrayList<opi_api.storage.v1.VirtioBlk>();
              mutable_bitField0_ |= 0x00000001;
            }
            controllers_.add(
                input.readMessage(opi_api.storage.v1.VirtioBlk.parser(), extensionRegistry));
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
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        controllers_ = java.util.Collections.unmodifiableList(controllers_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.storage.v1.FrontendVirtioBlkProto.internal_static_opi_api_storage_v1_ListVirtioBlkResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.FrontendVirtioBlkProto.internal_static_opi_api_storage_v1_ListVirtioBlkResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.ListVirtioBlkResponse.class, opi_api.storage.v1.ListVirtioBlkResponse.Builder.class);
  }

  public static final int CONTROLLERS_FIELD_NUMBER = 1;
  private java.util.List<opi_api.storage.v1.VirtioBlk> controllers_;
  /**
   * <code>repeated .opi_api.storage.v1.VirtioBlk controllers = 1;</code>
   */
  @java.lang.Override
  public java.util.List<opi_api.storage.v1.VirtioBlk> getControllersList() {
    return controllers_;
  }
  /**
   * <code>repeated .opi_api.storage.v1.VirtioBlk controllers = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends opi_api.storage.v1.VirtioBlkOrBuilder> 
      getControllersOrBuilderList() {
    return controllers_;
  }
  /**
   * <code>repeated .opi_api.storage.v1.VirtioBlk controllers = 1;</code>
   */
  @java.lang.Override
  public int getControllersCount() {
    return controllers_.size();
  }
  /**
   * <code>repeated .opi_api.storage.v1.VirtioBlk controllers = 1;</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.VirtioBlk getControllers(int index) {
    return controllers_.get(index);
  }
  /**
   * <code>repeated .opi_api.storage.v1.VirtioBlk controllers = 1;</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.VirtioBlkOrBuilder getControllersOrBuilder(
      int index) {
    return controllers_.get(index);
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
    for (int i = 0; i < controllers_.size(); i++) {
      output.writeMessage(1, controllers_.get(i));
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
    for (int i = 0; i < controllers_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, controllers_.get(i));
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
    if (!(obj instanceof opi_api.storage.v1.ListVirtioBlkResponse)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.ListVirtioBlkResponse other = (opi_api.storage.v1.ListVirtioBlkResponse) obj;

    if (!getControllersList()
        .equals(other.getControllersList())) return false;
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
    if (getControllersCount() > 0) {
      hash = (37 * hash) + CONTROLLERS_FIELD_NUMBER;
      hash = (53 * hash) + getControllersList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.ListVirtioBlkResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.ListVirtioBlkResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.ListVirtioBlkResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.ListVirtioBlkResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.ListVirtioBlkResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.ListVirtioBlkResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.ListVirtioBlkResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.ListVirtioBlkResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.ListVirtioBlkResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.ListVirtioBlkResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.ListVirtioBlkResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.ListVirtioBlkResponse parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.ListVirtioBlkResponse prototype) {
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
   * Protobuf type {@code opi_api.storage.v1.ListVirtioBlkResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.ListVirtioBlkResponse)
      opi_api.storage.v1.ListVirtioBlkResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.FrontendVirtioBlkProto.internal_static_opi_api_storage_v1_ListVirtioBlkResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.FrontendVirtioBlkProto.internal_static_opi_api_storage_v1_ListVirtioBlkResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.ListVirtioBlkResponse.class, opi_api.storage.v1.ListVirtioBlkResponse.Builder.class);
    }

    // Construct using opi_api.storage.v1.ListVirtioBlkResponse.newBuilder()
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
        getControllersFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (controllersBuilder_ == null) {
        controllers_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        controllersBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.FrontendVirtioBlkProto.internal_static_opi_api_storage_v1_ListVirtioBlkResponse_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.ListVirtioBlkResponse getDefaultInstanceForType() {
      return opi_api.storage.v1.ListVirtioBlkResponse.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.ListVirtioBlkResponse build() {
      opi_api.storage.v1.ListVirtioBlkResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.ListVirtioBlkResponse buildPartial() {
      opi_api.storage.v1.ListVirtioBlkResponse result = new opi_api.storage.v1.ListVirtioBlkResponse(this);
      int from_bitField0_ = bitField0_;
      if (controllersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          controllers_ = java.util.Collections.unmodifiableList(controllers_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.controllers_ = controllers_;
      } else {
        result.controllers_ = controllersBuilder_.build();
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
      if (other instanceof opi_api.storage.v1.ListVirtioBlkResponse) {
        return mergeFrom((opi_api.storage.v1.ListVirtioBlkResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.ListVirtioBlkResponse other) {
      if (other == opi_api.storage.v1.ListVirtioBlkResponse.getDefaultInstance()) return this;
      if (controllersBuilder_ == null) {
        if (!other.controllers_.isEmpty()) {
          if (controllers_.isEmpty()) {
            controllers_ = other.controllers_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureControllersIsMutable();
            controllers_.addAll(other.controllers_);
          }
          onChanged();
        }
      } else {
        if (!other.controllers_.isEmpty()) {
          if (controllersBuilder_.isEmpty()) {
            controllersBuilder_.dispose();
            controllersBuilder_ = null;
            controllers_ = other.controllers_;
            bitField0_ = (bitField0_ & ~0x00000001);
            controllersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getControllersFieldBuilder() : null;
          } else {
            controllersBuilder_.addAllMessages(other.controllers_);
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
      opi_api.storage.v1.ListVirtioBlkResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.ListVirtioBlkResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<opi_api.storage.v1.VirtioBlk> controllers_ =
      java.util.Collections.emptyList();
    private void ensureControllersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        controllers_ = new java.util.ArrayList<opi_api.storage.v1.VirtioBlk>(controllers_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.storage.v1.VirtioBlk, opi_api.storage.v1.VirtioBlk.Builder, opi_api.storage.v1.VirtioBlkOrBuilder> controllersBuilder_;

    /**
     * <code>repeated .opi_api.storage.v1.VirtioBlk controllers = 1;</code>
     */
    public java.util.List<opi_api.storage.v1.VirtioBlk> getControllersList() {
      if (controllersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(controllers_);
      } else {
        return controllersBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioBlk controllers = 1;</code>
     */
    public int getControllersCount() {
      if (controllersBuilder_ == null) {
        return controllers_.size();
      } else {
        return controllersBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioBlk controllers = 1;</code>
     */
    public opi_api.storage.v1.VirtioBlk getControllers(int index) {
      if (controllersBuilder_ == null) {
        return controllers_.get(index);
      } else {
        return controllersBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioBlk controllers = 1;</code>
     */
    public Builder setControllers(
        int index, opi_api.storage.v1.VirtioBlk value) {
      if (controllersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureControllersIsMutable();
        controllers_.set(index, value);
        onChanged();
      } else {
        controllersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioBlk controllers = 1;</code>
     */
    public Builder setControllers(
        int index, opi_api.storage.v1.VirtioBlk.Builder builderForValue) {
      if (controllersBuilder_ == null) {
        ensureControllersIsMutable();
        controllers_.set(index, builderForValue.build());
        onChanged();
      } else {
        controllersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioBlk controllers = 1;</code>
     */
    public Builder addControllers(opi_api.storage.v1.VirtioBlk value) {
      if (controllersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureControllersIsMutable();
        controllers_.add(value);
        onChanged();
      } else {
        controllersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioBlk controllers = 1;</code>
     */
    public Builder addControllers(
        int index, opi_api.storage.v1.VirtioBlk value) {
      if (controllersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureControllersIsMutable();
        controllers_.add(index, value);
        onChanged();
      } else {
        controllersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioBlk controllers = 1;</code>
     */
    public Builder addControllers(
        opi_api.storage.v1.VirtioBlk.Builder builderForValue) {
      if (controllersBuilder_ == null) {
        ensureControllersIsMutable();
        controllers_.add(builderForValue.build());
        onChanged();
      } else {
        controllersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioBlk controllers = 1;</code>
     */
    public Builder addControllers(
        int index, opi_api.storage.v1.VirtioBlk.Builder builderForValue) {
      if (controllersBuilder_ == null) {
        ensureControllersIsMutable();
        controllers_.add(index, builderForValue.build());
        onChanged();
      } else {
        controllersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioBlk controllers = 1;</code>
     */
    public Builder addAllControllers(
        java.lang.Iterable<? extends opi_api.storage.v1.VirtioBlk> values) {
      if (controllersBuilder_ == null) {
        ensureControllersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, controllers_);
        onChanged();
      } else {
        controllersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioBlk controllers = 1;</code>
     */
    public Builder clearControllers() {
      if (controllersBuilder_ == null) {
        controllers_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        controllersBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioBlk controllers = 1;</code>
     */
    public Builder removeControllers(int index) {
      if (controllersBuilder_ == null) {
        ensureControllersIsMutable();
        controllers_.remove(index);
        onChanged();
      } else {
        controllersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioBlk controllers = 1;</code>
     */
    public opi_api.storage.v1.VirtioBlk.Builder getControllersBuilder(
        int index) {
      return getControllersFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioBlk controllers = 1;</code>
     */
    public opi_api.storage.v1.VirtioBlkOrBuilder getControllersOrBuilder(
        int index) {
      if (controllersBuilder_ == null) {
        return controllers_.get(index);  } else {
        return controllersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioBlk controllers = 1;</code>
     */
    public java.util.List<? extends opi_api.storage.v1.VirtioBlkOrBuilder> 
         getControllersOrBuilderList() {
      if (controllersBuilder_ != null) {
        return controllersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(controllers_);
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioBlk controllers = 1;</code>
     */
    public opi_api.storage.v1.VirtioBlk.Builder addControllersBuilder() {
      return getControllersFieldBuilder().addBuilder(
          opi_api.storage.v1.VirtioBlk.getDefaultInstance());
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioBlk controllers = 1;</code>
     */
    public opi_api.storage.v1.VirtioBlk.Builder addControllersBuilder(
        int index) {
      return getControllersFieldBuilder().addBuilder(
          index, opi_api.storage.v1.VirtioBlk.getDefaultInstance());
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioBlk controllers = 1;</code>
     */
    public java.util.List<opi_api.storage.v1.VirtioBlk.Builder> 
         getControllersBuilderList() {
      return getControllersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.storage.v1.VirtioBlk, opi_api.storage.v1.VirtioBlk.Builder, opi_api.storage.v1.VirtioBlkOrBuilder> 
        getControllersFieldBuilder() {
      if (controllersBuilder_ == null) {
        controllersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            opi_api.storage.v1.VirtioBlk, opi_api.storage.v1.VirtioBlk.Builder, opi_api.storage.v1.VirtioBlkOrBuilder>(
                controllers_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        controllers_ = null;
      }
      return controllersBuilder_;
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.ListVirtioBlkResponse)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListVirtioBlkResponse)
  private static final opi_api.storage.v1.ListVirtioBlkResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.ListVirtioBlkResponse();
  }

  public static opi_api.storage.v1.ListVirtioBlkResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListVirtioBlkResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListVirtioBlkResponse>() {
    @java.lang.Override
    public ListVirtioBlkResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListVirtioBlkResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListVirtioBlkResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListVirtioBlkResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.ListVirtioBlkResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

