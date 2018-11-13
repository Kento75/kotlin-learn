fun main(args:Array<String>) {
    val list = mapOf("1" to "hoge", "2" to "fuga", "3" to "coco")
    for((key, value) in list) {  // Pythonぽくかける
        println("${key}:${value}")
    }
}