// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: movie_store.proto

package com.carloscdev.movieapp;

/**
 * Protobuf type {@code StoredMovie}
 */
public  final class StoredMovie extends
    com.google.protobuf.GeneratedMessageLite<
        StoredMovie, StoredMovie.Builder> implements
    // @@protoc_insertion_point(message_implements:StoredMovie)
    StoredMovieOrBuilder {
  private StoredMovie() {
    name_ = "";
    release_ = "";
    playtime_ = "";
    description_ = "";
    plot_ = "";
    poster_ = "";
    gif_ = "";
  }
  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  @Override
  public int getId() {
    return id_;
  }
  /**
   * <code>int32 id = 1;</code>
   * @param value The id to set.
   */
  private void setId(int value) {
    
    id_ = value;
  }
  /**
   * <code>int32 id = 1;</code>
   */
  private void clearId() {
    
    id_ = 0;
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private String name_;
  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  @Override
  public String getName() {
    return name_;
  }
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  @Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(name_);
  }
  /**
   * <code>string name = 2;</code>
   * @param value The name to set.
   */
  private void setName(
      String value) {
    Class<?> valueClass = value.getClass();
  
    name_ = value;
  }
  /**
   * <code>string name = 2;</code>
   */
  private void clearName() {
    
    name_ = getDefaultInstance().getName();
  }
  /**
   * <code>string name = 2;</code>
   * @param value The bytes for name to set.
   */
  private void setNameBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    name_ = value.toStringUtf8();
    
  }

  public static final int RELEASE_FIELD_NUMBER = 3;
  private String release_;
  /**
   * <code>string release = 3;</code>
   * @return The release.
   */
  @Override
  public String getRelease() {
    return release_;
  }
  /**
   * <code>string release = 3;</code>
   * @return The bytes for release.
   */
  @Override
  public com.google.protobuf.ByteString
      getReleaseBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(release_);
  }
  /**
   * <code>string release = 3;</code>
   * @param value The release to set.
   */
  private void setRelease(
      String value) {
    Class<?> valueClass = value.getClass();
  
    release_ = value;
  }
  /**
   * <code>string release = 3;</code>
   */
  private void clearRelease() {
    
    release_ = getDefaultInstance().getRelease();
  }
  /**
   * <code>string release = 3;</code>
   * @param value The bytes for release to set.
   */
  private void setReleaseBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    release_ = value.toStringUtf8();
    
  }

  public static final int PLAYTIME_FIELD_NUMBER = 4;
  private String playtime_;
  /**
   * <code>string playtime = 4;</code>
   * @return The playtime.
   */
  @Override
  public String getPlaytime() {
    return playtime_;
  }
  /**
   * <code>string playtime = 4;</code>
   * @return The bytes for playtime.
   */
  @Override
  public com.google.protobuf.ByteString
      getPlaytimeBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(playtime_);
  }
  /**
   * <code>string playtime = 4;</code>
   * @param value The playtime to set.
   */
  private void setPlaytime(
      String value) {
    Class<?> valueClass = value.getClass();
  
    playtime_ = value;
  }
  /**
   * <code>string playtime = 4;</code>
   */
  private void clearPlaytime() {
    
    playtime_ = getDefaultInstance().getPlaytime();
  }
  /**
   * <code>string playtime = 4;</code>
   * @param value The bytes for playtime to set.
   */
  private void setPlaytimeBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    playtime_ = value.toStringUtf8();
    
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 5;
  private String description_;
  /**
   * <code>string description = 5;</code>
   * @return The description.
   */
  @Override
  public String getDescription() {
    return description_;
  }
  /**
   * <code>string description = 5;</code>
   * @return The bytes for description.
   */
  @Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(description_);
  }
  /**
   * <code>string description = 5;</code>
   * @param value The description to set.
   */
  private void setDescription(
      String value) {
    Class<?> valueClass = value.getClass();
  
    description_ = value;
  }
  /**
   * <code>string description = 5;</code>
   */
  private void clearDescription() {
    
    description_ = getDefaultInstance().getDescription();
  }
  /**
   * <code>string description = 5;</code>
   * @param value The bytes for description to set.
   */
  private void setDescriptionBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    description_ = value.toStringUtf8();
    
  }

  public static final int PLOT_FIELD_NUMBER = 6;
  private String plot_;
  /**
   * <code>string plot = 6;</code>
   * @return The plot.
   */
  @Override
  public String getPlot() {
    return plot_;
  }
  /**
   * <code>string plot = 6;</code>
   * @return The bytes for plot.
   */
  @Override
  public com.google.protobuf.ByteString
      getPlotBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(plot_);
  }
  /**
   * <code>string plot = 6;</code>
   * @param value The plot to set.
   */
  private void setPlot(
      String value) {
    Class<?> valueClass = value.getClass();
  
    plot_ = value;
  }
  /**
   * <code>string plot = 6;</code>
   */
  private void clearPlot() {
    
    plot_ = getDefaultInstance().getPlot();
  }
  /**
   * <code>string plot = 6;</code>
   * @param value The bytes for plot to set.
   */
  private void setPlotBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    plot_ = value.toStringUtf8();
    
  }

  public static final int POSTER_FIELD_NUMBER = 7;
  private String poster_;
  /**
   * <code>string poster = 7;</code>
   * @return The poster.
   */
  @Override
  public String getPoster() {
    return poster_;
  }
  /**
   * <code>string poster = 7;</code>
   * @return The bytes for poster.
   */
  @Override
  public com.google.protobuf.ByteString
      getPosterBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(poster_);
  }
  /**
   * <code>string poster = 7;</code>
   * @param value The poster to set.
   */
  private void setPoster(
      String value) {
    Class<?> valueClass = value.getClass();
  
    poster_ = value;
  }
  /**
   * <code>string poster = 7;</code>
   */
  private void clearPoster() {
    
    poster_ = getDefaultInstance().getPoster();
  }
  /**
   * <code>string poster = 7;</code>
   * @param value The bytes for poster to set.
   */
  private void setPosterBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    poster_ = value.toStringUtf8();
    
  }

  public static final int GIF_FIELD_NUMBER = 8;
  private String gif_;
  /**
   * <code>string gif = 8;</code>
   * @return The gif.
   */
  @Override
  public String getGif() {
    return gif_;
  }
  /**
   * <code>string gif = 8;</code>
   * @return The bytes for gif.
   */
  @Override
  public com.google.protobuf.ByteString
      getGifBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(gif_);
  }
  /**
   * <code>string gif = 8;</code>
   * @param value The gif to set.
   */
  private void setGif(
      String value) {
    Class<?> valueClass = value.getClass();
  
    gif_ = value;
  }
  /**
   * <code>string gif = 8;</code>
   */
  private void clearGif() {
    
    gif_ = getDefaultInstance().getGif();
  }
  /**
   * <code>string gif = 8;</code>
   * @param value The bytes for gif to set.
   */
  private void setGifBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    gif_ = value.toStringUtf8();
    
  }

  public static StoredMovie parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static StoredMovie parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static StoredMovie parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static StoredMovie parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static StoredMovie parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static StoredMovie parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static StoredMovie parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static StoredMovie parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static StoredMovie parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static StoredMovie parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static StoredMovie parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static StoredMovie parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(StoredMovie prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code StoredMovie}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        StoredMovie, Builder> implements
      // @@protoc_insertion_point(builder_implements:StoredMovie)
      StoredMovieOrBuilder {
    // Construct using com.carloscdev.movieapp.StoredMovie.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    @Override
    public int getId() {
      return instance.getId();
    }
    /**
     * <code>int32 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(int value) {
      copyOnWrite();
      instance.setId(value);
      return this;
    }
    /**
     * <code>int32 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      copyOnWrite();
      instance.clearId();
      return this;
    }

    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    @Override
    public String getName() {
      return instance.getName();
    }
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    @Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      return instance.getNameBytes();
    }
    /**
     * <code>string name = 2;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        String value) {
      copyOnWrite();
      instance.setName(value);
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      copyOnWrite();
      instance.clearName();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setNameBytes(value);
      return this;
    }

    /**
     * <code>string release = 3;</code>
     * @return The release.
     */
    @Override
    public String getRelease() {
      return instance.getRelease();
    }
    /**
     * <code>string release = 3;</code>
     * @return The bytes for release.
     */
    @Override
    public com.google.protobuf.ByteString
        getReleaseBytes() {
      return instance.getReleaseBytes();
    }
    /**
     * <code>string release = 3;</code>
     * @param value The release to set.
     * @return This builder for chaining.
     */
    public Builder setRelease(
        String value) {
      copyOnWrite();
      instance.setRelease(value);
      return this;
    }
    /**
     * <code>string release = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRelease() {
      copyOnWrite();
      instance.clearRelease();
      return this;
    }
    /**
     * <code>string release = 3;</code>
     * @param value The bytes for release to set.
     * @return This builder for chaining.
     */
    public Builder setReleaseBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setReleaseBytes(value);
      return this;
    }

    /**
     * <code>string playtime = 4;</code>
     * @return The playtime.
     */
    @Override
    public String getPlaytime() {
      return instance.getPlaytime();
    }
    /**
     * <code>string playtime = 4;</code>
     * @return The bytes for playtime.
     */
    @Override
    public com.google.protobuf.ByteString
        getPlaytimeBytes() {
      return instance.getPlaytimeBytes();
    }
    /**
     * <code>string playtime = 4;</code>
     * @param value The playtime to set.
     * @return This builder for chaining.
     */
    public Builder setPlaytime(
        String value) {
      copyOnWrite();
      instance.setPlaytime(value);
      return this;
    }
    /**
     * <code>string playtime = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlaytime() {
      copyOnWrite();
      instance.clearPlaytime();
      return this;
    }
    /**
     * <code>string playtime = 4;</code>
     * @param value The bytes for playtime to set.
     * @return This builder for chaining.
     */
    public Builder setPlaytimeBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setPlaytimeBytes(value);
      return this;
    }

    /**
     * <code>string description = 5;</code>
     * @return The description.
     */
    @Override
    public String getDescription() {
      return instance.getDescription();
    }
    /**
     * <code>string description = 5;</code>
     * @return The bytes for description.
     */
    @Override
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      return instance.getDescriptionBytes();
    }
    /**
     * <code>string description = 5;</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        String value) {
      copyOnWrite();
      instance.setDescription(value);
      return this;
    }
    /**
     * <code>string description = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      copyOnWrite();
      instance.clearDescription();
      return this;
    }
    /**
     * <code>string description = 5;</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setDescriptionBytes(value);
      return this;
    }

    /**
     * <code>string plot = 6;</code>
     * @return The plot.
     */
    @Override
    public String getPlot() {
      return instance.getPlot();
    }
    /**
     * <code>string plot = 6;</code>
     * @return The bytes for plot.
     */
    @Override
    public com.google.protobuf.ByteString
        getPlotBytes() {
      return instance.getPlotBytes();
    }
    /**
     * <code>string plot = 6;</code>
     * @param value The plot to set.
     * @return This builder for chaining.
     */
    public Builder setPlot(
        String value) {
      copyOnWrite();
      instance.setPlot(value);
      return this;
    }
    /**
     * <code>string plot = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlot() {
      copyOnWrite();
      instance.clearPlot();
      return this;
    }
    /**
     * <code>string plot = 6;</code>
     * @param value The bytes for plot to set.
     * @return This builder for chaining.
     */
    public Builder setPlotBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setPlotBytes(value);
      return this;
    }

    /**
     * <code>string poster = 7;</code>
     * @return The poster.
     */
    @Override
    public String getPoster() {
      return instance.getPoster();
    }
    /**
     * <code>string poster = 7;</code>
     * @return The bytes for poster.
     */
    @Override
    public com.google.protobuf.ByteString
        getPosterBytes() {
      return instance.getPosterBytes();
    }
    /**
     * <code>string poster = 7;</code>
     * @param value The poster to set.
     * @return This builder for chaining.
     */
    public Builder setPoster(
        String value) {
      copyOnWrite();
      instance.setPoster(value);
      return this;
    }
    /**
     * <code>string poster = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearPoster() {
      copyOnWrite();
      instance.clearPoster();
      return this;
    }
    /**
     * <code>string poster = 7;</code>
     * @param value The bytes for poster to set.
     * @return This builder for chaining.
     */
    public Builder setPosterBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setPosterBytes(value);
      return this;
    }

    /**
     * <code>string gif = 8;</code>
     * @return The gif.
     */
    @Override
    public String getGif() {
      return instance.getGif();
    }
    /**
     * <code>string gif = 8;</code>
     * @return The bytes for gif.
     */
    @Override
    public com.google.protobuf.ByteString
        getGifBytes() {
      return instance.getGifBytes();
    }
    /**
     * <code>string gif = 8;</code>
     * @param value The gif to set.
     * @return This builder for chaining.
     */
    public Builder setGif(
        String value) {
      copyOnWrite();
      instance.setGif(value);
      return this;
    }
    /**
     * <code>string gif = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearGif() {
      copyOnWrite();
      instance.clearGif();
      return this;
    }
    /**
     * <code>string gif = 8;</code>
     * @param value The bytes for gif to set.
     * @return This builder for chaining.
     */
    public Builder setGifBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setGifBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:StoredMovie)
  }
  @Override
  @SuppressWarnings({"unchecked", "fallthrough"})
  protected final Object dynamicMethod(
      MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new StoredMovie();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          Object[] objects = new Object[] {
            "id_",
            "name_",
            "release_",
            "playtime_",
            "description_",
            "plot_",
            "poster_",
            "gif_",
          };
          String info =
              "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0004\u0002\u0208\u0003\u0208" +
              "\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u0208\b\u0208";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<StoredMovie> parser = PARSER;
        if (parser == null) {
          synchronized (StoredMovie.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<StoredMovie>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:StoredMovie)
  private static final StoredMovie DEFAULT_INSTANCE;
  static {
    StoredMovie defaultInstance = new StoredMovie();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      StoredMovie.class, defaultInstance);
  }

  public static StoredMovie getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<StoredMovie> PARSER;

  public static com.google.protobuf.Parser<StoredMovie> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

