package com.example.gasolinera.data.network

import com.example.gasolinera.data.model.ProvinceModel
import retrofit2.Response
import retrofit2.http.GET

interface ProviceApiClient {

    @GET("./Listados/Provincias/")
    suspend fun getAllProvince(): Response<List<ProvinceModel>>
}