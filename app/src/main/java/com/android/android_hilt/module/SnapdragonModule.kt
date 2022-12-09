package com.android.android_hilt.module

import com.android.android_hilt.model.Processor
import com.android.android_hilt.model.Snapdragon
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named

@Module
@InstallIn(SingletonComponent::class)
object SnapdragonModule {

//    @Provides
//    fun provideSnapdragon(snapdragon: Snapdragon):Processor {
//        return snapdragon
//    }

    @Provides
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