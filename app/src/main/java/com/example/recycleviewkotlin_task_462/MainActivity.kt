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
        models.add(RecyclerModel("Title", "Description", R.drawable.ic_baseline_image_not_supported_24))
        models.add(RecyclerModel("Title", "Description", R.drawable.ic_baseline_image_not_supported_24))
        models.add(RecyclerModel("Title", "Description", R.drawable.ic_baseline_image_not_supported_24))
        models.add(RecyclerModel("Title", "Description", R.drawable.ic_baseline_image_not_supported_24))
        models.add(RecyclerModel("Title", "Description", R.drawable.ic_baseline_image_not_supported_24))
        models.add(RecyclerModel("Title", "Description", R.drawable.ic_baseline_image_not_supported_24))
        models.add(RecyclerModel("Title", "Description", R.drawable.ic_baseline_image_not_supported_24))
        models.add(RecyclerModel("Title", "Description", R.drawable.ic_baseline_image_not_supported_24))
        models.add(RecyclerModel("Title", "Description", R.drawable.ic_baseline_image_not_supported_24))
        models.add(RecyclerModel("Title", "Description", R.drawable.ic_baseline_image_not_supported_24))
        models.add(RecyclerModel("Title", "Description", R.drawable.ic_baseline_image_not_supported_24))
        models.add(RecyclerModel("Title", "Description", R.drawable.ic_baseline_image_not_supported_24))
        models.add(RecyclerModel("Title", "Description", R.drawable.ic_baseline_image_not_supported_24))
        models.add(RecyclerModel("Title", "Description", R.drawable.ic_baseline_image_not_supported_24))
        models.add(RecyclerModel("Title", "Description", R.drawable.ic_baseline_image_not_supported_24))
        models.add(RecyclerModel("Title", "Description", R.drawable.ic_baseline_image_not_supported_24))
        models.add(RecyclerModel("Title", "Description", R.drawable.ic_baseline_image_not_supported_24))
        models.add(RecyclerModel("Title", "Description", R.drawable.ic_baseline_image_not_supported_24))
        models.add(RecyclerModel("Title", "Description", R.drawable.ic_baseline_image_not_supported_24))
        models.add(RecyclerModel("Title", "Description", R.drawable.ic_baseline_image_not_supported_24))
        models.add(RecyclerModel("Title", "Description", R.drawable.ic_baseline_image_not_supported_24))
        models.add(RecyclerModel("Title", "Description", R.drawable.ic_baseline_image_not_supported_24))
        models.add(RecyclerModel("Title", "Description", R.drawable.ic_baseline_image_not_supported_24))
        models.add(RecyclerModel("Title", "Description", R.drawable.ic_baseline_image_not_supported_24))


        val recycleradapter2: MutableList<RecyclerModel_2> = ArrayList()
        recycleradapter2.add(RecyclerModel_2("Image", R.drawable.ic_baseline_image_24))
        recycleradapter2.add(RecyclerModel_2("Image", R.drawable.ic_baseline_image_24))
        recycleradapter2.add(RecyclerModel_2("Image", R.drawable.ic_baseline_image_24))
        recycleradapter2.add(RecyclerModel_2("Image", R.drawable.ic_baseline_image_24))
        recycleradapter2.add(RecyclerModel_2("Image", R.drawable.ic_baseline_image_24))
        recycleradapter2.add(RecyclerModel_2("Image", R.drawable.ic_baseline_image_24))
        recycleradapter2.add(RecyclerModel_2("Image", R.drawable.ic_baseline_image_24))
        recycleradapter2.add(RecyclerModel_2("Image", R.drawable.ic_baseline_image_24))
        recycleradapter2.add(RecyclerModel_2("Image", R.drawable.ic_baseline_image_24))
        recycleradapter2.add(RecyclerModel_2("Image", R.drawable.ic_baseline_image_24))
        recycleradapter2.add(RecyclerModel_2("Image", R.drawable.ic_baseline_image_24))
        recycleradapter2.add(RecyclerModel_2("Image", R.drawable.ic_baseline_image_24))
        recycleradapter2.add(RecyclerModel_2("Image", R.drawable.ic_baseline_image_24))

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        val adapter = RecyclerAdapter(this, models, recycleradapter2 as ArrayList<RecyclerModel_2>)
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