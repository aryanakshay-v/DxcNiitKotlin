package classes

object  Auth{
    fun takeCredentials(name : String, password : String){
        println("login with $name and $password")
    }

    @JvmStatic
    fun main(args: Array<String>){
        Auth.takeCredentials("aryan","akshay")
    }
}