// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cloudrpc.proto

package opi_api.network.cloud.v1alpha1;

/**
 * <pre>
 * Create Interface Request
 * </pre>
 *
 * Protobuf type {@code opi_api.network.cloud.v1alpha1.CreateInterfaceRequest}
 */
public final class CreateInterfaceRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.cloud.v1alpha1.CreateInterfaceRequest)
    CreateInterfaceRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateInterfaceRequest.newBuilder() to construct.
  private CreateInterfaceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateInterfaceRequest() {
    parent_ = "";
    interfaceId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateInterfaceRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateInterfaceRequest(
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
            opi_api.network.cloud.v1alpha1.Interface.Builder subBuilder = null;
            if (interface_ != null) {
              subBuilder = interface_.toBuilder();
            }
            interface_ = input.readMessage(opi_api.network.cloud.v1alpha1.Interface.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(interface_);
              interface_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            interfaceId_ = s;
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
    return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_CreateInterfaceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_CreateInterfaceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.cloud.v1alpha1.CreateInterfaceRequest.class, opi_api.network.cloud.v1alpha1.CreateInterfaceRequest.Builder.class);
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

  public static final int INTERFACE_FIELD_NUMBER = 2;
  private opi_api.network.cloud.v1alpha1.Interface interface_;
  /**
   * <pre>
   * interface
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.Interface interface = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the interface field is set.
   */
  @java.lang.Override
  public boolean hasInterface() {
    return interface_ != null;
  }
  /**
   * <pre>
   * interface
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.Interface interface = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The interface.
   */
  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.Interface getInterface() {
    return interface_ == null ? opi_api.network.cloud.v1alpha1.Interface.getDefaultInstance() : interface_;
  }
  /**
   * <pre>
   * interface
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.Interface interface = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.InterfaceOrBuilder getInterfaceOrBuilder() {
    return getInterface();
  }

  public static final int INTERFACE_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object interfaceId_;
  /**
   * <pre>
   * interface_id
   * </pre>
   *
   * <code>string interface_id = 3;</code>
   * @return The interfaceId.
   */
  @java.lang.Override
  public java.lang.String getInterfaceId() {
    java.lang.Object ref = interfaceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      interfaceId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * interface_id
   * </pre>
   *
   * <code>string interface_id = 3;</code>
   * @return The bytes for interfaceId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getInterfaceIdBytes() {
    java.lang.Object ref = interfaceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      interfaceId_ = b;
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
    if (interface_ != null) {
      output.writeMessage(2, getInterface());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(interfaceId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, interfaceId_);
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
    if (interface_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getInterface());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(interfaceId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, interfaceId_);
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
    if (!(obj instanceof opi_api.network.cloud.v1alpha1.CreateInterfaceRequest)) {
      return super.equals(obj);
    }
    opi_api.network.cloud.v1alpha1.CreateInterfaceRequest other = (opi_api.network.cloud.v1alpha1.CreateInterfaceRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasInterface() != other.hasInterface()) return false;
    if (hasInterface()) {
      if (!getInterface()
          .equals(other.getInterface())) return false;
    }
    if (!getInterfaceId()
        .equals(other.getInterfaceId())) return false;
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
    if (hasInterface()) {
      hash = (37 * hash) + INTERFACE_FIELD_NUMBER;
      hash = (53 * hash) + getInterface().hashCode();
    }
    hash = (37 * hash) + INTERFACE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getInterfaceId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.cloud.v1alpha1.CreateInterfaceRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.CreateInterfaceRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.CreateInterfaceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.CreateInterfaceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.CreateInterfaceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.CreateInterfaceRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.CreateInterfaceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.CreateInterfaceRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.CreateInterfaceRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.CreateInterfaceRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.CreateInterfaceRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.CreateInterfaceRequest parseFrom(
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
  public static Builder newBuilder(opi_api.network.cloud.v1alpha1.CreateInterfaceRequest prototype) {
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
   * Create Interface Request
   * </pre>
   *
   * Protobuf type {@code opi_api.network.cloud.v1alpha1.CreateInterfaceRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.cloud.v1alpha1.CreateInterfaceRequest)
      opi_api.network.cloud.v1alpha1.CreateInterfaceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_CreateInterfaceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_CreateInterfaceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.cloud.v1alpha1.CreateInterfaceRequest.class, opi_api.network.cloud.v1alpha1.CreateInterfaceRequest.Builder.class);
    }

    // Construct using opi_api.network.cloud.v1alpha1.CreateInterfaceRequest.newBuilder()
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

      if (interfaceBuilder_ == null) {
        interface_ = null;
      } else {
        interface_ = null;
        interfaceBuilder_ = null;
      }
      interfaceId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_CreateInterfaceRequest_descriptor;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.CreateInterfaceRequest getDefaultInstanceForType() {
      return opi_api.network.cloud.v1alpha1.CreateInterfaceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.CreateInterfaceRequest build() {
      opi_api.network.cloud.v1alpha1.CreateInterfaceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.CreateInterfaceRequest buildPartial() {
      opi_api.network.cloud.v1alpha1.CreateInterfaceRequest result = new opi_api.network.cloud.v1alpha1.CreateInterfaceRequest(this);
      result.parent_ = parent_;
      if (interfaceBuilder_ == null) {
        result.interface_ = interface_;
      } else {
        result.interface_ = interfaceBuilder_.build();
      }
      result.interfaceId_ = interfaceId_;
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
      if (other instanceof opi_api.network.cloud.v1alpha1.CreateInterfaceRequest) {
        return mergeFrom((opi_api.network.cloud.v1alpha1.CreateInterfaceRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.cloud.v1alpha1.CreateInterfaceRequest other) {
      if (other == opi_api.network.cloud.v1alpha1.CreateInterfaceRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasInterface()) {
        mergeInterface(other.getInterface());
      }
      if (!other.getInterfaceId().isEmpty()) {
        interfaceId_ = other.interfaceId_;
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
      opi_api.network.cloud.v1alpha1.CreateInterfaceRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.cloud.v1alpha1.CreateInterfaceRequest) e.getUnfinishedMessage();
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

    private opi_api.network.cloud.v1alpha1.Interface interface_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.cloud.v1alpha1.Interface, opi_api.network.cloud.v1alpha1.Interface.Builder, opi_api.network.cloud.v1alpha1.InterfaceOrBuilder> interfaceBuilder_;
    /**
     * <pre>
     * interface
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.Interface interface = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the interface field is set.
     */
    public boolean hasInterface() {
      return interfaceBuilder_ != null || interface_ != null;
    }
    /**
     * <pre>
     * interface
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.Interface interface = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The interface.
     */
    public opi_api.network.cloud.v1alpha1.Interface getInterface() {
      if (interfaceBuilder_ == null) {
        return interface_ == null ? opi_api.network.cloud.v1alpha1.Interface.getDefaultInstance() : interface_;
      } else {
        return interfaceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * interface
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.Interface interface = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setInterface(opi_api.network.cloud.v1alpha1.Interface value) {
      if (interfaceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        interface_ = value;
        onChanged();
      } else {
        interfaceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * interface
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.Interface interface = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setInterface(
        opi_api.network.cloud.v1alpha1.Interface.Builder builderForValue) {
      if (interfaceBuilder_ == null) {
        interface_ = builderForValue.build();
        onChanged();
      } else {
        interfaceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * interface
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.Interface interface = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeInterface(opi_api.network.cloud.v1alpha1.Interface value) {
      if (interfaceBuilder_ == null) {
        if (interface_ != null) {
          interface_ =
            opi_api.network.cloud.v1alpha1.Interface.newBuilder(interface_).mergeFrom(value).buildPartial();
        } else {
          interface_ = value;
        }
        onChanged();
      } else {
        interfaceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * interface
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.Interface interface = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearInterface() {
      if (interfaceBuilder_ == null) {
        interface_ = null;
        onChanged();
      } else {
        interface_ = null;
        interfaceBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * interface
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.Interface interface = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.network.cloud.v1alpha1.Interface.Builder getInterfaceBuilder() {
      
      onChanged();
      return getInterfaceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * interface
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.Interface interface = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.network.cloud.v1alpha1.InterfaceOrBuilder getInterfaceOrBuilder() {
      if (interfaceBuilder_ != null) {
        return interfaceBuilder_.getMessageOrBuilder();
      } else {
        return interface_ == null ?
            opi_api.network.cloud.v1alpha1.Interface.getDefaultInstance() : interface_;
      }
    }
    /**
     * <pre>
     * interface
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.Interface interface = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.cloud.v1alpha1.Interface, opi_api.network.cloud.v1alpha1.Interface.Builder, opi_api.network.cloud.v1alpha1.InterfaceOrBuilder> 
        getInterfaceFieldBuilder() {
      if (interfaceBuilder_ == null) {
        interfaceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.network.cloud.v1alpha1.Interface, opi_api.network.cloud.v1alpha1.Interface.Builder, opi_api.network.cloud.v1alpha1.InterfaceOrBuilder>(
                getInterface(),
                getParentForChildren(),
                isClean());
        interface_ = null;
      }
      return interfaceBuilder_;
    }

    private java.lang.Object interfaceId_ = "";
    /**
     * <pre>
     * interface_id
     * </pre>
     *
     * <code>string interface_id = 3;</code>
     * @return The interfaceId.
     */
    public java.lang.String getInterfaceId() {
      java.lang.Object ref = interfaceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        interfaceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * interface_id
     * </pre>
     *
     * <code>string interface_id = 3;</code>
     * @return The bytes for interfaceId.
     */
    public com.google.protobuf.ByteString
        getInterfaceIdBytes() {
      java.lang.Object ref = interfaceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        interfaceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * interface_id
     * </pre>
     *
     * <code>string interface_id = 3;</code>
     * @param value The interfaceId to set.
     * @return This builder for chaining.
     */
    public Builder setInterfaceId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      interfaceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * interface_id
     * </pre>
     *
     * <code>string interface_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearInterfaceId() {
      
      interfaceId_ = getDefaultInstance().getInterfaceId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * interface_id
     * </pre>
     *
     * <code>string interface_id = 3;</code>
     * @param value The bytes for interfaceId to set.
     * @return This builder for chaining.
     */
    public Builder setInterfaceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      interfaceId_ = value;
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


    // @@protoc_insertion_point(builder_scope:opi_api.network.cloud.v1alpha1.CreateInterfaceRequest)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.CreateInterfaceRequest)
  private static final opi_api.network.cloud.v1alpha1.CreateInterfaceRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.cloud.v1alpha1.CreateInterfaceRequest();
  }

  public static opi_api.network.cloud.v1alpha1.CreateInterfaceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateInterfaceRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateInterfaceRequest>() {
    @java.lang.Override
    public CreateInterfaceRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateInterfaceRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateInterfaceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateInterfaceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.CreateInterfaceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

