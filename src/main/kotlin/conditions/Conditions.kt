package conditions

var greetings: String? = null;
var name = "Tolyan"

fun main() {
    /**
     * If-else section
     */
//    greetings = "My lord!"
    if (greetings != null) {
        println(greetings)
    } else {
        println("Hey!")
    }
    println(name)
    println()

    /**
     * When-section
     */
    greetings = "Zdarova"
    when (greetings) {
        null -> println("Hello")
        else -> println(greetings)
    }
    println(name)
    println()

    /**
     * Inline assignment with condition expression - section
     */
    greetings = null
    val greetingToPrint = if (greetings != null) greetings else "Nu privet"
    println(greetingToPrint)
    println(name)
    println()

    greetings = "Bonjourno!"
    val greetingToPrintWithWhenCondition = when (greetings) {
        null -> "Privet-privet"
        else -> greetings
    }
    println(greetingToPrintWithWhenCondition)
    println(name)
    println()
}

class Conditions {
}