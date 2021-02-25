package com.example.alphabetically.alphabetize

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AlphabetizeViewModel: ViewModel() {

    val orderedText = MutableLiveData<String>()

    fun onClickAlphabetize(textToAlphabetize: String) {
        orderedText.value = alphabetize(textToAlphabetize)
    }

    fun alphabetize(textToAlphabetize: String): String {
        val characterArray = textToAlphabetize.toCharArray()
        characterArray.sort()
        return String(characterArray)
    }

}