fun main(args: Array<String>) {
    val obj = Customer("코틀린")
    println("------ "+obj.name)
    val obj2 = BB(10)
    obj2.f()
}

class Customer(var name: String) {
    // class TestClass constructor(first: String)
    /*init {
        println("Name : $name")
    }*/
}

class Person: Any {
    constructor(parent: Person) {
//        parent.children.add(this)
    }
}

// open : final 반대
open class AA(x: Int) {
    open fun f() {
        println("AAAA")
    }
}

class BB(x: Int) : AA(x), CC {
    override fun f() {
        super<AA>.f()
        super<CC>.f()
    }
}

interface CC {
    fun f() { println("CCCC") }
    fun b() { }
}