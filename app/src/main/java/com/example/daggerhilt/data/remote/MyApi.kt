package com.example.daggerhilt.data.remote

import retrofit2.http.GET

interface MyApi {

    @GET("calls")
    suspend fun getApiCall()
}