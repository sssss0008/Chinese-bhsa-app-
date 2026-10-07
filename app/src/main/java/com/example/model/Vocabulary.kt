package com.example.model

data class VocabularyItem(
    val id: String,
    val hanzi: String,
    val pinyin: String,
    val meaningEn: String,
    val meaningNe: String,
    val meaningZh: String,
    val meaningJa: String,
    val category: String,
    val exampleHanzi: String,
    val examplePinyin: String,
    val exampleMeaningEn: String,
    val exampleMeaningNe: String,
    val exampleMeaningZh: String,
    val exampleMeaningJa: String,
    val hskLevel: Int = 1
) {
    fun getMeaning(lang: Language): String = when (lang) {
        Language.ENGLISH -> meaningEn
        Language.NEPALI -> meaningNe
        Language.CHINESE -> meaningZh
        Language.JAPANESE -> meaningJa
    }

    fun getExampleMeaning(lang: Language): String = when (lang) {
        Language.ENGLISH -> exampleMeaningEn
        Language.NEPALI -> exampleMeaningNe
        Language.CHINESE -> exampleMeaningZh
        Language.JAPANESE -> exampleMeaningJa
    }
}

data class HanziItem(
    val id: String,
    val character: String,
    val pinyin: String,
    val radical: String,
    val strokeCount: Int,
    val meaningEn: String,
    val meaningNe: String,
    val meaningZh: String,
    val meaningJa: String,
    val mnemonicEn: String,
    val mnemonicNe: String,
    val mnemonicZh: String,
    val mnemonicJa: String,
    val hskLevel: Int = 1
) {
    fun getMeaning(lang: Language): String = when (lang) {
        Language.ENGLISH -> meaningEn
        Language.NEPALI -> meaningNe
        Language.CHINESE -> meaningZh
        Language.JAPANESE -> meaningJa
    }

    fun getMnemonic(lang: Language): String = when (lang) {
        Language.ENGLISH -> mnemonicEn
        Language.NEPALI -> mnemonicNe
        Language.CHINESE -> mnemonicZh
        Language.JAPANESE -> mnemonicJa
    }
}

data class ToneExample(
    val syllable: String,
    val pinyin: String,
    val meaningEn: String,
    val meaningNe: String,
    val meaningZh: String,
    val meaningJa: String
) {
    fun getMeaning(lang: Language): String = when (lang) {
        Language.ENGLISH -> meaningEn
        Language.NEPALI -> meaningNe
        Language.CHINESE -> meaningZh
        Language.JAPANESE -> meaningJa
    }
}

data class PinyinToneItem(
    val toneNumber: Int,
    val toneNameEn: String,
    val toneNameNe: String,
    val toneNameZh: String,
    val toneNameJa: String,
    val markSymbol: String,
    val pitchCurve: String,
    val descriptionEn: String,
    val descriptionNe: String,
    val descriptionZh: String,
    val descriptionJa: String,
    val examples: List<ToneExample>
) {
    fun getToneName(lang: Language): String = when (lang) {
        Language.ENGLISH -> toneNameEn
        Language.NEPALI -> toneNameNe
        Language.CHINESE -> toneNameZh
        Language.JAPANESE -> toneNameJa
    }

    fun getDescription(lang: Language): String = when (lang) {
        Language.ENGLISH -> descriptionEn
        Language.NEPALI -> descriptionNe
        Language.CHINESE -> descriptionZh
        Language.JAPANESE -> descriptionJa
    }
}

data class DialogueLine(
    val speaker: String,
    val hanzi: String,
    val pinyin: String,
    val meaningEn: String,
    val meaningNe: String,
    val meaningZh: String,
    val meaningJa: String
) {
    fun getMeaning(lang: Language): String = when (lang) {
        Language.ENGLISH -> meaningEn
        Language.NEPALI -> meaningNe
        Language.CHINESE -> meaningZh
        Language.JAPANESE -> meaningJa
    }
}

data class DialogueScenario(
    val id: String,
    val titleEn: String,
    val titleNe: String,
    val titleZh: String,
    val titleJa: String,
    val situationEn: String,
    val situationNe: String,
    val situationZh: String,
    val situationJa: String,
    val lines: List<DialogueLine>
) {
    fun getTitle(lang: Language): String = when (lang) {
        Language.ENGLISH -> titleEn
        Language.NEPALI -> titleNe
        Language.CHINESE -> titleZh
        Language.JAPANESE -> titleJa
    }

    fun getSituation(lang: Language): String = when (lang) {
        Language.ENGLISH -> situationEn
        Language.NEPALI -> situationNe
        Language.CHINESE -> situationZh
        Language.JAPANESE -> situationJa
    }
}

