package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.example.myapplication.firstapp.FirstActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludar = findViewById<AppCompatButton>(R.id.btnSaludar)
        btnSaludar.setOnClickListener { navigateSaludar() }
    }
    private fun navigateSaludar(){
        val intent = Intent(this,FirstActivity::class.java)
        startActivity(intent)
    }
}