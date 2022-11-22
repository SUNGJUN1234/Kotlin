package ex20221122

fun main() {

    // 오버로딩(OverLoading) : 중복정의
    // 한 클래스 내에서 같은 이름의 메소드를 선언
    // 단, 매개변수의 형태가 달라야한다
    // ex) 매개변수의 데이터 타입, 갯수 등이 달라야한다
    // 대표적인 오버로딩 ex ) print문 , 생성자 ...

    // setName()
    // 미국인( firstName , middleName , lastName )
    // 한국인( firstName , lastName )

    println(setName("조","성준"))
    println(setName("스티븐","폴","잡스"))

}
fun setName(first:String, middle:String, last:String):String{
    return "$first $middle $last"
}
fun setName(first:String, last:String):String{
    return "$first $last"
}