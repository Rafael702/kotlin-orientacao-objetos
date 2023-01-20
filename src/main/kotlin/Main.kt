fun main(args: Array<String>) {
    println("Bem vindo ao ByteBank!")

    val contaDoAlex = Conta()
    contaDoAlex.titular = "Alex"
    contaDoAlex.numero = 1000
    contaDoAlex.saldo = 100.0

    val contaDaFran = Conta()
    contaDaFran.titular = "Fran"
    contaDaFran.numero = 1234
    contaDaFran.saldo = 110.0

    println("Depositando na conta do ${contaDoAlex.titular}")
    deposita(contaDoAlex, 50)
    println("Saldo: ${contaDoAlex.saldo}")

    println("Depositando na conta do ${contaDaFran.titular}")
    deposita(contaDaFran, 20)
    println("Saldo: ${contaDaFran.saldo}")
}

fun deposita(conta: Conta, valor: Int) {
    conta.saldo += valor
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}

fun testeLoop() {
    for (i in 1..5) {
        println(i)
    }

    for (i in 5 downTo 1) {
        println(i)
    }

    for (i in 1..5 step 2) {
        println(i)
    }

    for (i in 1 until 5) {
        println(i)
    }

    var i: Int = 1
    while (i <= 5) {
        println(i)
        i++
    }
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
