package objectExpressions

import interfaces.BasicPersonInfoProvider
import interfaces.Person
import interfaces.PersonInfoProvider

fun main() {
    val provider = object : PersonInfoProvider {
        override val version: String
            get() = "Person info provider object expression"

        override fun getPersonSignature(person: Person): String {
            return person.toString()
        }

        fun getSessionId(): String {
            return "SessionID: SOME"
        }
    }

    provider.printInfo(Person())
    println(provider.getSessionId())
}

class ObjectExpression {
}