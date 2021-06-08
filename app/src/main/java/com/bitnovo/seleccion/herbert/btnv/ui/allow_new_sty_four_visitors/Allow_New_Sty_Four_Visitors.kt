package com.bitnovo.seleccion.herbert.btnv.ui.allow_new_sty_four_visitors

import android.arch.lifecycle.ViewModelProvider
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.bitnovo.seleccion.herbert.btnv.databinding.AllowNewStyFourVisitorsFragmentBinding

class Allow_New_Sty_Four_Visitors : Fragment() {

    companion object {
        fun newInstance() = Allow_New_Sty_Four_Visitors()
    }

    private lateinit var allowNewStyFourVisitorsViewModel: AllowNewStyFourVisitorsViewModel: AllowNewStyFourVisitorsViewModel
    private var _binding: AllowNewStyFourVisitorsFragmentBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        allowNewStyFourVisitorsViewModel = ViewModelProvider(
            this, ViewModelProvider.NewInstanceFactory()
        ).get(allowNewStyFourVisitorsViewModel::class.java)
        _binding = AllowNewStyFourVisitorsFragmentBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        allowNewStyFourVisitorsViewModel =
            ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(
                AllowNewStyFourVisitorsViewModel::class.java
            )
        // TODO: Use the ViewModel
        // To see the value of windows accord to state.
        val amount_of_windows_ac_to_state: TextView = binding.tvAmountOfWindows
        TODO(Cargar resultado)
        amount_of_windows_ac_to_state.text = "Cargar Resultado"
    }

}