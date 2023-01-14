package functions

fun main() {
    println(getGreetings())
    sayHello()
    println(getSingleExpressionGreetings())

    sayHello("Mister Cat")
    sayHello("Mister Dog", "Hey-hey")
}

/**
 * Function without params and return String
 */
fun getGreetings() : String {
    return "Hello, Tolyan"
}
/**
 * Function without params and return String or null with question mark in signature.
 */
fun getGreetingOrNull() : String? {
    return null
}

/**
 * Single line expression function
 * You may remove Type (: String)
 */
fun getSingleExpressionGreetings() : String = "Hello, Single line expression"

/**
 * Function without return statement.
 * You may remove return Type (Unit).
 */
fun sayHello() : Unit {
    println("${getGreetings()}  from the void")
}

/**
 * Function wit parameter.
 */
fun sayHello(greetItem: String) = println("Hello, $greetItem")

fun sayHello(greetItem: String, greetings: String) = println("$greetings, $greetItem")

class Functions {
}