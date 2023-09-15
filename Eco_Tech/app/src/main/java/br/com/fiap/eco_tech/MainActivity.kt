package br.com.fiap.eco_tech

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import br.com.fiap.eco_tech.database.repository.UserRepository
import br.com.fiap.eco_tech.mvvm.model.User
import br.com.fiap.eco_tech.mvvm.view.component.NavBar
import br.com.fiap.eco_tech.mvvm.view_model.NavBarViewModel
import br.com.fiap.eco_tech.navigation.createAppNavigation
import br.com.fiap.eco_tech.ui.theme.Eco_TechTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Eco_TechTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainPage()
                }
            }
        }
    }
}

@Composable
fun MainPage() {

    createAppNavigation()

}


