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

    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }
}
