package com.example.myquizapp

data class Questions(
    val Id:Int,
    val questions: String,
    val images: Int,
    val optionOne:String,
    val optionTwo:String,
    val optionThree:String,
    val optionFour:String,
    val correctAnswer:Int
)
