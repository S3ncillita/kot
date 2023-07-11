package com.example.myapplication.sintaxys

fun main(){
    inmutables()
}

fun inmutables(){
    val readonly:List<String> = listOf("Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto",
        "Setiembre","Octubre","Noviembre","Diciembre");

    //println(readonly.size)
    //println(readonly.first())
    println(readonly.last())

    //filtar
    val example = readonly.filter { it.contains("e") }
    //println(example)
}


