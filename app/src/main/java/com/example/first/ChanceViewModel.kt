package com.example.first

import android.util.Log
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class ChanceViewModel : ViewModel() {
    var chanceDigit = mutableIntStateOf(1)
//    val bahramScope = CoroutineScope(Dispatchers.Default)
    fun generateRandomDigit() {
        Log.i("0--->", Thread.currentThread().name)
        viewModelScope.launch(Dispatchers.IO) {
            Log.i("1--->", Thread.currentThread().name)
            delay(10000)
            Log.i("2--->", Thread.currentThread().name)
            val list = listOf(1, 2, 3, 4, 5, 6)
            chanceDigit.intValue = list.random()
            Log.i("3--->", Thread.currentThread().name)
        }
        Log.i("4--->", Thread.currentThread().name)
    }

    override fun onCleared() {
        super.onCleared()
//        bahramScope.cancel()
        Log.i("CCC--->", "onCleared")
    }
}