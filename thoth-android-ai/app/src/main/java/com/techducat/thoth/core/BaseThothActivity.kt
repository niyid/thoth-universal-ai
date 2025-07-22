package com.techducat.thoth.core

import android.app.Activity
import android.os.Bundle

abstract class BaseThothActivity : Activity() {

    lateinit var thothProvider: ThothContextProvider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        thothProvider = ThothCoreProvider(this)
    }

    fun requestLLMContext(task: ThothTask, callback: (String) -> Unit) {
        thothProvider.runTask(task, callback)
    }
}

