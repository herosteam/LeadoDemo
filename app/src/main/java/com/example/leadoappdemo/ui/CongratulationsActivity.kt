package com.example.leadoappdemo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.leadoappdemo.R
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase

class CongratulationsActivity : AppCompatActivity() {

    var  fs=FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_congratulations)

        //Congrats. Screen
        //


    }
}
