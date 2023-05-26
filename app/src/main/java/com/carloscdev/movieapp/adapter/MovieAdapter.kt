package com.carloscdev.movieapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.get
import androidx.recyclerview.widget.RecyclerView
import com.carloscdev.movieapp.model.Movie
import com.carloscdev.movieapp.R
import com.github.ajalt.timberkt.d
import org.koin.core.component.getScopeId

class MovieAdapter(
    private val movieList: List<Movie>,
    private val removeMovie: (Movie) -> Unit,
    private val onClickListener:(Movie) -> Unit,
) :  RecyclerView.Adapter<MovieViewHolder>() {
    var count: Int = 0
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context);
        val view = layoutInflater.inflate(R.layout.item_movie, parent, false)
        val movie = movieList[count]
        count += 1
        return MovieViewHolder(
            view,
            { removeMovie(movie) }
        )
    }

    override fun getItemCount(): Int {
        return movieList.size;
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val item = movieList[position];
        holder.render(item, onClickListener);
    }
}