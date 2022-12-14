package ex20221122

fun main() {

    println( sum(5,6) )

    sumPrint(4,6)
}
// main 밖

// fun + 함수명( 호출명 ) + ( 매개변수 ) : 리턴타입 { }
// 단, 리턴타입에 자료형이 명시 되어있으면 return이라는 키워드 필요
fun sum(num1:Int, num2:Int):Int{
    return num1 + num2
}
// sum은 결과값을 받아오기만 하고 출력하는 기능은 따로 없음
// Java의 void -> Kotlin의 Unit
fun sumPrint(num1:Int, num2:Int) : Unit{
    println( sum(num1,num2) )
}