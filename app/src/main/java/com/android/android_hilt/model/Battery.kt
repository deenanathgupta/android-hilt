package com.android.android_hilt.model

import android.util.Log

class Battery(lithium: Lithium, cobalt: Cobalt) {
    //Consider we are not the owner of this class, then how we can create instance of this class using hilt

    init {
        Log.d("TAG", "Battery: $this")
    }
}