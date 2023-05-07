package com.example.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val btnFinish: Button=findViewById(R.id.btn_finish)

        val resultName: TextView=findViewById(R.id.tv_resultName)
        val scoreCard: TextView=findViewById(R.id.tv_scoreCard)
        val finishButton: Button=findViewById(R.id.btn_finish)
        val correctAnswer=intent.getIntExtra(Constant.CORRECT_ANSWERS,0)
        val totalQuestion=intent.getIntExtra(Constant.TOTAL_QUESTIONS,0)

        resultName.text=intent.getStringExtra(Constant.USER_NAME)
        scoreCard.text=intent.getStringExtra(Constant.USER_NAME)

        scoreCard.text="Your Score is ${correctAnswer} out of ${totalQuestion}"
        btnFinish.setOnClickListener{
            if(btnFinish.text =="FINISH"){
                val intent=Intent(this,Result::class.java)
                startActivity(intent)
                finish()
            }
        }
        finishButton.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }


    }
}