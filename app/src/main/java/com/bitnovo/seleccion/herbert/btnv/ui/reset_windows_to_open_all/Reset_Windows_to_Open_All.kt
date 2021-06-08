package com.bitnovo.seleccion.herbert.btnv.ui.reset_windows_to_open_all

import android.arch.lifecycle.ViewModelProvider
import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.bitnovo.seleccion.herbert.btnv.databinding.ResetWindowsToOpenAllFragmentBinding
import com.bitnovo.seleccion.herbert.btnv.model.Hotel

class Reset_Windows_to_Open_All : Fragment() {

    companion object {
        fun newInstance() = Reset_Windows_to_Open_All()
    }

    private lateinit var resetWindowsToOpenAllViewModel: ResetWindowsToOpenAllViewModel
    private var _binding: ResetWindowsToOpenAllFragmentBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        resetWindowsToOpenAllViewModel = ViewModelProvider(
            this, ViewModelProvider.NewInstanceFactory()
        ).get(ResetWindowsToOpenAllViewModel::class.java)
        _binding =
            ResetWindowsToOpenAllFragmentBinding.inflate(inflater, container, false)
        val root: View = binding.root


        return root
    }

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        resetWindowsToOpenAllViewModel =
            ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(
                ResetWindowsToOpenAllViewModel::class.java
            )
        // TODO: Use the ViewModel
        val result: TextView = binding.tvResults
        result.text = Hotel.resetWindowsToOpenAll().toString()
    }

}