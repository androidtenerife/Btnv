package com.bitnovo.seleccion.herbert.btnv.ui.amount_of_windows_at_state

import android.arch.lifecycle.ViewModelProvider
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.bitnovo.seleccion.herbert.btnv.databinding.AmountOfWindowsAccordingToStateFragmentBinding
import com.bitnovo.seleccion.herbert.btnv.model.Hotel

class Amount_Of_Windows_According_to_State : Fragment() {

    private lateinit var amountOfWindowsAccordingToStateViewModel: AmountOfWindowsAccordingToStateViewModel
    private var _binding: AmountOfWindowsAccordingToStateFragmentBinding? = null
    private val binding get() = _binding!!

    companion object {
        fun newInstance() = Amount_Of_Windows_According_to_State()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        amountOfWindowsAccordingToStateViewModel = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        ).get(AmountOfWindowsAccordingToStateViewModel::class.java)

        _binding =
            AmountOfWindowsAccordingToStateFragmentBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        amountOfWindowsAccordingToStateViewModel =
            ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(
                AmountOfWindowsAccordingToStateViewModel::class.java
            )
        // TODO: Use the ViewModel
        // To see the value of windows accord to state.
        val amount_of_windows_ac_to_state: TextView = binding.tvResultsAmount
        val state_c_value: TextView = binding.tvTypeCValue
        val state_a_value: TextView = binding.tvTypeAValue
        val state_i_value: TextView = binding.tvTypeIValue
        val state_d_value: TextView = binding.tvTypeDValue
        state_c_value.text = Hotel.amountOfWindowsAccordingToState()[0].toString()
        state_a_value.text = Hotel.amountOfWindowsAccordingToState()[1].toString()
        state_i_value.text = Hotel.amountOfWindowsAccordingToState()[2].toString()
        state_d_value.text = Hotel.amountOfWindowsAccordingToState()[3].toString()

        amount_of_windows_ac_to_state.text = Hotel.amountOfWindowsAccordingToState().toString()
    }

}