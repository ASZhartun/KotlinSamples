package advancedFunctions

// High-order, what and how
fun printFilteredStrings(list: List<String>, predicate: ((String) -> Boolean)?) {
    list.forEach {
        if (predicate?.invoke(it) == true) println(it)
    }
}

val predicate: (String) -> Boolean = {
    it.startsWith("J")
}

fun getPredicateFunction(): (String) -> Boolean {
    return { it.startsWith("J") }
}

fun main() {
    val list = listOf<String>("Java", "JS", "C++", "C#")
    printFilteredStrings(list, getPredicateFunction())
//    printFilteredStrings(list, predicate)
//    printFilteredStrings(list) { it.startsWith("J") }
    printFilteredStrings(list, null)
}

class HighOrderFunction {
}