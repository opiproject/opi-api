// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_nvme_tcp.proto

package opi_api.storage.v1;

/**
 * Protobuf type {@code opi_api.storage.v1.UpdateNVMfRemoteControllerRequest}
 */
public final class UpdateNVMfRemoteControllerRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.UpdateNVMfRemoteControllerRequest)
    UpdateNVMfRemoteControllerRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateNVMfRemoteControllerRequest.newBuilder() to construct.
  private UpdateNVMfRemoteControllerRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateNVMfRemoteControllerRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateNVMfRemoteControllerRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateNVMfRemoteControllerRequest(
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
            opi_api.storage.v1.NVMfRemoteController.Builder subBuilder = null;
            if (ctrl_ != null) {
              subBuilder = ctrl_.toBuilder();
            }
            ctrl_ = input.readMessage(opi_api.storage.v1.NVMfRemoteController.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(ctrl_);
              ctrl_ = subBuilder.buildPartial();
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
    return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_UpdateNVMfRemoteControllerRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_UpdateNVMfRemoteControllerRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.UpdateNVMfRemoteControllerRequest.class, opi_api.storage.v1.UpdateNVMfRemoteControllerRequest.Builder.class);
  }

  public static final int CTRL_FIELD_NUMBER = 1;
  private opi_api.storage.v1.NVMfRemoteController ctrl_;
  /**
   * <code>.opi_api.storage.v1.NVMfRemoteController ctrl = 1;</code>
   * @return Whether the ctrl field is set.
   */
  @java.lang.Override
  public boolean hasCtrl() {
    return ctrl_ != null;
  }
  /**
   * <code>.opi_api.storage.v1.NVMfRemoteController ctrl = 1;</code>
   * @return The ctrl.
   */
  @java.lang.Override
  public opi_api.storage.v1.NVMfRemoteController getCtrl() {
    return ctrl_ == null ? opi_api.storage.v1.NVMfRemoteController.getDefaultInstance() : ctrl_;
  }
  /**
   * <code>.opi_api.storage.v1.NVMfRemoteController ctrl = 1;</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.NVMfRemoteControllerOrBuilder getCtrlOrBuilder() {
    return getCtrl();
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
    if (ctrl_ != null) {
      output.writeMessage(1, getCtrl());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ctrl_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCtrl());
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
    if (!(obj instanceof opi_api.storage.v1.UpdateNVMfRemoteControllerRequest)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.UpdateNVMfRemoteControllerRequest other = (opi_api.storage.v1.UpdateNVMfRemoteControllerRequest) obj;

    if (hasCtrl() != other.hasCtrl()) return false;
    if (hasCtrl()) {
      if (!getCtrl()
          .equals(other.getCtrl())) return false;
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
    if (hasCtrl()) {
      hash = (37 * hash) + CTRL_FIELD_NUMBER;
      hash = (53 * hash) + getCtrl().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.UpdateNVMfRemoteControllerRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.UpdateNVMfRemoteControllerRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.UpdateNVMfRemoteControllerRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.UpdateNVMfRemoteControllerRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.UpdateNVMfRemoteControllerRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.UpdateNVMfRemoteControllerRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.UpdateNVMfRemoteControllerRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.UpdateNVMfRemoteControllerRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.UpdateNVMfRemoteControllerRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.UpdateNVMfRemoteControllerRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.UpdateNVMfRemoteControllerRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.UpdateNVMfRemoteControllerRequest parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.UpdateNVMfRemoteControllerRequest prototype) {
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
   * Protobuf type {@code opi_api.storage.v1.UpdateNVMfRemoteControllerRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.UpdateNVMfRemoteControllerRequest)
      opi_api.storage.v1.UpdateNVMfRemoteControllerRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_UpdateNVMfRemoteControllerRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_UpdateNVMfRemoteControllerRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.UpdateNVMfRemoteControllerRequest.class, opi_api.storage.v1.UpdateNVMfRemoteControllerRequest.Builder.class);
    }

    // Construct using opi_api.storage.v1.UpdateNVMfRemoteControllerRequest.newBuilder()
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
      if (ctrlBuilder_ == null) {
        ctrl_ = null;
      } else {
        ctrl_ = null;
        ctrlBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_UpdateNVMfRemoteControllerRequest_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.UpdateNVMfRemoteControllerRequest getDefaultInstanceForType() {
      return opi_api.storage.v1.UpdateNVMfRemoteControllerRequest.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.UpdateNVMfRemoteControllerRequest build() {
      opi_api.storage.v1.UpdateNVMfRemoteControllerRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.UpdateNVMfRemoteControllerRequest buildPartial() {
      opi_api.storage.v1.UpdateNVMfRemoteControllerRequest result = new opi_api.storage.v1.UpdateNVMfRemoteControllerRequest(this);
      if (ctrlBuilder_ == null) {
        result.ctrl_ = ctrl_;
      } else {
        result.ctrl_ = ctrlBuilder_.build();
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
      if (other instanceof opi_api.storage.v1.UpdateNVMfRemoteControllerRequest) {
        return mergeFrom((opi_api.storage.v1.UpdateNVMfRemoteControllerRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.UpdateNVMfRemoteControllerRequest other) {
      if (other == opi_api.storage.v1.UpdateNVMfRemoteControllerRequest.getDefaultInstance()) return this;
      if (other.hasCtrl()) {
        mergeCtrl(other.getCtrl());
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
      opi_api.storage.v1.UpdateNVMfRemoteControllerRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.UpdateNVMfRemoteControllerRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private opi_api.storage.v1.NVMfRemoteController ctrl_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.NVMfRemoteController, opi_api.storage.v1.NVMfRemoteController.Builder, opi_api.storage.v1.NVMfRemoteControllerOrBuilder> ctrlBuilder_;
    /**
     * <code>.opi_api.storage.v1.NVMfRemoteController ctrl = 1;</code>
     * @return Whether the ctrl field is set.
     */
    public boolean hasCtrl() {
      return ctrlBuilder_ != null || ctrl_ != null;
    }
    /**
     * <code>.opi_api.storage.v1.NVMfRemoteController ctrl = 1;</code>
     * @return The ctrl.
     */
    public opi_api.storage.v1.NVMfRemoteController getCtrl() {
      if (ctrlBuilder_ == null) {
        return ctrl_ == null ? opi_api.storage.v1.NVMfRemoteController.getDefaultInstance() : ctrl_;
      } else {
        return ctrlBuilder_.getMessage();
      }
    }
    /**
     * <code>.opi_api.storage.v1.NVMfRemoteController ctrl = 1;</code>
     */
    public Builder setCtrl(opi_api.storage.v1.NVMfRemoteController value) {
      if (ctrlBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ctrl_ = value;
        onChanged();
      } else {
        ctrlBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.NVMfRemoteController ctrl = 1;</code>
     */
    public Builder setCtrl(
        opi_api.storage.v1.NVMfRemoteController.Builder builderForValue) {
      if (ctrlBuilder_ == null) {
        ctrl_ = builderForValue.build();
        onChanged();
      } else {
        ctrlBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.NVMfRemoteController ctrl = 1;</code>
     */
    public Builder mergeCtrl(opi_api.storage.v1.NVMfRemoteController value) {
      if (ctrlBuilder_ == null) {
        if (ctrl_ != null) {
          ctrl_ =
            opi_api.storage.v1.NVMfRemoteController.newBuilder(ctrl_).mergeFrom(value).buildPartial();
        } else {
          ctrl_ = value;
        }
        onChanged();
      } else {
        ctrlBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.NVMfRemoteController ctrl = 1;</code>
     */
    public Builder clearCtrl() {
      if (ctrlBuilder_ == null) {
        ctrl_ = null;
        onChanged();
      } else {
        ctrl_ = null;
        ctrlBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.NVMfRemoteController ctrl = 1;</code>
     */
    public opi_api.storage.v1.NVMfRemoteController.Builder getCtrlBuilder() {
      
      onChanged();
      return getCtrlFieldBuilder().getBuilder();
    }
    /**
     * <code>.opi_api.storage.v1.NVMfRemoteController ctrl = 1;</code>
     */
    public opi_api.storage.v1.NVMfRemoteControllerOrBuilder getCtrlOrBuilder() {
      if (ctrlBuilder_ != null) {
        return ctrlBuilder_.getMessageOrBuilder();
      } else {
        return ctrl_ == null ?
            opi_api.storage.v1.NVMfRemoteController.getDefaultInstance() : ctrl_;
      }
    }
    /**
     * <code>.opi_api.storage.v1.NVMfRemoteController ctrl = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.NVMfRemoteController, opi_api.storage.v1.NVMfRemoteController.Builder, opi_api.storage.v1.NVMfRemoteControllerOrBuilder> 
        getCtrlFieldBuilder() {
      if (ctrlBuilder_ == null) {
        ctrlBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.storage.v1.NVMfRemoteController, opi_api.storage.v1.NVMfRemoteController.Builder, opi_api.storage.v1.NVMfRemoteControllerOrBuilder>(
                getCtrl(),
                getParentForChildren(),
                isClean());
        ctrl_ = null;
      }
      return ctrlBuilder_;
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.UpdateNVMfRemoteControllerRequest)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.UpdateNVMfRemoteControllerRequest)
  private static final opi_api.storage.v1.UpdateNVMfRemoteControllerRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.UpdateNVMfRemoteControllerRequest();
  }

  public static opi_api.storage.v1.UpdateNVMfRemoteControllerRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateNVMfRemoteControllerRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateNVMfRemoteControllerRequest>() {
    @java.lang.Override
    public UpdateNVMfRemoteControllerRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateNVMfRemoteControllerRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateNVMfRemoteControllerRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateNVMfRemoteControllerRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.UpdateNVMfRemoteControllerRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

