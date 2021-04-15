package collections

class Maps {
}
val passedStudents: MutableMap<Int,String> = mutableMapOf();
fun main() {
    passedStudents.put(1, "akshay");
    passedStudents.put(2, "sanjay")

    println(passedStudents)
    println(passedStudents.keys)
    println(passedStudents.values.filter { x-> x.startsWith("a") })


}