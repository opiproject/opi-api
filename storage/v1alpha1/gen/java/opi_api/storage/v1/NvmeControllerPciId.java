// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package opi_api.storage.v1;

/**
 * <pre>
 * The controller PCI-ID is used to address a given virtual controller. Virtual
 * controllers are organized into devices with Physical functions and SRIOV
 * virtual function within the physical functions. Currently, xPUs may
 * expose multiple devices with one physical function each and one or more
 * virtual functions under the physical function.
 * </pre>
 *
 * Protobuf type {@code opi_api.storage.v1.NvmeControllerPciId}
 */
public final class NvmeControllerPciId extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.NvmeControllerPciId)
    NvmeControllerPciIdOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NvmeControllerPciId.newBuilder() to construct.
  private NvmeControllerPciId(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NvmeControllerPciId() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NvmeControllerPciId();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NvmeControllerPciId(
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

            bus_ = input.readInt32();
            break;
          }
          case 16: {

            device_ = input.readInt32();
            break;
          }
          case 24: {

            function_ = input.readInt32();
            break;
          }
          case 32: {

            virtualFunction_ = input.readInt32();
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
    return opi_api.storage.v1.CommonProto.internal_static_opi_api_storage_v1_NvmeControllerPciId_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.CommonProto.internal_static_opi_api_storage_v1_NvmeControllerPciId_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.NvmeControllerPciId.class, opi_api.storage.v1.NvmeControllerPciId.Builder.class);
  }

  public static final int BUS_FIELD_NUMBER = 1;
  private int bus_;
  /**
   * <pre>
   * Bus number, provided for future usage if needed. Currently set to ’0’
   * </pre>
   *
   * <code>int32 bus = 1;</code>
   * @return The bus.
   */
  @java.lang.Override
  public int getBus() {
    return bus_;
  }

  public static final int DEVICE_FIELD_NUMBER = 2;
  private int device_;
  /**
   * <pre>
   * Device number, based on the NVMe device layout
   * </pre>
   *
   * <code>int32 device = 2;</code>
   * @return The device.
   */
  @java.lang.Override
  public int getDevice() {
    return device_;
  }

  public static final int FUNCTION_FIELD_NUMBER = 3;
  private int function_;
  /**
   * <pre>
   * Physical function, always set to 0 in current model
   * </pre>
   *
   * <code>int32 function = 3;</code>
   * @return The function.
   */
  @java.lang.Override
  public int getFunction() {
    return function_;
  }

  public static final int VIRTUAL_FUNCTION_FIELD_NUMBER = 4;
  private int virtualFunction_;
  /**
   * <pre>
   * SRIOV Virtual function within the Device and Physical function.
   * Set to 0 for Physical Function. Virtual Function numbering starts from 1
   * </pre>
   *
   * <code>int32 virtual_function = 4;</code>
   * @return The virtualFunction.
   */
  @java.lang.Override
  public int getVirtualFunction() {
    return virtualFunction_;
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
    if (bus_ != 0) {
      output.writeInt32(1, bus_);
    }
    if (device_ != 0) {
      output.writeInt32(2, device_);
    }
    if (function_ != 0) {
      output.writeInt32(3, function_);
    }
    if (virtualFunction_ != 0) {
      output.writeInt32(4, virtualFunction_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (bus_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, bus_);
    }
    if (device_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, device_);
    }
    if (function_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, function_);
    }
    if (virtualFunction_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, virtualFunction_);
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
    if (!(obj instanceof opi_api.storage.v1.NvmeControllerPciId)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.NvmeControllerPciId other = (opi_api.storage.v1.NvmeControllerPciId) obj;

    if (getBus()
        != other.getBus()) return false;
    if (getDevice()
        != other.getDevice()) return false;
    if (getFunction()
        != other.getFunction()) return false;
    if (getVirtualFunction()
        != other.getVirtualFunction()) return false;
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
    hash = (37 * hash) + BUS_FIELD_NUMBER;
    hash = (53 * hash) + getBus();
    hash = (37 * hash) + DEVICE_FIELD_NUMBER;
    hash = (53 * hash) + getDevice();
    hash = (37 * hash) + FUNCTION_FIELD_NUMBER;
    hash = (53 * hash) + getFunction();
    hash = (37 * hash) + VIRTUAL_FUNCTION_FIELD_NUMBER;
    hash = (53 * hash) + getVirtualFunction();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.NvmeControllerPciId parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.NvmeControllerPciId parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.NvmeControllerPciId parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.NvmeControllerPciId parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.NvmeControllerPciId parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.NvmeControllerPciId parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.NvmeControllerPciId parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.NvmeControllerPciId parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.NvmeControllerPciId parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.NvmeControllerPciId parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.NvmeControllerPciId parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.NvmeControllerPciId parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.NvmeControllerPciId prototype) {
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
   * The controller PCI-ID is used to address a given virtual controller. Virtual
   * controllers are organized into devices with Physical functions and SRIOV
   * virtual function within the physical functions. Currently, xPUs may
   * expose multiple devices with one physical function each and one or more
   * virtual functions under the physical function.
   * </pre>
   *
   * Protobuf type {@code opi_api.storage.v1.NvmeControllerPciId}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.NvmeControllerPciId)
      opi_api.storage.v1.NvmeControllerPciIdOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.CommonProto.internal_static_opi_api_storage_v1_NvmeControllerPciId_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.CommonProto.internal_static_opi_api_storage_v1_NvmeControllerPciId_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.NvmeControllerPciId.class, opi_api.storage.v1.NvmeControllerPciId.Builder.class);
    }

    // Construct using opi_api.storage.v1.NvmeControllerPciId.newBuilder()
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
      bus_ = 0;

      device_ = 0;

      function_ = 0;

      virtualFunction_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.CommonProto.internal_static_opi_api_storage_v1_NvmeControllerPciId_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.NvmeControllerPciId getDefaultInstanceForType() {
      return opi_api.storage.v1.NvmeControllerPciId.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.NvmeControllerPciId build() {
      opi_api.storage.v1.NvmeControllerPciId result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.NvmeControllerPciId buildPartial() {
      opi_api.storage.v1.NvmeControllerPciId result = new opi_api.storage.v1.NvmeControllerPciId(this);
      result.bus_ = bus_;
      result.device_ = device_;
      result.function_ = function_;
      result.virtualFunction_ = virtualFunction_;
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
      if (other instanceof opi_api.storage.v1.NvmeControllerPciId) {
        return mergeFrom((opi_api.storage.v1.NvmeControllerPciId)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.NvmeControllerPciId other) {
      if (other == opi_api.storage.v1.NvmeControllerPciId.getDefaultInstance()) return this;
      if (other.getBus() != 0) {
        setBus(other.getBus());
      }
      if (other.getDevice() != 0) {
        setDevice(other.getDevice());
      }
      if (other.getFunction() != 0) {
        setFunction(other.getFunction());
      }
      if (other.getVirtualFunction() != 0) {
        setVirtualFunction(other.getVirtualFunction());
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
      opi_api.storage.v1.NvmeControllerPciId parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.NvmeControllerPciId) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bus_ ;
    /**
     * <pre>
     * Bus number, provided for future usage if needed. Currently set to ’0’
     * </pre>
     *
     * <code>int32 bus = 1;</code>
     * @return The bus.
     */
    @java.lang.Override
    public int getBus() {
      return bus_;
    }
    /**
     * <pre>
     * Bus number, provided for future usage if needed. Currently set to ’0’
     * </pre>
     *
     * <code>int32 bus = 1;</code>
     * @param value The bus to set.
     * @return This builder for chaining.
     */
    public Builder setBus(int value) {
      
      bus_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Bus number, provided for future usage if needed. Currently set to ’0’
     * </pre>
     *
     * <code>int32 bus = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBus() {
      
      bus_ = 0;
      onChanged();
      return this;
    }

    private int device_ ;
    /**
     * <pre>
     * Device number, based on the NVMe device layout
     * </pre>
     *
     * <code>int32 device = 2;</code>
     * @return The device.
     */
    @java.lang.Override
    public int getDevice() {
      return device_;
    }
    /**
     * <pre>
     * Device number, based on the NVMe device layout
     * </pre>
     *
     * <code>int32 device = 2;</code>
     * @param value The device to set.
     * @return This builder for chaining.
     */
    public Builder setDevice(int value) {
      
      device_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Device number, based on the NVMe device layout
     * </pre>
     *
     * <code>int32 device = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDevice() {
      
      device_ = 0;
      onChanged();
      return this;
    }

    private int function_ ;
    /**
     * <pre>
     * Physical function, always set to 0 in current model
     * </pre>
     *
     * <code>int32 function = 3;</code>
     * @return The function.
     */
    @java.lang.Override
    public int getFunction() {
      return function_;
    }
    /**
     * <pre>
     * Physical function, always set to 0 in current model
     * </pre>
     *
     * <code>int32 function = 3;</code>
     * @param value The function to set.
     * @return This builder for chaining.
     */
    public Builder setFunction(int value) {
      
      function_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Physical function, always set to 0 in current model
     * </pre>
     *
     * <code>int32 function = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFunction() {
      
      function_ = 0;
      onChanged();
      return this;
    }

    private int virtualFunction_ ;
    /**
     * <pre>
     * SRIOV Virtual function within the Device and Physical function.
     * Set to 0 for Physical Function. Virtual Function numbering starts from 1
     * </pre>
     *
     * <code>int32 virtual_function = 4;</code>
     * @return The virtualFunction.
     */
    @java.lang.Override
    public int getVirtualFunction() {
      return virtualFunction_;
    }
    /**
     * <pre>
     * SRIOV Virtual function within the Device and Physical function.
     * Set to 0 for Physical Function. Virtual Function numbering starts from 1
     * </pre>
     *
     * <code>int32 virtual_function = 4;</code>
     * @param value The virtualFunction to set.
     * @return This builder for chaining.
     */
    public Builder setVirtualFunction(int value) {
      
      virtualFunction_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * SRIOV Virtual function within the Device and Physical function.
     * Set to 0 for Physical Function. Virtual Function numbering starts from 1
     * </pre>
     *
     * <code>int32 virtual_function = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearVirtualFunction() {
      
      virtualFunction_ = 0;
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.NvmeControllerPciId)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.NvmeControllerPciId)
  private static final opi_api.storage.v1.NvmeControllerPciId DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.NvmeControllerPciId();
  }

  public static opi_api.storage.v1.NvmeControllerPciId getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NvmeControllerPciId>
      PARSER = new com.google.protobuf.AbstractParser<NvmeControllerPciId>() {
    @java.lang.Override
    public NvmeControllerPciId parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NvmeControllerPciId(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NvmeControllerPciId> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NvmeControllerPciId> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.NvmeControllerPciId getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

