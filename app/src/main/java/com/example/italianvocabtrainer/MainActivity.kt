package com.example.italianvocabtrainer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.italianvocabtrainer.ui.screens.home.Home
import com.example.italianvocabtrainer.ui.screens.practice.Practice
import com.example.italianvocabtrainer.ui.screens.search.Search
import com.example.italianvocabtrainer.ui.theme.ItalianVocabTrainerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            val appState = AppState(navController)
            ItalianVocabTrainerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NavHost(
                        navController = navController,
                        startDestination = Routes.Home.name
                    ) {
                        composable(Routes.Home.name) {
                            Home(appState, innerPadding)
                        }

                        composable(Routes.Practice.name) {
                            Practice(appState, innerPadding)
                        }

                        composable(Routes.Search.name) {
                            Search(appState, innerPadding)
                        }
                    }
                }
            }
        }
    }
}
