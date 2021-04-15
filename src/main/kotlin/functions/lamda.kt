package functions

class lamda {
}

fun main() {
    val name:String
    val upperCase1 :(String) ->String = {str: String ->str.toUpperCase()}
    val upperCase2 :(String) ->String ={str -> str.toUpperCase()}
    val uppercase3 ={str : String ->str.toUpperCase()}
    val uppercase4 : (String) -> String = {it.toUpperCase()}//when method has only one parameter
    println(upperCase1("hello"))
    println(upperCase2("hello"))
    println(uppercase3("hello"))
    println(uppercase4("hello"))

}