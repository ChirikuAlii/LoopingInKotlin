fun main(args: Array<String>) {

    withFor()
}

fun printHelloWithWhile(){
    var x = 0
    while (x<10){
        println("hello")
        x = x + 1
    }
}

fun withWhile(){
    var star = '*'
    var i = 0
    while(i<5){

        i=i+1
        var j = 0
        while(j<i){
            print(star)
            j= j+1
        }
        println()
    }
}

fun withFor(){
    var star = '*'
    for( x in 1..5 ){
        for( y in 1..x){
            print(star)
        }
        println()
    }
}