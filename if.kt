fun main(args:Array<String>) {
    val x = 108
    val msg = if(x == 5) {
        "変数xは5です"
    } else if(x == 10) {
        "変数xは10です"
    } else {
        "変数xは5でも10でもありません"
    }

    println(msg)
}