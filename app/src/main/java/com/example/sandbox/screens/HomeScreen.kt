package com.example.sandbox.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.sandbox.model.ui.MainUiState

@Composable
fun HomeScreen(uiState: MainUiState) {
    Column {
        Text(uiState.websiteUrl)
        Text(uiState.organization)
        Text(uiState.location)
    }
}