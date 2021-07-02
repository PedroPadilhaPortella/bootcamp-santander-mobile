package pepz

import pepz.classes.Funcionario

fun main() {
    val f1 = Funcionario("João Brito", 3000.0, "PJ")
    val f2 = Funcionario("Marcelo Silva", 4000.0, "CLT")
    val f3 = Funcionario("Higor Menezes", 1000.0, "CLT")
    val f4 = Funcionario("Marcia Seki", 2000.0, "PJ")

    val funcionarios = listOf(f1, f2, f3, f4)

    println("\nFuncionários:")
    funcionarios.forEach {
        println(it)
    }

    println("\nFuncionários encontrado pelo Nome:")
    println("\n" + funcionarios.find { it.name == "Higor Menezes"})

    println("\nFuncionários Ordenados por Salário:")
    funcionarios.sortedBy { it.salary }.forEach {
        println(it)
    }

    println("\nFuncionários Agrupados por Tipo:")
    funcionarios.groupBy { it.type }.forEach {
        println(it)
    }
}