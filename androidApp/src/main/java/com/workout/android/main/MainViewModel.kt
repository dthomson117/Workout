package com.workout.android.main

import android.util.Log
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    fun test() {
        Log.d(this::class.java.simpleName, "test")
    }
}