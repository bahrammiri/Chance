package com.example.first

import ChanceScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.first.ui.theme.FirstTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val viewModel: ChanceViewModel by viewModels()
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            FirstTheme {
                Scaffold {padd->
                    NavigationComponent(navController,padd)
                }
            }
        }
    }
}

@Composable
fun NavigationComponent(navController: NavHostController, padd: PaddingValues) {
    NavHost(
        navController = navController,
        startDestination = "details"
    ) {
        composable("details") {
            val detailViewModel = viewModel<DetailViewModel>()
            DetailScreen(detailViewModel,navController)
        }
        composable("home") {
            val chanceViewModel = viewModel<ChanceViewModel>()
            ChanceScreen(chanceViewModel)
        }
    }
}



