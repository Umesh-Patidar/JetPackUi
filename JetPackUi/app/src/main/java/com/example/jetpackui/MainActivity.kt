package com.example.jetpackui

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.jetpackui.ui.screen.NavigationRoutes
import com.example.jetpackui.ui.screen.dashboard.Category
import com.example.jetpackui.ui.screen.dashboard.categoryList
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
//    NavHost(modifier = modifier, navController = navController, startDestination = NavigationRoutes.Unauthenticated.NavigationRoute.route) {
//        unauthenticatedGraph(navController)
//    }
    val context = LocalContext.current
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        content = {
            items(categoryList.size) { index ->  
                Category(icon = categoryList[index].icon, category = categoryList[index].category, description = categoryList[index].description){
                    Toast.makeText(context, it, Toast.LENGTH_SHORT).show()
                }
            }
        },
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(5.dp),
        verticalArrangement = Arrangement.spacedBy(5.dp),
        horizontalArrangement = Arrangement.spacedBy(5.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetPackUiTheme {
        MainApp()
    }
}