package com.example.abustringviewmodel.ui

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class MyStringViewModel(val text: String) : ViewModel() {

    var liveData = MutableLiveData<String>()

    fun getLiveData(): String {
        liveData.value = text
        return liveData.value!!
        Log.d("AAA", "liveData : ${liveData.value}")
    }
}