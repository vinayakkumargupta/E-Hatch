package com.example.e_hatch.ViewModels

import android.view.View
import androidx.lifecycle.ViewModel

class AuthCommonViewHolder : ViewModel() {
    var email: String? = null
    var password: String? = null
    var authlistner: authlistner? = null


    fun OnLoginButton(view: View){
        authlistner?.OnStarted()
        if (email.isNullOrEmpty() || password.isNullOrEmpty()){

            authlistner?.OnFailure("")


            return
        }

    }
}