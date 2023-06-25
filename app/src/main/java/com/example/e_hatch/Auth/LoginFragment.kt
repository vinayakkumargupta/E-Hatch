package com.example.e_hatch.Auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.e_hatch.R


class LoginFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding =  inflater.inflate(R.layout.fragment_login, container, false)

        val Signuptext = binding.findViewById<TextView>(R.id.Signup)

        Signuptext.setOnClickListener{
            findNavController().navigate(R.id.action_loginFragment_to_registrationFragment)
        }

        return binding
    }


}