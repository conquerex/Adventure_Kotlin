fun main(args: Array<String>) {
    var a = 1
    a = 2

    println("-------------")
    println(a)

    println("-------------")

    var num1 : Byte = 127
    var num2 : Short = 32767
    var num3 : Int = 21_0000_0000
    var num4 : Long = 22_0000_0000
    var num5 : Float = 3.122222f
    var num6 : Double = 3.1233333333333

    println(num1)
    println(num2)
    println(num3)
    println(num4)
    println(num5)
    println(num6)

    println("-------------")

    var num11 = 127
    var num12 = 32767
    var num13 = 21_0000_0000
    var num14 = 22_0000_0000
    var num15 = 3.122222f
    var num16 = 3.1233333333333

    println(num11.javaClass.name)
    println(num12.javaClass.name)
    println(num13.javaClass.name)
    println(num14.javaClass.name)
    println(num15.javaClass.name)
    println(num16.javaClass.name)

    println("-------------")

    var b : Char = 'B'
    var c : Boolean = true
    var d : String = "asdfasdf"

    println(b)
    println(c)
    println(d)

    var bb = 'B'
    var cc = true
    var dd = "asdfasdf"

    println(bb.javaClass.name)
    println(cc.javaClass.name)
    println(dd.javaClass.name)

    println("-------------")

    var intArr : Array<Int> = arrayOf(1,2,4,5)
    var charArr : Array<Char> = arrayOf('d','f')
    var stringArr : Array<String> = arrayOf("aaaa","dddd")
    var boolArr : Array<Boolean> = arrayOf(false, true, false)

    println(intArr.toList())
    println(charArr.toList())
    println(stringArr.toList())
    println(boolArr.toList())

    println("-------------")

    var x = 1
    var y = 11
    println(x in 1..10)
    println(y !in 1..10)
}