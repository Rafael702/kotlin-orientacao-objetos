fun main() {
    println("Bem vindo ao ByteBank!")

    val contaDoAlex = Conta("Alex", 1000)

    val contaDaFran = Conta("Fran", 1234)

    println("Depositando na conta do ${contaDoAlex.titular}")
    contaDoAlex.deposita(50)
    println("Saldo: ${contaDoAlex.saldo}")

    println("Depositando na conta do ${contaDaFran.titular}")
    contaDaFran.deposita(20)
    println("Saldo: ${contaDaFran.saldo}")

    println("Sacando valor da conta: ${contaDoAlex.numero}, titular: ${contaDoAlex.titular}")
    contaDoAlex.saca(50)
    println("Saldo atual: ${contaDoAlex.saldo}")

    println("Sacando valor da conta: ${contaDaFran.numero}, titular: ${contaDaFran.titular}")
    contaDaFran.saca(10)
    println("Saldo atual: ${contaDaFran.saldo}")

    println("Transferência da conta da Fran para o Alex")

    contaDaFran.transfere(200, contaDoAlex)

    println("Saldo: ${contaDoAlex.saldo}, titular: ${contaDoAlex.titular}")
    println("Saldo: ${contaDaFran.saldo}, titular: ${contaDaFran.titular}")
}

class Conta(val titular: String, val numero: Int) {
    var saldo = 0.0
        private set
    //        get() {
//            return field
//        }

    //        set(value: Int) {
//            field = value
//            println(field)
//        }

    init {
        println("O titular é: $titular")
    }

    // O construtor pode ser colocado nos parametros da class.
    // Fica: class Conta(val titular: String, val numero: Int){} -> Construtor primario -> Mais idiomatico
    // Construtor secundario
//    constructor(titular: String, numero: Int) {
//        this.titular = titular
//        this.numero = numero
//    }
    fun deposita(valor: Int) {
        if (valor > 0) this.saldo += valor
    }

    fun saca(valor: Int) {
        if (saldo >= valor) {
            saldo -= valor
        } else {
            println("Saldo: $saldo")
        }
    }

    fun transfere(valor: Int, contaTransferencia: Conta): Boolean {
        return if (saldo >= valor) {
            saldo -= valor
            contaTransferencia.deposita(valor)
            println("Transferência de R$ $valor para ${contaTransferencia.titular}, Concluida")
            true
        } else {
            println("Falha na transferência para ${contaTransferencia.titular}")
            false
        }
    }
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
