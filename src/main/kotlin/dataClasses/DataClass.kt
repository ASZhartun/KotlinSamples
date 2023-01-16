package dataClasses

import sealedClasses.SealedClass

fun main() {
    val id = "id"
    val name = "name"
    val enumEntity = SealedClass.Easy(id, name)
    println("hashcode of first: ${enumEntity.hashCode()}")
    val enumEntity2 = SealedClass.Easy(id, name)
    println("hashcode of second: ${enumEntity2.hashCode()}")
    println("equal?: ${enumEntity == enumEntity2}")
    if (enumEntity === enumEntity2) { // === equal by references(!) great 15 minutes :D
        println("equal")
    } else {
        println("not")
    }
}

class DataClass {
}