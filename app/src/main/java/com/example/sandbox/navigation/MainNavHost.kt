package com.example.sandbox.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.sandbox.screens.HomeScreen
import com.example.sandbox.MainViewmodel
import com.example.sandbox.model.ui.MainUiState

@Composable
fun MainNavHost(
    modifier: Modifier,
    navController: NavHostController,
    viewmodel: MainViewmodel,
    uiState: MainUiState
) {
    val navBackStack = navController.currentBackStackEntryAsState()
    NavHost(
        navController = navController,
        startDestination = "home",
        modifier = modifier
    ) {
        composable("home"){
            HomeScreen(uiState)
        }
    }
}