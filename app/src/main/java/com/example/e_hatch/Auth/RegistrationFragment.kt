package com.example.e_hatch.Auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction


class RegistrationFragment : Fragment() {

    private var entreprenuerFragment: Fragment? = null
    private var mentorFragment: Fragment? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(com.example.e_hatch.R.layout.fragment_registration, container, false)

        entreprenuerFragment = EntreprenuerFragment()
        mentorFragment = MentorFragment()

        val mentorTextView =  view.findViewById<TextView>(com.example.e_hatch.R.id.Mentor)
        val entreprenuerText =  view.findViewById<TextView>(com.example.e_hatch.R.id.entreprenuers)


        mentorTextView.setOnClickListener(View.OnClickListener {
//
            replaceFragment(mentorFragment as MentorFragment)
        })

        entreprenuerText.setOnClickListener(View.OnClickListener {
//
            replaceFragment(entreprenuerFragment as EntreprenuerFragment)
        })


        return view
    }
//    private fun isMentorFragmentVisible(): Boolean {
//        // Check if the MentorFragment is currently visible
//        val currentFragment =
//            childFragmentManager.findFragmentById(com.example.e_hatch.R.id.mentorFragment)
//        return currentFragment is MentorFragment
//    }

    private fun replaceFragment(fragment: Fragment) {
        // Replace the current fragment with the new fragment
        val fragmentManager: FragmentManager =
            childFragmentManager // Replace with getSupportFragmentManager() if using in an activity
        val transaction: FragmentTransaction = fragmentManager.beginTransaction()
        transaction.replace(
            com.example.e_hatch.R.id.Framehai,fragment
        ) 
        transaction.commit()
    }


}