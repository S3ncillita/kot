package com.example.myapplication.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.example.myapplication.R

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val btnclick = findViewById<AppCompatButton>(R.id.btnclick)
        val etName = findViewById<AppCompatEditText>(R.id.etName)
        btnclick.setOnClickListener {val name=etName.text.toString()
            if (name.isNotEmpty()){
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("nombre",name)
                startActivity(intent)

            }


        }
    }
}