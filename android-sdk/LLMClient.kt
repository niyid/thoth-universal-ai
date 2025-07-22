package com.thoth.llm

import okhttp3.*
import org.json.JSONObject
import java.io.IOException

class LLMClient(private val apiKey: String) {
    private val client = OkHttpClient()

    fun queryOpenAI(prompt: String, callback: (String) -> Unit) {
        val url = "https://api.openai.com/v1/chat/completions"
        val body = JSONObject()
        body.put("model", "gpt-3.5-turbo")
        body.put("messages", listOf(mapOf("role" to "user", "content" to prompt)))

        val requestBody = RequestBody.create(MediaType.parse("application/json"), body.toString())

        val request = Request.Builder()
            .url(url)
            .addHeader("Authorization", "Bearer $apiKey")
            .post(requestBody)
            .build()

        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                callback("Error: ${e.message}")
            }

            override fun onResponse(call: Call, response: Response) {
                val json = JSONObject(response.body()?.string() ?: "")
                val content = json.getJSONArray("choices")
                    .getJSONObject(0).getJSONObject("message").getString("content")
                callback(content)
            }
        })
    }

    fun queryOllama(prompt: String, callback: (String) -> Unit) {
        val url = "http://localhost:11434/api/generate"
        val body = JSONObject()
        body.put("model", "llama2")
        body.put("prompt", prompt)

        val requestBody = RequestBody.create(MediaType.parse("application/json"), body.toString())

        val request = Request.Builder()
            .url(url)
            .post(requestBody)
            .build()

        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                callback("Error: ${e.message}")
            }

            override fun onResponse(call: Call, response: Response) {
                val json = JSONObject(response.body()?.string() ?: "")
                callback(json.getString("response"))
            }
        })
    }
}

