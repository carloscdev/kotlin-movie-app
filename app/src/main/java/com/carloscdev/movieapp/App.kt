package com.carloscdev.movieapp

import android.app.Application
import androidx.datastore.core.DataStore
import androidx.datastore.dataStore
import com.carloscdev.movieapp.model.MovieClient
import com.github.ajalt.timberkt.Timber
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import org.koin.dsl.module

@Suppress("unused")
class App : Application() {

    private val moviesDataStore: DataStore<MovieStore> by dataStore(
        fileName = "movies.pb",
        serializer = MovieStoreSerializer
    )

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        //koin
        startKoin {
            androidLogger(Level.ERROR)
            androidContext(this@App)
            modules(
                module { single { moviesDataStore } },
                mainModule,
                mainActivity
            )
        }
    }

}

val mainModule = module {
    single {
        MovieClient.service
    }
    // app model
    single { Model(movieService = get(), moviesDataStore = get()) }
}

val mainActivity = module {
    viewModel { MainActivityViewModel(model = get()) }
}