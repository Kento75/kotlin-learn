fun main(args:Array<String>) {
    val point = 75
    val result = when(point) {
        100,99 -> "100 or 99"
        in 70..98 -> "78~98"
        in 50..69 -> "50..69"
        !in 50..100 -> "50~100以外の数値"
        else -> "不明"
    }

    println(result)
}