package com.android.android_hilt.model

import android.util.Log
import javax.inject.Inject

class Mobile @Inject constructor(battery: Battery, processor: Processor) {
    init {
        Log.d("TAG", "Mobile:$this ")
    }
}