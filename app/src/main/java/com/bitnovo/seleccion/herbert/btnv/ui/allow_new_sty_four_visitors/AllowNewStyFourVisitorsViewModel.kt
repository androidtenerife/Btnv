package com.bitnovo.seleccion.herbert.btnv.ui.allow_new_sty_four_visitors

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class AllowNewStyFourVisitorsViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    private val _title = MutableLiveData<String>()
    val title: LiveData<String>
        get() = _title

    fun updateActionBarTitle(title: String) = _title.postValue(title)
}