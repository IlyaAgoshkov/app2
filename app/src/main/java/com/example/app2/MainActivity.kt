package com.example.app2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    private lateinit var btnTrue : Button
    private lateinit var btnFalse : Button
    private lateinit var nextButton : ImageButton
    private lateinit var prevButton: ImageButton
    private lateinit var questionTextView : TextView



    private val quizViewModel: MainActivityViewModel by lazy {
        val provide = ViewModelProvider(this)
        provide.get(MainActivityViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnTrue = findViewById(R.id.btnTrue)
        btnFalse = findViewById(R.id.btnFalse)
        nextButton = findViewById(R.id.ibNext)
        prevButton = findViewById(R.id.ibPrev)
        questionTextView = findViewById(R.id.tvQuestion)
    }
    private fun updateQuestion(){
        val questionTextResId = quizViewModel.currentQuestionText
        questionTextView.setText(questionTextResId)
    }
}