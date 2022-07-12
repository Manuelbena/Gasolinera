package com.example.gasolinera.common

import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter

abstract class BaseAdapter<T, VH:BaseVH<T>>(diffCallback: DiffUtil.ItemCallback<T>):
    ListAdapter<T, VH>(diffCallback)
{
    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.bind(getItem(position))
    }

}