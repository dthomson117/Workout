package com.workout.android.di

import com.data.Database
import com.data.DriverFactory
import com.workout.android.main.MainViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val androidModule =
    module {
        viewModel { MainViewModel(get()) }

        single {
            Database(DriverFactory(androidContext()))
        }
    }
