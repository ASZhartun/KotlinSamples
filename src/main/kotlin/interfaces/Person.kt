package interfaces

class Person(private val firstName: String = "John", private val lastName: String = "Doe") {
    var nickName: String? = null
        get() {
            return field?: "noname"
        }

    override fun toString(): String {
        return "$firstName *$nickName* $lastName"
    }
}