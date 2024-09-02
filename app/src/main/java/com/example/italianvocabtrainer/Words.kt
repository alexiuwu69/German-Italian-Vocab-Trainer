package com.example.italianvocabtrainer

data class Word(val german: String, val italian: String) {
    fun getRandomOrder() = listOf(Pair(german, italian), Pair(italian, german)).random()
}

fun getWords(): List<Word> {
    val words = mutableListOf(
        Word("Hallo", "Buongiorno"),
        Word("Das Segelboot", "La barca la vela"),
        Word("hungrig", "affamato"),
        Word("bedeuten", "significare"),
        Word("warum", "come mai"),
        Word("trinkbar", "potabile"),
        Word("hilfsbereit", "aiutevole")
    )

    return words
}