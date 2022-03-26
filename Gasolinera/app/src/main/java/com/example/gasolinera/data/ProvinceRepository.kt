package com.example.gasolinera.data

import com.example.gasolinera.data.model.ProvinceModel
import com.example.gasolinera.data.model.ProvinceProvider
import com.example.gasolinera.data.network.ProvinceService

class ProvinceRepository {

    private val api = ProvinceService()

    suspend fun getAllProvince():List<ProvinceModel>
    {
        val response = api.getProvince()
        ProvinceProvider.province = response
        return response
    }

}