package com.example.gasolinera.data.model

import com.google.gson.annotations.SerializedName

data class ProvinceModel(
    @SerializedName("IDPovincia") val id : String,
    @SerializedName("IDCCAA")val idCCAA : String,
    @SerializedName("Provincia")val province : String,
    @SerializedName("CCAA")val ccaa : String)


