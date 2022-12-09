package com.android.android_hilt.model

import android.util.Log
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton

@Singleton
class Snapdragon constructor(@Named("type") var type:Int, @Named("clockSpeed") var clockSpeed:Int):Processor {
    override fun process() {
        Log.d("TAG", "process: $this")
    }
}