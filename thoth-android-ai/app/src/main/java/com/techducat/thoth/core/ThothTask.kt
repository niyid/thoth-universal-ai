package com.techducat.thoth.core

data class ThothTask(
    val prompt: String,
    val provider: ProviderType = ProviderType.LOCAL
)

enum class ProviderType {
    LOCAL,
    OPENAI
}

