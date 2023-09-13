package com.example.dndproject.presentation.main

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Spells : BottomBarScreen(
        route = "spells",
        title = "Spells",
        icon = Icons.Default.DateRange
    )

    object Favourite : BottomBarScreen(
        route = "Favourite",
        title = "Favourite",
        icon = Icons.Default.Favorite
    )
}