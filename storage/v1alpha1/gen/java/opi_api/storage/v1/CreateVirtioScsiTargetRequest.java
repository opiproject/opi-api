// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_virtio_scsi.proto

package opi_api.storage.v1;

/**
 * Protobuf type {@code opi_api.storage.v1.CreateVirtioScsiTargetRequest}
 */
public final class CreateVirtioScsiTargetRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.CreateVirtioScsiTargetRequest)
    CreateVirtioScsiTargetRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateVirtioScsiTargetRequest.newBuilder() to construct.
  private CreateVirtioScsiTargetRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateVirtioScsiTargetRequest() {
    virtioScsiTargetId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateVirtioScsiTargetRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateVirtioScsiTargetRequest(
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
          case 18: {
            opi_api.storage.v1.VirtioScsiTarget.Builder subBuilder = null;
            if (virtioScsiTarget_ != null) {
              subBuilder = virtioScsiTarget_.toBuilder();
            }
            virtioScsiTarget_ = input.readMessage(opi_api.storage.v1.VirtioScsiTarget.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(virtioScsiTarget_);
              virtioScsiTarget_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            virtioScsiTargetId_ = s;
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
    return opi_api.storage.v1.FrontendVirtioScsiProto.internal_static_opi_api_storage_v1_CreateVirtioScsiTargetRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.FrontendVirtioScsiProto.internal_static_opi_api_storage_v1_CreateVirtioScsiTargetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.CreateVirtioScsiTargetRequest.class, opi_api.storage.v1.CreateVirtioScsiTargetRequest.Builder.class);
  }

  public static final int VIRTIO_SCSI_TARGET_FIELD_NUMBER = 2;
  private opi_api.storage.v1.VirtioScsiTarget virtioScsiTarget_;
  /**
   * <code>.opi_api.storage.v1.VirtioScsiTarget virtio_scsi_target = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the virtioScsiTarget field is set.
   */
  @java.lang.Override
  public boolean hasVirtioScsiTarget() {
    return virtioScsiTarget_ != null;
  }
  /**
   * <code>.opi_api.storage.v1.VirtioScsiTarget virtio_scsi_target = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The virtioScsiTarget.
   */
  @java.lang.Override
  public opi_api.storage.v1.VirtioScsiTarget getVirtioScsiTarget() {
    return virtioScsiTarget_ == null ? opi_api.storage.v1.VirtioScsiTarget.getDefaultInstance() : virtioScsiTarget_;
  }
  /**
   * <code>.opi_api.storage.v1.VirtioScsiTarget virtio_scsi_target = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.VirtioScsiTargetOrBuilder getVirtioScsiTargetOrBuilder() {
    return getVirtioScsiTarget();
  }

  public static final int VIRTIO_SCSI_TARGET_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object virtioScsiTargetId_;
  /**
   * <code>string virtio_scsi_target_id = 3;</code>
   * @return The virtioScsiTargetId.
   */
  @java.lang.Override
  public java.lang.String getVirtioScsiTargetId() {
    java.lang.Object ref = virtioScsiTargetId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      virtioScsiTargetId_ = s;
      return s;
    }
  }
  /**
   * <code>string virtio_scsi_target_id = 3;</code>
   * @return The bytes for virtioScsiTargetId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVirtioScsiTargetIdBytes() {
    java.lang.Object ref = virtioScsiTargetId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      virtioScsiTargetId_ = b;
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
    if (virtioScsiTarget_ != null) {
      output.writeMessage(2, getVirtioScsiTarget());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(virtioScsiTargetId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, virtioScsiTargetId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (virtioScsiTarget_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getVirtioScsiTarget());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(virtioScsiTargetId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, virtioScsiTargetId_);
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
    if (!(obj instanceof opi_api.storage.v1.CreateVirtioScsiTargetRequest)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.CreateVirtioScsiTargetRequest other = (opi_api.storage.v1.CreateVirtioScsiTargetRequest) obj;

    if (hasVirtioScsiTarget() != other.hasVirtioScsiTarget()) return false;
    if (hasVirtioScsiTarget()) {
      if (!getVirtioScsiTarget()
          .equals(other.getVirtioScsiTarget())) return false;
    }
    if (!getVirtioScsiTargetId()
        .equals(other.getVirtioScsiTargetId())) return false;
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
    if (hasVirtioScsiTarget()) {
      hash = (37 * hash) + VIRTIO_SCSI_TARGET_FIELD_NUMBER;
      hash = (53 * hash) + getVirtioScsiTarget().hashCode();
    }
    hash = (37 * hash) + VIRTIO_SCSI_TARGET_ID_FIELD_NUMBER;
    hash = (53 * hash) + getVirtioScsiTargetId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.CreateVirtioScsiTargetRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.CreateVirtioScsiTargetRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateVirtioScsiTargetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.CreateVirtioScsiTargetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateVirtioScsiTargetRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.CreateVirtioScsiTargetRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateVirtioScsiTargetRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.CreateVirtioScsiTargetRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateVirtioScsiTargetRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.CreateVirtioScsiTargetRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateVirtioScsiTargetRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.CreateVirtioScsiTargetRequest parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.CreateVirtioScsiTargetRequest prototype) {
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
   * Protobuf type {@code opi_api.storage.v1.CreateVirtioScsiTargetRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.CreateVirtioScsiTargetRequest)
      opi_api.storage.v1.CreateVirtioScsiTargetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.FrontendVirtioScsiProto.internal_static_opi_api_storage_v1_CreateVirtioScsiTargetRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.FrontendVirtioScsiProto.internal_static_opi_api_storage_v1_CreateVirtioScsiTargetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.CreateVirtioScsiTargetRequest.class, opi_api.storage.v1.CreateVirtioScsiTargetRequest.Builder.class);
    }

    // Construct using opi_api.storage.v1.CreateVirtioScsiTargetRequest.newBuilder()
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
      if (virtioScsiTargetBuilder_ == null) {
        virtioScsiTarget_ = null;
      } else {
        virtioScsiTarget_ = null;
        virtioScsiTargetBuilder_ = null;
      }
      virtioScsiTargetId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.FrontendVirtioScsiProto.internal_static_opi_api_storage_v1_CreateVirtioScsiTargetRequest_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.CreateVirtioScsiTargetRequest getDefaultInstanceForType() {
      return opi_api.storage.v1.CreateVirtioScsiTargetRequest.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.CreateVirtioScsiTargetRequest build() {
      opi_api.storage.v1.CreateVirtioScsiTargetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.CreateVirtioScsiTargetRequest buildPartial() {
      opi_api.storage.v1.CreateVirtioScsiTargetRequest result = new opi_api.storage.v1.CreateVirtioScsiTargetRequest(this);
      if (virtioScsiTargetBuilder_ == null) {
        result.virtioScsiTarget_ = virtioScsiTarget_;
      } else {
        result.virtioScsiTarget_ = virtioScsiTargetBuilder_.build();
      }
      result.virtioScsiTargetId_ = virtioScsiTargetId_;
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
      if (other instanceof opi_api.storage.v1.CreateVirtioScsiTargetRequest) {
        return mergeFrom((opi_api.storage.v1.CreateVirtioScsiTargetRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.CreateVirtioScsiTargetRequest other) {
      if (other == opi_api.storage.v1.CreateVirtioScsiTargetRequest.getDefaultInstance()) return this;
      if (other.hasVirtioScsiTarget()) {
        mergeVirtioScsiTarget(other.getVirtioScsiTarget());
      }
      if (!other.getVirtioScsiTargetId().isEmpty()) {
        virtioScsiTargetId_ = other.virtioScsiTargetId_;
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
      opi_api.storage.v1.CreateVirtioScsiTargetRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.CreateVirtioScsiTargetRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private opi_api.storage.v1.VirtioScsiTarget virtioScsiTarget_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.VirtioScsiTarget, opi_api.storage.v1.VirtioScsiTarget.Builder, opi_api.storage.v1.VirtioScsiTargetOrBuilder> virtioScsiTargetBuilder_;
    /**
     * <code>.opi_api.storage.v1.VirtioScsiTarget virtio_scsi_target = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the virtioScsiTarget field is set.
     */
    public boolean hasVirtioScsiTarget() {
      return virtioScsiTargetBuilder_ != null || virtioScsiTarget_ != null;
    }
    /**
     * <code>.opi_api.storage.v1.VirtioScsiTarget virtio_scsi_target = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The virtioScsiTarget.
     */
    public opi_api.storage.v1.VirtioScsiTarget getVirtioScsiTarget() {
      if (virtioScsiTargetBuilder_ == null) {
        return virtioScsiTarget_ == null ? opi_api.storage.v1.VirtioScsiTarget.getDefaultInstance() : virtioScsiTarget_;
      } else {
        return virtioScsiTargetBuilder_.getMessage();
      }
    }
    /**
     * <code>.opi_api.storage.v1.VirtioScsiTarget virtio_scsi_target = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setVirtioScsiTarget(opi_api.storage.v1.VirtioScsiTarget value) {
      if (virtioScsiTargetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        virtioScsiTarget_ = value;
        onChanged();
      } else {
        virtioScsiTargetBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.VirtioScsiTarget virtio_scsi_target = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setVirtioScsiTarget(
        opi_api.storage.v1.VirtioScsiTarget.Builder builderForValue) {
      if (virtioScsiTargetBuilder_ == null) {
        virtioScsiTarget_ = builderForValue.build();
        onChanged();
      } else {
        virtioScsiTargetBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.VirtioScsiTarget virtio_scsi_target = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeVirtioScsiTarget(opi_api.storage.v1.VirtioScsiTarget value) {
      if (virtioScsiTargetBuilder_ == null) {
        if (virtioScsiTarget_ != null) {
          virtioScsiTarget_ =
            opi_api.storage.v1.VirtioScsiTarget.newBuilder(virtioScsiTarget_).mergeFrom(value).buildPartial();
        } else {
          virtioScsiTarget_ = value;
        }
        onChanged();
      } else {
        virtioScsiTargetBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.VirtioScsiTarget virtio_scsi_target = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearVirtioScsiTarget() {
      if (virtioScsiTargetBuilder_ == null) {
        virtioScsiTarget_ = null;
        onChanged();
      } else {
        virtioScsiTarget_ = null;
        virtioScsiTargetBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.VirtioScsiTarget virtio_scsi_target = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.storage.v1.VirtioScsiTarget.Builder getVirtioScsiTargetBuilder() {
      
      onChanged();
      return getVirtioScsiTargetFieldBuilder().getBuilder();
    }
    /**
     * <code>.opi_api.storage.v1.VirtioScsiTarget virtio_scsi_target = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.storage.v1.VirtioScsiTargetOrBuilder getVirtioScsiTargetOrBuilder() {
      if (virtioScsiTargetBuilder_ != null) {
        return virtioScsiTargetBuilder_.getMessageOrBuilder();
      } else {
        return virtioScsiTarget_ == null ?
            opi_api.storage.v1.VirtioScsiTarget.getDefaultInstance() : virtioScsiTarget_;
      }
    }
    /**
     * <code>.opi_api.storage.v1.VirtioScsiTarget virtio_scsi_target = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.VirtioScsiTarget, opi_api.storage.v1.VirtioScsiTarget.Builder, opi_api.storage.v1.VirtioScsiTargetOrBuilder> 
        getVirtioScsiTargetFieldBuilder() {
      if (virtioScsiTargetBuilder_ == null) {
        virtioScsiTargetBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.storage.v1.VirtioScsiTarget, opi_api.storage.v1.VirtioScsiTarget.Builder, opi_api.storage.v1.VirtioScsiTargetOrBuilder>(
                getVirtioScsiTarget(),
                getParentForChildren(),
                isClean());
        virtioScsiTarget_ = null;
      }
      return virtioScsiTargetBuilder_;
    }

    private java.lang.Object virtioScsiTargetId_ = "";
    /**
     * <code>string virtio_scsi_target_id = 3;</code>
     * @return The virtioScsiTargetId.
     */
    public java.lang.String getVirtioScsiTargetId() {
      java.lang.Object ref = virtioScsiTargetId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        virtioScsiTargetId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string virtio_scsi_target_id = 3;</code>
     * @return The bytes for virtioScsiTargetId.
     */
    public com.google.protobuf.ByteString
        getVirtioScsiTargetIdBytes() {
      java.lang.Object ref = virtioScsiTargetId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        virtioScsiTargetId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string virtio_scsi_target_id = 3;</code>
     * @param value The virtioScsiTargetId to set.
     * @return This builder for chaining.
     */
    public Builder setVirtioScsiTargetId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      virtioScsiTargetId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string virtio_scsi_target_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearVirtioScsiTargetId() {
      
      virtioScsiTargetId_ = getDefaultInstance().getVirtioScsiTargetId();
      onChanged();
      return this;
    }
    /**
     * <code>string virtio_scsi_target_id = 3;</code>
     * @param value The bytes for virtioScsiTargetId to set.
     * @return This builder for chaining.
     */
    public Builder setVirtioScsiTargetIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      virtioScsiTargetId_ = value;
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.CreateVirtioScsiTargetRequest)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.CreateVirtioScsiTargetRequest)
  private static final opi_api.storage.v1.CreateVirtioScsiTargetRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.CreateVirtioScsiTargetRequest();
  }

  public static opi_api.storage.v1.CreateVirtioScsiTargetRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateVirtioScsiTargetRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateVirtioScsiTargetRequest>() {
    @java.lang.Override
    public CreateVirtioScsiTargetRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateVirtioScsiTargetRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateVirtioScsiTargetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateVirtioScsiTargetRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.CreateVirtioScsiTargetRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

