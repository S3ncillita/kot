package com.example.myapplication.sintaxys

fun main(){
    meses(15);

}
fun getmonths(month:Int) {
    when (month) {
        in 1..10 -> print("Enero")
        else -> print("no existe")
    }

}
fun meses(month:Int):String{
    return when(month){
        in 1..6 -> "primer mes"
        else -> "semestre no valido"
    }

}