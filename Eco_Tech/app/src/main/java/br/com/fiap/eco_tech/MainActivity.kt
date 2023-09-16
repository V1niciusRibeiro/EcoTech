package br.com.fiap.eco_tech

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import br.com.fiap.eco_tech.database.repository.PostRepository
import br.com.fiap.eco_tech.database.repository.UserRepository
import br.com.fiap.eco_tech.mvvm.model.Post
import br.com.fiap.eco_tech.mvvm.model.User
import br.com.fiap.eco_tech.navigation.AppNavigation
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
                    LoadData(this)
                    CreateApp()
                }
            }
        }
    }
}

@Composable
fun CreateApp() {

    AppNavigation.starNavigation()

}

fun LoadData(context: Context){

    val user = User(0,"teste","login","password")
    val userDB = UserRepository(context)
    if(userDB.getById(1) == null) {
        userDB.post(user)
    }

    val postDB = PostRepository(context)
    for(i in 1..10){
        var post = Post(0,"Post $i","Description $i","R")
        if (postDB.getById(i) == null) {
            postDB.post(post)
        }
    }

}


