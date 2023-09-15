package com.example.eco_tech.composes.screens

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BlogScreen() {
    var isDropdownExpanded by remember { mutableStateOf(false) }
    var isDropdownExpanded1 by remember { mutableStateOf(false) }
    var isDropdownExpanded2 by remember { mutableStateOf(false) }
    var isDropdownExpanded3 by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .padding(8.dp)
            .background(Color(0xFFE9F5E8))
    ) {

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { isDropdownExpanded = !isDropdownExpanded },
            modifier = Modifier.padding(8.dp)
        ) {
            Text(
                text = if (isDropdownExpanded) "Ver Menos" else "Ver Mais"
            )
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(animateDpAsState(if (isDropdownExpanded) 150.dp else 50.dp).value)
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxSize()
            ) {
                Text("Pré Content")

                if (isDropdownExpanded) {
                    Text("Dropdown Content")
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { isDropdownExpanded1 = !isDropdownExpanded1 },
            modifier = Modifier.padding(8.dp)
        ) {
            Text(
                text = if (isDropdownExpanded1) "Ver Menos" else "Ver Mais"
            )
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(animateDpAsState(if (isDropdownExpanded1) 150.dp else 50.dp).value)
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxSize()
            ) {
                Text("Pré Content")

                if (isDropdownExpanded1) {
                    Text("Dropdown Content")
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { isDropdownExpanded2 = !isDropdownExpanded2 },
            modifier = Modifier.padding(8.dp)
        ) {
            Text(
                text = if (isDropdownExpanded2) "Ver Menos" else "Ver Mais"
            )
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(animateDpAsState(if (isDropdownExpanded2) 150.dp else 50.dp).value)
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxSize()
            ) {
                Text("Pré Content")

                if (isDropdownExpanded2) {
                    Text("Dropdown Content")
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { isDropdownExpanded3 = !isDropdownExpanded3 },
            modifier = Modifier.padding(8.dp)
        ) {
            Text(
                text = if (isDropdownExpanded3) "Ver Menos" else "Ver Mais"
            )
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(animateDpAsState(if (isDropdownExpanded3) 150.dp else 50.dp).value)
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxSize()
            ) {
                Text("Pré Content")

                if (isDropdownExpanded3) {
                    Text("Dropdown Content")
                }
            }
        }
    }
}

