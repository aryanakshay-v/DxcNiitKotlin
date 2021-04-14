package Basics

class Ranges {
}

fun main() {
    val x=2;
    //al y = 7;
    for (x in 10  downTo 1 step 3) println(x)
    switch(2)
    switch(54)
    switch(1000)
    switch(100000)

    /*if ( x in 3..y){
        println("x is in the range ")
    }
    else {
        println("not in the ranger")
    }*/

    // write a function with switch case
    //let that function accept a value print
    //if the given number is in the range 1 to 10 print its 10
    //if it between 111 to 99  print its 100's
    //if the given number is i between 999 an 9999 then print is in 1000s
}

fun switch(a: Int) {
    return when(a)
    {
        in  1..100 ->
            println("in 10's")
        in 101..999->
            print("in 100's")
        in 999..9999 ->
            println("in 1000's")
        else -> println("out of range")
    }

}
