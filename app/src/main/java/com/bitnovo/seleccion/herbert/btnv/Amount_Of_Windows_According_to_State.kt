package com.bitnovo.seleccion.herbert.btnv

import android.arch.lifecycle.ViewModelProvider
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class Amount_Of_Windows_According_to_State : Fragment() {

    companion object {
        fun newInstance() = Amount_Of_Windows_According_to_State()
    }

    private lateinit var viewModel: AmountOfWindowsAccordingToStateViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.amount__of__windows__according_to__state_fragment,
            container,
            false
        )
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(
            AmountOfWindowsAccordingToStateViewModel::class.java
        )
        // TODO: Use the ViewModel
    }

}