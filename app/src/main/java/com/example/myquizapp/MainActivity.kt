package com.example.myquizapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etButton:EditText=findViewById(R.id.et_btn)
        val btnStart: Button=findViewById(R.id.btn_start)
        btnStart.setOnClickListener {
            if(etButton.text.isEmpty()){
                Toast.makeText(this, "Please enter your Name", Toast.LENGTH_SHORT).show()
            }else{
                val intent=Intent(this,QuizQuestionActivity::class.java)
                startActivity(intent)
                finish()
            }
        }



    }
}