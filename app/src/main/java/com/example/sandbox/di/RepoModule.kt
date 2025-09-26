package com.example.sandbox.di

import com.example.sandbox.respository.IMainRepository
import com.example.sandbox.respository.MainRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepoModule {
    @Binds
    @Singleton
    abstract fun bindMainRepository(
        mainRepository: MainRepository
    ): IMainRepository
}