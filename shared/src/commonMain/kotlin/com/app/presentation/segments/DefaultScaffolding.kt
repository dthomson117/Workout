package com.app.presentation.segments

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
@Suppress("ktlint:standard:function-naming")
fun DefaultScaffolding(
    navController: NavController,
    tabBarItems: List<TabBarItem> = NavBarItems.tabBarItems,
    content: @Composable (PaddingValues) -> Unit,
) = Scaffold(
    contentWindowInsets = WindowInsets(0, 0, 0, 0),
    bottomBar = { NavBar(tabBarItems, navController) },
    topBar = { TopBar() },
) { padding -> content(padding) }
