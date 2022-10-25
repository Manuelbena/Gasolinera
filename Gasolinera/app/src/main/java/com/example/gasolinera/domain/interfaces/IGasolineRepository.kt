package com.example.gasolinera.domain.interfaces

import com.example.gasolinera.domain.models.Municipality
import com.example.gasolinera.domain.models.Province

interface IGasolineRepository {
    suspend fun getAllProvince():List<Province>
    suspend fun getAllMunicipality():List<Municipality>
}