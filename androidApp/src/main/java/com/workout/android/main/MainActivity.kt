package com.workout.android.main

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.compose.rememberNavController
import com.app.main.MainScreen
import com.app.main.MainViewModel
import com.app.presentation.theme.AppTheme
import com.di.commonModule
import com.workout.android.di.androidModule
import org.koin.android.ext.android.getKoin
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.context.startKoin

class MainActivity : ComponentActivity() {
    private val mainViewModel: MainViewModel by viewModel<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        initialiseKoin(this@MainActivity)

        setContent {
            val navController = rememberNavController()
            val uiState = mainViewModel.uiState.collectAsStateWithLifecycle().value

            AppTheme {
                MainScreen(navController, mainViewModel, uiState, mainViewModel::handleUiEvent)
            }
        }

        splashScreen.setKeepOnScreenCondition {
            false
        }
    }

    private fun initialiseKoin(context: Context) {
        try {
            getKoin()
        } catch (e: IllegalStateException) {
            startKoin {
                androidContext(context)
                modules(androidModule, commonModule)
            }
        }
    }
}
