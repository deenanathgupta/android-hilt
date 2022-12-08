package com.android.android_hilt.module

import com.android.android_hilt.model.Battery
import com.android.android_hilt.model.Cobalt
import com.android.android_hilt.model.Lithium
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object BatteryModule {

    @Provides
    fun provideLithium():Lithium {
        return Lithium()
    }

    @Provides
    fun provideCobalt():Cobalt {
        return Cobalt()
    }

    @Provides
    fun provideBattery(lithium: Lithium, cobalt: Cobalt):Battery {
        return Battery(lithium, cobalt)
    }
}