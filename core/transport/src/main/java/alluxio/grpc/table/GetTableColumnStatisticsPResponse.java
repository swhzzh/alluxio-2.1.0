// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/table/table_master.proto

package alluxio.grpc.table;

/**
 * Protobuf type {@code alluxio.grpc.table.GetTableColumnStatisticsPResponse}
 */
public  final class GetTableColumnStatisticsPResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:alluxio.grpc.table.GetTableColumnStatisticsPResponse)
    GetTableColumnStatisticsPResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetTableColumnStatisticsPResponse.newBuilder() to construct.
  private GetTableColumnStatisticsPResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetTableColumnStatisticsPResponse() {
    statistics_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetTableColumnStatisticsPResponse(
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
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              statistics_ = new java.util.ArrayList<alluxio.grpc.table.ColumnStatisticsInfo>();
              mutable_bitField0_ |= 0x00000001;
            }
            statistics_.add(
                input.readMessage(alluxio.grpc.table.ColumnStatisticsInfo.PARSER, extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        statistics_ = java.util.Collections.unmodifiableList(statistics_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_GetTableColumnStatisticsPResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_GetTableColumnStatisticsPResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            alluxio.grpc.table.GetTableColumnStatisticsPResponse.class, alluxio.grpc.table.GetTableColumnStatisticsPResponse.Builder.class);
  }

  public static final int STATISTICS_FIELD_NUMBER = 1;
  private java.util.List<alluxio.grpc.table.ColumnStatisticsInfo> statistics_;
  /**
   * <code>repeated .alluxio.grpc.table.ColumnStatisticsInfo statistics = 1;</code>
   */
  public java.util.List<alluxio.grpc.table.ColumnStatisticsInfo> getStatisticsList() {
    return statistics_;
  }
  /**
   * <code>repeated .alluxio.grpc.table.ColumnStatisticsInfo statistics = 1;</code>
   */
  public java.util.List<? extends alluxio.grpc.table.ColumnStatisticsInfoOrBuilder> 
      getStatisticsOrBuilderList() {
    return statistics_;
  }
  /**
   * <code>repeated .alluxio.grpc.table.ColumnStatisticsInfo statistics = 1;</code>
   */
  public int getStatisticsCount() {
    return statistics_.size();
  }
  /**
   * <code>repeated .alluxio.grpc.table.ColumnStatisticsInfo statistics = 1;</code>
   */
  public alluxio.grpc.table.ColumnStatisticsInfo getStatistics(int index) {
    return statistics_.get(index);
  }
  /**
   * <code>repeated .alluxio.grpc.table.ColumnStatisticsInfo statistics = 1;</code>
   */
  public alluxio.grpc.table.ColumnStatisticsInfoOrBuilder getStatisticsOrBuilder(
      int index) {
    return statistics_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    for (int i = 0; i < getStatisticsCount(); i++) {
      if (!getStatistics(i).isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
    }
    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < statistics_.size(); i++) {
      output.writeMessage(1, statistics_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < statistics_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, statistics_.get(i));
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
    if (!(obj instanceof alluxio.grpc.table.GetTableColumnStatisticsPResponse)) {
      return super.equals(obj);
    }
    alluxio.grpc.table.GetTableColumnStatisticsPResponse other = (alluxio.grpc.table.GetTableColumnStatisticsPResponse) obj;

    boolean result = true;
    result = result && getStatisticsList()
        .equals(other.getStatisticsList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getStatisticsCount() > 0) {
      hash = (37 * hash) + STATISTICS_FIELD_NUMBER;
      hash = (53 * hash) + getStatisticsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static alluxio.grpc.table.GetTableColumnStatisticsPResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.table.GetTableColumnStatisticsPResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.table.GetTableColumnStatisticsPResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.table.GetTableColumnStatisticsPResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.table.GetTableColumnStatisticsPResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.table.GetTableColumnStatisticsPResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.table.GetTableColumnStatisticsPResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.table.GetTableColumnStatisticsPResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.table.GetTableColumnStatisticsPResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static alluxio.grpc.table.GetTableColumnStatisticsPResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.table.GetTableColumnStatisticsPResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.table.GetTableColumnStatisticsPResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(alluxio.grpc.table.GetTableColumnStatisticsPResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code alluxio.grpc.table.GetTableColumnStatisticsPResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:alluxio.grpc.table.GetTableColumnStatisticsPResponse)
      alluxio.grpc.table.GetTableColumnStatisticsPResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_GetTableColumnStatisticsPResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_GetTableColumnStatisticsPResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              alluxio.grpc.table.GetTableColumnStatisticsPResponse.class, alluxio.grpc.table.GetTableColumnStatisticsPResponse.Builder.class);
    }

    // Construct using alluxio.grpc.table.GetTableColumnStatisticsPResponse.newBuilder()
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
        getStatisticsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (statisticsBuilder_ == null) {
        statistics_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        statisticsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_GetTableColumnStatisticsPResponse_descriptor;
    }

    public alluxio.grpc.table.GetTableColumnStatisticsPResponse getDefaultInstanceForType() {
      return alluxio.grpc.table.GetTableColumnStatisticsPResponse.getDefaultInstance();
    }

    public alluxio.grpc.table.GetTableColumnStatisticsPResponse build() {
      alluxio.grpc.table.GetTableColumnStatisticsPResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public alluxio.grpc.table.GetTableColumnStatisticsPResponse buildPartial() {
      alluxio.grpc.table.GetTableColumnStatisticsPResponse result = new alluxio.grpc.table.GetTableColumnStatisticsPResponse(this);
      int from_bitField0_ = bitField0_;
      if (statisticsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          statistics_ = java.util.Collections.unmodifiableList(statistics_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.statistics_ = statistics_;
      } else {
        result.statistics_ = statisticsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof alluxio.grpc.table.GetTableColumnStatisticsPResponse) {
        return mergeFrom((alluxio.grpc.table.GetTableColumnStatisticsPResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(alluxio.grpc.table.GetTableColumnStatisticsPResponse other) {
      if (other == alluxio.grpc.table.GetTableColumnStatisticsPResponse.getDefaultInstance()) return this;
      if (statisticsBuilder_ == null) {
        if (!other.statistics_.isEmpty()) {
          if (statistics_.isEmpty()) {
            statistics_ = other.statistics_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureStatisticsIsMutable();
            statistics_.addAll(other.statistics_);
          }
          onChanged();
        }
      } else {
        if (!other.statistics_.isEmpty()) {
          if (statisticsBuilder_.isEmpty()) {
            statisticsBuilder_.dispose();
            statisticsBuilder_ = null;
            statistics_ = other.statistics_;
            bitField0_ = (bitField0_ & ~0x00000001);
            statisticsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getStatisticsFieldBuilder() : null;
          } else {
            statisticsBuilder_.addAllMessages(other.statistics_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      for (int i = 0; i < getStatisticsCount(); i++) {
        if (!getStatistics(i).isInitialized()) {
          return false;
        }
      }
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      alluxio.grpc.table.GetTableColumnStatisticsPResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (alluxio.grpc.table.GetTableColumnStatisticsPResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<alluxio.grpc.table.ColumnStatisticsInfo> statistics_ =
      java.util.Collections.emptyList();
    private void ensureStatisticsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        statistics_ = new java.util.ArrayList<alluxio.grpc.table.ColumnStatisticsInfo>(statistics_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        alluxio.grpc.table.ColumnStatisticsInfo, alluxio.grpc.table.ColumnStatisticsInfo.Builder, alluxio.grpc.table.ColumnStatisticsInfoOrBuilder> statisticsBuilder_;

    /**
     * <code>repeated .alluxio.grpc.table.ColumnStatisticsInfo statistics = 1;</code>
     */
    public java.util.List<alluxio.grpc.table.ColumnStatisticsInfo> getStatisticsList() {
      if (statisticsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(statistics_);
      } else {
        return statisticsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .alluxio.grpc.table.ColumnStatisticsInfo statistics = 1;</code>
     */
    public int getStatisticsCount() {
      if (statisticsBuilder_ == null) {
        return statistics_.size();
      } else {
        return statisticsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .alluxio.grpc.table.ColumnStatisticsInfo statistics = 1;</code>
     */
    public alluxio.grpc.table.ColumnStatisticsInfo getStatistics(int index) {
      if (statisticsBuilder_ == null) {
        return statistics_.get(index);
      } else {
        return statisticsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .alluxio.grpc.table.ColumnStatisticsInfo statistics = 1;</code>
     */
    public Builder setStatistics(
        int index, alluxio.grpc.table.ColumnStatisticsInfo value) {
      if (statisticsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStatisticsIsMutable();
        statistics_.set(index, value);
        onChanged();
      } else {
        statisticsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.table.ColumnStatisticsInfo statistics = 1;</code>
     */
    public Builder setStatistics(
        int index, alluxio.grpc.table.ColumnStatisticsInfo.Builder builderForValue) {
      if (statisticsBuilder_ == null) {
        ensureStatisticsIsMutable();
        statistics_.set(index, builderForValue.build());
        onChanged();
      } else {
        statisticsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.table.ColumnStatisticsInfo statistics = 1;</code>
     */
    public Builder addStatistics(alluxio.grpc.table.ColumnStatisticsInfo value) {
      if (statisticsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStatisticsIsMutable();
        statistics_.add(value);
        onChanged();
      } else {
        statisticsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.table.ColumnStatisticsInfo statistics = 1;</code>
     */
    public Builder addStatistics(
        int index, alluxio.grpc.table.ColumnStatisticsInfo value) {
      if (statisticsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStatisticsIsMutable();
        statistics_.add(index, value);
        onChanged();
      } else {
        statisticsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.table.ColumnStatisticsInfo statistics = 1;</code>
     */
    public Builder addStatistics(
        alluxio.grpc.table.ColumnStatisticsInfo.Builder builderForValue) {
      if (statisticsBuilder_ == null) {
        ensureStatisticsIsMutable();
        statistics_.add(builderForValue.build());
        onChanged();
      } else {
        statisticsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.table.ColumnStatisticsInfo statistics = 1;</code>
     */
    public Builder addStatistics(
        int index, alluxio.grpc.table.ColumnStatisticsInfo.Builder builderForValue) {
      if (statisticsBuilder_ == null) {
        ensureStatisticsIsMutable();
        statistics_.add(index, builderForValue.build());
        onChanged();
      } else {
        statisticsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.table.ColumnStatisticsInfo statistics = 1;</code>
     */
    public Builder addAllStatistics(
        java.lang.Iterable<? extends alluxio.grpc.table.ColumnStatisticsInfo> values) {
      if (statisticsBuilder_ == null) {
        ensureStatisticsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, statistics_);
        onChanged();
      } else {
        statisticsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.table.ColumnStatisticsInfo statistics = 1;</code>
     */
    public Builder clearStatistics() {
      if (statisticsBuilder_ == null) {
        statistics_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        statisticsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.table.ColumnStatisticsInfo statistics = 1;</code>
     */
    public Builder removeStatistics(int index) {
      if (statisticsBuilder_ == null) {
        ensureStatisticsIsMutable();
        statistics_.remove(index);
        onChanged();
      } else {
        statisticsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.table.ColumnStatisticsInfo statistics = 1;</code>
     */
    public alluxio.grpc.table.ColumnStatisticsInfo.Builder getStatisticsBuilder(
        int index) {
      return getStatisticsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .alluxio.grpc.table.ColumnStatisticsInfo statistics = 1;</code>
     */
    public alluxio.grpc.table.ColumnStatisticsInfoOrBuilder getStatisticsOrBuilder(
        int index) {
      if (statisticsBuilder_ == null) {
        return statistics_.get(index);  } else {
        return statisticsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .alluxio.grpc.table.ColumnStatisticsInfo statistics = 1;</code>
     */
    public java.util.List<? extends alluxio.grpc.table.ColumnStatisticsInfoOrBuilder> 
         getStatisticsOrBuilderList() {
      if (statisticsBuilder_ != null) {
        return statisticsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(statistics_);
      }
    }
    /**
     * <code>repeated .alluxio.grpc.table.ColumnStatisticsInfo statistics = 1;</code>
     */
    public alluxio.grpc.table.ColumnStatisticsInfo.Builder addStatisticsBuilder() {
      return getStatisticsFieldBuilder().addBuilder(
          alluxio.grpc.table.ColumnStatisticsInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .alluxio.grpc.table.ColumnStatisticsInfo statistics = 1;</code>
     */
    public alluxio.grpc.table.ColumnStatisticsInfo.Builder addStatisticsBuilder(
        int index) {
      return getStatisticsFieldBuilder().addBuilder(
          index, alluxio.grpc.table.ColumnStatisticsInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .alluxio.grpc.table.ColumnStatisticsInfo statistics = 1;</code>
     */
    public java.util.List<alluxio.grpc.table.ColumnStatisticsInfo.Builder> 
         getStatisticsBuilderList() {
      return getStatisticsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        alluxio.grpc.table.ColumnStatisticsInfo, alluxio.grpc.table.ColumnStatisticsInfo.Builder, alluxio.grpc.table.ColumnStatisticsInfoOrBuilder> 
        getStatisticsFieldBuilder() {
      if (statisticsBuilder_ == null) {
        statisticsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            alluxio.grpc.table.ColumnStatisticsInfo, alluxio.grpc.table.ColumnStatisticsInfo.Builder, alluxio.grpc.table.ColumnStatisticsInfoOrBuilder>(
                statistics_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        statistics_ = null;
      }
      return statisticsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:alluxio.grpc.table.GetTableColumnStatisticsPResponse)
  }

  // @@protoc_insertion_point(class_scope:alluxio.grpc.table.GetTableColumnStatisticsPResponse)
  private static final alluxio.grpc.table.GetTableColumnStatisticsPResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new alluxio.grpc.table.GetTableColumnStatisticsPResponse();
  }

  public static alluxio.grpc.table.GetTableColumnStatisticsPResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<GetTableColumnStatisticsPResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetTableColumnStatisticsPResponse>() {
    public GetTableColumnStatisticsPResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetTableColumnStatisticsPResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetTableColumnStatisticsPResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetTableColumnStatisticsPResponse> getParserForType() {
    return PARSER;
  }

  public alluxio.grpc.table.GetTableColumnStatisticsPResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

