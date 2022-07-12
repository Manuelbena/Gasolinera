package com.example.gasolinera.ui.mappers

import com.example.gasolinera.domain.models.Province
import com.example.gasolinera.ui.models.ProvincePresentation

fun Province.toProvincePresentation() = ProvincePresentation(
    id, idCCAA, province, ccaa
)

fun List<Province>.toListProvincePresentation() = map { it.toProvincePresentation() }
