fun main(args:Array<String>) {
    val x = 10
    val y = 5

    when {
        x >= 10 -> println("x >= 10")
        x < 10 && y > 10 -> println("x < 10 && y > 10")
        else -> println("その他")
    }
}