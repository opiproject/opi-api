// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_nvme_pcie.proto

package opi_api.storage.v1;

/**
 * Protobuf type {@code opi_api.storage.v1.CreateNVMeSubsystemRequest}
 */
public final class CreateNVMeSubsystemRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.CreateNVMeSubsystemRequest)
    CreateNVMeSubsystemRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateNVMeSubsystemRequest.newBuilder() to construct.
  private CreateNVMeSubsystemRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateNVMeSubsystemRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateNVMeSubsystemRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateNVMeSubsystemRequest(
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
            opi_api.storage.v1.NVMeSubsystem.Builder subBuilder = null;
            if (subsystem_ != null) {
              subBuilder = subsystem_.toBuilder();
            }
            subsystem_ = input.readMessage(opi_api.storage.v1.NVMeSubsystem.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(subsystem_);
              subsystem_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            opi_api.common.v1.ObjectKey.Builder subBuilder = null;
            if (txnId_ != null) {
              subBuilder = txnId_.toBuilder();
            }
            txnId_ = input.readMessage(opi_api.common.v1.ObjectKey.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(txnId_);
              txnId_ = subBuilder.buildPartial();
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
    return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_CreateNVMeSubsystemRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_CreateNVMeSubsystemRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.CreateNVMeSubsystemRequest.class, opi_api.storage.v1.CreateNVMeSubsystemRequest.Builder.class);
  }

  public static final int SUBSYSTEM_FIELD_NUMBER = 1;
  private opi_api.storage.v1.NVMeSubsystem subsystem_;
  /**
   * <code>.opi_api.storage.v1.NVMeSubsystem subsystem = 1;</code>
   * @return Whether the subsystem field is set.
   */
  @java.lang.Override
  public boolean hasSubsystem() {
    return subsystem_ != null;
  }
  /**
   * <code>.opi_api.storage.v1.NVMeSubsystem subsystem = 1;</code>
   * @return The subsystem.
   */
  @java.lang.Override
  public opi_api.storage.v1.NVMeSubsystem getSubsystem() {
    return subsystem_ == null ? opi_api.storage.v1.NVMeSubsystem.getDefaultInstance() : subsystem_;
  }
  /**
   * <code>.opi_api.storage.v1.NVMeSubsystem subsystem = 1;</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.NVMeSubsystemOrBuilder getSubsystemOrBuilder() {
    return getSubsystem();
  }

  public static final int TXN_ID_FIELD_NUMBER = 2;
  private opi_api.common.v1.ObjectKey txnId_;
  /**
   * <code>.opi_api.common.v1.ObjectKey txn_id = 2;</code>
   * @return Whether the txnId field is set.
   */
  @java.lang.Override
  public boolean hasTxnId() {
    return txnId_ != null;
  }
  /**
   * <code>.opi_api.common.v1.ObjectKey txn_id = 2;</code>
   * @return The txnId.
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKey getTxnId() {
    return txnId_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : txnId_;
  }
  /**
   * <code>.opi_api.common.v1.ObjectKey txn_id = 2;</code>
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKeyOrBuilder getTxnIdOrBuilder() {
    return getTxnId();
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
    if (subsystem_ != null) {
      output.writeMessage(1, getSubsystem());
    }
    if (txnId_ != null) {
      output.writeMessage(2, getTxnId());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (subsystem_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSubsystem());
    }
    if (txnId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTxnId());
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
    if (!(obj instanceof opi_api.storage.v1.CreateNVMeSubsystemRequest)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.CreateNVMeSubsystemRequest other = (opi_api.storage.v1.CreateNVMeSubsystemRequest) obj;

    if (hasSubsystem() != other.hasSubsystem()) return false;
    if (hasSubsystem()) {
      if (!getSubsystem()
          .equals(other.getSubsystem())) return false;
    }
    if (hasTxnId() != other.hasTxnId()) return false;
    if (hasTxnId()) {
      if (!getTxnId()
          .equals(other.getTxnId())) return false;
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
    if (hasSubsystem()) {
      hash = (37 * hash) + SUBSYSTEM_FIELD_NUMBER;
      hash = (53 * hash) + getSubsystem().hashCode();
    }
    if (hasTxnId()) {
      hash = (37 * hash) + TXN_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTxnId().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.CreateNVMeSubsystemRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.CreateNVMeSubsystemRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateNVMeSubsystemRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.CreateNVMeSubsystemRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateNVMeSubsystemRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.CreateNVMeSubsystemRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateNVMeSubsystemRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.CreateNVMeSubsystemRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateNVMeSubsystemRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.CreateNVMeSubsystemRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateNVMeSubsystemRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.CreateNVMeSubsystemRequest parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.CreateNVMeSubsystemRequest prototype) {
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
   * Protobuf type {@code opi_api.storage.v1.CreateNVMeSubsystemRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.CreateNVMeSubsystemRequest)
      opi_api.storage.v1.CreateNVMeSubsystemRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_CreateNVMeSubsystemRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_CreateNVMeSubsystemRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.CreateNVMeSubsystemRequest.class, opi_api.storage.v1.CreateNVMeSubsystemRequest.Builder.class);
    }

    // Construct using opi_api.storage.v1.CreateNVMeSubsystemRequest.newBuilder()
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
      if (subsystemBuilder_ == null) {
        subsystem_ = null;
      } else {
        subsystem_ = null;
        subsystemBuilder_ = null;
      }
      if (txnIdBuilder_ == null) {
        txnId_ = null;
      } else {
        txnId_ = null;
        txnIdBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_CreateNVMeSubsystemRequest_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.CreateNVMeSubsystemRequest getDefaultInstanceForType() {
      return opi_api.storage.v1.CreateNVMeSubsystemRequest.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.CreateNVMeSubsystemRequest build() {
      opi_api.storage.v1.CreateNVMeSubsystemRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.CreateNVMeSubsystemRequest buildPartial() {
      opi_api.storage.v1.CreateNVMeSubsystemRequest result = new opi_api.storage.v1.CreateNVMeSubsystemRequest(this);
      if (subsystemBuilder_ == null) {
        result.subsystem_ = subsystem_;
      } else {
        result.subsystem_ = subsystemBuilder_.build();
      }
      if (txnIdBuilder_ == null) {
        result.txnId_ = txnId_;
      } else {
        result.txnId_ = txnIdBuilder_.build();
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
      if (other instanceof opi_api.storage.v1.CreateNVMeSubsystemRequest) {
        return mergeFrom((opi_api.storage.v1.CreateNVMeSubsystemRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.CreateNVMeSubsystemRequest other) {
      if (other == opi_api.storage.v1.CreateNVMeSubsystemRequest.getDefaultInstance()) return this;
      if (other.hasSubsystem()) {
        mergeSubsystem(other.getSubsystem());
      }
      if (other.hasTxnId()) {
        mergeTxnId(other.getTxnId());
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
      opi_api.storage.v1.CreateNVMeSubsystemRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.CreateNVMeSubsystemRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private opi_api.storage.v1.NVMeSubsystem subsystem_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.NVMeSubsystem, opi_api.storage.v1.NVMeSubsystem.Builder, opi_api.storage.v1.NVMeSubsystemOrBuilder> subsystemBuilder_;
    /**
     * <code>.opi_api.storage.v1.NVMeSubsystem subsystem = 1;</code>
     * @return Whether the subsystem field is set.
     */
    public boolean hasSubsystem() {
      return subsystemBuilder_ != null || subsystem_ != null;
    }
    /**
     * <code>.opi_api.storage.v1.NVMeSubsystem subsystem = 1;</code>
     * @return The subsystem.
     */
    public opi_api.storage.v1.NVMeSubsystem getSubsystem() {
      if (subsystemBuilder_ == null) {
        return subsystem_ == null ? opi_api.storage.v1.NVMeSubsystem.getDefaultInstance() : subsystem_;
      } else {
        return subsystemBuilder_.getMessage();
      }
    }
    /**
     * <code>.opi_api.storage.v1.NVMeSubsystem subsystem = 1;</code>
     */
    public Builder setSubsystem(opi_api.storage.v1.NVMeSubsystem value) {
      if (subsystemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        subsystem_ = value;
        onChanged();
      } else {
        subsystemBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.NVMeSubsystem subsystem = 1;</code>
     */
    public Builder setSubsystem(
        opi_api.storage.v1.NVMeSubsystem.Builder builderForValue) {
      if (subsystemBuilder_ == null) {
        subsystem_ = builderForValue.build();
        onChanged();
      } else {
        subsystemBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.NVMeSubsystem subsystem = 1;</code>
     */
    public Builder mergeSubsystem(opi_api.storage.v1.NVMeSubsystem value) {
      if (subsystemBuilder_ == null) {
        if (subsystem_ != null) {
          subsystem_ =
            opi_api.storage.v1.NVMeSubsystem.newBuilder(subsystem_).mergeFrom(value).buildPartial();
        } else {
          subsystem_ = value;
        }
        onChanged();
      } else {
        subsystemBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.NVMeSubsystem subsystem = 1;</code>
     */
    public Builder clearSubsystem() {
      if (subsystemBuilder_ == null) {
        subsystem_ = null;
        onChanged();
      } else {
        subsystem_ = null;
        subsystemBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.NVMeSubsystem subsystem = 1;</code>
     */
    public opi_api.storage.v1.NVMeSubsystem.Builder getSubsystemBuilder() {
      
      onChanged();
      return getSubsystemFieldBuilder().getBuilder();
    }
    /**
     * <code>.opi_api.storage.v1.NVMeSubsystem subsystem = 1;</code>
     */
    public opi_api.storage.v1.NVMeSubsystemOrBuilder getSubsystemOrBuilder() {
      if (subsystemBuilder_ != null) {
        return subsystemBuilder_.getMessageOrBuilder();
      } else {
        return subsystem_ == null ?
            opi_api.storage.v1.NVMeSubsystem.getDefaultInstance() : subsystem_;
      }
    }
    /**
     * <code>.opi_api.storage.v1.NVMeSubsystem subsystem = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.NVMeSubsystem, opi_api.storage.v1.NVMeSubsystem.Builder, opi_api.storage.v1.NVMeSubsystemOrBuilder> 
        getSubsystemFieldBuilder() {
      if (subsystemBuilder_ == null) {
        subsystemBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.storage.v1.NVMeSubsystem, opi_api.storage.v1.NVMeSubsystem.Builder, opi_api.storage.v1.NVMeSubsystemOrBuilder>(
                getSubsystem(),
                getParentForChildren(),
                isClean());
        subsystem_ = null;
      }
      return subsystemBuilder_;
    }

    private opi_api.common.v1.ObjectKey txnId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> txnIdBuilder_;
    /**
     * <code>.opi_api.common.v1.ObjectKey txn_id = 2;</code>
     * @return Whether the txnId field is set.
     */
    public boolean hasTxnId() {
      return txnIdBuilder_ != null || txnId_ != null;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey txn_id = 2;</code>
     * @return The txnId.
     */
    public opi_api.common.v1.ObjectKey getTxnId() {
      if (txnIdBuilder_ == null) {
        return txnId_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : txnId_;
      } else {
        return txnIdBuilder_.getMessage();
      }
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey txn_id = 2;</code>
     */
    public Builder setTxnId(opi_api.common.v1.ObjectKey value) {
      if (txnIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        txnId_ = value;
        onChanged();
      } else {
        txnIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey txn_id = 2;</code>
     */
    public Builder setTxnId(
        opi_api.common.v1.ObjectKey.Builder builderForValue) {
      if (txnIdBuilder_ == null) {
        txnId_ = builderForValue.build();
        onChanged();
      } else {
        txnIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey txn_id = 2;</code>
     */
    public Builder mergeTxnId(opi_api.common.v1.ObjectKey value) {
      if (txnIdBuilder_ == null) {
        if (txnId_ != null) {
          txnId_ =
            opi_api.common.v1.ObjectKey.newBuilder(txnId_).mergeFrom(value).buildPartial();
        } else {
          txnId_ = value;
        }
        onChanged();
      } else {
        txnIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey txn_id = 2;</code>
     */
    public Builder clearTxnId() {
      if (txnIdBuilder_ == null) {
        txnId_ = null;
        onChanged();
      } else {
        txnId_ = null;
        txnIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey txn_id = 2;</code>
     */
    public opi_api.common.v1.ObjectKey.Builder getTxnIdBuilder() {
      
      onChanged();
      return getTxnIdFieldBuilder().getBuilder();
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey txn_id = 2;</code>
     */
    public opi_api.common.v1.ObjectKeyOrBuilder getTxnIdOrBuilder() {
      if (txnIdBuilder_ != null) {
        return txnIdBuilder_.getMessageOrBuilder();
      } else {
        return txnId_ == null ?
            opi_api.common.v1.ObjectKey.getDefaultInstance() : txnId_;
      }
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey txn_id = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> 
        getTxnIdFieldBuilder() {
      if (txnIdBuilder_ == null) {
        txnIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder>(
                getTxnId(),
                getParentForChildren(),
                isClean());
        txnId_ = null;
      }
      return txnIdBuilder_;
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.CreateNVMeSubsystemRequest)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.CreateNVMeSubsystemRequest)
  private static final opi_api.storage.v1.CreateNVMeSubsystemRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.CreateNVMeSubsystemRequest();
  }

  public static opi_api.storage.v1.CreateNVMeSubsystemRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateNVMeSubsystemRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateNVMeSubsystemRequest>() {
    @java.lang.Override
    public CreateNVMeSubsystemRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateNVMeSubsystemRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateNVMeSubsystemRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateNVMeSubsystemRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.CreateNVMeSubsystemRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

