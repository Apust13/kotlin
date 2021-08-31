fun main(args: Array<String>) {
    println("Hello World!")
    println("------------------------")
    println(add(5,6))
    println("------------------------")
    println(add2(5,6))
    println("------------------------")
    var i = add3(5,6)
    println("value i = $i")

    for (i in 4 downTo 1) print(i)

    var stud1 = User("Student1", 20)
    println(stud1.name)
    println(stud1)
    stud1.name = "Al Stud"

    println(stud1.name)
    println(stud1)
    println(add4())
}

fun add(a: Int, b: Int) :Int{
    return a + b
}

fun add2(a: Int, b: Int) :Int = a + b

fun add3(a: Int, b: Int) = a + b

class User(var name: String, val age: Int)

fun add4() = 2 + 2