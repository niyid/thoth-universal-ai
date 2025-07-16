
package com.thoth

interface ThothListener {
    fun onAction(action: String, data: String)
}

object Thoth {
    var listener: ThothListener? = null

    fun sendContext(context: String) {
        listener?.onAction("process", "LLM response for: $context")
    }
}
