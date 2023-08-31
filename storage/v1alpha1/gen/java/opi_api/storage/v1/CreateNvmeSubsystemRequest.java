// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_nvme_pcie.proto

package opi_api.storage.v1;

/**
 * <pre>
 * Represents a request to create an Nvme Subsystem.
 * </pre>
 *
 * Protobuf type {@code opi_api.storage.v1.CreateNvmeSubsystemRequest}
 */
public final class CreateNvmeSubsystemRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.CreateNvmeSubsystemRequest)
    CreateNvmeSubsystemRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateNvmeSubsystemRequest.newBuilder() to construct.
  private CreateNvmeSubsystemRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateNvmeSubsystemRequest() {
    nvmeSubsystemId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateNvmeSubsystemRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateNvmeSubsystemRequest(
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
            opi_api.storage.v1.NvmeSubsystem.Builder subBuilder = null;
            if (nvmeSubsystem_ != null) {
              subBuilder = nvmeSubsystem_.toBuilder();
            }
            nvmeSubsystem_ = input.readMessage(opi_api.storage.v1.NvmeSubsystem.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(nvmeSubsystem_);
              nvmeSubsystem_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nvmeSubsystemId_ = s;
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
    return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_CreateNvmeSubsystemRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_CreateNvmeSubsystemRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.CreateNvmeSubsystemRequest.class, opi_api.storage.v1.CreateNvmeSubsystemRequest.Builder.class);
  }

  public static final int NVME_SUBSYSTEM_FIELD_NUMBER = 1;
  private opi_api.storage.v1.NvmeSubsystem nvmeSubsystem_;
  /**
   * <pre>
   * The Nvme Subsystem to be created.
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeSubsystem nvme_subsystem = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the nvmeSubsystem field is set.
   */
  @java.lang.Override
  public boolean hasNvmeSubsystem() {
    return nvmeSubsystem_ != null;
  }
  /**
   * <pre>
   * The Nvme Subsystem to be created.
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeSubsystem nvme_subsystem = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The nvmeSubsystem.
   */
  @java.lang.Override
  public opi_api.storage.v1.NvmeSubsystem getNvmeSubsystem() {
    return nvmeSubsystem_ == null ? opi_api.storage.v1.NvmeSubsystem.getDefaultInstance() : nvmeSubsystem_;
  }
  /**
   * <pre>
   * The Nvme Subsystem to be created.
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeSubsystem nvme_subsystem = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.NvmeSubsystemOrBuilder getNvmeSubsystemOrBuilder() {
    return getNvmeSubsystem();
  }

  public static final int NVME_SUBSYSTEM_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object nvmeSubsystemId_;
  /**
   * <pre>
   * An optional ID to assign to the Nvme Subsystem.
   * If this is not provided the system will auto-generate it.
   * </pre>
   *
   * <code>string nvme_subsystem_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The nvmeSubsystemId.
   */
  @java.lang.Override
  public java.lang.String getNvmeSubsystemId() {
    java.lang.Object ref = nvmeSubsystemId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nvmeSubsystemId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * An optional ID to assign to the Nvme Subsystem.
   * If this is not provided the system will auto-generate it.
   * </pre>
   *
   * <code>string nvme_subsystem_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for nvmeSubsystemId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNvmeSubsystemIdBytes() {
    java.lang.Object ref = nvmeSubsystemId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nvmeSubsystemId_ = b;
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
    if (nvmeSubsystem_ != null) {
      output.writeMessage(1, getNvmeSubsystem());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nvmeSubsystemId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nvmeSubsystemId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (nvmeSubsystem_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getNvmeSubsystem());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nvmeSubsystemId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nvmeSubsystemId_);
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
    if (!(obj instanceof opi_api.storage.v1.CreateNvmeSubsystemRequest)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.CreateNvmeSubsystemRequest other = (opi_api.storage.v1.CreateNvmeSubsystemRequest) obj;

    if (hasNvmeSubsystem() != other.hasNvmeSubsystem()) return false;
    if (hasNvmeSubsystem()) {
      if (!getNvmeSubsystem()
          .equals(other.getNvmeSubsystem())) return false;
    }
    if (!getNvmeSubsystemId()
        .equals(other.getNvmeSubsystemId())) return false;
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
    if (hasNvmeSubsystem()) {
      hash = (37 * hash) + NVME_SUBSYSTEM_FIELD_NUMBER;
      hash = (53 * hash) + getNvmeSubsystem().hashCode();
    }
    hash = (37 * hash) + NVME_SUBSYSTEM_ID_FIELD_NUMBER;
    hash = (53 * hash) + getNvmeSubsystemId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.CreateNvmeSubsystemRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.CreateNvmeSubsystemRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateNvmeSubsystemRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.CreateNvmeSubsystemRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateNvmeSubsystemRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.CreateNvmeSubsystemRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateNvmeSubsystemRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.CreateNvmeSubsystemRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateNvmeSubsystemRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.CreateNvmeSubsystemRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateNvmeSubsystemRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.CreateNvmeSubsystemRequest parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.CreateNvmeSubsystemRequest prototype) {
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
   * Represents a request to create an Nvme Subsystem.
   * </pre>
   *
   * Protobuf type {@code opi_api.storage.v1.CreateNvmeSubsystemRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.CreateNvmeSubsystemRequest)
      opi_api.storage.v1.CreateNvmeSubsystemRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_CreateNvmeSubsystemRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_CreateNvmeSubsystemRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.CreateNvmeSubsystemRequest.class, opi_api.storage.v1.CreateNvmeSubsystemRequest.Builder.class);
    }

    // Construct using opi_api.storage.v1.CreateNvmeSubsystemRequest.newBuilder()
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
      if (nvmeSubsystemBuilder_ == null) {
        nvmeSubsystem_ = null;
      } else {
        nvmeSubsystem_ = null;
        nvmeSubsystemBuilder_ = null;
      }
      nvmeSubsystemId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_CreateNvmeSubsystemRequest_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.CreateNvmeSubsystemRequest getDefaultInstanceForType() {
      return opi_api.storage.v1.CreateNvmeSubsystemRequest.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.CreateNvmeSubsystemRequest build() {
      opi_api.storage.v1.CreateNvmeSubsystemRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.CreateNvmeSubsystemRequest buildPartial() {
      opi_api.storage.v1.CreateNvmeSubsystemRequest result = new opi_api.storage.v1.CreateNvmeSubsystemRequest(this);
      if (nvmeSubsystemBuilder_ == null) {
        result.nvmeSubsystem_ = nvmeSubsystem_;
      } else {
        result.nvmeSubsystem_ = nvmeSubsystemBuilder_.build();
      }
      result.nvmeSubsystemId_ = nvmeSubsystemId_;
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
      if (other instanceof opi_api.storage.v1.CreateNvmeSubsystemRequest) {
        return mergeFrom((opi_api.storage.v1.CreateNvmeSubsystemRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.CreateNvmeSubsystemRequest other) {
      if (other == opi_api.storage.v1.CreateNvmeSubsystemRequest.getDefaultInstance()) return this;
      if (other.hasNvmeSubsystem()) {
        mergeNvmeSubsystem(other.getNvmeSubsystem());
      }
      if (!other.getNvmeSubsystemId().isEmpty()) {
        nvmeSubsystemId_ = other.nvmeSubsystemId_;
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
      opi_api.storage.v1.CreateNvmeSubsystemRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.CreateNvmeSubsystemRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private opi_api.storage.v1.NvmeSubsystem nvmeSubsystem_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.NvmeSubsystem, opi_api.storage.v1.NvmeSubsystem.Builder, opi_api.storage.v1.NvmeSubsystemOrBuilder> nvmeSubsystemBuilder_;
    /**
     * <pre>
     * The Nvme Subsystem to be created.
     * </pre>
     *
     * <code>.opi_api.storage.v1.NvmeSubsystem nvme_subsystem = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the nvmeSubsystem field is set.
     */
    public boolean hasNvmeSubsystem() {
      return nvmeSubsystemBuilder_ != null || nvmeSubsystem_ != null;
    }
    /**
     * <pre>
     * The Nvme Subsystem to be created.
     * </pre>
     *
     * <code>.opi_api.storage.v1.NvmeSubsystem nvme_subsystem = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The nvmeSubsystem.
     */
    public opi_api.storage.v1.NvmeSubsystem getNvmeSubsystem() {
      if (nvmeSubsystemBuilder_ == null) {
        return nvmeSubsystem_ == null ? opi_api.storage.v1.NvmeSubsystem.getDefaultInstance() : nvmeSubsystem_;
      } else {
        return nvmeSubsystemBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The Nvme Subsystem to be created.
     * </pre>
     *
     * <code>.opi_api.storage.v1.NvmeSubsystem nvme_subsystem = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setNvmeSubsystem(opi_api.storage.v1.NvmeSubsystem value) {
      if (nvmeSubsystemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        nvmeSubsystem_ = value;
        onChanged();
      } else {
        nvmeSubsystemBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The Nvme Subsystem to be created.
     * </pre>
     *
     * <code>.opi_api.storage.v1.NvmeSubsystem nvme_subsystem = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setNvmeSubsystem(
        opi_api.storage.v1.NvmeSubsystem.Builder builderForValue) {
      if (nvmeSubsystemBuilder_ == null) {
        nvmeSubsystem_ = builderForValue.build();
        onChanged();
      } else {
        nvmeSubsystemBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The Nvme Subsystem to be created.
     * </pre>
     *
     * <code>.opi_api.storage.v1.NvmeSubsystem nvme_subsystem = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeNvmeSubsystem(opi_api.storage.v1.NvmeSubsystem value) {
      if (nvmeSubsystemBuilder_ == null) {
        if (nvmeSubsystem_ != null) {
          nvmeSubsystem_ =
            opi_api.storage.v1.NvmeSubsystem.newBuilder(nvmeSubsystem_).mergeFrom(value).buildPartial();
        } else {
          nvmeSubsystem_ = value;
        }
        onChanged();
      } else {
        nvmeSubsystemBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The Nvme Subsystem to be created.
     * </pre>
     *
     * <code>.opi_api.storage.v1.NvmeSubsystem nvme_subsystem = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearNvmeSubsystem() {
      if (nvmeSubsystemBuilder_ == null) {
        nvmeSubsystem_ = null;
        onChanged();
      } else {
        nvmeSubsystem_ = null;
        nvmeSubsystemBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The Nvme Subsystem to be created.
     * </pre>
     *
     * <code>.opi_api.storage.v1.NvmeSubsystem nvme_subsystem = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.storage.v1.NvmeSubsystem.Builder getNvmeSubsystemBuilder() {
      
      onChanged();
      return getNvmeSubsystemFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The Nvme Subsystem to be created.
     * </pre>
     *
     * <code>.opi_api.storage.v1.NvmeSubsystem nvme_subsystem = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.storage.v1.NvmeSubsystemOrBuilder getNvmeSubsystemOrBuilder() {
      if (nvmeSubsystemBuilder_ != null) {
        return nvmeSubsystemBuilder_.getMessageOrBuilder();
      } else {
        return nvmeSubsystem_ == null ?
            opi_api.storage.v1.NvmeSubsystem.getDefaultInstance() : nvmeSubsystem_;
      }
    }
    /**
     * <pre>
     * The Nvme Subsystem to be created.
     * </pre>
     *
     * <code>.opi_api.storage.v1.NvmeSubsystem nvme_subsystem = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.NvmeSubsystem, opi_api.storage.v1.NvmeSubsystem.Builder, opi_api.storage.v1.NvmeSubsystemOrBuilder> 
        getNvmeSubsystemFieldBuilder() {
      if (nvmeSubsystemBuilder_ == null) {
        nvmeSubsystemBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.storage.v1.NvmeSubsystem, opi_api.storage.v1.NvmeSubsystem.Builder, opi_api.storage.v1.NvmeSubsystemOrBuilder>(
                getNvmeSubsystem(),
                getParentForChildren(),
                isClean());
        nvmeSubsystem_ = null;
      }
      return nvmeSubsystemBuilder_;
    }

    private java.lang.Object nvmeSubsystemId_ = "";
    /**
     * <pre>
     * An optional ID to assign to the Nvme Subsystem.
     * If this is not provided the system will auto-generate it.
     * </pre>
     *
     * <code>string nvme_subsystem_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The nvmeSubsystemId.
     */
    public java.lang.String getNvmeSubsystemId() {
      java.lang.Object ref = nvmeSubsystemId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nvmeSubsystemId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * An optional ID to assign to the Nvme Subsystem.
     * If this is not provided the system will auto-generate it.
     * </pre>
     *
     * <code>string nvme_subsystem_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The bytes for nvmeSubsystemId.
     */
    public com.google.protobuf.ByteString
        getNvmeSubsystemIdBytes() {
      java.lang.Object ref = nvmeSubsystemId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nvmeSubsystemId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * An optional ID to assign to the Nvme Subsystem.
     * If this is not provided the system will auto-generate it.
     * </pre>
     *
     * <code>string nvme_subsystem_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The nvmeSubsystemId to set.
     * @return This builder for chaining.
     */
    public Builder setNvmeSubsystemId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nvmeSubsystemId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An optional ID to assign to the Nvme Subsystem.
     * If this is not provided the system will auto-generate it.
     * </pre>
     *
     * <code>string nvme_subsystem_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearNvmeSubsystemId() {
      
      nvmeSubsystemId_ = getDefaultInstance().getNvmeSubsystemId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An optional ID to assign to the Nvme Subsystem.
     * If this is not provided the system will auto-generate it.
     * </pre>
     *
     * <code>string nvme_subsystem_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The bytes for nvmeSubsystemId to set.
     * @return This builder for chaining.
     */
    public Builder setNvmeSubsystemIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nvmeSubsystemId_ = value;
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.CreateNvmeSubsystemRequest)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.CreateNvmeSubsystemRequest)
  private static final opi_api.storage.v1.CreateNvmeSubsystemRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.CreateNvmeSubsystemRequest();
  }

  public static opi_api.storage.v1.CreateNvmeSubsystemRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateNvmeSubsystemRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateNvmeSubsystemRequest>() {
    @java.lang.Override
    public CreateNvmeSubsystemRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateNvmeSubsystemRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateNvmeSubsystemRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateNvmeSubsystemRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.CreateNvmeSubsystemRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

