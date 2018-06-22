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
}