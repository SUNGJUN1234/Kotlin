package ex20221122

fun main() {
    
    // 호출했을 때 내 이름의 결과 값만 가지고 오는 함수
    println(getName())

    println(getMyName("조성준"))
}
fun getName():String{
    return "조성준"
}
// fun getMyName(name:String):String{
//     return name
// }
// 중괄호{} 안의 코드가 한 줄이면 중괄호와 return 키워드를 생략할 수 있다
// 단, return 키워드 대신 대입연산자 (=) 사용하기
// 반환하는 데이터를 보고 리턴타입을 추론이 가능하여 리턴타입 생략가능
fun getMyName(name:String) = name






