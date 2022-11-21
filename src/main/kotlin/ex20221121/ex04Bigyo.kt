package ex20221121

fun main() {

    val a: Int = 128
    val b = a
    println(a === b)

    // === 값은 물론이고 참조 값(주소 값)도 동일한가?
    val c: Int? = a
    val d: Int? = a
    val e: Int? = c
    println(c == d)
    println(c === d)
    println(c === e)

}