package com.example.jetpackui.ui.screen

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.jetpackui.ui.screen.dashboard.DashboardScreen

/**
 * Login, registration, forgot password screens nav graph builder
 */
fun NavGraphBuilder.unauthenticatedGraph(navController: NavController) {
    navigation(
        route = NavigationRoutes.Unauthenticated.NavigationRoute.route,
        startDestination = NavigationRoutes.Unauthenticated.Login.route
    ) {

        composable(route = NavigationRoutes.Unauthenticated.Login.route) {

        }
    }


    /**
     * Authenticated screens nav graph builder
     */
    fun NavGraphBuilder.authenticatedGraph(navController: NavController) {
        navigation(
            route = NavigationRoutes.Authenticated.NavigationRoute.route,
            startDestination = NavigationRoutes.Authenticated.Dashboard.route
        ) {
            // Dashboard
            composable(route = NavigationRoutes.Authenticated.Dashboard.route) {
                DashboardScreen()
            }
        }
    }
}