package ex20221122

fun main() {

    // while( 조건식 ) {
    //  조건식이 true일 동안 , 실행시킬 코드
    // }
    // 단, 조건식은무조건 결과값으로 true / false를 돌려줘야함!
    // 비교연산자, 논리 연산자, Boolean(true, false)

    var num1:Int = 1
    print("숫자를 입력하세요 : ")
    var num2 = readLine()?.toInt()
    var result:Int = 1
    while(num1<= num2!!){
        result*=num1;
        num1++
    }
    print("결과값 : $result")

}