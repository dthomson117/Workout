package com.workout.android.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.workout.android.presentation.segments.NavBar
import com.workout.android.presentation.segments.NavBarItems
import com.workout.android.presentation.segments.TabBarItem
import com.workout.android.presentation.segments.TopBar

@Suppress("ktlint:standard:function-naming")
@Composable
fun BaseScreen(
    navController: NavController,
    tabBarItems: List<TabBarItem> = NavBarItems.tabBarItems,
) {
    Scaffold(
        contentWindowInsets = WindowInsets(0, 0, 0, 0),
        bottomBar = { NavBar(tabBarItems, navController) },
        topBar = { TopBar() },
    ) { padding ->
        Column(
            modifier =
                androidx.compose.ui.Modifier
                    .padding(padding),
        ) {
            Text("test")
        }
    }
}
