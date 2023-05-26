package com.carloscdev.movieapp

import com.carloscdev.movieapp.model.Movie
import com.carloscdev.movieapp.model.MovieService
import com.github.ajalt.timberkt.d
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class  Model(private val movieService: MovieService) {
    private var coroutineScope = CoroutineScope(Job() + Dispatchers.Default)

    suspend fun fetchMovies(): List<Movie> {
        return movieService.listMovies()
    }
}