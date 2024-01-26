package com.example.world_of_rick_and_morty.data.model

import com.google.gson.annotations.SerializedName

data class CharactersModel(
    @SerializedName("info")
    val info: Info,
    @SerializedName("results")
    val results: List<Result>
)