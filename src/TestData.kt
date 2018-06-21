fun main(args: Array<String>) {
    var obj = User("Kotlin", 123)
    println(obj)
    // Copy
    println(obj.copy("MyName"))
    println(obj.copy(age = 999))

    var obj2 = NoData("Kotlin", 123)
    println(obj2)

    println(User2(age = 555))

    val(name, age) = User("YourName", 456)
    println("$name, $age")

    // val obj3 = Pair<String, Int>("Hello", 789)
    val obj3 = Pair("Hello", 789)
    println(obj3)

}

data class User(var name: String, var age: Int)
data class User2(var name: String = "Test!!!", var age: Int = 222)
class NoData(var name: String, var age: Int)