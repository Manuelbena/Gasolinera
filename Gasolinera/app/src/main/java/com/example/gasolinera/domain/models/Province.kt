package com.example.gasolinera.domain.models

import com.google.gson.annotations.SerializedName

data class Province (
     val id : String,
     val idCCAA : String,
     val province : String,
     val ccaa : String
)