fun main(args: Array<String>) {
    println("Hello World!")
    println("------------------------")
    println(add(5,6))
    println("------------------------")
    println(add2(5,6))
    println("------------------------")
    println(add3(5,6))
}

fun add(a: Int, b: Int) :Int{
    return a + b
}

fun add2(a: Int, b: Int) :Int = a + b

fun add3(a: Int, b: Int) = a + b
