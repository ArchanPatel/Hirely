package com.example.sandbox

import androidx.compose.runtime.collectAsState
import androidx.lifecycle.ViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewModelScope
import com.example.sandbox.model.ui.DomainDataModel
import com.example.sandbox.model.ui.MainUiState
import com.example.sandbox.respository.IMainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.async
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.Dispatcher
import javax.inject.Inject

@HiltViewModel
class MainViewmodel @Inject constructor(
    private val mainRepository: IMainRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(MainUiState())
    val uiState: StateFlow<MainUiState> = _uiState.asStateFlow()

    init {
        getDomainData("stripe.com")
    }

    private fun getDomainData(domainName: String) {
        viewModelScope.launch {
            try {
                val data = mainRepository.getDomainData(domainName)
                _uiState.value = _uiState.value.copy(
                    websiteUrl = data.organizationInfo.websiteUrl,
                    organization = data.organizationInfo.name,
                    location = data.organizationInfo.location
                )

            } catch (e: Exception) {
                _uiState.value = _uiState.value.copy(
                    organization = "$e"
                )
            }
        }
    }
}