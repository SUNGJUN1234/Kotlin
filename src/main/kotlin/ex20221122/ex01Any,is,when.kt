package ex20221122

fun main() {

    // Any
    // : 이름처럼 아무거나 할 수 있는 느낌의 자료형
    // Int , Float , String ... 모든 자료형이 될 수 있다

    // is
    // : 자바에서의 instance of 와 비슷하다
    var str1 : String = "abc"
    // str1 = 12345

    var str2 : Any = "abc"
    println(str2.javaClass.simpleName)
    str2 = 12345
    println(str2.javaClass.simpleName)
    str2 = 'C'
    println(str2.javaClass.simpleName)

    // is Int -> 정수형 자료형이 맞는지 타입 체크
    when(str2){
        is Int -> println("This is Int")
        is String -> println("This is String")
        else -> println("Is not Int, String")
    }

    // 상속관계 시 어디에서 나온 필드 / 메서드(프로퍼티)인지
    // 확인하기 위해서 is 를 사용한다


}