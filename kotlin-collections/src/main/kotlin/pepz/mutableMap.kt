package pepz

import pepz.classes.Funcionario
import pepz.classes.Repository

fun main() {
    val f1 = Funcionario("João Brito", 3000.0, "PJ")
    val f2 = Funcionario("Marcelo Silva", 4000.0, "CLT")
    val f3 = Funcionario("Higor Menezes", 1000.0, "CLT")
    val f4 = Funcionario("Marcia Seki", 2000.0, "PJ")

    val repository = Repository<Funcionario>()

    repository.create(f1.name, f1)
    repository.create(f2.name, f2)
    repository.create(f3.name, f3)
    repository.create(f4.name, f4)

    println("FindById")
    println(repository.findById(f2.name))

    repository.remove(f2.name)

    println("FindAll")
    repository.findAll().forEach { println(it)}
}