package com.example.generic.basicGeneric

/*secara deafult, saat kita membuat generic parameter type,
sifat parameter teersebut adalah invariant
invariant = tidak boleh subtitusi subtype(child) atau supertype(parent)*/


class Invariant<T> (val data : T)

//fun main() {
//    val data1 : Invariant<String> = Invariant("Abdi") /*kalau di kasih
//    Invariant sang data1 menjadi tidak bisa bervariasi*/
//    val data2 : Invariant<Any> = data1  /*akan merah karena saat mengambil
//    data1, data2 nya adalah Int*/
//}