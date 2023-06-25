package com.example.e_hatch.ViewModels

import android.os.Message

interface authlistner {
    fun OnStarted(){}
    fun OnSuccess(){}
    fun OnFailure(message: String){}
}