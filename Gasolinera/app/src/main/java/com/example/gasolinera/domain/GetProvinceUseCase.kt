package com.example.gasolinera.domain

import com.example.gasolinera.common.BaseUseCaseNoParams
import com.example.gasolinera.data.ProvinceRepository
import com.example.gasolinera.data.model.ProvinceModel
import com.example.gasolinera.data.model.ProvinceProvider
import com.example.gasolinera.domain.models.Province
import javax.inject.Inject

class GetProvinceUseCase @Inject constructor(
    private val repository : ProvinceRepository
) : BaseUseCaseNoParams<Province>{

    suspend operator fun invoke(): List<Province> = repository.getAllProvince()
}