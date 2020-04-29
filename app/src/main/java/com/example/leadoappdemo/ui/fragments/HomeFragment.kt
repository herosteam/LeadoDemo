package com.example.leadoappdemo.ui.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.leadoappdemo.R
import com.example.leadoappdemo.ViewModel.HomeViewModel
import com.example.leadoappdemo.ui.adapters.CoursesAdapter
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*
import kotlinx.android.synthetic.main.fragment_home.view.rank

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    private lateinit var hViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_home,container,false)

        rootView.recyclerView.adapter = CoursesAdapter()
        rootView.recyclerView.layoutManager = LinearLayoutManager(context)
        rootView.recyclerView.setHasFixedSize(true)

        return rootView
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        hViewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)

        /*hViewModel.getUserData().observe(this, Observer {
            rank.text = it.Rank
            Log.d("mikee","${it?.Rank.toString()}")
        })*/

    }

}
