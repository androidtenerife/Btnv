package com.bitnovo.seleccion.herbert.btnv.ui.allow_new_sty_four_visitors

import android.arch.lifecycle.ViewModelProvider
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bitnovo.seleccion.herbert.btnv.databinding.AllowNewStyFourVisitorsFragmentBinding

class Allow_New_Sty_Four_Visitors : Fragment() {
    private lateinit var allowNewStyFourVisitorsViewModel: AllowNewStyFourVisitorsViewModel
    private var _binding: AllowNewStyFourVisitorsFragmentBinding? = null
    private val binding get() = _binding!!

    companion object {
        fun newInstance() = Allow_New_Sty_Four_Visitors()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        allowNewStyFourVisitorsViewModel = ViewModelProvider(
            this, ViewModelProvider.NewInstanceFactory()
        ).get(AllowNewStyFourVisitorsViewModel::class.java)
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

    }

}