package classes

fun rentPrice( normalday : Int, Festivaldays : Int) {
    val dayRates = object{
        var standard: Int = 30
        var festive : Int = 50
    }
    val total = dayRates.standard +dayRates.festive
    println("Total price = $total")
}
fun main(){
    rentPrice(12,15)
}
