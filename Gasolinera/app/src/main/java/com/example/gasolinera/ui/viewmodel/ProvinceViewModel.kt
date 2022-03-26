package com.example.gasolinera.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.gasolinera.data.model.ProvinceModel
import com.example.gasolinera.domain.GetProvinceUseCase
import kotlinx.coroutines.launch

class ProvinceViewModel :ViewModel() {

    val provinceModel = MutableLiveData<List<ProvinceModel>>()

    var getProvince = GetProvinceUseCase()

    fun onCreate(){
        viewModelScope.launch {
            val result: List<ProvinceModel> = getProvince()

            if (!result.isNullOrEmpty()) {
                provinceModel.postValue(result)
            }
        }

    }


}


