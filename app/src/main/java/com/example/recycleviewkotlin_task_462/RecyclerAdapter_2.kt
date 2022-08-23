package com.example.recycleviewkotlin_task_462

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter_2(var recyclerModel_2: MutableList<RecyclerModel_2>): RecyclerView.Adapter<RecyclerAdapter_2.ViewHolder_2>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder_2 {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.list_item_layout_2, parent, false)
        return ViewHolder_2(view)
    }

    override fun onBindViewHolder(holder: ViewHolder_2, position: Int) {
        val vv = recyclerModel_2[position]

        if (holder is ViewHolder_2){

            holder.text2?.setText(vv.text2)
            holder.imageview2?.setImageResource(vv.image2)
        }
    }
    override fun getItemCount(): Int {
        return recyclerModel_2.size
    }
    class ViewHolder_2(var view: View): RecyclerView.ViewHolder(view) {

        var text2:TextView?=null
        var imageview2:ImageView?=null

        init {
            text2= view.findViewById(R.id.text_2)
            imageview2=view.findViewById(R.id.image2)
        }
    }
}