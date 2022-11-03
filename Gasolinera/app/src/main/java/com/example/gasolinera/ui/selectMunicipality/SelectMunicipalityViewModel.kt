package com.example.gasolinera.ui.selectMunicipality

import com.example.gasolinera.common.BaseVM
import com.example.gasolinera.domain.usecases.GetProvinceUseCase
import com.example.gasolinera.ui.mappers.toListProvincePresentation
import com.example.gasolinera.ui.models.ProvincePresentation
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SelectMunicipalityViewModel @Inject constructor(
    private var getProvince : GetProvinceUseCase
) :BaseVM<SelectMunicipalityEvent>() {


    fun provinces(){
        executeUseCase(
            {
                getProvince.execute()
            },
            { provinces ->
                val result: List<ProvincePresentation> = provinces.toListProvincePresentation()

                if (!result.isNullOrEmpty()) {
                    _event.value = SelectMunicipalityEvent.province(result)
                }
            }
        )
    }



}


