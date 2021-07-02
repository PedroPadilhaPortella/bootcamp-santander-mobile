package one.digitalinnovation.digionebank.bank

fun main() {
    val banco1 = Banco(name = "Nubank", number = 785)

    println(banco1.name)
    println(banco1.number)

    val banco2 = banco1.copy(name = "Santander")

    println(banco2.info())

}