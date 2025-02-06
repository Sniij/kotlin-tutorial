package main.kotlin.`var`

fun main(args: Array<String>){
    array()
    array2()
    arrayLen()
}

fun array(){
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    println(cars[0])
// Outputs Volvo
}

fun array2(){
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    cars[0] = "Opel"
    println(cars[0])
// Now outputs Opel instead of Volvo
}

fun arrayLen(){
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    println(cars.size)
// Outputs 4
}