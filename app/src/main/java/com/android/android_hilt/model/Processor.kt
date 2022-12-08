package com.android.android_hilt.model

import android.util.Log
import javax.inject.Inject

class Processor @Inject constructor() {
    init {
        Log.d("TAG", "Processor:$this ")
    }
}