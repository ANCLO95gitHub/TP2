package com.example.mytp2.ui.statusinternet

import android.os.Bundle
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StatusInternetViewModel : ViewModel() {

    //override fun onCreate(savedInstanceState: Bundle?){}
    private val _text = MutableLiveData<String>().apply {
        value = "This is home Status Internet StatusInternetViewModel"
    }
    val text: LiveData<String> = _text
}