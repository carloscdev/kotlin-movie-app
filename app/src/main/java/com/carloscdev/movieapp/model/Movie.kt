package com.carloscdev.movieapp.model

data class Movie(
    val id: Int,
    val name: String,
    val release: String,
    val playtime: String,
    val description: String,
    val plot: String,
    val poster: String,
    val gif: String
)