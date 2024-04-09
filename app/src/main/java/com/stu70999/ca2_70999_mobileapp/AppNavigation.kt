package com.stu70999.ca2_70999_mobileapp

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.Home
    ) {
        composable(route = Routes.Home)
        {
            Home(navController = navController)
        }
        composable(route = Routes.MovieScreen) { backStackEntry ->
            val movieName = backStackEntry.arguments?.getString("movieName")
            MovieScreen(movieName = movieName, navController = navController)
        }
    }
}