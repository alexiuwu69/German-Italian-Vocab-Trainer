package com.example.italianvocabtrainer

sealed class Routes(val name: String) {
    data object Home : Routes("Home")
    data object Practice : Routes("Practice")
    data object Search : Routes("Search")

}