package interfaces

import inheritance.FancyInfoProvider

fun main() {
    val provider = FancyInfoProvider()
    val person = Person()
    person.nickName = "Greeder"
    provider.printInfo(person)
    println(provider.sessionPrefix)

    println()
    println(provider.getSessionId())
    println()
    println("---------------------")
    println("Type checking section")
    println("---------------------")
    println()
    checkTypeProvider(provider)

}

fun checkTypeProvider(infoProvider: PersonInfoProvider) {
    if (infoProvider is SessionInfoProvider) {
        println("$infoProvider is session info provider")
        println((infoProvider as SessionInfoProvider).getSessionId())
//        println(infoProvider.getSessionId()) // smart cast LOL
    } else {
        println("$infoProvider isn't session info provider")
    }
}

class Main {
}