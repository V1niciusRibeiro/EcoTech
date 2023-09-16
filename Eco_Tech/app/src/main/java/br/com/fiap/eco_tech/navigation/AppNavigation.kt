package br.com.fiap.eco_tech.navigation

import ChatScreen
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import br.com.fiap.eco_tech.mvvm.view.component.NavBar
import br.com.fiap.eco_tech.mvvm.view.screen.BlogScreen
import br.com.fiap.eco_tech.mvvm.view.screen.LoginScreen
import br.com.fiap.eco_tech.mvvm.view_model.LoginScreenViewModel
import br.com.fiap.eco_tech.mvvm.view_model.NavBarViewModel
import com.example.eco_tech.composes.screens.IndexScreen
import com.example.eco_tech.composes.screens.SearchScreen

class AppNavigation {

    companion object {
        @Composable
        fun starNavigation() {
            val navController = rememberNavController()
            val navBackStackEntry by navController.currentBackStackEntryAsState()
            val currentRoute = navBackStackEntry?.destination?.route

            Column {
                if (currentRoute !== AppRoutes.LOGIN_ROUTE) {
                    NavBar(navController = navController, navBarViewModel = NavBarViewModel())
                }
                createNavigation(navController = navController)
            }
        }

        @Composable
        private fun createNavigation(navController: NavHostController) {
            NavHost(navController = navController, startDestination = AppRoutes.LOGIN_ROUTE) {
                composable(route = AppRoutes.LOGIN_ROUTE) { LoginScreen(LoginScreenViewModel(), navController) }
                composable(route = AppRoutes.INDEX_ROUTE) { IndexScreen(navController) }
                composable(route = AppRoutes.BLOG_ROUTE) { BlogScreen() }
                composable(route = AppRoutes.CHAT_ROUTE) { ChatScreen() }
                composable(route = AppRoutes.SEARCH_ROUTE) { SearchScreen() }
            }
        }
    }

}




