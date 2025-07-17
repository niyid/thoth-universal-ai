package com.techducat.thoth.core

import android.content.Context
import com.thoth.local.LocalLLMProvider
import com.thoth.remote.OpenAiClient

class ThothCoreProvider(private val context: Context) : ThothContextProvider {

    private val localProvider = LocalLLMProvider()
    private val remoteProvider = OpenAiClient()

    override fun runTask(task: ThothTask, callback: (String) -> Unit) {
        when (task.provider) {
            ProviderType.LOCAL -> callback(localProvider.handle(task.prompt))
            ProviderType.OPENAI -> remoteProvider.query(task.prompt, callback)
        }
    }
}

