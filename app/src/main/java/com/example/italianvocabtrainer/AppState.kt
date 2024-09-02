package com.example.italianvocabtrainer

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController

class AppState(private val navController: NavController) : ViewModel() {
    private var currentRoute: Routes = Routes.Home
    val wordList = getWords()

    private var _currentWordPair = mutableStateOf(wordList.random().getRandomOrder())
    val currentWordPair = _currentWordPair

    var showSolution by mutableStateOf(false)

    fun changeScreen(newRoute: Routes) {
        currentRoute = newRoute
        navController.navigate(currentRoute.name)
    }

    fun changeCurrentWordPairToRandom() {
        _currentWordPair.value = wordList.random().getRandomOrder()
    }
}