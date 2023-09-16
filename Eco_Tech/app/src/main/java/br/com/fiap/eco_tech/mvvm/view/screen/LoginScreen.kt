package br.com.fiap.eco_tech.mvvm.view.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.eco_tech.R
import br.com.fiap.eco_tech.database.repository.UserRepository
import br.com.fiap.eco_tech.mvvm.view.component.DefaultButton
import br.com.fiap.eco_tech.mvvm.view.component.DefaultInput
import br.com.fiap.eco_tech.mvvm.view_model.LoginScreenViewModel
import br.com.fiap.eco_tech.navigation.AppRoutes


@Composable
fun LoginScreen(loginScreenViewModel: LoginScreenViewModel, navController: NavController) {

    val context = LocalContext.current
    val userDB = UserRepository(context)
    val login by loginScreenViewModel.login.observeAsState(initial = "")
    val password by loginScreenViewModel.password.observeAsState(initial = "")

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(context.getColor(R.color.theme)))
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(45.dp)
        ) {
            Image(
                modifier = Modifier.size(90.dp),
                contentDescription = "Logo_EcoTech",
                painter = painterResource(R.drawable.logo_ecotech)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                fontSize = 28.sp,
                color = colorResource(id = R.color.white),
                text = context.getString(R.string.app_name),
                fontFamily = FontFamily(Font(R.font.garamond))
            )
        }

        Card(
            modifier = Modifier.fillMaxSize(),
            shape = RoundedCornerShape(topStart = 34.dp, topEnd = 34.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White)
        ) {
            Column(
                verticalArrangement = Arrangement.SpaceAround,
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .fillMaxHeight()
            ) {

                Column {
                    Text(
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth(),
                        text = context.getString(R.string.login_welcome), fontSize = 24.sp,
                        color = colorResource(id = R.color.theme),
                        fontWeight = FontWeight.Bold,
                    )

                    Spacer(modifier = Modifier.height(22.dp))

                    DefaultInput(
                        modifier = Modifier.fillMaxWidth(),
                        label = context.getString(R.string.login_label),
                        placeholder = context.getString(R.string.login_placeholder),
                        icon = Icons.Default.Email,
                        iconDescription = "Login",
                        value = login,
                        keyboardType = KeyboardType.Email,
                        maxLines = 1,
                        onValueChange = {
                            loginScreenViewModel.onLoginChanged(it)
                        }
                    )

                    Spacer(modifier = Modifier.height(18.dp))

                    DefaultInput(
                        modifier = Modifier.fillMaxWidth(),
                        label = context.getString(R.string.password_label),
                        placeholder = context.getString(R.string.password_placeholder),
                        icon = Icons.Default.Lock,
                        iconDescription = "Password",
                        value = password,
                        keyboardType = KeyboardType.Password,
                        maxLines = 1,
                        onValueChange = {
                            loginScreenViewModel.onPasswordChanged(it)
                        }
                    )
                }

                Column {
                    DefaultButton(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(65.dp),
                        text = context.getString(R.string.btn_enter),
                        textSize = 20,
                        onClick = {
                            navController.navigate(AppRoutes.INDEX_ROUTE)
                        }
                    )

                    Text(
                        text = context.getString(R.string.forgot_password),
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color(context.getColor(R.color.theme)),
                        textDecoration = TextDecoration.Underline,
                        modifier = Modifier
                            .padding(top = 12.dp)
                            .align(Alignment.End)
                            .clickable {}
                    )
                }

            }
        }

    }
}


