package interfaces

fun main() {
    val provider = BasicPersonInfoProvider()
    val person = Person()
    person.nickName = "Greeder"
    provider.printInfo(person)
    println(provider.getPersonSignature(Person("Tolyan", "Zhartun")))
}
class Main {
}