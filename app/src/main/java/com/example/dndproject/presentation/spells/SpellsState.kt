package com.example.dndproject.presentation.spells

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import com.example.dndproject.presentation.testSpell
import com.example.dndproject.ui.SpellItem
import com.example.dndproject.ui.SpellListItem


@Composable
fun SpellsState(viewModel: SpellViewModel= SpellViewModel()) {
    Box(contentAlignment = Alignment.Center) {
       // SpellItem(testSpell)
        LazyColumn(){
            items(viewModel.testListOFSpells){
                SpellListItem(spell = testSpell){}
            }
        }

    }
}