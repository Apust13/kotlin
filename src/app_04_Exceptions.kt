import java.lang.RuntimeException

fun main(args: Array<String>) {

    var ex = try {
        throw RuntimeException()
        println("try")
        11
    } catch (e: RuntimeException){
        println("catch")
        22
    } finally {
        println("finally")
        33
    }

    println(ex)

}

