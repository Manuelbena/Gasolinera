package com.example.gasolinera.domain.usecases

import com.example.gasolinera.common.BaseUseCaseNoParams
import com.example.gasolinera.domain.interfaces.IGasolineRepository
import com.example.gasolinera.domain.models.Province
import javax.inject.Inject

class GetProvinceUseCase @Inject constructor(
    private val repository : IGasolineRepository
) : BaseUseCaseNoParams<List<Province>>(){

    override suspend fun execute(): List<Province> = repository.getAllProvince()
}