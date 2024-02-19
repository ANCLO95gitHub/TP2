package com.example.mytp2.ui.abacus

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AbacusViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Abacus AbacusViewModel"
    }
    val text: LiveData<String> = _text
}