package com.workout.android.presentation.segments

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.DateRange
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.workout.android.R

@Suppress("ktlint:standard:function-naming")
@Composable
fun NavBar(
    tabBarItems: List<TabBarItem>,
    navController: NavController,
) {
    var selectedTabIndex by rememberSaveable {
        mutableIntStateOf(0)
    }

    NavigationBar(
        windowInsets = WindowInsets(0, 0, 0, 0),
    ) {
        // looping over each tab to generate the views and navigation for each item
        tabBarItems.forEachIndexed { index, tabBarItem ->
            NavigationBarItem(
                selected = selectedTabIndex == index,
                onClick = {
                    selectedTabIndex = index
                    navController.navigate("test")
                },
                icon = {
                    TabBarIconView(
                        isSelected = selectedTabIndex == index,
                        selectedIcon = tabBarItem.selectedIcon,
                        unselectedIcon = tabBarItem.unselectedIcon,
                        badgeAmount = tabBarItem.badgeAmount,
                        contentDescriptionId = tabBarItem.contentDescriptionId,
                    )
                },
            )
        }
    }
}

@Suppress("ktlint:standard:function-naming")
// This component helps to clean up the API call from our TabView above,
// but could just as easily be added inside the TabView without creating this custom component
@Composable
fun TabBarIconView(
    isSelected: Boolean,
    selectedIcon: ImageVector,
    unselectedIcon: ImageVector,
    badgeAmount: Int? = null,
    contentDescriptionId: Int,
) {
    BadgedBox(badge = { TabBarBadgeView(badgeAmount) }) {
        Icon(
            imageVector =
                if (isSelected) {
                    selectedIcon
                } else {
                    unselectedIcon
                },
            contentDescription = stringResource(contentDescriptionId),
            modifier =
                Modifier
                    .size(32.dp),
        )
    }
}

@Suppress("ktlint:standard:function-naming")
// This component helps to clean up the API call from our TabBarIconView above,
// but could just as easily be added inside the TabBarIconView without creating this custom component
@Composable
fun TabBarBadgeView(count: Int? = null) {
    if (count != null) {
        Badge {
            Text(count.toString())
        }
    }
}

data class TabBarItem(
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val badgeAmount: Int? = null,
    val contentDescriptionId: Int,
)

object NavBarItems {
    private val settingsTab =
        TabBarItem(
            selectedIcon = Icons.Filled.Settings,
            unselectedIcon = Icons.Outlined.Settings,
            contentDescriptionId = R.string.settings_cd,
        )
    private val profileTab =
        TabBarItem(
            selectedIcon = Icons.Filled.AccountCircle,
            unselectedIcon = Icons.Outlined.AccountCircle,
            contentDescriptionId = R.string.profile_cd,
        )
    private val calendarTab =
        TabBarItem(
            selectedIcon = Icons.Filled.DateRange,
            unselectedIcon = Icons.Outlined.DateRange,
            contentDescriptionId = R.string.caldenar_cd,
        )
    private val sideTab =
        TabBarItem(
            selectedIcon = Icons.Filled.Menu,
            unselectedIcon = Icons.Outlined.Menu,
            contentDescriptionId = R.string.side_menu_cd,
        )

    // creating a list of all the tabs
    val tabBarItems = listOf(settingsTab, profileTab, calendarTab, sideTab)
}
