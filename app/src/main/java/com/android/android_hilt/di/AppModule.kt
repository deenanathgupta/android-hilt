package com.android.android_hilt.di

import com.android.android_hilt.data.OrgService
import com.android.android_hilt.utils.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun getBaseUrl(): String = BASE_URL

    @Provides
    @Singleton
    fun provideRetrofit(baseUrl: String): Retrofit {
        return Retrofit.Builder().baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create()).build()
    }

    @Provides
    @Singleton
    fun getOrgService(retrofit: Retrofit) = retrofit.create(OrgService::class.java)
}