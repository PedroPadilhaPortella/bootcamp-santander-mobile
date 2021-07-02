package pepz

fun main() {
    val salarios = doubleArrayOf(500.00, 1600.00, 2500.00, 5000.00, 12000.00)

    print("Salarios Originais: ")
    for (salario in salarios) {
        print("R$ $salario, ")
    }

    println("\nMaior Salario: R$${salarios.maxOrNull()}")
    println("Menor Salario: R$${salarios.minOrNull()}")
    println("Média Salarial R$${salarios.average().toFloat()}")

    val salarioAcimaMedia = salarios.filter { salario -> salario > salarios.average()  }
    print("Salarios Acima da Média: ")
    for (salario in salarioAcimaMedia) {
        print("R$ $salario, ")
    }

    println("\nSalários entre 1000.00 e 5000.0: ${salarios.count { it in 1000.0..5000.0} }")

    println("Salário menor que 1000.0: R$${salarios.find { salario -> salario < 1000.0 } }")

    println("Tem algum salário maior que 10000.0? ${salarios.any { salario -> salario > 10000.0 } }")
}