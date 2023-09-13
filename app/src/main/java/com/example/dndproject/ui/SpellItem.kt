package com.example.dndproject.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dndproject.presentation.model.SpellDisplayModeL
import com.example.dndproject.presentation.theme.DnDWhiteDarker
import com.example.dndproject.presentation.theme.Typography



@Preview
@Composable
private fun thisPreview() {
    SpellItem(com.example.dndproject.presentation.testSpell)
}

@Composable
fun SpellItem(spell: SpellDisplayModeL) {
   Box(
        modifier = Modifier
            .padding(8.dp)
            .background(DnDWhiteDarker, RoundedCornerShape(16.dp))
            .absolutePadding(16.dp,8.dp,16.dp,8.dp)
    ) {
        Column(verticalArrangement = Arrangement.Center) {
            SpellTitle(title = spell.name)
            Row {
                Level(level = "${spell.level} level")
                Text(text = ", ")
                School(school = "conjuration")
            }
            Components(components = spell.components)
            CastingTime(castingTime = spell.castingTime)
            Range(range = spell.range)
            Duration(duration = spell.duration)
            Classes(classes = "Warlock")
            SubClasses(subClasses = "Fiend warlock")
            Row {
                SpellDesc(desc = spell.desc)
            }
            OnHigherLevels(onHigherLevels =spell.higherLevel)
        }

    }
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
    Text(text = desc)
}

@Composable
private fun Level(level: String) {
    Text(text = level)
}

@Composable
private fun School(school: String) {
    Text(text = school)
}

@Composable
private fun CastingTime(castingTime: String) {
    Row {
        Text(
            text = "Casting time: ",
            fontWeight = FontWeight.Bold
        )
        Text(text = castingTime)
    }
}

@Composable
private fun Range(range: String) {
    Row {
        Text(
            text = "Range: ",
            fontWeight = FontWeight.Bold
        )
        Text(text = range)
    }
}

@Composable
private fun Components(components: List<String>) {

    Row {
        Text(
            text = "Components: ",
            fontWeight = FontWeight.Bold
        )
        Text(text = components.toString())
    }
}

@Composable
private fun Duration(duration: String) {

    Row {
        Text(
            text = "Duration: ",
            fontWeight = FontWeight.Bold
        )
        Text(text = duration)
    }
}

@Composable
private fun Classes(classes: String) {

    Row {
        Text(
            text = "Classes: ",
            fontWeight = FontWeight.Bold
        )
        Text(text = classes)
    }
}

@Composable
private fun SubClasses(subClasses: String) {

    Row {
        Text(
            text = "SubClasses: ",
            fontWeight = FontWeight.Bold
        )
        Text(text = subClasses)
    }
}

@Composable
private fun OnHigherLevels(onHigherLevels: String) {
        Text(
            text = "On Higher Levels: ",
            fontWeight = FontWeight.Bold
        )
        Text(text = onHigherLevels)
}
