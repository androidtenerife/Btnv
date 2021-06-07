package com.bitnovo.seleccion.herbert.btnv.ui.state_of_windows

import android.arch.lifecycle.ViewModelProvider
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bitnovo.seleccion.herbert.btnv.R

class State_Of_Windows : Fragment() {

    companion object {
        fun newInstance() = State_Of_Windows()
    }

    private lateinit var viewModel: StateOfWindowsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.state__of__windows_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(
            StateOfWindowsViewModel::class.java
        )
        // TODO: Use the ViewModel
    }

}