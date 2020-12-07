package com.example.to_dolist.main_activity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.to_dolist.R
import com.example.to_dolist.db.ToDo
import com.google.android.material.textview.MaterialTextView

class ListAdapter(private val list: List<ToDo>) : RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
            ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = list[position].content
    }

    override fun getItemCount(): Int = list.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val textView: MaterialTextView = itemView.findViewById(R.id.textView)
    }
}