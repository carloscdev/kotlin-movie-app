package com.carloscdev.movieapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.carloscdev.movieapp.model.Movie
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivityViewModel(private val model: Model) : ViewModel() {
    val movies = model.movies

    fun removeMovie(movie: Movie) {
        model.removeMovie(movie)
    }
}