package com.example.model

enum class Language(
    val code: String,
    val nativeName: String,
    val englishName: String,
    val flag: String
) {
    ENGLISH("en", "English", "English", "🇬🇧"),
    NEPALI("ne", "नेपाली", "Nepali", "🇳🇵"),
    CHINESE("zh", "中文", "Chinese", "🇨🇳"),
    JAPANESE("ja", "日本語", "Japanese", "🇯🇵")
}
