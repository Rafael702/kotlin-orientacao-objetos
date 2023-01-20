fun main(args: Array<String>) {
    println("Bem vindo ao ByteBank!")

    val titular = "Alex"
    val numeroDaConta = 1000
    var saldo = 0.0
    saldo = 100 + 2.0
    saldo -= 200

    println("titular: $titular")
    println("numero da conta: $numeroDaConta")
    println("Saldo da conta: $saldo")

//    if (saldo > 0.0) {
//        println("conta é positiva")
//    } else if (saldo == 0.0) {
//        println("conta é neutra")
//    } else {
//        println("conta é negativa")
//    }

    testaCondicoes(saldo)

//    when {
//        saldo > 0.0 -> println("conta é positiva")
//        saldo == 0.0 -> println("conta é neutra")
//        else -> println("conta é negativa")
//    }

//    for (i in 5..1) {
//        println(i)
//    }

//    for (i in 5 downTo 1) {
//        println(i)
//    }

//    for (i in 1..5 step 2) {
//        println(i)
//    }

    for (i in 1 until 5) {
        println(i)
    }

//    var i: Int = 1
//    while (i <= 5) {
//        println(i)
//        i++
//    }
}

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("conta é positiva")
    } else if (saldo == 0.0) {
        println("conta é neutra")
    } else {
        println("conta é negativa")
    }
}
