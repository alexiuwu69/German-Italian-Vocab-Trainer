package com.example.italianvocabtrainer

data class WordPair(val german: String, val italian: String) {
    fun getRandomOrder() = listOf(Pair(german, italian), Pair(italian, german)).random()
}

fun getWords(): List<WordPair> {
    val words = mutableListOf(
        WordPair("die Abschiebung", "l'espulsione (f.)"),
        WordPair("die Angst", "la paura"),
        WordPair("die Arbeit", "il lavoro"),
        WordPair("die Armut", "la povertà"),
        WordPair("das Asyl", "l'asilo (politico)"),
        WordPair("die Aufenthaltserlaubnis", "il permesso di soggiorno"),
        WordPair("die Ausländerfeindlichkeit", "la xenofobia"),
        WordPair("die Aussichtslosigkeit", "la situazione disperata"),
        WordPair("die Behörde", "l'autorità"),
        WordPair("der Bürgerkrieg", "la guerra civile"),
        WordPair("die Diskriminierung", "la discriminazione"),
        WordPair("der Durst", "la sete"),
        WordPair("die Einwanderungspolitik", "la politica sull'immigrazione"),
        WordPair("das Elend", "la miseria"),
        WordPair("die Entwurzelung", "lo sradicamento"),
        WordPair("ertrinken", "affogare; annegare"),
        WordPair("farbig", "colorato, -a"),
        WordPair("das Festland", "la terraferma"),
        WordPair("die Festnahme", "l'arresto"),
        WordPair("fliehen (vor)", "fuggire (da)"),
        WordPair("die Flucht", "la fuga"),
        WordPair("der Flüchtling", "il rifugiato"),
        WordPair("die Gefahr", "il pericolo; il rischio"),
        WordPair("gefährlich", "pericoloso, -a"),
        WordPair("das Gesetz", "la legge"),
        WordPair("die Gesetzesmissachtung", "la disubbidienza alla legge")
    )
    return words
}