package com.example.italianvocabtrainer

data class Word(val german: String, val italian: String) {
    fun getRandomOrder() = listOf(Pair(german, italian), Pair(italian, german)).random()
}

fun getWords(): List<Word> {
    val words = mutableListOf(
        Word("die Abschiebung", "l'espulsione (f.)"),
        Word("die Angst", "la paura"),
        Word("die Arbeit", "il lavoro"),
        Word("die Armut", "la povertà"),
        Word("das Asyl", "l'asilo (politico)"),
        Word("die Aufenthaltserlaubnis", "il permesso di soggiorno"),
        Word("die Ausländerfeindlichkeit", "la xenofobia"),
        Word("die Aussichtslosigkeit", "la situazione disperata"),
        Word("die Behörde", "l'autorità"),
        Word("der Bürgerkrieg", "la guerra civile"),
        Word("die Diskriminierung", "la discriminazione"),
        Word("der Durst", "la sete"),
        Word("die Einwanderungspolitik", "la politica sull'immigrazione"),
        Word("das Elend", "la miseria"),
        Word("die Entwurzelung", "lo sradicamento"),
        Word("ertrinken", "affogare; annegare"),
        Word("farbig", "colorato, -a"),
        Word("das Festland", "la terraferma"),
        Word("die Festnahme", "l'arresto"),
        Word("fliehen (vor)", "fuggire (da)"),
        Word("die Flucht", "la fuga"),
        Word("der Flüchtling", "il rifugiato"),
        Word("die Gefahr", "il pericolo; il rischio"),
        Word("gefährlich", "pericoloso, -a"),
        Word("das Gesetz", "la legge"),
        Word("die Gesetzesmissachtung", "la disubbidienza alla legge")
    )
    // TODO: More words
    return words
}