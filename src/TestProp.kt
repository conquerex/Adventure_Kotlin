const val MY_CONST = "CONST"

@Deprecated(MY_CONST)
fun main(args: Array<String>) {
    var obj = Address()
    println("------ "+obj.name)
}

class Address {
    var name: String = "Kotlin"
        get() {
            return field + "!!!"
        }
        set(value) { field = value }

    val temp = 1 // Setter 없음
        get() = field + 1 // custom accessors (getter, setter)

    lateinit var data: String

    fun setUp() {
        data = "나중에"
    }
}

