fun main() {
    var a: Float = 1.0f;
    var b: Float = 1.0f;
    print(calculadora(a, b, "*"))
}

fun calculadora(valor1: Float, valor2: Float, operacao: String): Float? {
    return when {
        operacao == "+" ->  valor1 + valor2;
        operacao == "-" ->  valor1 - valor2;
        operacao == "*" ->  valor1 * valor2;
        operacao == "/" ->  valor1 / valor2;
        else -> null
    }
}