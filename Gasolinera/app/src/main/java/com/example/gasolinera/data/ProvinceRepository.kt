package com.example.gasolinera.data

import com.example.gasolinera.data.model.ProvinceModel
import com.example.gasolinera.data.model.ProvinceProvider
import com.example.gasolinera.data.network.ProvinceService
import com.example.gasolinera.domain.models.Province
import javax.inject.Inject

class ProvinceRepository @Inject constructor(
    private val api : ProvinceService,
    private val provinceProvider: ProvinceProvider

){

    suspend fun getAllProvince():List<Province>
    {
        val response = api.getProvince()
        provinceProvider.province = response
        return response
    }

}