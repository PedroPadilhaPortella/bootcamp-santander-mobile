package pepz

fun main() {
    val values = IntArray(5)
    values[0] = 9
    values[1] = 5
    values[2] = 3
    values[3] = 6
    values[4] = 1

    /* usando forIn */
    println("for in")
    for (value in values) {
        println(value)
    }

    /* usando forEach */
    println("forEach")
    values.forEach { valor ->
        println(valor)
    }

    println("indices")
    for (index in values.indices) {
        println(values[index])
    }

    /* usando sort */
    values.sort()
    println("valores ordenados")
    values.forEach { valor ->
        println(valor)
    }

    /* criando um array de inteiros com os valores pre-definidos */
    val numeros = intArrayOf(3, 6, 9, 12, 15, 18, 21, 24, 27, 30)
    numeros.forEach { number ->
        println(number)
    }
}