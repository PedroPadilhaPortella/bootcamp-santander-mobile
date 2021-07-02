package one.digitalinnovation.digionebank.account

fun main() {
    val conta1 = Conta(number = "13444-5", agency = "0857")

    println(conta1)

    try {
        conta1.saque(10.0)
    } catch (e: Exception) {
        println(e.message)
        conta1.deposito(150.0)
    }

    println(conta1)
}