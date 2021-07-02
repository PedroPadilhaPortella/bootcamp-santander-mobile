package pepz

fun main() {
    val nomes = Array<String>(3) {""}
    nomes[0] = "Pedro"
    nomes[1] = "Daniel"
    nomes[2] = "Samuel"

    for (nome in nomes) {
        println(nome)
    }

    /* criando um array de strings com os valores pre-definidos */
    val listaNomes = arrayOf("Casalli", "Bunhak", "Portella")
    listaNomes.sort()
    print("-- nomes ordenados --\n")
    listaNomes.forEach { nome ->
        println(nome)
    }
}