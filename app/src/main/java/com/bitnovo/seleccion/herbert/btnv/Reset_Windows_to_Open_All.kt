package com.bitnovo.seleccion.herbert.btnv

import android.arch.lifecycle.ViewModelProvider
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class Reset_Windows_to_Open_All : Fragment() {

    companion object {
        fun newInstance() = Reset_Windows_to_Open_All()
    }

    private lateinit var viewModel: ResetWindowsToOpenAllViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.reset__windows_to__open__all_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(
            ResetWindowsToOpenAllViewModel::class.java
        )
        // TODO: Use the ViewModel
    }

}