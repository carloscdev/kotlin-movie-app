package com.carloscdev.movieapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.carloscdev.movieapp.adapter.MovieAdapter
import com.carloscdev.movieapp.databinding.ActivityMainBinding
import com.carloscdev.movieapp.model.Movie
import com.carloscdev.movieapp.model.MovieClient
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, "Bienvenido !!!", Toast.LENGTH_SHORT).show()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        val manager = GridLayoutManager(this, 2)
        binding.recyclerMovie.layoutManager = manager
        thread {
            val movieListApi = MovieClient.service.listMovies()
            val body = movieListApi?.execute()?.body()
            runOnUiThread {
                if (body != null)
                    binding.recyclerMovie.adapter = MovieAdapter(body) { movie -> onItemSelected(movie) }
            }

        }

    }

    private fun onItemSelected(movie: Movie) {
        Toast.makeText(this, "Redirigiendo a: " + movie.name, Toast.LENGTH_SHORT).show()
        /* val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("movieId", movie.id)
        intent.putExtra("movieName", movie.name)
        intent.putExtra("movieRelease", movie.release)
        intent.putExtra("moviePlaytime", movie.playtime)
        intent.putExtra("movieDescription", movie.description)
        intent.putExtra("moviePlot", movie.plot)
        intent.putExtra("moviePoster", movie.poster)
        intent.putExtra("movieGif", movie.gif)

        startActivity(intent)
        */
    }
}