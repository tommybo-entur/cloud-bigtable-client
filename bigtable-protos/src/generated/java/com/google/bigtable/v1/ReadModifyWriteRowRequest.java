// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/v1/bigtable_service_messages.proto

package com.google.bigtable.v1;

/**
 * Protobuf type {@code google.bigtable.v1.ReadModifyWriteRowRequest}
 *
 * <pre>
 * Request message for BigtableService.ReadModifyWriteRowRequest.
 * </pre>
 */
public  final class ReadModifyWriteRowRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.bigtable.v1.ReadModifyWriteRowRequest)
    ReadModifyWriteRowRequestOrBuilder {
  // Use ReadModifyWriteRowRequest.newBuilder() to construct.
  private ReadModifyWriteRowRequest(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private ReadModifyWriteRowRequest() {
    tableName_ = "";
    rowKey_ = com.google.protobuf.ByteString.EMPTY;
    rules_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ReadModifyWriteRowRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.google.protobuf.ByteString bs = input.readBytes();

            tableName_ = bs;
            break;
          }
          case 18: {

            rowKey_ = input.readBytes();
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              rules_ = new java.util.ArrayList<com.google.bigtable.v1.ReadModifyWriteRule>();
              mutable_bitField0_ |= 0x00000004;
            }
            rules_.add(input.readMessage(com.google.bigtable.v1.ReadModifyWriteRule.PARSER, extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        rules_ = java.util.Collections.unmodifiableList(rules_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.bigtable.v1.BigtableServiceMessagesProto.internal_static_google_bigtable_v1_ReadModifyWriteRowRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.bigtable.v1.BigtableServiceMessagesProto.internal_static_google_bigtable_v1_ReadModifyWriteRowRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.bigtable.v1.ReadModifyWriteRowRequest.class, com.google.bigtable.v1.ReadModifyWriteRowRequest.Builder.class);
  }

  private int bitField0_;
  public static final int TABLE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object tableName_;
  /**
   * <code>optional string table_name = 1;</code>
   *
   * <pre>
   * The unique name of the table to which the read/modify/write rules should be
   * applied.
   * </pre>
   */
  public java.lang.String getTableName() {
    java.lang.Object ref = tableName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        tableName_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string table_name = 1;</code>
   *
   * <pre>
   * The unique name of the table to which the read/modify/write rules should be
   * applied.
   * </pre>
   */
  public com.google.protobuf.ByteString
      getTableNameBytes() {
    java.lang.Object ref = tableName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tableName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ROW_KEY_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString rowKey_;
  /**
   * <code>optional bytes row_key = 2;</code>
   *
   * <pre>
   * The key of the row to which the read/modify/write rules should be applied.
   * </pre>
   */
  public com.google.protobuf.ByteString getRowKey() {
    return rowKey_;
  }

  public static final int RULES_FIELD_NUMBER = 3;
  private java.util.List<com.google.bigtable.v1.ReadModifyWriteRule> rules_;
  /**
   * <code>repeated .google.bigtable.v1.ReadModifyWriteRule rules = 3;</code>
   *
   * <pre>
   * Rules specifying how the specified row's contents are to be transformed
   * into writes. Entries are applied in order, meaning that earlier rules will
   * affect the results of later ones.
   * </pre>
   */
  public java.util.List<com.google.bigtable.v1.ReadModifyWriteRule> getRulesList() {
    return rules_;
  }
  /**
   * <code>repeated .google.bigtable.v1.ReadModifyWriteRule rules = 3;</code>
   *
   * <pre>
   * Rules specifying how the specified row's contents are to be transformed
   * into writes. Entries are applied in order, meaning that earlier rules will
   * affect the results of later ones.
   * </pre>
   */
  public java.util.List<? extends com.google.bigtable.v1.ReadModifyWriteRuleOrBuilder> 
      getRulesOrBuilderList() {
    return rules_;
  }
  /**
   * <code>repeated .google.bigtable.v1.ReadModifyWriteRule rules = 3;</code>
   *
   * <pre>
   * Rules specifying how the specified row's contents are to be transformed
   * into writes. Entries are applied in order, meaning that earlier rules will
   * affect the results of later ones.
   * </pre>
   */
  public int getRulesCount() {
    return rules_.size();
  }
  /**
   * <code>repeated .google.bigtable.v1.ReadModifyWriteRule rules = 3;</code>
   *
   * <pre>
   * Rules specifying how the specified row's contents are to be transformed
   * into writes. Entries are applied in order, meaning that earlier rules will
   * affect the results of later ones.
   * </pre>
   */
  public com.google.bigtable.v1.ReadModifyWriteRule getRules(int index) {
    return rules_.get(index);
  }
  /**
   * <code>repeated .google.bigtable.v1.ReadModifyWriteRule rules = 3;</code>
   *
   * <pre>
   * Rules specifying how the specified row's contents are to be transformed
   * into writes. Entries are applied in order, meaning that earlier rules will
   * affect the results of later ones.
   * </pre>
   */
  public com.google.bigtable.v1.ReadModifyWriteRuleOrBuilder getRulesOrBuilder(
      int index) {
    return rules_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getTableNameBytes().isEmpty()) {
      output.writeBytes(1, getTableNameBytes());
    }
    if (!rowKey_.isEmpty()) {
      output.writeBytes(2, rowKey_);
    }
    for (int i = 0; i < rules_.size(); i++) {
      output.writeMessage(3, rules_.get(i));
    }
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTableNameBytes().isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, getTableNameBytes());
    }
    if (!rowKey_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, rowKey_);
    }
    for (int i = 0; i < rules_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, rules_.get(i));
    }
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.google.bigtable.v1.ReadModifyWriteRowRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.v1.ReadModifyWriteRowRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.v1.ReadModifyWriteRowRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.v1.ReadModifyWriteRowRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.v1.ReadModifyWriteRowRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.bigtable.v1.ReadModifyWriteRowRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.google.bigtable.v1.ReadModifyWriteRowRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.google.bigtable.v1.ReadModifyWriteRowRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.google.bigtable.v1.ReadModifyWriteRowRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.bigtable.v1.ReadModifyWriteRowRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.bigtable.v1.ReadModifyWriteRowRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code google.bigtable.v1.ReadModifyWriteRowRequest}
   *
   * <pre>
   * Request message for BigtableService.ReadModifyWriteRowRequest.
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.bigtable.v1.ReadModifyWriteRowRequest)
      com.google.bigtable.v1.ReadModifyWriteRowRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.bigtable.v1.BigtableServiceMessagesProto.internal_static_google_bigtable_v1_ReadModifyWriteRowRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.bigtable.v1.BigtableServiceMessagesProto.internal_static_google_bigtable_v1_ReadModifyWriteRowRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.bigtable.v1.ReadModifyWriteRowRequest.class, com.google.bigtable.v1.ReadModifyWriteRowRequest.Builder.class);
    }

    // Construct using com.google.bigtable.v1.ReadModifyWriteRowRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        getRulesFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      tableName_ = "";

      rowKey_ = com.google.protobuf.ByteString.EMPTY;

      if (rulesBuilder_ == null) {
        rules_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        rulesBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.bigtable.v1.BigtableServiceMessagesProto.internal_static_google_bigtable_v1_ReadModifyWriteRowRequest_descriptor;
    }

    public com.google.bigtable.v1.ReadModifyWriteRowRequest getDefaultInstanceForType() {
      return com.google.bigtable.v1.ReadModifyWriteRowRequest.getDefaultInstance();
    }

    public com.google.bigtable.v1.ReadModifyWriteRowRequest build() {
      com.google.bigtable.v1.ReadModifyWriteRowRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.bigtable.v1.ReadModifyWriteRowRequest buildPartial() {
      com.google.bigtable.v1.ReadModifyWriteRowRequest result = new com.google.bigtable.v1.ReadModifyWriteRowRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.tableName_ = tableName_;
      result.rowKey_ = rowKey_;
      if (rulesBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          rules_ = java.util.Collections.unmodifiableList(rules_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.rules_ = rules_;
      } else {
        result.rules_ = rulesBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.bigtable.v1.ReadModifyWriteRowRequest) {
        return mergeFrom((com.google.bigtable.v1.ReadModifyWriteRowRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.bigtable.v1.ReadModifyWriteRowRequest other) {
      if (other == com.google.bigtable.v1.ReadModifyWriteRowRequest.getDefaultInstance()) return this;
      if (!other.getTableName().isEmpty()) {
        tableName_ = other.tableName_;
        onChanged();
      }
      if (other.getRowKey() != com.google.protobuf.ByteString.EMPTY) {
        setRowKey(other.getRowKey());
      }
      if (rulesBuilder_ == null) {
        if (!other.rules_.isEmpty()) {
          if (rules_.isEmpty()) {
            rules_ = other.rules_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureRulesIsMutable();
            rules_.addAll(other.rules_);
          }
          onChanged();
        }
      } else {
        if (!other.rules_.isEmpty()) {
          if (rulesBuilder_.isEmpty()) {
            rulesBuilder_.dispose();
            rulesBuilder_ = null;
            rules_ = other.rules_;
            bitField0_ = (bitField0_ & ~0x00000004);
            rulesBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getRulesFieldBuilder() : null;
          } else {
            rulesBuilder_.addAllMessages(other.rules_);
          }
        }
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.bigtable.v1.ReadModifyWriteRowRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.bigtable.v1.ReadModifyWriteRowRequest) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object tableName_ = "";
    /**
     * <code>optional string table_name = 1;</code>
     *
     * <pre>
     * The unique name of the table to which the read/modify/write rules should be
     * applied.
     * </pre>
     */
    public java.lang.String getTableName() {
      java.lang.Object ref = tableName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          tableName_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string table_name = 1;</code>
     *
     * <pre>
     * The unique name of the table to which the read/modify/write rules should be
     * applied.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getTableNameBytes() {
      java.lang.Object ref = tableName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tableName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string table_name = 1;</code>
     *
     * <pre>
     * The unique name of the table to which the read/modify/write rules should be
     * applied.
     * </pre>
     */
    public Builder setTableName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      tableName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string table_name = 1;</code>
     *
     * <pre>
     * The unique name of the table to which the read/modify/write rules should be
     * applied.
     * </pre>
     */
    public Builder clearTableName() {
      
      tableName_ = getDefaultInstance().getTableName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string table_name = 1;</code>
     *
     * <pre>
     * The unique name of the table to which the read/modify/write rules should be
     * applied.
     * </pre>
     */
    public Builder setTableNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      tableName_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString rowKey_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes row_key = 2;</code>
     *
     * <pre>
     * The key of the row to which the read/modify/write rules should be applied.
     * </pre>
     */
    public com.google.protobuf.ByteString getRowKey() {
      return rowKey_;
    }
    /**
     * <code>optional bytes row_key = 2;</code>
     *
     * <pre>
     * The key of the row to which the read/modify/write rules should be applied.
     * </pre>
     */
    public Builder setRowKey(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      rowKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes row_key = 2;</code>
     *
     * <pre>
     * The key of the row to which the read/modify/write rules should be applied.
     * </pre>
     */
    public Builder clearRowKey() {
      
      rowKey_ = getDefaultInstance().getRowKey();
      onChanged();
      return this;
    }

    private java.util.List<com.google.bigtable.v1.ReadModifyWriteRule> rules_ =
      java.util.Collections.emptyList();
    private void ensureRulesIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        rules_ = new java.util.ArrayList<com.google.bigtable.v1.ReadModifyWriteRule>(rules_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.google.bigtable.v1.ReadModifyWriteRule, com.google.bigtable.v1.ReadModifyWriteRule.Builder, com.google.bigtable.v1.ReadModifyWriteRuleOrBuilder> rulesBuilder_;

    /**
     * <code>repeated .google.bigtable.v1.ReadModifyWriteRule rules = 3;</code>
     *
     * <pre>
     * Rules specifying how the specified row's contents are to be transformed
     * into writes. Entries are applied in order, meaning that earlier rules will
     * affect the results of later ones.
     * </pre>
     */
    public java.util.List<com.google.bigtable.v1.ReadModifyWriteRule> getRulesList() {
      if (rulesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(rules_);
      } else {
        return rulesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .google.bigtable.v1.ReadModifyWriteRule rules = 3;</code>
     *
     * <pre>
     * Rules specifying how the specified row's contents are to be transformed
     * into writes. Entries are applied in order, meaning that earlier rules will
     * affect the results of later ones.
     * </pre>
     */
    public int getRulesCount() {
      if (rulesBuilder_ == null) {
        return rules_.size();
      } else {
        return rulesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .google.bigtable.v1.ReadModifyWriteRule rules = 3;</code>
     *
     * <pre>
     * Rules specifying how the specified row's contents are to be transformed
     * into writes. Entries are applied in order, meaning that earlier rules will
     * affect the results of later ones.
     * </pre>
     */
    public com.google.bigtable.v1.ReadModifyWriteRule getRules(int index) {
      if (rulesBuilder_ == null) {
        return rules_.get(index);
      } else {
        return rulesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .google.bigtable.v1.ReadModifyWriteRule rules = 3;</code>
     *
     * <pre>
     * Rules specifying how the specified row's contents are to be transformed
     * into writes. Entries are applied in order, meaning that earlier rules will
     * affect the results of later ones.
     * </pre>
     */
    public Builder setRules(
        int index, com.google.bigtable.v1.ReadModifyWriteRule value) {
      if (rulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRulesIsMutable();
        rules_.set(index, value);
        onChanged();
      } else {
        rulesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .google.bigtable.v1.ReadModifyWriteRule rules = 3;</code>
     *
     * <pre>
     * Rules specifying how the specified row's contents are to be transformed
     * into writes. Entries are applied in order, meaning that earlier rules will
     * affect the results of later ones.
     * </pre>
     */
    public Builder setRules(
        int index, com.google.bigtable.v1.ReadModifyWriteRule.Builder builderForValue) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.set(index, builderForValue.build());
        onChanged();
      } else {
        rulesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.bigtable.v1.ReadModifyWriteRule rules = 3;</code>
     *
     * <pre>
     * Rules specifying how the specified row's contents are to be transformed
     * into writes. Entries are applied in order, meaning that earlier rules will
     * affect the results of later ones.
     * </pre>
     */
    public Builder addRules(com.google.bigtable.v1.ReadModifyWriteRule value) {
      if (rulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRulesIsMutable();
        rules_.add(value);
        onChanged();
      } else {
        rulesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .google.bigtable.v1.ReadModifyWriteRule rules = 3;</code>
     *
     * <pre>
     * Rules specifying how the specified row's contents are to be transformed
     * into writes. Entries are applied in order, meaning that earlier rules will
     * affect the results of later ones.
     * </pre>
     */
    public Builder addRules(
        int index, com.google.bigtable.v1.ReadModifyWriteRule value) {
      if (rulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRulesIsMutable();
        rules_.add(index, value);
        onChanged();
      } else {
        rulesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .google.bigtable.v1.ReadModifyWriteRule rules = 3;</code>
     *
     * <pre>
     * Rules specifying how the specified row's contents are to be transformed
     * into writes. Entries are applied in order, meaning that earlier rules will
     * affect the results of later ones.
     * </pre>
     */
    public Builder addRules(
        com.google.bigtable.v1.ReadModifyWriteRule.Builder builderForValue) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.add(builderForValue.build());
        onChanged();
      } else {
        rulesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.bigtable.v1.ReadModifyWriteRule rules = 3;</code>
     *
     * <pre>
     * Rules specifying how the specified row's contents are to be transformed
     * into writes. Entries are applied in order, meaning that earlier rules will
     * affect the results of later ones.
     * </pre>
     */
    public Builder addRules(
        int index, com.google.bigtable.v1.ReadModifyWriteRule.Builder builderForValue) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.add(index, builderForValue.build());
        onChanged();
      } else {
        rulesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.bigtable.v1.ReadModifyWriteRule rules = 3;</code>
     *
     * <pre>
     * Rules specifying how the specified row's contents are to be transformed
     * into writes. Entries are applied in order, meaning that earlier rules will
     * affect the results of later ones.
     * </pre>
     */
    public Builder addAllRules(
        java.lang.Iterable<? extends com.google.bigtable.v1.ReadModifyWriteRule> values) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, rules_);
        onChanged();
      } else {
        rulesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .google.bigtable.v1.ReadModifyWriteRule rules = 3;</code>
     *
     * <pre>
     * Rules specifying how the specified row's contents are to be transformed
     * into writes. Entries are applied in order, meaning that earlier rules will
     * affect the results of later ones.
     * </pre>
     */
    public Builder clearRules() {
      if (rulesBuilder_ == null) {
        rules_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        rulesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .google.bigtable.v1.ReadModifyWriteRule rules = 3;</code>
     *
     * <pre>
     * Rules specifying how the specified row's contents are to be transformed
     * into writes. Entries are applied in order, meaning that earlier rules will
     * affect the results of later ones.
     * </pre>
     */
    public Builder removeRules(int index) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.remove(index);
        onChanged();
      } else {
        rulesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .google.bigtable.v1.ReadModifyWriteRule rules = 3;</code>
     *
     * <pre>
     * Rules specifying how the specified row's contents are to be transformed
     * into writes. Entries are applied in order, meaning that earlier rules will
     * affect the results of later ones.
     * </pre>
     */
    public com.google.bigtable.v1.ReadModifyWriteRule.Builder getRulesBuilder(
        int index) {
      return getRulesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .google.bigtable.v1.ReadModifyWriteRule rules = 3;</code>
     *
     * <pre>
     * Rules specifying how the specified row's contents are to be transformed
     * into writes. Entries are applied in order, meaning that earlier rules will
     * affect the results of later ones.
     * </pre>
     */
    public com.google.bigtable.v1.ReadModifyWriteRuleOrBuilder getRulesOrBuilder(
        int index) {
      if (rulesBuilder_ == null) {
        return rules_.get(index);  } else {
        return rulesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .google.bigtable.v1.ReadModifyWriteRule rules = 3;</code>
     *
     * <pre>
     * Rules specifying how the specified row's contents are to be transformed
     * into writes. Entries are applied in order, meaning that earlier rules will
     * affect the results of later ones.
     * </pre>
     */
    public java.util.List<? extends com.google.bigtable.v1.ReadModifyWriteRuleOrBuilder> 
         getRulesOrBuilderList() {
      if (rulesBuilder_ != null) {
        return rulesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(rules_);
      }
    }
    /**
     * <code>repeated .google.bigtable.v1.ReadModifyWriteRule rules = 3;</code>
     *
     * <pre>
     * Rules specifying how the specified row's contents are to be transformed
     * into writes. Entries are applied in order, meaning that earlier rules will
     * affect the results of later ones.
     * </pre>
     */
    public com.google.bigtable.v1.ReadModifyWriteRule.Builder addRulesBuilder() {
      return getRulesFieldBuilder().addBuilder(
          com.google.bigtable.v1.ReadModifyWriteRule.getDefaultInstance());
    }
    /**
     * <code>repeated .google.bigtable.v1.ReadModifyWriteRule rules = 3;</code>
     *
     * <pre>
     * Rules specifying how the specified row's contents are to be transformed
     * into writes. Entries are applied in order, meaning that earlier rules will
     * affect the results of later ones.
     * </pre>
     */
    public com.google.bigtable.v1.ReadModifyWriteRule.Builder addRulesBuilder(
        int index) {
      return getRulesFieldBuilder().addBuilder(
          index, com.google.bigtable.v1.ReadModifyWriteRule.getDefaultInstance());
    }
    /**
     * <code>repeated .google.bigtable.v1.ReadModifyWriteRule rules = 3;</code>
     *
     * <pre>
     * Rules specifying how the specified row's contents are to be transformed
     * into writes. Entries are applied in order, meaning that earlier rules will
     * affect the results of later ones.
     * </pre>
     */
    public java.util.List<com.google.bigtable.v1.ReadModifyWriteRule.Builder> 
         getRulesBuilderList() {
      return getRulesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.google.bigtable.v1.ReadModifyWriteRule, com.google.bigtable.v1.ReadModifyWriteRule.Builder, com.google.bigtable.v1.ReadModifyWriteRuleOrBuilder> 
        getRulesFieldBuilder() {
      if (rulesBuilder_ == null) {
        rulesBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.google.bigtable.v1.ReadModifyWriteRule, com.google.bigtable.v1.ReadModifyWriteRule.Builder, com.google.bigtable.v1.ReadModifyWriteRuleOrBuilder>(
                rules_,
                ((bitField0_ & 0x00000004) == 0x00000004),
                getParentForChildren(),
                isClean());
        rules_ = null;
      }
      return rulesBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.bigtable.v1.ReadModifyWriteRowRequest)
  }

  // @@protoc_insertion_point(class_scope:google.bigtable.v1.ReadModifyWriteRowRequest)
  private static final com.google.bigtable.v1.ReadModifyWriteRowRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.bigtable.v1.ReadModifyWriteRowRequest();
  }

  public static com.google.bigtable.v1.ReadModifyWriteRowRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static final com.google.protobuf.Parser<ReadModifyWriteRowRequest> PARSER =
      new com.google.protobuf.AbstractParser<ReadModifyWriteRowRequest>() {
    public ReadModifyWriteRowRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new ReadModifyWriteRowRequest(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<ReadModifyWriteRowRequest> getParserForType() {
    return PARSER;
  }

  public com.google.bigtable.v1.ReadModifyWriteRowRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

