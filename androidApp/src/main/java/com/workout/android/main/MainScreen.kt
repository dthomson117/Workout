package com.workout.android.main

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.workout.android.presentation.segments.DefaultScaffolding

@Suppress("ktlint:standard:function-naming")
@Composable
fun MainScreen(navController: NavController) {
    DefaultScaffolding(
        navController = navController,
    ) { padding ->
        Column {
            Text("Hello World!")
        }
    }
}
