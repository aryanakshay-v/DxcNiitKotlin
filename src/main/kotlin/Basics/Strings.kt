package Basics

class Strings {
}

fun main() {
    var a = 1;
    var name = "akshay $a"
    var age = 123;
    var sentence = "${name.replace("akshay", "aryan akshay")}"
    //println(sentence)

    println(maxofNumbers(520, 60))
    println(minOfNumbers(20, 30))

    val items = listOf("aryan", "akshay", "verdu")
    var index = 0
    while (index < items.size) {
        println("${items[index]} is at  $index")
        index++
    }

    /* for(item in items){
        println(item)
    }

    for(index in items.indices){
        println("${items[index]} is at  $index")
    }*/

}
fun maxofNumbers(a:Int , b :Int): Int {
    if(a>b) return a
    else return b
}
fun minOfNumbers(a:Int , b: Int): Int{
    //if a<b return a
    if(a<b) return a
    else return b
}