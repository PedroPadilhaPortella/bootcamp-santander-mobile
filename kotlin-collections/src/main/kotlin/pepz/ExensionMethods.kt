package pepz

fun main() {
    val salarios = arrayOf("2000".toBigDecimal(), "1500".toBigDecimal(), "4000".toBigDecimal())

    println("Soma dos Salários: ${salarios.somatoria()}")
    println("Média dos Salários: ${salarios.media()}")
}