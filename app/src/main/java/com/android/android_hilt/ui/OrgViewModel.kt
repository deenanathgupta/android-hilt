package com.android.android_hilt.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.android.android_hilt.data.OrgRepository
import com.android.android_hilt.model.Org
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class OrgViewModel @Inject constructor(val repository: OrgRepository) : ViewModel() {
    private val _orgList: MutableLiveData<List<Org>> = MutableLiveData()

    var orgList: LiveData<List<Org>> = MutableLiveData()
        get() = _orgList

    fun getOrg()= viewModelScope.launch {
        val org = repository.getOrgDetails()
        _orgList.value = org
    }
}