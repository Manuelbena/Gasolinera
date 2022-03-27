package com.example.gasolinera.ui.view

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.gasolinera.databinding.FragmentProvinceBinding
import com.example.gasolinera.ui.viewmodel.ProvinceViewModel
import com.sc89.gasolinera_manu.ui.view.adapters.ProvinceAdapter


class ProvinceFragment : Fragment() {
    private var _binding: FragmentProvinceBinding? = null
    private val binding get() = _binding!!
    private val viewModel : ProvinceViewModel by viewModels()
    private lateinit var mContext :Context
    private val mAdapter = ProvinceAdapter() // <-- Agregar esto
    private fun getAllProvinces() = viewModel.onCreate() // <-- Seteamos esto por comodidad


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProvinceBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ini()
        setUi()
        setListeners()
        setObservers()
    }

    private fun ini() {
        binding.run {
            rclProvinces.layoutManager = LinearLayoutManager(mContext) // <-- Aqui le pasamos el layout manager
            rclProvinces.adapter = mAdapter // <-- Seteamos el adaptador
        }
        getAllProvinces() // <-- llamarlo aqui
    }

    private fun setUi() {




    }

    private fun setListeners() {
        //TODO("Not yet implemented")
    }

    private fun setObservers(){
        viewModel.provinceModel.observe(this, {
            if (!it.isNullOrEmpty()) {
                mAdapter.run { // <-- y aqui observamos los cambios
                    submitList(it)
                    Log.d("LOL", it.toString()) // <-- puro LOG
                }
            }
        })
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }
}