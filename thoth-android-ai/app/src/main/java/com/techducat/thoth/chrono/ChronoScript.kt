package com.techducat.thoth.chrono

data class ChronoScript(
    val id: String,
    val description: String,
    val isEnabled: Boolean = true,
    val action: () -> Unit
)

