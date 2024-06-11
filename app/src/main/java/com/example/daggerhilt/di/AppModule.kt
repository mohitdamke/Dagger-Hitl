package com.example.daggerhilt.di

import android.app.Application
import com.example.daggerhilt.data.remote.MyApi
import com.example.daggerhilt.domain.repository.MyRepository
import com.example.daggerhilt.repository.MyRepoImp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {


    @Provides
    @Singleton
    fun provideMyApi() : MyApi{
        return Retrofit.Builder()
            .baseUrl("https://test.com")
            .build()
            .create(MyApi::class.java)
    }


    @Provides
    @Singleton
    fun provideMyRepository(api: MyApi, app: Application) : MyRepository {
        return MyRepoImp(api, app)
    }

}