package com.example.first

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun baseScreen(chanceViewModel: ChanceViewModel) {
    chanceScreen(
        onClikedLisener = {
            chanceViewModel.generateRandomDigit()
        },
        number = chanceViewModel.chanceDigit.intValue.toString()
    )
}

@Composable
fun chanceScreen(
    onClikedLisener: () -> Unit,
    number: String
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {
            onClikedLisener.invoke()
        }) {
            Text("Generate Random Digit")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = number)
    }
}


@Preview
@Composable
fun TestPreview() {
    chanceScreen({}, "6")
}


