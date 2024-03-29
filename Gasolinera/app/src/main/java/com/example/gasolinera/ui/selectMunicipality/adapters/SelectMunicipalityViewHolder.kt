package com.example.gasolinera.ui.selectMunicipality.adapters

import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.example.gasolinera.R
import com.example.gasolinera.databinding.ItemProvinceBinding
import com.example.gasolinera.ui.models.ProvincePresentation


class SelectMunicipalityViewHolder(
    private val binding: ItemProvinceBinding
): RecyclerView.ViewHolder(binding.root) {
    fun bind(provinceModel: ProvincePresentation, onClickListener:(ProvincePresentation)->Unit) {
       binding.cardCountry.animation = AnimationUtils.loadAnimation(binding.cardCountry.context, R.anim.recycler_view_animation)
        binding.tvProvince.text = provinceModel.province
        itemView.setOnClickListener { onClickListener(provinceModel) }
    }
}