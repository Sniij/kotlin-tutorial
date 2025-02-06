package main.kotlin.`var`

import java.util.*

fun main(){
    var txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    println(txt[0]) // first element (A)
    println(txt[2]) // third element (C)
    println("The length of the txt string is: " + txt.length)
    println(txt.lowercase(Locale.getDefault()))   // Outputs "abcdeghi..."

    var txt1 = "Hello World"
    var txt2 = "Hello World"
    println(txt1.compareTo(txt2))  // Outputs 0 (they are equal)

    var txtIndex = "Please locate where 'locate' occurs!"
    println(txtIndex.indexOf("locate"))  // Outputs 7


    var firstName = "John"
    var lastName = "Doe"
    println("My name is $firstName $lastName")
}

