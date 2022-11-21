package ex20221121

fun main() {

    // 엘비스 연산자 ( ?: )
    // NPE 발생을 예방할 수 있도록 NULL 값을 처리 해주는 연산자
    var str: String? = null

    print( str?.length ?: "null입니다")
    // 엘비스 연산자 자체를 변수에 담을 수 있다
    // 서버에서 값 받아올 때 주로 사용
    var result = str?.length ?: -1

}
