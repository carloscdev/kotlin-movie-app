package com.carloscdev.movieapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import com.carloscdev.movieapp.adapter.MovieAdapter
import com.carloscdev.movieapp.databinding.ActivityMainBinding
import com.carloscdev.movieapp.model.Movie
import com.carloscdev.movieapp.model.MovieClient
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val viewModel: MainActivityViewModel by viewModel()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        // Crea Data Store para guardar lista de movies

        val manager = GridLayoutManager(this, 2)
        binding.recyclerMovie.layoutManager = manager
        lifecycleScope.launch {
            viewModel.fetchMovies()
            val movieListApi = viewModel.getMovies()
            binding.recyclerMovie.adapter =
                MovieAdapter(movieListApi) { movie -> onItemSelected(movie) }
            binding.recyclerMovie.adapter?.notifyDataSetChanged()
        }
    }

    // Envía datos de "movie" y redirige al activity MovieDetailActivity
    private fun onItemSelected(movie: Movie) {
        Toast.makeText(this, "Redirigiendo a: " + movie.name, Toast.LENGTH_SHORT).show()
        val intent = Intent(this, MovieDetailActivity::class.java)
        intent.putExtra("movieId", movie.id)
        intent.putExtra("movieName", movie.name)
        intent.putExtra("movieRelease", movie.release)
        intent.putExtra("moviePlaytime", movie.playtime)
        intent.putExtra("movieDescription", movie.description)
        intent.putExtra("moviePlot", movie.plot)
        intent.putExtra("moviePoster", movie.poster)
        intent.putExtra("movieGif", movie.gif)

        startActivity(intent)
    }
}