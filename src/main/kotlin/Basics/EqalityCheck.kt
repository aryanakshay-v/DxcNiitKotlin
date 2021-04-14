package Basics

class EqalityCheck {
}

fun main() {
    val listAuthors = setOf<String>("author1","author2")
    val listWriters = setOf<String>("author2","author1")

    println(listAuthors == listWriters)
    println(listAuthors === listWriters)
}