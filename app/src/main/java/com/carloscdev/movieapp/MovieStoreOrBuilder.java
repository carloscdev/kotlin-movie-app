// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: movie_store.proto

package com.carloscdev.movieapp;

public interface MovieStoreOrBuilder extends
    // @@protoc_insertion_point(interface_extends:MovieStore)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>bool initialized = 1;</code>
   * @return The initialized.
   */
  boolean getInitialized();

  /**
   * <code>repeated .StoredMovie movies = 2;</code>
   */
  java.util.List<StoredMovie>
      getMoviesList();
  /**
   * <code>repeated .StoredMovie movies = 2;</code>
   */
  StoredMovie getMovies(int index);
  /**
   * <code>repeated .StoredMovie movies = 2;</code>
   */
  int getMoviesCount();
}
