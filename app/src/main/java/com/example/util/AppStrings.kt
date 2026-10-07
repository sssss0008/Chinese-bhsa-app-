package com.example.util

import com.example.model.Language

object AppStrings {
    fun appTitle(lang: Language): String = when (lang) {
        Language.ENGLISH -> "Chinese Bhasa"
        Language.NEPALI -> "चिनियाँ भाषा"
        Language.CHINESE -> "中文学习"
        Language.JAPANESE -> "中国語学習"
    }

    fun tabHome(lang: Language): String = when (lang) {
        Language.ENGLISH -> "Home"
        Language.NEPALI -> "गृह पृष्ठ"
        Language.CHINESE -> "首页"
        Language.JAPANESE -> "ホーム"
    }

    fun tabLearn(lang: Language): String = when (lang) {
        Language.ENGLISH -> "Learn"
        Language.NEPALI -> "सिक्नुहोस्"
        Language.CHINESE -> "学习"
        Language.JAPANESE -> "学習"
    }

    fun tabPractice(lang: Language): String = when (lang) {
        Language.ENGLISH -> "Practice"
        Language.NEPALI -> "अभ्यास"
        Language.CHINESE -> "练习"
        Language.JAPANESE -> "練習"
    }

    fun tabAbout(lang: Language): String = when (lang) {
        Language.ENGLISH -> "About"
        Language.NEPALI -> "एप विवरण"
        Language.CHINESE -> "关于"
        Language.JAPANESE -> "アプリ情報"
    }

    fun greeting(lang: Language): String = when (lang) {
        Language.ENGLISH -> "Welcome to Chinese Bhasa"
        Language.NEPALI -> "चिनियाँ भाषा सिक्न स्वागत छ!"
        Language.CHINESE -> "欢迎学习中文！"
        Language.JAPANESE -> "中国語学習へようこそ！"
    }

    fun subtitle(lang: Language): String = when (lang) {
        Language.ENGLISH -> "Master Mandarin with Pinyin, Hanzi, Audio & Culture"
        Language.NEPALI -> "पिनयिन, हान्जी, अडियो र संस्कृतिसहित मन्डारिन सिक्नुहोस्"
        Language.CHINESE -> "掌握拼音、汉字、听力与深厚文化"
        Language.JAPANESE -> "ピンイン、漢字、発音、文化を総合的に学ぼう"
    }

    fun dailyStreak(lang: Language): String = when (lang) {
        Language.ENGLISH -> "Day Streak"
        Language.NEPALI -> "दिनको निरन्तरता"
        Language.CHINESE -> "连续学习天数"
        Language.JAPANESE -> "連続学習日数"
    }

    fun dailyGoal(lang: Language): String = when (lang) {
        Language.ENGLISH -> "Daily Goal"
        Language.NEPALI -> "दैनिक लक्ष्य"
        Language.CHINESE -> "今日目标"
        Language.JAPANESE -> "今日の目標"
    }

    fun characterOfTheDay(lang: Language): String = when (lang) {
        Language.ENGLISH -> "Character of the Day"
        Language.NEPALI -> "आजको चिनियाँ अक्षर (हान्जी)"
        Language.CHINESE -> "今日汉字"
        Language.JAPANESE -> "今日の漢字"
    }

    fun proverbsTitle(lang: Language): String = when (lang) {
        Language.ENGLISH -> "Chinese Proverb (成语)"
        Language.NEPALI -> "चिनियाँ उखान (चेङ्यु)"
        Language.CHINESE -> "每日成语"
        Language.JAPANESE -> "中国の成語"
    }

    fun cultureHighlight(lang: Language): String = when (lang) {
        Language.ENGLISH -> "Culture & Heritage"
        Language.NEPALI -> "संस्कृति र परम्परा"
        Language.CHINESE -> "传统与文化"
        Language.JAPANESE -> "中国の伝統と文化"
    }

    fun historyHighlight(lang: Language): String = when (lang) {
        Language.ENGLISH -> "History & Nepal Connection"
        Language.NEPALI -> "इतिहास र नेपाल सम्बन्ध"
        Language.CHINESE -> "历史与中尼情谊"
        Language.JAPANESE -> "歴史と交流"
    }

    fun learnPinyin(lang: Language): String = when (lang) {
        Language.ENGLISH -> "Pinyin & Tones"
        Language.NEPALI -> "पिनयिन र स्वरहरू"
        Language.CHINESE -> "拼音声调"
        Language.JAPANESE -> "ピンインと声調"
    }

    fun learnVocab(lang: Language): String = when (lang) {
        Language.ENGLISH -> "Vocabulary"
        Language.NEPALI -> "शब्दावली"
        Language.CHINESE -> "词汇宝库"
        Language.JAPANESE -> "重要単語"
    }

