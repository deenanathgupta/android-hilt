package com.android.android_hilt.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.android.android_hilt.R
import com.google.gson.Gson
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class OrgsActivity : AppCompatActivity() {
    private val viewModel: OrgViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_orgs)
        viewModel.orgList.observe(this) {
            Log.d("TAG", "onCreate: ${Gson().toJson(it)}")
        }
        viewModel.getOrg()
    }
}