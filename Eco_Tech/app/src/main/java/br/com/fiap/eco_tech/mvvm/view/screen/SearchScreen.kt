package com.example.eco_tech.composes.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SearchScreen() {

    var textFieldValue = remember {
        mutableStateOf("")
    }

    var quantidade = remember {
        mutableStateOf("")
    }


    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(all = 10.dp)
    ) {
        Text(
            text = "Comparação de Preços de Alimentos",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            fontFamily = FontFamily.Serif,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(all = 20.dp)
        )
        TextField(
            value = textFieldValue.value,
            onValueChange = { novoValor ->
                textFieldValue.value = novoValor
            },
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(
                capitalization = KeyboardCapitalization.Words,
            ),
            label = {
                Text(text = "Digite o alimento...",
                    modifier = Modifier.align(Alignment.CenterHorizontally),

                    )
            }
        )
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .size(width = 200.dp, height = 60.dp)
                .align(Alignment.CenterHorizontally)
                .padding(top = 20.dp),
            border = BorderStroke(width = 3.dp, color = Color.White),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
        ) {
            Text(text = "Buscar")
        }


        Spacer(modifier = Modifier.height(32.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Checkbox(
                checked = false,
                onCheckedChange = {},
                colors = CheckboxDefaults.colors(
                    checkedColor = Color.Black,
                    uncheckedColor = Color.Black
                )
            )
            Text(
                text = "Orgânico",
                color = Color.Black
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Checkbox(
                checked = false,
                onCheckedChange = {},
                colors = CheckboxDefaults.colors(
                    checkedColor = Color.Black,
                    uncheckedColor = Color.Black
                )
            )
            Text(
                text = "Sem Glúten",
                color = Color.Black
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Checkbox(
                checked = false,
                onCheckedChange = {},
                colors = CheckboxDefaults.colors(
                    checkedColor = Color.Black,
                    uncheckedColor = Color.Black
                )
            )
            Text(
                text = "Sem Lactose",
                color = Color.Black
            )
        }
    }
}
