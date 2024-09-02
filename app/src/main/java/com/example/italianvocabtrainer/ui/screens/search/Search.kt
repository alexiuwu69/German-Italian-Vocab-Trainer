package com.example.italianvocabtrainer.ui.screens.search

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.italianvocabtrainer.AppState
import com.example.italianvocabtrainer.Word

@Composable
fun Search(appState: AppState, innerPadding: PaddingValues) {
    var searchTerm by rememberSaveable { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        TextField(
            value = searchTerm,
            onValueChange = { searchTerm = it },
            modifier = Modifier.height(55.dp))

        WordRow(wordPair = Word("German", "Italian"))
        
        for (word in appState.wordList) {
            if (searchTerm.lowercase() in word.german.lowercase() ||
                searchTerm.lowercase() in word.italian.lowercase() ||
                searchTerm == "")
                WordRow(word)
        }
    }
}

@Composable
fun WordRow(wordPair: Word) {
    Row(modifier = Modifier.fillMaxWidth()
        .padding(horizontal = 10.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(wordPair.german)
        Text(wordPair.italian)
    }
}