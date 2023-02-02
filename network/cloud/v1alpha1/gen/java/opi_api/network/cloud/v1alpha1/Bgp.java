// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bgp.proto

package opi_api.network.cloud.v1alpha1;

/**
 * <pre>
 * BGP object
 * </pre>
 *
 * Protobuf type {@code opi_api.network.cloud.v1alpha1.Bgp}
 */
public final class Bgp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.cloud.v1alpha1.Bgp)
    BgpOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Bgp.newBuilder() to construct.
  private Bgp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Bgp() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Bgp();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Bgp(
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
            opi_api.network.cloud.v1alpha1.BgpSpec.Builder subBuilder = null;
            if (spec_ != null) {
              subBuilder = spec_.toBuilder();
            }
            spec_ = input.readMessage(opi_api.network.cloud.v1alpha1.BgpSpec.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(spec_);
              spec_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            opi_api.network.cloud.v1alpha1.BgpStatus.Builder subBuilder = null;
            if (status_ != null) {
              subBuilder = status_.toBuilder();
            }
            status_ = input.readMessage(opi_api.network.cloud.v1alpha1.BgpStatus.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(status_);
              status_ = subBuilder.buildPartial();
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
    return opi_api.network.cloud.v1alpha1.BGPProto.internal_static_opi_api_network_cloud_v1alpha1_Bgp_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.cloud.v1alpha1.BGPProto.internal_static_opi_api_network_cloud_v1alpha1_Bgp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.cloud.v1alpha1.Bgp.class, opi_api.network.cloud.v1alpha1.Bgp.Builder.class);
  }

  public static final int SPEC_FIELD_NUMBER = 1;
  private opi_api.network.cloud.v1alpha1.BgpSpec spec_;
  /**
   * <pre>
   * BGP Configuration
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.BgpSpec spec = 1;</code>
   * @return Whether the spec field is set.
   */
  @java.lang.Override
  public boolean hasSpec() {
    return spec_ != null;
  }
  /**
   * <pre>
   * BGP Configuration
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.BgpSpec spec = 1;</code>
   * @return The spec.
   */
  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.BgpSpec getSpec() {
    return spec_ == null ? opi_api.network.cloud.v1alpha1.BgpSpec.getDefaultInstance() : spec_;
  }
  /**
   * <pre>
   * BGP Configuration
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.BgpSpec spec = 1;</code>
   */
  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.BgpSpecOrBuilder getSpecOrBuilder() {
    return getSpec();
  }

  public static final int STATUS_FIELD_NUMBER = 2;
  private opi_api.network.cloud.v1alpha1.BgpStatus status_;
  /**
   * <pre>
   * BGP Status
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.BgpStatus status = 2;</code>
   * @return Whether the status field is set.
   */
  @java.lang.Override
  public boolean hasStatus() {
    return status_ != null;
  }
  /**
   * <pre>
   * BGP Status
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.BgpStatus status = 2;</code>
   * @return The status.
   */
  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.BgpStatus getStatus() {
    return status_ == null ? opi_api.network.cloud.v1alpha1.BgpStatus.getDefaultInstance() : status_;
  }
  /**
   * <pre>
   * BGP Status
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.BgpStatus status = 2;</code>
   */
  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.BgpStatusOrBuilder getStatusOrBuilder() {
    return getStatus();
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
    if (spec_ != null) {
      output.writeMessage(1, getSpec());
    }
    if (status_ != null) {
      output.writeMessage(2, getStatus());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (spec_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSpec());
    }
    if (status_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getStatus());
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
    if (!(obj instanceof opi_api.network.cloud.v1alpha1.Bgp)) {
      return super.equals(obj);
    }
    opi_api.network.cloud.v1alpha1.Bgp other = (opi_api.network.cloud.v1alpha1.Bgp) obj;

    if (hasSpec() != other.hasSpec()) return false;
    if (hasSpec()) {
      if (!getSpec()
          .equals(other.getSpec())) return false;
    }
    if (hasStatus() != other.hasStatus()) return false;
    if (hasStatus()) {
      if (!getStatus()
          .equals(other.getStatus())) return false;
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
    if (hasSpec()) {
      hash = (37 * hash) + SPEC_FIELD_NUMBER;
      hash = (53 * hash) + getSpec().hashCode();
    }
    if (hasStatus()) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatus().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.cloud.v1alpha1.Bgp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.Bgp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.Bgp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.Bgp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.Bgp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.Bgp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.Bgp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.Bgp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.Bgp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.Bgp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.Bgp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.Bgp parseFrom(
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
  public static Builder newBuilder(opi_api.network.cloud.v1alpha1.Bgp prototype) {
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
   * BGP object
   * </pre>
   *
   * Protobuf type {@code opi_api.network.cloud.v1alpha1.Bgp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.cloud.v1alpha1.Bgp)
      opi_api.network.cloud.v1alpha1.BgpOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.cloud.v1alpha1.BGPProto.internal_static_opi_api_network_cloud_v1alpha1_Bgp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.cloud.v1alpha1.BGPProto.internal_static_opi_api_network_cloud_v1alpha1_Bgp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.cloud.v1alpha1.Bgp.class, opi_api.network.cloud.v1alpha1.Bgp.Builder.class);
    }

    // Construct using opi_api.network.cloud.v1alpha1.Bgp.newBuilder()
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
      if (specBuilder_ == null) {
        spec_ = null;
      } else {
        spec_ = null;
        specBuilder_ = null;
      }
      if (statusBuilder_ == null) {
        status_ = null;
      } else {
        status_ = null;
        statusBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.cloud.v1alpha1.BGPProto.internal_static_opi_api_network_cloud_v1alpha1_Bgp_descriptor;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.Bgp getDefaultInstanceForType() {
      return opi_api.network.cloud.v1alpha1.Bgp.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.Bgp build() {
      opi_api.network.cloud.v1alpha1.Bgp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.Bgp buildPartial() {
      opi_api.network.cloud.v1alpha1.Bgp result = new opi_api.network.cloud.v1alpha1.Bgp(this);
      if (specBuilder_ == null) {
        result.spec_ = spec_;
      } else {
        result.spec_ = specBuilder_.build();
      }
      if (statusBuilder_ == null) {
        result.status_ = status_;
      } else {
        result.status_ = statusBuilder_.build();
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
      if (other instanceof opi_api.network.cloud.v1alpha1.Bgp) {
        return mergeFrom((opi_api.network.cloud.v1alpha1.Bgp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.cloud.v1alpha1.Bgp other) {
      if (other == opi_api.network.cloud.v1alpha1.Bgp.getDefaultInstance()) return this;
      if (other.hasSpec()) {
        mergeSpec(other.getSpec());
      }
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
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
      opi_api.network.cloud.v1alpha1.Bgp parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.cloud.v1alpha1.Bgp) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private opi_api.network.cloud.v1alpha1.BgpSpec spec_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.cloud.v1alpha1.BgpSpec, opi_api.network.cloud.v1alpha1.BgpSpec.Builder, opi_api.network.cloud.v1alpha1.BgpSpecOrBuilder> specBuilder_;
    /**
     * <pre>
     * BGP Configuration
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BgpSpec spec = 1;</code>
     * @return Whether the spec field is set.
     */
    public boolean hasSpec() {
      return specBuilder_ != null || spec_ != null;
    }
    /**
     * <pre>
     * BGP Configuration
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BgpSpec spec = 1;</code>
     * @return The spec.
     */
    public opi_api.network.cloud.v1alpha1.BgpSpec getSpec() {
      if (specBuilder_ == null) {
        return spec_ == null ? opi_api.network.cloud.v1alpha1.BgpSpec.getDefaultInstance() : spec_;
      } else {
        return specBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * BGP Configuration
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BgpSpec spec = 1;</code>
     */
    public Builder setSpec(opi_api.network.cloud.v1alpha1.BgpSpec value) {
      if (specBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        spec_ = value;
        onChanged();
      } else {
        specBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * BGP Configuration
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BgpSpec spec = 1;</code>
     */
    public Builder setSpec(
        opi_api.network.cloud.v1alpha1.BgpSpec.Builder builderForValue) {
      if (specBuilder_ == null) {
        spec_ = builderForValue.build();
        onChanged();
      } else {
        specBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * BGP Configuration
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BgpSpec spec = 1;</code>
     */
    public Builder mergeSpec(opi_api.network.cloud.v1alpha1.BgpSpec value) {
      if (specBuilder_ == null) {
        if (spec_ != null) {
          spec_ =
            opi_api.network.cloud.v1alpha1.BgpSpec.newBuilder(spec_).mergeFrom(value).buildPartial();
        } else {
          spec_ = value;
        }
        onChanged();
      } else {
        specBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * BGP Configuration
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BgpSpec spec = 1;</code>
     */
    public Builder clearSpec() {
      if (specBuilder_ == null) {
        spec_ = null;
        onChanged();
      } else {
        spec_ = null;
        specBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * BGP Configuration
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BgpSpec spec = 1;</code>
     */
    public opi_api.network.cloud.v1alpha1.BgpSpec.Builder getSpecBuilder() {
      
      onChanged();
      return getSpecFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * BGP Configuration
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BgpSpec spec = 1;</code>
     */
    public opi_api.network.cloud.v1alpha1.BgpSpecOrBuilder getSpecOrBuilder() {
      if (specBuilder_ != null) {
        return specBuilder_.getMessageOrBuilder();
      } else {
        return spec_ == null ?
            opi_api.network.cloud.v1alpha1.BgpSpec.getDefaultInstance() : spec_;
      }
    }
    /**
     * <pre>
     * BGP Configuration
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BgpSpec spec = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.cloud.v1alpha1.BgpSpec, opi_api.network.cloud.v1alpha1.BgpSpec.Builder, opi_api.network.cloud.v1alpha1.BgpSpecOrBuilder> 
        getSpecFieldBuilder() {
      if (specBuilder_ == null) {
        specBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.network.cloud.v1alpha1.BgpSpec, opi_api.network.cloud.v1alpha1.BgpSpec.Builder, opi_api.network.cloud.v1alpha1.BgpSpecOrBuilder>(
                getSpec(),
                getParentForChildren(),
                isClean());
        spec_ = null;
      }
      return specBuilder_;
    }

    private opi_api.network.cloud.v1alpha1.BgpStatus status_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.cloud.v1alpha1.BgpStatus, opi_api.network.cloud.v1alpha1.BgpStatus.Builder, opi_api.network.cloud.v1alpha1.BgpStatusOrBuilder> statusBuilder_;
    /**
     * <pre>
     * BGP Status
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BgpStatus status = 2;</code>
     * @return Whether the status field is set.
     */
    public boolean hasStatus() {
      return statusBuilder_ != null || status_ != null;
    }
    /**
     * <pre>
     * BGP Status
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BgpStatus status = 2;</code>
     * @return The status.
     */
    public opi_api.network.cloud.v1alpha1.BgpStatus getStatus() {
      if (statusBuilder_ == null) {
        return status_ == null ? opi_api.network.cloud.v1alpha1.BgpStatus.getDefaultInstance() : status_;
      } else {
        return statusBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * BGP Status
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BgpStatus status = 2;</code>
     */
    public Builder setStatus(opi_api.network.cloud.v1alpha1.BgpStatus value) {
      if (statusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        status_ = value;
        onChanged();
      } else {
        statusBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * BGP Status
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BgpStatus status = 2;</code>
     */
    public Builder setStatus(
        opi_api.network.cloud.v1alpha1.BgpStatus.Builder builderForValue) {
      if (statusBuilder_ == null) {
        status_ = builderForValue.build();
        onChanged();
      } else {
        statusBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * BGP Status
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BgpStatus status = 2;</code>
     */
    public Builder mergeStatus(opi_api.network.cloud.v1alpha1.BgpStatus value) {
      if (statusBuilder_ == null) {
        if (status_ != null) {
          status_ =
            opi_api.network.cloud.v1alpha1.BgpStatus.newBuilder(status_).mergeFrom(value).buildPartial();
        } else {
          status_ = value;
        }
        onChanged();
      } else {
        statusBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * BGP Status
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BgpStatus status = 2;</code>
     */
    public Builder clearStatus() {
      if (statusBuilder_ == null) {
        status_ = null;
        onChanged();
      } else {
        status_ = null;
        statusBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * BGP Status
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BgpStatus status = 2;</code>
     */
    public opi_api.network.cloud.v1alpha1.BgpStatus.Builder getStatusBuilder() {
      
      onChanged();
      return getStatusFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * BGP Status
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BgpStatus status = 2;</code>
     */
    public opi_api.network.cloud.v1alpha1.BgpStatusOrBuilder getStatusOrBuilder() {
      if (statusBuilder_ != null) {
        return statusBuilder_.getMessageOrBuilder();
      } else {
        return status_ == null ?
            opi_api.network.cloud.v1alpha1.BgpStatus.getDefaultInstance() : status_;
      }
    }
    /**
     * <pre>
     * BGP Status
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.BgpStatus status = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.cloud.v1alpha1.BgpStatus, opi_api.network.cloud.v1alpha1.BgpStatus.Builder, opi_api.network.cloud.v1alpha1.BgpStatusOrBuilder> 
        getStatusFieldBuilder() {
      if (statusBuilder_ == null) {
        statusBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.network.cloud.v1alpha1.BgpStatus, opi_api.network.cloud.v1alpha1.BgpStatus.Builder, opi_api.network.cloud.v1alpha1.BgpStatusOrBuilder>(
                getStatus(),
                getParentForChildren(),
                isClean());
        status_ = null;
      }
      return statusBuilder_;
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


    // @@protoc_insertion_point(builder_scope:opi_api.network.cloud.v1alpha1.Bgp)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.Bgp)
  private static final opi_api.network.cloud.v1alpha1.Bgp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.cloud.v1alpha1.Bgp();
  }

  public static opi_api.network.cloud.v1alpha1.Bgp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Bgp>
      PARSER = new com.google.protobuf.AbstractParser<Bgp>() {
    @java.lang.Override
    public Bgp parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Bgp(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Bgp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Bgp> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.Bgp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

