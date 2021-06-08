package com.bitnovo.seleccion.herbert.btnv.ui.get_winners

import android.arch.lifecycle.ViewModelProvider
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bitnovo.seleccion.herbert.btnv.R
import com.bitnovo.seleccion.herbert.btnv.model.Hotel

class Get_Winners : Fragment() {

    companion object {
        fun newInstance() = Get_Winners()
    }

    private lateinit var viewModel: GetWinnersViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.get__winners_fragment, container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        ).get(GetWinnersViewModel::class.java)
        // TODO: Use the ViewModel
        Hotel.fakeWinners()
        Hotel.getWinners()
    }

}