// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_nvme_pcie.proto

package opi_api.storage.v1;

/**
 * Protobuf type {@code opi_api.storage.v1.CreateNVMeControllerRequest}
 */
public final class CreateNVMeControllerRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.CreateNVMeControllerRequest)
    CreateNVMeControllerRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateNVMeControllerRequest.newBuilder() to construct.
  private CreateNVMeControllerRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateNVMeControllerRequest() {
    parent_ = "";
    nvMeControllerId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateNVMeControllerRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateNVMeControllerRequest(
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
            opi_api.storage.v1.NVMeController.Builder subBuilder = null;
            if (nvMeController_ != null) {
              subBuilder = nvMeController_.toBuilder();
            }
            nvMeController_ = input.readMessage(opi_api.storage.v1.NVMeController.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(nvMeController_);
              nvMeController_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            nvMeControllerId_ = s;
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
    return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_CreateNVMeControllerRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_CreateNVMeControllerRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.CreateNVMeControllerRequest.class, opi_api.storage.v1.CreateNVMeControllerRequest.Builder.class);
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

  public static final int NV_ME_CONTROLLER_FIELD_NUMBER = 2;
  private opi_api.storage.v1.NVMeController nvMeController_;
  /**
   * <code>.opi_api.storage.v1.NVMeController nv_me_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the nvMeController field is set.
   */
  @java.lang.Override
  public boolean hasNvMeController() {
    return nvMeController_ != null;
  }
  /**
   * <code>.opi_api.storage.v1.NVMeController nv_me_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The nvMeController.
   */
  @java.lang.Override
  public opi_api.storage.v1.NVMeController getNvMeController() {
    return nvMeController_ == null ? opi_api.storage.v1.NVMeController.getDefaultInstance() : nvMeController_;
  }
  /**
   * <code>.opi_api.storage.v1.NVMeController nv_me_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.NVMeControllerOrBuilder getNvMeControllerOrBuilder() {
    return getNvMeController();
  }

  public static final int NV_ME_CONTROLLER_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object nvMeControllerId_;
  /**
   * <code>string nv_me_controller_id = 3;</code>
   * @return The nvMeControllerId.
   */
  @java.lang.Override
  public java.lang.String getNvMeControllerId() {
    java.lang.Object ref = nvMeControllerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nvMeControllerId_ = s;
      return s;
    }
  }
  /**
   * <code>string nv_me_controller_id = 3;</code>
   * @return The bytes for nvMeControllerId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNvMeControllerIdBytes() {
    java.lang.Object ref = nvMeControllerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nvMeControllerId_ = b;
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
    if (nvMeController_ != null) {
      output.writeMessage(2, getNvMeController());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nvMeControllerId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, nvMeControllerId_);
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
    if (nvMeController_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getNvMeController());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nvMeControllerId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, nvMeControllerId_);
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
    if (!(obj instanceof opi_api.storage.v1.CreateNVMeControllerRequest)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.CreateNVMeControllerRequest other = (opi_api.storage.v1.CreateNVMeControllerRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasNvMeController() != other.hasNvMeController()) return false;
    if (hasNvMeController()) {
      if (!getNvMeController()
          .equals(other.getNvMeController())) return false;
    }
    if (!getNvMeControllerId()
        .equals(other.getNvMeControllerId())) return false;
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
    if (hasNvMeController()) {
      hash = (37 * hash) + NV_ME_CONTROLLER_FIELD_NUMBER;
      hash = (53 * hash) + getNvMeController().hashCode();
    }
    hash = (37 * hash) + NV_ME_CONTROLLER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getNvMeControllerId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.CreateNVMeControllerRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.CreateNVMeControllerRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateNVMeControllerRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.CreateNVMeControllerRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateNVMeControllerRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.CreateNVMeControllerRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateNVMeControllerRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.CreateNVMeControllerRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateNVMeControllerRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.CreateNVMeControllerRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateNVMeControllerRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.CreateNVMeControllerRequest parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.CreateNVMeControllerRequest prototype) {
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
   * Protobuf type {@code opi_api.storage.v1.CreateNVMeControllerRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.CreateNVMeControllerRequest)
      opi_api.storage.v1.CreateNVMeControllerRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_CreateNVMeControllerRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_CreateNVMeControllerRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.CreateNVMeControllerRequest.class, opi_api.storage.v1.CreateNVMeControllerRequest.Builder.class);
    }

    // Construct using opi_api.storage.v1.CreateNVMeControllerRequest.newBuilder()
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

      if (nvMeControllerBuilder_ == null) {
        nvMeController_ = null;
      } else {
        nvMeController_ = null;
        nvMeControllerBuilder_ = null;
      }
      nvMeControllerId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_CreateNVMeControllerRequest_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.CreateNVMeControllerRequest getDefaultInstanceForType() {
      return opi_api.storage.v1.CreateNVMeControllerRequest.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.CreateNVMeControllerRequest build() {
      opi_api.storage.v1.CreateNVMeControllerRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.CreateNVMeControllerRequest buildPartial() {
      opi_api.storage.v1.CreateNVMeControllerRequest result = new opi_api.storage.v1.CreateNVMeControllerRequest(this);
      result.parent_ = parent_;
      if (nvMeControllerBuilder_ == null) {
        result.nvMeController_ = nvMeController_;
      } else {
        result.nvMeController_ = nvMeControllerBuilder_.build();
      }
      result.nvMeControllerId_ = nvMeControllerId_;
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
      if (other instanceof opi_api.storage.v1.CreateNVMeControllerRequest) {
        return mergeFrom((opi_api.storage.v1.CreateNVMeControllerRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.CreateNVMeControllerRequest other) {
      if (other == opi_api.storage.v1.CreateNVMeControllerRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasNvMeController()) {
        mergeNvMeController(other.getNvMeController());
      }
      if (!other.getNvMeControllerId().isEmpty()) {
        nvMeControllerId_ = other.nvMeControllerId_;
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
      opi_api.storage.v1.CreateNVMeControllerRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.CreateNVMeControllerRequest) e.getUnfinishedMessage();
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

    private opi_api.storage.v1.NVMeController nvMeController_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.NVMeController, opi_api.storage.v1.NVMeController.Builder, opi_api.storage.v1.NVMeControllerOrBuilder> nvMeControllerBuilder_;
    /**
     * <code>.opi_api.storage.v1.NVMeController nv_me_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the nvMeController field is set.
     */
    public boolean hasNvMeController() {
      return nvMeControllerBuilder_ != null || nvMeController_ != null;
    }
    /**
     * <code>.opi_api.storage.v1.NVMeController nv_me_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The nvMeController.
     */
    public opi_api.storage.v1.NVMeController getNvMeController() {
      if (nvMeControllerBuilder_ == null) {
        return nvMeController_ == null ? opi_api.storage.v1.NVMeController.getDefaultInstance() : nvMeController_;
      } else {
        return nvMeControllerBuilder_.getMessage();
      }
    }
    /**
     * <code>.opi_api.storage.v1.NVMeController nv_me_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setNvMeController(opi_api.storage.v1.NVMeController value) {
      if (nvMeControllerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        nvMeController_ = value;
        onChanged();
      } else {
        nvMeControllerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.NVMeController nv_me_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setNvMeController(
        opi_api.storage.v1.NVMeController.Builder builderForValue) {
      if (nvMeControllerBuilder_ == null) {
        nvMeController_ = builderForValue.build();
        onChanged();
      } else {
        nvMeControllerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.NVMeController nv_me_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeNvMeController(opi_api.storage.v1.NVMeController value) {
      if (nvMeControllerBuilder_ == null) {
        if (nvMeController_ != null) {
          nvMeController_ =
            opi_api.storage.v1.NVMeController.newBuilder(nvMeController_).mergeFrom(value).buildPartial();
        } else {
          nvMeController_ = value;
        }
        onChanged();
      } else {
        nvMeControllerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.NVMeController nv_me_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearNvMeController() {
      if (nvMeControllerBuilder_ == null) {
        nvMeController_ = null;
        onChanged();
      } else {
        nvMeController_ = null;
        nvMeControllerBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.NVMeController nv_me_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.storage.v1.NVMeController.Builder getNvMeControllerBuilder() {
      
      onChanged();
      return getNvMeControllerFieldBuilder().getBuilder();
    }
    /**
     * <code>.opi_api.storage.v1.NVMeController nv_me_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.storage.v1.NVMeControllerOrBuilder getNvMeControllerOrBuilder() {
      if (nvMeControllerBuilder_ != null) {
        return nvMeControllerBuilder_.getMessageOrBuilder();
      } else {
        return nvMeController_ == null ?
            opi_api.storage.v1.NVMeController.getDefaultInstance() : nvMeController_;
      }
    }
    /**
     * <code>.opi_api.storage.v1.NVMeController nv_me_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.NVMeController, opi_api.storage.v1.NVMeController.Builder, opi_api.storage.v1.NVMeControllerOrBuilder> 
        getNvMeControllerFieldBuilder() {
      if (nvMeControllerBuilder_ == null) {
        nvMeControllerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.storage.v1.NVMeController, opi_api.storage.v1.NVMeController.Builder, opi_api.storage.v1.NVMeControllerOrBuilder>(
                getNvMeController(),
                getParentForChildren(),
                isClean());
        nvMeController_ = null;
      }
      return nvMeControllerBuilder_;
    }

    private java.lang.Object nvMeControllerId_ = "";
    /**
     * <code>string nv_me_controller_id = 3;</code>
     * @return The nvMeControllerId.
     */
    public java.lang.String getNvMeControllerId() {
      java.lang.Object ref = nvMeControllerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nvMeControllerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string nv_me_controller_id = 3;</code>
     * @return The bytes for nvMeControllerId.
     */
    public com.google.protobuf.ByteString
        getNvMeControllerIdBytes() {
      java.lang.Object ref = nvMeControllerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nvMeControllerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string nv_me_controller_id = 3;</code>
     * @param value The nvMeControllerId to set.
     * @return This builder for chaining.
     */
    public Builder setNvMeControllerId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nvMeControllerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string nv_me_controller_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNvMeControllerId() {
      
      nvMeControllerId_ = getDefaultInstance().getNvMeControllerId();
      onChanged();
      return this;
    }
    /**
     * <code>string nv_me_controller_id = 3;</code>
     * @param value The bytes for nvMeControllerId to set.
     * @return This builder for chaining.
     */
    public Builder setNvMeControllerIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nvMeControllerId_ = value;
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.CreateNVMeControllerRequest)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.CreateNVMeControllerRequest)
  private static final opi_api.storage.v1.CreateNVMeControllerRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.CreateNVMeControllerRequest();
  }

  public static opi_api.storage.v1.CreateNVMeControllerRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateNVMeControllerRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateNVMeControllerRequest>() {
    @java.lang.Override
    public CreateNVMeControllerRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateNVMeControllerRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateNVMeControllerRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateNVMeControllerRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.CreateNVMeControllerRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

