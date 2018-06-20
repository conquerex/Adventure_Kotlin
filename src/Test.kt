
fun main(args: Array<String>) {
    /*showKotiln()
    testBasicTypes()
    iterater10()
    showForEach()
    showForEach2()*/
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
    boolean은 else가 없어도
    range or collection 사용 가능
    스마트 캐스트
 */

fun iterater10() {

    loop@ for (i in 1..10) {
        println("---- i: $i ---")

        for (j in 1..10) {
            println("----- j: $j ---")
            if (i+j > 12) {
                break@loop
            }
        }
    }
}

fun showForEach() {
    var ints = listOf(0,1,2,3)
    ints.forEach label@{
        if (it == 1) return@label
        print(it)
    }
    println("End")
}

fun showForEach2() {
    var ints = listOf(0,1,2,3)
    ints.forEach {
        if (it == 1) return@forEach
        print(it)
    }
    println("End")
}