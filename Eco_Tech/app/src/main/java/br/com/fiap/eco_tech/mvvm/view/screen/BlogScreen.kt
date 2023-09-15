package br.com.fiap.eco_tech.mvvm.view.screen

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import br.com.fiap.eco_tech.database.repository.PostRepository
import br.com.fiap.eco_tech.mvvm.view.component.PostBox
import br.com.fiap.eco_tech.mvvm.view_model.PostBoxViewModel

@Composable
fun BlogScreen() {

    val context = LocalContext.current
    val postDB = PostRepository(context)

    LazyColumn(modifier = Modifier.padding(10.dp).fillMaxWidth()){
        items(postDB.getAll()){
            PostBox(it.title,it.description,context, PostBoxViewModel())
        }
    }

}

