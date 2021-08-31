import sun.security.util.Length

fun main(args: Array<String>){
//    B.staticFun()

    val p1 = Person("Mick", "Jagger", 55 )
    val child = Person("Jerry", "Jagr", 4 )
    val p2 = Person("Don", "Jagr", 35 , child)
    println(p1.firstName)
    p2.children.forEach { println(it.firstName to it.lastName) }

    var rectS = RectSimple(5.0, 2.0)
    var rectS2 = RectSimple(5.0, 2.0)
    var rect = Rect(5.0, 2.0)
    var rect2 = Rect(5.0, 2.0)

    println(rect2 == rect)
    println(rectS2 == rectS)

    println(rect.perimeter )
//    rect.test = 3
//
//    println(rect.test )
//    println(rect.perimeter)


}

class B{
    private constructor(){
        println("Private constructor")
    }

    companion object A {
        fun staticFun(){
            var b = B();
        }
    }
}

class Person(val firstName:String, val lastName:String, var age:Int){
    var children: MutableList<Person> = mutableListOf()

    init {
        println("Person is created: $firstName $lastName, age is $age ")
    }

    constructor(firstName: String, lastName: String, age: Int, child:Person):this(firstName, lastName, age){
        children.add(child)
        println("Child: ${child.firstName} ${child.lastName} age: ${child.age} has been added to person: $firstName $lastName, age is $age")
    }
}

class RectSimple(var height:Double, var length: Double){
    var perimeter = (height + length) * 2

    var test = 1
    get() = field+1
    set(value){
        if (value < 0) println("Negative value")
        field = value
    }
    fun area() = height * length
}


data class Rect(var height:Double, var length: Double){
    var perimeter = (height + length) * 2

    var test = 1
        get() = field+1
        set(value){
            if (value < 0) println("Negative value")
            field = value
        }
    fun area() = height * length
}

