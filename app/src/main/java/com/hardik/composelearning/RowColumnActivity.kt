package com.hardik.composelearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

class RowColumnActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .background(color = Color.Yellow)
                    .fillMaxSize(0.5f)
            ) {
                Text("Text One", Modifier.size(22.dp))
                Text("This is Text Two", Modifier.size(Dp(22F)))
                Text("This is Last Text", Modifier.size(Dp(22f)))
                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("One", Modifier.size(Dp(26f)))
                    Text("Two", Modifier.size(Dp(26f)))
                }
            }
        }
    }
}