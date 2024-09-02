package com.example.italianvocabtrainer.ui.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.italianvocabtrainer.AppState
import com.example.italianvocabtrainer.Routes

@Composable
fun Home(appState: AppState, innerPadding: PaddingValues) {
    Row(
        modifier = Modifier.padding(innerPadding)
            .fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        HomeElement(
            appState = appState,
            name = "Practice",
            route = Routes.Practice,
            color = Color.Cyan)

        HomeElement(
            appState = appState,
            name = "Search",
            route = Routes.Search,
            color = Color.Magenta)
    }
}

@Composable
fun HomeElement(
    appState: AppState,
    name: String,
    route: Routes,
    color: Color
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Surface(
            shape = RoundedCornerShape(15),
            color = color,
            onClick = { appState.changeScreen(route) },
            modifier = Modifier.size(50.dp)
        ) {}
        
        Text(text = name)
    }
}