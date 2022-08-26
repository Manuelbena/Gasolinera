package com.example.gasolinera.ui.province

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.gasolinera.common.BaseFragment
import com.example.gasolinera.data.model.ProvinceModel
import com.example.gasolinera.databinding.FragmentProvinceBinding
import com.example.gasolinera.ui.models.ProvincePresentation
import com.example.gasolinera.ui.province.adapters.ProvinceAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProvinceFragment : BaseFragment<FragmentProvinceBinding, ProvinceViewModel>(){


    override val viewModel: ProvinceViewModel by viewModels()
    private lateinit var mContext: Context
    private val mAdapter = ProvinceAdapter { province -> provinceSelectedId(province) }



    override fun inflateView(
        inflater: LayoutInflater,
        container: ViewGroup?
    )= FragmentProvinceBinding.inflate(inflater, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.provinces()
    }

    override fun setUI() {
        with(binding){
            rclProvinces.layoutManager =
                LinearLayoutManager(mContext) // <-- Aqui le pasamos el layout manager
            rclProvinces.adapter = mAdapter // <-- Seteamos el adaptador
        }

    }

    override fun observe() {
        viewModel.event.observe(viewLifecycleOwner) { result ->
            when(result) {
                is ProvinceEvent.province -> {
                    if (!result.listProvince.isNullOrEmpty()) {
                        showData()
                        mAdapter.run { // <-- y aqui observamos los cambios
                            submitList(result.listProvince)
                            Log.d("//PROVINCE//", result.listProvince.toString())

                        }
                    }
                }
            }
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }


    /**
     * FUNCIONES
     */
    private fun provinceSelectedId(province: ProvincePresentation) {
        Toast.makeText(mContext, province.id, Toast.LENGTH_SHORT).show()
    }
    private fun showData(){
        binding.rclProvinces.isVisible = true
    }


}