    fun learnHanzi(lang: Language): String = when (lang) {
        Language.ENGLISH -> "Hanzi Characters"
        Language.NEPALI -> "हान्जी अक्षरहरू"
        Language.CHINESE -> "常用汉字"
        Language.JAPANESE -> "基本漢字"
    }

    fun learnDialogues(lang: Language): String = when (lang) {
        Language.ENGLISH -> "Dialogues"
        Language.NEPALI -> "संवादहरू"
        Language.CHINESE -> "情景对话"
        Language.JAPANESE -> "実用会話"
    }

    fun learnGrammar(lang: Language): String = when (lang) {
        Language.ENGLISH -> "Grammar"
        Language.NEPALI -> "व्याकरण"
        Language.CHINESE -> "语法精讲"
        Language.JAPANESE -> "文法要点"
    }

    fun practiceFlashcards(lang: Language): String = when (lang) {
        Language.ENGLISH -> "Flashcards"
        Language.NEPALI -> "फ्ल्यासकार्डहरू"
        Language.CHINESE -> "闪卡复习"
        Language.JAPANESE -> "フラッシュカード"
    }

    fun practiceQuiz(lang: Language): String = when (lang) {
        Language.ENGLISH -> "Character Quiz"
        Language.NEPALI -> "अक्षर प्रश्नोत्तरी"
        Language.CHINESE -> "汉字测验"
        Language.JAPANESE -> "漢字クイズ"
    }

    fun practiceTone(lang: Language): String = when (lang) {
        Language.ENGLISH -> "Tone Challenge"
        Language.NEPALI -> "स्वर पहिचान"
        Language.CHINESE -> "声调辨识"
        Language.JAPANESE -> "声調チャレンジ"
    }

    fun practiceListening(lang: Language): String = when (lang) {
        Language.ENGLISH -> "Listening Test"
        Language.NEPALI -> "सुनाइ परीक्षा"
        Language.CHINESE -> "听力测试"
        Language.JAPANESE -> "リスニングテスト"
    }

    fun drawerTitle(lang: Language): String = when (lang) {
        Language.ENGLISH -> "Chinese Bhasa Hub"
        Language.NEPALI -> "चिनियाँ भाषा केन्द्र"
        Language.CHINESE -> "中文学习中心"
        Language.JAPANESE -> "中国語ハブ"
    }

    fun languageSelector(lang: Language): String = when (lang) {
        Language.ENGLISH -> "Language / भाषा / 语言 / 言語"
        Language.NEPALI -> "भाषा चयन गर्नुहोस्"
        Language.CHINESE -> "切换语言"
        Language.JAPANESE -> "言語切り替え"
    }

    fun searchPlaceholder(lang: Language): String = when (lang) {
        Language.ENGLISH -> "Search Hanzi, Pinyin, or Meaning..."
        Language.NEPALI -> "हान्जी, पिनयिन वा अर्थ खोज्नुहोस्..."
        Language.CHINESE -> "搜索汉字、拼音或释义..."
        Language.JAPANESE -> "漢字、ピンイン、意味を検索..."
    }

    fun listenAudio(lang: Language): String = when (lang) {
        Language.ENGLISH -> "Listen Pronunciation"
        Language.NEPALI -> "उच्चारण सुन्नुहोस्"
        Language.CHINESE -> "听发音"
        Language.JAPANESE -> "発音を聞く"
    }

    fun bookmarkedWords(lang: Language): String = when (lang) {
        Language.ENGLISH -> "Bookmarked Words"
        Language.NEPALI -> "सुरक्षित गरिएका शब्दहरू"
        Language.CHINESE -> "生词本收藏"
        Language.JAPANESE -> "ブックマークした単語"
    }

    fun contactDeveloper(lang: Language): String = when (lang) {
        Language.ENGLISH -> "Feedback & Contact"
        Language.NEPALI -> "प्रतिक्रिया र सम्पर्क"
        Language.CHINESE -> "反馈与联系作者"
        Language.JAPANESE -> "フィードバックとお問い合わせ"
    }

    fun sendEmail(lang: Language): String = when (lang) {
        Language.ENGLISH -> "Email Developer"
        Language.NEPALI -> "इमेल पठाउनुहोस्"
        Language.CHINESE -> "发送电子邮件"
        Language.JAPANESE -> "メールを送信"
    }

    fun openWhatsApp(lang: Language): String = when (lang) {
        Language.ENGLISH -> "Chat on WhatsApp"
        Language.NEPALI -> "ह्वाट्सएपमा कुरा गर्नुहोस्"
        Language.CHINESE -> "WhatsApp联系"
        Language.JAPANESE -> "WhatsAppでチャット"
    }

    fun openLinkedIn(lang: Language): String = when (lang) {
        Language.ENGLISH -> "Connect on LinkedIn"
        Language.NEPALI -> "लिंक्डइनमा जोडिनुहोस्"
        Language.CHINESE -> "领英个人主页"
        Language.JAPANESE -> "LinkedInプロフィール"
    }
}
