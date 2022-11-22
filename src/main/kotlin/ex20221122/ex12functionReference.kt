package ex20221122

fun todayWeather(){
    println("오늘 광주 날씨는 맑음")
}
// 함수를 변수에 대입하는 방법
// ::함수이름 ---> 안드로이드 intent
// ::(리플렉션)
val weather = ::todayWeather


fun main() {
    // 함수를 참조해서 변수처럼 사용해보자
    // 함수 참조를 통해서 변수처럼 사용하고 싶으면
    // 변수명 뒤에 .call() 이라는 메서드를 붙여줘야한다
    weather()
}