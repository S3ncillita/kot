package com.example.myapplication.example

fun main(){
    val morningNotification = 51;
    val eveningNotification = 135;

   // printNotificationSummary(morningNotification);
    printNotificationSummary(eveningNotification);
}
fun printNotificationSummary(numberOFMessages:Int){

    if (numberOFMessages >= 99 ){
        println("tienes  $numberOFMessages notificaciones")
    }else{
            println("tienes   $numberOFMessages notificacion")
    }

}