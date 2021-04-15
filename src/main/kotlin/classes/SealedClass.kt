package classes

open class SealedClass(val name:String) {// sealed class need to be open to inherit

    class Subclass(val age : Int) : SealedClass("Akshay")
}