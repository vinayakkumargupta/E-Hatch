package com.example.e_hatch.Auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.e_hatch.ViewModels.authlistner
import com.example.e_hatch.databinding.ActivityLoginMainBinding

class LoginMainActivity : AppCompatActivity(), authlistner {
    private lateinit var databinding: ActivityLoginMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)





    }


    override fun OnStarted() {
        super.OnStarted()
    }

    override fun OnSuccess() {
        super.OnSuccess()
    }

    override fun OnFailure(message: String) {
        super.OnFailure(message)
    }


}