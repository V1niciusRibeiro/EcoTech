package br.com.fiap.eco_tech.mvvm.view.component

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.eco_tech.R

@Composable
fun DefaultInput(
    modifier: Modifier,
    label: String,
    placeholder: String,
    icon: ImageVector,
    iconDescription: String,
    value: String,
    keyboardType: KeyboardType,
    maxLines: Int,
    onValueChange:(String)->Unit
) {

    Text(
        text = label,
        modifier = Modifier.padding(bottom = 8.dp),
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal,
        color = colorResource(id = R.color.theme)
    )
    OutlinedTextField(
        trailingIcon = { Icon(imageVector = icon, contentDescription = iconDescription)},
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        placeholder = {
            Text(
                text = placeholder
            )
        },
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedBorderColor = colorResource(id = R.color.theme),
            focusedBorderColor = colorResource(id = R.color.theme)
        ),
        shape = RoundedCornerShape(16.dp),
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
        maxLines = maxLines
    )

}



