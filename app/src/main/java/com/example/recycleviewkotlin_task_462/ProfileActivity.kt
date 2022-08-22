package com.example.recycleviewkotlin_task_462

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        view()
    }
    fun view(){
        var tv_profile=findViewById<TextView>(R.id.tv_profile)
        var member=intent.getSerializableExtra("member")
        tv_profile.setText(member.toString())
    }
}