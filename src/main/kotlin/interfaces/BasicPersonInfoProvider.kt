package interfaces

open class BasicPersonInfoProvider : PersonInfoProvider, SessionInfoProvider {
    open val sessionPrefix : String = "SessionID: SOME" // "open" for inheritance opportunity
    override val version: String // not open for children cause its interface field
        get() = "Basic 1.0"
    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Request was completed by basic provider method")
    }

    override fun getPersonSignature(person: Person): String {
        return person.toString()
    }

    override fun getSessionId(): String {
        return sessionPrefix
    }

}