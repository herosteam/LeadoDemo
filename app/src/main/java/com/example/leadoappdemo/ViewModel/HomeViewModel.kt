package com.example.leadoappdemo.ViewModel

import android.util.Log
import androidx.lifecycle.*

import com.example.leadoappdemo.models.User
import com.example.leadoappdemo.repositories.UserRepository

class HomeViewModel: ViewModel()
{
    val viewModelUserList: MutableLiveData<List<User>> = MutableLiveData()


    /*fun getUser(): LiveData<List<User>> {
        getUserData()
        return ViewModelUserList
    }*/

    /*fun getUserData():LiveData<List<User>>
    {
        val userRepo = UserRepository.loadUsers()

        viewModelUserList.postValue(userRepo)
        Log.d("mikee","${userRepo.Course1IDLesson1ID}")
        return viewModelUserList
    }*/
}



