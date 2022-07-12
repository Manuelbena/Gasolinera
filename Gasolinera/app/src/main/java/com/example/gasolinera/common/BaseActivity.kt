package com.example.gasolinera.common


import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<VB : ViewBinding>:AppCompatActivity(){

    private var _binding: ViewBinding? = null

    @Suppress("UNCHECKED_CAST")
    val binding
        get() = _binding as VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = inflateViewBinding(layoutInflater)
        setContentView(binding.root)
    }

    abstract fun inflateViewBinding(inflater: LayoutInflater): VB

}