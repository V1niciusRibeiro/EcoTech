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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.eco_tech.R

@Composable
fun IndexScreen() {

    Box() {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .fillMaxSize()
                .background(colorResource(id = R.color.verde)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Bem-vindo à Plataforma de Conscientização Alimentar",
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF333333),
                modifier = Modifier.padding(bottom = 20.dp),
                textAlign = TextAlign.Center

            )
            Text(
                text = "Explore nossas categorias de conteúdo:",
                fontSize = 18.sp,
                color = Color(0xFF333333),
                modifier = Modifier.padding(bottom = 20.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Card(
                //shape = MaterialTheme.shapes.medium,
                shape = RoundedCornerShape(8.dp),
                // modifier = Modifier.size(280.dp, 240.dp)
                modifier = Modifier
                    .padding(10.dp, 5.dp, 10.dp, 10.dp)
                    .size(300.dp, 200.dp),
                //set card elevation of the card
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 10.dp,
                ),
                colors = CardDefaults.cardColors(
                    containerColor = colorResource(id = R.color.theme),
                ),
            ) {
                Column(modifier = Modifier.clickable(onClick = { })) {

                    Image(
                        painter = painterResource(R.drawable.blog),
                        contentDescription = "", // decorative
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .height(150.dp)
                            .fillMaxWidth()
                    )

                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(
                            text = "BLOG",
                            style = MaterialTheme.typography.titleMedium,
                            maxLines = 2,
                            overflow = TextOverflow.Ellipsis
                        )

                        Spacer(modifier = Modifier.height(5.dp))

                    }
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            Card(
                //shape = MaterialTheme.shapes.medium,
                shape = RoundedCornerShape(8.dp),
                // modifier = Modifier.size(280.dp, 240.dp)
                modifier = Modifier
                    .padding(10.dp, 5.dp, 10.dp, 10.dp)
                    .size(300.dp, 200.dp),
                //set card elevation of the card
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 10.dp,
                ),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFF8BC34A),
                ),
            ) {
                Column(modifier = Modifier.clickable(onClick = { })) {

                    Image(
                        painter = painterResource(R.drawable.chat),
                        contentDescription = "", // decorative
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .height(150.dp)
                            .fillMaxWidth()
                            .background(Color.White)
                    )

                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(
                            text = "CONSULTA",
                            style = MaterialTheme.typography.titleMedium,
                            maxLines = 2,
                            overflow = TextOverflow.Ellipsis
                        )

                        Spacer(modifier = Modifier.height(5.dp))

                    }
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            Card(
                //shape = MaterialTheme.shapes.medium,
                shape = RoundedCornerShape(8.dp),
                // modifier = Modifier.size(280.dp, 240.dp)
                modifier = Modifier
                    .padding(10.dp, 5.dp, 10.dp, 10.dp)
                    .size(300.dp, 200.dp),
                //set card elevation of the card
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 10.dp,
                ),
                colors = CardDefaults.cardColors(
                    containerColor = colorResource(id = R.color.theme),
                ),
            ) {
                Column(modifier = Modifier.clickable(onClick = { })) {

                    Image(
                        painter = painterResource(R.drawable.search),
                        contentDescription = "", // decorative
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .height(150.dp)
                            .fillMaxWidth()
                    )

                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(
                            text = "PESQUISA",
                            style = MaterialTheme.typography.titleMedium,
                            maxLines = 2,
                            overflow = TextOverflow.Ellipsis
                        )

                        Spacer(modifier = Modifier.height(5.dp))
                    }
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
        }
    }

}


