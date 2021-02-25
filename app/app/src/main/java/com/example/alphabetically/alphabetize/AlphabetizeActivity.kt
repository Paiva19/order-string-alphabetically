package com.example.alphabetically.alphabetize

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.viewModels
import androidx.compose.ui.text.input.textInputServiceFactory
import androidx.lifecycle.Observer
import com.example.alphabetically.R

class AlphabetizeActivity : AppCompatActivity() {

    private val viewModel by viewModels<AlphabetizeViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alphabetize)
        setListeners()
        setObservers()
    }

    private fun setListeners() {
        val button = findViewById<Button>(R.id.alphabetizeBtn)
        val editText = findViewById<EditText>(R.id.textToBeAlphabetizedEt)

        button.setOnClickListener {
            alphabetizeAndDisplayText(editText.text.toString())
        }
    }

    private fun alphabetizeAndDisplayText(textToBeAlphabetized: String) {
        viewModel.onClickAlphabetize(textToBeAlphabetized)
    }

    private fun setObservers() {
        viewModel.orderedText.observe(
                this,
                Observer<String> { newName ->
                    val textView = findViewById<TextView>(R.id.alphabetizedTextTv)
                    textView.text = newName
                }
        )
    }
}