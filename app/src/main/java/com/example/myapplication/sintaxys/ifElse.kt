package com.example.myapplication.sintaxys

fun main(){
    pruebaif();
}
fun ifBasico(){
    val name= "Rodrigo";

    if (name == "Pepe"){
        println("la variable es Rodrigo")
    }else{
        println("No es el mismo nombre")
    }

}
fun pruebaif(){
     val dog= "gato";

    val animals=true;
 // && yy se usa cuando se va a cumplir dos condiciones
    if(dog =="perro" ||(dog=="gato" && animals)){
        println(" es un perro o gato ")
    }

}