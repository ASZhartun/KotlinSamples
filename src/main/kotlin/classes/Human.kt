package classes

class Human(val firstName: String = "John", val lastName: String = "Doe") {
    var nickName: String? = null
    get() {
        return field?: "noname"
    }

    override fun toString(): String {
        return "$firstName *$nickName* $lastName"
    }
}