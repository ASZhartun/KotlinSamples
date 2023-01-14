package functions

// Actually it seems like class Person constructor()
// But constructor() without params, and you may remove "constructor" and "()"

class Person(val firstName: String, val lastName: String) {
    init {
        println("init one")
    }

    constructor() : this("Peter", "Parker") {
        println("secondary constructor")
    }

    init {
        println("init two")
    }

    //    Second way to init props
//    val firstName: String = _firstName
//    val lastName: String = _lastName

//    First way to init our fields'
//    init {
//        firstName = _firstName
//        lastName = _lastName
//    }
}