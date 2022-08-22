package com.example.recycleviewkotlin_task_462

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val models: MutableList<RecyclerModel> = ArrayList()
        models.add(RecyclerModel("Title1", "Desc1"))
        models.add(RecyclerModel("Title2", "Desc2"))
        models.add(RecyclerModel("Title3", "Desc3"))
        models.add(RecyclerModel("Title4", "Desc4"))
        models.add(RecyclerModel("Title5", "Desc5"))
        models.add(RecyclerModel("Title6", "Desc6"))
        models.add(RecyclerModel("Title7", "Desc7"))
        models.add(RecyclerModel("Title8", "Desc8"))
        models.add(RecyclerModel("Title9", "Desc9"))


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        val adapter = RecyclerAdapter(this, models)
        adapter.setList(models)

        val lnr = LinearLayoutManager(this)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = lnr
    }

    fun openItemDetails(recyclerModel: ArrayList<RecyclerModel>){
        val member = Member("Sardor", "R")
        val intent = Intent(this, ProfileActivity::class.java)
        intent.putExtra("member", member)
        startActivity(intent)
    }

}