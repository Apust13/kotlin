import java.util.stream.IntStream.range

fun main(args: Array<String>) {
//    println(message = 5)
//    println("Hello!".lastCharr())
//    println("Hello!".lastChar)
//    println("Hello".con("world!"))
//    println("Hello" con "world!")

//    println(myVarArg(1,3,4,5).get(2))

    myVarArg2(1,2,3,4,5,6,7,8,9,10)
    myVarArg2(*intArrayOf(1,2,3,4,5,6,7,8,9,10))

}

fun String.lastCharr(): Char = get(lastIndex)
val String.lastChar: Char get() = get(lastIndex)

infix fun String.con(other: String) = this + " " + other

fun myVarArg(vararg v : Int): IntArray{
    var arr = IntArray(v.size)
    for(i in 1 .. v.size-1){
        arr.set(i, v.get(i))
    }

    return arr;
}

fun myVarArg2(vararg items : Int){
    items.forEach { e -> if(e % 2 == 0)println(e) }
}



