fun main() {
    val a = readln().toInt()

    when(a) {
        1 -> println("move up")
        2 -> println("move down")
        3 -> println("move left")
        4 -> println("right")
        0 -> println("do not move")
        else -> println("error!")
    }
}
