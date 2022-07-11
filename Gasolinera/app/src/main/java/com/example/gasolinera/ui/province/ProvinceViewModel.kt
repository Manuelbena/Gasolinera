package com.example.gasolinera.ui.province

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.gasolinera.common.BaseVM
import com.example.gasolinera.data.model.ProvinceModel
import com.example.gasolinera.domain.GetProvinceUseCase
import com.example.gasolinera.ui.models.ProvincePresentation
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProvinceViewModel @Inject constructor(
    private var getProvince : GetProvinceUseCase
) :BaseVM<ProvinceEvent>() {

    val provinceModel = MutableLiveData<List<ProvincePresentation>>()


    fun provinces(){
        executeUseCase(
            {
                GetProvinceUseCase()
            },
            { provinces ->
                val result: List<ProvincePresentation> = provinces

                if (!result.isNullOrEmpty()) {
                    _event.value = ProvinceEvent.province(result)
                }
            }
        )
    }



    fun onCreate(){
        viewModelScope.launch {
            val result: List<ProvincePresentation> = getProvince()

            if (!result.isNullOrEmpty()) {
                provinceModel.postValue(result)
            }
        }

    }


}


