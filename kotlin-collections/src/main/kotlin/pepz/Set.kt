package pepz

import pepz.classes.Funcionario

fun main() {
    val f1 = Funcionario("João Brito", 3000.0, "PJ")
    val f2 = Funcionario("Marcelo Silva", 4000.0, "CLT")
    val f3 = Funcionario("Higor Menezes", 1000.0, "CLT")
    val f4 = Funcionario("Marcia Seki", 2000.0, "PJ")

    val funcionarios1 = setOf(f1, f2)
    val funcionarios2 = setOf(f3, f4)
    val funcionariosUnion = funcionarios1.union(funcionarios2)
    println("Union:")
    funcionariosUnion.forEach { println(it) }

    val funcionarios3 = setOf(f1, f2, f3)
    val funcionarios4= setOf(f1, f2)
    val funcionariosSubtract = funcionarios3.subtract(funcionarios4)
    println("\nSubtract:")
    funcionariosSubtract.forEach { println(it) }

    val funcionarios5 = setOf(f1, f2, f3)
    val funcionarios6= setOf(f1, f2)
    val funcionariosIntersect = funcionarios5.intersect(funcionarios6)
    println("\nIntersect:")
    funcionariosIntersect.forEach { println(it) }

}