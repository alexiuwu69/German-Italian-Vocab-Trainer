package com.example.italianvocabtrainer.ui.screens.practice

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.italianvocabtrainer.AppState

@Composable
fun Practice(appState: AppState, innerPadding: PaddingValues) {
    Column(
        modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        VocabCard(appState)

        Spacer(modifier = Modifier.height(100.dp))
        
        Button(modifier = Modifier.size(width = 150.dp, height = 70.dp),
            onClick = {
            appState.changeCurrentWordPairToRandom()
            appState.showSolution = false
        }
        ) {
            Text("Next", fontSize = 20.sp)
        }
    }
}

@Composable
fun VocabCard(appState: AppState) {
        Card(
            modifier = Modifier
                .height(200.dp)
                .fillMaxWidth(),
            onClick = { appState.showSolution = !appState.showSolution }
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = appState.currentWordPair.value.first, fontSize = 40.sp)

                if (appState.showSolution)
                    Text(appState.currentWordPair.value.second, fontSize = 40.sp)
            }
        }
}