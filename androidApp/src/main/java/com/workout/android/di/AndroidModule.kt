package com.workout.android.di

import com.app.main.MainViewModel
import com.data.DatabaseDriverFactory
import com.domain.day.DayReader
import com.domain.day.DayWriter
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val androidModule =
    module {
        single {
            DatabaseDriverFactory(androidContext())
        }

        single {
            DayReader(get())
        }

        single {
            DayWriter(get())
        }

        viewModel {
            MainViewModel(
                dayReader = get(),
                dayWriter = get(),
            )
        }
    }
