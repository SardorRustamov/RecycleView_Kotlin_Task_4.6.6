package com.example.recycleviewkotlin_task_462

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var list = ArrayList<RecyclerModel>()
    fun setList(newList: List<RecyclerModel?>) {
        list = newList as ArrayList<RecyclerModel>
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.list_item_layout, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val model = list[position]
        (holder as MyViewHolder).bind(model)
    }

    override fun getItemCount(): Int {
        return list.size
    }


    class MyViewHolder(var view: View) : RecyclerView.ViewHolder(view) {

        var tvTitle: TextView? = null
        var tvDesc: TextView? = null

        init {
            tvTitle = itemView.findViewById(R.id.title)
            tvDesc = itemView.findViewById(R.id.description)
        }

        fun bind(model: RecyclerModel) {
            tvTitle!!.text = model.title
            tvDesc!!.setText(model.description)
        }
    }
}