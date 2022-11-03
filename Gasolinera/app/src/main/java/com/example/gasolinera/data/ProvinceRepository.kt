package com.example.gasolinera.data

import com.example.gasolinera.data.mappers.toListMunicipality
import com.example.gasolinera.data.mappers.toListProvince
import com.example.gasolinera.data.model.ProvinceProvider
import com.example.gasolinera.data.network.GasolineService
import com.example.gasolinera.domain.interfaces.IGasolineRepository
import com.example.gasolinera.domain.models.Municipality
import com.example.gasolinera.domain.models.Province
import javax.inject.Inject

class ProvinceRepository @Inject constructor(
    private val api: GasolineService,
    private val provinceProvider: ProvinceProvider

) : IGasolineRepository {


    override suspend fun getAllProvince(): List<Province> {
        val response = api.getProvince()
        provinceProvider.province = response
        return response.toListProvince()
    }

    override suspend fun getAllMunicipality(): List<Municipality> {
        val response = api.getMunicipalitys("14")
        return response.toListMunicipality()
    }


}