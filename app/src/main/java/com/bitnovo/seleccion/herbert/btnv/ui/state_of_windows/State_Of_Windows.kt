package com.bitnovo.seleccion.herbert.btnv.ui.state_of_windows

import android.arch.lifecycle.ViewModelProvider
import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.bitnovo.seleccion.herbert.btnv.databinding.StateOfWindowsFragmentBinding
import com.bitnovo.seleccion.herbert.btnv.model.Hotel


class State_Of_Windows : Fragment() {

    companion object {
        fun newInstance() = State_Of_Windows()
    }

    private lateinit var stateOfWindowsviewModel: StateOfWindowsViewModel
    private var _binding: StateOfWindowsFragmentBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        stateOfWindowsviewModel =
            ViewModelProvider(
                this,
                ViewModelProvider.NewInstanceFactory()
            )
                .get(StateOfWindowsViewModel::class.java)
        _binding = StateOfWindowsFragmentBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        stateOfWindowsviewModel =
            ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(
                StateOfWindowsViewModel::class.java
            )
        // TODO: Get State of windows.
        val textView: TextView = binding.tvResult
        // TO See the state of windows call the Function
        val result = Hotel.getStateOfWindows()
        textView.text = result.toString()

    }

}