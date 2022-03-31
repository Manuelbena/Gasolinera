package com.example.gasolinera.domain

import com.example.gasolinera.data.ProvinceRepository
import com.example.gasolinera.data.model.ProvinceModel
import com.example.gasolinera.data.model.ProvinceProvider
import javax.inject.Inject

class GetProvinceUseCase @Inject constructor(
    private val repository : ProvinceRepository
){

    suspend operator fun invoke(): List<ProvinceModel> = repository.getAllProvince()
}