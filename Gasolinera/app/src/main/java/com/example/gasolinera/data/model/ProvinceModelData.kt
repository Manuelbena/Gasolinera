package com.example.gasolinera.data.model

import com.google.gson.annotations.SerializedName

data class ProvinceModelData(
    @SerializedName("IDPovincia") val id : String,
    @SerializedName("IDCCAA")val idCCAA : String,
    @SerializedName("Provincia")val province : String,
    @SerializedName("CCAA")val ccaa : String)


