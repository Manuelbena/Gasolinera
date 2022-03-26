package com.example.gasolinera.ui.view.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gasolinera.R
import com.example.gasolinera.data.model.ProvinceModel

class ProvinceAdapter(
    private val list: List<ProvinceModel>

) : RecyclerView.Adapter<ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_province, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = list.size


}



class ViewHolder(view : View): RecyclerView.ViewHolder(view) {

    private val provi = view.findViewById<TextView>(R.id.tv_province)

    fun bind(province : ProvinceModel){
        provi.text = province.province

    }
}
