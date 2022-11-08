// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_virtio_blk.proto

package opi_api.storage.v1;

/**
 * Protobuf type {@code opi_api.storage.v1.VirtioBlkListResponse}
 */
public final class VirtioBlkListResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.VirtioBlkListResponse)
    VirtioBlkListResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VirtioBlkListResponse.newBuilder() to construct.
  private VirtioBlkListResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VirtioBlkListResponse() {
    controller_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VirtioBlkListResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VirtioBlkListResponse(
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
              controller_ = new java.util.ArrayList<opi_api.storage.v1.VirtioBlk>();
              mutable_bitField0_ |= 0x00000001;
            }
            controller_.add(
                input.readMessage(opi_api.storage.v1.VirtioBlk.parser(), extensionRegistry));
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
        controller_ = java.util.Collections.unmodifiableList(controller_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.storage.v1.FrontendVirtioBlkProto.internal_static_opi_api_storage_v1_VirtioBlkListResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.FrontendVirtioBlkProto.internal_static_opi_api_storage_v1_VirtioBlkListResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.VirtioBlkListResponse.class, opi_api.storage.v1.VirtioBlkListResponse.Builder.class);
  }

  public static final int CONTROLLER_FIELD_NUMBER = 1;
  private java.util.List<opi_api.storage.v1.VirtioBlk> controller_;
  /**
   * <code>repeated .opi_api.storage.v1.VirtioBlk controller = 1;</code>
   */
  @java.lang.Override
  public java.util.List<opi_api.storage.v1.VirtioBlk> getControllerList() {
    return controller_;
  }
  /**
   * <code>repeated .opi_api.storage.v1.VirtioBlk controller = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends opi_api.storage.v1.VirtioBlkOrBuilder> 
      getControllerOrBuilderList() {
    return controller_;
  }
  /**
   * <code>repeated .opi_api.storage.v1.VirtioBlk controller = 1;</code>
   */
  @java.lang.Override
  public int getControllerCount() {
    return controller_.size();
  }
  /**
   * <code>repeated .opi_api.storage.v1.VirtioBlk controller = 1;</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.VirtioBlk getController(int index) {
    return controller_.get(index);
  }
  /**
   * <code>repeated .opi_api.storage.v1.VirtioBlk controller = 1;</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.VirtioBlkOrBuilder getControllerOrBuilder(
      int index) {
    return controller_.get(index);
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
    for (int i = 0; i < controller_.size(); i++) {
      output.writeMessage(1, controller_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < controller_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, controller_.get(i));
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
    if (!(obj instanceof opi_api.storage.v1.VirtioBlkListResponse)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.VirtioBlkListResponse other = (opi_api.storage.v1.VirtioBlkListResponse) obj;

    if (!getControllerList()
        .equals(other.getControllerList())) return false;
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
    if (getControllerCount() > 0) {
      hash = (37 * hash) + CONTROLLER_FIELD_NUMBER;
      hash = (53 * hash) + getControllerList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.VirtioBlkListResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.VirtioBlkListResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.VirtioBlkListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.VirtioBlkListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.VirtioBlkListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.VirtioBlkListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.VirtioBlkListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.VirtioBlkListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.VirtioBlkListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.VirtioBlkListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.VirtioBlkListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.VirtioBlkListResponse parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.VirtioBlkListResponse prototype) {
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
   * Protobuf type {@code opi_api.storage.v1.VirtioBlkListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.VirtioBlkListResponse)
      opi_api.storage.v1.VirtioBlkListResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.FrontendVirtioBlkProto.internal_static_opi_api_storage_v1_VirtioBlkListResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.FrontendVirtioBlkProto.internal_static_opi_api_storage_v1_VirtioBlkListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.VirtioBlkListResponse.class, opi_api.storage.v1.VirtioBlkListResponse.Builder.class);
    }

    // Construct using opi_api.storage.v1.VirtioBlkListResponse.newBuilder()
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
        getControllerFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (controllerBuilder_ == null) {
        controller_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        controllerBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.FrontendVirtioBlkProto.internal_static_opi_api_storage_v1_VirtioBlkListResponse_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.VirtioBlkListResponse getDefaultInstanceForType() {
      return opi_api.storage.v1.VirtioBlkListResponse.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.VirtioBlkListResponse build() {
      opi_api.storage.v1.VirtioBlkListResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.VirtioBlkListResponse buildPartial() {
      opi_api.storage.v1.VirtioBlkListResponse result = new opi_api.storage.v1.VirtioBlkListResponse(this);
      int from_bitField0_ = bitField0_;
      if (controllerBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          controller_ = java.util.Collections.unmodifiableList(controller_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.controller_ = controller_;
      } else {
        result.controller_ = controllerBuilder_.build();
      }
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
      if (other instanceof opi_api.storage.v1.VirtioBlkListResponse) {
        return mergeFrom((opi_api.storage.v1.VirtioBlkListResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.VirtioBlkListResponse other) {
      if (other == opi_api.storage.v1.VirtioBlkListResponse.getDefaultInstance()) return this;
      if (controllerBuilder_ == null) {
        if (!other.controller_.isEmpty()) {
          if (controller_.isEmpty()) {
            controller_ = other.controller_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureControllerIsMutable();
            controller_.addAll(other.controller_);
          }
          onChanged();
        }
      } else {
        if (!other.controller_.isEmpty()) {
          if (controllerBuilder_.isEmpty()) {
            controllerBuilder_.dispose();
            controllerBuilder_ = null;
            controller_ = other.controller_;
            bitField0_ = (bitField0_ & ~0x00000001);
            controllerBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getControllerFieldBuilder() : null;
          } else {
            controllerBuilder_.addAllMessages(other.controller_);
          }
        }
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
      opi_api.storage.v1.VirtioBlkListResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.VirtioBlkListResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<opi_api.storage.v1.VirtioBlk> controller_ =
      java.util.Collections.emptyList();
    private void ensureControllerIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        controller_ = new java.util.ArrayList<opi_api.storage.v1.VirtioBlk>(controller_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.storage.v1.VirtioBlk, opi_api.storage.v1.VirtioBlk.Builder, opi_api.storage.v1.VirtioBlkOrBuilder> controllerBuilder_;

    /**
     * <code>repeated .opi_api.storage.v1.VirtioBlk controller = 1;</code>
     */
    public java.util.List<opi_api.storage.v1.VirtioBlk> getControllerList() {
      if (controllerBuilder_ == null) {
        return java.util.Collections.unmodifiableList(controller_);
      } else {
        return controllerBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioBlk controller = 1;</code>
     */
    public int getControllerCount() {
      if (controllerBuilder_ == null) {
        return controller_.size();
      } else {
        return controllerBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioBlk controller = 1;</code>
     */
    public opi_api.storage.v1.VirtioBlk getController(int index) {
      if (controllerBuilder_ == null) {
        return controller_.get(index);
      } else {
        return controllerBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioBlk controller = 1;</code>
     */
    public Builder setController(
        int index, opi_api.storage.v1.VirtioBlk value) {
      if (controllerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureControllerIsMutable();
        controller_.set(index, value);
        onChanged();
      } else {
        controllerBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioBlk controller = 1;</code>
     */
    public Builder setController(
        int index, opi_api.storage.v1.VirtioBlk.Builder builderForValue) {
      if (controllerBuilder_ == null) {
        ensureControllerIsMutable();
        controller_.set(index, builderForValue.build());
        onChanged();
      } else {
        controllerBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioBlk controller = 1;</code>
     */
    public Builder addController(opi_api.storage.v1.VirtioBlk value) {
      if (controllerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureControllerIsMutable();
        controller_.add(value);
        onChanged();
      } else {
        controllerBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioBlk controller = 1;</code>
     */
    public Builder addController(
        int index, opi_api.storage.v1.VirtioBlk value) {
      if (controllerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureControllerIsMutable();
        controller_.add(index, value);
        onChanged();
      } else {
        controllerBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioBlk controller = 1;</code>
     */
    public Builder addController(
        opi_api.storage.v1.VirtioBlk.Builder builderForValue) {
      if (controllerBuilder_ == null) {
        ensureControllerIsMutable();
        controller_.add(builderForValue.build());
        onChanged();
      } else {
        controllerBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioBlk controller = 1;</code>
     */
    public Builder addController(
        int index, opi_api.storage.v1.VirtioBlk.Builder builderForValue) {
      if (controllerBuilder_ == null) {
        ensureControllerIsMutable();
        controller_.add(index, builderForValue.build());
        onChanged();
      } else {
        controllerBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioBlk controller = 1;</code>
     */
    public Builder addAllController(
        java.lang.Iterable<? extends opi_api.storage.v1.VirtioBlk> values) {
      if (controllerBuilder_ == null) {
        ensureControllerIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, controller_);
        onChanged();
      } else {
        controllerBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioBlk controller = 1;</code>
     */
    public Builder clearController() {
      if (controllerBuilder_ == null) {
        controller_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        controllerBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioBlk controller = 1;</code>
     */
    public Builder removeController(int index) {
      if (controllerBuilder_ == null) {
        ensureControllerIsMutable();
        controller_.remove(index);
        onChanged();
      } else {
        controllerBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioBlk controller = 1;</code>
     */
    public opi_api.storage.v1.VirtioBlk.Builder getControllerBuilder(
        int index) {
      return getControllerFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioBlk controller = 1;</code>
     */
    public opi_api.storage.v1.VirtioBlkOrBuilder getControllerOrBuilder(
        int index) {
      if (controllerBuilder_ == null) {
        return controller_.get(index);  } else {
        return controllerBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioBlk controller = 1;</code>
     */
    public java.util.List<? extends opi_api.storage.v1.VirtioBlkOrBuilder> 
         getControllerOrBuilderList() {
      if (controllerBuilder_ != null) {
        return controllerBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(controller_);
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioBlk controller = 1;</code>
     */
    public opi_api.storage.v1.VirtioBlk.Builder addControllerBuilder() {
      return getControllerFieldBuilder().addBuilder(
          opi_api.storage.v1.VirtioBlk.getDefaultInstance());
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioBlk controller = 1;</code>
     */
    public opi_api.storage.v1.VirtioBlk.Builder addControllerBuilder(
        int index) {
      return getControllerFieldBuilder().addBuilder(
          index, opi_api.storage.v1.VirtioBlk.getDefaultInstance());
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioBlk controller = 1;</code>
     */
    public java.util.List<opi_api.storage.v1.VirtioBlk.Builder> 
         getControllerBuilderList() {
      return getControllerFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.storage.v1.VirtioBlk, opi_api.storage.v1.VirtioBlk.Builder, opi_api.storage.v1.VirtioBlkOrBuilder> 
        getControllerFieldBuilder() {
      if (controllerBuilder_ == null) {
        controllerBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            opi_api.storage.v1.VirtioBlk, opi_api.storage.v1.VirtioBlk.Builder, opi_api.storage.v1.VirtioBlkOrBuilder>(
                controller_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        controller_ = null;
      }
      return controllerBuilder_;
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.VirtioBlkListResponse)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.VirtioBlkListResponse)
  private static final opi_api.storage.v1.VirtioBlkListResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.VirtioBlkListResponse();
  }

  public static opi_api.storage.v1.VirtioBlkListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VirtioBlkListResponse>
      PARSER = new com.google.protobuf.AbstractParser<VirtioBlkListResponse>() {
    @java.lang.Override
    public VirtioBlkListResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VirtioBlkListResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VirtioBlkListResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VirtioBlkListResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.VirtioBlkListResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

