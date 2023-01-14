package collections

fun main() {
    val myArray = arrayOf("Kotlin", "Java", "XML")
    println(myArray.size)
    println(myArray[1])
    println(myArray.get(2)) //redundant
    println()

    println("Let's iterate")
    for (item in myArray) {
        println(item)
    }
    println("Iteration is done \n")

    println("Let's iterate by indices")
    for (item in myArray.indices) {
        println(myArray[item])
    }
    println("Iteration is done \n")

    println("Let's iterate by foreach")
    myArray.forEach { item ->
        println(item)
    }
    println("Iteration is done \n")

    println("Let's iterate by foreach with index data")
    myArray.forEachIndexed() { i, item ->
        if (item.length < 4) {
            println("$item\t\t at index:\t $i")
        } else {
            println("$item\t at index:\t $i")
        }
    }
    println("Iteration is done \n")
}

class Collections {
}