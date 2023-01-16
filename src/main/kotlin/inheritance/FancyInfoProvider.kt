package inheritance

import interfaces.BasicPersonInfoProvider
import interfaces.Person

class FancyInfoProvider : BasicPersonInfoProvider() {
    override val sessionPrefix: String
        get() = "Fancy SessionID: SOME"

    override val version: String
        get() = "Fancy 1.0"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Request was completed by fancy-fancy provider method")
    }
}