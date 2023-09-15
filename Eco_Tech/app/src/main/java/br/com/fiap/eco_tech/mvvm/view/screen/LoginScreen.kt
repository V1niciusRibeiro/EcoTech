package com.example.eco_tech.composes.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.com.fiap.eco_tech.R


@Composable
fun LoginScreen(navcControler : NavController) {

    var usuario by remember {
        mutableStateOf("")
    }

    var senha by remember {
        mutableStateOf("")
    }
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            // ---- header ---------
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp)
                    .background(Color(0xFF00A57B))
            ) {
                Spacer(modifier = Modifier.height(52.dp))
                Image(
                    painter = painterResource(id = R.drawable.logo_ecotech),
                    contentDescription = "Menino Lindo",
                    modifier = Modifier
                        .size(90.dp)
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "EcoEat",
                    color = colorResource(id = R.color.white),
                    fontSize = 28.sp,
                    fontFamily = FontFamily(Font(R.font.garamond))
                )
            }
            // --- formulário
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                //    .padding(horizontal = 32.dp) Padding para deixar o card flutuante
            ) {
                //   Spacer(modifier = Modifier.height(8.dp))
                Card(
                    modifier = Modifier
                        .fillMaxSize()
                        .offset(y = -25.dp),

                    shape = RoundedCornerShape(34.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White),
                  //  elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                    //  border = BorderStroke(width = 2.dp, Color.White),

                ) {
                    Column(
                        modifier = Modifier.padding(
                            vertical = 16.dp,
                            horizontal = 32.dp
                        )
                    ) {
                        Text(
                            text = "Faça seu Login",
                            modifier = Modifier.fillMaxWidth(),
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            color = colorResource(id = R.color.theme),
                            textAlign = TextAlign.Center
                        )
                        Spacer(modifier = Modifier.height(32.dp))
                        Text(
                            text = "Login",
                            modifier = Modifier.padding(bottom = 8.dp),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            color = colorResource(id = R.color.theme)
                        )
                        OutlinedTextField(
                            trailingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "Email")},
                            value = usuario,
                            onValueChange = {
                                usuario = it
                            },
                            modifier = Modifier.fillMaxWidth(),
                            placeholder = {
                                Text(text = "Digite o usuário")
                            },
                            colors = OutlinedTextFieldDefaults.colors(
                                unfocusedBorderColor = colorResource(id = R.color.theme),
                                focusedBorderColor = colorResource(id = R.color.theme)
                            ),
                            shape = RoundedCornerShape(16.dp),
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                            maxLines = 1

                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = "Senha",
                            modifier = Modifier.padding(bottom = 8.dp),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            color = colorResource(id = R.color.theme)
                        )
                        OutlinedTextField(
                            trailingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "Senha")},
                            value = senha,
                            onValueChange = {
                                senha = it
                            },
                            modifier = Modifier.fillMaxWidth(),
                            placeholder = {
                                Text(
                                    text = "Digite a senha"
                                )
                            },
                            colors = OutlinedTextFieldDefaults.colors(
                                unfocusedBorderColor = colorResource(id = R.color.theme),
                                focusedBorderColor = colorResource(id = R.color.theme)
                            ),
                            shape = RoundedCornerShape(16.dp),
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                            maxLines = 1
                        )
                        Spacer(modifier = Modifier.height(74.dp))
                        Button(
                            onClick = {
                                navcControler.navigate("index")
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(65.dp),

                            shape = RoundedCornerShape(16.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.theme))
                        ) {
                            Text(
                                text = "Entrar",
                                fontWeight = FontWeight.Bold,
                                color = Color.White,
                                fontSize = 18.sp

                            )
                        }
                        Text(
                            text = "Esqueci minha senha",
                            modifier = Modifier.padding(bottom = 8.dp, end = 5.dp, top = 2.dp) .clickable{} .align(Alignment.End),
                            fontSize = 17.sp,
                            fontWeight = FontWeight.Normal,
                            color = Color(0xFF074D09)
                        )
                    }


                }

            }
        }

    }
}


@Preview(showSystemUi = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen(rememberNavController())
}
