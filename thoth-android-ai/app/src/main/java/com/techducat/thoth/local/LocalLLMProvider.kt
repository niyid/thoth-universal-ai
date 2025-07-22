package com.techducat.thoth.local

class LocalLLMProvider {

    fun handle(prompt: String): String {
        return "Local LLM Response to: $prompt"
    }
}

