package com.carloscdev.movieapp.model

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object MovieClient {

    // Configuración Retrofit
    // Se establece el BASE URL y se convierte la respuesta JSON
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://gist.githubusercontent.com/skydoves/176c209dbce4a53c0ff9589e07255f30/raw/6489d9712702e093c4df71500fb822f0d408ef75/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    // Se utiliza
    val service: MovieService = retrofit.create(MovieService::class.java)
}