package com.example.util

import android.content.Context
import android.speech.tts.TextToSpeech
import android.util.Log
import android.widget.Toast
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import java.util.Locale

class SpeechManager(private val context: Context) : TextToSpeech.OnInitListener {

    private var tts: TextToSpeech? = null
    private val _isReady = MutableStateFlow(false)
    val isReady: StateFlow<Boolean> = _isReady.asStateFlow()

    private val _currentlySpeaking = MutableStateFlow<String?>(null)
    val currentlySpeaking: StateFlow<String?> = _currentlySpeaking.asStateFlow()

    init {
        tts = TextToSpeech(context.applicationContext, this)
    }

    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS) {
            val result = tts?.setLanguage(Locale.SIMPLIFIED_CHINESE)
            if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                // Try generic Chinese or fallback
                val fallback = tts?.setLanguage(Locale.CHINESE)
                if (fallback == TextToSpeech.LANG_MISSING_DATA || fallback == TextToSpeech.LANG_NOT_SUPPORTED) {
                    Log.w("SpeechManager", "Chinese TTS not directly supported, using default locale")
                }
            }
            tts?.setSpeechRate(0.82f) // slightly slower for clear language learning
            _isReady.value = true
        } else {
            Log.e("SpeechManager", "TextToSpeech init failed with status: $status")
        }
    }

    fun speak(text: String, isChinese: Boolean = true) {
        if (!_isReady.value) {
            Toast.makeText(context, "Audio engine initializing...", Toast.LENGTH_SHORT).show()
            return
        }

        try {
            if (isChinese) {
                tts?.language = Locale.SIMPLIFIED_CHINESE
            } else {
                tts?.language = Locale.ENGLISH
            }
            _currentlySpeaking.value = text
            tts?.speak(text, TextToSpeech.QUEUE_FLUSH, null, text.hashCode().toString())
        } catch (e: Exception) {
            Log.e("SpeechManager", "Speak error: ${e.message}")
        }
    }

    fun stop() {
        tts?.stop()
        _currentlySpeaking.value = null
    }

    fun shutdown() {
        try {
            tts?.stop()
            tts?.shutdown()
        } catch (e: Exception) {
            Log.e("SpeechManager", "TTS shutdown error: ${e.message}")
        }
    }
}
