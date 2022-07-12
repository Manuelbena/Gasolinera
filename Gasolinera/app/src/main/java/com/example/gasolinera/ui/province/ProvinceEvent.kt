package com.example.gasolinera.ui.province

import com.example.gasolinera.ui.models.ProvincePresentation

sealed class ProvinceEvent {

    class province(
        val listProvince : List<ProvincePresentation>
    ): ProvinceEvent()
}