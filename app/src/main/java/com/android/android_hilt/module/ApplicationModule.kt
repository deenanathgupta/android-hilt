package com.android.android_hilt.module

import com.android.android_hilt.model.Processor
import com.android.android_hilt.model.Snapdragon
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApplicationModule {

    @Provides
    @Singleton
    fun provideSnapdragon(@Named("type") type:Int, @Named("clockSpeed") clockSpeed:Int):Processor {
        return Snapdragon(type, clockSpeed)
    }

    @Provides
    @Named("type")
    fun provideType() = 7

    @Provides
    @Named("clockSpeed")
    fun provideClockSpeed() = 9
}