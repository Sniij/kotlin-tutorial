package main.kotlin.`var`

fun main(args: Array<String>){
    rangeAlpha()
    rangeNum()
    checkValue()
    checkValue2()
}

fun rangeAlpha(){
    for (chars in 'a'..'x') {
        println(chars)
    }
}

fun rangeNum(){
    for (nums in 5..15) {
        println(nums)
    }
}

fun checkValue(){
    val nums = arrayOf(2, 4, 6, 8)
    if (2 in nums) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }
}

fun checkValue2(){
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    if ("Volvo" in cars) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }
}