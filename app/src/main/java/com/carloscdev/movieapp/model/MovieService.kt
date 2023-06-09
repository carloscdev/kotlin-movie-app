package com.carloscdev.movieapp.model

import retrofit2.Call
import retrofit2.http.GET

interface MovieService {

    // Path para obtener listado de movies
    @GET("DisneyPosters2.json")
    suspend fun listMovies(): List<Movie>
}