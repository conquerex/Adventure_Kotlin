fun main(args: Array<String>) {
    val obj = Customer("코틀린")
    println("------ "+obj.name)
}

class Customer(var name: String) {
    // class TestClass constructor(first: String)
    /*init {
        println("Name : $name")
    }*/
}

class Person {
    constructor(parent: Person) {
//        parent.children.add(this)
    }
}
