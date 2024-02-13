package com.example.app2

import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {
    private val questionBank = listOf(
        Question(R.string.question1, true),
        Question(R.string.question2, true),
        Question(R.string.question3, false),
        Question(R.string.question4, false),
        Question(R.string.question5, true),
        Question(R.string.question6, true),
    )
    var currentIndex = 0

    val currentQuestionAnswer: Boolean
        get() = questionBank[currentIndex].answer

    val currentQuestionText: Int
        get() = questionBank[currentIndex].textResId

    fun moveToNext(){
        currentIndex = (currentIndex + 1) % questionBank.size
    }
    fun moveToPrev(){
        currentIndex = (questionBank.size + currentIndex - 1) % questionBank.size
    }

}