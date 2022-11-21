package ex20221121

import java.lang.NumberFormatException
import java.util.Scanner
import kotlin.random.Random
import kotlin.random.nextInt

fun main() {

    // 랜덤 수 가져오기
    val random = Random
    // 1. 랜덤한 두 수를 생성하자
    val num1 = random.nextInt(10)+1 // 1 ~ 10 랜덤한 수 생성
    val num2 = random.nextInt(10)+1 // 1 ~ 10 랜덤한 수 생성

    // 2. 랜덤한 두 수를 출력하자
    // 코틀린은 무조건 같은 자료형끼리만 연산이 가능하다
    // int + "String" + int 를 할 수 없으니 $를 활용하자
    println(" $num1 + $num2 = ?")

    // 3. 사용자로 부터 정답입력 받기
    print("Enter the Answer : ")
    // val scan  = Scanner(System.`in`)
    // val result = scan.nextInt()
    // val answer = readLine()?.toInt() ?: -1;
    // ?.toInt()를 한 이유 :
    // readLine은 기본적으로 String?를 리턴한다

    //~
    // 값을 문자열로 입력했을 때의 예외상황 잡기
    // readLine을 사용하게ㅐ 되면 사용자는 문자,숫자 모두 입력가능
    // toInt ---> 사용자가 무조건 숫자를 입력해야 형변환 가능
    try{
        val answer = readLine()?.toInt()

        // 4. 사용자가 입력한게 정답인지 판단
        val result = if(answer == (num1 + num2)) "정답입니다" else "오답입니다"
        print("결과 : $result")

    }catch (e: NumberFormatException){
        print("숫자를 입력해주세요! 문자는 입력할 수 없습니다")
    }
    //~

}