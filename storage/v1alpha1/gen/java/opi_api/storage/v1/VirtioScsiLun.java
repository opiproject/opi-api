// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_virtio_scsi.proto

package opi_api.storage.v1;

/**
 * Protobuf type {@code opi_api.storage.v1.VirtioScsiLun}
 */
public final class VirtioScsiLun extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.VirtioScsiLun)
    VirtioScsiLunOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VirtioScsiLun.newBuilder() to construct.
  private VirtioScsiLun(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VirtioScsiLun() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VirtioScsiLun();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VirtioScsiLun(
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

            name_ = s;
            break;
          }
          case 18: {
            opi_api.common.v1.ObjectKey.Builder subBuilder = null;
            if (targetId_ != null) {
              subBuilder = targetId_.toBuilder();
            }
            targetId_ = input.readMessage(opi_api.common.v1.ObjectKey.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(targetId_);
              targetId_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            opi_api.common.v1.ObjectKey.Builder subBuilder = null;
            if (volumeId_ != null) {
              subBuilder = volumeId_.toBuilder();
            }
            volumeId_ = input.readMessage(opi_api.common.v1.ObjectKey.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(volumeId_);
              volumeId_ = subBuilder.buildPartial();
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
    return opi_api.storage.v1.FrontendVirtioScsiProto.internal_static_opi_api_storage_v1_VirtioScsiLun_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.FrontendVirtioScsiProto.internal_static_opi_api_storage_v1_VirtioScsiLun_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.VirtioScsiLun.class, opi_api.storage.v1.VirtioScsiLun.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * name is an opaque object handle that is not user settable.
   * name will be returned with created object
   * user can only set {resource}_id on the Create request object
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * name is an opaque object handle that is not user settable.
   * name will be returned with created object
   * user can only set {resource}_id on the Create request object
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TARGET_ID_FIELD_NUMBER = 2;
  private opi_api.common.v1.ObjectKey targetId_;
  /**
   * <pre>
   * The target that this LUN is in
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey target_id = 2;</code>
   * @return Whether the targetId field is set.
   */
  @java.lang.Override
  public boolean hasTargetId() {
    return targetId_ != null;
  }
  /**
   * <pre>
   * The target that this LUN is in
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey target_id = 2;</code>
   * @return The targetId.
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKey getTargetId() {
    return targetId_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : targetId_;
  }
  /**
   * <pre>
   * The target that this LUN is in
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey target_id = 2;</code>
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKeyOrBuilder getTargetIdOrBuilder() {
    return getTargetId();
  }

  public static final int VOLUME_ID_FIELD_NUMBER = 3;
  private opi_api.common.v1.ObjectKey volumeId_;
  /**
   * <pre>
   * The middle/back-end volume for this LLUN
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey volume_id = 3;</code>
   * @return Whether the volumeId field is set.
   */
  @java.lang.Override
  public boolean hasVolumeId() {
    return volumeId_ != null;
  }
  /**
   * <pre>
   * The middle/back-end volume for this LLUN
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey volume_id = 3;</code>
   * @return The volumeId.
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKey getVolumeId() {
    return volumeId_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : volumeId_;
  }
  /**
   * <pre>
   * The middle/back-end volume for this LLUN
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey volume_id = 3;</code>
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKeyOrBuilder getVolumeIdOrBuilder() {
    return getVolumeId();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (targetId_ != null) {
      output.writeMessage(2, getTargetId());
    }
    if (volumeId_ != null) {
      output.writeMessage(3, getVolumeId());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (targetId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTargetId());
    }
    if (volumeId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getVolumeId());
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
    if (!(obj instanceof opi_api.storage.v1.VirtioScsiLun)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.VirtioScsiLun other = (opi_api.storage.v1.VirtioScsiLun) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (hasTargetId() != other.hasTargetId()) return false;
    if (hasTargetId()) {
      if (!getTargetId()
          .equals(other.getTargetId())) return false;
    }
    if (hasVolumeId() != other.hasVolumeId()) return false;
    if (hasVolumeId()) {
      if (!getVolumeId()
          .equals(other.getVolumeId())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasTargetId()) {
      hash = (37 * hash) + TARGET_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetId().hashCode();
    }
    if (hasVolumeId()) {
      hash = (37 * hash) + VOLUME_ID_FIELD_NUMBER;
      hash = (53 * hash) + getVolumeId().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.VirtioScsiLun parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.VirtioScsiLun parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.VirtioScsiLun parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.VirtioScsiLun parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.VirtioScsiLun parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.VirtioScsiLun parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.VirtioScsiLun parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.VirtioScsiLun parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.VirtioScsiLun parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.VirtioScsiLun parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.VirtioScsiLun parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.VirtioScsiLun parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.VirtioScsiLun prototype) {
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
   * Protobuf type {@code opi_api.storage.v1.VirtioScsiLun}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.VirtioScsiLun)
      opi_api.storage.v1.VirtioScsiLunOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.FrontendVirtioScsiProto.internal_static_opi_api_storage_v1_VirtioScsiLun_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.FrontendVirtioScsiProto.internal_static_opi_api_storage_v1_VirtioScsiLun_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.VirtioScsiLun.class, opi_api.storage.v1.VirtioScsiLun.Builder.class);
    }

    // Construct using opi_api.storage.v1.VirtioScsiLun.newBuilder()
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
      name_ = "";

      if (targetIdBuilder_ == null) {
        targetId_ = null;
      } else {
        targetId_ = null;
        targetIdBuilder_ = null;
      }
      if (volumeIdBuilder_ == null) {
        volumeId_ = null;
      } else {
        volumeId_ = null;
        volumeIdBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.FrontendVirtioScsiProto.internal_static_opi_api_storage_v1_VirtioScsiLun_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.VirtioScsiLun getDefaultInstanceForType() {
      return opi_api.storage.v1.VirtioScsiLun.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.VirtioScsiLun build() {
      opi_api.storage.v1.VirtioScsiLun result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.VirtioScsiLun buildPartial() {
      opi_api.storage.v1.VirtioScsiLun result = new opi_api.storage.v1.VirtioScsiLun(this);
      result.name_ = name_;
      if (targetIdBuilder_ == null) {
        result.targetId_ = targetId_;
      } else {
        result.targetId_ = targetIdBuilder_.build();
      }
      if (volumeIdBuilder_ == null) {
        result.volumeId_ = volumeId_;
      } else {
        result.volumeId_ = volumeIdBuilder_.build();
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
      if (other instanceof opi_api.storage.v1.VirtioScsiLun) {
        return mergeFrom((opi_api.storage.v1.VirtioScsiLun)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.VirtioScsiLun other) {
      if (other == opi_api.storage.v1.VirtioScsiLun.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasTargetId()) {
        mergeTargetId(other.getTargetId());
      }
      if (other.hasVolumeId()) {
        mergeVolumeId(other.getVolumeId());
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
      opi_api.storage.v1.VirtioScsiLun parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.VirtioScsiLun) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * name is an opaque object handle that is not user settable.
     * name will be returned with created object
     * user can only set {resource}_id on the Create request object
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * name is an opaque object handle that is not user settable.
     * name will be returned with created object
     * user can only set {resource}_id on the Create request object
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * name is an opaque object handle that is not user settable.
     * name will be returned with created object
     * user can only set {resource}_id on the Create request object
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * name is an opaque object handle that is not user settable.
     * name will be returned with created object
     * user can only set {resource}_id on the Create request object
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * name is an opaque object handle that is not user settable.
     * name will be returned with created object
     * user can only set {resource}_id on the Create request object
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private opi_api.common.v1.ObjectKey targetId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> targetIdBuilder_;
    /**
     * <pre>
     * The target that this LUN is in
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey target_id = 2;</code>
     * @return Whether the targetId field is set.
     */
    public boolean hasTargetId() {
      return targetIdBuilder_ != null || targetId_ != null;
    }
    /**
     * <pre>
     * The target that this LUN is in
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey target_id = 2;</code>
     * @return The targetId.
     */
    public opi_api.common.v1.ObjectKey getTargetId() {
      if (targetIdBuilder_ == null) {
        return targetId_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : targetId_;
      } else {
        return targetIdBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The target that this LUN is in
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey target_id = 2;</code>
     */
    public Builder setTargetId(opi_api.common.v1.ObjectKey value) {
      if (targetIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        targetId_ = value;
        onChanged();
      } else {
        targetIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The target that this LUN is in
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey target_id = 2;</code>
     */
    public Builder setTargetId(
        opi_api.common.v1.ObjectKey.Builder builderForValue) {
      if (targetIdBuilder_ == null) {
        targetId_ = builderForValue.build();
        onChanged();
      } else {
        targetIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The target that this LUN is in
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey target_id = 2;</code>
     */
    public Builder mergeTargetId(opi_api.common.v1.ObjectKey value) {
      if (targetIdBuilder_ == null) {
        if (targetId_ != null) {
          targetId_ =
            opi_api.common.v1.ObjectKey.newBuilder(targetId_).mergeFrom(value).buildPartial();
        } else {
          targetId_ = value;
        }
        onChanged();
      } else {
        targetIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The target that this LUN is in
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey target_id = 2;</code>
     */
    public Builder clearTargetId() {
      if (targetIdBuilder_ == null) {
        targetId_ = null;
        onChanged();
      } else {
        targetId_ = null;
        targetIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The target that this LUN is in
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey target_id = 2;</code>
     */
    public opi_api.common.v1.ObjectKey.Builder getTargetIdBuilder() {
      
      onChanged();
      return getTargetIdFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The target that this LUN is in
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey target_id = 2;</code>
     */
    public opi_api.common.v1.ObjectKeyOrBuilder getTargetIdOrBuilder() {
      if (targetIdBuilder_ != null) {
        return targetIdBuilder_.getMessageOrBuilder();
      } else {
        return targetId_ == null ?
            opi_api.common.v1.ObjectKey.getDefaultInstance() : targetId_;
      }
    }
    /**
     * <pre>
     * The target that this LUN is in
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey target_id = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> 
        getTargetIdFieldBuilder() {
      if (targetIdBuilder_ == null) {
        targetIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder>(
                getTargetId(),
                getParentForChildren(),
                isClean());
        targetId_ = null;
      }
      return targetIdBuilder_;
    }

    private opi_api.common.v1.ObjectKey volumeId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> volumeIdBuilder_;
    /**
     * <pre>
     * The middle/back-end volume for this LLUN
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey volume_id = 3;</code>
     * @return Whether the volumeId field is set.
     */
    public boolean hasVolumeId() {
      return volumeIdBuilder_ != null || volumeId_ != null;
    }
    /**
     * <pre>
     * The middle/back-end volume for this LLUN
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey volume_id = 3;</code>
     * @return The volumeId.
     */
    public opi_api.common.v1.ObjectKey getVolumeId() {
      if (volumeIdBuilder_ == null) {
        return volumeId_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : volumeId_;
      } else {
        return volumeIdBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The middle/back-end volume for this LLUN
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey volume_id = 3;</code>
     */
    public Builder setVolumeId(opi_api.common.v1.ObjectKey value) {
      if (volumeIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        volumeId_ = value;
        onChanged();
      } else {
        volumeIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The middle/back-end volume for this LLUN
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey volume_id = 3;</code>
     */
    public Builder setVolumeId(
        opi_api.common.v1.ObjectKey.Builder builderForValue) {
      if (volumeIdBuilder_ == null) {
        volumeId_ = builderForValue.build();
        onChanged();
      } else {
        volumeIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The middle/back-end volume for this LLUN
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey volume_id = 3;</code>
     */
    public Builder mergeVolumeId(opi_api.common.v1.ObjectKey value) {
      if (volumeIdBuilder_ == null) {
        if (volumeId_ != null) {
          volumeId_ =
            opi_api.common.v1.ObjectKey.newBuilder(volumeId_).mergeFrom(value).buildPartial();
        } else {
          volumeId_ = value;
        }
        onChanged();
      } else {
        volumeIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The middle/back-end volume for this LLUN
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey volume_id = 3;</code>
     */
    public Builder clearVolumeId() {
      if (volumeIdBuilder_ == null) {
        volumeId_ = null;
        onChanged();
      } else {
        volumeId_ = null;
        volumeIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The middle/back-end volume for this LLUN
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey volume_id = 3;</code>
     */
    public opi_api.common.v1.ObjectKey.Builder getVolumeIdBuilder() {
      
      onChanged();
      return getVolumeIdFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The middle/back-end volume for this LLUN
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey volume_id = 3;</code>
     */
    public opi_api.common.v1.ObjectKeyOrBuilder getVolumeIdOrBuilder() {
      if (volumeIdBuilder_ != null) {
        return volumeIdBuilder_.getMessageOrBuilder();
      } else {
        return volumeId_ == null ?
            opi_api.common.v1.ObjectKey.getDefaultInstance() : volumeId_;
      }
    }
    /**
     * <pre>
     * The middle/back-end volume for this LLUN
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey volume_id = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> 
        getVolumeIdFieldBuilder() {
      if (volumeIdBuilder_ == null) {
        volumeIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder>(
                getVolumeId(),
                getParentForChildren(),
                isClean());
        volumeId_ = null;
      }
      return volumeIdBuilder_;
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.VirtioScsiLun)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.VirtioScsiLun)
  private static final opi_api.storage.v1.VirtioScsiLun DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.VirtioScsiLun();
  }

  public static opi_api.storage.v1.VirtioScsiLun getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VirtioScsiLun>
      PARSER = new com.google.protobuf.AbstractParser<VirtioScsiLun>() {
    @java.lang.Override
    public VirtioScsiLun parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VirtioScsiLun(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VirtioScsiLun> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VirtioScsiLun> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.VirtioScsiLun getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

