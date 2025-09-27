package com.example.sandbox.service

import com.example.sandbox.model.api.ApiResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface MainApi {
    @GET("domain-search")
    suspend fun fetchDomainData(
        @Query("domain") domainName: String
    ) : ApiResponse
}