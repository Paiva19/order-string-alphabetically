package com.example.alphabetically.alphabetize

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.viewModels
import com.example.alphabetically.R

class AlphabetizeActivity : AppCompatActivity() {

    private val viewModel by viewModels<AlphabetizeViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
        setObservers()
    }

    private fun setListeners() {
        val button = findViewById<Button>(R.id.alphabetizeBtn)
        val editText = findViewById<EditText>(R.id.textToBeAlphabetizedEt)
        val textView = findViewById<TextView>(R.id.alphabetizedTextTv)

        button.setOnClickListener {
            alphabetizeAndDisplayText(textView, editText.text.toString())
        }
    }

    private fun alphabetizeAndDisplayText(viewToDisplay: TextView, textToBeAlphabetized: String) {
        viewToDisplay.text = viewModel.onClickAlphabetize(textToBeAlphabetized)
    }

    private fun setObservers() {
//        TODO...
    }


}