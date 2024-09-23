fun main() {
    //1.6
    println("1.6")
    val num = listOf(1, 13, 49)
    println(num.joinToString(" "))

    //1.7
    println("1.7")
    val num2 = listOf(7, 15, 100)
    println(num2.joinToString("  "))

    //1.8
    println()
    println("1.8")
    println("Введите 3 числа по отдельности:")
    val a= readLine()
    val b= readLine()
    val c= readLine()
    val num3 = listOf(a, b, c)
    println(num3.joinToString("  "))

    //1.9
    println("1.9")
    println("Введите 4 числа по отдельности:")
    val d= readLine()
    val e= readLine()
    val f= readLine()
    val g= readLine()
    val num4 = listOf(d, e, f, g)
    println(num4.joinToString(" "))

}
