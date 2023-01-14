package variables

var lines: String = "some outside string for example"

fun main() {
    println("Hello from vars")
    val name: String = "Tolyan"
    var name2: String = "Empty"
    name2 = "Cat"
    println("$name is there")
    println("$name2 is here")
    println()
    println("\"$lines\" was typed")
    println()
    println("But let's change some var")
    lines = "new text in main scope"
    println()
    println("\"$lines\" was typed")

    var notNullProb: String? = null
    println("Here is not null var : $notNullProb")

    // But we can remove type and kotlin inferred what type is it

    var withoutType = "String without type"

    // We can't assign null, and we might to declare type with question mark
//    var withoutTypeButWithNull  = "Hello"
//    withoutTypeButWithNull = null // is broken variant

    var withoutTypeButWithNull: String? = "Hello" // legal variant
    withoutTypeButWithNull = null
}

class Variables {

}