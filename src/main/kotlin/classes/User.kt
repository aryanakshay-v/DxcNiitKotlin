package classes

class User(var name: String, val id:Int) {
}

fun main() {
    val user= User("aryan", 1)
    val secondUser = User("akshay",1)

    println(user)
    println(user.name)
    //user.name = "hello"
    println(user.name)
    println(user==secondUser)
    println(user.hashCode())
    println(secondUser.hashCode())

}

