package com.example.to_dolist.main_activity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.to_dolist.R
import com.google.android.material.textview.MaterialTextView

class ListAdapter(private val list: List<String>) : RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
            ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // TODO: 07/12/2020  add implementation 
    }

    override fun getItemCount(): Int = list.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val textView = itemView.findViewById<MaterialTextView>(R.id.textView)
    }
}