package com.sc89.gasolinera_manu.ui.view.adapters

import androidx.recyclerview.widget.RecyclerView
import com.example.gasolinera.data.model.ProvinceModel
import com.example.gasolinera.databinding.ItemProvinceBinding


class ProvinceViewHolder(
    private val binding: ItemProvinceBinding
): RecyclerView.ViewHolder(binding.root) {
    fun bind(provinceModel: ProvinceModel) {
        binding.tvProvince.text = provinceModel.province
    }
}