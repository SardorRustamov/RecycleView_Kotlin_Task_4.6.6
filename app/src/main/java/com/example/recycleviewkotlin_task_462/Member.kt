package com.example.recycleviewkotlin_task_462

import java.io.Serializable

class Member(var name:String, var text:String): Serializable {
    override fun toString(): String {
        return "Member(name='$name', text='$text')"
    }
}