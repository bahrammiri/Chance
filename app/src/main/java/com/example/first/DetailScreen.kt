package com.example.first

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun DetailScreen(viewModel: DetailViewModel,
navController: NavController
) {
    Text(text = viewModel.getDetailText())
    Button(onClick = {
        navController.navigate("home")
    }) {
        Text("Navigate to Change")
    }
}