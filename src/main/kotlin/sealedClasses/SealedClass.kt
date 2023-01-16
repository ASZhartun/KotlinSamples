package sealedClasses

import java.util.*

enum class EnumEntityType {
    HELP, EASY, MEDIUM, HARD;

    fun getFormattedName() = name.lowercase().replaceFirstChar(fun(char: Char): String {
        return if (char.isLowerCase()) char.titlecase() else char.toString()
    })
}

object EntityFactory {
    fun create(type: EnumEntityType): SealedClass {
        val id = UUID.randomUUID().toString()
        val name = type.getFormattedName()
        return when (type) {
            EnumEntityType.EASY -> SealedClass.Easy(id, name)
            EnumEntityType.MEDIUM -> SealedClass.Medium(id, name)
            EnumEntityType.HARD -> SealedClass.Hard(id, name, 4.0f)
            EnumEntityType.HELP -> SealedClass.Help
        }
    }
}

sealed class SealedClass {
    object Help : SealedClass() {
        val id = "0"
        val name = "HELP"

        override fun toString(): String {
            return "ID: $id, name: $name"
        }
    }

    data class Easy(val id: String, val name: String) : SealedClass()
    data class Medium(val id: String, val name: String) : SealedClass()
    data class Hard(val id: String, val name: String, val multiplier: Float) : SealedClass()
}

fun main() {
    val enumEntity = EntityFactory.create(EnumEntityType.HELP)
    println(enumEntity.toString())

    val msg = when (enumEntity) {
        is SealedClass.Easy -> "Easy class"
        is SealedClass.Hard -> "Hard class"
        SealedClass.Help -> "Help class"
        is SealedClass.Medium -> "Medium class"
    }
    println(msg)
}