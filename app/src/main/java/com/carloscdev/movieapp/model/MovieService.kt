package com.carloscdev.movieapp.model

import retrofit2.Call
import retrofit2.http.GET

interface MovieService {

    @GET("DisneyPosters2.json")
    fun listMovies(): Call<List<Movie>?>?
}