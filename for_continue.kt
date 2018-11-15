fun main(args:Array<String>) {
    outer@ for(i in 1..9) {
        for(j in 1..9) {
            if(i*j > 30) {
                break@outer;
            }
            print("${i * j}")
        }
        println()
    }
}