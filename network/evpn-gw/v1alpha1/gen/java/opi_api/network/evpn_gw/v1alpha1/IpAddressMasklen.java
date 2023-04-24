// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: l3_xpu_infra_mgr.proto

package opi_api.network.evpn_gw.v1alpha1;

/**
 * <pre>
 * IpAddressMasklen structure
 * </pre>
 *
 * Protobuf type {@code opi_api.network.evpn_gw.v1alpha1.IpAddressMasklen}
 */
public final class IpAddressMasklen extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.evpn_gw.v1alpha1.IpAddressMasklen)
    IpAddressMasklenOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IpAddressMasklen.newBuilder() to construct.
  private IpAddressMasklen(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IpAddressMasklen() {
    ipAddr_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IpAddressMasklen();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IpAddressMasklen(
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

            ipAddr_ = s;
            break;
          }
          case 16: {

            len_ = input.readUInt32();
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
    return opi_api.network.evpn_gw.v1alpha1.L3XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_IpAddressMasklen_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.evpn_gw.v1alpha1.L3XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_IpAddressMasklen_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.evpn_gw.v1alpha1.IpAddressMasklen.class, opi_api.network.evpn_gw.v1alpha1.IpAddressMasklen.Builder.class);
  }

  public static final int IP_ADDR_FIELD_NUMBER = 1;
  private volatile java.lang.Object ipAddr_;
  /**
   * <pre>
   * IP address
   * </pre>
   *
   * <code>string ip_addr = 1;</code>
   * @return The ipAddr.
   */
  @java.lang.Override
  public java.lang.String getIpAddr() {
    java.lang.Object ref = ipAddr_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ipAddr_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * IP address
   * </pre>
   *
   * <code>string ip_addr = 1;</code>
   * @return The bytes for ipAddr.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIpAddrBytes() {
    java.lang.Object ref = ipAddr_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ipAddr_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LEN_FIELD_NUMBER = 2;
  private int len_;
  /**
   * <pre>
   * Length of the subnet prefix mask
   * (-- api-linter: core::0141::forbidden-types=disabled
   *     aip.dev/not-precedent: subnet mask cannot be negative number. --)
   * </pre>
   *
   * <code>uint32 len = 2;</code>
   * @return The len.
   */
  @java.lang.Override
  public int getLen() {
    return len_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ipAddr_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ipAddr_);
    }
    if (len_ != 0) {
      output.writeUInt32(2, len_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ipAddr_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, ipAddr_);
    }
    if (len_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, len_);
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
    if (!(obj instanceof opi_api.network.evpn_gw.v1alpha1.IpAddressMasklen)) {
      return super.equals(obj);
    }
    opi_api.network.evpn_gw.v1alpha1.IpAddressMasklen other = (opi_api.network.evpn_gw.v1alpha1.IpAddressMasklen) obj;

    if (!getIpAddr()
        .equals(other.getIpAddr())) return false;
    if (getLen()
        != other.getLen()) return false;
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
    hash = (37 * hash) + IP_ADDR_FIELD_NUMBER;
    hash = (53 * hash) + getIpAddr().hashCode();
    hash = (37 * hash) + LEN_FIELD_NUMBER;
    hash = (53 * hash) + getLen();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.evpn_gw.v1alpha1.IpAddressMasklen parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.evpn_gw.v1alpha1.IpAddressMasklen parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.IpAddressMasklen parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.evpn_gw.v1alpha1.IpAddressMasklen parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.IpAddressMasklen parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.evpn_gw.v1alpha1.IpAddressMasklen parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.IpAddressMasklen parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.evpn_gw.v1alpha1.IpAddressMasklen parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.IpAddressMasklen parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.evpn_gw.v1alpha1.IpAddressMasklen parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.IpAddressMasklen parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.evpn_gw.v1alpha1.IpAddressMasklen parseFrom(
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
  public static Builder newBuilder(opi_api.network.evpn_gw.v1alpha1.IpAddressMasklen prototype) {
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
   * IpAddressMasklen structure
   * </pre>
   *
   * Protobuf type {@code opi_api.network.evpn_gw.v1alpha1.IpAddressMasklen}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.evpn_gw.v1alpha1.IpAddressMasklen)
      opi_api.network.evpn_gw.v1alpha1.IpAddressMasklenOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.evpn_gw.v1alpha1.L3XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_IpAddressMasklen_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.evpn_gw.v1alpha1.L3XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_IpAddressMasklen_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.evpn_gw.v1alpha1.IpAddressMasklen.class, opi_api.network.evpn_gw.v1alpha1.IpAddressMasklen.Builder.class);
    }

    // Construct using opi_api.network.evpn_gw.v1alpha1.IpAddressMasklen.newBuilder()
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
      ipAddr_ = "";

      len_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.evpn_gw.v1alpha1.L3XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_IpAddressMasklen_descriptor;
    }

    @java.lang.Override
    public opi_api.network.evpn_gw.v1alpha1.IpAddressMasklen getDefaultInstanceForType() {
      return opi_api.network.evpn_gw.v1alpha1.IpAddressMasklen.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.evpn_gw.v1alpha1.IpAddressMasklen build() {
      opi_api.network.evpn_gw.v1alpha1.IpAddressMasklen result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.evpn_gw.v1alpha1.IpAddressMasklen buildPartial() {
      opi_api.network.evpn_gw.v1alpha1.IpAddressMasklen result = new opi_api.network.evpn_gw.v1alpha1.IpAddressMasklen(this);
      result.ipAddr_ = ipAddr_;
      result.len_ = len_;
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
      if (other instanceof opi_api.network.evpn_gw.v1alpha1.IpAddressMasklen) {
        return mergeFrom((opi_api.network.evpn_gw.v1alpha1.IpAddressMasklen)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.evpn_gw.v1alpha1.IpAddressMasklen other) {
      if (other == opi_api.network.evpn_gw.v1alpha1.IpAddressMasklen.getDefaultInstance()) return this;
      if (!other.getIpAddr().isEmpty()) {
        ipAddr_ = other.ipAddr_;
        onChanged();
      }
      if (other.getLen() != 0) {
        setLen(other.getLen());
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
      opi_api.network.evpn_gw.v1alpha1.IpAddressMasklen parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.evpn_gw.v1alpha1.IpAddressMasklen) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object ipAddr_ = "";
    /**
     * <pre>
     * IP address
     * </pre>
     *
     * <code>string ip_addr = 1;</code>
     * @return The ipAddr.
     */
    public java.lang.String getIpAddr() {
      java.lang.Object ref = ipAddr_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ipAddr_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * IP address
     * </pre>
     *
     * <code>string ip_addr = 1;</code>
     * @return The bytes for ipAddr.
     */
    public com.google.protobuf.ByteString
        getIpAddrBytes() {
      java.lang.Object ref = ipAddr_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ipAddr_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * IP address
     * </pre>
     *
     * <code>string ip_addr = 1;</code>
     * @param value The ipAddr to set.
     * @return This builder for chaining.
     */
    public Builder setIpAddr(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ipAddr_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * IP address
     * </pre>
     *
     * <code>string ip_addr = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIpAddr() {
      
      ipAddr_ = getDefaultInstance().getIpAddr();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * IP address
     * </pre>
     *
     * <code>string ip_addr = 1;</code>
     * @param value The bytes for ipAddr to set.
     * @return This builder for chaining.
     */
    public Builder setIpAddrBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ipAddr_ = value;
      onChanged();
      return this;
    }

    private int len_ ;
    /**
     * <pre>
     * Length of the subnet prefix mask
     * (-- api-linter: core::0141::forbidden-types=disabled
     *     aip.dev/not-precedent: subnet mask cannot be negative number. --)
     * </pre>
     *
     * <code>uint32 len = 2;</code>
     * @return The len.
     */
    @java.lang.Override
    public int getLen() {
      return len_;
    }
    /**
     * <pre>
     * Length of the subnet prefix mask
     * (-- api-linter: core::0141::forbidden-types=disabled
     *     aip.dev/not-precedent: subnet mask cannot be negative number. --)
     * </pre>
     *
     * <code>uint32 len = 2;</code>
     * @param value The len to set.
     * @return This builder for chaining.
     */
    public Builder setLen(int value) {
      
      len_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Length of the subnet prefix mask
     * (-- api-linter: core::0141::forbidden-types=disabled
     *     aip.dev/not-precedent: subnet mask cannot be negative number. --)
     * </pre>
     *
     * <code>uint32 len = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLen() {
      
      len_ = 0;
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


    // @@protoc_insertion_point(builder_scope:opi_api.network.evpn_gw.v1alpha1.IpAddressMasklen)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.evpn_gw.v1alpha1.IpAddressMasklen)
  private static final opi_api.network.evpn_gw.v1alpha1.IpAddressMasklen DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.evpn_gw.v1alpha1.IpAddressMasklen();
  }

  public static opi_api.network.evpn_gw.v1alpha1.IpAddressMasklen getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IpAddressMasklen>
      PARSER = new com.google.protobuf.AbstractParser<IpAddressMasklen>() {
    @java.lang.Override
    public IpAddressMasklen parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IpAddressMasklen(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IpAddressMasklen> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IpAddressMasklen> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.evpn_gw.v1alpha1.IpAddressMasklen getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

