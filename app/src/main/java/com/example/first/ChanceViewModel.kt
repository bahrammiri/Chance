package com.example.first

import androidx.lifecycle.ViewModel

class ChanceViewModel : ViewModel() {

    var chanceDigit = 1

    fun getRandomDigit(): Int {
        return chanceDigit
    }

    fun generateRandomDigit() {
        var list = listOf(1, 2, 3, 4, 5, 6)
        chanceDigit = list.random()
    }
//    fun generateRandomDigit() {
//
//        chanceDigit ++
//    }
}