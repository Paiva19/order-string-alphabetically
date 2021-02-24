package com.example.alphabetically

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    val orderedText = MutableLiveData<String>()

}