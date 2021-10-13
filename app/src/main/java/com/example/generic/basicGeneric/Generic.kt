package com.example.generic.basicGeneric

class Building2<T,U>(val data : T, val seccondData : U){
    fun printData(){
        return println("Data is $data  $seccondData")
    }
}

fun main() {

    val dataString = Building2("Pertamina", 10)

    //Bisa mengginalan <.., ..> untuk menspesifikasi data
    val dataInt = Building2<Int , String>(10, "PLN")

    val dataBoolean = Building2(true, 4.3)


    //untuk memanggil

    dataString.printData()
}