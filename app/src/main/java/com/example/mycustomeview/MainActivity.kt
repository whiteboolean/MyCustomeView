package com.example.mycustomeview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

     var age:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>( R.id.button).setOnClickListener {
            age++
            Toast.makeText(this,"我是大俊哥,今年${age}岁",Toast.LENGTH_LONG).show()
        }



    }
}