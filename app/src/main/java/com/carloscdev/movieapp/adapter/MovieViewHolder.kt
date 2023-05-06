package com.carloscdev.movieapp.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.carloscdev.movieapp.model.Movie
import com.bumptech.glide.Glide
import com.carloscdev.movieapp.databinding.ItemMovieBinding

class MovieViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val binding = ItemMovieBinding.bind(view)

    // Renderiza texto y portada de movies
    fun render(movieModel: Movie, onClickListener:(Movie) -> Unit) {
        binding.tvMovieName.text = movieModel.name
        binding.tvMoviePlaytime.text = "Duración: " + movieModel.playtime
        Glide.with(binding.ivMovie.context).load(movieModel.poster).into(binding.ivMovie)

        // Añade función cuando se pulsa encima de una movie
        itemView.setOnClickListener {
            onClickListener(movieModel)
        }
    }
}