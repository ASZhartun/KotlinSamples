package functions

class ActPerson(val firstName: String = "Ibragim", val lastName: String = "Naturmort") {

    var nickname: String? = null
        set(value) {
            field = value?.uppercase()
        }
        get() {
            println("Requested field is nickname and values is $field")
            return field
        }

    fun printInfo() {
        this.nickname
//        val nickForPrint = if (nickname != null) " $nickname" else "out nickname"
        val nickForPrint = nickname?:"out nickname"
        println("This is ${this.firstName} ${this.lastName} with$nickForPrint")
    }
}