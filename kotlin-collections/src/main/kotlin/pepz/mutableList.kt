package pepz

import pepz.classes.Funcionario

fun main() {
    val f1 = Funcionario("João Brito", 3000.0, "PJ")
    val f2 = Funcionario("Marcelo Silva", 4000.0, "CLT")
    val f3 = Funcionario("Higor Menezes", 1000.0, "CLT")
    val f4 = Funcionario("Marcia Seki", 2000.0, "PJ")

    val funcionarios = mutableListOf(f1, f2, f3, f4)

    // Adiciona Funcionario
    funcionarios.add(Funcionario("Pedro Portella", 12000.00, "CLT"))

    //Remove Funcionario
    funcionarios.remove(f1)

    // Remove pelo Indice
    funcionarios.removeAt(0)

    funcionarios.forEach { println(it) }

    // Remove aqueles que tem o tipo CLT
    funcionarios.removeIf { funcionario ->  funcionario.type == "CLT"}
}