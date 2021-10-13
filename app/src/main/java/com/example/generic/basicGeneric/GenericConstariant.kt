package com.example.generic.basicGeneric

/*
Terkadang kita igin membatasi data yang boleh di gunakan di generic parameter type
kita bisa menambahkan constraint di generic parameter type dengan menyebutkan type yang
diperbolehkan secara otomatis, type data yang bisa digunakan adalah type yang sudah kita
sebutkan secara deafult constraint type untuk generic parameter type adalah Any,  sehingga
semua tipe data bisa di gunakan
*/

open class Employee

class Manager : Employee()

class VicePresident : Employee()

class Company<T : Employee>(val employe : T)

fun main() {
    val data1 = Company(Manager())
    val dat2 = Company(VicePresident())
}