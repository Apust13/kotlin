fun main(args: Array<String>) {
   var i = 1 .. 10
    println(i)
    println(i.javaClass)

    for (j in i) {
        print(j.toString() + " ")
        print("$j ")
        print("" + j + " ")
    }
    print("\n")
    for (j in 1 until 10) {
        print("$j ")
    }

    print("\n")
    for (j in 2 .. 20 step 3) {
        if(j in 5..21) println(j)
        print("$j ")
    }

}

