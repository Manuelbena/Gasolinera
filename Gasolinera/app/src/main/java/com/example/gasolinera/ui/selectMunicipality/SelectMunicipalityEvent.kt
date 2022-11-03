package com.example.gasolinera.ui.selectMunicipality

import com.example.gasolinera.ui.models.ProvincePresentation

sealed class SelectMunicipalityEvent {

    class province(
        val listProvince : List<ProvincePresentation>
    ): SelectMunicipalityEvent()
}