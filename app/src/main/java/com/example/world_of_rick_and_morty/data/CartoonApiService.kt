package com.example.world_of_rick_and_morty.data

import retrofit2.http.GET

interface CartoonApiService {
    @GET("character")
    fun fetchCharacters(

    )
}