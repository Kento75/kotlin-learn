fun main(args:Array<String>) {
    var data = mutableListOf(1, 2, 3, 4, 5)
    var data2:List<Int> = data
    data[4] = 25
    println(data2)
}
