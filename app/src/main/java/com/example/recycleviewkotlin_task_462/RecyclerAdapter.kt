package com.example.recycleviewkotlin_task_462

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(val activity: MainActivity, model: MutableList<RecyclerModel>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var recyclerModel = ArrayList<RecyclerModel>()
    fun setList(newList: List<RecyclerModel?>) {
        recyclerModel = newList as ArrayList<RecyclerModel>
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.list_item_layout, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val model = recyclerModel[position]

        if (holder is MyViewHolder){
            val tvTitle = holder.tvTitle
            val tvDesc=holder.tvDesc
            val lay_click=holder.lay_click

            tvTitle?.setText(model.title)
            tvDesc?.setText(model.description)
            lay_click?.setOnClickListener(View.OnClickListener {
                activity.openItemDetails(recyclerModel)
            })
        }
    }

    override fun getItemCount(): Int {
        return recyclerModel.size
    }

    class MyViewHolder(var view: View) : RecyclerView.ViewHolder(view) {

        var tvTitle: TextView? = null
        var tvDesc: TextView? = null
        var lay_click: LinearLayout?=null

        init {
            lay_click=itemView.findViewById(R.id.ln_click)
            tvTitle = itemView.findViewById(R.id.tv_item_description)
            tvDesc = itemView.findViewById(R.id.tv_item_title)
        }
    }
}