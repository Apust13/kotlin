 fun main(){
     var a = "Hello"
     var b: String? = "test null"
     b = null
     val l = b?.length ?: -1

     println(a.length)
     println(b?.length)
     println(l)
     b = if((1..10).random() % 2 == 0) "sdsd" else null
      println(b!!)
//     a = null
 }