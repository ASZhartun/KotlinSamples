package advancedFunctions

fun main() {
    val list = listOf("Java", "JS", "C++", "C#", null, null)
    val map = list.filterNotNull()
//        .filter {
//            it.startsWith("J")
//        }
//        .map {
//            it.length
//        }
//        .takeLast(3)
        .associate { it to it.length }
//        .forEach {
//            println("${it.key} : ${it.value}")
//        }
    val lang = list.filterNotNull().find{
        it.contains("x")
    }.orEmpty()
    println(lang)
}

class NewMain {
}