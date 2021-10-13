package com.example.generic.basicGeneric

/*
Contravariant artinya kita bisa melakutan subtitusi suoertype dengan subtype
tidak semua jenis class generic yang mendukung contravariant, hanya class generic yang
menggunakan generic parameter function
*/



class Contravariant<in T> {

    fun sayHello(name : T){
        return println("Hello $name")
    }
}

fun main() {
    val data1 : Contravariant<Any> = Contravariant()
    val data2 : Contravariant<String> = data1


    data1.sayHello("bani")
}