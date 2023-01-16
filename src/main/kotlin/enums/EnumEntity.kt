package enums

import java.util.*

enum class EnumEntityType {
    EASY, MEDIUM, HARD;

    fun getFormattedName() = name.lowercase().replaceFirstChar(fun(char: Char): String {
        return if (char.isLowerCase()) char.titlecase() else char.toString()
    })
}

object EntityFactory {
    fun create(type: EnumEntityType): EnumEntity {
        val id = UUID.randomUUID().toString()
        val name = type.getFormattedName()
        return EnumEntity(id, name)
    }
}

class EnumEntity(val id: String, val name: String) {
    override fun toString(): String {
        return "ID: $id; name: $name"
    }
}

fun main() {
    val enumEntity = EntityFactory.create(EnumEntityType.HARD)
    println(enumEntity.toString())
}