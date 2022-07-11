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
import com.example.gasolinera.data.model.ProvinceModel
import com.example.gasolinera.databinding.FragmentProvinceBinding
import com.example.gasolinera.ui.province.adapters.ProvinceAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProvinceFragment : Fragment() {
    private var _binding: FragmentProvinceBinding? = null
    private val binding get() = _binding!!
    private val viewModel: ProvinceViewModel by viewModels()
    private lateinit var mContext: Context
    private val mAdapter = ProvinceAdapter { province -> provinceSelectedId(province) }


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
            rclProvinces.layoutManager =
                LinearLayoutManager(mContext) // <-- Aqui le pasamos el layout manager
            rclProvinces.adapter = mAdapter // <-- Seteamos el adaptador
        }
        getAllProvinces()
    }

    private fun setUi() {


    }

    private fun setListeners() {

    }

    private fun setObservers() {
        viewModel.provinceModel.observe(this, { ListProvince ->
            if (!ListProvince.isNullOrEmpty()) {
                showData()
                mAdapter.run { // <-- y aqui observamos los cambios
                    submitList(ListProvince)
                    Log.d("//PROVINCE//", ListProvince.toString())

                }

            }
        })
    }
    private fun showData(){

        binding.rclProvinces.isVisible = true


    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

    //Funciones
    private fun provinceSelectedId(province: ProvinceModel) {
        Toast.makeText(mContext, province.id, Toast.LENGTH_SHORT).show()
    }
}