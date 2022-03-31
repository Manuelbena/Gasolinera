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
import com.example.gasolinera.ui.view.adapters.ProvinceAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProvinceFragment : Fragment() {
    private var _binding: FragmentProvinceBinding? = null
    private val binding get() = _binding!!
    private val viewModel : ProvinceViewModel by viewModels()
    private lateinit var mContext :Context
    private val mAdapter = ProvinceAdapter()
    private fun getAllProvinces() = viewModel.onCreate()


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
        getAllProvinces()
    }

    private fun setUi() {




    }

    private fun setListeners() {
        //TODO("Not yet implemented")
    }

    private fun setObservers(){
        viewModel.provinceModel.observe(this, { ListProvince ->
            if (!ListProvince.isNullOrEmpty()) {
                mAdapter.run { // <-- y aqui observamos los cambios
                    submitList(ListProvince)
                    Log.d("//PROVINCE//", ListProvince.toString())
                }
            }
        })
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }
}