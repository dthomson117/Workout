package com.workout.android.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import com.workout.android.di.KoinInitialiser
import com.workout.android.presentation.theme.AppTheme
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : ComponentActivity() {
    private val mainViewModel: MainViewModel by viewModel<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)

        KoinInitialiser.initialiseKoin(this@MainActivity)

        splashScreen.setKeepOnScreenCondition {
            false
        }

        setContent {
            val navController = rememberNavController()

            AppTheme {
                MainScreen(navController)
            }
        }
    }
}
