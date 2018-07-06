open class Human : ICar{
    override fun vibration(wave: String) {
        if(wave == "덜덜덜") {
            println(wave+"이라니... 진동이 심하군.")
        }
    }

    open val country : String = "한국"
    open val gender : String = "Male"
    open val name : String = "Jongkook"

    fun printHumanInfo() {
        println("난 $country 에서 태어난 $gender 인 $name 입니다.")
    }
}

class American : Human() {
    override val country : String = "미국"
    override val name : String = "Barley"
}

interface ICar {
    fun vibration(wave : String)
}

class Car {
    var touch : ICar? = null
    fun runStrat() {
        touch?.vibration("덜덜덜")
    }
}

data class Student (
        var grade : Int,
        var name : String,
        var gender : String,
        var birthday : String
)

fun main(args: Array<String>) {
    println("---------------")

    var h1 = Human()
    var car = Car();
    car.touch = h1

    car.runStrat()
    h1.printHumanInfo()
    var h2 = American()
    h2.printHumanInfo()

    println("---------------")

    var barley = Student(1,"Barley","Male", "1999-11-11")
    var barley2 = barley.copy()
    barley2.grade = 3
    println(barley.toString())
    println(barley2)
    println(barley2.hashCode())
}