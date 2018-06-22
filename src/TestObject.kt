import java.util.*

class MyRunnable : Runnable {
    override fun run() {
        println("------ Running")
    }
}

class MyClass {
    fun publicFun() = object {
        var x = 12
    }

    private fun privateFun() = object {
        var x = 45
    }

    fun print() {
//        println(publicFun().x) // Error
        println(privateFun().x)
    }
}

object YourClass1 {
    init {
        println("* * * * Your class 1")
    }
}

object YourClass2 {
    init {
        println("* * * * Your class 2")
    }
}

object YourClass3 {
    init {
        println("* * * * Your class 3")
    }
}

fun main(args: Array<String>) {
//    val t = Thread(MyRunnable())
//    t.run()
    val t = Thread(object : Runnable {
        override fun run() {
            println("------ Running2")
        }
    })
    t.run()

    val data = object {
        var x = 1
        var y = 3
    }

    println("------ ${data.x}, ${data.y}")
    MyClass().print()

    /**
     * 이렇게는 사용 불가
    var a = object Counter {
        var count = 0
    }
    */

    CounterManager.count++
    CounterManager.count++
    println(CounterManager.count)

    // Singleton Test
    println(1)
    println(YourClass1)
    println(YourClass1)
    println(YourClass1)
    println(2)
    println(YourClass2)
    println(YourClass2)
    println(YourClass2)
    println(3)
    println(YourClass3)
    println(4)

}

object CounterManager {
    var count = 0
}