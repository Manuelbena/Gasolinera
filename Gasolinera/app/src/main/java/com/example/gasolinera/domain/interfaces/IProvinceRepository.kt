package com.example.gasolinera.domain.interfaces

import com.example.gasolinera.domain.models.Province

interface IProvinceRepository {
    suspend fun getAllProvince():List<Province>
}