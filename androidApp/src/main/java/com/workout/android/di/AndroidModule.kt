package com.workout.android.di

import com.data.DriverFactory
import com.domain.day.DayReader
import com.domain.day.DayWriter
import com.viewmodels.MainViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val androidModule =
    module {
        single {
            DriverFactory(androidContext())
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
