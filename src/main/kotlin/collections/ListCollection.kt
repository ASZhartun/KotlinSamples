package collections

fun sayHello(greetings: String, items: List<String>) {
    items.forEach { item ->
        println("$greetings, $item")
    }
}

fun main() {
    val myArray = listOf("Kotlin", "Java", "XML")

    myArray.forEach { item -> println(item) }

    val map = mapOf(1 to "a", 2 to "b", 3 to "c")

    map.forEach { (key, value) -> println("$key has $value") }

    val plus = map.plus(4 to "d")
    plus.forEach { (key, value) -> println("$key has $value") }

    println()

    val newArray = mutableListOf("Kotlin", "Java", "XML")
    newArray.add(2, "C#")
    newArray.forEach {
        item -> println(item)
    }

    println()

    val newMutableMap = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
    newMutableMap[67] = "z"
    newMutableMap.forEach {
            item -> println(item)
    }
    println()
    println("SayHello function demonstration:")
    sayHello("Privet", myArray)
}

class ListCollection {
}