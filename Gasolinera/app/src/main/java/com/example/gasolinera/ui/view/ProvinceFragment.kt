package com.example.gasolinera.ui.view

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.gasolinera.databinding.FragmentProvinceBinding
import com.example.gasolinera.ui.view.adapters.ProvinceAdapter
import com.example.gasolinera.ui.viewmodel.ProvinceViewModel


class ProvinceFragment : Fragment() {

    private var _binding: FragmentProvinceBinding? = null
    private val binding get() = _binding!!

    private val viewModel : ProvinceViewModel by viewModels()
    private lateinit var mContext :Context



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProvinceBinding.inflate(layoutInflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUi()
        setListeners()
        setObservers()

    }

    private fun setUi() {




    }

    private fun setListeners() {
        //TODO("Not yet implemented")
    }

    private fun setObservers(){
        viewModel.provinceModel.observe(this, Observer {
           if (!it.isNullOrEmpty()){
               ProvinceAdapter.run{
                   viewModel.onCreate()
               }
           }


        })
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }
}