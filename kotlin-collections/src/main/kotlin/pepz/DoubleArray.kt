package pepz

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1600.0
    salarios[1] = 2500.0
    salarios[2] = 10000.0

    salarios.forEach { println("Salário: $it") }

    salarios.forEachIndexed { i, salario ->
        salarios[i] = salario * 1.05
        println("Salario[$i]: ${salarios[i]}")
    }

    /* criando um array de double com os valores pre-definidos */
    val prices = doubleArrayOf(14.2, 10.99, 1.99, 100.0)
    prices.sort()
    prices.forEach { println("Preço: $it") }
}
