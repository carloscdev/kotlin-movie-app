package com.carloscdev.movieapp.model

import com.carloscdev.movieapp.StoredMovie

// Data que viene del servicio REST
data class Movie(
    val id: Int,
    val name: String,
    val release: String,
    val playtime: String,
    val description: String,
    val plot: String,
    val poster: String,
    val gif: String
) {
    companion object {
        fun fromStoredMovie(storedMovie: StoredMovie): Movie {
            return Movie(
                storedMovie.id,
                storedMovie.name,
                storedMovie.release,
                storedMovie.playtime,
                storedMovie.description,
                storedMovie.plot,
                storedMovie.poster,
                storedMovie.gif
            )
        }
    }
    fun asStoredMovie(): StoredMovie {
        return StoredMovie.newBuilder()
            .setId(id)
            .setName(name)
            .setRelease(release)
            .setPlaytime(playtime)
            .setDescription(description)
            .setPlot(plot)
            .setPoster(poster)
            .setGif(gif)
            .build()
    }
}