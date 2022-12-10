package com.android.android_hilt

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.android_hilt.model.Battery
import com.android.android_hilt.model.Camera
import com.android.android_hilt.model.Mobile
import com.android.android_hilt.model.Processor
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/**
 * A simple [Fragment] subclass.
 * Use the [MainFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
@AndroidEntryPoint
class MainFragment : Fragment() {

    @Inject
    lateinit var camera1: Camera

    @Inject
    lateinit var camera2: Camera

    @Inject
    lateinit var battery1: Battery

    @Inject
    lateinit var battery2: Battery

    @Inject
    lateinit var processor1: Processor

    @Inject
    lateinit var processor2: Processor

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("Hilt","------Main Fragment------")
        Log.d("Hilt","Processor 1 $processor1")
        Log.d("Hilt","Processor 2 $processor2")
        Log.d("Hilt","battery 1 $battery1")
        Log.d("Hilt","battery 2 $battery2")
        Log.d("Hilt","camera 1 $camera2")
        Log.d("Hilt","camera 2 $camera2")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance() = MainFragment()
    }
}