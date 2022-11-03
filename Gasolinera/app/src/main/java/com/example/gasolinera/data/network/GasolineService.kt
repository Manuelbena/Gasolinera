package com.example.gasolinera.data.network

import com.example.gasolinera.data.model.MunicipalityModelData
import com.example.gasolinera.data.model.ProvinceModelData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class GasolineService @Inject constructor(
    private val api:GasolineApiClient
) {


    suspend fun getProvince(): List<ProvinceModelData>{
        return withContext(Dispatchers.IO){
            val response = api.getAllProvince()
            response.body() ?: emptyList()
        }
    }
    suspend fun getMunicipalitys(idMunicipality : String): List<MunicipalityModelData>{
        return withContext(Dispatchers.IO){
            val response = api.getAllMunicipality(idMunicipality)
            response.body() ?: emptyList()
        }
    }


}