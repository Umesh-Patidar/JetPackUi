package com.example.jetpackui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.jetpackui.ui.screen.NavigationRoutes
import com.example.jetpackui.ui.screen.unauthenticatedGraph
import com.example.jetpackui.ui.theme.JetPackUiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackUiTheme {
                MainApp()
            }
        }
    }
}

@Composable
fun MainApp() {
    Surface(color = MaterialTheme.colorScheme.background, modifier = Modifier.fillMaxSize()) {
        MainAppNavHost()
    }
}

@Composable
fun MainAppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    NavHost(modifier = modifier, navController = navController, startDestination = NavigationRoutes.Unauthenticated.NavigationRoute.route) {
        unauthenticatedGraph(navController)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetPackUiTheme {
        MainApp()
    }
}