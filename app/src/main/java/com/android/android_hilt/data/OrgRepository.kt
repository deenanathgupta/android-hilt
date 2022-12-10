package com.android.android_hilt.data

import javax.inject.Inject

class OrgRepository @Inject constructor(private val service: OrgService) {

    suspend fun getOrgDetails() = service.getOrgDetails()

}