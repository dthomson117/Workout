package com.workout.android.main

import android.util.Log
import androidx.lifecycle.ViewModel
import com.data.Database

class MainViewModel(
    database: Database,
) : ViewModel() {
    init {
        database.getAllDays()
    }

    fun test() {
        Log.d(this::class.java.simpleName, "test")
    }
}
