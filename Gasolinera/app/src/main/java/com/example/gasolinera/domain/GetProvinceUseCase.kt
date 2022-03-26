package com.example.gasolinera.domain

import com.example.gasolinera.data.ProvinceRepository
import com.example.gasolinera.data.model.ProvinceModel
import com.example.gasolinera.data.model.ProvinceProvider

class GetProvinceUseCase {

    private val repository = ProvinceRepository()

    suspend operator fun invoke(): List<ProvinceModel> = repository.getAllProvince()
}