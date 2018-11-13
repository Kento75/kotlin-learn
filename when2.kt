fun main(args:Array<String>) {  // kotlinはbreak書かない
    val point = 3
    when(point) {
        3 -> {
            println(3)
        }
        2 -> {
            println(2)
        }
        1 -> {
            println(1)
        }
        else -> {  // デフォルトの代わりに else を使う
            println(0)
        }
    }
}