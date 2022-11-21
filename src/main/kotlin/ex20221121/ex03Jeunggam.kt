package ex20221121

fun main() {

    // 3) 증감 연산자 ( ++, -- )
    // num++, num-- : 후치연산자
    // : 코드가 실행된 후 작업
    // ++num, --num : 전치연산자
    // : 코드가 실행되기 전 작업
    var num = 1

    println(num++)  // 1
    println(num)    // 2
    println(++num)  // 3
    println(num)    // 3
    println(num--)  // 3
    println(num)    // 2
    println(--num)  // 1
    println(num)    // 1

}
