package com.example.sandbox.viewmodel

import androidx.lifecycle.ViewModel
import com.example.sandbox.respository.IMainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
@HiltViewModel
class MainViewmodel @Inject constructor(
    private val mainRepository: IMainRepository
) : ViewModel() {

}