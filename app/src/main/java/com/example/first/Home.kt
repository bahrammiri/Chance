package com.example.first

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun home(
    chanceViewModel: ChanceViewModel,

    ) {


    var randomDigit by remember { mutableIntStateOf(chanceViewModel.getRandomDigit()) }


    Column(modifier = Modifier.fillMaxWidth(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {

        Button(onClick = {
            chanceViewModel.generateRandomDigit()
            randomDigit = chanceViewModel.getRandomDigit()
        }) {
            Text("Generate Random Digit")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = randomDigit.toString())
    }


}

