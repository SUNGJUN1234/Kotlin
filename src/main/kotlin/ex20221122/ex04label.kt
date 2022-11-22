package ex20221122

fun main() {

    // label : while문에서 이름을(라벨) 부여해서
    // break할 때 어떤 while문을 종료시킬건지 정할 수 있다
    // continue 어느 while문 부터 다시 시작할 것인지 정할 수 있다

    outer@while(true){
        println("바깥 while문 작동 중")
        while(true){
            println("안쪽 while문 작동 중")
            // 어떤 조건을 만족할 경우 바깥 while문 까지 종료
            // 기존에 Java 2가지 종료조건이 필요합니다
            break@outer // 근접한while문 한 개만 빠져나간다
        }
    }

}