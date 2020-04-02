import javafx.beans.binding.When

fun main(args: Array<String>) {
    var i = bigger(3, 7)
    println(i)
    var d = Days.MONDAY
    var digitDay = when (d) {
        Days.MONDAY -> 1;
        Days.TUESDAY -> 2;
        Days.WEDNESDAY -> 3;
        Days.THURSDAY -> 4;
        Days.FRIDAY -> 5;
        Days.SATURDAY -> 6;
        Days.SUNDAY -> 7;
    }
    println(digitDay)
    println(d.name)
    println(d.ordinal)
}

fun bigger(a: Int, b: Int) = if (a > b) a else b


enum class Days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}