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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.eco_tech.R
import br.com.fiap.eco_tech.mvvm.view.component.IndexCard
import br.com.fiap.eco_tech.navigation.AppRoutes

@Composable
fun IndexScreen(navController: NavController) {

    val context = LocalContext.current

    Box(modifier = Modifier.background(colorResource(id = R.color.light_green))) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(32.dp, 16.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Text(
                text = context.getString(R.string.index_title),
                textAlign = TextAlign.Center,
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = context.getString(R.string.index_subtitle),
                textAlign = TextAlign.Center,
                fontSize = 18.sp,
                color = Color.Black,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(20.dp))

            IndexCard(
                context.getString(R.string.index_blog),
                painterResource(id = R.drawable.blog),
                Color(context.getColor(R.color.green)),
                onClick = {
                    navController.navigate(AppRoutes.BLOG_ROUTE)
                }
            )
            Spacer(modifier = Modifier.height(30.dp))

            IndexCard(
                context.getString(R.string.index_chat),
                painterResource(id = R.drawable.chat),
                Color(context.getColor(R.color.theme)),
                onClick = {
                    navController.navigate(AppRoutes.CHAT_ROUTE)
                }
            )
            Spacer(modifier = Modifier.height(30.dp))

            IndexCard(
                context.getString(R.string.index_search),
                painterResource(id = R.drawable.search),
                Color(context.getColor(R.color.green)),
                onClick = {
                    navController.navigate(AppRoutes.SEARCH_ROUTE)
                }
            )
            Spacer(modifier = Modifier.height(30.dp))

        }
    }

}


