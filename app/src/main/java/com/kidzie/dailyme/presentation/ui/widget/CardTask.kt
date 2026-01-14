package com.kidzie.dailyme.presentation.ui.widget

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun CardTask(taskTitle : String) {
    Card(modifier = Modifier.fillMaxWidth(), onClick = {  }) {
        Row() {
            Checkbox(checked = false, onCheckedChange = {

            })
            Text(taskTitle)
        }
    }
}