package com.techducat.thoth.chrono

import android.content.Context
import android.content.Intent
import android.net.Uri

class SmsAction(private val context: Context) {

    fun sendSms(number: String, message: String) {
        val intent = Intent(Intent.ACTION_VIEW).apply {
            data = Uri.parse("sms:$number")
            putExtra("sms_body", message)
        }
        context.startActivity(intent)
    }
}

