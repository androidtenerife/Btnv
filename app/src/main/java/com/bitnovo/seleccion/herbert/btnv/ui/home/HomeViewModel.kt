package com.bitnovo.seleccion.herbert.btnv.ui.home

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
class HomeViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Welcome !"
    }
    val text: LiveData<String> = _text


}