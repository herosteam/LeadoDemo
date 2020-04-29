package com.example.leadoappdemo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.leadoappdemo.R
import com.example.leadoappdemo.ui.fragments.HomeFragment
import com.example.leadoappdemo.ui.fragments.LeaderBoardFragment
import com.example.leadoappdemo.ui.fragments.SearchFragment
import com.example.leadoappdemo.ui.fragments.UserProfileFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener{



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //Home Activity with four fragments

        bottomNavigationView.setOnNavigationItemSelectedListener(this)

        if (savedInstanceState == null) {
            val fragment = HomeFragment()
            supportFragmentManager.beginTransaction().replace(R.id.fragments_container, fragment, fragment.javaClass.simpleName)
                .commit()
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.nav_home){
            val fragment = HomeFragment()
            supportFragmentManager.beginTransaction().replace(R.id.fragments_container, fragment, fragment.javaClass.simpleName)
                .commit()
            return true
        }
        else if(item.itemId == R.id.nav_search){
            val fragment = SearchFragment()
            supportFragmentManager.beginTransaction().replace(R.id.fragments_container, fragment, fragment.javaClass.simpleName)
                .commit()
            return true
        }
        else if(item.itemId == R.id.nav_graph){
            val fragment = LeaderBoardFragment()
            supportFragmentManager.beginTransaction().replace(R.id.fragments_container, fragment, fragment.javaClass.simpleName)
                .commit()
            return true
        }
        else if(item.itemId == R.id.nav_profile){
            val fragment = UserProfileFragment()
            supportFragmentManager.beginTransaction().replace(R.id.fragments_container, fragment, fragment.javaClass.simpleName)
                .commit()
            return true
        }
        return false
    }
}
