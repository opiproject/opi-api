// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: interface.proto

package opi_api.network.cloud.v1alpha1;

/**
 * <pre>
 * Inband control interface configuration
 * </pre>
 *
 * Protobuf type {@code opi_api.network.cloud.v1alpha1.ControlIfSpec}
 */
public final class ControlIfSpec extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.cloud.v1alpha1.ControlIfSpec)
    ControlIfSpecOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ControlIfSpec.newBuilder() to construct.
  private ControlIfSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ControlIfSpec() {
    macAddress_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ControlIfSpec();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ControlIfSpec(
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
            opi_api.network.opinetcommon.v1alpha1.IPPrefix.Builder subBuilder = null;
            if (prefix_ != null) {
              subBuilder = prefix_.toBuilder();
            }
            prefix_ = input.readMessage(opi_api.network.opinetcommon.v1alpha1.IPPrefix.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(prefix_);
              prefix_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {

            macAddress_ = input.readBytes();
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
    return opi_api.network.cloud.v1alpha1.InterfaceProto.internal_static_opi_api_network_cloud_v1alpha1_ControlIfSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.cloud.v1alpha1.InterfaceProto.internal_static_opi_api_network_cloud_v1alpha1_ControlIfSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.cloud.v1alpha1.ControlIfSpec.class, opi_api.network.cloud.v1alpha1.ControlIfSpec.Builder.class);
  }

  public static final int PREFIX_FIELD_NUMBER = 1;
  private opi_api.network.opinetcommon.v1alpha1.IPPrefix prefix_;
  /**
   * <pre>
   * IP address hosted on the inband control interface
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix prefix = 1;</code>
   * @return Whether the prefix field is set.
   */
  @java.lang.Override
  public boolean hasPrefix() {
    return prefix_ != null;
  }
  /**
   * <pre>
   * IP address hosted on the inband control interface
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix prefix = 1;</code>
   * @return The prefix.
   */
  @java.lang.Override
  public opi_api.network.opinetcommon.v1alpha1.IPPrefix getPrefix() {
    return prefix_ == null ? opi_api.network.opinetcommon.v1alpha1.IPPrefix.getDefaultInstance() : prefix_;
  }
  /**
   * <pre>
   * IP address hosted on the inband control interface
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix prefix = 1;</code>
   */
  @java.lang.Override
  public opi_api.network.opinetcommon.v1alpha1.IPPrefixOrBuilder getPrefixOrBuilder() {
    return getPrefix();
  }

  public static final int MAC_ADDRESS_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString macAddress_;
  /**
   * <pre>
   * mac address of the interface
   * </pre>
   *
   * <code>bytes mac_address = 2;</code>
   * @return The macAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMacAddress() {
    return macAddress_;
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
    if (prefix_ != null) {
      output.writeMessage(1, getPrefix());
    }
    if (!macAddress_.isEmpty()) {
      output.writeBytes(2, macAddress_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (prefix_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPrefix());
    }
    if (!macAddress_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, macAddress_);
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
    if (!(obj instanceof opi_api.network.cloud.v1alpha1.ControlIfSpec)) {
      return super.equals(obj);
    }
    opi_api.network.cloud.v1alpha1.ControlIfSpec other = (opi_api.network.cloud.v1alpha1.ControlIfSpec) obj;

    if (hasPrefix() != other.hasPrefix()) return false;
    if (hasPrefix()) {
      if (!getPrefix()
          .equals(other.getPrefix())) return false;
    }
    if (!getMacAddress()
        .equals(other.getMacAddress())) return false;
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
    if (hasPrefix()) {
      hash = (37 * hash) + PREFIX_FIELD_NUMBER;
      hash = (53 * hash) + getPrefix().hashCode();
    }
    hash = (37 * hash) + MAC_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getMacAddress().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.cloud.v1alpha1.ControlIfSpec parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.ControlIfSpec parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.ControlIfSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.ControlIfSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.ControlIfSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.ControlIfSpec parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.ControlIfSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.ControlIfSpec parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.ControlIfSpec parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.ControlIfSpec parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.ControlIfSpec parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.ControlIfSpec parseFrom(
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
  public static Builder newBuilder(opi_api.network.cloud.v1alpha1.ControlIfSpec prototype) {
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
   * Inband control interface configuration
   * </pre>
   *
   * Protobuf type {@code opi_api.network.cloud.v1alpha1.ControlIfSpec}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.cloud.v1alpha1.ControlIfSpec)
      opi_api.network.cloud.v1alpha1.ControlIfSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.cloud.v1alpha1.InterfaceProto.internal_static_opi_api_network_cloud_v1alpha1_ControlIfSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.cloud.v1alpha1.InterfaceProto.internal_static_opi_api_network_cloud_v1alpha1_ControlIfSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.cloud.v1alpha1.ControlIfSpec.class, opi_api.network.cloud.v1alpha1.ControlIfSpec.Builder.class);
    }

    // Construct using opi_api.network.cloud.v1alpha1.ControlIfSpec.newBuilder()
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
      if (prefixBuilder_ == null) {
        prefix_ = null;
      } else {
        prefix_ = null;
        prefixBuilder_ = null;
      }
      macAddress_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.cloud.v1alpha1.InterfaceProto.internal_static_opi_api_network_cloud_v1alpha1_ControlIfSpec_descriptor;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.ControlIfSpec getDefaultInstanceForType() {
      return opi_api.network.cloud.v1alpha1.ControlIfSpec.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.ControlIfSpec build() {
      opi_api.network.cloud.v1alpha1.ControlIfSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.ControlIfSpec buildPartial() {
      opi_api.network.cloud.v1alpha1.ControlIfSpec result = new opi_api.network.cloud.v1alpha1.ControlIfSpec(this);
      if (prefixBuilder_ == null) {
        result.prefix_ = prefix_;
      } else {
        result.prefix_ = prefixBuilder_.build();
      }
      result.macAddress_ = macAddress_;
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
      if (other instanceof opi_api.network.cloud.v1alpha1.ControlIfSpec) {
        return mergeFrom((opi_api.network.cloud.v1alpha1.ControlIfSpec)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.cloud.v1alpha1.ControlIfSpec other) {
      if (other == opi_api.network.cloud.v1alpha1.ControlIfSpec.getDefaultInstance()) return this;
      if (other.hasPrefix()) {
        mergePrefix(other.getPrefix());
      }
      if (other.getMacAddress() != com.google.protobuf.ByteString.EMPTY) {
        setMacAddress(other.getMacAddress());
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
      opi_api.network.cloud.v1alpha1.ControlIfSpec parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.cloud.v1alpha1.ControlIfSpec) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private opi_api.network.opinetcommon.v1alpha1.IPPrefix prefix_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.opinetcommon.v1alpha1.IPPrefix, opi_api.network.opinetcommon.v1alpha1.IPPrefix.Builder, opi_api.network.opinetcommon.v1alpha1.IPPrefixOrBuilder> prefixBuilder_;
    /**
     * <pre>
     * IP address hosted on the inband control interface
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix prefix = 1;</code>
     * @return Whether the prefix field is set.
     */
    public boolean hasPrefix() {
      return prefixBuilder_ != null || prefix_ != null;
    }
    /**
     * <pre>
     * IP address hosted on the inband control interface
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix prefix = 1;</code>
     * @return The prefix.
     */
    public opi_api.network.opinetcommon.v1alpha1.IPPrefix getPrefix() {
      if (prefixBuilder_ == null) {
        return prefix_ == null ? opi_api.network.opinetcommon.v1alpha1.IPPrefix.getDefaultInstance() : prefix_;
      } else {
        return prefixBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * IP address hosted on the inband control interface
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix prefix = 1;</code>
     */
    public Builder setPrefix(opi_api.network.opinetcommon.v1alpha1.IPPrefix value) {
      if (prefixBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        prefix_ = value;
        onChanged();
      } else {
        prefixBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * IP address hosted on the inband control interface
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix prefix = 1;</code>
     */
    public Builder setPrefix(
        opi_api.network.opinetcommon.v1alpha1.IPPrefix.Builder builderForValue) {
      if (prefixBuilder_ == null) {
        prefix_ = builderForValue.build();
        onChanged();
      } else {
        prefixBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * IP address hosted on the inband control interface
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix prefix = 1;</code>
     */
    public Builder mergePrefix(opi_api.network.opinetcommon.v1alpha1.IPPrefix value) {
      if (prefixBuilder_ == null) {
        if (prefix_ != null) {
          prefix_ =
            opi_api.network.opinetcommon.v1alpha1.IPPrefix.newBuilder(prefix_).mergeFrom(value).buildPartial();
        } else {
          prefix_ = value;
        }
        onChanged();
      } else {
        prefixBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * IP address hosted on the inband control interface
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix prefix = 1;</code>
     */
    public Builder clearPrefix() {
      if (prefixBuilder_ == null) {
        prefix_ = null;
        onChanged();
      } else {
        prefix_ = null;
        prefixBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * IP address hosted on the inband control interface
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix prefix = 1;</code>
     */
    public opi_api.network.opinetcommon.v1alpha1.IPPrefix.Builder getPrefixBuilder() {
      
      onChanged();
      return getPrefixFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * IP address hosted on the inband control interface
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix prefix = 1;</code>
     */
    public opi_api.network.opinetcommon.v1alpha1.IPPrefixOrBuilder getPrefixOrBuilder() {
      if (prefixBuilder_ != null) {
        return prefixBuilder_.getMessageOrBuilder();
      } else {
        return prefix_ == null ?
            opi_api.network.opinetcommon.v1alpha1.IPPrefix.getDefaultInstance() : prefix_;
      }
    }
    /**
     * <pre>
     * IP address hosted on the inband control interface
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix prefix = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.opinetcommon.v1alpha1.IPPrefix, opi_api.network.opinetcommon.v1alpha1.IPPrefix.Builder, opi_api.network.opinetcommon.v1alpha1.IPPrefixOrBuilder> 
        getPrefixFieldBuilder() {
      if (prefixBuilder_ == null) {
        prefixBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.network.opinetcommon.v1alpha1.IPPrefix, opi_api.network.opinetcommon.v1alpha1.IPPrefix.Builder, opi_api.network.opinetcommon.v1alpha1.IPPrefixOrBuilder>(
                getPrefix(),
                getParentForChildren(),
                isClean());
        prefix_ = null;
      }
      return prefixBuilder_;
    }

    private com.google.protobuf.ByteString macAddress_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * mac address of the interface
     * </pre>
     *
     * <code>bytes mac_address = 2;</code>
     * @return The macAddress.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getMacAddress() {
      return macAddress_;
    }
    /**
     * <pre>
     * mac address of the interface
     * </pre>
     *
     * <code>bytes mac_address = 2;</code>
     * @param value The macAddress to set.
     * @return This builder for chaining.
     */
    public Builder setMacAddress(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      macAddress_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * mac address of the interface
     * </pre>
     *
     * <code>bytes mac_address = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMacAddress() {
      
      macAddress_ = getDefaultInstance().getMacAddress();
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


    // @@protoc_insertion_point(builder_scope:opi_api.network.cloud.v1alpha1.ControlIfSpec)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.ControlIfSpec)
  private static final opi_api.network.cloud.v1alpha1.ControlIfSpec DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.cloud.v1alpha1.ControlIfSpec();
  }

  public static opi_api.network.cloud.v1alpha1.ControlIfSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ControlIfSpec>
      PARSER = new com.google.protobuf.AbstractParser<ControlIfSpec>() {
    @java.lang.Override
    public ControlIfSpec parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ControlIfSpec(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ControlIfSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ControlIfSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.ControlIfSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

