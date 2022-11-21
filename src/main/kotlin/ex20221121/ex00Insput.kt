package ex20221121

import java.util.Scanner

fun main() {

    // 입력하는 도구를 가져오는 방법
    // 자바 : Scanner scan = new Scanner(System.in)
    val scan = Scanner(System.`in`)

    // readLine() 사용해서 런창에 입력할 수 있다
    println("readLine()을 사용한 입력 >>")
    var num1 = readLine()?.toInt()
    // readLine은 무조건 String? 타입을 리턴

    // 1. null이 발생할 수 있는 상황에 대해서 조건식 부여
    if (num1 != null) {
        println(num1 + 2)
    }

    // 2. Elvis 연산자
    // println(num1?.plus(2) ?: 실행 코드, 데이터 값)

    // 3. non-null
    // println(num1!! +2)
    // ? 사용 불가(위에서 int?를 사용했기 때문)
}