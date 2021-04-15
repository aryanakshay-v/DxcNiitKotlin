package functions

class HigherOrder {
}

fun mul(x: Int, y:Int):Int {
    return x * y
}

    fun sum(x: Int, y: Int)=x+y

    fun funWhichReturnsAnotherFun(): (Int) ->Int{
    return::square
}
fun square(x:Int) = x*x

    fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
        return operation(x, y)
    }

    fun main() {
        val func = funWhichReturnsAnotherFun()
        println(func(5))
        val resultSum = calculate(10, 20, ::sum)
        val resultAdd = calculate(20, 30, ::mul)
        println(resultSum)
        print(resultAdd)
    }