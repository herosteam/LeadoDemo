package com.example.leadoappdemo.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.leadoappdemo.R
import kotlinx.android.synthetic.main.course_items.view.*

class CoursesAdapter: RecyclerView.Adapter<CoursesAdapter.ItemViewHolder>()
{

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder
    {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.course_items, parent , false)
        return ItemViewHolder(view)
    }

    override fun getItemCount(): Int = 1


    override fun onBindViewHolder(holder: ItemViewHolder, position: Int)
    {
        holder.personalBrandingBtn
    }

    class ItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {
        val personalBrandingBtn: Button = itemView.button1
        val mindMappingBtn: Button = itemView.button2
        val selfAwarnessBtn: Button = itemView.button3
    }
}