package com.example.italianvocabtrainer.ui.screens.search

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.italianvocabtrainer.AppState
import com.example.italianvocabtrainer.WordPair

@Composable
fun Search(appState: AppState, innerPadding: PaddingValues) {
    var searchTerm by rememberSaveable { mutableStateOf("") }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
    ) {
        TextField(
            value = searchTerm,
            onValueChange = { searchTerm = it },
            modifier = Modifier.height(55.dp))

        WordRow(wordPair = WordPair("German", "Italian"))
        GenerateWordRows(appState, searchTerm)
    }
}

@Composable
fun GenerateWordRows(appState: AppState, searchTerm: String) {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        for (word in appState.wordList.filter { showWord(searchTerm, it) }) {
                WordRow(word)
                HorizontalDivider()
        }
    }
}

fun showWord(searchTerm: String, word: WordPair): Boolean { // added this to make the for loop above more readable
    return searchTerm.lowercase() in word.german.lowercase() ||
        searchTerm.lowercase() in word.italian.lowercase() ||
        searchTerm == ""
}

@Composable
fun WordRow(wordPair: WordPair) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Surface(modifier = Modifier.fillMaxWidth(0.5f)) {
            Text(
                text = wordPair.german,
                textAlign = TextAlign.Start
            )
        }

        Surface(modifier = Modifier.fillMaxWidth()) {
            Text(
                text = wordPair.italian,
                textAlign = TextAlign.End
            )
        }
    }
}