package com.example.daggerhilt.repository

import android.app.Application
import android.util.Log
import com.example.daggerhilt.data.remote.MyApi
import com.example.daggerhilt.domain.repository.MyRepository


 class MyRepoImp(
     private val api: MyApi,
     private val appContext : Application
 ): MyRepository {

     init {
         Log.d("TAG", "Created the rawas apppp")
         println("TAG from the repository. Teri Makiii")
     }


     override suspend fun doNetworkCall() {

     }
 }