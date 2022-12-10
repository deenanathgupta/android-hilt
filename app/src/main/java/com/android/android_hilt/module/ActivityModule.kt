package com.android.android_hilt.module

import com.android.android_hilt.model.Battery
import com.android.android_hilt.model.Cobalt
import com.android.android_hilt.model.Lithium
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped

@Module
@InstallIn(ActivityComponent::class)
object ActivityModule {

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