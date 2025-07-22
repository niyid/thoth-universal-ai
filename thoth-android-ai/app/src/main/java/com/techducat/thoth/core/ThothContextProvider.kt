package com.techducat.thoth.core

interface ThothContextProvider {
    fun runTask(task: ThothTask, callback: (String) -> Unit)
}

