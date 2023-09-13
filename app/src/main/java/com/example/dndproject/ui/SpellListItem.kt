package com.example.dndproject.ui

import android.graphics.drawable.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dndproject.presentation.model.SpellDisplayModeL
import com.example.dndproject.presentation.testSpell
import com.example.dndproject.presentation.theme.DnDWhiteDarker
import com.example.dndproject.presentation.theme.Typography


@Preview
@Composable
private fun thisPreview() {
    SpellListItem(testSpell) {
    }
}

@Composable
fun SpellListItem(spell: SpellDisplayModeL, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .padding(8.dp)
            .background(DnDWhiteDarker, RoundedCornerShape(16.dp))
            .absolutePadding(16.dp, 8.dp, 16.dp, 8.dp)
            .clickable { onClick }
    ) {

        Row() {
            Column() {
                SpellTitle(title = spell.name)
                Row {
                    Level(level = "${spell.level} level, ")
                    School(school = "conjuration")
                }
                SpellDesc(desc = spell.desc)
            }
            FavouriteButton {
                onClick
            }
        }

    }
}

@Composable
private fun FavouriteButton(onClick: () -> Unit) {
    androidx.compose.material3.Icon(
        imageVector = Icons.Default.Favorite,
        contentDescription = "Favourite",
        modifier = Modifier
            .clickable { onClick }
    )
}

@Composable
private fun SpellTitle(title: String) {
    Text(
        text = title,
        style = Typography.titleLarge
    )
}

@Composable
private fun SpellDesc(desc: String) {
    Text(text = "${desc.dropLast((desc.length / 1.3).toInt())}...")
}

@Composable
private fun Level(level: String) {
    Text(text = level)
}

@Composable
private fun School(school: String) {
    Text(text = school)
}