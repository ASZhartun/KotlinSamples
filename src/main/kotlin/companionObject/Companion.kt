package companionObject

interface IdGenerator {
    fun getId(): String
}

class Companion private constructor(private val id: String) {
    fun sayHello() = println("Hello from comp")

    fun getId() = id

    companion object CompanionFactory : IdGenerator {
        fun create(): Companion = Companion(getId())

        override fun getId(): String {
            return "ThisID"
        }
    }
}

fun main() {
//    val companion = Companion.CompanionFactory.create()
    // be able to remove CompanionFactory
    val companion = Companion.create()
    companion.sayHello()
    println(companion.getId()) // from obj
    println(Companion.getId()) // from companion obj of class
}