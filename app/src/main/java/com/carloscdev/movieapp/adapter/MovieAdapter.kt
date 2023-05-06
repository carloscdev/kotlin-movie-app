package com.carloscdev.movieapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.carloscdev.movieapp.model.Movie
import com.carloscdev.movieapp.R

class MovieAdapter(private val movieList: List<Movie>, private val onClickListener:(Movie) -> Unit) :  RecyclerView.Adapter<MovieViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context);
        return MovieViewHolder(layoutInflater.inflate(R.layout.item_movie, parent, false))
    }

    override fun getItemCount(): Int {
        return movieList.size;
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val item = movieList[position];
        holder.render(item, onClickListener);
    }
}