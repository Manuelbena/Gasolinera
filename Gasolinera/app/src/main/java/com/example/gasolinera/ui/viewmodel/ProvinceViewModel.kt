package com.example.gasolinera.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.gasolinera.data.model.ProvinceModel
import com.example.gasolinera.domain.GetProvinceUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProvinceViewModel @Inject constructor(
    private var getProvince : GetProvinceUseCase
) :ViewModel() {

    val provinceModel = MutableLiveData<List<ProvinceModel>>()



    fun onCreate(){
        viewModelScope.launch {
            val result: List<ProvinceModel> = getProvince()

            if (!result.isNullOrEmpty()) {
                provinceModel.postValue(result)
            }
        }

    }


}


