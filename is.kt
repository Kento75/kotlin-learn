fun main(args:Array<String>) {
    val obj: Any = "hogehoge"

    when(obj) {
        is String -> println(obj[0])
        is Int -> println(Math.abs(obj))
        else -> println("?")
    }
}