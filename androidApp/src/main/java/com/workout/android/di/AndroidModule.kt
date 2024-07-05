package com.workout.android.di

import com.workout.android.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val androidModule = module {
    viewModel { MainViewModel() }
}