package com.android.android_hilt

import android.app.Application
import android.util.Log
import com.android.android_hilt.model.Processor
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class MainApplication : Application() {
    @Inject
    lateinit var processor1: Processor

    @Inject
    lateinit var processor2: Processor

    override fun onCreate() {
        super.onCreate()
        Log.d("Hilt","------Main Application------")
        Log.d("Hilt","Processor 1 $processor1")
        Log.d("Hilt","Processor 2 $processor2")
    }
}