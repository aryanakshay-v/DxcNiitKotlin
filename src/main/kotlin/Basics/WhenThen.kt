package Basics

class WhenThen {
}

fun main() {
    println(describe(1))
    print("hello")

}
fun describe( obj: Any):String{
    return when (obj){
        1-> "one"
        "Hello" -> "greetings"
        is Long -> "long no"
        !is String -> "It is nmot string"
        else -> "unkown"
    }
}