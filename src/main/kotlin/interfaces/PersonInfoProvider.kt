package interfaces

interface PersonInfoProvider {
    val version : String
    fun printInfo(person: Person) {
        println("Default provider notification")
        println(version)
        println(person.toString())
    }
    fun getPersonSignature(person: Person): String
}