package com.example.dndproject.presentation.main

import android.util.Log
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.imePadding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.ContentAlpha
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.dndproject.presentation.favorite.FavouriteState
import com.example.dndproject.presentation.spells.SpellsState
import com.example.dndproject.presentation.theme.DnDProjectTheme
import com.example.dndproject.presentation.theme.DnDRed


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainActivityScreen() {

    lateinit var navigateToSpells: () -> Unit
    lateinit var navigateToFavourite: () -> Unit

    DnDProjectTheme {
        val navController = rememberNavController()
        navigateToSpells = { navController.navigate( BottomBarScreen.Spells.route) }
        navigateToFavourite = { navController.navigate(BottomBarScreen.Favourite.route) }
        Surface(
            color = MaterialTheme.colorScheme.background
        )
        {
            Scaffold(
                topBar = { },
                bottomBar = {
                    BottomNavigationBar(navController = navController)
                }
            ) {
                it
                NavHost(
                    navController = navController,
                    startDestination = BottomBarScreen.Spells.route
                ) {
                    composable(BottomBarScreen.Spells.route) { SpellsState() }
                    composable(BottomBarScreen.Favourite.route) { FavouriteState() }
                }
            }
        }
    }
}

@Composable
private fun BottomNavigationBar(navController: NavHostController) {
    val screens = listOf(
        BottomBarScreen.Favourite,
        BottomBarScreen.Spells,
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    BottomNavigation(backgroundColor = DnDRed) {
        screens.forEach { screen ->
            AddItem(
                screen = screen,
                currentDestination = currentDestination,
                navController = navController
            )
        }
    }
}

@Composable
private fun RowScope.AddItem(
    screen: BottomBarScreen,
    currentDestination: NavDestination?,
    navController: NavHostController
) {
    BottomNavigationItem(
        label = {
            Text(text = screen.title)
        },
        icon = {
            Icon(
                imageVector = screen.icon,
                contentDescription = "Navigation Icon"
            )
        },
        selected = currentDestination?.hierarchy?.any {
            it.route == screen.route
        } == true,
        unselectedContentColor = LocalContentColor.current.copy(alpha = ContentAlpha.disabled),
        onClick = {
            navController.navigate(screen.route) {
                popUpTo(navController.graph.findStartDestination().id)
                launchSingleTop = true
            }
        }
    )
}



