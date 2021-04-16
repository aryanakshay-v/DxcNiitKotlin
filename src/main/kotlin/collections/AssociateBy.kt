package collections

class AssociateBy {
}
data class Person(val name: String, val city: String, val phone: Int)

val people = listOf<Person>(
    Person("akshay","Tirupati",517501),

    Person("Sanjay","bangalore",517502),

    Person("Aryan","Chitoor",12345),

    Person("Subbu","Nellor",67536))

fun main() {
    val phoneBook = people.associateBy { it.city }
    println(phoneBook)
}