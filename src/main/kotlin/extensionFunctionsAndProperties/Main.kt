package extensionFunctionsAndProperties

import sealedClasses.SealedClass

fun main() {
    val easy = SealedClass.Easy("id", "hop-hop")
    easy.getInfo()
    easy.multiplier
    println("multiplier: ${easy.multiplier}")
}

fun SealedClass.Easy.getInfo(): String {
    println("id: $id")
    return id
}

val SealedClass.Easy.multiplier: Float // Extended somewhere and get somewhere
    get() { // Must have VAL
        return 4.0f
    }

class Main {
}