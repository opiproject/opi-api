// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: openconfig_interfaces.proto

package opi_api.network.v1alpha1;

/**
 * <pre>
 * Interface config
 * (-- api-linter: core::0123::resource-annotation=disabled
 *     aip.dev/not-precedent: the name field is an opaque object --)
 * </pre>
 *
 * Protobuf type {@code opi_api.network.v1alpha1.Config}
 */
public final class Config extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.v1alpha1.Config)
    ConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Config.newBuilder() to construct.
  private Config(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Config() {
    name_ = "";
    type_ = 0;
    description_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Config();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Config(
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
          case 16: {
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          case 24: {

            mtu_ = input.readUInt32();
            break;
          }
          case 32: {

            loopbackMode_ = input.readBool();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            description_ = s;
            break;
          }
          case 48: {

            enabled_ = input.readBool();
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
    return opi_api.network.v1alpha1.OpenconfigInterfacesProto.internal_static_opi_api_network_v1alpha1_Config_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.v1alpha1.OpenconfigInterfacesProto.internal_static_opi_api_network_v1alpha1_Config_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.v1alpha1.Config.class, opi_api.network.v1alpha1.Config.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Name of the interface.  This is the opaque object
   * used for designating the created interface.
   * </pre>
   *
   * <code>string name = 1;</code>
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
   * Name of the interface.  This is the opaque object
   * used for designating the created interface.
   * </pre>
   *
   * <code>string name = 1;</code>
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

  public static final int TYPE_FIELD_NUMBER = 2;
  private int type_;
  /**
   * <pre>
   * Type of interface - Ethernet and others
   * </pre>
   *
   * <code>.opi_api.network.v1alpha1.InterfaceType type = 2;</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <pre>
   * Type of interface - Ethernet and others
   * </pre>
   *
   * <code>.opi_api.network.v1alpha1.InterfaceType type = 2;</code>
   * @return The type.
   */
  @java.lang.Override public opi_api.network.v1alpha1.InterfaceType getType() {
    @SuppressWarnings("deprecation")
    opi_api.network.v1alpha1.InterfaceType result = opi_api.network.v1alpha1.InterfaceType.valueOf(type_);
    return result == null ? opi_api.network.v1alpha1.InterfaceType.UNRECOGNIZED : result;
  }

  public static final int MTU_FIELD_NUMBER = 3;
  private int mtu_;
  /**
   * <pre>
   * MTU for the interface that can be configured
   * </pre>
   *
   * <code>uint32 mtu = 3;</code>
   * @return The mtu.
   */
  @java.lang.Override
  public int getMtu() {
    return mtu_;
  }

  public static final int LOOPBACK_MODE_FIELD_NUMBER = 4;
  private boolean loopbackMode_;
  /**
   * <pre>
   * Setting the loopback mode of the interface
   * </pre>
   *
   * <code>bool loopback_mode = 4;</code>
   * @return The loopbackMode.
   */
  @java.lang.Override
  public boolean getLoopbackMode() {
    return loopbackMode_;
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 5;
  private volatile java.lang.Object description_;
  /**
   * <pre>
   * Description of the interface and usage
   * </pre>
   *
   * <code>string description = 5;</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Description of the interface and usage
   * </pre>
   *
   * <code>string description = 5;</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENABLED_FIELD_NUMBER = 6;
  private boolean enabled_;
  /**
   * <pre>
   * Setting for enabling/disabling the interface
   * </pre>
   *
   * <code>bool enabled = 6;</code>
   * @return The enabled.
   */
  @java.lang.Override
  public boolean getEnabled() {
    return enabled_;
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
    if (type_ != opi_api.network.v1alpha1.InterfaceType.INTERFACE_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, type_);
    }
    if (mtu_ != 0) {
      output.writeUInt32(3, mtu_);
    }
    if (loopbackMode_ != false) {
      output.writeBool(4, loopbackMode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, description_);
    }
    if (enabled_ != false) {
      output.writeBool(6, enabled_);
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
    if (type_ != opi_api.network.v1alpha1.InterfaceType.INTERFACE_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, type_);
    }
    if (mtu_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, mtu_);
    }
    if (loopbackMode_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, loopbackMode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, description_);
    }
    if (enabled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, enabled_);
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
    if (!(obj instanceof opi_api.network.v1alpha1.Config)) {
      return super.equals(obj);
    }
    opi_api.network.v1alpha1.Config other = (opi_api.network.v1alpha1.Config) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (type_ != other.type_) return false;
    if (getMtu()
        != other.getMtu()) return false;
    if (getLoopbackMode()
        != other.getLoopbackMode()) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (getEnabled()
        != other.getEnabled()) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + MTU_FIELD_NUMBER;
    hash = (53 * hash) + getMtu();
    hash = (37 * hash) + LOOPBACK_MODE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getLoopbackMode());
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (37 * hash) + ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnabled());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.v1alpha1.Config parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.v1alpha1.Config parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.v1alpha1.Config parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.v1alpha1.Config parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.v1alpha1.Config parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.v1alpha1.Config parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.v1alpha1.Config parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.v1alpha1.Config parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.v1alpha1.Config parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.v1alpha1.Config parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.v1alpha1.Config parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.v1alpha1.Config parseFrom(
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
  public static Builder newBuilder(opi_api.network.v1alpha1.Config prototype) {
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
   * Interface config
   * (-- api-linter: core::0123::resource-annotation=disabled
   *     aip.dev/not-precedent: the name field is an opaque object --)
   * </pre>
   *
   * Protobuf type {@code opi_api.network.v1alpha1.Config}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.v1alpha1.Config)
      opi_api.network.v1alpha1.ConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.v1alpha1.OpenconfigInterfacesProto.internal_static_opi_api_network_v1alpha1_Config_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.v1alpha1.OpenconfigInterfacesProto.internal_static_opi_api_network_v1alpha1_Config_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.v1alpha1.Config.class, opi_api.network.v1alpha1.Config.Builder.class);
    }

    // Construct using opi_api.network.v1alpha1.Config.newBuilder()
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

      type_ = 0;

      mtu_ = 0;

      loopbackMode_ = false;

      description_ = "";

      enabled_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.v1alpha1.OpenconfigInterfacesProto.internal_static_opi_api_network_v1alpha1_Config_descriptor;
    }

    @java.lang.Override
    public opi_api.network.v1alpha1.Config getDefaultInstanceForType() {
      return opi_api.network.v1alpha1.Config.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.v1alpha1.Config build() {
      opi_api.network.v1alpha1.Config result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.v1alpha1.Config buildPartial() {
      opi_api.network.v1alpha1.Config result = new opi_api.network.v1alpha1.Config(this);
      result.name_ = name_;
      result.type_ = type_;
      result.mtu_ = mtu_;
      result.loopbackMode_ = loopbackMode_;
      result.description_ = description_;
      result.enabled_ = enabled_;
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
      if (other instanceof opi_api.network.v1alpha1.Config) {
        return mergeFrom((opi_api.network.v1alpha1.Config)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.v1alpha1.Config other) {
      if (other == opi_api.network.v1alpha1.Config.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.getMtu() != 0) {
        setMtu(other.getMtu());
      }
      if (other.getLoopbackMode() != false) {
        setLoopbackMode(other.getLoopbackMode());
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
      }
      if (other.getEnabled() != false) {
        setEnabled(other.getEnabled());
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
      opi_api.network.v1alpha1.Config parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.v1alpha1.Config) e.getUnfinishedMessage();
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
     * Name of the interface.  This is the opaque object
     * used for designating the created interface.
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * Name of the interface.  This is the opaque object
     * used for designating the created interface.
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * Name of the interface.  This is the opaque object
     * used for designating the created interface.
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * Name of the interface.  This is the opaque object
     * used for designating the created interface.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the interface.  This is the opaque object
     * used for designating the created interface.
     * </pre>
     *
     * <code>string name = 1;</code>
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

    private int type_ = 0;
    /**
     * <pre>
     * Type of interface - Ethernet and others
     * </pre>
     *
     * <code>.opi_api.network.v1alpha1.InterfaceType type = 2;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * Type of interface - Ethernet and others
     * </pre>
     *
     * <code>.opi_api.network.v1alpha1.InterfaceType type = 2;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type of interface - Ethernet and others
     * </pre>
     *
     * <code>.opi_api.network.v1alpha1.InterfaceType type = 2;</code>
     * @return The type.
     */
    @java.lang.Override
    public opi_api.network.v1alpha1.InterfaceType getType() {
      @SuppressWarnings("deprecation")
      opi_api.network.v1alpha1.InterfaceType result = opi_api.network.v1alpha1.InterfaceType.valueOf(type_);
      return result == null ? opi_api.network.v1alpha1.InterfaceType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Type of interface - Ethernet and others
     * </pre>
     *
     * <code>.opi_api.network.v1alpha1.InterfaceType type = 2;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(opi_api.network.v1alpha1.InterfaceType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type of interface - Ethernet and others
     * </pre>
     *
     * <code>.opi_api.network.v1alpha1.InterfaceType type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private int mtu_ ;
    /**
     * <pre>
     * MTU for the interface that can be configured
     * </pre>
     *
     * <code>uint32 mtu = 3;</code>
     * @return The mtu.
     */
    @java.lang.Override
    public int getMtu() {
      return mtu_;
    }
    /**
     * <pre>
     * MTU for the interface that can be configured
     * </pre>
     *
     * <code>uint32 mtu = 3;</code>
     * @param value The mtu to set.
     * @return This builder for chaining.
     */
    public Builder setMtu(int value) {
      
      mtu_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * MTU for the interface that can be configured
     * </pre>
     *
     * <code>uint32 mtu = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMtu() {
      
      mtu_ = 0;
      onChanged();
      return this;
    }

    private boolean loopbackMode_ ;
    /**
     * <pre>
     * Setting the loopback mode of the interface
     * </pre>
     *
     * <code>bool loopback_mode = 4;</code>
     * @return The loopbackMode.
     */
    @java.lang.Override
    public boolean getLoopbackMode() {
      return loopbackMode_;
    }
    /**
     * <pre>
     * Setting the loopback mode of the interface
     * </pre>
     *
     * <code>bool loopback_mode = 4;</code>
     * @param value The loopbackMode to set.
     * @return This builder for chaining.
     */
    public Builder setLoopbackMode(boolean value) {
      
      loopbackMode_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Setting the loopback mode of the interface
     * </pre>
     *
     * <code>bool loopback_mode = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLoopbackMode() {
      
      loopbackMode_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <pre>
     * Description of the interface and usage
     * </pre>
     *
     * <code>string description = 5;</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Description of the interface and usage
     * </pre>
     *
     * <code>string description = 5;</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Description of the interface and usage
     * </pre>
     *
     * <code>string description = 5;</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      description_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Description of the interface and usage
     * </pre>
     *
     * <code>string description = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Description of the interface and usage
     * </pre>
     *
     * <code>string description = 5;</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      description_ = value;
      onChanged();
      return this;
    }

    private boolean enabled_ ;
    /**
     * <pre>
     * Setting for enabling/disabling the interface
     * </pre>
     *
     * <code>bool enabled = 6;</code>
     * @return The enabled.
     */
    @java.lang.Override
    public boolean getEnabled() {
      return enabled_;
    }
    /**
     * <pre>
     * Setting for enabling/disabling the interface
     * </pre>
     *
     * <code>bool enabled = 6;</code>
     * @param value The enabled to set.
     * @return This builder for chaining.
     */
    public Builder setEnabled(boolean value) {
      
      enabled_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Setting for enabling/disabling the interface
     * </pre>
     *
     * <code>bool enabled = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnabled() {
      
      enabled_ = false;
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


    // @@protoc_insertion_point(builder_scope:opi_api.network.v1alpha1.Config)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.v1alpha1.Config)
  private static final opi_api.network.v1alpha1.Config DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.v1alpha1.Config();
  }

  public static opi_api.network.v1alpha1.Config getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Config>
      PARSER = new com.google.protobuf.AbstractParser<Config>() {
    @java.lang.Override
    public Config parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Config(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Config> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Config> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.v1alpha1.Config getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

