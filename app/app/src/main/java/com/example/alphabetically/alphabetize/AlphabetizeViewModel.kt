package com.example.alphabetically.alphabetize

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AlphabetizeViewModel: ViewModel() {

    val orderedText = MutableLiveData<String>()

    fun onClickAlphabetize(textToAlphabetize: String): String {
//        TODO...
        return textToAlphabetize
    }

}