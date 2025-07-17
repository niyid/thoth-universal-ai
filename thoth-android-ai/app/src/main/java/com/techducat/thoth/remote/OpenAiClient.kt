package com.techducat.thoth.remote

import okhttp3.*
import org.json.JSONObject
import java.io.IOException

class OpenAiClient {

    private val apiKey = "YOUR_OPENAI_API_KEY"
    private val client = OkHttpClient()

    fun query(prompt: String, callback: (String) -> Unit) {
        val json = JSONObject()
        json.put("model", "gpt-3.5-turbo")
        json.put("messages", listOf(mapOf("role" to "user", "content" to prompt)))

        val body = RequestBody.create(MediaType.parse("application/json"), json.toString())

        val request = Request.Builder()
            .url("https://api.openai.com/v1/chat/completions")
            .addHeader("Authorization", "Bearer $apiKey")
            .post(body)
            .build()

        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                callback("Error: ${e.message}")
            }

            override fun onResponse(call: Call, response: Response) {
                val responseBody = response.body()?.string() ?: ""
                callback(responseBody)
            }
        })
    }
}

