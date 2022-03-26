package com.example.gasolinera.data.network

import com.example.gasolinera.core.RetrofitHelper
import com.example.gasolinera.data.model.ProvinceModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ProvinceService {

    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getProvince(): List<ProvinceModel>{
        return withContext(Dispatchers.IO){
            val response = retrofit.create(ProviceApiClient::class.java).getAllProvince()
            response.body() ?: emptyList()
        }
    }
}