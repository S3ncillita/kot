package com.example.myapplication.imccalculador

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.core.view.KeyEventDispatcher.Component
import com.example.myapplication.R

class imcCalculatorActivity : AppCompatActivity() {
    private lateinit var viewMale:CardView
    private lateinit var viewFemale:CardView
    private  var isFemaleSelected = true
    private var isMaleSelected = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc_calculator)
        initComponents()
        initListeners()
    }

    private fun initComponents() {
      viewMale = findViewById(R.id.viewMale)
        viewFemale= findViewById(R.id.viewFemale)
    }
    private fun initListeners() {
        viewMale.setOnClickListener {
            changeGender()
            setGenderColor() }
        viewFemale.setOnClickListener {
            changeGender()
            setGenderColor()  }
    }

    private fun changeGender(){

        isMaleSelected =!isMaleSelected
        isFemaleSelected=!isFemaleSelected
    }
    private fun setGenderColor(){

        viewMale.setCardBackgroundColor(getBackgroundColor(isMaleSelected))

        viewFemale.setCardBackgroundColor(getBackgroundColor(isFemaleSelected))
    }



    private fun getBackgroundColor(isSelecteComponent:Boolean):Int {

        var colorReference = if (isSelecteComponent) {
            R.color.teal_200
        } else {
            R.color.black
        }
        return ContextCompat.getColor(this, colorReference)
    }
}