package com.example.first

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun chanceScreen(
    chanceViewModel: ChanceViewModel,

    ) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Button(onClick = {
            chanceViewModel.generateRandomDigit()
        }) {
            Text("Generate Random Digit")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = chanceViewModel.chanceDigit.intValue.toString())
    }


}

