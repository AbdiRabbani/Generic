package com.example.generic.basicGeneric

/*Covariant artinya kita melakukan subtitusi subtype(child) dengan supertype(parent)
tidak semua jenis class generic yang mendukung covariant, hanya class generic yang menggunakan
generic parameter type sebagai return type function
untuk kata kuncinya*/


class Covariant<out T>(val data : T) {
    fun data() : T{
        return data
    }
}

fun main() {
    val data1 : Covariant<String> = Covariant("abdi")
    val data2 : Covariant<Int> = Covariant(10)

}