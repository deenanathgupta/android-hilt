package com.android.android_hilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import com.android.android_hilt.model.Battery
import com.android.android_hilt.model.Mobile
import com.android.android_hilt.model.Processor
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/**
 * Processor: Application level
 * Battery: Activity level
 * Camera: Fragment level
 * */

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var battery1: Battery

    @Inject
    lateinit var battery2: Battery

    @Inject
    lateinit var processor1: Processor

    @Inject
    lateinit var processor2: Processor
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("DEENA","------Main Activity------")
        Log.d("DEENA","Processor 1 $processor1")
        Log.d("DEENA","Processor 2 $processor2")
        Log.d("DEENA","battery 1 $battery1")
        Log.d("DEENA","battery 2 $battery2")
        replaceFragment(R.id.container, MainFragment.newInstance())
    }

    private fun replaceFragment(id:Int, fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(id, fragment).commit()
    }
}