package com.carloscdev.movieapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.carloscdev.movieapp.databinding.ActivityMovieDetailBinding

class MovieDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMovieDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovieDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvMovieName.text = intent.getStringExtra("movieName")
        binding.tvMovieDescription.text = intent.getStringExtra("movieDescription")
        binding.tvMoviePlaytime.text = "Duración: " + intent.getStringExtra("moviePlaytime")
        binding.tvMovieRelease.text = "Release: " + intent.getStringExtra("movieRelease")
        Glide.with(binding.ivMoviePoster.context).load(intent.getStringExtra("moviePoster")).into(binding.ivMoviePoster)
        Glide.with(binding.ivMovieGif.context).load(intent.getStringExtra("movieGif")).into(binding.ivMovieGif)
    }
}