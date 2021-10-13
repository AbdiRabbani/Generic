package com.example.generic.basicGeneric

class Building1(val data : Any)

fun main() {
    val dataString = Building1("Pertamina")
    val valueString : String = dataString.data as String

    val dataInt = Building1(10)
    val valueInt : Int = dataInt.data as Int
}