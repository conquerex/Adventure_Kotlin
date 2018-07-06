
data class StudentData (
        var name : String,
        var subject : Subject
){
    data class Subject(
            var math : Int,
            var english : Int
    )
}


class Student2 {
    var name : String? = null
    var subject = Student2.Subject()

    class Subject {
        var math : Int? = null
        var english : Int? = null
    }
}

fun main(args: Array<String>) {
    var student = Student2()
    var subject = Student2.Subject()

    student.name = "Barley"
    subject.english = 88
    subject.math = 99

    student.subject = subject

    var man = StudentData("JK",StudentData.Subject(87,98))

    println("이름    : ${student.name}")
    println("영어점수 : ${student.subject?.english}")
    println("수학점수 : ${student.subject?.math}")
    println("이름    : ${man.name}")
    println("영어점수 : ${man.subject?.english}")
    println("수학점수 : ${man.subject?.math}")
}