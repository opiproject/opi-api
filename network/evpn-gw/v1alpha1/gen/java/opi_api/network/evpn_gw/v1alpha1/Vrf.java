// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: l3_xpu_infra_mgr.proto

package opi_api.network.evpn_gw.v1alpha1;

/**
 * <pre>
 * Vrf level network configuration
 * </pre>
 *
 * Protobuf type {@code opi_api.network.evpn_gw.v1alpha1.Vrf}
 */
public final class Vrf extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.evpn_gw.v1alpha1.Vrf)
    VrfOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Vrf.newBuilder() to construct.
  private Vrf(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Vrf() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Vrf();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Vrf(
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
            opi_api.network.evpn_gw.v1alpha1.VrfSpec.Builder subBuilder = null;
            if (spec_ != null) {
              subBuilder = spec_.toBuilder();
            }
            spec_ = input.readMessage(opi_api.network.evpn_gw.v1alpha1.VrfSpec.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(spec_);
              spec_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            opi_api.network.evpn_gw.v1alpha1.VrfStatus.Builder subBuilder = null;
            if (status_ != null) {
              subBuilder = status_.toBuilder();
            }
            status_ = input.readMessage(opi_api.network.evpn_gw.v1alpha1.VrfStatus.parser(), extensionRegistry);
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
    return opi_api.network.evpn_gw.v1alpha1.L3XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_Vrf_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.evpn_gw.v1alpha1.L3XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_Vrf_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.evpn_gw.v1alpha1.Vrf.class, opi_api.network.evpn_gw.v1alpha1.Vrf.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * The resource name of the Vrf.
   * "name" is an opaque object handle that is not user settable.
   * "name" will be returned with created object
   * user can only set {resource}_id on the Create request object
   * Format: vrfs/{vrf}
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
   * The resource name of the Vrf.
   * "name" is an opaque object handle that is not user settable.
   * "name" will be returned with created object
   * user can only set {resource}_id on the Create request object
   * Format: vrfs/{vrf}
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

  public static final int SPEC_FIELD_NUMBER = 2;
  private opi_api.network.evpn_gw.v1alpha1.VrfSpec spec_;
  /**
   * <pre>
   * Vrf's network configuration
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.VrfSpec spec = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the spec field is set.
   */
  @java.lang.Override
  public boolean hasSpec() {
    return spec_ != null;
  }
  /**
   * <pre>
   * Vrf's network configuration
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.VrfSpec spec = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The spec.
   */
  @java.lang.Override
  public opi_api.network.evpn_gw.v1alpha1.VrfSpec getSpec() {
    return spec_ == null ? opi_api.network.evpn_gw.v1alpha1.VrfSpec.getDefaultInstance() : spec_;
  }
  /**
   * <pre>
   * Vrf's network configuration
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.VrfSpec spec = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public opi_api.network.evpn_gw.v1alpha1.VrfSpecOrBuilder getSpecOrBuilder() {
    return getSpec();
  }

  public static final int STATUS_FIELD_NUMBER = 3;
  private opi_api.network.evpn_gw.v1alpha1.VrfStatus status_;
  /**
   * <pre>
   * Vrf's network status
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.VrfStatus status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the status field is set.
   */
  @java.lang.Override
  public boolean hasStatus() {
    return status_ != null;
  }
  /**
   * <pre>
   * Vrf's network status
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.VrfStatus status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  @java.lang.Override
  public opi_api.network.evpn_gw.v1alpha1.VrfStatus getStatus() {
    return status_ == null ? opi_api.network.evpn_gw.v1alpha1.VrfStatus.getDefaultInstance() : status_;
  }
  /**
   * <pre>
   * Vrf's network status
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.VrfStatus status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public opi_api.network.evpn_gw.v1alpha1.VrfStatusOrBuilder getStatusOrBuilder() {
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (spec_ != null) {
      output.writeMessage(2, getSpec());
    }
    if (status_ != null) {
      output.writeMessage(3, getStatus());
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
    if (spec_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSpec());
    }
    if (status_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getStatus());
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
    if (!(obj instanceof opi_api.network.evpn_gw.v1alpha1.Vrf)) {
      return super.equals(obj);
    }
    opi_api.network.evpn_gw.v1alpha1.Vrf other = (opi_api.network.evpn_gw.v1alpha1.Vrf) obj;

    if (!getName()
        .equals(other.getName())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
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

  public static opi_api.network.evpn_gw.v1alpha1.Vrf parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.evpn_gw.v1alpha1.Vrf parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.Vrf parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.evpn_gw.v1alpha1.Vrf parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.Vrf parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.evpn_gw.v1alpha1.Vrf parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.Vrf parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.evpn_gw.v1alpha1.Vrf parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.Vrf parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.evpn_gw.v1alpha1.Vrf parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.Vrf parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.evpn_gw.v1alpha1.Vrf parseFrom(
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
  public static Builder newBuilder(opi_api.network.evpn_gw.v1alpha1.Vrf prototype) {
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
   * Vrf level network configuration
   * </pre>
   *
   * Protobuf type {@code opi_api.network.evpn_gw.v1alpha1.Vrf}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.evpn_gw.v1alpha1.Vrf)
      opi_api.network.evpn_gw.v1alpha1.VrfOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.evpn_gw.v1alpha1.L3XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_Vrf_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.evpn_gw.v1alpha1.L3XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_Vrf_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.evpn_gw.v1alpha1.Vrf.class, opi_api.network.evpn_gw.v1alpha1.Vrf.Builder.class);
    }

    // Construct using opi_api.network.evpn_gw.v1alpha1.Vrf.newBuilder()
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
      return opi_api.network.evpn_gw.v1alpha1.L3XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_Vrf_descriptor;
    }

    @java.lang.Override
    public opi_api.network.evpn_gw.v1alpha1.Vrf getDefaultInstanceForType() {
      return opi_api.network.evpn_gw.v1alpha1.Vrf.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.evpn_gw.v1alpha1.Vrf build() {
      opi_api.network.evpn_gw.v1alpha1.Vrf result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.evpn_gw.v1alpha1.Vrf buildPartial() {
      opi_api.network.evpn_gw.v1alpha1.Vrf result = new opi_api.network.evpn_gw.v1alpha1.Vrf(this);
      result.name_ = name_;
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
      if (other instanceof opi_api.network.evpn_gw.v1alpha1.Vrf) {
        return mergeFrom((opi_api.network.evpn_gw.v1alpha1.Vrf)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.evpn_gw.v1alpha1.Vrf other) {
      if (other == opi_api.network.evpn_gw.v1alpha1.Vrf.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
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
      opi_api.network.evpn_gw.v1alpha1.Vrf parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.evpn_gw.v1alpha1.Vrf) e.getUnfinishedMessage();
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
     * The resource name of the Vrf.
     * "name" is an opaque object handle that is not user settable.
     * "name" will be returned with created object
     * user can only set {resource}_id on the Create request object
     * Format: vrfs/{vrf}
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
     * The resource name of the Vrf.
     * "name" is an opaque object handle that is not user settable.
     * "name" will be returned with created object
     * user can only set {resource}_id on the Create request object
     * Format: vrfs/{vrf}
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
     * The resource name of the Vrf.
     * "name" is an opaque object handle that is not user settable.
     * "name" will be returned with created object
     * user can only set {resource}_id on the Create request object
     * Format: vrfs/{vrf}
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
     * The resource name of the Vrf.
     * "name" is an opaque object handle that is not user settable.
     * "name" will be returned with created object
     * user can only set {resource}_id on the Create request object
     * Format: vrfs/{vrf}
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
     * The resource name of the Vrf.
     * "name" is an opaque object handle that is not user settable.
     * "name" will be returned with created object
     * user can only set {resource}_id on the Create request object
     * Format: vrfs/{vrf}
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

    private opi_api.network.evpn_gw.v1alpha1.VrfSpec spec_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.evpn_gw.v1alpha1.VrfSpec, opi_api.network.evpn_gw.v1alpha1.VrfSpec.Builder, opi_api.network.evpn_gw.v1alpha1.VrfSpecOrBuilder> specBuilder_;
    /**
     * <pre>
     * Vrf's network configuration
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.VrfSpec spec = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the spec field is set.
     */
    public boolean hasSpec() {
      return specBuilder_ != null || spec_ != null;
    }
    /**
     * <pre>
     * Vrf's network configuration
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.VrfSpec spec = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The spec.
     */
    public opi_api.network.evpn_gw.v1alpha1.VrfSpec getSpec() {
      if (specBuilder_ == null) {
        return spec_ == null ? opi_api.network.evpn_gw.v1alpha1.VrfSpec.getDefaultInstance() : spec_;
      } else {
        return specBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Vrf's network configuration
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.VrfSpec spec = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSpec(opi_api.network.evpn_gw.v1alpha1.VrfSpec value) {
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
     * Vrf's network configuration
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.VrfSpec spec = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSpec(
        opi_api.network.evpn_gw.v1alpha1.VrfSpec.Builder builderForValue) {
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
     * Vrf's network configuration
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.VrfSpec spec = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeSpec(opi_api.network.evpn_gw.v1alpha1.VrfSpec value) {
      if (specBuilder_ == null) {
        if (spec_ != null) {
          spec_ =
            opi_api.network.evpn_gw.v1alpha1.VrfSpec.newBuilder(spec_).mergeFrom(value).buildPartial();
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
     * Vrf's network configuration
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.VrfSpec spec = 2 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Vrf's network configuration
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.VrfSpec spec = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.network.evpn_gw.v1alpha1.VrfSpec.Builder getSpecBuilder() {
      
      onChanged();
      return getSpecFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Vrf's network configuration
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.VrfSpec spec = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.network.evpn_gw.v1alpha1.VrfSpecOrBuilder getSpecOrBuilder() {
      if (specBuilder_ != null) {
        return specBuilder_.getMessageOrBuilder();
      } else {
        return spec_ == null ?
            opi_api.network.evpn_gw.v1alpha1.VrfSpec.getDefaultInstance() : spec_;
      }
    }
    /**
     * <pre>
     * Vrf's network configuration
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.VrfSpec spec = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.evpn_gw.v1alpha1.VrfSpec, opi_api.network.evpn_gw.v1alpha1.VrfSpec.Builder, opi_api.network.evpn_gw.v1alpha1.VrfSpecOrBuilder> 
        getSpecFieldBuilder() {
      if (specBuilder_ == null) {
        specBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.network.evpn_gw.v1alpha1.VrfSpec, opi_api.network.evpn_gw.v1alpha1.VrfSpec.Builder, opi_api.network.evpn_gw.v1alpha1.VrfSpecOrBuilder>(
                getSpec(),
                getParentForChildren(),
                isClean());
        spec_ = null;
      }
      return specBuilder_;
    }

    private opi_api.network.evpn_gw.v1alpha1.VrfStatus status_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.evpn_gw.v1alpha1.VrfStatus, opi_api.network.evpn_gw.v1alpha1.VrfStatus.Builder, opi_api.network.evpn_gw.v1alpha1.VrfStatusOrBuilder> statusBuilder_;
    /**
     * <pre>
     * Vrf's network status
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.VrfStatus status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the status field is set.
     */
    public boolean hasStatus() {
      return statusBuilder_ != null || status_ != null;
    }
    /**
     * <pre>
     * Vrf's network status
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.VrfStatus status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The status.
     */
    public opi_api.network.evpn_gw.v1alpha1.VrfStatus getStatus() {
      if (statusBuilder_ == null) {
        return status_ == null ? opi_api.network.evpn_gw.v1alpha1.VrfStatus.getDefaultInstance() : status_;
      } else {
        return statusBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Vrf's network status
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.VrfStatus status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setStatus(opi_api.network.evpn_gw.v1alpha1.VrfStatus value) {
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
     * Vrf's network status
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.VrfStatus status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setStatus(
        opi_api.network.evpn_gw.v1alpha1.VrfStatus.Builder builderForValue) {
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
     * Vrf's network status
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.VrfStatus status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder mergeStatus(opi_api.network.evpn_gw.v1alpha1.VrfStatus value) {
      if (statusBuilder_ == null) {
        if (status_ != null) {
          status_ =
            opi_api.network.evpn_gw.v1alpha1.VrfStatus.newBuilder(status_).mergeFrom(value).buildPartial();
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
     * Vrf's network status
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.VrfStatus status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
     * Vrf's network status
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.VrfStatus status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public opi_api.network.evpn_gw.v1alpha1.VrfStatus.Builder getStatusBuilder() {
      
      onChanged();
      return getStatusFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Vrf's network status
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.VrfStatus status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public opi_api.network.evpn_gw.v1alpha1.VrfStatusOrBuilder getStatusOrBuilder() {
      if (statusBuilder_ != null) {
        return statusBuilder_.getMessageOrBuilder();
      } else {
        return status_ == null ?
            opi_api.network.evpn_gw.v1alpha1.VrfStatus.getDefaultInstance() : status_;
      }
    }
    /**
     * <pre>
     * Vrf's network status
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.VrfStatus status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.evpn_gw.v1alpha1.VrfStatus, opi_api.network.evpn_gw.v1alpha1.VrfStatus.Builder, opi_api.network.evpn_gw.v1alpha1.VrfStatusOrBuilder> 
        getStatusFieldBuilder() {
      if (statusBuilder_ == null) {
        statusBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.network.evpn_gw.v1alpha1.VrfStatus, opi_api.network.evpn_gw.v1alpha1.VrfStatus.Builder, opi_api.network.evpn_gw.v1alpha1.VrfStatusOrBuilder>(
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


    // @@protoc_insertion_point(builder_scope:opi_api.network.evpn_gw.v1alpha1.Vrf)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.evpn_gw.v1alpha1.Vrf)
  private static final opi_api.network.evpn_gw.v1alpha1.Vrf DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.evpn_gw.v1alpha1.Vrf();
  }

  public static opi_api.network.evpn_gw.v1alpha1.Vrf getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Vrf>
      PARSER = new com.google.protobuf.AbstractParser<Vrf>() {
    @java.lang.Override
    public Vrf parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Vrf(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Vrf> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Vrf> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.evpn_gw.v1alpha1.Vrf getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

