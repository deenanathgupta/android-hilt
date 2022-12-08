package com.android.android_hilt.model

import android.util.Log
import javax.inject.Inject

class Snapdragon @Inject constructor():Processor {
    override fun process() {
        Log.d("TAG", "process: $this")
    }
}