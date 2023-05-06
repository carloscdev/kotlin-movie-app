package com.carloscdev.movieapp.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.carloscdev.movieapp.model.Movie
import com.bumptech.glide.Glide
import com.carloscdev.movieapp.databinding.ItemMovieBinding

class MovieViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val binding = ItemMovieBinding.bind(view)

    fun render(movieModel: Movie, onClickListener:(Movie) -> Unit) {
        binding.tvMovieName.text = movieModel.name
        binding.tvMoviePlaytime.text = "Duración: " + movieModel.playtime
        Glide.with(binding.ivMovie.context).load(movieModel.poster).into(binding.ivMovie)

        itemView.setOnClickListener {
            onClickListener(movieModel)
        }
    }
}