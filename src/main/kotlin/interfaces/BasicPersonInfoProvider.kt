package interfaces

class BasicPersonInfoProvider : PersonInfoProvider, SessionInfoProvider {
    override val version: String
        get() = "Basic 1.0"
    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Request was completed by basic provider method")
    }

    override fun getPersonSignature(person: Person): String {
        return person.toString()
    }

    override fun getSessionId(): String {
        return "SessionID: SOME"
    }

}