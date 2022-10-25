package com.example.gasolinera.ui.selectMunicipality.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.DiffUtil
import com.example.gasolinera.databinding.ItemProvinceBinding
import com.example.gasolinera.ui.models.ProvincePresentation


class SelectMunicipalityAdapter(
   private val onClickListener : (ProvincePresentation) ->Unit
): ListAdapter<ProvincePresentation, SelectMunicipalityViewHolder>(DIFF_CALLBACK){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = SelectMunicipalityViewHolder (
        ItemProvinceBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: SelectMunicipalityViewHolder, position: Int) = holder.bind(getItem(position), onClickListener)

    companion object { // Aqui cambio la lista en el caso de que me lo cambien
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<ProvincePresentation>() {
            override fun areItemsTheSame(oldItem: ProvincePresentation, newItem: ProvincePresentation): Boolean = oldItem.id == newItem.id
            override fun areContentsTheSame(oldItem: ProvincePresentation, newItem: ProvincePresentation): Boolean = oldItem == newItem
        }
    }


}
