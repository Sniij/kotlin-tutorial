package main.kotlin.`var`


fun variable(){
    // def can
    var name = "John"
    val birthYear = 1975
    println(name)
    println(birthYear)

    // 변수는 미리 데이터 타입을 정의해놓고 대입하거나 값을 넣음과 동시에 선언하지 않으면 사용 못함
    // var name
    // name = "John"
    // 이렇게 사용 못함
    // 아래처럼은 가능
    // var name: String
    // name = "John"



}


fun dataType(){
    val myNum = 5             // Int
    val myDoubleNum = 5.99    // Double
    val myLetter = 'D'        // Char
    val myBoolean = true      // Boolean
    val myText = "Hello"      // String

}

fun dataType2(){
    val myNum: Int = 5                // Int
    val myDoubleNum: Double = 5.99    // Double
    val myLetter: Char = 'D'          // Char
    val myBoolean: Boolean = true     // Boolean
    val myText: String = "Hello"      // String
}

fun main(args: Array<String>){

}