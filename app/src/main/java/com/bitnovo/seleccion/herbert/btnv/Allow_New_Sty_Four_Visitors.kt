package com.bitnovo.seleccion.herbert.btnv

import android.arch.lifecycle.ViewModelProvider
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class Allow_New_Sty_Four_Visitors : Fragment() {

    companion object {
        fun newInstance() = Allow_New_Sty_Four_Visitors()
    }

    private lateinit var viewModel: AllowNewStyFourVisitorsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.allow__new__sty__four__visitors_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(
            AllowNewStyFourVisitorsViewModel::class.java
        )
        // TODO: Use the ViewModel
    }

}