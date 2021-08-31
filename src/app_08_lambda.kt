import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

fun main(args: Array<String>){
//    var sum = {x: Int, y: Int -> println(x + y)
//        x+y}(4,7)
//
//    println(sum)
//    println("------------------")
//
//    var clA = A("Class A")
//
//    println({cla: A -> cla.value}(clA))
//    println((A::value)(clA))
//
//    var constructor_of_A = ::A
//
//    println(constructor_of_A("Class B").value)

    val a = listOf(2,1,4,3)

    val b = listOf("One","Three","Four","Two")


    a.forEach{e -> println(e)}
    println(a.map { e -> e * 2 })
    println(a.filter { e -> e % 2 != 0 })
    println(a.reduce { sum, e -> sum + e })
    println(a.sorted())
    println(a.sortedByDescending{it})
    println(b.sortedByDescending { it.length })

    println(a.any{it > 2})
    println(a.any{e -> e > 2})
    println(a.all{it > 0})

    println(a.sum())

    val numbers = listOf(-2,1,-4,3, 0)
    val (positive, negative ) = numbers.partition { it >=0 }
    println(positive)
    println(negative)

    val result = listOf("a", "bb", "c", "ddd", "ff").groupBy { it.length }
    println(result)

    
}

class A(var value: String){}