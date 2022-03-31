package com.example.gasolinera.data.network

import com.example.gasolinera.data.model.ProvinceModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class ProvinceService @Inject constructor(
    private val api:ProviceApiClient
) {


    suspend fun getProvince(): List<ProvinceModel>{
        return withContext(Dispatchers.IO){
            val response = api.getAllProvince()
            response.body() ?: emptyList()
        }
    }
}