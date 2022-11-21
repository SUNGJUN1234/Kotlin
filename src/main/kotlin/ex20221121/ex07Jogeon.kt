package ex20221121

fun main() {
    
    // 단순 if문 ( 만약에 ~ 하면 나는 ~ 하겠다 )
    val gender = "남"
    
    if(gender == "남") {
        println("남자입니다")
    }
    // if(조건식) else
    if(gender =="여") {
        println("여자입니다")
    }else{
        println("남자입니다")
    }

    // 한 줄 코드는 중괄호 생략 가능
    // if(gender == "남") println("남자입니다")
    // if(geder =="여") println("여자입니다") else println("남자입니다")

    val result = if(gender == "여") "여자입니다" else "남자입니다"
    println(result)

    // val result = if(gender == "여") "여자입니다
    // 위의 코드는 불가 ( else 가 없어서 )
}