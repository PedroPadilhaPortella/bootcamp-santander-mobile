package pepz

import pepz.classes.Funcionario

fun main() {
    val f1 = Funcionario("João Brito", 3000.0, "PJ")
    val f2 = Funcionario("Marcelo Silva", 4000.0, "CLT")
    val f3 = Funcionario("Higor Menezes", 1000.0, "CLT")
    val f4 = Funcionario("Marcia Seki", 2000.0, "PJ")

    //SET
    val funcionariosSet = mutableSetOf(f1, f2, f3, f4)

    funcionariosSet.add(Funcionario("Pedro Portella", 12000.00, "CLT"))
    funcionariosSet.add(f1)
    funcionariosSet.remove(f1)

    funcionariosSet.forEach { println(it) }
}