package main.kotlin.`var`

fun main(args: Array<String>){
    forLoop()
}

fun forLoop(){
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    for (x in cars) {
        println(x)
    }
}