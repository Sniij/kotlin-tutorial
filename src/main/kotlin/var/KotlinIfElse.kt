package main.kotlin.`var`

fun ifElseExpressions(){
    val time = 20
    val greeting = if (time < 18) {
        "Good day."
    } else {
        "Good evening."
    }
    println(greeting)
}

fun ifElseExpressions2(){
    val time = 20
    val greeting = if (time < 18) "Good day." else "Good evening."
    println(greeting)
}

fun main() {
    ifElseExpressions()
    ifElseExpressions2()
}