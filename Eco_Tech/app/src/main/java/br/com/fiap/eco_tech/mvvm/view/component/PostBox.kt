package br.com.fiap.eco_tech.mvvm.view.component

import android.content.Context
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.com.fiap.eco_tech.R
import br.com.fiap.eco_tech.mvvm.view_model.PostBoxViewModel

@Composable
fun PostBox(
    title: String,
    description: String,
    context: Context,
    postBoxViewModel: PostBoxViewModel
) {

    val dropDownOpen by postBoxViewModel.dropDownOpen.observeAsState(initial = false)

    Text(text = title)
    DefaultButton(
        modifier = Modifier,
        text = if (dropDownOpen)
                    context.getString(R.string.dropdown_hide)
                else
                    context.getString(R.string.dropdown_show),
        textSize = 12
    ) {
        postBoxViewModel.onMenuOpenChanged(!dropDownOpen)
    }
    if (dropDownOpen) {
        Text(text = description)
    }
    Spacer(modifier = Modifier.padding(10.dp))
}


