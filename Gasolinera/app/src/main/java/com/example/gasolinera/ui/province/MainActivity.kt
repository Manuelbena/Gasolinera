package com.example.gasolinera.ui.province

import android.os.BaseBundle
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.gasolinera.common.BaseActivity
import com.example.gasolinera.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun inflateViewBinding(inflater: LayoutInflater) = ActivityMainBinding.inflate(inflater)

}