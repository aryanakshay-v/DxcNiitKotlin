package classes

enum class Color(var rgb :Int) {
    RED(0xff0000),
    GREEN(0x00ff00),
    BLUE(0xff0000),
    YELLOW(0xffff00);
    fun containsRed() = (this.rgb and 0xff0000 !=0)
}
fun main(){
    val red = Color.RED
    println(red.containsRed())
    println(Color.BLUE.containsRed())
}