data class GrammarExample(
    val hanzi: String,
    val pinyin: String,
    val meaningEn: String,
    val meaningNe: String,
    val meaningZh: String,
    val meaningJa: String,
    val breakdown: String
) {
    fun getMeaning(lang: Language): String = when (lang) {
        Language.ENGLISH -> meaningEn
        Language.NEPALI -> meaningNe
        Language.CHINESE -> meaningZh
        Language.JAPANESE -> meaningJa
    }
}

data class GrammarLesson(
    val id: String,
    val titleEn: String,
    val titleNe: String,
    val titleZh: String,
    val titleJa: String,
    val rulePattern: String,
    val explanationEn: String,
    val explanationNe: String,
    val explanationZh: String,
    val explanationJa: String,
    val examples: List<GrammarExample>
) {
    fun getTitle(lang: Language): String = when (lang) {
        Language.ENGLISH -> titleEn
        Language.NEPALI -> titleNe
        Language.CHINESE -> titleZh
        Language.JAPANESE -> titleJa
    }

    fun getExplanation(lang: Language): String = when (lang) {
        Language.ENGLISH -> explanationEn
        Language.NEPALI -> explanationNe
        Language.CHINESE -> explanationZh
        Language.JAPANESE -> explanationJa
    }
}

data class CultureStory(
    val id: String,
    val hanziTitle: String,
    val pinyinTitle: String,
    val titleEn: String,
    val titleNe: String,
    val titleZh: String,
    val titleJa: String,
    val category: String,
    val iconResId: Int,
    val summaryEn: String,
    val summaryNe: String,
    val summaryZh: String,
    val summaryJa: String,
    val fullTextEn: String,
    val fullTextNe: String,
    val fullTextZh: String,
    val fullTextJa: String,
    val funFactEn: String,
    val funFactNe: String,
    val funFactZh: String,
    val funFactJa: String
) {
    fun getTitle(lang: Language): String = when (lang) {
        Language.ENGLISH -> titleEn
        Language.NEPALI -> titleNe
        Language.CHINESE -> titleZh
        Language.JAPANESE -> titleJa
    }

    fun getSummary(lang: Language): String = when (lang) {
        Language.ENGLISH -> summaryEn
        Language.NEPALI -> summaryNe
        Language.CHINESE -> summaryZh
        Language.JAPANESE -> summaryJa
    }

    fun getFullText(lang: Language): String = when (lang) {
        Language.ENGLISH -> fullTextEn
        Language.NEPALI -> fullTextNe
        Language.CHINESE -> fullTextZh
        Language.JAPANESE -> fullTextJa
    }

    fun getFunFact(lang: Language): String = when (lang) {
        Language.ENGLISH -> funFactEn
        Language.NEPALI -> funFactNe
        Language.CHINESE -> funFactZh
        Language.JAPANESE -> funFactJa
    }
}

data class HistoryMilestone(
    val id: String,
    val era: String,
    val periodYear: String,
    val titleEn: String,
    val titleNe: String,
    val titleZh: String,
    val titleJa: String,
    val iconResId: Int,
    val descriptionEn: String,
    val descriptionNe: String,
    val descriptionZh: String,
    val descriptionJa: String,
    val nepalTieEn: String,
    val nepalTieNe: String,
    val nepalTieZh: String,
    val nepalTieJa: String
) {
    fun getTitle(lang: Language): String = when (lang) {
        Language.ENGLISH -> titleEn
        Language.NEPALI -> titleNe
        Language.CHINESE -> titleZh
        Language.JAPANESE -> titleJa
    }

    fun getDescription(lang: Language): String = when (lang) {
        Language.ENGLISH -> descriptionEn
        Language.NEPALI -> descriptionNe
        Language.CHINESE -> descriptionZh
        Language.JAPANESE -> descriptionJa
    }

    fun getNepalTie(lang: Language): String = when (lang) {
        Language.ENGLISH -> nepalTieEn
        Language.NEPALI -> nepalTieNe
        Language.CHINESE -> nepalTieZh
        Language.JAPANESE -> nepalTieJa
    }
}

enum class QuizType {
    HANZI_TO_MEANING,
    MEANING_TO_HANZI,
    TONE_IDENTIFICATION,
    LISTENING_COMPREHENSION
}

data class QuizQuestion(
    val id: String,
    val type: QuizType,
    val prompt: String,
    val subPrompt: String,
    val options: List<String>,
    val correctIndex: Int,
    val speechTarget: String?,
    val explanationEn: String,
    val explanationNe: String,
    val explanationZh: String,
    val explanationJa: String
) {
    fun getExplanation(lang: Language): String = when (lang) {
        Language.ENGLISH -> explanationEn
        Language.NEPALI -> explanationNe
        Language.CHINESE -> explanationZh
        Language.JAPANESE -> explanationJa
    }
}
