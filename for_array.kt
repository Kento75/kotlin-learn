fun main(args:Array<String>) {
    val list = arrayOf("hoge", "huge", "aaga")
    // withIndexで配列の値をインデックスを取得できる
    // インデックスだけならindicesプロパティで取得できる
    for((index, value) in list.withIndex()) {
        println("${index}:${value}")
    }
}