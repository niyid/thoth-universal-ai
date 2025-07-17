package com.techducat.thoth.chrono

import java.util.*
import kotlin.concurrent.timerTask

class ChronoManager {

    private val scripts = mutableListOf<ChronoScript>()
    private val timers = mutableMapOf<String, Timer>()

    fun addScript(script: ChronoScript, delayMillis: Long) {
        scripts.add(script)
        if (script.isEnabled) {
            val timer = Timer()
            timer.schedule(timerTask { script.action() }, delayMillis)
            timers[script.id] = timer
        }
    }

    fun disableScript(id: String) {
        scripts.find { it.id == id }?.let { script ->
            timers[id]?.cancel()
            timers.remove(id)
        }
    }

    fun enableScript(id: String, delayMillis: Long) {
        scripts.find { it.id == id }?.let { script ->
            if (!timers.containsKey(id)) {
                val timer = Timer()
                timer.schedule(timerTask { script.action() }, delayMillis)
                timers[id] = timer
            }
        }
    }
}

