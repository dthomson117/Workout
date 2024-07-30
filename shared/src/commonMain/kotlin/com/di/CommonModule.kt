package com.di

import com.data.createDatabase
import org.koin.dsl.module

val commonModule =
    module {
        single {
            createDatabase(get())
        }
    }
