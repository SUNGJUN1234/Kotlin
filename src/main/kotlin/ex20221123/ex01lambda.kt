package ex20221123

fun main() {
    
    // 람다 대수
    // 수학 : 이름이 없는 함수
    //       두 개 이상의 수를 1개의 결과값으로 단순화
    // 프로그래밍 : 다른 함수의 인자로 넘기는 함수(매개변수가 될 수 있다)
    //            함수의 결과값으로 반환하는 함수 (리턴 값)
    //            변수에 저장하는 함수를 의미 👍👍


    // {매개변수 -> 리턴 값}
      {x:Int, y:Int -> x+y}
    // 더하기 기능을 필요할 때 마다 사용하려면 변수에 저장하자
    val sum1: (Int, Int)->Int = {x:Int, y:Int -> x+y}
    println(sum1(3,4))

    // 코틀린의 추론을 이용해 코드 단순화

    // 1. 람다식의 매개변수에 자료형이 지정되어 있다면
    // 변수에서 자료형은 생략할 수 있다
    val sum2 = {x:Int, y:Int -> x+y}
    // 2. 변수의 매개변수 자료형이 지정되어 있다면 람다식의
    // 매개변수 자료형은 생략할 수 있다
    val sum3 : (Int, Int)->Int  = {x, y -> x+y}
    // 단, 람다식과 변수의 자료형을 둘 다 생략해버리면 추론이 불가능



    fun greet():Unit{
        println("Hello Kotlin")
    }
    fun square1(x:Int):Int{
        return x*x
    }
    // 예제 위의 함수를 람다식으로 선언해보자
    val hello:()->Unit = {->println("Hello Kotlin")}
    val square2:(Int)->Int = {x:Int->x*x}

    hello()
    println(square2(2))





}