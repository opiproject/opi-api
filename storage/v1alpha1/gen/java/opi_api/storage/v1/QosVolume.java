// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: middleend_qos_volume.proto

package opi_api.storage.v1;

/**
 * Protobuf type {@code opi_api.storage.v1.QosVolume}
 */
public final class QosVolume extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.QosVolume)
    QosVolumeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QosVolume.newBuilder() to construct.
  private QosVolume(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QosVolume() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QosVolume();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QosVolume(
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
          case 26: {
            opi_api.storage.v1.QosLimit.Builder subBuilder = null;
            if (minLimit_ != null) {
              subBuilder = minLimit_.toBuilder();
            }
            minLimit_ = input.readMessage(opi_api.storage.v1.QosLimit.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(minLimit_);
              minLimit_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            opi_api.storage.v1.QosLimit.Builder subBuilder = null;
            if (maxLimit_ != null) {
              subBuilder = maxLimit_.toBuilder();
            }
            maxLimit_ = input.readMessage(opi_api.storage.v1.QosLimit.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(maxLimit_);
              maxLimit_ = subBuilder.buildPartial();
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
    return opi_api.storage.v1.MiddleendQosVolumeProto.internal_static_opi_api_storage_v1_QosVolume_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.MiddleendQosVolumeProto.internal_static_opi_api_storage_v1_QosVolume_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.QosVolume.class, opi_api.storage.v1.QosVolume.Builder.class);
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
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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

  public static final int VOLUME_ID_FIELD_NUMBER = 2;
  private opi_api.common.v1.ObjectKey volumeId_;
  /**
   * <pre>
   * Middleend/backend volume to apply QoS on
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey volume_id = 2;</code>
   * @return Whether the volumeId field is set.
   */
  @java.lang.Override
  public boolean hasVolumeId() {
    return volumeId_ != null;
  }
  /**
   * <pre>
   * Middleend/backend volume to apply QoS on
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey volume_id = 2;</code>
   * @return The volumeId.
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKey getVolumeId() {
    return volumeId_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : volumeId_;
  }
  /**
   * <pre>
   * Middleend/backend volume to apply QoS on
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey volume_id = 2;</code>
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKeyOrBuilder getVolumeIdOrBuilder() {
    return getVolumeId();
  }

  public static final int MIN_LIMIT_FIELD_NUMBER = 3;
  private opi_api.storage.v1.QosLimit minLimit_;
  /**
   * <code>.opi_api.storage.v1.QosLimit min_limit = 3;</code>
   * @return Whether the minLimit field is set.
   */
  @java.lang.Override
  public boolean hasMinLimit() {
    return minLimit_ != null;
  }
  /**
   * <code>.opi_api.storage.v1.QosLimit min_limit = 3;</code>
   * @return The minLimit.
   */
  @java.lang.Override
  public opi_api.storage.v1.QosLimit getMinLimit() {
    return minLimit_ == null ? opi_api.storage.v1.QosLimit.getDefaultInstance() : minLimit_;
  }
  /**
   * <code>.opi_api.storage.v1.QosLimit min_limit = 3;</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.QosLimitOrBuilder getMinLimitOrBuilder() {
    return getMinLimit();
  }

  public static final int MAX_LIMIT_FIELD_NUMBER = 4;
  private opi_api.storage.v1.QosLimit maxLimit_;
  /**
   * <code>.opi_api.storage.v1.QosLimit max_limit = 4;</code>
   * @return Whether the maxLimit field is set.
   */
  @java.lang.Override
  public boolean hasMaxLimit() {
    return maxLimit_ != null;
  }
  /**
   * <code>.opi_api.storage.v1.QosLimit max_limit = 4;</code>
   * @return The maxLimit.
   */
  @java.lang.Override
  public opi_api.storage.v1.QosLimit getMaxLimit() {
    return maxLimit_ == null ? opi_api.storage.v1.QosLimit.getDefaultInstance() : maxLimit_;
  }
  /**
   * <code>.opi_api.storage.v1.QosLimit max_limit = 4;</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.QosLimitOrBuilder getMaxLimitOrBuilder() {
    return getMaxLimit();
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
    if (volumeId_ != null) {
      output.writeMessage(2, getVolumeId());
    }
    if (minLimit_ != null) {
      output.writeMessage(3, getMinLimit());
    }
    if (maxLimit_ != null) {
      output.writeMessage(4, getMaxLimit());
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
    if (volumeId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getVolumeId());
    }
    if (minLimit_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getMinLimit());
    }
    if (maxLimit_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getMaxLimit());
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
    if (!(obj instanceof opi_api.storage.v1.QosVolume)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.QosVolume other = (opi_api.storage.v1.QosVolume) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (hasVolumeId() != other.hasVolumeId()) return false;
    if (hasVolumeId()) {
      if (!getVolumeId()
          .equals(other.getVolumeId())) return false;
    }
    if (hasMinLimit() != other.hasMinLimit()) return false;
    if (hasMinLimit()) {
      if (!getMinLimit()
          .equals(other.getMinLimit())) return false;
    }
    if (hasMaxLimit() != other.hasMaxLimit()) return false;
    if (hasMaxLimit()) {
      if (!getMaxLimit()
          .equals(other.getMaxLimit())) return false;
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
    if (hasVolumeId()) {
      hash = (37 * hash) + VOLUME_ID_FIELD_NUMBER;
      hash = (53 * hash) + getVolumeId().hashCode();
    }
    if (hasMinLimit()) {
      hash = (37 * hash) + MIN_LIMIT_FIELD_NUMBER;
      hash = (53 * hash) + getMinLimit().hashCode();
    }
    if (hasMaxLimit()) {
      hash = (37 * hash) + MAX_LIMIT_FIELD_NUMBER;
      hash = (53 * hash) + getMaxLimit().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.QosVolume parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.QosVolume parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.QosVolume parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.QosVolume parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.QosVolume parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.QosVolume parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.QosVolume parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.QosVolume parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.QosVolume parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.QosVolume parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.QosVolume parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.QosVolume parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.QosVolume prototype) {
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
   * Protobuf type {@code opi_api.storage.v1.QosVolume}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.QosVolume)
      opi_api.storage.v1.QosVolumeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.MiddleendQosVolumeProto.internal_static_opi_api_storage_v1_QosVolume_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.MiddleendQosVolumeProto.internal_static_opi_api_storage_v1_QosVolume_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.QosVolume.class, opi_api.storage.v1.QosVolume.Builder.class);
    }

    // Construct using opi_api.storage.v1.QosVolume.newBuilder()
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

      if (volumeIdBuilder_ == null) {
        volumeId_ = null;
      } else {
        volumeId_ = null;
        volumeIdBuilder_ = null;
      }
      if (minLimitBuilder_ == null) {
        minLimit_ = null;
      } else {
        minLimit_ = null;
        minLimitBuilder_ = null;
      }
      if (maxLimitBuilder_ == null) {
        maxLimit_ = null;
      } else {
        maxLimit_ = null;
        maxLimitBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.MiddleendQosVolumeProto.internal_static_opi_api_storage_v1_QosVolume_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.QosVolume getDefaultInstanceForType() {
      return opi_api.storage.v1.QosVolume.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.QosVolume build() {
      opi_api.storage.v1.QosVolume result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.QosVolume buildPartial() {
      opi_api.storage.v1.QosVolume result = new opi_api.storage.v1.QosVolume(this);
      result.name_ = name_;
      if (volumeIdBuilder_ == null) {
        result.volumeId_ = volumeId_;
      } else {
        result.volumeId_ = volumeIdBuilder_.build();
      }
      if (minLimitBuilder_ == null) {
        result.minLimit_ = minLimit_;
      } else {
        result.minLimit_ = minLimitBuilder_.build();
      }
      if (maxLimitBuilder_ == null) {
        result.maxLimit_ = maxLimit_;
      } else {
        result.maxLimit_ = maxLimitBuilder_.build();
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
      if (other instanceof opi_api.storage.v1.QosVolume) {
        return mergeFrom((opi_api.storage.v1.QosVolume)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.QosVolume other) {
      if (other == opi_api.storage.v1.QosVolume.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasVolumeId()) {
        mergeVolumeId(other.getVolumeId());
      }
      if (other.hasMinLimit()) {
        mergeMinLimit(other.getMinLimit());
      }
      if (other.hasMaxLimit()) {
        mergeMaxLimit(other.getMaxLimit());
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
      opi_api.storage.v1.QosVolume parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.QosVolume) e.getUnfinishedMessage();
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
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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

    private opi_api.common.v1.ObjectKey volumeId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> volumeIdBuilder_;
    /**
     * <pre>
     * Middleend/backend volume to apply QoS on
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey volume_id = 2;</code>
     * @return Whether the volumeId field is set.
     */
    public boolean hasVolumeId() {
      return volumeIdBuilder_ != null || volumeId_ != null;
    }
    /**
     * <pre>
     * Middleend/backend volume to apply QoS on
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey volume_id = 2;</code>
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
     * Middleend/backend volume to apply QoS on
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey volume_id = 2;</code>
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
     * Middleend/backend volume to apply QoS on
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey volume_id = 2;</code>
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
     * Middleend/backend volume to apply QoS on
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey volume_id = 2;</code>
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
     * Middleend/backend volume to apply QoS on
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey volume_id = 2;</code>
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
     * Middleend/backend volume to apply QoS on
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey volume_id = 2;</code>
     */
    public opi_api.common.v1.ObjectKey.Builder getVolumeIdBuilder() {
      
      onChanged();
      return getVolumeIdFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Middleend/backend volume to apply QoS on
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey volume_id = 2;</code>
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
     * Middleend/backend volume to apply QoS on
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey volume_id = 2;</code>
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

    private opi_api.storage.v1.QosLimit minLimit_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.QosLimit, opi_api.storage.v1.QosLimit.Builder, opi_api.storage.v1.QosLimitOrBuilder> minLimitBuilder_;
    /**
     * <code>.opi_api.storage.v1.QosLimit min_limit = 3;</code>
     * @return Whether the minLimit field is set.
     */
    public boolean hasMinLimit() {
      return minLimitBuilder_ != null || minLimit_ != null;
    }
    /**
     * <code>.opi_api.storage.v1.QosLimit min_limit = 3;</code>
     * @return The minLimit.
     */
    public opi_api.storage.v1.QosLimit getMinLimit() {
      if (minLimitBuilder_ == null) {
        return minLimit_ == null ? opi_api.storage.v1.QosLimit.getDefaultInstance() : minLimit_;
      } else {
        return minLimitBuilder_.getMessage();
      }
    }
    /**
     * <code>.opi_api.storage.v1.QosLimit min_limit = 3;</code>
     */
    public Builder setMinLimit(opi_api.storage.v1.QosLimit value) {
      if (minLimitBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        minLimit_ = value;
        onChanged();
      } else {
        minLimitBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.QosLimit min_limit = 3;</code>
     */
    public Builder setMinLimit(
        opi_api.storage.v1.QosLimit.Builder builderForValue) {
      if (minLimitBuilder_ == null) {
        minLimit_ = builderForValue.build();
        onChanged();
      } else {
        minLimitBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.QosLimit min_limit = 3;</code>
     */
    public Builder mergeMinLimit(opi_api.storage.v1.QosLimit value) {
      if (minLimitBuilder_ == null) {
        if (minLimit_ != null) {
          minLimit_ =
            opi_api.storage.v1.QosLimit.newBuilder(minLimit_).mergeFrom(value).buildPartial();
        } else {
          minLimit_ = value;
        }
        onChanged();
      } else {
        minLimitBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.QosLimit min_limit = 3;</code>
     */
    public Builder clearMinLimit() {
      if (minLimitBuilder_ == null) {
        minLimit_ = null;
        onChanged();
      } else {
        minLimit_ = null;
        minLimitBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.QosLimit min_limit = 3;</code>
     */
    public opi_api.storage.v1.QosLimit.Builder getMinLimitBuilder() {
      
      onChanged();
      return getMinLimitFieldBuilder().getBuilder();
    }
    /**
     * <code>.opi_api.storage.v1.QosLimit min_limit = 3;</code>
     */
    public opi_api.storage.v1.QosLimitOrBuilder getMinLimitOrBuilder() {
      if (minLimitBuilder_ != null) {
        return minLimitBuilder_.getMessageOrBuilder();
      } else {
        return minLimit_ == null ?
            opi_api.storage.v1.QosLimit.getDefaultInstance() : minLimit_;
      }
    }
    /**
     * <code>.opi_api.storage.v1.QosLimit min_limit = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.QosLimit, opi_api.storage.v1.QosLimit.Builder, opi_api.storage.v1.QosLimitOrBuilder> 
        getMinLimitFieldBuilder() {
      if (minLimitBuilder_ == null) {
        minLimitBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.storage.v1.QosLimit, opi_api.storage.v1.QosLimit.Builder, opi_api.storage.v1.QosLimitOrBuilder>(
                getMinLimit(),
                getParentForChildren(),
                isClean());
        minLimit_ = null;
      }
      return minLimitBuilder_;
    }

    private opi_api.storage.v1.QosLimit maxLimit_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.QosLimit, opi_api.storage.v1.QosLimit.Builder, opi_api.storage.v1.QosLimitOrBuilder> maxLimitBuilder_;
    /**
     * <code>.opi_api.storage.v1.QosLimit max_limit = 4;</code>
     * @return Whether the maxLimit field is set.
     */
    public boolean hasMaxLimit() {
      return maxLimitBuilder_ != null || maxLimit_ != null;
    }
    /**
     * <code>.opi_api.storage.v1.QosLimit max_limit = 4;</code>
     * @return The maxLimit.
     */
    public opi_api.storage.v1.QosLimit getMaxLimit() {
      if (maxLimitBuilder_ == null) {
        return maxLimit_ == null ? opi_api.storage.v1.QosLimit.getDefaultInstance() : maxLimit_;
      } else {
        return maxLimitBuilder_.getMessage();
      }
    }
    /**
     * <code>.opi_api.storage.v1.QosLimit max_limit = 4;</code>
     */
    public Builder setMaxLimit(opi_api.storage.v1.QosLimit value) {
      if (maxLimitBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        maxLimit_ = value;
        onChanged();
      } else {
        maxLimitBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.QosLimit max_limit = 4;</code>
     */
    public Builder setMaxLimit(
        opi_api.storage.v1.QosLimit.Builder builderForValue) {
      if (maxLimitBuilder_ == null) {
        maxLimit_ = builderForValue.build();
        onChanged();
      } else {
        maxLimitBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.QosLimit max_limit = 4;</code>
     */
    public Builder mergeMaxLimit(opi_api.storage.v1.QosLimit value) {
      if (maxLimitBuilder_ == null) {
        if (maxLimit_ != null) {
          maxLimit_ =
            opi_api.storage.v1.QosLimit.newBuilder(maxLimit_).mergeFrom(value).buildPartial();
        } else {
          maxLimit_ = value;
        }
        onChanged();
      } else {
        maxLimitBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.QosLimit max_limit = 4;</code>
     */
    public Builder clearMaxLimit() {
      if (maxLimitBuilder_ == null) {
        maxLimit_ = null;
        onChanged();
      } else {
        maxLimit_ = null;
        maxLimitBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.QosLimit max_limit = 4;</code>
     */
    public opi_api.storage.v1.QosLimit.Builder getMaxLimitBuilder() {
      
      onChanged();
      return getMaxLimitFieldBuilder().getBuilder();
    }
    /**
     * <code>.opi_api.storage.v1.QosLimit max_limit = 4;</code>
     */
    public opi_api.storage.v1.QosLimitOrBuilder getMaxLimitOrBuilder() {
      if (maxLimitBuilder_ != null) {
        return maxLimitBuilder_.getMessageOrBuilder();
      } else {
        return maxLimit_ == null ?
            opi_api.storage.v1.QosLimit.getDefaultInstance() : maxLimit_;
      }
    }
    /**
     * <code>.opi_api.storage.v1.QosLimit max_limit = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.QosLimit, opi_api.storage.v1.QosLimit.Builder, opi_api.storage.v1.QosLimitOrBuilder> 
        getMaxLimitFieldBuilder() {
      if (maxLimitBuilder_ == null) {
        maxLimitBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.storage.v1.QosLimit, opi_api.storage.v1.QosLimit.Builder, opi_api.storage.v1.QosLimitOrBuilder>(
                getMaxLimit(),
                getParentForChildren(),
                isClean());
        maxLimit_ = null;
      }
      return maxLimitBuilder_;
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.QosVolume)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.QosVolume)
  private static final opi_api.storage.v1.QosVolume DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.QosVolume();
  }

  public static opi_api.storage.v1.QosVolume getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QosVolume>
      PARSER = new com.google.protobuf.AbstractParser<QosVolume>() {
    @java.lang.Override
    public QosVolume parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QosVolume(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QosVolume> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QosVolume> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.QosVolume getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

