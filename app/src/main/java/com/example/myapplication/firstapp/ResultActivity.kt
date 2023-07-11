package com.example.myapplication.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.myapplication.R

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val tvresult= findViewById<TextView>(R.id.tvresult)
        val  name:String = intent.extras?.getString("nombre").orEmpty()
        tvresult.text="Hola $name"
    }
}