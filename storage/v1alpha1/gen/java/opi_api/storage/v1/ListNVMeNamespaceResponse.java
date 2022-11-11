// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_nvme_pcie.proto

package opi_api.storage.v1;

/**
 * Protobuf type {@code opi_api.storage.v1.ListNVMeNamespaceResponse}
 */
public final class ListNVMeNamespaceResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.ListNVMeNamespaceResponse)
    ListNVMeNamespaceResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListNVMeNamespaceResponse.newBuilder() to construct.
  private ListNVMeNamespaceResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListNVMeNamespaceResponse() {
    namespaces_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListNVMeNamespaceResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListNVMeNamespaceResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              namespaces_ = new java.util.ArrayList<opi_api.storage.v1.NVMeNamespace>();
              mutable_bitField0_ |= 0x00000001;
            }
            namespaces_.add(
                input.readMessage(opi_api.storage.v1.NVMeNamespace.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        namespaces_ = java.util.Collections.unmodifiableList(namespaces_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_ListNVMeNamespaceResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_ListNVMeNamespaceResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.ListNVMeNamespaceResponse.class, opi_api.storage.v1.ListNVMeNamespaceResponse.Builder.class);
  }

  public static final int NAMESPACES_FIELD_NUMBER = 1;
  private java.util.List<opi_api.storage.v1.NVMeNamespace> namespaces_;
  /**
   * <code>repeated .opi_api.storage.v1.NVMeNamespace namespaces = 1;</code>
   */
  @java.lang.Override
  public java.util.List<opi_api.storage.v1.NVMeNamespace> getNamespacesList() {
    return namespaces_;
  }
  /**
   * <code>repeated .opi_api.storage.v1.NVMeNamespace namespaces = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends opi_api.storage.v1.NVMeNamespaceOrBuilder> 
      getNamespacesOrBuilderList() {
    return namespaces_;
  }
  /**
   * <code>repeated .opi_api.storage.v1.NVMeNamespace namespaces = 1;</code>
   */
  @java.lang.Override
  public int getNamespacesCount() {
    return namespaces_.size();
  }
  /**
   * <code>repeated .opi_api.storage.v1.NVMeNamespace namespaces = 1;</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.NVMeNamespace getNamespaces(int index) {
    return namespaces_.get(index);
  }
  /**
   * <code>repeated .opi_api.storage.v1.NVMeNamespace namespaces = 1;</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.NVMeNamespaceOrBuilder getNamespacesOrBuilder(
      int index) {
    return namespaces_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < namespaces_.size(); i++) {
      output.writeMessage(1, namespaces_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < namespaces_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, namespaces_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof opi_api.storage.v1.ListNVMeNamespaceResponse)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.ListNVMeNamespaceResponse other = (opi_api.storage.v1.ListNVMeNamespaceResponse) obj;

    if (!getNamespacesList()
        .equals(other.getNamespacesList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getNamespacesCount() > 0) {
      hash = (37 * hash) + NAMESPACES_FIELD_NUMBER;
      hash = (53 * hash) + getNamespacesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.ListNVMeNamespaceResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.ListNVMeNamespaceResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.ListNVMeNamespaceResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.ListNVMeNamespaceResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.ListNVMeNamespaceResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.ListNVMeNamespaceResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.ListNVMeNamespaceResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.ListNVMeNamespaceResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.ListNVMeNamespaceResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.ListNVMeNamespaceResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.ListNVMeNamespaceResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.ListNVMeNamespaceResponse parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.ListNVMeNamespaceResponse prototype) {
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
   * Protobuf type {@code opi_api.storage.v1.ListNVMeNamespaceResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.ListNVMeNamespaceResponse)
      opi_api.storage.v1.ListNVMeNamespaceResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_ListNVMeNamespaceResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_ListNVMeNamespaceResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.ListNVMeNamespaceResponse.class, opi_api.storage.v1.ListNVMeNamespaceResponse.Builder.class);
    }

    // Construct using opi_api.storage.v1.ListNVMeNamespaceResponse.newBuilder()
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
        getNamespacesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (namespacesBuilder_ == null) {
        namespaces_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        namespacesBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_ListNVMeNamespaceResponse_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.ListNVMeNamespaceResponse getDefaultInstanceForType() {
      return opi_api.storage.v1.ListNVMeNamespaceResponse.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.ListNVMeNamespaceResponse build() {
      opi_api.storage.v1.ListNVMeNamespaceResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.ListNVMeNamespaceResponse buildPartial() {
      opi_api.storage.v1.ListNVMeNamespaceResponse result = new opi_api.storage.v1.ListNVMeNamespaceResponse(this);
      int from_bitField0_ = bitField0_;
      if (namespacesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          namespaces_ = java.util.Collections.unmodifiableList(namespaces_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.namespaces_ = namespaces_;
      } else {
        result.namespaces_ = namespacesBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof opi_api.storage.v1.ListNVMeNamespaceResponse) {
        return mergeFrom((opi_api.storage.v1.ListNVMeNamespaceResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.ListNVMeNamespaceResponse other) {
      if (other == opi_api.storage.v1.ListNVMeNamespaceResponse.getDefaultInstance()) return this;
      if (namespacesBuilder_ == null) {
        if (!other.namespaces_.isEmpty()) {
          if (namespaces_.isEmpty()) {
            namespaces_ = other.namespaces_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureNamespacesIsMutable();
            namespaces_.addAll(other.namespaces_);
          }
          onChanged();
        }
      } else {
        if (!other.namespaces_.isEmpty()) {
          if (namespacesBuilder_.isEmpty()) {
            namespacesBuilder_.dispose();
            namespacesBuilder_ = null;
            namespaces_ = other.namespaces_;
            bitField0_ = (bitField0_ & ~0x00000001);
            namespacesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getNamespacesFieldBuilder() : null;
          } else {
            namespacesBuilder_.addAllMessages(other.namespaces_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      opi_api.storage.v1.ListNVMeNamespaceResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.ListNVMeNamespaceResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<opi_api.storage.v1.NVMeNamespace> namespaces_ =
      java.util.Collections.emptyList();
    private void ensureNamespacesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        namespaces_ = new java.util.ArrayList<opi_api.storage.v1.NVMeNamespace>(namespaces_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.storage.v1.NVMeNamespace, opi_api.storage.v1.NVMeNamespace.Builder, opi_api.storage.v1.NVMeNamespaceOrBuilder> namespacesBuilder_;

    /**
     * <code>repeated .opi_api.storage.v1.NVMeNamespace namespaces = 1;</code>
     */
    public java.util.List<opi_api.storage.v1.NVMeNamespace> getNamespacesList() {
      if (namespacesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(namespaces_);
      } else {
        return namespacesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMeNamespace namespaces = 1;</code>
     */
    public int getNamespacesCount() {
      if (namespacesBuilder_ == null) {
        return namespaces_.size();
      } else {
        return namespacesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMeNamespace namespaces = 1;</code>
     */
    public opi_api.storage.v1.NVMeNamespace getNamespaces(int index) {
      if (namespacesBuilder_ == null) {
        return namespaces_.get(index);
      } else {
        return namespacesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMeNamespace namespaces = 1;</code>
     */
    public Builder setNamespaces(
        int index, opi_api.storage.v1.NVMeNamespace value) {
      if (namespacesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNamespacesIsMutable();
        namespaces_.set(index, value);
        onChanged();
      } else {
        namespacesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMeNamespace namespaces = 1;</code>
     */
    public Builder setNamespaces(
        int index, opi_api.storage.v1.NVMeNamespace.Builder builderForValue) {
      if (namespacesBuilder_ == null) {
        ensureNamespacesIsMutable();
        namespaces_.set(index, builderForValue.build());
        onChanged();
      } else {
        namespacesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMeNamespace namespaces = 1;</code>
     */
    public Builder addNamespaces(opi_api.storage.v1.NVMeNamespace value) {
      if (namespacesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNamespacesIsMutable();
        namespaces_.add(value);
        onChanged();
      } else {
        namespacesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMeNamespace namespaces = 1;</code>
     */
    public Builder addNamespaces(
        int index, opi_api.storage.v1.NVMeNamespace value) {
      if (namespacesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNamespacesIsMutable();
        namespaces_.add(index, value);
        onChanged();
      } else {
        namespacesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMeNamespace namespaces = 1;</code>
     */
    public Builder addNamespaces(
        opi_api.storage.v1.NVMeNamespace.Builder builderForValue) {
      if (namespacesBuilder_ == null) {
        ensureNamespacesIsMutable();
        namespaces_.add(builderForValue.build());
        onChanged();
      } else {
        namespacesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMeNamespace namespaces = 1;</code>
     */
    public Builder addNamespaces(
        int index, opi_api.storage.v1.NVMeNamespace.Builder builderForValue) {
      if (namespacesBuilder_ == null) {
        ensureNamespacesIsMutable();
        namespaces_.add(index, builderForValue.build());
        onChanged();
      } else {
        namespacesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMeNamespace namespaces = 1;</code>
     */
    public Builder addAllNamespaces(
        java.lang.Iterable<? extends opi_api.storage.v1.NVMeNamespace> values) {
      if (namespacesBuilder_ == null) {
        ensureNamespacesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, namespaces_);
        onChanged();
      } else {
        namespacesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMeNamespace namespaces = 1;</code>
     */
    public Builder clearNamespaces() {
      if (namespacesBuilder_ == null) {
        namespaces_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        namespacesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMeNamespace namespaces = 1;</code>
     */
    public Builder removeNamespaces(int index) {
      if (namespacesBuilder_ == null) {
        ensureNamespacesIsMutable();
        namespaces_.remove(index);
        onChanged();
      } else {
        namespacesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMeNamespace namespaces = 1;</code>
     */
    public opi_api.storage.v1.NVMeNamespace.Builder getNamespacesBuilder(
        int index) {
      return getNamespacesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMeNamespace namespaces = 1;</code>
     */
    public opi_api.storage.v1.NVMeNamespaceOrBuilder getNamespacesOrBuilder(
        int index) {
      if (namespacesBuilder_ == null) {
        return namespaces_.get(index);  } else {
        return namespacesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMeNamespace namespaces = 1;</code>
     */
    public java.util.List<? extends opi_api.storage.v1.NVMeNamespaceOrBuilder> 
         getNamespacesOrBuilderList() {
      if (namespacesBuilder_ != null) {
        return namespacesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(namespaces_);
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMeNamespace namespaces = 1;</code>
     */
    public opi_api.storage.v1.NVMeNamespace.Builder addNamespacesBuilder() {
      return getNamespacesFieldBuilder().addBuilder(
          opi_api.storage.v1.NVMeNamespace.getDefaultInstance());
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMeNamespace namespaces = 1;</code>
     */
    public opi_api.storage.v1.NVMeNamespace.Builder addNamespacesBuilder(
        int index) {
      return getNamespacesFieldBuilder().addBuilder(
          index, opi_api.storage.v1.NVMeNamespace.getDefaultInstance());
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMeNamespace namespaces = 1;</code>
     */
    public java.util.List<opi_api.storage.v1.NVMeNamespace.Builder> 
         getNamespacesBuilderList() {
      return getNamespacesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.storage.v1.NVMeNamespace, opi_api.storage.v1.NVMeNamespace.Builder, opi_api.storage.v1.NVMeNamespaceOrBuilder> 
        getNamespacesFieldBuilder() {
      if (namespacesBuilder_ == null) {
        namespacesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            opi_api.storage.v1.NVMeNamespace, opi_api.storage.v1.NVMeNamespace.Builder, opi_api.storage.v1.NVMeNamespaceOrBuilder>(
                namespaces_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        namespaces_ = null;
      }
      return namespacesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.ListNVMeNamespaceResponse)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListNVMeNamespaceResponse)
  private static final opi_api.storage.v1.ListNVMeNamespaceResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.ListNVMeNamespaceResponse();
  }

  public static opi_api.storage.v1.ListNVMeNamespaceResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListNVMeNamespaceResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListNVMeNamespaceResponse>() {
    @java.lang.Override
    public ListNVMeNamespaceResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListNVMeNamespaceResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListNVMeNamespaceResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListNVMeNamespaceResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.ListNVMeNamespaceResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

