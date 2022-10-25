package com.example.gasolinera.data.network

import com.example.gasolinera.data.model.MunicipalityModelData
import com.example.gasolinera.data.model.ProvinceModelData
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface GasolineApiClient {

    @GET("./Listados/Provincias/")
    suspend fun getAllProvince(): Response<List<ProvinceModelData>>

    @GET("./Listados/MunicipiosPorProvincia/")
    suspend fun getAllMunicipality(@Query ("apiKey")apiKey: String) : Response<List<MunicipalityModelData>>
}