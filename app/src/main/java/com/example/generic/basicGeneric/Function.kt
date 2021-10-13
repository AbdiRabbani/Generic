package com.example.generic.basicGeneric

class Function(val nama : String) {  //bisa langsung masukkan nama agar menjadi deafult value

    fun <T> sayHello(parameter : T){
        println("Hello $parameter, my name is $nama")
    }
}

fun main() {
    val nama = Function("abdi")

    nama.sayHello("yuuki")
    nama.sayHello<Int>(10) //Untuk ubah si parameter menjadi Int, String, dll
}