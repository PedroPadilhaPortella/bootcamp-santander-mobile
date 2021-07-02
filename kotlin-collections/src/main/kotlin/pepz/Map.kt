package pepz

fun main() {
    val pair: Pair<String, Double> = Pair("Pedro", 12000.00)
    val map1 = mapOf(pair)

    map1.forEach { (key, value) -> println("Chave: $key -> Valor: $value") }

    val map2 = mapOf("Daniel" to 14000.00, "Edwin" to 16000.00)

    map2.forEach { (key, value) -> println("Chave: $key -> Valor: $value") }
}