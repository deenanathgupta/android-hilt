package com.android.android_hilt.data

import com.android.android_hilt.model.Org
import retrofit2.http.GET

interface OrgService {

    @GET("users/hadley/orgs")
    suspend fun getOrgDetails():List<Org>
}