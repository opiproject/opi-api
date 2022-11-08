// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_nvme_pcie.proto

package opi_api.storage.v1;

/**
 * Protobuf type {@code opi_api.storage.v1.NVMeNamespaceGetRequest}
 */
public final class NVMeNamespaceGetRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.NVMeNamespaceGetRequest)
    NVMeNamespaceGetRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NVMeNamespaceGetRequest.newBuilder() to construct.
  private NVMeNamespaceGetRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NVMeNamespaceGetRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NVMeNamespaceGetRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NVMeNamespaceGetRequest(
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
            opi_api.common.v1.ObjectKey.Builder subBuilder = null;
            if (namespaceId_ != null) {
              subBuilder = namespaceId_.toBuilder();
            }
            namespaceId_ = input.readMessage(opi_api.common.v1.ObjectKey.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(namespaceId_);
              namespaceId_ = subBuilder.buildPartial();
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
    return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_NVMeNamespaceGetRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_NVMeNamespaceGetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.NVMeNamespaceGetRequest.class, opi_api.storage.v1.NVMeNamespaceGetRequest.Builder.class);
  }

  public static final int NAMESPACE_ID_FIELD_NUMBER = 1;
  private opi_api.common.v1.ObjectKey namespaceId_;
  /**
   * <code>.opi_api.common.v1.ObjectKey namespace_id = 1;</code>
   * @return Whether the namespaceId field is set.
   */
  @java.lang.Override
  public boolean hasNamespaceId() {
    return namespaceId_ != null;
  }
  /**
   * <code>.opi_api.common.v1.ObjectKey namespace_id = 1;</code>
   * @return The namespaceId.
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKey getNamespaceId() {
    return namespaceId_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : namespaceId_;
  }
  /**
   * <code>.opi_api.common.v1.ObjectKey namespace_id = 1;</code>
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKeyOrBuilder getNamespaceIdOrBuilder() {
    return getNamespaceId();
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
    if (namespaceId_ != null) {
      output.writeMessage(1, getNamespaceId());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (namespaceId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getNamespaceId());
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
    if (!(obj instanceof opi_api.storage.v1.NVMeNamespaceGetRequest)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.NVMeNamespaceGetRequest other = (opi_api.storage.v1.NVMeNamespaceGetRequest) obj;

    if (hasNamespaceId() != other.hasNamespaceId()) return false;
    if (hasNamespaceId()) {
      if (!getNamespaceId()
          .equals(other.getNamespaceId())) return false;
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
    if (hasNamespaceId()) {
      hash = (37 * hash) + NAMESPACE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getNamespaceId().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.NVMeNamespaceGetRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.NVMeNamespaceGetRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.NVMeNamespaceGetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.NVMeNamespaceGetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.NVMeNamespaceGetRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.NVMeNamespaceGetRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.NVMeNamespaceGetRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.NVMeNamespaceGetRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.NVMeNamespaceGetRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.NVMeNamespaceGetRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.NVMeNamespaceGetRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.NVMeNamespaceGetRequest parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.NVMeNamespaceGetRequest prototype) {
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
   * Protobuf type {@code opi_api.storage.v1.NVMeNamespaceGetRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.NVMeNamespaceGetRequest)
      opi_api.storage.v1.NVMeNamespaceGetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_NVMeNamespaceGetRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_NVMeNamespaceGetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.NVMeNamespaceGetRequest.class, opi_api.storage.v1.NVMeNamespaceGetRequest.Builder.class);
    }

    // Construct using opi_api.storage.v1.NVMeNamespaceGetRequest.newBuilder()
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
      if (namespaceIdBuilder_ == null) {
        namespaceId_ = null;
      } else {
        namespaceId_ = null;
        namespaceIdBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_NVMeNamespaceGetRequest_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.NVMeNamespaceGetRequest getDefaultInstanceForType() {
      return opi_api.storage.v1.NVMeNamespaceGetRequest.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.NVMeNamespaceGetRequest build() {
      opi_api.storage.v1.NVMeNamespaceGetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.NVMeNamespaceGetRequest buildPartial() {
      opi_api.storage.v1.NVMeNamespaceGetRequest result = new opi_api.storage.v1.NVMeNamespaceGetRequest(this);
      if (namespaceIdBuilder_ == null) {
        result.namespaceId_ = namespaceId_;
      } else {
        result.namespaceId_ = namespaceIdBuilder_.build();
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
      if (other instanceof opi_api.storage.v1.NVMeNamespaceGetRequest) {
        return mergeFrom((opi_api.storage.v1.NVMeNamespaceGetRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.NVMeNamespaceGetRequest other) {
      if (other == opi_api.storage.v1.NVMeNamespaceGetRequest.getDefaultInstance()) return this;
      if (other.hasNamespaceId()) {
        mergeNamespaceId(other.getNamespaceId());
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
      opi_api.storage.v1.NVMeNamespaceGetRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.NVMeNamespaceGetRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private opi_api.common.v1.ObjectKey namespaceId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> namespaceIdBuilder_;
    /**
     * <code>.opi_api.common.v1.ObjectKey namespace_id = 1;</code>
     * @return Whether the namespaceId field is set.
     */
    public boolean hasNamespaceId() {
      return namespaceIdBuilder_ != null || namespaceId_ != null;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey namespace_id = 1;</code>
     * @return The namespaceId.
     */
    public opi_api.common.v1.ObjectKey getNamespaceId() {
      if (namespaceIdBuilder_ == null) {
        return namespaceId_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : namespaceId_;
      } else {
        return namespaceIdBuilder_.getMessage();
      }
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey namespace_id = 1;</code>
     */
    public Builder setNamespaceId(opi_api.common.v1.ObjectKey value) {
      if (namespaceIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        namespaceId_ = value;
        onChanged();
      } else {
        namespaceIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey namespace_id = 1;</code>
     */
    public Builder setNamespaceId(
        opi_api.common.v1.ObjectKey.Builder builderForValue) {
      if (namespaceIdBuilder_ == null) {
        namespaceId_ = builderForValue.build();
        onChanged();
      } else {
        namespaceIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey namespace_id = 1;</code>
     */
    public Builder mergeNamespaceId(opi_api.common.v1.ObjectKey value) {
      if (namespaceIdBuilder_ == null) {
        if (namespaceId_ != null) {
          namespaceId_ =
            opi_api.common.v1.ObjectKey.newBuilder(namespaceId_).mergeFrom(value).buildPartial();
        } else {
          namespaceId_ = value;
        }
        onChanged();
      } else {
        namespaceIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey namespace_id = 1;</code>
     */
    public Builder clearNamespaceId() {
      if (namespaceIdBuilder_ == null) {
        namespaceId_ = null;
        onChanged();
      } else {
        namespaceId_ = null;
        namespaceIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey namespace_id = 1;</code>
     */
    public opi_api.common.v1.ObjectKey.Builder getNamespaceIdBuilder() {
      
      onChanged();
      return getNamespaceIdFieldBuilder().getBuilder();
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey namespace_id = 1;</code>
     */
    public opi_api.common.v1.ObjectKeyOrBuilder getNamespaceIdOrBuilder() {
      if (namespaceIdBuilder_ != null) {
        return namespaceIdBuilder_.getMessageOrBuilder();
      } else {
        return namespaceId_ == null ?
            opi_api.common.v1.ObjectKey.getDefaultInstance() : namespaceId_;
      }
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey namespace_id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> 
        getNamespaceIdFieldBuilder() {
      if (namespaceIdBuilder_ == null) {
        namespaceIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder>(
                getNamespaceId(),
                getParentForChildren(),
                isClean());
        namespaceId_ = null;
      }
      return namespaceIdBuilder_;
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.NVMeNamespaceGetRequest)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeNamespaceGetRequest)
  private static final opi_api.storage.v1.NVMeNamespaceGetRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.NVMeNamespaceGetRequest();
  }

  public static opi_api.storage.v1.NVMeNamespaceGetRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NVMeNamespaceGetRequest>
      PARSER = new com.google.protobuf.AbstractParser<NVMeNamespaceGetRequest>() {
    @java.lang.Override
    public NVMeNamespaceGetRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NVMeNamespaceGetRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NVMeNamespaceGetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NVMeNamespaceGetRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.NVMeNamespaceGetRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

