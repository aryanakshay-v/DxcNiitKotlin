package classes

class Company {
    var news: String = "company is launching"
    companion object  Media{
        fun broadcastNews(){
            println("company news")
        }
    }
}
fun main(){
    Company.broadcastNews()
}