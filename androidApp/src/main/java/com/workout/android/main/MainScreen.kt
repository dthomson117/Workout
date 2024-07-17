package com.workout.android.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.workout.android.presentation.segments.DefaultScaffolding

@Suppress("ktlint:standard:function-naming")
@Composable
fun MainScreen(
    navController: NavController,
    viewModel: MainViewModel,
) {
    DefaultScaffolding(
        navController = navController,
    ) { padding ->
        Column(
            Modifier
                .padding(padding),
        ) {
            Text("Hello World!")
        }
    }
}
