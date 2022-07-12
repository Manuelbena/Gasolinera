package com.example.gasolinera.data.mappers

import com.example.gasolinera.data.model.ProvinceModel
import com.example.gasolinera.domain.models.Province

fun ProvinceModel.toProvince() = Province(
    id,
    idCCAA,
    province,
    ccaa
)

fun List<ProvinceModel>.toListProvince() = map {
    it.toProvince()
}