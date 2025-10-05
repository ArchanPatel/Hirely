package com.example.sandbox.respository

import com.example.sandbox.datasource.IMainDataSource
import com.example.sandbox.mapper.toUiModel
import com.example.sandbox.model.ui.DomainDataModel
import javax.inject.Inject

interface IMainRepository {
    suspend fun getDomainData(domainName: String) : DomainDataModel
}

class MainRepository @Inject constructor(
    private val mainDataSource: IMainDataSource
) : IMainRepository {
    override suspend fun getDomainData(domainName: String): DomainDataModel {
        return mainDataSource.fetchDomainData(domainName).toUiModel()
    }

}