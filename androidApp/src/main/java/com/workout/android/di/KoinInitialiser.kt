package com.workout.android.di

import android.content.Context
import org.koin.android.ext.koin.androidContext
import org.koin.core.component.KoinComponent
import org.koin.core.context.startKoin

object KoinInitialiser : KoinComponent {
    fun initialiseKoin(context: Context) {
        startKoin {
            androidContext(context)
            modules(androidModule)
        }
    }
}