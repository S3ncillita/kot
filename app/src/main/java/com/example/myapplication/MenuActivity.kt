package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.example.myapplication.firstapp.FirstActivity
import com.example.myapplication.imccalculador.imcCalculatorActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludar = findViewById<AppCompatButton>(R.id.btnSaludar)
        val btnIMCapp = findViewById<AppCompatButton>(R.id.btnIMCapp)
        btnSaludar.setOnClickListener { navigateSaludar() }
        btnIMCapp.setOnClickListener { navigateToImcApp() }
    }

    private fun navigateToImcApp() {
        val intent = Intent(this, imcCalculatorActivity::class.java)
        startActivity(intent)
    }


    private fun navigateSaludar(){
        val intent = Intent(this,FirstActivity::class.java)
        startActivity(intent)
    }
}