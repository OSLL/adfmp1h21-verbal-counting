package com.chernokoz.android.verbalcounting.task

class Task(val first: Int, val operation: Char, val second: Int, private val correctAns: Int) {
    fun isCorrect(ans: Int) = ans == correctAns
}