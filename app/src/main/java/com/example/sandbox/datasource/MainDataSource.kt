package com.example.sandbox.datasource

import com.example.sandbox.model.api.ApiResponse
import com.example.sandbox.service.MainApi
import javax.inject.Inject

interface IMainDataSource {
    suspend fun fetchDomainData(domainName: String) : ApiResponse
}

class MainDataSource @Inject constructor(
    private val api: MainApi
) : IMainDataSource {
    override suspend fun fetchDomainData(domainName: String) : ApiResponse {
        return api.fetchDomainData(domainName)
    }
}