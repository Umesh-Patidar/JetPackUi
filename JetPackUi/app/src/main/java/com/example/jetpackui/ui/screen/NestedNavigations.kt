package com.example.jetpackui.ui.screen

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.jetpackui.ui.screen.dashboard.DashboardScreen
import com.example.jetpackui.ui.screen.registration.RegistrationScreen
import com.example.jetpackui.ui.screen.unauthenticated.login.LoginScreen

/**
 * Login, registration, forgot password screens nav graph builder
 */
fun NavGraphBuilder.unauthenticatedGraph(navController: NavController) {
    navigation(
        route = NavigationRoutes.Unauthenticated.NavigationRoute.route,
        startDestination = NavigationRoutes.Unauthenticated.Login.route
    ) {

        composable(route = NavigationRoutes.Unauthenticated.Login.route) {
            LoginScreen(
                onNavigateToRegistration = {
                    navController.navigate(route = NavigationRoutes.Unauthenticated.Registration.route)
                },
                onNavigateToForgotPassword = {

                },
                onNavigateToAuthenticatedRoute = {
                    navController.navigate(route =NavigationRoutes.Authenticated.NavigationRoute.route) {
                        popUpTo(route = NavigationRoutes.Unauthenticated.NavigationRoute.route) {
                            inclusive = true
                        }
                    }
                })
        }

        // Registration
        composable(route = NavigationRoutes.Unauthenticated.Registration.route) {
            RegistrationScreen(
                onNavigateBack = {
                    navController.navigateUp()
                },
                onNavigateToAuthenticatedRoute = {
                    navController.navigate(route = NavigationRoutes.Authenticated.NavigationRoute.route) {
                        popUpTo(route = NavigationRoutes.Unauthenticated.NavigationRoute.route) {
                            inclusive = true
                        }
                    }
                }
            )
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