package com.example.gasolinera.common

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<VB : ViewBinding, VM: ViewModel> : Fragment() {

    private var _binding:ViewBinding? = null

    @Suppress("UNCHECKED_CAST")
    protected val binding
        get() = _binding as VB

    protected abstract val viewModel:VM

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = inflateView(inflater, container)
        return _binding?.root

    }

    abstract fun inflateView(inflater: LayoutInflater, container: ViewGroup?): VB

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUI()
        setListener()
        observe()
    }

    open fun observe() {}

    open fun setListener() {}

    open fun setUI(){}

}