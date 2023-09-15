package br.com.fiap.eco_tech.navigation

import ChatScreen
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import br.com.fiap.eco_tech.mvvm.view.component.NavBar
import br.com.fiap.eco_tech.mvvm.view_model.NavBarViewModel
import br.com.fiap.eco_tech.mvvm.view.screen.BlogScreen
import com.example.eco_tech.composes.screens.IndexScreen
import com.example.eco_tech.composes.screens.LoginScreen
import com.example.eco_tech.composes.screens.SearchScreen

@Composable
fun createAppNavigation() {

    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    val routes = AppRoutes()

    Column {

        if (currentRoute !== routes.getLoginRoute()){
            NavBar(navController = navController, navBarViewModel = NavBarViewModel())
        }

        Column {
            NavHost(navController = navController, startDestination = routes.getLoginRoute()) {
                composable(route = routes.getLoginRoute()) { LoginScreen(navController) }
                composable(route = routes.getIndexRoute()) { IndexScreen() }
                composable(route = routes.getBlogRoute()) { BlogScreen() }
                composable(route = routes.getChatRoute()) { ChatScreen() }
                composable(route = routes.getSearchRoute()) { SearchScreen() }
            }
        }
    }

}


