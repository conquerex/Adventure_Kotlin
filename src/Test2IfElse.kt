fun main(args: Array<String>) {

    println("---------")

    var x = 7
    var y = 3

    if (x > y) {
        println("x가 더 큼")
    } else {
        println("y가 더 큼")
    }

    println("---------")

    when(x) {
        1 -> println("x는 1")
        7 -> println("x는 7")
        else -> {
            println("모르겠음")
        }
    }

    println("---------")

    for (x in 1..10 step 2) {
        println(x)
    }

    var intArray = arrayOf(1, 11, 111)
    for (item in intArray) {
        println(item)
    }

    println("---------")

    while (y < 6) {
        y = y + 1
        println(y)
    }

    println("---------")

    println(addFour(4))

    println("---------")

    var dog : String? = null
    var cat : String? = "Mew"

//    println(dog!!)
    println(cat!!)
    println(dog)
    println(cat)
    println(dog?.length)
    println(cat?.length)

    var man : String
    var name : String? = "Jongkook"

    man = name!!

    println(man)
}

fun addFour(input : Int):Int {
    var total = input + 4
    return total
}