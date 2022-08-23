package com.example.recycleviewkotlin_task_462

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(val activity: MainActivity, recyclerModel: MutableList<RecyclerModel>, childModelClassList: ArrayList<RecyclerModel_2> = ArrayList<RecyclerModel_2>()) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var recyclerModel = ArrayList<RecyclerModel>()
    private var childModelClassList = childModelClassList

    fun setList(newList: List<RecyclerModel?>) {
        recyclerModel = newList as ArrayList<RecyclerModel>
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.list_item_layout, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val model = recyclerModel[position]

        if (holder is MyViewHolder) {

            val lay_click = holder.lay_click

            holder.title?.setText(model.title)
            holder.description?.setText(model.description)
            holder.imageView?.setImageResource(model.image)

            lay_click?.setOnClickListener(View.OnClickListener {
                activity.openItemDetails(recyclerModel)
            })


            val recyclerAdapter_2: RecyclerAdapter_2

            recyclerAdapter_2 = RecyclerAdapter_2(childModelClassList)
            holder.recyclerView_2?.setLayoutManager(LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false))
            holder.recyclerView_2?.setAdapter(recyclerAdapter_2)
        }

    }

    override fun getItemCount(): Int {
        return recyclerModel.size
    }

    class MyViewHolder(var view: View) : RecyclerView.ViewHolder(view) {

        var title: TextView? = null
        var description:TextView? = null
        var imageView: ImageView? = null
        var recyclerView_2: RecyclerView? = null
        var lay_click: LinearLayout? = null


        init {
            recyclerView_2=view.findViewById(R.id.recyclerView_2)
            lay_click=view.findViewById(R.id.ln_click)
            description = view.findViewById(R.id.tv_item_description)
            title = view.findViewById(R.id.tv_item_title)
            imageView=itemView.findViewById(R.id.img_item)
        }
    }
}