package com.workout.android.main

import android.util.Log
import androidx.lifecycle.ViewModel
import com.data.Database
import kotlinx.coroutines.runBlocking

class MainViewModel(
    database: Database,
) : ViewModel() {
    init {
        database.getAllDays()
        runBlocking {
            database.addPplSplit()
        }
    }

    fun test() {
        Log.d(this::class.java.simpleName, "test")
    }
}
