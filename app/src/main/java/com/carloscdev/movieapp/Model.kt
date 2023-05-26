package com.carloscdev.movieapp

import androidx.datastore.core.DataStore
import com.carloscdev.movieapp.model.Movie
import com.carloscdev.movieapp.model.MovieService
import com.github.ajalt.timberkt.d
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

class  Model(private val movieService: MovieService, private val moviesDataStore: DataStore<MovieStore>) {
    private var coroutineScope = CoroutineScope(Job() + Dispatchers.Default)

    private val _movies = MutableStateFlow<List<Movie>>(listOf())
    val movies = _movies as StateFlow<List<Movie>>

    init {
        coroutineScope.launch {
            moviesDataStore.data
                .map { it.initialized }
                .filter { !it }
                .first {
                    d { "Initialize data store..." }
                    initDataStore()
                    return@first true
                }
        }
        coroutineScope.launch {
            moviesDataStore.data.collect {movieStore ->
                d { "Movies count: ${movieStore.moviesCount}" }
                val movies = movieStore.moviesList.map { Movie.fromStoredMovie(it) }
                _movies.emit(movies)
            }
        }
    }

    private fun initDataStore() {
        coroutineScope.launch {
            val movieList =  movieService.listMovies()
            d { "$movieList" }
            val moviesToStore = movieList.map { it.asStoredMovie() }
            moviesDataStore.updateData { movieStore ->
                movieStore.toBuilder()
                    .addAllMovies(moviesToStore)
                    .setInitialized(true)
                    .build()
            }
        }
    }

    fun removeMovie(movie: Movie) {
        val toStoreMovies = movies.value
            .filter { it.id != movie.id }
            .map { it.asStoredMovie() }

        coroutineScope.launch {
            moviesDataStore.updateData { movieStore ->
                movieStore.toBuilder()
                    .clearMovies()
                    .addAllMovies(toStoreMovies)
                    .build()
            }
        }
    }
}