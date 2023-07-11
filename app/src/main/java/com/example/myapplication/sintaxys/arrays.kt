package com.example.myapplication.sintaxys

fun main(){


var listas=arrayOf("Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto",
                    "Setiembre","Octubre","Noviembre","Diciembre");

    //println(listas[1])
    //println(listas.size)

    if (listas.size >= 13) {
        //println(listas)
        }else{
          //  println("no hay")
        }

    for (contar in listas){
       // println(contar);
    }
    for ((contar, value) in listas.withIndex()){
        println("en la posicion $contar se encuentra $value")
    }

}