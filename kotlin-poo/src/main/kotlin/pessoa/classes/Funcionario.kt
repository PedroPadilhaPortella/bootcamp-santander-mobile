package pessoa.classes

abstract class Funcionario(
    name: String,
    cpf: String,
    val salary: Double,
) : Pessoa(name, cpf) {
    protected abstract fun calculoAuxilio(): Double

    override fun toString(): String = """
        Nome: $name
        Cpf: $cpf
        Salario: R$ $salary
        Auxilio: ${calculoAuxilio()}
    """.trimIndent()
}