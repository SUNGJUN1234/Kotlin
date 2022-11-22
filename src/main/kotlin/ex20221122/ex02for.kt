package ex20221122

fun main() {
    // Java for 문
    // for( int i = 0; i<=2 ; i++){
    //          println(i)
    // }

    // Kotlin for 문
    // for( i in 0..2 ) {       // 2뒤에 step 1 이 생략되어있다
    //          println(i)
    // }

    // 1 ~ 10까지 i 값 출력
    for( i in 1..10){
        print("$i ")
    }
    println()

    // 1,3,5,7,9를 for문을 사용해서 출력
    // 실행코드가 1줄이면 중괄호 생략 가능
    // for(i in 1..10 step 2) print("$i ")
    for(i in 1..10 step 2){
        print("$i ")
    }
    println()

    // 10 ~ 1까지 for문을 사용해서 출력
    for(i in 10 downTo 1){
        print("$i ")
    }
    println()

    // 10,8,6,4,2를 for문을 사용해서 출력
    for(i in 10 downTo 1 step 2){
        print("$i ")
    }


}