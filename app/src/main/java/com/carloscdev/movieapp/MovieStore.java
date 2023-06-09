// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: movie_store.proto

package com.carloscdev.movieapp;

/**
 * Protobuf type {@code MovieStore}
 */
public  final class MovieStore extends
    com.google.protobuf.GeneratedMessageLite<
        MovieStore, MovieStore.Builder> implements
    // @@protoc_insertion_point(message_implements:MovieStore)
    MovieStoreOrBuilder {
  private MovieStore() {
    movies_ = emptyProtobufList();
  }
  public static final int INITIALIZED_FIELD_NUMBER = 1;
  private boolean initialized_;
  /**
   * <code>bool initialized = 1;</code>
   * @return The initialized.
   */
  @Override
  public boolean getInitialized() {
    return initialized_;
  }
  /**
   * <code>bool initialized = 1;</code>
   * @param value The initialized to set.
   */
  private void setInitialized(boolean value) {
    
    initialized_ = value;
  }
  /**
   * <code>bool initialized = 1;</code>
   */
  private void clearInitialized() {
    
    initialized_ = false;
  }

  public static final int MOVIES_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.ProtobufList<StoredMovie> movies_;
  /**
   * <code>repeated .StoredMovie movies = 2;</code>
   */
  @Override
  public java.util.List<StoredMovie> getMoviesList() {
    return movies_;
  }
  /**
   * <code>repeated .StoredMovie movies = 2;</code>
   */
  public java.util.List<? extends StoredMovieOrBuilder>
      getMoviesOrBuilderList() {
    return movies_;
  }
  /**
   * <code>repeated .StoredMovie movies = 2;</code>
   */
  @Override
  public int getMoviesCount() {
    return movies_.size();
  }
  /**
   * <code>repeated .StoredMovie movies = 2;</code>
   */
  @Override
  public StoredMovie getMovies(int index) {
    return movies_.get(index);
  }
  /**
   * <code>repeated .StoredMovie movies = 2;</code>
   */
  public StoredMovieOrBuilder getMoviesOrBuilder(
      int index) {
    return movies_.get(index);
  }
  private void ensureMoviesIsMutable() {
    com.google.protobuf.Internal.ProtobufList<StoredMovie> tmp = movies_;
    if (!tmp.isModifiable()) {
      movies_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
     }
  }

  /**
   * <code>repeated .StoredMovie movies = 2;</code>
   */
  private void setMovies(
      int index, StoredMovie value) {
    value.getClass();
  ensureMoviesIsMutable();
    movies_.set(index, value);
  }
  /**
   * <code>repeated .StoredMovie movies = 2;</code>
   */
  private void addMovies(StoredMovie value) {
    value.getClass();
  ensureMoviesIsMutable();
    movies_.add(value);
  }
  /**
   * <code>repeated .StoredMovie movies = 2;</code>
   */
  private void addMovies(
      int index, StoredMovie value) {
    value.getClass();
  ensureMoviesIsMutable();
    movies_.add(index, value);
  }
  /**
   * <code>repeated .StoredMovie movies = 2;</code>
   */
  private void addAllMovies(
      Iterable<? extends StoredMovie> values) {
    ensureMoviesIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, movies_);
  }
  /**
   * <code>repeated .StoredMovie movies = 2;</code>
   */
  private void clearMovies() {
    movies_ = emptyProtobufList();
  }
  /**
   * <code>repeated .StoredMovie movies = 2;</code>
   */
  private void removeMovies(int index) {
    ensureMoviesIsMutable();
    movies_.remove(index);
  }

  public static MovieStore parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static MovieStore parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static MovieStore parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static MovieStore parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static MovieStore parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static MovieStore parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static MovieStore parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static MovieStore parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static MovieStore parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static MovieStore parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static MovieStore parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static MovieStore parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(MovieStore prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code MovieStore}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        MovieStore, Builder> implements
      // @@protoc_insertion_point(builder_implements:MovieStore)
      MovieStoreOrBuilder {
    // Construct using com.carloscdev.movieapp.MovieStore.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>bool initialized = 1;</code>
     * @return The initialized.
     */
    @Override
    public boolean getInitialized() {
      return instance.getInitialized();
    }
    /**
     * <code>bool initialized = 1;</code>
     * @param value The initialized to set.
     * @return This builder for chaining.
     */
    public Builder setInitialized(boolean value) {
      copyOnWrite();
      instance.setInitialized(value);
      return this;
    }
    /**
     * <code>bool initialized = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearInitialized() {
      copyOnWrite();
      instance.clearInitialized();
      return this;
    }

    /**
     * <code>repeated .StoredMovie movies = 2;</code>
     */
    @Override
    public java.util.List<StoredMovie> getMoviesList() {
      return java.util.Collections.unmodifiableList(
          instance.getMoviesList());
    }
    /**
     * <code>repeated .StoredMovie movies = 2;</code>
     */
    @Override
    public int getMoviesCount() {
      return instance.getMoviesCount();
    }/**
     * <code>repeated .StoredMovie movies = 2;</code>
     */
    @Override
    public StoredMovie getMovies(int index) {
      return instance.getMovies(index);
    }
    /**
     * <code>repeated .StoredMovie movies = 2;</code>
     */
    public Builder setMovies(
        int index, StoredMovie value) {
      copyOnWrite();
      instance.setMovies(index, value);
      return this;
    }
    /**
     * <code>repeated .StoredMovie movies = 2;</code>
     */
    public Builder setMovies(
        int index, StoredMovie.Builder builderForValue) {
      copyOnWrite();
      instance.setMovies(index,
          builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .StoredMovie movies = 2;</code>
     */
    public Builder addMovies(StoredMovie value) {
      copyOnWrite();
      instance.addMovies(value);
      return this;
    }
    /**
     * <code>repeated .StoredMovie movies = 2;</code>
     */
    public Builder addMovies(
        int index, StoredMovie value) {
      copyOnWrite();
      instance.addMovies(index, value);
      return this;
    }
    /**
     * <code>repeated .StoredMovie movies = 2;</code>
     */
    public Builder addMovies(
        StoredMovie.Builder builderForValue) {
      copyOnWrite();
      instance.addMovies(builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .StoredMovie movies = 2;</code>
     */
    public Builder addMovies(
        int index, StoredMovie.Builder builderForValue) {
      copyOnWrite();
      instance.addMovies(index,
          builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .StoredMovie movies = 2;</code>
     */
    public Builder addAllMovies(
        Iterable<? extends StoredMovie> values) {
      copyOnWrite();
      instance.addAllMovies(values);
      return this;
    }
    /**
     * <code>repeated .StoredMovie movies = 2;</code>
     */
    public Builder clearMovies() {
      copyOnWrite();
      instance.clearMovies();
      return this;
    }
    /**
     * <code>repeated .StoredMovie movies = 2;</code>
     */
    public Builder removeMovies(int index) {
      copyOnWrite();
      instance.removeMovies(index);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:MovieStore)
  }
  @Override
  @SuppressWarnings({"unchecked", "fallthrough"})
  protected final Object dynamicMethod(
      MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new MovieStore();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          Object[] objects = new Object[] {
            "initialized_",
            "movies_",
            StoredMovie.class,
          };
          String info =
              "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0007\u0002\u001b" +
              "";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<MovieStore> parser = PARSER;
        if (parser == null) {
          synchronized (MovieStore.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<MovieStore>(
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


  // @@protoc_insertion_point(class_scope:MovieStore)
  private static final MovieStore DEFAULT_INSTANCE;
  static {
    MovieStore defaultInstance = new MovieStore();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      MovieStore.class, defaultInstance);
  }

  public static MovieStore getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<MovieStore> PARSER;

  public static com.google.protobuf.Parser<MovieStore> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

