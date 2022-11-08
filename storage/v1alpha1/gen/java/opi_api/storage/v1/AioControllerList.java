// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_aio.proto

package opi_api.storage.v1;

/**
 * Protobuf type {@code opi_api.storage.v1.AioControllerList}
 */
public final class AioControllerList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.AioControllerList)
    AioControllerListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AioControllerList.newBuilder() to construct.
  private AioControllerList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AioControllerList() {
    device_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AioControllerList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AioControllerList(
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
              device_ = new java.util.ArrayList<opi_api.storage.v1.AioController>();
              mutable_bitField0_ |= 0x00000001;
            }
            device_.add(
                input.readMessage(opi_api.storage.v1.AioController.parser(), extensionRegistry));
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
        device_ = java.util.Collections.unmodifiableList(device_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.storage.v1.BackendAioProto.internal_static_opi_api_storage_v1_AioControllerList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.BackendAioProto.internal_static_opi_api_storage_v1_AioControllerList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.AioControllerList.class, opi_api.storage.v1.AioControllerList.Builder.class);
  }

  public static final int DEVICE_FIELD_NUMBER = 1;
  private java.util.List<opi_api.storage.v1.AioController> device_;
  /**
   * <code>repeated .opi_api.storage.v1.AioController device = 1;</code>
   */
  @java.lang.Override
  public java.util.List<opi_api.storage.v1.AioController> getDeviceList() {
    return device_;
  }
  /**
   * <code>repeated .opi_api.storage.v1.AioController device = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends opi_api.storage.v1.AioControllerOrBuilder> 
      getDeviceOrBuilderList() {
    return device_;
  }
  /**
   * <code>repeated .opi_api.storage.v1.AioController device = 1;</code>
   */
  @java.lang.Override
  public int getDeviceCount() {
    return device_.size();
  }
  /**
   * <code>repeated .opi_api.storage.v1.AioController device = 1;</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.AioController getDevice(int index) {
    return device_.get(index);
  }
  /**
   * <code>repeated .opi_api.storage.v1.AioController device = 1;</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.AioControllerOrBuilder getDeviceOrBuilder(
      int index) {
    return device_.get(index);
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
    for (int i = 0; i < device_.size(); i++) {
      output.writeMessage(1, device_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < device_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, device_.get(i));
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
    if (!(obj instanceof opi_api.storage.v1.AioControllerList)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.AioControllerList other = (opi_api.storage.v1.AioControllerList) obj;

    if (!getDeviceList()
        .equals(other.getDeviceList())) return false;
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
    if (getDeviceCount() > 0) {
      hash = (37 * hash) + DEVICE_FIELD_NUMBER;
      hash = (53 * hash) + getDeviceList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.AioControllerList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.AioControllerList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.AioControllerList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.AioControllerList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.AioControllerList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.AioControllerList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.AioControllerList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.AioControllerList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.AioControllerList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.AioControllerList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.AioControllerList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.AioControllerList parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.AioControllerList prototype) {
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
   * Protobuf type {@code opi_api.storage.v1.AioControllerList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.AioControllerList)
      opi_api.storage.v1.AioControllerListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.BackendAioProto.internal_static_opi_api_storage_v1_AioControllerList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.BackendAioProto.internal_static_opi_api_storage_v1_AioControllerList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.AioControllerList.class, opi_api.storage.v1.AioControllerList.Builder.class);
    }

    // Construct using opi_api.storage.v1.AioControllerList.newBuilder()
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
        getDeviceFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (deviceBuilder_ == null) {
        device_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        deviceBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.BackendAioProto.internal_static_opi_api_storage_v1_AioControllerList_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.AioControllerList getDefaultInstanceForType() {
      return opi_api.storage.v1.AioControllerList.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.AioControllerList build() {
      opi_api.storage.v1.AioControllerList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.AioControllerList buildPartial() {
      opi_api.storage.v1.AioControllerList result = new opi_api.storage.v1.AioControllerList(this);
      int from_bitField0_ = bitField0_;
      if (deviceBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          device_ = java.util.Collections.unmodifiableList(device_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.device_ = device_;
      } else {
        result.device_ = deviceBuilder_.build();
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
      if (other instanceof opi_api.storage.v1.AioControllerList) {
        return mergeFrom((opi_api.storage.v1.AioControllerList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.AioControllerList other) {
      if (other == opi_api.storage.v1.AioControllerList.getDefaultInstance()) return this;
      if (deviceBuilder_ == null) {
        if (!other.device_.isEmpty()) {
          if (device_.isEmpty()) {
            device_ = other.device_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDeviceIsMutable();
            device_.addAll(other.device_);
          }
          onChanged();
        }
      } else {
        if (!other.device_.isEmpty()) {
          if (deviceBuilder_.isEmpty()) {
            deviceBuilder_.dispose();
            deviceBuilder_ = null;
            device_ = other.device_;
            bitField0_ = (bitField0_ & ~0x00000001);
            deviceBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDeviceFieldBuilder() : null;
          } else {
            deviceBuilder_.addAllMessages(other.device_);
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
      opi_api.storage.v1.AioControllerList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.AioControllerList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<opi_api.storage.v1.AioController> device_ =
      java.util.Collections.emptyList();
    private void ensureDeviceIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        device_ = new java.util.ArrayList<opi_api.storage.v1.AioController>(device_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.storage.v1.AioController, opi_api.storage.v1.AioController.Builder, opi_api.storage.v1.AioControllerOrBuilder> deviceBuilder_;

    /**
     * <code>repeated .opi_api.storage.v1.AioController device = 1;</code>
     */
    public java.util.List<opi_api.storage.v1.AioController> getDeviceList() {
      if (deviceBuilder_ == null) {
        return java.util.Collections.unmodifiableList(device_);
      } else {
        return deviceBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.AioController device = 1;</code>
     */
    public int getDeviceCount() {
      if (deviceBuilder_ == null) {
        return device_.size();
      } else {
        return deviceBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.AioController device = 1;</code>
     */
    public opi_api.storage.v1.AioController getDevice(int index) {
      if (deviceBuilder_ == null) {
        return device_.get(index);
      } else {
        return deviceBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.AioController device = 1;</code>
     */
    public Builder setDevice(
        int index, opi_api.storage.v1.AioController value) {
      if (deviceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDeviceIsMutable();
        device_.set(index, value);
        onChanged();
      } else {
        deviceBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.AioController device = 1;</code>
     */
    public Builder setDevice(
        int index, opi_api.storage.v1.AioController.Builder builderForValue) {
      if (deviceBuilder_ == null) {
        ensureDeviceIsMutable();
        device_.set(index, builderForValue.build());
        onChanged();
      } else {
        deviceBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.AioController device = 1;</code>
     */
    public Builder addDevice(opi_api.storage.v1.AioController value) {
      if (deviceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDeviceIsMutable();
        device_.add(value);
        onChanged();
      } else {
        deviceBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.AioController device = 1;</code>
     */
    public Builder addDevice(
        int index, opi_api.storage.v1.AioController value) {
      if (deviceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDeviceIsMutable();
        device_.add(index, value);
        onChanged();
      } else {
        deviceBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.AioController device = 1;</code>
     */
    public Builder addDevice(
        opi_api.storage.v1.AioController.Builder builderForValue) {
      if (deviceBuilder_ == null) {
        ensureDeviceIsMutable();
        device_.add(builderForValue.build());
        onChanged();
      } else {
        deviceBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.AioController device = 1;</code>
     */
    public Builder addDevice(
        int index, opi_api.storage.v1.AioController.Builder builderForValue) {
      if (deviceBuilder_ == null) {
        ensureDeviceIsMutable();
        device_.add(index, builderForValue.build());
        onChanged();
      } else {
        deviceBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.AioController device = 1;</code>
     */
    public Builder addAllDevice(
        java.lang.Iterable<? extends opi_api.storage.v1.AioController> values) {
      if (deviceBuilder_ == null) {
        ensureDeviceIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, device_);
        onChanged();
      } else {
        deviceBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.AioController device = 1;</code>
     */
    public Builder clearDevice() {
      if (deviceBuilder_ == null) {
        device_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        deviceBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.AioController device = 1;</code>
     */
    public Builder removeDevice(int index) {
      if (deviceBuilder_ == null) {
        ensureDeviceIsMutable();
        device_.remove(index);
        onChanged();
      } else {
        deviceBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.AioController device = 1;</code>
     */
    public opi_api.storage.v1.AioController.Builder getDeviceBuilder(
        int index) {
      return getDeviceFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .opi_api.storage.v1.AioController device = 1;</code>
     */
    public opi_api.storage.v1.AioControllerOrBuilder getDeviceOrBuilder(
        int index) {
      if (deviceBuilder_ == null) {
        return device_.get(index);  } else {
        return deviceBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.AioController device = 1;</code>
     */
    public java.util.List<? extends opi_api.storage.v1.AioControllerOrBuilder> 
         getDeviceOrBuilderList() {
      if (deviceBuilder_ != null) {
        return deviceBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(device_);
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.AioController device = 1;</code>
     */
    public opi_api.storage.v1.AioController.Builder addDeviceBuilder() {
      return getDeviceFieldBuilder().addBuilder(
          opi_api.storage.v1.AioController.getDefaultInstance());
    }
    /**
     * <code>repeated .opi_api.storage.v1.AioController device = 1;</code>
     */
    public opi_api.storage.v1.AioController.Builder addDeviceBuilder(
        int index) {
      return getDeviceFieldBuilder().addBuilder(
          index, opi_api.storage.v1.AioController.getDefaultInstance());
    }
    /**
     * <code>repeated .opi_api.storage.v1.AioController device = 1;</code>
     */
    public java.util.List<opi_api.storage.v1.AioController.Builder> 
         getDeviceBuilderList() {
      return getDeviceFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.storage.v1.AioController, opi_api.storage.v1.AioController.Builder, opi_api.storage.v1.AioControllerOrBuilder> 
        getDeviceFieldBuilder() {
      if (deviceBuilder_ == null) {
        deviceBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            opi_api.storage.v1.AioController, opi_api.storage.v1.AioController.Builder, opi_api.storage.v1.AioControllerOrBuilder>(
                device_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        device_ = null;
      }
      return deviceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.AioControllerList)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.AioControllerList)
  private static final opi_api.storage.v1.AioControllerList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.AioControllerList();
  }

  public static opi_api.storage.v1.AioControllerList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AioControllerList>
      PARSER = new com.google.protobuf.AbstractParser<AioControllerList>() {
    @java.lang.Override
    public AioControllerList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AioControllerList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AioControllerList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AioControllerList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.AioControllerList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

