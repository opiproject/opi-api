// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: subnet.proto

package opi_api.network.cloud.v1alpha1;

/**
 * <pre>
 * operational status of the subnet, if any
 * </pre>
 *
 * Protobuf type {@code opi_api.network.cloud.v1alpha1.SubnetStatus}
 */
public final class SubnetStatus extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.cloud.v1alpha1.SubnetStatus)
    SubnetStatusOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SubnetStatus.newBuilder() to construct.
  private SubnetStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SubnetStatus() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SubnetStatus();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SubnetStatus(
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
          case 8: {

            hwIndex_ = input.readInt32();
            break;
          }
          case 16: {

            vnicCount_ = input.readInt32();
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
    return opi_api.network.cloud.v1alpha1.SubnetProto.internal_static_opi_api_network_cloud_v1alpha1_SubnetStatus_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.cloud.v1alpha1.SubnetProto.internal_static_opi_api_network_cloud_v1alpha1_SubnetStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.cloud.v1alpha1.SubnetStatus.class, opi_api.network.cloud.v1alpha1.SubnetStatus.Builder.class);
  }

  public static final int HW_INDEX_FIELD_NUMBER = 1;
  private int hwIndex_;
  /**
   * <pre>
   * subnet's hw handle
   * </pre>
   *
   * <code>int32 hw_index = 1;</code>
   * @return The hwIndex.
   */
  @java.lang.Override
  public int getHwIndex() {
    return hwIndex_;
  }

  public static final int VNIC_COUNT_FIELD_NUMBER = 2;
  private int vnicCount_;
  /**
   * <pre>
   * number of vnics in the subnet
   * </pre>
   *
   * <code>int32 vnic_count = 2;</code>
   * @return The vnicCount.
   */
  @java.lang.Override
  public int getVnicCount() {
    return vnicCount_;
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
    if (hwIndex_ != 0) {
      output.writeInt32(1, hwIndex_);
    }
    if (vnicCount_ != 0) {
      output.writeInt32(2, vnicCount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (hwIndex_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, hwIndex_);
    }
    if (vnicCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, vnicCount_);
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
    if (!(obj instanceof opi_api.network.cloud.v1alpha1.SubnetStatus)) {
      return super.equals(obj);
    }
    opi_api.network.cloud.v1alpha1.SubnetStatus other = (opi_api.network.cloud.v1alpha1.SubnetStatus) obj;

    if (getHwIndex()
        != other.getHwIndex()) return false;
    if (getVnicCount()
        != other.getVnicCount()) return false;
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
    hash = (37 * hash) + HW_INDEX_FIELD_NUMBER;
    hash = (53 * hash) + getHwIndex();
    hash = (37 * hash) + VNIC_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getVnicCount();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.cloud.v1alpha1.SubnetStatus parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.SubnetStatus parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.SubnetStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.SubnetStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.SubnetStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.SubnetStatus parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.SubnetStatus parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.SubnetStatus parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.SubnetStatus parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.SubnetStatus parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.SubnetStatus parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.SubnetStatus parseFrom(
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
  public static Builder newBuilder(opi_api.network.cloud.v1alpha1.SubnetStatus prototype) {
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
   * operational status of the subnet, if any
   * </pre>
   *
   * Protobuf type {@code opi_api.network.cloud.v1alpha1.SubnetStatus}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.cloud.v1alpha1.SubnetStatus)
      opi_api.network.cloud.v1alpha1.SubnetStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.cloud.v1alpha1.SubnetProto.internal_static_opi_api_network_cloud_v1alpha1_SubnetStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.cloud.v1alpha1.SubnetProto.internal_static_opi_api_network_cloud_v1alpha1_SubnetStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.cloud.v1alpha1.SubnetStatus.class, opi_api.network.cloud.v1alpha1.SubnetStatus.Builder.class);
    }

    // Construct using opi_api.network.cloud.v1alpha1.SubnetStatus.newBuilder()
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
      hwIndex_ = 0;

      vnicCount_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.cloud.v1alpha1.SubnetProto.internal_static_opi_api_network_cloud_v1alpha1_SubnetStatus_descriptor;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.SubnetStatus getDefaultInstanceForType() {
      return opi_api.network.cloud.v1alpha1.SubnetStatus.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.SubnetStatus build() {
      opi_api.network.cloud.v1alpha1.SubnetStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.SubnetStatus buildPartial() {
      opi_api.network.cloud.v1alpha1.SubnetStatus result = new opi_api.network.cloud.v1alpha1.SubnetStatus(this);
      result.hwIndex_ = hwIndex_;
      result.vnicCount_ = vnicCount_;
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
      if (other instanceof opi_api.network.cloud.v1alpha1.SubnetStatus) {
        return mergeFrom((opi_api.network.cloud.v1alpha1.SubnetStatus)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.cloud.v1alpha1.SubnetStatus other) {
      if (other == opi_api.network.cloud.v1alpha1.SubnetStatus.getDefaultInstance()) return this;
      if (other.getHwIndex() != 0) {
        setHwIndex(other.getHwIndex());
      }
      if (other.getVnicCount() != 0) {
        setVnicCount(other.getVnicCount());
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
      opi_api.network.cloud.v1alpha1.SubnetStatus parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.cloud.v1alpha1.SubnetStatus) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int hwIndex_ ;
    /**
     * <pre>
     * subnet's hw handle
     * </pre>
     *
     * <code>int32 hw_index = 1;</code>
     * @return The hwIndex.
     */
    @java.lang.Override
    public int getHwIndex() {
      return hwIndex_;
    }
    /**
     * <pre>
     * subnet's hw handle
     * </pre>
     *
     * <code>int32 hw_index = 1;</code>
     * @param value The hwIndex to set.
     * @return This builder for chaining.
     */
    public Builder setHwIndex(int value) {
      
      hwIndex_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * subnet's hw handle
     * </pre>
     *
     * <code>int32 hw_index = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearHwIndex() {
      
      hwIndex_ = 0;
      onChanged();
      return this;
    }

    private int vnicCount_ ;
    /**
     * <pre>
     * number of vnics in the subnet
     * </pre>
     *
     * <code>int32 vnic_count = 2;</code>
     * @return The vnicCount.
     */
    @java.lang.Override
    public int getVnicCount() {
      return vnicCount_;
    }
    /**
     * <pre>
     * number of vnics in the subnet
     * </pre>
     *
     * <code>int32 vnic_count = 2;</code>
     * @param value The vnicCount to set.
     * @return This builder for chaining.
     */
    public Builder setVnicCount(int value) {
      
      vnicCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * number of vnics in the subnet
     * </pre>
     *
     * <code>int32 vnic_count = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearVnicCount() {
      
      vnicCount_ = 0;
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


    // @@protoc_insertion_point(builder_scope:opi_api.network.cloud.v1alpha1.SubnetStatus)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.SubnetStatus)
  private static final opi_api.network.cloud.v1alpha1.SubnetStatus DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.cloud.v1alpha1.SubnetStatus();
  }

  public static opi_api.network.cloud.v1alpha1.SubnetStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubnetStatus>
      PARSER = new com.google.protobuf.AbstractParser<SubnetStatus>() {
    @java.lang.Override
    public SubnetStatus parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SubnetStatus(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SubnetStatus> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubnetStatus> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.SubnetStatus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

