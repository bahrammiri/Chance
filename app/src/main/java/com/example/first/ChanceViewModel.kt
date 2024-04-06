package com.example.first

import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

class ChanceViewModel : ViewModel() {

    var chanceDigit = mutableIntStateOf(1)

    fun generateRandomDigit() {
        val list = listOf(1, 2, 3, 4, 5, 6)
        chanceDigit.intValue = list.random()
    }



}