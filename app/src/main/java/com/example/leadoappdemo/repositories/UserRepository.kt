package com.example.leadoappdemo.repositories

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.leadoappdemo.models.User
import com.google.firebase.firestore.FirebaseFirestore

object UserRepository
{

    val userList = mutableListOf<User>()

    //private var lastUpdate = 1

    val db = FirebaseFirestore.getInstance()
    val usersCollection = db.collection("User")

    private val liveUserList: MutableLiveData<List<User>> = MutableLiveData()

    fun loadUsers(): LiveData<List<User>>
    {
        loadDataFromRemote()
        return liveUserList
    }

    /*private fun loadDataFromMemory(): Boolean
    {
        if(userList.size == 0)
        {
            return false
        }
        else{
            lastUpdate++
            return true
        }

    }*/


    private fun loadDataFromRemote()
    {
        usersCollection.get()
            .addOnSuccessListener {
                Log.d("mike","from remote data source")
                // add them to your db
                for(document in it.documents)
                {
                    val user = document.toObject(User::class.java)
                    Log.d("mike","${user?.Rank.toString()}")
                    userList.add(user!!)
                }
                liveUserList.postValue(userList)
            }
            .addOnFailureListener {
                Log.d("mike",it.message)
            }
    }

}