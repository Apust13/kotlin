

fun main(args: Array<String>) {

    var list = listOf("One","Two", "Three")
    var list2 = listOf(1,2, 3)

    println(list.maxOrNull())
    println(list2.average())

    var set = list.plus(list).toSet()
    var set2 = setOf<String>().plus(list.plus(list))
    println(set)
    println(set2)

    var map = mapOf<String, Int>().plus(list.zip(list2))
    var map2 = mapOf(1 to "One")
    println(map)
    println(map2)


}

