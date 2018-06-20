
fun main(args: Array<String>) {
    showKotiln()
    testBasicTypes()
}

fun showKotiln(): Unit {
    println("""
        * * * * kotlin test
        * * * * My test
        """)
}

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }
    return null
}

fun testBasicTypes() {
    var a: Int = 1000
    var b: Int? = 1000 // Nullable
    println("a === b: ${a === b}")
    println("a == b: ${a == b}")
}

/*
    삼항연산자는 없다
    val max = if(a>b) a else b

    when : Switch case문
    boolean은 else가 없어도 됨
 */