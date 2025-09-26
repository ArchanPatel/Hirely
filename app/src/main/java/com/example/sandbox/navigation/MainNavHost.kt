package com.example.sandbox.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.sandbox.screens.HomeScreen
import com.example.sandbox.viewmodel.MainViewmodel

@Composable
fun MainNavHost(
    modifier: Modifier,
    navController: NavHostController,
    viewmodel: MainViewmodel
) {
    val navBackStack = navController.currentBackStackEntryAsState()
    NavHost(
        navController = navController,
        startDestination = "home",
        modifier = modifier
    ) {
        composable("home"){
            HomeScreen()
        }
    }
}