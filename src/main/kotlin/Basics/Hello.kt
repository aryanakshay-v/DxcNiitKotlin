package Basics

class Shape (var height: Int, width:Int){
    var perimiter = 2* (height + width)
}
fun main(){
    var rectangle = Shape(height = 5,width = 6)
    println("perimeter of rectangle os ${rectangle.perimiter}")

    println("hello world")

    var a : Int =10;
    var b =20;//compiler will know that it is int type
    //var d ; // type is required
    var c=add(5,6)
    println(c)
}

fun add(a : Int, b : Int): Int {
    return a+b
}