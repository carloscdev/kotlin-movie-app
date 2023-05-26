package com.carloscdev.movieapp

import android.app.Application
import androidx.datastore.core.DataStore
import androidx.datastore.dataStore
import com.carloscdev.movieapp.model.MovieClient
import com.carloscdev.movieapp.model.MovieService
import com.github.ajalt.timberkt.Timber
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//@Suppress("unused")
class App : Application() {

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
    single { Model(movieService = get()) }
}

val mainActivity = module {
    viewModel { MainActivityViewModel(model = get()) }
}