fun main(args: Array<String>) {
    println(message = 5)
    println("Hello!".lastCharr())
    println("Hello!".lastChar)
    println("Hello".con("world!"))
    println("Hello" con "world!")

}

fun String.lastCharr(): Char = get(lastIndex)
val String.lastChar: Char get() = get(lastIndex)

infix fun String.con(other: String) = this + " " + other

