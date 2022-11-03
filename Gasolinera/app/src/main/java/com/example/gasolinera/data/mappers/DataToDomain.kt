package com.example.gasolinera.data.mappers

import com.example.gasolinera.data.model.MunicipalityModelData
import com.example.gasolinera.data.model.ProvinceModelData
import com.example.gasolinera.domain.models.Municipality
import com.example.gasolinera.domain.models.Province

fun ProvinceModelData.toProvince() = Province(
    id,
    idCCAA,
    province,
    ccaa
)

fun List<ProvinceModelData>.toListProvince() = map {
    it.toProvince()
}

fun MunicipalityModelData.toMunicipality() = Municipality(
    CCAA,
    IDCCAA,
    IDMunicipio,
    IDProvincia,
    Municipio,
    Provincia
)

fun List<MunicipalityModelData>.toListMunicipality() = map {
    it.toMunicipality()
}