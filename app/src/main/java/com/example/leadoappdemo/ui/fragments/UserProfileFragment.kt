package com.example.leadoappdemo.ui.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton

import com.example.leadoappdemo.R
import com.example.leadoappdemo.ui.HomeActivity
import kotlinx.android.synthetic.main.control_app_bar.*


class UserProfileFragment : Fragment() {





    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_user_profile, container, false)


        iV_back.setOnClickListener {
            var intent = Intent(context,HomeActivity::class.java)
            startActivity(intent)
        }

    }




}
