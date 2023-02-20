// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cloudrpc.proto

package opi_api.network.cloud.v1alpha1;

/**
 * <pre>
 * Create SecurityProfile Request
 * </pre>
 *
 * Protobuf type {@code opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest}
 */
public final class CreateSecurityProfileRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest)
    CreateSecurityProfileRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateSecurityProfileRequest.newBuilder() to construct.
  private CreateSecurityProfileRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateSecurityProfileRequest() {
    parent_ = "";
    securityprofileId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateSecurityProfileRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateSecurityProfileRequest(
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
            opi_api.network.cloud.v1alpha1.SecurityProfile.Builder subBuilder = null;
            if (securityprofile_ != null) {
              subBuilder = securityprofile_.toBuilder();
            }
            securityprofile_ = input.readMessage(opi_api.network.cloud.v1alpha1.SecurityProfile.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(securityprofile_);
              securityprofile_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            securityprofileId_ = s;
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
    return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_CreateSecurityProfileRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_CreateSecurityProfileRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest.class, opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * parent
   * </pre>
   *
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
   * <pre>
   * parent
   * </pre>
   *
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

  public static final int SECURITYPROFILE_FIELD_NUMBER = 2;
  private opi_api.network.cloud.v1alpha1.SecurityProfile securityprofile_;
  /**
   * <pre>
   * securityprofile
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.SecurityProfile securityprofile = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the securityprofile field is set.
   */
  @java.lang.Override
  public boolean hasSecurityprofile() {
    return securityprofile_ != null;
  }
  /**
   * <pre>
   * securityprofile
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.SecurityProfile securityprofile = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The securityprofile.
   */
  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.SecurityProfile getSecurityprofile() {
    return securityprofile_ == null ? opi_api.network.cloud.v1alpha1.SecurityProfile.getDefaultInstance() : securityprofile_;
  }
  /**
   * <pre>
   * securityprofile
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.SecurityProfile securityprofile = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.SecurityProfileOrBuilder getSecurityprofileOrBuilder() {
    return getSecurityprofile();
  }

  public static final int SECURITYPROFILE_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object securityprofileId_;
  /**
   * <pre>
   * securityprofile_id
   * </pre>
   *
   * <code>string securityprofile_id = 3;</code>
   * @return The securityprofileId.
   */
  @java.lang.Override
  public java.lang.String getSecurityprofileId() {
    java.lang.Object ref = securityprofileId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      securityprofileId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * securityprofile_id
   * </pre>
   *
   * <code>string securityprofile_id = 3;</code>
   * @return The bytes for securityprofileId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSecurityprofileIdBytes() {
    java.lang.Object ref = securityprofileId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      securityprofileId_ = b;
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
    if (securityprofile_ != null) {
      output.writeMessage(2, getSecurityprofile());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(securityprofileId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, securityprofileId_);
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
    if (securityprofile_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSecurityprofile());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(securityprofileId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, securityprofileId_);
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
    if (!(obj instanceof opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest)) {
      return super.equals(obj);
    }
    opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest other = (opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasSecurityprofile() != other.hasSecurityprofile()) return false;
    if (hasSecurityprofile()) {
      if (!getSecurityprofile()
          .equals(other.getSecurityprofile())) return false;
    }
    if (!getSecurityprofileId()
        .equals(other.getSecurityprofileId())) return false;
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
    if (hasSecurityprofile()) {
      hash = (37 * hash) + SECURITYPROFILE_FIELD_NUMBER;
      hash = (53 * hash) + getSecurityprofile().hashCode();
    }
    hash = (37 * hash) + SECURITYPROFILE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSecurityprofileId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest parseFrom(
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
  public static Builder newBuilder(opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest prototype) {
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
   * Create SecurityProfile Request
   * </pre>
   *
   * Protobuf type {@code opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest)
      opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_CreateSecurityProfileRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_CreateSecurityProfileRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest.class, opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest.Builder.class);
    }

    // Construct using opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest.newBuilder()
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

      if (securityprofileBuilder_ == null) {
        securityprofile_ = null;
      } else {
        securityprofile_ = null;
        securityprofileBuilder_ = null;
      }
      securityprofileId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_CreateSecurityProfileRequest_descriptor;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest getDefaultInstanceForType() {
      return opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest build() {
      opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest buildPartial() {
      opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest result = new opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest(this);
      result.parent_ = parent_;
      if (securityprofileBuilder_ == null) {
        result.securityprofile_ = securityprofile_;
      } else {
        result.securityprofile_ = securityprofileBuilder_.build();
      }
      result.securityprofileId_ = securityprofileId_;
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
      if (other instanceof opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest) {
        return mergeFrom((opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest other) {
      if (other == opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasSecurityprofile()) {
        mergeSecurityprofile(other.getSecurityprofile());
      }
      if (!other.getSecurityprofileId().isEmpty()) {
        securityprofileId_ = other.securityprofileId_;
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
      opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest) e.getUnfinishedMessage();
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
     * <pre>
     * parent
     * </pre>
     *
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
     * <pre>
     * parent
     * </pre>
     *
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
     * <pre>
     * parent
     * </pre>
     *
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
     * <pre>
     * parent
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * parent
     * </pre>
     *
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

    private opi_api.network.cloud.v1alpha1.SecurityProfile securityprofile_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.cloud.v1alpha1.SecurityProfile, opi_api.network.cloud.v1alpha1.SecurityProfile.Builder, opi_api.network.cloud.v1alpha1.SecurityProfileOrBuilder> securityprofileBuilder_;
    /**
     * <pre>
     * securityprofile
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.SecurityProfile securityprofile = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the securityprofile field is set.
     */
    public boolean hasSecurityprofile() {
      return securityprofileBuilder_ != null || securityprofile_ != null;
    }
    /**
     * <pre>
     * securityprofile
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.SecurityProfile securityprofile = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The securityprofile.
     */
    public opi_api.network.cloud.v1alpha1.SecurityProfile getSecurityprofile() {
      if (securityprofileBuilder_ == null) {
        return securityprofile_ == null ? opi_api.network.cloud.v1alpha1.SecurityProfile.getDefaultInstance() : securityprofile_;
      } else {
        return securityprofileBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * securityprofile
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.SecurityProfile securityprofile = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSecurityprofile(opi_api.network.cloud.v1alpha1.SecurityProfile value) {
      if (securityprofileBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        securityprofile_ = value;
        onChanged();
      } else {
        securityprofileBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * securityprofile
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.SecurityProfile securityprofile = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSecurityprofile(
        opi_api.network.cloud.v1alpha1.SecurityProfile.Builder builderForValue) {
      if (securityprofileBuilder_ == null) {
        securityprofile_ = builderForValue.build();
        onChanged();
      } else {
        securityprofileBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * securityprofile
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.SecurityProfile securityprofile = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeSecurityprofile(opi_api.network.cloud.v1alpha1.SecurityProfile value) {
      if (securityprofileBuilder_ == null) {
        if (securityprofile_ != null) {
          securityprofile_ =
            opi_api.network.cloud.v1alpha1.SecurityProfile.newBuilder(securityprofile_).mergeFrom(value).buildPartial();
        } else {
          securityprofile_ = value;
        }
        onChanged();
      } else {
        securityprofileBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * securityprofile
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.SecurityProfile securityprofile = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearSecurityprofile() {
      if (securityprofileBuilder_ == null) {
        securityprofile_ = null;
        onChanged();
      } else {
        securityprofile_ = null;
        securityprofileBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * securityprofile
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.SecurityProfile securityprofile = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.network.cloud.v1alpha1.SecurityProfile.Builder getSecurityprofileBuilder() {
      
      onChanged();
      return getSecurityprofileFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * securityprofile
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.SecurityProfile securityprofile = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.network.cloud.v1alpha1.SecurityProfileOrBuilder getSecurityprofileOrBuilder() {
      if (securityprofileBuilder_ != null) {
        return securityprofileBuilder_.getMessageOrBuilder();
      } else {
        return securityprofile_ == null ?
            opi_api.network.cloud.v1alpha1.SecurityProfile.getDefaultInstance() : securityprofile_;
      }
    }
    /**
     * <pre>
     * securityprofile
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.SecurityProfile securityprofile = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.cloud.v1alpha1.SecurityProfile, opi_api.network.cloud.v1alpha1.SecurityProfile.Builder, opi_api.network.cloud.v1alpha1.SecurityProfileOrBuilder> 
        getSecurityprofileFieldBuilder() {
      if (securityprofileBuilder_ == null) {
        securityprofileBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.network.cloud.v1alpha1.SecurityProfile, opi_api.network.cloud.v1alpha1.SecurityProfile.Builder, opi_api.network.cloud.v1alpha1.SecurityProfileOrBuilder>(
                getSecurityprofile(),
                getParentForChildren(),
                isClean());
        securityprofile_ = null;
      }
      return securityprofileBuilder_;
    }

    private java.lang.Object securityprofileId_ = "";
    /**
     * <pre>
     * securityprofile_id
     * </pre>
     *
     * <code>string securityprofile_id = 3;</code>
     * @return The securityprofileId.
     */
    public java.lang.String getSecurityprofileId() {
      java.lang.Object ref = securityprofileId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        securityprofileId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * securityprofile_id
     * </pre>
     *
     * <code>string securityprofile_id = 3;</code>
     * @return The bytes for securityprofileId.
     */
    public com.google.protobuf.ByteString
        getSecurityprofileIdBytes() {
      java.lang.Object ref = securityprofileId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        securityprofileId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * securityprofile_id
     * </pre>
     *
     * <code>string securityprofile_id = 3;</code>
     * @param value The securityprofileId to set.
     * @return This builder for chaining.
     */
    public Builder setSecurityprofileId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      securityprofileId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * securityprofile_id
     * </pre>
     *
     * <code>string securityprofile_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSecurityprofileId() {
      
      securityprofileId_ = getDefaultInstance().getSecurityprofileId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * securityprofile_id
     * </pre>
     *
     * <code>string securityprofile_id = 3;</code>
     * @param value The bytes for securityprofileId to set.
     * @return This builder for chaining.
     */
    public Builder setSecurityprofileIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      securityprofileId_ = value;
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


    // @@protoc_insertion_point(builder_scope:opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest)
  private static final opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest();
  }

  public static opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateSecurityProfileRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateSecurityProfileRequest>() {
    @java.lang.Override
    public CreateSecurityProfileRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateSecurityProfileRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateSecurityProfileRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateSecurityProfileRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

