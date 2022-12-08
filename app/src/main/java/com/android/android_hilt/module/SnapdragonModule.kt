package com.android.android_hilt.module

import com.android.android_hilt.model.Processor
import com.android.android_hilt.model.Snapdragon
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class SnapdragonModule {

    @Binds
    abstract fun provideProcessor(snapdragon: Snapdragon): Processor

    //Approach 1 to create instance of Snapdragon class with object SnapdragonModule
//    @Provides
//    fun provideSnapdragon():Snapdragon {
//        return Snapdragon()
//    }
}