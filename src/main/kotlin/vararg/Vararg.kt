package vararg

import conditions.greetings

fun sayHello(greetings: String, vararg items: String) {
    items.forEach { item ->
        println("$greetings, $item")
    }
}

fun greetPerson(greeting: String = "Zdarova", person: String = "Mister Cat") = println("$greeting, $person")

fun main() {
    val myArray = arrayOf("Kotlin", "Java", "XML")

    sayHello("Hey", "C++", "C#", "Java", "C")
    println("\nSpread operator")
    sayHello("Hello", *myArray)
    // But actually next statement works LOL
    // you may remove items its redundant
    sayHello(greetings = "Zdarova", items = *myArray)
    sayHello(greetings = "Zdarova", *myArray)
    // you may remove "*" its redundant
    sayHello(items = *myArray, greetings = "Zdarova")
    sayHello(items = myArray, greetings = "Zdarova")

    println("\nExplicit params")
    greetPerson(person = "Tolyan", greeting = "Hey")
    greetPerson(person = "Hey", greeting = "Tolyan")
    greetPerson(person = "Tolyan")
    greetPerson()
}

class Vararg {
}