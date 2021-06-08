package com.bitnovo.seleccion.herbert.btnv.ui.get_winners

import android.arch.lifecycle.ViewModelProvider
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.bitnovo.seleccion.herbert.btnv.databinding.GetWinnersFragmentBinding
import com.bitnovo.seleccion.herbert.btnv.model.Hotel

class Get_Winners : Fragment() {

    companion object {
        fun newInstance() = Get_Winners()
    }

    private lateinit var getWinnersViewModel: GetWinnersViewModel
    private var _binding: GetWinnersFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        getWinnersViewModel =
            ViewModelProvider(
                this,
                ViewModelProvider.NewInstanceFactory()
            )
                .get(GetWinnersViewModel::class.java)
        _binding = GetWinnersFragmentBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        getWinnersViewModel = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        ).get(GetWinnersViewModel::class.java)
        // TODO: Use the ViewModel
        val winners: TextView = binding.tvWinners
        //To see the winners
        // Fake winners is a test Hotel.fakeWinners()
        winners.text = Hotel.getWinners().toString()
    }

}